/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The <code>TestRoleResponse</code> structure.
 * </p>
 */
@Deprecated
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestRoleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the operation is successful, this value is <code>true</code>; otherwise, the value is <code>false</code>.
     * </p>
     */
    private String success;
    /**
     * <p>
     * If the <code>Success</code> element contains <code>false</code>, this value is an array of one or more error
     * messages that were generated during the test process.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> messages;

    /**
     * <p>
     * If the operation is successful, this value is <code>true</code>; otherwise, the value is <code>false</code>.
     * </p>
     * 
     * @param success
     *        If the operation is successful, this value is <code>true</code>; otherwise, the value is
     *        <code>false</code>.
     */

    public void setSuccess(String success) {
        this.success = success;
    }

    /**
     * <p>
     * If the operation is successful, this value is <code>true</code>; otherwise, the value is <code>false</code>.
     * </p>
     * 
     * @return If the operation is successful, this value is <code>true</code>; otherwise, the value is
     *         <code>false</code>.
     */

    public String getSuccess() {
        return this.success;
    }

    /**
     * <p>
     * If the operation is successful, this value is <code>true</code>; otherwise, the value is <code>false</code>.
     * </p>
     * 
     * @param success
     *        If the operation is successful, this value is <code>true</code>; otherwise, the value is
     *        <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRoleResult withSuccess(String success) {
        setSuccess(success);
        return this;
    }

    /**
     * <p>
     * If the <code>Success</code> element contains <code>false</code>, this value is an array of one or more error
     * messages that were generated during the test process.
     * </p>
     * 
     * @return If the <code>Success</code> element contains <code>false</code>, this value is an array of one or more
     *         error messages that were generated during the test process.
     */

    public java.util.List<String> getMessages() {
        if (messages == null) {
            messages = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return messages;
    }

    /**
     * <p>
     * If the <code>Success</code> element contains <code>false</code>, this value is an array of one or more error
     * messages that were generated during the test process.
     * </p>
     * 
     * @param messages
     *        If the <code>Success</code> element contains <code>false</code>, this value is an array of one or more
     *        error messages that were generated during the test process.
     */

    public void setMessages(java.util.Collection<String> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new com.amazonaws.internal.SdkInternalList<String>(messages);
    }

    /**
     * <p>
     * If the <code>Success</code> element contains <code>false</code>, this value is an array of one or more error
     * messages that were generated during the test process.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        If the <code>Success</code> element contains <code>false</code>, this value is an array of one or more
     *        error messages that were generated during the test process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRoleResult withMessages(String... messages) {
        if (this.messages == null) {
            setMessages(new com.amazonaws.internal.SdkInternalList<String>(messages.length));
        }
        for (String ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the <code>Success</code> element contains <code>false</code>, this value is an array of one or more error
     * messages that were generated during the test process.
     * </p>
     * 
     * @param messages
     *        If the <code>Success</code> element contains <code>false</code>, this value is an array of one or more
     *        error messages that were generated during the test process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRoleResult withMessages(java.util.Collection<String> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSuccess() != null)
            sb.append("Success: ").append(getSuccess()).append(",");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestRoleResult == false)
            return false;
        TestRoleResult other = (TestRoleResult) obj;
        if (other.getSuccess() == null ^ this.getSuccess() == null)
            return false;
        if (other.getSuccess() != null && other.getSuccess().equals(this.getSuccess()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        return true;
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
    public TestRoleResult clone() {
        try {
            return (TestRoleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
