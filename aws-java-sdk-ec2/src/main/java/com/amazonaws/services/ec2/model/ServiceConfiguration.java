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
 * Describes a service configuration for a VPC endpoint service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ServiceConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The type of service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceTypeDetail> serviceType;
    /**
     * <p>
     * The ID of the service.
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
     * The service state.
     * </p>
     */
    private String serviceState;
    /**
     * <p>
     * In the Availability Zones in which the service is available.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * Indicates whether requests from other AWS accounts to create an endpoint to the service must first be accepted.
     * </p>
     */
    private Boolean acceptanceRequired;
    /**
     * <p>
     * Indicates whether the service manages it's VPC Endpoints. Management of the service VPC Endpoints using the VPC
     * Endpoint API is restricted.
     * </p>
     */
    private Boolean managesVpcEndpoints;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkLoadBalancerArns;
    /**
     * <p>
     * The DNS names for the service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> baseEndpointDnsNames;
    /**
     * <p>
     * The private DNS name for the service.
     * </p>
     */
    private String privateDnsName;

    /**
     * <p>
     * The type of service.
     * </p>
     * 
     * @return The type of service.
     */

    public java.util.List<ServiceTypeDetail> getServiceType() {
        if (serviceType == null) {
            serviceType = new com.amazonaws.internal.SdkInternalList<ServiceTypeDetail>();
        }
        return serviceType;
    }

    /**
     * <p>
     * The type of service.
     * </p>
     * 
     * @param serviceType
     *        The type of service.
     */

    public void setServiceType(java.util.Collection<ServiceTypeDetail> serviceType) {
        if (serviceType == null) {
            this.serviceType = null;
            return;
        }

        this.serviceType = new com.amazonaws.internal.SdkInternalList<ServiceTypeDetail>(serviceType);
    }

    /**
     * <p>
     * The type of service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceType(java.util.Collection)} or {@link #withServiceType(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceType
     *        The type of service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withServiceType(ServiceTypeDetail... serviceType) {
        if (this.serviceType == null) {
            setServiceType(new com.amazonaws.internal.SdkInternalList<ServiceTypeDetail>(serviceType.length));
        }
        for (ServiceTypeDetail ele : serviceType) {
            this.serviceType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of service.
     * </p>
     * 
     * @param serviceType
     *        The type of service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withServiceType(java.util.Collection<ServiceTypeDetail> serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @return The ID of the service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withServiceId(String serviceId) {
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

    public ServiceConfiguration withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The service state.
     * </p>
     * 
     * @param serviceState
     *        The service state.
     * @see ServiceState
     */

    public void setServiceState(String serviceState) {
        this.serviceState = serviceState;
    }

    /**
     * <p>
     * The service state.
     * </p>
     * 
     * @return The service state.
     * @see ServiceState
     */

    public String getServiceState() {
        return this.serviceState;
    }

    /**
     * <p>
     * The service state.
     * </p>
     * 
     * @param serviceState
     *        The service state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceState
     */

    public ServiceConfiguration withServiceState(String serviceState) {
        setServiceState(serviceState);
        return this;
    }

    /**
     * <p>
     * The service state.
     * </p>
     * 
     * @param serviceState
     *        The service state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceState
     */

    public ServiceConfiguration withServiceState(ServiceState serviceState) {
        this.serviceState = serviceState.toString();
        return this;
    }

    /**
     * <p>
     * In the Availability Zones in which the service is available.
     * </p>
     * 
     * @return In the Availability Zones in which the service is available.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * In the Availability Zones in which the service is available.
     * </p>
     * 
     * @param availabilityZones
     *        In the Availability Zones in which the service is available.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * In the Availability Zones in which the service is available.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        In the Availability Zones in which the service is available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * In the Availability Zones in which the service is available.
     * </p>
     * 
     * @param availabilityZones
     *        In the Availability Zones in which the service is available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * Indicates whether requests from other AWS accounts to create an endpoint to the service must first be accepted.
     * </p>
     * 
     * @param acceptanceRequired
     *        Indicates whether requests from other AWS accounts to create an endpoint to the service must first be
     *        accepted.
     */

    public void setAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether requests from other AWS accounts to create an endpoint to the service must first be accepted.
     * </p>
     * 
     * @return Indicates whether requests from other AWS accounts to create an endpoint to the service must first be
     *         accepted.
     */

    public Boolean getAcceptanceRequired() {
        return this.acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether requests from other AWS accounts to create an endpoint to the service must first be accepted.
     * </p>
     * 
     * @param acceptanceRequired
     *        Indicates whether requests from other AWS accounts to create an endpoint to the service must first be
     *        accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withAcceptanceRequired(Boolean acceptanceRequired) {
        setAcceptanceRequired(acceptanceRequired);
        return this;
    }

    /**
     * <p>
     * Indicates whether requests from other AWS accounts to create an endpoint to the service must first be accepted.
     * </p>
     * 
     * @return Indicates whether requests from other AWS accounts to create an endpoint to the service must first be
     *         accepted.
     */

    public Boolean isAcceptanceRequired() {
        return this.acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether the service manages it's VPC Endpoints. Management of the service VPC Endpoints using the VPC
     * Endpoint API is restricted.
     * </p>
     * 
     * @param managesVpcEndpoints
     *        Indicates whether the service manages it's VPC Endpoints. Management of the service VPC Endpoints using
     *        the VPC Endpoint API is restricted.
     */

    public void setManagesVpcEndpoints(Boolean managesVpcEndpoints) {
        this.managesVpcEndpoints = managesVpcEndpoints;
    }

    /**
     * <p>
     * Indicates whether the service manages it's VPC Endpoints. Management of the service VPC Endpoints using the VPC
     * Endpoint API is restricted.
     * </p>
     * 
     * @return Indicates whether the service manages it's VPC Endpoints. Management of the service VPC Endpoints using
     *         the VPC Endpoint API is restricted.
     */

    public Boolean getManagesVpcEndpoints() {
        return this.managesVpcEndpoints;
    }

    /**
     * <p>
     * Indicates whether the service manages it's VPC Endpoints. Management of the service VPC Endpoints using the VPC
     * Endpoint API is restricted.
     * </p>
     * 
     * @param managesVpcEndpoints
     *        Indicates whether the service manages it's VPC Endpoints. Management of the service VPC Endpoints using
     *        the VPC Endpoint API is restricted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withManagesVpcEndpoints(Boolean managesVpcEndpoints) {
        setManagesVpcEndpoints(managesVpcEndpoints);
        return this;
    }

    /**
     * <p>
     * Indicates whether the service manages it's VPC Endpoints. Management of the service VPC Endpoints using the VPC
     * Endpoint API is restricted.
     * </p>
     * 
     * @return Indicates whether the service manages it's VPC Endpoints. Management of the service VPC Endpoints using
     *         the VPC Endpoint API is restricted.
     */

    public Boolean isManagesVpcEndpoints() {
        return this.managesVpcEndpoints;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
     */

    public java.util.List<String> getNetworkLoadBalancerArns() {
        if (networkLoadBalancerArns == null) {
            networkLoadBalancerArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkLoadBalancerArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
     * </p>
     * 
     * @param networkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
     */

    public void setNetworkLoadBalancerArns(java.util.Collection<String> networkLoadBalancerArns) {
        if (networkLoadBalancerArns == null) {
            this.networkLoadBalancerArns = null;
            return;
        }

        this.networkLoadBalancerArns = new com.amazonaws.internal.SdkInternalList<String>(networkLoadBalancerArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkLoadBalancerArns(java.util.Collection)} or
     * {@link #withNetworkLoadBalancerArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withNetworkLoadBalancerArns(String... networkLoadBalancerArns) {
        if (this.networkLoadBalancerArns == null) {
            setNetworkLoadBalancerArns(new com.amazonaws.internal.SdkInternalList<String>(networkLoadBalancerArns.length));
        }
        for (String ele : networkLoadBalancerArns) {
            this.networkLoadBalancerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
     * </p>
     * 
     * @param networkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withNetworkLoadBalancerArns(java.util.Collection<String> networkLoadBalancerArns) {
        setNetworkLoadBalancerArns(networkLoadBalancerArns);
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
        if (baseEndpointDnsNames == null) {
            baseEndpointDnsNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
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

        this.baseEndpointDnsNames = new com.amazonaws.internal.SdkInternalList<String>(baseEndpointDnsNames);
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

    public ServiceConfiguration withBaseEndpointDnsNames(String... baseEndpointDnsNames) {
        if (this.baseEndpointDnsNames == null) {
            setBaseEndpointDnsNames(new com.amazonaws.internal.SdkInternalList<String>(baseEndpointDnsNames.length));
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

    public ServiceConfiguration withBaseEndpointDnsNames(java.util.Collection<String> baseEndpointDnsNames) {
        setBaseEndpointDnsNames(baseEndpointDnsNames);
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

    public ServiceConfiguration withPrivateDnsName(String privateDnsName) {
        setPrivateDnsName(privateDnsName);
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
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getServiceState() != null)
            sb.append("ServiceState: ").append(getServiceState()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getAcceptanceRequired() != null)
            sb.append("AcceptanceRequired: ").append(getAcceptanceRequired()).append(",");
        if (getManagesVpcEndpoints() != null)
            sb.append("ManagesVpcEndpoints: ").append(getManagesVpcEndpoints()).append(",");
        if (getNetworkLoadBalancerArns() != null)
            sb.append("NetworkLoadBalancerArns: ").append(getNetworkLoadBalancerArns()).append(",");
        if (getBaseEndpointDnsNames() != null)
            sb.append("BaseEndpointDnsNames: ").append(getBaseEndpointDnsNames()).append(",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: ").append(getPrivateDnsName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceConfiguration == false)
            return false;
        ServiceConfiguration other = (ServiceConfiguration) obj;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
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
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getAcceptanceRequired() == null ^ this.getAcceptanceRequired() == null)
            return false;
        if (other.getAcceptanceRequired() != null && other.getAcceptanceRequired().equals(this.getAcceptanceRequired()) == false)
            return false;
        if (other.getManagesVpcEndpoints() == null ^ this.getManagesVpcEndpoints() == null)
            return false;
        if (other.getManagesVpcEndpoints() != null && other.getManagesVpcEndpoints().equals(this.getManagesVpcEndpoints()) == false)
            return false;
        if (other.getNetworkLoadBalancerArns() == null ^ this.getNetworkLoadBalancerArns() == null)
            return false;
        if (other.getNetworkLoadBalancerArns() != null && other.getNetworkLoadBalancerArns().equals(this.getNetworkLoadBalancerArns()) == false)
            return false;
        if (other.getBaseEndpointDnsNames() == null ^ this.getBaseEndpointDnsNames() == null)
            return false;
        if (other.getBaseEndpointDnsNames() != null && other.getBaseEndpointDnsNames().equals(this.getBaseEndpointDnsNames()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceState() == null) ? 0 : getServiceState().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getAcceptanceRequired() == null) ? 0 : getAcceptanceRequired().hashCode());
        hashCode = prime * hashCode + ((getManagesVpcEndpoints() == null) ? 0 : getManagesVpcEndpoints().hashCode());
        hashCode = prime * hashCode + ((getNetworkLoadBalancerArns() == null) ? 0 : getNetworkLoadBalancerArns().hashCode());
        hashCode = prime * hashCode + ((getBaseEndpointDnsNames() == null) ? 0 : getBaseEndpointDnsNames().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        return hashCode;
    }

    @Override
    public ServiceConfiguration clone() {
        try {
            return (ServiceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
