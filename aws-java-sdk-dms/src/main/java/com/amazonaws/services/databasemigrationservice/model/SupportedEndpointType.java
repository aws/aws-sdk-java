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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about types of supported endpoints in response to a request by the
 * <code>DescribeEndpointTypes</code> operation. This information includes the type of endpoint, the database engine
 * name, and whether change data capture (CDC) is supported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/SupportedEndpointType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SupportedEndpointType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndpointType, include <code>"mysql"</code>,
     * <code>"oracle"</code>, <code>"postgres"</code>, <code>"mariadb"</code>, <code>"aurora"</code>,
     * <code>"aurora-postgresql"</code>, <code>"redshift"</code>, <code>"s3"</code>, <code>"db2"</code>,
     * <code>"azuredb"</code>, <code>"sybase"</code>, <code>"dynamodb"</code>, <code>"mongodb"</code>,
     * <code>"kinesis"</code>, <code>"kafka"</code>, <code>"elasticsearch"</code>, <code>"documentdb"</code>,
     * <code>"sqlserver"</code>, and <code>"neptune"</code>.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * Indicates if change data capture (CDC) is supported.
     * </p>
     */
    private Boolean supportsCDC;
    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The earliest DMS engine version that supports this endpoint engine. Note that endpoint engines released with DMS
     * versions earlier than 3.1.1 do not return a value for this parameter.
     * </p>
     */
    private String replicationInstanceEngineMinimumVersion;
    /**
     * <p>
     * The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora," this
     * value would be "Amazon Aurora MySQL."
     * </p>
     */
    private String engineDisplayName;

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndpointType, include <code>"mysql"</code>,
     * <code>"oracle"</code>, <code>"postgres"</code>, <code>"mariadb"</code>, <code>"aurora"</code>,
     * <code>"aurora-postgresql"</code>, <code>"redshift"</code>, <code>"s3"</code>, <code>"db2"</code>,
     * <code>"azuredb"</code>, <code>"sybase"</code>, <code>"dynamodb"</code>, <code>"mongodb"</code>,
     * <code>"kinesis"</code>, <code>"kafka"</code>, <code>"elasticsearch"</code>, <code>"documentdb"</code>,
     * <code>"sqlserver"</code>, and <code>"neptune"</code>.
     * </p>
     * 
     * @param engineName
     *        The database engine name. Valid values, depending on the EndpointType, include <code>"mysql"</code>,
     *        <code>"oracle"</code>, <code>"postgres"</code>, <code>"mariadb"</code>, <code>"aurora"</code>,
     *        <code>"aurora-postgresql"</code>, <code>"redshift"</code>, <code>"s3"</code>, <code>"db2"</code>,
     *        <code>"azuredb"</code>, <code>"sybase"</code>, <code>"dynamodb"</code>, <code>"mongodb"</code>,
     *        <code>"kinesis"</code>, <code>"kafka"</code>, <code>"elasticsearch"</code>, <code>"documentdb"</code>,
     *        <code>"sqlserver"</code>, and <code>"neptune"</code>.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndpointType, include <code>"mysql"</code>,
     * <code>"oracle"</code>, <code>"postgres"</code>, <code>"mariadb"</code>, <code>"aurora"</code>,
     * <code>"aurora-postgresql"</code>, <code>"redshift"</code>, <code>"s3"</code>, <code>"db2"</code>,
     * <code>"azuredb"</code>, <code>"sybase"</code>, <code>"dynamodb"</code>, <code>"mongodb"</code>,
     * <code>"kinesis"</code>, <code>"kafka"</code>, <code>"elasticsearch"</code>, <code>"documentdb"</code>,
     * <code>"sqlserver"</code>, and <code>"neptune"</code>.
     * </p>
     * 
     * @return The database engine name. Valid values, depending on the EndpointType, include <code>"mysql"</code>,
     *         <code>"oracle"</code>, <code>"postgres"</code>, <code>"mariadb"</code>, <code>"aurora"</code>,
     *         <code>"aurora-postgresql"</code>, <code>"redshift"</code>, <code>"s3"</code>, <code>"db2"</code>,
     *         <code>"azuredb"</code>, <code>"sybase"</code>, <code>"dynamodb"</code>, <code>"mongodb"</code>,
     *         <code>"kinesis"</code>, <code>"kafka"</code>, <code>"elasticsearch"</code>, <code>"documentdb"</code>,
     *         <code>"sqlserver"</code>, and <code>"neptune"</code>.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndpointType, include <code>"mysql"</code>,
     * <code>"oracle"</code>, <code>"postgres"</code>, <code>"mariadb"</code>, <code>"aurora"</code>,
     * <code>"aurora-postgresql"</code>, <code>"redshift"</code>, <code>"s3"</code>, <code>"db2"</code>,
     * <code>"azuredb"</code>, <code>"sybase"</code>, <code>"dynamodb"</code>, <code>"mongodb"</code>,
     * <code>"kinesis"</code>, <code>"kafka"</code>, <code>"elasticsearch"</code>, <code>"documentdb"</code>,
     * <code>"sqlserver"</code>, and <code>"neptune"</code>.
     * </p>
     * 
     * @param engineName
     *        The database engine name. Valid values, depending on the EndpointType, include <code>"mysql"</code>,
     *        <code>"oracle"</code>, <code>"postgres"</code>, <code>"mariadb"</code>, <code>"aurora"</code>,
     *        <code>"aurora-postgresql"</code>, <code>"redshift"</code>, <code>"s3"</code>, <code>"db2"</code>,
     *        <code>"azuredb"</code>, <code>"sybase"</code>, <code>"dynamodb"</code>, <code>"mongodb"</code>,
     *        <code>"kinesis"</code>, <code>"kafka"</code>, <code>"elasticsearch"</code>, <code>"documentdb"</code>,
     *        <code>"sqlserver"</code>, and <code>"neptune"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedEndpointType withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * Indicates if change data capture (CDC) is supported.
     * </p>
     * 
     * @param supportsCDC
     *        Indicates if change data capture (CDC) is supported.
     */

    public void setSupportsCDC(Boolean supportsCDC) {
        this.supportsCDC = supportsCDC;
    }

    /**
     * <p>
     * Indicates if change data capture (CDC) is supported.
     * </p>
     * 
     * @return Indicates if change data capture (CDC) is supported.
     */

    public Boolean getSupportsCDC() {
        return this.supportsCDC;
    }

    /**
     * <p>
     * Indicates if change data capture (CDC) is supported.
     * </p>
     * 
     * @param supportsCDC
     *        Indicates if change data capture (CDC) is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedEndpointType withSupportsCDC(Boolean supportsCDC) {
        setSupportsCDC(supportsCDC);
        return this;
    }

    /**
     * <p>
     * Indicates if change data capture (CDC) is supported.
     * </p>
     * 
     * @return Indicates if change data capture (CDC) is supported.
     */

    public Boolean isSupportsCDC() {
        return this.supportsCDC;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * </p>
     * 
     * @return The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * @see ReplicationEndpointTypeValue
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public SupportedEndpointType withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(ReplicationEndpointTypeValue endpointType) {
        withEndpointType(endpointType);
    }

    /**
     * <p>
     * The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint. Valid values are <code>source</code> and <code>target</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public SupportedEndpointType withEndpointType(ReplicationEndpointTypeValue endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The earliest DMS engine version that supports this endpoint engine. Note that endpoint engines released with DMS
     * versions earlier than 3.1.1 do not return a value for this parameter.
     * </p>
     * 
     * @param replicationInstanceEngineMinimumVersion
     *        The earliest DMS engine version that supports this endpoint engine. Note that endpoint engines released
     *        with DMS versions earlier than 3.1.1 do not return a value for this parameter.
     */

    public void setReplicationInstanceEngineMinimumVersion(String replicationInstanceEngineMinimumVersion) {
        this.replicationInstanceEngineMinimumVersion = replicationInstanceEngineMinimumVersion;
    }

    /**
     * <p>
     * The earliest DMS engine version that supports this endpoint engine. Note that endpoint engines released with DMS
     * versions earlier than 3.1.1 do not return a value for this parameter.
     * </p>
     * 
     * @return The earliest DMS engine version that supports this endpoint engine. Note that endpoint engines released
     *         with DMS versions earlier than 3.1.1 do not return a value for this parameter.
     */

    public String getReplicationInstanceEngineMinimumVersion() {
        return this.replicationInstanceEngineMinimumVersion;
    }

    /**
     * <p>
     * The earliest DMS engine version that supports this endpoint engine. Note that endpoint engines released with DMS
     * versions earlier than 3.1.1 do not return a value for this parameter.
     * </p>
     * 
     * @param replicationInstanceEngineMinimumVersion
     *        The earliest DMS engine version that supports this endpoint engine. Note that endpoint engines released
     *        with DMS versions earlier than 3.1.1 do not return a value for this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedEndpointType withReplicationInstanceEngineMinimumVersion(String replicationInstanceEngineMinimumVersion) {
        setReplicationInstanceEngineMinimumVersion(replicationInstanceEngineMinimumVersion);
        return this;
    }

    /**
     * <p>
     * The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora," this
     * value would be "Amazon Aurora MySQL."
     * </p>
     * 
     * @param engineDisplayName
     *        The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora,"
     *        this value would be "Amazon Aurora MySQL."
     */

    public void setEngineDisplayName(String engineDisplayName) {
        this.engineDisplayName = engineDisplayName;
    }

    /**
     * <p>
     * The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora," this
     * value would be "Amazon Aurora MySQL."
     * </p>
     * 
     * @return The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora,"
     *         this value would be "Amazon Aurora MySQL."
     */

    public String getEngineDisplayName() {
        return this.engineDisplayName;
    }

    /**
     * <p>
     * The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora," this
     * value would be "Amazon Aurora MySQL."
     * </p>
     * 
     * @param engineDisplayName
     *        The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora,"
     *        this value would be "Amazon Aurora MySQL."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedEndpointType withEngineDisplayName(String engineDisplayName) {
        setEngineDisplayName(engineDisplayName);
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
        if (getEngineName() != null)
            sb.append("EngineName: ").append(getEngineName()).append(",");
        if (getSupportsCDC() != null)
            sb.append("SupportsCDC: ").append(getSupportsCDC()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getReplicationInstanceEngineMinimumVersion() != null)
            sb.append("ReplicationInstanceEngineMinimumVersion: ").append(getReplicationInstanceEngineMinimumVersion()).append(",");
        if (getEngineDisplayName() != null)
            sb.append("EngineDisplayName: ").append(getEngineDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SupportedEndpointType == false)
            return false;
        SupportedEndpointType other = (SupportedEndpointType) obj;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getSupportsCDC() == null ^ this.getSupportsCDC() == null)
            return false;
        if (other.getSupportsCDC() != null && other.getSupportsCDC().equals(this.getSupportsCDC()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getReplicationInstanceEngineMinimumVersion() == null ^ this.getReplicationInstanceEngineMinimumVersion() == null)
            return false;
        if (other.getReplicationInstanceEngineMinimumVersion() != null
                && other.getReplicationInstanceEngineMinimumVersion().equals(this.getReplicationInstanceEngineMinimumVersion()) == false)
            return false;
        if (other.getEngineDisplayName() == null ^ this.getEngineDisplayName() == null)
            return false;
        if (other.getEngineDisplayName() != null && other.getEngineDisplayName().equals(this.getEngineDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getSupportsCDC() == null) ? 0 : getSupportsCDC().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceEngineMinimumVersion() == null) ? 0 : getReplicationInstanceEngineMinimumVersion().hashCode());
        hashCode = prime * hashCode + ((getEngineDisplayName() == null) ? 0 : getEngineDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public SupportedEndpointType clone() {
        try {
            return (SupportedEndpointType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.SupportedEndpointTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
