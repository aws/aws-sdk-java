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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchUpdatePartition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdatePartitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the catalog in which the partition is to be updated. Currently, this should be the Amazon Web Services
     * account ID.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the metadata database in which the partition is to be updated.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the metadata table in which the partition is to be updated.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A list of up to 100 <code>BatchUpdatePartitionRequestEntry</code> objects to update.
     * </p>
     */
    private java.util.List<BatchUpdatePartitionRequestEntry> entries;

    /**
     * <p>
     * The ID of the catalog in which the partition is to be updated. Currently, this should be the Amazon Web Services
     * account ID.
     * </p>
     * 
     * @param catalogId
     *        The ID of the catalog in which the partition is to be updated. Currently, this should be the Amazon Web
     *        Services account ID.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the catalog in which the partition is to be updated. Currently, this should be the Amazon Web Services
     * account ID.
     * </p>
     * 
     * @return The ID of the catalog in which the partition is to be updated. Currently, this should be the Amazon Web
     *         Services account ID.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the catalog in which the partition is to be updated. Currently, this should be the Amazon Web Services
     * account ID.
     * </p>
     * 
     * @param catalogId
     *        The ID of the catalog in which the partition is to be updated. Currently, this should be the Amazon Web
     *        Services account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdatePartitionRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the metadata database in which the partition is to be updated.
     * </p>
     * 
     * @param databaseName
     *        The name of the metadata database in which the partition is to be updated.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the metadata database in which the partition is to be updated.
     * </p>
     * 
     * @return The name of the metadata database in which the partition is to be updated.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the metadata database in which the partition is to be updated.
     * </p>
     * 
     * @param databaseName
     *        The name of the metadata database in which the partition is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdatePartitionRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the metadata table in which the partition is to be updated.
     * </p>
     * 
     * @param tableName
     *        The name of the metadata table in which the partition is to be updated.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the metadata table in which the partition is to be updated.
     * </p>
     * 
     * @return The name of the metadata table in which the partition is to be updated.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the metadata table in which the partition is to be updated.
     * </p>
     * 
     * @param tableName
     *        The name of the metadata table in which the partition is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdatePartitionRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A list of up to 100 <code>BatchUpdatePartitionRequestEntry</code> objects to update.
     * </p>
     * 
     * @return A list of up to 100 <code>BatchUpdatePartitionRequestEntry</code> objects to update.
     */

    public java.util.List<BatchUpdatePartitionRequestEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * A list of up to 100 <code>BatchUpdatePartitionRequestEntry</code> objects to update.
     * </p>
     * 
     * @param entries
     *        A list of up to 100 <code>BatchUpdatePartitionRequestEntry</code> objects to update.
     */

    public void setEntries(java.util.Collection<BatchUpdatePartitionRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<BatchUpdatePartitionRequestEntry>(entries);
    }

    /**
     * <p>
     * A list of up to 100 <code>BatchUpdatePartitionRequestEntry</code> objects to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        A list of up to 100 <code>BatchUpdatePartitionRequestEntry</code> objects to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdatePartitionRequest withEntries(BatchUpdatePartitionRequestEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<BatchUpdatePartitionRequestEntry>(entries.length));
        }
        for (BatchUpdatePartitionRequestEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 <code>BatchUpdatePartitionRequestEntry</code> objects to update.
     * </p>
     * 
     * @param entries
     *        A list of up to 100 <code>BatchUpdatePartitionRequestEntry</code> objects to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdatePartitionRequest withEntries(java.util.Collection<BatchUpdatePartitionRequestEntry> entries) {
        setEntries(entries);
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
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdatePartitionRequest == false)
            return false;
        BatchUpdatePartitionRequest other = (BatchUpdatePartitionRequest) obj;
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
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
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
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdatePartitionRequest clone() {
        return (BatchUpdatePartitionRequest) super.clone();
    }

}
