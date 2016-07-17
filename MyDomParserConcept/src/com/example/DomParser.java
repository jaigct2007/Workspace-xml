package com.example;

import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class DomParser {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		// TODO Auto-generated method stub
DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
DocumentBuilder builder=factory.newDocumentBuilder();
Document personInfo=builder.newDocument();
Element e=personInfo.createElement("PersonInfoBillTo");
e.setAttribute("AddressLine1", "");
e.setAttribute("AddressLine2", "");
e.setAttribute("FirstName", "");
e.setAttribute("LastNAme", "");
e.setAttribute("State", "");
e.setAttribute("City", "");
e.setAttribute("Country", "");
e.setAttribute("Zip", "");
personInfo.appendChild(e);

printDocument(personInfo);

//creating order document
/*<OrderLines>
<OrderLine OrderedQty="" PrimeLineNo="" ItemID=""/>
</OrderLines>*/
DocumentBuilderFactory factory1=DocumentBuilderFactory.newInstance();
DocumentBuilder builder1=factory.newDocumentBuilder();
Document orderInfo=builder1.newDocument();
Element e1=orderInfo.createElement("Orderlines");
Element e2=orderInfo.createElement("OrderLine");
e2.setAttribute("OrderedQty", "");
e2.setAttribute("PrimeLineNo", "");
e2.setAttribute("ItemID", "");
orderInfo.appendChild(e1);
e1.appendChild(e2);
printDocument(orderInfo);

//Createing Order Document


DocumentBuilderFactory factory2=DocumentBuilderFactory.newInstance();
DocumentBuilder builder2=factory.newDocumentBuilder();
Document order=builder1.newDocument();


Element e3=order.createElement("Order");
order.appendChild(e3);

Element e4=(Element) order.importNode(orderInfo.getFirstChild(), true);
Element e5=(Element) order.importNode(personInfo.getFirstChild(),true);
e3.appendChild(e4);
e4.appendChild(e5);

printDocument(order);

	}

	private  static void printDocument(Document personInfo) throws TransformerException {
		// TODO Auto-generated method stub
		Document doc=personInfo;
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		StringWriter writer = new StringWriter();
		transformer.transform(new DOMSource(doc), new StreamResult(writer));
		String output = writer.getBuffer().toString().replaceAll("\n|\r", "");
		System.out.println(output);
	}

}
