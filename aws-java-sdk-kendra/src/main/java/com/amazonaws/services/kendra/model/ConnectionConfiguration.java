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
 * Provides the information necessary to connect to a database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ConnectionConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the host for the database. Can be either a string (host.subdomain.domain.tld) or an IPv4 or IPv6
     * address.
     * </p>
     */
    private String databaseHost;
    /**
     * <p>
     * The port that the database uses for connections.
     * </p>
     */
    private Integer databasePort;
    /**
     * <p>
     * The name of the database containing the document data.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the table that contains the document data.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     * user/password pair. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html">Using a Database Data Source</a>.
     * For more information about AWS Secrets Manager, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets Manager </a>
     * in the <i>AWS Secrets Manager</i> user guide.
     * </p>
     */
    private String secretArn;

    /**
     * <p>
     * The name of the host for the database. Can be either a string (host.subdomain.domain.tld) or an IPv4 or IPv6
     * address.
     * </p>
     * 
     * @param databaseHost
     *        The name of the host for the database. Can be either a string (host.subdomain.domain.tld) or an IPv4 or
     *        IPv6 address.
     */

    public void setDatabaseHost(String databaseHost) {
        this.databaseHost = databaseHost;
    }

    /**
     * <p>
     * The name of the host for the database. Can be either a string (host.subdomain.domain.tld) or an IPv4 or IPv6
     * address.
     * </p>
     * 
     * @return The name of the host for the database. Can be either a string (host.subdomain.domain.tld) or an IPv4 or
     *         IPv6 address.
     */

    public String getDatabaseHost() {
        return this.databaseHost;
    }

    /**
     * <p>
     * The name of the host for the database. Can be either a string (host.subdomain.domain.tld) or an IPv4 or IPv6
     * address.
     * </p>
     * 
     * @param databaseHost
     *        The name of the host for the database. Can be either a string (host.subdomain.domain.tld) or an IPv4 or
     *        IPv6 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionConfiguration withDatabaseHost(String databaseHost) {
        setDatabaseHost(databaseHost);
        return this;
    }

    /**
     * <p>
     * The port that the database uses for connections.
     * </p>
     * 
     * @param databasePort
     *        The port that the database uses for connections.
     */

    public void setDatabasePort(Integer databasePort) {
        this.databasePort = databasePort;
    }

    /**
     * <p>
     * The port that the database uses for connections.
     * </p>
     * 
     * @return The port that the database uses for connections.
     */

    public Integer getDatabasePort() {
        return this.databasePort;
    }

    /**
     * <p>
     * The port that the database uses for connections.
     * </p>
     * 
     * @param databasePort
     *        The port that the database uses for connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionConfiguration withDatabasePort(Integer databasePort) {
        setDatabasePort(databasePort);
        return this;
    }

    /**
     * <p>
     * The name of the database containing the document data.
     * </p>
     * 
     * @param databaseName
     *        The name of the database containing the document data.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database containing the document data.
     * </p>
     * 
     * @return The name of the database containing the document data.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database containing the document data.
     * </p>
     * 
     * @param databaseName
     *        The name of the database containing the document data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionConfiguration withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the table that contains the document data.
     * </p>
     * 
     * @param tableName
     *        The name of the table that contains the document data.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table that contains the document data.
     * </p>
     * 
     * @return The name of the table that contains the document data.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table that contains the document data.
     * </p>
     * 
     * @param tableName
     *        The name of the table that contains the document data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionConfiguration withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     * user/password pair. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html">Using a Database Data Source</a>.
     * For more information about AWS Secrets Manager, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets Manager </a>
     * in the <i>AWS Secrets Manager</i> user guide.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     *        user/password pair. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html">Using a Database Data
     *        Source</a>. For more information about AWS Secrets Manager, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets Manager
     *        </a> in the <i>AWS Secrets Manager</i> user guide.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     * user/password pair. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html">Using a Database Data Source</a>.
     * For more information about AWS Secrets Manager, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets Manager </a>
     * in the <i>AWS Secrets Manager</i> user guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     *         user/password pair. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html">Using a Database Data
     *         Source</a>. For more information about AWS Secrets Manager, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets
     *         Manager </a> in the <i>AWS Secrets Manager</i> user guide.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     * user/password pair. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html">Using a Database Data Source</a>.
     * For more information about AWS Secrets Manager, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets Manager </a>
     * in the <i>AWS Secrets Manager</i> user guide.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a
     *        user/password pair. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html">Using a Database Data
     *        Source</a>. For more information about AWS Secrets Manager, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"> What Is AWS Secrets Manager
     *        </a> in the <i>AWS Secrets Manager</i> user guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
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
        if (getDatabaseHost() != null)
            sb.append("DatabaseHost: ").append(getDatabaseHost()).append(",");
        if (getDatabasePort() != null)
            sb.append("DatabasePort: ").append(getDatabasePort()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionConfiguration == false)
            return false;
        ConnectionConfiguration other = (ConnectionConfiguration) obj;
        if (other.getDatabaseHost() == null ^ this.getDatabaseHost() == null)
            return false;
        if (other.getDatabaseHost() != null && other.getDatabaseHost().equals(this.getDatabaseHost()) == false)
            return false;
        if (other.getDatabasePort() == null ^ this.getDatabasePort() == null)
            return false;
        if (other.getDatabasePort() != null && other.getDatabasePort().equals(this.getDatabasePort()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseHost() == null) ? 0 : getDatabaseHost().hashCode());
        hashCode = prime * hashCode + ((getDatabasePort() == null) ? 0 : getDatabasePort().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionConfiguration clone() {
        try {
            return (ConnectionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ConnectionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
