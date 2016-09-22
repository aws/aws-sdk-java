/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 */
public class DomainSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Indicates whether the domain is automatically renewed upon expiration.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     */
    private Boolean autoRenew;
    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to another party.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     */
    private Boolean transferLock;
    /**
     * <p>
     * Expiration date of the domain in Coordinated Universal Time (UTC).
     * </p>
     * <p>
     * Type: Long
     * </p>
     */
    private java.util.Date expiry;

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return The name of a domain.</p>
     *         <p>
     *         Type: String
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
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
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @param autoRenew
     *        Indicates whether the domain is automatically renewed upon expiration.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Valid values: <code>True</code> | <code>False</code>
     */

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain is automatically renewed upon expiration.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @return Indicates whether the domain is automatically renewed upon expiration.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Valid values: <code>True</code> | <code>False</code>
     */

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain is automatically renewed upon expiration.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @param autoRenew
     *        Indicates whether the domain is automatically renewed upon expiration.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Valid values: <code>True</code> | <code>False</code>
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
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @return Indicates whether the domain is automatically renewed upon expiration.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Valid values: <code>True</code> | <code>False</code>
     */

    public Boolean isAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to another party.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @param transferLock
     *        Indicates whether a domain is locked from unauthorized transfer to another party.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Valid values: <code>True</code> | <code>False</code>
     */

    public void setTransferLock(Boolean transferLock) {
        this.transferLock = transferLock;
    }

    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to another party.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @return Indicates whether a domain is locked from unauthorized transfer to another party.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Valid values: <code>True</code> | <code>False</code>
     */

    public Boolean getTransferLock() {
        return this.transferLock;
    }

    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to another party.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @param transferLock
     *        Indicates whether a domain is locked from unauthorized transfer to another party.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Valid values: <code>True</code> | <code>False</code>
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
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @return Indicates whether a domain is locked from unauthorized transfer to another party.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Valid values: <code>True</code> | <code>False</code>
     */

    public Boolean isTransferLock() {
        return this.transferLock;
    }

    /**
     * <p>
     * Expiration date of the domain in Coordinated Universal Time (UTC).
     * </p>
     * <p>
     * Type: Long
     * </p>
     * 
     * @param expiry
     *        Expiration date of the domain in Coordinated Universal Time (UTC).</p>
     *        <p>
     *        Type: Long
     */

    public void setExpiry(java.util.Date expiry) {
        this.expiry = expiry;
    }

    /**
     * <p>
     * Expiration date of the domain in Coordinated Universal Time (UTC).
     * </p>
     * <p>
     * Type: Long
     * </p>
     * 
     * @return Expiration date of the domain in Coordinated Universal Time (UTC).</p>
     *         <p>
     *         Type: Long
     */

    public java.util.Date getExpiry() {
        return this.expiry;
    }

    /**
     * <p>
     * Expiration date of the domain in Coordinated Universal Time (UTC).
     * </p>
     * <p>
     * Type: Long
     * </p>
     * 
     * @param expiry
     *        Expiration date of the domain in Coordinated Universal Time (UTC).</p>
     *        <p>
     *        Type: Long
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withExpiry(java.util.Date expiry) {
        setExpiry(expiry);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("DomainName: " + getDomainName() + ",");
        if (getAutoRenew() != null)
            sb.append("AutoRenew: " + getAutoRenew() + ",");
        if (getTransferLock() != null)
            sb.append("TransferLock: " + getTransferLock() + ",");
        if (getExpiry() != null)
            sb.append("Expiry: " + getExpiry());
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
}
