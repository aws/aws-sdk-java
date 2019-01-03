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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely
     * lowercase.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * An updated <code>TableInput</code> object to define the metadata table in the catalog.
     * </p>
     */
    private TableInput tableInput;
    /**
     * <p>
     * By default, <code>UpdateTable</code> always creates an archived version of the table before updating it. If
     * <code>skipArchive</code> is set to true, however, <code>UpdateTable</code> does not create the archived version.
     * </p>
     */
    private Boolean skipArchive;

    /**
     * <p>
     * The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by
     *        default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by
     *         default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by
     *        default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely
     * lowercase.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely
     *        lowercase.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely
     * lowercase.
     * </p>
     * 
     * @return The name of the catalog database in which the table resides. For Hive compatibility, this name is
     *         entirely lowercase.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely
     * lowercase.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database in which the table resides. For Hive compatibility, this name is entirely
     *        lowercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * An updated <code>TableInput</code> object to define the metadata table in the catalog.
     * </p>
     * 
     * @param tableInput
     *        An updated <code>TableInput</code> object to define the metadata table in the catalog.
     */

    public void setTableInput(TableInput tableInput) {
        this.tableInput = tableInput;
    }

    /**
     * <p>
     * An updated <code>TableInput</code> object to define the metadata table in the catalog.
     * </p>
     * 
     * @return An updated <code>TableInput</code> object to define the metadata table in the catalog.
     */

    public TableInput getTableInput() {
        return this.tableInput;
    }

    /**
     * <p>
     * An updated <code>TableInput</code> object to define the metadata table in the catalog.
     * </p>
     * 
     * @param tableInput
     *        An updated <code>TableInput</code> object to define the metadata table in the catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withTableInput(TableInput tableInput) {
        setTableInput(tableInput);
        return this;
    }

    /**
     * <p>
     * By default, <code>UpdateTable</code> always creates an archived version of the table before updating it. If
     * <code>skipArchive</code> is set to true, however, <code>UpdateTable</code> does not create the archived version.
     * </p>
     * 
     * @param skipArchive
     *        By default, <code>UpdateTable</code> always creates an archived version of the table before updating it.
     *        If <code>skipArchive</code> is set to true, however, <code>UpdateTable</code> does not create the archived
     *        version.
     */

    public void setSkipArchive(Boolean skipArchive) {
        this.skipArchive = skipArchive;
    }

    /**
     * <p>
     * By default, <code>UpdateTable</code> always creates an archived version of the table before updating it. If
     * <code>skipArchive</code> is set to true, however, <code>UpdateTable</code> does not create the archived version.
     * </p>
     * 
     * @return By default, <code>UpdateTable</code> always creates an archived version of the table before updating it.
     *         If <code>skipArchive</code> is set to true, however, <code>UpdateTable</code> does not create the
     *         archived version.
     */

    public Boolean getSkipArchive() {
        return this.skipArchive;
    }

    /**
     * <p>
     * By default, <code>UpdateTable</code> always creates an archived version of the table before updating it. If
     * <code>skipArchive</code> is set to true, however, <code>UpdateTable</code> does not create the archived version.
     * </p>
     * 
     * @param skipArchive
     *        By default, <code>UpdateTable</code> always creates an archived version of the table before updating it.
     *        If <code>skipArchive</code> is set to true, however, <code>UpdateTable</code> does not create the archived
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withSkipArchive(Boolean skipArchive) {
        setSkipArchive(skipArchive);
        return this;
    }

    /**
     * <p>
     * By default, <code>UpdateTable</code> always creates an archived version of the table before updating it. If
     * <code>skipArchive</code> is set to true, however, <code>UpdateTable</code> does not create the archived version.
     * </p>
     * 
     * @return By default, <code>UpdateTable</code> always creates an archived version of the table before updating it.
     *         If <code>skipArchive</code> is set to true, however, <code>UpdateTable</code> does not create the
     *         archived version.
     */

    public Boolean isSkipArchive() {
        return this.skipArchive;
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
            sb.append("TableInput: ").append(getTableInput()).append(",");
        if (getSkipArchive() != null)
            sb.append("SkipArchive: ").append(getSkipArchive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTableRequest == false)
            return false;
        UpdateTableRequest other = (UpdateTableRequest) obj;
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
        if (other.getSkipArchive() == null ^ this.getSkipArchive() == null)
            return false;
        if (other.getSkipArchive() != null && other.getSkipArchive().equals(this.getSkipArchive()) == false)
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
        hashCode = prime * hashCode + ((getSkipArchive() == null) ? 0 : getSkipArchive().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTableRequest clone() {
        return (UpdateTableRequest) super.clone();
    }

}
