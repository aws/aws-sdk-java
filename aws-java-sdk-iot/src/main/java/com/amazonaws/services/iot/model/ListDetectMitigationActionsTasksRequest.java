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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDetectMitigationActionsTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A filter to limit results to those found after the specified time. You must specify either the startTime and
     * endTime or the taskId, but not both.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time period for which ML Detect mitigation actions tasks are returned.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time. The default is 25.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * 
     * @return The maximum number of results to return at one time. The default is 25.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time. The default is 25.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectMitigationActionsTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectMitigationActionsTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A filter to limit results to those found after the specified time. You must specify either the startTime and
     * endTime or the taskId, but not both.
     * </p>
     * 
     * @param startTime
     *        A filter to limit results to those found after the specified time. You must specify either the startTime
     *        and endTime or the taskId, but not both.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A filter to limit results to those found after the specified time. You must specify either the startTime and
     * endTime or the taskId, but not both.
     * </p>
     * 
     * @return A filter to limit results to those found after the specified time. You must specify either the startTime
     *         and endTime or the taskId, but not both.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A filter to limit results to those found after the specified time. You must specify either the startTime and
     * endTime or the taskId, but not both.
     * </p>
     * 
     * @param startTime
     *        A filter to limit results to those found after the specified time. You must specify either the startTime
     *        and endTime or the taskId, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectMitigationActionsTasksRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time period for which ML Detect mitigation actions tasks are returned.
     * </p>
     * 
     * @param endTime
     *        The end of the time period for which ML Detect mitigation actions tasks are returned.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time period for which ML Detect mitigation actions tasks are returned.
     * </p>
     * 
     * @return The end of the time period for which ML Detect mitigation actions tasks are returned.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time period for which ML Detect mitigation actions tasks are returned.
     * </p>
     * 
     * @param endTime
     *        The end of the time period for which ML Detect mitigation actions tasks are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectMitigationActionsTasksRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDetectMitigationActionsTasksRequest == false)
            return false;
        ListDetectMitigationActionsTasksRequest other = (ListDetectMitigationActionsTasksRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public ListDetectMitigationActionsTasksRequest clone() {
        return (ListDetectMitigationActionsTasksRequest) super.clone();
    }

}
