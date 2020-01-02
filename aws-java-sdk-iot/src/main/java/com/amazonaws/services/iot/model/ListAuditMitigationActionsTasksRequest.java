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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAuditMitigationActionsTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to results for a specific audit.
     * </p>
     */
    private String auditTaskId;
    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to a specific audit finding.
     * </p>
     */
    private String findingId;
    /**
     * <p>
     * Specify this filter to limit results to tasks that are in a specific state.
     * </p>
     */
    private String taskStatus;
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
     * Specify this filter to limit results to tasks that began on or after a specific date and time.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Specify this filter to limit results to tasks that were completed or canceled on or before a specific date and
     * time.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to results for a specific audit.
     * </p>
     * 
     * @param auditTaskId
     *        Specify this filter to limit results to tasks that were applied to results for a specific audit.
     */

    public void setAuditTaskId(String auditTaskId) {
        this.auditTaskId = auditTaskId;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to results for a specific audit.
     * </p>
     * 
     * @return Specify this filter to limit results to tasks that were applied to results for a specific audit.
     */

    public String getAuditTaskId() {
        return this.auditTaskId;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to results for a specific audit.
     * </p>
     * 
     * @param auditTaskId
     *        Specify this filter to limit results to tasks that were applied to results for a specific audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditMitigationActionsTasksRequest withAuditTaskId(String auditTaskId) {
        setAuditTaskId(auditTaskId);
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to a specific audit finding.
     * </p>
     * 
     * @param findingId
     *        Specify this filter to limit results to tasks that were applied to a specific audit finding.
     */

    public void setFindingId(String findingId) {
        this.findingId = findingId;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to a specific audit finding.
     * </p>
     * 
     * @return Specify this filter to limit results to tasks that were applied to a specific audit finding.
     */

    public String getFindingId() {
        return this.findingId;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to a specific audit finding.
     * </p>
     * 
     * @param findingId
     *        Specify this filter to limit results to tasks that were applied to a specific audit finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditMitigationActionsTasksRequest withFindingId(String findingId) {
        setFindingId(findingId);
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that are in a specific state.
     * </p>
     * 
     * @param taskStatus
     *        Specify this filter to limit results to tasks that are in a specific state.
     * @see AuditMitigationActionsTaskStatus
     */

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that are in a specific state.
     * </p>
     * 
     * @return Specify this filter to limit results to tasks that are in a specific state.
     * @see AuditMitigationActionsTaskStatus
     */

    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that are in a specific state.
     * </p>
     * 
     * @param taskStatus
     *        Specify this filter to limit results to tasks that are in a specific state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditMitigationActionsTaskStatus
     */

    public ListAuditMitigationActionsTasksRequest withTaskStatus(String taskStatus) {
        setTaskStatus(taskStatus);
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that are in a specific state.
     * </p>
     * 
     * @param taskStatus
     *        Specify this filter to limit results to tasks that are in a specific state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditMitigationActionsTaskStatus
     */

    public ListAuditMitigationActionsTasksRequest withTaskStatus(AuditMitigationActionsTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

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

    public ListAuditMitigationActionsTasksRequest withMaxResults(Integer maxResults) {
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

    public ListAuditMitigationActionsTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that began on or after a specific date and time.
     * </p>
     * 
     * @param startTime
     *        Specify this filter to limit results to tasks that began on or after a specific date and time.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that began on or after a specific date and time.
     * </p>
     * 
     * @return Specify this filter to limit results to tasks that began on or after a specific date and time.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that began on or after a specific date and time.
     * </p>
     * 
     * @param startTime
     *        Specify this filter to limit results to tasks that began on or after a specific date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditMitigationActionsTasksRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were completed or canceled on or before a specific date and
     * time.
     * </p>
     * 
     * @param endTime
     *        Specify this filter to limit results to tasks that were completed or canceled on or before a specific date
     *        and time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were completed or canceled on or before a specific date and
     * time.
     * </p>
     * 
     * @return Specify this filter to limit results to tasks that were completed or canceled on or before a specific
     *         date and time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were completed or canceled on or before a specific date and
     * time.
     * </p>
     * 
     * @param endTime
     *        Specify this filter to limit results to tasks that were completed or canceled on or before a specific date
     *        and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditMitigationActionsTasksRequest withEndTime(java.util.Date endTime) {
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
        if (getAuditTaskId() != null)
            sb.append("AuditTaskId: ").append(getAuditTaskId()).append(",");
        if (getFindingId() != null)
            sb.append("FindingId: ").append(getFindingId()).append(",");
        if (getTaskStatus() != null)
            sb.append("TaskStatus: ").append(getTaskStatus()).append(",");
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

        if (obj instanceof ListAuditMitigationActionsTasksRequest == false)
            return false;
        ListAuditMitigationActionsTasksRequest other = (ListAuditMitigationActionsTasksRequest) obj;
        if (other.getAuditTaskId() == null ^ this.getAuditTaskId() == null)
            return false;
        if (other.getAuditTaskId() != null && other.getAuditTaskId().equals(this.getAuditTaskId()) == false)
            return false;
        if (other.getFindingId() == null ^ this.getFindingId() == null)
            return false;
        if (other.getFindingId() != null && other.getFindingId().equals(this.getFindingId()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAuditTaskId() == null) ? 0 : getAuditTaskId().hashCode());
        hashCode = prime * hashCode + ((getFindingId() == null) ? 0 : getFindingId().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public ListAuditMitigationActionsTasksRequest clone() {
        return (ListAuditMitigationActionsTasksRequest) super.clone();
    }

}
