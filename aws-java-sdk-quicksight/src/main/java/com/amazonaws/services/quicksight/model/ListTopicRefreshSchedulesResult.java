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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTopicRefreshSchedules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTopicRefreshSchedulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the topic that you want to describe. This ID is unique per Amazon Web Services Region for each Amazon
     * Web Services account.
     * </p>
     */
    private String topicId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topic.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * The list of topic refresh schedules.
     * </p>
     */
    private java.util.List<TopicRefreshScheduleSummary> refreshSchedules;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * The ID for the topic that you want to describe. This ID is unique per Amazon Web Services Region for each Amazon
     * Web Services account.
     * </p>
     * 
     * @param topicId
     *        The ID for the topic that you want to describe. This ID is unique per Amazon Web Services Region for each
     *        Amazon Web Services account.
     */

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * <p>
     * The ID for the topic that you want to describe. This ID is unique per Amazon Web Services Region for each Amazon
     * Web Services account.
     * </p>
     * 
     * @return The ID for the topic that you want to describe. This ID is unique per Amazon Web Services Region for each
     *         Amazon Web Services account.
     */

    public String getTopicId() {
        return this.topicId;
    }

    /**
     * <p>
     * The ID for the topic that you want to describe. This ID is unique per Amazon Web Services Region for each Amazon
     * Web Services account.
     * </p>
     * 
     * @param topicId
     *        The ID for the topic that you want to describe. This ID is unique per Amazon Web Services Region for each
     *        Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRefreshSchedulesResult withTopicId(String topicId) {
        setTopicId(topicId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topic.
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) of the topic.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topic.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the topic.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topic.
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) of the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRefreshSchedulesResult withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * The list of topic refresh schedules.
     * </p>
     * 
     * @return The list of topic refresh schedules.
     */

    public java.util.List<TopicRefreshScheduleSummary> getRefreshSchedules() {
        return refreshSchedules;
    }

    /**
     * <p>
     * The list of topic refresh schedules.
     * </p>
     * 
     * @param refreshSchedules
     *        The list of topic refresh schedules.
     */

    public void setRefreshSchedules(java.util.Collection<TopicRefreshScheduleSummary> refreshSchedules) {
        if (refreshSchedules == null) {
            this.refreshSchedules = null;
            return;
        }

        this.refreshSchedules = new java.util.ArrayList<TopicRefreshScheduleSummary>(refreshSchedules);
    }

    /**
     * <p>
     * The list of topic refresh schedules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRefreshSchedules(java.util.Collection)} or {@link #withRefreshSchedules(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param refreshSchedules
     *        The list of topic refresh schedules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRefreshSchedulesResult withRefreshSchedules(TopicRefreshScheduleSummary... refreshSchedules) {
        if (this.refreshSchedules == null) {
            setRefreshSchedules(new java.util.ArrayList<TopicRefreshScheduleSummary>(refreshSchedules.length));
        }
        for (TopicRefreshScheduleSummary ele : refreshSchedules) {
            this.refreshSchedules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of topic refresh schedules.
     * </p>
     * 
     * @param refreshSchedules
     *        The list of topic refresh schedules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRefreshSchedulesResult withRefreshSchedules(java.util.Collection<TopicRefreshScheduleSummary> refreshSchedules) {
        setRefreshSchedules(refreshSchedules);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRefreshSchedulesResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @return The Amazon Web Services request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRefreshSchedulesResult withRequestId(String requestId) {
        setRequestId(requestId);
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
        if (getTopicId() != null)
            sb.append("TopicId: ").append(getTopicId()).append(",");
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getRefreshSchedules() != null)
            sb.append("RefreshSchedules: ").append(getRefreshSchedules()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTopicRefreshSchedulesResult == false)
            return false;
        ListTopicRefreshSchedulesResult other = (ListTopicRefreshSchedulesResult) obj;
        if (other.getTopicId() == null ^ this.getTopicId() == null)
            return false;
        if (other.getTopicId() != null && other.getTopicId().equals(this.getTopicId()) == false)
            return false;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getRefreshSchedules() == null ^ this.getRefreshSchedules() == null)
            return false;
        if (other.getRefreshSchedules() != null && other.getRefreshSchedules().equals(this.getRefreshSchedules()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicId() == null) ? 0 : getTopicId().hashCode());
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getRefreshSchedules() == null) ? 0 : getRefreshSchedules().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public ListTopicRefreshSchedulesResult clone() {
        try {
            return (ListTopicRefreshSchedulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
