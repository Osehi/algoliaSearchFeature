package com.polish.makequicksearch

import com.algolia.search.model.ObjectID
import com.algolia.search.model.indexing.Indexable

@kotlinx.serialization.Serializable
data class Record(
    val name: String,
    override val objectID: ObjectID
    ): Indexable
