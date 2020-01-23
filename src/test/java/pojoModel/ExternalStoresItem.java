package pojoModel;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated("com.robohorse.robopojogenerator")
public class ExternalStoresItem{

	@JsonProperty("type")
	private String type;

	@JsonProperty("url")
	private String url;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"ExternalStoresItem{" + 
			"type = '" + type + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}