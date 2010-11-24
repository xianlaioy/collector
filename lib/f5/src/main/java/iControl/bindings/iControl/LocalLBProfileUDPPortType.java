/**
 * LocalLBProfileUDPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileUDPPortType extends java.rmi.Remote {

    /**
     * Creates the specified UDP profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all UDP profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified UDP profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the profiles.
     */
    public iControl.LocalLBProfileUDPProfileUDPStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, will allow UDP packets with no
     * payload (just the
     *  UDP header) to propagate through the system.
     */
    public iControl.LocalLBProfileEnabledState[] get_allow_no_payload_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, will load balance each UDP datagram
     * separately.
     */
    public iControl.LocalLBProfileEnabledState[] get_datagram_lb_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the idle timeout for the specified UDP profiles.
     */
    public iControl.LocalLBProfileULong[] get_idle_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the client-side IP TOS values for the specified UDP profiles.
     */
    public iControl.LocalLBProfileULong[] get_ip_tos_to_client(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the client-side link QoS values for the specified UDP
     * profiles.
     */
    public iControl.LocalLBProfileULong[] get_link_qos_to_client(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all UDP profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, disables checksum processing
     * (note: if the
     *  datagram is IPv6, the system always performs checksum processing).
     */
    public iControl.LocalLBProfileEnabledState[] get_no_checksum_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified profiles.
     */
    public iControl.LocalLBProfileUDPProfileUDPStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Determines whether the specified profiles are base/pre-configured
     * profiles, or user-defined profiles.
     */
    public boolean[] is_base_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, will allow UDP packets with no
     * payload (just the
     *  UDP header) to propagate through the system.
     */
    public void set_allow_no_payload_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, will load balance each UDP datagram
     * separately.
     */
    public void set_datagram_lb_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the idle timeout for the specified UDP profiles.
     */
    public void set_idle_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the client-side IP TOS values for the specified UDP profiles.
     */
    public void set_ip_tos_to_client(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] values) throws java.rmi.RemoteException;

    /**
     * Sets the client-side link QoS values for the specified UDP
     * profiles.
     */
    public void set_link_qos_to_client(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] values) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, disables checksum processing
     * (note: if the
     *  datagram is IPv6, the system always performs checksum processing).
     */
    public void set_no_checksum_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;
}
