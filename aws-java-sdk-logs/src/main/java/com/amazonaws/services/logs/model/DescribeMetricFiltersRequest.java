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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeMetricFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMetricFiltersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The prefix to match.
     * </p>
     */
    private String filterNamePrefix;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Filters results to include only those with the specified metric name. If you include this parameter in your
     * request, you must also include the <code>metricNamespace</code> parameter.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * Filters results to include only those in the specified namespace. If you include this parameter in your request,
     * you must also include the <code>metricName</code> parameter.
     * </p>
     */
    private String metricNamespace;

    /**
     * Default constructor for DescribeMetricFiltersRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DescribeMetricFiltersRequest() {
    }

    /**
     * Constructs a new DescribeMetricFiltersRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param logGroupName
     *        The name of the log group.
     */
    public DescribeMetricFiltersRequest(String logGroupName) {
        setLogGroupName(logGroupName);
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @return The name of the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricFiltersRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The prefix to match.
     * </p>
     * 
     * @param filterNamePrefix
     *        The prefix to match.
     */

    public void setFilterNamePrefix(String filterNamePrefix) {
        this.filterNamePrefix = filterNamePrefix;
    }

    /**
     * <p>
     * The prefix to match.
     * </p>
     * 
     * @return The prefix to match.
     */

    public String getFilterNamePrefix() {
        return this.filterNamePrefix;
    }

    /**
     * <p>
     * The prefix to match.
     * </p>
     * 
     * @param filterNamePrefix
     *        The prefix to match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricFiltersRequest withFilterNamePrefix(String filterNamePrefix) {
        setFilterNamePrefix(filterNamePrefix);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricFiltersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     * 
     * @return The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricFiltersRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Filters results to include only those with the specified metric name. If you include this parameter in your
     * request, you must also include the <code>metricNamespace</code> parameter.
     * </p>
     * 
     * @param metricName
     *        Filters results to include only those with the specified metric name. If you include this parameter in
     *        your request, you must also include the <code>metricNamespace</code> parameter.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * Filters results to include only those with the specified metric name. If you include this parameter in your
     * request, you must also include the <code>metricNamespace</code> parameter.
     * </p>
     * 
     * @return Filters results to include only those with the specified metric name. If you include this parameter in
     *         your request, you must also include the <code>metricNamespace</code> parameter.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * Filters results to include only those with the specified metric name. If you include this parameter in your
     * request, you must also include the <code>metricNamespace</code> parameter.
     * </p>
     * 
     * @param metricName
     *        Filters results to include only those with the specified metric name. If you include this parameter in
     *        your request, you must also include the <code>metricNamespace</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricFiltersRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * Filters results to include only those in the specified namespace. If you include this parameter in your request,
     * you must also include the <code>metricName</code> parameter.
     * </p>
     * 
     * @param metricNamespace
     *        Filters results to include only those in the specified namespace. If you include this parameter in your
     *        request, you must also include the <code>metricName</code> parameter.
     */

    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    /**
     * <p>
     * Filters results to include only those in the specified namespace. If you include this parameter in your request,
     * you must also include the <code>metricName</code> parameter.
     * </p>
     * 
     * @return Filters results to include only those in the specified namespace. If you include this parameter in your
     *         request, you must also include the <code>metricName</code> parameter.
     */

    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    /**
     * <p>
     * Filters results to include only those in the specified namespace. If you include this parameter in your request,
     * you must also include the <code>metricName</code> parameter.
     * </p>
     * 
     * @param metricNamespace
     *        Filters results to include only those in the specified namespace. If you include this parameter in your
     *        request, you must also include the <code>metricName</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricFiltersRequest withMetricNamespace(String metricNamespace) {
        setMetricNamespace(metricNamespace);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getFilterNamePrefix() != null)
            sb.append("FilterNamePrefix: ").append(getFilterNamePrefix()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getMetricNamespace() != null)
            sb.append("MetricNamespace: ").append(getMetricNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMetricFiltersRequest == false)
            return false;
        DescribeMetricFiltersRequest other = (DescribeMetricFiltersRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getFilterNamePrefix() == null ^ this.getFilterNamePrefix() == null)
            return false;
        if (other.getFilterNamePrefix() != null && other.getFilterNamePrefix().equals(this.getFilterNamePrefix()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricNamespace() == null ^ this.getMetricNamespace() == null)
            return false;
        if (other.getMetricNamespace() != null && other.getMetricNamespace().equals(this.getMetricNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getFilterNamePrefix() == null) ? 0 : getFilterNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricNamespace() == null) ? 0 : getMetricNamespace().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMetricFiltersRequest clone() {
        return (DescribeMetricFiltersRequest) super.clone();
    }

}
