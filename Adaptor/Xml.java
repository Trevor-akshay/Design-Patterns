package Adaptor;

/**
 * "Adaptee"-like type (one of the formats we want to work with).
 *
 * In real code, this might be a third-party library type or a legacy type that
 * you
 * cannot change. In this demo, it's just a wrapper around a String.
 */
public class Xml implements DataTypes {
	private String xmlData;

	public Xml(String xmlData) {
		this.xmlData = xmlData;
	}

	@Override
	public String getDataType() {
		return this.xmlData;
	}

	@Override
	public void setDataType(String xmlData) {
		this.xmlData = xmlData;

	}
}
