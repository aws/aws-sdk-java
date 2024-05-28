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
 * Provides information that defines an Amazon Redshift data provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RedshiftDataProviderSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftDataProviderSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon Redshift server.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The port value for the Amazon Redshift data provider.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The database name on the Amazon Redshift data provider.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * The name of the Amazon Redshift server.
     * </p>
     * 
     * @param serverName
     *        The name of the Amazon Redshift server.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the Amazon Redshift server.
     * </p>
     * 
     * @return The name of the Amazon Redshift server.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the Amazon Redshift server.
     * </p>
     * 
     * @param serverName
     *        The name of the Amazon Redshift server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDataProviderSettings withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The port value for the Amazon Redshift data provider.
     * </p>
     * 
     * @param port
     *        The port value for the Amazon Redshift data provider.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port value for the Amazon Redshift data provider.
     * </p>
     * 
     * @return The port value for the Amazon Redshift data provider.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port value for the Amazon Redshift data provider.
     * </p>
     * 
     * @param port
     *        The port value for the Amazon Redshift data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDataProviderSettings withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The database name on the Amazon Redshift data provider.
     * </p>
     * 
     * @param databaseName
     *        The database name on the Amazon Redshift data provider.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database name on the Amazon Redshift data provider.
     * </p>
     * 
     * @return The database name on the Amazon Redshift data provider.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database name on the Amazon Redshift data provider.
     * </p>
     * 
     * @param databaseName
     *        The database name on the Amazon Redshift data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDataProviderSettings withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
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
            sb.append("DatabaseName: ").append(getDatabaseName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftDataProviderSettings == false)
            return false;
        RedshiftDataProviderSettings other = (RedshiftDataProviderSettings) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftDataProviderSettings clone() {
        try {
            return (RedshiftDataProviderSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.RedshiftDataProviderSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
