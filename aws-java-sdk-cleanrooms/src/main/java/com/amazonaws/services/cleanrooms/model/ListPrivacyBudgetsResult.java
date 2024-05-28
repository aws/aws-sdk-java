/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListPrivacyBudgets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPrivacyBudgetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array that summarizes the privacy budgets. The summary includes collaboration information, membership
     * information, privacy budget template information, and privacy budget details.
     * </p>
     */
    private java.util.List<PrivacyBudgetSummary> privacyBudgetSummaries;
    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array that summarizes the privacy budgets. The summary includes collaboration information, membership
     * information, privacy budget template information, and privacy budget details.
     * </p>
     * 
     * @return An array that summarizes the privacy budgets. The summary includes collaboration information, membership
     *         information, privacy budget template information, and privacy budget details.
     */

    public java.util.List<PrivacyBudgetSummary> getPrivacyBudgetSummaries() {
        return privacyBudgetSummaries;
    }

    /**
     * <p>
     * An array that summarizes the privacy budgets. The summary includes collaboration information, membership
     * information, privacy budget template information, and privacy budget details.
     * </p>
     * 
     * @param privacyBudgetSummaries
     *        An array that summarizes the privacy budgets. The summary includes collaboration information, membership
     *        information, privacy budget template information, and privacy budget details.
     */

    public void setPrivacyBudgetSummaries(java.util.Collection<PrivacyBudgetSummary> privacyBudgetSummaries) {
        if (privacyBudgetSummaries == null) {
            this.privacyBudgetSummaries = null;
            return;
        }

        this.privacyBudgetSummaries = new java.util.ArrayList<PrivacyBudgetSummary>(privacyBudgetSummaries);
    }

    /**
     * <p>
     * An array that summarizes the privacy budgets. The summary includes collaboration information, membership
     * information, privacy budget template information, and privacy budget details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivacyBudgetSummaries(java.util.Collection)} or
     * {@link #withPrivacyBudgetSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param privacyBudgetSummaries
     *        An array that summarizes the privacy budgets. The summary includes collaboration information, membership
     *        information, privacy budget template information, and privacy budget details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrivacyBudgetsResult withPrivacyBudgetSummaries(PrivacyBudgetSummary... privacyBudgetSummaries) {
        if (this.privacyBudgetSummaries == null) {
            setPrivacyBudgetSummaries(new java.util.ArrayList<PrivacyBudgetSummary>(privacyBudgetSummaries.length));
        }
        for (PrivacyBudgetSummary ele : privacyBudgetSummaries) {
            this.privacyBudgetSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that summarizes the privacy budgets. The summary includes collaboration information, membership
     * information, privacy budget template information, and privacy budget details.
     * </p>
     * 
     * @param privacyBudgetSummaries
     *        An array that summarizes the privacy budgets. The summary includes collaboration information, membership
     *        information, privacy budget template information, and privacy budget details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrivacyBudgetsResult withPrivacyBudgetSummaries(java.util.Collection<PrivacyBudgetSummary> privacyBudgetSummaries) {
        setPrivacyBudgetSummaries(privacyBudgetSummaries);
        return this;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @return The token value retrieved from a previous call to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrivacyBudgetsResult withNextToken(String nextToken) {
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
        if (getPrivacyBudgetSummaries() != null)
            sb.append("PrivacyBudgetSummaries: ").append(getPrivacyBudgetSummaries()).append(",");
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

        if (obj instanceof ListPrivacyBudgetsResult == false)
            return false;
        ListPrivacyBudgetsResult other = (ListPrivacyBudgetsResult) obj;
        if (other.getPrivacyBudgetSummaries() == null ^ this.getPrivacyBudgetSummaries() == null)
            return false;
        if (other.getPrivacyBudgetSummaries() != null && other.getPrivacyBudgetSummaries().equals(this.getPrivacyBudgetSummaries()) == false)
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

        hashCode = prime * hashCode + ((getPrivacyBudgetSummaries() == null) ? 0 : getPrivacyBudgetSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPrivacyBudgetsResult clone() {
        try {
            return (ListPrivacyBudgetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
