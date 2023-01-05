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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DatabaseResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseResponse implements Serializable, Cloneable, StructuredPojo {

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
    private String ipAddress;
    /**
     * <p>
     * The number of schemas in a Fleet Advisor collector inventory database.
     * </p>
     */
    private Long numberOfSchemas;
    /**
     * <p>
     * The server name of a database in a Fleet Advisor collector inventory.
     * </p>
     */
    private ServerShortInfoResponse server;
    /**
     * <p>
     * The software details of a database in a Fleet Advisor collector inventory, such as database engine and version.
     * </p>
     */
    private DatabaseInstanceSoftwareDetailsResponse softwareDetails;
    /**
     * <p>
     * A list of collectors associated with the database.
     * </p>
     */
    private java.util.List<CollectorShortInfoResponse> collectors;

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

    public DatabaseResponse withDatabaseId(String databaseId) {
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

    public DatabaseResponse withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The IP address of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of a database in a Fleet Advisor collector inventory.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The IP address of a database in a Fleet Advisor collector inventory.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of a database in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseResponse withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The number of schemas in a Fleet Advisor collector inventory database.
     * </p>
     * 
     * @param numberOfSchemas
     *        The number of schemas in a Fleet Advisor collector inventory database.
     */

    public void setNumberOfSchemas(Long numberOfSchemas) {
        this.numberOfSchemas = numberOfSchemas;
    }

    /**
     * <p>
     * The number of schemas in a Fleet Advisor collector inventory database.
     * </p>
     * 
     * @return The number of schemas in a Fleet Advisor collector inventory database.
     */

    public Long getNumberOfSchemas() {
        return this.numberOfSchemas;
    }

    /**
     * <p>
     * The number of schemas in a Fleet Advisor collector inventory database.
     * </p>
     * 
     * @param numberOfSchemas
     *        The number of schemas in a Fleet Advisor collector inventory database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseResponse withNumberOfSchemas(Long numberOfSchemas) {
        setNumberOfSchemas(numberOfSchemas);
        return this;
    }

    /**
     * <p>
     * The server name of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param server
     *        The server name of a database in a Fleet Advisor collector inventory.
     */

    public void setServer(ServerShortInfoResponse server) {
        this.server = server;
    }

    /**
     * <p>
     * The server name of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The server name of a database in a Fleet Advisor collector inventory.
     */

    public ServerShortInfoResponse getServer() {
        return this.server;
    }

    /**
     * <p>
     * The server name of a database in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param server
     *        The server name of a database in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseResponse withServer(ServerShortInfoResponse server) {
        setServer(server);
        return this;
    }

    /**
     * <p>
     * The software details of a database in a Fleet Advisor collector inventory, such as database engine and version.
     * </p>
     * 
     * @param softwareDetails
     *        The software details of a database in a Fleet Advisor collector inventory, such as database engine and
     *        version.
     */

    public void setSoftwareDetails(DatabaseInstanceSoftwareDetailsResponse softwareDetails) {
        this.softwareDetails = softwareDetails;
    }

    /**
     * <p>
     * The software details of a database in a Fleet Advisor collector inventory, such as database engine and version.
     * </p>
     * 
     * @return The software details of a database in a Fleet Advisor collector inventory, such as database engine and
     *         version.
     */

    public DatabaseInstanceSoftwareDetailsResponse getSoftwareDetails() {
        return this.softwareDetails;
    }

    /**
     * <p>
     * The software details of a database in a Fleet Advisor collector inventory, such as database engine and version.
     * </p>
     * 
     * @param softwareDetails
     *        The software details of a database in a Fleet Advisor collector inventory, such as database engine and
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseResponse withSoftwareDetails(DatabaseInstanceSoftwareDetailsResponse softwareDetails) {
        setSoftwareDetails(softwareDetails);
        return this;
    }

    /**
     * <p>
     * A list of collectors associated with the database.
     * </p>
     * 
     * @return A list of collectors associated with the database.
     */

    public java.util.List<CollectorShortInfoResponse> getCollectors() {
        return collectors;
    }

    /**
     * <p>
     * A list of collectors associated with the database.
     * </p>
     * 
     * @param collectors
     *        A list of collectors associated with the database.
     */

    public void setCollectors(java.util.Collection<CollectorShortInfoResponse> collectors) {
        if (collectors == null) {
            this.collectors = null;
            return;
        }

        this.collectors = new java.util.ArrayList<CollectorShortInfoResponse>(collectors);
    }

    /**
     * <p>
     * A list of collectors associated with the database.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollectors(java.util.Collection)} or {@link #withCollectors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param collectors
     *        A list of collectors associated with the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseResponse withCollectors(CollectorShortInfoResponse... collectors) {
        if (this.collectors == null) {
            setCollectors(new java.util.ArrayList<CollectorShortInfoResponse>(collectors.length));
        }
        for (CollectorShortInfoResponse ele : collectors) {
            this.collectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of collectors associated with the database.
     * </p>
     * 
     * @param collectors
     *        A list of collectors associated with the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseResponse withCollectors(java.util.Collection<CollectorShortInfoResponse> collectors) {
        setCollectors(collectors);
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
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getNumberOfSchemas() != null)
            sb.append("NumberOfSchemas: ").append(getNumberOfSchemas()).append(",");
        if (getServer() != null)
            sb.append("Server: ").append(getServer()).append(",");
        if (getSoftwareDetails() != null)
            sb.append("SoftwareDetails: ").append(getSoftwareDetails()).append(",");
        if (getCollectors() != null)
            sb.append("Collectors: ").append(getCollectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabaseResponse == false)
            return false;
        DatabaseResponse other = (DatabaseResponse) obj;
        if (other.getDatabaseId() == null ^ this.getDatabaseId() == null)
            return false;
        if (other.getDatabaseId() != null && other.getDatabaseId().equals(this.getDatabaseId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getNumberOfSchemas() == null ^ this.getNumberOfSchemas() == null)
            return false;
        if (other.getNumberOfSchemas() != null && other.getNumberOfSchemas().equals(this.getNumberOfSchemas()) == false)
            return false;
        if (other.getServer() == null ^ this.getServer() == null)
            return false;
        if (other.getServer() != null && other.getServer().equals(this.getServer()) == false)
            return false;
        if (other.getSoftwareDetails() == null ^ this.getSoftwareDetails() == null)
            return false;
        if (other.getSoftwareDetails() != null && other.getSoftwareDetails().equals(this.getSoftwareDetails()) == false)
            return false;
        if (other.getCollectors() == null ^ this.getCollectors() == null)
            return false;
        if (other.getCollectors() != null && other.getCollectors().equals(this.getCollectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseId() == null) ? 0 : getDatabaseId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getNumberOfSchemas() == null) ? 0 : getNumberOfSchemas().hashCode());
        hashCode = prime * hashCode + ((getServer() == null) ? 0 : getServer().hashCode());
        hashCode = prime * hashCode + ((getSoftwareDetails() == null) ? 0 : getSoftwareDetails().hashCode());
        hashCode = prime * hashCode + ((getCollectors() == null) ? 0 : getCollectors().hashCode());
        return hashCode;
    }

    @Override
    public DatabaseResponse clone() {
        try {
            return (DatabaseResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.DatabaseResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
