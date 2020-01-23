package pojoModel;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated("com.robohorse.robopojogenerator")
public class VariantOptionQualifiersItem{

	@JsonProperty("image")
	private Image image;

	@JsonProperty("qualifier")
	private String qualifier;

	@JsonProperty("name")
	private Object name;

	@JsonProperty("value")
	private String value;

	public void setImage(Image image){
		this.image = image;
	}

	public Image getImage(){
		return image;
	}

	public void setQualifier(String qualifier){
		this.qualifier = qualifier;
	}

	public String getQualifier(){
		return qualifier;
	}

	public void setName(Object name){
		this.name = name;
	}

	public Object getName(){
		return name;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"VariantOptionQualifiersItem{" + 
			"image = '" + image + '\'' + 
			",qualifier = '" + qualifier + '\'' + 
			",name = '" + name + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}