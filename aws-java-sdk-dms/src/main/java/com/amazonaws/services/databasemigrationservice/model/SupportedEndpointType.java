/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/SupportedEndpointType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SupportedEndpointType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres, mariadb,
     * aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and sqlserver.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     */
    private Boolean supportsCDC;
    /**
     * <p>
     * The type of endpoint.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora," this
     * value would be "Amazon Aurora MySQL."
     * </p>
     */
    private String engineDisplayName;

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres, mariadb,
     * aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and sqlserver.
     * </p>
     * 
     * @param engineName
     *        The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres,
     *        mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and
     *        sqlserver.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres, mariadb,
     * aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and sqlserver.
     * </p>
     * 
     * @return The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres,
     *         mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and
     *         sqlserver.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres, mariadb,
     * aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and sqlserver.
     * </p>
     * 
     * @param engineName
     *        The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres,
     *        mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and
     *        sqlserver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedEndpointType withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     * 
     * @param supportsCDC
     *        Indicates if Change Data Capture (CDC) is supported.
     */

    public void setSupportsCDC(Boolean supportsCDC) {
        this.supportsCDC = supportsCDC;
    }

    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     * 
     * @return Indicates if Change Data Capture (CDC) is supported.
     */

    public Boolean getSupportsCDC() {
        return this.supportsCDC;
    }

    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     * 
     * @param supportsCDC
     *        Indicates if Change Data Capture (CDC) is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedEndpointType withSupportsCDC(Boolean supportsCDC) {
        setSupportsCDC(supportsCDC);
        return this;
    }

    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     * 
     * @return Indicates if Change Data Capture (CDC) is supported.
     */

    public Boolean isSupportsCDC() {
        return this.supportsCDC;
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

    public SupportedEndpointType withEndpointType(String endpointType) {
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
        withEndpointType(endpointType);
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

    public SupportedEndpointType withEndpointType(ReplicationEndpointTypeValue endpointType) {
        this.endpointType = endpointType.toString();
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
