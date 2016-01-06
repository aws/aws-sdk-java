/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a quota for an AWS account, for example, the number of DB
 * instances allowed.
 * </p>
 */
public class AccountQuota implements Serializable, Cloneable {

    /**
     * The name of the Amazon RDS quota for this AWS account.
     */
    private String accountQuotaName;

    /**
     * The amount currently used toward the quota maximum.
     */
    private Long used;

    /**
     * The maximum allowed value for the quota.
     */
    private Long max;

    /**
     * The name of the Amazon RDS quota for this AWS account.
     *
     * @return The name of the Amazon RDS quota for this AWS account.
     */
    public String getAccountQuotaName() {
        return accountQuotaName;
    }
    
    /**
     * The name of the Amazon RDS quota for this AWS account.
     *
     * @param accountQuotaName The name of the Amazon RDS quota for this AWS account.
     */
    public void setAccountQuotaName(String accountQuotaName) {
        this.accountQuotaName = accountQuotaName;
    }
    
    /**
     * The name of the Amazon RDS quota for this AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountQuotaName The name of the Amazon RDS quota for this AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AccountQuota withAccountQuotaName(String accountQuotaName) {
        this.accountQuotaName = accountQuotaName;
        return this;
    }

    /**
     * The amount currently used toward the quota maximum.
     *
     * @return The amount currently used toward the quota maximum.
     */
    public Long getUsed() {
        return used;
    }
    
    /**
     * The amount currently used toward the quota maximum.
     *
     * @param used The amount currently used toward the quota maximum.
     */
    public void setUsed(Long used) {
        this.used = used;
    }
    
    /**
     * The amount currently used toward the quota maximum.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param used The amount currently used toward the quota maximum.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AccountQuota withUsed(Long used) {
        this.used = used;
        return this;
    }

    /**
     * The maximum allowed value for the quota.
     *
     * @return The maximum allowed value for the quota.
     */
    public Long getMax() {
        return max;
    }
    
    /**
     * The maximum allowed value for the quota.
     *
     * @param max The maximum allowed value for the quota.
     */
    public void setMax(Long max) {
        this.max = max;
    }
    
    /**
     * The maximum allowed value for the quota.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param max The maximum allowed value for the quota.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AccountQuota withMax(Long max) {
        this.max = max;
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
        if (getAccountQuotaName() != null) sb.append("AccountQuotaName: " + getAccountQuotaName() + ",");
        if (getUsed() != null) sb.append("Used: " + getUsed() + ",");
        if (getMax() != null) sb.append("Max: " + getMax() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountQuotaName() == null) ? 0 : getAccountQuotaName().hashCode()); 
        hashCode = prime * hashCode + ((getUsed() == null) ? 0 : getUsed().hashCode()); 
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AccountQuota == false) return false;
        AccountQuota other = (AccountQuota)obj;
        
        if (other.getAccountQuotaName() == null ^ this.getAccountQuotaName() == null) return false;
        if (other.getAccountQuotaName() != null && other.getAccountQuotaName().equals(this.getAccountQuotaName()) == false) return false; 
        if (other.getUsed() == null ^ this.getUsed() == null) return false;
        if (other.getUsed() != null && other.getUsed().equals(this.getUsed()) == false) return false; 
        if (other.getMax() == null ^ this.getMax() == null) return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false) return false; 
        return true;
    }
    
    @Override
    public AccountQuota clone() {
        try {
            return (AccountQuota) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    