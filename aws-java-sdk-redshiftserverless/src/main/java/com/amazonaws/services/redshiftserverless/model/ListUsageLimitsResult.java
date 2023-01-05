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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListUsageLimits"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsageLimitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of returned usage limit objects.
     * </p>
     */
    private java.util.List<UsageLimit> usageLimits;

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return When <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageLimitsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of returned usage limit objects.
     * </p>
     * 
     * @return An array of returned usage limit objects.
     */

    public java.util.List<UsageLimit> getUsageLimits() {
        return usageLimits;
    }

    /**
     * <p>
     * An array of returned usage limit objects.
     * </p>
     * 
     * @param usageLimits
     *        An array of returned usage limit objects.
     */

    public void setUsageLimits(java.util.Collection<UsageLimit> usageLimits) {
        if (usageLimits == null) {
            this.usageLimits = null;
            return;
        }

        this.usageLimits = new java.util.ArrayList<UsageLimit>(usageLimits);
    }

    /**
     * <p>
     * An array of returned usage limit objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsageLimits(java.util.Collection)} or {@link #withUsageLimits(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param usageLimits
     *        An array of returned usage limit objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageLimitsResult withUsageLimits(UsageLimit... usageLimits) {
        if (this.usageLimits == null) {
            setUsageLimits(new java.util.ArrayList<UsageLimit>(usageLimits.length));
        }
        for (UsageLimit ele : usageLimits) {
            this.usageLimits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of returned usage limit objects.
     * </p>
     * 
     * @param usageLimits
     *        An array of returned usage limit objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageLimitsResult withUsageLimits(java.util.Collection<UsageLimit> usageLimits) {
        setUsageLimits(usageLimits);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getUsageLimits() != null)
            sb.append("UsageLimits: ").append(getUsageLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsageLimitsResult == false)
            return false;
        ListUsageLimitsResult other = (ListUsageLimitsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getUsageLimits() == null ^ this.getUsageLimits() == null)
            return false;
        if (other.getUsageLimits() != null && other.getUsageLimits().equals(this.getUsageLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getUsageLimits() == null) ? 0 : getUsageLimits().hashCode());
        return hashCode;
    }

    @Override
    public ListUsageLimitsResult clone() {
        try {
            return (ListUsageLimitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
