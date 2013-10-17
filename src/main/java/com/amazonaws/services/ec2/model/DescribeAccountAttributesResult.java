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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * Describe Account Attributes Result
 */
public class DescribeAccountAttributesResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttribute> accountAttributes;

    /**
     * Returns the value of the AccountAttributes property for this object.
     *
     * @return The value of the AccountAttributes property for this object.
     */
    public java.util.List<AccountAttribute> getAccountAttributes() {
        if (accountAttributes == null) {
              accountAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttribute>();
              accountAttributes.setAutoConstruct(true);
        }
        return accountAttributes;
    }
    
    /**
     * Sets the value of the AccountAttributes property for this object.
     *
     * @param accountAttributes The new value for the AccountAttributes property for this object.
     */
    public void setAccountAttributes(java.util.Collection<AccountAttribute> accountAttributes) {
        if (accountAttributes == null) {
            this.accountAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttribute> accountAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttribute>(accountAttributes.size());
        accountAttributesCopy.addAll(accountAttributes);
        this.accountAttributes = accountAttributesCopy;
    }
    
    /**
     * Sets the value of the AccountAttributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountAttributes The new value for the AccountAttributes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAccountAttributesResult withAccountAttributes(AccountAttribute... accountAttributes) {
        if (getAccountAttributes() == null) setAccountAttributes(new java.util.ArrayList<AccountAttribute>(accountAttributes.length));
        for (AccountAttribute value : accountAttributes) {
            getAccountAttributes().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AccountAttributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountAttributes The new value for the AccountAttributes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAccountAttributesResult withAccountAttributes(java.util.Collection<AccountAttribute> accountAttributes) {
        if (accountAttributes == null) {
            this.accountAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttribute> accountAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttribute>(accountAttributes.size());
            accountAttributesCopy.addAll(accountAttributes);
            this.accountAttributes = accountAttributesCopy;
        }

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
        if (getAccountAttributes() != null) sb.append("AccountAttributes: " + getAccountAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountAttributes() == null) ? 0 : getAccountAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAccountAttributesResult == false) return false;
        DescribeAccountAttributesResult other = (DescribeAccountAttributesResult)obj;
        
        if (other.getAccountAttributes() == null ^ this.getAccountAttributes() == null) return false;
        if (other.getAccountAttributes() != null && other.getAccountAttributes().equals(this.getAccountAttributes()) == false) return false; 
        return true;
    }
    
}
    