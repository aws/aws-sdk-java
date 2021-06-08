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
 * Data needed to upsert rows in a table as part of a single item in the BatchUpsertTableRows request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/UpsertRowData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpsertRowData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An external identifier that represents a single item in the request that is being upserted as part of the
     * BatchUpsertTableRows request. This can be any string that you can use to identify the item in the request. The
     * BatchUpsertTableRows API puts the batch item id in the results to allow you to link data in the request to data
     * in the results.
     * </p>
     */
    private String batchItemId;
    /**
     * <p>
     * The filter formula to use to find existing matching rows to update. The formula needs to return zero or more
     * rows. If the formula returns 0 rows, then a new row will be appended in the target table. If the formula returns
     * one or more rows, then the returned rows will be updated.
     * </p>
     * <p>
     * Note that the filter formula needs to return rows from the target table for the upsert operation to succeed. If
     * the filter formula has a syntax error or it doesn't evaluate to zero or more rows in the target table for any one
     * item in the input list, then the entire BatchUpsertTableRows request fails and no updates are made to the table.
     * </p>
     */
    private Filter filter;
    /**
     * <p>
     * A map representing the cells to update for the matching rows or an appended row. The key is the column id of the
     * cell and the value is the CellInput object that represents the data to set in that cell.
     * </p>
     */
    private java.util.Map<String, CellInput> cellsToUpdate;

    /**
     * <p>
     * An external identifier that represents a single item in the request that is being upserted as part of the
     * BatchUpsertTableRows request. This can be any string that you can use to identify the item in the request. The
     * BatchUpsertTableRows API puts the batch item id in the results to allow you to link data in the request to data
     * in the results.
     * </p>
     * 
     * @param batchItemId
     *        An external identifier that represents a single item in the request that is being upserted as part of the
     *        BatchUpsertTableRows request. This can be any string that you can use to identify the item in the request.
     *        The BatchUpsertTableRows API puts the batch item id in the results to allow you to link data in the
     *        request to data in the results.
     */

    public void setBatchItemId(String batchItemId) {
        this.batchItemId = batchItemId;
    }

    /**
     * <p>
     * An external identifier that represents a single item in the request that is being upserted as part of the
     * BatchUpsertTableRows request. This can be any string that you can use to identify the item in the request. The
     * BatchUpsertTableRows API puts the batch item id in the results to allow you to link data in the request to data
     * in the results.
     * </p>
     * 
     * @return An external identifier that represents a single item in the request that is being upserted as part of the
     *         BatchUpsertTableRows request. This can be any string that you can use to identify the item in the
     *         request. The BatchUpsertTableRows API puts the batch item id in the results to allow you to link data in
     *         the request to data in the results.
     */

    public String getBatchItemId() {
        return this.batchItemId;
    }

    /**
     * <p>
     * An external identifier that represents a single item in the request that is being upserted as part of the
     * BatchUpsertTableRows request. This can be any string that you can use to identify the item in the request. The
     * BatchUpsertTableRows API puts the batch item id in the results to allow you to link data in the request to data
     * in the results.
     * </p>
     * 
     * @param batchItemId
     *        An external identifier that represents a single item in the request that is being upserted as part of the
     *        BatchUpsertTableRows request. This can be any string that you can use to identify the item in the request.
     *        The BatchUpsertTableRows API puts the batch item id in the results to allow you to link data in the
     *        request to data in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpsertRowData withBatchItemId(String batchItemId) {
        setBatchItemId(batchItemId);
        return this;
    }

    /**
     * <p>
     * The filter formula to use to find existing matching rows to update. The formula needs to return zero or more
     * rows. If the formula returns 0 rows, then a new row will be appended in the target table. If the formula returns
     * one or more rows, then the returned rows will be updated.
     * </p>
     * <p>
     * Note that the filter formula needs to return rows from the target table for the upsert operation to succeed. If
     * the filter formula has a syntax error or it doesn't evaluate to zero or more rows in the target table for any one
     * item in the input list, then the entire BatchUpsertTableRows request fails and no updates are made to the table.
     * </p>
     * 
     * @param filter
     *        The filter formula to use to find existing matching rows to update. The formula needs to return zero or
     *        more rows. If the formula returns 0 rows, then a new row will be appended in the target table. If the
     *        formula returns one or more rows, then the returned rows will be updated. </p>
     *        <p>
     *        Note that the filter formula needs to return rows from the target table for the upsert operation to
     *        succeed. If the filter formula has a syntax error or it doesn't evaluate to zero or more rows in the
     *        target table for any one item in the input list, then the entire BatchUpsertTableRows request fails and no
     *        updates are made to the table.
     */

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter formula to use to find existing matching rows to update. The formula needs to return zero or more
     * rows. If the formula returns 0 rows, then a new row will be appended in the target table. If the formula returns
     * one or more rows, then the returned rows will be updated.
     * </p>
     * <p>
     * Note that the filter formula needs to return rows from the target table for the upsert operation to succeed. If
     * the filter formula has a syntax error or it doesn't evaluate to zero or more rows in the target table for any one
     * item in the input list, then the entire BatchUpsertTableRows request fails and no updates are made to the table.
     * </p>
     * 
     * @return The filter formula to use to find existing matching rows to update. The formula needs to return zero or
     *         more rows. If the formula returns 0 rows, then a new row will be appended in the target table. If the
     *         formula returns one or more rows, then the returned rows will be updated. </p>
     *         <p>
     *         Note that the filter formula needs to return rows from the target table for the upsert operation to
     *         succeed. If the filter formula has a syntax error or it doesn't evaluate to zero or more rows in the
     *         target table for any one item in the input list, then the entire BatchUpsertTableRows request fails and
     *         no updates are made to the table.
     */

    public Filter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The filter formula to use to find existing matching rows to update. The formula needs to return zero or more
     * rows. If the formula returns 0 rows, then a new row will be appended in the target table. If the formula returns
     * one or more rows, then the returned rows will be updated.
     * </p>
     * <p>
     * Note that the filter formula needs to return rows from the target table for the upsert operation to succeed. If
     * the filter formula has a syntax error or it doesn't evaluate to zero or more rows in the target table for any one
     * item in the input list, then the entire BatchUpsertTableRows request fails and no updates are made to the table.
     * </p>
     * 
     * @param filter
     *        The filter formula to use to find existing matching rows to update. The formula needs to return zero or
     *        more rows. If the formula returns 0 rows, then a new row will be appended in the target table. If the
     *        formula returns one or more rows, then the returned rows will be updated. </p>
     *        <p>
     *        Note that the filter formula needs to return rows from the target table for the upsert operation to
     *        succeed. If the filter formula has a syntax error or it doesn't evaluate to zero or more rows in the
     *        target table for any one item in the input list, then the entire BatchUpsertTableRows request fails and no
     *        updates are made to the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpsertRowData withFilter(Filter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * A map representing the cells to update for the matching rows or an appended row. The key is the column id of the
     * cell and the value is the CellInput object that represents the data to set in that cell.
     * </p>
     * 
     * @return A map representing the cells to update for the matching rows or an appended row. The key is the column id
     *         of the cell and the value is the CellInput object that represents the data to set in that cell.
     */

    public java.util.Map<String, CellInput> getCellsToUpdate() {
        return cellsToUpdate;
    }

    /**
     * <p>
     * A map representing the cells to update for the matching rows or an appended row. The key is the column id of the
     * cell and the value is the CellInput object that represents the data to set in that cell.
     * </p>
     * 
     * @param cellsToUpdate
     *        A map representing the cells to update for the matching rows or an appended row. The key is the column id
     *        of the cell and the value is the CellInput object that represents the data to set in that cell.
     */

    public void setCellsToUpdate(java.util.Map<String, CellInput> cellsToUpdate) {
        this.cellsToUpdate = cellsToUpdate;
    }

    /**
     * <p>
     * A map representing the cells to update for the matching rows or an appended row. The key is the column id of the
     * cell and the value is the CellInput object that represents the data to set in that cell.
     * </p>
     * 
     * @param cellsToUpdate
     *        A map representing the cells to update for the matching rows or an appended row. The key is the column id
     *        of the cell and the value is the CellInput object that represents the data to set in that cell.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpsertRowData withCellsToUpdate(java.util.Map<String, CellInput> cellsToUpdate) {
        setCellsToUpdate(cellsToUpdate);
        return this;
    }

    /**
     * Add a single CellsToUpdate entry
     *
     * @see UpsertRowData#withCellsToUpdate
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpsertRowData addCellsToUpdateEntry(String key, CellInput value) {
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

    public UpsertRowData clearCellsToUpdateEntries() {
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
        if (getBatchItemId() != null)
            sb.append("BatchItemId: ").append(getBatchItemId()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
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

        if (obj instanceof UpsertRowData == false)
            return false;
        UpsertRowData other = (UpsertRowData) obj;
        if (other.getBatchItemId() == null ^ this.getBatchItemId() == null)
            return false;
        if (other.getBatchItemId() != null && other.getBatchItemId().equals(this.getBatchItemId()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
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

        hashCode = prime * hashCode + ((getBatchItemId() == null) ? 0 : getBatchItemId().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getCellsToUpdate() == null) ? 0 : getCellsToUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpsertRowData clone() {
        try {
            return (UpsertRowData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.UpsertRowDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
