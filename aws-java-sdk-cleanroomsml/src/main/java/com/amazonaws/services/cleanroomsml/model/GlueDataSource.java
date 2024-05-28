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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the Glue data source that contains the training data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GlueDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlueDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Glue catalog that contains the training data.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The Glue database that contains the training data.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The Glue table that contains the training data.
     * </p>
     */
    private String tableName;

    /**
     * <p>
     * The Glue catalog that contains the training data.
     * </p>
     * 
     * @param catalogId
     *        The Glue catalog that contains the training data.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The Glue catalog that contains the training data.
     * </p>
     * 
     * @return The Glue catalog that contains the training data.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The Glue catalog that contains the training data.
     * </p>
     * 
     * @param catalogId
     *        The Glue catalog that contains the training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueDataSource withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The Glue database that contains the training data.
     * </p>
     * 
     * @param databaseName
     *        The Glue database that contains the training data.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The Glue database that contains the training data.
     * </p>
     * 
     * @return The Glue database that contains the training data.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The Glue database that contains the training data.
     * </p>
     * 
     * @param databaseName
     *        The Glue database that contains the training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueDataSource withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The Glue table that contains the training data.
     * </p>
     * 
     * @param tableName
     *        The Glue table that contains the training data.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The Glue table that contains the training data.
     * </p>
     * 
     * @return The Glue table that contains the training data.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The Glue table that contains the training data.
     * </p>
     * 
     * @param tableName
     *        The Glue table that contains the training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueDataSource withTableName(String tableName) {
        setTableName(tableName);
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
            sb.append("TableName: ").append(getTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlueDataSource == false)
            return false;
        GlueDataSource other = (GlueDataSource) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        return hashCode;
    }

    @Override
    public GlueDataSource clone() {
        try {
            return (GlueDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.GlueDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
