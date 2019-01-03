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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a relational database data source configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/RelationalDatabaseDataSourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabaseDataSourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Source type for the relational database.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RDS_HTTP_ENDPOINT</b>: The relational database source type is an Amazon RDS HTTP endpoint.
     * </p>
     * </li>
     * </ul>
     */
    private String relationalDatabaseSourceType;
    /**
     * <p>
     * Amazon RDS HTTP endpoint settings.
     * </p>
     */
    private RdsHttpEndpointConfig rdsHttpEndpointConfig;

    /**
     * <p>
     * Source type for the relational database.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RDS_HTTP_ENDPOINT</b>: The relational database source type is an Amazon RDS HTTP endpoint.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationalDatabaseSourceType
     *        Source type for the relational database.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RDS_HTTP_ENDPOINT</b>: The relational database source type is an Amazon RDS HTTP endpoint.
     *        </p>
     *        </li>
     * @see RelationalDatabaseSourceType
     */

    public void setRelationalDatabaseSourceType(String relationalDatabaseSourceType) {
        this.relationalDatabaseSourceType = relationalDatabaseSourceType;
    }

    /**
     * <p>
     * Source type for the relational database.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RDS_HTTP_ENDPOINT</b>: The relational database source type is an Amazon RDS HTTP endpoint.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Source type for the relational database.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>RDS_HTTP_ENDPOINT</b>: The relational database source type is an Amazon RDS HTTP endpoint.
     *         </p>
     *         </li>
     * @see RelationalDatabaseSourceType
     */

    public String getRelationalDatabaseSourceType() {
        return this.relationalDatabaseSourceType;
    }

    /**
     * <p>
     * Source type for the relational database.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RDS_HTTP_ENDPOINT</b>: The relational database source type is an Amazon RDS HTTP endpoint.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationalDatabaseSourceType
     *        Source type for the relational database.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RDS_HTTP_ENDPOINT</b>: The relational database source type is an Amazon RDS HTTP endpoint.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationalDatabaseSourceType
     */

    public RelationalDatabaseDataSourceConfig withRelationalDatabaseSourceType(String relationalDatabaseSourceType) {
        setRelationalDatabaseSourceType(relationalDatabaseSourceType);
        return this;
    }

    /**
     * <p>
     * Source type for the relational database.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RDS_HTTP_ENDPOINT</b>: The relational database source type is an Amazon RDS HTTP endpoint.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationalDatabaseSourceType
     *        Source type for the relational database.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RDS_HTTP_ENDPOINT</b>: The relational database source type is an Amazon RDS HTTP endpoint.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationalDatabaseSourceType
     */

    public RelationalDatabaseDataSourceConfig withRelationalDatabaseSourceType(RelationalDatabaseSourceType relationalDatabaseSourceType) {
        this.relationalDatabaseSourceType = relationalDatabaseSourceType.toString();
        return this;
    }

    /**
     * <p>
     * Amazon RDS HTTP endpoint settings.
     * </p>
     * 
     * @param rdsHttpEndpointConfig
     *        Amazon RDS HTTP endpoint settings.
     */

    public void setRdsHttpEndpointConfig(RdsHttpEndpointConfig rdsHttpEndpointConfig) {
        this.rdsHttpEndpointConfig = rdsHttpEndpointConfig;
    }

    /**
     * <p>
     * Amazon RDS HTTP endpoint settings.
     * </p>
     * 
     * @return Amazon RDS HTTP endpoint settings.
     */

    public RdsHttpEndpointConfig getRdsHttpEndpointConfig() {
        return this.rdsHttpEndpointConfig;
    }

    /**
     * <p>
     * Amazon RDS HTTP endpoint settings.
     * </p>
     * 
     * @param rdsHttpEndpointConfig
     *        Amazon RDS HTTP endpoint settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseDataSourceConfig withRdsHttpEndpointConfig(RdsHttpEndpointConfig rdsHttpEndpointConfig) {
        setRdsHttpEndpointConfig(rdsHttpEndpointConfig);
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
        if (getRelationalDatabaseSourceType() != null)
            sb.append("RelationalDatabaseSourceType: ").append(getRelationalDatabaseSourceType()).append(",");
        if (getRdsHttpEndpointConfig() != null)
            sb.append("RdsHttpEndpointConfig: ").append(getRdsHttpEndpointConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalDatabaseDataSourceConfig == false)
            return false;
        RelationalDatabaseDataSourceConfig other = (RelationalDatabaseDataSourceConfig) obj;
        if (other.getRelationalDatabaseSourceType() == null ^ this.getRelationalDatabaseSourceType() == null)
            return false;
        if (other.getRelationalDatabaseSourceType() != null && other.getRelationalDatabaseSourceType().equals(this.getRelationalDatabaseSourceType()) == false)
            return false;
        if (other.getRdsHttpEndpointConfig() == null ^ this.getRdsHttpEndpointConfig() == null)
            return false;
        if (other.getRdsHttpEndpointConfig() != null && other.getRdsHttpEndpointConfig().equals(this.getRdsHttpEndpointConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalDatabaseSourceType() == null) ? 0 : getRelationalDatabaseSourceType().hashCode());
        hashCode = prime * hashCode + ((getRdsHttpEndpointConfig() == null) ? 0 : getRdsHttpEndpointConfig().hashCode());
        return hashCode;
    }

    @Override
    public RelationalDatabaseDataSourceConfig clone() {
        try {
            return (RelationalDatabaseDataSourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.RelationalDatabaseDataSourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
