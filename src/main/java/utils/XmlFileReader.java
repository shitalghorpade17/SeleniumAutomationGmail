package utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Forgeahead-Shital on 9/8/2017.
 */
public class XmlFileReader
{
      public static Map<String,String> readXmlFile(String filename) {
          Map<String, String> hashMap = new HashMap<String, String>();
          try {
              DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
              DocumentBuilder documentBuilder = dbfactory.newDocumentBuilder();
              Document doc = documentBuilder.parse("src/main/resources/elementRepo/" + filename + ".xml");
              // Document doc = documentBuilder.newDocument();
              NodeList nodeList = doc.getElementsByTagName("Element");
              Element element = null;
              for (int i = 0; i < nodeList.getLength(); i++) {
                  Node node = nodeList.item(i);

                  if (node.getNodeType() == Node.ELEMENT_NODE) {
                      element = (Element) node;
                 //     System.out.println(element.getAttribute("name"));
                  }
              //    Map<String, String> hashMap = new HashMap<String, String>();
                  hashMap.put(element.getAttribute("name"), element.getAttribute("locatorType") + "_TBD_" + element.getAttribute("locatorValue"));


              }

          } catch (Exception ex) {
              ex.printStackTrace();
          }
          return hashMap;
      }


}
