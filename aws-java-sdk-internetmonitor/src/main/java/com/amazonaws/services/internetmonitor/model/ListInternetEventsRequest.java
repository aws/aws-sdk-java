/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListInternetEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInternetEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of query results that you want to return with this call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The start time of the time window that you want to get a list of internet events for.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the time window that you want to get a list of internet events for.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The status of an internet event.
     * </p>
     */
    private String eventStatus;
    /**
     * <p>
     * The type of network impairment.
     * </p>
     */
    private String eventType;

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @return The token for the next set of results. You receive this token from a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInternetEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of query results that you want to return with this call.
     * </p>
     * 
     * @param maxResults
     *        The number of query results that you want to return with this call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of query results that you want to return with this call.
     * </p>
     * 
     * @return The number of query results that you want to return with this call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of query results that you want to return with this call.
     * </p>
     * 
     * @param maxResults
     *        The number of query results that you want to return with this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInternetEventsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The start time of the time window that you want to get a list of internet events for.
     * </p>
     * 
     * @param startTime
     *        The start time of the time window that you want to get a list of internet events for.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the time window that you want to get a list of internet events for.
     * </p>
     * 
     * @return The start time of the time window that you want to get a list of internet events for.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the time window that you want to get a list of internet events for.
     * </p>
     * 
     * @param startTime
     *        The start time of the time window that you want to get a list of internet events for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInternetEventsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the time window that you want to get a list of internet events for.
     * </p>
     * 
     * @param endTime
     *        The end time of the time window that you want to get a list of internet events for.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the time window that you want to get a list of internet events for.
     * </p>
     * 
     * @return The end time of the time window that you want to get a list of internet events for.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the time window that you want to get a list of internet events for.
     * </p>
     * 
     * @param endTime
     *        The end time of the time window that you want to get a list of internet events for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInternetEventsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The status of an internet event.
     * </p>
     * 
     * @param eventStatus
     *        The status of an internet event.
     */

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    /**
     * <p>
     * The status of an internet event.
     * </p>
     * 
     * @return The status of an internet event.
     */

    public String getEventStatus() {
        return this.eventStatus;
    }

    /**
     * <p>
     * The status of an internet event.
     * </p>
     * 
     * @param eventStatus
     *        The status of an internet event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInternetEventsRequest withEventStatus(String eventStatus) {
        setEventStatus(eventStatus);
        return this;
    }

    /**
     * <p>
     * The type of network impairment.
     * </p>
     * 
     * @param eventType
     *        The type of network impairment.
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of network impairment.
     * </p>
     * 
     * @return The type of network impairment.
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of network impairment.
     * </p>
     * 
     * @param eventType
     *        The type of network impairment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInternetEventsRequest withEventType(String eventType) {
        setEventType(eventType);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getEventStatus() != null)
            sb.append("EventStatus: ").append(getEventStatus()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInternetEventsRequest == false)
            return false;
        ListInternetEventsRequest other = (ListInternetEventsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getEventStatus() == null ^ this.getEventStatus() == null)
            return false;
        if (other.getEventStatus() != null && other.getEventStatus().equals(this.getEventStatus()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getEventStatus() == null) ? 0 : getEventStatus().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        return hashCode;
    }

    @Override
    public ListInternetEventsRequest clone() {
        return (ListInternetEventsRequest) super.clone();
    }

}
