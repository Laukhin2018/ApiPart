package pojoModel;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class VariantOptionsItem{

	@JsonProperty("authorsWithoutRoles")
	private String authorsWithoutRoles;

	@JsonProperty("code")
	private String code;

	@JsonProperty("studentPrice")
	private Object studentPrice;

	@JsonProperty("lifecycleStatus")
	private String lifecycleStatus;

	@JsonProperty("promotionPrice")
	private Object promotionPrice;

	@JsonProperty("available")
	private boolean available;

	@JsonProperty("purchaseOptionSequenceNumber")
	private Object purchaseOptionSequenceNumber;

	@JsonProperty("productSetComponents")
	private Object productSetComponents;

	@JsonProperty("purchaseOptionDescription")
	private String purchaseOptionDescription;

	@JsonProperty("priceData")
	private Object priceData;

	@JsonProperty("preOrderNodes")
	private Object preOrderNodes;

	@JsonProperty("potentialPromotions")
	private Object potentialPromotions;

	@JsonProperty("stock")
	private Object stock;

	@JsonProperty("hasExternalStores")
	private boolean hasExternalStores;

	@JsonProperty("publicationDate")
	private long publicationDate;

	@JsonProperty("images")
	private List<ImagesItem> images;

	@JsonProperty("inventoryStatus")
	private Object inventoryStatus;

	@JsonProperty("hidePrice")
	private boolean hidePrice;

	@JsonProperty("url")
	private String url;

	@JsonProperty("externalStores")
	private List<ExternalStoresItem> externalStores;

	@JsonProperty("partnerPrice")
	private Object partnerPrice;

	@JsonProperty("productGroup")
	private Object productGroup;

	@JsonProperty("purchaseOptionName")
	private String purchaseOptionName;

	@JsonProperty("name")
	private String name;

	@JsonProperty("variantOptionQualifiers")
	private List<VariantOptionQualifiersItem> variantOptionQualifiers;

	@JsonProperty("rentalDays")
	private Object rentalDays;

	@JsonProperty("countable")
	private boolean countable;

	@JsonProperty("authors")
	private Object authors;

	public void setAuthorsWithoutRoles(String authorsWithoutRoles){
		this.authorsWithoutRoles = authorsWithoutRoles;
	}

	public String getAuthorsWithoutRoles(){
		return authorsWithoutRoles;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setStudentPrice(Object studentPrice){
		this.studentPrice = studentPrice;
	}

	public Object getStudentPrice(){
		return studentPrice;
	}

	public void setLifecycleStatus(String lifecycleStatus){
		this.lifecycleStatus = lifecycleStatus;
	}

	public String getLifecycleStatus(){
		return lifecycleStatus;
	}

	public void setPromotionPrice(Object promotionPrice){
		this.promotionPrice = promotionPrice;
	}

	public Object getPromotionPrice(){
		return promotionPrice;
	}

	public void setAvailable(boolean available){
		this.available = available;
	}

	public boolean isAvailable(){
		return available;
	}

	public void setPurchaseOptionSequenceNumber(Object purchaseOptionSequenceNumber){
		this.purchaseOptionSequenceNumber = purchaseOptionSequenceNumber;
	}

	public Object getPurchaseOptionSequenceNumber(){
		return purchaseOptionSequenceNumber;
	}

	public void setProductSetComponents(Object productSetComponents){
		this.productSetComponents = productSetComponents;
	}

	public Object getProductSetComponents(){
		return productSetComponents;
	}

	public void setPurchaseOptionDescription(String purchaseOptionDescription){
		this.purchaseOptionDescription = purchaseOptionDescription;
	}

	public String getPurchaseOptionDescription(){
		return purchaseOptionDescription;
	}

	public void setPriceData(Object priceData){
		this.priceData = priceData;
	}

	public Object getPriceData(){
		return priceData;
	}

	public void setPreOrderNodes(Object preOrderNodes){
		this.preOrderNodes = preOrderNodes;
	}

	public Object getPreOrderNodes(){
		return preOrderNodes;
	}

	public void setPotentialPromotions(Object potentialPromotions){
		this.potentialPromotions = potentialPromotions;
	}

	public Object getPotentialPromotions(){
		return potentialPromotions;
	}

	public void setStock(Object stock){
		this.stock = stock;
	}

	public Object getStock(){
		return stock;
	}

	public void setHasExternalStores(boolean hasExternalStores){
		this.hasExternalStores = hasExternalStores;
	}

	public boolean isHasExternalStores(){
		return hasExternalStores;
	}

	public void setPublicationDate(long publicationDate){
		this.publicationDate = publicationDate;
	}

	public long getPublicationDate(){
		return publicationDate;
	}

	public void setImages(List<ImagesItem> images){
		this.images = images;
	}

	public List<ImagesItem> getImages(){
		return images;
	}

	public void setInventoryStatus(Object inventoryStatus){
		this.inventoryStatus = inventoryStatus;
	}

	public Object getInventoryStatus(){
		return inventoryStatus;
	}

	public void setHidePrice(boolean hidePrice){
		this.hidePrice = hidePrice;
	}

	public boolean isHidePrice(){
		return hidePrice;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setExternalStores(List<ExternalStoresItem> externalStores){
		this.externalStores = externalStores;
	}

	public List<ExternalStoresItem> getExternalStores(){
		return externalStores;
	}

	public void setPartnerPrice(Object partnerPrice){
		this.partnerPrice = partnerPrice;
	}

	public Object getPartnerPrice(){
		return partnerPrice;
	}

	public void setProductGroup(Object productGroup){
		this.productGroup = productGroup;
	}

	public Object getProductGroup(){
		return productGroup;
	}

	public void setPurchaseOptionName(String purchaseOptionName){
		this.purchaseOptionName = purchaseOptionName;
	}

	public String getPurchaseOptionName(){
		return purchaseOptionName;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setVariantOptionQualifiers(List<VariantOptionQualifiersItem> variantOptionQualifiers){
		this.variantOptionQualifiers = variantOptionQualifiers;
	}

	public List<VariantOptionQualifiersItem> getVariantOptionQualifiers(){
		return variantOptionQualifiers;
	}

	public void setRentalDays(Object rentalDays){
		this.rentalDays = rentalDays;
	}

	public Object getRentalDays(){
		return rentalDays;
	}

	public void setCountable(boolean countable){
		this.countable = countable;
	}

	public boolean isCountable(){
		return countable;
	}

	public void setAuthors(Object authors){
		this.authors = authors;
	}

	public Object getAuthors(){
		return authors;
	}

	@Override
 	public String toString(){
		return 
			"VariantOptionsItem{" + 
			"authorsWithoutRoles = '" + authorsWithoutRoles + '\'' + 
			",code = '" + code + '\'' + 
			",studentPrice = '" + studentPrice + '\'' + 
			",lifecycleStatus = '" + lifecycleStatus + '\'' + 
			",promotionPrice = '" + promotionPrice + '\'' + 
			",available = '" + available + '\'' + 
			",purchaseOptionSequenceNumber = '" + purchaseOptionSequenceNumber + '\'' + 
			",productSetComponents = '" + productSetComponents + '\'' + 
			",purchaseOptionDescription = '" + purchaseOptionDescription + '\'' + 
			",priceData = '" + priceData + '\'' + 
			",preOrderNodes = '" + preOrderNodes + '\'' + 
			",potentialPromotions = '" + potentialPromotions + '\'' + 
			",stock = '" + stock + '\'' + 
			",hasExternalStores = '" + hasExternalStores + '\'' + 
			",publicationDate = '" + publicationDate + '\'' + 
			",images = '" + images + '\'' + 
			",inventoryStatus = '" + inventoryStatus + '\'' + 
			",hidePrice = '" + hidePrice + '\'' + 
			",url = '" + url + '\'' + 
			",externalStores = '" + externalStores + '\'' + 
			",partnerPrice = '" + partnerPrice + '\'' + 
			",productGroup = '" + productGroup + '\'' + 
			",purchaseOptionName = '" + purchaseOptionName + '\'' + 
			",name = '" + name + '\'' + 
			",variantOptionQualifiers = '" + variantOptionQualifiers + '\'' + 
			",rentalDays = '" + rentalDays + '\'' + 
			",countable = '" + countable + '\'' + 
			",authors = '" + authors + '\'' + 
			"}";
		}
}