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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * Provides a list of validation messages.
 * </p>
 */
public class ValidateConfigurationSettingsResult implements Serializable {

    /**
     * A list of <a>ValidationMessage</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ValidationMessage> messages;

    /**
     * A list of <a>ValidationMessage</a>.
     *
     * @return A list of <a>ValidationMessage</a>.
     */
    public java.util.List<ValidationMessage> getMessages() {
        if (messages == null) {
              messages = new com.amazonaws.internal.ListWithAutoConstructFlag<ValidationMessage>();
              messages.setAutoConstruct(true);
        }
        return messages;
    }
    
    /**
     * A list of <a>ValidationMessage</a>.
     *
     * @param messages A list of <a>ValidationMessage</a>.
     */
    public void setMessages(java.util.Collection<ValidationMessage> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ValidationMessage> messagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ValidationMessage>(messages.size());
        messagesCopy.addAll(messages);
        this.messages = messagesCopy;
    }
    
    /**
     * A list of <a>ValidationMessage</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messages A list of <a>ValidationMessage</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ValidateConfigurationSettingsResult withMessages(ValidationMessage... messages) {
        if (getMessages() == null) setMessages(new java.util.ArrayList<ValidationMessage>(messages.length));
        for (ValidationMessage value : messages) {
            getMessages().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>ValidationMessage</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messages A list of <a>ValidationMessage</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ValidateConfigurationSettingsResult withMessages(java.util.Collection<ValidationMessage> messages) {
        if (messages == null) {
            this.messages = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ValidationMessage> messagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ValidationMessage>(messages.size());
            messagesCopy.addAll(messages);
            this.messages = messagesCopy;
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
        if (getMessages() != null) sb.append("Messages: " + getMessages() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ValidateConfigurationSettingsResult == false) return false;
        ValidateConfigurationSettingsResult other = (ValidateConfigurationSettingsResult)obj;
        
        if (other.getMessages() == null ^ this.getMessages() == null) return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false) return false; 
        return true;
    }
    
}
    