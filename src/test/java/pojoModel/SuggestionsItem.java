package pojoModel;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated("com.robohorse.robopojogenerator")
public class SuggestionsItem{

	@JsonProperty("term")
	private String term;

	public void setTerm(String term){
		this.term = term;
	}

	public String getTerm(){
		return term;
	}

	@Override
 	public String toString(){
		return 
			"SuggestionsItem{" + 
			"term = '" + term + '\'' + 
			"}";
		}
}