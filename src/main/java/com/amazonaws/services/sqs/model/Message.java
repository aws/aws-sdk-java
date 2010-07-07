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

/**
 * <p>
 * 
 * </p>
 */
public class Message {

    /**
     * 
     */
    private String messageId;

    /**
     * 
     */
    private String receiptHandle;

    /**
     * 
     */
    private String mD5OfBody;

    /**
     * 
     */
    private String body;

    /**
     * 
     */
    private java.util.Map<String,String> attributes;

    /**
     * Default constructor for a new Message object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Message() {}
    
    /**
     * 
     *
     * @return 
     */
    public String getMessageId() {
        return messageId;
    }
    
    /**
     * 
     *
     * @param messageId 
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageId 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Message withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getReceiptHandle() {
        return receiptHandle;
    }
    
    /**
     * 
     *
     * @param receiptHandle 
     */
    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param receiptHandle 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Message withReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getMD5OfBody() {
        return mD5OfBody;
    }
    
    /**
     * 
     *
     * @param mD5OfBody 
     */
    public void setMD5OfBody(String mD5OfBody) {
        this.mD5OfBody = mD5OfBody;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mD5OfBody 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Message withMD5OfBody(String mD5OfBody) {
        this.mD5OfBody = mD5OfBody;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getBody() {
        return body;
    }
    
    /**
     * 
     *
     * @param body 
     */
    public void setBody(String body) {
        this.body = body;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param body 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Message withBody(String body) {
        this.body = body;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public java.util.Map<String,String> getAttributes() {
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * 
     *
     * @param attributes 
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes 
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
        sb.append("MessageId: " + messageId + ", ");
        sb.append("ReceiptHandle: " + receiptHandle + ", ");
        sb.append("MD5OfBody: " + mD5OfBody + ", ");
        sb.append("Body: " + body + ", ");
        sb.append("Attributes: " + attributes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    