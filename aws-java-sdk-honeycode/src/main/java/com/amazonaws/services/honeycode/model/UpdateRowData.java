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
 * Data needed to create a single row in a table as part of the BatchCreateTableRows request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/UpdateRowData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRowData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The id of the row that needs to be updated.
     * </p>
     */
    private String rowId;
    /**
     * <p>
     * A map representing the cells to update in the given row. The key is the column id of the cell and the value is
     * the CellInput object that represents the data to set in that cell.
     * </p>
     */
    private java.util.Map<String, CellInput> cellsToUpdate;

    /**
     * <p>
     * The id of the row that needs to be updated.
     * </p>
     * 
     * @param rowId
     *        The id of the row that needs to be updated.
     */

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    /**
     * <p>
     * The id of the row that needs to be updated.
     * </p>
     * 
     * @return The id of the row that needs to be updated.
     */

    public String getRowId() {
        return this.rowId;
    }

    /**
     * <p>
     * The id of the row that needs to be updated.
     * </p>
     * 
     * @param rowId
     *        The id of the row that needs to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRowData withRowId(String rowId) {
        setRowId(rowId);
        return this;
    }

    /**
     * <p>
     * A map representing the cells to update in the given row. The key is the column id of the cell and the value is
     * the CellInput object that represents the data to set in that cell.
     * </p>
     * 
     * @return A map representing the cells to update in the given row. The key is the column id of the cell and the
     *         value is the CellInput object that represents the data to set in that cell.
     */

    public java.util.Map<String, CellInput> getCellsToUpdate() {
        return cellsToUpdate;
    }

    /**
     * <p>
     * A map representing the cells to update in the given row. The key is the column id of the cell and the value is
     * the CellInput object that represents the data to set in that cell.
     * </p>
     * 
     * @param cellsToUpdate
     *        A map representing the cells to update in the given row. The key is the column id of the cell and the
     *        value is the CellInput object that represents the data to set in that cell.
     */

    public void setCellsToUpdate(java.util.Map<String, CellInput> cellsToUpdate) {
        this.cellsToUpdate = cellsToUpdate;
    }

    /**
     * <p>
     * A map representing the cells to update in the given row. The key is the column id of the cell and the value is
     * the CellInput object that represents the data to set in that cell.
     * </p>
     * 
     * @param cellsToUpdate
     *        A map representing the cells to update in the given row. The key is the column id of the cell and the
     *        value is the CellInput object that represents the data to set in that cell.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRowData withCellsToUpdate(java.util.Map<String, CellInput> cellsToUpdate) {
        setCellsToUpdate(cellsToUpdate);
        return this;
    }

    /**
     * Add a single CellsToUpdate entry
     *
     * @see UpdateRowData#withCellsToUpdate
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRowData addCellsToUpdateEntry(String key, CellInput value) {
        if (null == this.cellsToUpdate) {
            this.cellsToUpdate = new java.util.HashMap<String, CellInput>();
        }
        if (this.cellsToUpdate.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.cellsToUpdate.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CellsToUpdate.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRowData clearCellsToUpdateEntries() {
        this.cellsToUpdate = null;
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
        if (getCellsToUpdate() != null)
            sb.append("CellsToUpdate: ").append(getCellsToUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRowData == false)
            return false;
        UpdateRowData other = (UpdateRowData) obj;
        if (other.getRowId() == null ^ this.getRowId() == null)
            return false;
        if (other.getRowId() != null && other.getRowId().equals(this.getRowId()) == false)
            return false;
        if (other.getCellsToUpdate() == null ^ this.getCellsToUpdate() == null)
            return false;
        if (other.getCellsToUpdate() != null && other.getCellsToUpdate().equals(this.getCellsToUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRowId() == null) ? 0 : getRowId().hashCode());
        hashCode = prime * hashCode + ((getCellsToUpdate() == null) ? 0 : getCellsToUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRowData clone() {
        try {
            return (UpdateRowData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.UpdateRowDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
