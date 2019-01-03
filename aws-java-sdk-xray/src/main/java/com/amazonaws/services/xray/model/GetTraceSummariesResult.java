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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTraceSummaries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTraceSummariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Trace IDs and metadata for traces that were found in the specified time frame.
     * </p>
     */
    private java.util.List<TraceSummary> traceSummaries;
    /**
     * <p>
     * The start time of this page of results.
     * </p>
     */
    private java.util.Date approximateTime;
    /**
     * <p>
     * The total number of traces processed, including traces that did not match the specified filter expression.
     * </p>
     */
    private Long tracesProcessedCount;
    /**
     * <p>
     * If the requested time frame contained more than one page of results, you can use this token to retrieve the next
     * page. The first page contains the most most recent results, closest to the end of the time frame.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Trace IDs and metadata for traces that were found in the specified time frame.
     * </p>
     * 
     * @return Trace IDs and metadata for traces that were found in the specified time frame.
     */

    public java.util.List<TraceSummary> getTraceSummaries() {
        return traceSummaries;
    }

    /**
     * <p>
     * Trace IDs and metadata for traces that were found in the specified time frame.
     * </p>
     * 
     * @param traceSummaries
     *        Trace IDs and metadata for traces that were found in the specified time frame.
     */

    public void setTraceSummaries(java.util.Collection<TraceSummary> traceSummaries) {
        if (traceSummaries == null) {
            this.traceSummaries = null;
            return;
        }

        this.traceSummaries = new java.util.ArrayList<TraceSummary>(traceSummaries);
    }

    /**
     * <p>
     * Trace IDs and metadata for traces that were found in the specified time frame.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTraceSummaries(java.util.Collection)} or {@link #withTraceSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param traceSummaries
     *        Trace IDs and metadata for traces that were found in the specified time frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTraceSummariesResult withTraceSummaries(TraceSummary... traceSummaries) {
        if (this.traceSummaries == null) {
            setTraceSummaries(new java.util.ArrayList<TraceSummary>(traceSummaries.length));
        }
        for (TraceSummary ele : traceSummaries) {
            this.traceSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Trace IDs and metadata for traces that were found in the specified time frame.
     * </p>
     * 
     * @param traceSummaries
     *        Trace IDs and metadata for traces that were found in the specified time frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTraceSummariesResult withTraceSummaries(java.util.Collection<TraceSummary> traceSummaries) {
        setTraceSummaries(traceSummaries);
        return this;
    }

    /**
     * <p>
     * The start time of this page of results.
     * </p>
     * 
     * @param approximateTime
     *        The start time of this page of results.
     */

    public void setApproximateTime(java.util.Date approximateTime) {
        this.approximateTime = approximateTime;
    }

    /**
     * <p>
     * The start time of this page of results.
     * </p>
     * 
     * @return The start time of this page of results.
     */

    public java.util.Date getApproximateTime() {
        return this.approximateTime;
    }

    /**
     * <p>
     * The start time of this page of results.
     * </p>
     * 
     * @param approximateTime
     *        The start time of this page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTraceSummariesResult withApproximateTime(java.util.Date approximateTime) {
        setApproximateTime(approximateTime);
        return this;
    }

    /**
     * <p>
     * The total number of traces processed, including traces that did not match the specified filter expression.
     * </p>
     * 
     * @param tracesProcessedCount
     *        The total number of traces processed, including traces that did not match the specified filter expression.
     */

    public void setTracesProcessedCount(Long tracesProcessedCount) {
        this.tracesProcessedCount = tracesProcessedCount;
    }

    /**
     * <p>
     * The total number of traces processed, including traces that did not match the specified filter expression.
     * </p>
     * 
     * @return The total number of traces processed, including traces that did not match the specified filter
     *         expression.
     */

    public Long getTracesProcessedCount() {
        return this.tracesProcessedCount;
    }

    /**
     * <p>
     * The total number of traces processed, including traces that did not match the specified filter expression.
     * </p>
     * 
     * @param tracesProcessedCount
     *        The total number of traces processed, including traces that did not match the specified filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTraceSummariesResult withTracesProcessedCount(Long tracesProcessedCount) {
        setTracesProcessedCount(tracesProcessedCount);
        return this;
    }

    /**
     * <p>
     * If the requested time frame contained more than one page of results, you can use this token to retrieve the next
     * page. The first page contains the most most recent results, closest to the end of the time frame.
     * </p>
     * 
     * @param nextToken
     *        If the requested time frame contained more than one page of results, you can use this token to retrieve
     *        the next page. The first page contains the most most recent results, closest to the end of the time frame.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the requested time frame contained more than one page of results, you can use this token to retrieve the next
     * page. The first page contains the most most recent results, closest to the end of the time frame.
     * </p>
     * 
     * @return If the requested time frame contained more than one page of results, you can use this token to retrieve
     *         the next page. The first page contains the most most recent results, closest to the end of the time
     *         frame.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the requested time frame contained more than one page of results, you can use this token to retrieve the next
     * page. The first page contains the most most recent results, closest to the end of the time frame.
     * </p>
     * 
     * @param nextToken
     *        If the requested time frame contained more than one page of results, you can use this token to retrieve
     *        the next page. The first page contains the most most recent results, closest to the end of the time frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTraceSummariesResult withNextToken(String nextToken) {
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
        if (getTraceSummaries() != null)
            sb.append("TraceSummaries: ").append(getTraceSummaries()).append(",");
        if (getApproximateTime() != null)
            sb.append("ApproximateTime: ").append(getApproximateTime()).append(",");
        if (getTracesProcessedCount() != null)
            sb.append("TracesProcessedCount: ").append(getTracesProcessedCount()).append(",");
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

        if (obj instanceof GetTraceSummariesResult == false)
            return false;
        GetTraceSummariesResult other = (GetTraceSummariesResult) obj;
        if (other.getTraceSummaries() == null ^ this.getTraceSummaries() == null)
            return false;
        if (other.getTraceSummaries() != null && other.getTraceSummaries().equals(this.getTraceSummaries()) == false)
            return false;
        if (other.getApproximateTime() == null ^ this.getApproximateTime() == null)
            return false;
        if (other.getApproximateTime() != null && other.getApproximateTime().equals(this.getApproximateTime()) == false)
            return false;
        if (other.getTracesProcessedCount() == null ^ this.getTracesProcessedCount() == null)
            return false;
        if (other.getTracesProcessedCount() != null && other.getTracesProcessedCount().equals(this.getTracesProcessedCount()) == false)
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

        hashCode = prime * hashCode + ((getTraceSummaries() == null) ? 0 : getTraceSummaries().hashCode());
        hashCode = prime * hashCode + ((getApproximateTime() == null) ? 0 : getApproximateTime().hashCode());
        hashCode = prime * hashCode + ((getTracesProcessedCount() == null) ? 0 : getTracesProcessedCount().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTraceSummariesResult clone() {
        try {
            return (GetTraceSummariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
