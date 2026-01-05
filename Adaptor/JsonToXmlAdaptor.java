package Adaptor;

/**
 * Concrete Adapter: converts Json -> Xml.
 *
 * For demo purposes we do a naive conversion that matches XmlToJsonAdaptor:
 * - If JSON looks like: {"Stock":"SOME_TEXT"}
 * - We output XML like: <Stock> SOME_TEXT </Stock>
 */
public class JsonToXmlAdaptor implements Adaptor<Json, Xml> {
	@Override
	public Xml adapt(Json source) {
		String json = source.getDataType();
		String value = extractStockValue(json);
		String xml = "<Stock> " + value + " </Stock>";
		return new Xml(xml);
	}

	private static String extractStockValue(String json) {
		// Very small, demo-only extraction. Not a general JSON parser.
		String needle = "\"Stock\"";
		int keyIndex = json.indexOf(needle);
		if (keyIndex == -1) {
			return json;
		}
		int colon = json.indexOf(':', keyIndex + needle.length());
		if (colon == -1) {
			return json;
		}
		int firstQuote = json.indexOf('"', colon);
		if (firstQuote == -1) {
			return json;
		}
		int secondQuote = json.indexOf('"', firstQuote + 1);
		if (secondQuote == -1) {
			return json;
		}
		return unescapeJson(json.substring(firstQuote + 1, secondQuote));
	}

	private static String unescapeJson(String value) {
		// Minimal unescaping for demo output.
		return value.replace("\\\"", "\"").replace("\\\\", "\\");
	}
}
