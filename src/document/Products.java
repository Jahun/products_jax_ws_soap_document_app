package document;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Ceyhun Esedli on 2017-04-22.
 */
@WebService(endpointInterface = "document.IProducts")
public class Products implements IProducts{
    @Override
    public String getProduct(Integer id) {
        return "Document Product : " + id.toString();
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/document/products", new Products());
    }
}
