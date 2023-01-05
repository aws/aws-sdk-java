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
 * Conditional formatting options for a <code>PivotTableVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableConditionalFormattingOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableConditionalFormattingOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cell conditional formatting option for a table.
     * </p>
     */
    private TableCellConditionalFormatting cell;
    /**
     * <p>
     * The row conditional formatting option for a table.
     * </p>
     */
    private TableRowConditionalFormatting row;

    /**
     * <p>
     * The cell conditional formatting option for a table.
     * </p>
     * 
     * @param cell
     *        The cell conditional formatting option for a table.
     */

    public void setCell(TableCellConditionalFormatting cell) {
        this.cell = cell;
    }

    /**
     * <p>
     * The cell conditional formatting option for a table.
     * </p>
     * 
     * @return The cell conditional formatting option for a table.
     */

    public TableCellConditionalFormatting getCell() {
        return this.cell;
    }

    /**
     * <p>
     * The cell conditional formatting option for a table.
     * </p>
     * 
     * @param cell
     *        The cell conditional formatting option for a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableConditionalFormattingOption withCell(TableCellConditionalFormatting cell) {
        setCell(cell);
        return this;
    }

    /**
     * <p>
     * The row conditional formatting option for a table.
     * </p>
     * 
     * @param row
     *        The row conditional formatting option for a table.
     */

    public void setRow(TableRowConditionalFormatting row) {
        this.row = row;
    }

    /**
     * <p>
     * The row conditional formatting option for a table.
     * </p>
     * 
     * @return The row conditional formatting option for a table.
     */

    public TableRowConditionalFormatting getRow() {
        return this.row;
    }

    /**
     * <p>
     * The row conditional formatting option for a table.
     * </p>
     * 
     * @param row
     *        The row conditional formatting option for a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableConditionalFormattingOption withRow(TableRowConditionalFormatting row) {
        setRow(row);
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
        if (getCell() != null)
            sb.append("Cell: ").append(getCell()).append(",");
        if (getRow() != null)
            sb.append("Row: ").append(getRow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableConditionalFormattingOption == false)
            return false;
        TableConditionalFormattingOption other = (TableConditionalFormattingOption) obj;
        if (other.getCell() == null ^ this.getCell() == null)
            return false;
        if (other.getCell() != null && other.getCell().equals(this.getCell()) == false)
            return false;
        if (other.getRow() == null ^ this.getRow() == null)
            return false;
        if (other.getRow() != null && other.getRow().equals(this.getRow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCell() == null) ? 0 : getCell().hashCode());
        hashCode = prime * hashCode + ((getRow() == null) ? 0 : getRow().hashCode());
        return hashCode;
    }

    @Override
    public TableConditionalFormattingOption clone() {
        try {
            return (TableConditionalFormattingOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableConditionalFormattingOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
