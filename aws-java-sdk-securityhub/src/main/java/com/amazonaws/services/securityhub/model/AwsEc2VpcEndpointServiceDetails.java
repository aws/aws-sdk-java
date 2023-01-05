/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the service configuration for a VPC endpoint service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2VpcEndpointServiceDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VpcEndpointServiceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether requests from other Amazon Web Services accounts to create an endpoint to the service must first be
     * accepted.
     * </p>
     */
    private Boolean acceptanceRequired;
    /**
     * <p>
     * The Availability Zones where the service is available.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * The DNS names for the service.
     * </p>
     */
    private java.util.List<String> baseEndpointDnsNames;
    /**
     * <p>
     * Whether the service manages its VPC endpoints.
     * </p>
     */
    private Boolean managesVpcEndpoints;
    /**
     * <p>
     * The ARNs of the Gateway Load Balancers for the service.
     * </p>
     */
    private java.util.List<String> gatewayLoadBalancerArns;
    /**
     * <p>
     * The ARNs of the Network Load Balancers for the service.
     * </p>
     */
    private java.util.List<String> networkLoadBalancerArns;
    /**
     * <p>
     * The private DNS name for the service.
     * </p>
     */
    private String privateDnsName;
    /**
     * <p>
     * The identifier of the service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The name of the service.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The current state of the service. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>
     * </p>
     * </li>
     * </ul>
     */
    private String serviceState;
    /**
     * <p>
     * The types for the service.
     * </p>
     */
    private java.util.List<AwsEc2VpcEndpointServiceServiceTypeDetails> serviceType;

    /**
     * <p>
     * Whether requests from other Amazon Web Services accounts to create an endpoint to the service must first be
     * accepted.
     * </p>
     * 
     * @param acceptanceRequired
     *        Whether requests from other Amazon Web Services accounts to create an endpoint to the service must first
     *        be accepted.
     */

    public void setAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
    }

    /**
     * <p>
     * Whether requests from other Amazon Web Services accounts to create an endpoint to the service must first be
     * accepted.
     * </p>
     * 
     * @return Whether requests from other Amazon Web Services accounts to create an endpoint to the service must first
     *         be accepted.
     */

    public Boolean getAcceptanceRequired() {
        return this.acceptanceRequired;
    }

    /**
     * <p>
     * Whether requests from other Amazon Web Services accounts to create an endpoint to the service must first be
     * accepted.
     * </p>
     * 
     * @param acceptanceRequired
     *        Whether requests from other Amazon Web Services accounts to create an endpoint to the service must first
     *        be accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withAcceptanceRequired(Boolean acceptanceRequired) {
        setAcceptanceRequired(acceptanceRequired);
        return this;
    }

    /**
     * <p>
     * Whether requests from other Amazon Web Services accounts to create an endpoint to the service must first be
     * accepted.
     * </p>
     * 
     * @return Whether requests from other Amazon Web Services accounts to create an endpoint to the service must first
     *         be accepted.
     */

    public Boolean isAcceptanceRequired() {
        return this.acceptanceRequired;
    }

    /**
     * <p>
     * The Availability Zones where the service is available.
     * </p>
     * 
     * @return The Availability Zones where the service is available.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones where the service is available.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones where the service is available.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones where the service is available.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones where the service is available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones where the service is available.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones where the service is available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The DNS names for the service.
     * </p>
     * 
     * @return The DNS names for the service.
     */

    public java.util.List<String> getBaseEndpointDnsNames() {
        return baseEndpointDnsNames;
    }

    /**
     * <p>
     * The DNS names for the service.
     * </p>
     * 
     * @param baseEndpointDnsNames
     *        The DNS names for the service.
     */

    public void setBaseEndpointDnsNames(java.util.Collection<String> baseEndpointDnsNames) {
        if (baseEndpointDnsNames == null) {
            this.baseEndpointDnsNames = null;
            return;
        }

        this.baseEndpointDnsNames = new java.util.ArrayList<String>(baseEndpointDnsNames);
    }

    /**
     * <p>
     * The DNS names for the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBaseEndpointDnsNames(java.util.Collection)} or {@link #withBaseEndpointDnsNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param baseEndpointDnsNames
     *        The DNS names for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withBaseEndpointDnsNames(String... baseEndpointDnsNames) {
        if (this.baseEndpointDnsNames == null) {
            setBaseEndpointDnsNames(new java.util.ArrayList<String>(baseEndpointDnsNames.length));
        }
        for (String ele : baseEndpointDnsNames) {
            this.baseEndpointDnsNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The DNS names for the service.
     * </p>
     * 
     * @param baseEndpointDnsNames
     *        The DNS names for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withBaseEndpointDnsNames(java.util.Collection<String> baseEndpointDnsNames) {
        setBaseEndpointDnsNames(baseEndpointDnsNames);
        return this;
    }

    /**
     * <p>
     * Whether the service manages its VPC endpoints.
     * </p>
     * 
     * @param managesVpcEndpoints
     *        Whether the service manages its VPC endpoints.
     */

    public void setManagesVpcEndpoints(Boolean managesVpcEndpoints) {
        this.managesVpcEndpoints = managesVpcEndpoints;
    }

    /**
     * <p>
     * Whether the service manages its VPC endpoints.
     * </p>
     * 
     * @return Whether the service manages its VPC endpoints.
     */

    public Boolean getManagesVpcEndpoints() {
        return this.managesVpcEndpoints;
    }

    /**
     * <p>
     * Whether the service manages its VPC endpoints.
     * </p>
     * 
     * @param managesVpcEndpoints
     *        Whether the service manages its VPC endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withManagesVpcEndpoints(Boolean managesVpcEndpoints) {
        setManagesVpcEndpoints(managesVpcEndpoints);
        return this;
    }

    /**
     * <p>
     * Whether the service manages its VPC endpoints.
     * </p>
     * 
     * @return Whether the service manages its VPC endpoints.
     */

    public Boolean isManagesVpcEndpoints() {
        return this.managesVpcEndpoints;
    }

    /**
     * <p>
     * The ARNs of the Gateway Load Balancers for the service.
     * </p>
     * 
     * @return The ARNs of the Gateway Load Balancers for the service.
     */

    public java.util.List<String> getGatewayLoadBalancerArns() {
        return gatewayLoadBalancerArns;
    }

    /**
     * <p>
     * The ARNs of the Gateway Load Balancers for the service.
     * </p>
     * 
     * @param gatewayLoadBalancerArns
     *        The ARNs of the Gateway Load Balancers for the service.
     */

    public void setGatewayLoadBalancerArns(java.util.Collection<String> gatewayLoadBalancerArns) {
        if (gatewayLoadBalancerArns == null) {
            this.gatewayLoadBalancerArns = null;
            return;
        }

        this.gatewayLoadBalancerArns = new java.util.ArrayList<String>(gatewayLoadBalancerArns);
    }

    /**
     * <p>
     * The ARNs of the Gateway Load Balancers for the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGatewayLoadBalancerArns(java.util.Collection)} or
     * {@link #withGatewayLoadBalancerArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param gatewayLoadBalancerArns
     *        The ARNs of the Gateway Load Balancers for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withGatewayLoadBalancerArns(String... gatewayLoadBalancerArns) {
        if (this.gatewayLoadBalancerArns == null) {
            setGatewayLoadBalancerArns(new java.util.ArrayList<String>(gatewayLoadBalancerArns.length));
        }
        for (String ele : gatewayLoadBalancerArns) {
            this.gatewayLoadBalancerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the Gateway Load Balancers for the service.
     * </p>
     * 
     * @param gatewayLoadBalancerArns
     *        The ARNs of the Gateway Load Balancers for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withGatewayLoadBalancerArns(java.util.Collection<String> gatewayLoadBalancerArns) {
        setGatewayLoadBalancerArns(gatewayLoadBalancerArns);
        return this;
    }

    /**
     * <p>
     * The ARNs of the Network Load Balancers for the service.
     * </p>
     * 
     * @return The ARNs of the Network Load Balancers for the service.
     */

    public java.util.List<String> getNetworkLoadBalancerArns() {
        return networkLoadBalancerArns;
    }

    /**
     * <p>
     * The ARNs of the Network Load Balancers for the service.
     * </p>
     * 
     * @param networkLoadBalancerArns
     *        The ARNs of the Network Load Balancers for the service.
     */

    public void setNetworkLoadBalancerArns(java.util.Collection<String> networkLoadBalancerArns) {
        if (networkLoadBalancerArns == null) {
            this.networkLoadBalancerArns = null;
            return;
        }

        this.networkLoadBalancerArns = new java.util.ArrayList<String>(networkLoadBalancerArns);
    }

    /**
     * <p>
     * The ARNs of the Network Load Balancers for the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkLoadBalancerArns(java.util.Collection)} or
     * {@link #withNetworkLoadBalancerArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkLoadBalancerArns
     *        The ARNs of the Network Load Balancers for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withNetworkLoadBalancerArns(String... networkLoadBalancerArns) {
        if (this.networkLoadBalancerArns == null) {
            setNetworkLoadBalancerArns(new java.util.ArrayList<String>(networkLoadBalancerArns.length));
        }
        for (String ele : networkLoadBalancerArns) {
            this.networkLoadBalancerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the Network Load Balancers for the service.
     * </p>
     * 
     * @param networkLoadBalancerArns
     *        The ARNs of the Network Load Balancers for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withNetworkLoadBalancerArns(java.util.Collection<String> networkLoadBalancerArns) {
        setNetworkLoadBalancerArns(networkLoadBalancerArns);
        return this;
    }

    /**
     * <p>
     * The private DNS name for the service.
     * </p>
     * 
     * @param privateDnsName
     *        The private DNS name for the service.
     */

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private DNS name for the service.
     * </p>
     * 
     * @return The private DNS name for the service.
     */

    public String getPrivateDnsName() {
        return this.privateDnsName;
    }

    /**
     * <p>
     * The private DNS name for the service.
     * </p>
     * 
     * @param privateDnsName
     *        The private DNS name for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withPrivateDnsName(String privateDnsName) {
        setPrivateDnsName(privateDnsName);
        return this;
    }

    /**
     * <p>
     * The identifier of the service.
     * </p>
     * 
     * @param serviceId
     *        The identifier of the service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The identifier of the service.
     * </p>
     * 
     * @return The identifier of the service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The identifier of the service.
     * </p>
     * 
     * @param serviceId
     *        The identifier of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param serviceName
     *        The name of the service.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @return The name of the service.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param serviceName
     *        The name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The current state of the service. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param serviceState
     *        The current state of the service. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Available</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Pending</code>
     *        </p>
     *        </li>
     */

    public void setServiceState(String serviceState) {
        this.serviceState = serviceState;
    }

    /**
     * <p>
     * The current state of the service. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the service. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Available</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deleted</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deleting</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Pending</code>
     *         </p>
     *         </li>
     */

    public String getServiceState() {
        return this.serviceState;
    }

    /**
     * <p>
     * The current state of the service. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param serviceState
     *        The current state of the service. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Available</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Pending</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withServiceState(String serviceState) {
        setServiceState(serviceState);
        return this;
    }

    /**
     * <p>
     * The types for the service.
     * </p>
     * 
     * @return The types for the service.
     */

    public java.util.List<AwsEc2VpcEndpointServiceServiceTypeDetails> getServiceType() {
        return serviceType;
    }

    /**
     * <p>
     * The types for the service.
     * </p>
     * 
     * @param serviceType
     *        The types for the service.
     */

    public void setServiceType(java.util.Collection<AwsEc2VpcEndpointServiceServiceTypeDetails> serviceType) {
        if (serviceType == null) {
            this.serviceType = null;
            return;
        }

        this.serviceType = new java.util.ArrayList<AwsEc2VpcEndpointServiceServiceTypeDetails>(serviceType);
    }

    /**
     * <p>
     * The types for the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceType(java.util.Collection)} or {@link #withServiceType(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceType
     *        The types for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withServiceType(AwsEc2VpcEndpointServiceServiceTypeDetails... serviceType) {
        if (this.serviceType == null) {
            setServiceType(new java.util.ArrayList<AwsEc2VpcEndpointServiceServiceTypeDetails>(serviceType.length));
        }
        for (AwsEc2VpcEndpointServiceServiceTypeDetails ele : serviceType) {
            this.serviceType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types for the service.
     * </p>
     * 
     * @param serviceType
     *        The types for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcEndpointServiceDetails withServiceType(java.util.Collection<AwsEc2VpcEndpointServiceServiceTypeDetails> serviceType) {
        setServiceType(serviceType);
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
        if (getAcceptanceRequired() != null)
            sb.append("AcceptanceRequired: ").append(getAcceptanceRequired()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getBaseEndpointDnsNames() != null)
            sb.append("BaseEndpointDnsNames: ").append(getBaseEndpointDnsNames()).append(",");
        if (getManagesVpcEndpoints() != null)
            sb.append("ManagesVpcEndpoints: ").append(getManagesVpcEndpoints()).append(",");
        if (getGatewayLoadBalancerArns() != null)
            sb.append("GatewayLoadBalancerArns: ").append(getGatewayLoadBalancerArns()).append(",");
        if (getNetworkLoadBalancerArns() != null)
            sb.append("NetworkLoadBalancerArns: ").append(getNetworkLoadBalancerArns()).append(",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: ").append(getPrivateDnsName()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getServiceState() != null)
            sb.append("ServiceState: ").append(getServiceState()).append(",");
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2VpcEndpointServiceDetails == false)
            return false;
        AwsEc2VpcEndpointServiceDetails other = (AwsEc2VpcEndpointServiceDetails) obj;
        if (other.getAcceptanceRequired() == null ^ this.getAcceptanceRequired() == null)
            return false;
        if (other.getAcceptanceRequired() != null && other.getAcceptanceRequired().equals(this.getAcceptanceRequired()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getBaseEndpointDnsNames() == null ^ this.getBaseEndpointDnsNames() == null)
            return false;
        if (other.getBaseEndpointDnsNames() != null && other.getBaseEndpointDnsNames().equals(this.getBaseEndpointDnsNames()) == false)
            return false;
        if (other.getManagesVpcEndpoints() == null ^ this.getManagesVpcEndpoints() == null)
            return false;
        if (other.getManagesVpcEndpoints() != null && other.getManagesVpcEndpoints().equals(this.getManagesVpcEndpoints()) == false)
            return false;
        if (other.getGatewayLoadBalancerArns() == null ^ this.getGatewayLoadBalancerArns() == null)
            return false;
        if (other.getGatewayLoadBalancerArns() != null && other.getGatewayLoadBalancerArns().equals(this.getGatewayLoadBalancerArns()) == false)
            return false;
        if (other.getNetworkLoadBalancerArns() == null ^ this.getNetworkLoadBalancerArns() == null)
            return false;
        if (other.getNetworkLoadBalancerArns() != null && other.getNetworkLoadBalancerArns().equals(this.getNetworkLoadBalancerArns()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceState() == null ^ this.getServiceState() == null)
            return false;
        if (other.getServiceState() != null && other.getServiceState().equals(this.getServiceState()) == false)
            return false;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptanceRequired() == null) ? 0 : getAcceptanceRequired().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getBaseEndpointDnsNames() == null) ? 0 : getBaseEndpointDnsNames().hashCode());
        hashCode = prime * hashCode + ((getManagesVpcEndpoints() == null) ? 0 : getManagesVpcEndpoints().hashCode());
        hashCode = prime * hashCode + ((getGatewayLoadBalancerArns() == null) ? 0 : getGatewayLoadBalancerArns().hashCode());
        hashCode = prime * hashCode + ((getNetworkLoadBalancerArns() == null) ? 0 : getNetworkLoadBalancerArns().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceState() == null) ? 0 : getServiceState().hashCode());
        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2VpcEndpointServiceDetails clone() {
        try {
            return (AwsEc2VpcEndpointServiceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2VpcEndpointServiceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
