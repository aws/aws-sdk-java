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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that defines an Oracle data provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/OracleDataProviderSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OracleDataProviderSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Oracle server.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The port value for the Oracle data provider.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The database name on the Oracle data provider.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The SSL mode used to connect to the Oracle data provider. The default value is <code>none</code>.
     * </p>
     */
    private String sslMode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The address of your Oracle Automatic Storage Management (ASM) server. You can set this value from the
     * <code>asm_server</code> value. You set <code>asm_server</code> as part of the extra connection attribute string
     * to access an Oracle server with Binary Reader that uses ASM. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     */
    private String asmServer;
    /**
     * <p>
     * The identifier of the secret in Secrets Manager that contains the Oracle ASM connection details.
     * </p>
     * <p>
     * Required only if your data provider uses the Oracle ASM server.
     * </p>
     */
    private String secretsManagerOracleAsmSecretId;
    /**
     * <p>
     * The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the Oracle ASM
     * connection details.
     * </p>
     */
    private String secretsManagerOracleAsmAccessRoleArn;
    /**
     * <p>
     * The identifier of the secret in Secrets Manager that contains the transparent data encryption (TDE) password. DMS
     * requires this password to access Oracle redo logs encrypted by TDE using Binary Reader.
     * </p>
     */
    private String secretsManagerSecurityDbEncryptionSecretId;
    /**
     * <p>
     * The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the TDE password.
     * </p>
     */
    private String secretsManagerSecurityDbEncryptionAccessRoleArn;

    /**
     * <p>
     * The name of the Oracle server.
     * </p>
     * 
     * @param serverName
     *        The name of the Oracle server.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the Oracle server.
     * </p>
     * 
     * @return The name of the Oracle server.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the Oracle server.
     * </p>
     * 
     * @param serverName
     *        The name of the Oracle server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleDataProviderSettings withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The port value for the Oracle data provider.
     * </p>
     * 
     * @param port
     *        The port value for the Oracle data provider.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port value for the Oracle data provider.
     * </p>
     * 
     * @return The port value for the Oracle data provider.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port value for the Oracle data provider.
     * </p>
     * 
     * @param port
     *        The port value for the Oracle data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleDataProviderSettings withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The database name on the Oracle data provider.
     * </p>
     * 
     * @param databaseName
     *        The database name on the Oracle data provider.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database name on the Oracle data provider.
     * </p>
     * 
     * @return The database name on the Oracle data provider.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database name on the Oracle data provider.
     * </p>
     * 
     * @param databaseName
     *        The database name on the Oracle data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleDataProviderSettings withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The SSL mode used to connect to the Oracle data provider. The default value is <code>none</code>.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the Oracle data provider. The default value is <code>none</code>.
     * @see DmsSslModeValue
     */

    public void setSslMode(String sslMode) {
        this.sslMode = sslMode;
    }

    /**
     * <p>
     * The SSL mode used to connect to the Oracle data provider. The default value is <code>none</code>.
     * </p>
     * 
     * @return The SSL mode used to connect to the Oracle data provider. The default value is <code>none</code>.
     * @see DmsSslModeValue
     */

    public String getSslMode() {
        return this.sslMode;
    }

    /**
     * <p>
     * The SSL mode used to connect to the Oracle data provider. The default value is <code>none</code>.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the Oracle data provider. The default value is <code>none</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public OracleDataProviderSettings withSslMode(String sslMode) {
        setSslMode(sslMode);
        return this;
    }

    /**
     * <p>
     * The SSL mode used to connect to the Oracle data provider. The default value is <code>none</code>.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the Oracle data provider. The default value is <code>none</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public OracleDataProviderSettings withSslMode(DmsSslModeValue sslMode) {
        this.sslMode = sslMode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleDataProviderSettings withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The address of your Oracle Automatic Storage Management (ASM) server. You can set this value from the
     * <code>asm_server</code> value. You set <code>asm_server</code> as part of the extra connection attribute string
     * to access an Oracle server with Binary Reader that uses ASM. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     * 
     * @param asmServer
     *        The address of your Oracle Automatic Storage Management (ASM) server. You can set this value from the
     *        <code>asm_server</code> value. You set <code>asm_server</code> as part of the extra connection attribute
     *        string to access an Oracle server with Binary Reader that uses ASM. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     *        >Configuration for change data capture (CDC) on an Oracle source database</a>.
     */

    public void setAsmServer(String asmServer) {
        this.asmServer = asmServer;
    }

    /**
     * <p>
     * The address of your Oracle Automatic Storage Management (ASM) server. You can set this value from the
     * <code>asm_server</code> value. You set <code>asm_server</code> as part of the extra connection attribute string
     * to access an Oracle server with Binary Reader that uses ASM. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     * 
     * @return The address of your Oracle Automatic Storage Management (ASM) server. You can set this value from the
     *         <code>asm_server</code> value. You set <code>asm_server</code> as part of the extra connection attribute
     *         string to access an Oracle server with Binary Reader that uses ASM. For more information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     *         >Configuration for change data capture (CDC) on an Oracle source database</a>.
     */

    public String getAsmServer() {
        return this.asmServer;
    }

    /**
     * <p>
     * The address of your Oracle Automatic Storage Management (ASM) server. You can set this value from the
     * <code>asm_server</code> value. You set <code>asm_server</code> as part of the extra connection attribute string
     * to access an Oracle server with Binary Reader that uses ASM. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     * 
     * @param asmServer
     *        The address of your Oracle Automatic Storage Management (ASM) server. You can set this value from the
     *        <code>asm_server</code> value. You set <code>asm_server</code> as part of the extra connection attribute
     *        string to access an Oracle server with Binary Reader that uses ASM. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     *        >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleDataProviderSettings withAsmServer(String asmServer) {
        setAsmServer(asmServer);
        return this;
    }

    /**
     * <p>
     * The identifier of the secret in Secrets Manager that contains the Oracle ASM connection details.
     * </p>
     * <p>
     * Required only if your data provider uses the Oracle ASM server.
     * </p>
     * 
     * @param secretsManagerOracleAsmSecretId
     *        The identifier of the secret in Secrets Manager that contains the Oracle ASM connection details.</p>
     *        <p>
     *        Required only if your data provider uses the Oracle ASM server.
     */

    public void setSecretsManagerOracleAsmSecretId(String secretsManagerOracleAsmSecretId) {
        this.secretsManagerOracleAsmSecretId = secretsManagerOracleAsmSecretId;
    }

    /**
     * <p>
     * The identifier of the secret in Secrets Manager that contains the Oracle ASM connection details.
     * </p>
     * <p>
     * Required only if your data provider uses the Oracle ASM server.
     * </p>
     * 
     * @return The identifier of the secret in Secrets Manager that contains the Oracle ASM connection details.</p>
     *         <p>
     *         Required only if your data provider uses the Oracle ASM server.
     */

    public String getSecretsManagerOracleAsmSecretId() {
        return this.secretsManagerOracleAsmSecretId;
    }

    /**
     * <p>
     * The identifier of the secret in Secrets Manager that contains the Oracle ASM connection details.
     * </p>
     * <p>
     * Required only if your data provider uses the Oracle ASM server.
     * </p>
     * 
     * @param secretsManagerOracleAsmSecretId
     *        The identifier of the secret in Secrets Manager that contains the Oracle ASM connection details.</p>
     *        <p>
     *        Required only if your data provider uses the Oracle ASM server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleDataProviderSettings withSecretsManagerOracleAsmSecretId(String secretsManagerOracleAsmSecretId) {
        setSecretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the Oracle ASM
     * connection details.
     * </p>
     * 
     * @param secretsManagerOracleAsmAccessRoleArn
     *        The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the Oracle ASM
     *        connection details.
     */

    public void setSecretsManagerOracleAsmAccessRoleArn(String secretsManagerOracleAsmAccessRoleArn) {
        this.secretsManagerOracleAsmAccessRoleArn = secretsManagerOracleAsmAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the Oracle ASM
     * connection details.
     * </p>
     * 
     * @return The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the Oracle
     *         ASM connection details.
     */

    public String getSecretsManagerOracleAsmAccessRoleArn() {
        return this.secretsManagerOracleAsmAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the Oracle ASM
     * connection details.
     * </p>
     * 
     * @param secretsManagerOracleAsmAccessRoleArn
     *        The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the Oracle ASM
     *        connection details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleDataProviderSettings withSecretsManagerOracleAsmAccessRoleArn(String secretsManagerOracleAsmAccessRoleArn) {
        setSecretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the secret in Secrets Manager that contains the transparent data encryption (TDE) password. DMS
     * requires this password to access Oracle redo logs encrypted by TDE using Binary Reader.
     * </p>
     * 
     * @param secretsManagerSecurityDbEncryptionSecretId
     *        The identifier of the secret in Secrets Manager that contains the transparent data encryption (TDE)
     *        password. DMS requires this password to access Oracle redo logs encrypted by TDE using Binary Reader.
     */

    public void setSecretsManagerSecurityDbEncryptionSecretId(String secretsManagerSecurityDbEncryptionSecretId) {
        this.secretsManagerSecurityDbEncryptionSecretId = secretsManagerSecurityDbEncryptionSecretId;
    }

    /**
     * <p>
     * The identifier of the secret in Secrets Manager that contains the transparent data encryption (TDE) password. DMS
     * requires this password to access Oracle redo logs encrypted by TDE using Binary Reader.
     * </p>
     * 
     * @return The identifier of the secret in Secrets Manager that contains the transparent data encryption (TDE)
     *         password. DMS requires this password to access Oracle redo logs encrypted by TDE using Binary Reader.
     */

    public String getSecretsManagerSecurityDbEncryptionSecretId() {
        return this.secretsManagerSecurityDbEncryptionSecretId;
    }

    /**
     * <p>
     * The identifier of the secret in Secrets Manager that contains the transparent data encryption (TDE) password. DMS
     * requires this password to access Oracle redo logs encrypted by TDE using Binary Reader.
     * </p>
     * 
     * @param secretsManagerSecurityDbEncryptionSecretId
     *        The identifier of the secret in Secrets Manager that contains the transparent data encryption (TDE)
     *        password. DMS requires this password to access Oracle redo logs encrypted by TDE using Binary Reader.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleDataProviderSettings withSecretsManagerSecurityDbEncryptionSecretId(String secretsManagerSecurityDbEncryptionSecretId) {
        setSecretsManagerSecurityDbEncryptionSecretId(secretsManagerSecurityDbEncryptionSecretId);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the TDE password.
     * </p>
     * 
     * @param secretsManagerSecurityDbEncryptionAccessRoleArn
     *        The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the TDE
     *        password.
     */

    public void setSecretsManagerSecurityDbEncryptionAccessRoleArn(String secretsManagerSecurityDbEncryptionAccessRoleArn) {
        this.secretsManagerSecurityDbEncryptionAccessRoleArn = secretsManagerSecurityDbEncryptionAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the TDE password.
     * </p>
     * 
     * @return The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the TDE
     *         password.
     */

    public String getSecretsManagerSecurityDbEncryptionAccessRoleArn() {
        return this.secretsManagerSecurityDbEncryptionAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the TDE password.
     * </p>
     * 
     * @param secretsManagerSecurityDbEncryptionAccessRoleArn
     *        The ARN of the IAM role that provides access to the secret in Secrets Manager that contains the TDE
     *        password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleDataProviderSettings withSecretsManagerSecurityDbEncryptionAccessRoleArn(String secretsManagerSecurityDbEncryptionAccessRoleArn) {
        setSecretsManagerSecurityDbEncryptionAccessRoleArn(secretsManagerSecurityDbEncryptionAccessRoleArn);
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
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getSslMode() != null)
            sb.append("SslMode: ").append(getSslMode()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getAsmServer() != null)
            sb.append("AsmServer: ").append(getAsmServer()).append(",");
        if (getSecretsManagerOracleAsmSecretId() != null)
            sb.append("SecretsManagerOracleAsmSecretId: ").append(getSecretsManagerOracleAsmSecretId()).append(",");
        if (getSecretsManagerOracleAsmAccessRoleArn() != null)
            sb.append("SecretsManagerOracleAsmAccessRoleArn: ").append(getSecretsManagerOracleAsmAccessRoleArn()).append(",");
        if (getSecretsManagerSecurityDbEncryptionSecretId() != null)
            sb.append("SecretsManagerSecurityDbEncryptionSecretId: ").append(getSecretsManagerSecurityDbEncryptionSecretId()).append(",");
        if (getSecretsManagerSecurityDbEncryptionAccessRoleArn() != null)
            sb.append("SecretsManagerSecurityDbEncryptionAccessRoleArn: ").append(getSecretsManagerSecurityDbEncryptionAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OracleDataProviderSettings == false)
            return false;
        OracleDataProviderSettings other = (OracleDataProviderSettings) obj;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getSslMode() == null ^ this.getSslMode() == null)
            return false;
        if (other.getSslMode() != null && other.getSslMode().equals(this.getSslMode()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getAsmServer() == null ^ this.getAsmServer() == null)
            return false;
        if (other.getAsmServer() != null && other.getAsmServer().equals(this.getAsmServer()) == false)
            return false;
        if (other.getSecretsManagerOracleAsmSecretId() == null ^ this.getSecretsManagerOracleAsmSecretId() == null)
            return false;
        if (other.getSecretsManagerOracleAsmSecretId() != null
                && other.getSecretsManagerOracleAsmSecretId().equals(this.getSecretsManagerOracleAsmSecretId()) == false)
            return false;
        if (other.getSecretsManagerOracleAsmAccessRoleArn() == null ^ this.getSecretsManagerOracleAsmAccessRoleArn() == null)
            return false;
        if (other.getSecretsManagerOracleAsmAccessRoleArn() != null
                && other.getSecretsManagerOracleAsmAccessRoleArn().equals(this.getSecretsManagerOracleAsmAccessRoleArn()) == false)
            return false;
        if (other.getSecretsManagerSecurityDbEncryptionSecretId() == null ^ this.getSecretsManagerSecurityDbEncryptionSecretId() == null)
            return false;
        if (other.getSecretsManagerSecurityDbEncryptionSecretId() != null
                && other.getSecretsManagerSecurityDbEncryptionSecretId().equals(this.getSecretsManagerSecurityDbEncryptionSecretId()) == false)
            return false;
        if (other.getSecretsManagerSecurityDbEncryptionAccessRoleArn() == null ^ this.getSecretsManagerSecurityDbEncryptionAccessRoleArn() == null)
            return false;
        if (other.getSecretsManagerSecurityDbEncryptionAccessRoleArn() != null
                && other.getSecretsManagerSecurityDbEncryptionAccessRoleArn().equals(this.getSecretsManagerSecurityDbEncryptionAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getSslMode() == null) ? 0 : getSslMode().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getAsmServer() == null) ? 0 : getAsmServer().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerOracleAsmSecretId() == null) ? 0 : getSecretsManagerOracleAsmSecretId().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerOracleAsmAccessRoleArn() == null) ? 0 : getSecretsManagerOracleAsmAccessRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getSecretsManagerSecurityDbEncryptionSecretId() == null) ? 0 : getSecretsManagerSecurityDbEncryptionSecretId().hashCode());
        hashCode = prime * hashCode
                + ((getSecretsManagerSecurityDbEncryptionAccessRoleArn() == null) ? 0 : getSecretsManagerSecurityDbEncryptionAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public OracleDataProviderSettings clone() {
        try {
            return (OracleDataProviderSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.OracleDataProviderSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
