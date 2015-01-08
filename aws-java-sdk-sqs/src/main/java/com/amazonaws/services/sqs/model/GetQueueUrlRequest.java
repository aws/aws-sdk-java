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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#getQueueUrl(GetQueueUrlRequest) GetQueueUrl operation}.
 * <p>
 * Returns the URL of an existing queue. This action provides a simple
 * way to retrieve the URL of an Amazon SQS queue.
 * </p>
 * <p>
 * To access a queue that belongs to another AWS account, use the
 * <code>QueueOwnerAWSAccountId</code> parameter to specify the account
 * ID of the queue's owner. The queue's owner must grant you permission
 * to access the queue. For more information about shared queue access,
 * see AddPermission or go to
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"> Shared Queues </a>
 * in the <i>Amazon SQS Developer Guide</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#getQueueUrl(GetQueueUrlRequest)
 */
public class GetQueueUrlRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the queue whose URL must be fetched. Maximum 80
     * characters; alphanumeric characters, hyphens (-), and underscores (_)
     * are allowed.
     */
    private String queueName;

    /**
     * The AWS account ID of the account that created the queue.
     */
    private String queueOwnerAWSAccountId;

    /**
     * Default constructor for a new GetQueueUrlRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetQueueUrlRequest() {}
    
    /**
     * Constructs a new GetQueueUrlRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueName The name of the queue whose URL must be fetched.
     * Maximum 80 characters; alphanumeric characters, hyphens (-), and
     * underscores (_) are allowed.
     */
    public GetQueueUrlRequest(String queueName) {
        setQueueName(queueName);
    }

    /**
     * The name of the queue whose URL must be fetched. Maximum 80
     * characters; alphanumeric characters, hyphens (-), and underscores (_)
     * are allowed.
     *
     * @return The name of the queue whose URL must be fetched. Maximum 80
     *         characters; alphanumeric characters, hyphens (-), and underscores (_)
     *         are allowed.
     */
    public String getQueueName() {
        return queueName;
    }
    
    /**
     * The name of the queue whose URL must be fetched. Maximum 80
     * characters; alphanumeric characters, hyphens (-), and underscores (_)
     * are allowed.
     *
     * @param queueName The name of the queue whose URL must be fetched. Maximum 80
     *         characters; alphanumeric characters, hyphens (-), and underscores (_)
     *         are allowed.
     */
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }
    
    /**
     * The name of the queue whose URL must be fetched. Maximum 80
     * characters; alphanumeric characters, hyphens (-), and underscores (_)
     * are allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueName The name of the queue whose URL must be fetched. Maximum 80
     *         characters; alphanumeric characters, hyphens (-), and underscores (_)
     *         are allowed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetQueueUrlRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * The AWS account ID of the account that created the queue.
     *
     * @return The AWS account ID of the account that created the queue.
     */
    public String getQueueOwnerAWSAccountId() {
        return queueOwnerAWSAccountId;
    }
    
    /**
     * The AWS account ID of the account that created the queue.
     *
     * @param queueOwnerAWSAccountId The AWS account ID of the account that created the queue.
     */
    public void setQueueOwnerAWSAccountId(String queueOwnerAWSAccountId) {
        this.queueOwnerAWSAccountId = queueOwnerAWSAccountId;
    }
    
    /**
     * The AWS account ID of the account that created the queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueOwnerAWSAccountId The AWS account ID of the account that created the queue.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetQueueUrlRequest withQueueOwnerAWSAccountId(String queueOwnerAWSAccountId) {
        this.queueOwnerAWSAccountId = queueOwnerAWSAccountId;
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
        if (getQueueName() != null) sb.append("QueueName: " + getQueueName() + ",");
        if (getQueueOwnerAWSAccountId() != null) sb.append("QueueOwnerAWSAccountId: " + getQueueOwnerAWSAccountId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueName() == null) ? 0 : getQueueName().hashCode()); 
        hashCode = prime * hashCode + ((getQueueOwnerAWSAccountId() == null) ? 0 : getQueueOwnerAWSAccountId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetQueueUrlRequest == false) return false;
        GetQueueUrlRequest other = (GetQueueUrlRequest)obj;
        
        if (other.getQueueName() == null ^ this.getQueueName() == null) return false;
        if (other.getQueueName() != null && other.getQueueName().equals(this.getQueueName()) == false) return false; 
        if (other.getQueueOwnerAWSAccountId() == null ^ this.getQueueOwnerAWSAccountId() == null) return false;
        if (other.getQueueOwnerAWSAccountId() != null && other.getQueueOwnerAWSAccountId().equals(this.getQueueOwnerAWSAccountId()) == false) return false; 
        return true;
    }
    
}
    