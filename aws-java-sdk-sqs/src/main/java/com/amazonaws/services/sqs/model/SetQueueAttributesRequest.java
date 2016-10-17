/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class SetQueueAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     */
    private String queueUrl;
    /**
     * <p>
     * A map of attributes to set.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters the
     * <code>SetQueueAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - The time in seconds that the delivery of all messages in the queue will be delayed.
     * An integer from 0 to 900 (15 minutes). The default for this attribute is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS rejects it.
     * An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this attribute is 262144 (256
     * KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds Amazon SQS retains a message. Integer representing
     * seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM Policies</a> in
     * the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a ReceiveMessage call will wait for a message to
     * arrive. An integer from 0 to 20 (seconds). The default for this attribute is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The
     * default for this attribute is 30. For more information about visibility timeout, see Visibility Timeout in the
     * <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for dead letter queue functionality of the source queue. For more
     * information about RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter Queues in the <i>Amazon
     * SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>LastModifiedTimestamp</code>, and <code>QueueArn</code>) will be ignored.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;

    /**
     * Default constructor for SetQueueAttributesRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public SetQueueAttributesRequest() {
    }

    /**
     * Constructs a new SetQueueAttributesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     * @param attributes
     *        A map of attributes to set.
     *        </p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters the
     *        <code>SetQueueAttributes</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DelaySeconds</code> - The time in seconds that the delivery of all messages in the queue will be
     *        delayed. An integer from 0 to 900 (15 minutes). The default for this attribute is 0 (zero).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS
     *        rejects it. An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     *        attribute is 262144 (256 KiB).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRetentionPeriod</code> - The number of seconds Amazon SQS retains a message. Integer
     *        representing seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4
     *        days).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure,
     *        see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM
     *        Policies</a> in the <i>Amazon IAM User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a ReceiveMessage call will wait for a
     *        message to arrive. An integer from 0 to 20 (seconds). The default for this attribute is 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VisibilityTimeout</code> - The visibility timeout for the queue. An integer from 0 to 43200 (12
     *        hours). The default for this attribute is 30. For more information about visibility timeout, see
     *        Visibility Timeout in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RedrivePolicy</code> - The parameters for dead letter queue functionality of the source queue. For
     *        more information about RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter Queues in
     *        the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Any other valid special request parameters that are specified (such as
     *        <code>ApproximateNumberOfMessages</code>, <code>ApproximateNumberOfMessagesDelayed</code>,
     *        <code>ApproximateNumberOfMessagesNotVisible</code>, <code>CreatedTimestamp</code>,
     *        <code>LastModifiedTimestamp</code>, and <code>QueueArn</code>) will be ignored.
     */
    public SetQueueAttributesRequest(String queueUrl, java.util.Map<String, String> attributes) {
        setQueueUrl(queueUrl);
        setAttributes(attributes);
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     */

    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * 
     * @return The URL of the Amazon SQS queue to take action on.</p>
     *         <p>
     *         Queue URLs are case-sensitive.
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetQueueAttributesRequest withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * A map of attributes to set.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters the
     * <code>SetQueueAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - The time in seconds that the delivery of all messages in the queue will be delayed.
     * An integer from 0 to 900 (15 minutes). The default for this attribute is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS rejects it.
     * An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this attribute is 262144 (256
     * KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds Amazon SQS retains a message. Integer representing
     * seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM Policies</a> in
     * the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a ReceiveMessage call will wait for a message to
     * arrive. An integer from 0 to 20 (seconds). The default for this attribute is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The
     * default for this attribute is 30. For more information about visibility timeout, see Visibility Timeout in the
     * <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for dead letter queue functionality of the source queue. For more
     * information about RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter Queues in the <i>Amazon
     * SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>LastModifiedTimestamp</code>, and <code>QueueArn</code>) will be ignored.
     * </p>
     * 
     * @return A map of attributes to set.</p>
     *         <p>
     *         The following lists the names, descriptions, and values of the special request parameters the
     *         <code>SetQueueAttributes</code> action uses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DelaySeconds</code> - The time in seconds that the delivery of all messages in the queue will be
     *         delayed. An integer from 0 to 900 (15 minutes). The default for this attribute is 0 (zero).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS
     *         rejects it. An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     *         attribute is 262144 (256 KiB).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageRetentionPeriod</code> - The number of seconds Amazon SQS retains a message. Integer
     *         representing seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600
     *         (4 days).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy
     *         structure, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview
     *         of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a ReceiveMessage call will wait for a
     *         message to arrive. An integer from 0 to 20 (seconds). The default for this attribute is 0.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VisibilityTimeout</code> - The visibility timeout for the queue. An integer from 0 to 43200 (12
     *         hours). The default for this attribute is 30. For more information about visibility timeout, see
     *         Visibility Timeout in the <i>Amazon SQS Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RedrivePolicy</code> - The parameters for dead letter queue functionality of the source queue. For
     *         more information about RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter Queues in
     *         the <i>Amazon SQS Developer Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Any other valid special request parameters that are specified (such as
     *         <code>ApproximateNumberOfMessages</code>, <code>ApproximateNumberOfMessagesDelayed</code>,
     *         <code>ApproximateNumberOfMessagesNotVisible</code>, <code>CreatedTimestamp</code>,
     *         <code>LastModifiedTimestamp</code>, and <code>QueueArn</code>) will be ignored.
     */

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * A map of attributes to set.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters the
     * <code>SetQueueAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - The time in seconds that the delivery of all messages in the queue will be delayed.
     * An integer from 0 to 900 (15 minutes). The default for this attribute is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS rejects it.
     * An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this attribute is 262144 (256
     * KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds Amazon SQS retains a message. Integer representing
     * seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM Policies</a> in
     * the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a ReceiveMessage call will wait for a message to
     * arrive. An integer from 0 to 20 (seconds). The default for this attribute is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The
     * default for this attribute is 30. For more information about visibility timeout, see Visibility Timeout in the
     * <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for dead letter queue functionality of the source queue. For more
     * information about RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter Queues in the <i>Amazon
     * SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>LastModifiedTimestamp</code>, and <code>QueueArn</code>) will be ignored.
     * </p>
     * 
     * @param attributes
     *        A map of attributes to set.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters the
     *        <code>SetQueueAttributes</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DelaySeconds</code> - The time in seconds that the delivery of all messages in the queue will be
     *        delayed. An integer from 0 to 900 (15 minutes). The default for this attribute is 0 (zero).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS
     *        rejects it. An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     *        attribute is 262144 (256 KiB).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRetentionPeriod</code> - The number of seconds Amazon SQS retains a message. Integer
     *        representing seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4
     *        days).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure,
     *        see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM
     *        Policies</a> in the <i>Amazon IAM User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a ReceiveMessage call will wait for a
     *        message to arrive. An integer from 0 to 20 (seconds). The default for this attribute is 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VisibilityTimeout</code> - The visibility timeout for the queue. An integer from 0 to 43200 (12
     *        hours). The default for this attribute is 30. For more information about visibility timeout, see
     *        Visibility Timeout in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RedrivePolicy</code> - The parameters for dead letter queue functionality of the source queue. For
     *        more information about RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter Queues in
     *        the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Any other valid special request parameters that are specified (such as
     *        <code>ApproximateNumberOfMessages</code>, <code>ApproximateNumberOfMessagesDelayed</code>,
     *        <code>ApproximateNumberOfMessagesNotVisible</code>, <code>CreatedTimestamp</code>,
     *        <code>LastModifiedTimestamp</code>, and <code>QueueArn</code>) will be ignored.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * A map of attributes to set.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters the
     * <code>SetQueueAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - The time in seconds that the delivery of all messages in the queue will be delayed.
     * An integer from 0 to 900 (15 minutes). The default for this attribute is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS rejects it.
     * An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this attribute is 262144 (256
     * KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds Amazon SQS retains a message. Integer representing
     * seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM Policies</a> in
     * the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a ReceiveMessage call will wait for a message to
     * arrive. An integer from 0 to 20 (seconds). The default for this attribute is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The
     * default for this attribute is 30. For more information about visibility timeout, see Visibility Timeout in the
     * <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for dead letter queue functionality of the source queue. For more
     * information about RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter Queues in the <i>Amazon
     * SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>LastModifiedTimestamp</code>, and <code>QueueArn</code>) will be ignored.
     * </p>
     * 
     * @param attributes
     *        A map of attributes to set.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters the
     *        <code>SetQueueAttributes</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DelaySeconds</code> - The time in seconds that the delivery of all messages in the queue will be
     *        delayed. An integer from 0 to 900 (15 minutes). The default for this attribute is 0 (zero).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS
     *        rejects it. An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this
     *        attribute is 262144 (256 KiB).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRetentionPeriod</code> - The number of seconds Amazon SQS retains a message. Integer
     *        representing seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4
     *        days).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure,
     *        see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM
     *        Policies</a> in the <i>Amazon IAM User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessageWaitTimeSeconds</code> - The time for which a ReceiveMessage call will wait for a
     *        message to arrive. An integer from 0 to 20 (seconds). The default for this attribute is 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VisibilityTimeout</code> - The visibility timeout for the queue. An integer from 0 to 43200 (12
     *        hours). The default for this attribute is 30. For more information about visibility timeout, see
     *        Visibility Timeout in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RedrivePolicy</code> - The parameters for dead letter queue functionality of the source queue. For
     *        more information about RedrivePolicy and dead letter queues, see Using Amazon SQS Dead Letter Queues in
     *        the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Any other valid special request parameters that are specified (such as
     *        <code>ApproximateNumberOfMessages</code>, <code>ApproximateNumberOfMessagesDelayed</code>,
     *        <code>ApproximateNumberOfMessagesNotVisible</code>, <code>CreatedTimestamp</code>,
     *        <code>LastModifiedTimestamp</code>, and <code>QueueArn</code>) will be ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetQueueAttributesRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public SetQueueAttributesRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetQueueAttributesRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getQueueUrl() != null)
            sb.append("QueueUrl: " + getQueueUrl() + ",");
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

        if (obj instanceof SetQueueAttributesRequest == false)
            return false;
        SetQueueAttributesRequest other = (SetQueueAttributesRequest) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public SetQueueAttributesRequest clone() {
        return (SetQueueAttributesRequest) super.clone();
    }
}
