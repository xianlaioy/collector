/**
 * NetworkingSelfIPPortLockdownLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingSelfIPPortLockdownLocator extends org.apache.axis.client.Service implements iControl.NetworkingSelfIPPortLockdown {

/**
 * The SelfIPPortLockdown interface enables you to lock down protocols
 * and ports on self IP addresses.
 */

    public NetworkingSelfIPPortLockdownLocator() {
    }


    public NetworkingSelfIPPortLockdownLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkingSelfIPPortLockdownLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkingSelfIPPortLockdownPort
    private java.lang.String NetworkingSelfIPPortLockdownPort_address = "https://url_to_service";

    public java.lang.String getNetworkingSelfIPPortLockdownPortAddress() {
        return NetworkingSelfIPPortLockdownPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkingSelfIPPortLockdownPortWSDDServiceName = "Networking.SelfIPPortLockdownPort";

    public java.lang.String getNetworkingSelfIPPortLockdownPortWSDDServiceName() {
        return NetworkingSelfIPPortLockdownPortWSDDServiceName;
    }

    public void setNetworkingSelfIPPortLockdownPortWSDDServiceName(java.lang.String name) {
        NetworkingSelfIPPortLockdownPortWSDDServiceName = name;
    }

    public iControl.NetworkingSelfIPPortLockdownPortType getNetworkingSelfIPPortLockdownPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkingSelfIPPortLockdownPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkingSelfIPPortLockdownPort(endpoint);
    }

    public iControl.NetworkingSelfIPPortLockdownPortType getNetworkingSelfIPPortLockdownPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.NetworkingSelfIPPortLockdownBindingStub _stub = new iControl.NetworkingSelfIPPortLockdownBindingStub(portAddress, this);
            _stub.setPortName(getNetworkingSelfIPPortLockdownPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkingSelfIPPortLockdownPortEndpointAddress(java.lang.String address) {
        NetworkingSelfIPPortLockdownPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.NetworkingSelfIPPortLockdownPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.NetworkingSelfIPPortLockdownBindingStub _stub = new iControl.NetworkingSelfIPPortLockdownBindingStub(new java.net.URL(NetworkingSelfIPPortLockdownPort_address), this);
                _stub.setPortName(getNetworkingSelfIPPortLockdownPortWSDDServiceName());
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
        if ("Networking.SelfIPPortLockdownPort".equals(inputPortName)) {
            return getNetworkingSelfIPPortLockdownPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Networking.SelfIPPortLockdown");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Networking.SelfIPPortLockdownPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetworkingSelfIPPortLockdownPort".equals(portName)) {
            setNetworkingSelfIPPortLockdownPortEndpointAddress(address);
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
