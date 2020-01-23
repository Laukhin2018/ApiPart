package pojoModel;

import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated("com.robohorse.robopojogenerator")
public class ProductGroupsItem{

	@JsonProperty("groupName")
	private String groupName;

	@JsonProperty("variantOptionData")
	private List<VariantOptionDataItem> variantOptionData;

	@JsonProperty("minPrice")
	private Object minPrice;

	@JsonProperty("active")
	private boolean active;

	@JsonProperty("sequenceID")
	private int sequenceID;

	@JsonProperty("url")
	private Object url;

	@JsonProperty("groupCode")
	private String groupCode;

	public void setGroupName(String groupName){
		this.groupName = groupName;
	}

	public String getGroupName(){
		return groupName;
	}

	public void setVariantOptionData(List<VariantOptionDataItem> variantOptionData){
		this.variantOptionData = variantOptionData;
	}

	public List<VariantOptionDataItem> getVariantOptionData(){
		return variantOptionData;
	}

	public void setMinPrice(Object minPrice){
		this.minPrice = minPrice;
	}

	public Object getMinPrice(){
		return minPrice;
	}

	public void setActive(boolean active){
		this.active = active;
	}

	public boolean isActive(){
		return active;
	}

	public void setSequenceID(int sequenceID){
		this.sequenceID = sequenceID;
	}

	public int getSequenceID(){
		return sequenceID;
	}

	public void setUrl(Object url){
		this.url = url;
	}

	public Object getUrl(){
		return url;
	}

	public void setGroupCode(String groupCode){
		this.groupCode = groupCode;
	}

	public String getGroupCode(){
		return groupCode;
	}

	@Override
 	public String toString(){
		return 
			"ProductGroupsItem{" + 
			"groupName = '" + groupName + '\'' + 
			",variantOptionData = '" + variantOptionData + '\'' + 
			",minPrice = '" + minPrice + '\'' + 
			",active = '" + active + '\'' + 
			",sequenceID = '" + sequenceID + '\'' + 
			",url = '" + url + '\'' + 
			",groupCode = '" + groupCode + '\'' + 
			"}";
		}
}