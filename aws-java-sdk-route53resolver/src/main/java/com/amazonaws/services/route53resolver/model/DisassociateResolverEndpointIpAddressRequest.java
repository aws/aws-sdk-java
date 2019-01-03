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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverEndpointIpAddress"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateResolverEndpointIpAddressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resolver endpoint that you want to disassociate an IP address from.
     * </p>
     */
    private String resolverEndpointId;
    /**
     * <p>
     * The IPv4 address that you want to remove from a resolver endpoint.
     * </p>
     */
    private IpAddressUpdate ipAddress;

    /**
     * <p>
     * The ID of the resolver endpoint that you want to disassociate an IP address from.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the resolver endpoint that you want to disassociate an IP address from.
     */

    public void setResolverEndpointId(String resolverEndpointId) {
        this.resolverEndpointId = resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the resolver endpoint that you want to disassociate an IP address from.
     * </p>
     * 
     * @return The ID of the resolver endpoint that you want to disassociate an IP address from.
     */

    public String getResolverEndpointId() {
        return this.resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the resolver endpoint that you want to disassociate an IP address from.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the resolver endpoint that you want to disassociate an IP address from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResolverEndpointIpAddressRequest withResolverEndpointId(String resolverEndpointId) {
        setResolverEndpointId(resolverEndpointId);
        return this;
    }

    /**
     * <p>
     * The IPv4 address that you want to remove from a resolver endpoint.
     * </p>
     * 
     * @param ipAddress
     *        The IPv4 address that you want to remove from a resolver endpoint.
     */

    public void setIpAddress(IpAddressUpdate ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IPv4 address that you want to remove from a resolver endpoint.
     * </p>
     * 
     * @return The IPv4 address that you want to remove from a resolver endpoint.
     */

    public IpAddressUpdate getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IPv4 address that you want to remove from a resolver endpoint.
     * </p>
     * 
     * @param ipAddress
     *        The IPv4 address that you want to remove from a resolver endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResolverEndpointIpAddressRequest withIpAddress(IpAddressUpdate ipAddress) {
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

        if (obj instanceof DisassociateResolverEndpointIpAddressRequest == false)
            return false;
        DisassociateResolverEndpointIpAddressRequest other = (DisassociateResolverEndpointIpAddressRequest) obj;
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
    public DisassociateResolverEndpointIpAddressRequest clone() {
        return (DisassociateResolverEndpointIpAddressRequest) super.clone();
    }

}
