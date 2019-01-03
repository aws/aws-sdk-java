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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateGlobalCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGlobalClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier of the new global database cluster.
     * </p>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is optional.
     * </p>
     */
    private String sourceDBClusterIdentifier;
    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The engine version of the Aurora global database.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The deletion protection setting for the new global database. The global database can't be deleted when this value
     * is set to true.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Aurora will
     * not create a database in the global database cluster you are creating.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The storage encryption setting for the new global database cluster.
     * </p>
     */
    private Boolean storageEncrypted;

    /**
     * <p>
     * The cluster identifier of the new global database cluster.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The cluster identifier of the new global database cluster.
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the new global database cluster.
     * </p>
     * 
     * @return The cluster identifier of the new global database cluster.
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the new global database cluster.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The cluster identifier of the new global database cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        setGlobalClusterIdentifier(globalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is optional.
     * </p>
     * 
     * @param sourceDBClusterIdentifier
     *        The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is
     *        optional.
     */

    public void setSourceDBClusterIdentifier(String sourceDBClusterIdentifier) {
        this.sourceDBClusterIdentifier = sourceDBClusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is optional.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is
     *         optional.
     */

    public String getSourceDBClusterIdentifier() {
        return this.sourceDBClusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is optional.
     * </p>
     * 
     * @param sourceDBClusterIdentifier
     *        The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is
     *        optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withSourceDBClusterIdentifier(String sourceDBClusterIdentifier) {
        setSourceDBClusterIdentifier(sourceDBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     * 
     * @param engine
     *        Provides the name of the database engine to be used for this DB cluster.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     * 
     * @return Provides the name of the database engine to be used for this DB cluster.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     * 
     * @param engine
     *        Provides the name of the database engine to be used for this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The engine version of the Aurora global database.
     * </p>
     * 
     * @param engineVersion
     *        The engine version of the Aurora global database.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version of the Aurora global database.
     * </p>
     * 
     * @return The engine version of the Aurora global database.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version of the Aurora global database.
     * </p>
     * 
     * @param engineVersion
     *        The engine version of the Aurora global database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database. The global database can't be deleted when this value
     * is set to true.
     * </p>
     * 
     * @param deletionProtection
     *        The deletion protection setting for the new global database. The global database can't be deleted when
     *        this value is set to true.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database. The global database can't be deleted when this value
     * is set to true.
     * </p>
     * 
     * @return The deletion protection setting for the new global database. The global database can't be deleted when
     *         this value is set to true.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database. The global database can't be deleted when this value
     * is set to true.
     * </p>
     * 
     * @param deletionProtection
     *        The deletion protection setting for the new global database. The global database can't be deleted when
     *        this value is set to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database. The global database can't be deleted when this value
     * is set to true.
     * </p>
     * 
     * @return The deletion protection setting for the new global database. The global database can't be deleted when
     *         this value is set to true.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Aurora will
     * not create a database in the global database cluster you are creating.
     * </p>
     * 
     * @param databaseName
     *        The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon
     *        Aurora will not create a database in the global database cluster you are creating.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Aurora will
     * not create a database in the global database cluster you are creating.
     * </p>
     * 
     * @return The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon
     *         Aurora will not create a database in the global database cluster you are creating.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Aurora will
     * not create a database in the global database cluster you are creating.
     * </p>
     * 
     * @param databaseName
     *        The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon
     *        Aurora will not create a database in the global database cluster you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The storage encryption setting for the new global database cluster.
     * </p>
     * 
     * @param storageEncrypted
     *        The storage encryption setting for the new global database cluster.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * The storage encryption setting for the new global database cluster.
     * </p>
     * 
     * @return The storage encryption setting for the new global database cluster.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * The storage encryption setting for the new global database cluster.
     * </p>
     * 
     * @param storageEncrypted
     *        The storage encryption setting for the new global database cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalClusterRequest withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * The storage encryption setting for the new global database cluster.
     * </p>
     * 
     * @return The storage encryption setting for the new global database cluster.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
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
        if (getSourceDBClusterIdentifier() != null)
            sb.append("SourceDBClusterIdentifier: ").append(getSourceDBClusterIdentifier()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGlobalClusterRequest == false)
            return false;
        CreateGlobalClusterRequest other = (CreateGlobalClusterRequest) obj;
        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getSourceDBClusterIdentifier() == null ^ this.getSourceDBClusterIdentifier() == null)
            return false;
        if (other.getSourceDBClusterIdentifier() != null && other.getSourceDBClusterIdentifier().equals(this.getSourceDBClusterIdentifier()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceDBClusterIdentifier() == null) ? 0 : getSourceDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        return hashCode;
    }

    @Override
    public CreateGlobalClusterRequest clone() {
        return (CreateGlobalClusterRequest) super.clone();
    }

}
