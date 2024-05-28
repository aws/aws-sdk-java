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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTopicRefreshSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTopicRefreshScheduleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the topic that contains the refresh schedule that you want to describe. This ID is unique per Amazon
     * Web Services Region for each Amazon Web Services account.
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
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The definition of a refresh schedule.
     * </p>
     */
    private TopicRefreshSchedule refreshSchedule;
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
     * The ID of the topic that contains the refresh schedule that you want to describe. This ID is unique per Amazon
     * Web Services Region for each Amazon Web Services account.
     * </p>
     * 
     * @param topicId
     *        The ID of the topic that contains the refresh schedule that you want to describe. This ID is unique per
     *        Amazon Web Services Region for each Amazon Web Services account.
     */

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * <p>
     * The ID of the topic that contains the refresh schedule that you want to describe. This ID is unique per Amazon
     * Web Services Region for each Amazon Web Services account.
     * </p>
     * 
     * @return The ID of the topic that contains the refresh schedule that you want to describe. This ID is unique per
     *         Amazon Web Services Region for each Amazon Web Services account.
     */

    public String getTopicId() {
        return this.topicId;
    }

    /**
     * <p>
     * The ID of the topic that contains the refresh schedule that you want to describe. This ID is unique per Amazon
     * Web Services Region for each Amazon Web Services account.
     * </p>
     * 
     * @param topicId
     *        The ID of the topic that contains the refresh schedule that you want to describe. This ID is unique per
     *        Amazon Web Services Region for each Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTopicRefreshScheduleResult withTopicId(String topicId) {
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

    public DescribeTopicRefreshScheduleResult withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTopicRefreshScheduleResult withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The definition of a refresh schedule.
     * </p>
     * 
     * @param refreshSchedule
     *        The definition of a refresh schedule.
     */

    public void setRefreshSchedule(TopicRefreshSchedule refreshSchedule) {
        this.refreshSchedule = refreshSchedule;
    }

    /**
     * <p>
     * The definition of a refresh schedule.
     * </p>
     * 
     * @return The definition of a refresh schedule.
     */

    public TopicRefreshSchedule getRefreshSchedule() {
        return this.refreshSchedule;
    }

    /**
     * <p>
     * The definition of a refresh schedule.
     * </p>
     * 
     * @param refreshSchedule
     *        The definition of a refresh schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTopicRefreshScheduleResult withRefreshSchedule(TopicRefreshSchedule refreshSchedule) {
        setRefreshSchedule(refreshSchedule);
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

    public DescribeTopicRefreshScheduleResult withStatus(Integer status) {
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

    public DescribeTopicRefreshScheduleResult withRequestId(String requestId) {
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getRefreshSchedule() != null)
            sb.append("RefreshSchedule: ").append(getRefreshSchedule()).append(",");
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

        if (obj instanceof DescribeTopicRefreshScheduleResult == false)
            return false;
        DescribeTopicRefreshScheduleResult other = (DescribeTopicRefreshScheduleResult) obj;
        if (other.getTopicId() == null ^ this.getTopicId() == null)
            return false;
        if (other.getTopicId() != null && other.getTopicId().equals(this.getTopicId()) == false)
            return false;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getRefreshSchedule() == null ^ this.getRefreshSchedule() == null)
            return false;
        if (other.getRefreshSchedule() != null && other.getRefreshSchedule().equals(this.getRefreshSchedule()) == false)
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
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getRefreshSchedule() == null) ? 0 : getRefreshSchedule().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTopicRefreshScheduleResult clone() {
        try {
            return (DescribeTopicRefreshScheduleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
