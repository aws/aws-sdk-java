/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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


/**
 * 
 */
public class SendMessageBatchResult implements Serializable {

    /**
     * A list of <a>SendMessageBatchResultEntry</a>s.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SendMessageBatchResultEntry> successful;

    /**
     * A list of <a>BatchResultErrorEntry</a>s with the error detail about
     * each message that could not be enqueued.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry> failed;

    /**
     * A list of <a>SendMessageBatchResultEntry</a>s.
     *
     * @return A list of <a>SendMessageBatchResultEntry</a>s.
     */
    public java.util.List<SendMessageBatchResultEntry> getSuccessful() {
        if (successful == null) {
              successful = new com.amazonaws.internal.ListWithAutoConstructFlag<SendMessageBatchResultEntry>();
              successful.setAutoConstruct(true);
        }
        return successful;
    }
    
    /**
     * A list of <a>SendMessageBatchResultEntry</a>s.
     *
     * @param successful A list of <a>SendMessageBatchResultEntry</a>s.
     */
    public void setSuccessful(java.util.Collection<SendMessageBatchResultEntry> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SendMessageBatchResultEntry> successfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SendMessageBatchResultEntry>(successful.size());
        successfulCopy.addAll(successful);
        this.successful = successfulCopy;
    }
    
    /**
     * A list of <a>SendMessageBatchResultEntry</a>s.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successful A list of <a>SendMessageBatchResultEntry</a>s.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendMessageBatchResult withSuccessful(SendMessageBatchResultEntry... successful) {
        if (getSuccessful() == null) setSuccessful(new java.util.ArrayList<SendMessageBatchResultEntry>(successful.length));
        for (SendMessageBatchResultEntry value : successful) {
            getSuccessful().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>SendMessageBatchResultEntry</a>s.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successful A list of <a>SendMessageBatchResultEntry</a>s.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendMessageBatchResult withSuccessful(java.util.Collection<SendMessageBatchResultEntry> successful) {
        if (successful == null) {
            this.successful = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SendMessageBatchResultEntry> successfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SendMessageBatchResultEntry>(successful.size());
            successfulCopy.addAll(successful);
            this.successful = successfulCopy;
        }

        return this;
    }

    /**
     * A list of <a>BatchResultErrorEntry</a>s with the error detail about
     * each message that could not be enqueued.
     *
     * @return A list of <a>BatchResultErrorEntry</a>s with the error detail about
     *         each message that could not be enqueued.
     */
    public java.util.List<BatchResultErrorEntry> getFailed() {
        if (failed == null) {
              failed = new com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry>();
              failed.setAutoConstruct(true);
        }
        return failed;
    }
    
    /**
     * A list of <a>BatchResultErrorEntry</a>s with the error detail about
     * each message that could not be enqueued.
     *
     * @param failed A list of <a>BatchResultErrorEntry</a>s with the error detail about
     *         each message that could not be enqueued.
     */
    public void setFailed(java.util.Collection<BatchResultErrorEntry> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry> failedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry>(failed.size());
        failedCopy.addAll(failed);
        this.failed = failedCopy;
    }
    
    /**
     * A list of <a>BatchResultErrorEntry</a>s with the error detail about
     * each message that could not be enqueued.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failed A list of <a>BatchResultErrorEntry</a>s with the error detail about
     *         each message that could not be enqueued.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendMessageBatchResult withFailed(BatchResultErrorEntry... failed) {
        if (getFailed() == null) setFailed(new java.util.ArrayList<BatchResultErrorEntry>(failed.length));
        for (BatchResultErrorEntry value : failed) {
            getFailed().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>BatchResultErrorEntry</a>s with the error detail about
     * each message that could not be enqueued.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failed A list of <a>BatchResultErrorEntry</a>s with the error detail about
     *         each message that could not be enqueued.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendMessageBatchResult withFailed(java.util.Collection<BatchResultErrorEntry> failed) {
        if (failed == null) {
            this.failed = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry> failedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry>(failed.size());
            failedCopy.addAll(failed);
            this.failed = failedCopy;
        }

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
        if (getSuccessful() != null) sb.append("Successful: " + getSuccessful() + ",");
        if (getFailed() != null) sb.append("Failed: " + getFailed() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SendMessageBatchResult == false) return false;
        SendMessageBatchResult other = (SendMessageBatchResult)obj;
        
        if (other.getSuccessful() == null ^ this.getSuccessful() == null) return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false) return false; 
        if (other.getFailed() == null ^ this.getFailed() == null) return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false) return false; 
        return true;
    }
    
}
    