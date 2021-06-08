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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The database and data catalog context in which the query execution occurs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/QueryExecutionContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryExecutionContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the database used in the query execution.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The name of the data catalog used in the query execution.
     * </p>
     */
    private String catalog;

    /**
     * <p>
     * The name of the database used in the query execution.
     * </p>
     * 
     * @param database
     *        The name of the database used in the query execution.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the database used in the query execution.
     * </p>
     * 
     * @return The name of the database used in the query execution.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the database used in the query execution.
     * </p>
     * 
     * @param database
     *        The name of the database used in the query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionContext withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The name of the data catalog used in the query execution.
     * </p>
     * 
     * @param catalog
     *        The name of the data catalog used in the query execution.
     */

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * The name of the data catalog used in the query execution.
     * </p>
     * 
     * @return The name of the data catalog used in the query execution.
     */

    public String getCatalog() {
        return this.catalog;
    }

    /**
     * <p>
     * The name of the data catalog used in the query execution.
     * </p>
     * 
     * @param catalog
     *        The name of the data catalog used in the query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionContext withCatalog(String catalog) {
        setCatalog(catalog);
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
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getCatalog() != null)
            sb.append("Catalog: ").append(getCatalog());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryExecutionContext == false)
            return false;
        QueryExecutionContext other = (QueryExecutionContext) obj;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        return hashCode;
    }

    @Override
    public QueryExecutionContext clone() {
        try {
            return (QueryExecutionContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.QueryExecutionContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
