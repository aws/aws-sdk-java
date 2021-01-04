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
 * An object that represents the result of a single upsert row request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/UpsertRowsResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpsertRowsResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of row ids that were changed as part of an upsert row operation. If the upsert resulted in an update,
     * this list could potentially contain multiple rows that matched the filter and hence got updated. If the upsert
     * resulted in an append, this list would only have the single row that was appended.
     * </p>
     */
    private java.util.List<String> rowIds;
    /**
     * <p>
     * The result of the upsert action.
     * </p>
     */
    private String upsertAction;

    /**
     * <p>
     * The list of row ids that were changed as part of an upsert row operation. If the upsert resulted in an update,
     * this list could potentially contain multiple rows that matched the filter and hence got updated. If the upsert
     * resulted in an append, this list would only have the single row that was appended.
     * </p>
     * 
     * @return The list of row ids that were changed as part of an upsert row operation. If the upsert resulted in an
     *         update, this list could potentially contain multiple rows that matched the filter and hence got updated.
     *         If the upsert resulted in an append, this list would only have the single row that was appended.
     */

    public java.util.List<String> getRowIds() {
        return rowIds;
    }

    /**
     * <p>
     * The list of row ids that were changed as part of an upsert row operation. If the upsert resulted in an update,
     * this list could potentially contain multiple rows that matched the filter and hence got updated. If the upsert
     * resulted in an append, this list would only have the single row that was appended.
     * </p>
     * 
     * @param rowIds
     *        The list of row ids that were changed as part of an upsert row operation. If the upsert resulted in an
     *        update, this list could potentially contain multiple rows that matched the filter and hence got updated.
     *        If the upsert resulted in an append, this list would only have the single row that was appended.
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
     * The list of row ids that were changed as part of an upsert row operation. If the upsert resulted in an update,
     * this list could potentially contain multiple rows that matched the filter and hence got updated. If the upsert
     * resulted in an append, this list would only have the single row that was appended.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRowIds(java.util.Collection)} or {@link #withRowIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rowIds
     *        The list of row ids that were changed as part of an upsert row operation. If the upsert resulted in an
     *        update, this list could potentially contain multiple rows that matched the filter and hence got updated.
     *        If the upsert resulted in an append, this list would only have the single row that was appended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpsertRowsResult withRowIds(String... rowIds) {
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
     * The list of row ids that were changed as part of an upsert row operation. If the upsert resulted in an update,
     * this list could potentially contain multiple rows that matched the filter and hence got updated. If the upsert
     * resulted in an append, this list would only have the single row that was appended.
     * </p>
     * 
     * @param rowIds
     *        The list of row ids that were changed as part of an upsert row operation. If the upsert resulted in an
     *        update, this list could potentially contain multiple rows that matched the filter and hence got updated.
     *        If the upsert resulted in an append, this list would only have the single row that was appended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpsertRowsResult withRowIds(java.util.Collection<String> rowIds) {
        setRowIds(rowIds);
        return this;
    }

    /**
     * <p>
     * The result of the upsert action.
     * </p>
     * 
     * @param upsertAction
     *        The result of the upsert action.
     * @see UpsertAction
     */

    public void setUpsertAction(String upsertAction) {
        this.upsertAction = upsertAction;
    }

    /**
     * <p>
     * The result of the upsert action.
     * </p>
     * 
     * @return The result of the upsert action.
     * @see UpsertAction
     */

    public String getUpsertAction() {
        return this.upsertAction;
    }

    /**
     * <p>
     * The result of the upsert action.
     * </p>
     * 
     * @param upsertAction
     *        The result of the upsert action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpsertAction
     */

    public UpsertRowsResult withUpsertAction(String upsertAction) {
        setUpsertAction(upsertAction);
        return this;
    }

    /**
     * <p>
     * The result of the upsert action.
     * </p>
     * 
     * @param upsertAction
     *        The result of the upsert action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpsertAction
     */

    public UpsertRowsResult withUpsertAction(UpsertAction upsertAction) {
        this.upsertAction = upsertAction.toString();
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
        if (getRowIds() != null)
            sb.append("RowIds: ").append(getRowIds()).append(",");
        if (getUpsertAction() != null)
            sb.append("UpsertAction: ").append(getUpsertAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpsertRowsResult == false)
            return false;
        UpsertRowsResult other = (UpsertRowsResult) obj;
        if (other.getRowIds() == null ^ this.getRowIds() == null)
            return false;
        if (other.getRowIds() != null && other.getRowIds().equals(this.getRowIds()) == false)
            return false;
        if (other.getUpsertAction() == null ^ this.getUpsertAction() == null)
            return false;
        if (other.getUpsertAction() != null && other.getUpsertAction().equals(this.getUpsertAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRowIds() == null) ? 0 : getRowIds().hashCode());
        hashCode = prime * hashCode + ((getUpsertAction() == null) ? 0 : getUpsertAction().hashCode());
        return hashCode;
    }

    @Override
    public UpsertRowsResult clone() {
        try {
            return (UpsertRowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.UpsertRowsResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
