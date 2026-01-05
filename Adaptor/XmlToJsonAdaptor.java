package Adaptor;

/**
 * Concrete Adapter: converts Xml -> Json.
 *
 * This class lets client code work with Json without needing to understand Xml.
 *
 * For demo purposes we do a very small, naive conversion:
 * - If the XML looks like: <Stock> SOME_TEXT </Stock>
 * - We output JSON like: {"Stock":"SOME_TEXT"}
 *
 * This is not a full XML/JSON parser (and you said no need to worry about
 * that).
 */
public class XmlToJsonAdaptor implements Adaptor<Xml, Json> {
	@Override
	public Json adapt(Xml source) {
		String xml = source.getDataType();
		String value = extractBetween(xml, "<Stock>", "</Stock>");
		String jsonData = "{\"Stock\":\"" + escapeJson(value.trim()) + "\"}";
		return new Json(jsonData);
	}

	private static String extractBetween(String input, String start, String end) {
		int startIndex = input.indexOf(start);
		int endIndex = input.indexOf(end);
		if (startIndex == -1 || endIndex == -1 || endIndex < startIndex) {
			// Fallback: if the string isn't in the expected shape, just treat it as the
			// value.
			return input;
		}
		return input.substring(startIndex + start.length(), endIndex);
	}

	private static String escapeJson(String value) {
		// Minimal escaping for demo output.
		return value.replace("\\", "\\\\").replace("\"", "\\\"");
	}
}
