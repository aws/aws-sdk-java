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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMetricsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The metric namespace to filter against. Only the namespace that matches exactly will be returned.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The name of the metric to filter against. Only the metrics with names that match exactly will be returned.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The dimensions to filter against. Only the dimensions that match exactly will be returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DimensionFilter> dimensions;
    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * To filter the results to show only metrics that have had data points published in the past three hours, specify
     * this parameter with a value of <code>PT3H</code>. This is the only valid value for this parameter.
     * </p>
     * <p>
     * The results that are returned are an approximation of the value you specify. There is a low probability that the
     * returned results include metrics with last published data as much as 40 minutes more than the specified time
     * interval.
     * </p>
     */
    private String recentlyActive;

    /**
     * <p>
     * The metric namespace to filter against. Only the namespace that matches exactly will be returned.
     * </p>
     * 
     * @param namespace
     *        The metric namespace to filter against. Only the namespace that matches exactly will be returned.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The metric namespace to filter against. Only the namespace that matches exactly will be returned.
     * </p>
     * 
     * @return The metric namespace to filter against. Only the namespace that matches exactly will be returned.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The metric namespace to filter against. Only the namespace that matches exactly will be returned.
     * </p>
     * 
     * @param namespace
     *        The metric namespace to filter against. Only the namespace that matches exactly will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricsRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the metric to filter against. Only the metrics with names that match exactly will be returned.
     * </p>
     * 
     * @param metricName
     *        The name of the metric to filter against. Only the metrics with names that match exactly will be returned.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric to filter against. Only the metrics with names that match exactly will be returned.
     * </p>
     * 
     * @return The name of the metric to filter against. Only the metrics with names that match exactly will be
     *         returned.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric to filter against. Only the metrics with names that match exactly will be returned.
     * </p>
     * 
     * @param metricName
     *        The name of the metric to filter against. Only the metrics with names that match exactly will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricsRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The dimensions to filter against. Only the dimensions that match exactly will be returned.
     * </p>
     * 
     * @return The dimensions to filter against. Only the dimensions that match exactly will be returned.
     */

    public java.util.List<DimensionFilter> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<DimensionFilter>();
        }
        return dimensions;
    }

    /**
     * <p>
     * The dimensions to filter against. Only the dimensions that match exactly will be returned.
     * </p>
     * 
     * @param dimensions
     *        The dimensions to filter against. Only the dimensions that match exactly will be returned.
     */

    public void setDimensions(java.util.Collection<DimensionFilter> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new com.amazonaws.internal.SdkInternalList<DimensionFilter>(dimensions);
    }

    /**
     * <p>
     * The dimensions to filter against. Only the dimensions that match exactly will be returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The dimensions to filter against. Only the dimensions that match exactly will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricsRequest withDimensions(DimensionFilter... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new com.amazonaws.internal.SdkInternalList<DimensionFilter>(dimensions.length));
        }
        for (DimensionFilter ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dimensions to filter against. Only the dimensions that match exactly will be returned.
     * </p>
     * 
     * @param dimensions
     *        The dimensions to filter against. Only the dimensions that match exactly will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricsRequest withDimensions(java.util.Collection<DimensionFilter> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is more data available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @return The token returned by a previous call to indicate that there is more data available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is more data available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * To filter the results to show only metrics that have had data points published in the past three hours, specify
     * this parameter with a value of <code>PT3H</code>. This is the only valid value for this parameter.
     * </p>
     * <p>
     * The results that are returned are an approximation of the value you specify. There is a low probability that the
     * returned results include metrics with last published data as much as 40 minutes more than the specified time
     * interval.
     * </p>
     * 
     * @param recentlyActive
     *        To filter the results to show only metrics that have had data points published in the past three hours,
     *        specify this parameter with a value of <code>PT3H</code>. This is the only valid value for this
     *        parameter.</p>
     *        <p>
     *        The results that are returned are an approximation of the value you specify. There is a low probability
     *        that the returned results include metrics with last published data as much as 40 minutes more than the
     *        specified time interval.
     * @see RecentlyActive
     */

    public void setRecentlyActive(String recentlyActive) {
        this.recentlyActive = recentlyActive;
    }

    /**
     * <p>
     * To filter the results to show only metrics that have had data points published in the past three hours, specify
     * this parameter with a value of <code>PT3H</code>. This is the only valid value for this parameter.
     * </p>
     * <p>
     * The results that are returned are an approximation of the value you specify. There is a low probability that the
     * returned results include metrics with last published data as much as 40 minutes more than the specified time
     * interval.
     * </p>
     * 
     * @return To filter the results to show only metrics that have had data points published in the past three hours,
     *         specify this parameter with a value of <code>PT3H</code>. This is the only valid value for this
     *         parameter.</p>
     *         <p>
     *         The results that are returned are an approximation of the value you specify. There is a low probability
     *         that the returned results include metrics with last published data as much as 40 minutes more than the
     *         specified time interval.
     * @see RecentlyActive
     */

    public String getRecentlyActive() {
        return this.recentlyActive;
    }

    /**
     * <p>
     * To filter the results to show only metrics that have had data points published in the past three hours, specify
     * this parameter with a value of <code>PT3H</code>. This is the only valid value for this parameter.
     * </p>
     * <p>
     * The results that are returned are an approximation of the value you specify. There is a low probability that the
     * returned results include metrics with last published data as much as 40 minutes more than the specified time
     * interval.
     * </p>
     * 
     * @param recentlyActive
     *        To filter the results to show only metrics that have had data points published in the past three hours,
     *        specify this parameter with a value of <code>PT3H</code>. This is the only valid value for this
     *        parameter.</p>
     *        <p>
     *        The results that are returned are an approximation of the value you specify. There is a low probability
     *        that the returned results include metrics with last published data as much as 40 minutes more than the
     *        specified time interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecentlyActive
     */

    public ListMetricsRequest withRecentlyActive(String recentlyActive) {
        setRecentlyActive(recentlyActive);
        return this;
    }

    /**
     * <p>
     * To filter the results to show only metrics that have had data points published in the past three hours, specify
     * this parameter with a value of <code>PT3H</code>. This is the only valid value for this parameter.
     * </p>
     * <p>
     * The results that are returned are an approximation of the value you specify. There is a low probability that the
     * returned results include metrics with last published data as much as 40 minutes more than the specified time
     * interval.
     * </p>
     * 
     * @param recentlyActive
     *        To filter the results to show only metrics that have had data points published in the past three hours,
     *        specify this parameter with a value of <code>PT3H</code>. This is the only valid value for this
     *        parameter.</p>
     *        <p>
     *        The results that are returned are an approximation of the value you specify. There is a low probability
     *        that the returned results include metrics with last published data as much as 40 minutes more than the
     *        specified time interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecentlyActive
     */

    public ListMetricsRequest withRecentlyActive(RecentlyActive recentlyActive) {
        this.recentlyActive = recentlyActive.toString();
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRecentlyActive() != null)
            sb.append("RecentlyActive: ").append(getRecentlyActive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMetricsRequest == false)
            return false;
        ListMetricsRequest other = (ListMetricsRequest) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecentlyActive() == null ^ this.getRecentlyActive() == null)
            return false;
        if (other.getRecentlyActive() != null && other.getRecentlyActive().equals(this.getRecentlyActive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecentlyActive() == null) ? 0 : getRecentlyActive().hashCode());
        return hashCode;
    }

    @Override
    public ListMetricsRequest clone() {
        return (ListMetricsRequest) super.clone();
    }

}
