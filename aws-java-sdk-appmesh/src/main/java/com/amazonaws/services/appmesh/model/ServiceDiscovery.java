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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the service discovery information for a virtual node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ServiceDiscovery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceDiscovery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the DNS information for the virtual node.
     * </p>
     */
    private DnsServiceDiscovery dns;

    /**
     * <p>
     * Specifies the DNS information for the virtual node.
     * </p>
     * 
     * @param dns
     *        Specifies the DNS information for the virtual node.
     */

    public void setDns(DnsServiceDiscovery dns) {
        this.dns = dns;
    }

    /**
     * <p>
     * Specifies the DNS information for the virtual node.
     * </p>
     * 
     * @return Specifies the DNS information for the virtual node.
     */

    public DnsServiceDiscovery getDns() {
        return this.dns;
    }

    /**
     * <p>
     * Specifies the DNS information for the virtual node.
     * </p>
     * 
     * @param dns
     *        Specifies the DNS information for the virtual node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDiscovery withDns(DnsServiceDiscovery dns) {
        setDns(dns);
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
        if (getDns() != null)
            sb.append("Dns: ").append(getDns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceDiscovery == false)
            return false;
        ServiceDiscovery other = (ServiceDiscovery) obj;
        if (other.getDns() == null ^ this.getDns() == null)
            return false;
        if (other.getDns() != null && other.getDns().equals(this.getDns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDns() == null) ? 0 : getDns().hashCode());
        return hashCode;
    }

    @Override
    public ServiceDiscovery clone() {
        try {
            return (ServiceDiscovery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.ServiceDiscoveryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
