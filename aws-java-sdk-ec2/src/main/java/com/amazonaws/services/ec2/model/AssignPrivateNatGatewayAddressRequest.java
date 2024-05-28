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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AssignPrivateNatGatewayAddressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignPrivateNatGatewayAddressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AssignPrivateNatGatewayAddressRequest> {

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     */
    private String natGatewayId;
    /**
     * <p>
     * The private IPv4 addresses you want to assign to the private NAT gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> privateIpAddresses;
    /**
     * <p>
     * The number of private IP addresses to assign to the NAT gateway. You can't specify this parameter when also
     * specifying private IP addresses.
     * </p>
     */
    private Integer privateIpAddressCount;

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of the NAT gateway.
     */

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @return The ID of the NAT gateway.
     */

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateNatGatewayAddressRequest withNatGatewayId(String natGatewayId) {
        setNatGatewayId(natGatewayId);
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses you want to assign to the private NAT gateway.
     * </p>
     * 
     * @return The private IPv4 addresses you want to assign to the private NAT gateway.
     */

    public java.util.List<String> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
            privateIpAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return privateIpAddresses;
    }

    /**
     * <p>
     * The private IPv4 addresses you want to assign to the private NAT gateway.
     * </p>
     * 
     * @param privateIpAddresses
     *        The private IPv4 addresses you want to assign to the private NAT gateway.
     */

    public void setPrivateIpAddresses(java.util.Collection<String> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new com.amazonaws.internal.SdkInternalList<String>(privateIpAddresses);
    }

    /**
     * <p>
     * The private IPv4 addresses you want to assign to the private NAT gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateIpAddresses(java.util.Collection)} or {@link #withPrivateIpAddresses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param privateIpAddresses
     *        The private IPv4 addresses you want to assign to the private NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateNatGatewayAddressRequest withPrivateIpAddresses(String... privateIpAddresses) {
        if (this.privateIpAddresses == null) {
            setPrivateIpAddresses(new com.amazonaws.internal.SdkInternalList<String>(privateIpAddresses.length));
        }
        for (String ele : privateIpAddresses) {
            this.privateIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses you want to assign to the private NAT gateway.
     * </p>
     * 
     * @param privateIpAddresses
     *        The private IPv4 addresses you want to assign to the private NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateNatGatewayAddressRequest withPrivateIpAddresses(java.util.Collection<String> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The number of private IP addresses to assign to the NAT gateway. You can't specify this parameter when also
     * specifying private IP addresses.
     * </p>
     * 
     * @param privateIpAddressCount
     *        The number of private IP addresses to assign to the NAT gateway. You can't specify this parameter when
     *        also specifying private IP addresses.
     */

    public void setPrivateIpAddressCount(Integer privateIpAddressCount) {
        this.privateIpAddressCount = privateIpAddressCount;
    }

    /**
     * <p>
     * The number of private IP addresses to assign to the NAT gateway. You can't specify this parameter when also
     * specifying private IP addresses.
     * </p>
     * 
     * @return The number of private IP addresses to assign to the NAT gateway. You can't specify this parameter when
     *         also specifying private IP addresses.
     */

    public Integer getPrivateIpAddressCount() {
        return this.privateIpAddressCount;
    }

    /**
     * <p>
     * The number of private IP addresses to assign to the NAT gateway. You can't specify this parameter when also
     * specifying private IP addresses.
     * </p>
     * 
     * @param privateIpAddressCount
     *        The number of private IP addresses to assign to the NAT gateway. You can't specify this parameter when
     *        also specifying private IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateNatGatewayAddressRequest withPrivateIpAddressCount(Integer privateIpAddressCount) {
        setPrivateIpAddressCount(privateIpAddressCount);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AssignPrivateNatGatewayAddressRequest> getDryRunRequest() {
        Request<AssignPrivateNatGatewayAddressRequest> request = new AssignPrivateNatGatewayAddressRequestMarshaller().marshall(this);
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
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: ").append(getNatGatewayId()).append(",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: ").append(getPrivateIpAddresses()).append(",");
        if (getPrivateIpAddressCount() != null)
            sb.append("PrivateIpAddressCount: ").append(getPrivateIpAddressCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignPrivateNatGatewayAddressRequest == false)
            return false;
        AssignPrivateNatGatewayAddressRequest other = (AssignPrivateNatGatewayAddressRequest) obj;
        if (other.getNatGatewayId() == null ^ this.getNatGatewayId() == null)
            return false;
        if (other.getNatGatewayId() != null && other.getNatGatewayId().equals(this.getNatGatewayId()) == false)
            return false;
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null)
            return false;
        if (other.getPrivateIpAddresses() != null && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false)
            return false;
        if (other.getPrivateIpAddressCount() == null ^ this.getPrivateIpAddressCount() == null)
            return false;
        if (other.getPrivateIpAddressCount() != null && other.getPrivateIpAddressCount().equals(this.getPrivateIpAddressCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddressCount() == null) ? 0 : getPrivateIpAddressCount().hashCode());
        return hashCode;
    }

    @Override
    public AssignPrivateNatGatewayAddressRequest clone() {
        return (AssignPrivateNatGatewayAddressRequest) super.clone();
    }
}
