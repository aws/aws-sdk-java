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
 * Message
 */
public class Message  implements Serializable  {

    private String messageId;

    private String receiptHandle;

    private String mD5OfBody;

    private String body;

    private java.util.Map<String,String> attributes;

    /**
     * Default constructor for a new Message object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Message() {}
    
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
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Message withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    
    
    /**
     * Returns the value of the ReceiptHandle property for this object.
     *
     * @return The value of the ReceiptHandle property for this object.
     */
    public String getReceiptHandle() {
        return receiptHandle;
    }
    
    /**
     * Sets the value of the ReceiptHandle property for this object.
     *
     * @param receiptHandle The new value for the ReceiptHandle property for this object.
     */
    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }
    
    /**
     * Sets the value of the ReceiptHandle property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param receiptHandle The new value for the ReceiptHandle property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Message withReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }
    
    
    /**
     * Returns the value of the MD5OfBody property for this object.
     *
     * @return The value of the MD5OfBody property for this object.
     */
    public String getMD5OfBody() {
        return mD5OfBody;
    }
    
    /**
     * Sets the value of the MD5OfBody property for this object.
     *
     * @param mD5OfBody The new value for the MD5OfBody property for this object.
     */
    public void setMD5OfBody(String mD5OfBody) {
        this.mD5OfBody = mD5OfBody;
    }
    
    /**
     * Sets the value of the MD5OfBody property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mD5OfBody The new value for the MD5OfBody property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Message withMD5OfBody(String mD5OfBody) {
        this.mD5OfBody = mD5OfBody;
        return this;
    }
    
    
    /**
     * Returns the value of the Body property for this object.
     *
     * @return The value of the Body property for this object.
     */
    public String getBody() {
        return body;
    }
    
    /**
     * Sets the value of the Body property for this object.
     *
     * @param body The new value for the Body property for this object.
     */
    public void setBody(String body) {
        this.body = body;
    }
    
    /**
     * Sets the value of the Body property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param body The new value for the Body property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Message withBody(String body) {
        this.body = body;
        return this;
    }
    
    
    /**
     * Returns the value of the Attributes property for this object.
     *
     * @return The value of the Attributes property for this object.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;

    }
    
    /**
     * Sets the value of the Attributes property for this object.
     *
     * @param attributes The new value for the Attributes property for this object.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * Sets the value of the Attributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The new value for the Attributes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Message withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
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
        if (getMessageId() != null) sb.append("MessageId: " + getMessageId() + ",");
        if (getReceiptHandle() != null) sb.append("ReceiptHandle: " + getReceiptHandle() + ",");
        if (getMD5OfBody() != null) sb.append("MD5OfBody: " + getMD5OfBody() + ",");
        if (getBody() != null) sb.append("Body: " + getBody() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode()); 
        hashCode = prime * hashCode + ((getReceiptHandle() == null) ? 0 : getReceiptHandle().hashCode()); 
        hashCode = prime * hashCode + ((getMD5OfBody() == null) ? 0 : getMD5OfBody().hashCode()); 
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Message == false) return false;
        Message other = (Message)obj;
        
        if (other.getMessageId() == null ^ this.getMessageId() == null) return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false) return false; 
        if (other.getReceiptHandle() == null ^ this.getReceiptHandle() == null) return false;
        if (other.getReceiptHandle() != null && other.getReceiptHandle().equals(this.getReceiptHandle()) == false) return false; 
        if (other.getMD5OfBody() == null ^ this.getMD5OfBody() == null) return false;
        if (other.getMD5OfBody() != null && other.getMD5OfBody().equals(this.getMD5OfBody()) == false) return false; 
        if (other.getBody() == null ^ this.getBody() == null) return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    