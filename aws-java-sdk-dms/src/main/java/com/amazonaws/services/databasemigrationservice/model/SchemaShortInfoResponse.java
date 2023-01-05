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
 * Describes a schema in a Fleet Advisor collector inventory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/SchemaShortInfoResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaShortInfoResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a schema in a Fleet Advisor collector inventory.
     * </p>
     */
    private String schemaId;
    /**
     * <p>
     * The name of a schema in a Fleet Advisor collector inventory.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The ID of a database in a Fleet Advisor collector inventory.
     * </p>
     */
    private String databaseId;
    /**
     * <p>
     * The name of a database in a Fleet Advisor collector inventory.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The IP address of a database in a Fleet Advisor collector inventory.
     * </p>
     */
    private String databaseIpAddress;

    /**
     * <p>
     * The ID of a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param schemaId
     *        The ID of a schema in a Fleet Advisor collector inventory.
     */

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    /**
     * <p>
     * The ID of a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The ID of a schema in a Fleet Advisor collector inventory.
     */

    public String getSchemaId() {
        return this.schemaId;
    }

    /**
     * <p>
     * The ID of a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param schemaId
     *        The ID of a schema in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaShortInfoResponse withSchemaId(String schemaId) {
        setSchemaId(schemaId);
        return this;
    }

    /**
     * <p>
     * The name of a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param schemaName
     *        The name of a schema in a Fleet Advisor collector inventory.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name of a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The name of a schema in a Fleet Advisor collector inventory.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The name of a schema in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param schemaName
     *        The name of a schema in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaShortInfoResponse withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The ID of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param databaseId
     *        The ID of a database in a Fleet Advisor collector inventory.
     */

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    /**
     * <p>
     * The ID of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The ID of a database in a Fleet Advisor collector inventory.
     */

    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * <p>
     * The ID of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param databaseId
     *        The ID of a database in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaShortInfoResponse withDatabaseId(String databaseId) {
        setDatabaseId(databaseId);
        return this;
    }

    /**
     * <p>
     * The name of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param databaseName
     *        The name of a database in a Fleet Advisor collector inventory.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The name of a database in a Fleet Advisor collector inventory.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param databaseName
     *        The name of a database in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaShortInfoResponse withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The IP address of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param databaseIpAddress
     *        The IP address of a database in a Fleet Advisor collector inventory.
     */

    public void setDatabaseIpAddress(String databaseIpAddress) {
        this.databaseIpAddress = databaseIpAddress;
    }

    /**
     * <p>
     * The IP address of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The IP address of a database in a Fleet Advisor collector inventory.
     */

    public String getDatabaseIpAddress() {
        return this.databaseIpAddress;
    }

    /**
     * <p>
     * The IP address of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param databaseIpAddress
     *        The IP address of a database in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaShortInfoResponse withDatabaseIpAddress(String databaseIpAddress) {
        setDatabaseIpAddress(databaseIpAddress);
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
        if (getSchemaId() != null)
            sb.append("SchemaId: ").append(getSchemaId()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getDatabaseId() != null)
            sb.append("DatabaseId: ").append(getDatabaseId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDatabaseIpAddress() != null)
            sb.append("DatabaseIpAddress: ").append(getDatabaseIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaShortInfoResponse == false)
            return false;
        SchemaShortInfoResponse other = (SchemaShortInfoResponse) obj;
        if (other.getSchemaId() == null ^ this.getSchemaId() == null)
            return false;
        if (other.getSchemaId() != null && other.getSchemaId().equals(this.getSchemaId()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getDatabaseId() == null ^ this.getDatabaseId() == null)
            return false;
        if (other.getDatabaseId() != null && other.getDatabaseId().equals(this.getDatabaseId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDatabaseIpAddress() == null ^ this.getDatabaseIpAddress() == null)
            return false;
        if (other.getDatabaseIpAddress() != null && other.getDatabaseIpAddress().equals(this.getDatabaseIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaId() == null) ? 0 : getSchemaId().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseId() == null) ? 0 : getDatabaseId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseIpAddress() == null) ? 0 : getDatabaseIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public SchemaShortInfoResponse clone() {
        try {
            return (SchemaShortInfoResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.SchemaShortInfoResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
