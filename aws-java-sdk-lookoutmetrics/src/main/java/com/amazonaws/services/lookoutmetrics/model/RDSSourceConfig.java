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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the Amazon Relational Database Service (RDS) configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/RDSSourceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDSSourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string identifying the database instance.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The host name of the database.
     * </p>
     */
    private String databaseHost;
    /**
     * <p>
     * The port number where the database can be accessed.
     * </p>
     */
    private Integer databasePort;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager role.
     * </p>
     */
    private String secretManagerArn;
    /**
     * <p>
     * The name of the RDS database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the table in the database.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An object containing information about the Amazon Virtual Private Cloud (VPC) configuration.
     * </p>
     */
    private VpcConfiguration vpcConfiguration;

    /**
     * <p>
     * A string identifying the database instance.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        A string identifying the database instance.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * A string identifying the database instance.
     * </p>
     * 
     * @return A string identifying the database instance.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * A string identifying the database instance.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        A string identifying the database instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSSourceConfig withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The host name of the database.
     * </p>
     * 
     * @param databaseHost
     *        The host name of the database.
     */

    public void setDatabaseHost(String databaseHost) {
        this.databaseHost = databaseHost;
    }

    /**
     * <p>
     * The host name of the database.
     * </p>
     * 
     * @return The host name of the database.
     */

    public String getDatabaseHost() {
        return this.databaseHost;
    }

    /**
     * <p>
     * The host name of the database.
     * </p>
     * 
     * @param databaseHost
     *        The host name of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSSourceConfig withDatabaseHost(String databaseHost) {
        setDatabaseHost(databaseHost);
        return this;
    }

    /**
     * <p>
     * The port number where the database can be accessed.
     * </p>
     * 
     * @param databasePort
     *        The port number where the database can be accessed.
     */

    public void setDatabasePort(Integer databasePort) {
        this.databasePort = databasePort;
    }

    /**
     * <p>
     * The port number where the database can be accessed.
     * </p>
     * 
     * @return The port number where the database can be accessed.
     */

    public Integer getDatabasePort() {
        return this.databasePort;
    }

    /**
     * <p>
     * The port number where the database can be accessed.
     * </p>
     * 
     * @param databasePort
     *        The port number where the database can be accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSSourceConfig withDatabasePort(Integer databasePort) {
        setDatabasePort(databasePort);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager role.
     * </p>
     * 
     * @param secretManagerArn
     *        The Amazon Resource Name (ARN) of the AWS Secrets Manager role.
     */

    public void setSecretManagerArn(String secretManagerArn) {
        this.secretManagerArn = secretManagerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Secrets Manager role.
     */

    public String getSecretManagerArn() {
        return this.secretManagerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager role.
     * </p>
     * 
     * @param secretManagerArn
     *        The Amazon Resource Name (ARN) of the AWS Secrets Manager role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSSourceConfig withSecretManagerArn(String secretManagerArn) {
        setSecretManagerArn(secretManagerArn);
        return this;
    }

    /**
     * <p>
     * The name of the RDS database.
     * </p>
     * 
     * @param databaseName
     *        The name of the RDS database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the RDS database.
     * </p>
     * 
     * @return The name of the RDS database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the RDS database.
     * </p>
     * 
     * @param databaseName
     *        The name of the RDS database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSSourceConfig withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the table in the database.
     * </p>
     * 
     * @param tableName
     *        The name of the table in the database.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table in the database.
     * </p>
     * 
     * @return The name of the table in the database.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table in the database.
     * </p>
     * 
     * @param tableName
     *        The name of the table in the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSSourceConfig withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSSourceConfig withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An object containing information about the Amazon Virtual Private Cloud (VPC) configuration.
     * </p>
     * 
     * @param vpcConfiguration
     *        An object containing information about the Amazon Virtual Private Cloud (VPC) configuration.
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * An object containing information about the Amazon Virtual Private Cloud (VPC) configuration.
     * </p>
     * 
     * @return An object containing information about the Amazon Virtual Private Cloud (VPC) configuration.
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * An object containing information about the Amazon Virtual Private Cloud (VPC) configuration.
     * </p>
     * 
     * @param vpcConfiguration
     *        An object containing information about the Amazon Virtual Private Cloud (VPC) configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSSourceConfig withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getDatabaseHost() != null)
            sb.append("DatabaseHost: ").append(getDatabaseHost()).append(",");
        if (getDatabasePort() != null)
            sb.append("DatabasePort: ").append(getDatabasePort()).append(",");
        if (getSecretManagerArn() != null)
            sb.append("SecretManagerArn: ").append(getSecretManagerArn()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RDSSourceConfig == false)
            return false;
        RDSSourceConfig other = (RDSSourceConfig) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getDatabaseHost() == null ^ this.getDatabaseHost() == null)
            return false;
        if (other.getDatabaseHost() != null && other.getDatabaseHost().equals(this.getDatabaseHost()) == false)
            return false;
        if (other.getDatabasePort() == null ^ this.getDatabasePort() == null)
            return false;
        if (other.getDatabasePort() != null && other.getDatabasePort().equals(this.getDatabasePort()) == false)
            return false;
        if (other.getSecretManagerArn() == null ^ this.getSecretManagerArn() == null)
            return false;
        if (other.getSecretManagerArn() != null && other.getSecretManagerArn().equals(this.getSecretManagerArn()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDatabaseHost() == null) ? 0 : getDatabaseHost().hashCode());
        hashCode = prime * hashCode + ((getDatabasePort() == null) ? 0 : getDatabasePort().hashCode());
        hashCode = prime * hashCode + ((getSecretManagerArn() == null) ? 0 : getSecretManagerArn().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public RDSSourceConfig clone() {
        try {
            return (RDSSourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.RDSSourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
