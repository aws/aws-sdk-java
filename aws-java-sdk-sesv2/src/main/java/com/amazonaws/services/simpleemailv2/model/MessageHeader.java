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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the name and value of a message header that you add to an email.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/MessageHeader" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageHeader implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the message header. The message header name has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can contain any printable ASCII character (33 - 126) except for colon (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can contain no more than 126 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The value of the message header. The message header value has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can contain any printable ASCII character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can contain no more than 870 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String value;

    /**
     * <p>
     * The name of the message header. The message header name has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can contain any printable ASCII character (33 - 126) except for colon (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can contain no more than 126 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the message header. The message header name has to meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can contain any printable ASCII character (33 - 126) except for colon (:).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can contain no more than 126 characters.
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the message header. The message header name has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can contain any printable ASCII character (33 - 126) except for colon (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can contain no more than 126 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the message header. The message header name has to meet the following criteria:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can contain any printable ASCII character (33 - 126) except for colon (:).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can contain no more than 126 characters.
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the message header. The message header name has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can contain any printable ASCII character (33 - 126) except for colon (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can contain no more than 126 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the message header. The message header name has to meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can contain any printable ASCII character (33 - 126) except for colon (:).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can contain no more than 126 characters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageHeader withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the message header. The message header value has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can contain any printable ASCII character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can contain no more than 870 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        The value of the message header. The message header value has to meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can contain any printable ASCII character.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can contain no more than 870 characters.
     *        </p>
     *        </li>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the message header. The message header value has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can contain any printable ASCII character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can contain no more than 870 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The value of the message header. The message header value has to meet the following criteria:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can contain any printable ASCII character.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can contain no more than 870 characters.
     *         </p>
     *         </li>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the message header. The message header value has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can contain any printable ASCII character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can contain no more than 870 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        The value of the message header. The message header value has to meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can contain any printable ASCII character.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can contain no more than 870 characters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageHeader withValue(String value) {
        setValue(value);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageHeader == false)
            return false;
        MessageHeader other = (MessageHeader) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public MessageHeader clone() {
        try {
            return (MessageHeader) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.MessageHeaderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
