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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * In an <a>CreateResolverEndpoint</a> request, a subnet and IP address that you want to use for DNS queries.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/IpAddressRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpAddressRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subnet that contains the IP address.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The IP address that you want to use for DNS queries.
     * </p>
     */
    private String ip;

    /**
     * <p>
     * The subnet that contains the IP address.
     * </p>
     * 
     * @param subnetId
     *        The subnet that contains the IP address.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet that contains the IP address.
     * </p>
     * 
     * @return The subnet that contains the IP address.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet that contains the IP address.
     * </p>
     * 
     * @param subnetId
     *        The subnet that contains the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The IP address that you want to use for DNS queries.
     * </p>
     * 
     * @param ip
     *        The IP address that you want to use for DNS queries.
     */

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * <p>
     * The IP address that you want to use for DNS queries.
     * </p>
     * 
     * @return The IP address that you want to use for DNS queries.
     */

    public String getIp() {
        return this.ip;
    }

    /**
     * <p>
     * The IP address that you want to use for DNS queries.
     * </p>
     * 
     * @param ip
     *        The IP address that you want to use for DNS queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressRequest withIp(String ip) {
        setIp(ip);
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
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getIp() != null)
            sb.append("Ip: ").append(getIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpAddressRequest == false)
            return false;
        IpAddressRequest other = (IpAddressRequest) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getIp() == null ^ this.getIp() == null)
            return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        return hashCode;
    }

    @Override
    public IpAddressRequest clone() {
        try {
            return (IpAddressRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.IpAddressRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
