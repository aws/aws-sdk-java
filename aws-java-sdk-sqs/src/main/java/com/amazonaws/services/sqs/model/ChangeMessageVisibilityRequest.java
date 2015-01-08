/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#changeMessageVisibility(ChangeMessageVisibilityRequest) ChangeMessageVisibility operation}.
 * <p>
 * Changes the visibility timeout of a specified message in a queue to a
 * new value. The maximum allowed timeout value you can set the value to
 * is 12 hours. This means you can't extend the timeout of a message in
 * an existing queue to more than a total visibility timeout of 12 hours.
 * (For more information visibility timeout, see
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"> Visibility Timeout </a>
 * in the <i>Amazon SQS Developer Guide</i> .)
 * </p>
 * <p>
 * For example, let's say you have a message and its default message
 * visibility timeout is 30 minutes. You could call
 * <code>ChangeMessageVisiblity</code> with a value of two hours and the
 * effective timeout would be two hours and 30 minutes. When that time
 * comes near you could again extend the time out by calling
 * ChangeMessageVisiblity, but this time the maximum allowed timeout
 * would be 9 hours and 30 minutes.
 * </p>
 * <p>
 * <b>NOTE:</b> There is a 120,000 limit for the number of inflight
 * messages per queue. Messages are inflight after they have been
 * received from the queue by a consuming component, but have not yet
 * been deleted from the queue. If you reach the 120,000 limit, you will
 * receive an OverLimit error message from Amazon SQS. To help avoid
 * reaching the limit, you should delete the messages from the queue
 * after they have been processed. You can also increase the number of
 * queues you use to process the messages.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>If you attempt to set the VisibilityTimeout to an
 * amount more than the maximum time left, Amazon SQS returns an error.
 * It will not automatically recalculate and increase the timeout to the
 * maximum time remaining.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>Unlike with a queue, when you change the visibility
 * timeout for a specific message, that timeout value is applied
 * immediately but is not saved in memory for that message. If you don't
 * delete a message after it is received, the visibility timeout for the
 * message the next time it is received reverts to the original timeout
 * value, not the value you set with the ChangeMessageVisibility action.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#changeMessageVisibility(ChangeMessageVisibilityRequest)
 */
public class ChangeMessageVisibilityRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The URL of the Amazon SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * The receipt handle associated with the message whose visibility
     * timeout should be changed. This parameter is returned by the
     * <a>ReceiveMessage</a> action.
     */
    private String receiptHandle;

    /**
     * The new value (in seconds - from 0 to 43200 - maximum 12 hours) for
     * the message's visibility timeout.
     */
    private Integer visibilityTimeout;

    /**
     * Default constructor for a new ChangeMessageVisibilityRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ChangeMessageVisibilityRequest() {}
    
    /**
     * Constructs a new ChangeMessageVisibilityRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     * @param receiptHandle The receipt handle associated with the message
     * whose visibility timeout should be changed. This parameter is returned
     * by the <a>ReceiveMessage</a> action.
     * @param visibilityTimeout The new value (in seconds - from 0 to 43200 -
     * maximum 12 hours) for the message's visibility timeout.
     */
    public ChangeMessageVisibilityRequest(String queueUrl, String receiptHandle, Integer visibilityTimeout) {
        setQueueUrl(queueUrl);
        setReceiptHandle(receiptHandle);
        setVisibilityTimeout(visibilityTimeout);
    }

    /**
     * The URL of the Amazon SQS queue to take action on.
     *
     * @return The URL of the Amazon SQS queue to take action on.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * The URL of the Amazon SQS queue to take action on.
     *
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * The URL of the Amazon SQS queue to take action on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeMessageVisibilityRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * The receipt handle associated with the message whose visibility
     * timeout should be changed. This parameter is returned by the
     * <a>ReceiveMessage</a> action.
     *
     * @return The receipt handle associated with the message whose visibility
     *         timeout should be changed. This parameter is returned by the
     *         <a>ReceiveMessage</a> action.
     */
    public String getReceiptHandle() {
        return receiptHandle;
    }
    
    /**
     * The receipt handle associated with the message whose visibility
     * timeout should be changed. This parameter is returned by the
     * <a>ReceiveMessage</a> action.
     *
     * @param receiptHandle The receipt handle associated with the message whose visibility
     *         timeout should be changed. This parameter is returned by the
     *         <a>ReceiveMessage</a> action.
     */
    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }
    
    /**
     * The receipt handle associated with the message whose visibility
     * timeout should be changed. This parameter is returned by the
     * <a>ReceiveMessage</a> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param receiptHandle The receipt handle associated with the message whose visibility
     *         timeout should be changed. This parameter is returned by the
     *         <a>ReceiveMessage</a> action.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeMessageVisibilityRequest withReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }

    /**
     * The new value (in seconds - from 0 to 43200 - maximum 12 hours) for
     * the message's visibility timeout.
     *
     * @return The new value (in seconds - from 0 to 43200 - maximum 12 hours) for
     *         the message's visibility timeout.
     */
    public Integer getVisibilityTimeout() {
        return visibilityTimeout;
    }
    
    /**
     * The new value (in seconds - from 0 to 43200 - maximum 12 hours) for
     * the message's visibility timeout.
     *
     * @param visibilityTimeout The new value (in seconds - from 0 to 43200 - maximum 12 hours) for
     *         the message's visibility timeout.
     */
    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }
    
    /**
     * The new value (in seconds - from 0 to 43200 - maximum 12 hours) for
     * the message's visibility timeout.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param visibilityTimeout The new value (in seconds - from 0 to 43200 - maximum 12 hours) for
     *         the message's visibility timeout.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeMessageVisibilityRequest withVisibilityTimeout(Integer visibilityTimeout) {
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
        if (getQueueUrl() != null) sb.append("QueueUrl: " + getQueueUrl() + ",");
        if (getReceiptHandle() != null) sb.append("ReceiptHandle: " + getReceiptHandle() + ",");
        if (getVisibilityTimeout() != null) sb.append("VisibilityTimeout: " + getVisibilityTimeout() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode()); 
        hashCode = prime * hashCode + ((getReceiptHandle() == null) ? 0 : getReceiptHandle().hashCode()); 
        hashCode = prime * hashCode + ((getVisibilityTimeout() == null) ? 0 : getVisibilityTimeout().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChangeMessageVisibilityRequest == false) return false;
        ChangeMessageVisibilityRequest other = (ChangeMessageVisibilityRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        if (other.getReceiptHandle() == null ^ this.getReceiptHandle() == null) return false;
        if (other.getReceiptHandle() != null && other.getReceiptHandle().equals(this.getReceiptHandle()) == false) return false; 
        if (other.getVisibilityTimeout() == null ^ this.getVisibilityTimeout() == null) return false;
        if (other.getVisibilityTimeout() != null && other.getVisibilityTimeout().equals(this.getVisibilityTimeout()) == false) return false; 
        return true;
    }
    
}
    