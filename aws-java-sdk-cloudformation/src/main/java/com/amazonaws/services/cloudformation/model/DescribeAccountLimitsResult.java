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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output for the <a>DescribeAccountLimits</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeAccountLimits"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountLimitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An account limit structure that contain a list of AWS CloudFormation account limits and their values.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccountLimit> accountLimits;
    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next page of limits. If no additional page
     * exists, this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An account limit structure that contain a list of AWS CloudFormation account limits and their values.
     * </p>
     * 
     * @return An account limit structure that contain a list of AWS CloudFormation account limits and their values.
     */

    public java.util.List<AccountLimit> getAccountLimits() {
        if (accountLimits == null) {
            accountLimits = new com.amazonaws.internal.SdkInternalList<AccountLimit>();
        }
        return accountLimits;
    }

    /**
     * <p>
     * An account limit structure that contain a list of AWS CloudFormation account limits and their values.
     * </p>
     * 
     * @param accountLimits
     *        An account limit structure that contain a list of AWS CloudFormation account limits and their values.
     */

    public void setAccountLimits(java.util.Collection<AccountLimit> accountLimits) {
        if (accountLimits == null) {
            this.accountLimits = null;
            return;
        }

        this.accountLimits = new com.amazonaws.internal.SdkInternalList<AccountLimit>(accountLimits);
    }

    /**
     * <p>
     * An account limit structure that contain a list of AWS CloudFormation account limits and their values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountLimits(java.util.Collection)} or {@link #withAccountLimits(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param accountLimits
     *        An account limit structure that contain a list of AWS CloudFormation account limits and their values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountLimitsResult withAccountLimits(AccountLimit... accountLimits) {
        if (this.accountLimits == null) {
            setAccountLimits(new com.amazonaws.internal.SdkInternalList<AccountLimit>(accountLimits.length));
        }
        for (AccountLimit ele : accountLimits) {
            this.accountLimits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An account limit structure that contain a list of AWS CloudFormation account limits and their values.
     * </p>
     * 
     * @param accountLimits
     *        An account limit structure that contain a list of AWS CloudFormation account limits and their values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountLimitsResult withAccountLimits(java.util.Collection<AccountLimit> accountLimits) {
        setAccountLimits(accountLimits);
        return this;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next page of limits. If no additional page
     * exists, this value is null.
     * </p>
     * 
     * @param nextToken
     *        If the output exceeds 1 MB in size, a string that identifies the next page of limits. If no additional
     *        page exists, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next page of limits. If no additional page
     * exists, this value is null.
     * </p>
     * 
     * @return If the output exceeds 1 MB in size, a string that identifies the next page of limits. If no additional
     *         page exists, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next page of limits. If no additional page
     * exists, this value is null.
     * </p>
     * 
     * @param nextToken
     *        If the output exceeds 1 MB in size, a string that identifies the next page of limits. If no additional
     *        page exists, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountLimitsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAccountLimits() != null)
            sb.append("AccountLimits: ").append(getAccountLimits()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountLimitsResult == false)
            return false;
        DescribeAccountLimitsResult other = (DescribeAccountLimitsResult) obj;
        if (other.getAccountLimits() == null ^ this.getAccountLimits() == null)
            return false;
        if (other.getAccountLimits() != null && other.getAccountLimits().equals(this.getAccountLimits()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
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
    public DescribeAccountLimitsResult clone() {
        try {
            return (DescribeAccountLimitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
