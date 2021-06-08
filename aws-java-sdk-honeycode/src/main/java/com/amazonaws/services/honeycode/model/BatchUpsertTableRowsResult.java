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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchUpsertTableRows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpsertTableRowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A map with the batch item id as the key and the result of the upsert operation as the value. The result of the
     * upsert operation specifies whether existing rows were updated or a new row was appended, along with the list of
     * row ids that were affected.
     * </p>
     */
    private java.util.Map<String, UpsertRowsResult> rows;
    /**
     * <p>
     * The updated workbook cursor after updating or appending rows in the table.
     * </p>
     */
    private Long workbookCursor;
    /**
     * <p>
     * The list of batch items in the request that could not be updated or appended in the table. Each element in this
     * list contains one item from the request that could not be updated in the table along with the reason why that
     * item could not be updated or appended.
     * </p>
     */
    private java.util.List<FailedBatchItem> failedBatchItems;

    /**
     * <p>
     * A map with the batch item id as the key and the result of the upsert operation as the value. The result of the
     * upsert operation specifies whether existing rows were updated or a new row was appended, along with the list of
     * row ids that were affected.
     * </p>
     * 
     * @return A map with the batch item id as the key and the result of the upsert operation as the value. The result
     *         of the upsert operation specifies whether existing rows were updated or a new row was appended, along
     *         with the list of row ids that were affected.
     */

    public java.util.Map<String, UpsertRowsResult> getRows() {
        return rows;
    }

    /**
     * <p>
     * A map with the batch item id as the key and the result of the upsert operation as the value. The result of the
     * upsert operation specifies whether existing rows were updated or a new row was appended, along with the list of
     * row ids that were affected.
     * </p>
     * 
     * @param rows
     *        A map with the batch item id as the key and the result of the upsert operation as the value. The result of
     *        the upsert operation specifies whether existing rows were updated or a new row was appended, along with
     *        the list of row ids that were affected.
     */

    public void setRows(java.util.Map<String, UpsertRowsResult> rows) {
        this.rows = rows;
    }

    /**
     * <p>
     * A map with the batch item id as the key and the result of the upsert operation as the value. The result of the
     * upsert operation specifies whether existing rows were updated or a new row was appended, along with the list of
     * row ids that were affected.
     * </p>
     * 
     * @param rows
     *        A map with the batch item id as the key and the result of the upsert operation as the value. The result of
     *        the upsert operation specifies whether existing rows were updated or a new row was appended, along with
     *        the list of row ids that were affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpsertTableRowsResult withRows(java.util.Map<String, UpsertRowsResult> rows) {
        setRows(rows);
        return this;
    }

    /**
     * Add a single Rows entry
     *
     * @see BatchUpsertTableRowsResult#withRows
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpsertTableRowsResult addRowsEntry(String key, UpsertRowsResult value) {
        if (null == this.rows) {
            this.rows = new java.util.HashMap<String, UpsertRowsResult>();
        }
        if (this.rows.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.rows.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Rows.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpsertTableRowsResult clearRowsEntries() {
        this.rows = null;
        return this;
    }

    /**
     * <p>
     * The updated workbook cursor after updating or appending rows in the table.
     * </p>
     * 
     * @param workbookCursor
     *        The updated workbook cursor after updating or appending rows in the table.
     */

    public void setWorkbookCursor(Long workbookCursor) {
        this.workbookCursor = workbookCursor;
    }

    /**
     * <p>
     * The updated workbook cursor after updating or appending rows in the table.
     * </p>
     * 
     * @return The updated workbook cursor after updating or appending rows in the table.
     */

    public Long getWorkbookCursor() {
        return this.workbookCursor;
    }

    /**
     * <p>
     * The updated workbook cursor after updating or appending rows in the table.
     * </p>
     * 
     * @param workbookCursor
     *        The updated workbook cursor after updating or appending rows in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpsertTableRowsResult withWorkbookCursor(Long workbookCursor) {
        setWorkbookCursor(workbookCursor);
        return this;
    }

    /**
     * <p>
     * The list of batch items in the request that could not be updated or appended in the table. Each element in this
     * list contains one item from the request that could not be updated in the table along with the reason why that
     * item could not be updated or appended.
     * </p>
     * 
     * @return The list of batch items in the request that could not be updated or appended in the table. Each element
     *         in this list contains one item from the request that could not be updated in the table along with the
     *         reason why that item could not be updated or appended.
     */

    public java.util.List<FailedBatchItem> getFailedBatchItems() {
        return failedBatchItems;
    }

    /**
     * <p>
     * The list of batch items in the request that could not be updated or appended in the table. Each element in this
     * list contains one item from the request that could not be updated in the table along with the reason why that
     * item could not be updated or appended.
     * </p>
     * 
     * @param failedBatchItems
     *        The list of batch items in the request that could not be updated or appended in the table. Each element in
     *        this list contains one item from the request that could not be updated in the table along with the reason
     *        why that item could not be updated or appended.
     */

    public void setFailedBatchItems(java.util.Collection<FailedBatchItem> failedBatchItems) {
        if (failedBatchItems == null) {
            this.failedBatchItems = null;
            return;
        }

        this.failedBatchItems = new java.util.ArrayList<FailedBatchItem>(failedBatchItems);
    }

    /**
     * <p>
     * The list of batch items in the request that could not be updated or appended in the table. Each element in this
     * list contains one item from the request that could not be updated in the table along with the reason why that
     * item could not be updated or appended.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedBatchItems(java.util.Collection)} or {@link #withFailedBatchItems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param failedBatchItems
     *        The list of batch items in the request that could not be updated or appended in the table. Each element in
     *        this list contains one item from the request that could not be updated in the table along with the reason
     *        why that item could not be updated or appended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpsertTableRowsResult withFailedBatchItems(FailedBatchItem... failedBatchItems) {
        if (this.failedBatchItems == null) {
            setFailedBatchItems(new java.util.ArrayList<FailedBatchItem>(failedBatchItems.length));
        }
        for (FailedBatchItem ele : failedBatchItems) {
            this.failedBatchItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of batch items in the request that could not be updated or appended in the table. Each element in this
     * list contains one item from the request that could not be updated in the table along with the reason why that
     * item could not be updated or appended.
     * </p>
     * 
     * @param failedBatchItems
     *        The list of batch items in the request that could not be updated or appended in the table. Each element in
     *        this list contains one item from the request that could not be updated in the table along with the reason
     *        why that item could not be updated or appended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpsertTableRowsResult withFailedBatchItems(java.util.Collection<FailedBatchItem> failedBatchItems) {
        setFailedBatchItems(failedBatchItems);
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
        if (getRows() != null)
            sb.append("Rows: ").append(getRows()).append(",");
        if (getWorkbookCursor() != null)
            sb.append("WorkbookCursor: ").append(getWorkbookCursor()).append(",");
        if (getFailedBatchItems() != null)
            sb.append("FailedBatchItems: ").append(getFailedBatchItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpsertTableRowsResult == false)
            return false;
        BatchUpsertTableRowsResult other = (BatchUpsertTableRowsResult) obj;
        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
            return false;
        if (other.getWorkbookCursor() == null ^ this.getWorkbookCursor() == null)
            return false;
        if (other.getWorkbookCursor() != null && other.getWorkbookCursor().equals(this.getWorkbookCursor()) == false)
            return false;
        if (other.getFailedBatchItems() == null ^ this.getFailedBatchItems() == null)
            return false;
        if (other.getFailedBatchItems() != null && other.getFailedBatchItems().equals(this.getFailedBatchItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
        hashCode = prime * hashCode + ((getWorkbookCursor() == null) ? 0 : getWorkbookCursor().hashCode());
        hashCode = prime * hashCode + ((getFailedBatchItems() == null) ? 0 : getFailedBatchItems().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpsertTableRowsResult clone() {
        try {
            return (BatchUpsertTableRowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
