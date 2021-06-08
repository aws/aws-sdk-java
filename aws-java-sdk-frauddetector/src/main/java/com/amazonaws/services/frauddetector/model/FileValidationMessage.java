/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The message details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/FileValidationMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileValidationMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The message title.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The message content.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The message type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The message title.
     * </p>
     * 
     * @param title
     *        The message title.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The message title.
     * </p>
     * 
     * @return The message title.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The message title.
     * </p>
     * 
     * @param title
     *        The message title.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileValidationMessage withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The message content.
     * </p>
     * 
     * @param content
     *        The message content.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The message content.
     * </p>
     * 
     * @return The message content.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The message content.
     * </p>
     * 
     * @param content
     *        The message content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileValidationMessage withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The message type.
     * </p>
     * 
     * @param type
     *        The message type.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The message type.
     * </p>
     * 
     * @return The message type.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The message type.
     * </p>
     * 
     * @param type
     *        The message type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileValidationMessage withType(String type) {
        setType(type);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileValidationMessage == false)
            return false;
        FileValidationMessage other = (FileValidationMessage) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public FileValidationMessage clone() {
        try {
            return (FileValidationMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.FileValidationMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
