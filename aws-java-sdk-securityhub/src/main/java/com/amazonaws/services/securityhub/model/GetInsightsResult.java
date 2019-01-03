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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsights" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The insights returned by the operation.
     * </p>
     */
    private java.util.List<Insight> insights;
    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The insights returned by the operation.
     * </p>
     * 
     * @return The insights returned by the operation.
     */

    public java.util.List<Insight> getInsights() {
        return insights;
    }

    /**
     * <p>
     * The insights returned by the operation.
     * </p>
     * 
     * @param insights
     *        The insights returned by the operation.
     */

    public void setInsights(java.util.Collection<Insight> insights) {
        if (insights == null) {
            this.insights = null;
            return;
        }

        this.insights = new java.util.ArrayList<Insight>(insights);
    }

    /**
     * <p>
     * The insights returned by the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsights(java.util.Collection)} or {@link #withInsights(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param insights
     *        The insights returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightsResult withInsights(Insight... insights) {
        if (this.insights == null) {
            setInsights(new java.util.ArrayList<Insight>(insights.length));
        }
        for (Insight ele : insights) {
            this.insights.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The insights returned by the operation.
     * </p>
     * 
     * @param insights
     *        The insights returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightsResult withInsights(java.util.Collection<Insight> insights) {
        setInsights(insights);
        return this;
    }

    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     * 
     * @param nextToken
     *        The token that is required for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     * 
     * @return The token that is required for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     * 
     * @param nextToken
     *        The token that is required for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightsResult withNextToken(String nextToken) {
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

        if (obj instanceof GetInsightsResult == false)
            return false;
        GetInsightsResult other = (GetInsightsResult) obj;
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
    public GetInsightsResult clone() {
        try {
            return (GetInsightsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
