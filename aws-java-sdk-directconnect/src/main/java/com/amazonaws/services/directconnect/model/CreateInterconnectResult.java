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
 * Information about an interconnect.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateInterconnect" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInterconnectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the interconnect.
     * </p>
     */
    private String interconnectId;
    /**
     * <p>
     * The name of the interconnect.
     * </p>
     */
    private String interconnectName;
    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested state until
     * the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     */
    private String interconnectState;
    /**
     * <p>
     * The AWS Region where the connection is located.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The location of the connection.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     */
    private String bandwidth;
    /**
     * <p>
     * The time of the most recent call to <a>DescribeLoa</a> for this connection.
     * </p>
     */
    private java.util.Date loaIssueTime;
    /**
     * <p>
     * The ID of the LAG.
     * </p>
     */
    private String lagId;
    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     */
    private String awsDevice;
    /**
     * <p>
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * </p>
     */
    private Boolean jumboFrameCapable;
    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     */
    private String awsDeviceV2;
    /**
     * <p>
     * Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
     * </p>
     */
    private String hasLogicalRedundancy;

    /**
     * <p>
     * The ID of the interconnect.
     * </p>
     * 
     * @param interconnectId
     *        The ID of the interconnect.
     */

    public void setInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
    }

    /**
     * <p>
     * The ID of the interconnect.
     * </p>
     * 
     * @return The ID of the interconnect.
     */

    public String getInterconnectId() {
        return this.interconnectId;
    }

    /**
     * <p>
     * The ID of the interconnect.
     * </p>
     * 
     * @param interconnectId
     *        The ID of the interconnect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectResult withInterconnectId(String interconnectId) {
        setInterconnectId(interconnectId);
        return this;
    }

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     * 
     * @param interconnectName
     *        The name of the interconnect.
     */

    public void setInterconnectName(String interconnectName) {
        this.interconnectName = interconnectName;
    }

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     * 
     * @return The name of the interconnect.
     */

    public String getInterconnectName() {
        return this.interconnectName;
    }

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     * 
     * @param interconnectName
     *        The name of the interconnect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectResult withInterconnectName(String interconnectName) {
        setInterconnectName(interconnectName);
        return this;
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested state until
     * the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interconnectState
     *        The state of the interconnect. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested
     *        state until the Letter of Authorization (LOA) is sent to the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The interconnect is approved, and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is up, and the interconnect is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The interconnect is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The interconnect is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the interconnect is not available.
     *        </p>
     *        </li>
     * @see InterconnectState
     */

    public void setInterconnectState(String interconnectState) {
        this.interconnectState = interconnectState;
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested state until
     * the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the interconnect. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested
     *         state until the Letter of Authorization (LOA) is sent to the customer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: The interconnect is approved, and is being initialized.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: The network link is up, and the interconnect is ready for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>down</code>: The network link is down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: The interconnect is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The interconnect is deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown</code>: The state of the interconnect is not available.
     *         </p>
     *         </li>
     * @see InterconnectState
     */

    public String getInterconnectState() {
        return this.interconnectState;
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested state until
     * the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interconnectState
     *        The state of the interconnect. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested
     *        state until the Letter of Authorization (LOA) is sent to the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The interconnect is approved, and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is up, and the interconnect is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The interconnect is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The interconnect is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the interconnect is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterconnectState
     */

    public CreateInterconnectResult withInterconnectState(String interconnectState) {
        setInterconnectState(interconnectState);
        return this;
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested state until
     * the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interconnectState
     *        The state of the interconnect. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested
     *        state until the Letter of Authorization (LOA) is sent to the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The interconnect is approved, and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is up, and the interconnect is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The interconnect is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The interconnect is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the interconnect is not available.
     *        </p>
     *        </li>
     * @see InterconnectState
     */

    public void setInterconnectState(InterconnectState interconnectState) {
        withInterconnectState(interconnectState);
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested state until
     * the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interconnectState
     *        The state of the interconnect. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested
     *        state until the Letter of Authorization (LOA) is sent to the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The interconnect is approved, and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is up, and the interconnect is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The interconnect is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The interconnect is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the interconnect is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterconnectState
     */

    public CreateInterconnectResult withInterconnectState(InterconnectState interconnectState) {
        this.interconnectState = interconnectState.toString();
        return this;
    }

    /**
     * <p>
     * The AWS Region where the connection is located.
     * </p>
     * 
     * @param region
     *        The AWS Region where the connection is located.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region where the connection is located.
     * </p>
     * 
     * @return The AWS Region where the connection is located.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region where the connection is located.
     * </p>
     * 
     * @param region
     *        The AWS Region where the connection is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectResult withRegion(String region) {
        setRegion(region);
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

    public CreateInterconnectResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     * 
     * @param bandwidth
     *        The bandwidth of the connection.
     */

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     * 
     * @return The bandwidth of the connection.
     */

    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * <p>
     * The bandwidth of the connection.
     * </p>
     * 
     * @param bandwidth
     *        The bandwidth of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectResult withBandwidth(String bandwidth) {
        setBandwidth(bandwidth);
        return this;
    }

    /**
     * <p>
     * The time of the most recent call to <a>DescribeLoa</a> for this connection.
     * </p>
     * 
     * @param loaIssueTime
     *        The time of the most recent call to <a>DescribeLoa</a> for this connection.
     */

    public void setLoaIssueTime(java.util.Date loaIssueTime) {
        this.loaIssueTime = loaIssueTime;
    }

    /**
     * <p>
     * The time of the most recent call to <a>DescribeLoa</a> for this connection.
     * </p>
     * 
     * @return The time of the most recent call to <a>DescribeLoa</a> for this connection.
     */

    public java.util.Date getLoaIssueTime() {
        return this.loaIssueTime;
    }

    /**
     * <p>
     * The time of the most recent call to <a>DescribeLoa</a> for this connection.
     * </p>
     * 
     * @param loaIssueTime
     *        The time of the most recent call to <a>DescribeLoa</a> for this connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectResult withLoaIssueTime(java.util.Date loaIssueTime) {
        setLoaIssueTime(loaIssueTime);
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

    public CreateInterconnectResult withLagId(String lagId) {
        setLagId(lagId);
        return this;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * 
     * @param awsDevice
     *        The Direct Connect endpoint on which the physical connection terminates.
     */

    public void setAwsDevice(String awsDevice) {
        this.awsDevice = awsDevice;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * 
     * @return The Direct Connect endpoint on which the physical connection terminates.
     */

    public String getAwsDevice() {
        return this.awsDevice;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * 
     * @param awsDevice
     *        The Direct Connect endpoint on which the physical connection terminates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectResult withAwsDevice(String awsDevice) {
        setAwsDevice(awsDevice);
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

    public CreateInterconnectResult withJumboFrameCapable(Boolean jumboFrameCapable) {
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
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * 
     * @param awsDeviceV2
     *        The Direct Connect endpoint on which the physical connection terminates.
     */

    public void setAwsDeviceV2(String awsDeviceV2) {
        this.awsDeviceV2 = awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * 
     * @return The Direct Connect endpoint on which the physical connection terminates.
     */

    public String getAwsDeviceV2() {
        return this.awsDeviceV2;
    }

    /**
     * <p>
     * The Direct Connect endpoint on which the physical connection terminates.
     * </p>
     * 
     * @param awsDeviceV2
     *        The Direct Connect endpoint on which the physical connection terminates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectResult withAwsDeviceV2(String awsDeviceV2) {
        setAwsDeviceV2(awsDeviceV2);
        return this;
    }

    /**
     * <p>
     * Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @param hasLogicalRedundancy
     *        Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
     * @see HasLogicalRedundancy
     */

    public void setHasLogicalRedundancy(String hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy;
    }

    /**
     * <p>
     * Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @return Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
     * @see HasLogicalRedundancy
     */

    public String getHasLogicalRedundancy() {
        return this.hasLogicalRedundancy;
    }

    /**
     * <p>
     * Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @param hasLogicalRedundancy
     *        Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HasLogicalRedundancy
     */

    public CreateInterconnectResult withHasLogicalRedundancy(String hasLogicalRedundancy) {
        setHasLogicalRedundancy(hasLogicalRedundancy);
        return this;
    }

    /**
     * <p>
     * Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @param hasLogicalRedundancy
     *        Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
     * @see HasLogicalRedundancy
     */

    public void setHasLogicalRedundancy(HasLogicalRedundancy hasLogicalRedundancy) {
        withHasLogicalRedundancy(hasLogicalRedundancy);
    }

    /**
     * <p>
     * Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
     * </p>
     * 
     * @param hasLogicalRedundancy
     *        Indicates whether the interconnect supports a secondary BGP in the same address family (IPv4/IPv6).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HasLogicalRedundancy
     */

    public CreateInterconnectResult withHasLogicalRedundancy(HasLogicalRedundancy hasLogicalRedundancy) {
        this.hasLogicalRedundancy = hasLogicalRedundancy.toString();
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
        if (getInterconnectId() != null)
            sb.append("InterconnectId: ").append(getInterconnectId()).append(",");
        if (getInterconnectName() != null)
            sb.append("InterconnectName: ").append(getInterconnectName()).append(",");
        if (getInterconnectState() != null)
            sb.append("InterconnectState: ").append(getInterconnectState()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getBandwidth() != null)
            sb.append("Bandwidth: ").append(getBandwidth()).append(",");
        if (getLoaIssueTime() != null)
            sb.append("LoaIssueTime: ").append(getLoaIssueTime()).append(",");
        if (getLagId() != null)
            sb.append("LagId: ").append(getLagId()).append(",");
        if (getAwsDevice() != null)
            sb.append("AwsDevice: ").append(getAwsDevice()).append(",");
        if (getJumboFrameCapable() != null)
            sb.append("JumboFrameCapable: ").append(getJumboFrameCapable()).append(",");
        if (getAwsDeviceV2() != null)
            sb.append("AwsDeviceV2: ").append(getAwsDeviceV2()).append(",");
        if (getHasLogicalRedundancy() != null)
            sb.append("HasLogicalRedundancy: ").append(getHasLogicalRedundancy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInterconnectResult == false)
            return false;
        CreateInterconnectResult other = (CreateInterconnectResult) obj;
        if (other.getInterconnectId() == null ^ this.getInterconnectId() == null)
            return false;
        if (other.getInterconnectId() != null && other.getInterconnectId().equals(this.getInterconnectId()) == false)
            return false;
        if (other.getInterconnectName() == null ^ this.getInterconnectName() == null)
            return false;
        if (other.getInterconnectName() != null && other.getInterconnectName().equals(this.getInterconnectName()) == false)
            return false;
        if (other.getInterconnectState() == null ^ this.getInterconnectState() == null)
            return false;
        if (other.getInterconnectState() != null && other.getInterconnectState().equals(this.getInterconnectState()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getLoaIssueTime() == null ^ this.getLoaIssueTime() == null)
            return false;
        if (other.getLoaIssueTime() != null && other.getLoaIssueTime().equals(this.getLoaIssueTime()) == false)
            return false;
        if (other.getLagId() == null ^ this.getLagId() == null)
            return false;
        if (other.getLagId() != null && other.getLagId().equals(this.getLagId()) == false)
            return false;
        if (other.getAwsDevice() == null ^ this.getAwsDevice() == null)
            return false;
        if (other.getAwsDevice() != null && other.getAwsDevice().equals(this.getAwsDevice()) == false)
            return false;
        if (other.getJumboFrameCapable() == null ^ this.getJumboFrameCapable() == null)
            return false;
        if (other.getJumboFrameCapable() != null && other.getJumboFrameCapable().equals(this.getJumboFrameCapable()) == false)
            return false;
        if (other.getAwsDeviceV2() == null ^ this.getAwsDeviceV2() == null)
            return false;
        if (other.getAwsDeviceV2() != null && other.getAwsDeviceV2().equals(this.getAwsDeviceV2()) == false)
            return false;
        if (other.getHasLogicalRedundancy() == null ^ this.getHasLogicalRedundancy() == null)
            return false;
        if (other.getHasLogicalRedundancy() != null && other.getHasLogicalRedundancy().equals(this.getHasLogicalRedundancy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterconnectId() == null) ? 0 : getInterconnectId().hashCode());
        hashCode = prime * hashCode + ((getInterconnectName() == null) ? 0 : getInterconnectName().hashCode());
        hashCode = prime * hashCode + ((getInterconnectState() == null) ? 0 : getInterconnectState().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode + ((getLoaIssueTime() == null) ? 0 : getLoaIssueTime().hashCode());
        hashCode = prime * hashCode + ((getLagId() == null) ? 0 : getLagId().hashCode());
        hashCode = prime * hashCode + ((getAwsDevice() == null) ? 0 : getAwsDevice().hashCode());
        hashCode = prime * hashCode + ((getJumboFrameCapable() == null) ? 0 : getJumboFrameCapable().hashCode());
        hashCode = prime * hashCode + ((getAwsDeviceV2() == null) ? 0 : getAwsDeviceV2().hashCode());
        hashCode = prime * hashCode + ((getHasLogicalRedundancy() == null) ? 0 : getHasLogicalRedundancy().hashCode());
        return hashCode;
    }

    @Override
    public CreateInterconnectResult clone() {
        try {
            return (CreateInterconnectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
