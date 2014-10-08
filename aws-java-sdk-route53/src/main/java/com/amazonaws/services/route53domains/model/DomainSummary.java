/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

/**
 * 
 */
public class DomainSummary implements Serializable {

    /**
     * The name of a domain. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     */
    private String domainName;

    /**
     * Indicates whether the domain is automatically renewed upon expiration.
     * <p>Type: Boolean <p>Valid values: <code>True</code> |
     * <code>False</code>
     */
    private Boolean autoRenew;

    /**
     * Indicates whether a domain is locked from unauthorized transfer to
     * another party. <p>Type: Boolean <p>Valid values: <code>True</code> |
     * <code>False</code>
     */
    private Boolean transferLock;

    /**
     * Expiration date of the domain in Coordinated Universal Time (UTC).
     * <p>Type: Long
     */
    private java.util.Date expiry;

    /**
     * The name of a domain. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @return The name of a domain. <p>Type: String
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of a domain. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The name of a domain. <p>Type: String
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of a domain. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The name of a domain. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DomainSummary withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Indicates whether the domain is automatically renewed upon expiration.
     * <p>Type: Boolean <p>Valid values: <code>True</code> |
     * <code>False</code>
     *
     * @return Indicates whether the domain is automatically renewed upon expiration.
     *         <p>Type: Boolean <p>Valid values: <code>True</code> |
     *         <code>False</code>
     */
    public Boolean isAutoRenew() {
        return autoRenew;
    }
    
    /**
     * Indicates whether the domain is automatically renewed upon expiration.
     * <p>Type: Boolean <p>Valid values: <code>True</code> |
     * <code>False</code>
     *
     * @param autoRenew Indicates whether the domain is automatically renewed upon expiration.
     *         <p>Type: Boolean <p>Valid values: <code>True</code> |
     *         <code>False</code>
     */
    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }
    
    /**
     * Indicates whether the domain is automatically renewed upon expiration.
     * <p>Type: Boolean <p>Valid values: <code>True</code> |
     * <code>False</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoRenew Indicates whether the domain is automatically renewed upon expiration.
     *         <p>Type: Boolean <p>Valid values: <code>True</code> |
     *         <code>False</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DomainSummary withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * Indicates whether the domain is automatically renewed upon expiration.
     * <p>Type: Boolean <p>Valid values: <code>True</code> |
     * <code>False</code>
     *
     * @return Indicates whether the domain is automatically renewed upon expiration.
     *         <p>Type: Boolean <p>Valid values: <code>True</code> |
     *         <code>False</code>
     */
    public Boolean getAutoRenew() {
        return autoRenew;
    }

    /**
     * Indicates whether a domain is locked from unauthorized transfer to
     * another party. <p>Type: Boolean <p>Valid values: <code>True</code> |
     * <code>False</code>
     *
     * @return Indicates whether a domain is locked from unauthorized transfer to
     *         another party. <p>Type: Boolean <p>Valid values: <code>True</code> |
     *         <code>False</code>
     */
    public Boolean isTransferLock() {
        return transferLock;
    }
    
    /**
     * Indicates whether a domain is locked from unauthorized transfer to
     * another party. <p>Type: Boolean <p>Valid values: <code>True</code> |
     * <code>False</code>
     *
     * @param transferLock Indicates whether a domain is locked from unauthorized transfer to
     *         another party. <p>Type: Boolean <p>Valid values: <code>True</code> |
     *         <code>False</code>
     */
    public void setTransferLock(Boolean transferLock) {
        this.transferLock = transferLock;
    }
    
    /**
     * Indicates whether a domain is locked from unauthorized transfer to
     * another party. <p>Type: Boolean <p>Valid values: <code>True</code> |
     * <code>False</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param transferLock Indicates whether a domain is locked from unauthorized transfer to
     *         another party. <p>Type: Boolean <p>Valid values: <code>True</code> |
     *         <code>False</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DomainSummary withTransferLock(Boolean transferLock) {
        this.transferLock = transferLock;
        return this;
    }

    /**
     * Indicates whether a domain is locked from unauthorized transfer to
     * another party. <p>Type: Boolean <p>Valid values: <code>True</code> |
     * <code>False</code>
     *
     * @return Indicates whether a domain is locked from unauthorized transfer to
     *         another party. <p>Type: Boolean <p>Valid values: <code>True</code> |
     *         <code>False</code>
     */
    public Boolean getTransferLock() {
        return transferLock;
    }

    /**
     * Expiration date of the domain in Coordinated Universal Time (UTC).
     * <p>Type: Long
     *
     * @return Expiration date of the domain in Coordinated Universal Time (UTC).
     *         <p>Type: Long
     */
    public java.util.Date getExpiry() {
        return expiry;
    }
    
    /**
     * Expiration date of the domain in Coordinated Universal Time (UTC).
     * <p>Type: Long
     *
     * @param expiry Expiration date of the domain in Coordinated Universal Time (UTC).
     *         <p>Type: Long
     */
    public void setExpiry(java.util.Date expiry) {
        this.expiry = expiry;
    }
    
    /**
     * Expiration date of the domain in Coordinated Universal Time (UTC).
     * <p>Type: Long
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expiry Expiration date of the domain in Coordinated Universal Time (UTC).
     *         <p>Type: Long
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DomainSummary withExpiry(java.util.Date expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (isAutoRenew() != null) sb.append("AutoRenew: " + isAutoRenew() + ",");
        if (isTransferLock() != null) sb.append("TransferLock: " + isTransferLock() + ",");
        if (getExpiry() != null) sb.append("Expiry: " + getExpiry() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((isAutoRenew() == null) ? 0 : isAutoRenew().hashCode()); 
        hashCode = prime * hashCode + ((isTransferLock() == null) ? 0 : isTransferLock().hashCode()); 
        hashCode = prime * hashCode + ((getExpiry() == null) ? 0 : getExpiry().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DomainSummary == false) return false;
        DomainSummary other = (DomainSummary)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.isAutoRenew() == null ^ this.isAutoRenew() == null) return false;
        if (other.isAutoRenew() != null && other.isAutoRenew().equals(this.isAutoRenew()) == false) return false; 
        if (other.isTransferLock() == null ^ this.isTransferLock() == null) return false;
        if (other.isTransferLock() != null && other.isTransferLock().equals(this.isTransferLock()) == false) return false; 
        if (other.getExpiry() == null ^ this.getExpiry() == null) return false;
        if (other.getExpiry() != null && other.getExpiry().equals(this.getExpiry()) == false) return false; 
        return true;
    }
    
}
    