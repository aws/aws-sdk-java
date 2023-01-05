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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/GetAppMonitorData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAppMonitorDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures that you can use to filter the results to those that match one or more sets of key-value
     * pairs that you specify.
     * </p>
     */
    private java.util.List<QueryFilter> filters;
    /**
     * <p>
     * The maximum number of results to return in one operation.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name of the app monitor that collected the data that you want to retrieve.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A structure that defines the time range that you want to retrieve results from.
     * </p>
     */
    private TimeRange timeRange;

    /**
     * <p>
     * An array of structures that you can use to filter the results to those that match one or more sets of key-value
     * pairs that you specify.
     * </p>
     * 
     * @return An array of structures that you can use to filter the results to those that match one or more sets of
     *         key-value pairs that you specify.
     */

    public java.util.List<QueryFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of structures that you can use to filter the results to those that match one or more sets of key-value
     * pairs that you specify.
     * </p>
     * 
     * @param filters
     *        An array of structures that you can use to filter the results to those that match one or more sets of
     *        key-value pairs that you specify.
     */

    public void setFilters(java.util.Collection<QueryFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<QueryFilter>(filters);
    }

    /**
     * <p>
     * An array of structures that you can use to filter the results to those that match one or more sets of key-value
     * pairs that you specify.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of structures that you can use to filter the results to those that match one or more sets of
     *        key-value pairs that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppMonitorDataRequest withFilters(QueryFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<QueryFilter>(filters.length));
        }
        for (QueryFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that you can use to filter the results to those that match one or more sets of key-value
     * pairs that you specify.
     * </p>
     * 
     * @param filters
     *        An array of structures that you can use to filter the results to those that match one or more sets of
     *        key-value pairs that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppMonitorDataRequest withFilters(java.util.Collection<QueryFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in one operation.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation.
     * </p>
     * 
     * @return The maximum number of results to return in one operation.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in one operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppMonitorDataRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name of the app monitor that collected the data that you want to retrieve.
     * </p>
     * 
     * @param name
     *        The name of the app monitor that collected the data that you want to retrieve.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the app monitor that collected the data that you want to retrieve.
     * </p>
     * 
     * @return The name of the app monitor that collected the data that you want to retrieve.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the app monitor that collected the data that you want to retrieve.
     * </p>
     * 
     * @param name
     *        The name of the app monitor that collected the data that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppMonitorDataRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Use the token returned by the previous operation to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     * 
     * @return Use the token returned by the previous operation to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Use the token returned by the previous operation to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppMonitorDataRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A structure that defines the time range that you want to retrieve results from.
     * </p>
     * 
     * @param timeRange
     *        A structure that defines the time range that you want to retrieve results from.
     */

    public void setTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
    }

    /**
     * <p>
     * A structure that defines the time range that you want to retrieve results from.
     * </p>
     * 
     * @return A structure that defines the time range that you want to retrieve results from.
     */

    public TimeRange getTimeRange() {
        return this.timeRange;
    }

    /**
     * <p>
     * A structure that defines the time range that you want to retrieve results from.
     * </p>
     * 
     * @param timeRange
     *        A structure that defines the time range that you want to retrieve results from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppMonitorDataRequest withTimeRange(TimeRange timeRange) {
        setTimeRange(timeRange);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTimeRange() != null)
            sb.append("TimeRange: ").append(getTimeRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAppMonitorDataRequest == false)
            return false;
        GetAppMonitorDataRequest other = (GetAppMonitorDataRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTimeRange() == null ^ this.getTimeRange() == null)
            return false;
        if (other.getTimeRange() != null && other.getTimeRange().equals(this.getTimeRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTimeRange() == null) ? 0 : getTimeRange().hashCode());
        return hashCode;
    }

    @Override
    public GetAppMonitorDataRequest clone() {
        return (GetAppMonitorDataRequest) super.clone();
    }

}
