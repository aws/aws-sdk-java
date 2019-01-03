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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog in which to create the <code>Table</code>. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The catalog database in which to create the new table. For Hive compatibility, this name is entirely lowercase.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The <code>TableInput</code> object that defines the metadata table to create in the catalog.
     * </p>
     */
    private TableInput tableInput;

    /**
     * <p>
     * The ID of the Data Catalog in which to create the <code>Table</code>. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which to create the <code>Table</code>. If none is supplied, the AWS account
     *        ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which to create the <code>Table</code>. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog in which to create the <code>Table</code>. If none is supplied, the AWS
     *         account ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which to create the <code>Table</code>. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which to create the <code>Table</code>. If none is supplied, the AWS account
     *        ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The catalog database in which to create the new table. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @param databaseName
     *        The catalog database in which to create the new table. For Hive compatibility, this name is entirely
     *        lowercase.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The catalog database in which to create the new table. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @return The catalog database in which to create the new table. For Hive compatibility, this name is entirely
     *         lowercase.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The catalog database in which to create the new table. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @param databaseName
     *        The catalog database in which to create the new table. For Hive compatibility, this name is entirely
     *        lowercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The <code>TableInput</code> object that defines the metadata table to create in the catalog.
     * </p>
     * 
     * @param tableInput
     *        The <code>TableInput</code> object that defines the metadata table to create in the catalog.
     */

    public void setTableInput(TableInput tableInput) {
        this.tableInput = tableInput;
    }

    /**
     * <p>
     * The <code>TableInput</code> object that defines the metadata table to create in the catalog.
     * </p>
     * 
     * @return The <code>TableInput</code> object that defines the metadata table to create in the catalog.
     */

    public TableInput getTableInput() {
        return this.tableInput;
    }

    /**
     * <p>
     * The <code>TableInput</code> object that defines the metadata table to create in the catalog.
     * </p>
     * 
     * @param tableInput
     *        The <code>TableInput</code> object that defines the metadata table to create in the catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withTableInput(TableInput tableInput) {
        setTableInput(tableInput);
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
        if (getTableInput() != null)
            sb.append("TableInput: ").append(getTableInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTableRequest == false)
            return false;
        CreateTableRequest other = (CreateTableRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableInput() == null ^ this.getTableInput() == null)
            return false;
        if (other.getTableInput() != null && other.getTableInput().equals(this.getTableInput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableInput() == null) ? 0 : getTableInput().hashCode());
        return hashCode;
    }

    @Override
    public CreateTableRequest clone() {
        return (CreateTableRequest) super.clone();
    }

}
