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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListHealthEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHealthEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitor.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The time when a health event started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time when a health event ended. If the health event is still ongoing, then the end time is not set.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of health event objects that you want to return with this call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The status of a health event.
     * </p>
     */
    private String eventStatus;
    /**
     * <p>
     * The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet Monitor.
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     */
    private String linkedAccountId;

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @return The name of the monitor.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthEventsRequest withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The time when a health event started.
     * </p>
     * 
     * @param startTime
     *        The time when a health event started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time when a health event started.
     * </p>
     * 
     * @return The time when a health event started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time when a health event started.
     * </p>
     * 
     * @param startTime
     *        The time when a health event started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthEventsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time when a health event ended. If the health event is still ongoing, then the end time is not set.
     * </p>
     * 
     * @param endTime
     *        The time when a health event ended. If the health event is still ongoing, then the end time is not set.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time when a health event ended. If the health event is still ongoing, then the end time is not set.
     * </p>
     * 
     * @return The time when a health event ended. If the health event is still ongoing, then the end time is not set.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time when a health event ended. If the health event is still ongoing, then the end time is not set.
     * </p>
     * 
     * @param endTime
     *        The time when a health event ended. If the health event is still ongoing, then the end time is not set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthEventsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

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

    public ListHealthEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of health event objects that you want to return with this call.
     * </p>
     * 
     * @param maxResults
     *        The number of health event objects that you want to return with this call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of health event objects that you want to return with this call.
     * </p>
     * 
     * @return The number of health event objects that you want to return with this call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of health event objects that you want to return with this call.
     * </p>
     * 
     * @param maxResults
     *        The number of health event objects that you want to return with this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthEventsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The status of a health event.
     * </p>
     * 
     * @param eventStatus
     *        The status of a health event.
     * @see HealthEventStatus
     */

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    /**
     * <p>
     * The status of a health event.
     * </p>
     * 
     * @return The status of a health event.
     * @see HealthEventStatus
     */

    public String getEventStatus() {
        return this.eventStatus;
    }

    /**
     * <p>
     * The status of a health event.
     * </p>
     * 
     * @param eventStatus
     *        The status of a health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthEventStatus
     */

    public ListHealthEventsRequest withEventStatus(String eventStatus) {
        setEventStatus(eventStatus);
        return this;
    }

    /**
     * <p>
     * The status of a health event.
     * </p>
     * 
     * @param eventStatus
     *        The status of a health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthEventStatus
     */

    public ListHealthEventsRequest withEventStatus(HealthEventStatus eventStatus) {
        this.eventStatus = eventStatus.toString();
        return this;
    }

    /**
     * <p>
     * The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet Monitor.
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     * 
     * @param linkedAccountId
     *        The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet
     *        Monitor. You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet
     *        Monitor cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     */

    public void setLinkedAccountId(String linkedAccountId) {
        this.linkedAccountId = linkedAccountId;
    }

    /**
     * <p>
     * The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet Monitor.
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     * 
     * @return The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet
     *         Monitor. You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet
     *         Monitor cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     */

    public String getLinkedAccountId() {
        return this.linkedAccountId;
    }

    /**
     * <p>
     * The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet Monitor.
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     * 
     * @param linkedAccountId
     *        The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet
     *        Monitor. You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet
     *        Monitor cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthEventsRequest withLinkedAccountId(String linkedAccountId) {
        setLinkedAccountId(linkedAccountId);
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
        if (getMonitorName() != null)
            sb.append("MonitorName: ").append(getMonitorName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getEventStatus() != null)
            sb.append("EventStatus: ").append(getEventStatus()).append(",");
        if (getLinkedAccountId() != null)
            sb.append("LinkedAccountId: ").append(getLinkedAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHealthEventsRequest == false)
            return false;
        ListHealthEventsRequest other = (ListHealthEventsRequest) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getEventStatus() == null ^ this.getEventStatus() == null)
            return false;
        if (other.getEventStatus() != null && other.getEventStatus().equals(this.getEventStatus()) == false)
            return false;
        if (other.getLinkedAccountId() == null ^ this.getLinkedAccountId() == null)
            return false;
        if (other.getLinkedAccountId() != null && other.getLinkedAccountId().equals(this.getLinkedAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getEventStatus() == null) ? 0 : getEventStatus().hashCode());
        hashCode = prime * hashCode + ((getLinkedAccountId() == null) ? 0 : getLinkedAccountId().hashCode());
        return hashCode;
    }

    @Override
    public ListHealthEventsRequest clone() {
        return (ListHealthEventsRequest) super.clone();
    }

}
