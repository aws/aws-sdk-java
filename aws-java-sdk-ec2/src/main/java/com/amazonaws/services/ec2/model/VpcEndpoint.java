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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a VPC endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpcEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcEndpoint implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * The type of endpoint.
     * </p>
     */
    private String vpcEndpointType;
    /**
     * <p>
     * The ID of the VPC to which the endpoint is associated.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The name of the service to which the endpoint is associated.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The policy document associated with the endpoint, if applicable.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * (Gateway endpoint) One or more route tables associated with the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> routeTableIds;
    /**
     * <p>
     * (Interface endpoint) One or more subnets in which the endpoint is located.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * (Interface endpoint) Information about the security groups associated with the network interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SecurityGroupIdentifier> groups;
    /**
     * <p>
     * (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
     * </p>
     */
    private Boolean privateDnsEnabled;
    /**
     * <p>
     * Indicates whether the VPC Endpoint is being managed by its service.
     * </p>
     */
    private Boolean requesterManaged;
    /**
     * <p>
     * (Interface endpoint) One or more network interfaces for the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkInterfaceIds;
    /**
     * <p>
     * (Interface endpoint) The DNS entries for the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DnsEntry> dnsEntries;
    /**
     * <p>
     * The date and time the VPC endpoint was created.
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the VPC endpoint.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * 
     * @return The ID of the VPC endpoint.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param vpcEndpointType
     *        The type of endpoint.
     * @see VpcEndpointType
     */

    public void setVpcEndpointType(String vpcEndpointType) {
        this.vpcEndpointType = vpcEndpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @return The type of endpoint.
     * @see VpcEndpointType
     */

    public String getVpcEndpointType() {
        return this.vpcEndpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param vpcEndpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointType
     */

    public VpcEndpoint withVpcEndpointType(String vpcEndpointType) {
        setVpcEndpointType(vpcEndpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param vpcEndpointType
     *        The type of endpoint.
     * @see VpcEndpointType
     */

    public void setVpcEndpointType(VpcEndpointType vpcEndpointType) {
        withVpcEndpointType(vpcEndpointType);
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param vpcEndpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointType
     */

    public VpcEndpoint withVpcEndpointType(VpcEndpointType vpcEndpointType) {
        this.vpcEndpointType = vpcEndpointType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC to which the endpoint is associated.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC to which the endpoint is associated.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to which the endpoint is associated.
     * </p>
     * 
     * @return The ID of the VPC to which the endpoint is associated.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to which the endpoint is associated.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC to which the endpoint is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The name of the service to which the endpoint is associated.
     * </p>
     * 
     * @param serviceName
     *        The name of the service to which the endpoint is associated.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service to which the endpoint is associated.
     * </p>
     * 
     * @return The name of the service to which the endpoint is associated.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service to which the endpoint is associated.
     * </p>
     * 
     * @param serviceName
     *        The name of the service to which the endpoint is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @param state
     *        The state of the VPC endpoint.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @return The state of the VPC endpoint.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @param state
     *        The state of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public VpcEndpoint withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @param state
     *        The state of the VPC endpoint.
     * @see State
     */

    public void setState(State state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @param state
     *        The state of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public VpcEndpoint withState(State state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The policy document associated with the endpoint, if applicable.
     * </p>
     * 
     * @param policyDocument
     *        The policy document associated with the endpoint, if applicable.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The policy document associated with the endpoint, if applicable.
     * </p>
     * 
     * @return The policy document associated with the endpoint, if applicable.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The policy document associated with the endpoint, if applicable.
     * </p>
     * 
     * @param policyDocument
     *        The policy document associated with the endpoint, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables associated with the endpoint.
     * </p>
     * 
     * @return (Gateway endpoint) One or more route tables associated with the endpoint.
     */

    public java.util.List<String> getRouteTableIds() {
        if (routeTableIds == null) {
            routeTableIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return routeTableIds;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables associated with the endpoint.
     * </p>
     * 
     * @param routeTableIds
     *        (Gateway endpoint) One or more route tables associated with the endpoint.
     */

    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
            return;
        }

        this.routeTableIds = new com.amazonaws.internal.SdkInternalList<String>(routeTableIds);
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables associated with the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteTableIds(java.util.Collection)} or {@link #withRouteTableIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param routeTableIds
     *        (Gateway endpoint) One or more route tables associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withRouteTableIds(String... routeTableIds) {
        if (this.routeTableIds == null) {
            setRouteTableIds(new com.amazonaws.internal.SdkInternalList<String>(routeTableIds.length));
        }
        for (String ele : routeTableIds) {
            this.routeTableIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables associated with the endpoint.
     * </p>
     * 
     * @param routeTableIds
     *        (Gateway endpoint) One or more route tables associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withRouteTableIds(java.util.Collection<String> routeTableIds) {
        setRouteTableIds(routeTableIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets in which the endpoint is located.
     * </p>
     * 
     * @return (Interface endpoint) One or more subnets in which the endpoint is located.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets in which the endpoint is located.
     * </p>
     * 
     * @param subnetIds
     *        (Interface endpoint) One or more subnets in which the endpoint is located.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets in which the endpoint is located.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        (Interface endpoint) One or more subnets in which the endpoint is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets in which the endpoint is located.
     * </p>
     * 
     * @param subnetIds
     *        (Interface endpoint) One or more subnets in which the endpoint is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) Information about the security groups associated with the network interface.
     * </p>
     * 
     * @return (Interface endpoint) Information about the security groups associated with the network interface.
     */

    public java.util.List<SecurityGroupIdentifier> getGroups() {
        if (groups == null) {
            groups = new com.amazonaws.internal.SdkInternalList<SecurityGroupIdentifier>();
        }
        return groups;
    }

    /**
     * <p>
     * (Interface endpoint) Information about the security groups associated with the network interface.
     * </p>
     * 
     * @param groups
     *        (Interface endpoint) Information about the security groups associated with the network interface.
     */

    public void setGroups(java.util.Collection<SecurityGroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new com.amazonaws.internal.SdkInternalList<SecurityGroupIdentifier>(groups);
    }

    /**
     * <p>
     * (Interface endpoint) Information about the security groups associated with the network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        (Interface endpoint) Information about the security groups associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withGroups(SecurityGroupIdentifier... groups) {
        if (this.groups == null) {
            setGroups(new com.amazonaws.internal.SdkInternalList<SecurityGroupIdentifier>(groups.length));
        }
        for (SecurityGroupIdentifier ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) Information about the security groups associated with the network interface.
     * </p>
     * 
     * @param groups
     *        (Interface endpoint) Information about the security groups associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withGroups(java.util.Collection<SecurityGroupIdentifier> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
     * </p>
     * 
     * @param privateDnsEnabled
     *        (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
     */

    public void setPrivateDnsEnabled(Boolean privateDnsEnabled) {
        this.privateDnsEnabled = privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
     * </p>
     * 
     * @return (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
     */

    public Boolean getPrivateDnsEnabled() {
        return this.privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
     * </p>
     * 
     * @param privateDnsEnabled
     *        (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withPrivateDnsEnabled(Boolean privateDnsEnabled) {
        setPrivateDnsEnabled(privateDnsEnabled);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
     * </p>
     * 
     * @return (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
     */

    public Boolean isPrivateDnsEnabled() {
        return this.privateDnsEnabled;
    }

    /**
     * <p>
     * Indicates whether the VPC Endpoint is being managed by its service.
     * </p>
     * 
     * @param requesterManaged
     *        Indicates whether the VPC Endpoint is being managed by its service.
     */

    public void setRequesterManaged(Boolean requesterManaged) {
        this.requesterManaged = requesterManaged;
    }

    /**
     * <p>
     * Indicates whether the VPC Endpoint is being managed by its service.
     * </p>
     * 
     * @return Indicates whether the VPC Endpoint is being managed by its service.
     */

    public Boolean getRequesterManaged() {
        return this.requesterManaged;
    }

    /**
     * <p>
     * Indicates whether the VPC Endpoint is being managed by its service.
     * </p>
     * 
     * @param requesterManaged
     *        Indicates whether the VPC Endpoint is being managed by its service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withRequesterManaged(Boolean requesterManaged) {
        setRequesterManaged(requesterManaged);
        return this;
    }

    /**
     * <p>
     * Indicates whether the VPC Endpoint is being managed by its service.
     * </p>
     * 
     * @return Indicates whether the VPC Endpoint is being managed by its service.
     */

    public Boolean isRequesterManaged() {
        return this.requesterManaged;
    }

    /**
     * <p>
     * (Interface endpoint) One or more network interfaces for the endpoint.
     * </p>
     * 
     * @return (Interface endpoint) One or more network interfaces for the endpoint.
     */

    public java.util.List<String> getNetworkInterfaceIds() {
        if (networkInterfaceIds == null) {
            networkInterfaceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkInterfaceIds;
    }

    /**
     * <p>
     * (Interface endpoint) One or more network interfaces for the endpoint.
     * </p>
     * 
     * @param networkInterfaceIds
     *        (Interface endpoint) One or more network interfaces for the endpoint.
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
     * (Interface endpoint) One or more network interfaces for the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaceIds(java.util.Collection)} or {@link #withNetworkInterfaceIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaceIds
     *        (Interface endpoint) One or more network interfaces for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withNetworkInterfaceIds(String... networkInterfaceIds) {
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
     * (Interface endpoint) One or more network interfaces for the endpoint.
     * </p>
     * 
     * @param networkInterfaceIds
     *        (Interface endpoint) One or more network interfaces for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) The DNS entries for the endpoint.
     * </p>
     * 
     * @return (Interface endpoint) The DNS entries for the endpoint.
     */

    public java.util.List<DnsEntry> getDnsEntries() {
        if (dnsEntries == null) {
            dnsEntries = new com.amazonaws.internal.SdkInternalList<DnsEntry>();
        }
        return dnsEntries;
    }

    /**
     * <p>
     * (Interface endpoint) The DNS entries for the endpoint.
     * </p>
     * 
     * @param dnsEntries
     *        (Interface endpoint) The DNS entries for the endpoint.
     */

    public void setDnsEntries(java.util.Collection<DnsEntry> dnsEntries) {
        if (dnsEntries == null) {
            this.dnsEntries = null;
            return;
        }

        this.dnsEntries = new com.amazonaws.internal.SdkInternalList<DnsEntry>(dnsEntries);
    }

    /**
     * <p>
     * (Interface endpoint) The DNS entries for the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsEntries(java.util.Collection)} or {@link #withDnsEntries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsEntries
     *        (Interface endpoint) The DNS entries for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withDnsEntries(DnsEntry... dnsEntries) {
        if (this.dnsEntries == null) {
            setDnsEntries(new com.amazonaws.internal.SdkInternalList<DnsEntry>(dnsEntries.length));
        }
        for (DnsEntry ele : dnsEntries) {
            this.dnsEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) The DNS entries for the endpoint.
     * </p>
     * 
     * @param dnsEntries
     *        (Interface endpoint) The DNS entries for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withDnsEntries(java.util.Collection<DnsEntry> dnsEntries) {
        setDnsEntries(dnsEntries);
        return this;
    }

    /**
     * <p>
     * The date and time the VPC endpoint was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The date and time the VPC endpoint was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The date and time the VPC endpoint was created.
     * </p>
     * 
     * @return The date and time the VPC endpoint was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The date and time the VPC endpoint was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The date and time the VPC endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
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
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getVpcEndpointType() != null)
            sb.append("VpcEndpointType: ").append(getVpcEndpointType()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getRouteTableIds() != null)
            sb.append("RouteTableIds: ").append(getRouteTableIds()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getPrivateDnsEnabled() != null)
            sb.append("PrivateDnsEnabled: ").append(getPrivateDnsEnabled()).append(",");
        if (getRequesterManaged() != null)
            sb.append("RequesterManaged: ").append(getRequesterManaged()).append(",");
        if (getNetworkInterfaceIds() != null)
            sb.append("NetworkInterfaceIds: ").append(getNetworkInterfaceIds()).append(",");
        if (getDnsEntries() != null)
            sb.append("DnsEntries: ").append(getDnsEntries()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcEndpoint == false)
            return false;
        VpcEndpoint other = (VpcEndpoint) obj;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getVpcEndpointType() == null ^ this.getVpcEndpointType() == null)
            return false;
        if (other.getVpcEndpointType() != null && other.getVpcEndpointType().equals(this.getVpcEndpointType()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getRouteTableIds() == null ^ this.getRouteTableIds() == null)
            return false;
        if (other.getRouteTableIds() != null && other.getRouteTableIds().equals(this.getRouteTableIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getPrivateDnsEnabled() == null ^ this.getPrivateDnsEnabled() == null)
            return false;
        if (other.getPrivateDnsEnabled() != null && other.getPrivateDnsEnabled().equals(this.getPrivateDnsEnabled()) == false)
            return false;
        if (other.getRequesterManaged() == null ^ this.getRequesterManaged() == null)
            return false;
        if (other.getRequesterManaged() != null && other.getRequesterManaged().equals(this.getRequesterManaged()) == false)
            return false;
        if (other.getNetworkInterfaceIds() == null ^ this.getNetworkInterfaceIds() == null)
            return false;
        if (other.getNetworkInterfaceIds() != null && other.getNetworkInterfaceIds().equals(this.getNetworkInterfaceIds()) == false)
            return false;
        if (other.getDnsEntries() == null ^ this.getDnsEntries() == null)
            return false;
        if (other.getDnsEntries() != null && other.getDnsEntries().equals(this.getDnsEntries()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointType() == null) ? 0 : getVpcEndpointType().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getRouteTableIds() == null) ? 0 : getRouteTableIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsEnabled() == null) ? 0 : getPrivateDnsEnabled().hashCode());
        hashCode = prime * hashCode + ((getRequesterManaged() == null) ? 0 : getRequesterManaged().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getDnsEntries() == null) ? 0 : getDnsEntries().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public VpcEndpoint clone() {
        try {
            return (VpcEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
