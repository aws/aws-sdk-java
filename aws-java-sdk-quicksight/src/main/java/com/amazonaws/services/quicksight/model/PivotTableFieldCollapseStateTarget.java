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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The target of a pivot table field collapse state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTableFieldCollapseStateTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableFieldCollapseStateTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field ID of the pivot table that the collapse state needs to be set to.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * The data path of the pivot table's header. Used to set the collapse state.
     * </p>
     */
    private java.util.List<DataPathValue> fieldDataPathValues;

    /**
     * <p>
     * The field ID of the pivot table that the collapse state needs to be set to.
     * </p>
     * 
     * @param fieldId
     *        The field ID of the pivot table that the collapse state needs to be set to.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The field ID of the pivot table that the collapse state needs to be set to.
     * </p>
     * 
     * @return The field ID of the pivot table that the collapse state needs to be set to.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The field ID of the pivot table that the collapse state needs to be set to.
     * </p>
     * 
     * @param fieldId
     *        The field ID of the pivot table that the collapse state needs to be set to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableFieldCollapseStateTarget withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * The data path of the pivot table's header. Used to set the collapse state.
     * </p>
     * 
     * @return The data path of the pivot table's header. Used to set the collapse state.
     */

    public java.util.List<DataPathValue> getFieldDataPathValues() {
        return fieldDataPathValues;
    }

    /**
     * <p>
     * The data path of the pivot table's header. Used to set the collapse state.
     * </p>
     * 
     * @param fieldDataPathValues
     *        The data path of the pivot table's header. Used to set the collapse state.
     */

    public void setFieldDataPathValues(java.util.Collection<DataPathValue> fieldDataPathValues) {
        if (fieldDataPathValues == null) {
            this.fieldDataPathValues = null;
            return;
        }

        this.fieldDataPathValues = new java.util.ArrayList<DataPathValue>(fieldDataPathValues);
    }

    /**
     * <p>
     * The data path of the pivot table's header. Used to set the collapse state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldDataPathValues(java.util.Collection)} or {@link #withFieldDataPathValues(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param fieldDataPathValues
     *        The data path of the pivot table's header. Used to set the collapse state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableFieldCollapseStateTarget withFieldDataPathValues(DataPathValue... fieldDataPathValues) {
        if (this.fieldDataPathValues == null) {
            setFieldDataPathValues(new java.util.ArrayList<DataPathValue>(fieldDataPathValues.length));
        }
        for (DataPathValue ele : fieldDataPathValues) {
            this.fieldDataPathValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data path of the pivot table's header. Used to set the collapse state.
     * </p>
     * 
     * @param fieldDataPathValues
     *        The data path of the pivot table's header. Used to set the collapse state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableFieldCollapseStateTarget withFieldDataPathValues(java.util.Collection<DataPathValue> fieldDataPathValues) {
        setFieldDataPathValues(fieldDataPathValues);
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
        if (getFieldDataPathValues() != null)
            sb.append("FieldDataPathValues: ").append(getFieldDataPathValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PivotTableFieldCollapseStateTarget == false)
            return false;
        PivotTableFieldCollapseStateTarget other = (PivotTableFieldCollapseStateTarget) obj;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getFieldDataPathValues() == null ^ this.getFieldDataPathValues() == null)
            return false;
        if (other.getFieldDataPathValues() != null && other.getFieldDataPathValues().equals(this.getFieldDataPathValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        hashCode = prime * hashCode + ((getFieldDataPathValues() == null) ? 0 : getFieldDataPathValues().hashCode());
        return hashCode;
    }

    @Override
    public PivotTableFieldCollapseStateTarget clone() {
        try {
            return (PivotTableFieldCollapseStateTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTableFieldCollapseStateTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
