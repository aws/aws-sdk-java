/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing various properties of a managed node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InstanceProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the EC2 <code>Name</code> tag associated with the node. If a <code>Name</code> tag hasn't been
     * applied to the node, this value is blank.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the managed node.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The instance type of the managed node. For example, t3.large.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The instance profile attached to the node. If an instance profile isn't attached to the node, this value is
     * blank.
     * </p>
     */
    private String instanceRole;
    /**
     * <p>
     * The name of the key pair associated with the node. If a key pair isnt't associated with the node, this value is
     * blank.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * The current state of the node.
     * </p>
     */
    private String instanceState;
    /**
     * <p>
     * The CPU architecture of the node. For example, x86_64.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The public IPv4 address assigned to the node. If a public IPv4 address isn't assigned to the node, this value is
     * blank.
     * </p>
     */
    private String iPAddress;
    /**
     * <p>
     * The timestamp for when the node was launched.
     * </p>
     */
    private java.util.Date launchTime;
    /**
     * <p>
     * Connection status of the SSM Agent on the managed node.
     * </p>
     */
    private String pingStatus;
    /**
     * <p>
     * The date and time when the SSM Agent last pinged the Systems Manager service.
     * </p>
     */
    private java.util.Date lastPingDateTime;
    /**
     * <p>
     * The version of SSM Agent running on your managed node.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * The operating system platform type of the managed node. For example, Windows.
     * </p>
     */
    private String platformType;
    /**
     * <p>
     * The name of the operating system platform running on your managed node.
     * </p>
     */
    private String platformName;
    /**
     * <p>
     * The version of the OS platform running on your managed node.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * The activation ID created by Systems Manager when the server or virtual machine (VM) was registered
     * </p>
     */
    private String activationId;
    /**
     * <p>
     * The IAM role used in the hybrid activation to register the node with Systems Manager.
     * </p>
     */
    private String iamRole;
    /**
     * <p>
     * The date the node was registered with Systems Manager.
     * </p>
     */
    private java.util.Date registrationDate;
    /**
     * <p>
     * The type of managed node.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The fully qualified host name of the managed node.
     * </p>
     */
    private String computerName;
    /**
     * <p>
     * The status of the State Manager association applied to the managed node.
     * </p>
     */
    private String associationStatus;
    /**
     * <p>
     * The date the association was last run.
     * </p>
     */
    private java.util.Date lastAssociationExecutionDate;
    /**
     * <p>
     * The last date the association was successfully run.
     * </p>
     */
    private java.util.Date lastSuccessfulAssociationExecutionDate;

    private InstanceAggregatedAssociationOverview associationOverview;
    /**
     * <p>
     * The ID of the source resource.
     * </p>
     */
    private String sourceId;
    /**
     * <p>
     * The type of the source resource.
     * </p>
     */
    private String sourceType;

    /**
     * <p>
     * The value of the EC2 <code>Name</code> tag associated with the node. If a <code>Name</code> tag hasn't been
     * applied to the node, this value is blank.
     * </p>
     * 
     * @param name
     *        The value of the EC2 <code>Name</code> tag associated with the node. If a <code>Name</code> tag hasn't
     *        been applied to the node, this value is blank.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The value of the EC2 <code>Name</code> tag associated with the node. If a <code>Name</code> tag hasn't been
     * applied to the node, this value is blank.
     * </p>
     * 
     * @return The value of the EC2 <code>Name</code> tag associated with the node. If a <code>Name</code> tag hasn't
     *         been applied to the node, this value is blank.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The value of the EC2 <code>Name</code> tag associated with the node. If a <code>Name</code> tag hasn't been
     * applied to the node, this value is blank.
     * </p>
     * 
     * @param name
     *        The value of the EC2 <code>Name</code> tag associated with the node. If a <code>Name</code> tag hasn't
     *        been applied to the node, this value is blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the managed node.
     * </p>
     * 
     * @param instanceId
     *        The ID of the managed node.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the managed node.
     * </p>
     * 
     * @return The ID of the managed node.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the managed node.
     * </p>
     * 
     * @param instanceId
     *        The ID of the managed node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The instance type of the managed node. For example, t3.large.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the managed node. For example, t3.large.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the managed node. For example, t3.large.
     * </p>
     * 
     * @return The instance type of the managed node. For example, t3.large.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the managed node. For example, t3.large.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the managed node. For example, t3.large.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance profile attached to the node. If an instance profile isn't attached to the node, this value is
     * blank.
     * </p>
     * 
     * @param instanceRole
     *        The instance profile attached to the node. If an instance profile isn't attached to the node, this value
     *        is blank.
     */

    public void setInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
    }

    /**
     * <p>
     * The instance profile attached to the node. If an instance profile isn't attached to the node, this value is
     * blank.
     * </p>
     * 
     * @return The instance profile attached to the node. If an instance profile isn't attached to the node, this value
     *         is blank.
     */

    public String getInstanceRole() {
        return this.instanceRole;
    }

    /**
     * <p>
     * The instance profile attached to the node. If an instance profile isn't attached to the node, this value is
     * blank.
     * </p>
     * 
     * @param instanceRole
     *        The instance profile attached to the node. If an instance profile isn't attached to the node, this value
     *        is blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withInstanceRole(String instanceRole) {
        setInstanceRole(instanceRole);
        return this;
    }

    /**
     * <p>
     * The name of the key pair associated with the node. If a key pair isnt't associated with the node, this value is
     * blank.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair associated with the node. If a key pair isnt't associated with the node, this
     *        value is blank.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair associated with the node. If a key pair isnt't associated with the node, this value is
     * blank.
     * </p>
     * 
     * @return The name of the key pair associated with the node. If a key pair isnt't associated with the node, this
     *         value is blank.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key pair associated with the node. If a key pair isnt't associated with the node, this value is
     * blank.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair associated with the node. If a key pair isnt't associated with the node, this
     *        value is blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * The current state of the node.
     * </p>
     * 
     * @param instanceState
     *        The current state of the node.
     */

    public void setInstanceState(String instanceState) {
        this.instanceState = instanceState;
    }

    /**
     * <p>
     * The current state of the node.
     * </p>
     * 
     * @return The current state of the node.
     */

    public String getInstanceState() {
        return this.instanceState;
    }

    /**
     * <p>
     * The current state of the node.
     * </p>
     * 
     * @param instanceState
     *        The current state of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withInstanceState(String instanceState) {
        setInstanceState(instanceState);
        return this;
    }

    /**
     * <p>
     * The CPU architecture of the node. For example, x86_64.
     * </p>
     * 
     * @param architecture
     *        The CPU architecture of the node. For example, x86_64.
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The CPU architecture of the node. For example, x86_64.
     * </p>
     * 
     * @return The CPU architecture of the node. For example, x86_64.
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The CPU architecture of the node. For example, x86_64.
     * </p>
     * 
     * @param architecture
     *        The CPU architecture of the node. For example, x86_64.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The public IPv4 address assigned to the node. If a public IPv4 address isn't assigned to the node, this value is
     * blank.
     * </p>
     * 
     * @param iPAddress
     *        The public IPv4 address assigned to the node. If a public IPv4 address isn't assigned to the node, this
     *        value is blank.
     */

    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    /**
     * <p>
     * The public IPv4 address assigned to the node. If a public IPv4 address isn't assigned to the node, this value is
     * blank.
     * </p>
     * 
     * @return The public IPv4 address assigned to the node. If a public IPv4 address isn't assigned to the node, this
     *         value is blank.
     */

    public String getIPAddress() {
        return this.iPAddress;
    }

    /**
     * <p>
     * The public IPv4 address assigned to the node. If a public IPv4 address isn't assigned to the node, this value is
     * blank.
     * </p>
     * 
     * @param iPAddress
     *        The public IPv4 address assigned to the node. If a public IPv4 address isn't assigned to the node, this
     *        value is blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withIPAddress(String iPAddress) {
        setIPAddress(iPAddress);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the node was launched.
     * </p>
     * 
     * @param launchTime
     *        The timestamp for when the node was launched.
     */

    public void setLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * <p>
     * The timestamp for when the node was launched.
     * </p>
     * 
     * @return The timestamp for when the node was launched.
     */

    public java.util.Date getLaunchTime() {
        return this.launchTime;
    }

    /**
     * <p>
     * The timestamp for when the node was launched.
     * </p>
     * 
     * @param launchTime
     *        The timestamp for when the node was launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withLaunchTime(java.util.Date launchTime) {
        setLaunchTime(launchTime);
        return this;
    }

    /**
     * <p>
     * Connection status of the SSM Agent on the managed node.
     * </p>
     * 
     * @param pingStatus
     *        Connection status of the SSM Agent on the managed node.
     * @see PingStatus
     */

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    /**
     * <p>
     * Connection status of the SSM Agent on the managed node.
     * </p>
     * 
     * @return Connection status of the SSM Agent on the managed node.
     * @see PingStatus
     */

    public String getPingStatus() {
        return this.pingStatus;
    }

    /**
     * <p>
     * Connection status of the SSM Agent on the managed node.
     * </p>
     * 
     * @param pingStatus
     *        Connection status of the SSM Agent on the managed node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PingStatus
     */

    public InstanceProperty withPingStatus(String pingStatus) {
        setPingStatus(pingStatus);
        return this;
    }

    /**
     * <p>
     * Connection status of the SSM Agent on the managed node.
     * </p>
     * 
     * @param pingStatus
     *        Connection status of the SSM Agent on the managed node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PingStatus
     */

    public InstanceProperty withPingStatus(PingStatus pingStatus) {
        this.pingStatus = pingStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the SSM Agent last pinged the Systems Manager service.
     * </p>
     * 
     * @param lastPingDateTime
     *        The date and time when the SSM Agent last pinged the Systems Manager service.
     */

    public void setLastPingDateTime(java.util.Date lastPingDateTime) {
        this.lastPingDateTime = lastPingDateTime;
    }

    /**
     * <p>
     * The date and time when the SSM Agent last pinged the Systems Manager service.
     * </p>
     * 
     * @return The date and time when the SSM Agent last pinged the Systems Manager service.
     */

    public java.util.Date getLastPingDateTime() {
        return this.lastPingDateTime;
    }

    /**
     * <p>
     * The date and time when the SSM Agent last pinged the Systems Manager service.
     * </p>
     * 
     * @param lastPingDateTime
     *        The date and time when the SSM Agent last pinged the Systems Manager service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withLastPingDateTime(java.util.Date lastPingDateTime) {
        setLastPingDateTime(lastPingDateTime);
        return this;
    }

    /**
     * <p>
     * The version of SSM Agent running on your managed node.
     * </p>
     * 
     * @param agentVersion
     *        The version of SSM Agent running on your managed node.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The version of SSM Agent running on your managed node.
     * </p>
     * 
     * @return The version of SSM Agent running on your managed node.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The version of SSM Agent running on your managed node.
     * </p>
     * 
     * @param agentVersion
     *        The version of SSM Agent running on your managed node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * The operating system platform type of the managed node. For example, Windows.
     * </p>
     * 
     * @param platformType
     *        The operating system platform type of the managed node. For example, Windows.
     * @see PlatformType
     */

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    /**
     * <p>
     * The operating system platform type of the managed node. For example, Windows.
     * </p>
     * 
     * @return The operating system platform type of the managed node. For example, Windows.
     * @see PlatformType
     */

    public String getPlatformType() {
        return this.platformType;
    }

    /**
     * <p>
     * The operating system platform type of the managed node. For example, Windows.
     * </p>
     * 
     * @param platformType
     *        The operating system platform type of the managed node. For example, Windows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public InstanceProperty withPlatformType(String platformType) {
        setPlatformType(platformType);
        return this;
    }

    /**
     * <p>
     * The operating system platform type of the managed node. For example, Windows.
     * </p>
     * 
     * @param platformType
     *        The operating system platform type of the managed node. For example, Windows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public InstanceProperty withPlatformType(PlatformType platformType) {
        this.platformType = platformType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the operating system platform running on your managed node.
     * </p>
     * 
     * @param platformName
     *        The name of the operating system platform running on your managed node.
     */

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    /**
     * <p>
     * The name of the operating system platform running on your managed node.
     * </p>
     * 
     * @return The name of the operating system platform running on your managed node.
     */

    public String getPlatformName() {
        return this.platformName;
    }

    /**
     * <p>
     * The name of the operating system platform running on your managed node.
     * </p>
     * 
     * @param platformName
     *        The name of the operating system platform running on your managed node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withPlatformName(String platformName) {
        setPlatformName(platformName);
        return this;
    }

    /**
     * <p>
     * The version of the OS platform running on your managed node.
     * </p>
     * 
     * @param platformVersion
     *        The version of the OS platform running on your managed node.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The version of the OS platform running on your managed node.
     * </p>
     * 
     * @return The version of the OS platform running on your managed node.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The version of the OS platform running on your managed node.
     * </p>
     * 
     * @param platformVersion
     *        The version of the OS platform running on your managed node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * The activation ID created by Systems Manager when the server or virtual machine (VM) was registered
     * </p>
     * 
     * @param activationId
     *        The activation ID created by Systems Manager when the server or virtual machine (VM) was registered
     */

    public void setActivationId(String activationId) {
        this.activationId = activationId;
    }

    /**
     * <p>
     * The activation ID created by Systems Manager when the server or virtual machine (VM) was registered
     * </p>
     * 
     * @return The activation ID created by Systems Manager when the server or virtual machine (VM) was registered
     */

    public String getActivationId() {
        return this.activationId;
    }

    /**
     * <p>
     * The activation ID created by Systems Manager when the server or virtual machine (VM) was registered
     * </p>
     * 
     * @param activationId
     *        The activation ID created by Systems Manager when the server or virtual machine (VM) was registered
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withActivationId(String activationId) {
        setActivationId(activationId);
        return this;
    }

    /**
     * <p>
     * The IAM role used in the hybrid activation to register the node with Systems Manager.
     * </p>
     * 
     * @param iamRole
     *        The IAM role used in the hybrid activation to register the node with Systems Manager.
     */

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The IAM role used in the hybrid activation to register the node with Systems Manager.
     * </p>
     * 
     * @return The IAM role used in the hybrid activation to register the node with Systems Manager.
     */

    public String getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * The IAM role used in the hybrid activation to register the node with Systems Manager.
     * </p>
     * 
     * @param iamRole
     *        The IAM role used in the hybrid activation to register the node with Systems Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withIamRole(String iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * The date the node was registered with Systems Manager.
     * </p>
     * 
     * @param registrationDate
     *        The date the node was registered with Systems Manager.
     */

    public void setRegistrationDate(java.util.Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * <p>
     * The date the node was registered with Systems Manager.
     * </p>
     * 
     * @return The date the node was registered with Systems Manager.
     */

    public java.util.Date getRegistrationDate() {
        return this.registrationDate;
    }

    /**
     * <p>
     * The date the node was registered with Systems Manager.
     * </p>
     * 
     * @param registrationDate
     *        The date the node was registered with Systems Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withRegistrationDate(java.util.Date registrationDate) {
        setRegistrationDate(registrationDate);
        return this;
    }

    /**
     * <p>
     * The type of managed node.
     * </p>
     * 
     * @param resourceType
     *        The type of managed node.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of managed node.
     * </p>
     * 
     * @return The type of managed node.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of managed node.
     * </p>
     * 
     * @param resourceType
     *        The type of managed node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The fully qualified host name of the managed node.
     * </p>
     * 
     * @param computerName
     *        The fully qualified host name of the managed node.
     */

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    /**
     * <p>
     * The fully qualified host name of the managed node.
     * </p>
     * 
     * @return The fully qualified host name of the managed node.
     */

    public String getComputerName() {
        return this.computerName;
    }

    /**
     * <p>
     * The fully qualified host name of the managed node.
     * </p>
     * 
     * @param computerName
     *        The fully qualified host name of the managed node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withComputerName(String computerName) {
        setComputerName(computerName);
        return this;
    }

    /**
     * <p>
     * The status of the State Manager association applied to the managed node.
     * </p>
     * 
     * @param associationStatus
     *        The status of the State Manager association applied to the managed node.
     */

    public void setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
    }

    /**
     * <p>
     * The status of the State Manager association applied to the managed node.
     * </p>
     * 
     * @return The status of the State Manager association applied to the managed node.
     */

    public String getAssociationStatus() {
        return this.associationStatus;
    }

    /**
     * <p>
     * The status of the State Manager association applied to the managed node.
     * </p>
     * 
     * @param associationStatus
     *        The status of the State Manager association applied to the managed node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withAssociationStatus(String associationStatus) {
        setAssociationStatus(associationStatus);
        return this;
    }

    /**
     * <p>
     * The date the association was last run.
     * </p>
     * 
     * @param lastAssociationExecutionDate
     *        The date the association was last run.
     */

    public void setLastAssociationExecutionDate(java.util.Date lastAssociationExecutionDate) {
        this.lastAssociationExecutionDate = lastAssociationExecutionDate;
    }

    /**
     * <p>
     * The date the association was last run.
     * </p>
     * 
     * @return The date the association was last run.
     */

    public java.util.Date getLastAssociationExecutionDate() {
        return this.lastAssociationExecutionDate;
    }

    /**
     * <p>
     * The date the association was last run.
     * </p>
     * 
     * @param lastAssociationExecutionDate
     *        The date the association was last run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withLastAssociationExecutionDate(java.util.Date lastAssociationExecutionDate) {
        setLastAssociationExecutionDate(lastAssociationExecutionDate);
        return this;
    }

    /**
     * <p>
     * The last date the association was successfully run.
     * </p>
     * 
     * @param lastSuccessfulAssociationExecutionDate
     *        The last date the association was successfully run.
     */

    public void setLastSuccessfulAssociationExecutionDate(java.util.Date lastSuccessfulAssociationExecutionDate) {
        this.lastSuccessfulAssociationExecutionDate = lastSuccessfulAssociationExecutionDate;
    }

    /**
     * <p>
     * The last date the association was successfully run.
     * </p>
     * 
     * @return The last date the association was successfully run.
     */

    public java.util.Date getLastSuccessfulAssociationExecutionDate() {
        return this.lastSuccessfulAssociationExecutionDate;
    }

    /**
     * <p>
     * The last date the association was successfully run.
     * </p>
     * 
     * @param lastSuccessfulAssociationExecutionDate
     *        The last date the association was successfully run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withLastSuccessfulAssociationExecutionDate(java.util.Date lastSuccessfulAssociationExecutionDate) {
        setLastSuccessfulAssociationExecutionDate(lastSuccessfulAssociationExecutionDate);
        return this;
    }

    /**
     * @param associationOverview
     */

    public void setAssociationOverview(InstanceAggregatedAssociationOverview associationOverview) {
        this.associationOverview = associationOverview;
    }

    /**
     * @return
     */

    public InstanceAggregatedAssociationOverview getAssociationOverview() {
        return this.associationOverview;
    }

    /**
     * @param associationOverview
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withAssociationOverview(InstanceAggregatedAssociationOverview associationOverview) {
        setAssociationOverview(associationOverview);
        return this;
    }

    /**
     * <p>
     * The ID of the source resource.
     * </p>
     * 
     * @param sourceId
     *        The ID of the source resource.
     */

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * The ID of the source resource.
     * </p>
     * 
     * @return The ID of the source resource.
     */

    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * <p>
     * The ID of the source resource.
     * </p>
     * 
     * @param sourceId
     *        The ID of the source resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withSourceId(String sourceId) {
        setSourceId(sourceId);
        return this;
    }

    /**
     * <p>
     * The type of the source resource.
     * </p>
     * 
     * @param sourceType
     *        The type of the source resource.
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of the source resource.
     * </p>
     * 
     * @return The type of the source resource.
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The type of the source resource.
     * </p>
     * 
     * @param sourceType
     *        The type of the source resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public InstanceProperty withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The type of the source resource.
     * </p>
     * 
     * @param sourceType
     *        The type of the source resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public InstanceProperty withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstanceRole() != null)
            sb.append("InstanceRole: ").append(getInstanceRole()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getInstanceState() != null)
            sb.append("InstanceState: ").append(getInstanceState()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getIPAddress() != null)
            sb.append("IPAddress: ").append(getIPAddress()).append(",");
        if (getLaunchTime() != null)
            sb.append("LaunchTime: ").append(getLaunchTime()).append(",");
        if (getPingStatus() != null)
            sb.append("PingStatus: ").append(getPingStatus()).append(",");
        if (getLastPingDateTime() != null)
            sb.append("LastPingDateTime: ").append(getLastPingDateTime()).append(",");
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getPlatformType() != null)
            sb.append("PlatformType: ").append(getPlatformType()).append(",");
        if (getPlatformName() != null)
            sb.append("PlatformName: ").append(getPlatformName()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getActivationId() != null)
            sb.append("ActivationId: ").append(getActivationId()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole()).append(",");
        if (getRegistrationDate() != null)
            sb.append("RegistrationDate: ").append(getRegistrationDate()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getComputerName() != null)
            sb.append("ComputerName: ").append(getComputerName()).append(",");
        if (getAssociationStatus() != null)
            sb.append("AssociationStatus: ").append(getAssociationStatus()).append(",");
        if (getLastAssociationExecutionDate() != null)
            sb.append("LastAssociationExecutionDate: ").append(getLastAssociationExecutionDate()).append(",");
        if (getLastSuccessfulAssociationExecutionDate() != null)
            sb.append("LastSuccessfulAssociationExecutionDate: ").append(getLastSuccessfulAssociationExecutionDate()).append(",");
        if (getAssociationOverview() != null)
            sb.append("AssociationOverview: ").append(getAssociationOverview()).append(",");
        if (getSourceId() != null)
            sb.append("SourceId: ").append(getSourceId()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceProperty == false)
            return false;
        InstanceProperty other = (InstanceProperty) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceRole() == null ^ this.getInstanceRole() == null)
            return false;
        if (other.getInstanceRole() != null && other.getInstanceRole().equals(this.getInstanceRole()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getInstanceState() == null ^ this.getInstanceState() == null)
            return false;
        if (other.getInstanceState() != null && other.getInstanceState().equals(this.getInstanceState()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getIPAddress() == null ^ this.getIPAddress() == null)
            return false;
        if (other.getIPAddress() != null && other.getIPAddress().equals(this.getIPAddress()) == false)
            return false;
        if (other.getLaunchTime() == null ^ this.getLaunchTime() == null)
            return false;
        if (other.getLaunchTime() != null && other.getLaunchTime().equals(this.getLaunchTime()) == false)
            return false;
        if (other.getPingStatus() == null ^ this.getPingStatus() == null)
            return false;
        if (other.getPingStatus() != null && other.getPingStatus().equals(this.getPingStatus()) == false)
            return false;
        if (other.getLastPingDateTime() == null ^ this.getLastPingDateTime() == null)
            return false;
        if (other.getLastPingDateTime() != null && other.getLastPingDateTime().equals(this.getLastPingDateTime()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getPlatformType() == null ^ this.getPlatformType() == null)
            return false;
        if (other.getPlatformType() != null && other.getPlatformType().equals(this.getPlatformType()) == false)
            return false;
        if (other.getPlatformName() == null ^ this.getPlatformName() == null)
            return false;
        if (other.getPlatformName() != null && other.getPlatformName().equals(this.getPlatformName()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getActivationId() == null ^ this.getActivationId() == null)
            return false;
        if (other.getActivationId() != null && other.getActivationId().equals(this.getActivationId()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getRegistrationDate() == null ^ this.getRegistrationDate() == null)
            return false;
        if (other.getRegistrationDate() != null && other.getRegistrationDate().equals(this.getRegistrationDate()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getComputerName() == null ^ this.getComputerName() == null)
            return false;
        if (other.getComputerName() != null && other.getComputerName().equals(this.getComputerName()) == false)
            return false;
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null)
            return false;
        if (other.getAssociationStatus() != null && other.getAssociationStatus().equals(this.getAssociationStatus()) == false)
            return false;
        if (other.getLastAssociationExecutionDate() == null ^ this.getLastAssociationExecutionDate() == null)
            return false;
        if (other.getLastAssociationExecutionDate() != null && other.getLastAssociationExecutionDate().equals(this.getLastAssociationExecutionDate()) == false)
            return false;
        if (other.getLastSuccessfulAssociationExecutionDate() == null ^ this.getLastSuccessfulAssociationExecutionDate() == null)
            return false;
        if (other.getLastSuccessfulAssociationExecutionDate() != null
                && other.getLastSuccessfulAssociationExecutionDate().equals(this.getLastSuccessfulAssociationExecutionDate()) == false)
            return false;
        if (other.getAssociationOverview() == null ^ this.getAssociationOverview() == null)
            return false;
        if (other.getAssociationOverview() != null && other.getAssociationOverview().equals(this.getAssociationOverview()) == false)
            return false;
        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceRole() == null) ? 0 : getInstanceRole().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getInstanceState() == null) ? 0 : getInstanceState().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getIPAddress() == null) ? 0 : getIPAddress().hashCode());
        hashCode = prime * hashCode + ((getLaunchTime() == null) ? 0 : getLaunchTime().hashCode());
        hashCode = prime * hashCode + ((getPingStatus() == null) ? 0 : getPingStatus().hashCode());
        hashCode = prime * hashCode + ((getLastPingDateTime() == null) ? 0 : getLastPingDateTime().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatformType() == null) ? 0 : getPlatformType().hashCode());
        hashCode = prime * hashCode + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getActivationId() == null) ? 0 : getActivationId().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getRegistrationDate() == null) ? 0 : getRegistrationDate().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getComputerName() == null) ? 0 : getComputerName().hashCode());
        hashCode = prime * hashCode + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getLastAssociationExecutionDate() == null) ? 0 : getLastAssociationExecutionDate().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulAssociationExecutionDate() == null) ? 0 : getLastSuccessfulAssociationExecutionDate().hashCode());
        hashCode = prime * hashCode + ((getAssociationOverview() == null) ? 0 : getAssociationOverview().hashCode());
        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        return hashCode;
    }

    @Override
    public InstanceProperty clone() {
        try {
            return (InstanceProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InstancePropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
