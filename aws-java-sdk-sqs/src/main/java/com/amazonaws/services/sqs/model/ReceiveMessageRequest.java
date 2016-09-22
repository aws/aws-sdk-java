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
public class ReceiveMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * A list of attributes that need to be returned along with each message. These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the message was first received from the
     * queue (epoch time in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - returns the number of times a message has been received from the queue but
     * not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code> - returns the AWS account number (or the IP address, if anonymous access is allowed) of the
     * sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - returns the time when the message was sent to the queue (epoch time in
     * milliseconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>DelaySeconds</code>, <code>LastModifiedTimestamp</code>,
     * <code>MaximumMessageSize</code>, <code>MessageRetentionPeriod</code>, <code>Policy</code>, <code>QueueArn</code>,
     * <code>ReceiveMessageWaitTimeSeconds</code>, <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>) will
     * be ignored.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> attributeNames;
    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index. The message attribute name can contain the
     * following characters: A-Z, a-z, 0-9, underscore (_), hyphen (-), and period (.). The name must not start or end
     * with a period, and it should not have successive periods. The name is case sensitive and must be unique among all
     * attribute names for the message. The name can be up to 256 characters long. The name cannot start with "AWS." or
     * "Amazon." (or any variations in casing), because these prefixes are reserved for use by Amazon Web Services.
     * </p>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can return all
     * of the attributes by specifying "All" or ".*" in your request. You can also use "bar.*" to return all message
     * attributes starting with the "bar" prefix.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> messageAttributeNames;
    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more messages than this value but may return
     * fewer. Values can be from 1 to 10. Default is 1.
     * </p>
     * <p>
     * All of the messages are not necessarily returned.
     * </p>
     */
    private Integer maxNumberOfMessages;
    /**
     * <p>
     * The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after being
     * retrieved by a <code>ReceiveMessage</code> request.
     * </p>
     */
    private Integer visibilityTimeout;
    /**
     * <p>
     * The duration (in seconds) for which the call will wait for a message to arrive in the queue before returning. If
     * a message is available, the call will return sooner than WaitTimeSeconds.
     * </p>
     */
    private Integer waitTimeSeconds;

    /**
     * Default constructor for ReceiveMessageRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ReceiveMessageRequest() {
    }

    /**
     * Constructs a new ReceiveMessageRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     */
    public ReceiveMessageRequest(String queueUrl) {
        setQueueUrl(queueUrl);
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

    public ReceiveMessageRequest withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * A list of attributes that need to be returned along with each message. These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the message was first received from the
     * queue (epoch time in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - returns the number of times a message has been received from the queue but
     * not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code> - returns the AWS account number (or the IP address, if anonymous access is allowed) of the
     * sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - returns the time when the message was sent to the queue (epoch time in
     * milliseconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>DelaySeconds</code>, <code>LastModifiedTimestamp</code>,
     * <code>MaximumMessageSize</code>, <code>MessageRetentionPeriod</code>, <code>Policy</code>, <code>QueueArn</code>,
     * <code>ReceiveMessageWaitTimeSeconds</code>, <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>) will
     * be ignored.
     * </p>
     * 
     * @return A list of attributes that need to be returned along with each message. These attributes include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>All</code> - returns all values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the message was first received from
     *         the queue (epoch time in milliseconds).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateReceiveCount</code> - returns the number of times a message has been received from the
     *         queue but not deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SenderId</code> - returns the AWS account number (or the IP address, if anonymous access is
     *         allowed) of the sender.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SentTimestamp</code> - returns the time when the message was sent to the queue (epoch time in
     *         milliseconds).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Any other valid special request parameters that are specified (such as
     *         <code>ApproximateNumberOfMessages</code>, <code>ApproximateNumberOfMessagesDelayed</code>,
     *         <code>ApproximateNumberOfMessagesNotVisible</code>, <code>CreatedTimestamp</code>,
     *         <code>DelaySeconds</code>, <code>LastModifiedTimestamp</code>, <code>MaximumMessageSize</code>,
     *         <code>MessageRetentionPeriod</code>, <code>Policy</code>, <code>QueueArn</code>,
     *         <code>ReceiveMessageWaitTimeSeconds</code>, <code>RedrivePolicy</code>, and
     *         <code>VisibilityTimeout</code>) will be ignored.
     * @see QueueAttributeName
     */

    public java.util.List<String> getAttributeNames() {
        if (attributeNames == null) {
            attributeNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return attributeNames;
    }

    /**
     * <p>
     * A list of attributes that need to be returned along with each message. These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the message was first received from the
     * queue (epoch time in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - returns the number of times a message has been received from the queue but
     * not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code> - returns the AWS account number (or the IP address, if anonymous access is allowed) of the
     * sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - returns the time when the message was sent to the queue (epoch time in
     * milliseconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>DelaySeconds</code>, <code>LastModifiedTimestamp</code>,
     * <code>MaximumMessageSize</code>, <code>MessageRetentionPeriod</code>, <code>Policy</code>, <code>QueueArn</code>,
     * <code>ReceiveMessageWaitTimeSeconds</code>, <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>) will
     * be ignored.
     * </p>
     * 
     * @param attributeNames
     *        A list of attributes that need to be returned along with each message. These attributes include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>All</code> - returns all values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the message was first received from
     *        the queue (epoch time in milliseconds).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateReceiveCount</code> - returns the number of times a message has been received from the
     *        queue but not deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SenderId</code> - returns the AWS account number (or the IP address, if anonymous access is allowed)
     *        of the sender.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SentTimestamp</code> - returns the time when the message was sent to the queue (epoch time in
     *        milliseconds).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Any other valid special request parameters that are specified (such as
     *        <code>ApproximateNumberOfMessages</code>, <code>ApproximateNumberOfMessagesDelayed</code>,
     *        <code>ApproximateNumberOfMessagesNotVisible</code>, <code>CreatedTimestamp</code>,
     *        <code>DelaySeconds</code>, <code>LastModifiedTimestamp</code>, <code>MaximumMessageSize</code>,
     *        <code>MessageRetentionPeriod</code>, <code>Policy</code>, <code>QueueArn</code>,
     *        <code>ReceiveMessageWaitTimeSeconds</code>, <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>
     *        ) will be ignored.
     * @see QueueAttributeName
     */

    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new com.amazonaws.internal.SdkInternalList<String>(attributeNames);
    }

    /**
     * <p>
     * A list of attributes that need to be returned along with each message. These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the message was first received from the
     * queue (epoch time in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - returns the number of times a message has been received from the queue but
     * not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code> - returns the AWS account number (or the IP address, if anonymous access is allowed) of the
     * sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - returns the time when the message was sent to the queue (epoch time in
     * milliseconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>DelaySeconds</code>, <code>LastModifiedTimestamp</code>,
     * <code>MaximumMessageSize</code>, <code>MessageRetentionPeriod</code>, <code>Policy</code>, <code>QueueArn</code>,
     * <code>ReceiveMessageWaitTimeSeconds</code>, <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>) will
     * be ignored.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeNames(java.util.Collection)} or {@link #withAttributeNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeNames
     *        A list of attributes that need to be returned along with each message. These attributes include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>All</code> - returns all values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the message was first received from
     *        the queue (epoch time in milliseconds).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateReceiveCount</code> - returns the number of times a message has been received from the
     *        queue but not deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SenderId</code> - returns the AWS account number (or the IP address, if anonymous access is allowed)
     *        of the sender.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SentTimestamp</code> - returns the time when the message was sent to the queue (epoch time in
     *        milliseconds).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Any other valid special request parameters that are specified (such as
     *        <code>ApproximateNumberOfMessages</code>, <code>ApproximateNumberOfMessagesDelayed</code>,
     *        <code>ApproximateNumberOfMessagesNotVisible</code>, <code>CreatedTimestamp</code>,
     *        <code>DelaySeconds</code>, <code>LastModifiedTimestamp</code>, <code>MaximumMessageSize</code>,
     *        <code>MessageRetentionPeriod</code>, <code>Policy</code>, <code>QueueArn</code>,
     *        <code>ReceiveMessageWaitTimeSeconds</code>, <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>
     *        ) will be ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueAttributeName
     */

    public ReceiveMessageRequest withAttributeNames(String... attributeNames) {
        if (this.attributeNames == null) {
            setAttributeNames(new com.amazonaws.internal.SdkInternalList<String>(attributeNames.length));
        }
        for (String ele : attributeNames) {
            this.attributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attributes that need to be returned along with each message. These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the message was first received from the
     * queue (epoch time in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - returns the number of times a message has been received from the queue but
     * not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code> - returns the AWS account number (or the IP address, if anonymous access is allowed) of the
     * sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - returns the time when the message was sent to the queue (epoch time in
     * milliseconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>DelaySeconds</code>, <code>LastModifiedTimestamp</code>,
     * <code>MaximumMessageSize</code>, <code>MessageRetentionPeriod</code>, <code>Policy</code>, <code>QueueArn</code>,
     * <code>ReceiveMessageWaitTimeSeconds</code>, <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>) will
     * be ignored.
     * </p>
     * 
     * @param attributeNames
     *        A list of attributes that need to be returned along with each message. These attributes include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>All</code> - returns all values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the message was first received from
     *        the queue (epoch time in milliseconds).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateReceiveCount</code> - returns the number of times a message has been received from the
     *        queue but not deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SenderId</code> - returns the AWS account number (or the IP address, if anonymous access is allowed)
     *        of the sender.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SentTimestamp</code> - returns the time when the message was sent to the queue (epoch time in
     *        milliseconds).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Any other valid special request parameters that are specified (such as
     *        <code>ApproximateNumberOfMessages</code>, <code>ApproximateNumberOfMessagesDelayed</code>,
     *        <code>ApproximateNumberOfMessagesNotVisible</code>, <code>CreatedTimestamp</code>,
     *        <code>DelaySeconds</code>, <code>LastModifiedTimestamp</code>, <code>MaximumMessageSize</code>,
     *        <code>MessageRetentionPeriod</code>, <code>Policy</code>, <code>QueueArn</code>,
     *        <code>ReceiveMessageWaitTimeSeconds</code>, <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>
     *        ) will be ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueAttributeName
     */

    public ReceiveMessageRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
        return this;
    }

    /**
     * <p>
     * A list of attributes that need to be returned along with each message. These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the message was first received from the
     * queue (epoch time in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - returns the number of times a message has been received from the queue but
     * not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code> - returns the AWS account number (or the IP address, if anonymous access is allowed) of the
     * sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - returns the time when the message was sent to the queue (epoch time in
     * milliseconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters that are specified (such as <code>ApproximateNumberOfMessages</code>,
     * <code>ApproximateNumberOfMessagesDelayed</code>, <code>ApproximateNumberOfMessagesNotVisible</code>,
     * <code>CreatedTimestamp</code>, <code>DelaySeconds</code>, <code>LastModifiedTimestamp</code>,
     * <code>MaximumMessageSize</code>, <code>MessageRetentionPeriod</code>, <code>Policy</code>, <code>QueueArn</code>,
     * <code>ReceiveMessageWaitTimeSeconds</code>, <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>) will
     * be ignored.
     * </p>
     * 
     * @param attributeNames
     *        A list of attributes that need to be returned along with each message. These attributes include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>All</code> - returns all values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateFirstReceiveTimestamp</code> - returns the time when the message was first received from
     *        the queue (epoch time in milliseconds).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateReceiveCount</code> - returns the number of times a message has been received from the
     *        queue but not deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SenderId</code> - returns the AWS account number (or the IP address, if anonymous access is allowed)
     *        of the sender.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SentTimestamp</code> - returns the time when the message was sent to the queue (epoch time in
     *        milliseconds).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Any other valid special request parameters that are specified (such as
     *        <code>ApproximateNumberOfMessages</code>, <code>ApproximateNumberOfMessagesDelayed</code>,
     *        <code>ApproximateNumberOfMessagesNotVisible</code>, <code>CreatedTimestamp</code>,
     *        <code>DelaySeconds</code>, <code>LastModifiedTimestamp</code>, <code>MaximumMessageSize</code>,
     *        <code>MessageRetentionPeriod</code>, <code>Policy</code>, <code>QueueArn</code>,
     *        <code>ReceiveMessageWaitTimeSeconds</code>, <code>RedrivePolicy</code>, and <code>VisibilityTimeout</code>
     *        ) will be ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueAttributeName
     */

    public ReceiveMessageRequest withAttributeNames(QueueAttributeName... attributeNames) {
        com.amazonaws.internal.SdkInternalList<String> attributeNamesCopy = new com.amazonaws.internal.SdkInternalList<String>(attributeNames.length);
        for (QueueAttributeName value : attributeNames) {
            attributeNamesCopy.add(value.toString());
        }
        if (getAttributeNames() == null) {
            setAttributeNames(attributeNamesCopy);
        } else {
            getAttributeNames().addAll(attributeNamesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index. The message attribute name can contain the
     * following characters: A-Z, a-z, 0-9, underscore (_), hyphen (-), and period (.). The name must not start or end
     * with a period, and it should not have successive periods. The name is case sensitive and must be unique among all
     * attribute names for the message. The name can be up to 256 characters long. The name cannot start with "AWS." or
     * "Amazon." (or any variations in casing), because these prefixes are reserved for use by Amazon Web Services.
     * </p>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can return all
     * of the attributes by specifying "All" or ".*" in your request. You can also use "bar.*" to return all message
     * attributes starting with the "bar" prefix.
     * </p>
     * 
     * @return The name of the message attribute, where <i>N</i> is the index. The message attribute name can contain
     *         the following characters: A-Z, a-z, 0-9, underscore (_), hyphen (-), and period (.). The name must not
     *         start or end with a period, and it should not have successive periods. The name is case sensitive and
     *         must be unique among all attribute names for the message. The name can be up to 256 characters long. The
     *         name cannot start with "AWS." or "Amazon." (or any variations in casing), because these prefixes are
     *         reserved for use by Amazon Web Services.</p>
     *         <p>
     *         When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can
     *         return all of the attributes by specifying "All" or ".*" in your request. You can also use "bar.*" to
     *         return all message attributes starting with the "bar" prefix.
     */

    public java.util.List<String> getMessageAttributeNames() {
        if (messageAttributeNames == null) {
            messageAttributeNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return messageAttributeNames;
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index. The message attribute name can contain the
     * following characters: A-Z, a-z, 0-9, underscore (_), hyphen (-), and period (.). The name must not start or end
     * with a period, and it should not have successive periods. The name is case sensitive and must be unique among all
     * attribute names for the message. The name can be up to 256 characters long. The name cannot start with "AWS." or
     * "Amazon." (or any variations in casing), because these prefixes are reserved for use by Amazon Web Services.
     * </p>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can return all
     * of the attributes by specifying "All" or ".*" in your request. You can also use "bar.*" to return all message
     * attributes starting with the "bar" prefix.
     * </p>
     * 
     * @param messageAttributeNames
     *        The name of the message attribute, where <i>N</i> is the index. The message attribute name can contain the
     *        following characters: A-Z, a-z, 0-9, underscore (_), hyphen (-), and period (.). The name must not start
     *        or end with a period, and it should not have successive periods. The name is case sensitive and must be
     *        unique among all attribute names for the message. The name can be up to 256 characters long. The name
     *        cannot start with "AWS." or "Amazon." (or any variations in casing), because these prefixes are reserved
     *        for use by Amazon Web Services.</p>
     *        <p>
     *        When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can
     *        return all of the attributes by specifying "All" or ".*" in your request. You can also use "bar.*" to
     *        return all message attributes starting with the "bar" prefix.
     */

    public void setMessageAttributeNames(java.util.Collection<String> messageAttributeNames) {
        if (messageAttributeNames == null) {
            this.messageAttributeNames = null;
            return;
        }

        this.messageAttributeNames = new com.amazonaws.internal.SdkInternalList<String>(messageAttributeNames);
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index. The message attribute name can contain the
     * following characters: A-Z, a-z, 0-9, underscore (_), hyphen (-), and period (.). The name must not start or end
     * with a period, and it should not have successive periods. The name is case sensitive and must be unique among all
     * attribute names for the message. The name can be up to 256 characters long. The name cannot start with "AWS." or
     * "Amazon." (or any variations in casing), because these prefixes are reserved for use by Amazon Web Services.
     * </p>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can return all
     * of the attributes by specifying "All" or ".*" in your request. You can also use "bar.*" to return all message
     * attributes starting with the "bar" prefix.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessageAttributeNames(java.util.Collection)} or
     * {@link #withMessageAttributeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param messageAttributeNames
     *        The name of the message attribute, where <i>N</i> is the index. The message attribute name can contain the
     *        following characters: A-Z, a-z, 0-9, underscore (_), hyphen (-), and period (.). The name must not start
     *        or end with a period, and it should not have successive periods. The name is case sensitive and must be
     *        unique among all attribute names for the message. The name can be up to 256 characters long. The name
     *        cannot start with "AWS." or "Amazon." (or any variations in casing), because these prefixes are reserved
     *        for use by Amazon Web Services.</p>
     *        <p>
     *        When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can
     *        return all of the attributes by specifying "All" or ".*" in your request. You can also use "bar.*" to
     *        return all message attributes starting with the "bar" prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiveMessageRequest withMessageAttributeNames(String... messageAttributeNames) {
        if (this.messageAttributeNames == null) {
            setMessageAttributeNames(new com.amazonaws.internal.SdkInternalList<String>(messageAttributeNames.length));
        }
        for (String ele : messageAttributeNames) {
            this.messageAttributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index. The message attribute name can contain the
     * following characters: A-Z, a-z, 0-9, underscore (_), hyphen (-), and period (.). The name must not start or end
     * with a period, and it should not have successive periods. The name is case sensitive and must be unique among all
     * attribute names for the message. The name can be up to 256 characters long. The name cannot start with "AWS." or
     * "Amazon." (or any variations in casing), because these prefixes are reserved for use by Amazon Web Services.
     * </p>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can return all
     * of the attributes by specifying "All" or ".*" in your request. You can also use "bar.*" to return all message
     * attributes starting with the "bar" prefix.
     * </p>
     * 
     * @param messageAttributeNames
     *        The name of the message attribute, where <i>N</i> is the index. The message attribute name can contain the
     *        following characters: A-Z, a-z, 0-9, underscore (_), hyphen (-), and period (.). The name must not start
     *        or end with a period, and it should not have successive periods. The name is case sensitive and must be
     *        unique among all attribute names for the message. The name can be up to 256 characters long. The name
     *        cannot start with "AWS." or "Amazon." (or any variations in casing), because these prefixes are reserved
     *        for use by Amazon Web Services.</p>
     *        <p>
     *        When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can
     *        return all of the attributes by specifying "All" or ".*" in your request. You can also use "bar.*" to
     *        return all message attributes starting with the "bar" prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiveMessageRequest withMessageAttributeNames(java.util.Collection<String> messageAttributeNames) {
        setMessageAttributeNames(messageAttributeNames);
        return this;
    }

    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more messages than this value but may return
     * fewer. Values can be from 1 to 10. Default is 1.
     * </p>
     * <p>
     * All of the messages are not necessarily returned.
     * </p>
     * 
     * @param maxNumberOfMessages
     *        The maximum number of messages to return. Amazon SQS never returns more messages than this value but may
     *        return fewer. Values can be from 1 to 10. Default is 1.</p>
     *        <p>
     *        All of the messages are not necessarily returned.
     */

    public void setMaxNumberOfMessages(Integer maxNumberOfMessages) {
        this.maxNumberOfMessages = maxNumberOfMessages;
    }

    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more messages than this value but may return
     * fewer. Values can be from 1 to 10. Default is 1.
     * </p>
     * <p>
     * All of the messages are not necessarily returned.
     * </p>
     * 
     * @return The maximum number of messages to return. Amazon SQS never returns more messages than this value but may
     *         return fewer. Values can be from 1 to 10. Default is 1.</p>
     *         <p>
     *         All of the messages are not necessarily returned.
     */

    public Integer getMaxNumberOfMessages() {
        return this.maxNumberOfMessages;
    }

    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more messages than this value but may return
     * fewer. Values can be from 1 to 10. Default is 1.
     * </p>
     * <p>
     * All of the messages are not necessarily returned.
     * </p>
     * 
     * @param maxNumberOfMessages
     *        The maximum number of messages to return. Amazon SQS never returns more messages than this value but may
     *        return fewer. Values can be from 1 to 10. Default is 1.</p>
     *        <p>
     *        All of the messages are not necessarily returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiveMessageRequest withMaxNumberOfMessages(Integer maxNumberOfMessages) {
        setMaxNumberOfMessages(maxNumberOfMessages);
        return this;
    }

    /**
     * <p>
     * The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after being
     * retrieved by a <code>ReceiveMessage</code> request.
     * </p>
     * 
     * @param visibilityTimeout
     *        The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after
     *        being retrieved by a <code>ReceiveMessage</code> request.
     */

    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }

    /**
     * <p>
     * The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after being
     * retrieved by a <code>ReceiveMessage</code> request.
     * </p>
     * 
     * @return The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after
     *         being retrieved by a <code>ReceiveMessage</code> request.
     */

    public Integer getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

    /**
     * <p>
     * The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after being
     * retrieved by a <code>ReceiveMessage</code> request.
     * </p>
     * 
     * @param visibilityTimeout
     *        The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after
     *        being retrieved by a <code>ReceiveMessage</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiveMessageRequest withVisibilityTimeout(Integer visibilityTimeout) {
        setVisibilityTimeout(visibilityTimeout);
        return this;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call will wait for a message to arrive in the queue before returning. If
     * a message is available, the call will return sooner than WaitTimeSeconds.
     * </p>
     * 
     * @param waitTimeSeconds
     *        The duration (in seconds) for which the call will wait for a message to arrive in the queue before
     *        returning. If a message is available, the call will return sooner than WaitTimeSeconds.
     */

    public void setWaitTimeSeconds(Integer waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call will wait for a message to arrive in the queue before returning. If
     * a message is available, the call will return sooner than WaitTimeSeconds.
     * </p>
     * 
     * @return The duration (in seconds) for which the call will wait for a message to arrive in the queue before
     *         returning. If a message is available, the call will return sooner than WaitTimeSeconds.
     */

    public Integer getWaitTimeSeconds() {
        return this.waitTimeSeconds;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call will wait for a message to arrive in the queue before returning. If
     * a message is available, the call will return sooner than WaitTimeSeconds.
     * </p>
     * 
     * @param waitTimeSeconds
     *        The duration (in seconds) for which the call will wait for a message to arrive in the queue before
     *        returning. If a message is available, the call will return sooner than WaitTimeSeconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiveMessageRequest withWaitTimeSeconds(Integer waitTimeSeconds) {
        setWaitTimeSeconds(waitTimeSeconds);
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
        if (getAttributeNames() != null)
            sb.append("AttributeNames: " + getAttributeNames() + ",");
        if (getMessageAttributeNames() != null)
            sb.append("MessageAttributeNames: " + getMessageAttributeNames() + ",");
        if (getMaxNumberOfMessages() != null)
            sb.append("MaxNumberOfMessages: " + getMaxNumberOfMessages() + ",");
        if (getVisibilityTimeout() != null)
            sb.append("VisibilityTimeout: " + getVisibilityTimeout() + ",");
        if (getWaitTimeSeconds() != null)
            sb.append("WaitTimeSeconds: " + getWaitTimeSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReceiveMessageRequest == false)
            return false;
        ReceiveMessageRequest other = (ReceiveMessageRequest) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        if (other.getMessageAttributeNames() == null ^ this.getMessageAttributeNames() == null)
            return false;
        if (other.getMessageAttributeNames() != null && other.getMessageAttributeNames().equals(this.getMessageAttributeNames()) == false)
            return false;
        if (other.getMaxNumberOfMessages() == null ^ this.getMaxNumberOfMessages() == null)
            return false;
        if (other.getMaxNumberOfMessages() != null && other.getMaxNumberOfMessages().equals(this.getMaxNumberOfMessages()) == false)
            return false;
        if (other.getVisibilityTimeout() == null ^ this.getVisibilityTimeout() == null)
            return false;
        if (other.getVisibilityTimeout() != null && other.getVisibilityTimeout().equals(this.getVisibilityTimeout()) == false)
            return false;
        if (other.getWaitTimeSeconds() == null ^ this.getWaitTimeSeconds() == null)
            return false;
        if (other.getWaitTimeSeconds() != null && other.getWaitTimeSeconds().equals(this.getWaitTimeSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getMessageAttributeNames() == null) ? 0 : getMessageAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getMaxNumberOfMessages() == null) ? 0 : getMaxNumberOfMessages().hashCode());
        hashCode = prime * hashCode + ((getVisibilityTimeout() == null) ? 0 : getVisibilityTimeout().hashCode());
        hashCode = prime * hashCode + ((getWaitTimeSeconds() == null) ? 0 : getWaitTimeSeconds().hashCode());
        return hashCode;
    }

    @Override
    public ReceiveMessageRequest clone() {
        return (ReceiveMessageRequest) super.clone();
    }
}
