package pojoModel;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class RespTest{

	@JsonProperty("showSeeAllPages")
	private boolean showSeeAllPages;

	@JsonProperty("pages")
	private List<PagesItem> pages;

	@JsonProperty("showSeeAllProducts")
	private boolean showSeeAllProducts;

	@JsonProperty("suggestions")
	private List<SuggestionsItem> suggestions;

	@JsonProperty("products")
	private List<ProductsItem> products;

	public void setShowSeeAllPages(boolean showSeeAllPages){
		this.showSeeAllPages = showSeeAllPages;
	}

	public boolean isShowSeeAllPages(){
		return showSeeAllPages;
	}

	public void setPages(List<PagesItem> pages){
		this.pages = pages;
	}

	public List<PagesItem> getPages(){
		return pages;
	}

	public void setShowSeeAllProducts(boolean showSeeAllProducts){
		this.showSeeAllProducts = showSeeAllProducts;
	}

	public boolean isShowSeeAllProducts(){
		return showSeeAllProducts;
	}

	public void setSuggestions(List<SuggestionsItem> suggestions){
		this.suggestions = suggestions;
	}

	public List<SuggestionsItem> getSuggestions(){
		return suggestions;
	}

	public void setProducts(List<ProductsItem> products){
		this.products = products;
	}

	public List<ProductsItem> getProducts(){
		return products;
	}

	@Override
 	public String toString(){
		return 
			"RespTest{" + 
			"showSeeAllPages = '" + showSeeAllPages + '\'' + 
			",pages = '" + pages + '\'' + 
			",showSeeAllProducts = '" + showSeeAllProducts + '\'' + 
			",suggestions = '" + suggestions + '\'' + 
			",products = '" + products + '\'' + 
			"}";
		}
}