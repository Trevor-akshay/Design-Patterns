package Adaptor;

/**
 * "Adaptee"-like type (another format we want to work with).
 *
 * In this demo it's a wrapper around a String representing JSON.
 */
public class Json implements DataTypes {
	private String jsonData;

	public Json(String jsonData) {
		this.jsonData = jsonData;

	}

	@Override
	public String getDataType() {
		return this.jsonData;
	}

	@Override
	public void setDataType(String data) {
		this.jsonData = data;

	}

}
