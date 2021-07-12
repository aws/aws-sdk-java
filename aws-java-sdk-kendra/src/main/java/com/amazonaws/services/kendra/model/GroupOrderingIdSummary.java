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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information on the processing of <code>PUT</code> and <code>DELETE</code> actions for mapping users to their groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GroupOrderingIdSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupOrderingIdSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current processing status of actions for mapping users to their groups. The status can be either
     * <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>, <code>DELETED</code>, or
     * <code>FAILED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The last date-time an action was updated. An action can be a <code>PUT</code> or <code>DELETE</code> action for
     * mapping users to their groups.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The date-time an action was received by Amazon Kendra. An action can be a <code>PUT</code> or <code>DELETE</code>
     * action for mapping users to their groups.
     * </p>
     */
    private java.util.Date receivedAt;
    /**
     * <p>
     * The order in which actions should complete processing. An action can be a <code>PUT</code> or <code>DELETE</code>
     * action for mapping users to their groups.
     * </p>
     */
    private Long orderingId;
    /**
     * <p>
     * The reason an action could not be processed. An action can be a <code>PUT</code> or <code>DELETE</code> action
     * for mapping users to their groups.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The current processing status of actions for mapping users to their groups. The status can be either
     * <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>, <code>DELETED</code>, or
     * <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The current processing status of actions for mapping users to their groups. The status can be either
     *        <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>, <code>DELETED</code>, or
     *        <code>FAILED</code>.
     * @see PrincipalMappingStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current processing status of actions for mapping users to their groups. The status can be either
     * <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>, <code>DELETED</code>, or
     * <code>FAILED</code>.
     * </p>
     * 
     * @return The current processing status of actions for mapping users to their groups. The status can be either
     *         <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>, <code>DELETED</code>, or
     *         <code>FAILED</code>.
     * @see PrincipalMappingStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current processing status of actions for mapping users to their groups. The status can be either
     * <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>, <code>DELETED</code>, or
     * <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The current processing status of actions for mapping users to their groups. The status can be either
     *        <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>, <code>DELETED</code>, or
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalMappingStatus
     */

    public GroupOrderingIdSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current processing status of actions for mapping users to their groups. The status can be either
     * <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>, <code>DELETED</code>, or
     * <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The current processing status of actions for mapping users to their groups. The status can be either
     *        <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>, <code>DELETED</code>, or
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalMappingStatus
     */

    public GroupOrderingIdSummary withStatus(PrincipalMappingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The last date-time an action was updated. An action can be a <code>PUT</code> or <code>DELETE</code> action for
     * mapping users to their groups.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The last date-time an action was updated. An action can be a <code>PUT</code> or <code>DELETE</code>
     *        action for mapping users to their groups.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The last date-time an action was updated. An action can be a <code>PUT</code> or <code>DELETE</code> action for
     * mapping users to their groups.
     * </p>
     * 
     * @return The last date-time an action was updated. An action can be a <code>PUT</code> or <code>DELETE</code>
     *         action for mapping users to their groups.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The last date-time an action was updated. An action can be a <code>PUT</code> or <code>DELETE</code> action for
     * mapping users to their groups.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The last date-time an action was updated. An action can be a <code>PUT</code> or <code>DELETE</code>
     *        action for mapping users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupOrderingIdSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The date-time an action was received by Amazon Kendra. An action can be a <code>PUT</code> or <code>DELETE</code>
     * action for mapping users to their groups.
     * </p>
     * 
     * @param receivedAt
     *        The date-time an action was received by Amazon Kendra. An action can be a <code>PUT</code> or
     *        <code>DELETE</code> action for mapping users to their groups.
     */

    public void setReceivedAt(java.util.Date receivedAt) {
        this.receivedAt = receivedAt;
    }

    /**
     * <p>
     * The date-time an action was received by Amazon Kendra. An action can be a <code>PUT</code> or <code>DELETE</code>
     * action for mapping users to their groups.
     * </p>
     * 
     * @return The date-time an action was received by Amazon Kendra. An action can be a <code>PUT</code> or
     *         <code>DELETE</code> action for mapping users to their groups.
     */

    public java.util.Date getReceivedAt() {
        return this.receivedAt;
    }

    /**
     * <p>
     * The date-time an action was received by Amazon Kendra. An action can be a <code>PUT</code> or <code>DELETE</code>
     * action for mapping users to their groups.
     * </p>
     * 
     * @param receivedAt
     *        The date-time an action was received by Amazon Kendra. An action can be a <code>PUT</code> or
     *        <code>DELETE</code> action for mapping users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupOrderingIdSummary withReceivedAt(java.util.Date receivedAt) {
        setReceivedAt(receivedAt);
        return this;
    }

    /**
     * <p>
     * The order in which actions should complete processing. An action can be a <code>PUT</code> or <code>DELETE</code>
     * action for mapping users to their groups.
     * </p>
     * 
     * @param orderingId
     *        The order in which actions should complete processing. An action can be a <code>PUT</code> or
     *        <code>DELETE</code> action for mapping users to their groups.
     */

    public void setOrderingId(Long orderingId) {
        this.orderingId = orderingId;
    }

    /**
     * <p>
     * The order in which actions should complete processing. An action can be a <code>PUT</code> or <code>DELETE</code>
     * action for mapping users to their groups.
     * </p>
     * 
     * @return The order in which actions should complete processing. An action can be a <code>PUT</code> or
     *         <code>DELETE</code> action for mapping users to their groups.
     */

    public Long getOrderingId() {
        return this.orderingId;
    }

    /**
     * <p>
     * The order in which actions should complete processing. An action can be a <code>PUT</code> or <code>DELETE</code>
     * action for mapping users to their groups.
     * </p>
     * 
     * @param orderingId
     *        The order in which actions should complete processing. An action can be a <code>PUT</code> or
     *        <code>DELETE</code> action for mapping users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupOrderingIdSummary withOrderingId(Long orderingId) {
        setOrderingId(orderingId);
        return this;
    }

    /**
     * <p>
     * The reason an action could not be processed. An action can be a <code>PUT</code> or <code>DELETE</code> action
     * for mapping users to their groups.
     * </p>
     * 
     * @param failureReason
     *        The reason an action could not be processed. An action can be a <code>PUT</code> or <code>DELETE</code>
     *        action for mapping users to their groups.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason an action could not be processed. An action can be a <code>PUT</code> or <code>DELETE</code> action
     * for mapping users to their groups.
     * </p>
     * 
     * @return The reason an action could not be processed. An action can be a <code>PUT</code> or <code>DELETE</code>
     *         action for mapping users to their groups.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason an action could not be processed. An action can be a <code>PUT</code> or <code>DELETE</code> action
     * for mapping users to their groups.
     * </p>
     * 
     * @param failureReason
     *        The reason an action could not be processed. An action can be a <code>PUT</code> or <code>DELETE</code>
     *        action for mapping users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupOrderingIdSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getReceivedAt() != null)
            sb.append("ReceivedAt: ").append(getReceivedAt()).append(",");
        if (getOrderingId() != null)
            sb.append("OrderingId: ").append(getOrderingId()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupOrderingIdSummary == false)
            return false;
        GroupOrderingIdSummary other = (GroupOrderingIdSummary) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getReceivedAt() == null ^ this.getReceivedAt() == null)
            return false;
        if (other.getReceivedAt() != null && other.getReceivedAt().equals(this.getReceivedAt()) == false)
            return false;
        if (other.getOrderingId() == null ^ this.getOrderingId() == null)
            return false;
        if (other.getOrderingId() != null && other.getOrderingId().equals(this.getOrderingId()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getReceivedAt() == null) ? 0 : getReceivedAt().hashCode());
        hashCode = prime * hashCode + ((getOrderingId() == null) ? 0 : getOrderingId().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public GroupOrderingIdSummary clone() {
        try {
            return (GroupOrderingIdSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.GroupOrderingIdSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
