/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This action replaces the email envelope recipients with the given list of recipients. If the condition of this action
 * applies only to a subset of recipients, only those recipients are replaced with the recipients specified in the
 * action. The message contents and headers are unaffected by this action, only the envelope recipients are updated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ReplaceRecipientAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceRecipientAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This action specifies the replacement recipient email addresses to insert.
     * </p>
     */
    private java.util.List<String> replaceWith;

    /**
     * <p>
     * This action specifies the replacement recipient email addresses to insert.
     * </p>
     * 
     * @return This action specifies the replacement recipient email addresses to insert.
     */

    public java.util.List<String> getReplaceWith() {
        return replaceWith;
    }

    /**
     * <p>
     * This action specifies the replacement recipient email addresses to insert.
     * </p>
     * 
     * @param replaceWith
     *        This action specifies the replacement recipient email addresses to insert.
     */

    public void setReplaceWith(java.util.Collection<String> replaceWith) {
        if (replaceWith == null) {
            this.replaceWith = null;
            return;
        }

        this.replaceWith = new java.util.ArrayList<String>(replaceWith);
    }

    /**
     * <p>
     * This action specifies the replacement recipient email addresses to insert.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplaceWith(java.util.Collection)} or {@link #withReplaceWith(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param replaceWith
     *        This action specifies the replacement recipient email addresses to insert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRecipientAction withReplaceWith(String... replaceWith) {
        if (this.replaceWith == null) {
            setReplaceWith(new java.util.ArrayList<String>(replaceWith.length));
        }
        for (String ele : replaceWith) {
            this.replaceWith.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This action specifies the replacement recipient email addresses to insert.
     * </p>
     * 
     * @param replaceWith
     *        This action specifies the replacement recipient email addresses to insert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRecipientAction withReplaceWith(java.util.Collection<String> replaceWith) {
        setReplaceWith(replaceWith);
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
        if (getReplaceWith() != null)
            sb.append("ReplaceWith: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceRecipientAction == false)
            return false;
        ReplaceRecipientAction other = (ReplaceRecipientAction) obj;
        if (other.getReplaceWith() == null ^ this.getReplaceWith() == null)
            return false;
        if (other.getReplaceWith() != null && other.getReplaceWith().equals(this.getReplaceWith()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplaceWith() == null) ? 0 : getReplaceWith().hashCode());
        return hashCode;
    }

    @Override
    public ReplaceRecipientAction clone() {
        try {
            return (ReplaceRecipientAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.ReplaceRecipientActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
