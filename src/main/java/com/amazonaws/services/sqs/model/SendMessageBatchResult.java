/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 */
public class SendMessageBatchResult {

    /**
     * A list of <a>SendMessageBatchResultEntry</a>s.
     */
    private java.util.List<SendMessageBatchResultEntry> successful;

    /**
     * A list of <a>BatchResultErrorEntry</a>s with the error detail about
     * each message that could not be enqueued.
     */
    private java.util.List<BatchResultErrorEntry> failed;

    /**
     * A list of <a>SendMessageBatchResultEntry</a>s.
     *
     * @return A list of <a>SendMessageBatchResultEntry</a>s.
     */
    public java.util.List<SendMessageBatchResultEntry> getSuccessful() {
        
        if (successful == null) {
            successful = new java.util.ArrayList<SendMessageBatchResultEntry>();
        }
        return successful;
    }
    
    /**
     * A list of <a>SendMessageBatchResultEntry</a>s.
     *
     * @param successful A list of <a>SendMessageBatchResultEntry</a>s.
     */
    public void setSuccessful(java.util.Collection<SendMessageBatchResultEntry> successful) {
        java.util.List<SendMessageBatchResultEntry> successfulCopy = new java.util.ArrayList<SendMessageBatchResultEntry>();
        if (successful != null) {
            successfulCopy.addAll(successful);
        }
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
        if (getSuccessful() == null) setSuccessful(new java.util.ArrayList<SendMessageBatchResultEntry>());
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
        java.util.List<SendMessageBatchResultEntry> successfulCopy = new java.util.ArrayList<SendMessageBatchResultEntry>();
        if (successful != null) {
            successfulCopy.addAll(successful);
        }
        this.successful = successfulCopy;

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
            failed = new java.util.ArrayList<BatchResultErrorEntry>();
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
        java.util.List<BatchResultErrorEntry> failedCopy = new java.util.ArrayList<BatchResultErrorEntry>();
        if (failed != null) {
            failedCopy.addAll(failed);
        }
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
        if (getFailed() == null) setFailed(new java.util.ArrayList<BatchResultErrorEntry>());
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
        java.util.List<BatchResultErrorEntry> failedCopy = new java.util.ArrayList<BatchResultErrorEntry>();
        if (failed != null) {
            failedCopy.addAll(failed);
        }
        this.failed = failedCopy;

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
        sb.append("Successful: " + successful + ", ");
        sb.append("Failed: " + failed + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    