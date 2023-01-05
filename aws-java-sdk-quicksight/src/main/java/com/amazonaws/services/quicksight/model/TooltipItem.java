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
 * The tooltip.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TooltipItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TooltipItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tooltip item for the fields.
     * </p>
     */
    private FieldTooltipItem fieldTooltipItem;
    /**
     * <p>
     * The tooltip item for the columns that are not part of a field well.
     * </p>
     */
    private ColumnTooltipItem columnTooltipItem;

    /**
     * <p>
     * The tooltip item for the fields.
     * </p>
     * 
     * @param fieldTooltipItem
     *        The tooltip item for the fields.
     */

    public void setFieldTooltipItem(FieldTooltipItem fieldTooltipItem) {
        this.fieldTooltipItem = fieldTooltipItem;
    }

    /**
     * <p>
     * The tooltip item for the fields.
     * </p>
     * 
     * @return The tooltip item for the fields.
     */

    public FieldTooltipItem getFieldTooltipItem() {
        return this.fieldTooltipItem;
    }

    /**
     * <p>
     * The tooltip item for the fields.
     * </p>
     * 
     * @param fieldTooltipItem
     *        The tooltip item for the fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TooltipItem withFieldTooltipItem(FieldTooltipItem fieldTooltipItem) {
        setFieldTooltipItem(fieldTooltipItem);
        return this;
    }

    /**
     * <p>
     * The tooltip item for the columns that are not part of a field well.
     * </p>
     * 
     * @param columnTooltipItem
     *        The tooltip item for the columns that are not part of a field well.
     */

    public void setColumnTooltipItem(ColumnTooltipItem columnTooltipItem) {
        this.columnTooltipItem = columnTooltipItem;
    }

    /**
     * <p>
     * The tooltip item for the columns that are not part of a field well.
     * </p>
     * 
     * @return The tooltip item for the columns that are not part of a field well.
     */

    public ColumnTooltipItem getColumnTooltipItem() {
        return this.columnTooltipItem;
    }

    /**
     * <p>
     * The tooltip item for the columns that are not part of a field well.
     * </p>
     * 
     * @param columnTooltipItem
     *        The tooltip item for the columns that are not part of a field well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TooltipItem withColumnTooltipItem(ColumnTooltipItem columnTooltipItem) {
        setColumnTooltipItem(columnTooltipItem);
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
        if (getFieldTooltipItem() != null)
            sb.append("FieldTooltipItem: ").append(getFieldTooltipItem()).append(",");
        if (getColumnTooltipItem() != null)
            sb.append("ColumnTooltipItem: ").append(getColumnTooltipItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TooltipItem == false)
            return false;
        TooltipItem other = (TooltipItem) obj;
        if (other.getFieldTooltipItem() == null ^ this.getFieldTooltipItem() == null)
            return false;
        if (other.getFieldTooltipItem() != null && other.getFieldTooltipItem().equals(this.getFieldTooltipItem()) == false)
            return false;
        if (other.getColumnTooltipItem() == null ^ this.getColumnTooltipItem() == null)
            return false;
        if (other.getColumnTooltipItem() != null && other.getColumnTooltipItem().equals(this.getColumnTooltipItem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldTooltipItem() == null) ? 0 : getFieldTooltipItem().hashCode());
        hashCode = prime * hashCode + ((getColumnTooltipItem() == null) ? 0 : getColumnTooltipItem().hashCode());
        return hashCode;
    }

    @Override
    public TooltipItem clone() {
        try {
            return (TooltipItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TooltipItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
