package com.polish.makequicksearch


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.algolia.search.client.ClientSearch
import com.algolia.search.helper.deserialize
import com.algolia.search.model.APIKey
import com.algolia.search.model.ApplicationID
import com.algolia.search.model.IndexName
import com.algolia.search.model.ObjectID
import com.algolia.search.model.search.Query
import com.google.gson.GsonBuilder
import com.polish.makequicksearch.databinding.ActivityMainBinding
import com.polish.makequicksearch.model.MarketItem
import com.polish.makequicksearch.model.uimodel.SearchProductImage
import com.polish.makequicksearch.utils.converToObjectWithGson
import com.polish.makequicksearch.utils.toFoodItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.serialization.json.jsonNull

class MainActivity : AppCompatActivity() {

    private val TAG = "MAINACTIVITY"
    private lateinit var myRecyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    private lateinit var binding:ActivityMainBinding
    private var list: MutableList<com.polish.makequicksearch.model.uimodel.FoodItem> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // initialize views
        myRecyclerView = binding.mainActivityRv
        productAdapter = ProductAdapter(list)
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        myRecyclerView.adapter = productAdapter



        binding.mainActivityKeywordEdt.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //
            }

            override fun afterTextChanged(input: Editable?) {
                CoroutineScope(Dispatchers.Main).launch {
                    setup(input.toString())
                }
                Log.d(TAG, "text entered: ${input.toString()}")
            }
        })


    }

    private suspend fun setup(query:String) {

        val gson = GsonBuilder()
            .setLenient()
            .serializeNulls()
            .create()

        binding.mainActivityProgressBarPb.isVisible = true
        // Connect and authenticate with your Algolia app
        val client = ClientSearch(
            applicationID = ApplicationID("B85TFCEVPS"),
            apiKey = APIKey("54b95c21631717204a3bcccc17f1d7b0")
        )

        // Create a new index and add a record (using the `Record` class)
        val index = client.initIndex(indexName = IndexName("products_index"))
//        val record = Record("test_record", ObjectID("1"))
//
//        index.run {
//            saveObject(Record.serializer(), record).wait()
//        }

        // Search the index and print the results
        val response = index.run {
            search(Query(query))
        }

        Log.d(TAG, "what is inside response: ${response.hits}")
//        val inString = "[{\"imagePath\":\"https:\\/\\/pricepally-images.s3.us-east-2.amazonaws.com\\/products\\/610cf04c040d6.jpg\",\"imageId\":\"278714118643\"}]"
//        val output1 = gson.toJson(inString)
//        Log.d(TAG, "inside output1: ${output1}")
//        val toObject = gson.fromJson(inString, SearchProductImage::class.java)
//        Log.d(TAG, "inside this output: ${toObject}")

        val contentOfJsonString = response.hits.mapNotNull {
            gson.toJson(it.json)
        }
        // I just saw now that "contentOfJsonString" is a list of string List<String>
        Log.d(TAG, "what is inside content of json string: ${contentOfJsonString}")
        // map through list of string and convert it.
        val transformedOutput = contentOfJsonString.mapNotNull {
            gson.fromJson(it, MarketItem::class.java)
        }.toFoodItem()

        Log.d(TAG, "osehi compare the result with SEE THE OUTPUT ${transformedOutput}")
        Log.d(TAG, "what is productImage: ${transformedOutput[0].productImage}")
//        Log.d(TAG, "see the conversion of productImage: ${converToObjectWithGson(transformedOutput[0].productImage!!).size}")
        // this is how gson was used t
        val data = "[{\"imagePath\":\"https:\\/\\/pricepally-images.s3.us-east-2.amazonaws.com\\/products\\/63199c9656c85.jpg\",\"imageId\":\"817292262159\"}]"
        val result = converToObjectWithGson(data)
        Log.d(TAG, "conversion result: ${result[0].imagePath}")

//        Log.d(TAG, "the number of hits is : ${response.nbHits}")
       val output = response.hits.mapNotNull {
           val toJsonString = gson.toJson(it.json)
//           Log.d(TAG, "the converted json: ${toJsonString}")
            gson.fromJson(toJsonString, MarketItem::class.java)
        }.toFoodItem()
        Log.d(TAG, "see the output: ${output}")
        // I am creating a condition here
        // the container is originally empty
        // type in the word, a progress bar shows up
        // when the progress bar ends
        // add the list to an empty container

        // question-01, if the container is not empty, what should I do
        // check if container is empty
        // if is it empty ( that empty is true) => add all the items to the list.
        // ====> What happens , if it is not empty  ==> Do this
        // first clear all the container.
        // second add all the items.
        /*
        if (list.isEmpty()) {
            list.addAll(output)
        } else {
            list.clear()
            list.addAll(output)
        }

         */
        if (list.isEmpty() && (query.length > 0)) {
            list.addAll(output)
        } else if (list.isNotEmpty() && (query.length > 0)) {
            list.clear()
            list.addAll(output)
        } else if (list.isNotEmpty() && (query.length == 0)) {
            list.clear()
        }
        productAdapter.notifyDataSetChanged()
        binding.mainActivityProgressBarPb.isVisible = false

//        gson.fromJson<>(SearchProductItemModelNew::class.java)

//        val previewList = list.mapNotNull {
//            gson.fromJson(it, SearchProductItemModelNew::class.java).fooditems
//        }

//        val results = response.hits.deserialize(SearchProductItemModelNew.serializer())
//        println(results[0])
//        Log.d(TAG, "here is the output from algolia: ${results}")
    }
}