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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request of DescribeBudgets
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBudgetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budgets that you want descriptions of.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token that you include in your request to indicate the next set of results that you want to
     * retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budgets that you want descriptions of.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budgets that you want descriptions of.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budgets that you want descriptions of.
     * </p>
     * 
     * @return The <code>accountId</code> that is associated with the budgets that you want descriptions of.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budgets that you want descriptions of.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budgets that you want descriptions of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     * </p>
     * 
     * @param maxResults
     *        An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     * </p>
     * 
     * @return An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     * </p>
     * 
     * @param maxResults
     *        An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token that you include in your request to indicate the next set of results that you want to
     * retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that you include in your request to indicate the next set of results that you want to
     *        retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that you include in your request to indicate the next set of results that you want to
     * retrieve.
     * </p>
     * 
     * @return The pagination token that you include in your request to indicate the next set of results that you want
     *         to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that you include in your request to indicate the next set of results that you want to
     * retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that you include in your request to indicate the next set of results that you want to
     *        retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetsRequest withNextToken(String nextToken) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeBudgetsRequest == false)
            return false;
        DescribeBudgetsRequest other = (DescribeBudgetsRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBudgetsRequest clone() {
        return (DescribeBudgetsRequest) super.clone();
    }

}
