package com.xml.parser;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MyDomParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder=factory.newDocumentBuilder();
			Document doc= builder.parse("People.xml");
			Element e=doc.getDocumentElement();
			NodeList e1=e.getChildNodes();
			System.out.println(e1.getLength());
			Element m= doc.getDocumentElement();
			System.out.println(m.getAttributeNode("id"));
			NodeList nl=doc.getElementsByTagName("person");
			System.out.println(nl.getLength());
			for (int i = 0; i < nl.getLength(); i++) {
				Node m1=nl.item(i);
				if(m1.getNodeType()==Node.ELEMENT_NODE)
				{
					Element p1=(Element) m1;
					String id=p1.getAttribute("id");
					System.out.println("Attribute  :"+id);
					System.out.println("Attribute Value  "+p1.getNodeName());
					NodeList n2=p1.getChildNodes();
							//doc.getChildNodes();
					System.out.println("Length" +n2.getLength());
					for (int j = 0; j < n2.getLength(); j++) {
						Node m2=n2.item(j);
						if(m2.getNodeType()==Node.ELEMENT_NODE)
						{
							Element name=(Element) m2;
							System.out.println(name.getTagName()   +   name.getTextContent());
						}
					}
				}

			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
