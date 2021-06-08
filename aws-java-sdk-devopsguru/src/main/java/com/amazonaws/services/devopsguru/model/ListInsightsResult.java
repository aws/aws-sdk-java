/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListInsights" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInsightsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The returned list of proactive insights.
     * </p>
     */
    private java.util.List<ProactiveInsightSummary> proactiveInsights;
    /**
     * <p>
     * The returned list of reactive insights.
     * </p>
     */
    private java.util.List<ReactiveInsightSummary> reactiveInsights;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The returned list of proactive insights.
     * </p>
     * 
     * @return The returned list of proactive insights.
     */

    public java.util.List<ProactiveInsightSummary> getProactiveInsights() {
        return proactiveInsights;
    }

    /**
     * <p>
     * The returned list of proactive insights.
     * </p>
     * 
     * @param proactiveInsights
     *        The returned list of proactive insights.
     */

    public void setProactiveInsights(java.util.Collection<ProactiveInsightSummary> proactiveInsights) {
        if (proactiveInsights == null) {
            this.proactiveInsights = null;
            return;
        }

        this.proactiveInsights = new java.util.ArrayList<ProactiveInsightSummary>(proactiveInsights);
    }

    /**
     * <p>
     * The returned list of proactive insights.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProactiveInsights(java.util.Collection)} or {@link #withProactiveInsights(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param proactiveInsights
     *        The returned list of proactive insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsResult withProactiveInsights(ProactiveInsightSummary... proactiveInsights) {
        if (this.proactiveInsights == null) {
            setProactiveInsights(new java.util.ArrayList<ProactiveInsightSummary>(proactiveInsights.length));
        }
        for (ProactiveInsightSummary ele : proactiveInsights) {
            this.proactiveInsights.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned list of proactive insights.
     * </p>
     * 
     * @param proactiveInsights
     *        The returned list of proactive insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsResult withProactiveInsights(java.util.Collection<ProactiveInsightSummary> proactiveInsights) {
        setProactiveInsights(proactiveInsights);
        return this;
    }

    /**
     * <p>
     * The returned list of reactive insights.
     * </p>
     * 
     * @return The returned list of reactive insights.
     */

    public java.util.List<ReactiveInsightSummary> getReactiveInsights() {
        return reactiveInsights;
    }

    /**
     * <p>
     * The returned list of reactive insights.
     * </p>
     * 
     * @param reactiveInsights
     *        The returned list of reactive insights.
     */

    public void setReactiveInsights(java.util.Collection<ReactiveInsightSummary> reactiveInsights) {
        if (reactiveInsights == null) {
            this.reactiveInsights = null;
            return;
        }

        this.reactiveInsights = new java.util.ArrayList<ReactiveInsightSummary>(reactiveInsights);
    }

    /**
     * <p>
     * The returned list of reactive insights.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReactiveInsights(java.util.Collection)} or {@link #withReactiveInsights(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param reactiveInsights
     *        The returned list of reactive insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsResult withReactiveInsights(ReactiveInsightSummary... reactiveInsights) {
        if (this.reactiveInsights == null) {
            setReactiveInsights(new java.util.ArrayList<ReactiveInsightSummary>(reactiveInsights.length));
        }
        for (ReactiveInsightSummary ele : reactiveInsights) {
            this.reactiveInsights.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned list of reactive insights.
     * </p>
     * 
     * @param reactiveInsights
     *        The returned list of reactive insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsResult withReactiveInsights(java.util.Collection<ReactiveInsightSummary> reactiveInsights) {
        setReactiveInsights(reactiveInsights);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
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
        if (getProactiveInsights() != null)
            sb.append("ProactiveInsights: ").append(getProactiveInsights()).append(",");
        if (getReactiveInsights() != null)
            sb.append("ReactiveInsights: ").append(getReactiveInsights()).append(",");
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
        if (other.getProactiveInsights() == null ^ this.getProactiveInsights() == null)
            return false;
        if (other.getProactiveInsights() != null && other.getProactiveInsights().equals(this.getProactiveInsights()) == false)
            return false;
        if (other.getReactiveInsights() == null ^ this.getReactiveInsights() == null)
            return false;
        if (other.getReactiveInsights() != null && other.getReactiveInsights().equals(this.getReactiveInsights()) == false)
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

        hashCode = prime * hashCode + ((getProactiveInsights() == null) ? 0 : getProactiveInsights().hashCode());
        hashCode = prime * hashCode + ((getReactiveInsights() == null) ? 0 : getReactiveInsights().hashCode());
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
