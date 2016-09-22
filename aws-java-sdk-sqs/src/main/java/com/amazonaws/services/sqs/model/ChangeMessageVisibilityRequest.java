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
 * 
 */
public class ChangeMessageVisibilityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The receipt handle associated with the message whose visibility timeout should be changed. This parameter is
     * returned by the <a>ReceiveMessage</a> action.
     * </p>
     */
    private String receiptHandle;
    /**
     * <p>
     * The new value (in seconds - from 0 to 43200 - maximum 12 hours) for the message's visibility timeout.
     * </p>
     */
    private Integer visibilityTimeout;

    /**
     * Default constructor for ChangeMessageVisibilityRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ChangeMessageVisibilityRequest() {
    }

    /**
     * Constructs a new ChangeMessageVisibilityRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     * @param receiptHandle
     *        The receipt handle associated with the message whose visibility timeout should be changed. This parameter
     *        is returned by the <a>ReceiveMessage</a> action.
     * @param visibilityTimeout
     *        The new value (in seconds - from 0 to 43200 - maximum 12 hours) for the message's visibility timeout.
     */
    public ChangeMessageVisibilityRequest(String queueUrl, String receiptHandle, Integer visibilityTimeout) {
        setQueueUrl(queueUrl);
        setReceiptHandle(receiptHandle);
        setVisibilityTimeout(visibilityTimeout);
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

    public ChangeMessageVisibilityRequest withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * The receipt handle associated with the message whose visibility timeout should be changed. This parameter is
     * returned by the <a>ReceiveMessage</a> action.
     * </p>
     * 
     * @param receiptHandle
     *        The receipt handle associated with the message whose visibility timeout should be changed. This parameter
     *        is returned by the <a>ReceiveMessage</a> action.
     */

    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }

    /**
     * <p>
     * The receipt handle associated with the message whose visibility timeout should be changed. This parameter is
     * returned by the <a>ReceiveMessage</a> action.
     * </p>
     * 
     * @return The receipt handle associated with the message whose visibility timeout should be changed. This parameter
     *         is returned by the <a>ReceiveMessage</a> action.
     */

    public String getReceiptHandle() {
        return this.receiptHandle;
    }

    /**
     * <p>
     * The receipt handle associated with the message whose visibility timeout should be changed. This parameter is
     * returned by the <a>ReceiveMessage</a> action.
     * </p>
     * 
     * @param receiptHandle
     *        The receipt handle associated with the message whose visibility timeout should be changed. This parameter
     *        is returned by the <a>ReceiveMessage</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeMessageVisibilityRequest withReceiptHandle(String receiptHandle) {
        setReceiptHandle(receiptHandle);
        return this;
    }

    /**
     * <p>
     * The new value (in seconds - from 0 to 43200 - maximum 12 hours) for the message's visibility timeout.
     * </p>
     * 
     * @param visibilityTimeout
     *        The new value (in seconds - from 0 to 43200 - maximum 12 hours) for the message's visibility timeout.
     */

    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }

    /**
     * <p>
     * The new value (in seconds - from 0 to 43200 - maximum 12 hours) for the message's visibility timeout.
     * </p>
     * 
     * @return The new value (in seconds - from 0 to 43200 - maximum 12 hours) for the message's visibility timeout.
     */

    public Integer getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

    /**
     * <p>
     * The new value (in seconds - from 0 to 43200 - maximum 12 hours) for the message's visibility timeout.
     * </p>
     * 
     * @param visibilityTimeout
     *        The new value (in seconds - from 0 to 43200 - maximum 12 hours) for the message's visibility timeout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeMessageVisibilityRequest withVisibilityTimeout(Integer visibilityTimeout) {
        setVisibilityTimeout(visibilityTimeout);
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
        if (getReceiptHandle() != null)
            sb.append("ReceiptHandle: " + getReceiptHandle() + ",");
        if (getVisibilityTimeout() != null)
            sb.append("VisibilityTimeout: " + getVisibilityTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeMessageVisibilityRequest == false)
            return false;
        ChangeMessageVisibilityRequest other = (ChangeMessageVisibilityRequest) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getReceiptHandle() == null ^ this.getReceiptHandle() == null)
            return false;
        if (other.getReceiptHandle() != null && other.getReceiptHandle().equals(this.getReceiptHandle()) == false)
            return false;
        if (other.getVisibilityTimeout() == null ^ this.getVisibilityTimeout() == null)
            return false;
        if (other.getVisibilityTimeout() != null && other.getVisibilityTimeout().equals(this.getVisibilityTimeout()) == false)
            return false;
        return true;
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
    public ChangeMessageVisibilityRequest clone() {
        return (ChangeMessageVisibilityRequest) super.clone();
    }
}
