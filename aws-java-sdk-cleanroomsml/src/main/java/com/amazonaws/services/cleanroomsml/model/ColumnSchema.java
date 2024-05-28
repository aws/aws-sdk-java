/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata for a column.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ColumnSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnSchema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a column.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * The data type of column.
     * </p>
     */
    private java.util.List<String> columnTypes;

    /**
     * <p>
     * The name of a column.
     * </p>
     * 
     * @param columnName
     *        The name of a column.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The name of a column.
     * </p>
     * 
     * @return The name of a column.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * The name of a column.
     * </p>
     * 
     * @param columnName
     *        The name of a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnSchema withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * The data type of column.
     * </p>
     * 
     * @return The data type of column.
     * @see ColumnType
     */

    public java.util.List<String> getColumnTypes() {
        return columnTypes;
    }

    /**
     * <p>
     * The data type of column.
     * </p>
     * 
     * @param columnTypes
     *        The data type of column.
     * @see ColumnType
     */

    public void setColumnTypes(java.util.Collection<String> columnTypes) {
        if (columnTypes == null) {
            this.columnTypes = null;
            return;
        }

        this.columnTypes = new java.util.ArrayList<String>(columnTypes);
    }

    /**
     * <p>
     * The data type of column.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnTypes(java.util.Collection)} or {@link #withColumnTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param columnTypes
     *        The data type of column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnType
     */

    public ColumnSchema withColumnTypes(String... columnTypes) {
        if (this.columnTypes == null) {
            setColumnTypes(new java.util.ArrayList<String>(columnTypes.length));
        }
        for (String ele : columnTypes) {
            this.columnTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data type of column.
     * </p>
     * 
     * @param columnTypes
     *        The data type of column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnType
     */

    public ColumnSchema withColumnTypes(java.util.Collection<String> columnTypes) {
        setColumnTypes(columnTypes);
        return this;
    }

    /**
     * <p>
     * The data type of column.
     * </p>
     * 
     * @param columnTypes
     *        The data type of column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnType
     */

    public ColumnSchema withColumnTypes(ColumnType... columnTypes) {
        java.util.ArrayList<String> columnTypesCopy = new java.util.ArrayList<String>(columnTypes.length);
        for (ColumnType value : columnTypes) {
            columnTypesCopy.add(value.toString());
        }
        if (getColumnTypes() == null) {
            setColumnTypes(columnTypesCopy);
        } else {
            getColumnTypes().addAll(columnTypesCopy);
        }
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
        if (getColumnName() != null)
            sb.append("ColumnName: ").append(getColumnName()).append(",");
        if (getColumnTypes() != null)
            sb.append("ColumnTypes: ").append(getColumnTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnSchema == false)
            return false;
        ColumnSchema other = (ColumnSchema) obj;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getColumnTypes() == null ^ this.getColumnTypes() == null)
            return false;
        if (other.getColumnTypes() != null && other.getColumnTypes().equals(this.getColumnTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getColumnTypes() == null) ? 0 : getColumnTypes().hashCode());
        return hashCode;
    }

    @Override
    public ColumnSchema clone() {
        try {
            return (ColumnSchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.ColumnSchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
