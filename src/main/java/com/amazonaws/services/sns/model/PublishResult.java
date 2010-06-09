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
package com.amazonaws.services.sns.model;

/**
 * Publish Result
 */
public class PublishResult {

    /**
     * Unique identifier assigned to the published message.
     */
    private String messageId;

    /**
     * Unique identifier assigned to the published message.
     *
     * @return Unique identifier assigned to the published message.
     */
    public String getMessageId() {
        return messageId;
    }
    
    /**
     * Unique identifier assigned to the published message.
     *
     * @param messageId Unique identifier assigned to the published message.
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    
    /**
     * Unique identifier assigned to the published message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageId Unique identifier assigned to the published message.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PublishResult withMessageId(String messageId) {
        this.messageId = messageId;
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
        sb.append("}");
        return sb.toString();
    }
    
}
    