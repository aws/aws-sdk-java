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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the content of the email, and optionally a character set specification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/Content" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Content implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The content of the message itself.
     * </p>
     */
    private String data;
    /**
     * <p>
     * The character set for the content. Because of the constraints of the SMTP protocol, Amazon Pinpoint uses 7-bit
     * ASCII by default. If the text includes characters outside of the ASCII range, you have to specify a character
     * set. For example, you could specify <code>UTF-8</code>, <code>ISO-8859-1</code>, or <code>Shift_JIS</code>.
     * </p>
     */
    private String charset;

    /**
     * <p>
     * The content of the message itself.
     * </p>
     * 
     * @param data
     *        The content of the message itself.
     */

    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * The content of the message itself.
     * </p>
     * 
     * @return The content of the message itself.
     */

    public String getData() {
        return this.data;
    }

    /**
     * <p>
     * The content of the message itself.
     * </p>
     * 
     * @param data
     *        The content of the message itself.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Content withData(String data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The character set for the content. Because of the constraints of the SMTP protocol, Amazon Pinpoint uses 7-bit
     * ASCII by default. If the text includes characters outside of the ASCII range, you have to specify a character
     * set. For example, you could specify <code>UTF-8</code>, <code>ISO-8859-1</code>, or <code>Shift_JIS</code>.
     * </p>
     * 
     * @param charset
     *        The character set for the content. Because of the constraints of the SMTP protocol, Amazon Pinpoint uses
     *        7-bit ASCII by default. If the text includes characters outside of the ASCII range, you have to specify a
     *        character set. For example, you could specify <code>UTF-8</code>, <code>ISO-8859-1</code>, or
     *        <code>Shift_JIS</code>.
     */

    public void setCharset(String charset) {
        this.charset = charset;
    }

    /**
     * <p>
     * The character set for the content. Because of the constraints of the SMTP protocol, Amazon Pinpoint uses 7-bit
     * ASCII by default. If the text includes characters outside of the ASCII range, you have to specify a character
     * set. For example, you could specify <code>UTF-8</code>, <code>ISO-8859-1</code>, or <code>Shift_JIS</code>.
     * </p>
     * 
     * @return The character set for the content. Because of the constraints of the SMTP protocol, Amazon Pinpoint uses
     *         7-bit ASCII by default. If the text includes characters outside of the ASCII range, you have to specify a
     *         character set. For example, you could specify <code>UTF-8</code>, <code>ISO-8859-1</code>, or
     *         <code>Shift_JIS</code>.
     */

    public String getCharset() {
        return this.charset;
    }

    /**
     * <p>
     * The character set for the content. Because of the constraints of the SMTP protocol, Amazon Pinpoint uses 7-bit
     * ASCII by default. If the text includes characters outside of the ASCII range, you have to specify a character
     * set. For example, you could specify <code>UTF-8</code>, <code>ISO-8859-1</code>, or <code>Shift_JIS</code>.
     * </p>
     * 
     * @param charset
     *        The character set for the content. Because of the constraints of the SMTP protocol, Amazon Pinpoint uses
     *        7-bit ASCII by default. If the text includes characters outside of the ASCII range, you have to specify a
     *        character set. For example, you could specify <code>UTF-8</code>, <code>ISO-8859-1</code>, or
     *        <code>Shift_JIS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Content withCharset(String charset) {
        setCharset(charset);
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
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getCharset() != null)
            sb.append("Charset: ").append(getCharset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Content == false)
            return false;
        Content other = (Content) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getCharset() == null ^ this.getCharset() == null)
            return false;
        if (other.getCharset() != null && other.getCharset().equals(this.getCharset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getCharset() == null) ? 0 : getCharset().hashCode());
        return hashCode;
    }

    @Override
    public Content clone() {
        try {
            return (Content) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.ContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
