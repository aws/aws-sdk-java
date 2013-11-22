/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * <p>
 * This data type is used as a response element in the ModifyDBInstance action.
 * </p>
 */
public class PendingModifiedValues implements Serializable {

    /**
     * Contains the new <code>DBInstanceClass</code> for the DB instance that
     * will be applied or is in progress.
     */
    private String dBInstanceClass;

    /**
     * Contains the new <code>AllocatedStorage</code> size for the DB
     * instance that will be applied or is in progress.
     */
    private Integer allocatedStorage;

    /**
     * Contains the pending or in-progress change of the master credentials
     * for the DB instance.
     */
    private String masterUserPassword;

    /**
     * Specifies the pending port for the DB instance.
     */
    private Integer port;

    /**
     * Specifies the pending number of days for which automated backups are
     * retained.
     */
    private Integer backupRetentionPeriod;

    /**
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ
     * deployment.
     */
    private Boolean multiAZ;

    /**
     * Indicates the database engine version.
     */
    private String engineVersion;

    /**
     * Specifies the new Provisioned IOPS value for the DB instance that will
     * be applied or is being applied.
     */
    private Integer iops;

    /**
     * Contains the new <code>DBInstanceIdentifier</code> for the DB instance
     * that will be applied or is in progress.
     */
    private String dBInstanceIdentifier;

    /**
     * Default constructor for a new PendingModifiedValues object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PendingModifiedValues() {}
    
    /**
     * Contains the new <code>DBInstanceClass</code> for the DB instance that
     * will be applied or is in progress.
     *
     * @return Contains the new <code>DBInstanceClass</code> for the DB instance that
     *         will be applied or is in progress.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * Contains the new <code>DBInstanceClass</code> for the DB instance that
     * will be applied or is in progress.
     *
     * @param dBInstanceClass Contains the new <code>DBInstanceClass</code> for the DB instance that
     *         will be applied or is in progress.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * Contains the new <code>DBInstanceClass</code> for the DB instance that
     * will be applied or is in progress.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass Contains the new <code>DBInstanceClass</code> for the DB instance that
     *         will be applied or is in progress.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * Contains the new <code>AllocatedStorage</code> size for the DB
     * instance that will be applied or is in progress.
     *
     * @return Contains the new <code>AllocatedStorage</code> size for the DB
     *         instance that will be applied or is in progress.
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }
    
    /**
     * Contains the new <code>AllocatedStorage</code> size for the DB
     * instance that will be applied or is in progress.
     *
     * @param allocatedStorage Contains the new <code>AllocatedStorage</code> size for the DB
     *         instance that will be applied or is in progress.
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }
    
    /**
     * Contains the new <code>AllocatedStorage</code> size for the DB
     * instance that will be applied or is in progress.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocatedStorage Contains the new <code>AllocatedStorage</code> size for the DB
     *         instance that will be applied or is in progress.
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
     * for the DB instance.
     *
     * @return Contains the pending or in-progress change of the master credentials
     *         for the DB instance.
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }
    
    /**
     * Contains the pending or in-progress change of the master credentials
     * for the DB instance.
     *
     * @param masterUserPassword Contains the pending or in-progress change of the master credentials
     *         for the DB instance.
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * Contains the pending or in-progress change of the master credentials
     * for the DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUserPassword Contains the pending or in-progress change of the master credentials
     *         for the DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * Specifies the pending port for the DB instance.
     *
     * @return Specifies the pending port for the DB instance.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * Specifies the pending port for the DB instance.
     *
     * @param port Specifies the pending port for the DB instance.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * Specifies the pending port for the DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port Specifies the pending port for the DB instance.
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
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ
     * deployment.
     *
     * @return Indicates that the Single-AZ DB instance is to change to a Multi-AZ
     *         deployment.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ
     * deployment.
     *
     * @param multiAZ Indicates that the Single-AZ DB instance is to change to a Multi-AZ
     *         deployment.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ
     * deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ Indicates that the Single-AZ DB instance is to change to a Multi-AZ
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
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ
     * deployment.
     *
     * @return Indicates that the Single-AZ DB instance is to change to a Multi-AZ
     *         deployment.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * Indicates the database engine version.
     *
     * @return Indicates the database engine version.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * Indicates the database engine version.
     *
     * @param engineVersion Indicates the database engine version.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * Indicates the database engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion Indicates the database engine version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * Specifies the new Provisioned IOPS value for the DB instance that will
     * be applied or is being applied.
     *
     * @return Specifies the new Provisioned IOPS value for the DB instance that will
     *         be applied or is being applied.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * Specifies the new Provisioned IOPS value for the DB instance that will
     * be applied or is being applied.
     *
     * @param iops Specifies the new Provisioned IOPS value for the DB instance that will
     *         be applied or is being applied.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * Specifies the new Provisioned IOPS value for the DB instance that will
     * be applied or is being applied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops Specifies the new Provisioned IOPS value for the DB instance that will
     *         be applied or is being applied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * Contains the new <code>DBInstanceIdentifier</code> for the DB instance
     * that will be applied or is in progress.
     *
     * @return Contains the new <code>DBInstanceIdentifier</code> for the DB instance
     *         that will be applied or is in progress.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * Contains the new <code>DBInstanceIdentifier</code> for the DB instance
     * that will be applied or is in progress.
     *
     * @param dBInstanceIdentifier Contains the new <code>DBInstanceIdentifier</code> for the DB instance
     *         that will be applied or is in progress.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * Contains the new <code>DBInstanceIdentifier</code> for the DB instance
     * that will be applied or is in progress.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier Contains the new <code>DBInstanceIdentifier</code> for the DB instance
     *         that will be applied or is in progress.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
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
        if (getDBInstanceClass() != null) sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getAllocatedStorage() != null) sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getMasterUserPassword() != null) sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getBackupRetentionPeriod() != null) sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (isMultiAZ() != null) sb.append("MultiAZ: " + isMultiAZ() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() + ",");
        if (getDBInstanceIdentifier() != null) sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode()); 
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode()); 
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode()); 
        hashCode = prime * hashCode + ((isMultiAZ() == null) ? 0 : isMultiAZ().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PendingModifiedValues == false) return false;
        PendingModifiedValues other = (PendingModifiedValues)obj;
        
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null) return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false) return false; 
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null) return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null) return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false) return false; 
        if (other.isMultiAZ() == null ^ this.isMultiAZ() == null) return false;
        if (other.isMultiAZ() != null && other.isMultiAZ().equals(this.isMultiAZ()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        return true;
    }
    
}
    