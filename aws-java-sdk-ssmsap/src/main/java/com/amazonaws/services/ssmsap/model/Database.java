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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SAP HANA database of the application registered with AWS Systems Manager for SAP.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/Database" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Database implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The ID of the component.
     * </p>
     */
    private String componentId;
    /**
     * <p>
     * The credentials of the database.
     * </p>
     */
    private java.util.List<ApplicationCredential> credentials;
    /**
     * <p>
     * The ID of the SAP HANA database.
     * </p>
     */
    private String databaseId;
    /**
     * <p>
     * The name of the database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The type of the database.
     * </p>
     */
    private String databaseType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the database.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The primary host of the database.
     * </p>
     */
    private String primaryHost;
    /**
     * <p>
     * The SQL port of the database.
     * </p>
     */
    private Integer sQLPort;
    /**
     * <p>
     * The time at which the database was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The ID of the component.
     * </p>
     * 
     * @param componentId
     *        The ID of the component.
     */

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * <p>
     * The ID of the component.
     * </p>
     * 
     * @return The ID of the component.
     */

    public String getComponentId() {
        return this.componentId;
    }

    /**
     * <p>
     * The ID of the component.
     * </p>
     * 
     * @param componentId
     *        The ID of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withComponentId(String componentId) {
        setComponentId(componentId);
        return this;
    }

    /**
     * <p>
     * The credentials of the database.
     * </p>
     * 
     * @return The credentials of the database.
     */

    public java.util.List<ApplicationCredential> getCredentials() {
        return credentials;
    }

    /**
     * <p>
     * The credentials of the database.
     * </p>
     * 
     * @param credentials
     *        The credentials of the database.
     */

    public void setCredentials(java.util.Collection<ApplicationCredential> credentials) {
        if (credentials == null) {
            this.credentials = null;
            return;
        }

        this.credentials = new java.util.ArrayList<ApplicationCredential>(credentials);
    }

    /**
     * <p>
     * The credentials of the database.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCredentials(java.util.Collection)} or {@link #withCredentials(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param credentials
     *        The credentials of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withCredentials(ApplicationCredential... credentials) {
        if (this.credentials == null) {
            setCredentials(new java.util.ArrayList<ApplicationCredential>(credentials.length));
        }
        for (ApplicationCredential ele : credentials) {
            this.credentials.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The credentials of the database.
     * </p>
     * 
     * @param credentials
     *        The credentials of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withCredentials(java.util.Collection<ApplicationCredential> credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * The ID of the SAP HANA database.
     * </p>
     * 
     * @param databaseId
     *        The ID of the SAP HANA database.
     */

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    /**
     * <p>
     * The ID of the SAP HANA database.
     * </p>
     * 
     * @return The ID of the SAP HANA database.
     */

    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * <p>
     * The ID of the SAP HANA database.
     * </p>
     * 
     * @param databaseId
     *        The ID of the SAP HANA database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withDatabaseId(String databaseId) {
        setDatabaseId(databaseId);
        return this;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param databaseName
     *        The name of the database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @return The name of the database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param databaseName
     *        The name of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The type of the database.
     * </p>
     * 
     * @param databaseType
     *        The type of the database.
     * @see DatabaseType
     */

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    /**
     * <p>
     * The type of the database.
     * </p>
     * 
     * @return The type of the database.
     * @see DatabaseType
     */

    public String getDatabaseType() {
        return this.databaseType;
    }

    /**
     * <p>
     * The type of the database.
     * </p>
     * 
     * @param databaseType
     *        The type of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseType
     */

    public Database withDatabaseType(String databaseType) {
        setDatabaseType(databaseType);
        return this;
    }

    /**
     * <p>
     * The type of the database.
     * </p>
     * 
     * @param databaseType
     *        The type of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseType
     */

    public Database withDatabaseType(DatabaseType databaseType) {
        this.databaseType = databaseType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the database.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the database.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the database.
     * </p>
     * 
     * @param status
     *        The status of the database.
     * @see DatabaseStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the database.
     * </p>
     * 
     * @return The status of the database.
     * @see DatabaseStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the database.
     * </p>
     * 
     * @param status
     *        The status of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseStatus
     */

    public Database withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the database.
     * </p>
     * 
     * @param status
     *        The status of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseStatus
     */

    public Database withStatus(DatabaseStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The primary host of the database.
     * </p>
     * 
     * @param primaryHost
     *        The primary host of the database.
     */

    public void setPrimaryHost(String primaryHost) {
        this.primaryHost = primaryHost;
    }

    /**
     * <p>
     * The primary host of the database.
     * </p>
     * 
     * @return The primary host of the database.
     */

    public String getPrimaryHost() {
        return this.primaryHost;
    }

    /**
     * <p>
     * The primary host of the database.
     * </p>
     * 
     * @param primaryHost
     *        The primary host of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withPrimaryHost(String primaryHost) {
        setPrimaryHost(primaryHost);
        return this;
    }

    /**
     * <p>
     * The SQL port of the database.
     * </p>
     * 
     * @param sQLPort
     *        The SQL port of the database.
     */

    public void setSQLPort(Integer sQLPort) {
        this.sQLPort = sQLPort;
    }

    /**
     * <p>
     * The SQL port of the database.
     * </p>
     * 
     * @return The SQL port of the database.
     */

    public Integer getSQLPort() {
        return this.sQLPort;
    }

    /**
     * <p>
     * The SQL port of the database.
     * </p>
     * 
     * @param sQLPort
     *        The SQL port of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withSQLPort(Integer sQLPort) {
        setSQLPort(sQLPort);
        return this;
    }

    /**
     * <p>
     * The time at which the database was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time at which the database was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time at which the database was last updated.
     * </p>
     * 
     * @return The time at which the database was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The time at which the database was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time at which the database was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getComponentId() != null)
            sb.append("ComponentId: ").append(getComponentId()).append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials()).append(",");
        if (getDatabaseId() != null)
            sb.append("DatabaseId: ").append(getDatabaseId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDatabaseType() != null)
            sb.append("DatabaseType: ").append(getDatabaseType()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPrimaryHost() != null)
            sb.append("PrimaryHost: ").append(getPrimaryHost()).append(",");
        if (getSQLPort() != null)
            sb.append("SQLPort: ").append(getSQLPort()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Database == false)
            return false;
        Database other = (Database) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getComponentId() == null ^ this.getComponentId() == null)
            return false;
        if (other.getComponentId() != null && other.getComponentId().equals(this.getComponentId()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getDatabaseId() == null ^ this.getDatabaseId() == null)
            return false;
        if (other.getDatabaseId() != null && other.getDatabaseId().equals(this.getDatabaseId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDatabaseType() == null ^ this.getDatabaseType() == null)
            return false;
        if (other.getDatabaseType() != null && other.getDatabaseType().equals(this.getDatabaseType()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPrimaryHost() == null ^ this.getPrimaryHost() == null)
            return false;
        if (other.getPrimaryHost() != null && other.getPrimaryHost().equals(this.getPrimaryHost()) == false)
            return false;
        if (other.getSQLPort() == null ^ this.getSQLPort() == null)
            return false;
        if (other.getSQLPort() != null && other.getSQLPort().equals(this.getSQLPort()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getComponentId() == null) ? 0 : getComponentId().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getDatabaseId() == null) ? 0 : getDatabaseId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseType() == null) ? 0 : getDatabaseType().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPrimaryHost() == null) ? 0 : getPrimaryHost().hashCode());
        hashCode = prime * hashCode + ((getSQLPort() == null) ? 0 : getSQLPort().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        return hashCode;
    }

    @Override
    public Database clone() {
        try {
            return (Database) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.DatabaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
