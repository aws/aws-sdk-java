/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Describes an AWS customer account authorized to restore a snapshot.
 * </p>
 */
public class AccountWithRestoreAccess implements Serializable {

    /**
     * The identifier of an AWS customer account authorized to restore a
     * snapshot.
     */
    private String accountId;

    /**
     * The identifier of an AWS customer account authorized to restore a
     * snapshot.
     *
     * @return The identifier of an AWS customer account authorized to restore a
     *         snapshot.
     */
    public String getAccountId() {
        return accountId;
    }
    
    /**
     * The identifier of an AWS customer account authorized to restore a
     * snapshot.
     *
     * @param accountId The identifier of an AWS customer account authorized to restore a
     *         snapshot.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    /**
     * The identifier of an AWS customer account authorized to restore a
     * snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountId The identifier of an AWS customer account authorized to restore a
     *         snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AccountWithRestoreAccess withAccountId(String accountId) {
        this.accountId = accountId;
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
        if (getAccountId() != null) sb.append("AccountId: " + getAccountId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AccountWithRestoreAccess == false) return false;
        AccountWithRestoreAccess other = (AccountWithRestoreAccess)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        return true;
    }
    
}
    