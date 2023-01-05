/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/PublishBatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishBatchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon resource name (ARN) of the topic you want to batch publish to.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * A list of <code>PublishBatch</code> request entries to be sent to the SNS topic.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PublishBatchRequestEntry> publishBatchRequestEntries;

    /**
     * <p>
     * The Amazon resource name (ARN) of the topic you want to batch publish to.
     * </p>
     * 
     * @param topicArn
     *        The Amazon resource name (ARN) of the topic you want to batch publish to.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the topic you want to batch publish to.
     * </p>
     * 
     * @return The Amazon resource name (ARN) of the topic you want to batch publish to.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the topic you want to batch publish to.
     * </p>
     * 
     * @param topicArn
     *        The Amazon resource name (ARN) of the topic you want to batch publish to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishBatchRequest withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * A list of <code>PublishBatch</code> request entries to be sent to the SNS topic.
     * </p>
     * 
     * @return A list of <code>PublishBatch</code> request entries to be sent to the SNS topic.
     */

    public java.util.List<PublishBatchRequestEntry> getPublishBatchRequestEntries() {
        if (publishBatchRequestEntries == null) {
            publishBatchRequestEntries = new com.amazonaws.internal.SdkInternalList<PublishBatchRequestEntry>();
        }
        return publishBatchRequestEntries;
    }

    /**
     * <p>
     * A list of <code>PublishBatch</code> request entries to be sent to the SNS topic.
     * </p>
     * 
     * @param publishBatchRequestEntries
     *        A list of <code>PublishBatch</code> request entries to be sent to the SNS topic.
     */

    public void setPublishBatchRequestEntries(java.util.Collection<PublishBatchRequestEntry> publishBatchRequestEntries) {
        if (publishBatchRequestEntries == null) {
            this.publishBatchRequestEntries = null;
            return;
        }

        this.publishBatchRequestEntries = new com.amazonaws.internal.SdkInternalList<PublishBatchRequestEntry>(publishBatchRequestEntries);
    }

    /**
     * <p>
     * A list of <code>PublishBatch</code> request entries to be sent to the SNS topic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublishBatchRequestEntries(java.util.Collection)} or
     * {@link #withPublishBatchRequestEntries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param publishBatchRequestEntries
     *        A list of <code>PublishBatch</code> request entries to be sent to the SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishBatchRequest withPublishBatchRequestEntries(PublishBatchRequestEntry... publishBatchRequestEntries) {
        if (this.publishBatchRequestEntries == null) {
            setPublishBatchRequestEntries(new com.amazonaws.internal.SdkInternalList<PublishBatchRequestEntry>(publishBatchRequestEntries.length));
        }
        for (PublishBatchRequestEntry ele : publishBatchRequestEntries) {
            this.publishBatchRequestEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>PublishBatch</code> request entries to be sent to the SNS topic.
     * </p>
     * 
     * @param publishBatchRequestEntries
     *        A list of <code>PublishBatch</code> request entries to be sent to the SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishBatchRequest withPublishBatchRequestEntries(java.util.Collection<PublishBatchRequestEntry> publishBatchRequestEntries) {
        setPublishBatchRequestEntries(publishBatchRequestEntries);
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
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getPublishBatchRequestEntries() != null)
            sb.append("PublishBatchRequestEntries: ").append(getPublishBatchRequestEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishBatchRequest == false)
            return false;
        PublishBatchRequest other = (PublishBatchRequest) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getPublishBatchRequestEntries() == null ^ this.getPublishBatchRequestEntries() == null)
            return false;
        if (other.getPublishBatchRequestEntries() != null && other.getPublishBatchRequestEntries().equals(this.getPublishBatchRequestEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getPublishBatchRequestEntries() == null) ? 0 : getPublishBatchRequestEntries().hashCode());
        return hashCode;
    }

    @Override
    public PublishBatchRequest clone() {
        return (PublishBatchRequest) super.clone();
    }

}
