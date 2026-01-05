package Adaptor;

/**
 * Target interface ("Adapter" API) used by client code.
 *
 * In the Adapter pattern:
 * - The client depends on this interface, not on concrete formats (Xml/Json).
 * - Concrete adapters implement this interface to convert one type to another.
 *
 * Note: you're calling it "Adaptor" (common alternative spelling). The pattern
 * name
 * is typically "Adapter".
 */
public interface Adaptor<S extends DataTypes, T extends DataTypes> {
	/**
	 * Converts the source type to the target type.
	 */
	T adapt(S source);
}
