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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The meta data of the Glue table which serves as data catalog for the <code>OfflineStore</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DataCatalogConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataCatalogConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Glue table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name of the Glue table catalog.
     * </p>
     */
    private String catalog;
    /**
     * <p>
     * The name of the Glue table database.
     * </p>
     */
    private String database;

    /**
     * <p>
     * The name of the Glue table.
     * </p>
     * 
     * @param tableName
     *        The name of the Glue table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the Glue table.
     * </p>
     * 
     * @return The name of the Glue table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the Glue table.
     * </p>
     * 
     * @param tableName
     *        The name of the Glue table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalogConfig withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name of the Glue table catalog.
     * </p>
     * 
     * @param catalog
     *        The name of the Glue table catalog.
     */

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * The name of the Glue table catalog.
     * </p>
     * 
     * @return The name of the Glue table catalog.
     */

    public String getCatalog() {
        return this.catalog;
    }

    /**
     * <p>
     * The name of the Glue table catalog.
     * </p>
     * 
     * @param catalog
     *        The name of the Glue table catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalogConfig withCatalog(String catalog) {
        setCatalog(catalog);
        return this;
    }

    /**
     * <p>
     * The name of the Glue table database.
     * </p>
     * 
     * @param database
     *        The name of the Glue table database.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the Glue table database.
     * </p>
     * 
     * @return The name of the Glue table database.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the Glue table database.
     * </p>
     * 
     * @param database
     *        The name of the Glue table database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalogConfig withDatabase(String database) {
        setDatabase(database);
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getCatalog() != null)
            sb.append("Catalog: ").append(getCatalog()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCatalogConfig == false)
            return false;
        DataCatalogConfig other = (DataCatalogConfig) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        return hashCode;
    }

    @Override
    public DataCatalogConfig clone() {
        try {
            return (DataCatalogConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DataCatalogConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
