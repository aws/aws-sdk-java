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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that defines a Redis target endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RedisSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedisSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Fully qualified domain name of the endpoint.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * Transmission Control Protocol (TCP) port for the endpoint.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The connection to a Redis target endpoint using Transport Layer Security (TLS). Valid values include
     * <code>plaintext</code> and <code>ssl-encryption</code>. The default is <code>ssl-encryption</code>. The
     * <code>ssl-encryption</code> option makes an encrypted connection. Optionally, you can identify an Amazon Resource
     * Name (ARN) for an SSL certificate authority (CA) using the <code>SslCaCertificateArn </code>setting. If an ARN
     * isn't given for a CA, DMS uses the Amazon root CA.
     * </p>
     * <p>
     * The <code>plaintext</code> option doesn't provide Transport Layer Security (TLS) encryption for traffic between
     * endpoint and database.
     * </p>
     */
    private String sslSecurityProtocol;
    /**
     * <p>
     * The type of authentication to perform when connecting to a Redis target. Options include <code>none</code>,
     * <code>auth-token</code>, and <code>auth-role</code>. The <code>auth-token</code> option requires an
     * <code>AuthPassword</code> value to be provided. The <code>auth-role</code> option requires
     * <code>AuthUserName</code> and <code>AuthPassword</code> values to be provided.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The user name provided with the <code>auth-role</code> option of the <code>AuthType</code> setting for a Redis
     * target endpoint.
     * </p>
     */
    private String authUserName;
    /**
     * <p>
     * The password provided with the <code>auth-role</code> and <code>auth-token</code> options of the
     * <code>AuthType</code> setting for a Redis target endpoint.
     * </p>
     */
    private String authPassword;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate authority (CA) that DMS uses to connect to your Redis target
     * endpoint.
     * </p>
     */
    private String sslCaCertificateArn;

    /**
     * <p>
     * Fully qualified domain name of the endpoint.
     * </p>
     * 
     * @param serverName
     *        Fully qualified domain name of the endpoint.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * Fully qualified domain name of the endpoint.
     * </p>
     * 
     * @return Fully qualified domain name of the endpoint.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * Fully qualified domain name of the endpoint.
     * </p>
     * 
     * @param serverName
     *        Fully qualified domain name of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedisSettings withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * Transmission Control Protocol (TCP) port for the endpoint.
     * </p>
     * 
     * @param port
     *        Transmission Control Protocol (TCP) port for the endpoint.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Transmission Control Protocol (TCP) port for the endpoint.
     * </p>
     * 
     * @return Transmission Control Protocol (TCP) port for the endpoint.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Transmission Control Protocol (TCP) port for the endpoint.
     * </p>
     * 
     * @param port
     *        Transmission Control Protocol (TCP) port for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedisSettings withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The connection to a Redis target endpoint using Transport Layer Security (TLS). Valid values include
     * <code>plaintext</code> and <code>ssl-encryption</code>. The default is <code>ssl-encryption</code>. The
     * <code>ssl-encryption</code> option makes an encrypted connection. Optionally, you can identify an Amazon Resource
     * Name (ARN) for an SSL certificate authority (CA) using the <code>SslCaCertificateArn </code>setting. If an ARN
     * isn't given for a CA, DMS uses the Amazon root CA.
     * </p>
     * <p>
     * The <code>plaintext</code> option doesn't provide Transport Layer Security (TLS) encryption for traffic between
     * endpoint and database.
     * </p>
     * 
     * @param sslSecurityProtocol
     *        The connection to a Redis target endpoint using Transport Layer Security (TLS). Valid values include
     *        <code>plaintext</code> and <code>ssl-encryption</code>. The default is <code>ssl-encryption</code>. The
     *        <code>ssl-encryption</code> option makes an encrypted connection. Optionally, you can identify an Amazon
     *        Resource Name (ARN) for an SSL certificate authority (CA) using the <code>SslCaCertificateArn </code>
     *        setting. If an ARN isn't given for a CA, DMS uses the Amazon root CA.</p>
     *        <p>
     *        The <code>plaintext</code> option doesn't provide Transport Layer Security (TLS) encryption for traffic
     *        between endpoint and database.
     * @see SslSecurityProtocolValue
     */

    public void setSslSecurityProtocol(String sslSecurityProtocol) {
        this.sslSecurityProtocol = sslSecurityProtocol;
    }

    /**
     * <p>
     * The connection to a Redis target endpoint using Transport Layer Security (TLS). Valid values include
     * <code>plaintext</code> and <code>ssl-encryption</code>. The default is <code>ssl-encryption</code>. The
     * <code>ssl-encryption</code> option makes an encrypted connection. Optionally, you can identify an Amazon Resource
     * Name (ARN) for an SSL certificate authority (CA) using the <code>SslCaCertificateArn </code>setting. If an ARN
     * isn't given for a CA, DMS uses the Amazon root CA.
     * </p>
     * <p>
     * The <code>plaintext</code> option doesn't provide Transport Layer Security (TLS) encryption for traffic between
     * endpoint and database.
     * </p>
     * 
     * @return The connection to a Redis target endpoint using Transport Layer Security (TLS). Valid values include
     *         <code>plaintext</code> and <code>ssl-encryption</code>. The default is <code>ssl-encryption</code>. The
     *         <code>ssl-encryption</code> option makes an encrypted connection. Optionally, you can identify an Amazon
     *         Resource Name (ARN) for an SSL certificate authority (CA) using the <code>SslCaCertificateArn </code>
     *         setting. If an ARN isn't given for a CA, DMS uses the Amazon root CA.</p>
     *         <p>
     *         The <code>plaintext</code> option doesn't provide Transport Layer Security (TLS) encryption for traffic
     *         between endpoint and database.
     * @see SslSecurityProtocolValue
     */

    public String getSslSecurityProtocol() {
        return this.sslSecurityProtocol;
    }

    /**
     * <p>
     * The connection to a Redis target endpoint using Transport Layer Security (TLS). Valid values include
     * <code>plaintext</code> and <code>ssl-encryption</code>. The default is <code>ssl-encryption</code>. The
     * <code>ssl-encryption</code> option makes an encrypted connection. Optionally, you can identify an Amazon Resource
     * Name (ARN) for an SSL certificate authority (CA) using the <code>SslCaCertificateArn </code>setting. If an ARN
     * isn't given for a CA, DMS uses the Amazon root CA.
     * </p>
     * <p>
     * The <code>plaintext</code> option doesn't provide Transport Layer Security (TLS) encryption for traffic between
     * endpoint and database.
     * </p>
     * 
     * @param sslSecurityProtocol
     *        The connection to a Redis target endpoint using Transport Layer Security (TLS). Valid values include
     *        <code>plaintext</code> and <code>ssl-encryption</code>. The default is <code>ssl-encryption</code>. The
     *        <code>ssl-encryption</code> option makes an encrypted connection. Optionally, you can identify an Amazon
     *        Resource Name (ARN) for an SSL certificate authority (CA) using the <code>SslCaCertificateArn </code>
     *        setting. If an ARN isn't given for a CA, DMS uses the Amazon root CA.</p>
     *        <p>
     *        The <code>plaintext</code> option doesn't provide Transport Layer Security (TLS) encryption for traffic
     *        between endpoint and database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SslSecurityProtocolValue
     */

    public RedisSettings withSslSecurityProtocol(String sslSecurityProtocol) {
        setSslSecurityProtocol(sslSecurityProtocol);
        return this;
    }

    /**
     * <p>
     * The connection to a Redis target endpoint using Transport Layer Security (TLS). Valid values include
     * <code>plaintext</code> and <code>ssl-encryption</code>. The default is <code>ssl-encryption</code>. The
     * <code>ssl-encryption</code> option makes an encrypted connection. Optionally, you can identify an Amazon Resource
     * Name (ARN) for an SSL certificate authority (CA) using the <code>SslCaCertificateArn </code>setting. If an ARN
     * isn't given for a CA, DMS uses the Amazon root CA.
     * </p>
     * <p>
     * The <code>plaintext</code> option doesn't provide Transport Layer Security (TLS) encryption for traffic between
     * endpoint and database.
     * </p>
     * 
     * @param sslSecurityProtocol
     *        The connection to a Redis target endpoint using Transport Layer Security (TLS). Valid values include
     *        <code>plaintext</code> and <code>ssl-encryption</code>. The default is <code>ssl-encryption</code>. The
     *        <code>ssl-encryption</code> option makes an encrypted connection. Optionally, you can identify an Amazon
     *        Resource Name (ARN) for an SSL certificate authority (CA) using the <code>SslCaCertificateArn </code>
     *        setting. If an ARN isn't given for a CA, DMS uses the Amazon root CA.</p>
     *        <p>
     *        The <code>plaintext</code> option doesn't provide Transport Layer Security (TLS) encryption for traffic
     *        between endpoint and database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SslSecurityProtocolValue
     */

    public RedisSettings withSslSecurityProtocol(SslSecurityProtocolValue sslSecurityProtocol) {
        this.sslSecurityProtocol = sslSecurityProtocol.toString();
        return this;
    }

    /**
     * <p>
     * The type of authentication to perform when connecting to a Redis target. Options include <code>none</code>,
     * <code>auth-token</code>, and <code>auth-role</code>. The <code>auth-token</code> option requires an
     * <code>AuthPassword</code> value to be provided. The <code>auth-role</code> option requires
     * <code>AuthUserName</code> and <code>AuthPassword</code> values to be provided.
     * </p>
     * 
     * @param authType
     *        The type of authentication to perform when connecting to a Redis target. Options include <code>none</code>
     *        , <code>auth-token</code>, and <code>auth-role</code>. The <code>auth-token</code> option requires an
     *        <code>AuthPassword</code> value to be provided. The <code>auth-role</code> option requires
     *        <code>AuthUserName</code> and <code>AuthPassword</code> values to be provided.
     * @see RedisAuthTypeValue
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The type of authentication to perform when connecting to a Redis target. Options include <code>none</code>,
     * <code>auth-token</code>, and <code>auth-role</code>. The <code>auth-token</code> option requires an
     * <code>AuthPassword</code> value to be provided. The <code>auth-role</code> option requires
     * <code>AuthUserName</code> and <code>AuthPassword</code> values to be provided.
     * </p>
     * 
     * @return The type of authentication to perform when connecting to a Redis target. Options include
     *         <code>none</code>, <code>auth-token</code>, and <code>auth-role</code>. The <code>auth-token</code>
     *         option requires an <code>AuthPassword</code> value to be provided. The <code>auth-role</code> option
     *         requires <code>AuthUserName</code> and <code>AuthPassword</code> values to be provided.
     * @see RedisAuthTypeValue
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The type of authentication to perform when connecting to a Redis target. Options include <code>none</code>,
     * <code>auth-token</code>, and <code>auth-role</code>. The <code>auth-token</code> option requires an
     * <code>AuthPassword</code> value to be provided. The <code>auth-role</code> option requires
     * <code>AuthUserName</code> and <code>AuthPassword</code> values to be provided.
     * </p>
     * 
     * @param authType
     *        The type of authentication to perform when connecting to a Redis target. Options include <code>none</code>
     *        , <code>auth-token</code>, and <code>auth-role</code>. The <code>auth-token</code> option requires an
     *        <code>AuthPassword</code> value to be provided. The <code>auth-role</code> option requires
     *        <code>AuthUserName</code> and <code>AuthPassword</code> values to be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedisAuthTypeValue
     */

    public RedisSettings withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The type of authentication to perform when connecting to a Redis target. Options include <code>none</code>,
     * <code>auth-token</code>, and <code>auth-role</code>. The <code>auth-token</code> option requires an
     * <code>AuthPassword</code> value to be provided. The <code>auth-role</code> option requires
     * <code>AuthUserName</code> and <code>AuthPassword</code> values to be provided.
     * </p>
     * 
     * @param authType
     *        The type of authentication to perform when connecting to a Redis target. Options include <code>none</code>
     *        , <code>auth-token</code>, and <code>auth-role</code>. The <code>auth-token</code> option requires an
     *        <code>AuthPassword</code> value to be provided. The <code>auth-role</code> option requires
     *        <code>AuthUserName</code> and <code>AuthPassword</code> values to be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedisAuthTypeValue
     */

    public RedisSettings withAuthType(RedisAuthTypeValue authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The user name provided with the <code>auth-role</code> option of the <code>AuthType</code> setting for a Redis
     * target endpoint.
     * </p>
     * 
     * @param authUserName
     *        The user name provided with the <code>auth-role</code> option of the <code>AuthType</code> setting for a
     *        Redis target endpoint.
     */

    public void setAuthUserName(String authUserName) {
        this.authUserName = authUserName;
    }

    /**
     * <p>
     * The user name provided with the <code>auth-role</code> option of the <code>AuthType</code> setting for a Redis
     * target endpoint.
     * </p>
     * 
     * @return The user name provided with the <code>auth-role</code> option of the <code>AuthType</code> setting for a
     *         Redis target endpoint.
     */

    public String getAuthUserName() {
        return this.authUserName;
    }

    /**
     * <p>
     * The user name provided with the <code>auth-role</code> option of the <code>AuthType</code> setting for a Redis
     * target endpoint.
     * </p>
     * 
     * @param authUserName
     *        The user name provided with the <code>auth-role</code> option of the <code>AuthType</code> setting for a
     *        Redis target endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedisSettings withAuthUserName(String authUserName) {
        setAuthUserName(authUserName);
        return this;
    }

    /**
     * <p>
     * The password provided with the <code>auth-role</code> and <code>auth-token</code> options of the
     * <code>AuthType</code> setting for a Redis target endpoint.
     * </p>
     * 
     * @param authPassword
     *        The password provided with the <code>auth-role</code> and <code>auth-token</code> options of the
     *        <code>AuthType</code> setting for a Redis target endpoint.
     */

    public void setAuthPassword(String authPassword) {
        this.authPassword = authPassword;
    }

    /**
     * <p>
     * The password provided with the <code>auth-role</code> and <code>auth-token</code> options of the
     * <code>AuthType</code> setting for a Redis target endpoint.
     * </p>
     * 
     * @return The password provided with the <code>auth-role</code> and <code>auth-token</code> options of the
     *         <code>AuthType</code> setting for a Redis target endpoint.
     */

    public String getAuthPassword() {
        return this.authPassword;
    }

    /**
     * <p>
     * The password provided with the <code>auth-role</code> and <code>auth-token</code> options of the
     * <code>AuthType</code> setting for a Redis target endpoint.
     * </p>
     * 
     * @param authPassword
     *        The password provided with the <code>auth-role</code> and <code>auth-token</code> options of the
     *        <code>AuthType</code> setting for a Redis target endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedisSettings withAuthPassword(String authPassword) {
        setAuthPassword(authPassword);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate authority (CA) that DMS uses to connect to your Redis target
     * endpoint.
     * </p>
     * 
     * @param sslCaCertificateArn
     *        The Amazon Resource Name (ARN) for the certificate authority (CA) that DMS uses to connect to your Redis
     *        target endpoint.
     */

    public void setSslCaCertificateArn(String sslCaCertificateArn) {
        this.sslCaCertificateArn = sslCaCertificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate authority (CA) that DMS uses to connect to your Redis target
     * endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the certificate authority (CA) that DMS uses to connect to your Redis
     *         target endpoint.
     */

    public String getSslCaCertificateArn() {
        return this.sslCaCertificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate authority (CA) that DMS uses to connect to your Redis target
     * endpoint.
     * </p>
     * 
     * @param sslCaCertificateArn
     *        The Amazon Resource Name (ARN) for the certificate authority (CA) that DMS uses to connect to your Redis
     *        target endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedisSettings withSslCaCertificateArn(String sslCaCertificateArn) {
        setSslCaCertificateArn(sslCaCertificateArn);
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
        if (getSslSecurityProtocol() != null)
            sb.append("SslSecurityProtocol: ").append(getSslSecurityProtocol()).append(",");
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getAuthUserName() != null)
            sb.append("AuthUserName: ").append(getAuthUserName()).append(",");
        if (getAuthPassword() != null)
            sb.append("AuthPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getSslCaCertificateArn() != null)
            sb.append("SslCaCertificateArn: ").append(getSslCaCertificateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedisSettings == false)
            return false;
        RedisSettings other = (RedisSettings) obj;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getSslSecurityProtocol() == null ^ this.getSslSecurityProtocol() == null)
            return false;
        if (other.getSslSecurityProtocol() != null && other.getSslSecurityProtocol().equals(this.getSslSecurityProtocol()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getAuthUserName() == null ^ this.getAuthUserName() == null)
            return false;
        if (other.getAuthUserName() != null && other.getAuthUserName().equals(this.getAuthUserName()) == false)
            return false;
        if (other.getAuthPassword() == null ^ this.getAuthPassword() == null)
            return false;
        if (other.getAuthPassword() != null && other.getAuthPassword().equals(this.getAuthPassword()) == false)
            return false;
        if (other.getSslCaCertificateArn() == null ^ this.getSslCaCertificateArn() == null)
            return false;
        if (other.getSslCaCertificateArn() != null && other.getSslCaCertificateArn().equals(this.getSslCaCertificateArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getSslSecurityProtocol() == null) ? 0 : getSslSecurityProtocol().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getAuthUserName() == null) ? 0 : getAuthUserName().hashCode());
        hashCode = prime * hashCode + ((getAuthPassword() == null) ? 0 : getAuthPassword().hashCode());
        hashCode = prime * hashCode + ((getSslCaCertificateArn() == null) ? 0 : getSslCaCertificateArn().hashCode());
        return hashCode;
    }

    @Override
    public RedisSettings clone() {
        try {
            return (RedisSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.RedisSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
