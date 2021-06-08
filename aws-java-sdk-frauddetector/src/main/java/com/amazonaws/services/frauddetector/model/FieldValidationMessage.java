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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/FieldValidationMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldValidationMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field name.
     * </p>
     */
    private String fieldName;
    /**
     * <p>
     * The message ID.
     * </p>
     */
    private String identifier;
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
     * The field name.
     * </p>
     * 
     * @param fieldName
     *        The field name.
     */

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * The field name.
     * </p>
     * 
     * @return The field name.
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * <p>
     * The field name.
     * </p>
     * 
     * @param fieldName
     *        The field name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValidationMessage withFieldName(String fieldName) {
        setFieldName(fieldName);
        return this;
    }

    /**
     * <p>
     * The message ID.
     * </p>
     * 
     * @param identifier
     *        The message ID.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The message ID.
     * </p>
     * 
     * @return The message ID.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The message ID.
     * </p>
     * 
     * @param identifier
     *        The message ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValidationMessage withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

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

    public FieldValidationMessage withTitle(String title) {
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

    public FieldValidationMessage withContent(String content) {
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

    public FieldValidationMessage withType(String type) {
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
        if (getFieldName() != null)
            sb.append("FieldName: ").append(getFieldName()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
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

        if (obj instanceof FieldValidationMessage == false)
            return false;
        FieldValidationMessage other = (FieldValidationMessage) obj;
        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null && other.getFieldName().equals(this.getFieldName()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public FieldValidationMessage clone() {
        try {
            return (FieldValidationMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.FieldValidationMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
