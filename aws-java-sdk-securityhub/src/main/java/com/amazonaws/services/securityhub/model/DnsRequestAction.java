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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provided if <code>ActionType</code> is <code>DNS_REQUEST</code>. It provides details about the DNS request that was
 * detected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DnsRequestAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsRequestAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DNS domain that is associated with the DNS request.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The protocol that was used for the DNS request.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * Indicates whether the DNS request was blocked.
     * </p>
     */
    private Boolean blocked;

    /**
     * <p>
     * The DNS domain that is associated with the DNS request.
     * </p>
     * 
     * @param domain
     *        The DNS domain that is associated with the DNS request.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The DNS domain that is associated with the DNS request.
     * </p>
     * 
     * @return The DNS domain that is associated with the DNS request.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The DNS domain that is associated with the DNS request.
     * </p>
     * 
     * @param domain
     *        The DNS domain that is associated with the DNS request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRequestAction withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The protocol that was used for the DNS request.
     * </p>
     * 
     * @param protocol
     *        The protocol that was used for the DNS request.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol that was used for the DNS request.
     * </p>
     * 
     * @return The protocol that was used for the DNS request.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol that was used for the DNS request.
     * </p>
     * 
     * @param protocol
     *        The protocol that was used for the DNS request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRequestAction withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DNS request was blocked.
     * </p>
     * 
     * @param blocked
     *        Indicates whether the DNS request was blocked.
     */

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * <p>
     * Indicates whether the DNS request was blocked.
     * </p>
     * 
     * @return Indicates whether the DNS request was blocked.
     */

    public Boolean getBlocked() {
        return this.blocked;
    }

    /**
     * <p>
     * Indicates whether the DNS request was blocked.
     * </p>
     * 
     * @param blocked
     *        Indicates whether the DNS request was blocked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRequestAction withBlocked(Boolean blocked) {
        setBlocked(blocked);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DNS request was blocked.
     * </p>
     * 
     * @return Indicates whether the DNS request was blocked.
     */

    public Boolean isBlocked() {
        return this.blocked;
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getBlocked() != null)
            sb.append("Blocked: ").append(getBlocked());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsRequestAction == false)
            return false;
        DnsRequestAction other = (DnsRequestAction) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getBlocked() == null ^ this.getBlocked() == null)
            return false;
        if (other.getBlocked() != null && other.getBlocked().equals(this.getBlocked()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getBlocked() == null) ? 0 : getBlocked().hashCode());
        return hashCode;
    }

    @Override
    public DnsRequestAction clone() {
        try {
            return (DnsRequestAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.DnsRequestActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
