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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListInsights" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInsightsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The returned list of insights.
     * </p>
     */
    private java.util.List<InsightSummary> insights;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListInsights</code> request. When the results of a
     * <code>ListInsights</code> request exceed <code>maxResults</code>, you can use this value to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The returned list of insights.
     * </p>
     * 
     * @return The returned list of insights.
     */

    public java.util.List<InsightSummary> getInsights() {
        return insights;
    }

    /**
     * <p>
     * The returned list of insights.
     * </p>
     * 
     * @param insights
     *        The returned list of insights.
     */

    public void setInsights(java.util.Collection<InsightSummary> insights) {
        if (insights == null) {
            this.insights = null;
            return;
        }

        this.insights = new java.util.ArrayList<InsightSummary>(insights);
    }

    /**
     * <p>
     * The returned list of insights.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsights(java.util.Collection)} or {@link #withInsights(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param insights
     *        The returned list of insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsResult withInsights(InsightSummary... insights) {
        if (this.insights == null) {
            setInsights(new java.util.ArrayList<InsightSummary>(insights.length));
        }
        for (InsightSummary ele : insights) {
            this.insights.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned list of insights.
     * </p>
     * 
     * @param insights
     *        The returned list of insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsResult withInsights(java.util.Collection<InsightSummary> insights) {
        setInsights(insights);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListInsights</code> request. When the results of a
     * <code>ListInsights</code> request exceed <code>maxResults</code>, you can use this value to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListInsights</code> request. When the
     *        results of a <code>ListInsights</code> request exceed <code>maxResults</code>, you can use this value to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListInsights</code> request. When the results of a
     * <code>ListInsights</code> request exceed <code>maxResults</code>, you can use this value to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListInsights</code> request. When the
     *         results of a <code>ListInsights</code> request exceed <code>maxResults</code>, you can use this value to
     *         retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListInsights</code> request. When the results of a
     * <code>ListInsights</code> request exceed <code>maxResults</code>, you can use this value to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListInsights</code> request. When the
     *        results of a <code>ListInsights</code> request exceed <code>maxResults</code>, you can use this value to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsResult withNextToken(String nextToken) {
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
        if (getInsights() != null)
            sb.append("Insights: ").append(getInsights()).append(",");
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

        if (obj instanceof ListInsightsResult == false)
            return false;
        ListInsightsResult other = (ListInsightsResult) obj;
        if (other.getInsights() == null ^ this.getInsights() == null)
            return false;
        if (other.getInsights() != null && other.getInsights().equals(this.getInsights()) == false)
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

        hashCode = prime * hashCode + ((getInsights() == null) ? 0 : getInsights().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInsightsResult clone() {
        try {
            return (ListInsightsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
