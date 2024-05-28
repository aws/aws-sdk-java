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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the direct JDBC source connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DirectJDBCSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectJDBCSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the JDBC source connection.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The database of the JDBC source connection.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The table of the JDBC source connection.
     * </p>
     */
    private String table;
    /**
     * <p>
     * The connection name of the JDBC source.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * The connection type of the JDBC source.
     * </p>
     */
    private String connectionType;
    /**
     * <p>
     * The temp directory of the JDBC Redshift source.
     * </p>
     */
    private String redshiftTmpDir;

    /**
     * <p>
     * The name of the JDBC source connection.
     * </p>
     * 
     * @param name
     *        The name of the JDBC source connection.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the JDBC source connection.
     * </p>
     * 
     * @return The name of the JDBC source connection.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the JDBC source connection.
     * </p>
     * 
     * @param name
     *        The name of the JDBC source connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectJDBCSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The database of the JDBC source connection.
     * </p>
     * 
     * @param database
     *        The database of the JDBC source connection.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The database of the JDBC source connection.
     * </p>
     * 
     * @return The database of the JDBC source connection.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The database of the JDBC source connection.
     * </p>
     * 
     * @param database
     *        The database of the JDBC source connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectJDBCSource withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The table of the JDBC source connection.
     * </p>
     * 
     * @param table
     *        The table of the JDBC source connection.
     */

    public void setTable(String table) {
        this.table = table;
    }

    /**
     * <p>
     * The table of the JDBC source connection.
     * </p>
     * 
     * @return The table of the JDBC source connection.
     */

    public String getTable() {
        return this.table;
    }

    /**
     * <p>
     * The table of the JDBC source connection.
     * </p>
     * 
     * @param table
     *        The table of the JDBC source connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectJDBCSource withTable(String table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * The connection name of the JDBC source.
     * </p>
     * 
     * @param connectionName
     *        The connection name of the JDBC source.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The connection name of the JDBC source.
     * </p>
     * 
     * @return The connection name of the JDBC source.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The connection name of the JDBC source.
     * </p>
     * 
     * @param connectionName
     *        The connection name of the JDBC source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectJDBCSource withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * The connection type of the JDBC source.
     * </p>
     * 
     * @param connectionType
     *        The connection type of the JDBC source.
     * @see JDBCConnectionType
     */

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The connection type of the JDBC source.
     * </p>
     * 
     * @return The connection type of the JDBC source.
     * @see JDBCConnectionType
     */

    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * <p>
     * The connection type of the JDBC source.
     * </p>
     * 
     * @param connectionType
     *        The connection type of the JDBC source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JDBCConnectionType
     */

    public DirectJDBCSource withConnectionType(String connectionType) {
        setConnectionType(connectionType);
        return this;
    }

    /**
     * <p>
     * The connection type of the JDBC source.
     * </p>
     * 
     * @param connectionType
     *        The connection type of the JDBC source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JDBCConnectionType
     */

    public DirectJDBCSource withConnectionType(JDBCConnectionType connectionType) {
        this.connectionType = connectionType.toString();
        return this;
    }

    /**
     * <p>
     * The temp directory of the JDBC Redshift source.
     * </p>
     * 
     * @param redshiftTmpDir
     *        The temp directory of the JDBC Redshift source.
     */

    public void setRedshiftTmpDir(String redshiftTmpDir) {
        this.redshiftTmpDir = redshiftTmpDir;
    }

    /**
     * <p>
     * The temp directory of the JDBC Redshift source.
     * </p>
     * 
     * @return The temp directory of the JDBC Redshift source.
     */

    public String getRedshiftTmpDir() {
        return this.redshiftTmpDir;
    }

    /**
     * <p>
     * The temp directory of the JDBC Redshift source.
     * </p>
     * 
     * @param redshiftTmpDir
     *        The temp directory of the JDBC Redshift source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectJDBCSource withRedshiftTmpDir(String redshiftTmpDir) {
        setRedshiftTmpDir(redshiftTmpDir);
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
            sb.append("Table: ").append(getTable()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getConnectionType() != null)
            sb.append("ConnectionType: ").append(getConnectionType()).append(",");
        if (getRedshiftTmpDir() != null)
            sb.append("RedshiftTmpDir: ").append(getRedshiftTmpDir());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectJDBCSource == false)
            return false;
        DirectJDBCSource other = (DirectJDBCSource) obj;
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
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        if (other.getRedshiftTmpDir() == null ^ this.getRedshiftTmpDir() == null)
            return false;
        if (other.getRedshiftTmpDir() != null && other.getRedshiftTmpDir().equals(this.getRedshiftTmpDir()) == false)
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
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        hashCode = prime * hashCode + ((getRedshiftTmpDir() == null) ? 0 : getRedshiftTmpDir().hashCode());
        return hashCode;
    }

    @Override
    public DirectJDBCSource clone() {
        try {
            return (DirectJDBCSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DirectJDBCSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
