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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTopic" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTopicRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that you want to create a topic in.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the topic that you want to create. This ID is unique per Amazon Web Services Region for each Amazon
     * Web Services account.
     * </p>
     */
    private String topicId;
    /**
     * <p>
     * The definition of a topic to create.
     * </p>
     */
    private TopicDetails topic;
    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags that are assigned to the dataset.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the Amazon Web Services account that you want to create a topic in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that you want to create a topic in.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that you want to create a topic in.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that you want to create a topic in.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that you want to create a topic in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that you want to create a topic in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the topic that you want to create. This ID is unique per Amazon Web Services Region for each Amazon
     * Web Services account.
     * </p>
     * 
     * @param topicId
     *        The ID for the topic that you want to create. This ID is unique per Amazon Web Services Region for each
     *        Amazon Web Services account.
     */

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * <p>
     * The ID for the topic that you want to create. This ID is unique per Amazon Web Services Region for each Amazon
     * Web Services account.
     * </p>
     * 
     * @return The ID for the topic that you want to create. This ID is unique per Amazon Web Services Region for each
     *         Amazon Web Services account.
     */

    public String getTopicId() {
        return this.topicId;
    }

    /**
     * <p>
     * The ID for the topic that you want to create. This ID is unique per Amazon Web Services Region for each Amazon
     * Web Services account.
     * </p>
     * 
     * @param topicId
     *        The ID for the topic that you want to create. This ID is unique per Amazon Web Services Region for each
     *        Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest withTopicId(String topicId) {
        setTopicId(topicId);
        return this;
    }

    /**
     * <p>
     * The definition of a topic to create.
     * </p>
     * 
     * @param topic
     *        The definition of a topic to create.
     */

    public void setTopic(TopicDetails topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The definition of a topic to create.
     * </p>
     * 
     * @return The definition of a topic to create.
     */

    public TopicDetails getTopic() {
        return this.topic;
    }

    /**
     * <p>
     * The definition of a topic to create.
     * </p>
     * 
     * @param topic
     *        The definition of a topic to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest withTopic(TopicDetails topic) {
        setTopic(topic);
        return this;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags that are assigned to the dataset.
     * </p>
     * 
     * @return Contains a map of the key-value pairs for the resource tag or tags that are assigned to the dataset.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags that are assigned to the dataset.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags that are assigned to the dataset.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags that are assigned to the dataset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags that are assigned to the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags that are assigned to the dataset.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags that are assigned to the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTopic() != null)
            sb.append("Topic: ").append(getTopic()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTopicRequest == false)
            return false;
        CreateTopicRequest other = (CreateTopicRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getTopicId() == null ^ this.getTopicId() == null)
            return false;
        if (other.getTopicId() != null && other.getTopicId().equals(this.getTopicId()) == false)
            return false;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTopicId() == null) ? 0 : getTopicId().hashCode());
        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTopicRequest clone() {
        return (CreateTopicRequest) super.clone();
    }

}
