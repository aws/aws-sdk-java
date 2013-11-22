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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#getQueueAttributes(GetQueueAttributesRequest) GetQueueAttributes operation}.
 * <p>
 * Gets attributes for the specified queue. The following attributes are supported:
 * <ul>
 * <li> <code>All</code> - returns all values.</li>
 * <li> <code>ApproximateNumberOfMessages</code> - returns the approximate number of visible messages in a queue. For more information, see Resources
 * Required to Process Messages in the Amazon SQS Developer Guide.</li>
 * <li> <code>ApproximateNumberOfMessagesNotVisible</code> - returns the approximate number of messages that are not timed-out and not deleted. For more
 * information, see Resources Required to Process Messages in the Amazon SQS Developer Guide.</li>
 * <li> <code>VisibilityTimeout</code> - returns the visibility timeout for the queue. For more information about visibility timeout, see Visibility
 * Timeout in the Amazon SQS Developer Guide.</li>
 * <li> <code>CreatedTimestamp</code> - returns the time when the queue was created (epoch time in seconds).</li>
 * <li> <code>LastModifiedTimestamp</code> - returns the time when the queue was last changed (epoch time in seconds).</li>
 * <li> <code>Policy</code> - returns the queue's policy.</li>
 * <li> <code>MaximumMessageSize</code> - returns the limit of how many bytes a message can contain before Amazon SQS rejects it.</li>
 * <li> <code>MessageRetentionPeriod</code> - returns the number of seconds Amazon SQS retains a message.</li>
 * <li> <code>QueueArn</code> - returns the queue's Amazon resource name (ARN).</li>
 * <li> <code>ApproximateNumberOfMessagesDelayed</code> - returns the approximate number of messages that are pending to be added to the queue.</li>
 * <li> <code>DelaySeconds</code> - returns the default delay on the queue in seconds.</li>
 * <li> <code>ReceiveMessageWaitTimeSeconds</code> - returns the time for which a ReceiveMessage call will wait for a message to arrive.</li>
 * 
 * </ul>
 * 
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#getQueueAttributes(GetQueueAttributesRequest)
 */
public class GetQueueAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The URL of the SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * A list of attributes to retrieve information for.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> attributeNames;

    /**
     * Default constructor for a new GetQueueAttributesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetQueueAttributesRequest() {}
    
    /**
     * Constructs a new GetQueueAttributesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the SQS queue to take action on.
     */
    public GetQueueAttributesRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * Constructs a new GetQueueAttributesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the SQS queue to take action on.
     * @param attributeNames A list of attributes to retrieve information
     * for.
     */
    public GetQueueAttributesRequest(String queueUrl, java.util.List<String> attributeNames) {
        setQueueUrl(queueUrl);
        setAttributeNames(attributeNames);
    }

    /**
     * The URL of the SQS queue to take action on.
     *
     * @return The URL of the SQS queue to take action on.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * The URL of the SQS queue to take action on.
     *
     * @param queueUrl The URL of the SQS queue to take action on.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * The URL of the SQS queue to take action on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The URL of the SQS queue to take action on.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetQueueAttributesRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * A list of attributes to retrieve information for.
     *
     * @return A list of attributes to retrieve information for.
     */
    public java.util.List<String> getAttributeNames() {
        if (attributeNames == null) {
              attributeNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              attributeNames.setAutoConstruct(true);
        }
        return attributeNames;
    }
    
    /**
     * A list of attributes to retrieve information for.
     *
     * @param attributeNames A list of attributes to retrieve information for.
     */
    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> attributeNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(attributeNames.size());
        attributeNamesCopy.addAll(attributeNames);
        this.attributeNames = attributeNamesCopy;
    }
    
    /**
     * A list of attributes to retrieve information for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNames A list of attributes to retrieve information for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetQueueAttributesRequest withAttributeNames(String... attributeNames) {
        if (getAttributeNames() == null) setAttributeNames(new java.util.ArrayList<String>(attributeNames.length));
        for (String value : attributeNames) {
            getAttributeNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of attributes to retrieve information for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNames A list of attributes to retrieve information for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetQueueAttributesRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> attributeNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(attributeNames.size());
            attributeNamesCopy.addAll(attributeNames);
            this.attributeNames = attributeNamesCopy;
        }

        return this;
    }

    /**
     * A list of attributes to retrieve information for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNames A list of attributes to retrieve information for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetQueueAttributesRequest withAttributeNames(QueueAttributeName... attributeNames) {
        java.util.ArrayList<String> attributeNamesCopy = new java.util.ArrayList<String>(attributeNames.length);
        for (QueueAttributeName member : attributeNames) {
            attributeNamesCopy.add(member.toString());
        }
        if (getAttributeNames() == null) {
            setAttributeNames(attributeNamesCopy);
        } else {
            getAttributeNames().addAll(attributeNamesCopy);
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
        if (getQueueUrl() != null) sb.append("QueueUrl: " + getQueueUrl() + ",");
        if (getAttributeNames() != null) sb.append("AttributeNames: " + getAttributeNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetQueueAttributesRequest == false) return false;
        GetQueueAttributesRequest other = (GetQueueAttributesRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null) return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false) return false; 
        return true;
    }
    
}
    