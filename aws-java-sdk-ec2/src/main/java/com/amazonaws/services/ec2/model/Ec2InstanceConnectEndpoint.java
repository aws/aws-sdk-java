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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The EC2 Instance Connect Endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Ec2InstanceConnectEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2InstanceConnectEndpoint implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that created the EC2 Instance Connect Endpoint.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The ID of the EC2 Instance Connect Endpoint.
     * </p>
     */
    private String instanceConnectEndpointId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EC2 Instance Connect Endpoint.
     * </p>
     */
    private String instanceConnectEndpointArn;
    /**
     * <p>
     * The current state of the EC2 Instance Connect Endpoint.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The message for the current state of the EC2 Instance Connect Endpoint. Can include a failure message.
     * </p>
     */
    private String stateMessage;
    /**
     * <p>
     * The DNS name of the EC2 Instance Connect Endpoint.
     * </p>
     */
    private String dnsName;
    /** <p/> */
    private String fipsDnsName;
    /**
     * <p>
     * The ID of the elastic network interface that Amazon EC2 automatically created when creating the EC2 Instance
     * Connect Endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkInterfaceIds;
    /**
     * <p>
     * The ID of the VPC in which the EC2 Instance Connect Endpoint was created.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The Availability Zone of the EC2 Instance Connect Endpoint.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The date and time that the EC2 Instance Connect Endpoint was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ID of the subnet in which the EC2 Instance Connect Endpoint was created.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     * <code>false</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>true</code>, your client's IP address is used when you connect to a resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean preserveClientIp;
    /**
     * <p>
     * The security groups associated with the endpoint. If you didn't specify a security group, the default security
     * group for your VPC is associated with the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * The tags assigned to the EC2 Instance Connect Endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the Amazon Web Services account that created the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param ownerId
     *        The ID of the Amazon Web Services account that created the EC2 Instance Connect Endpoint.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that created the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that created the EC2 Instance Connect Endpoint.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that created the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param ownerId
     *        The ID of the Amazon Web Services account that created the EC2 Instance Connect Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param instanceConnectEndpointId
     *        The ID of the EC2 Instance Connect Endpoint.
     */

    public void setInstanceConnectEndpointId(String instanceConnectEndpointId) {
        this.instanceConnectEndpointId = instanceConnectEndpointId;
    }

    /**
     * <p>
     * The ID of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @return The ID of the EC2 Instance Connect Endpoint.
     */

    public String getInstanceConnectEndpointId() {
        return this.instanceConnectEndpointId;
    }

    /**
     * <p>
     * The ID of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param instanceConnectEndpointId
     *        The ID of the EC2 Instance Connect Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withInstanceConnectEndpointId(String instanceConnectEndpointId) {
        setInstanceConnectEndpointId(instanceConnectEndpointId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param instanceConnectEndpointArn
     *        The Amazon Resource Name (ARN) of the EC2 Instance Connect Endpoint.
     */

    public void setInstanceConnectEndpointArn(String instanceConnectEndpointArn) {
        this.instanceConnectEndpointArn = instanceConnectEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the EC2 Instance Connect Endpoint.
     */

    public String getInstanceConnectEndpointArn() {
        return this.instanceConnectEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param instanceConnectEndpointArn
     *        The Amazon Resource Name (ARN) of the EC2 Instance Connect Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withInstanceConnectEndpointArn(String instanceConnectEndpointArn) {
        setInstanceConnectEndpointArn(instanceConnectEndpointArn);
        return this;
    }

    /**
     * <p>
     * The current state of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param state
     *        The current state of the EC2 Instance Connect Endpoint.
     * @see Ec2InstanceConnectEndpointState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @return The current state of the EC2 Instance Connect Endpoint.
     * @see Ec2InstanceConnectEndpointState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param state
     *        The current state of the EC2 Instance Connect Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2InstanceConnectEndpointState
     */

    public Ec2InstanceConnectEndpoint withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param state
     *        The current state of the EC2 Instance Connect Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2InstanceConnectEndpointState
     */

    public Ec2InstanceConnectEndpoint withState(Ec2InstanceConnectEndpointState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The message for the current state of the EC2 Instance Connect Endpoint. Can include a failure message.
     * </p>
     * 
     * @param stateMessage
     *        The message for the current state of the EC2 Instance Connect Endpoint. Can include a failure message.
     */

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    /**
     * <p>
     * The message for the current state of the EC2 Instance Connect Endpoint. Can include a failure message.
     * </p>
     * 
     * @return The message for the current state of the EC2 Instance Connect Endpoint. Can include a failure message.
     */

    public String getStateMessage() {
        return this.stateMessage;
    }

    /**
     * <p>
     * The message for the current state of the EC2 Instance Connect Endpoint. Can include a failure message.
     * </p>
     * 
     * @param stateMessage
     *        The message for the current state of the EC2 Instance Connect Endpoint. Can include a failure message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withStateMessage(String stateMessage) {
        setStateMessage(stateMessage);
        return this;
    }

    /**
     * <p>
     * The DNS name of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param dnsName
     *        The DNS name of the EC2 Instance Connect Endpoint.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS name of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @return The DNS name of the EC2 Instance Connect Endpoint.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The DNS name of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param dnsName
     *        The DNS name of the EC2 Instance Connect Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withDnsName(String dnsName) {
        setDnsName(dnsName);
        return this;
    }

    /**
     * <p/>
     * 
     * @param fipsDnsName
     */

    public void setFipsDnsName(String fipsDnsName) {
        this.fipsDnsName = fipsDnsName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getFipsDnsName() {
        return this.fipsDnsName;
    }

    /**
     * <p/>
     * 
     * @param fipsDnsName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withFipsDnsName(String fipsDnsName) {
        setFipsDnsName(fipsDnsName);
        return this;
    }

    /**
     * <p>
     * The ID of the elastic network interface that Amazon EC2 automatically created when creating the EC2 Instance
     * Connect Endpoint.
     * </p>
     * 
     * @return The ID of the elastic network interface that Amazon EC2 automatically created when creating the EC2
     *         Instance Connect Endpoint.
     */

    public java.util.List<String> getNetworkInterfaceIds() {
        if (networkInterfaceIds == null) {
            networkInterfaceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkInterfaceIds;
    }

    /**
     * <p>
     * The ID of the elastic network interface that Amazon EC2 automatically created when creating the EC2 Instance
     * Connect Endpoint.
     * </p>
     * 
     * @param networkInterfaceIds
     *        The ID of the elastic network interface that Amazon EC2 automatically created when creating the EC2
     *        Instance Connect Endpoint.
     */

    public void setNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
            return;
        }

        this.networkInterfaceIds = new com.amazonaws.internal.SdkInternalList<String>(networkInterfaceIds);
    }

    /**
     * <p>
     * The ID of the elastic network interface that Amazon EC2 automatically created when creating the EC2 Instance
     * Connect Endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaceIds(java.util.Collection)} or {@link #withNetworkInterfaceIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaceIds
     *        The ID of the elastic network interface that Amazon EC2 automatically created when creating the EC2
     *        Instance Connect Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withNetworkInterfaceIds(String... networkInterfaceIds) {
        if (this.networkInterfaceIds == null) {
            setNetworkInterfaceIds(new com.amazonaws.internal.SdkInternalList<String>(networkInterfaceIds.length));
        }
        for (String ele : networkInterfaceIds) {
            this.networkInterfaceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the elastic network interface that Amazon EC2 automatically created when creating the EC2 Instance
     * Connect Endpoint.
     * </p>
     * 
     * @param networkInterfaceIds
     *        The ID of the elastic network interface that Amazon EC2 automatically created when creating the EC2
     *        Instance Connect Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC in which the EC2 Instance Connect Endpoint was created.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC in which the EC2 Instance Connect Endpoint was created.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the EC2 Instance Connect Endpoint was created.
     * </p>
     * 
     * @return The ID of the VPC in which the EC2 Instance Connect Endpoint was created.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the EC2 Instance Connect Endpoint was created.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC in which the EC2 Instance Connect Endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The Availability Zone of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the EC2 Instance Connect Endpoint.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @return The Availability Zone of the EC2 Instance Connect Endpoint.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the EC2 Instance Connect Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The date and time that the EC2 Instance Connect Endpoint was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the EC2 Instance Connect Endpoint was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the EC2 Instance Connect Endpoint was created.
     * </p>
     * 
     * @return The date and time that the EC2 Instance Connect Endpoint was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the EC2 Instance Connect Endpoint was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the EC2 Instance Connect Endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet in which the EC2 Instance Connect Endpoint was created.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which the EC2 Instance Connect Endpoint was created.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which the EC2 Instance Connect Endpoint was created.
     * </p>
     * 
     * @return The ID of the subnet in which the EC2 Instance Connect Endpoint was created.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which the EC2 Instance Connect Endpoint was created.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which the EC2 Instance Connect Endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     * <code>false</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>true</code>, your client's IP address is used when you connect to a resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param preserveClientIp
     *        Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     *        <code>false</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>true</code>, your client's IP address is used when you connect to a resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setPreserveClientIp(Boolean preserveClientIp) {
        this.preserveClientIp = preserveClientIp;
    }

    /**
     * <p>
     * Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     * <code>false</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>true</code>, your client's IP address is used when you connect to a resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     *         <code>false</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>true</code>, your client's IP address is used when you connect to a resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getPreserveClientIp() {
        return this.preserveClientIp;
    }

    /**
     * <p>
     * Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     * <code>false</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>true</code>, your client's IP address is used when you connect to a resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param preserveClientIp
     *        Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     *        <code>false</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>true</code>, your client's IP address is used when you connect to a resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withPreserveClientIp(Boolean preserveClientIp) {
        setPreserveClientIp(preserveClientIp);
        return this;
    }

    /**
     * <p>
     * Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     * <code>false</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>true</code>, your client's IP address is used when you connect to a resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     *         <code>false</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>true</code>, your client's IP address is used when you connect to a resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isPreserveClientIp() {
        return this.preserveClientIp;
    }

    /**
     * <p>
     * The security groups associated with the endpoint. If you didn't specify a security group, the default security
     * group for your VPC is associated with the endpoint.
     * </p>
     * 
     * @return The security groups associated with the endpoint. If you didn't specify a security group, the default
     *         security group for your VPC is associated with the endpoint.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * The security groups associated with the endpoint. If you didn't specify a security group, the default security
     * group for your VPC is associated with the endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups associated with the endpoint. If you didn't specify a security group, the default
     *        security group for your VPC is associated with the endpoint.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The security groups associated with the endpoint. If you didn't specify a security group, the default security
     * group for your VPC is associated with the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups associated with the endpoint. If you didn't specify a security group, the default
     *        security group for your VPC is associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups associated with the endpoint. If you didn't specify a security group, the default security
     * group for your VPC is associated with the endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups associated with the endpoint. If you didn't specify a security group, the default
     *        security group for your VPC is associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @return The tags assigned to the EC2 Instance Connect Endpoint.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the EC2 Instance Connect Endpoint.
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
     * The tags assigned to the EC2 Instance Connect Endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the EC2 Instance Connect Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withTags(Tag... tags) {
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
     * The tags assigned to the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the EC2 Instance Connect Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceConnectEndpoint withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getInstanceConnectEndpointId() != null)
            sb.append("InstanceConnectEndpointId: ").append(getInstanceConnectEndpointId()).append(",");
        if (getInstanceConnectEndpointArn() != null)
            sb.append("InstanceConnectEndpointArn: ").append(getInstanceConnectEndpointArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateMessage() != null)
            sb.append("StateMessage: ").append(getStateMessage()).append(",");
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName()).append(",");
        if (getFipsDnsName() != null)
            sb.append("FipsDnsName: ").append(getFipsDnsName()).append(",");
        if (getNetworkInterfaceIds() != null)
            sb.append("NetworkInterfaceIds: ").append(getNetworkInterfaceIds()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getPreserveClientIp() != null)
            sb.append("PreserveClientIp: ").append(getPreserveClientIp()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ec2InstanceConnectEndpoint == false)
            return false;
        Ec2InstanceConnectEndpoint other = (Ec2InstanceConnectEndpoint) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getInstanceConnectEndpointId() == null ^ this.getInstanceConnectEndpointId() == null)
            return false;
        if (other.getInstanceConnectEndpointId() != null && other.getInstanceConnectEndpointId().equals(this.getInstanceConnectEndpointId()) == false)
            return false;
        if (other.getInstanceConnectEndpointArn() == null ^ this.getInstanceConnectEndpointArn() == null)
            return false;
        if (other.getInstanceConnectEndpointArn() != null && other.getInstanceConnectEndpointArn().equals(this.getInstanceConnectEndpointArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateMessage() == null ^ this.getStateMessage() == null)
            return false;
        if (other.getStateMessage() != null && other.getStateMessage().equals(this.getStateMessage()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        if (other.getFipsDnsName() == null ^ this.getFipsDnsName() == null)
            return false;
        if (other.getFipsDnsName() != null && other.getFipsDnsName().equals(this.getFipsDnsName()) == false)
            return false;
        if (other.getNetworkInterfaceIds() == null ^ this.getNetworkInterfaceIds() == null)
            return false;
        if (other.getNetworkInterfaceIds() != null && other.getNetworkInterfaceIds().equals(this.getNetworkInterfaceIds()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getPreserveClientIp() == null ^ this.getPreserveClientIp() == null)
            return false;
        if (other.getPreserveClientIp() != null && other.getPreserveClientIp().equals(this.getPreserveClientIp()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getInstanceConnectEndpointId() == null) ? 0 : getInstanceConnectEndpointId().hashCode());
        hashCode = prime * hashCode + ((getInstanceConnectEndpointArn() == null) ? 0 : getInstanceConnectEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateMessage() == null) ? 0 : getStateMessage().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        hashCode = prime * hashCode + ((getFipsDnsName() == null) ? 0 : getFipsDnsName().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getPreserveClientIp() == null) ? 0 : getPreserveClientIp().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Ec2InstanceConnectEndpoint clone() {
        try {
            return (Ec2InstanceConnectEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
