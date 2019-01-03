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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A data type representing an Aurora global database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/GlobalCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalCluster implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a user-supplied global database cluster identifier. This identifier is the unique key that identifies a
     * global database cluster.
     * </p>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS
     * CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
     * </p>
     */
    private String globalClusterResourceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the global database cluster.
     * </p>
     */
    private String globalClusterArn;
    /**
     * <p>
     * Specifies the current state of this global database cluster.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Aurora database engine used by the global database cluster.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The default database name within the new global database cluster.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The storage encryption setting for the global database cluster.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * The deletion protection setting for the new global database cluster.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1 item.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GlobalClusterMember> globalClusterMembers;

    /**
     * <p>
     * Contains a user-supplied global database cluster identifier. This identifier is the unique key that identifies a
     * global database cluster.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        Contains a user-supplied global database cluster identifier. This identifier is the unique key that
     *        identifies a global database cluster.
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied global database cluster identifier. This identifier is the unique key that identifies a
     * global database cluster.
     * </p>
     * 
     * @return Contains a user-supplied global database cluster identifier. This identifier is the unique key that
     *         identifies a global database cluster.
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied global database cluster identifier. This identifier is the unique key that identifies a
     * global database cluster.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        Contains a user-supplied global database cluster identifier. This identifier is the unique key that
     *        identifies a global database cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalCluster withGlobalClusterIdentifier(String globalClusterIdentifier) {
        setGlobalClusterIdentifier(globalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS
     * CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
     * </p>
     * 
     * @param globalClusterResourceId
     *        The AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in
     *        AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
     */

    public void setGlobalClusterResourceId(String globalClusterResourceId) {
        this.globalClusterResourceId = globalClusterResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS
     * CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
     * </p>
     * 
     * @return The AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in
     *         AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
     */

    public String getGlobalClusterResourceId() {
        return this.globalClusterResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS
     * CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
     * </p>
     * 
     * @param globalClusterResourceId
     *        The AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in
     *        AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalCluster withGlobalClusterResourceId(String globalClusterResourceId) {
        setGlobalClusterResourceId(globalClusterResourceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the global database cluster.
     * </p>
     * 
     * @param globalClusterArn
     *        The Amazon Resource Name (ARN) for the global database cluster.
     */

    public void setGlobalClusterArn(String globalClusterArn) {
        this.globalClusterArn = globalClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the global database cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the global database cluster.
     */

    public String getGlobalClusterArn() {
        return this.globalClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the global database cluster.
     * </p>
     * 
     * @param globalClusterArn
     *        The Amazon Resource Name (ARN) for the global database cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalCluster withGlobalClusterArn(String globalClusterArn) {
        setGlobalClusterArn(globalClusterArn);
        return this;
    }

    /**
     * <p>
     * Specifies the current state of this global database cluster.
     * </p>
     * 
     * @param status
     *        Specifies the current state of this global database cluster.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the current state of this global database cluster.
     * </p>
     * 
     * @return Specifies the current state of this global database cluster.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the current state of this global database cluster.
     * </p>
     * 
     * @param status
     *        Specifies the current state of this global database cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalCluster withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The Aurora database engine used by the global database cluster.
     * </p>
     * 
     * @param engine
     *        The Aurora database engine used by the global database cluster.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The Aurora database engine used by the global database cluster.
     * </p>
     * 
     * @return The Aurora database engine used by the global database cluster.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The Aurora database engine used by the global database cluster.
     * </p>
     * 
     * @param engine
     *        The Aurora database engine used by the global database cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalCluster withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @param engineVersion
     *        Indicates the database engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @return Indicates the database engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @param engineVersion
     *        Indicates the database engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalCluster withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The default database name within the new global database cluster.
     * </p>
     * 
     * @param databaseName
     *        The default database name within the new global database cluster.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The default database name within the new global database cluster.
     * </p>
     * 
     * @return The default database name within the new global database cluster.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The default database name within the new global database cluster.
     * </p>
     * 
     * @param databaseName
     *        The default database name within the new global database cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalCluster withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The storage encryption setting for the global database cluster.
     * </p>
     * 
     * @param storageEncrypted
     *        The storage encryption setting for the global database cluster.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * The storage encryption setting for the global database cluster.
     * </p>
     * 
     * @return The storage encryption setting for the global database cluster.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * The storage encryption setting for the global database cluster.
     * </p>
     * 
     * @param storageEncrypted
     *        The storage encryption setting for the global database cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalCluster withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * The storage encryption setting for the global database cluster.
     * </p>
     * 
     * @return The storage encryption setting for the global database cluster.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database cluster.
     * </p>
     * 
     * @param deletionProtection
     *        The deletion protection setting for the new global database cluster.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database cluster.
     * </p>
     * 
     * @return The deletion protection setting for the new global database cluster.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database cluster.
     * </p>
     * 
     * @param deletionProtection
     *        The deletion protection setting for the new global database cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalCluster withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database cluster.
     * </p>
     * 
     * @return The deletion protection setting for the new global database cluster.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1 item.
     * </p>
     * 
     * @return The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1
     *         item.
     */

    public java.util.List<GlobalClusterMember> getGlobalClusterMembers() {
        if (globalClusterMembers == null) {
            globalClusterMembers = new com.amazonaws.internal.SdkInternalList<GlobalClusterMember>();
        }
        return globalClusterMembers;
    }

    /**
     * <p>
     * The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1 item.
     * </p>
     * 
     * @param globalClusterMembers
     *        The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1
     *        item.
     */

    public void setGlobalClusterMembers(java.util.Collection<GlobalClusterMember> globalClusterMembers) {
        if (globalClusterMembers == null) {
            this.globalClusterMembers = null;
            return;
        }

        this.globalClusterMembers = new com.amazonaws.internal.SdkInternalList<GlobalClusterMember>(globalClusterMembers);
    }

    /**
     * <p>
     * The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1 item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalClusterMembers(java.util.Collection)} or {@link #withGlobalClusterMembers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param globalClusterMembers
     *        The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1
     *        item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalCluster withGlobalClusterMembers(GlobalClusterMember... globalClusterMembers) {
        if (this.globalClusterMembers == null) {
            setGlobalClusterMembers(new com.amazonaws.internal.SdkInternalList<GlobalClusterMember>(globalClusterMembers.length));
        }
        for (GlobalClusterMember ele : globalClusterMembers) {
            this.globalClusterMembers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1 item.
     * </p>
     * 
     * @param globalClusterMembers
     *        The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1
     *        item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalCluster withGlobalClusterMembers(java.util.Collection<GlobalClusterMember> globalClusterMembers) {
        setGlobalClusterMembers(globalClusterMembers);
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
        if (getGlobalClusterIdentifier() != null)
            sb.append("GlobalClusterIdentifier: ").append(getGlobalClusterIdentifier()).append(",");
        if (getGlobalClusterResourceId() != null)
            sb.append("GlobalClusterResourceId: ").append(getGlobalClusterResourceId()).append(",");
        if (getGlobalClusterArn() != null)
            sb.append("GlobalClusterArn: ").append(getGlobalClusterArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getGlobalClusterMembers() != null)
            sb.append("GlobalClusterMembers: ").append(getGlobalClusterMembers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalCluster == false)
            return false;
        GlobalCluster other = (GlobalCluster) obj;
        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getGlobalClusterResourceId() == null ^ this.getGlobalClusterResourceId() == null)
            return false;
        if (other.getGlobalClusterResourceId() != null && other.getGlobalClusterResourceId().equals(this.getGlobalClusterResourceId()) == false)
            return false;
        if (other.getGlobalClusterArn() == null ^ this.getGlobalClusterArn() == null)
            return false;
        if (other.getGlobalClusterArn() != null && other.getGlobalClusterArn().equals(this.getGlobalClusterArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getGlobalClusterMembers() == null ^ this.getGlobalClusterMembers() == null)
            return false;
        if (other.getGlobalClusterMembers() != null && other.getGlobalClusterMembers().equals(this.getGlobalClusterMembers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGlobalClusterResourceId() == null) ? 0 : getGlobalClusterResourceId().hashCode());
        hashCode = prime * hashCode + ((getGlobalClusterArn() == null) ? 0 : getGlobalClusterArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getGlobalClusterMembers() == null) ? 0 : getGlobalClusterMembers().hashCode());
        return hashCode;
    }

    @Override
    public GlobalCluster clone() {
        try {
            return (GlobalCluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
