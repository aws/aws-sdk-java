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
 * A single row in the ResultSet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ResultRow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultRow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for a particular row.
     * </p>
     */
    private String rowId;
    /**
     * <p>
     * List of all the data cells in a row.
     * </p>
     */
    private java.util.List<DataItem> dataItems;

    /**
     * <p>
     * The ID for a particular row.
     * </p>
     * 
     * @param rowId
     *        The ID for a particular row.
     */

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    /**
     * <p>
     * The ID for a particular row.
     * </p>
     * 
     * @return The ID for a particular row.
     */

    public String getRowId() {
        return this.rowId;
    }

    /**
     * <p>
     * The ID for a particular row.
     * </p>
     * 
     * @param rowId
     *        The ID for a particular row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultRow withRowId(String rowId) {
        setRowId(rowId);
        return this;
    }

    /**
     * <p>
     * List of all the data cells in a row.
     * </p>
     * 
     * @return List of all the data cells in a row.
     */

    public java.util.List<DataItem> getDataItems() {
        return dataItems;
    }

    /**
     * <p>
     * List of all the data cells in a row.
     * </p>
     * 
     * @param dataItems
     *        List of all the data cells in a row.
     */

    public void setDataItems(java.util.Collection<DataItem> dataItems) {
        if (dataItems == null) {
            this.dataItems = null;
            return;
        }

        this.dataItems = new java.util.ArrayList<DataItem>(dataItems);
    }

    /**
     * <p>
     * List of all the data cells in a row.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataItems(java.util.Collection)} or {@link #withDataItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataItems
     *        List of all the data cells in a row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultRow withDataItems(DataItem... dataItems) {
        if (this.dataItems == null) {
            setDataItems(new java.util.ArrayList<DataItem>(dataItems.length));
        }
        for (DataItem ele : dataItems) {
            this.dataItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of all the data cells in a row.
     * </p>
     * 
     * @param dataItems
     *        List of all the data cells in a row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultRow withDataItems(java.util.Collection<DataItem> dataItems) {
        setDataItems(dataItems);
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
        if (getDataItems() != null)
            sb.append("DataItems: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultRow == false)
            return false;
        ResultRow other = (ResultRow) obj;
        if (other.getRowId() == null ^ this.getRowId() == null)
            return false;
        if (other.getRowId() != null && other.getRowId().equals(this.getRowId()) == false)
            return false;
        if (other.getDataItems() == null ^ this.getDataItems() == null)
            return false;
        if (other.getDataItems() != null && other.getDataItems().equals(this.getDataItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRowId() == null) ? 0 : getRowId().hashCode());
        hashCode = prime * hashCode + ((getDataItems() == null) ? 0 : getDataItems().hashCode());
        return hashCode;
    }

    @Override
    public ResultRow clone() {
        try {
            return (ResultRow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.ResultRowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
