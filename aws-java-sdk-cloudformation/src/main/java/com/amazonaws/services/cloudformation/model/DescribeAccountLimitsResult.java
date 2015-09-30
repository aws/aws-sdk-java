/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the DescribeAccountLimits action.
 * </p>
 */
public class DescribeAccountLimitsResult implements Serializable, Cloneable {

    /**
     * An account limit structure that contain a list of AWS CloudFormation
     * account limits and their values.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AccountLimit> accountLimits;

    /**
     * A string that identifies the next page of limits. If no additional
     * page exists, this value is null.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * An account limit structure that contain a list of AWS CloudFormation
     * account limits and their values.
     *
     * @return An account limit structure that contain a list of AWS CloudFormation
     *         account limits and their values.
     */
    public java.util.List<AccountLimit> getAccountLimits() {
        if (accountLimits == null) {
              accountLimits = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountLimit>();
              accountLimits.setAutoConstruct(true);
        }
        return accountLimits;
    }
    
    /**
     * An account limit structure that contain a list of AWS CloudFormation
     * account limits and their values.
     *
     * @param accountLimits An account limit structure that contain a list of AWS CloudFormation
     *         account limits and their values.
     */
    public void setAccountLimits(java.util.Collection<AccountLimit> accountLimits) {
        if (accountLimits == null) {
            this.accountLimits = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AccountLimit> accountLimitsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountLimit>(accountLimits.size());
        accountLimitsCopy.addAll(accountLimits);
        this.accountLimits = accountLimitsCopy;
    }
    
    /**
     * An account limit structure that contain a list of AWS CloudFormation
     * account limits and their values.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAccountLimits(java.util.Collection)} or {@link
     * #withAccountLimits(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountLimits An account limit structure that contain a list of AWS CloudFormation
     *         account limits and their values.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAccountLimitsResult withAccountLimits(AccountLimit... accountLimits) {
        if (getAccountLimits() == null) setAccountLimits(new java.util.ArrayList<AccountLimit>(accountLimits.length));
        for (AccountLimit value : accountLimits) {
            getAccountLimits().add(value);
        }
        return this;
    }
    
    /**
     * An account limit structure that contain a list of AWS CloudFormation
     * account limits and their values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountLimits An account limit structure that contain a list of AWS CloudFormation
     *         account limits and their values.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAccountLimitsResult withAccountLimits(java.util.Collection<AccountLimit> accountLimits) {
        if (accountLimits == null) {
            this.accountLimits = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AccountLimit> accountLimitsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountLimit>(accountLimits.size());
            accountLimitsCopy.addAll(accountLimits);
            this.accountLimits = accountLimitsCopy;
        }

        return this;
    }

    /**
     * A string that identifies the next page of limits. If no additional
     * page exists, this value is null.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return A string that identifies the next page of limits. If no additional
     *         page exists, this value is null.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string that identifies the next page of limits. If no additional
     * page exists, this value is null.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken A string that identifies the next page of limits. If no additional
     *         page exists, this value is null.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string that identifies the next page of limits. If no additional
     * page exists, this value is null.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken A string that identifies the next page of limits. If no additional
     *         page exists, this value is null.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAccountLimitsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getAccountLimits() != null) sb.append("AccountLimits: " + getAccountLimits() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountLimits() == null) ? 0 : getAccountLimits().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAccountLimitsResult == false) return false;
        DescribeAccountLimitsResult other = (DescribeAccountLimitsResult)obj;
        
        if (other.getAccountLimits() == null ^ this.getAccountLimits() == null) return false;
        if (other.getAccountLimits() != null && other.getAccountLimits().equals(this.getAccountLimits()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeAccountLimitsResult clone() {
        try {
            return (DescribeAccountLimitsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    