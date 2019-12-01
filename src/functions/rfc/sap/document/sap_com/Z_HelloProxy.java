package functions.rfc.sap.document.sap_com;

public class Z_HelloProxy implements functions.rfc.sap.document.sap_com.Z_Hello {
  private String _endpoint = null;
  private functions.rfc.sap.document.sap_com.Z_Hello z_Hello = null;
  
  public Z_HelloProxy() {
    _initZ_HelloProxy();
  }
  
  public Z_HelloProxy(String endpoint) {
    _endpoint = endpoint;
    _initZ_HelloProxy();
  }
  
  private void _initZ_HelloProxy() {
    try {
      //z_Hello = (new functions.rfc.sap.document.sap_com.Z_HELLOLocator()).getZ_HELLO();
      z_Hello = (new Z_HELLO_ServiceLocator()).getZ_HELLO();
      if (z_Hello != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)z_Hello)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)z_Hello)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (z_Hello != null)
      ((javax.xml.rpc.Stub)z_Hello)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public functions.rfc.sap.document.sap_com.Z_Hello getZ_Hello() {
    if (z_Hello == null)
      _initZ_HelloProxy();
    return z_Hello;
  }
  
  public java.lang.String z_HELLO() throws java.rmi.RemoteException{
    if (z_Hello == null)
      _initZ_HelloProxy();
    return z_Hello.z_HELLO();
  }
  
  
}