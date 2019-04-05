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
 * An object representing the DNS service discovery information for your virtual node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DnsServiceDiscovery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsServiceDiscovery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the DNS service discovery hostname for the virtual node.
     * </p>
     */
    private String hostname;

    /**
     * <p>
     * Specifies the DNS service discovery hostname for the virtual node.
     * </p>
     * 
     * @param hostname
     *        Specifies the DNS service discovery hostname for the virtual node.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * Specifies the DNS service discovery hostname for the virtual node.
     * </p>
     * 
     * @return Specifies the DNS service discovery hostname for the virtual node.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * Specifies the DNS service discovery hostname for the virtual node.
     * </p>
     * 
     * @param hostname
     *        Specifies the DNS service discovery hostname for the virtual node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsServiceDiscovery withHostname(String hostname) {
        setHostname(hostname);
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
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsServiceDiscovery == false)
            return false;
        DnsServiceDiscovery other = (DnsServiceDiscovery) obj;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        return hashCode;
    }

    @Override
    public DnsServiceDiscovery clone() {
        try {
            return (DnsServiceDiscovery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.DnsServiceDiscoveryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
