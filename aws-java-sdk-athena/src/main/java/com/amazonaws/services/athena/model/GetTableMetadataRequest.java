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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetTableMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTableMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the data catalog that contains the database and table metadata to return.
     * </p>
     */
    private String catalogName;
    /**
     * <p>
     * The name of the database that contains the table metadata to return.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the table for which metadata is returned.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name of the workgroup for which the metadata is being fetched. Required if requesting an IAM Identity Center
     * enabled Glue Data Catalog.
     * </p>
     */
    private String workGroup;

    /**
     * <p>
     * The name of the data catalog that contains the database and table metadata to return.
     * </p>
     * 
     * @param catalogName
     *        The name of the data catalog that contains the database and table metadata to return.
     */

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    /**
     * <p>
     * The name of the data catalog that contains the database and table metadata to return.
     * </p>
     * 
     * @return The name of the data catalog that contains the database and table metadata to return.
     */

    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * <p>
     * The name of the data catalog that contains the database and table metadata to return.
     * </p>
     * 
     * @param catalogName
     *        The name of the data catalog that contains the database and table metadata to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableMetadataRequest withCatalogName(String catalogName) {
        setCatalogName(catalogName);
        return this;
    }

    /**
     * <p>
     * The name of the database that contains the table metadata to return.
     * </p>
     * 
     * @param databaseName
     *        The name of the database that contains the table metadata to return.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database that contains the table metadata to return.
     * </p>
     * 
     * @return The name of the database that contains the table metadata to return.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database that contains the table metadata to return.
     * </p>
     * 
     * @param databaseName
     *        The name of the database that contains the table metadata to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableMetadataRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the table for which metadata is returned.
     * </p>
     * 
     * @param tableName
     *        The name of the table for which metadata is returned.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table for which metadata is returned.
     * </p>
     * 
     * @return The name of the table for which metadata is returned.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table for which metadata is returned.
     * </p>
     * 
     * @param tableName
     *        The name of the table for which metadata is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableMetadataRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup for which the metadata is being fetched. Required if requesting an IAM Identity Center
     * enabled Glue Data Catalog.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup for which the metadata is being fetched. Required if requesting an IAM Identity
     *        Center enabled Glue Data Catalog.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The name of the workgroup for which the metadata is being fetched. Required if requesting an IAM Identity Center
     * enabled Glue Data Catalog.
     * </p>
     * 
     * @return The name of the workgroup for which the metadata is being fetched. Required if requesting an IAM Identity
     *         Center enabled Glue Data Catalog.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The name of the workgroup for which the metadata is being fetched. Required if requesting an IAM Identity Center
     * enabled Glue Data Catalog.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup for which the metadata is being fetched. Required if requesting an IAM Identity
     *        Center enabled Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableMetadataRequest withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
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
        if (getCatalogName() != null)
            sb.append("CatalogName: ").append(getCatalogName()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTableMetadataRequest == false)
            return false;
        GetTableMetadataRequest other = (GetTableMetadataRequest) obj;
        if (other.getCatalogName() == null ^ this.getCatalogName() == null)
            return false;
        if (other.getCatalogName() != null && other.getCatalogName().equals(this.getCatalogName()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogName() == null) ? 0 : getCatalogName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetTableMetadataRequest clone() {
        return (GetTableMetadataRequest) super.clone();
    }

}
