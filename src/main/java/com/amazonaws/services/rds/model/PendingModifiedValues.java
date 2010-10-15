/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

/**
 * <p>
 * 
 * </p>
 */
public class PendingModifiedValues {

    /**
     * Contains the new <i>DBInstanceClass</i> for the DB Instance that will
     * be applied or is in progress.
     */
    private String dBInstanceClass;

    /**
     * Contains the new <i>AllocatedStorage</i> size for the DB Instance that
     * will be applied or is in progress.
     */
    private Integer allocatedStorage;

    /**
     * Contains the pending or in-progress change of the master credentials
     * for the DB Instance.
     */
    private String masterUserPassword;

    /**
     * Specifies the pending port for the DB Instance.
     */
    private Integer port;

    /**
     * Specifies the pending number of days for which automated backups are
     * retained.
     */
    private Integer backupRetentionPeriod;

    /**
     * Indicates that the Single-AZ DB Instance is to change to a Multi-AZ
     * deployment.
     */
    private Boolean multiAZ;

    private String engineVersion;

    /**
     * Default constructor for a new PendingModifiedValues object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PendingModifiedValues() {}
    
    /**
     * Contains the new <i>DBInstanceClass</i> for the DB Instance that will
     * be applied or is in progress.
     *
     * @return Contains the new <i>DBInstanceClass</i> for the DB Instance that will
     *         be applied or is in progress.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * Contains the new <i>DBInstanceClass</i> for the DB Instance that will
     * be applied or is in progress.
     *
     * @param dBInstanceClass Contains the new <i>DBInstanceClass</i> for the DB Instance that will
     *         be applied or is in progress.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * Contains the new <i>DBInstanceClass</i> for the DB Instance that will
     * be applied or is in progress.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass Contains the new <i>DBInstanceClass</i> for the DB Instance that will
     *         be applied or is in progress.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PendingModifiedValues withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }
    
    
    /**
     * Contains the new <i>AllocatedStorage</i> size for the DB Instance that
     * will be applied or is in progress.
     *
     * @return Contains the new <i>AllocatedStorage</i> size for the DB Instance that
     *         will be applied or is in progress.
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }
    
    /**
     * Contains the new <i>AllocatedStorage</i> size for the DB Instance that
     * will be applied or is in progress.
     *
     * @param allocatedStorage Contains the new <i>AllocatedStorage</i> size for the DB Instance that
     *         will be applied or is in progress.
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }
    
    /**
     * Contains the new <i>AllocatedStorage</i> size for the DB Instance that
     * will be applied or is in progress.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocatedStorage Contains the new <i>AllocatedStorage</i> size for the DB Instance that
     *         will be applied or is in progress.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PendingModifiedValues withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }
    
    
    /**
     * Contains the pending or in-progress change of the master credentials
     * for the DB Instance.
     *
     * @return Contains the pending or in-progress change of the master credentials
     *         for the DB Instance.
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }
    
    /**
     * Contains the pending or in-progress change of the master credentials
     * for the DB Instance.
     *
     * @param masterUserPassword Contains the pending or in-progress change of the master credentials
     *         for the DB Instance.
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * Contains the pending or in-progress change of the master credentials
     * for the DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUserPassword Contains the pending or in-progress change of the master credentials
     *         for the DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PendingModifiedValues withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }
    
    
    /**
     * Specifies the pending port for the DB Instance.
     *
     * @return Specifies the pending port for the DB Instance.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * Specifies the pending port for the DB Instance.
     *
     * @param port Specifies the pending port for the DB Instance.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * Specifies the pending port for the DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port Specifies the pending port for the DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PendingModifiedValues withPort(Integer port) {
        this.port = port;
        return this;
    }
    
    
    /**
     * Specifies the pending number of days for which automated backups are
     * retained.
     *
     * @return Specifies the pending number of days for which automated backups are
     *         retained.
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }
    
    /**
     * Specifies the pending number of days for which automated backups are
     * retained.
     *
     * @param backupRetentionPeriod Specifies the pending number of days for which automated backups are
     *         retained.
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }
    
    /**
     * Specifies the pending number of days for which automated backups are
     * retained.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backupRetentionPeriod Specifies the pending number of days for which automated backups are
     *         retained.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PendingModifiedValues withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    
    
    /**
     * Indicates that the Single-AZ DB Instance is to change to a Multi-AZ
     * deployment.
     *
     * @return Indicates that the Single-AZ DB Instance is to change to a Multi-AZ
     *         deployment.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Indicates that the Single-AZ DB Instance is to change to a Multi-AZ
     * deployment.
     *
     * @param multiAZ Indicates that the Single-AZ DB Instance is to change to a Multi-AZ
     *         deployment.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Indicates that the Single-AZ DB Instance is to change to a Multi-AZ
     * deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ Indicates that the Single-AZ DB Instance is to change to a Multi-AZ
     *         deployment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PendingModifiedValues withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }
    
    
    /**
     * Indicates that the Single-AZ DB Instance is to change to a Multi-AZ
     * deployment.
     *
     * @return Indicates that the Single-AZ DB Instance is to change to a Multi-AZ
     *         deployment.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Returns the value of the EngineVersion property for this object.
     *
     * @return The value of the EngineVersion property for this object.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * Sets the value of the EngineVersion property for this object.
     *
     * @param engineVersion The new value for the EngineVersion property for this object.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * Sets the value of the EngineVersion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The new value for the EngineVersion property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PendingModifiedValues withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        sb.append("AllocatedStorage: " + allocatedStorage + ", ");
        sb.append("MasterUserPassword: " + masterUserPassword + ", ");
        sb.append("Port: " + port + ", ");
        sb.append("BackupRetentionPeriod: " + backupRetentionPeriod + ", ");
        sb.append("MultiAZ: " + multiAZ + ", ");
        sb.append("EngineVersion: " + engineVersion + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    