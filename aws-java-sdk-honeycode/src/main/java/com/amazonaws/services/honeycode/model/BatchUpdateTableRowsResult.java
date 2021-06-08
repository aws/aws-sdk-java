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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchUpdateTableRows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateTableRowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The updated workbook cursor after adding the new rows at the end of the table.
     * </p>
     */
    private Long workbookCursor;
    /**
     * <p>
     * The list of batch items in the request that could not be updated in the table. Each element in this list contains
     * one item from the request that could not be updated in the table along with the reason why that item could not be
     * updated.
     * </p>
     */
    private java.util.List<FailedBatchItem> failedBatchItems;

    /**
     * <p>
     * The updated workbook cursor after adding the new rows at the end of the table.
     * </p>
     * 
     * @param workbookCursor
     *        The updated workbook cursor after adding the new rows at the end of the table.
     */

    public void setWorkbookCursor(Long workbookCursor) {
        this.workbookCursor = workbookCursor;
    }

    /**
     * <p>
     * The updated workbook cursor after adding the new rows at the end of the table.
     * </p>
     * 
     * @return The updated workbook cursor after adding the new rows at the end of the table.
     */

    public Long getWorkbookCursor() {
        return this.workbookCursor;
    }

    /**
     * <p>
     * The updated workbook cursor after adding the new rows at the end of the table.
     * </p>
     * 
     * @param workbookCursor
     *        The updated workbook cursor after adding the new rows at the end of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateTableRowsResult withWorkbookCursor(Long workbookCursor) {
        setWorkbookCursor(workbookCursor);
        return this;
    }

    /**
     * <p>
     * The list of batch items in the request that could not be updated in the table. Each element in this list contains
     * one item from the request that could not be updated in the table along with the reason why that item could not be
     * updated.
     * </p>
     * 
     * @return The list of batch items in the request that could not be updated in the table. Each element in this list
     *         contains one item from the request that could not be updated in the table along with the reason why that
     *         item could not be updated.
     */

    public java.util.List<FailedBatchItem> getFailedBatchItems() {
        return failedBatchItems;
    }

    /**
     * <p>
     * The list of batch items in the request that could not be updated in the table. Each element in this list contains
     * one item from the request that could not be updated in the table along with the reason why that item could not be
     * updated.
     * </p>
     * 
     * @param failedBatchItems
     *        The list of batch items in the request that could not be updated in the table. Each element in this list
     *        contains one item from the request that could not be updated in the table along with the reason why that
     *        item could not be updated.
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
     * The list of batch items in the request that could not be updated in the table. Each element in this list contains
     * one item from the request that could not be updated in the table along with the reason why that item could not be
     * updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedBatchItems(java.util.Collection)} or {@link #withFailedBatchItems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param failedBatchItems
     *        The list of batch items in the request that could not be updated in the table. Each element in this list
     *        contains one item from the request that could not be updated in the table along with the reason why that
     *        item could not be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateTableRowsResult withFailedBatchItems(FailedBatchItem... failedBatchItems) {
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
     * The list of batch items in the request that could not be updated in the table. Each element in this list contains
     * one item from the request that could not be updated in the table along with the reason why that item could not be
     * updated.
     * </p>
     * 
     * @param failedBatchItems
     *        The list of batch items in the request that could not be updated in the table. Each element in this list
     *        contains one item from the request that could not be updated in the table along with the reason why that
     *        item could not be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateTableRowsResult withFailedBatchItems(java.util.Collection<FailedBatchItem> failedBatchItems) {
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

        if (obj instanceof BatchUpdateTableRowsResult == false)
            return false;
        BatchUpdateTableRowsResult other = (BatchUpdateTableRowsResult) obj;
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

        hashCode = prime * hashCode + ((getWorkbookCursor() == null) ? 0 : getWorkbookCursor().hashCode());
        hashCode = prime * hashCode + ((getFailedBatchItems() == null) ? 0 : getFailedBatchItems().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateTableRowsResult clone() {
        try {
            return (BatchUpdateTableRowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
