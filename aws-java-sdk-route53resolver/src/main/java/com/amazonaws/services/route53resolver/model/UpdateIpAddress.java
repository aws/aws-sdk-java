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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the IP address type in response to <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_UpdateResolverEndpoint.html"
 * >UpdateResolverEndpoint</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateIpAddress" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIpAddress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the IP address, specified by the <code>ResolverEndpointId</code>.
     * </p>
     */
    private String ipId;
    /**
     * <p>
     * The IPv6 address that you want to use for DNS queries.
     * </p>
     */
    private String ipv6;

    /**
     * <p>
     * The ID of the IP address, specified by the <code>ResolverEndpointId</code>.
     * </p>
     * 
     * @param ipId
     *        The ID of the IP address, specified by the <code>ResolverEndpointId</code>.
     */

    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    /**
     * <p>
     * The ID of the IP address, specified by the <code>ResolverEndpointId</code>.
     * </p>
     * 
     * @return The ID of the IP address, specified by the <code>ResolverEndpointId</code>.
     */

    public String getIpId() {
        return this.ipId;
    }

    /**
     * <p>
     * The ID of the IP address, specified by the <code>ResolverEndpointId</code>.
     * </p>
     * 
     * @param ipId
     *        The ID of the IP address, specified by the <code>ResolverEndpointId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpAddress withIpId(String ipId) {
        setIpId(ipId);
        return this;
    }

    /**
     * <p>
     * The IPv6 address that you want to use for DNS queries.
     * </p>
     * 
     * @param ipv6
     *        The IPv6 address that you want to use for DNS queries.
     */

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    /**
     * <p>
     * The IPv6 address that you want to use for DNS queries.
     * </p>
     * 
     * @return The IPv6 address that you want to use for DNS queries.
     */

    public String getIpv6() {
        return this.ipv6;
    }

    /**
     * <p>
     * The IPv6 address that you want to use for DNS queries.
     * </p>
     * 
     * @param ipv6
     *        The IPv6 address that you want to use for DNS queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpAddress withIpv6(String ipv6) {
        setIpv6(ipv6);
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
        if (getIpId() != null)
            sb.append("IpId: ").append(getIpId()).append(",");
        if (getIpv6() != null)
            sb.append("Ipv6: ").append(getIpv6());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIpAddress == false)
            return false;
        UpdateIpAddress other = (UpdateIpAddress) obj;
        if (other.getIpId() == null ^ this.getIpId() == null)
            return false;
        if (other.getIpId() != null && other.getIpId().equals(this.getIpId()) == false)
            return false;
        if (other.getIpv6() == null ^ this.getIpv6() == null)
            return false;
        if (other.getIpv6() != null && other.getIpv6().equals(this.getIpv6()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpId() == null) ? 0 : getIpId().hashCode());
        hashCode = prime * hashCode + ((getIpv6() == null) ? 0 : getIpv6().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIpAddress clone() {
        try {
            return (UpdateIpAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.UpdateIpAddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
