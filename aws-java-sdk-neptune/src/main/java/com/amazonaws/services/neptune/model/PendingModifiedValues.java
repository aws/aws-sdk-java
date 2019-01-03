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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This data type is used as a response element in the <a>ModifyDBInstance</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/PendingModifiedValues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingModifiedValues implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the new <code>DBInstanceClass</code> for the DB instance that will be applied or is currently being
     * applied.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * Contains the new <code>AllocatedStorage</code> size for the DB instance that will be applied or is currently
     * being applied.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Contains the pending or currently-in-progress change of the master credentials for the DB instance.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * Specifies the pending port for the DB instance.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Specifies the pending number of days for which automated backups are retained.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * Specifies the new Provisioned IOPS value for the DB instance that will be applied or is currently being applied.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Contains the new <code>DBInstanceIdentifier</code> for the DB instance that will be applied or is currently being
     * applied.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * Specifies the identifier of the CA certificate for the DB instance.
     * </p>
     */
    private String cACertificateIdentifier;
    /**
     * <p>
     * The new DB subnet group for the DB instance.
     * </p>
     */
    private String dBSubnetGroupName;

    private PendingCloudwatchLogsExports pendingCloudwatchLogsExports;

    /**
     * <p>
     * Contains the new <code>DBInstanceClass</code> for the DB instance that will be applied or is currently being
     * applied.
     * </p>
     * 
     * @param dBInstanceClass
     *        Contains the new <code>DBInstanceClass</code> for the DB instance that will be applied or is currently
     *        being applied.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * Contains the new <code>DBInstanceClass</code> for the DB instance that will be applied or is currently being
     * applied.
     * </p>
     * 
     * @return Contains the new <code>DBInstanceClass</code> for the DB instance that will be applied or is currently
     *         being applied.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * Contains the new <code>DBInstanceClass</code> for the DB instance that will be applied or is currently being
     * applied.
     * </p>
     * 
     * @param dBInstanceClass
     *        Contains the new <code>DBInstanceClass</code> for the DB instance that will be applied or is currently
     *        being applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * Contains the new <code>AllocatedStorage</code> size for the DB instance that will be applied or is currently
     * being applied.
     * </p>
     * 
     * @param allocatedStorage
     *        Contains the new <code>AllocatedStorage</code> size for the DB instance that will be applied or is
     *        currently being applied.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * Contains the new <code>AllocatedStorage</code> size for the DB instance that will be applied or is currently
     * being applied.
     * </p>
     * 
     * @return Contains the new <code>AllocatedStorage</code> size for the DB instance that will be applied or is
     *         currently being applied.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * Contains the new <code>AllocatedStorage</code> size for the DB instance that will be applied or is currently
     * being applied.
     * </p>
     * 
     * @param allocatedStorage
     *        Contains the new <code>AllocatedStorage</code> size for the DB instance that will be applied or is
     *        currently being applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Contains the pending or currently-in-progress change of the master credentials for the DB instance.
     * </p>
     * 
     * @param masterUserPassword
     *        Contains the pending or currently-in-progress change of the master credentials for the DB instance.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * Contains the pending or currently-in-progress change of the master credentials for the DB instance.
     * </p>
     * 
     * @return Contains the pending or currently-in-progress change of the master credentials for the DB instance.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * Contains the pending or currently-in-progress change of the master credentials for the DB instance.
     * </p>
     * 
     * @param masterUserPassword
     *        Contains the pending or currently-in-progress change of the master credentials for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * Specifies the pending port for the DB instance.
     * </p>
     * 
     * @param port
     *        Specifies the pending port for the DB instance.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Specifies the pending port for the DB instance.
     * </p>
     * 
     * @return Specifies the pending port for the DB instance.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Specifies the pending port for the DB instance.
     * </p>
     * 
     * @param port
     *        Specifies the pending port for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Specifies the pending number of days for which automated backups are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        Specifies the pending number of days for which automated backups are retained.
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * Specifies the pending number of days for which automated backups are retained.
     * </p>
     * 
     * @return Specifies the pending number of days for which automated backups are retained.
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * Specifies the pending number of days for which automated backups are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        Specifies the pending number of days for which automated backups are retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
     * </p>
     * 
     * @param multiAZ
     *        Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
     * </p>
     * 
     * @return Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
     * </p>
     * 
     * @param multiAZ
     *        Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
     * </p>
     * 
     * @return Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
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

    public PendingModifiedValues withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @param licenseModel
     *        The license model for the DB instance.</p>
     *        <p>
     *        Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *        <code>general-public-license</code>
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @return The license model for the DB instance.</p>
     *         <p>
     *         Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @param licenseModel
     *        The license model for the DB instance.</p>
     *        <p>
     *        Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *        <code>general-public-license</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * Specifies the new Provisioned IOPS value for the DB instance that will be applied or is currently being applied.
     * </p>
     * 
     * @param iops
     *        Specifies the new Provisioned IOPS value for the DB instance that will be applied or is currently being
     *        applied.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Specifies the new Provisioned IOPS value for the DB instance that will be applied or is currently being applied.
     * </p>
     * 
     * @return Specifies the new Provisioned IOPS value for the DB instance that will be applied or is currently being
     *         applied.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * Specifies the new Provisioned IOPS value for the DB instance that will be applied or is currently being applied.
     * </p>
     * 
     * @param iops
     *        Specifies the new Provisioned IOPS value for the DB instance that will be applied or is currently being
     *        applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Contains the new <code>DBInstanceIdentifier</code> for the DB instance that will be applied or is currently being
     * applied.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Contains the new <code>DBInstanceIdentifier</code> for the DB instance that will be applied or is
     *        currently being applied.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains the new <code>DBInstanceIdentifier</code> for the DB instance that will be applied or is currently being
     * applied.
     * </p>
     * 
     * @return Contains the new <code>DBInstanceIdentifier</code> for the DB instance that will be applied or is
     *         currently being applied.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains the new <code>DBInstanceIdentifier</code> for the DB instance that will be applied or is currently being
     * applied.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Contains the new <code>DBInstanceIdentifier</code> for the DB instance that will be applied or is
     *        currently being applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB instance.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * 
     * @return Specifies the storage type to be associated with the DB instance.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * Specifies the identifier of the CA certificate for the DB instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        Specifies the identifier of the CA certificate for the DB instance.
     */

    public void setCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier of the CA certificate for the DB instance.
     * </p>
     * 
     * @return Specifies the identifier of the CA certificate for the DB instance.
     */

    public String getCACertificateIdentifier() {
        return this.cACertificateIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier of the CA certificate for the DB instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        Specifies the identifier of the CA certificate for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withCACertificateIdentifier(String cACertificateIdentifier) {
        setCACertificateIdentifier(cACertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance.
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The new DB subnet group for the DB instance.
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance.
     * </p>
     * 
     * @return The new DB subnet group for the DB instance.
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance.
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The new DB subnet group for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * @param pendingCloudwatchLogsExports
     */

    public void setPendingCloudwatchLogsExports(PendingCloudwatchLogsExports pendingCloudwatchLogsExports) {
        this.pendingCloudwatchLogsExports = pendingCloudwatchLogsExports;
    }

    /**
     * @return
     */

    public PendingCloudwatchLogsExports getPendingCloudwatchLogsExports() {
        return this.pendingCloudwatchLogsExports;
    }

    /**
     * @param pendingCloudwatchLogsExports
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withPendingCloudwatchLogsExports(PendingCloudwatchLogsExports pendingCloudwatchLogsExports) {
        setPendingCloudwatchLogsExports(pendingCloudwatchLogsExports);
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
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getCACertificateIdentifier() != null)
            sb.append("CACertificateIdentifier: ").append(getCACertificateIdentifier()).append(",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName()).append(",");
        if (getPendingCloudwatchLogsExports() != null)
            sb.append("PendingCloudwatchLogsExports: ").append(getPendingCloudwatchLogsExports());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingModifiedValues == false)
            return false;
        PendingModifiedValues other = (PendingModifiedValues) obj;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getCACertificateIdentifier() == null ^ this.getCACertificateIdentifier() == null)
            return false;
        if (other.getCACertificateIdentifier() != null && other.getCACertificateIdentifier().equals(this.getCACertificateIdentifier()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getPendingCloudwatchLogsExports() == null ^ this.getPendingCloudwatchLogsExports() == null)
            return false;
        if (other.getPendingCloudwatchLogsExports() != null && other.getPendingCloudwatchLogsExports().equals(this.getPendingCloudwatchLogsExports()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getCACertificateIdentifier() == null) ? 0 : getCACertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getPendingCloudwatchLogsExports() == null) ? 0 : getPendingCloudwatchLogsExports().hashCode());
        return hashCode;
    }

    @Override
    public PendingModifiedValues clone() {
        try {
            return (PendingModifiedValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
