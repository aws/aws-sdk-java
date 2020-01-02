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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the information necessary to connect a database to an index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DatabaseConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of database engine that runs the database.
     * </p>
     */
    private String databaseEngineType;
    /**
     * <p>
     * The information necessary to connect to a database.
     * </p>
     */
    private ConnectionConfiguration connectionConfiguration;

    private DataSourceVpcConfiguration vpcConfiguration;
    /**
     * <p>
     * Information about where the index should get the document information from the database.
     * </p>
     */
    private ColumnConfiguration columnConfiguration;
    /**
     * <p>
     * Information about the database column that provides information for user context filtering.
     * </p>
     */
    private AclConfiguration aclConfiguration;

    /**
     * <p>
     * The type of database engine that runs the database.
     * </p>
     * 
     * @param databaseEngineType
     *        The type of database engine that runs the database.
     * @see DatabaseEngineType
     */

    public void setDatabaseEngineType(String databaseEngineType) {
        this.databaseEngineType = databaseEngineType;
    }

    /**
     * <p>
     * The type of database engine that runs the database.
     * </p>
     * 
     * @return The type of database engine that runs the database.
     * @see DatabaseEngineType
     */

    public String getDatabaseEngineType() {
        return this.databaseEngineType;
    }

    /**
     * <p>
     * The type of database engine that runs the database.
     * </p>
     * 
     * @param databaseEngineType
     *        The type of database engine that runs the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseEngineType
     */

    public DatabaseConfiguration withDatabaseEngineType(String databaseEngineType) {
        setDatabaseEngineType(databaseEngineType);
        return this;
    }

    /**
     * <p>
     * The type of database engine that runs the database.
     * </p>
     * 
     * @param databaseEngineType
     *        The type of database engine that runs the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseEngineType
     */

    public DatabaseConfiguration withDatabaseEngineType(DatabaseEngineType databaseEngineType) {
        this.databaseEngineType = databaseEngineType.toString();
        return this;
    }

    /**
     * <p>
     * The information necessary to connect to a database.
     * </p>
     * 
     * @param connectionConfiguration
     *        The information necessary to connect to a database.
     */

    public void setConnectionConfiguration(ConnectionConfiguration connectionConfiguration) {
        this.connectionConfiguration = connectionConfiguration;
    }

    /**
     * <p>
     * The information necessary to connect to a database.
     * </p>
     * 
     * @return The information necessary to connect to a database.
     */

    public ConnectionConfiguration getConnectionConfiguration() {
        return this.connectionConfiguration;
    }

    /**
     * <p>
     * The information necessary to connect to a database.
     * </p>
     * 
     * @param connectionConfiguration
     *        The information necessary to connect to a database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseConfiguration withConnectionConfiguration(ConnectionConfiguration connectionConfiguration) {
        setConnectionConfiguration(connectionConfiguration);
        return this;
    }

    /**
     * @param vpcConfiguration
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * @return
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * @param vpcConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseConfiguration withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * Information about where the index should get the document information from the database.
     * </p>
     * 
     * @param columnConfiguration
     *        Information about where the index should get the document information from the database.
     */

    public void setColumnConfiguration(ColumnConfiguration columnConfiguration) {
        this.columnConfiguration = columnConfiguration;
    }

    /**
     * <p>
     * Information about where the index should get the document information from the database.
     * </p>
     * 
     * @return Information about where the index should get the document information from the database.
     */

    public ColumnConfiguration getColumnConfiguration() {
        return this.columnConfiguration;
    }

    /**
     * <p>
     * Information about where the index should get the document information from the database.
     * </p>
     * 
     * @param columnConfiguration
     *        Information about where the index should get the document information from the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseConfiguration withColumnConfiguration(ColumnConfiguration columnConfiguration) {
        setColumnConfiguration(columnConfiguration);
        return this;
    }

    /**
     * <p>
     * Information about the database column that provides information for user context filtering.
     * </p>
     * 
     * @param aclConfiguration
     *        Information about the database column that provides information for user context filtering.
     */

    public void setAclConfiguration(AclConfiguration aclConfiguration) {
        this.aclConfiguration = aclConfiguration;
    }

    /**
     * <p>
     * Information about the database column that provides information for user context filtering.
     * </p>
     * 
     * @return Information about the database column that provides information for user context filtering.
     */

    public AclConfiguration getAclConfiguration() {
        return this.aclConfiguration;
    }

    /**
     * <p>
     * Information about the database column that provides information for user context filtering.
     * </p>
     * 
     * @param aclConfiguration
     *        Information about the database column that provides information for user context filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseConfiguration withAclConfiguration(AclConfiguration aclConfiguration) {
        setAclConfiguration(aclConfiguration);
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
        if (getDatabaseEngineType() != null)
            sb.append("DatabaseEngineType: ").append(getDatabaseEngineType()).append(",");
        if (getConnectionConfiguration() != null)
            sb.append("ConnectionConfiguration: ").append(getConnectionConfiguration()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getColumnConfiguration() != null)
            sb.append("ColumnConfiguration: ").append(getColumnConfiguration()).append(",");
        if (getAclConfiguration() != null)
            sb.append("AclConfiguration: ").append(getAclConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabaseConfiguration == false)
            return false;
        DatabaseConfiguration other = (DatabaseConfiguration) obj;
        if (other.getDatabaseEngineType() == null ^ this.getDatabaseEngineType() == null)
            return false;
        if (other.getDatabaseEngineType() != null && other.getDatabaseEngineType().equals(this.getDatabaseEngineType()) == false)
            return false;
        if (other.getConnectionConfiguration() == null ^ this.getConnectionConfiguration() == null)
            return false;
        if (other.getConnectionConfiguration() != null && other.getConnectionConfiguration().equals(this.getConnectionConfiguration()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getColumnConfiguration() == null ^ this.getColumnConfiguration() == null)
            return false;
        if (other.getColumnConfiguration() != null && other.getColumnConfiguration().equals(this.getColumnConfiguration()) == false)
            return false;
        if (other.getAclConfiguration() == null ^ this.getAclConfiguration() == null)
            return false;
        if (other.getAclConfiguration() != null && other.getAclConfiguration().equals(this.getAclConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseEngineType() == null) ? 0 : getDatabaseEngineType().hashCode());
        hashCode = prime * hashCode + ((getConnectionConfiguration() == null) ? 0 : getConnectionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getColumnConfiguration() == null) ? 0 : getColumnConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAclConfiguration() == null) ? 0 : getAclConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DatabaseConfiguration clone() {
        try {
            return (DatabaseConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.DatabaseConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
