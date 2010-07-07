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

/**
 * <p>
 * 
 * </p>
 */
public class ListQueuesResult {

    /**
     * A list of queue URLs for queues. The response can contain up to 1000
     * QueueUrl elements.
     */
    private java.util.List<String> queueUrls;

    /**
     * A list of queue URLs for queues. The response can contain up to 1000
     * QueueUrl elements.
     *
     * @return A list of queue URLs for queues. The response can contain up to 1000
     *         QueueUrl elements.
     */
    public java.util.List<String> getQueueUrls() {
        if (queueUrls == null) {
            queueUrls = new java.util.ArrayList<String>();
        }
        return queueUrls;
    }
    
    /**
     * A list of queue URLs for queues. The response can contain up to 1000
     * QueueUrl elements.
     *
     * @param queueUrls A list of queue URLs for queues. The response can contain up to 1000
     *         QueueUrl elements.
     */
    public void setQueueUrls(java.util.Collection<String> queueUrls) {
        java.util.List<String> queueUrlsCopy = new java.util.ArrayList<String>();
        if (queueUrls != null) {
            queueUrlsCopy.addAll(queueUrls);
        }
        this.queueUrls = queueUrlsCopy;
    }
    
    /**
     * A list of queue URLs for queues. The response can contain up to 1000
     * QueueUrl elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrls A list of queue URLs for queues. The response can contain up to 1000
     *         QueueUrl elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListQueuesResult withQueueUrls(String... queueUrls) {
        for (String value : queueUrls) {
            getQueueUrls().add(value);
        }
        return this;
    }
    
    /**
     * A list of queue URLs for queues. The response can contain up to 1000
     * QueueUrl elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrls A list of queue URLs for queues. The response can contain up to 1000
     *         QueueUrl elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListQueuesResult withQueueUrls(java.util.Collection<String> queueUrls) {
        java.util.List<String> queueUrlsCopy = new java.util.ArrayList<String>();
        if (queueUrls != null) {
            queueUrlsCopy.addAll(queueUrls);
        }
        this.queueUrls = queueUrlsCopy;

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
        sb.append("QueueUrls: " + queueUrls + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    