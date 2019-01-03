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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeMetricFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMetricFiltersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metric filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricFilter> metricFilters;

    private String nextToken;

    /**
     * <p>
     * The metric filters.
     * </p>
     * 
     * @return The metric filters.
     */

    public java.util.List<MetricFilter> getMetricFilters() {
        if (metricFilters == null) {
            metricFilters = new com.amazonaws.internal.SdkInternalList<MetricFilter>();
        }
        return metricFilters;
    }

    /**
     * <p>
     * The metric filters.
     * </p>
     * 
     * @param metricFilters
     *        The metric filters.
     */

    public void setMetricFilters(java.util.Collection<MetricFilter> metricFilters) {
        if (metricFilters == null) {
            this.metricFilters = null;
            return;
        }

        this.metricFilters = new com.amazonaws.internal.SdkInternalList<MetricFilter>(metricFilters);
    }

    /**
     * <p>
     * The metric filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricFilters(java.util.Collection)} or {@link #withMetricFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param metricFilters
     *        The metric filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricFiltersResult withMetricFilters(MetricFilter... metricFilters) {
        if (this.metricFilters == null) {
            setMetricFilters(new com.amazonaws.internal.SdkInternalList<MetricFilter>(metricFilters.length));
        }
        for (MetricFilter ele : metricFilters) {
            this.metricFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metric filters.
     * </p>
     * 
     * @param metricFilters
     *        The metric filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricFiltersResult withMetricFilters(java.util.Collection<MetricFilter> metricFilters) {
        setMetricFilters(metricFilters);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricFiltersResult withNextToken(String nextToken) {
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
        if (getMetricFilters() != null)
            sb.append("MetricFilters: ").append(getMetricFilters()).append(",");
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

        if (obj instanceof DescribeMetricFiltersResult == false)
            return false;
        DescribeMetricFiltersResult other = (DescribeMetricFiltersResult) obj;
        if (other.getMetricFilters() == null ^ this.getMetricFilters() == null)
            return false;
        if (other.getMetricFilters() != null && other.getMetricFilters().equals(this.getMetricFilters()) == false)
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

        hashCode = prime * hashCode + ((getMetricFilters() == null) ? 0 : getMetricFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMetricFiltersResult clone() {
        try {
            return (DescribeMetricFiltersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
