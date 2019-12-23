package functions.rfc.sap.document.sap_com;

import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.impl.httpclient3.HttpTransportPropertiesImpl.Authenticator;
import org.apache.commons.httpclient.HttpClient;

import com.sun.org.apache.xml.internal.utils.SuballocatedByteVector;

public class client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			new Options();
			 
			Z_HELLO_ServiceLocator z_HELLO_ServiceLocator = new Z_HELLO_ServiceLocator();

//			functions.rfc.sap.document.sap_com.Z_Hello  client = z_HELLO_ServiceLocator.getZ_HELLO();

		    
//		    ServiceClient _serviceClient = new ServiceClient(z_HELLO_ServiceLocator);
		    ServiceClient _serviceClient = new ServiceClient();
			Authenticator auth = new Authenticator();
			auth.setUsername("20048790");
			auth.setPassword("Dhanu100.");
			_serviceClient.getOptions().setProperty(org.apache.axis2.transport.http.HTTPConstants.AUTHENTICATE, auth);

			
		} catch (Exception e) {
		        e.printStackTrace();
		}
	}
}
