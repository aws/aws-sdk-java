/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetRecommendationSummaries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommendationSummariesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account IDs for which to return recommendation summaries.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     */
    private java.util.List<String> accountIds;
    /**
     * <p>
     * The token to advance to the next page of recommendation summaries.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of recommendation summaries to return with a single call.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The AWS account IDs for which to return recommendation summaries.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     * 
     * @return The AWS account IDs for which to return recommendation summaries.</p>
     *         <p>
     *         Only one account ID can be specified per request.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The AWS account IDs for which to return recommendation summaries.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     * 
     * @param accountIds
     *        The AWS account IDs for which to return recommendation summaries.</p>
     *        <p>
     *        Only one account ID can be specified per request.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * The AWS account IDs for which to return recommendation summaries.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        The AWS account IDs for which to return recommendation summaries.</p>
     *        <p>
     *        Only one account ID can be specified per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationSummariesRequest withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS account IDs for which to return recommendation summaries.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     * 
     * @param accountIds
     *        The AWS account IDs for which to return recommendation summaries.</p>
     *        <p>
     *        Only one account ID can be specified per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationSummariesRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of recommendation summaries.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of recommendation summaries.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of recommendation summaries.
     * </p>
     * 
     * @return The token to advance to the next page of recommendation summaries.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of recommendation summaries.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of recommendation summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationSummariesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of recommendation summaries to return with a single call.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of recommendation summaries to return with a single call.</p>
     *        <p>
     *        To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of recommendation summaries to return with a single call.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of recommendation summaries to return with a single call.</p>
     *         <p>
     *         To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of recommendation summaries to return with a single call.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of recommendation summaries to return with a single call.</p>
     *        <p>
     *        To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationSummariesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommendationSummariesRequest == false)
            return false;
        GetRecommendationSummariesRequest other = (GetRecommendationSummariesRequest) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetRecommendationSummariesRequest clone() {
        return (GetRecommendationSummariesRequest) super.clone();
    }

}
