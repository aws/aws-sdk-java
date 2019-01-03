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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about one domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DomainSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the domain that the summary information applies to.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Indicates whether the domain is automatically renewed upon expiration.
     * </p>
     */
    private Boolean autoRenew;
    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to another party.
     * </p>
     */
    private Boolean transferLock;
    /**
     * <p>
     * Expiration date of the domain in Coordinated Universal Time (UTC).
     * </p>
     */
    private java.util.Date expiry;

    /**
     * <p>
     * The name of the domain that the summary information applies to.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that the summary information applies to.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that the summary information applies to.
     * </p>
     * 
     * @return The name of the domain that the summary information applies to.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that the summary information applies to.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that the summary information applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the domain is automatically renewed upon expiration.
     * </p>
     * 
     * @param autoRenew
     *        Indicates whether the domain is automatically renewed upon expiration.
     */

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain is automatically renewed upon expiration.
     * </p>
     * 
     * @return Indicates whether the domain is automatically renewed upon expiration.
     */

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain is automatically renewed upon expiration.
     * </p>
     * 
     * @param autoRenew
     *        Indicates whether the domain is automatically renewed upon expiration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withAutoRenew(Boolean autoRenew) {
        setAutoRenew(autoRenew);
        return this;
    }

    /**
     * <p>
     * Indicates whether the domain is automatically renewed upon expiration.
     * </p>
     * 
     * @return Indicates whether the domain is automatically renewed upon expiration.
     */

    public Boolean isAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to another party.
     * </p>
     * 
     * @param transferLock
     *        Indicates whether a domain is locked from unauthorized transfer to another party.
     */

    public void setTransferLock(Boolean transferLock) {
        this.transferLock = transferLock;
    }

    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to another party.
     * </p>
     * 
     * @return Indicates whether a domain is locked from unauthorized transfer to another party.
     */

    public Boolean getTransferLock() {
        return this.transferLock;
    }

    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to another party.
     * </p>
     * 
     * @param transferLock
     *        Indicates whether a domain is locked from unauthorized transfer to another party.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withTransferLock(Boolean transferLock) {
        setTransferLock(transferLock);
        return this;
    }

    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to another party.
     * </p>
     * 
     * @return Indicates whether a domain is locked from unauthorized transfer to another party.
     */

    public Boolean isTransferLock() {
        return this.transferLock;
    }

    /**
     * <p>
     * Expiration date of the domain in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param expiry
     *        Expiration date of the domain in Coordinated Universal Time (UTC).
     */

    public void setExpiry(java.util.Date expiry) {
        this.expiry = expiry;
    }

    /**
     * <p>
     * Expiration date of the domain in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return Expiration date of the domain in Coordinated Universal Time (UTC).
     */

    public java.util.Date getExpiry() {
        return this.expiry;
    }

    /**
     * <p>
     * Expiration date of the domain in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param expiry
     *        Expiration date of the domain in Coordinated Universal Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withExpiry(java.util.Date expiry) {
        setExpiry(expiry);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getAutoRenew() != null)
            sb.append("AutoRenew: ").append(getAutoRenew()).append(",");
        if (getTransferLock() != null)
            sb.append("TransferLock: ").append(getTransferLock()).append(",");
        if (getExpiry() != null)
            sb.append("Expiry: ").append(getExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainSummary == false)
            return false;
        DomainSummary other = (DomainSummary) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAutoRenew() == null ^ this.getAutoRenew() == null)
            return false;
        if (other.getAutoRenew() != null && other.getAutoRenew().equals(this.getAutoRenew()) == false)
            return false;
        if (other.getTransferLock() == null ^ this.getTransferLock() == null)
            return false;
        if (other.getTransferLock() != null && other.getTransferLock().equals(this.getTransferLock()) == false)
            return false;
        if (other.getExpiry() == null ^ this.getExpiry() == null)
            return false;
        if (other.getExpiry() != null && other.getExpiry().equals(this.getExpiry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAutoRenew() == null) ? 0 : getAutoRenew().hashCode());
        hashCode = prime * hashCode + ((getTransferLock() == null) ? 0 : getTransferLock().hashCode());
        hashCode = prime * hashCode + ((getExpiry() == null) ? 0 : getExpiry().hashCode());
        return hashCode;
    }

    @Override
    public DomainSummary clone() {
        try {
            return (DomainSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.DomainSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
