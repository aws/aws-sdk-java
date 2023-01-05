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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListMetricAttributions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMetricAttributionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of metric attributions.
     * </p>
     */
    private java.util.List<MetricAttributionSummary> metricAttributions;
    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of metric attributions.
     * </p>
     * 
     * @return The list of metric attributions.
     */

    public java.util.List<MetricAttributionSummary> getMetricAttributions() {
        return metricAttributions;
    }

    /**
     * <p>
     * The list of metric attributions.
     * </p>
     * 
     * @param metricAttributions
     *        The list of metric attributions.
     */

    public void setMetricAttributions(java.util.Collection<MetricAttributionSummary> metricAttributions) {
        if (metricAttributions == null) {
            this.metricAttributions = null;
            return;
        }

        this.metricAttributions = new java.util.ArrayList<MetricAttributionSummary>(metricAttributions);
    }

    /**
     * <p>
     * The list of metric attributions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricAttributions(java.util.Collection)} or {@link #withMetricAttributions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param metricAttributions
     *        The list of metric attributions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricAttributionsResult withMetricAttributions(MetricAttributionSummary... metricAttributions) {
        if (this.metricAttributions == null) {
            setMetricAttributions(new java.util.ArrayList<MetricAttributionSummary>(metricAttributions.length));
        }
        for (MetricAttributionSummary ele : metricAttributions) {
            this.metricAttributions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of metric attributions.
     * </p>
     * 
     * @param metricAttributions
     *        The list of metric attributions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricAttributionsResult withMetricAttributions(java.util.Collection<MetricAttributionSummary> metricAttributions) {
        setMetricAttributions(metricAttributions);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricAttributionsResult withNextToken(String nextToken) {
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
        if (getMetricAttributions() != null)
            sb.append("MetricAttributions: ").append(getMetricAttributions()).append(",");
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

        if (obj instanceof ListMetricAttributionsResult == false)
            return false;
        ListMetricAttributionsResult other = (ListMetricAttributionsResult) obj;
        if (other.getMetricAttributions() == null ^ this.getMetricAttributions() == null)
            return false;
        if (other.getMetricAttributions() != null && other.getMetricAttributions().equals(this.getMetricAttributions()) == false)
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

        hashCode = prime * hashCode + ((getMetricAttributions() == null) ? 0 : getMetricAttributions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMetricAttributionsResult clone() {
        try {
            return (ListMetricAttributionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
