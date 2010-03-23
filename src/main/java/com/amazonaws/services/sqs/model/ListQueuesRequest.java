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
 * <p>
 * 
 * </p>
 */
public class ListQueuesRequest extends AmazonWebServiceRequest {
        
    /**
     * A string to use for filtering the list results. Only those queues
     * whose name begins with the specified string are returned.
     */
    private String queueNamePrefix;

    /**
     * A string to use for filtering the list results. Only those queues
     * whose name begins with the specified string are returned.
     *
     * @return A string to use for filtering the list results. Only those queues
     *         whose name begins with the specified string are returned.
     */
    public String getQueueNamePrefix() {
        return queueNamePrefix;
    }
    
    /**
     * A string to use for filtering the list results. Only those queues
     * whose name begins with the specified string are returned.
     *
     * @param queueNamePrefix A string to use for filtering the list results. Only those queues
     *         whose name begins with the specified string are returned.
     */
    public void setQueueNamePrefix(String queueNamePrefix) {
        this.queueNamePrefix = queueNamePrefix;
    }
    
    /**
     * A string to use for filtering the list results. Only those queues
     * whose name begins with the specified string are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueNamePrefix A string to use for filtering the list results. Only those queues
     *         whose name begins with the specified string are returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListQueuesRequest withQueueNamePrefix(String queueNamePrefix) {
        this.queueNamePrefix = queueNamePrefix;
        return this;
    }
    
    
}
    