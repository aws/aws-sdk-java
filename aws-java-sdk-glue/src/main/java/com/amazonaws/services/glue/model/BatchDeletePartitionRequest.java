/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeletePartition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeletePartitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog where the partition to be deleted resides. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the catalog database in which the table in question resides.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the table where the partitions to be deleted is located.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A list of <code>PartitionInput</code> structures that define the partitions to be deleted.
     * </p>
     */
    private java.util.List<PartitionValueList> partitionsToDelete;

    /**
     * <p>
     * The ID of the Data Catalog where the partition to be deleted resides. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the partition to be deleted resides. If none is supplied, the AWS account
     *        ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partition to be deleted resides. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the partition to be deleted resides. If none is supplied, the AWS
     *         account ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partition to be deleted resides. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the partition to be deleted resides. If none is supplied, the AWS account
     *        ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeletePartitionRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the catalog database in which the table in question resides.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database in which the table in question resides.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database in which the table in question resides.
     * </p>
     * 
     * @return The name of the catalog database in which the table in question resides.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the catalog database in which the table in question resides.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database in which the table in question resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeletePartitionRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the table where the partitions to be deleted is located.
     * </p>
     * 
     * @param tableName
     *        The name of the table where the partitions to be deleted is located.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table where the partitions to be deleted is located.
     * </p>
     * 
     * @return The name of the table where the partitions to be deleted is located.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table where the partitions to be deleted is located.
     * </p>
     * 
     * @param tableName
     *        The name of the table where the partitions to be deleted is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeletePartitionRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A list of <code>PartitionInput</code> structures that define the partitions to be deleted.
     * </p>
     * 
     * @return A list of <code>PartitionInput</code> structures that define the partitions to be deleted.
     */

    public java.util.List<PartitionValueList> getPartitionsToDelete() {
        return partitionsToDelete;
    }

    /**
     * <p>
     * A list of <code>PartitionInput</code> structures that define the partitions to be deleted.
     * </p>
     * 
     * @param partitionsToDelete
     *        A list of <code>PartitionInput</code> structures that define the partitions to be deleted.
     */

    public void setPartitionsToDelete(java.util.Collection<PartitionValueList> partitionsToDelete) {
        if (partitionsToDelete == null) {
            this.partitionsToDelete = null;
            return;
        }

        this.partitionsToDelete = new java.util.ArrayList<PartitionValueList>(partitionsToDelete);
    }

    /**
     * <p>
     * A list of <code>PartitionInput</code> structures that define the partitions to be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionsToDelete(java.util.Collection)} or {@link #withPartitionsToDelete(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param partitionsToDelete
     *        A list of <code>PartitionInput</code> structures that define the partitions to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeletePartitionRequest withPartitionsToDelete(PartitionValueList... partitionsToDelete) {
        if (this.partitionsToDelete == null) {
            setPartitionsToDelete(new java.util.ArrayList<PartitionValueList>(partitionsToDelete.length));
        }
        for (PartitionValueList ele : partitionsToDelete) {
            this.partitionsToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>PartitionInput</code> structures that define the partitions to be deleted.
     * </p>
     * 
     * @param partitionsToDelete
     *        A list of <code>PartitionInput</code> structures that define the partitions to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeletePartitionRequest withPartitionsToDelete(java.util.Collection<PartitionValueList> partitionsToDelete) {
        setPartitionsToDelete(partitionsToDelete);
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
        if (getPartitionsToDelete() != null)
            sb.append("PartitionsToDelete: ").append(getPartitionsToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeletePartitionRequest == false)
            return false;
        BatchDeletePartitionRequest other = (BatchDeletePartitionRequest) obj;
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
        if (other.getPartitionsToDelete() == null ^ this.getPartitionsToDelete() == null)
            return false;
        if (other.getPartitionsToDelete() != null && other.getPartitionsToDelete().equals(this.getPartitionsToDelete()) == false)
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
        hashCode = prime * hashCode + ((getPartitionsToDelete() == null) ? 0 : getPartitionsToDelete().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeletePartitionRequest clone() {
        return (BatchDeletePartitionRequest) super.clone();
    }

}
