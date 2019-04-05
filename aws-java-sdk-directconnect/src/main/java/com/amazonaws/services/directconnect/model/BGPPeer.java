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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a BGP peer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/BGPPeer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BGPPeer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the BGP peer.
     * </p>
     */
    private String bgpPeerId;
    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * </p>
     */
    private Integer asn;
    /**
     * <p>
     * The authentication key for BGP configuration.
     * </p>
     */
    private String authKey;
    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     */
    private String addressFamily;
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
     * The state of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>verifying</code>: The BGP peering addresses or ASN require validation before the BGP peer can be created.
     * This state applies only to public virtual interfaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The BGP peer is created, and remains in this state until it is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The BGP peer is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The BGP peer is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The BGP peer is deleted and cannot be established.
     * </p>
     * </li>
     * </ul>
     */
    private String bgpPeerState;
    /**
     * <p>
     * The status of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>up</code>: The BGP peer is established. This state does not indicate the state of the routing function.
     * Ensure that you are receiving routes over the BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The BGP peer is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The BGP peer status is not available.
     * </p>
     * </li>
     * </ul>
     */
    private String bgpStatus;
    /**
     * <p>
     * The Direct Connect endpoint on which the BGP peer terminates.
     * </p>
     */
    private String awsDeviceV2;

    /**
     * <p>
     * The ID of the BGP peer.
     * </p>
     * 
     * @param bgpPeerId
     *        The ID of the BGP peer.
     */

    public void setBgpPeerId(String bgpPeerId) {
        this.bgpPeerId = bgpPeerId;
    }

    /**
     * <p>
     * The ID of the BGP peer.
     * </p>
     * 
     * @return The ID of the BGP peer.
     */

    public String getBgpPeerId() {
        return this.bgpPeerId;
    }

    /**
     * <p>
     * The ID of the BGP peer.
     * </p>
     * 
     * @param bgpPeerId
     *        The ID of the BGP peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BGPPeer withBgpPeerId(String bgpPeerId) {
        setBgpPeerId(bgpPeerId);
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

    public BGPPeer withAsn(Integer asn) {
        setAsn(asn);
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

    public BGPPeer withAuthKey(String authKey) {
        setAuthKey(authKey);
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

    public BGPPeer withAddressFamily(String addressFamily) {
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

    public BGPPeer withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
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

    public BGPPeer withAmazonAddress(String amazonAddress) {
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

    public BGPPeer withCustomerAddress(String customerAddress) {
        setCustomerAddress(customerAddress);
        return this;
    }

    /**
     * <p>
     * The state of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>verifying</code>: The BGP peering addresses or ASN require validation before the BGP peer can be created.
     * This state applies only to public virtual interfaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The BGP peer is created, and remains in this state until it is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The BGP peer is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The BGP peer is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The BGP peer is deleted and cannot be established.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bgpPeerState
     *        The state of the BGP peer. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>verifying</code>: The BGP peering addresses or ASN require validation before the BGP peer can be
     *        created. This state applies only to public virtual interfaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The BGP peer is created, and remains in this state until it is ready to be
     *        established.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The BGP peer is ready to be established.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The BGP peer is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The BGP peer is deleted and cannot be established.
     *        </p>
     *        </li>
     * @see BGPPeerState
     */

    public void setBgpPeerState(String bgpPeerState) {
        this.bgpPeerState = bgpPeerState;
    }

    /**
     * <p>
     * The state of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>verifying</code>: The BGP peering addresses or ASN require validation before the BGP peer can be created.
     * This state applies only to public virtual interfaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The BGP peer is created, and remains in this state until it is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The BGP peer is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The BGP peer is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The BGP peer is deleted and cannot be established.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the BGP peer. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>verifying</code>: The BGP peering addresses or ASN require validation before the BGP peer can be
     *         created. This state applies only to public virtual interfaces.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: The BGP peer is created, and remains in this state until it is ready to be
     *         established.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: The BGP peer is ready to be established.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: The BGP peer is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The BGP peer is deleted and cannot be established.
     *         </p>
     *         </li>
     * @see BGPPeerState
     */

    public String getBgpPeerState() {
        return this.bgpPeerState;
    }

    /**
     * <p>
     * The state of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>verifying</code>: The BGP peering addresses or ASN require validation before the BGP peer can be created.
     * This state applies only to public virtual interfaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The BGP peer is created, and remains in this state until it is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The BGP peer is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The BGP peer is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The BGP peer is deleted and cannot be established.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bgpPeerState
     *        The state of the BGP peer. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>verifying</code>: The BGP peering addresses or ASN require validation before the BGP peer can be
     *        created. This state applies only to public virtual interfaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The BGP peer is created, and remains in this state until it is ready to be
     *        established.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The BGP peer is ready to be established.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The BGP peer is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The BGP peer is deleted and cannot be established.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BGPPeerState
     */

    public BGPPeer withBgpPeerState(String bgpPeerState) {
        setBgpPeerState(bgpPeerState);
        return this;
    }

    /**
     * <p>
     * The state of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>verifying</code>: The BGP peering addresses or ASN require validation before the BGP peer can be created.
     * This state applies only to public virtual interfaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The BGP peer is created, and remains in this state until it is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The BGP peer is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The BGP peer is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The BGP peer is deleted and cannot be established.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bgpPeerState
     *        The state of the BGP peer. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>verifying</code>: The BGP peering addresses or ASN require validation before the BGP peer can be
     *        created. This state applies only to public virtual interfaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The BGP peer is created, and remains in this state until it is ready to be
     *        established.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The BGP peer is ready to be established.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The BGP peer is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The BGP peer is deleted and cannot be established.
     *        </p>
     *        </li>
     * @see BGPPeerState
     */

    public void setBgpPeerState(BGPPeerState bgpPeerState) {
        withBgpPeerState(bgpPeerState);
    }

    /**
     * <p>
     * The state of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>verifying</code>: The BGP peering addresses or ASN require validation before the BGP peer can be created.
     * This state applies only to public virtual interfaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The BGP peer is created, and remains in this state until it is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The BGP peer is ready to be established.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The BGP peer is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The BGP peer is deleted and cannot be established.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bgpPeerState
     *        The state of the BGP peer. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>verifying</code>: The BGP peering addresses or ASN require validation before the BGP peer can be
     *        created. This state applies only to public virtual interfaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The BGP peer is created, and remains in this state until it is ready to be
     *        established.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The BGP peer is ready to be established.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The BGP peer is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The BGP peer is deleted and cannot be established.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BGPPeerState
     */

    public BGPPeer withBgpPeerState(BGPPeerState bgpPeerState) {
        this.bgpPeerState = bgpPeerState.toString();
        return this;
    }

    /**
     * <p>
     * The status of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>up</code>: The BGP peer is established. This state does not indicate the state of the routing function.
     * Ensure that you are receiving routes over the BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The BGP peer is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The BGP peer status is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bgpStatus
     *        The status of the BGP peer. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>up</code>: The BGP peer is established. This state does not indicate the state of the routing
     *        function. Ensure that you are receiving routes over the BGP session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The BGP peer is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The BGP peer status is not available.
     *        </p>
     *        </li>
     * @see BGPStatus
     */

    public void setBgpStatus(String bgpStatus) {
        this.bgpStatus = bgpStatus;
    }

    /**
     * <p>
     * The status of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>up</code>: The BGP peer is established. This state does not indicate the state of the routing function.
     * Ensure that you are receiving routes over the BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The BGP peer is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The BGP peer status is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the BGP peer. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>up</code>: The BGP peer is established. This state does not indicate the state of the routing
     *         function. Ensure that you are receiving routes over the BGP session.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>down</code>: The BGP peer is down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown</code>: The BGP peer status is not available.
     *         </p>
     *         </li>
     * @see BGPStatus
     */

    public String getBgpStatus() {
        return this.bgpStatus;
    }

    /**
     * <p>
     * The status of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>up</code>: The BGP peer is established. This state does not indicate the state of the routing function.
     * Ensure that you are receiving routes over the BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The BGP peer is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The BGP peer status is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bgpStatus
     *        The status of the BGP peer. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>up</code>: The BGP peer is established. This state does not indicate the state of the routing
     *        function. Ensure that you are receiving routes over the BGP session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The BGP peer is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The BGP peer status is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BGPStatus
     */

    public BGPPeer withBgpStatus(String bgpStatus) {
        setBgpStatus(bgpStatus);
        return this;
    }

    /**
     * <p>
     * The status of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>up</code>: The BGP peer is established. This state does not indicate the state of the routing function.
     * Ensure that you are receiving routes over the BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The BGP peer is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The BGP peer status is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bgpStatus
     *        The status of the BGP peer. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>up</code>: The BGP peer is established. This state does not indicate the state of the routing
     *        function. Ensure that you are receiving routes over the BGP session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The BGP peer is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The BGP peer status is not available.
     *        </p>
     *        </li>
     * @see BGPStatus
     */

    public void setBgpStatus(BGPStatus bgpStatus) {
        withBgpStatus(bgpStatus);
    }

    /**
     * <p>
     * The status of the BGP peer. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>up</code>: The BGP peer is established. This state does not indicate the state of the routing function.
     * Ensure that you are receiving routes over the BGP session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The BGP peer is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The BGP peer status is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bgpStatus
     *        The status of the BGP peer. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>up</code>: The BGP peer is established. This state does not indicate the state of the routing
     *        function. Ensure that you are receiving routes over the BGP session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The BGP peer is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The BGP peer status is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BGPStatus
     */

    public BGPPeer withBgpStatus(BGPStatus bgpStatus) {
        this.bgpStatus = bgpStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the BGP peer terminates.
     * </p>
     * 
     * @param awsDeviceV2
     *        The Direct Connect endpoint on which the BGP peer terminates.
     */

    public void setAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the BGP peer terminates.
     * </p>
     * 
     * @return The Direct Connect endpoint on which the BGP peer terminates.
     */

    public String getAwsDeviceV2() {
        return this.awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the BGP peer terminates.
     * </p>
     * 
     * @param awsDeviceV2
     *        The Direct Connect endpoint on which the BGP peer terminates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BGPPeer withAwsDeviceV2(String awsDeviceV2) {
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
        if (getBgpPeerId() != null)
            sb.append("BgpPeerId: ").append(getBgpPeerId()).append(",");
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn()).append(",");
        if (getAuthKey() != null)
            sb.append("AuthKey: ").append(getAuthKey()).append(",");
        if (getAddressFamily() != null)
            sb.append("AddressFamily: ").append(getAddressFamily()).append(",");
        if (getAmazonAddress() != null)
            sb.append("AmazonAddress: ").append(getAmazonAddress()).append(",");
        if (getCustomerAddress() != null)
            sb.append("CustomerAddress: ").append(getCustomerAddress()).append(",");
        if (getBgpPeerState() != null)
            sb.append("BgpPeerState: ").append(getBgpPeerState()).append(",");
        if (getBgpStatus() != null)
            sb.append("BgpStatus: ").append(getBgpStatus()).append(",");
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

        if (obj instanceof BGPPeer == false)
            return false;
        BGPPeer other = (BGPPeer) obj;
        if (other.getBgpPeerId() == null ^ this.getBgpPeerId() == null)
            return false;
        if (other.getBgpPeerId() != null && other.getBgpPeerId().equals(this.getBgpPeerId()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getAuthKey() == null ^ this.getAuthKey() == null)
            return false;
        if (other.getAuthKey() != null && other.getAuthKey().equals(this.getAuthKey()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getAmazonAddress() == null ^ this.getAmazonAddress() == null)
            return false;
        if (other.getAmazonAddress() != null && other.getAmazonAddress().equals(this.getAmazonAddress()) == false)
            return false;
        if (other.getCustomerAddress() == null ^ this.getCustomerAddress() == null)
            return false;
        if (other.getCustomerAddress() != null && other.getCustomerAddress().equals(this.getCustomerAddress()) == false)
            return false;
        if (other.getBgpPeerState() == null ^ this.getBgpPeerState() == null)
            return false;
        if (other.getBgpPeerState() != null && other.getBgpPeerState().equals(this.getBgpPeerState()) == false)
            return false;
        if (other.getBgpStatus() == null ^ this.getBgpStatus() == null)
            return false;
        if (other.getBgpStatus() != null && other.getBgpStatus().equals(this.getBgpStatus()) == false)
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

        hashCode = prime * hashCode + ((getBgpPeerId() == null) ? 0 : getBgpPeerId().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getAuthKey() == null) ? 0 : getAuthKey().hashCode());
        hashCode = prime * hashCode + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode + ((getAmazonAddress() == null) ? 0 : getAmazonAddress().hashCode());
        hashCode = prime * hashCode + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        hashCode = prime * hashCode + ((getBgpPeerState() == null) ? 0 : getBgpPeerState().hashCode());
        hashCode = prime * hashCode + ((getBgpStatus() == null) ? 0 : getBgpStatus().hashCode());
        hashCode = prime * hashCode + ((getAwsDeviceV2() == null) ? 0 : getAwsDeviceV2().hashCode());
        return hashCode;
    }

    @Override
    public BGPPeer clone() {
        try {
            return (BGPPeer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.BGPPeerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
