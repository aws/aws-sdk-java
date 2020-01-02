/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies an AWS Glue Data Catalog target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CatalogTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CatalogTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the database to be synchronized.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     */
    private java.util.List<String> tables;

    /**
     * <p>
     * The name of the database to be synchronized.
     * </p>
     * 
     * @param databaseName
     *        The name of the database to be synchronized.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database to be synchronized.
     * </p>
     * 
     * @return The name of the database to be synchronized.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database to be synchronized.
     * </p>
     * 
     * @param databaseName
     *        The name of the database to be synchronized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogTarget withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     * 
     * @return A list of the tables to be synchronized.
     */

    public java.util.List<String> getTables() {
        return tables;
    }

    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     * 
     * @param tables
     *        A list of the tables to be synchronized.
     */

    public void setTables(java.util.Collection<String> tables) {
        if (tables == null) {
            this.tables = null;
            return;
        }

        this.tables = new java.util.ArrayList<String>(tables);
    }

    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTables(java.util.Collection)} or {@link #withTables(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tables
     *        A list of the tables to be synchronized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogTarget withTables(String... tables) {
        if (this.tables == null) {
            setTables(new java.util.ArrayList<String>(tables.length));
        }
        for (String ele : tables) {
            this.tables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     * 
     * @param tables
     *        A list of the tables to be synchronized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogTarget withTables(java.util.Collection<String> tables) {
        setTables(tables);
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTables() != null)
            sb.append("Tables: ").append(getTables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CatalogTarget == false)
            return false;
        CatalogTarget other = (CatalogTarget) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTables() == null ^ this.getTables() == null)
            return false;
        if (other.getTables() != null && other.getTables().equals(this.getTables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTables() == null) ? 0 : getTables().hashCode());
        return hashCode;
    }

    @Override
    public CatalogTarget clone() {
        try {
            return (CatalogTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CatalogTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
