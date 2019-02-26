/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a virtual interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateVirtualInterfaceAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVirtualInterfaceAttributesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the AWS account that owns the virtual interface.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     */
    private String virtualInterfaceId;
    /**
     * <p>
     * The location of the connection.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The type of virtual interface. The possible values are <code>private</code> and <code>public</code>.
     * </p>
     */
    private String virtualInterfaceType;
    /**
     * <p>
     * The name of the virtual interface assigned by the customer network.
     * </p>
     */
    private String virtualInterfaceName;
    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     */
    private Integer vlan;
    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * </p>
     */
    private Integer asn;
    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     */
    private Long amazonSideAsn;
    /**
     * <p>
     * The authentication key for BGP configuration.
     * </p>
     */
    private String authKey;
    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     */
    private String amazonAddress;
    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     */
    private String customerAddress;
    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     */
    private String addressFamily;
    /**
     * <p>
     * The state of the virtual interface. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual interface
     * owner. If the owner of the virtual interface is different from the owner of the connection on which it is
     * provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual interface needs
     * validation before the virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time that it is created until the virtual
     * interface is ready to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately after calling
     * <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a virtual
     * interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the virtual interface
     * enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not available.
     * </p>
     * </li>
     * </ul>
     */
    private String virtualInterfaceState;
    /**
     * <p>
     * The customer router configuration.
     * </p>
     */
    private String customerRouterConfig;
    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
     * </p>
     */
    private Integer mtu;
    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     */
    private Boolean jumboFrameCapable;
    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual interfaces.
     * </p>
     */
    private String virtualGatewayId;
    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;
    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> routeFilterPrefixes;
    /**
     * <p>
     * The BGP peers configured on this virtual interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BGPPeer> bgpPeers;
    /**
     * <p>
     * The AWS Region where the virtual interface is located.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The Direct Connect endpoint on which the virtual interface terminates.
     * </p>
     */
    private String awsDeviceV2;

    /**
     * <p>
     * The ID of the AWS account that owns the virtual interface.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the AWS account that owns the virtual interface.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual interface.
     * </p>
     * 
     * @return The ID of the AWS account that owns the virtual interface.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual interface.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the AWS account that owns the virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface.
     */

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * 
     * @return The ID of the virtual interface.
     */

    public String getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withVirtualInterfaceId(String virtualInterfaceId) {
        setVirtualInterfaceId(virtualInterfaceId);
        return this;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     * 
     * @param location
     *        The location of the connection.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     * 
     * @return The location of the connection.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the connection.
     * </p>
     * 
     * @param location
     *        The location of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @return The ID of the connection.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The type of virtual interface. The possible values are <code>private</code> and <code>public</code>.
     * </p>
     * 
     * @param virtualInterfaceType
     *        The type of virtual interface. The possible values are <code>private</code> and <code>public</code>.
     */

    public void setVirtualInterfaceType(String virtualInterfaceType) {
        this.virtualInterfaceType = virtualInterfaceType;
    }

    /**
     * <p>
     * The type of virtual interface. The possible values are <code>private</code> and <code>public</code>.
     * </p>
     * 
     * @return The type of virtual interface. The possible values are <code>private</code> and <code>public</code>.
     */

    public String getVirtualInterfaceType() {
        return this.virtualInterfaceType;
    }

    /**
     * <p>
     * The type of virtual interface. The possible values are <code>private</code> and <code>public</code>.
     * </p>
     * 
     * @param virtualInterfaceType
     *        The type of virtual interface. The possible values are <code>private</code> and <code>public</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withVirtualInterfaceType(String virtualInterfaceType) {
        setVirtualInterfaceType(virtualInterfaceType);
        return this;
    }

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network.
     * </p>
     * 
     * @param virtualInterfaceName
     *        The name of the virtual interface assigned by the customer network.
     */

    public void setVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
    }

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network.
     * </p>
     * 
     * @return The name of the virtual interface assigned by the customer network.
     */

    public String getVirtualInterfaceName() {
        return this.virtualInterfaceName;
    }

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network.
     * </p>
     * 
     * @param virtualInterfaceName
     *        The name of the virtual interface assigned by the customer network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withVirtualInterfaceName(String virtualInterfaceName) {
        setVirtualInterfaceName(virtualInterfaceName);
        return this;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @param vlan
     *        The ID of the VLAN.
     */

    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @return The ID of the VLAN.
     */

    public Integer getVlan() {
        return this.vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @param vlan
     *        The ID of the VLAN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withVlan(Integer vlan) {
        setVlan(vlan);
        return this;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * </p>
     * 
     * @param asn
     *        The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     */

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * </p>
     * 
     * @return The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     */

    public Integer getAsn() {
        return this.asn;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * </p>
     * 
     * @param asn
     *        The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withAsn(Integer asn) {
        setAsn(asn);
        return this;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     * 
     * @param amazonSideAsn
     *        The autonomous system number (ASN) for the Amazon side of the connection.
     */

    public void setAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     * 
     * @return The autonomous system number (ASN) for the Amazon side of the connection.
     */

    public Long getAmazonSideAsn() {
        return this.amazonSideAsn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     * 
     * @param amazonSideAsn
     *        The autonomous system number (ASN) for the Amazon side of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withAmazonSideAsn(Long amazonSideAsn) {
        setAmazonSideAsn(amazonSideAsn);
        return this;
    }

    /**
     * <p>
     * The authentication key for BGP configuration.
     * </p>
     * 
     * @param authKey
     *        The authentication key for BGP configuration.
     */

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    /**
     * <p>
     * The authentication key for BGP configuration.
     * </p>
     * 
     * @return The authentication key for BGP configuration.
     */

    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * <p>
     * The authentication key for BGP configuration.
     * </p>
     * 
     * @param authKey
     *        The authentication key for BGP configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withAuthKey(String authKey) {
        setAuthKey(authKey);
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     * 
     * @param amazonAddress
     *        The IP address assigned to the Amazon interface.
     */

    public void setAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     * 
     * @return The IP address assigned to the Amazon interface.
     */

    public String getAmazonAddress() {
        return this.amazonAddress;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     * 
     * @param amazonAddress
     *        The IP address assigned to the Amazon interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withAmazonAddress(String amazonAddress) {
        setAmazonAddress(amazonAddress);
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     * 
     * @param customerAddress
     *        The IP address assigned to the customer interface.
     */

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     * 
     * @return The IP address assigned to the customer interface.
     */

    public String getCustomerAddress() {
        return this.customerAddress;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     * 
     * @param customerAddress
     *        The IP address assigned to the customer interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withCustomerAddress(String customerAddress) {
        setCustomerAddress(customerAddress);
        return this;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @param addressFamily
     *        The address family for the BGP peer.
     * @see AddressFamily
     */

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @return The address family for the BGP peer.
     * @see AddressFamily
     */

    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @param addressFamily
     *        The address family for the BGP peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public UpdateVirtualInterfaceAttributesResult withAddressFamily(String addressFamily) {
        setAddressFamily(addressFamily);
        return this;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @param addressFamily
     *        The address family for the BGP peer.
     * @see AddressFamily
     */

    public void setAddressFamily(AddressFamily addressFamily) {
        withAddressFamily(addressFamily);
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @param addressFamily
     *        The address family for the BGP peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public UpdateVirtualInterfaceAttributesResult withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
        return this;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual interface
     * owner. If the owner of the virtual interface is different from the owner of the connection on which it is
     * provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual interface needs
     * validation before the virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time that it is created until the virtual
     * interface is ready to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately after calling
     * <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a virtual
     * interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the virtual interface
     * enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param virtualInterfaceState
     *        The state of the virtual interface. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual
     *        interface owner. If the owner of the virtual interface is different from the owner of the connection on
     *        which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the
     *        virtual interface owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual
     *        interface needs validation before the virtual interface can be created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: A virtual interface is in this state from the time that it is created until the
     *        virtual interface is ready to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: A virtual interface that is able to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: A virtual interface that is BGP down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: A virtual interface is in this state immediately after calling
     *        <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: A virtual interface that cannot forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a
     *        virtual interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the
     *        virtual interface enters the <code>Rejected</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the virtual interface is not available.
     *        </p>
     *        </li>
     * @see VirtualInterfaceState
     */

    public void setVirtualInterfaceState(String virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual interface
     * owner. If the owner of the virtual interface is different from the owner of the connection on which it is
     * provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual interface needs
     * validation before the virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time that it is created until the virtual
     * interface is ready to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately after calling
     * <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a virtual
     * interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the virtual interface
     * enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the virtual interface. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual
     *         interface owner. If the owner of the virtual interface is different from the owner of the connection on
     *         which it is provisioned, then the virtual interface will remain in this state until it is confirmed by
     *         the virtual interface owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual
     *         interface needs validation before the virtual interface can be created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: A virtual interface is in this state from the time that it is created until the
     *         virtual interface is ready to forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: A virtual interface that is able to forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>down</code>: A virtual interface that is BGP down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: A virtual interface is in this state immediately after calling
     *         <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: A virtual interface that cannot forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a
     *         virtual interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the
     *         virtual interface enters the <code>Rejected</code> state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown</code>: The state of the virtual interface is not available.
     *         </p>
     *         </li>
     * @see VirtualInterfaceState
     */

    public String getVirtualInterfaceState() {
        return this.virtualInterfaceState;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual interface
     * owner. If the owner of the virtual interface is different from the owner of the connection on which it is
     * provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual interface needs
     * validation before the virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time that it is created until the virtual
     * interface is ready to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately after calling
     * <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a virtual
     * interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the virtual interface
     * enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param virtualInterfaceState
     *        The state of the virtual interface. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual
     *        interface owner. If the owner of the virtual interface is different from the owner of the connection on
     *        which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the
     *        virtual interface owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual
     *        interface needs validation before the virtual interface can be created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: A virtual interface is in this state from the time that it is created until the
     *        virtual interface is ready to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: A virtual interface that is able to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: A virtual interface that is BGP down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: A virtual interface is in this state immediately after calling
     *        <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: A virtual interface that cannot forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a
     *        virtual interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the
     *        virtual interface enters the <code>Rejected</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the virtual interface is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualInterfaceState
     */

    public UpdateVirtualInterfaceAttributesResult withVirtualInterfaceState(String virtualInterfaceState) {
        setVirtualInterfaceState(virtualInterfaceState);
        return this;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual interface
     * owner. If the owner of the virtual interface is different from the owner of the connection on which it is
     * provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual interface needs
     * validation before the virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time that it is created until the virtual
     * interface is ready to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately after calling
     * <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a virtual
     * interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the virtual interface
     * enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param virtualInterfaceState
     *        The state of the virtual interface. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual
     *        interface owner. If the owner of the virtual interface is different from the owner of the connection on
     *        which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the
     *        virtual interface owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual
     *        interface needs validation before the virtual interface can be created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: A virtual interface is in this state from the time that it is created until the
     *        virtual interface is ready to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: A virtual interface that is able to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: A virtual interface that is BGP down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: A virtual interface is in this state immediately after calling
     *        <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: A virtual interface that cannot forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a
     *        virtual interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the
     *        virtual interface enters the <code>Rejected</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the virtual interface is not available.
     *        </p>
     *        </li>
     * @see VirtualInterfaceState
     */

    public void setVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        withVirtualInterfaceState(virtualInterfaceState);
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual interface
     * owner. If the owner of the virtual interface is different from the owner of the connection on which it is
     * provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual interface needs
     * validation before the virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time that it is created until the virtual
     * interface is ready to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately after calling
     * <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a virtual
     * interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the virtual interface
     * enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param virtualInterfaceState
     *        The state of the virtual interface. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual
     *        interface owner. If the owner of the virtual interface is different from the owner of the connection on
     *        which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the
     *        virtual interface owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual
     *        interface needs validation before the virtual interface can be created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: A virtual interface is in this state from the time that it is created until the
     *        virtual interface is ready to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: A virtual interface that is able to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: A virtual interface that is BGP down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: A virtual interface is in this state immediately after calling
     *        <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: A virtual interface that cannot forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a
     *        virtual interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the
     *        virtual interface enters the <code>Rejected</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the virtual interface is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualInterfaceState
     */

    public UpdateVirtualInterfaceAttributesResult withVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState.toString();
        return this;
    }

    /**
     * <p>
     * The customer router configuration.
     * </p>
     * 
     * @param customerRouterConfig
     *        The customer router configuration.
     */

    public void setCustomerRouterConfig(String customerRouterConfig) {
        this.customerRouterConfig = customerRouterConfig;
    }

    /**
     * <p>
     * The customer router configuration.
     * </p>
     * 
     * @return The customer router configuration.
     */

    public String getCustomerRouterConfig() {
        return this.customerRouterConfig;
    }

    /**
     * <p>
     * The customer router configuration.
     * </p>
     * 
     * @param customerRouterConfig
     *        The customer router configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withCustomerRouterConfig(String customerRouterConfig) {
        setCustomerRouterConfig(customerRouterConfig);
        return this;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
     * </p>
     * 
     * @param mtu
     *        The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value
     *        is 1500.
     */

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
     * </p>
     * 
     * @return The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value
     *         is 1500.
     */

    public Integer getMtu() {
        return this.mtu;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
     * </p>
     * 
     * @param mtu
     *        The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value
     *        is 1500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withMtu(Integer mtu) {
        setMtu(mtu);
        return this;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     * 
     * @param jumboFrameCapable
     *        Indicates whether jumbo frames (9001 MTU) are supported.
     */

    public void setJumboFrameCapable(Boolean jumboFrameCapable) {
        this.jumboFrameCapable = jumboFrameCapable;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     * 
     * @return Indicates whether jumbo frames (9001 MTU) are supported.
     */

    public Boolean getJumboFrameCapable() {
        return this.jumboFrameCapable;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     * 
     * @param jumboFrameCapable
     *        Indicates whether jumbo frames (9001 MTU) are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withJumboFrameCapable(Boolean jumboFrameCapable) {
        setJumboFrameCapable(jumboFrameCapable);
        return this;
    }

    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     * 
     * @return Indicates whether jumbo frames (9001 MTU) are supported.
     */

    public Boolean isJumboFrameCapable() {
        return this.jumboFrameCapable;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual interfaces.
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway. Applies only to private virtual interfaces.
     */

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual interfaces.
     * </p>
     * 
     * @return The ID of the virtual private gateway. Applies only to private virtual interfaces.
     */

    public String getVirtualGatewayId() {
        return this.virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual interfaces.
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway. Applies only to private virtual interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withVirtualGatewayId(String virtualGatewayId) {
        setVirtualGatewayId(virtualGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway.
     */

    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @return The ID of the Direct Connect gateway.
     */

    public String getDirectConnectGatewayId() {
        return this.directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * </p>
     * 
     * @return The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     */

    public java.util.List<RouteFilterPrefix> getRouteFilterPrefixes() {
        if (routeFilterPrefixes == null) {
            routeFilterPrefixes = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>();
        }
        return routeFilterPrefixes;
    }

    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * </p>
     * 
     * @param routeFilterPrefixes
     *        The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     */

    public void setRouteFilterPrefixes(java.util.Collection<RouteFilterPrefix> routeFilterPrefixes) {
        if (routeFilterPrefixes == null) {
            this.routeFilterPrefixes = null;
            return;
        }

        this.routeFilterPrefixes = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(routeFilterPrefixes);
    }

    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteFilterPrefixes(java.util.Collection)} or {@link #withRouteFilterPrefixes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param routeFilterPrefixes
     *        The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withRouteFilterPrefixes(RouteFilterPrefix... routeFilterPrefixes) {
        if (this.routeFilterPrefixes == null) {
            setRouteFilterPrefixes(new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(routeFilterPrefixes.length));
        }
        for (RouteFilterPrefix ele : routeFilterPrefixes) {
            this.routeFilterPrefixes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * </p>
     * 
     * @param routeFilterPrefixes
     *        The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withRouteFilterPrefixes(java.util.Collection<RouteFilterPrefix> routeFilterPrefixes) {
        setRouteFilterPrefixes(routeFilterPrefixes);
        return this;
    }

    /**
     * <p>
     * The BGP peers configured on this virtual interface.
     * </p>
     * 
     * @return The BGP peers configured on this virtual interface.
     */

    public java.util.List<BGPPeer> getBgpPeers() {
        if (bgpPeers == null) {
            bgpPeers = new com.amazonaws.internal.SdkInternalList<BGPPeer>();
        }
        return bgpPeers;
    }

    /**
     * <p>
     * The BGP peers configured on this virtual interface.
     * </p>
     * 
     * @param bgpPeers
     *        The BGP peers configured on this virtual interface.
     */

    public void setBgpPeers(java.util.Collection<BGPPeer> bgpPeers) {
        if (bgpPeers == null) {
            this.bgpPeers = null;
            return;
        }

        this.bgpPeers = new com.amazonaws.internal.SdkInternalList<BGPPeer>(bgpPeers);
    }

    /**
     * <p>
     * The BGP peers configured on this virtual interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBgpPeers(java.util.Collection)} or {@link #withBgpPeers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param bgpPeers
     *        The BGP peers configured on this virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withBgpPeers(BGPPeer... bgpPeers) {
        if (this.bgpPeers == null) {
            setBgpPeers(new com.amazonaws.internal.SdkInternalList<BGPPeer>(bgpPeers.length));
        }
        for (BGPPeer ele : bgpPeers) {
            this.bgpPeers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The BGP peers configured on this virtual interface.
     * </p>
     * 
     * @param bgpPeers
     *        The BGP peers configured on this virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withBgpPeers(java.util.Collection<BGPPeer> bgpPeers) {
        setBgpPeers(bgpPeers);
        return this;
    }

    /**
     * <p>
     * The AWS Region where the virtual interface is located.
     * </p>
     * 
     * @param region
     *        The AWS Region where the virtual interface is located.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region where the virtual interface is located.
     * </p>
     * 
     * @return The AWS Region where the virtual interface is located.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region where the virtual interface is located.
     * </p>
     * 
     * @param region
     *        The AWS Region where the virtual interface is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the virtual interface terminates.
     * </p>
     * 
     * @param awsDeviceV2
     *        The Direct Connect endpoint on which the virtual interface terminates.
     */

    public void setAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the virtual interface terminates.
     * </p>
     * 
     * @return The Direct Connect endpoint on which the virtual interface terminates.
     */

    public String getAwsDeviceV2() {
        return this.awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the virtual interface terminates.
     * </p>
     * 
     * @param awsDeviceV2
     *        The Direct Connect endpoint on which the virtual interface terminates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesResult withAwsDeviceV2(String awsDeviceV2) {
        setAwsDeviceV2(awsDeviceV2);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getVirtualInterfaceId() != null)
            sb.append("VirtualInterfaceId: ").append(getVirtualInterfaceId()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getVirtualInterfaceType() != null)
            sb.append("VirtualInterfaceType: ").append(getVirtualInterfaceType()).append(",");
        if (getVirtualInterfaceName() != null)
            sb.append("VirtualInterfaceName: ").append(getVirtualInterfaceName()).append(",");
        if (getVlan() != null)
            sb.append("Vlan: ").append(getVlan()).append(",");
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn()).append(",");
        if (getAmazonSideAsn() != null)
            sb.append("AmazonSideAsn: ").append(getAmazonSideAsn()).append(",");
        if (getAuthKey() != null)
            sb.append("AuthKey: ").append(getAuthKey()).append(",");
        if (getAmazonAddress() != null)
            sb.append("AmazonAddress: ").append(getAmazonAddress()).append(",");
        if (getCustomerAddress() != null)
            sb.append("CustomerAddress: ").append(getCustomerAddress()).append(",");
        if (getAddressFamily() != null)
            sb.append("AddressFamily: ").append(getAddressFamily()).append(",");
        if (getVirtualInterfaceState() != null)
            sb.append("VirtualInterfaceState: ").append(getVirtualInterfaceState()).append(",");
        if (getCustomerRouterConfig() != null)
            sb.append("CustomerRouterConfig: ").append(getCustomerRouterConfig()).append(",");
        if (getMtu() != null)
            sb.append("Mtu: ").append(getMtu()).append(",");
        if (getJumboFrameCapable() != null)
            sb.append("JumboFrameCapable: ").append(getJumboFrameCapable()).append(",");
        if (getVirtualGatewayId() != null)
            sb.append("VirtualGatewayId: ").append(getVirtualGatewayId()).append(",");
        if (getDirectConnectGatewayId() != null)
            sb.append("DirectConnectGatewayId: ").append(getDirectConnectGatewayId()).append(",");
        if (getRouteFilterPrefixes() != null)
            sb.append("RouteFilterPrefixes: ").append(getRouteFilterPrefixes()).append(",");
        if (getBgpPeers() != null)
            sb.append("BgpPeers: ").append(getBgpPeers()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getAwsDeviceV2() != null)
            sb.append("AwsDeviceV2: ").append(getAwsDeviceV2());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVirtualInterfaceAttributesResult == false)
            return false;
        UpdateVirtualInterfaceAttributesResult other = (UpdateVirtualInterfaceAttributesResult) obj;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getVirtualInterfaceType() == null ^ this.getVirtualInterfaceType() == null)
            return false;
        if (other.getVirtualInterfaceType() != null && other.getVirtualInterfaceType().equals(this.getVirtualInterfaceType()) == false)
            return false;
        if (other.getVirtualInterfaceName() == null ^ this.getVirtualInterfaceName() == null)
            return false;
        if (other.getVirtualInterfaceName() != null && other.getVirtualInterfaceName().equals(this.getVirtualInterfaceName()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getAmazonSideAsn() == null ^ this.getAmazonSideAsn() == null)
            return false;
        if (other.getAmazonSideAsn() != null && other.getAmazonSideAsn().equals(this.getAmazonSideAsn()) == false)
            return false;
        if (other.getAuthKey() == null ^ this.getAuthKey() == null)
            return false;
        if (other.getAuthKey() != null && other.getAuthKey().equals(this.getAuthKey()) == false)
            return false;
        if (other.getAmazonAddress() == null ^ this.getAmazonAddress() == null)
            return false;
        if (other.getAmazonAddress() != null && other.getAmazonAddress().equals(this.getAmazonAddress()) == false)
            return false;
        if (other.getCustomerAddress() == null ^ this.getCustomerAddress() == null)
            return false;
        if (other.getCustomerAddress() != null && other.getCustomerAddress().equals(this.getCustomerAddress()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getVirtualInterfaceState() == null ^ this.getVirtualInterfaceState() == null)
            return false;
        if (other.getVirtualInterfaceState() != null && other.getVirtualInterfaceState().equals(this.getVirtualInterfaceState()) == false)
            return false;
        if (other.getCustomerRouterConfig() == null ^ this.getCustomerRouterConfig() == null)
            return false;
        if (other.getCustomerRouterConfig() != null && other.getCustomerRouterConfig().equals(this.getCustomerRouterConfig()) == false)
            return false;
        if (other.getMtu() == null ^ this.getMtu() == null)
            return false;
        if (other.getMtu() != null && other.getMtu().equals(this.getMtu()) == false)
            return false;
        if (other.getJumboFrameCapable() == null ^ this.getJumboFrameCapable() == null)
            return false;
        if (other.getJumboFrameCapable() != null && other.getJumboFrameCapable().equals(this.getJumboFrameCapable()) == false)
            return false;
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getRouteFilterPrefixes() == null ^ this.getRouteFilterPrefixes() == null)
            return false;
        if (other.getRouteFilterPrefixes() != null && other.getRouteFilterPrefixes().equals(this.getRouteFilterPrefixes()) == false)
            return false;
        if (other.getBgpPeers() == null ^ this.getBgpPeers() == null)
            return false;
        if (other.getBgpPeers() != null && other.getBgpPeers().equals(this.getBgpPeers()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAwsDeviceV2() == null ^ this.getAwsDeviceV2() == null)
            return false;
        if (other.getAwsDeviceV2() != null && other.getAwsDeviceV2().equals(this.getAwsDeviceV2()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceType() == null) ? 0 : getVirtualInterfaceType().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceName() == null) ? 0 : getVirtualInterfaceName().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getAmazonSideAsn() == null) ? 0 : getAmazonSideAsn().hashCode());
        hashCode = prime * hashCode + ((getAuthKey() == null) ? 0 : getAuthKey().hashCode());
        hashCode = prime * hashCode + ((getAmazonAddress() == null) ? 0 : getAmazonAddress().hashCode());
        hashCode = prime * hashCode + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        hashCode = prime * hashCode + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceState() == null) ? 0 : getVirtualInterfaceState().hashCode());
        hashCode = prime * hashCode + ((getCustomerRouterConfig() == null) ? 0 : getCustomerRouterConfig().hashCode());
        hashCode = prime * hashCode + ((getMtu() == null) ? 0 : getMtu().hashCode());
        hashCode = prime * hashCode + ((getJumboFrameCapable() == null) ? 0 : getJumboFrameCapable().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        hashCode = prime * hashCode + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId().hashCode());
        hashCode = prime * hashCode + ((getRouteFilterPrefixes() == null) ? 0 : getRouteFilterPrefixes().hashCode());
        hashCode = prime * hashCode + ((getBgpPeers() == null) ? 0 : getBgpPeers().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAwsDeviceV2() == null) ? 0 : getAwsDeviceV2().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVirtualInterfaceAttributesResult clone() {
        try {
            return (UpdateVirtualInterfaceAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
