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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains attributes about a single row in a table
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/TableRow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableRow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The id of the row in the table.
     * </p>
     */
    private String rowId;
    /**
     * <p>
     * A list of cells in the table row. The cells appear in the same order as the columns of the table.
     * </p>
     */
    private java.util.List<Cell> cells;

    /**
     * <p>
     * The id of the row in the table.
     * </p>
     * 
     * @param rowId
     *        The id of the row in the table.
     */

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    /**
     * <p>
     * The id of the row in the table.
     * </p>
     * 
     * @return The id of the row in the table.
     */

    public String getRowId() {
        return this.rowId;
    }

    /**
     * <p>
     * The id of the row in the table.
     * </p>
     * 
     * @param rowId
     *        The id of the row in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRow withRowId(String rowId) {
        setRowId(rowId);
        return this;
    }

    /**
     * <p>
     * A list of cells in the table row. The cells appear in the same order as the columns of the table.
     * </p>
     * 
     * @return A list of cells in the table row. The cells appear in the same order as the columns of the table.
     */

    public java.util.List<Cell> getCells() {
        return cells;
    }

    /**
     * <p>
     * A list of cells in the table row. The cells appear in the same order as the columns of the table.
     * </p>
     * 
     * @param cells
     *        A list of cells in the table row. The cells appear in the same order as the columns of the table.
     */

    public void setCells(java.util.Collection<Cell> cells) {
        if (cells == null) {
            this.cells = null;
            return;
        }

        this.cells = new java.util.ArrayList<Cell>(cells);
    }

    /**
     * <p>
     * A list of cells in the table row. The cells appear in the same order as the columns of the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCells(java.util.Collection)} or {@link #withCells(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cells
     *        A list of cells in the table row. The cells appear in the same order as the columns of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRow withCells(Cell... cells) {
        if (this.cells == null) {
            setCells(new java.util.ArrayList<Cell>(cells.length));
        }
        for (Cell ele : cells) {
            this.cells.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cells in the table row. The cells appear in the same order as the columns of the table.
     * </p>
     * 
     * @param cells
     *        A list of cells in the table row. The cells appear in the same order as the columns of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRow withCells(java.util.Collection<Cell> cells) {
        setCells(cells);
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
        if (getRowId() != null)
            sb.append("RowId: ").append(getRowId()).append(",");
        if (getCells() != null)
            sb.append("Cells: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableRow == false)
            return false;
        TableRow other = (TableRow) obj;
        if (other.getRowId() == null ^ this.getRowId() == null)
            return false;
        if (other.getRowId() != null && other.getRowId().equals(this.getRowId()) == false)
            return false;
        if (other.getCells() == null ^ this.getCells() == null)
            return false;
        if (other.getCells() != null && other.getCells().equals(this.getCells()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRowId() == null) ? 0 : getRowId().hashCode());
        hashCode = prime * hashCode + ((getCells() == null) ? 0 : getCells().hashCode());
        return hashCode;
    }

    @Override
    public TableRow clone() {
        try {
            return (TableRow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.TableRowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
