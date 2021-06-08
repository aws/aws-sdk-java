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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchDeleteTableRows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteTableRowsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workbook where the rows are being deleted.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     */
    private String workbookId;
    /**
     * <p>
     * The ID of the table where the rows are being deleted.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     */
    private String tableId;
    /**
     * <p>
     * The list of row ids to delete from the table. You need to specify at least one row id in this list.
     * </p>
     * <p>
     * Note that if one of the row ids provided in the request does not exist in the table, then the request fails and
     * no rows are deleted from the table.
     * </p>
     */
    private java.util.List<String> rowIds;
    /**
     * <p>
     * The request token for performing the delete action. Request tokens help to identify duplicate requests. If a call
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
     * The ID of the workbook where the rows are being deleted.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook where the rows are being deleted.</p>
     *        <p>
     *        If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public void setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
    }

    /**
     * <p>
     * The ID of the workbook where the rows are being deleted.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @return The ID of the workbook where the rows are being deleted.</p>
     *         <p>
     *         If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public String getWorkbookId() {
        return this.workbookId;
    }

    /**
     * <p>
     * The ID of the workbook where the rows are being deleted.
     * </p>
     * <p>
     * If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook where the rows are being deleted.</p>
     *        <p>
     *        If a workbook with the specified id could not be found, this API throws ResourceNotFoundException.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableRowsRequest withWorkbookId(String workbookId) {
        setWorkbookId(workbookId);
        return this;
    }

    /**
     * <p>
     * The ID of the table where the rows are being deleted.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param tableId
     *        The ID of the table where the rows are being deleted.</p>
     *        <p>
     *        If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * <p>
     * The ID of the table where the rows are being deleted.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @return The ID of the table where the rows are being deleted.</p>
     *         <p>
     *         If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     */

    public String getTableId() {
        return this.tableId;
    }

    /**
     * <p>
     * The ID of the table where the rows are being deleted.
     * </p>
     * <p>
     * If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * </p>
     * 
     * @param tableId
     *        The ID of the table where the rows are being deleted.</p>
     *        <p>
     *        If a table with the specified id could not be found, this API throws ResourceNotFoundException.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableRowsRequest withTableId(String tableId) {
        setTableId(tableId);
        return this;
    }

    /**
     * <p>
     * The list of row ids to delete from the table. You need to specify at least one row id in this list.
     * </p>
     * <p>
     * Note that if one of the row ids provided in the request does not exist in the table, then the request fails and
     * no rows are deleted from the table.
     * </p>
     * 
     * @return The list of row ids to delete from the table. You need to specify at least one row id in this list. </p>
     *         <p>
     *         Note that if one of the row ids provided in the request does not exist in the table, then the request
     *         fails and no rows are deleted from the table.
     */

    public java.util.List<String> getRowIds() {
        return rowIds;
    }

    /**
     * <p>
     * The list of row ids to delete from the table. You need to specify at least one row id in this list.
     * </p>
     * <p>
     * Note that if one of the row ids provided in the request does not exist in the table, then the request fails and
     * no rows are deleted from the table.
     * </p>
     * 
     * @param rowIds
     *        The list of row ids to delete from the table. You need to specify at least one row id in this list. </p>
     *        <p>
     *        Note that if one of the row ids provided in the request does not exist in the table, then the request
     *        fails and no rows are deleted from the table.
     */

    public void setRowIds(java.util.Collection<String> rowIds) {
        if (rowIds == null) {
            this.rowIds = null;
            return;
        }

        this.rowIds = new java.util.ArrayList<String>(rowIds);
    }

    /**
     * <p>
     * The list of row ids to delete from the table. You need to specify at least one row id in this list.
     * </p>
     * <p>
     * Note that if one of the row ids provided in the request does not exist in the table, then the request fails and
     * no rows are deleted from the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRowIds(java.util.Collection)} or {@link #withRowIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rowIds
     *        The list of row ids to delete from the table. You need to specify at least one row id in this list. </p>
     *        <p>
     *        Note that if one of the row ids provided in the request does not exist in the table, then the request
     *        fails and no rows are deleted from the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableRowsRequest withRowIds(String... rowIds) {
        if (this.rowIds == null) {
            setRowIds(new java.util.ArrayList<String>(rowIds.length));
        }
        for (String ele : rowIds) {
            this.rowIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of row ids to delete from the table. You need to specify at least one row id in this list.
     * </p>
     * <p>
     * Note that if one of the row ids provided in the request does not exist in the table, then the request fails and
     * no rows are deleted from the table.
     * </p>
     * 
     * @param rowIds
     *        The list of row ids to delete from the table. You need to specify at least one row id in this list. </p>
     *        <p>
     *        Note that if one of the row ids provided in the request does not exist in the table, then the request
     *        fails and no rows are deleted from the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableRowsRequest withRowIds(java.util.Collection<String> rowIds) {
        setRowIds(rowIds);
        return this;
    }

    /**
     * <p>
     * The request token for performing the delete action. Request tokens help to identify duplicate requests. If a call
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
     *        The request token for performing the delete action. Request tokens help to identify duplicate requests. If
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
     * The request token for performing the delete action. Request tokens help to identify duplicate requests. If a call
     * times out or fails due to a transient error like a failed network connection, you can retry the call with the
     * same request token. The service ensures that if the first call using that request token is successfully
     * performed, the second call will not perform the action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests
     * spanning hours or days.
     * </p>
     * 
     * @return The request token for performing the delete action. Request tokens help to identify duplicate requests.
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
     * The request token for performing the delete action. Request tokens help to identify duplicate requests. If a call
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
     *        The request token for performing the delete action. Request tokens help to identify duplicate requests. If
     *        a call times out or fails due to a transient error like a failed network connection, you can retry the
     *        call with the same request token. The service ensures that if the first call using that request token is
     *        successfully performed, the second call will not perform the action again. </p>
     *        <p>
     *        Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe
     *        requests spanning hours or days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableRowsRequest withClientRequestToken(String clientRequestToken) {
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
        if (getRowIds() != null)
            sb.append("RowIds: ").append(getRowIds()).append(",");
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

        if (obj instanceof BatchDeleteTableRowsRequest == false)
            return false;
        BatchDeleteTableRowsRequest other = (BatchDeleteTableRowsRequest) obj;
        if (other.getWorkbookId() == null ^ this.getWorkbookId() == null)
            return false;
        if (other.getWorkbookId() != null && other.getWorkbookId().equals(this.getWorkbookId()) == false)
            return false;
        if (other.getTableId() == null ^ this.getTableId() == null)
            return false;
        if (other.getTableId() != null && other.getTableId().equals(this.getTableId()) == false)
            return false;
        if (other.getRowIds() == null ^ this.getRowIds() == null)
            return false;
        if (other.getRowIds() != null && other.getRowIds().equals(this.getRowIds()) == false)
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
        hashCode = prime * hashCode + ((getRowIds() == null) ? 0 : getRowIds().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteTableRowsRequest clone() {
        return (BatchDeleteTableRowsRequest) super.clone();
    }

}
