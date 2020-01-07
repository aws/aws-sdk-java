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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTimeSeriesServiceStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTimeSeriesServiceStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The collection of statistics.
     * </p>
     */
    private java.util.List<TimeSeriesServiceStatistics> timeSeriesServiceStatistics;
    /**
     * <p>
     * A flag indicating whether or not a group's filter expression has been consistent, or if a returned aggregation
     * may show statistics from an older version of the group's filter expression.
     * </p>
     */
    private Boolean containsOldGroupVersions;
    /**
     * <p>
     * Pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The collection of statistics.
     * </p>
     * 
     * @return The collection of statistics.
     */

    public java.util.List<TimeSeriesServiceStatistics> getTimeSeriesServiceStatistics() {
        return timeSeriesServiceStatistics;
    }

    /**
     * <p>
     * The collection of statistics.
     * </p>
     * 
     * @param timeSeriesServiceStatistics
     *        The collection of statistics.
     */

    public void setTimeSeriesServiceStatistics(java.util.Collection<TimeSeriesServiceStatistics> timeSeriesServiceStatistics) {
        if (timeSeriesServiceStatistics == null) {
            this.timeSeriesServiceStatistics = null;
            return;
        }

        this.timeSeriesServiceStatistics = new java.util.ArrayList<TimeSeriesServiceStatistics>(timeSeriesServiceStatistics);
    }

    /**
     * <p>
     * The collection of statistics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimeSeriesServiceStatistics(java.util.Collection)} or
     * {@link #withTimeSeriesServiceStatistics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param timeSeriesServiceStatistics
     *        The collection of statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesServiceStatisticsResult withTimeSeriesServiceStatistics(TimeSeriesServiceStatistics... timeSeriesServiceStatistics) {
        if (this.timeSeriesServiceStatistics == null) {
            setTimeSeriesServiceStatistics(new java.util.ArrayList<TimeSeriesServiceStatistics>(timeSeriesServiceStatistics.length));
        }
        for (TimeSeriesServiceStatistics ele : timeSeriesServiceStatistics) {
            this.timeSeriesServiceStatistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The collection of statistics.
     * </p>
     * 
     * @param timeSeriesServiceStatistics
     *        The collection of statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesServiceStatisticsResult withTimeSeriesServiceStatistics(java.util.Collection<TimeSeriesServiceStatistics> timeSeriesServiceStatistics) {
        setTimeSeriesServiceStatistics(timeSeriesServiceStatistics);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether or not a group's filter expression has been consistent, or if a returned aggregation
     * may show statistics from an older version of the group's filter expression.
     * </p>
     * 
     * @param containsOldGroupVersions
     *        A flag indicating whether or not a group's filter expression has been consistent, or if a returned
     *        aggregation may show statistics from an older version of the group's filter expression.
     */

    public void setContainsOldGroupVersions(Boolean containsOldGroupVersions) {
        this.containsOldGroupVersions = containsOldGroupVersions;
    }

    /**
     * <p>
     * A flag indicating whether or not a group's filter expression has been consistent, or if a returned aggregation
     * may show statistics from an older version of the group's filter expression.
     * </p>
     * 
     * @return A flag indicating whether or not a group's filter expression has been consistent, or if a returned
     *         aggregation may show statistics from an older version of the group's filter expression.
     */

    public Boolean getContainsOldGroupVersions() {
        return this.containsOldGroupVersions;
    }

    /**
     * <p>
     * A flag indicating whether or not a group's filter expression has been consistent, or if a returned aggregation
     * may show statistics from an older version of the group's filter expression.
     * </p>
     * 
     * @param containsOldGroupVersions
     *        A flag indicating whether or not a group's filter expression has been consistent, or if a returned
     *        aggregation may show statistics from an older version of the group's filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesServiceStatisticsResult withContainsOldGroupVersions(Boolean containsOldGroupVersions) {
        setContainsOldGroupVersions(containsOldGroupVersions);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether or not a group's filter expression has been consistent, or if a returned aggregation
     * may show statistics from an older version of the group's filter expression.
     * </p>
     * 
     * @return A flag indicating whether or not a group's filter expression has been consistent, or if a returned
     *         aggregation may show statistics from an older version of the group's filter expression.
     */

    public Boolean isContainsOldGroupVersions() {
        return this.containsOldGroupVersions;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @return Pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesServiceStatisticsResult withNextToken(String nextToken) {
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
        if (getTimeSeriesServiceStatistics() != null)
            sb.append("TimeSeriesServiceStatistics: ").append(getTimeSeriesServiceStatistics()).append(",");
        if (getContainsOldGroupVersions() != null)
            sb.append("ContainsOldGroupVersions: ").append(getContainsOldGroupVersions()).append(",");
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

        if (obj instanceof GetTimeSeriesServiceStatisticsResult == false)
            return false;
        GetTimeSeriesServiceStatisticsResult other = (GetTimeSeriesServiceStatisticsResult) obj;
        if (other.getTimeSeriesServiceStatistics() == null ^ this.getTimeSeriesServiceStatistics() == null)
            return false;
        if (other.getTimeSeriesServiceStatistics() != null && other.getTimeSeriesServiceStatistics().equals(this.getTimeSeriesServiceStatistics()) == false)
            return false;
        if (other.getContainsOldGroupVersions() == null ^ this.getContainsOldGroupVersions() == null)
            return false;
        if (other.getContainsOldGroupVersions() != null && other.getContainsOldGroupVersions().equals(this.getContainsOldGroupVersions()) == false)
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

        hashCode = prime * hashCode + ((getTimeSeriesServiceStatistics() == null) ? 0 : getTimeSeriesServiceStatistics().hashCode());
        hashCode = prime * hashCode + ((getContainsOldGroupVersions() == null) ? 0 : getContainsOldGroupVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTimeSeriesServiceStatisticsResult clone() {
        try {
            return (GetTimeSeriesServiceStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
