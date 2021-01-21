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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Changes to a DB instance that are currently pending.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbPendingModifiedValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbPendingModifiedValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The new DB instance class for the DB instance.
     * </p>
     */
    private String dbInstanceClass;
    /**
     * <p>
     * The new value of the allocated storage for the DB instance.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The new master user password for the DB instance.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The new port for the DB instance.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The new backup retention period for the DB instance.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * Indicates that a single Availability Zone DB instance is changing to a multiple Availability Zone deployment.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The new engine version for the DB instance.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The new license model value for the DB instance.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * The new provisioned IOPS value for the DB instance.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The new DB instance identifier for the DB instance.
     * </p>
     */
    private String dbInstanceIdentifier;
    /**
     * <p>
     * The new storage type for the DB instance.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The new CA certificate identifier for the DB instance.
     * </p>
     */
    private String caCertificateIdentifier;
    /**
     * <p>
     * The name of the new subnet group for the DB instance.
     * </p>
     */
    private String dbSubnetGroupName;
    /**
     * <p>
     * A list of log types that are being enabled or disabled.
     * </p>
     */
    private AwsRdsPendingCloudWatchLogsExports pendingCloudWatchLogsExports;
    /**
     * <p>
     * Processor features that are being updated.
     * </p>
     */
    private java.util.List<AwsRdsDbProcessorFeature> processorFeatures;

    /**
     * <p>
     * The new DB instance class for the DB instance.
     * </p>
     * 
     * @param dbInstanceClass
     *        The new DB instance class for the DB instance.
     */

    public void setDbInstanceClass(String dbInstanceClass) {
        this.dbInstanceClass = dbInstanceClass;
    }

    /**
     * <p>
     * The new DB instance class for the DB instance.
     * </p>
     * 
     * @return The new DB instance class for the DB instance.
     */

    public String getDbInstanceClass() {
        return this.dbInstanceClass;
    }

    /**
     * <p>
     * The new DB instance class for the DB instance.
     * </p>
     * 
     * @param dbInstanceClass
     *        The new DB instance class for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withDbInstanceClass(String dbInstanceClass) {
        setDbInstanceClass(dbInstanceClass);
        return this;
    }

    /**
     * <p>
     * The new value of the allocated storage for the DB instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The new value of the allocated storage for the DB instance.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The new value of the allocated storage for the DB instance.
     * </p>
     * 
     * @return The new value of the allocated storage for the DB instance.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The new value of the allocated storage for the DB instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The new value of the allocated storage for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The new master user password for the DB instance.
     * </p>
     * 
     * @param masterUserPassword
     *        The new master user password for the DB instance.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The new master user password for the DB instance.
     * </p>
     * 
     * @return The new master user password for the DB instance.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The new master user password for the DB instance.
     * </p>
     * 
     * @param masterUserPassword
     *        The new master user password for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The new port for the DB instance.
     * </p>
     * 
     * @param port
     *        The new port for the DB instance.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The new port for the DB instance.
     * </p>
     * 
     * @return The new port for the DB instance.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The new port for the DB instance.
     * </p>
     * 
     * @param port
     *        The new port for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The new backup retention period for the DB instance.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The new backup retention period for the DB instance.
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The new backup retention period for the DB instance.
     * </p>
     * 
     * @return The new backup retention period for the DB instance.
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The new backup retention period for the DB instance.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The new backup retention period for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * Indicates that a single Availability Zone DB instance is changing to a multiple Availability Zone deployment.
     * </p>
     * 
     * @param multiAZ
     *        Indicates that a single Availability Zone DB instance is changing to a multiple Availability Zone
     *        deployment.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Indicates that a single Availability Zone DB instance is changing to a multiple Availability Zone deployment.
     * </p>
     * 
     * @return Indicates that a single Availability Zone DB instance is changing to a multiple Availability Zone
     *         deployment.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Indicates that a single Availability Zone DB instance is changing to a multiple Availability Zone deployment.
     * </p>
     * 
     * @param multiAZ
     *        Indicates that a single Availability Zone DB instance is changing to a multiple Availability Zone
     *        deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Indicates that a single Availability Zone DB instance is changing to a multiple Availability Zone deployment.
     * </p>
     * 
     * @return Indicates that a single Availability Zone DB instance is changing to a multiple Availability Zone
     *         deployment.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The new engine version for the DB instance.
     * </p>
     * 
     * @param engineVersion
     *        The new engine version for the DB instance.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The new engine version for the DB instance.
     * </p>
     * 
     * @return The new engine version for the DB instance.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The new engine version for the DB instance.
     * </p>
     * 
     * @param engineVersion
     *        The new engine version for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The new license model value for the DB instance.
     * </p>
     * 
     * @param licenseModel
     *        The new license model value for the DB instance.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The new license model value for the DB instance.
     * </p>
     * 
     * @return The new license model value for the DB instance.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The new license model value for the DB instance.
     * </p>
     * 
     * @param licenseModel
     *        The new license model value for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The new provisioned IOPS value for the DB instance.
     * </p>
     * 
     * @param iops
     *        The new provisioned IOPS value for the DB instance.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The new provisioned IOPS value for the DB instance.
     * </p>
     * 
     * @return The new provisioned IOPS value for the DB instance.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The new provisioned IOPS value for the DB instance.
     * </p>
     * 
     * @param iops
     *        The new provisioned IOPS value for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The new DB instance identifier for the DB instance.
     * </p>
     * 
     * @param dbInstanceIdentifier
     *        The new DB instance identifier for the DB instance.
     */

    public void setDbInstanceIdentifier(String dbInstanceIdentifier) {
        this.dbInstanceIdentifier = dbInstanceIdentifier;
    }

    /**
     * <p>
     * The new DB instance identifier for the DB instance.
     * </p>
     * 
     * @return The new DB instance identifier for the DB instance.
     */

    public String getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier;
    }

    /**
     * <p>
     * The new DB instance identifier for the DB instance.
     * </p>
     * 
     * @param dbInstanceIdentifier
     *        The new DB instance identifier for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withDbInstanceIdentifier(String dbInstanceIdentifier) {
        setDbInstanceIdentifier(dbInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The new storage type for the DB instance.
     * </p>
     * 
     * @param storageType
     *        The new storage type for the DB instance.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The new storage type for the DB instance.
     * </p>
     * 
     * @return The new storage type for the DB instance.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The new storage type for the DB instance.
     * </p>
     * 
     * @param storageType
     *        The new storage type for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The new CA certificate identifier for the DB instance.
     * </p>
     * 
     * @param caCertificateIdentifier
     *        The new CA certificate identifier for the DB instance.
     */

    public void setCaCertificateIdentifier(String caCertificateIdentifier) {
        this.caCertificateIdentifier = caCertificateIdentifier;
    }

    /**
     * <p>
     * The new CA certificate identifier for the DB instance.
     * </p>
     * 
     * @return The new CA certificate identifier for the DB instance.
     */

    public String getCaCertificateIdentifier() {
        return this.caCertificateIdentifier;
    }

    /**
     * <p>
     * The new CA certificate identifier for the DB instance.
     * </p>
     * 
     * @param caCertificateIdentifier
     *        The new CA certificate identifier for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withCaCertificateIdentifier(String caCertificateIdentifier) {
        setCaCertificateIdentifier(caCertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the new subnet group for the DB instance.
     * </p>
     * 
     * @param dbSubnetGroupName
     *        The name of the new subnet group for the DB instance.
     */

    public void setDbSubnetGroupName(String dbSubnetGroupName) {
        this.dbSubnetGroupName = dbSubnetGroupName;
    }

    /**
     * <p>
     * The name of the new subnet group for the DB instance.
     * </p>
     * 
     * @return The name of the new subnet group for the DB instance.
     */

    public String getDbSubnetGroupName() {
        return this.dbSubnetGroupName;
    }

    /**
     * <p>
     * The name of the new subnet group for the DB instance.
     * </p>
     * 
     * @param dbSubnetGroupName
     *        The name of the new subnet group for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withDbSubnetGroupName(String dbSubnetGroupName) {
        setDbSubnetGroupName(dbSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A list of log types that are being enabled or disabled.
     * </p>
     * 
     * @param pendingCloudWatchLogsExports
     *        A list of log types that are being enabled or disabled.
     */

    public void setPendingCloudWatchLogsExports(AwsRdsPendingCloudWatchLogsExports pendingCloudWatchLogsExports) {
        this.pendingCloudWatchLogsExports = pendingCloudWatchLogsExports;
    }

    /**
     * <p>
     * A list of log types that are being enabled or disabled.
     * </p>
     * 
     * @return A list of log types that are being enabled or disabled.
     */

    public AwsRdsPendingCloudWatchLogsExports getPendingCloudWatchLogsExports() {
        return this.pendingCloudWatchLogsExports;
    }

    /**
     * <p>
     * A list of log types that are being enabled or disabled.
     * </p>
     * 
     * @param pendingCloudWatchLogsExports
     *        A list of log types that are being enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withPendingCloudWatchLogsExports(AwsRdsPendingCloudWatchLogsExports pendingCloudWatchLogsExports) {
        setPendingCloudWatchLogsExports(pendingCloudWatchLogsExports);
        return this;
    }

    /**
     * <p>
     * Processor features that are being updated.
     * </p>
     * 
     * @return Processor features that are being updated.
     */

    public java.util.List<AwsRdsDbProcessorFeature> getProcessorFeatures() {
        return processorFeatures;
    }

    /**
     * <p>
     * Processor features that are being updated.
     * </p>
     * 
     * @param processorFeatures
     *        Processor features that are being updated.
     */

    public void setProcessorFeatures(java.util.Collection<AwsRdsDbProcessorFeature> processorFeatures) {
        if (processorFeatures == null) {
            this.processorFeatures = null;
            return;
        }

        this.processorFeatures = new java.util.ArrayList<AwsRdsDbProcessorFeature>(processorFeatures);
    }

    /**
     * <p>
     * Processor features that are being updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessorFeatures(java.util.Collection)} or {@link #withProcessorFeatures(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param processorFeatures
     *        Processor features that are being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withProcessorFeatures(AwsRdsDbProcessorFeature... processorFeatures) {
        if (this.processorFeatures == null) {
            setProcessorFeatures(new java.util.ArrayList<AwsRdsDbProcessorFeature>(processorFeatures.length));
        }
        for (AwsRdsDbProcessorFeature ele : processorFeatures) {
            this.processorFeatures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Processor features that are being updated.
     * </p>
     * 
     * @param processorFeatures
     *        Processor features that are being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withProcessorFeatures(java.util.Collection<AwsRdsDbProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
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
        if (getDbInstanceClass() != null)
            sb.append("DbInstanceClass: ").append(getDbInstanceClass()).append(",");
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
        if (getDbInstanceIdentifier() != null)
            sb.append("DbInstanceIdentifier: ").append(getDbInstanceIdentifier()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getCaCertificateIdentifier() != null)
            sb.append("CaCertificateIdentifier: ").append(getCaCertificateIdentifier()).append(",");
        if (getDbSubnetGroupName() != null)
            sb.append("DbSubnetGroupName: ").append(getDbSubnetGroupName()).append(",");
        if (getPendingCloudWatchLogsExports() != null)
            sb.append("PendingCloudWatchLogsExports: ").append(getPendingCloudWatchLogsExports()).append(",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: ").append(getProcessorFeatures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbPendingModifiedValues == false)
            return false;
        AwsRdsDbPendingModifiedValues other = (AwsRdsDbPendingModifiedValues) obj;
        if (other.getDbInstanceClass() == null ^ this.getDbInstanceClass() == null)
            return false;
        if (other.getDbInstanceClass() != null && other.getDbInstanceClass().equals(this.getDbInstanceClass()) == false)
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
        if (other.getDbInstanceIdentifier() == null ^ this.getDbInstanceIdentifier() == null)
            return false;
        if (other.getDbInstanceIdentifier() != null && other.getDbInstanceIdentifier().equals(this.getDbInstanceIdentifier()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getCaCertificateIdentifier() == null ^ this.getCaCertificateIdentifier() == null)
            return false;
        if (other.getCaCertificateIdentifier() != null && other.getCaCertificateIdentifier().equals(this.getCaCertificateIdentifier()) == false)
            return false;
        if (other.getDbSubnetGroupName() == null ^ this.getDbSubnetGroupName() == null)
            return false;
        if (other.getDbSubnetGroupName() != null && other.getDbSubnetGroupName().equals(this.getDbSubnetGroupName()) == false)
            return false;
        if (other.getPendingCloudWatchLogsExports() == null ^ this.getPendingCloudWatchLogsExports() == null)
            return false;
        if (other.getPendingCloudWatchLogsExports() != null && other.getPendingCloudWatchLogsExports().equals(this.getPendingCloudWatchLogsExports()) == false)
            return false;
        if (other.getProcessorFeatures() == null ^ this.getProcessorFeatures() == null)
            return false;
        if (other.getProcessorFeatures() != null && other.getProcessorFeatures().equals(this.getProcessorFeatures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbInstanceClass() == null) ? 0 : getDbInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getDbInstanceIdentifier() == null) ? 0 : getDbInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getCaCertificateIdentifier() == null) ? 0 : getCaCertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDbSubnetGroupName() == null) ? 0 : getDbSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getPendingCloudWatchLogsExports() == null) ? 0 : getPendingCloudWatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbPendingModifiedValues clone() {
        try {
            return (AwsRdsDbPendingModifiedValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbPendingModifiedValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
