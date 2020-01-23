package pojoModel;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated("com.robohorse.robopojogenerator")
public class Price{

	@JsonProperty("currencyIso")
	private String currencyIso;

	@JsonProperty("minQuantity")
	private Object minQuantity;

	@JsonProperty("maxQuantity")
	private Object maxQuantity;

	@JsonProperty("priceType")
	private String priceType;

	@JsonProperty("formattedValue")
	private String formattedValue;

	@JsonProperty("shortFormattedValue")
	private String shortFormattedValue;

	@JsonProperty("currencySymbol")
	private String currencySymbol;

	@JsonProperty("optionalTaxTooltip")
	private Object optionalTaxTooltip;

	@JsonProperty("value")
	private double value;

	@JsonProperty("optionalTaxShortMessage")
	private Object optionalTaxShortMessage;

	public void setCurrencyIso(String currencyIso){
		this.currencyIso = currencyIso;
	}

	public String getCurrencyIso(){
		return currencyIso;
	}

	public void setMinQuantity(Object minQuantity){
		this.minQuantity = minQuantity;
	}

	public Object getMinQuantity(){
		return minQuantity;
	}

	public void setMaxQuantity(Object maxQuantity){
		this.maxQuantity = maxQuantity;
	}

	public Object getMaxQuantity(){
		return maxQuantity;
	}

	public void setPriceType(String priceType){
		this.priceType = priceType;
	}

	public String getPriceType(){
		return priceType;
	}

	public void setFormattedValue(String formattedValue){
		this.formattedValue = formattedValue;
	}

	public String getFormattedValue(){
		return formattedValue;
	}

	public void setShortFormattedValue(String shortFormattedValue){
		this.shortFormattedValue = shortFormattedValue;
	}

	public String getShortFormattedValue(){
		return shortFormattedValue;
	}

	public void setCurrencySymbol(String currencySymbol){
		this.currencySymbol = currencySymbol;
	}

	public String getCurrencySymbol(){
		return currencySymbol;
	}

	public void setOptionalTaxTooltip(Object optionalTaxTooltip){
		this.optionalTaxTooltip = optionalTaxTooltip;
	}

	public Object getOptionalTaxTooltip(){
		return optionalTaxTooltip;
	}

	public void setValue(double value){
		this.value = value;
	}

	public double getValue(){
		return value;
	}

	public void setOptionalTaxShortMessage(Object optionalTaxShortMessage){
		this.optionalTaxShortMessage = optionalTaxShortMessage;
	}

	public Object getOptionalTaxShortMessage(){
		return optionalTaxShortMessage;
	}

	@Override
 	public String toString(){
		return 
			"Price{" + 
			"currencyIso = '" + currencyIso + '\'' + 
			",minQuantity = '" + minQuantity + '\'' + 
			",maxQuantity = '" + maxQuantity + '\'' + 
			",priceType = '" + priceType + '\'' + 
			",formattedValue = '" + formattedValue + '\'' + 
			",shortFormattedValue = '" + shortFormattedValue + '\'' + 
			",currencySymbol = '" + currencySymbol + '\'' + 
			",optionalTaxTooltip = '" + optionalTaxTooltip + '\'' + 
			",value = '" + value + '\'' + 
			",optionalTaxShortMessage = '" + optionalTaxShortMessage + '\'' + 
			"}";
		}
}