/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a VPC endpoint connection to a service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpcEndpointConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcEndpointConnection implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the service to which the endpoint is connected.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * The AWS account ID of the owner of the VPC endpoint.
     * </p>
     */
    private String vpcEndpointOwner;
    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     */
    private String vpcEndpointState;
    /**
     * <p>
     * The date and time that the VPC endpoint was created.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The DNS entries for the VPC endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DnsEntry> dnsEntries;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network load balancers for the service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkLoadBalancerArns;

    /**
     * <p>
     * The ID of the service to which the endpoint is connected.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service to which the endpoint is connected.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service to which the endpoint is connected.
     * </p>
     * 
     * @return The ID of the service to which the endpoint is connected.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the service to which the endpoint is connected.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service to which the endpoint is connected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointConnection withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

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

    public VpcEndpointConnection withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the VPC endpoint.
     * </p>
     * 
     * @param vpcEndpointOwner
     *        The AWS account ID of the owner of the VPC endpoint.
     */

    public void setVpcEndpointOwner(String vpcEndpointOwner) {
        this.vpcEndpointOwner = vpcEndpointOwner;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the VPC endpoint.
     * </p>
     * 
     * @return The AWS account ID of the owner of the VPC endpoint.
     */

    public String getVpcEndpointOwner() {
        return this.vpcEndpointOwner;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the VPC endpoint.
     * </p>
     * 
     * @param vpcEndpointOwner
     *        The AWS account ID of the owner of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointConnection withVpcEndpointOwner(String vpcEndpointOwner) {
        setVpcEndpointOwner(vpcEndpointOwner);
        return this;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @param vpcEndpointState
     *        The state of the VPC endpoint.
     * @see State
     */

    public void setVpcEndpointState(String vpcEndpointState) {
        this.vpcEndpointState = vpcEndpointState;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @return The state of the VPC endpoint.
     * @see State
     */

    public String getVpcEndpointState() {
        return this.vpcEndpointState;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @param vpcEndpointState
     *        The state of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public VpcEndpointConnection withVpcEndpointState(String vpcEndpointState) {
        setVpcEndpointState(vpcEndpointState);
        return this;
    }

    /**
     * <p>
     * The state of the VPC endpoint.
     * </p>
     * 
     * @param vpcEndpointState
     *        The state of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public VpcEndpointConnection withVpcEndpointState(State vpcEndpointState) {
        this.vpcEndpointState = vpcEndpointState.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the VPC endpoint was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The date and time that the VPC endpoint was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The date and time that the VPC endpoint was created.
     * </p>
     * 
     * @return The date and time that the VPC endpoint was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The date and time that the VPC endpoint was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The date and time that the VPC endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointConnection withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The DNS entries for the VPC endpoint.
     * </p>
     * 
     * @return The DNS entries for the VPC endpoint.
     */

    public java.util.List<DnsEntry> getDnsEntries() {
        if (dnsEntries == null) {
            dnsEntries = new com.amazonaws.internal.SdkInternalList<DnsEntry>();
        }
        return dnsEntries;
    }

    /**
     * <p>
     * The DNS entries for the VPC endpoint.
     * </p>
     * 
     * @param dnsEntries
     *        The DNS entries for the VPC endpoint.
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
     * The DNS entries for the VPC endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsEntries(java.util.Collection)} or {@link #withDnsEntries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsEntries
     *        The DNS entries for the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointConnection withDnsEntries(DnsEntry... dnsEntries) {
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
     * The DNS entries for the VPC endpoint.
     * </p>
     * 
     * @param dnsEntries
     *        The DNS entries for the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointConnection withDnsEntries(java.util.Collection<DnsEntry> dnsEntries) {
        setDnsEntries(dnsEntries);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network load balancers for the service.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the network load balancers for the service.
     */

    public java.util.List<String> getNetworkLoadBalancerArns() {
        if (networkLoadBalancerArns == null) {
            networkLoadBalancerArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkLoadBalancerArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network load balancers for the service.
     * </p>
     * 
     * @param networkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of the network load balancers for the service.
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
     * The Amazon Resource Names (ARNs) of the network load balancers for the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkLoadBalancerArns(java.util.Collection)} or
     * {@link #withNetworkLoadBalancerArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of the network load balancers for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointConnection withNetworkLoadBalancerArns(String... networkLoadBalancerArns) {
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
     * The Amazon Resource Names (ARNs) of the network load balancers for the service.
     * </p>
     * 
     * @param networkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of the network load balancers for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointConnection withNetworkLoadBalancerArns(java.util.Collection<String> networkLoadBalancerArns) {
        setNetworkLoadBalancerArns(networkLoadBalancerArns);
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
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getVpcEndpointOwner() != null)
            sb.append("VpcEndpointOwner: ").append(getVpcEndpointOwner()).append(",");
        if (getVpcEndpointState() != null)
            sb.append("VpcEndpointState: ").append(getVpcEndpointState()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getDnsEntries() != null)
            sb.append("DnsEntries: ").append(getDnsEntries()).append(",");
        if (getNetworkLoadBalancerArns() != null)
            sb.append("NetworkLoadBalancerArns: ").append(getNetworkLoadBalancerArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcEndpointConnection == false)
            return false;
        VpcEndpointConnection other = (VpcEndpointConnection) obj;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getVpcEndpointOwner() == null ^ this.getVpcEndpointOwner() == null)
            return false;
        if (other.getVpcEndpointOwner() != null && other.getVpcEndpointOwner().equals(this.getVpcEndpointOwner()) == false)
            return false;
        if (other.getVpcEndpointState() == null ^ this.getVpcEndpointState() == null)
            return false;
        if (other.getVpcEndpointState() != null && other.getVpcEndpointState().equals(this.getVpcEndpointState()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getDnsEntries() == null ^ this.getDnsEntries() == null)
            return false;
        if (other.getDnsEntries() != null && other.getDnsEntries().equals(this.getDnsEntries()) == false)
            return false;
        if (other.getNetworkLoadBalancerArns() == null ^ this.getNetworkLoadBalancerArns() == null)
            return false;
        if (other.getNetworkLoadBalancerArns() != null && other.getNetworkLoadBalancerArns().equals(this.getNetworkLoadBalancerArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointOwner() == null) ? 0 : getVpcEndpointOwner().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointState() == null) ? 0 : getVpcEndpointState().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDnsEntries() == null) ? 0 : getDnsEntries().hashCode());
        hashCode = prime * hashCode + ((getNetworkLoadBalancerArns() == null) ? 0 : getNetworkLoadBalancerArns().hashCode());
        return hashCode;
    }

    @Override
    public VpcEndpointConnection clone() {
        try {
            return (VpcEndpointConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
