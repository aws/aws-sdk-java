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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#changeMessageVisibility(ChangeMessageVisibilityRequest) ChangeMessageVisibility operation}.
 * <p>
 * The ChangeMessageVisibility action changes the visibility timeout of
 * a specified message in a queue to a new value. The maximum allowed
 * timeout value you can set the value to is 12 hours. This means you
 * can't extend the timeout of a message in an existing queue to more
 * than a total visibility timeout of 12 hours. (For more information
 * visibility timeout, see Visibility Timeout in the Amazon SQS Developer
 * Guide.)
 * </p>
 * <p>
 * For example, let's say you have a message and its default message
 * visibility timeout is 30 minutes. You could call
 * ChangeMessageVisiblity with a value of two hours and the effective
 * timeout would be two hours and 30 minutes. When that time comes near
 * you could again extend the time out by calling ChangeMessageVisiblity,
 * but this time the maximum allowed timeout would be 9 hours and 30
 * minutes.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> If you attempt to set the VisibilityTimeout to an
 * amount more than the maximum time left, Amazon SQS returns an error.
 * It will not automatically recalculate and increase the timeout to the
 * maximum time remaining.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> Unlike with a queue, when you change the visibility
 * timeout for a specific message, that timeout value is applied
 * immediately but is not saved in memory for that message. If you don't
 * delete a message after it is received, the visibility timeout for the
 * message the next time it is received reverts to the original timeout
 * value, not the value you set with the ChangeMessageVisibility action.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#changeMessageVisibility(ChangeMessageVisibilityRequest)
 */
public class ChangeMessageVisibilityRequest extends AmazonWebServiceRequest {

    /**
     * 
     */
    private String queueUrl;

    /**
     * The receipt handle associated with the message whose visibility
     * timeout the client wants to change.
     */
    private String receiptHandle;

    /**
     * The new value (in seconds) for the message's visibility timeout.
     */
    private Integer visibilityTimeout;

    /**
     * Default constructor for a new ChangeMessageVisibilityRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ChangeMessageVisibilityRequest() {}
    
    /**
     * Constructs a new ChangeMessageVisibilityRequest object and initializes the specified
     * object members.  Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl
     * @param receiptHandle The receipt handle associated with the message
     * whose visibility timeout the client wants to change.
     * @param visibilityTimeout The new value (in seconds) for the message's
     * visibility timeout.
     */
    public ChangeMessageVisibilityRequest(String queueUrl, String receiptHandle, Integer visibilityTimeout) {
        this.queueUrl = queueUrl;
        this.receiptHandle = receiptHandle;
        this.visibilityTimeout = visibilityTimeout;
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
    public ChangeMessageVisibilityRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    /**
     * The receipt handle associated with the message whose visibility
     * timeout the client wants to change.
     *
     * @return The receipt handle associated with the message whose visibility
     *         timeout the client wants to change.
     */
    public String getReceiptHandle() {
        return receiptHandle;
    }
    
    /**
     * The receipt handle associated with the message whose visibility
     * timeout the client wants to change.
     *
     * @param receiptHandle The receipt handle associated with the message whose visibility
     *         timeout the client wants to change.
     */
    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }
    
    /**
     * The receipt handle associated with the message whose visibility
     * timeout the client wants to change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param receiptHandle The receipt handle associated with the message whose visibility
     *         timeout the client wants to change.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ChangeMessageVisibilityRequest withReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }
    
    
    /**
     * The new value (in seconds) for the message's visibility timeout.
     *
     * @return The new value (in seconds) for the message's visibility timeout.
     */
    public Integer getVisibilityTimeout() {
        return visibilityTimeout;
    }
    
    /**
     * The new value (in seconds) for the message's visibility timeout.
     *
     * @param visibilityTimeout The new value (in seconds) for the message's visibility timeout.
     */
    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }
    
    /**
     * The new value (in seconds) for the message's visibility timeout.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param visibilityTimeout The new value (in seconds) for the message's visibility timeout.
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
        
        sb.append("QueueUrl: " + queueUrl + ", ");
        sb.append("ReceiptHandle: " + receiptHandle + ", ");
        sb.append("VisibilityTimeout: " + visibilityTimeout + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    