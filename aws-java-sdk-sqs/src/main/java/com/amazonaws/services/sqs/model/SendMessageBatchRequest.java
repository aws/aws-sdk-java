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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/SendMessageBatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendMessageBatchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The URL of the Amazon SQS queue to which batched messages are sent.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueUrl;
    /**
     * <p>
     * A list of <code> <a>SendMessageBatchRequestEntry</a> </code> items.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SendMessageBatchRequestEntry> entries;

    /**
     * Default constructor for SendMessageBatchRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public SendMessageBatchRequest() {
    }

    /**
     * Constructs a new SendMessageBatchRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to which batched messages are sent.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */
    public SendMessageBatchRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * Constructs a new SendMessageBatchRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to which batched messages are sent.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     * @param entries
     *        A list of <code> <a>SendMessageBatchRequestEntry</a> </code> items.
     */
    public SendMessageBatchRequest(String queueUrl, java.util.List<SendMessageBatchRequestEntry> entries) {
        setQueueUrl(queueUrl);
        setEntries(entries);
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to which batched messages are sent.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to which batched messages are sent.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */

    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to which batched messages are sent.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @return The URL of the Amazon SQS queue to which batched messages are sent.</p>
     *         <p>
     *         Queue URLs and names are case-sensitive.
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to which batched messages are sent.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to which batched messages are sent.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchRequest withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * A list of <code> <a>SendMessageBatchRequestEntry</a> </code> items.
     * </p>
     * 
     * @return A list of <code> <a>SendMessageBatchRequestEntry</a> </code> items.
     */

    public java.util.List<SendMessageBatchRequestEntry> getEntries() {
        if (entries == null) {
            entries = new com.amazonaws.internal.SdkInternalList<SendMessageBatchRequestEntry>();
        }
        return entries;
    }

    /**
     * <p>
     * A list of <code> <a>SendMessageBatchRequestEntry</a> </code> items.
     * </p>
     * 
     * @param entries
     *        A list of <code> <a>SendMessageBatchRequestEntry</a> </code> items.
     */

    public void setEntries(java.util.Collection<SendMessageBatchRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new com.amazonaws.internal.SdkInternalList<SendMessageBatchRequestEntry>(entries);
    }

    /**
     * <p>
     * A list of <code> <a>SendMessageBatchRequestEntry</a> </code> items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        A list of <code> <a>SendMessageBatchRequestEntry</a> </code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchRequest withEntries(SendMessageBatchRequestEntry... entries) {
        if (this.entries == null) {
            setEntries(new com.amazonaws.internal.SdkInternalList<SendMessageBatchRequestEntry>(entries.length));
        }
        for (SendMessageBatchRequestEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code> <a>SendMessageBatchRequestEntry</a> </code> items.
     * </p>
     * 
     * @param entries
     *        A list of <code> <a>SendMessageBatchRequestEntry</a> </code> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchRequest withEntries(java.util.Collection<SendMessageBatchRequestEntry> entries) {
        setEntries(entries);
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
        if (getQueueUrl() != null)
            sb.append("QueueUrl: ").append(getQueueUrl()).append(",");
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendMessageBatchRequest == false)
            return false;
        SendMessageBatchRequest other = (SendMessageBatchRequest) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public SendMessageBatchRequest clone() {
        return (SendMessageBatchRequest) super.clone();
    }

}
