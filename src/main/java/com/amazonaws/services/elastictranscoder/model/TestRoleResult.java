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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;


/**
 * <p>
 * The <code>TestRoleResponse</code> structure.
 * </p>
 */
public class TestRoleResult implements Serializable {

    /**
     * If the operation is successful, this value is <code>true</code>;
     * otherwise, the value is <code>false</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     */
    private String success;

    /**
     * If the <code>Success</code> element contains <code>false</code>, this
     * value is an array of one or more error messages that were generated
     * during the test process.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> messages;

    /**
     * If the operation is successful, this value is <code>true</code>;
     * otherwise, the value is <code>false</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     *
     * @return If the operation is successful, this value is <code>true</code>;
     *         otherwise, the value is <code>false</code>.
     */
    public String getSuccess() {
        return success;
    }
    
    /**
     * If the operation is successful, this value is <code>true</code>;
     * otherwise, the value is <code>false</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     *
     * @param success If the operation is successful, this value is <code>true</code>;
     *         otherwise, the value is <code>false</code>.
     */
    public void setSuccess(String success) {
        this.success = success;
    }
    
    /**
     * If the operation is successful, this value is <code>true</code>;
     * otherwise, the value is <code>false</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     *
     * @param success If the operation is successful, this value is <code>true</code>;
     *         otherwise, the value is <code>false</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TestRoleResult withSuccess(String success) {
        this.success = success;
        return this;
    }

    /**
     * If the <code>Success</code> element contains <code>false</code>, this
     * value is an array of one or more error messages that were generated
     * during the test process.
     *
     * @return If the <code>Success</code> element contains <code>false</code>, this
     *         value is an array of one or more error messages that were generated
     *         during the test process.
     */
    public java.util.List<String> getMessages() {
        if (messages == null) {
              messages = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              messages.setAutoConstruct(true);
        }
        return messages;
    }
    
    /**
     * If the <code>Success</code> element contains <code>false</code>, this
     * value is an array of one or more error messages that were generated
     * during the test process.
     *
     * @param messages If the <code>Success</code> element contains <code>false</code>, this
     *         value is an array of one or more error messages that were generated
     *         during the test process.
     */
    public void setMessages(java.util.Collection<String> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> messagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(messages.size());
        messagesCopy.addAll(messages);
        this.messages = messagesCopy;
    }
    
    /**
     * If the <code>Success</code> element contains <code>false</code>, this
     * value is an array of one or more error messages that were generated
     * during the test process.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messages If the <code>Success</code> element contains <code>false</code>, this
     *         value is an array of one or more error messages that were generated
     *         during the test process.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TestRoleResult withMessages(String... messages) {
        if (getMessages() == null) setMessages(new java.util.ArrayList<String>(messages.length));
        for (String value : messages) {
            getMessages().add(value);
        }
        return this;
    }
    
    /**
     * If the <code>Success</code> element contains <code>false</code>, this
     * value is an array of one or more error messages that were generated
     * during the test process.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messages If the <code>Success</code> element contains <code>false</code>, this
     *         value is an array of one or more error messages that were generated
     *         during the test process.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TestRoleResult withMessages(java.util.Collection<String> messages) {
        if (messages == null) {
            this.messages = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> messagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(messages.size());
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
        if (getSuccess() != null) sb.append("Success: " + getSuccess() + ",");
        if (getMessages() != null) sb.append("Messages: " + getMessages() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSuccess() == null) ? 0 : getSuccess().hashCode()); 
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TestRoleResult == false) return false;
        TestRoleResult other = (TestRoleResult)obj;
        
        if (other.getSuccess() == null ^ this.getSuccess() == null) return false;
        if (other.getSuccess() != null && other.getSuccess().equals(this.getSuccess()) == false) return false; 
        if (other.getMessages() == null ^ this.getMessages() == null) return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false) return false; 
        return true;
    }
    
}
    