/**
 * NetworkingRouteTableLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingRouteTableLocator extends org.apache.axis.client.Service implements iControl.NetworkingRouteTable {

/**
 * The RouteTable interface enables you to work with the Route table
 * and entries.
 */

    public NetworkingRouteTableLocator() {
    }


    public NetworkingRouteTableLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkingRouteTableLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkingRouteTablePort
    private java.lang.String NetworkingRouteTablePort_address = "https://url_to_service";

    public java.lang.String getNetworkingRouteTablePortAddress() {
        return NetworkingRouteTablePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkingRouteTablePortWSDDServiceName = "Networking.RouteTablePort";

    public java.lang.String getNetworkingRouteTablePortWSDDServiceName() {
        return NetworkingRouteTablePortWSDDServiceName;
    }

    public void setNetworkingRouteTablePortWSDDServiceName(java.lang.String name) {
        NetworkingRouteTablePortWSDDServiceName = name;
    }

    public iControl.NetworkingRouteTablePortType getNetworkingRouteTablePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkingRouteTablePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkingRouteTablePort(endpoint);
    }

    public iControl.NetworkingRouteTablePortType getNetworkingRouteTablePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.NetworkingRouteTableBindingStub _stub = new iControl.NetworkingRouteTableBindingStub(portAddress, this);
            _stub.setPortName(getNetworkingRouteTablePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkingRouteTablePortEndpointAddress(java.lang.String address) {
        NetworkingRouteTablePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.NetworkingRouteTablePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.NetworkingRouteTableBindingStub _stub = new iControl.NetworkingRouteTableBindingStub(new java.net.URL(NetworkingRouteTablePort_address), this);
                _stub.setPortName(getNetworkingRouteTablePortWSDDServiceName());
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
        if ("Networking.RouteTablePort".equals(inputPortName)) {
            return getNetworkingRouteTablePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Networking.RouteTable");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Networking.RouteTablePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetworkingRouteTablePort".equals(portName)) {
            setNetworkingRouteTablePortEndpointAddress(address);
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