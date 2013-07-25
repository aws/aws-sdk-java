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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#receiveMessage(ReceiveMessageRequest) ReceiveMessage operation}.
 * 
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#receiveMessage(ReceiveMessageRequest)
 */
public class ReceiveMessageRequest extends AmazonWebServiceRequest  implements Serializable  {

    private String queueUrl;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> attributeNames;

    private Integer maxNumberOfMessages;

    private Integer visibilityTimeout;

    private Integer waitTimeSeconds;

    /**
     * Default constructor for a new ReceiveMessageRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ReceiveMessageRequest() {}
    


    /**
     * Constructs a new ReceiveMessageRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl
     */
    public ReceiveMessageRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    
    
    /**
     * Returns the value of the QueueUrl property for this object.
     *
     * @return The value of the QueueUrl property for this object.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * Sets the value of the QueueUrl property for this object.
     *
     * @param queueUrl The new value for the QueueUrl property for this object.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * Sets the value of the QueueUrl property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The new value for the QueueUrl property for this object.
     */
    public ReceiveMessageRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    /**
     * Returns the value of the AttributeNames property for this object.
     *
     * @return The value of the AttributeNames property for this object.
     */
    public java.util.List<String> getAttributeNames() {
        
        if (attributeNames == null) {
              attributeNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              attributeNames.setAutoConstruct(true);
        }
        return attributeNames;
    }
    
    /**
     * Sets the value of the AttributeNames property for this object.
     *
     * @param attributeNames The new value for the AttributeNames property for this object.
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
     * Sets the value of the AttributeNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNames The new value for the AttributeNames property for this object.
     */
    public ReceiveMessageRequest withAttributeNames(String... attributeNames) {
        if (getAttributeNames() == null) setAttributeNames(new java.util.ArrayList<String>(attributeNames.length));
        for (String value : attributeNames) {
            getAttributeNames().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AttributeNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNames The new value for the AttributeNames property for this object.
     */
    public ReceiveMessageRequest withAttributeNames(java.util.Collection<String> attributeNames) {
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
     * Returns the value of the MaxNumberOfMessages property for this object.
     *
     * @return The value of the MaxNumberOfMessages property for this object.
     */
    public Integer getMaxNumberOfMessages() {
        return maxNumberOfMessages;
    }
    
    /**
     * Sets the value of the MaxNumberOfMessages property for this object.
     *
     * @param maxNumberOfMessages The new value for the MaxNumberOfMessages property for this object.
     */
    public void setMaxNumberOfMessages(Integer maxNumberOfMessages) {
        this.maxNumberOfMessages = maxNumberOfMessages;
    }
    
    /**
     * Sets the value of the MaxNumberOfMessages property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxNumberOfMessages The new value for the MaxNumberOfMessages property for this object.
     */
    public ReceiveMessageRequest withMaxNumberOfMessages(Integer maxNumberOfMessages) {
        this.maxNumberOfMessages = maxNumberOfMessages;
        return this;
    }
    
    
    /**
     * Returns the value of the VisibilityTimeout property for this object.
     *
     * @return The value of the VisibilityTimeout property for this object.
     */
    public Integer getVisibilityTimeout() {
        return visibilityTimeout;
    }
    
    /**
     * Sets the value of the VisibilityTimeout property for this object.
     *
     * @param visibilityTimeout The new value for the VisibilityTimeout property for this object.
     */
    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }
    
    /**
     * Sets the value of the VisibilityTimeout property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param visibilityTimeout The new value for the VisibilityTimeout property for this object.
     */
    public ReceiveMessageRequest withVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }
    
    
    /**
     * Returns the value of the WaitTimeSeconds property for this object.
     *
     * @return The value of the WaitTimeSeconds property for this object.
     */
    public Integer getWaitTimeSeconds() {
        return waitTimeSeconds;
    }
    
    /**
     * Sets the value of the WaitTimeSeconds property for this object.
     *
     * @param waitTimeSeconds The new value for the WaitTimeSeconds property for this object.
     */
    public void setWaitTimeSeconds(Integer waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
    }
    
    /**
     * Sets the value of the WaitTimeSeconds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param waitTimeSeconds The new value for the WaitTimeSeconds property for this object.
     */
    public ReceiveMessageRequest withWaitTimeSeconds(Integer waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
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
        if (getAttributeNames() != null) sb.append("AttributeNames: " + getAttributeNames() + ",");
        if (getMaxNumberOfMessages() != null) sb.append("MaxNumberOfMessages: " + getMaxNumberOfMessages() + ",");
        if (getVisibilityTimeout() != null) sb.append("VisibilityTimeout: " + getVisibilityTimeout() + ",");
        if (getWaitTimeSeconds() != null) sb.append("WaitTimeSeconds: " + getWaitTimeSeconds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode()); 
        hashCode = prime * hashCode + ((getMaxNumberOfMessages() == null) ? 0 : getMaxNumberOfMessages().hashCode()); 
        hashCode = prime * hashCode + ((getVisibilityTimeout() == null) ? 0 : getVisibilityTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getWaitTimeSeconds() == null) ? 0 : getWaitTimeSeconds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReceiveMessageRequest == false) return false;
        ReceiveMessageRequest other = (ReceiveMessageRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null) return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false) return false; 
        if (other.getMaxNumberOfMessages() == null ^ this.getMaxNumberOfMessages() == null) return false;
        if (other.getMaxNumberOfMessages() != null && other.getMaxNumberOfMessages().equals(this.getMaxNumberOfMessages()) == false) return false; 
        if (other.getVisibilityTimeout() == null ^ this.getVisibilityTimeout() == null) return false;
        if (other.getVisibilityTimeout() != null && other.getVisibilityTimeout().equals(this.getVisibilityTimeout()) == false) return false; 
        if (other.getWaitTimeSeconds() == null ^ this.getWaitTimeSeconds() == null) return false;
        if (other.getWaitTimeSeconds() != null && other.getWaitTimeSeconds().equals(this.getWaitTimeSeconds()) == false) return false; 
        return true;
    }
    
}
    