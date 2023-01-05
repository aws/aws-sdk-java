/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeAccountLimits"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountLimitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of AccountLimit objects that show the current spend limits.
     * </p>
     */
    private java.util.List<AccountLimit> accountLimits;
    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of AccountLimit objects that show the current spend limits.
     * </p>
     * 
     * @return An array of AccountLimit objects that show the current spend limits.
     */

    public java.util.List<AccountLimit> getAccountLimits() {
        return accountLimits;
    }

    /**
     * <p>
     * An array of AccountLimit objects that show the current spend limits.
     * </p>
     * 
     * @param accountLimits
     *        An array of AccountLimit objects that show the current spend limits.
     */

    public void setAccountLimits(java.util.Collection<AccountLimit> accountLimits) {
        if (accountLimits == null) {
            this.accountLimits = null;
            return;
        }

        this.accountLimits = new java.util.ArrayList<AccountLimit>(accountLimits);
    }

    /**
     * <p>
     * An array of AccountLimit objects that show the current spend limits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountLimits(java.util.Collection)} or {@link #withAccountLimits(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param accountLimits
     *        An array of AccountLimit objects that show the current spend limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountLimitsResult withAccountLimits(AccountLimit... accountLimits) {
        if (this.accountLimits == null) {
            setAccountLimits(new java.util.ArrayList<AccountLimit>(accountLimits.length));
        }
        for (AccountLimit ele : accountLimits) {
            this.accountLimits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of AccountLimit objects that show the current spend limits.
     * </p>
     * 
     * @param accountLimits
     *        An array of AccountLimit objects that show the current spend limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountLimitsResult withAccountLimits(java.util.Collection<AccountLimit> accountLimits) {
        setAccountLimits(accountLimits);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. If this field is empty then there are no more
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results. If this field is empty then there are no more
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. If this field is empty then there are no more
     *        results.
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
