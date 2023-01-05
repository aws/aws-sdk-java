/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Definition for a schema on a tabular Dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/SchemaDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of column definitions.
     * </p>
     */
    private java.util.List<ColumnDefinition> columns;
    /**
     * <p>
     * List of column names used for primary key.
     * </p>
     */
    private java.util.List<String> primaryKeyColumns;

    /**
     * <p>
     * List of column definitions.
     * </p>
     * 
     * @return List of column definitions.
     */

    public java.util.List<ColumnDefinition> getColumns() {
        return columns;
    }

    /**
     * <p>
     * List of column definitions.
     * </p>
     * 
     * @param columns
     *        List of column definitions.
     */

    public void setColumns(java.util.Collection<ColumnDefinition> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<ColumnDefinition>(columns);
    }

    /**
     * <p>
     * List of column definitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        List of column definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withColumns(ColumnDefinition... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<ColumnDefinition>(columns.length));
        }
        for (ColumnDefinition ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of column definitions.
     * </p>
     * 
     * @param columns
     *        List of column definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withColumns(java.util.Collection<ColumnDefinition> columns) {
        setColumns(columns);
        return this;
    }

    /**
     * <p>
     * List of column names used for primary key.
     * </p>
     * 
     * @return List of column names used for primary key.
     */

    public java.util.List<String> getPrimaryKeyColumns() {
        return primaryKeyColumns;
    }

    /**
     * <p>
     * List of column names used for primary key.
     * </p>
     * 
     * @param primaryKeyColumns
     *        List of column names used for primary key.
     */

    public void setPrimaryKeyColumns(java.util.Collection<String> primaryKeyColumns) {
        if (primaryKeyColumns == null) {
            this.primaryKeyColumns = null;
            return;
        }

        this.primaryKeyColumns = new java.util.ArrayList<String>(primaryKeyColumns);
    }

    /**
     * <p>
     * List of column names used for primary key.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrimaryKeyColumns(java.util.Collection)} or {@link #withPrimaryKeyColumns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param primaryKeyColumns
     *        List of column names used for primary key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withPrimaryKeyColumns(String... primaryKeyColumns) {
        if (this.primaryKeyColumns == null) {
            setPrimaryKeyColumns(new java.util.ArrayList<String>(primaryKeyColumns.length));
        }
        for (String ele : primaryKeyColumns) {
            this.primaryKeyColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of column names used for primary key.
     * </p>
     * 
     * @param primaryKeyColumns
     *        List of column names used for primary key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaDefinition withPrimaryKeyColumns(java.util.Collection<String> primaryKeyColumns) {
        setPrimaryKeyColumns(primaryKeyColumns);
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
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns()).append(",");
        if (getPrimaryKeyColumns() != null)
            sb.append("PrimaryKeyColumns: ").append(getPrimaryKeyColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaDefinition == false)
            return false;
        SchemaDefinition other = (SchemaDefinition) obj;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        if (other.getPrimaryKeyColumns() == null ^ this.getPrimaryKeyColumns() == null)
            return false;
        if (other.getPrimaryKeyColumns() != null && other.getPrimaryKeyColumns().equals(this.getPrimaryKeyColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        hashCode = prime * hashCode + ((getPrimaryKeyColumns() == null) ? 0 : getPrimaryKeyColumns().hashCode());
        return hashCode;
    }

    @Override
    public SchemaDefinition clone() {
        try {
            return (SchemaDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspacedata.model.transform.SchemaDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
