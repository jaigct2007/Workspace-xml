package my.library.example;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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

public class MyLibrary {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		int bookPrice = 0;	
		Scanner scan = new Scanner(System.in);
    
ArrayList<Library> data= new ArrayList<Library>();

DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factory.newDocumentBuilder();
Document doc = builder.newDocument();
int j1;

Element root = doc.createElement("BookList");
Element root1=doc.createElement("Book");
doc.appendChild(root);
root.appendChild(root1);

int num = scan.nextInt();
        
        System.out.println(num);
        for (int i = 0; i < num; i++) {
			System.out.println("Enter book name");
			String bookName=scan.next();
			//System.out.println(bookName);
			System.out.println("Enter Book Price");
			//int bookPrice;
			try{
			 bookPrice=scan.nextInt();
			 int m=1;
			 if(bookPrice%m!=0)
			 throw (new Exception("Book Price can only be in decimal digits"));
			 }
			catch(Exception E)
			{
				System.out.println(E.getMessage());
			}
			System.out.println("Enter Book Author");
		    String bookAuthor=scan.next();
		    Library m=new Library(bookName, bookPrice, bookAuthor);
		    data.add(m);
		    
	//System.out.println("BookName " +bookName+ "Price Is " +bookPrice + "Written By " + bookAuthor);
		}

       for (int i = 0; i < data.size(); i++) {
    	   int j=i+1;
    	   String m=Integer.toString(j);
    	   root1.setAttribute("ID", m);
    	Element root2=doc.createElement("Name");
    	String s1;
    	root2.setTextContent(data.get(i).getBookName());
   		root1.appendChild(root2);
   		Element root3=doc.createElement("Price");
   		try{
   		 j1=data.get(i).getBookPrice();
   		 s1=Integer.toString(j1);
   		root3.setTextContent(s1);
   		
   		}
   		catch(Exception e)
   		{
   			System.out.println(e.toString());
   			throw new Exception("please enter decimal");
   		}
   		
   		
   		root1.appendChild(root3);
   		Element root4=doc.createElement("Author");
   		root4.setTextContent(data.get(i).getBookAuthor());
   		root1.appendChild(root4);
   		
    	  System.out.println("BookAuthor  :"+ data.get(i).getBookAuthor());
    	  System.out.println("BookPrice  :"+ data.get(i).getBookPrice());

    	  System.out.println("BookName  :"+ data.get(i).getBookName());

    	  
		
	}
       
     /*  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();
		
		Element root = doc.createElement("BookList");
		Element root1=doc.createElement("Book");
		doc.appendChild(root);
		root.appendChild(root1);
		//doc.appendChild(root1);
		Element root2=doc.createElement("Name");
		root2.setTextContent(data.get(0).getBookName());
		root1.appendChild(root2);
		Element root3=doc.createElement("Price");
		int j1=data.get(0).getBookPrice();
		String s1=Integer.toString(j1);
		root3.setTextContent(s1);
		root1.appendChild(root3);
		Element root4=doc.createElement("Author");
		root4.setTextContent(data.get(0).getBookAuthor());
		root1.appendChild(root4);
		*/
		
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		StringWriter writer = new StringWriter();
		transformer.transform(new DOMSource(doc), new StreamResult(writer));
		String output = writer.getBuffer().toString().replaceAll("\n|\r", "");
		System.out.println(output);
		
		
		
		
              
    }
	}


