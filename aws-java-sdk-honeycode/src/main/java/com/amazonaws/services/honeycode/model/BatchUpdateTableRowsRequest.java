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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchUpdateTableRows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateTableRowsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workbook where the rows are being updated.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     */
    private String workbookId;
    /**
     * <p>
     * The ID of the table where the rows are being updated.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     */
    private String tableId;
    /**
     * <p>
     * The list of rows to update in the table. Each item in this list needs to contain the row id to update along with
     * the map of column id to cell values for each column in that row that needs to be updated. You need to specify at
     * least one row in this list, and for each row, you need to specify at least one column to update.
     * </p>
     * <p>
     * Note that if one of the row or column ids in the request does not exist in the table, then the request fails and
     * no updates are made to the table.
     * </p>
     */
    private java.util.List<UpdateRowData> rowsToUpdate;
    /**
     * <p>
     * The request token for performing the update action. Request tokens help to identify duplicate requests. If a call
     * times out or fails due to a transient error like a failed network connection, you can retry the call with the
     * same request token. The service ensures that if the first call using that request token is successfully
     * performed, the second call will not perform the action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests
     * spanning hours or days.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The ID of the workbook where the rows are being updated.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook where the rows are being updated.</p>
     *        <p>
     *        If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public void setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
    }

    /**
     * <p>
     * The ID of the workbook where the rows are being updated.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @return The ID of the workbook where the rows are being updated.</p>
     *         <p>
     *         If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public String getWorkbookId() {
        return this.workbookId;
    }

    /**
     * <p>
     * The ID of the workbook where the rows are being updated.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook where the rows are being updated.</p>
     *        <p>
     *        If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateTableRowsRequest withWorkbookId(String workbookId) {
        setWorkbookId(workbookId);
        return this;
    }

    /**
     * <p>
     * The ID of the table where the rows are being updated.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param tableId
     *        The ID of the table where the rows are being updated.</p>
     *        <p>
     *        If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * <p>
     * The ID of the table where the rows are being updated.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @return The ID of the table where the rows are being updated.</p>
     *         <p>
     *         If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public String getTableId() {
        return this.tableId;
    }

    /**
     * <p>
     * The ID of the table where the rows are being updated.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param tableId
     *        The ID of the table where the rows are being updated.</p>
     *        <p>
     *        If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateTableRowsRequest withTableId(String tableId) {
        setTableId(tableId);
        return this;
    }

    /**
     * <p>
     * The list of rows to update in the table. Each item in this list needs to contain the row id to update along with
     * the map of column id to cell values for each column in that row that needs to be updated. You need to specify at
     * least one row in this list, and for each row, you need to specify at least one column to update.
     * </p>
     * <p>
     * Note that if one of the row or column ids in the request does not exist in the table, then the request fails and
     * no updates are made to the table.
     * </p>
     * 
     * @return The list of rows to update in the table. Each item in this list needs to contain the row id to update
     *         along with the map of column id to cell values for each column in that row that needs to be updated. You
     *         need to specify at least one row in this list, and for each row, you need to specify at least one column
     *         to update. </p>
     *         <p>
     *         Note that if one of the row or column ids in the request does not exist in the table, then the request
     *         fails and no updates are made to the table.
     */

    public java.util.List<UpdateRowData> getRowsToUpdate() {
        return rowsToUpdate;
    }

    /**
     * <p>
     * The list of rows to update in the table. Each item in this list needs to contain the row id to update along with
     * the map of column id to cell values for each column in that row that needs to be updated. You need to specify at
     * least one row in this list, and for each row, you need to specify at least one column to update.
     * </p>
     * <p>
     * Note that if one of the row or column ids in the request does not exist in the table, then the request fails and
     * no updates are made to the table.
     * </p>
     * 
     * @param rowsToUpdate
     *        The list of rows to update in the table. Each item in this list needs to contain the row id to update
     *        along with the map of column id to cell values for each column in that row that needs to be updated. You
     *        need to specify at least one row in this list, and for each row, you need to specify at least one column
     *        to update. </p>
     *        <p>
     *        Note that if one of the row or column ids in the request does not exist in the table, then the request
     *        fails and no updates are made to the table.
     */

    public void setRowsToUpdate(java.util.Collection<UpdateRowData> rowsToUpdate) {
        if (rowsToUpdate == null) {
            this.rowsToUpdate = null;
            return;
        }

        this.rowsToUpdate = new java.util.ArrayList<UpdateRowData>(rowsToUpdate);
    }

    /**
     * <p>
     * The list of rows to update in the table. Each item in this list needs to contain the row id to update along with
     * the map of column id to cell values for each column in that row that needs to be updated. You need to specify at
     * least one row in this list, and for each row, you need to specify at least one column to update.
     * </p>
     * <p>
     * Note that if one of the row or column ids in the request does not exist in the table, then the request fails and
     * no updates are made to the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRowsToUpdate(java.util.Collection)} or {@link #withRowsToUpdate(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param rowsToUpdate
     *        The list of rows to update in the table. Each item in this list needs to contain the row id to update
     *        along with the map of column id to cell values for each column in that row that needs to be updated. You
     *        need to specify at least one row in this list, and for each row, you need to specify at least one column
     *        to update. </p>
     *        <p>
     *        Note that if one of the row or column ids in the request does not exist in the table, then the request
     *        fails and no updates are made to the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateTableRowsRequest withRowsToUpdate(UpdateRowData... rowsToUpdate) {
        if (this.rowsToUpdate == null) {
            setRowsToUpdate(new java.util.ArrayList<UpdateRowData>(rowsToUpdate.length));
        }
        for (UpdateRowData ele : rowsToUpdate) {
            this.rowsToUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of rows to update in the table. Each item in this list needs to contain the row id to update along with
     * the map of column id to cell values for each column in that row that needs to be updated. You need to specify at
     * least one row in this list, and for each row, you need to specify at least one column to update.
     * </p>
     * <p>
     * Note that if one of the row or column ids in the request does not exist in the table, then the request fails and
     * no updates are made to the table.
     * </p>
     * 
     * @param rowsToUpdate
     *        The list of rows to update in the table. Each item in this list needs to contain the row id to update
     *        along with the map of column id to cell values for each column in that row that needs to be updated. You
     *        need to specify at least one row in this list, and for each row, you need to specify at least one column
     *        to update. </p>
     *        <p>
     *        Note that if one of the row or column ids in the request does not exist in the table, then the request
     *        fails and no updates are made to the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateTableRowsRequest withRowsToUpdate(java.util.Collection<UpdateRowData> rowsToUpdate) {
        setRowsToUpdate(rowsToUpdate);
        return this;
    }

    /**
     * <p>
     * The request token for performing the update action. Request tokens help to identify duplicate requests. If a call
     * times out or fails due to a transient error like a failed network connection, you can retry the call with the
     * same request token. The service ensures that if the first call using that request token is successfully
     * performed, the second call will not perform the action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests
     * spanning hours or days.
     * </p>
     * 
     * @param clientRequestToken
     *        The request token for performing the update action. Request tokens help to identify duplicate requests. If
     *        a call times out or fails due to a transient error like a failed network connection, you can retry the
     *        call with the same request token. The service ensures that if the first call using that request token is
     *        successfully performed, the second call will not perform the action again. </p>
     *        <p>
     *        Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe
     *        requests spanning hours or days.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The request token for performing the update action. Request tokens help to identify duplicate requests. If a call
     * times out or fails due to a transient error like a failed network connection, you can retry the call with the
     * same request token. The service ensures that if the first call using that request token is successfully
     * performed, the second call will not perform the action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests
     * spanning hours or days.
     * </p>
     * 
     * @return The request token for performing the update action. Request tokens help to identify duplicate requests.
     *         If a call times out or fails due to a transient error like a failed network connection, you can retry the
     *         call with the same request token. The service ensures that if the first call using that request token is
     *         successfully performed, the second call will not perform the action again. </p>
     *         <p>
     *         Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe
     *         requests spanning hours or days.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The request token for performing the update action. Request tokens help to identify duplicate requests. If a call
     * times out or fails due to a transient error like a failed network connection, you can retry the call with the
     * same request token. The service ensures that if the first call using that request token is successfully
     * performed, the second call will not perform the action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests
     * spanning hours or days.
     * </p>
     * 
     * @param clientRequestToken
     *        The request token for performing the update action. Request tokens help to identify duplicate requests. If
     *        a call times out or fails due to a transient error like a failed network connection, you can retry the
     *        call with the same request token. The service ensures that if the first call using that request token is
     *        successfully performed, the second call will not perform the action again. </p>
     *        <p>
     *        Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe
     *        requests spanning hours or days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateTableRowsRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getWorkbookId() != null)
            sb.append("WorkbookId: ").append(getWorkbookId()).append(",");
        if (getTableId() != null)
            sb.append("TableId: ").append(getTableId()).append(",");
        if (getRowsToUpdate() != null)
            sb.append("RowsToUpdate: ").append(getRowsToUpdate()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateTableRowsRequest == false)
            return false;
        BatchUpdateTableRowsRequest other = (BatchUpdateTableRowsRequest) obj;
        if (other.getWorkbookId() == null ^ this.getWorkbookId() == null)
            return false;
        if (other.getWorkbookId() != null && other.getWorkbookId().equals(this.getWorkbookId()) == false)
            return false;
        if (other.getTableId() == null ^ this.getTableId() == null)
            return false;
        if (other.getTableId() != null && other.getTableId().equals(this.getTableId()) == false)
            return false;
        if (other.getRowsToUpdate() == null ^ this.getRowsToUpdate() == null)
            return false;
        if (other.getRowsToUpdate() != null && other.getRowsToUpdate().equals(this.getRowsToUpdate()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkbookId() == null) ? 0 : getWorkbookId().hashCode());
        hashCode = prime * hashCode + ((getTableId() == null) ? 0 : getTableId().hashCode());
        hashCode = prime * hashCode + ((getRowsToUpdate() == null) ? 0 : getRowsToUpdate().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateTableRowsRequest clone() {
        return (BatchUpdateTableRowsRequest) super.clone();
    }

}
