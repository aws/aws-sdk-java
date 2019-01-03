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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverEndpointIpAddress"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateResolverEndpointIpAddressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resolver endpoint that you want to associate IP addresses with.
     * </p>
     */
    private String resolverEndpointId;
    /**
     * <p>
     * Either the IPv4 address that you want to add to a resolver endpoint or a subnet ID. If you specify a subnet ID,
     * Resolver chooses an IP address for you from the available IPs in the specified subnet.
     * </p>
     */
    private IpAddressUpdate ipAddress;

    /**
     * <p>
     * The ID of the resolver endpoint that you want to associate IP addresses with.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the resolver endpoint that you want to associate IP addresses with.
     */

    public void setResolverEndpointId(String resolverEndpointId) {
        this.resolverEndpointId = resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the resolver endpoint that you want to associate IP addresses with.
     * </p>
     * 
     * @return The ID of the resolver endpoint that you want to associate IP addresses with.
     */

    public String getResolverEndpointId() {
        return this.resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the resolver endpoint that you want to associate IP addresses with.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the resolver endpoint that you want to associate IP addresses with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResolverEndpointIpAddressRequest withResolverEndpointId(String resolverEndpointId) {
        setResolverEndpointId(resolverEndpointId);
        return this;
    }

    /**
     * <p>
     * Either the IPv4 address that you want to add to a resolver endpoint or a subnet ID. If you specify a subnet ID,
     * Resolver chooses an IP address for you from the available IPs in the specified subnet.
     * </p>
     * 
     * @param ipAddress
     *        Either the IPv4 address that you want to add to a resolver endpoint or a subnet ID. If you specify a
     *        subnet ID, Resolver chooses an IP address for you from the available IPs in the specified subnet.
     */

    public void setIpAddress(IpAddressUpdate ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * Either the IPv4 address that you want to add to a resolver endpoint or a subnet ID. If you specify a subnet ID,
     * Resolver chooses an IP address for you from the available IPs in the specified subnet.
     * </p>
     * 
     * @return Either the IPv4 address that you want to add to a resolver endpoint or a subnet ID. If you specify a
     *         subnet ID, Resolver chooses an IP address for you from the available IPs in the specified subnet.
     */

    public IpAddressUpdate getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * Either the IPv4 address that you want to add to a resolver endpoint or a subnet ID. If you specify a subnet ID,
     * Resolver chooses an IP address for you from the available IPs in the specified subnet.
     * </p>
     * 
     * @param ipAddress
     *        Either the IPv4 address that you want to add to a resolver endpoint or a subnet ID. If you specify a
     *        subnet ID, Resolver chooses an IP address for you from the available IPs in the specified subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResolverEndpointIpAddressRequest withIpAddress(IpAddressUpdate ipAddress) {
        setIpAddress(ipAddress);
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
        if (getResolverEndpointId() != null)
            sb.append("ResolverEndpointId: ").append(getResolverEndpointId()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateResolverEndpointIpAddressRequest == false)
            return false;
        AssociateResolverEndpointIpAddressRequest other = (AssociateResolverEndpointIpAddressRequest) obj;
        if (other.getResolverEndpointId() == null ^ this.getResolverEndpointId() == null)
            return false;
        if (other.getResolverEndpointId() != null && other.getResolverEndpointId().equals(this.getResolverEndpointId()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverEndpointId() == null) ? 0 : getResolverEndpointId().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public AssociateResolverEndpointIpAddressRequest clone() {
        return (AssociateResolverEndpointIpAddressRequest) super.clone();
    }

}
