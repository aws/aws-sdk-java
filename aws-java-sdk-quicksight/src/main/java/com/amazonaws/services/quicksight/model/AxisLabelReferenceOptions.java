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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The reference that specifies where the axis label is applied to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AxisLabelReferenceOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AxisLabelReferenceOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field that the axis label is targeted to.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * The column that the axis label is targeted to.
     * </p>
     */
    private ColumnIdentifier column;

    /**
     * <p>
     * The field that the axis label is targeted to.
     * </p>
     * 
     * @param fieldId
     *        The field that the axis label is targeted to.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The field that the axis label is targeted to.
     * </p>
     * 
     * @return The field that the axis label is targeted to.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The field that the axis label is targeted to.
     * </p>
     * 
     * @param fieldId
     *        The field that the axis label is targeted to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisLabelReferenceOptions withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * The column that the axis label is targeted to.
     * </p>
     * 
     * @param column
     *        The column that the axis label is targeted to.
     */

    public void setColumn(ColumnIdentifier column) {
        this.column = column;
    }

    /**
     * <p>
     * The column that the axis label is targeted to.
     * </p>
     * 
     * @return The column that the axis label is targeted to.
     */

    public ColumnIdentifier getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column that the axis label is targeted to.
     * </p>
     * 
     * @param column
     *        The column that the axis label is targeted to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisLabelReferenceOptions withColumn(ColumnIdentifier column) {
        setColumn(column);
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
        if (getFieldId() != null)
            sb.append("FieldId: ").append(getFieldId()).append(",");
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AxisLabelReferenceOptions == false)
            return false;
        AxisLabelReferenceOptions other = (AxisLabelReferenceOptions) obj;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        return hashCode;
    }

    @Override
    public AxisLabelReferenceOptions clone() {
        try {
            return (AxisLabelReferenceOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AxisLabelReferenceOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
