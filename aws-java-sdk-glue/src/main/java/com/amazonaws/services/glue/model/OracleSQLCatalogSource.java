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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an Oracle data source in the Glue Data Catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/OracleSQLCatalogSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OracleSQLCatalogSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the database to read from.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The name of the table in the database to read from.
     * </p>
     */
    private String table;

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @return The name of the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSQLCatalogSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the database to read from.
     * </p>
     * 
     * @param database
     *        The name of the database to read from.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the database to read from.
     * </p>
     * 
     * @return The name of the database to read from.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the database to read from.
     * </p>
     * 
     * @param database
     *        The name of the database to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSQLCatalogSource withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The name of the table in the database to read from.
     * </p>
     * 
     * @param table
     *        The name of the table in the database to read from.
     */

    public void setTable(String table) {
        this.table = table;
    }

    /**
     * <p>
     * The name of the table in the database to read from.
     * </p>
     * 
     * @return The name of the table in the database to read from.
     */

    public String getTable() {
        return this.table;
    }

    /**
     * <p>
     * The name of the table in the database to read from.
     * </p>
     * 
     * @param table
     *        The name of the table in the database to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSQLCatalogSource withTable(String table) {
        setTable(table);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OracleSQLCatalogSource == false)
            return false;
        OracleSQLCatalogSource other = (OracleSQLCatalogSource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        return hashCode;
    }

    @Override
    public OracleSQLCatalogSource clone() {
        try {
            return (OracleSQLCatalogSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.OracleSQLCatalogSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
