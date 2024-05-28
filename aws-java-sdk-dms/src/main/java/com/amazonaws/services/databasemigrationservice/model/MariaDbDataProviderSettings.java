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
 * Provides information that defines a MariaDB data provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/MariaDbDataProviderSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MariaDbDataProviderSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the MariaDB server.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The port value for the MariaDB data provider
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The SSL mode used to connect to the MariaDB data provider. The default value is <code>none</code>.
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
     * The name of the MariaDB server.
     * </p>
     * 
     * @param serverName
     *        The name of the MariaDB server.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the MariaDB server.
     * </p>
     * 
     * @return The name of the MariaDB server.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the MariaDB server.
     * </p>
     * 
     * @param serverName
     *        The name of the MariaDB server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MariaDbDataProviderSettings withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The port value for the MariaDB data provider
     * </p>
     * 
     * @param port
     *        The port value for the MariaDB data provider
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port value for the MariaDB data provider
     * </p>
     * 
     * @return The port value for the MariaDB data provider
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port value for the MariaDB data provider
     * </p>
     * 
     * @param port
     *        The port value for the MariaDB data provider
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MariaDbDataProviderSettings withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The SSL mode used to connect to the MariaDB data provider. The default value is <code>none</code>.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the MariaDB data provider. The default value is <code>none</code>.
     * @see DmsSslModeValue
     */

    public void setSslMode(String sslMode) {
        this.sslMode = sslMode;
    }

    /**
     * <p>
     * The SSL mode used to connect to the MariaDB data provider. The default value is <code>none</code>.
     * </p>
     * 
     * @return The SSL mode used to connect to the MariaDB data provider. The default value is <code>none</code>.
     * @see DmsSslModeValue
     */

    public String getSslMode() {
        return this.sslMode;
    }

    /**
     * <p>
     * The SSL mode used to connect to the MariaDB data provider. The default value is <code>none</code>.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the MariaDB data provider. The default value is <code>none</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public MariaDbDataProviderSettings withSslMode(String sslMode) {
        setSslMode(sslMode);
        return this;
    }

    /**
     * <p>
     * The SSL mode used to connect to the MariaDB data provider. The default value is <code>none</code>.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the MariaDB data provider. The default value is <code>none</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public MariaDbDataProviderSettings withSslMode(DmsSslModeValue sslMode) {
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

    public MariaDbDataProviderSettings withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
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
        if (getSslMode() != null)
            sb.append("SslMode: ").append(getSslMode()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MariaDbDataProviderSettings == false)
            return false;
        MariaDbDataProviderSettings other = (MariaDbDataProviderSettings) obj;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getSslMode() == null ^ this.getSslMode() == null)
            return false;
        if (other.getSslMode() != null && other.getSslMode().equals(this.getSslMode()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getSslMode() == null) ? 0 : getSslMode().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        return hashCode;
    }

    @Override
    public MariaDbDataProviderSettings clone() {
        try {
            return (MariaDbDataProviderSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.MariaDbDataProviderSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
