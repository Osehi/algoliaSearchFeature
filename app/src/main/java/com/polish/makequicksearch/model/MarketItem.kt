package com.polish.makequicksearch.model

data class MarketItem(
    val _highlightResult: HighlightResult,
    val bulk_price: BulkPriceX,
    val cat_id: CatIdX,
    val created_at: CreatedAtX,
    val delivery_date: DeliveryDateX,
    val html_description: HtmlDescriptionX,
    val id: IdX,
    val is_featured: IsFeaturedX,
    val is_make_list: IsMakeListX,
    val is_pally: IsPallyX,
    val is_pre_orders: IsPreOrdersX,
    val is_recommended: IsRecommendedX,
    val is_season: IsSeasonX,
    val is_up_down: IsUpDownX,
    val is_whatsapp_product: IsWhatsappProductX,
    val mata_description: MataDescriptionX,
    val mata_title: MataTitleX,
    val objectID: ObjectID,
    val open_pally: OpenPallyX,
    val pally_size: PallySizeX,
    val product_description: ProductDescriptionX,
    val product_discount: ProductDiscountX,
    val product_id: ProductIdX,
    val product_images: ProductImagesX,
    val product_order: ProductOrderX,
    val product_order_all: ProductOrderAllX,
    val product_price: ProductPriceX,
    val product_title: ProductTitleX,
    val product_unit: ProductUnitX,
    val region_id: RegionIdX,
    val renew_date: RenewDateX,
    val sales_counts: SalesCountsX,
    val slug: SlugX,
    val status: StatusX,
    val sub_cat_id: SubCatIdX,
    val total_views: TotalViewsX,
    val unit: UnitX,
    val unit_availalble: UnitAvailalbleX,
    val unit_price: UnitPriceX,
    val updated_at: UpdatedAtX
)

data class HighlightResult(
    val bulk_price: BulkPrice,
    val cat_id: CatId,
    val created_at: CreatedAt,
    val delivery_date: DeliveryDate,
    val html_description: HtmlDescription,
    val id: Id,
    val is_featured: IsFeatured,
    val is_make_list: IsMakeList,
    val is_pally: IsPally,
    val is_pre_orders: IsPreOrders,
    val is_recommended: IsRecommended,
    val is_season: IsSeason,
    val is_up_down: IsUpDown,
    val is_whatsapp_product: IsWhatsappProduct,
    val mata_description: MataDescription,
    val mata_title: MataTitle,
    val open_pally: OpenPally,
    val pally_size: PallySize,
    val product_description: ProductDescription,
    val product_discount: ProductDiscount,
    val product_id: ProductId,
    val product_images: ProductImages,
    val product_order: ProductOrder,
    val product_order_all: ProductOrderAll,
    val product_price: ProductPrice,
    val product_title: ProductTitle,
    val product_unit: ProductUnit,
    val region_id: RegionId,
    val renew_date: RenewDate,
    val sales_counts: SalesCounts,
    val slug: Slug,
    val status: Status,
    val sub_cat_id: SubCatId,
    val total_views: TotalViews,
    val unit: Unit,
    val unit_availalble: UnitAvailalble,
    val unit_price: UnitPrice,
    val updated_at: UpdatedAt
)

data class BulkPriceX(
    val content: String,
    val isString: Boolean
)

data class CatIdX(
    val content: String,
    val isString: Boolean
)

data class CreatedAtX(
    val content: String,
    val isString: Boolean
)

data class DeliveryDateX(
    val content: String,
    val isString: Boolean
)

data class HtmlDescriptionX(
    val content: String,
    val isString: Boolean
)

data class IdX(
    val content: String,
    val isString: Boolean
)

data class IsFeaturedX(
    val content: String,
    val isString: Boolean
)

data class IsMakeListX(
    val content: String,
    val isString: Boolean
)

data class IsPallyX(
    val content: String,
    val isString: Boolean
)

data class IsPreOrdersX(
    val content: String,
    val isString: Boolean
)

data class IsRecommendedX(
    val content: String,
    val isString: Boolean
)

data class IsSeasonX(
    val content: String,
    val isString: Boolean
)

data class IsUpDownX(
    val content: String,
    val isString: Boolean
)

data class IsWhatsappProductX(
    val content: String,
    val isString: Boolean
)

data class MataDescriptionX(
    val content: String,
    val isString: Boolean
)

data class MataTitleX(
    val content: String,
    val isString: Boolean
)

data class ObjectID(
    val content: String,
    val isString: Boolean
)

data class OpenPallyX(
    val content: String,
    val isString: Boolean
)

data class PallySizeX(
    val content: String,
    val isString: Boolean
)

data class ProductDescriptionX(
    val content: String,
    val isString: Boolean
)

data class ProductDiscountX(
    val content: String,
    val isString: Boolean
)

data class ProductIdX(
    val content: String,
    val isString: Boolean
)

data class ProductImagesX(
    val content: String,
    val isString: Boolean
)

data class ProductOrderX(
    val content: String,
    val isString: Boolean
)

data class ProductOrderAllX(
    val content: String,
    val isString: Boolean
)

data class ProductPriceX(
    val content: String,
    val isString: Boolean
)

data class ProductTitleX(
    val content: String,
    val isString: Boolean
)

data class ProductUnitX(
    val content: String,
    val isString: Boolean
)

data class RegionIdX(
    val content: String,
    val isString: Boolean
)

data class RenewDateX(
    val content: String,
    val isString: Boolean
)

data class SalesCountsX(
    val content: String,
    val isString: Boolean
)

data class SlugX(
    val content: String,
    val isString: Boolean
)

data class StatusX(
    val content: String,
    val isString: Boolean
)

data class SubCatIdX(
    val content: String,
    val isString: Boolean
)

data class TotalViewsX(
    val content: String,
    val isString: Boolean
)

data class UnitX(
    val content: String,
    val isString: Boolean
)

data class UnitAvailalbleX(
    val content: String,
    val isString: Boolean
)

data class UnitPriceX(
    val content: String,
    val isString: Boolean
)

data class UpdatedAtX(
    val content: String,
    val isString: Boolean
)

data class BulkPrice(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: Value
)

data class CatId(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueX
)

data class CreatedAt(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXX
)

data class DeliveryDate(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXX
)

data class HtmlDescription(
    val fullyHighlighted: FullyHighlighted,
    val matchLevel: MatchLevel,
    val matchedWords: List<MatchedWord>,
    val value: ValueXXXX
)

data class Id(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXX
)

data class IsFeatured(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXX
)

data class IsMakeList(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXX
)

data class IsPally(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXX
)

data class IsPreOrders(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXX
)

data class IsRecommended(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXX
)

data class IsSeason(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXX
)

data class IsUpDown(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXX
)

data class IsWhatsappProduct(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXX
)

data class MataDescription(
    val fullyHighlighted: FullyHighlightedX,
    val matchLevel: MatchLevel,
    val matchedWords: List<MatchedWordX>,
    val value: ValueXXXXXXXXXXXXXX
)

data class MataTitle(
    val fullyHighlighted: FullyHighlightedXX,
    val matchLevel: MatchLevel,
    val matchedWords: List<MatchedWordXX>,
    val value: ValueXXXXXXXXXXXXXXX
)

data class OpenPally(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXX
)

data class PallySize(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXX
)

data class ProductDescription(
    val fullyHighlighted: FullyHighlightedXXX,
    val matchLevel: MatchLevel,
    val matchedWords: List<MatchedWordXXX>,
    val value: ValueXXXXXXXXXXXXXXXXXX
)

data class ProductDiscount(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXX
)

data class ProductId(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXX
)

data class ProductImages(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXX
)

data class ProductOrder(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXX
)

data class ProductOrderAll(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXX
)

data class ProductPrice(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXX
)

data class ProductTitle(
    val fullyHighlighted: FullyHighlightedXXXX,
    val matchLevel: MatchLevel,
    val matchedWords: List<MatchedWordXXXX>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXXX
)

data class ProductUnit(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXXXX
)

data class RegionId(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXX
)

data class RenewDate(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXX
)

data class SalesCounts(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
)

data class Slug(
    val fullyHighlighted: FullyHighlightedXXXXX,
    val matchLevel: MatchLevel,
    val matchedWords: List<MatchedWordXXXXX>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
)

data class Status(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
)

data class SubCatId(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
)

data class TotalViews(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
)

data class Unit(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
)

data class UnitAvailalble(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
)

data class UnitPrice(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
)

data class UpdatedAt(
    val matchLevel: MatchLevel,
    val matchedWords: List<Any>,
    val value: ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
)

data class MatchLevel(
    val content: String,
    val isString: Boolean
)

data class Value(
    val content: String,
    val isString: Boolean
)

data class FullyHighlighted(
    val content: String,
    val isString: Boolean
)

data class MatchedWord(
    val content: String,
    val isString: Boolean
)

data class ValueX(
    val content: String,
    val isString: Boolean
)

data class ValueXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class ValueXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX(
    val content: String,
    val isString: Boolean
)

data class FullyHighlightedX(
    val content: String,
    val isString: Boolean
)

data class FullyHighlightedXX(
    val content: String,
    val isString: Boolean
)

data class FullyHighlightedXXX(
    val content: String,
    val isString: Boolean
)

data class FullyHighlightedXXXX(
    val content: String,
    val isString: Boolean
)

data class FullyHighlightedXXXXX(
    val content: String,
    val isString: Boolean
)

data class MatchedWordX(
    val content: String,
    val isString: Boolean
)

data class MatchedWordXX(
    val content: String,
    val isString: Boolean
)

data class MatchedWordXXX(
    val content: String,
    val isString: Boolean
)

data class MatchedWordXXXX(
    val content: String,
    val isString: Boolean
)

data class MatchedWordXXXXX(
    val content: String,
    val isString: Boolean
)





















