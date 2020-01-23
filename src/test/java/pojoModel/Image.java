package pojoModel;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated("com.robohorse.robopojogenerator")
public class Image{

	@JsonProperty("altText")
	private Object altText;

	@JsonProperty("format")
	private String format;

	@JsonProperty("width")
	private Object width;

	@JsonProperty("galleryIndex")
	private Object galleryIndex;

	@JsonProperty("imageType")
	private String imageType;

	@JsonProperty("url")
	private String url;

	public void setAltText(Object altText){
		this.altText = altText;
	}

	public Object getAltText(){
		return altText;
	}

	public void setFormat(String format){
		this.format = format;
	}

	public String getFormat(){
		return format;
	}

	public void setWidth(Object width){
		this.width = width;
	}

	public Object getWidth(){
		return width;
	}

	public void setGalleryIndex(Object galleryIndex){
		this.galleryIndex = galleryIndex;
	}

	public Object getGalleryIndex(){
		return galleryIndex;
	}

	public void setImageType(String imageType){
		this.imageType = imageType;
	}

	public String getImageType(){
		return imageType;
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
			"Image{" + 
			"altText = '" + altText + '\'' + 
			",format = '" + format + '\'' + 
			",width = '" + width + '\'' + 
			",galleryIndex = '" + galleryIndex + '\'' + 
			",imageType = '" + imageType + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}