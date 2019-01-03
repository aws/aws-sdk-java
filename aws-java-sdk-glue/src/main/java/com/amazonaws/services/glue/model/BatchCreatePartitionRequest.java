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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchCreatePartition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreatePartitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the catalog in which the partion is to be created. Currently, this should be the AWS account ID.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the metadata database in which the partition is to be created.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the metadata table in which the partition is to be created.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A list of <code>PartitionInput</code> structures that define the partitions to be created.
     * </p>
     */
    private java.util.List<PartitionInput> partitionInputList;

    /**
     * <p>
     * The ID of the catalog in which the partion is to be created. Currently, this should be the AWS account ID.
     * </p>
     * 
     * @param catalogId
     *        The ID of the catalog in which the partion is to be created. Currently, this should be the AWS account ID.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the catalog in which the partion is to be created. Currently, this should be the AWS account ID.
     * </p>
     * 
     * @return The ID of the catalog in which the partion is to be created. Currently, this should be the AWS account
     *         ID.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the catalog in which the partion is to be created. Currently, this should be the AWS account ID.
     * </p>
     * 
     * @param catalogId
     *        The ID of the catalog in which the partion is to be created. Currently, this should be the AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreatePartitionRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the metadata database in which the partition is to be created.
     * </p>
     * 
     * @param databaseName
     *        The name of the metadata database in which the partition is to be created.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the metadata database in which the partition is to be created.
     * </p>
     * 
     * @return The name of the metadata database in which the partition is to be created.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the metadata database in which the partition is to be created.
     * </p>
     * 
     * @param databaseName
     *        The name of the metadata database in which the partition is to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreatePartitionRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the metadata table in which the partition is to be created.
     * </p>
     * 
     * @param tableName
     *        The name of the metadata table in which the partition is to be created.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the metadata table in which the partition is to be created.
     * </p>
     * 
     * @return The name of the metadata table in which the partition is to be created.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the metadata table in which the partition is to be created.
     * </p>
     * 
     * @param tableName
     *        The name of the metadata table in which the partition is to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreatePartitionRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A list of <code>PartitionInput</code> structures that define the partitions to be created.
     * </p>
     * 
     * @return A list of <code>PartitionInput</code> structures that define the partitions to be created.
     */

    public java.util.List<PartitionInput> getPartitionInputList() {
        return partitionInputList;
    }

    /**
     * <p>
     * A list of <code>PartitionInput</code> structures that define the partitions to be created.
     * </p>
     * 
     * @param partitionInputList
     *        A list of <code>PartitionInput</code> structures that define the partitions to be created.
     */

    public void setPartitionInputList(java.util.Collection<PartitionInput> partitionInputList) {
        if (partitionInputList == null) {
            this.partitionInputList = null;
            return;
        }

        this.partitionInputList = new java.util.ArrayList<PartitionInput>(partitionInputList);
    }

    /**
     * <p>
     * A list of <code>PartitionInput</code> structures that define the partitions to be created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionInputList(java.util.Collection)} or {@link #withPartitionInputList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param partitionInputList
     *        A list of <code>PartitionInput</code> structures that define the partitions to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreatePartitionRequest withPartitionInputList(PartitionInput... partitionInputList) {
        if (this.partitionInputList == null) {
            setPartitionInputList(new java.util.ArrayList<PartitionInput>(partitionInputList.length));
        }
        for (PartitionInput ele : partitionInputList) {
            this.partitionInputList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>PartitionInput</code> structures that define the partitions to be created.
     * </p>
     * 
     * @param partitionInputList
     *        A list of <code>PartitionInput</code> structures that define the partitions to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreatePartitionRequest withPartitionInputList(java.util.Collection<PartitionInput> partitionInputList) {
        setPartitionInputList(partitionInputList);
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
        if (getPartitionInputList() != null)
            sb.append("PartitionInputList: ").append(getPartitionInputList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreatePartitionRequest == false)
            return false;
        BatchCreatePartitionRequest other = (BatchCreatePartitionRequest) obj;
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
        if (other.getPartitionInputList() == null ^ this.getPartitionInputList() == null)
            return false;
        if (other.getPartitionInputList() != null && other.getPartitionInputList().equals(this.getPartitionInputList()) == false)
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
        hashCode = prime * hashCode + ((getPartitionInputList() == null) ? 0 : getPartitionInputList().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreatePartitionRequest clone() {
        return (BatchCreatePartitionRequest) super.clone();
    }

}
