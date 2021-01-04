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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifySubnetAttributeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySubnetAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifySubnetAttributeRequest> {

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be assigned
     * an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the
     * instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an
     * IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     */
    private Boolean assignIpv6AddressOnCreation;
    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a public IPv4 address.
     * </p>
     */
    private Boolean mapPublicIpOnLaunch;
    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a customer-owned IPv4 address.
     * </p>
     * <p>
     * When this value is <code>true</code>, you must specify the customer-owned IP pool using
     * <code>CustomerOwnedIpv4Pool</code>.
     * </p>
     */
    private Boolean mapCustomerOwnedIpOnLaunch;
    /**
     * <p>
     * The customer-owned IPv4 address pool associated with the subnet.
     * </p>
     * <p>
     * You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     * </p>
     */
    private String customerOwnedIpv4Pool;

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be assigned
     * an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the
     * instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an
     * IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     * 
     * @param assignIpv6AddressOnCreation
     *        Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be
     *        assigned an IPv6 address. This includes a network interface that's created when launching an instance into
     *        the subnet (the instance therefore receives an IPv6 address). </p>
     *        <p>
     *        If you enable the IPv6 addressing feature for your subnet, your network interface or instance only
     *        receives an IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2
     *        API.
     */

    public void setAssignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be assigned
     * an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the
     * instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an
     * IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be
     *         assigned an IPv6 address. This includes a network interface that's created when launching an instance
     *         into the subnet (the instance therefore receives an IPv6 address). </p>
     *         <p>
     *         If you enable the IPv6 addressing feature for your subnet, your network interface or instance only
     *         receives an IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2
     *         API.
     */

    public Boolean getAssignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be assigned
     * an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the
     * instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an
     * IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     * 
     * @param assignIpv6AddressOnCreation
     *        Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be
     *        assigned an IPv6 address. This includes a network interface that's created when launching an instance into
     *        the subnet (the instance therefore receives an IPv6 address). </p>
     *        <p>
     *        If you enable the IPv6 addressing feature for your subnet, your network interface or instance only
     *        receives an IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2
     *        API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withAssignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
        setAssignIpv6AddressOnCreation(assignIpv6AddressOnCreation);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be assigned
     * an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the
     * instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an
     * IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be
     *         assigned an IPv6 address. This includes a network interface that's created when launching an instance
     *         into the subnet (the instance therefore receives an IPv6 address). </p>
     *         <p>
     *         If you enable the IPv6 addressing feature for your subnet, your network interface or instance only
     *         receives an IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2
     *         API.
     */

    public Boolean isAssignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a public IPv4 address.
     * </p>
     * 
     * @param mapPublicIpOnLaunch
     *        Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *        specified subnet should be assigned a public IPv4 address.
     */

    public void setMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a public IPv4 address.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *         specified subnet should be assigned a public IPv4 address.
     */

    public Boolean getMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a public IPv4 address.
     * </p>
     * 
     * @param mapPublicIpOnLaunch
     *        Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *        specified subnet should be assigned a public IPv4 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        setMapPublicIpOnLaunch(mapPublicIpOnLaunch);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a public IPv4 address.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *         specified subnet should be assigned a public IPv4 address.
     */

    public Boolean isMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @return The ID of the subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a customer-owned IPv4 address.
     * </p>
     * <p>
     * When this value is <code>true</code>, you must specify the customer-owned IP pool using
     * <code>CustomerOwnedIpv4Pool</code>.
     * </p>
     * 
     * @param mapCustomerOwnedIpOnLaunch
     *        Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *        specified subnet should be assigned a customer-owned IPv4 address.</p>
     *        <p>
     *        When this value is <code>true</code>, you must specify the customer-owned IP pool using
     *        <code>CustomerOwnedIpv4Pool</code>.
     */

    public void setMapCustomerOwnedIpOnLaunch(Boolean mapCustomerOwnedIpOnLaunch) {
        this.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a customer-owned IPv4 address.
     * </p>
     * <p>
     * When this value is <code>true</code>, you must specify the customer-owned IP pool using
     * <code>CustomerOwnedIpv4Pool</code>.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *         specified subnet should be assigned a customer-owned IPv4 address.</p>
     *         <p>
     *         When this value is <code>true</code>, you must specify the customer-owned IP pool using
     *         <code>CustomerOwnedIpv4Pool</code>.
     */

    public Boolean getMapCustomerOwnedIpOnLaunch() {
        return this.mapCustomerOwnedIpOnLaunch;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a customer-owned IPv4 address.
     * </p>
     * <p>
     * When this value is <code>true</code>, you must specify the customer-owned IP pool using
     * <code>CustomerOwnedIpv4Pool</code>.
     * </p>
     * 
     * @param mapCustomerOwnedIpOnLaunch
     *        Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *        specified subnet should be assigned a customer-owned IPv4 address.</p>
     *        <p>
     *        When this value is <code>true</code>, you must specify the customer-owned IP pool using
     *        <code>CustomerOwnedIpv4Pool</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withMapCustomerOwnedIpOnLaunch(Boolean mapCustomerOwnedIpOnLaunch) {
        setMapCustomerOwnedIpOnLaunch(mapCustomerOwnedIpOnLaunch);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a customer-owned IPv4 address.
     * </p>
     * <p>
     * When this value is <code>true</code>, you must specify the customer-owned IP pool using
     * <code>CustomerOwnedIpv4Pool</code>.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *         specified subnet should be assigned a customer-owned IPv4 address.</p>
     *         <p>
     *         When this value is <code>true</code>, you must specify the customer-owned IP pool using
     *         <code>CustomerOwnedIpv4Pool</code>.
     */

    public Boolean isMapCustomerOwnedIpOnLaunch() {
        return this.mapCustomerOwnedIpOnLaunch;
    }

    /**
     * <p>
     * The customer-owned IPv4 address pool associated with the subnet.
     * </p>
     * <p>
     * You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     * </p>
     * 
     * @param customerOwnedIpv4Pool
     *        The customer-owned IPv4 address pool associated with the subnet.</p>
     *        <p>
     *        You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     */

    public void setCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The customer-owned IPv4 address pool associated with the subnet.
     * </p>
     * <p>
     * You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     * </p>
     * 
     * @return The customer-owned IPv4 address pool associated with the subnet.</p>
     *         <p>
     *         You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     */

    public String getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The customer-owned IPv4 address pool associated with the subnet.
     * </p>
     * <p>
     * You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     * </p>
     * 
     * @param customerOwnedIpv4Pool
     *        The customer-owned IPv4 address pool associated with the subnet.</p>
     *        <p>
     *        You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        setCustomerOwnedIpv4Pool(customerOwnedIpv4Pool);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifySubnetAttributeRequest> getDryRunRequest() {
        Request<ModifySubnetAttributeRequest> request = new ModifySubnetAttributeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getAssignIpv6AddressOnCreation() != null)
            sb.append("AssignIpv6AddressOnCreation: ").append(getAssignIpv6AddressOnCreation()).append(",");
        if (getMapPublicIpOnLaunch() != null)
            sb.append("MapPublicIpOnLaunch: ").append(getMapPublicIpOnLaunch()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getMapCustomerOwnedIpOnLaunch() != null)
            sb.append("MapCustomerOwnedIpOnLaunch: ").append(getMapCustomerOwnedIpOnLaunch()).append(",");
        if (getCustomerOwnedIpv4Pool() != null)
            sb.append("CustomerOwnedIpv4Pool: ").append(getCustomerOwnedIpv4Pool());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySubnetAttributeRequest == false)
            return false;
        ModifySubnetAttributeRequest other = (ModifySubnetAttributeRequest) obj;
        if (other.getAssignIpv6AddressOnCreation() == null ^ this.getAssignIpv6AddressOnCreation() == null)
            return false;
        if (other.getAssignIpv6AddressOnCreation() != null && other.getAssignIpv6AddressOnCreation().equals(this.getAssignIpv6AddressOnCreation()) == false)
            return false;
        if (other.getMapPublicIpOnLaunch() == null ^ this.getMapPublicIpOnLaunch() == null)
            return false;
        if (other.getMapPublicIpOnLaunch() != null && other.getMapPublicIpOnLaunch().equals(this.getMapPublicIpOnLaunch()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getMapCustomerOwnedIpOnLaunch() == null ^ this.getMapCustomerOwnedIpOnLaunch() == null)
            return false;
        if (other.getMapCustomerOwnedIpOnLaunch() != null && other.getMapCustomerOwnedIpOnLaunch().equals(this.getMapCustomerOwnedIpOnLaunch()) == false)
            return false;
        if (other.getCustomerOwnedIpv4Pool() == null ^ this.getCustomerOwnedIpv4Pool() == null)
            return false;
        if (other.getCustomerOwnedIpv4Pool() != null && other.getCustomerOwnedIpv4Pool().equals(this.getCustomerOwnedIpv4Pool()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssignIpv6AddressOnCreation() == null) ? 0 : getAssignIpv6AddressOnCreation().hashCode());
        hashCode = prime * hashCode + ((getMapPublicIpOnLaunch() == null) ? 0 : getMapPublicIpOnLaunch().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getMapCustomerOwnedIpOnLaunch() == null) ? 0 : getMapCustomerOwnedIpOnLaunch().hashCode());
        hashCode = prime * hashCode + ((getCustomerOwnedIpv4Pool() == null) ? 0 : getCustomerOwnedIpv4Pool().hashCode());
        return hashCode;
    }

    @Override
    public ModifySubnetAttributeRequest clone() {
        return (ModifySubnetAttributeRequest) super.clone();
    }
}
