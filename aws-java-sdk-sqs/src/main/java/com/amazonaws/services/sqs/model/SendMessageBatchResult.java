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

/**
 * <p>
 * For each message in the batch, the response contains a <a>SendMessageBatchResultEntry</a> tag if the message succeeds
 * or a <a>BatchResultErrorEntry</a> tag if the message fails.
 * </p>
 */
public class SendMessageBatchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <a>SendMessageBatchResultEntry</a> items.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SendMessageBatchResultEntry> successful;
    /**
     * <p>
     * A list of <a>BatchResultErrorEntry</a> items with the error detail about each message that could not be enqueued.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BatchResultErrorEntry> failed;

    /**
     * <p>
     * A list of <a>SendMessageBatchResultEntry</a> items.
     * </p>
     * 
     * @return A list of <a>SendMessageBatchResultEntry</a> items.
     */

    public java.util.List<SendMessageBatchResultEntry> getSuccessful() {
        if (successful == null) {
            successful = new com.amazonaws.internal.SdkInternalList<SendMessageBatchResultEntry>();
        }
        return successful;
    }

    /**
     * <p>
     * A list of <a>SendMessageBatchResultEntry</a> items.
     * </p>
     * 
     * @param successful
     *        A list of <a>SendMessageBatchResultEntry</a> items.
     */

    public void setSuccessful(java.util.Collection<SendMessageBatchResultEntry> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new com.amazonaws.internal.SdkInternalList<SendMessageBatchResultEntry>(successful);
    }

    /**
     * <p>
     * A list of <a>SendMessageBatchResultEntry</a> items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessful(java.util.Collection)} or {@link #withSuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param successful
     *        A list of <a>SendMessageBatchResultEntry</a> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchResult withSuccessful(SendMessageBatchResultEntry... successful) {
        if (this.successful == null) {
            setSuccessful(new com.amazonaws.internal.SdkInternalList<SendMessageBatchResultEntry>(successful.length));
        }
        for (SendMessageBatchResultEntry ele : successful) {
            this.successful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>SendMessageBatchResultEntry</a> items.
     * </p>
     * 
     * @param successful
     *        A list of <a>SendMessageBatchResultEntry</a> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchResult withSuccessful(java.util.Collection<SendMessageBatchResultEntry> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>
     * A list of <a>BatchResultErrorEntry</a> items with the error detail about each message that could not be enqueued.
     * </p>
     * 
     * @return A list of <a>BatchResultErrorEntry</a> items with the error detail about each message that could not be
     *         enqueued.
     */

    public java.util.List<BatchResultErrorEntry> getFailed() {
        if (failed == null) {
            failed = new com.amazonaws.internal.SdkInternalList<BatchResultErrorEntry>();
        }
        return failed;
    }

    /**
     * <p>
     * A list of <a>BatchResultErrorEntry</a> items with the error detail about each message that could not be enqueued.
     * </p>
     * 
     * @param failed
     *        A list of <a>BatchResultErrorEntry</a> items with the error detail about each message that could not be
     *        enqueued.
     */

    public void setFailed(java.util.Collection<BatchResultErrorEntry> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }

        this.failed = new com.amazonaws.internal.SdkInternalList<BatchResultErrorEntry>(failed);
    }

    /**
     * <p>
     * A list of <a>BatchResultErrorEntry</a> items with the error detail about each message that could not be enqueued.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailed(java.util.Collection)} or {@link #withFailed(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param failed
     *        A list of <a>BatchResultErrorEntry</a> items with the error detail about each message that could not be
     *        enqueued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchResult withFailed(BatchResultErrorEntry... failed) {
        if (this.failed == null) {
            setFailed(new com.amazonaws.internal.SdkInternalList<BatchResultErrorEntry>(failed.length));
        }
        for (BatchResultErrorEntry ele : failed) {
            this.failed.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>BatchResultErrorEntry</a> items with the error detail about each message that could not be enqueued.
     * </p>
     * 
     * @param failed
     *        A list of <a>BatchResultErrorEntry</a> items with the error detail about each message that could not be
     *        enqueued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageBatchResult withFailed(java.util.Collection<BatchResultErrorEntry> failed) {
        setFailed(failed);
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
        if (getSuccessful() != null)
            sb.append("Successful: " + getSuccessful() + ",");
        if (getFailed() != null)
            sb.append("Failed: " + getFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendMessageBatchResult == false)
            return false;
        SendMessageBatchResult other = (SendMessageBatchResult) obj;
        if (other.getSuccessful() == null ^ this.getSuccessful() == null)
            return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        return hashCode;
    }

    @Override
    public SendMessageBatchResult clone() {
        try {
            return (SendMessageBatchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
