/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

/**
 * <p>
 * Contains the details of a single Amazon SQS message along with an <code>Id</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/SendMessageBatchRequestEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendMessageBatchRequestEntry implements Serializable, Cloneable {

    /**
     * <p>
     * An identifier for a message in this batch used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>Id</code>s of a batch request need to be unique within a request
     * </p>
     * <p>
     * This identifier can have up to 80 characters. The following characters are accepted: alphanumeric characters,
     * hyphens(-), and underscores (_).
     * </p>
     * </note>
     */
    private String id;
    /**
     * <p>
     * The body of the message.
     * </p>
     */
    private String messageBody;
    /**
     * <p>
     * The length of time, in seconds, for which a specific message is delayed. Valid values: 0 to 900. Maximum: 15
     * minutes. Messages with a positive <code>DelaySeconds</code> value become available for processing after the delay
     * period is finished. If you don't specify a value, the default value for the queue is applied.
     * </p>
     * <note>
     * <p>
     * When you set <code>FifoQueue</code>, you can't set <code>DelaySeconds</code> per message. You can set this
     * parameter only on a queue level.
     * </p>
     * </note>
     */
    private Integer delaySeconds;
    /**
     * <p>
     * Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     * >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue> messageAttributes;
    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of messages within a 5-minute minimum deduplication interval. If a message with
     * a particular <code>MessageDeduplicationId</code> is sent successfully, subsequent messages with the same
     * <code>MessageDeduplicationId</code> are accepted successfully but aren't delivered. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * > Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     * <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     * <code>ContentBasedDeduplication</code> set, the action fails with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides
     * the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     * deduplication interval are treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     * <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message
     * is delivered.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MessageDeduplicationId</code> is available to the consumer of the message (this can be useful for
     * troubleshooting delivery issues).
     * </p>
     * <p>
     * If a message is sent successfully but the acknowledgement is lost and the message is resent with the same
     * <code>MessageDeduplicationId</code> after the deduplication interval, Amazon SQS can't detect duplicate messages.
     * </p>
     * <p>
     * Amazon SQS continues to keep track of the message deduplication ID even after the message is received and
     * deleted.
     * </p>
     * </note>
     * <p>
     * The length of <code>MessageDeduplicationId</code> is 128 characters. <code>MessageDeduplicationId</code> can
     * contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (
     * <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>MessageDeduplicationId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     * >Using the MessageDeduplicationId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     */
    private String messageDeduplicationId;
    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The tag that specifies that a message belongs to a specific message group. Messages that belong to the same
     * message group are processed in a FIFO manner (however, messages in different message groups might be processed
     * out of order). To interleave multiple ordered streams within a single queue, use <code>MessageGroupId</code>
     * values (for example, session data for multiple users). In this scenario, multiple consumers can process the
     * queue, but the session data of each user is processed in a FIFO fashion.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must associate a non-empty <code>MessageGroupId</code> with a message. If you don't provide a
     * <code>MessageGroupId</code>, the action fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessage</code> might return messages with multiple <code>MessageGroupId</code> values. For each
     * <code>MessageGroupId</code>, the messages are sorted by time sent. The caller can't specify a
     * <code>MessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length of <code>MessageGroupId</code> is 128 characters. Valid values: alphanumeric characters and
     * punctuation <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     * <p>
     * For best practices of using <code>MessageGroupId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagegroupid-property.html"
     * >Using the MessageGroupId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * <code>MessageGroupId</code> is required for FIFO queues. You can't use it for Standard queues.
     * </p>
     * </important>
     */
    private String messageGroupId;

    /**
     * Default constructor for SendMessageBatchRequestEntry object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public SendMessageBatchRequestEntry() {
    }

    /**
     * Constructs a new SendMessageBatchRequestEntry object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param id
     *        An identifier for a message in this batch used to communicate the result.</p> <note>
     *        <p>
     *        The <code>Id</code>s of a batch request need to be unique within a request
     *        </p>
     *        <p>
     *        This identifier can have up to 80 characters. The following characters are accepted: alphanumeric
     *        characters, hyphens(-), and underscores (_).
     *        </p>
     * @param messageBody
     *        The body of the message.
     */
    public SendMessageBatchRequestEntry(String id, String messageBody) {
        setId(id);
        setMessageBody(messageBody);
    }

    /**
     * <p>
     * An identifier for a message in this batch used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>Id</code>s of a batch request need to be unique within a request
     * </p>
     * <p>
     * This identifier can have up to 80 characters. The following characters are accepted: alphanumeric characters,
     * hyphens(-), and underscores (_).
     * </p>
     * </note>
     * 
     * @param id
     *        An identifier for a message in this batch used to communicate the result.</p> <note>
     *        <p>
     *        The <code>Id</code>s of a batch request need to be unique within a request
     *        </p>
     *        <p>
     *        This identifier can have up to 80 characters. The following characters are accepted: alphanumeric
     *        characters, hyphens(-), and underscores (_).
     *        </p>
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An identifier for a message in this batch used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>Id</code>s of a batch request need to be unique within a request
     * </p>
     * <p>
     * This identifier can have up to 80 characters. The following characters are accepted: alphanumeric characters,
     * hyphens(-), and underscores (_).
     * </p>
     * </note>
     * 
     * @return An identifier for a message in this batch used to communicate the result.</p> <note>
     *         <p>
     *         The <code>Id</code>s of a batch request need to be unique within a request
     *         </p>
     *         <p>
     *         This identifier can have up to 80 characters. The following characters are accepted: alphanumeric
     *         characters, hyphens(-), and underscores (_).
     *         </p>
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * An identifier for a message in this batch used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>Id</code>s of a batch request need to be unique within a request
     * </p>
     * <p>
     * This identifier can have up to 80 characters. The following characters are accepted: alphanumeric characters,
     * hyphens(-), and underscores (_).
     * </p>
     * </note>
     * 
     * @param id
     *        An identifier for a message in this batch used to communicate the result.</p> <note>
     *        <p>
     *        The <code>Id</code>s of a batch request need to be unique within a request
     *        </p>
     *        <p>
     *        This identifier can have up to 80 characters. The following characters are accepted: alphanumeric
     *        characters, hyphens(-), and underscores (_).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchRequestEntry withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The body of the message.
     * </p>
     * 
     * @param messageBody
     *        The body of the message.
     */

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * <p>
     * The body of the message.
     * </p>
     * 
     * @return The body of the message.
     */

    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * <p>
     * The body of the message.
     * </p>
     * 
     * @param messageBody
     *        The body of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchRequestEntry withMessageBody(String messageBody) {
        setMessageBody(messageBody);
        return this;
    }

    /**
     * <p>
     * The length of time, in seconds, for which a specific message is delayed. Valid values: 0 to 900. Maximum: 15
     * minutes. Messages with a positive <code>DelaySeconds</code> value become available for processing after the delay
     * period is finished. If you don't specify a value, the default value for the queue is applied.
     * </p>
     * <note>
     * <p>
     * When you set <code>FifoQueue</code>, you can't set <code>DelaySeconds</code> per message. You can set this
     * parameter only on a queue level.
     * </p>
     * </note>
     * 
     * @param delaySeconds
     *        The length of time, in seconds, for which a specific message is delayed. Valid values: 0 to 900. Maximum:
     *        15 minutes. Messages with a positive <code>DelaySeconds</code> value become available for processing after
     *        the delay period is finished. If you don't specify a value, the default value for the queue is applied.
     *        </p> <note>
     *        <p>
     *        When you set <code>FifoQueue</code>, you can't set <code>DelaySeconds</code> per message. You can set this
     *        parameter only on a queue level.
     *        </p>
     */

    public void setDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
    }

    /**
     * <p>
     * The length of time, in seconds, for which a specific message is delayed. Valid values: 0 to 900. Maximum: 15
     * minutes. Messages with a positive <code>DelaySeconds</code> value become available for processing after the delay
     * period is finished. If you don't specify a value, the default value for the queue is applied.
     * </p>
     * <note>
     * <p>
     * When you set <code>FifoQueue</code>, you can't set <code>DelaySeconds</code> per message. You can set this
     * parameter only on a queue level.
     * </p>
     * </note>
     * 
     * @return The length of time, in seconds, for which a specific message is delayed. Valid values: 0 to 900. Maximum:
     *         15 minutes. Messages with a positive <code>DelaySeconds</code> value become available for processing
     *         after the delay period is finished. If you don't specify a value, the default value for the queue is
     *         applied. </p> <note>
     *         <p>
     *         When you set <code>FifoQueue</code>, you can't set <code>DelaySeconds</code> per message. You can set
     *         this parameter only on a queue level.
     *         </p>
     */

    public Integer getDelaySeconds() {
        return this.delaySeconds;
    }

    /**
     * <p>
     * The length of time, in seconds, for which a specific message is delayed. Valid values: 0 to 900. Maximum: 15
     * minutes. Messages with a positive <code>DelaySeconds</code> value become available for processing after the delay
     * period is finished. If you don't specify a value, the default value for the queue is applied.
     * </p>
     * <note>
     * <p>
     * When you set <code>FifoQueue</code>, you can't set <code>DelaySeconds</code> per message. You can set this
     * parameter only on a queue level.
     * </p>
     * </note>
     * 
     * @param delaySeconds
     *        The length of time, in seconds, for which a specific message is delayed. Valid values: 0 to 900. Maximum:
     *        15 minutes. Messages with a positive <code>DelaySeconds</code> value become available for processing after
     *        the delay period is finished. If you don't specify a value, the default value for the queue is applied.
     *        </p> <note>
     *        <p>
     *        When you set <code>FifoQueue</code>, you can't set <code>DelaySeconds</code> per message. You can set this
     *        parameter only on a queue level.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchRequestEntry withDelaySeconds(Integer delaySeconds) {
        setDelaySeconds(delaySeconds);
        return this;
    }

    /**
     * <p>
     * Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     * >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @return Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     *         >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     */

    public java.util.Map<String, MessageAttributeValue> getMessageAttributes() {
        if (messageAttributes == null) {
            messageAttributes = new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>();
        }
        return messageAttributes;
    }

    /**
     * <p>
     * Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     * >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param messageAttributes
     *        Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For
     *        more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     *        >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     */

    public void setMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>(messageAttributes);
    }

    /**
     * <p>
     * Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     * >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param messageAttributes
     *        Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For
     *        more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     *        >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchRequestEntry withMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        setMessageAttributes(messageAttributes);
        return this;
    }

    public SendMessageBatchRequestEntry addMessageAttributesEntry(String key, MessageAttributeValue value) {
        if (null == this.messageAttributes) {
            this.messageAttributes = new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>();
        }
        if (this.messageAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.messageAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MessageAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchRequestEntry clearMessageAttributesEntries() {
        this.messageAttributes = null;
        return this;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of messages within a 5-minute minimum deduplication interval. If a message with
     * a particular <code>MessageDeduplicationId</code> is sent successfully, subsequent messages with the same
     * <code>MessageDeduplicationId</code> are accepted successfully but aren't delivered. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * > Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     * <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     * <code>ContentBasedDeduplication</code> set, the action fails with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides
     * the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     * deduplication interval are treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     * <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message
     * is delivered.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MessageDeduplicationId</code> is available to the consumer of the message (this can be useful for
     * troubleshooting delivery issues).
     * </p>
     * <p>
     * If a message is sent successfully but the acknowledgement is lost and the message is resent with the same
     * <code>MessageDeduplicationId</code> after the deduplication interval, Amazon SQS can't detect duplicate messages.
     * </p>
     * <p>
     * Amazon SQS continues to keep track of the message deduplication ID even after the message is received and
     * deleted.
     * </p>
     * </note>
     * <p>
     * The length of <code>MessageDeduplicationId</code> is 128 characters. <code>MessageDeduplicationId</code> can
     * contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (
     * <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>MessageDeduplicationId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     * >Using the MessageDeduplicationId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param messageDeduplicationId
     *        This parameter applies only to FIFO (first-in-first-out) queues.</p>
     *        <p>
     *        The token used for deduplication of messages within a 5-minute minimum deduplication interval. If a
     *        message with a particular <code>MessageDeduplicationId</code> is sent successfully, subsequent messages
     *        with the same <code>MessageDeduplicationId</code> are accepted successfully but aren't delivered. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *        > Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Every message must have a unique <code>MessageDeduplicationId</code>,
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You may provide a <code>MessageDeduplicationId</code> explicitly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     *        <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     *        <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     *        <code>ContentBasedDeduplication</code> set, the action fails with an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code>
     *        overrides the generated one.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     *        deduplication interval are treated as duplicates and only one copy of the message is delivered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with
     *        a <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     *        <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the
     *        message is delivered.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>MessageDeduplicationId</code> is available to the consumer of the message (this can be useful
     *        for troubleshooting delivery issues).
     *        </p>
     *        <p>
     *        If a message is sent successfully but the acknowledgement is lost and the message is resent with the same
     *        <code>MessageDeduplicationId</code> after the deduplication interval, Amazon SQS can't detect duplicate
     *        messages.
     *        </p>
     *        <p>
     *        Amazon SQS continues to keep track of the message deduplication ID even after the message is received and
     *        deleted.
     *        </p>
     *        </note>
     *        <p>
     *        The length of <code>MessageDeduplicationId</code> is 128 characters. <code>MessageDeduplicationId</code>
     *        can contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation
     *        (<code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     *        </p>
     *        <p>
     *        For best practices of using <code>MessageDeduplicationId</code>, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     *        >Using the MessageDeduplicationId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     */

    public void setMessageDeduplicationId(String messageDeduplicationId) {
        this.messageDeduplicationId = messageDeduplicationId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of messages within a 5-minute minimum deduplication interval. If a message with
     * a particular <code>MessageDeduplicationId</code> is sent successfully, subsequent messages with the same
     * <code>MessageDeduplicationId</code> are accepted successfully but aren't delivered. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * > Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     * <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     * <code>ContentBasedDeduplication</code> set, the action fails with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides
     * the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     * deduplication interval are treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     * <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message
     * is delivered.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MessageDeduplicationId</code> is available to the consumer of the message (this can be useful for
     * troubleshooting delivery issues).
     * </p>
     * <p>
     * If a message is sent successfully but the acknowledgement is lost and the message is resent with the same
     * <code>MessageDeduplicationId</code> after the deduplication interval, Amazon SQS can't detect duplicate messages.
     * </p>
     * <p>
     * Amazon SQS continues to keep track of the message deduplication ID even after the message is received and
     * deleted.
     * </p>
     * </note>
     * <p>
     * The length of <code>MessageDeduplicationId</code> is 128 characters. <code>MessageDeduplicationId</code> can
     * contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (
     * <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>MessageDeduplicationId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     * >Using the MessageDeduplicationId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @return This parameter applies only to FIFO (first-in-first-out) queues.</p>
     *         <p>
     *         The token used for deduplication of messages within a 5-minute minimum deduplication interval. If a
     *         message with a particular <code>MessageDeduplicationId</code> is sent successfully, subsequent messages
     *         with the same <code>MessageDeduplicationId</code> are accepted successfully but aren't delivered. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *         > Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Every message must have a unique <code>MessageDeduplicationId</code>,
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You may provide a <code>MessageDeduplicationId</code> explicitly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     *         <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     *         <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the
     *         message).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     *         <code>ContentBasedDeduplication</code> set, the action fails with an error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code>
     *         overrides the generated one.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     *         deduplication interval are treated as duplicates and only one copy of the message is delivered.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with
     *         a <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     *         <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the
     *         message is delivered.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The <code>MessageDeduplicationId</code> is available to the consumer of the message (this can be useful
     *         for troubleshooting delivery issues).
     *         </p>
     *         <p>
     *         If a message is sent successfully but the acknowledgement is lost and the message is resent with the same
     *         <code>MessageDeduplicationId</code> after the deduplication interval, Amazon SQS can't detect duplicate
     *         messages.
     *         </p>
     *         <p>
     *         Amazon SQS continues to keep track of the message deduplication ID even after the message is received and
     *         deleted.
     *         </p>
     *         </note>
     *         <p>
     *         The length of <code>MessageDeduplicationId</code> is 128 characters. <code>MessageDeduplicationId</code>
     *         can contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and
     *         punctuation (<code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     *         </p>
     *         <p>
     *         For best practices of using <code>MessageDeduplicationId</code>, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     *         >Using the MessageDeduplicationId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     */

    public String getMessageDeduplicationId() {
        return this.messageDeduplicationId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of messages within a 5-minute minimum deduplication interval. If a message with
     * a particular <code>MessageDeduplicationId</code> is sent successfully, subsequent messages with the same
     * <code>MessageDeduplicationId</code> are accepted successfully but aren't delivered. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * > Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     * <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     * <code>ContentBasedDeduplication</code> set, the action fails with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides
     * the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     * deduplication interval are treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     * <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message
     * is delivered.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>MessageDeduplicationId</code> is available to the consumer of the message (this can be useful for
     * troubleshooting delivery issues).
     * </p>
     * <p>
     * If a message is sent successfully but the acknowledgement is lost and the message is resent with the same
     * <code>MessageDeduplicationId</code> after the deduplication interval, Amazon SQS can't detect duplicate messages.
     * </p>
     * <p>
     * Amazon SQS continues to keep track of the message deduplication ID even after the message is received and
     * deleted.
     * </p>
     * </note>
     * <p>
     * The length of <code>MessageDeduplicationId</code> is 128 characters. <code>MessageDeduplicationId</code> can
     * contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (
     * <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>MessageDeduplicationId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     * >Using the MessageDeduplicationId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param messageDeduplicationId
     *        This parameter applies only to FIFO (first-in-first-out) queues.</p>
     *        <p>
     *        The token used for deduplication of messages within a 5-minute minimum deduplication interval. If a
     *        message with a particular <code>MessageDeduplicationId</code> is sent successfully, subsequent messages
     *        with the same <code>MessageDeduplicationId</code> are accepted successfully but aren't delivered. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *        > Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Every message must have a unique <code>MessageDeduplicationId</code>,
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You may provide a <code>MessageDeduplicationId</code> explicitly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     *        <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     *        <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     *        <code>ContentBasedDeduplication</code> set, the action fails with an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code>
     *        overrides the generated one.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     *        deduplication interval are treated as duplicates and only one copy of the message is delivered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with
     *        a <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     *        <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the
     *        message is delivered.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>MessageDeduplicationId</code> is available to the consumer of the message (this can be useful
     *        for troubleshooting delivery issues).
     *        </p>
     *        <p>
     *        If a message is sent successfully but the acknowledgement is lost and the message is resent with the same
     *        <code>MessageDeduplicationId</code> after the deduplication interval, Amazon SQS can't detect duplicate
     *        messages.
     *        </p>
     *        <p>
     *        Amazon SQS continues to keep track of the message deduplication ID even after the message is received and
     *        deleted.
     *        </p>
     *        </note>
     *        <p>
     *        The length of <code>MessageDeduplicationId</code> is 128 characters. <code>MessageDeduplicationId</code>
     *        can contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation
     *        (<code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     *        </p>
     *        <p>
     *        For best practices of using <code>MessageDeduplicationId</code>, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     *        >Using the MessageDeduplicationId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchRequestEntry withMessageDeduplicationId(String messageDeduplicationId) {
        setMessageDeduplicationId(messageDeduplicationId);
        return this;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The tag that specifies that a message belongs to a specific message group. Messages that belong to the same
     * message group are processed in a FIFO manner (however, messages in different message groups might be processed
     * out of order). To interleave multiple ordered streams within a single queue, use <code>MessageGroupId</code>
     * values (for example, session data for multiple users). In this scenario, multiple consumers can process the
     * queue, but the session data of each user is processed in a FIFO fashion.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must associate a non-empty <code>MessageGroupId</code> with a message. If you don't provide a
     * <code>MessageGroupId</code>, the action fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessage</code> might return messages with multiple <code>MessageGroupId</code> values. For each
     * <code>MessageGroupId</code>, the messages are sorted by time sent. The caller can't specify a
     * <code>MessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length of <code>MessageGroupId</code> is 128 characters. Valid values: alphanumeric characters and
     * punctuation <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     * <p>
     * For best practices of using <code>MessageGroupId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagegroupid-property.html"
     * >Using the MessageGroupId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * <code>MessageGroupId</code> is required for FIFO queues. You can't use it for Standard queues.
     * </p>
     * </important>
     * 
     * @param messageGroupId
     *        This parameter applies only to FIFO (first-in-first-out) queues.</p>
     *        <p>
     *        The tag that specifies that a message belongs to a specific message group. Messages that belong to the
     *        same message group are processed in a FIFO manner (however, messages in different message groups might be
     *        processed out of order). To interleave multiple ordered streams within a single queue, use
     *        <code>MessageGroupId</code> values (for example, session data for multiple users). In this scenario,
     *        multiple consumers can process the queue, but the session data of each user is processed in a FIFO
     *        fashion.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You must associate a non-empty <code>MessageGroupId</code> with a message. If you don't provide a
     *        <code>MessageGroupId</code>, the action fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessage</code> might return messages with multiple <code>MessageGroupId</code> values. For
     *        each <code>MessageGroupId</code>, the messages are sorted by time sent. The caller can't specify a
     *        <code>MessageGroupId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length of <code>MessageGroupId</code> is 128 characters. Valid values: alphanumeric characters and
     *        punctuation <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     *        </p>
     *        <p>
     *        For best practices of using <code>MessageGroupId</code>, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagegroupid-property.html"
     *        >Using the MessageGroupId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <important>
     *        <p>
     *        <code>MessageGroupId</code> is required for FIFO queues. You can't use it for Standard queues.
     *        </p>
     */

    public void setMessageGroupId(String messageGroupId) {
        this.messageGroupId = messageGroupId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The tag that specifies that a message belongs to a specific message group. Messages that belong to the same
     * message group are processed in a FIFO manner (however, messages in different message groups might be processed
     * out of order). To interleave multiple ordered streams within a single queue, use <code>MessageGroupId</code>
     * values (for example, session data for multiple users). In this scenario, multiple consumers can process the
     * queue, but the session data of each user is processed in a FIFO fashion.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must associate a non-empty <code>MessageGroupId</code> with a message. If you don't provide a
     * <code>MessageGroupId</code>, the action fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessage</code> might return messages with multiple <code>MessageGroupId</code> values. For each
     * <code>MessageGroupId</code>, the messages are sorted by time sent. The caller can't specify a
     * <code>MessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length of <code>MessageGroupId</code> is 128 characters. Valid values: alphanumeric characters and
     * punctuation <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     * <p>
     * For best practices of using <code>MessageGroupId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagegroupid-property.html"
     * >Using the MessageGroupId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * <code>MessageGroupId</code> is required for FIFO queues. You can't use it for Standard queues.
     * </p>
     * </important>
     * 
     * @return This parameter applies only to FIFO (first-in-first-out) queues.</p>
     *         <p>
     *         The tag that specifies that a message belongs to a specific message group. Messages that belong to the
     *         same message group are processed in a FIFO manner (however, messages in different message groups might be
     *         processed out of order). To interleave multiple ordered streams within a single queue, use
     *         <code>MessageGroupId</code> values (for example, session data for multiple users). In this scenario,
     *         multiple consumers can process the queue, but the session data of each user is processed in a FIFO
     *         fashion.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You must associate a non-empty <code>MessageGroupId</code> with a message. If you don't provide a
     *         <code>MessageGroupId</code>, the action fails.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReceiveMessage</code> might return messages with multiple <code>MessageGroupId</code> values. For
     *         each <code>MessageGroupId</code>, the messages are sorted by time sent. The caller can't specify a
     *         <code>MessageGroupId</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The length of <code>MessageGroupId</code> is 128 characters. Valid values: alphanumeric characters and
     *         punctuation <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     *         </p>
     *         <p>
     *         For best practices of using <code>MessageGroupId</code>, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagegroupid-property.html"
     *         >Using the MessageGroupId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *         </p>
     *         <important>
     *         <p>
     *         <code>MessageGroupId</code> is required for FIFO queues. You can't use it for Standard queues.
     *         </p>
     */

    public String getMessageGroupId() {
        return this.messageGroupId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The tag that specifies that a message belongs to a specific message group. Messages that belong to the same
     * message group are processed in a FIFO manner (however, messages in different message groups might be processed
     * out of order). To interleave multiple ordered streams within a single queue, use <code>MessageGroupId</code>
     * values (for example, session data for multiple users). In this scenario, multiple consumers can process the
     * queue, but the session data of each user is processed in a FIFO fashion.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must associate a non-empty <code>MessageGroupId</code> with a message. If you don't provide a
     * <code>MessageGroupId</code>, the action fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessage</code> might return messages with multiple <code>MessageGroupId</code> values. For each
     * <code>MessageGroupId</code>, the messages are sorted by time sent. The caller can't specify a
     * <code>MessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length of <code>MessageGroupId</code> is 128 characters. Valid values: alphanumeric characters and
     * punctuation <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     * </p>
     * <p>
     * For best practices of using <code>MessageGroupId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagegroupid-property.html"
     * >Using the MessageGroupId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * <code>MessageGroupId</code> is required for FIFO queues. You can't use it for Standard queues.
     * </p>
     * </important>
     * 
     * @param messageGroupId
     *        This parameter applies only to FIFO (first-in-first-out) queues.</p>
     *        <p>
     *        The tag that specifies that a message belongs to a specific message group. Messages that belong to the
     *        same message group are processed in a FIFO manner (however, messages in different message groups might be
     *        processed out of order). To interleave multiple ordered streams within a single queue, use
     *        <code>MessageGroupId</code> values (for example, session data for multiple users). In this scenario,
     *        multiple consumers can process the queue, but the session data of each user is processed in a FIFO
     *        fashion.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You must associate a non-empty <code>MessageGroupId</code> with a message. If you don't provide a
     *        <code>MessageGroupId</code>, the action fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessage</code> might return messages with multiple <code>MessageGroupId</code> values. For
     *        each <code>MessageGroupId</code>, the messages are sorted by time sent. The caller can't specify a
     *        <code>MessageGroupId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length of <code>MessageGroupId</code> is 128 characters. Valid values: alphanumeric characters and
     *        punctuation <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.
     *        </p>
     *        <p>
     *        For best practices of using <code>MessageGroupId</code>, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagegroupid-property.html"
     *        >Using the MessageGroupId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <important>
     *        <p>
     *        <code>MessageGroupId</code> is required for FIFO queues. You can't use it for Standard queues.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchRequestEntry withMessageGroupId(String messageGroupId) {
        setMessageGroupId(messageGroupId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMessageBody() != null)
            sb.append("MessageBody: ").append(getMessageBody()).append(",");
        if (getDelaySeconds() != null)
            sb.append("DelaySeconds: ").append(getDelaySeconds()).append(",");
        if (getMessageAttributes() != null)
            sb.append("MessageAttributes: ").append(getMessageAttributes()).append(",");
        if (getMessageDeduplicationId() != null)
            sb.append("MessageDeduplicationId: ").append(getMessageDeduplicationId()).append(",");
        if (getMessageGroupId() != null)
            sb.append("MessageGroupId: ").append(getMessageGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendMessageBatchRequestEntry == false)
            return false;
        SendMessageBatchRequestEntry other = (SendMessageBatchRequestEntry) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMessageBody() == null ^ this.getMessageBody() == null)
            return false;
        if (other.getMessageBody() != null && other.getMessageBody().equals(this.getMessageBody()) == false)
            return false;
        if (other.getDelaySeconds() == null ^ this.getDelaySeconds() == null)
            return false;
        if (other.getDelaySeconds() != null && other.getDelaySeconds().equals(this.getDelaySeconds()) == false)
            return false;
        if (other.getMessageAttributes() == null ^ this.getMessageAttributes() == null)
            return false;
        if (other.getMessageAttributes() != null && other.getMessageAttributes().equals(this.getMessageAttributes()) == false)
            return false;
        if (other.getMessageDeduplicationId() == null ^ this.getMessageDeduplicationId() == null)
            return false;
        if (other.getMessageDeduplicationId() != null && other.getMessageDeduplicationId().equals(this.getMessageDeduplicationId()) == false)
            return false;
        if (other.getMessageGroupId() == null ^ this.getMessageGroupId() == null)
            return false;
        if (other.getMessageGroupId() != null && other.getMessageGroupId().equals(this.getMessageGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode());
        hashCode = prime * hashCode + ((getDelaySeconds() == null) ? 0 : getDelaySeconds().hashCode());
        hashCode = prime * hashCode + ((getMessageAttributes() == null) ? 0 : getMessageAttributes().hashCode());
        hashCode = prime * hashCode + ((getMessageDeduplicationId() == null) ? 0 : getMessageDeduplicationId().hashCode());
        hashCode = prime * hashCode + ((getMessageGroupId() == null) ? 0 : getMessageGroupId().hashCode());
        return hashCode;
    }

    @Override
    public SendMessageBatchRequestEntry clone() {
        try {
            return (SendMessageBatchRequestEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
