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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/CreateRowData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRowData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An external identifier that represents the single row that is being created as part of the BatchCreateTableRows
     * request. This can be any string that you can use to identify the row in the request. The BatchCreateTableRows API
     * puts the batch item id in the results to allow you to link data in the request to data in the results.
     * </p>
     */
    private String batchItemId;
    /**
     * <p>
     * A map representing the cells to create in the new row. The key is the column id of the cell and the value is the
     * CellInput object that represents the data to set in that cell.
     * </p>
     */
    private java.util.Map<String, CellInput> cellsToCreate;

    /**
     * <p>
     * An external identifier that represents the single row that is being created as part of the BatchCreateTableRows
     * request. This can be any string that you can use to identify the row in the request. The BatchCreateTableRows API
     * puts the batch item id in the results to allow you to link data in the request to data in the results.
     * </p>
     * 
     * @param batchItemId
     *        An external identifier that represents the single row that is being created as part of the
     *        BatchCreateTableRows request. This can be any string that you can use to identify the row in the request.
     *        The BatchCreateTableRows API puts the batch item id in the results to allow you to link data in the
     *        request to data in the results.
     */

    public void setBatchItemId(String batchItemId) {
        this.batchItemId = batchItemId;
    }

    /**
     * <p>
     * An external identifier that represents the single row that is being created as part of the BatchCreateTableRows
     * request. This can be any string that you can use to identify the row in the request. The BatchCreateTableRows API
     * puts the batch item id in the results to allow you to link data in the request to data in the results.
     * </p>
     * 
     * @return An external identifier that represents the single row that is being created as part of the
     *         BatchCreateTableRows request. This can be any string that you can use to identify the row in the request.
     *         The BatchCreateTableRows API puts the batch item id in the results to allow you to link data in the
     *         request to data in the results.
     */

    public String getBatchItemId() {
        return this.batchItemId;
    }

    /**
     * <p>
     * An external identifier that represents the single row that is being created as part of the BatchCreateTableRows
     * request. This can be any string that you can use to identify the row in the request. The BatchCreateTableRows API
     * puts the batch item id in the results to allow you to link data in the request to data in the results.
     * </p>
     * 
     * @param batchItemId
     *        An external identifier that represents the single row that is being created as part of the
     *        BatchCreateTableRows request. This can be any string that you can use to identify the row in the request.
     *        The BatchCreateTableRows API puts the batch item id in the results to allow you to link data in the
     *        request to data in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRowData withBatchItemId(String batchItemId) {
        setBatchItemId(batchItemId);
        return this;
    }

    /**
     * <p>
     * A map representing the cells to create in the new row. The key is the column id of the cell and the value is the
     * CellInput object that represents the data to set in that cell.
     * </p>
     * 
     * @return A map representing the cells to create in the new row. The key is the column id of the cell and the value
     *         is the CellInput object that represents the data to set in that cell.
     */

    public java.util.Map<String, CellInput> getCellsToCreate() {
        return cellsToCreate;
    }

    /**
     * <p>
     * A map representing the cells to create in the new row. The key is the column id of the cell and the value is the
     * CellInput object that represents the data to set in that cell.
     * </p>
     * 
     * @param cellsToCreate
     *        A map representing the cells to create in the new row. The key is the column id of the cell and the value
     *        is the CellInput object that represents the data to set in that cell.
     */

    public void setCellsToCreate(java.util.Map<String, CellInput> cellsToCreate) {
        this.cellsToCreate = cellsToCreate;
    }

    /**
     * <p>
     * A map representing the cells to create in the new row. The key is the column id of the cell and the value is the
     * CellInput object that represents the data to set in that cell.
     * </p>
     * 
     * @param cellsToCreate
     *        A map representing the cells to create in the new row. The key is the column id of the cell and the value
     *        is the CellInput object that represents the data to set in that cell.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRowData withCellsToCreate(java.util.Map<String, CellInput> cellsToCreate) {
        setCellsToCreate(cellsToCreate);
        return this;
    }

    /**
     * Add a single CellsToCreate entry
     *
     * @see CreateRowData#withCellsToCreate
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRowData addCellsToCreateEntry(String key, CellInput value) {
        if (null == this.cellsToCreate) {
            this.cellsToCreate = new java.util.HashMap<String, CellInput>();
        }
        if (this.cellsToCreate.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.cellsToCreate.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CellsToCreate.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRowData clearCellsToCreateEntries() {
        this.cellsToCreate = null;
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
        if (getBatchItemId() != null)
            sb.append("BatchItemId: ").append(getBatchItemId()).append(",");
        if (getCellsToCreate() != null)
            sb.append("CellsToCreate: ").append(getCellsToCreate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRowData == false)
            return false;
        CreateRowData other = (CreateRowData) obj;
        if (other.getBatchItemId() == null ^ this.getBatchItemId() == null)
            return false;
        if (other.getBatchItemId() != null && other.getBatchItemId().equals(this.getBatchItemId()) == false)
            return false;
        if (other.getCellsToCreate() == null ^ this.getCellsToCreate() == null)
            return false;
        if (other.getCellsToCreate() != null && other.getCellsToCreate().equals(this.getCellsToCreate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchItemId() == null) ? 0 : getBatchItemId().hashCode());
        hashCode = prime * hashCode + ((getCellsToCreate() == null) ? 0 : getCellsToCreate().hashCode());
        return hashCode;
    }

    @Override
    public CreateRowData clone() {
        try {
            return (CreateRowData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.CreateRowDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
