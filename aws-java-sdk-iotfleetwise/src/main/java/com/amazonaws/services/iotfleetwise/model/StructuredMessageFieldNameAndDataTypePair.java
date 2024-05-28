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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a <code>StructureMessageName</code> to <code>DataType</code> map element.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/StructuredMessageFieldNameAndDataTypePair"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StructuredMessageFieldNameAndDataTypePair implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field name of the structured message. It determines how a data value is referenced in the target language.
     * </p>
     */
    private String fieldName;
    /**
     * <p>
     * The data type.
     * </p>
     */
    private StructuredMessage dataType;

    /**
     * <p>
     * The field name of the structured message. It determines how a data value is referenced in the target language.
     * </p>
     * 
     * @param fieldName
     *        The field name of the structured message. It determines how a data value is referenced in the target
     *        language.
     */

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * The field name of the structured message. It determines how a data value is referenced in the target language.
     * </p>
     * 
     * @return The field name of the structured message. It determines how a data value is referenced in the target
     *         language.
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * <p>
     * The field name of the structured message. It determines how a data value is referenced in the target language.
     * </p>
     * 
     * @param fieldName
     *        The field name of the structured message. It determines how a data value is referenced in the target
     *        language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StructuredMessageFieldNameAndDataTypePair withFieldName(String fieldName) {
        setFieldName(fieldName);
        return this;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @param dataType
     *        The data type.
     */

    public void setDataType(StructuredMessage dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @return The data type.
     */

    public StructuredMessage getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @param dataType
     *        The data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StructuredMessageFieldNameAndDataTypePair withDataType(StructuredMessage dataType) {
        setDataType(dataType);
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
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StructuredMessageFieldNameAndDataTypePair == false)
            return false;
        StructuredMessageFieldNameAndDataTypePair other = (StructuredMessageFieldNameAndDataTypePair) obj;
        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null && other.getFieldName().equals(this.getFieldName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        return hashCode;
    }

    @Override
    public StructuredMessageFieldNameAndDataTypePair clone() {
        try {
            return (StructuredMessageFieldNameAndDataTypePair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.StructuredMessageFieldNameAndDataTypePairMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
