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
 * Describes a database in a Fleet Advisor collector inventory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DatabaseShortInfoResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseShortInfoResponse implements Serializable, Cloneable, StructuredPojo {

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
     * The database engine of a database in a Fleet Advisor collector inventory, for example <code>PostgreSQL</code>.
     * </p>
     */
    private String databaseEngine;

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

    public DatabaseShortInfoResponse withDatabaseId(String databaseId) {
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

    public DatabaseShortInfoResponse withDatabaseName(String databaseName) {
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

    public DatabaseShortInfoResponse withDatabaseIpAddress(String databaseIpAddress) {
        setDatabaseIpAddress(databaseIpAddress);
        return this;
    }

    /**
     * <p>
     * The database engine of a database in a Fleet Advisor collector inventory, for example <code>PostgreSQL</code>.
     * </p>
     * 
     * @param databaseEngine
     *        The database engine of a database in a Fleet Advisor collector inventory, for example
     *        <code>PostgreSQL</code>.
     */

    public void setDatabaseEngine(String databaseEngine) {
        this.databaseEngine = databaseEngine;
    }

    /**
     * <p>
     * The database engine of a database in a Fleet Advisor collector inventory, for example <code>PostgreSQL</code>.
     * </p>
     * 
     * @return The database engine of a database in a Fleet Advisor collector inventory, for example
     *         <code>PostgreSQL</code>.
     */

    public String getDatabaseEngine() {
        return this.databaseEngine;
    }

    /**
     * <p>
     * The database engine of a database in a Fleet Advisor collector inventory, for example <code>PostgreSQL</code>.
     * </p>
     * 
     * @param databaseEngine
     *        The database engine of a database in a Fleet Advisor collector inventory, for example
     *        <code>PostgreSQL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseShortInfoResponse withDatabaseEngine(String databaseEngine) {
        setDatabaseEngine(databaseEngine);
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
        if (getDatabaseId() != null)
            sb.append("DatabaseId: ").append(getDatabaseId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDatabaseIpAddress() != null)
            sb.append("DatabaseIpAddress: ").append(getDatabaseIpAddress()).append(",");
        if (getDatabaseEngine() != null)
            sb.append("DatabaseEngine: ").append(getDatabaseEngine());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabaseShortInfoResponse == false)
            return false;
        DatabaseShortInfoResponse other = (DatabaseShortInfoResponse) obj;
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
        if (other.getDatabaseEngine() == null ^ this.getDatabaseEngine() == null)
            return false;
        if (other.getDatabaseEngine() != null && other.getDatabaseEngine().equals(this.getDatabaseEngine()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseId() == null) ? 0 : getDatabaseId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseIpAddress() == null) ? 0 : getDatabaseIpAddress().hashCode());
        hashCode = prime * hashCode + ((getDatabaseEngine() == null) ? 0 : getDatabaseEngine().hashCode());
        return hashCode;
    }

    @Override
    public DatabaseShortInfoResponse clone() {
        try {
            return (DatabaseShortInfoResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.DatabaseShortInfoResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
