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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about an Database Migration Service (DMS) endpoint. An endpoint provides connection, data store
 * type, and location information about your data store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDmsEndpointDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDmsEndpointDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the SSL certificate that encrypts connections between the DMS endpoint and the
     * replication instance.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * The database endpoint identifier.
     * </p>
     */
    private String endpointIdentifier;
    /**
     * <p>
     * The type of endpoint. Valid values are source and target.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The type of engine for the endpoint, depending on the <code>EndpointType</code> value.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * A value that can be used for cross-account validation.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * Additional attributes associated with the connection.
     * </p>
     */
    private String extraConnectionAttributes;
    /**
     * <p>
     * An DMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't specify a
     * value for the <code>KmsKeyId</code> parameter, then DMS uses your default encryption key. KMS creates the default
     * encryption key for your Amazon Web Services account. Your Amazon Web Services account has a different default
     * encryption key for each Amazon Web Services Region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The port used to access the endpoint.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The SSL mode used to connect to the endpoint. The default is none.
     * </p>
     */
    private String sslMode;
    /**
     * <p>
     * The user name to be used to log in to the endpoint database.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the SSL certificate that encrypts connections between the DMS endpoint and the
     * replication instance.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) for the SSL certificate that encrypts connections between the DMS endpoint
     *        and the replication instance.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the SSL certificate that encrypts connections between the DMS endpoint and the
     * replication instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the SSL certificate that encrypts connections between the DMS endpoint
     *         and the replication instance.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the SSL certificate that encrypts connections between the DMS endpoint and the
     * replication instance.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) for the SSL certificate that encrypts connections between the DMS endpoint
     *        and the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsEndpointDetails withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     * 
     * @param databaseName
     *        The name of the endpoint database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     * 
     * @return The name of the endpoint database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     * 
     * @param databaseName
     *        The name of the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsEndpointDetails withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the endpoint.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsEndpointDetails withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * The database endpoint identifier.
     * </p>
     * 
     * @param endpointIdentifier
     *        The database endpoint identifier.
     */

    public void setEndpointIdentifier(String endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier.
     * </p>
     * 
     * @return The database endpoint identifier.
     */

    public String getEndpointIdentifier() {
        return this.endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier.
     * </p>
     * 
     * @param endpointIdentifier
     *        The database endpoint identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsEndpointDetails withEndpointIdentifier(String endpointIdentifier) {
        setEndpointIdentifier(endpointIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are source and target.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint. Valid values are source and target.
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are source and target.
     * </p>
     * 
     * @return The type of endpoint. Valid values are source and target.
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are source and target.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint. Valid values are source and target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsEndpointDetails withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of engine for the endpoint, depending on the <code>EndpointType</code> value.
     * </p>
     * 
     * @param engineName
     *        The type of engine for the endpoint, depending on the <code>EndpointType</code> value.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The type of engine for the endpoint, depending on the <code>EndpointType</code> value.
     * </p>
     * 
     * @return The type of engine for the endpoint, depending on the <code>EndpointType</code> value.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The type of engine for the endpoint, depending on the <code>EndpointType</code> value.
     * </p>
     * 
     * @param engineName
     *        The type of engine for the endpoint, depending on the <code>EndpointType</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsEndpointDetails withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * A value that can be used for cross-account validation.
     * </p>
     * 
     * @param externalId
     *        A value that can be used for cross-account validation.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * A value that can be used for cross-account validation.
     * </p>
     * 
     * @return A value that can be used for cross-account validation.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * A value that can be used for cross-account validation.
     * </p>
     * 
     * @param externalId
     *        A value that can be used for cross-account validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsEndpointDetails withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * Additional attributes associated with the connection.
     * </p>
     * 
     * @param extraConnectionAttributes
     *        Additional attributes associated with the connection.
     */

    public void setExtraConnectionAttributes(String extraConnectionAttributes) {
        this.extraConnectionAttributes = extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional attributes associated with the connection.
     * </p>
     * 
     * @return Additional attributes associated with the connection.
     */

    public String getExtraConnectionAttributes() {
        return this.extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional attributes associated with the connection.
     * </p>
     * 
     * @param extraConnectionAttributes
     *        Additional attributes associated with the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsEndpointDetails withExtraConnectionAttributes(String extraConnectionAttributes) {
        setExtraConnectionAttributes(extraConnectionAttributes);
        return this;
    }

    /**
     * <p>
     * An DMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't specify a
     * value for the <code>KmsKeyId</code> parameter, then DMS uses your default encryption key. KMS creates the default
     * encryption key for your Amazon Web Services account. Your Amazon Web Services account has a different default
     * encryption key for each Amazon Web Services Region.
     * </p>
     * 
     * @param kmsKeyId
     *        An DMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't
     *        specify a value for the <code>KmsKeyId</code> parameter, then DMS uses your default encryption key. KMS
     *        creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account
     *        has a different default encryption key for each Amazon Web Services Region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * An DMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't specify a
     * value for the <code>KmsKeyId</code> parameter, then DMS uses your default encryption key. KMS creates the default
     * encryption key for your Amazon Web Services account. Your Amazon Web Services account has a different default
     * encryption key for each Amazon Web Services Region.
     * </p>
     * 
     * @return An DMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't
     *         specify a value for the <code>KmsKeyId</code> parameter, then DMS uses your default encryption key. KMS
     *         creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account
     *         has a different default encryption key for each Amazon Web Services Region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * An DMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't specify a
     * value for the <code>KmsKeyId</code> parameter, then DMS uses your default encryption key. KMS creates the default
     * encryption key for your Amazon Web Services account. Your Amazon Web Services account has a different default
     * encryption key for each Amazon Web Services Region.
     * </p>
     * 
     * @param kmsKeyId
     *        An DMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't
     *        specify a value for the <code>KmsKeyId</code> parameter, then DMS uses your default encryption key. KMS
     *        creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account
     *        has a different default encryption key for each Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsEndpointDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The port used to access the endpoint.
     * </p>
     * 
     * @param port
     *        The port used to access the endpoint.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port used to access the endpoint.
     * </p>
     * 
     * @return The port used to access the endpoint.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port used to access the endpoint.
     * </p>
     * 
     * @param port
     *        The port used to access the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsEndpointDetails withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     * 
     * @param serverName
     *        The name of the server where the endpoint database resides.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     * 
     * @return The name of the server where the endpoint database resides.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     * 
     * @param serverName
     *        The name of the server where the endpoint database resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsEndpointDetails withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint. The default is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the endpoint. The default is none.
     */

    public void setSslMode(String sslMode) {
        this.sslMode = sslMode;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint. The default is none.
     * </p>
     * 
     * @return The SSL mode used to connect to the endpoint. The default is none.
     */

    public String getSslMode() {
        return this.sslMode;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint. The default is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the endpoint. The default is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsEndpointDetails withSslMode(String sslMode) {
        setSslMode(sslMode);
        return this;
    }

    /**
     * <p>
     * The user name to be used to log in to the endpoint database.
     * </p>
     * 
     * @param username
     *        The user name to be used to log in to the endpoint database.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name to be used to log in to the endpoint database.
     * </p>
     * 
     * @return The user name to be used to log in to the endpoint database.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name to be used to log in to the endpoint database.
     * </p>
     * 
     * @param username
     *        The user name to be used to log in to the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsEndpointDetails withUsername(String username) {
        setUsername(username);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
        if (getEndpointIdentifier() != null)
            sb.append("EndpointIdentifier: ").append(getEndpointIdentifier()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getEngineName() != null)
            sb.append("EngineName: ").append(getEngineName()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getExtraConnectionAttributes() != null)
            sb.append("ExtraConnectionAttributes: ").append(getExtraConnectionAttributes()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getSslMode() != null)
            sb.append("SslMode: ").append(getSslMode()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDmsEndpointDetails == false)
            return false;
        AwsDmsEndpointDetails other = (AwsDmsEndpointDetails) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
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
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getExtraConnectionAttributes() == null ^ this.getExtraConnectionAttributes() == null)
            return false;
        if (other.getExtraConnectionAttributes() != null && other.getExtraConnectionAttributes().equals(this.getExtraConnectionAttributes()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getSslMode() == null ^ this.getSslMode() == null)
            return false;
        if (other.getSslMode() != null && other.getSslMode().equals(this.getSslMode()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointIdentifier() == null) ? 0 : getEndpointIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getExtraConnectionAttributes() == null) ? 0 : getExtraConnectionAttributes().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getSslMode() == null) ? 0 : getSslMode().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public AwsDmsEndpointDetails clone() {
        try {
            return (AwsDmsEndpointDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDmsEndpointDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
