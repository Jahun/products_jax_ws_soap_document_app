package document;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Ceyhun Esedli on 2017-04-22.
 */
public class ProductsDocumentClient {
    public static void main(String[] args) {
        try {
            URL url =new URL("http://localhost:8080/document/products?wsdl");

            QName qName = new QName("http://document/", "ProductsService");
            Service service = Service.create(url,qName);
            IProducts iProducts = service.getPort(IProducts.class);

            System.out.println(iProducts.getProduct(600));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
