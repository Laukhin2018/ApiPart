package pojoModel;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated("com.robohorse.robopojogenerator")
public class PriceRange{

	@JsonProperty("minPrice")
	private Object minPrice;

	@JsonProperty("maxPrice")
	private Object maxPrice;

	public void setMinPrice(Object minPrice){
		this.minPrice = minPrice;
	}

	public Object getMinPrice(){
		return minPrice;
	}

	public void setMaxPrice(Object maxPrice){
		this.maxPrice = maxPrice;
	}

	public Object getMaxPrice(){
		return maxPrice;
	}

	@Override
 	public String toString(){
		return 
			"PriceRange{" + 
			"minPrice = '" + minPrice + '\'' + 
			",maxPrice = '" + maxPrice + '\'' + 
			"}";
		}
}