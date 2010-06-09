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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#createQueue(CreateQueueRequest) CreateQueue operation}.
 * <p>
 * The CreateQueue action creates a new queue, or returns the URL of an
 * existing one. When you request CreateQueue, you provide a name for the
 * queue. To successfully create a new queue, you must provide a name
 * that is unique within the scope of your own queues. If you provide the
 * name of an existing queue, a new queue isn't created and an error
 * isn't returned. Instead, the request succeeds and the queue URL for
 * the existing queue is returned.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> If you provide a value for DefaultVisibilityTimeout
 * that is different from the value for the existing queue, you receive
 * an error.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#createQueue(CreateQueueRequest)
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
        
        sb.append("QueueName: " + queueName + ", ");
        sb.append("DefaultVisibilityTimeout: " + defaultVisibilityTimeout + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    