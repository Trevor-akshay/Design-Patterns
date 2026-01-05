package Adaptor;

public class AdaptorExample {
	public static void main(String[] args) {
		Xml xml = new Xml("<Stock> APPL : 200 </Stock>");

		// Direction 1: Xml -> Json
		Adaptor<Xml, Json> adaptor = new XmlToJsonAdaptor();
		Json json = adaptor.adapt(xml);
		System.out.println("Json data: " + json.getDataType());

		// Direction 2: Json -> Xml
		Adaptor<Json, Xml> reverseAdaptor = new JsonToXmlAdaptor();
		Xml convertedBackToXml = reverseAdaptor.adapt(json);
		System.out.println("Xml data: " + convertedBackToXml.getDataType());
	}
}
