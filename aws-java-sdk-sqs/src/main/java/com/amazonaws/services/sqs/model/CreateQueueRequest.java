/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateQueueRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name for the queue to be created.
     * </p>
     */
    private String queueName;
    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters the <code>CreateQueue</code> action uses:
     * </p>
     * <p>
     * <ul>
     * <li><code>DelaySeconds</code> - The time in seconds that the delivery of
     * all messages in the queue will be delayed. An integer from 0 to 900 (15
     * minutes). The default for this attribute is 0 (zero).</li>
     * <li><code>MaximumMessageSize</code> - The limit of how many bytes a
     * message can contain before Amazon SQS rejects it. An integer from 1024
     * bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     * attribute is 262144 (256 KiB).</li>
     * <li><code>MessageRetentionPeriod</code> - The number of seconds Amazon
     * SQS retains a message. Integer representing seconds, from 60 (1 minute)
     * to 1209600 (14 days). The default for this attribute is 345600 (4 days).</li>
     * <li><code>Policy</code> - The queue's policy. A valid AWS policy. For
     * more information about policy structure, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.</li>
     * <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * <a>ReceiveMessage</a> call will wait for a message to arrive. An integer
     * from 0 to 20 (seconds). The default for this attribute is 0.</li>
     * <li><code>VisibilityTimeout</code> - The visibility timeout for the
     * queue. An integer from 0 to 43200 (12 hours). The default for this
     * attribute is 30. For more information about visibility timeout, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.</li>
     * </ul>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;

    /**
     * Default constructor for CreateQueueRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public CreateQueueRequest() {
    }

    /**
     * Constructs a new CreateQueueRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param queueName
     *        The name for the queue to be created.
     */
    public CreateQueueRequest(String queueName) {
        setQueueName(queueName);
    }

    /**
     * <p>
     * The name for the queue to be created.
     * </p>
     * 
     * @param queueName
     *        The name for the queue to be created.
     */
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    /**
     * <p>
     * The name for the queue to be created.
     * </p>
     * 
     * @return The name for the queue to be created.
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * <p>
     * The name for the queue to be created.
     * </p>
     * 
     * @param queueName
     *        The name for the queue to be created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withQueueName(String queueName) {
        setQueueName(queueName);
        return this;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters the <code>CreateQueue</code> action uses:
     * </p>
     * <p>
     * <ul>
     * <li><code>DelaySeconds</code> - The time in seconds that the delivery of
     * all messages in the queue will be delayed. An integer from 0 to 900 (15
     * minutes). The default for this attribute is 0 (zero).</li>
     * <li><code>MaximumMessageSize</code> - The limit of how many bytes a
     * message can contain before Amazon SQS rejects it. An integer from 1024
     * bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     * attribute is 262144 (256 KiB).</li>
     * <li><code>MessageRetentionPeriod</code> - The number of seconds Amazon
     * SQS retains a message. Integer representing seconds, from 60 (1 minute)
     * to 1209600 (14 days). The default for this attribute is 345600 (4 days).</li>
     * <li><code>Policy</code> - The queue's policy. A valid AWS policy. For
     * more information about policy structure, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.</li>
     * <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * <a>ReceiveMessage</a> call will wait for a message to arrive. An integer
     * from 0 to 20 (seconds). The default for this attribute is 0.</li>
     * <li><code>VisibilityTimeout</code> - The visibility timeout for the
     * queue. An integer from 0 to 43200 (12 hours). The default for this
     * attribute is 30. For more information about visibility timeout, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.</li>
     * </ul>
     * </p>
     * 
     * @return A map of attributes with their corresponding values.</p>
     *         <p>
     *         The following lists the names, descriptions, and values of the
     *         special request parameters the <code>CreateQueue</code> action
     *         uses:
     *         </p>
     *         <p>
     *         <ul>
     *         <li><code>DelaySeconds</code> - The time in seconds that the
     *         delivery of all messages in the queue will be delayed. An integer
     *         from 0 to 900 (15 minutes). The default for this attribute is 0
     *         (zero).</li>
     *         <li><code>MaximumMessageSize</code> - The limit of how many bytes
     *         a message can contain before Amazon SQS rejects it. An integer
     *         from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default
     *         for this attribute is 262144 (256 KiB).</li>
     *         <li><code>MessageRetentionPeriod</code> - The number of seconds
     *         Amazon SQS retains a message. Integer representing seconds, from
     *         60 (1 minute) to 1209600 (14 days). The default for this
     *         attribute is 345600 (4 days).</li>
     *         <li><code>Policy</code> - The queue's policy. A valid AWS policy.
     *         For more information about policy structure, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     *         >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User
     *         Guide</i>.</li>
     *         <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for
     *         which a <a>ReceiveMessage</a> call will wait for a message to
     *         arrive. An integer from 0 to 20 (seconds). The default for this
     *         attribute is 0.</li>
     *         <li><code>VisibilityTimeout</code> - The visibility timeout for
     *         the queue. An integer from 0 to 43200 (12 hours). The default for
     *         this attribute is 30. For more information about visibility
     *         timeout, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     *         >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters the <code>CreateQueue</code> action uses:
     * </p>
     * <p>
     * <ul>
     * <li><code>DelaySeconds</code> - The time in seconds that the delivery of
     * all messages in the queue will be delayed. An integer from 0 to 900 (15
     * minutes). The default for this attribute is 0 (zero).</li>
     * <li><code>MaximumMessageSize</code> - The limit of how many bytes a
     * message can contain before Amazon SQS rejects it. An integer from 1024
     * bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     * attribute is 262144 (256 KiB).</li>
     * <li><code>MessageRetentionPeriod</code> - The number of seconds Amazon
     * SQS retains a message. Integer representing seconds, from 60 (1 minute)
     * to 1209600 (14 days). The default for this attribute is 345600 (4 days).</li>
     * <li><code>Policy</code> - The queue's policy. A valid AWS policy. For
     * more information about policy structure, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.</li>
     * <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * <a>ReceiveMessage</a> call will wait for a message to arrive. An integer
     * from 0 to 20 (seconds). The default for this attribute is 0.</li>
     * <li><code>VisibilityTimeout</code> - The visibility timeout for the
     * queue. An integer from 0 to 43200 (12 hours). The default for this
     * attribute is 30. For more information about visibility timeout, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.</li>
     * </ul>
     * </p>
     * 
     * @param attributes
     *        A map of attributes with their corresponding values.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the
     *        special request parameters the <code>CreateQueue</code> action
     *        uses:
     *        </p>
     *        <p>
     *        <ul>
     *        <li><code>DelaySeconds</code> - The time in seconds that the
     *        delivery of all messages in the queue will be delayed. An integer
     *        from 0 to 900 (15 minutes). The default for this attribute is 0
     *        (zero).</li>
     *        <li><code>MaximumMessageSize</code> - The limit of how many bytes
     *        a message can contain before Amazon SQS rejects it. An integer
     *        from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default
     *        for this attribute is 262144 (256 KiB).</li>
     *        <li><code>MessageRetentionPeriod</code> - The number of seconds
     *        Amazon SQS retains a message. Integer representing seconds, from
     *        60 (1 minute) to 1209600 (14 days). The default for this attribute
     *        is 345600 (4 days).</li>
     *        <li><code>Policy</code> - The queue's policy. A valid AWS policy.
     *        For more information about policy structure, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     *        >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User
     *        Guide</i>.</li>
     *        <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for
     *        which a <a>ReceiveMessage</a> call will wait for a message to
     *        arrive. An integer from 0 to 20 (seconds). The default for this
     *        attribute is 0.</li>
     *        <li><code>VisibilityTimeout</code> - The visibility timeout for
     *        the queue. An integer from 0 to 43200 (12 hours). The default for
     *        this attribute is 30. For more information about visibility
     *        timeout, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     *        >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.</li>
     *        </ul>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null
                : new com.amazonaws.internal.SdkInternalMap<String, String>(
                        attributes);
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters the <code>CreateQueue</code> action uses:
     * </p>
     * <p>
     * <ul>
     * <li><code>DelaySeconds</code> - The time in seconds that the delivery of
     * all messages in the queue will be delayed. An integer from 0 to 900 (15
     * minutes). The default for this attribute is 0 (zero).</li>
     * <li><code>MaximumMessageSize</code> - The limit of how many bytes a
     * message can contain before Amazon SQS rejects it. An integer from 1024
     * bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     * attribute is 262144 (256 KiB).</li>
     * <li><code>MessageRetentionPeriod</code> - The number of seconds Amazon
     * SQS retains a message. Integer representing seconds, from 60 (1 minute)
     * to 1209600 (14 days). The default for this attribute is 345600 (4 days).</li>
     * <li><code>Policy</code> - The queue's policy. A valid AWS policy. For
     * more information about policy structure, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     * >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.</li>
     * <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for which a
     * <a>ReceiveMessage</a> call will wait for a message to arrive. An integer
     * from 0 to 20 (seconds). The default for this attribute is 0.</li>
     * <li><code>VisibilityTimeout</code> - The visibility timeout for the
     * queue. An integer from 0 to 43200 (12 hours). The default for this
     * attribute is 30. For more information about visibility timeout, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.</li>
     * </ul>
     * </p>
     * 
     * @param attributes
     *        A map of attributes with their corresponding values.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the
     *        special request parameters the <code>CreateQueue</code> action
     *        uses:
     *        </p>
     *        <p>
     *        <ul>
     *        <li><code>DelaySeconds</code> - The time in seconds that the
     *        delivery of all messages in the queue will be delayed. An integer
     *        from 0 to 900 (15 minutes). The default for this attribute is 0
     *        (zero).</li>
     *        <li><code>MaximumMessageSize</code> - The limit of how many bytes
     *        a message can contain before Amazon SQS rejects it. An integer
     *        from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default
     *        for this attribute is 262144 (256 KiB).</li>
     *        <li><code>MessageRetentionPeriod</code> - The number of seconds
     *        Amazon SQS retains a message. Integer representing seconds, from
     *        60 (1 minute) to 1209600 (14 days). The default for this attribute
     *        is 345600 (4 days).</li>
     *        <li><code>Policy</code> - The queue's policy. A valid AWS policy.
     *        For more information about policy structure, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     *        >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User
     *        Guide</i>.</li>
     *        <li><code>ReceiveMessageWaitTimeSeconds</code> - The time for
     *        which a <a>ReceiveMessage</a> call will wait for a message to
     *        arrive. An integer from 0 to 20 (seconds). The default for this
     *        attribute is 0.</li>
     *        <li><code>VisibilityTimeout</code> - The visibility timeout for
     *        the queue. An integer from 0 to 43200 (12 hours). The default for
     *        this attribute is 30. For more information about visibility
     *        timeout, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     *        >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withAttributes(
            java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public CreateQueueRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes. &lt;p> Returns a reference
     * to this object so that method calls can be chained together.
     */
    public CreateQueueRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getQueueName() != null)
            sb.append("QueueName: " + getQueueName() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQueueRequest == false)
            return false;
        CreateQueueRequest other = (CreateQueueRequest) obj;
        if (other.getQueueName() == null ^ this.getQueueName() == null)
            return false;
        if (other.getQueueName() != null
                && other.getQueueName().equals(this.getQueueName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueueName() == null) ? 0 : getQueueName().hashCode());
        hashCode = prime * hashCode
                + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public CreateQueueRequest clone() {
        return (CreateQueueRequest) super.clone();
    }
}