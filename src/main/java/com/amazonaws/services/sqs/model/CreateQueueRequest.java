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
public class CreateQueueRequest extends AmazonWebServiceRequest {

    /**
     * The name to use for the created queue.
     */
    private String queueName;

    /**
     * The visibility timeout (in seconds) to use for the created queue.
     */
    private Integer defaultVisibilityTimeout;

    /**
     * Default constructor for a new CreateQueueRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateQueueRequest() {}
    
    /**
     * Constructs a new CreateQueueRequest object and initializes the specified
     * object members.  Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueName The name to use for the created queue.
     */
    public CreateQueueRequest(String queueName) {
        this.queueName = queueName;
    }
    
    /**
     * The name to use for the created queue.
     *
     * @return The name to use for the created queue.
     */
    public String getQueueName() {
        return queueName;
    }
    
    /**
     * The name to use for the created queue.
     *
     * @param queueName The name to use for the created queue.
     */
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }
    
    /**
     * The name to use for the created queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueName The name to use for the created queue.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateQueueRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    
    
    /**
     * The visibility timeout (in seconds) to use for the created queue.
     *
     * @return The visibility timeout (in seconds) to use for the created queue.
     */
    public Integer getDefaultVisibilityTimeout() {
        return defaultVisibilityTimeout;
    }
    
    /**
     * The visibility timeout (in seconds) to use for the created queue.
     *
     * @param defaultVisibilityTimeout The visibility timeout (in seconds) to use for the created queue.
     */
    public void setDefaultVisibilityTimeout(Integer defaultVisibilityTimeout) {
        this.defaultVisibilityTimeout = defaultVisibilityTimeout;
    }
    
    /**
     * The visibility timeout (in seconds) to use for the created queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultVisibilityTimeout The visibility timeout (in seconds) to use for the created queue.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateQueueRequest withDefaultVisibilityTimeout(Integer defaultVisibilityTimeout) {
        this.defaultVisibilityTimeout = defaultVisibilityTimeout;
        return this;
    }
    
    
}
    