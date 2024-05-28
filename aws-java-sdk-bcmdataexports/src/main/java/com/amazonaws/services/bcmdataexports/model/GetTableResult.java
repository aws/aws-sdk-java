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
package com.amazonaws.services.bcmdataexports.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/GetTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The table description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The schema of the table.
     * </p>
     */
    private java.util.List<Column> schema;
    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * TableProperties are additional configurations you can provide to change the data and schema of a table. Each
     * table can have different TableProperties. Tables are not required to have any TableProperties. Each table
     * property has a default value that it assumes if not specified.
     * </p>
     */
    private java.util.Map<String, String> tableProperties;

    /**
     * <p>
     * The table description.
     * </p>
     * 
     * @param description
     *        The table description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The table description.
     * </p>
     * 
     * @return The table description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The table description.
     * </p>
     * 
     * @param description
     *        The table description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The schema of the table.
     * </p>
     * 
     * @return The schema of the table.
     */

    public java.util.List<Column> getSchema() {
        return schema;
    }

    /**
     * <p>
     * The schema of the table.
     * </p>
     * 
     * @param schema
     *        The schema of the table.
     */

    public void setSchema(java.util.Collection<Column> schema) {
        if (schema == null) {
            this.schema = null;
            return;
        }

        this.schema = new java.util.ArrayList<Column>(schema);
    }

    /**
     * <p>
     * The schema of the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchema(java.util.Collection)} or {@link #withSchema(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param schema
     *        The schema of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withSchema(Column... schema) {
        if (this.schema == null) {
            setSchema(new java.util.ArrayList<Column>(schema.length));
        }
        for (Column ele : schema) {
            this.schema.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The schema of the table.
     * </p>
     * 
     * @param schema
     *        The schema of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withSchema(java.util.Collection<Column> schema) {
        setSchema(schema);
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

    public GetTableResult withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * TableProperties are additional configurations you can provide to change the data and schema of a table. Each
     * table can have different TableProperties. Tables are not required to have any TableProperties. Each table
     * property has a default value that it assumes if not specified.
     * </p>
     * 
     * @return TableProperties are additional configurations you can provide to change the data and schema of a table.
     *         Each table can have different TableProperties. Tables are not required to have any TableProperties. Each
     *         table property has a default value that it assumes if not specified.
     */

    public java.util.Map<String, String> getTableProperties() {
        return tableProperties;
    }

    /**
     * <p>
     * TableProperties are additional configurations you can provide to change the data and schema of a table. Each
     * table can have different TableProperties. Tables are not required to have any TableProperties. Each table
     * property has a default value that it assumes if not specified.
     * </p>
     * 
     * @param tableProperties
     *        TableProperties are additional configurations you can provide to change the data and schema of a table.
     *        Each table can have different TableProperties. Tables are not required to have any TableProperties. Each
     *        table property has a default value that it assumes if not specified.
     */

    public void setTableProperties(java.util.Map<String, String> tableProperties) {
        this.tableProperties = tableProperties;
    }

    /**
     * <p>
     * TableProperties are additional configurations you can provide to change the data and schema of a table. Each
     * table can have different TableProperties. Tables are not required to have any TableProperties. Each table
     * property has a default value that it assumes if not specified.
     * </p>
     * 
     * @param tableProperties
     *        TableProperties are additional configurations you can provide to change the data and schema of a table.
     *        Each table can have different TableProperties. Tables are not required to have any TableProperties. Each
     *        table property has a default value that it assumes if not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withTableProperties(java.util.Map<String, String> tableProperties) {
        setTableProperties(tableProperties);
        return this;
    }

    /**
     * Add a single TableProperties entry
     *
     * @see GetTableResult#withTableProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult addTablePropertiesEntry(String key, String value) {
        if (null == this.tableProperties) {
            this.tableProperties = new java.util.HashMap<String, String>();
        }
        if (this.tableProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tableProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TableProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult clearTablePropertiesEntries() {
        this.tableProperties = null;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getTableProperties() != null)
            sb.append("TableProperties: ").append(getTableProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTableResult == false)
            return false;
        GetTableResult other = (GetTableResult) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTableProperties() == null ^ this.getTableProperties() == null)
            return false;
        if (other.getTableProperties() != null && other.getTableProperties().equals(this.getTableProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getTableProperties() == null) ? 0 : getTableProperties().hashCode());
        return hashCode;
    }

    @Override
    public GetTableResult clone() {
        try {
            return (GetTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
