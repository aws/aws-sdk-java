/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#deleteQueue(DeleteQueueRequest) DeleteQueue operation}.
 * <p>
 * Deletes the queue specified by the <b>queue URL</b> , regardless of
 * whether the queue is empty. If the specified queue does not exist,
 * Amazon SQS returns a successful response.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> Use DeleteQueue with care; once you delete your
 * queue, any messages in the queue are no longer available.
 * </p>
 * <p>
 * When you delete a queue, the deletion process takes up to 60 seconds.
 * Requests you send involving that queue during the 60 seconds might
 * succeed. For example, a SendMessage request might succeed, but after
 * the 60 seconds, the queue and that message you sent no longer exist.
 * Also, when you delete a queue, you must wait at least 60 seconds
 * before creating a queue with the same name.
 * </p>
 * <p>
 * We reserve the right to delete queues that have had no activity for
 * more than 30 days. For more information, see
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSConcepts.html"> How Amazon SQS Queues Work </a>
 * in the <i>Amazon SQS Developer Guide</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#deleteQueue(DeleteQueueRequest)
 */
public class DeleteQueueRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The URL of the Amazon SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * Default constructor for a new DeleteQueueRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteQueueRequest() {}
    
    /**
     * Constructs a new DeleteQueueRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     */
    public DeleteQueueRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * The URL of the Amazon SQS queue to take action on.
     *
     * @return The URL of the Amazon SQS queue to take action on.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * The URL of the Amazon SQS queue to take action on.
     *
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * The URL of the Amazon SQS queue to take action on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteQueueRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
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
        if (getQueueUrl() != null) sb.append("QueueUrl: " + getQueueUrl() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteQueueRequest == false) return false;
        DeleteQueueRequest other = (DeleteQueueRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        return true;
    }
    
}
    