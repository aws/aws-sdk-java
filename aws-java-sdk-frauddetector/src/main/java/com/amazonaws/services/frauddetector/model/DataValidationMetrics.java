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
 * The model training validation messages.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DataValidationMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataValidationMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file-specific model training validation messages.
     * </p>
     */
    private java.util.List<FileValidationMessage> fileLevelMessages;
    /**
     * <p>
     * The field-specific model training validation messages.
     * </p>
     */
    private java.util.List<FieldValidationMessage> fieldLevelMessages;

    /**
     * <p>
     * The file-specific model training validation messages.
     * </p>
     * 
     * @return The file-specific model training validation messages.
     */

    public java.util.List<FileValidationMessage> getFileLevelMessages() {
        return fileLevelMessages;
    }

    /**
     * <p>
     * The file-specific model training validation messages.
     * </p>
     * 
     * @param fileLevelMessages
     *        The file-specific model training validation messages.
     */

    public void setFileLevelMessages(java.util.Collection<FileValidationMessage> fileLevelMessages) {
        if (fileLevelMessages == null) {
            this.fileLevelMessages = null;
            return;
        }

        this.fileLevelMessages = new java.util.ArrayList<FileValidationMessage>(fileLevelMessages);
    }

    /**
     * <p>
     * The file-specific model training validation messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileLevelMessages(java.util.Collection)} or {@link #withFileLevelMessages(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param fileLevelMessages
     *        The file-specific model training validation messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValidationMetrics withFileLevelMessages(FileValidationMessage... fileLevelMessages) {
        if (this.fileLevelMessages == null) {
            setFileLevelMessages(new java.util.ArrayList<FileValidationMessage>(fileLevelMessages.length));
        }
        for (FileValidationMessage ele : fileLevelMessages) {
            this.fileLevelMessages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The file-specific model training validation messages.
     * </p>
     * 
     * @param fileLevelMessages
     *        The file-specific model training validation messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValidationMetrics withFileLevelMessages(java.util.Collection<FileValidationMessage> fileLevelMessages) {
        setFileLevelMessages(fileLevelMessages);
        return this;
    }

    /**
     * <p>
     * The field-specific model training validation messages.
     * </p>
     * 
     * @return The field-specific model training validation messages.
     */

    public java.util.List<FieldValidationMessage> getFieldLevelMessages() {
        return fieldLevelMessages;
    }

    /**
     * <p>
     * The field-specific model training validation messages.
     * </p>
     * 
     * @param fieldLevelMessages
     *        The field-specific model training validation messages.
     */

    public void setFieldLevelMessages(java.util.Collection<FieldValidationMessage> fieldLevelMessages) {
        if (fieldLevelMessages == null) {
            this.fieldLevelMessages = null;
            return;
        }

        this.fieldLevelMessages = new java.util.ArrayList<FieldValidationMessage>(fieldLevelMessages);
    }

    /**
     * <p>
     * The field-specific model training validation messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldLevelMessages(java.util.Collection)} or {@link #withFieldLevelMessages(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param fieldLevelMessages
     *        The field-specific model training validation messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValidationMetrics withFieldLevelMessages(FieldValidationMessage... fieldLevelMessages) {
        if (this.fieldLevelMessages == null) {
            setFieldLevelMessages(new java.util.ArrayList<FieldValidationMessage>(fieldLevelMessages.length));
        }
        for (FieldValidationMessage ele : fieldLevelMessages) {
            this.fieldLevelMessages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The field-specific model training validation messages.
     * </p>
     * 
     * @param fieldLevelMessages
     *        The field-specific model training validation messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataValidationMetrics withFieldLevelMessages(java.util.Collection<FieldValidationMessage> fieldLevelMessages) {
        setFieldLevelMessages(fieldLevelMessages);
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
        if (getFileLevelMessages() != null)
            sb.append("FileLevelMessages: ").append(getFileLevelMessages()).append(",");
        if (getFieldLevelMessages() != null)
            sb.append("FieldLevelMessages: ").append(getFieldLevelMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataValidationMetrics == false)
            return false;
        DataValidationMetrics other = (DataValidationMetrics) obj;
        if (other.getFileLevelMessages() == null ^ this.getFileLevelMessages() == null)
            return false;
        if (other.getFileLevelMessages() != null && other.getFileLevelMessages().equals(this.getFileLevelMessages()) == false)
            return false;
        if (other.getFieldLevelMessages() == null ^ this.getFieldLevelMessages() == null)
            return false;
        if (other.getFieldLevelMessages() != null && other.getFieldLevelMessages().equals(this.getFieldLevelMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileLevelMessages() == null) ? 0 : getFileLevelMessages().hashCode());
        hashCode = prime * hashCode + ((getFieldLevelMessages() == null) ? 0 : getFieldLevelMessages().hashCode());
        return hashCode;
    }

    @Override
    public DataValidationMetrics clone() {
        try {
            return (DataValidationMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.DataValidationMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
