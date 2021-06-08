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
 * An object representing the properties of a table in a workbook.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/Table" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Table implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The id of the table.
     * </p>
     */
    private String tableId;
    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;

    /**
     * <p>
     * The id of the table.
     * </p>
     * 
     * @param tableId
     *        The id of the table.
     */

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * <p>
     * The id of the table.
     * </p>
     * 
     * @return The id of the table.
     */

    public String getTableId() {
        return this.tableId;
    }

    /**
     * <p>
     * The id of the table.
     * </p>
     * 
     * @param tableId
     *        The id of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withTableId(String tableId) {
        setTableId(tableId);
        return this;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withTableName(String tableName) {
        setTableName(tableName);
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
        if (getTableId() != null)
            sb.append("TableId: ").append(getTableId()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Table == false)
            return false;
        Table other = (Table) obj;
        if (other.getTableId() == null ^ this.getTableId() == null)
            return false;
        if (other.getTableId() != null && other.getTableId().equals(this.getTableId()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableId() == null) ? 0 : getTableId().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        return hashCode;
    }

    @Override
    public Table clone() {
        try {
            return (Table) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.TableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
