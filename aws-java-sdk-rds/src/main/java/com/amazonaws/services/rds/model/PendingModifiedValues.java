/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This data type is used as a response element in the <code>ModifyDBInstance</code> action and contains changes that
 * will be applied during the next maintenance window.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PendingModifiedValues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingModifiedValues implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the compute and memory capacity class for the DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The allocated storage size for the DB instance specified in gibibytes .
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The master credentials for the DB instance.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The port for the DB instance.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The number of days for which automated backups are retained.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * Indicates that the Single-AZ DB instance will change to a Multi-AZ deployment.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The database engine version.
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
     * The Provisioned IOPS value for the DB instance.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The database identifier for the DB instance.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The storage type of the DB instance.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The identifier of the CA certificate for the DB instance.
     * </p>
     */
    private String cACertificateIdentifier;
    /**
     * <p>
     * The DB subnet group for the DB instance.
     * </p>
     */
    private String dBSubnetGroupName;

    private PendingCloudwatchLogsExports pendingCloudwatchLogsExports;
    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProcessorFeature> processorFeatures;
    /**
     * <p>
     * Whether mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * </p>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;

    /**
     * <p>
     * The name of the compute and memory capacity class for the DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The name of the compute and memory capacity class for the DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The name of the compute and memory capacity class for the DB instance.
     * </p>
     * 
     * @return The name of the compute and memory capacity class for the DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The name of the compute and memory capacity class for the DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The name of the compute and memory capacity class for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The allocated storage size for the DB instance specified in gibibytes .
     * </p>
     * 
     * @param allocatedStorage
     *        The allocated storage size for the DB instance specified in gibibytes .
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The allocated storage size for the DB instance specified in gibibytes .
     * </p>
     * 
     * @return The allocated storage size for the DB instance specified in gibibytes .
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The allocated storage size for the DB instance specified in gibibytes .
     * </p>
     * 
     * @param allocatedStorage
     *        The allocated storage size for the DB instance specified in gibibytes .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The master credentials for the DB instance.
     * </p>
     * 
     * @param masterUserPassword
     *        The master credentials for the DB instance.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The master credentials for the DB instance.
     * </p>
     * 
     * @return The master credentials for the DB instance.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The master credentials for the DB instance.
     * </p>
     * 
     * @param masterUserPassword
     *        The master credentials for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The port for the DB instance.
     * </p>
     * 
     * @param port
     *        The port for the DB instance.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port for the DB instance.
     * </p>
     * 
     * @return The port for the DB instance.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port for the DB instance.
     * </p>
     * 
     * @param port
     *        The port for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained.
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained.
     * </p>
     * 
     * @return The number of days for which automated backups are retained.
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * Indicates that the Single-AZ DB instance will change to a Multi-AZ deployment.
     * </p>
     * 
     * @param multiAZ
     *        Indicates that the Single-AZ DB instance will change to a Multi-AZ deployment.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Indicates that the Single-AZ DB instance will change to a Multi-AZ deployment.
     * </p>
     * 
     * @return Indicates that the Single-AZ DB instance will change to a Multi-AZ deployment.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Indicates that the Single-AZ DB instance will change to a Multi-AZ deployment.
     * </p>
     * 
     * @param multiAZ
     *        Indicates that the Single-AZ DB instance will change to a Multi-AZ deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Indicates that the Single-AZ DB instance will change to a Multi-AZ deployment.
     * </p>
     * 
     * @return Indicates that the Single-AZ DB instance will change to a Multi-AZ deployment.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     * 
     * @param engineVersion
     *        The database engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     * 
     * @return The database engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     * 
     * @param engineVersion
     *        The database engine version.
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
     * The Provisioned IOPS value for the DB instance.
     * </p>
     * 
     * @param iops
     *        The Provisioned IOPS value for the DB instance.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The Provisioned IOPS value for the DB instance.
     * </p>
     * 
     * @return The Provisioned IOPS value for the DB instance.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The Provisioned IOPS value for the DB instance.
     * </p>
     * 
     * @param iops
     *        The Provisioned IOPS value for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The database identifier for the DB instance.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The database identifier for the DB instance.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The database identifier for the DB instance.
     * </p>
     * 
     * @return The database identifier for the DB instance.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The database identifier for the DB instance.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The database identifier for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The storage type of the DB instance.
     * </p>
     * 
     * @param storageType
     *        The storage type of the DB instance.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The storage type of the DB instance.
     * </p>
     * 
     * @return The storage type of the DB instance.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The storage type of the DB instance.
     * </p>
     * 
     * @param storageType
     *        The storage type of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The identifier of the CA certificate for the DB instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        The identifier of the CA certificate for the DB instance.
     */

    public void setCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the CA certificate for the DB instance.
     * </p>
     * 
     * @return The identifier of the CA certificate for the DB instance.
     */

    public String getCACertificateIdentifier() {
        return this.cACertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the CA certificate for the DB instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        The identifier of the CA certificate for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withCACertificateIdentifier(String cACertificateIdentifier) {
        setCACertificateIdentifier(cACertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * The DB subnet group for the DB instance.
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The DB subnet group for the DB instance.
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The DB subnet group for the DB instance.
     * </p>
     * 
     * @return The DB subnet group for the DB instance.
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * The DB subnet group for the DB instance.
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The DB subnet group for the DB instance.
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
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * 
     * @return The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     */

    public java.util.List<ProcessorFeature> getProcessorFeatures() {
        if (processorFeatures == null) {
            processorFeatures = new com.amazonaws.internal.SdkInternalList<ProcessorFeature>();
        }
        return processorFeatures;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     */

    public void setProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        if (processorFeatures == null) {
            this.processorFeatures = null;
            return;
        }

        this.processorFeatures = new com.amazonaws.internal.SdkInternalList<ProcessorFeature>(processorFeatures);
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessorFeatures(java.util.Collection)} or {@link #withProcessorFeatures(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withProcessorFeatures(ProcessorFeature... processorFeatures) {
        if (this.processorFeatures == null) {
            setProcessorFeatures(new com.amazonaws.internal.SdkInternalList<ProcessorFeature>(processorFeatures.length));
        }
        for (ProcessorFeature ele : processorFeatures) {
            this.processorFeatures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p>
     * Whether mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * </p>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        Whether mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     */

    public void setIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * Whether mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * </p>
     * 
     * @return Whether mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     */

    public Boolean getIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * Whether mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * </p>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        Whether mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        setIAMDatabaseAuthenticationEnabled(iAMDatabaseAuthenticationEnabled);
        return this;
    }

    /**
     * <p>
     * Whether mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * </p>
     * 
     * @return Whether mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     */

    public Boolean isIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
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
            sb.append("PendingCloudwatchLogsExports: ").append(getPendingCloudwatchLogsExports()).append(",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: ").append(getProcessorFeatures()).append(",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: ").append(getIAMDatabaseAuthenticationEnabled());
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
        if (other.getProcessorFeatures() == null ^ this.getProcessorFeatures() == null)
            return false;
        if (other.getProcessorFeatures() != null && other.getProcessorFeatures().equals(this.getProcessorFeatures()) == false)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() == null ^ this.getIAMDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() != null
                && other.getIAMDatabaseAuthenticationEnabled().equals(this.getIAMDatabaseAuthenticationEnabled()) == false)
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
        hashCode = prime * hashCode + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0 : getIAMDatabaseAuthenticationEnabled().hashCode());
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
