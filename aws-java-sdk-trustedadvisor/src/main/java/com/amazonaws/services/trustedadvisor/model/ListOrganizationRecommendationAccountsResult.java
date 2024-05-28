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
package com.amazonaws.services.trustedadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendationAccounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOrganizationRecommendationAccountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The account recommendations lifecycles that are applicable to the Recommendation
     * </p>
     */
    private java.util.List<AccountRecommendationLifecycleSummary> accountRecommendationLifecycleSummaries;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The account recommendations lifecycles that are applicable to the Recommendation
     * </p>
     * 
     * @return The account recommendations lifecycles that are applicable to the Recommendation
     */

    public java.util.List<AccountRecommendationLifecycleSummary> getAccountRecommendationLifecycleSummaries() {
        return accountRecommendationLifecycleSummaries;
    }

    /**
     * <p>
     * The account recommendations lifecycles that are applicable to the Recommendation
     * </p>
     * 
     * @param accountRecommendationLifecycleSummaries
     *        The account recommendations lifecycles that are applicable to the Recommendation
     */

    public void setAccountRecommendationLifecycleSummaries(java.util.Collection<AccountRecommendationLifecycleSummary> accountRecommendationLifecycleSummaries) {
        if (accountRecommendationLifecycleSummaries == null) {
            this.accountRecommendationLifecycleSummaries = null;
            return;
        }

        this.accountRecommendationLifecycleSummaries = new java.util.ArrayList<AccountRecommendationLifecycleSummary>(accountRecommendationLifecycleSummaries);
    }

    /**
     * <p>
     * The account recommendations lifecycles that are applicable to the Recommendation
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountRecommendationLifecycleSummaries(java.util.Collection)} or
     * {@link #withAccountRecommendationLifecycleSummaries(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param accountRecommendationLifecycleSummaries
     *        The account recommendations lifecycles that are applicable to the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationAccountsResult withAccountRecommendationLifecycleSummaries(
            AccountRecommendationLifecycleSummary... accountRecommendationLifecycleSummaries) {
        if (this.accountRecommendationLifecycleSummaries == null) {
            setAccountRecommendationLifecycleSummaries(new java.util.ArrayList<AccountRecommendationLifecycleSummary>(
                    accountRecommendationLifecycleSummaries.length));
        }
        for (AccountRecommendationLifecycleSummary ele : accountRecommendationLifecycleSummaries) {
            this.accountRecommendationLifecycleSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The account recommendations lifecycles that are applicable to the Recommendation
     * </p>
     * 
     * @param accountRecommendationLifecycleSummaries
     *        The account recommendations lifecycles that are applicable to the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationAccountsResult withAccountRecommendationLifecycleSummaries(
            java.util.Collection<AccountRecommendationLifecycleSummary> accountRecommendationLifecycleSummaries) {
        setAccountRecommendationLifecycleSummaries(accountRecommendationLifecycleSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationRecommendationAccountsResult withNextToken(String nextToken) {
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
        if (getAccountRecommendationLifecycleSummaries() != null)
            sb.append("AccountRecommendationLifecycleSummaries: ").append(getAccountRecommendationLifecycleSummaries()).append(",");
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

        if (obj instanceof ListOrganizationRecommendationAccountsResult == false)
            return false;
        ListOrganizationRecommendationAccountsResult other = (ListOrganizationRecommendationAccountsResult) obj;
        if (other.getAccountRecommendationLifecycleSummaries() == null ^ this.getAccountRecommendationLifecycleSummaries() == null)
            return false;
        if (other.getAccountRecommendationLifecycleSummaries() != null
                && other.getAccountRecommendationLifecycleSummaries().equals(this.getAccountRecommendationLifecycleSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAccountRecommendationLifecycleSummaries() == null) ? 0 : getAccountRecommendationLifecycleSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOrganizationRecommendationAccountsResult clone() {
        try {
            return (ListOrganizationRecommendationAccountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
