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
 * The table options for a table visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The orientation (vertical, horizontal) for a table.
     * </p>
     */
    private String orientation;
    /**
     * <p>
     * The table cell style of a table header.
     * </p>
     */
    private TableCellStyle headerStyle;
    /**
     * <p>
     * The table cell style of table cells.
     * </p>
     */
    private TableCellStyle cellStyle;
    /**
     * <p>
     * The row alternate color options (widget status, row alternate colors) for a table.
     * </p>
     */
    private RowAlternateColorOptions rowAlternateColorOptions;

    /**
     * <p>
     * The orientation (vertical, horizontal) for a table.
     * </p>
     * 
     * @param orientation
     *        The orientation (vertical, horizontal) for a table.
     * @see TableOrientation
     */

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    /**
     * <p>
     * The orientation (vertical, horizontal) for a table.
     * </p>
     * 
     * @return The orientation (vertical, horizontal) for a table.
     * @see TableOrientation
     */

    public String getOrientation() {
        return this.orientation;
    }

    /**
     * <p>
     * The orientation (vertical, horizontal) for a table.
     * </p>
     * 
     * @param orientation
     *        The orientation (vertical, horizontal) for a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableOrientation
     */

    public TableOptions withOrientation(String orientation) {
        setOrientation(orientation);
        return this;
    }

    /**
     * <p>
     * The orientation (vertical, horizontal) for a table.
     * </p>
     * 
     * @param orientation
     *        The orientation (vertical, horizontal) for a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableOrientation
     */

    public TableOptions withOrientation(TableOrientation orientation) {
        this.orientation = orientation.toString();
        return this;
    }

    /**
     * <p>
     * The table cell style of a table header.
     * </p>
     * 
     * @param headerStyle
     *        The table cell style of a table header.
     */

    public void setHeaderStyle(TableCellStyle headerStyle) {
        this.headerStyle = headerStyle;
    }

    /**
     * <p>
     * The table cell style of a table header.
     * </p>
     * 
     * @return The table cell style of a table header.
     */

    public TableCellStyle getHeaderStyle() {
        return this.headerStyle;
    }

    /**
     * <p>
     * The table cell style of a table header.
     * </p>
     * 
     * @param headerStyle
     *        The table cell style of a table header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableOptions withHeaderStyle(TableCellStyle headerStyle) {
        setHeaderStyle(headerStyle);
        return this;
    }

    /**
     * <p>
     * The table cell style of table cells.
     * </p>
     * 
     * @param cellStyle
     *        The table cell style of table cells.
     */

    public void setCellStyle(TableCellStyle cellStyle) {
        this.cellStyle = cellStyle;
    }

    /**
     * <p>
     * The table cell style of table cells.
     * </p>
     * 
     * @return The table cell style of table cells.
     */

    public TableCellStyle getCellStyle() {
        return this.cellStyle;
    }

    /**
     * <p>
     * The table cell style of table cells.
     * </p>
     * 
     * @param cellStyle
     *        The table cell style of table cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableOptions withCellStyle(TableCellStyle cellStyle) {
        setCellStyle(cellStyle);
        return this;
    }

    /**
     * <p>
     * The row alternate color options (widget status, row alternate colors) for a table.
     * </p>
     * 
     * @param rowAlternateColorOptions
     *        The row alternate color options (widget status, row alternate colors) for a table.
     */

    public void setRowAlternateColorOptions(RowAlternateColorOptions rowAlternateColorOptions) {
        this.rowAlternateColorOptions = rowAlternateColorOptions;
    }

    /**
     * <p>
     * The row alternate color options (widget status, row alternate colors) for a table.
     * </p>
     * 
     * @return The row alternate color options (widget status, row alternate colors) for a table.
     */

    public RowAlternateColorOptions getRowAlternateColorOptions() {
        return this.rowAlternateColorOptions;
    }

    /**
     * <p>
     * The row alternate color options (widget status, row alternate colors) for a table.
     * </p>
     * 
     * @param rowAlternateColorOptions
     *        The row alternate color options (widget status, row alternate colors) for a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableOptions withRowAlternateColorOptions(RowAlternateColorOptions rowAlternateColorOptions) {
        setRowAlternateColorOptions(rowAlternateColorOptions);
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
        if (getOrientation() != null)
            sb.append("Orientation: ").append(getOrientation()).append(",");
        if (getHeaderStyle() != null)
            sb.append("HeaderStyle: ").append(getHeaderStyle()).append(",");
        if (getCellStyle() != null)
            sb.append("CellStyle: ").append(getCellStyle()).append(",");
        if (getRowAlternateColorOptions() != null)
            sb.append("RowAlternateColorOptions: ").append(getRowAlternateColorOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableOptions == false)
            return false;
        TableOptions other = (TableOptions) obj;
        if (other.getOrientation() == null ^ this.getOrientation() == null)
            return false;
        if (other.getOrientation() != null && other.getOrientation().equals(this.getOrientation()) == false)
            return false;
        if (other.getHeaderStyle() == null ^ this.getHeaderStyle() == null)
            return false;
        if (other.getHeaderStyle() != null && other.getHeaderStyle().equals(this.getHeaderStyle()) == false)
            return false;
        if (other.getCellStyle() == null ^ this.getCellStyle() == null)
            return false;
        if (other.getCellStyle() != null && other.getCellStyle().equals(this.getCellStyle()) == false)
            return false;
        if (other.getRowAlternateColorOptions() == null ^ this.getRowAlternateColorOptions() == null)
            return false;
        if (other.getRowAlternateColorOptions() != null && other.getRowAlternateColorOptions().equals(this.getRowAlternateColorOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrientation() == null) ? 0 : getOrientation().hashCode());
        hashCode = prime * hashCode + ((getHeaderStyle() == null) ? 0 : getHeaderStyle().hashCode());
        hashCode = prime * hashCode + ((getCellStyle() == null) ? 0 : getCellStyle().hashCode());
        hashCode = prime * hashCode + ((getRowAlternateColorOptions() == null) ? 0 : getRowAlternateColorOptions().hashCode());
        return hashCode;
    }

    @Override
    public TableOptions clone() {
        try {
            return (TableOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
