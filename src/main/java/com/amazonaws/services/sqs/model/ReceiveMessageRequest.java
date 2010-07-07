/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#receiveMessage(ReceiveMessageRequest) ReceiveMessage operation}.
 * <p>
 * Retrieves one or more messages from the specified queue, including
 * the message body and message ID of each message. Messages returned by
 * this action stay in the queue until you delete them. However, once a
 * message is returned to a ReceiveMessage request, it is not returned on
 * subsequent ReceiveMessage requests for the duration of the
 * VisibilityTimeout. If you do not specify a VisibilityTimeout in the
 * request, the overall visibility timeout for the queue is used for the
 * returned messages.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#receiveMessage(ReceiveMessageRequest)
 */
public class ReceiveMessageRequest extends AmazonWebServiceRequest {

    /**
     * 
     */
    private String queueUrl;

    /**
     * A list of attributes to get.
     */
    private java.util.List<String> attributeNames;

    /**
     * The maximum number of messages to return. Amazon SQS never returns
     * more messages than this value but may return fewer. <p> All of the
     * messages are not necessarily returned.
     */
    private Integer maxNumberOfMessages;

    /**
     * The duration (in seconds) that the received messages are hidden from
     * subsequent retrieve requests after being retrieved by a ReceiveMessage
     * request.
     */
    private Integer visibilityTimeout;

    /**
     * Default constructor for a new ReceiveMessageRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ReceiveMessageRequest() {}
    
    /**
     * Constructs a new ReceiveMessageRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl
     */
    public ReceiveMessageRequest(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * 
     *
     * @return 
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * 
     *
     * @param queueUrl 
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReceiveMessageRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    /**
     * A list of attributes to get.
     *
     * @return A list of attributes to get.
     */
    public java.util.List<String> getAttributeNames() {
        if (attributeNames == null) {
            attributeNames = new java.util.ArrayList<String>();
        }
        return attributeNames;
    }
    
    /**
     * A list of attributes to get.
     *
     * @param attributeNames A list of attributes to get.
     */
    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        java.util.List<String> attributeNamesCopy = new java.util.ArrayList<String>();
        if (attributeNames != null) {
            attributeNamesCopy.addAll(attributeNames);
        }
        this.attributeNames = attributeNamesCopy;
    }
    
    /**
     * A list of attributes to get.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNames A list of attributes to get.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReceiveMessageRequest withAttributeNames(String... attributeNames) {
        for (String value : attributeNames) {
            getAttributeNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of attributes to get.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNames A list of attributes to get.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReceiveMessageRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        java.util.List<String> attributeNamesCopy = new java.util.ArrayList<String>();
        if (attributeNames != null) {
            attributeNamesCopy.addAll(attributeNames);
        }
        this.attributeNames = attributeNamesCopy;

        return this;
    }
    
    /**
     * The maximum number of messages to return. Amazon SQS never returns
     * more messages than this value but may return fewer. <p> All of the
     * messages are not necessarily returned.
     *
     * @return The maximum number of messages to return. Amazon SQS never returns
     *         more messages than this value but may return fewer. <p> All of the
     *         messages are not necessarily returned.
     */
    public Integer getMaxNumberOfMessages() {
        return maxNumberOfMessages;
    }
    
    /**
     * The maximum number of messages to return. Amazon SQS never returns
     * more messages than this value but may return fewer. <p> All of the
     * messages are not necessarily returned.
     *
     * @param maxNumberOfMessages The maximum number of messages to return. Amazon SQS never returns
     *         more messages than this value but may return fewer. <p> All of the
     *         messages are not necessarily returned.
     */
    public void setMaxNumberOfMessages(Integer maxNumberOfMessages) {
        this.maxNumberOfMessages = maxNumberOfMessages;
    }
    
    /**
     * The maximum number of messages to return. Amazon SQS never returns
     * more messages than this value but may return fewer. <p> All of the
     * messages are not necessarily returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxNumberOfMessages The maximum number of messages to return. Amazon SQS never returns
     *         more messages than this value but may return fewer. <p> All of the
     *         messages are not necessarily returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReceiveMessageRequest withMaxNumberOfMessages(Integer maxNumberOfMessages) {
        this.maxNumberOfMessages = maxNumberOfMessages;
        return this;
    }
    
    
    /**
     * The duration (in seconds) that the received messages are hidden from
     * subsequent retrieve requests after being retrieved by a ReceiveMessage
     * request.
     *
     * @return The duration (in seconds) that the received messages are hidden from
     *         subsequent retrieve requests after being retrieved by a ReceiveMessage
     *         request.
     */
    public Integer getVisibilityTimeout() {
        return visibilityTimeout;
    }
    
    /**
     * The duration (in seconds) that the received messages are hidden from
     * subsequent retrieve requests after being retrieved by a ReceiveMessage
     * request.
     *
     * @param visibilityTimeout The duration (in seconds) that the received messages are hidden from
     *         subsequent retrieve requests after being retrieved by a ReceiveMessage
     *         request.
     */
    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }
    
    /**
     * The duration (in seconds) that the received messages are hidden from
     * subsequent retrieve requests after being retrieved by a ReceiveMessage
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param visibilityTimeout The duration (in seconds) that the received messages are hidden from
     *         subsequent retrieve requests after being retrieved by a ReceiveMessage
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReceiveMessageRequest withVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
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
        sb.append("QueueUrl: " + queueUrl + ", ");
        sb.append("AttributeNames: " + attributeNames + ", ");
        sb.append("MaxNumberOfMessages: " + maxNumberOfMessages + ", ");
        sb.append("VisibilityTimeout: " + visibilityTimeout + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    