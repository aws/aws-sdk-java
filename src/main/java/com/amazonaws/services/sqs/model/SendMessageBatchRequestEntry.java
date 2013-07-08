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
 * Send Message Batch Request Entry
 */
public class SendMessageBatchRequestEntry  implements Serializable  {

    private String id;

    private String messageBody;

    private Integer delaySeconds;

    /**
     * Default constructor for a new SendMessageBatchRequestEntry object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SendMessageBatchRequestEntry() {}
    


    /**
     * Constructs a new SendMessageBatchRequestEntry object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id
     * @param messageBody
     */
    public SendMessageBatchRequestEntry(String id, String messageBody) {
        setId(id);
        setMessageBody(messageBody);
    }

    
    
    /**
     * Returns the value of the Id property for this object.
     *
     * @return The value of the Id property for this object.
     */
    public String getId() {
        return id;
    }
    
    /**
     * Sets the value of the Id property for this object.
     *
     * @param id The new value for the Id property for this object.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Sets the value of the Id property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The new value for the Id property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SendMessageBatchRequestEntry withId(String id) {
        this.id = id;
        return this;
    }
    
    
    /**
     * Returns the value of the MessageBody property for this object.
     *
     * @return The value of the MessageBody property for this object.
     */
    public String getMessageBody() {
        return messageBody;
    }
    
    /**
     * Sets the value of the MessageBody property for this object.
     *
     * @param messageBody The new value for the MessageBody property for this object.
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
    
    /**
     * Sets the value of the MessageBody property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageBody The new value for the MessageBody property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SendMessageBatchRequestEntry withMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }
    
    
    /**
     * Returns the value of the DelaySeconds property for this object.
     *
     * @return The value of the DelaySeconds property for this object.
     */
    public Integer getDelaySeconds() {
        return delaySeconds;
    }
    
    /**
     * Sets the value of the DelaySeconds property for this object.
     *
     * @param delaySeconds The new value for the DelaySeconds property for this object.
     */
    public void setDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
    }
    
    /**
     * Sets the value of the DelaySeconds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param delaySeconds The new value for the DelaySeconds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SendMessageBatchRequestEntry withDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getMessageBody() != null) sb.append("MessageBody: " + getMessageBody() + ",");
        if (getDelaySeconds() != null) sb.append("DelaySeconds: " + getDelaySeconds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode()); 
        hashCode = prime * hashCode + ((getDelaySeconds() == null) ? 0 : getDelaySeconds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SendMessageBatchRequestEntry == false) return false;
        SendMessageBatchRequestEntry other = (SendMessageBatchRequestEntry)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getMessageBody() == null ^ this.getMessageBody() == null) return false;
        if (other.getMessageBody() != null && other.getMessageBody().equals(this.getMessageBody()) == false) return false; 
        if (other.getDelaySeconds() == null ^ this.getDelaySeconds() == null) return false;
        if (other.getDelaySeconds() != null && other.getDelaySeconds().equals(this.getDelaySeconds()) == false) return false; 
        return true;
    }
    
}
    