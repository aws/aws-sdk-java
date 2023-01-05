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
 * An element within a grid layout.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GridLayoutElement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GridLayoutElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for an element within a grid layout.
     * </p>
     */
    private String elementId;
    /**
     * <p>
     * The type of element.
     * </p>
     */
    private String elementType;
    /**
     * <p>
     * The column index for the upper left corner of an element.
     * </p>
     */
    private Integer columnIndex;
    /**
     * <p>
     * The width of a grid element expressed as a number of grid columns.
     * </p>
     */
    private Integer columnSpan;
    /**
     * <p>
     * The row index for the upper left corner of an element.
     * </p>
     */
    private Integer rowIndex;
    /**
     * <p>
     * The height of a grid element expressed as a number of grid rows.
     * </p>
     */
    private Integer rowSpan;

    /**
     * <p>
     * A unique identifier for an element within a grid layout.
     * </p>
     * 
     * @param elementId
     *        A unique identifier for an element within a grid layout.
     */

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    /**
     * <p>
     * A unique identifier for an element within a grid layout.
     * </p>
     * 
     * @return A unique identifier for an element within a grid layout.
     */

    public String getElementId() {
        return this.elementId;
    }

    /**
     * <p>
     * A unique identifier for an element within a grid layout.
     * </p>
     * 
     * @param elementId
     *        A unique identifier for an element within a grid layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GridLayoutElement withElementId(String elementId) {
        setElementId(elementId);
        return this;
    }

    /**
     * <p>
     * The type of element.
     * </p>
     * 
     * @param elementType
     *        The type of element.
     * @see LayoutElementType
     */

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    /**
     * <p>
     * The type of element.
     * </p>
     * 
     * @return The type of element.
     * @see LayoutElementType
     */

    public String getElementType() {
        return this.elementType;
    }

    /**
     * <p>
     * The type of element.
     * </p>
     * 
     * @param elementType
     *        The type of element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LayoutElementType
     */

    public GridLayoutElement withElementType(String elementType) {
        setElementType(elementType);
        return this;
    }

    /**
     * <p>
     * The type of element.
     * </p>
     * 
     * @param elementType
     *        The type of element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LayoutElementType
     */

    public GridLayoutElement withElementType(LayoutElementType elementType) {
        this.elementType = elementType.toString();
        return this;
    }

    /**
     * <p>
     * The column index for the upper left corner of an element.
     * </p>
     * 
     * @param columnIndex
     *        The column index for the upper left corner of an element.
     */

    public void setColumnIndex(Integer columnIndex) {
        this.columnIndex = columnIndex;
    }

    /**
     * <p>
     * The column index for the upper left corner of an element.
     * </p>
     * 
     * @return The column index for the upper left corner of an element.
     */

    public Integer getColumnIndex() {
        return this.columnIndex;
    }

    /**
     * <p>
     * The column index for the upper left corner of an element.
     * </p>
     * 
     * @param columnIndex
     *        The column index for the upper left corner of an element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GridLayoutElement withColumnIndex(Integer columnIndex) {
        setColumnIndex(columnIndex);
        return this;
    }

    /**
     * <p>
     * The width of a grid element expressed as a number of grid columns.
     * </p>
     * 
     * @param columnSpan
     *        The width of a grid element expressed as a number of grid columns.
     */

    public void setColumnSpan(Integer columnSpan) {
        this.columnSpan = columnSpan;
    }

    /**
     * <p>
     * The width of a grid element expressed as a number of grid columns.
     * </p>
     * 
     * @return The width of a grid element expressed as a number of grid columns.
     */

    public Integer getColumnSpan() {
        return this.columnSpan;
    }

    /**
     * <p>
     * The width of a grid element expressed as a number of grid columns.
     * </p>
     * 
     * @param columnSpan
     *        The width of a grid element expressed as a number of grid columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GridLayoutElement withColumnSpan(Integer columnSpan) {
        setColumnSpan(columnSpan);
        return this;
    }

    /**
     * <p>
     * The row index for the upper left corner of an element.
     * </p>
     * 
     * @param rowIndex
     *        The row index for the upper left corner of an element.
     */

    public void setRowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
    }

    /**
     * <p>
     * The row index for the upper left corner of an element.
     * </p>
     * 
     * @return The row index for the upper left corner of an element.
     */

    public Integer getRowIndex() {
        return this.rowIndex;
    }

    /**
     * <p>
     * The row index for the upper left corner of an element.
     * </p>
     * 
     * @param rowIndex
     *        The row index for the upper left corner of an element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GridLayoutElement withRowIndex(Integer rowIndex) {
        setRowIndex(rowIndex);
        return this;
    }

    /**
     * <p>
     * The height of a grid element expressed as a number of grid rows.
     * </p>
     * 
     * @param rowSpan
     *        The height of a grid element expressed as a number of grid rows.
     */

    public void setRowSpan(Integer rowSpan) {
        this.rowSpan = rowSpan;
    }

    /**
     * <p>
     * The height of a grid element expressed as a number of grid rows.
     * </p>
     * 
     * @return The height of a grid element expressed as a number of grid rows.
     */

    public Integer getRowSpan() {
        return this.rowSpan;
    }

    /**
     * <p>
     * The height of a grid element expressed as a number of grid rows.
     * </p>
     * 
     * @param rowSpan
     *        The height of a grid element expressed as a number of grid rows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GridLayoutElement withRowSpan(Integer rowSpan) {
        setRowSpan(rowSpan);
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
        if (getElementId() != null)
            sb.append("ElementId: ").append(getElementId()).append(",");
        if (getElementType() != null)
            sb.append("ElementType: ").append(getElementType()).append(",");
        if (getColumnIndex() != null)
            sb.append("ColumnIndex: ").append(getColumnIndex()).append(",");
        if (getColumnSpan() != null)
            sb.append("ColumnSpan: ").append(getColumnSpan()).append(",");
        if (getRowIndex() != null)
            sb.append("RowIndex: ").append(getRowIndex()).append(",");
        if (getRowSpan() != null)
            sb.append("RowSpan: ").append(getRowSpan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GridLayoutElement == false)
            return false;
        GridLayoutElement other = (GridLayoutElement) obj;
        if (other.getElementId() == null ^ this.getElementId() == null)
            return false;
        if (other.getElementId() != null && other.getElementId().equals(this.getElementId()) == false)
            return false;
        if (other.getElementType() == null ^ this.getElementType() == null)
            return false;
        if (other.getElementType() != null && other.getElementType().equals(this.getElementType()) == false)
            return false;
        if (other.getColumnIndex() == null ^ this.getColumnIndex() == null)
            return false;
        if (other.getColumnIndex() != null && other.getColumnIndex().equals(this.getColumnIndex()) == false)
            return false;
        if (other.getColumnSpan() == null ^ this.getColumnSpan() == null)
            return false;
        if (other.getColumnSpan() != null && other.getColumnSpan().equals(this.getColumnSpan()) == false)
            return false;
        if (other.getRowIndex() == null ^ this.getRowIndex() == null)
            return false;
        if (other.getRowIndex() != null && other.getRowIndex().equals(this.getRowIndex()) == false)
            return false;
        if (other.getRowSpan() == null ^ this.getRowSpan() == null)
            return false;
        if (other.getRowSpan() != null && other.getRowSpan().equals(this.getRowSpan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElementId() == null) ? 0 : getElementId().hashCode());
        hashCode = prime * hashCode + ((getElementType() == null) ? 0 : getElementType().hashCode());
        hashCode = prime * hashCode + ((getColumnIndex() == null) ? 0 : getColumnIndex().hashCode());
        hashCode = prime * hashCode + ((getColumnSpan() == null) ? 0 : getColumnSpan().hashCode());
        hashCode = prime * hashCode + ((getRowIndex() == null) ? 0 : getRowIndex().hashCode());
        hashCode = prime * hashCode + ((getRowSpan() == null) ? 0 : getRowSpan().hashCode());
        return hashCode;
    }

    @Override
    public GridLayoutElement clone() {
        try {
            return (GridLayoutElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GridLayoutElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
