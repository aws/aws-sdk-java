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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog where the table resides. If none is supplied, the AWS account ID is used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the catalog database where the tables to delete reside. For Hive compatibility, this name is entirely
     * lowercase.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A list of the table to delete.
     * </p>
     */
    private java.util.List<String> tablesToDelete;

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

    public BatchDeleteTableRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the catalog database where the tables to delete reside. For Hive compatibility, this name is entirely
     * lowercase.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the tables to delete reside. For Hive compatibility, this name is
     *        entirely lowercase.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the tables to delete reside. For Hive compatibility, this name is entirely
     * lowercase.
     * </p>
     * 
     * @return The name of the catalog database where the tables to delete reside. For Hive compatibility, this name is
     *         entirely lowercase.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the tables to delete reside. For Hive compatibility, this name is entirely
     * lowercase.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the tables to delete reside. For Hive compatibility, this name is
     *        entirely lowercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A list of the table to delete.
     * </p>
     * 
     * @return A list of the table to delete.
     */

    public java.util.List<String> getTablesToDelete() {
        return tablesToDelete;
    }

    /**
     * <p>
     * A list of the table to delete.
     * </p>
     * 
     * @param tablesToDelete
     *        A list of the table to delete.
     */

    public void setTablesToDelete(java.util.Collection<String> tablesToDelete) {
        if (tablesToDelete == null) {
            this.tablesToDelete = null;
            return;
        }

        this.tablesToDelete = new java.util.ArrayList<String>(tablesToDelete);
    }

    /**
     * <p>
     * A list of the table to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTablesToDelete(java.util.Collection)} or {@link #withTablesToDelete(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tablesToDelete
     *        A list of the table to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableRequest withTablesToDelete(String... tablesToDelete) {
        if (this.tablesToDelete == null) {
            setTablesToDelete(new java.util.ArrayList<String>(tablesToDelete.length));
        }
        for (String ele : tablesToDelete) {
            this.tablesToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the table to delete.
     * </p>
     * 
     * @param tablesToDelete
     *        A list of the table to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableRequest withTablesToDelete(java.util.Collection<String> tablesToDelete) {
        setTablesToDelete(tablesToDelete);
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
        if (getTablesToDelete() != null)
            sb.append("TablesToDelete: ").append(getTablesToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteTableRequest == false)
            return false;
        BatchDeleteTableRequest other = (BatchDeleteTableRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTablesToDelete() == null ^ this.getTablesToDelete() == null)
            return false;
        if (other.getTablesToDelete() != null && other.getTablesToDelete().equals(this.getTablesToDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTablesToDelete() == null) ? 0 : getTablesToDelete().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteTableRequest clone() {
        return (BatchDeleteTableRequest) super.clone();
    }

}
