/**
 * Z_HELLO_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package functions.rfc.sap.document.sap_com;

public class Z_HELLO_ServiceLocator extends org.apache.axis.client.Service implements functions.rfc.sap.document.sap_com.Z_HELLO_Service {

    public Z_HELLO_ServiceLocator() {
    }


    public Z_HELLO_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Z_HELLO_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Z_HELLO
    private java.lang.String Z_HELLO_address = "http://g4u2317.houston.hp.com:8032/sap/bc/srt/rfc/sap/z_hello/007/z_hello/z_hello";

    public java.lang.String getZ_HELLOAddress() {
        return Z_HELLO_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Z_HELLOWSDDServiceName = "Z_HELLO";

    public java.lang.String getZ_HELLOWSDDServiceName() {
        return Z_HELLOWSDDServiceName;
    }

    public void setZ_HELLOWSDDServiceName(java.lang.String name) {
        Z_HELLOWSDDServiceName = name;
    }

    public functions.rfc.sap.document.sap_com.Z_Hello getZ_HELLO() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Z_HELLO_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getZ_HELLO(endpoint);
    }

    public functions.rfc.sap.document.sap_com.Z_Hello getZ_HELLO(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            functions.rfc.sap.document.sap_com.Z_HELLO_BindingStub _stub = new functions.rfc.sap.document.sap_com.Z_HELLO_BindingStub(portAddress, this);
            _stub.setPortName(getZ_HELLOWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setZ_HELLOEndpointAddress(java.lang.String address) {
        Z_HELLO_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (functions.rfc.sap.document.sap_com.Z_Hello.class.isAssignableFrom(serviceEndpointInterface)) {
                functions.rfc.sap.document.sap_com.Z_HELLO_BindingStub _stub = new functions.rfc.sap.document.sap_com.Z_HELLO_BindingStub(new java.net.URL(Z_HELLO_address), this);
                _stub.setPortName(getZ_HELLOWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Z_HELLO".equals(inputPortName)) {
            return getZ_HELLO();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "Z_HELLO");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "Z_HELLO"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Z_HELLO".equals(portName)) {
            setZ_HELLOEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
