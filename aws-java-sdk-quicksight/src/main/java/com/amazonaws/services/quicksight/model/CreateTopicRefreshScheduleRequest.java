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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTopicRefreshSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTopicRefreshScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the topic you're creating a refresh schedule for.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each Amazon Web
     * Services account.
     * </p>
     */
    private String topicId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The name of the dataset.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The definition of a refresh schedule.
     * </p>
     */
    private TopicRefreshSchedule refreshSchedule;

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the topic you're creating a refresh schedule for.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the topic you're creating a refresh schedule for.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the topic you're creating a refresh schedule for.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that contains the topic you're creating a refresh schedule for.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the topic you're creating a refresh schedule for.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the topic you're creating a refresh schedule for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRefreshScheduleRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each Amazon Web
     * Services account.
     * </p>
     * 
     * @param topicId
     *        The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each
     *        Amazon Web Services account.
     */

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * <p>
     * The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each Amazon Web
     * Services account.
     * </p>
     * 
     * @return The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each
     *         Amazon Web Services account.
     */

    public String getTopicId() {
        return this.topicId;
    }

    /**
     * <p>
     * The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each Amazon Web
     * Services account.
     * </p>
     * 
     * @param topicId
     *        The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each
     *        Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRefreshScheduleRequest withTopicId(String topicId) {
        setTopicId(topicId);
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

    public CreateTopicRefreshScheduleRequest withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @return The name of the dataset.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRefreshScheduleRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
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

    public CreateTopicRefreshScheduleRequest withRefreshSchedule(TopicRefreshSchedule refreshSchedule) {
        setRefreshSchedule(refreshSchedule);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getTopicId() != null)
            sb.append("TopicId: ").append(getTopicId()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getRefreshSchedule() != null)
            sb.append("RefreshSchedule: ").append(getRefreshSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTopicRefreshScheduleRequest == false)
            return false;
        CreateTopicRefreshScheduleRequest other = (CreateTopicRefreshScheduleRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getTopicId() == null ^ this.getTopicId() == null)
            return false;
        if (other.getTopicId() != null && other.getTopicId().equals(this.getTopicId()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getRefreshSchedule() == null ^ this.getRefreshSchedule() == null)
            return false;
        if (other.getRefreshSchedule() != null && other.getRefreshSchedule().equals(this.getRefreshSchedule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTopicId() == null) ? 0 : getTopicId().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getRefreshSchedule() == null) ? 0 : getRefreshSchedule().hashCode());
        return hashCode;
    }

    @Override
    public CreateTopicRefreshScheduleRequest clone() {
        return (CreateTopicRefreshScheduleRequest) super.clone();
    }

}
