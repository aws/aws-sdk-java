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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListTimeSeries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTimeSeriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * One or more time series summaries to list.
     * </p>
     */
    private java.util.List<TimeSeriesSummary> timeSeriesSummaries;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more time series summaries to list.
     * </p>
     * 
     * @return One or more time series summaries to list.
     */

    public java.util.List<TimeSeriesSummary> getTimeSeriesSummaries() {
        return timeSeriesSummaries;
    }

    /**
     * <p>
     * One or more time series summaries to list.
     * </p>
     * 
     * @param timeSeriesSummaries
     *        One or more time series summaries to list.
     */

    public void setTimeSeriesSummaries(java.util.Collection<TimeSeriesSummary> timeSeriesSummaries) {
        if (timeSeriesSummaries == null) {
            this.timeSeriesSummaries = null;
            return;
        }

        this.timeSeriesSummaries = new java.util.ArrayList<TimeSeriesSummary>(timeSeriesSummaries);
    }

    /**
     * <p>
     * One or more time series summaries to list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimeSeriesSummaries(java.util.Collection)} or {@link #withTimeSeriesSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param timeSeriesSummaries
     *        One or more time series summaries to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesResult withTimeSeriesSummaries(TimeSeriesSummary... timeSeriesSummaries) {
        if (this.timeSeriesSummaries == null) {
            setTimeSeriesSummaries(new java.util.ArrayList<TimeSeriesSummary>(timeSeriesSummaries.length));
        }
        for (TimeSeriesSummary ele : timeSeriesSummaries) {
            this.timeSeriesSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more time series summaries to list.
     * </p>
     * 
     * @param timeSeriesSummaries
     *        One or more time series summaries to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesResult withTimeSeriesSummaries(java.util.Collection<TimeSeriesSummary> timeSeriesSummaries) {
        setTimeSeriesSummaries(timeSeriesSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesResult withNextToken(String nextToken) {
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
        if (getTimeSeriesSummaries() != null)
            sb.append("TimeSeriesSummaries: ").append(getTimeSeriesSummaries()).append(",");
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

        if (obj instanceof ListTimeSeriesResult == false)
            return false;
        ListTimeSeriesResult other = (ListTimeSeriesResult) obj;
        if (other.getTimeSeriesSummaries() == null ^ this.getTimeSeriesSummaries() == null)
            return false;
        if (other.getTimeSeriesSummaries() != null && other.getTimeSeriesSummaries().equals(this.getTimeSeriesSummaries()) == false)
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

        hashCode = prime * hashCode + ((getTimeSeriesSummaries() == null) ? 0 : getTimeSeriesSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTimeSeriesResult clone() {
        try {
            return (ListTimeSeriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
