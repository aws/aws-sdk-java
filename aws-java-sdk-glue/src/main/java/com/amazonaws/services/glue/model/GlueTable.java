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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The database and table in the Glue Data Catalog that is used for input or output data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GlueTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlueTable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A database name in the Glue Data Catalog.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A table name in the Glue Data Catalog.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A unique identifier for the Glue Data Catalog.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the connection to the Glue Data Catalog.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * Additional options for the table. Currently there are two keys supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pushDownPredicate</code>: to filter on partitions without having to list and read all the files in your
     * dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>catalogPartitionPredicate</code>: to use server-side partition pruning using partition indexes in the Glue
     * Data Catalog.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> additionalOptions;

    /**
     * <p>
     * A database name in the Glue Data Catalog.
     * </p>
     * 
     * @param databaseName
     *        A database name in the Glue Data Catalog.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * A database name in the Glue Data Catalog.
     * </p>
     * 
     * @return A database name in the Glue Data Catalog.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * A database name in the Glue Data Catalog.
     * </p>
     * 
     * @param databaseName
     *        A database name in the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueTable withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A table name in the Glue Data Catalog.
     * </p>
     * 
     * @param tableName
     *        A table name in the Glue Data Catalog.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * A table name in the Glue Data Catalog.
     * </p>
     * 
     * @return A table name in the Glue Data Catalog.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * A table name in the Glue Data Catalog.
     * </p>
     * 
     * @param tableName
     *        A table name in the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueTable withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the Glue Data Catalog.
     * </p>
     * 
     * @param catalogId
     *        A unique identifier for the Glue Data Catalog.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * A unique identifier for the Glue Data Catalog.
     * </p>
     * 
     * @return A unique identifier for the Glue Data Catalog.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * A unique identifier for the Glue Data Catalog.
     * </p>
     * 
     * @param catalogId
     *        A unique identifier for the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueTable withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the connection to the Glue Data Catalog.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to the Glue Data Catalog.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection to the Glue Data Catalog.
     * </p>
     * 
     * @return The name of the connection to the Glue Data Catalog.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection to the Glue Data Catalog.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueTable withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * Additional options for the table. Currently there are two keys supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pushDownPredicate</code>: to filter on partitions without having to list and read all the files in your
     * dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>catalogPartitionPredicate</code>: to use server-side partition pruning using partition indexes in the Glue
     * Data Catalog.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Additional options for the table. Currently there are two keys supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>pushDownPredicate</code>: to filter on partitions without having to list and read all the files in
     *         your dataset.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>catalogPartitionPredicate</code>: to use server-side partition pruning using partition indexes in
     *         the Glue Data Catalog.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getAdditionalOptions() {
        return additionalOptions;
    }

    /**
     * <p>
     * Additional options for the table. Currently there are two keys supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pushDownPredicate</code>: to filter on partitions without having to list and read all the files in your
     * dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>catalogPartitionPredicate</code>: to use server-side partition pruning using partition indexes in the Glue
     * Data Catalog.
     * </p>
     * </li>
     * </ul>
     * 
     * @param additionalOptions
     *        Additional options for the table. Currently there are two keys supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pushDownPredicate</code>: to filter on partitions without having to list and read all the files in
     *        your dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>catalogPartitionPredicate</code>: to use server-side partition pruning using partition indexes in
     *        the Glue Data Catalog.
     *        </p>
     *        </li>
     */

    public void setAdditionalOptions(java.util.Map<String, String> additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    /**
     * <p>
     * Additional options for the table. Currently there are two keys supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pushDownPredicate</code>: to filter on partitions without having to list and read all the files in your
     * dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>catalogPartitionPredicate</code>: to use server-side partition pruning using partition indexes in the Glue
     * Data Catalog.
     * </p>
     * </li>
     * </ul>
     * 
     * @param additionalOptions
     *        Additional options for the table. Currently there are two keys supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pushDownPredicate</code>: to filter on partitions without having to list and read all the files in
     *        your dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>catalogPartitionPredicate</code>: to use server-side partition pruning using partition indexes in
     *        the Glue Data Catalog.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueTable withAdditionalOptions(java.util.Map<String, String> additionalOptions) {
        setAdditionalOptions(additionalOptions);
        return this;
    }

    /**
     * Add a single AdditionalOptions entry
     *
     * @see GlueTable#withAdditionalOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GlueTable addAdditionalOptionsEntry(String key, String value) {
        if (null == this.additionalOptions) {
            this.additionalOptions = new java.util.HashMap<String, String>();
        }
        if (this.additionalOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueTable clearAdditionalOptionsEntries() {
        this.additionalOptions = null;
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getAdditionalOptions() != null)
            sb.append("AdditionalOptions: ").append(getAdditionalOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlueTable == false)
            return false;
        GlueTable other = (GlueTable) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getAdditionalOptions() == null ^ this.getAdditionalOptions() == null)
            return false;
        if (other.getAdditionalOptions() != null && other.getAdditionalOptions().equals(this.getAdditionalOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getAdditionalOptions() == null) ? 0 : getAdditionalOptions().hashCode());
        return hashCode;
    }

    @Override
    public GlueTable clone() {
        try {
            return (GlueTable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.GlueTableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
