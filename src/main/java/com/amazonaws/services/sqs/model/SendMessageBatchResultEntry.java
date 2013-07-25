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
 * Send Message Batch Result Entry
 */
public class SendMessageBatchResultEntry  implements Serializable  {

    private String id;

    private String messageId;

    private String mD5OfMessageBody;

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
     */
    public SendMessageBatchResultEntry withId(String id) {
        this.id = id;
        return this;
    }
    
    
    /**
     * Returns the value of the MessageId property for this object.
     *
     * @return The value of the MessageId property for this object.
     */
    public String getMessageId() {
        return messageId;
    }
    
    /**
     * Sets the value of the MessageId property for this object.
     *
     * @param messageId The new value for the MessageId property for this object.
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    
    /**
     * Sets the value of the MessageId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageId The new value for the MessageId property for this object.
     */
    public SendMessageBatchResultEntry withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    
    
    /**
     * Returns the value of the MD5OfMessageBody property for this object.
     *
     * @return The value of the MD5OfMessageBody property for this object.
     */
    public String getMD5OfMessageBody() {
        return mD5OfMessageBody;
    }
    
    /**
     * Sets the value of the MD5OfMessageBody property for this object.
     *
     * @param mD5OfMessageBody The new value for the MD5OfMessageBody property for this object.
     */
    public void setMD5OfMessageBody(String mD5OfMessageBody) {
        this.mD5OfMessageBody = mD5OfMessageBody;
    }
    
    /**
     * Sets the value of the MD5OfMessageBody property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mD5OfMessageBody The new value for the MD5OfMessageBody property for this object.
     */
    public SendMessageBatchResultEntry withMD5OfMessageBody(String mD5OfMessageBody) {
        this.mD5OfMessageBody = mD5OfMessageBody;
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
        if (getMessageId() != null) sb.append("MessageId: " + getMessageId() + ",");
        if (getMD5OfMessageBody() != null) sb.append("MD5OfMessageBody: " + getMD5OfMessageBody() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode()); 
        hashCode = prime * hashCode + ((getMD5OfMessageBody() == null) ? 0 : getMD5OfMessageBody().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SendMessageBatchResultEntry == false) return false;
        SendMessageBatchResultEntry other = (SendMessageBatchResultEntry)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getMessageId() == null ^ this.getMessageId() == null) return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false) return false; 
        if (other.getMD5OfMessageBody() == null ^ this.getMD5OfMessageBody() == null) return false;
        if (other.getMD5OfMessageBody() != null && other.getMD5OfMessageBody().equals(this.getMD5OfMessageBody()) == false) return false; 
        return true;
    }
    
}
    