package Adaptor;

/**
 * Small shared abstraction for different "data wrapper" types.
 *
 * This is NOT required for the Adapter pattern, but it's fine as a common
 * contract
 * shared by Xml and Json in your demo.
 */
public interface DataTypes {
	String getDataType();

	void setDataType(String data);
}
