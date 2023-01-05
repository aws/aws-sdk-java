/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of message attribute values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/MessageAttributeValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageAttributeValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The strings in a message attribute value.
     * </p>
     */
    private java.util.List<String> stringValues;

    /**
     * <p>
     * The strings in a message attribute value.
     * </p>
     * 
     * @return The strings in a message attribute value.
     */

    public java.util.List<String> getStringValues() {
        return stringValues;
    }

    /**
     * <p>
     * The strings in a message attribute value.
     * </p>
     * 
     * @param stringValues
     *        The strings in a message attribute value.
     */

    public void setStringValues(java.util.Collection<String> stringValues) {
        if (stringValues == null) {
            this.stringValues = null;
            return;
        }

        this.stringValues = new java.util.ArrayList<String>(stringValues);
    }

    /**
     * <p>
     * The strings in a message attribute value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringValues(java.util.Collection)} or {@link #withStringValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stringValues
     *        The strings in a message attribute value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageAttributeValue withStringValues(String... stringValues) {
        if (this.stringValues == null) {
            setStringValues(new java.util.ArrayList<String>(stringValues.length));
        }
        for (String ele : stringValues) {
            this.stringValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The strings in a message attribute value.
     * </p>
     * 
     * @param stringValues
     *        The strings in a message attribute value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageAttributeValue withStringValues(java.util.Collection<String> stringValues) {
        setStringValues(stringValues);
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
        if (getStringValues() != null)
            sb.append("StringValues: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageAttributeValue == false)
            return false;
        MessageAttributeValue other = (MessageAttributeValue) obj;
        if (other.getStringValues() == null ^ this.getStringValues() == null)
            return false;
        if (other.getStringValues() != null && other.getStringValues().equals(this.getStringValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringValues() == null) ? 0 : getStringValues().hashCode());
        return hashCode;
    }

    @Override
    public MessageAttributeValue clone() {
        try {
            return (MessageAttributeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.MessageAttributeValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
