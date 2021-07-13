/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about a link aggregation group (LAG).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/Lag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Lag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The individual bandwidth of the physical connections bundled by the LAG. The possible values are 1Gbps and
     * 10Gbps.
     * </p>
     */
    private String connectionsBandwidth;
    /**
     * <p>
     * The number of physical dedicated connections bundled by the LAG, up to a maximum of 10.
     * </p>
     */
    private Integer numberOfConnections;
    /**
     * <p>
     * The ID of the LAG.
     * </p>
     */
    private String lagId;
    /**
     * <p>
     * The ID of the account that owns the LAG.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The name of the LAG.
     * </p>
     */
    private String lagName;
    /**
     * <p>
     * The state of the LAG. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a LAG. The LAG stays in the requested state until the Letter of
     * Authorization (LOA) is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The LAG has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is established and the LAG is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The LAG is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The LAG is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the LAG is not available.
     * </p>
     * </li>
     * </ul>
     */
    private String lagState;
    /**
     * <p>
     * The location of the LAG.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The Region where the connection is located.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The minimum number of physical dedicated connections that must be operational for the LAG itself to be
     * operational.
     * </p>
     */
    private Integer minimumLinks;
    /**
     * <p>
     * The Direct Connect endpoint that hosts the LAG.
     * </p>
     */
    private String awsDevice;
    /**
     * <p>
     * The Direct Connect endpoint that hosts the LAG.
     * </p>
     */
    private String awsDeviceV2;
    /**
     * <p>
     * The Direct Connect endpoint that terminates a physical connection's BGP sessions.
     * </p>
     */
    private String awsLogicalDeviceId;
    /**
     * <p>
     * The connections bundled by the LAG.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Connection> connections;
    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     */
    private Boolean allowsHostedConnections;
    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     */
    private Boolean jumboFrameCapable;
    /**
     * <p>
     * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * </p>
     */
    private String hasLogicalRedundancy;
    /**
     * <p>
     * The tags associated with the LAG.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The name of the service provider associated with the LAG.
     * </p>
     */
    private String providerName;
    /**
     * <p>
     * Indicates whether the LAG supports MAC Security (MACsec).
     * </p>
     */
    private Boolean macSecCapable;
    /**
     * <p>
     * The LAG MAC Security (MACsec) encryption mode.
     * </p>
     * <p>
     * The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * </p>
     */
    private String encryptionMode;
    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the LAG.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MacSecKey> macSecKeys;

    /**
     * <p>
     * The individual bandwidth of the physical connections bundled by the LAG. The possible values are 1Gbps and
     * 10Gbps.
     * </p>
     * 
     * @param connectionsBandwidth
     *        The individual bandwidth of the physical connections bundled by the LAG. The possible values are 1Gbps and
     *        10Gbps.
     */

    public void setConnectionsBandwidth(String connectionsBandwidth) {
        this.connectionsBandwidth = connectionsBandwidth;
    }

    /**
     * <p>
     * The individual bandwidth of the physical connections bundled by the LAG. The possible values are 1Gbps and
     * 10Gbps.
     * </p>
     * 
     * @return The individual bandwidth of the physical connections bundled by the LAG. The possible values are 1Gbps
     *         and 10Gbps.
     */

    public String getConnectionsBandwidth() {
        return this.connectionsBandwidth;
    }

    /**
     * <p>
     * The individual bandwidth of the physical connections bundled by the LAG. The possible values are 1Gbps and
     * 10Gbps.
     * </p>
     * 
     * @param connectionsBandwidth
     *        The individual bandwidth of the physical connections bundled by the LAG. The possible values are 1Gbps and
     *        10Gbps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withConnectionsBandwidth(String connectionsBandwidth) {
        setConnectionsBandwidth(connectionsBandwidth);
        return this;
    }

    /**
     * <p>
     * The number of physical dedicated connections bundled by the LAG, up to a maximum of 10.
     * </p>
     * 
     * @param numberOfConnections
     *        The number of physical dedicated connections bundled by the LAG, up to a maximum of 10.
     */

    public void setNumberOfConnections(Integer numberOfConnections) {
        this.numberOfConnections = numberOfConnections;
    }

    /**
     * <p>
     * The number of physical dedicated connections bundled by the LAG, up to a maximum of 10.
     * </p>
     * 
     * @return The number of physical dedicated connections bundled by the LAG, up to a maximum of 10.
     */

    public Integer getNumberOfConnections() {
        return this.numberOfConnections;
    }

    /**
     * <p>
     * The number of physical dedicated connections bundled by the LAG, up to a maximum of 10.
     * </p>
     * 
     * @param numberOfConnections
     *        The number of physical dedicated connections bundled by the LAG, up to a maximum of 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withNumberOfConnections(Integer numberOfConnections) {
        setNumberOfConnections(numberOfConnections);
        return this;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * 
     * @param lagId
     *        The ID of the LAG.
     */

    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * 
     * @return The ID of the LAG.
     */

    public String getLagId() {
        return this.lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * 
     * @param lagId
     *        The ID of the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withLagId(String lagId) {
        setLagId(lagId);
        return this;
    }

    /**
     * <p>
     * The ID of the account that owns the LAG.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the account that owns the LAG.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the account that owns the LAG.
     * </p>
     * 
     * @return The ID of the account that owns the LAG.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The ID of the account that owns the LAG.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the account that owns the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     * 
     * @param lagName
     *        The name of the LAG.
     */

    public void setLagName(String lagName) {
        this.lagName = lagName;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     * 
     * @return The name of the LAG.
     */

    public String getLagName() {
        return this.lagName;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     * 
     * @param lagName
     *        The name of the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withLagName(String lagName) {
        setLagName(lagName);
        return this;
    }

    /**
     * <p>
     * The state of the LAG. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a LAG. The LAG stays in the requested state until the Letter of
     * Authorization (LOA) is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The LAG has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is established and the LAG is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The LAG is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The LAG is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the LAG is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lagState
     *        The state of the LAG. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of a LAG. The LAG stays in the requested state until the Letter
     *        of Authorization (LOA) is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The LAG has been approved and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is established and the LAG is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The LAG is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The LAG is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the LAG is not available.
     *        </p>
     *        </li>
     * @see LagState
     */

    public void setLagState(String lagState) {
        this.lagState = lagState;
    }

    /**
     * <p>
     * The state of the LAG. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a LAG. The LAG stays in the requested state until the Letter of
     * Authorization (LOA) is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The LAG has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is established and the LAG is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The LAG is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The LAG is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the LAG is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the LAG. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>requested</code>: The initial state of a LAG. The LAG stays in the requested state until the Letter
     *         of Authorization (LOA) is available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: The LAG has been approved and is being initialized.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: The network link is established and the LAG is ready for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>down</code>: The network link is down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: The LAG is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The LAG is deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown</code>: The state of the LAG is not available.
     *         </p>
     *         </li>
     * @see LagState
     */

    public String getLagState() {
        return this.lagState;
    }

    /**
     * <p>
     * The state of the LAG. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a LAG. The LAG stays in the requested state until the Letter of
     * Authorization (LOA) is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The LAG has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is established and the LAG is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The LAG is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The LAG is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the LAG is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lagState
     *        The state of the LAG. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of a LAG. The LAG stays in the requested state until the Letter
     *        of Authorization (LOA) is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The LAG has been approved and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is established and the LAG is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The LAG is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The LAG is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the LAG is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LagState
     */

    public Lag withLagState(String lagState) {
        setLagState(lagState);
        return this;
    }

    /**
     * <p>
     * The state of the LAG. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a LAG. The LAG stays in the requested state until the Letter of
     * Authorization (LOA) is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The LAG has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is established and the LAG is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The LAG is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The LAG is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the LAG is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lagState
     *        The state of the LAG. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of a LAG. The LAG stays in the requested state until the Letter
     *        of Authorization (LOA) is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The LAG has been approved and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is established and the LAG is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The LAG is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The LAG is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the LAG is not available.
     *        </p>
     *        </li>
     * @see LagState
     */

    public void setLagState(LagState lagState) {
        withLagState(lagState);
    }

    /**
     * <p>
     * The state of the LAG. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of a LAG. The LAG stays in the requested state until the Letter of
     * Authorization (LOA) is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The LAG has been approved and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is established and the LAG is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The LAG is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The LAG is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the LAG is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lagState
     *        The state of the LAG. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of a LAG. The LAG stays in the requested state until the Letter
     *        of Authorization (LOA) is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The LAG has been approved and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is established and the LAG is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The LAG is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The LAG is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the LAG is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LagState
     */

    public Lag withLagState(LagState lagState) {
        this.lagState = lagState.toString();
        return this;
    }

    /**
     * <p>
     * The location of the LAG.
     * </p>
     * 
     * @param location
     *        The location of the LAG.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the LAG.
     * </p>
     * 
     * @return The location of the LAG.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the LAG.
     * </p>
     * 
     * @param location
     *        The location of the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The Region where the connection is located.
     * </p>
     * 
     * @param region
     *        The Region where the connection is located.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Region where the connection is located.
     * </p>
     * 
     * @return The Region where the connection is located.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Region where the connection is located.
     * </p>
     * 
     * @param region
     *        The Region where the connection is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The minimum number of physical dedicated connections that must be operational for the LAG itself to be
     * operational.
     * </p>
     * 
     * @param minimumLinks
     *        The minimum number of physical dedicated connections that must be operational for the LAG itself to be
     *        operational.
     */

    public void setMinimumLinks(Integer minimumLinks) {
        this.minimumLinks = minimumLinks;
    }

    /**
     * <p>
     * The minimum number of physical dedicated connections that must be operational for the LAG itself to be
     * operational.
     * </p>
     * 
     * @return The minimum number of physical dedicated connections that must be operational for the LAG itself to be
     *         operational.
     */

    public Integer getMinimumLinks() {
        return this.minimumLinks;
    }

    /**
     * <p>
     * The minimum number of physical dedicated connections that must be operational for the LAG itself to be
     * operational.
     * </p>
     * 
     * @param minimumLinks
     *        The minimum number of physical dedicated connections that must be operational for the LAG itself to be
     *        operational.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withMinimumLinks(Integer minimumLinks) {
        setMinimumLinks(minimumLinks);
        return this;
    }

    /**
     * <p>
     * The Direct Connect endpoint that hosts the LAG.
     * </p>
     * 
     * @param awsDevice
     *        The Direct Connect endpoint that hosts the LAG.
     */

    public void setAwsDevice(String awsDevice) {
        this.awsDevice = awsDevice;
    }

    /**
     * <p>
     * The Direct Connect endpoint that hosts the LAG.
     * </p>
     * 
     * @return The Direct Connect endpoint that hosts the LAG.
     */

    public String getAwsDevice() {
        return this.awsDevice;
    }

    /**
     * <p>
     * The Direct Connect endpoint that hosts the LAG.
     * </p>
     * 
     * @param awsDevice
     *        The Direct Connect endpoint that hosts the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withAwsDevice(String awsDevice) {
        setAwsDevice(awsDevice);
        return this;
    }

    /**
     * <p>
     * The Direct Connect endpoint that hosts the LAG.
     * </p>
     * 
     * @param awsDeviceV2
     *        The Direct Connect endpoint that hosts the LAG.
     */

    public void setAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint that hosts the LAG.
     * </p>
     * 
     * @return The Direct Connect endpoint that hosts the LAG.
     */

    public String getAwsDeviceV2() {
        return this.awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint that hosts the LAG.
     * </p>
     * 
     * @param awsDeviceV2
     *        The Direct Connect endpoint that hosts the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withAwsDeviceV2(String awsDeviceV2) {
        setAwsDeviceV2(awsDeviceV2);
        return this;
    }

    /**
     * <p>
     * The Direct Connect endpoint that terminates a physical connection's BGP sessions.
     * </p>
     * 
     * @param awsLogicalDeviceId
     *        The Direct Connect endpoint that terminates a physical connection's BGP sessions.
     */

    public void setAwsLogicalDeviceId(String awsLogicalDeviceId) {
        this.awsLogicalDeviceId = awsLogicalDeviceId;
    }

    /**
     * <p>
     * The Direct Connect endpoint that terminates a physical connection's BGP sessions.
     * </p>
     * 
     * @return The Direct Connect endpoint that terminates a physical connection's BGP sessions.
     */

    public String getAwsLogicalDeviceId() {
        return this.awsLogicalDeviceId;
    }

    /**
     * <p>
     * The Direct Connect endpoint that terminates a physical connection's BGP sessions.
     * </p>
     * 
     * @param awsLogicalDeviceId
     *        The Direct Connect endpoint that terminates a physical connection's BGP sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withAwsLogicalDeviceId(String awsLogicalDeviceId) {
        setAwsLogicalDeviceId(awsLogicalDeviceId);
        return this;
    }

    /**
     * <p>
     * The connections bundled by the LAG.
     * </p>
     * 
     * @return The connections bundled by the LAG.
     */

    public java.util.List<Connection> getConnections() {
        if (connections == null) {
            connections = new com.amazonaws.internal.SdkInternalList<Connection>();
        }
        return connections;
    }

    /**
     * <p>
     * The connections bundled by the LAG.
     * </p>
     * 
     * @param connections
     *        The connections bundled by the LAG.
     */

    public void setConnections(java.util.Collection<Connection> connections) {
        if (connections == null) {
            this.connections = null;
            return;
        }

        this.connections = new com.amazonaws.internal.SdkInternalList<Connection>(connections);
    }

    /**
     * <p>
     * The connections bundled by the LAG.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnections(java.util.Collection)} or {@link #withConnections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param connections
     *        The connections bundled by the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withConnections(Connection... connections) {
        if (this.connections == null) {
            setConnections(new com.amazonaws.internal.SdkInternalList<Connection>(connections.length));
        }
        for (Connection ele : connections) {
            this.connections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The connections bundled by the LAG.
     * </p>
     * 
     * @param connections
     *        The connections bundled by the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withConnections(java.util.Collection<Connection> connections) {
        setConnections(connections);
        return this;
    }

    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     * 
     * @param allowsHostedConnections
     *        Indicates whether the LAG can host other connections.
     */

    public void setAllowsHostedConnections(Boolean allowsHostedConnections) {
        this.allowsHostedConnections = allowsHostedConnections;
    }

    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     * 
     * @return Indicates whether the LAG can host other connections.
     */

    public Boolean getAllowsHostedConnections() {
        return this.allowsHostedConnections;
    }

    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     * 
     * @param allowsHostedConnections
     *        Indicates whether the LAG can host other connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withAllowsHostedConnections(Boolean allowsHostedConnections) {
        setAllowsHostedConnections(allowsHostedConnections);
        return this;
    }

    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     * 
     * @return Indicates whether the LAG can host other connections.
     */

    public Boolean isAllowsHostedConnections() {
        return this.allowsHostedConnections;
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

    public Lag withJumboFrameCapable(Boolean jumboFrameCapable) {
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
     * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @param hasLogicalRedundancy
     *        Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * @see HasLogicalRedundancy
     */

    public void setHasLogicalRedundancy(String hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy;
    }

    /**
     * <p>
     * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @return Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * @see HasLogicalRedundancy
     */

    public String getHasLogicalRedundancy() {
        return this.hasLogicalRedundancy;
    }

    /**
     * <p>
     * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @param hasLogicalRedundancy
     *        Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HasLogicalRedundancy
     */

    public Lag withHasLogicalRedundancy(String hasLogicalRedundancy) {
        setHasLogicalRedundancy(hasLogicalRedundancy);
        return this;
    }

    /**
     * <p>
     * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @param hasLogicalRedundancy
     *        Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * @see HasLogicalRedundancy
     */

    public void setHasLogicalRedundancy(HasLogicalRedundancy hasLogicalRedundancy) {
        withHasLogicalRedundancy(hasLogicalRedundancy);
    }

    /**
     * <p>
     * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @param hasLogicalRedundancy
     *        Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HasLogicalRedundancy
     */

    public Lag withHasLogicalRedundancy(HasLogicalRedundancy hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy.toString();
        return this;
    }

    /**
     * <p>
     * The tags associated with the LAG.
     * </p>
     * 
     * @return The tags associated with the LAG.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags associated with the LAG.
     * </p>
     * 
     * @param tags
     *        The tags associated with the LAG.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags associated with the LAG.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with the LAG.
     * </p>
     * 
     * @param tags
     *        The tags associated with the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the service provider associated with the LAG.
     * </p>
     * 
     * @param providerName
     *        The name of the service provider associated with the LAG.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the LAG.
     * </p>
     * 
     * @return The name of the service provider associated with the LAG.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the LAG.
     * </p>
     * 
     * @param providerName
     *        The name of the service provider associated with the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the LAG supports MAC Security (MACsec).
     * </p>
     * 
     * @param macSecCapable
     *        Indicates whether the LAG supports MAC Security (MACsec).
     */

    public void setMacSecCapable(Boolean macSecCapable) {
        this.macSecCapable = macSecCapable;
    }

    /**
     * <p>
     * Indicates whether the LAG supports MAC Security (MACsec).
     * </p>
     * 
     * @return Indicates whether the LAG supports MAC Security (MACsec).
     */

    public Boolean getMacSecCapable() {
        return this.macSecCapable;
    }

    /**
     * <p>
     * Indicates whether the LAG supports MAC Security (MACsec).
     * </p>
     * 
     * @param macSecCapable
     *        Indicates whether the LAG supports MAC Security (MACsec).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withMacSecCapable(Boolean macSecCapable) {
        setMacSecCapable(macSecCapable);
        return this;
    }

    /**
     * <p>
     * Indicates whether the LAG supports MAC Security (MACsec).
     * </p>
     * 
     * @return Indicates whether the LAG supports MAC Security (MACsec).
     */

    public Boolean isMacSecCapable() {
        return this.macSecCapable;
    }

    /**
     * <p>
     * The LAG MAC Security (MACsec) encryption mode.
     * </p>
     * <p>
     * The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * </p>
     * 
     * @param encryptionMode
     *        The LAG MAC Security (MACsec) encryption mode.</p>
     *        <p>
     *        The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     */

    public void setEncryptionMode(String encryptionMode) {
        this.encryptionMode = encryptionMode;
    }

    /**
     * <p>
     * The LAG MAC Security (MACsec) encryption mode.
     * </p>
     * <p>
     * The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * </p>
     * 
     * @return The LAG MAC Security (MACsec) encryption mode.</p>
     *         <p>
     *         The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     */

    public String getEncryptionMode() {
        return this.encryptionMode;
    }

    /**
     * <p>
     * The LAG MAC Security (MACsec) encryption mode.
     * </p>
     * <p>
     * The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * </p>
     * 
     * @param encryptionMode
     *        The LAG MAC Security (MACsec) encryption mode.</p>
     *        <p>
     *        The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withEncryptionMode(String encryptionMode) {
        setEncryptionMode(encryptionMode);
        return this;
    }

    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the LAG.
     * </p>
     * 
     * @return The MAC Security (MACsec) security keys associated with the LAG.
     */

    public java.util.List<MacSecKey> getMacSecKeys() {
        if (macSecKeys == null) {
            macSecKeys = new com.amazonaws.internal.SdkInternalList<MacSecKey>();
        }
        return macSecKeys;
    }

    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the LAG.
     * </p>
     * 
     * @param macSecKeys
     *        The MAC Security (MACsec) security keys associated with the LAG.
     */

    public void setMacSecKeys(java.util.Collection<MacSecKey> macSecKeys) {
        if (macSecKeys == null) {
            this.macSecKeys = null;
            return;
        }

        this.macSecKeys = new com.amazonaws.internal.SdkInternalList<MacSecKey>(macSecKeys);
    }

    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the LAG.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMacSecKeys(java.util.Collection)} or {@link #withMacSecKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param macSecKeys
     *        The MAC Security (MACsec) security keys associated with the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withMacSecKeys(MacSecKey... macSecKeys) {
        if (this.macSecKeys == null) {
            setMacSecKeys(new com.amazonaws.internal.SdkInternalList<MacSecKey>(macSecKeys.length));
        }
        for (MacSecKey ele : macSecKeys) {
            this.macSecKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the LAG.
     * </p>
     * 
     * @param macSecKeys
     *        The MAC Security (MACsec) security keys associated with the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lag withMacSecKeys(java.util.Collection<MacSecKey> macSecKeys) {
        setMacSecKeys(macSecKeys);
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
        if (getConnectionsBandwidth() != null)
            sb.append("ConnectionsBandwidth: ").append(getConnectionsBandwidth()).append(",");
        if (getNumberOfConnections() != null)
            sb.append("NumberOfConnections: ").append(getNumberOfConnections()).append(",");
        if (getLagId() != null)
            sb.append("LagId: ").append(getLagId()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getLagName() != null)
            sb.append("LagName: ").append(getLagName()).append(",");
        if (getLagState() != null)
            sb.append("LagState: ").append(getLagState()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getMinimumLinks() != null)
            sb.append("MinimumLinks: ").append(getMinimumLinks()).append(",");
        if (getAwsDevice() != null)
            sb.append("AwsDevice: ").append(getAwsDevice()).append(",");
        if (getAwsDeviceV2() != null)
            sb.append("AwsDeviceV2: ").append(getAwsDeviceV2()).append(",");
        if (getAwsLogicalDeviceId() != null)
            sb.append("AwsLogicalDeviceId: ").append(getAwsLogicalDeviceId()).append(",");
        if (getConnections() != null)
            sb.append("Connections: ").append(getConnections()).append(",");
        if (getAllowsHostedConnections() != null)
            sb.append("AllowsHostedConnections: ").append(getAllowsHostedConnections()).append(",");
        if (getJumboFrameCapable() != null)
            sb.append("JumboFrameCapable: ").append(getJumboFrameCapable()).append(",");
        if (getHasLogicalRedundancy() != null)
            sb.append("HasLogicalRedundancy: ").append(getHasLogicalRedundancy()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName()).append(",");
        if (getMacSecCapable() != null)
            sb.append("MacSecCapable: ").append(getMacSecCapable()).append(",");
        if (getEncryptionMode() != null)
            sb.append("EncryptionMode: ").append(getEncryptionMode()).append(",");
        if (getMacSecKeys() != null)
            sb.append("MacSecKeys: ").append(getMacSecKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Lag == false)
            return false;
        Lag other = (Lag) obj;
        if (other.getConnectionsBandwidth() == null ^ this.getConnectionsBandwidth() == null)
            return false;
        if (other.getConnectionsBandwidth() != null && other.getConnectionsBandwidth().equals(this.getConnectionsBandwidth()) == false)
            return false;
        if (other.getNumberOfConnections() == null ^ this.getNumberOfConnections() == null)
            return false;
        if (other.getNumberOfConnections() != null && other.getNumberOfConnections().equals(this.getNumberOfConnections()) == false)
            return false;
        if (other.getLagId() == null ^ this.getLagId() == null)
            return false;
        if (other.getLagId() != null && other.getLagId().equals(this.getLagId()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getLagName() == null ^ this.getLagName() == null)
            return false;
        if (other.getLagName() != null && other.getLagName().equals(this.getLagName()) == false)
            return false;
        if (other.getLagState() == null ^ this.getLagState() == null)
            return false;
        if (other.getLagState() != null && other.getLagState().equals(this.getLagState()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getMinimumLinks() == null ^ this.getMinimumLinks() == null)
            return false;
        if (other.getMinimumLinks() != null && other.getMinimumLinks().equals(this.getMinimumLinks()) == false)
            return false;
        if (other.getAwsDevice() == null ^ this.getAwsDevice() == null)
            return false;
        if (other.getAwsDevice() != null && other.getAwsDevice().equals(this.getAwsDevice()) == false)
            return false;
        if (other.getAwsDeviceV2() == null ^ this.getAwsDeviceV2() == null)
            return false;
        if (other.getAwsDeviceV2() != null && other.getAwsDeviceV2().equals(this.getAwsDeviceV2()) == false)
            return false;
        if (other.getAwsLogicalDeviceId() == null ^ this.getAwsLogicalDeviceId() == null)
            return false;
        if (other.getAwsLogicalDeviceId() != null && other.getAwsLogicalDeviceId().equals(this.getAwsLogicalDeviceId()) == false)
            return false;
        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null && other.getConnections().equals(this.getConnections()) == false)
            return false;
        if (other.getAllowsHostedConnections() == null ^ this.getAllowsHostedConnections() == null)
            return false;
        if (other.getAllowsHostedConnections() != null && other.getAllowsHostedConnections().equals(this.getAllowsHostedConnections()) == false)
            return false;
        if (other.getJumboFrameCapable() == null ^ this.getJumboFrameCapable() == null)
            return false;
        if (other.getJumboFrameCapable() != null && other.getJumboFrameCapable().equals(this.getJumboFrameCapable()) == false)
            return false;
        if (other.getHasLogicalRedundancy() == null ^ this.getHasLogicalRedundancy() == null)
            return false;
        if (other.getHasLogicalRedundancy() != null && other.getHasLogicalRedundancy().equals(this.getHasLogicalRedundancy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getMacSecCapable() == null ^ this.getMacSecCapable() == null)
            return false;
        if (other.getMacSecCapable() != null && other.getMacSecCapable().equals(this.getMacSecCapable()) == false)
            return false;
        if (other.getEncryptionMode() == null ^ this.getEncryptionMode() == null)
            return false;
        if (other.getEncryptionMode() != null && other.getEncryptionMode().equals(this.getEncryptionMode()) == false)
            return false;
        if (other.getMacSecKeys() == null ^ this.getMacSecKeys() == null)
            return false;
        if (other.getMacSecKeys() != null && other.getMacSecKeys().equals(this.getMacSecKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionsBandwidth() == null) ? 0 : getConnectionsBandwidth().hashCode());
        hashCode = prime * hashCode + ((getNumberOfConnections() == null) ? 0 : getNumberOfConnections().hashCode());
        hashCode = prime * hashCode + ((getLagId() == null) ? 0 : getLagId().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getLagName() == null) ? 0 : getLagName().hashCode());
        hashCode = prime * hashCode + ((getLagState() == null) ? 0 : getLagState().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getMinimumLinks() == null) ? 0 : getMinimumLinks().hashCode());
        hashCode = prime * hashCode + ((getAwsDevice() == null) ? 0 : getAwsDevice().hashCode());
        hashCode = prime * hashCode + ((getAwsDeviceV2() == null) ? 0 : getAwsDeviceV2().hashCode());
        hashCode = prime * hashCode + ((getAwsLogicalDeviceId() == null) ? 0 : getAwsLogicalDeviceId().hashCode());
        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime * hashCode + ((getAllowsHostedConnections() == null) ? 0 : getAllowsHostedConnections().hashCode());
        hashCode = prime * hashCode + ((getJumboFrameCapable() == null) ? 0 : getJumboFrameCapable().hashCode());
        hashCode = prime * hashCode + ((getHasLogicalRedundancy() == null) ? 0 : getHasLogicalRedundancy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getMacSecCapable() == null) ? 0 : getMacSecCapable().hashCode());
        hashCode = prime * hashCode + ((getEncryptionMode() == null) ? 0 : getEncryptionMode().hashCode());
        hashCode = prime * hashCode + ((getMacSecKeys() == null) ? 0 : getMacSecKeys().hashCode());
        return hashCode;
    }

    @Override
    public Lag clone() {
        try {
            return (Lag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.LagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
