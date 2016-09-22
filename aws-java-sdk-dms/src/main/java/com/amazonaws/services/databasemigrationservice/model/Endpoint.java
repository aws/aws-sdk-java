/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p/>
 */
public class Endpoint implements Serializable, Cloneable {

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String endpointIdentifier;
    /**
     * <p>
     * The type of endpoint.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The database engine name.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * The user name used to connect to the endpoint.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The name of the server at the endpoint.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The port value used to access the endpoint.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The name of the database at the endpoint.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Additional connection attributes used to connect to the endpoint.
     * </p>
     */
    private String extraConnectionAttributes;
    /**
     * <p>
     * The status of the endpoint.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a value for
     * the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption
     * key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The SSL mode used to connect to the endpoint.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     */
    private String sslMode;

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param endpointIdentifier
     *        The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *        digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     */

    public void setEndpointIdentifier(String endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @return The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *         digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     */

    public String getEndpointIdentifier() {
        return this.endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param endpointIdentifier
     *        The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *        digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withEndpointIdentifier(String endpointIdentifier) {
        setEndpointIdentifier(endpointIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @return The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public Endpoint withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(ReplicationEndpointTypeValue endpointType) {
        this.endpointType = endpointType.toString();
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public Endpoint withEndpointType(ReplicationEndpointTypeValue endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The database engine name.
     * </p>
     * 
     * @param engineName
     *        The database engine name.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The database engine name.
     * </p>
     * 
     * @return The database engine name.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The database engine name.
     * </p>
     * 
     * @param engineName
     *        The database engine name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * The user name used to connect to the endpoint.
     * </p>
     * 
     * @param username
     *        The user name used to connect to the endpoint.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name used to connect to the endpoint.
     * </p>
     * 
     * @return The user name used to connect to the endpoint.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name used to connect to the endpoint.
     * </p>
     * 
     * @param username
     *        The user name used to connect to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The name of the server at the endpoint.
     * </p>
     * 
     * @param serverName
     *        The name of the server at the endpoint.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server at the endpoint.
     * </p>
     * 
     * @return The name of the server at the endpoint.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server at the endpoint.
     * </p>
     * 
     * @param serverName
     *        The name of the server at the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The port value used to access the endpoint.
     * </p>
     * 
     * @param port
     *        The port value used to access the endpoint.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port value used to access the endpoint.
     * </p>
     * 
     * @return The port value used to access the endpoint.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port value used to access the endpoint.
     * </p>
     * 
     * @param port
     *        The port value used to access the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The name of the database at the endpoint.
     * </p>
     * 
     * @param databaseName
     *        The name of the database at the endpoint.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database at the endpoint.
     * </p>
     * 
     * @return The name of the database at the endpoint.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database at the endpoint.
     * </p>
     * 
     * @param databaseName
     *        The name of the database at the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Additional connection attributes used to connect to the endpoint.
     * </p>
     * 
     * @param extraConnectionAttributes
     *        Additional connection attributes used to connect to the endpoint.
     */

    public void setExtraConnectionAttributes(String extraConnectionAttributes) {
        this.extraConnectionAttributes = extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional connection attributes used to connect to the endpoint.
     * </p>
     * 
     * @return Additional connection attributes used to connect to the endpoint.
     */

    public String getExtraConnectionAttributes() {
        return this.extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional connection attributes used to connect to the endpoint.
     * </p>
     * 
     * @param extraConnectionAttributes
     *        Additional connection attributes used to connect to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withExtraConnectionAttributes(String extraConnectionAttributes) {
        setExtraConnectionAttributes(extraConnectionAttributes);
        return this;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @param status
     *        The status of the endpoint.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @return The status of the endpoint.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @param status
     *        The status of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a value for
     * the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption
     * key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a
     *        value for the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the
     *        default encryption key for your AWS account. Your AWS account has a different default encryption key for
     *        each AWS region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a value for
     * the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption
     * key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * </p>
     * 
     * @return The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a
     *         value for the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the
     *         default encryption key for your AWS account. Your AWS account has a different default encryption key for
     *         each AWS region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a value for
     * the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption
     * key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a
     *        value for the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the
     *        default encryption key for your AWS account. Your AWS account has a different default encryption key for
     *        each AWS region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the endpoint.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @see DmsSslModeValue
     */

    public void setSslMode(String sslMode) {
        this.sslMode = sslMode;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @return The SSL mode used to connect to the endpoint.</p>
     *         <p>
     *         SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *         </p>
     *         <p>
     *         The default value is none.
     * @see DmsSslModeValue
     */

    public String getSslMode() {
        return this.sslMode;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the endpoint.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public Endpoint withSslMode(String sslMode) {
        setSslMode(sslMode);
        return this;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the endpoint.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @see DmsSslModeValue
     */

    public void setSslMode(DmsSslModeValue sslMode) {
        this.sslMode = sslMode.toString();
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the endpoint.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public Endpoint withSslMode(DmsSslModeValue sslMode) {
        setSslMode(sslMode);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEndpointIdentifier() != null)
            sb.append("EndpointIdentifier: " + getEndpointIdentifier() + ",");
        if (getEndpointType() != null)
            sb.append("EndpointType: " + getEndpointType() + ",");
        if (getEngineName() != null)
            sb.append("EngineName: " + getEngineName() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getExtraConnectionAttributes() != null)
            sb.append("ExtraConnectionAttributes: " + getExtraConnectionAttributes() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: " + getEndpointArn() + ",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getSslMode() != null)
            sb.append("SslMode: " + getSslMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Endpoint == false)
            return false;
        Endpoint other = (Endpoint) obj;
        if (other.getEndpointIdentifier() == null ^ this.getEndpointIdentifier() == null)
            return false;
        if (other.getEndpointIdentifier() != null && other.getEndpointIdentifier().equals(this.getEndpointIdentifier()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
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
        if (other.getExtraConnectionAttributes() == null ^ this.getExtraConnectionAttributes() == null)
            return false;
        if (other.getExtraConnectionAttributes() != null && other.getExtraConnectionAttributes().equals(this.getExtraConnectionAttributes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getSslMode() == null ^ this.getSslMode() == null)
            return false;
        if (other.getSslMode() != null && other.getSslMode().equals(this.getSslMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointIdentifier() == null) ? 0 : getEndpointIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getExtraConnectionAttributes() == null) ? 0 : getExtraConnectionAttributes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getSslMode() == null) ? 0 : getSslMode().hashCode());
        return hashCode;
    }

    @Override
    public Endpoint clone() {
        try {
            return (Endpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
