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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateTableStorageOptimizer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTableStorageOptimizerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Catalog ID of the table.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * Name of the database where the table is present.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Name of the table for which to enable the storage optimizer.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Name of the table for which to enable the storage optimizer.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, String>> storageOptimizerConfig;

    /**
     * <p>
     * The Catalog ID of the table.
     * </p>
     * 
     * @param catalogId
     *        The Catalog ID of the table.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The Catalog ID of the table.
     * </p>
     * 
     * @return The Catalog ID of the table.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The Catalog ID of the table.
     * </p>
     * 
     * @param catalogId
     *        The Catalog ID of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableStorageOptimizerRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * Name of the database where the table is present.
     * </p>
     * 
     * @param databaseName
     *        Name of the database where the table is present.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Name of the database where the table is present.
     * </p>
     * 
     * @return Name of the database where the table is present.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * Name of the database where the table is present.
     * </p>
     * 
     * @param databaseName
     *        Name of the database where the table is present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableStorageOptimizerRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Name of the table for which to enable the storage optimizer.
     * </p>
     * 
     * @param tableName
     *        Name of the table for which to enable the storage optimizer.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Name of the table for which to enable the storage optimizer.
     * </p>
     * 
     * @return Name of the table for which to enable the storage optimizer.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * Name of the table for which to enable the storage optimizer.
     * </p>
     * 
     * @param tableName
     *        Name of the table for which to enable the storage optimizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableStorageOptimizerRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * Name of the table for which to enable the storage optimizer.
     * </p>
     * 
     * @return Name of the table for which to enable the storage optimizer.
     */

    public java.util.Map<String, java.util.Map<String, String>> getStorageOptimizerConfig() {
        return storageOptimizerConfig;
    }

    /**
     * <p>
     * Name of the table for which to enable the storage optimizer.
     * </p>
     * 
     * @param storageOptimizerConfig
     *        Name of the table for which to enable the storage optimizer.
     */

    public void setStorageOptimizerConfig(java.util.Map<String, java.util.Map<String, String>> storageOptimizerConfig) {
        this.storageOptimizerConfig = storageOptimizerConfig;
    }

    /**
     * <p>
     * Name of the table for which to enable the storage optimizer.
     * </p>
     * 
     * @param storageOptimizerConfig
     *        Name of the table for which to enable the storage optimizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableStorageOptimizerRequest withStorageOptimizerConfig(java.util.Map<String, java.util.Map<String, String>> storageOptimizerConfig) {
        setStorageOptimizerConfig(storageOptimizerConfig);
        return this;
    }

    /**
     * Add a single StorageOptimizerConfig entry
     *
     * @see UpdateTableStorageOptimizerRequest#withStorageOptimizerConfig
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableStorageOptimizerRequest addStorageOptimizerConfigEntry(String key, java.util.Map<String, String> value) {
        if (null == this.storageOptimizerConfig) {
            this.storageOptimizerConfig = new java.util.HashMap<String, java.util.Map<String, String>>();
        }
        if (this.storageOptimizerConfig.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.storageOptimizerConfig.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StorageOptimizerConfig.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableStorageOptimizerRequest clearStorageOptimizerConfigEntries() {
        this.storageOptimizerConfig = null;
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getStorageOptimizerConfig() != null)
            sb.append("StorageOptimizerConfig: ").append(getStorageOptimizerConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTableStorageOptimizerRequest == false)
            return false;
        UpdateTableStorageOptimizerRequest other = (UpdateTableStorageOptimizerRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getStorageOptimizerConfig() == null ^ this.getStorageOptimizerConfig() == null)
            return false;
        if (other.getStorageOptimizerConfig() != null && other.getStorageOptimizerConfig().equals(this.getStorageOptimizerConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getStorageOptimizerConfig() == null) ? 0 : getStorageOptimizerConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTableStorageOptimizerRequest clone() {
        return (UpdateTableStorageOptimizerRequest) super.clone();
    }

}
