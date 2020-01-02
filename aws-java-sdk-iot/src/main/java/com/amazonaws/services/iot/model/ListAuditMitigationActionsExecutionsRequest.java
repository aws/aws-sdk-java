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
public class ListAuditMitigationActionsExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify this filter to limit results to actions for a specific audit mitigation actions task.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * Specify this filter to limit results to those with a specific status.
     * </p>
     */
    private String actionStatus;
    /**
     * <p>
     * Specify this filter to limit results to those that were applied to a specific audit finding.
     * </p>
     */
    private String findingId;
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
     * Specify this filter to limit results to actions for a specific audit mitigation actions task.
     * </p>
     * 
     * @param taskId
     *        Specify this filter to limit results to actions for a specific audit mitigation actions task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * Specify this filter to limit results to actions for a specific audit mitigation actions task.
     * </p>
     * 
     * @return Specify this filter to limit results to actions for a specific audit mitigation actions task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * Specify this filter to limit results to actions for a specific audit mitigation actions task.
     * </p>
     * 
     * @param taskId
     *        Specify this filter to limit results to actions for a specific audit mitigation actions task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditMitigationActionsExecutionsRequest withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to those with a specific status.
     * </p>
     * 
     * @param actionStatus
     *        Specify this filter to limit results to those with a specific status.
     * @see AuditMitigationActionsExecutionStatus
     */

    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    /**
     * <p>
     * Specify this filter to limit results to those with a specific status.
     * </p>
     * 
     * @return Specify this filter to limit results to those with a specific status.
     * @see AuditMitigationActionsExecutionStatus
     */

    public String getActionStatus() {
        return this.actionStatus;
    }

    /**
     * <p>
     * Specify this filter to limit results to those with a specific status.
     * </p>
     * 
     * @param actionStatus
     *        Specify this filter to limit results to those with a specific status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditMitigationActionsExecutionStatus
     */

    public ListAuditMitigationActionsExecutionsRequest withActionStatus(String actionStatus) {
        setActionStatus(actionStatus);
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to those with a specific status.
     * </p>
     * 
     * @param actionStatus
     *        Specify this filter to limit results to those with a specific status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditMitigationActionsExecutionStatus
     */

    public ListAuditMitigationActionsExecutionsRequest withActionStatus(AuditMitigationActionsExecutionStatus actionStatus) {
        this.actionStatus = actionStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to those that were applied to a specific audit finding.
     * </p>
     * 
     * @param findingId
     *        Specify this filter to limit results to those that were applied to a specific audit finding.
     */

    public void setFindingId(String findingId) {
        this.findingId = findingId;
    }

    /**
     * <p>
     * Specify this filter to limit results to those that were applied to a specific audit finding.
     * </p>
     * 
     * @return Specify this filter to limit results to those that were applied to a specific audit finding.
     */

    public String getFindingId() {
        return this.findingId;
    }

    /**
     * <p>
     * Specify this filter to limit results to those that were applied to a specific audit finding.
     * </p>
     * 
     * @param findingId
     *        Specify this filter to limit results to those that were applied to a specific audit finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditMitigationActionsExecutionsRequest withFindingId(String findingId) {
        setFindingId(findingId);
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

    public ListAuditMitigationActionsExecutionsRequest withMaxResults(Integer maxResults) {
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

    public ListAuditMitigationActionsExecutionsRequest withNextToken(String nextToken) {
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getActionStatus() != null)
            sb.append("ActionStatus: ").append(getActionStatus()).append(",");
        if (getFindingId() != null)
            sb.append("FindingId: ").append(getFindingId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListAuditMitigationActionsExecutionsRequest == false)
            return false;
        ListAuditMitigationActionsExecutionsRequest other = (ListAuditMitigationActionsExecutionsRequest) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getActionStatus() == null ^ this.getActionStatus() == null)
            return false;
        if (other.getActionStatus() != null && other.getActionStatus().equals(this.getActionStatus()) == false)
            return false;
        if (other.getFindingId() == null ^ this.getFindingId() == null)
            return false;
        if (other.getFindingId() != null && other.getFindingId().equals(this.getFindingId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getActionStatus() == null) ? 0 : getActionStatus().hashCode());
        hashCode = prime * hashCode + ((getFindingId() == null) ? 0 : getFindingId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAuditMitigationActionsExecutionsRequest clone() {
        return (ListAuditMitigationActionsExecutionsRequest) super.clone();
    }

}
