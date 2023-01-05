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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListUsageTotals" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsageTotalsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An object with details on the total usage for the requested account.
     * </p>
     */
    private java.util.List<UsageTotal> totals;

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @param nextToken
     *        The pagination parameter to be used on the next list operation to retrieve more items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @return The pagination parameter to be used on the next list operation to retrieve more items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @param nextToken
     *        The pagination parameter to be used on the next list operation to retrieve more items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageTotalsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An object with details on the total usage for the requested account.
     * </p>
     * 
     * @return An object with details on the total usage for the requested account.
     */

    public java.util.List<UsageTotal> getTotals() {
        return totals;
    }

    /**
     * <p>
     * An object with details on the total usage for the requested account.
     * </p>
     * 
     * @param totals
     *        An object with details on the total usage for the requested account.
     */

    public void setTotals(java.util.Collection<UsageTotal> totals) {
        if (totals == null) {
            this.totals = null;
            return;
        }

        this.totals = new java.util.ArrayList<UsageTotal>(totals);
    }

    /**
     * <p>
     * An object with details on the total usage for the requested account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTotals(java.util.Collection)} or {@link #withTotals(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param totals
     *        An object with details on the total usage for the requested account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageTotalsResult withTotals(UsageTotal... totals) {
        if (this.totals == null) {
            setTotals(new java.util.ArrayList<UsageTotal>(totals.length));
        }
        for (UsageTotal ele : totals) {
            this.totals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object with details on the total usage for the requested account.
     * </p>
     * 
     * @param totals
     *        An object with details on the total usage for the requested account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageTotalsResult withTotals(java.util.Collection<UsageTotal> totals) {
        setTotals(totals);
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
        if (getTotals() != null)
            sb.append("Totals: ").append(getTotals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsageTotalsResult == false)
            return false;
        ListUsageTotalsResult other = (ListUsageTotalsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotals() == null ^ this.getTotals() == null)
            return false;
        if (other.getTotals() != null && other.getTotals().equals(this.getTotals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotals() == null) ? 0 : getTotals().hashCode());
        return hashCode;
    }

    @Override
    public ListUsageTotalsResult clone() {
        try {
            return (ListUsageTotalsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
