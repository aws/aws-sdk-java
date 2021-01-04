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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbPendingModifiedValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbPendingModifiedValues implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String dbInstanceClass;
    /** <p/> */
    private Integer allocatedStorage;
    /** <p/> */
    private String masterUserPassword;
    /** <p/> */
    private Integer port;
    /** <p/> */
    private Integer backupRetentionPeriod;
    /** <p/> */
    private Boolean multiAZ;
    /** <p/> */
    private String engineVersion;
    /** <p/> */
    private String licenseModel;
    /** <p/> */
    private Integer iops;
    /** <p/> */
    private String dbInstanceIdentifier;
    /** <p/> */
    private String storageType;
    /** <p/> */
    private String caCertificateIdentifier;
    /** <p/> */
    private String dbSubnetGroupName;
    /** <p/> */
    private AwsRdsPendingCloudWatchLogsExports pendingCloudWatchLogsExports;
    /** <p/> */
    private java.util.List<AwsRdsDbProcessorFeature> processorFeatures;

    /**
     * <p/>
     * 
     * @param dbInstanceClass
     */

    public void setDbInstanceClass(String dbInstanceClass) {
        this.dbInstanceClass = dbInstanceClass;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getDbInstanceClass() {
        return this.dbInstanceClass;
    }

    /**
     * <p/>
     * 
     * @param dbInstanceClass
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withDbInstanceClass(String dbInstanceClass) {
        setDbInstanceClass(dbInstanceClass);
        return this;
    }

    /**
     * <p/>
     * 
     * @param allocatedStorage
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p/>
     * 
     * @param allocatedStorage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p/>
     * 
     * @param masterUserPassword
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p/>
     * 
     * @param masterUserPassword
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p/>
     * 
     * @param port
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p/>
     * 
     * @param port
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p/>
     * 
     * @param backupRetentionPeriod
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p/>
     * 
     * @param backupRetentionPeriod
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p/>
     * 
     * @param multiAZ
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p/>
     * 
     * @param multiAZ
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p/>
     * 
     * @param engineVersion
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p/>
     * 
     * @param engineVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p/>
     * 
     * @param licenseModel
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p/>
     * 
     * @param licenseModel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p/>
     * 
     * @param iops
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p/>
     * 
     * @param iops
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p/>
     * 
     * @param dbInstanceIdentifier
     */

    public void setDbInstanceIdentifier(String dbInstanceIdentifier) {
        this.dbInstanceIdentifier = dbInstanceIdentifier;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier;
    }

    /**
     * <p/>
     * 
     * @param dbInstanceIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withDbInstanceIdentifier(String dbInstanceIdentifier) {
        setDbInstanceIdentifier(dbInstanceIdentifier);
        return this;
    }

    /**
     * <p/>
     * 
     * @param storageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p/>
     * 
     * @param storageType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param caCertificateIdentifier
     */

    public void setCaCertificateIdentifier(String caCertificateIdentifier) {
        this.caCertificateIdentifier = caCertificateIdentifier;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getCaCertificateIdentifier() {
        return this.caCertificateIdentifier;
    }

    /**
     * <p/>
     * 
     * @param caCertificateIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withCaCertificateIdentifier(String caCertificateIdentifier) {
        setCaCertificateIdentifier(caCertificateIdentifier);
        return this;
    }

    /**
     * <p/>
     * 
     * @param dbSubnetGroupName
     */

    public void setDbSubnetGroupName(String dbSubnetGroupName) {
        this.dbSubnetGroupName = dbSubnetGroupName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getDbSubnetGroupName() {
        return this.dbSubnetGroupName;
    }

    /**
     * <p/>
     * 
     * @param dbSubnetGroupName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withDbSubnetGroupName(String dbSubnetGroupName) {
        setDbSubnetGroupName(dbSubnetGroupName);
        return this;
    }

    /**
     * <p/>
     * 
     * @param pendingCloudWatchLogsExports
     */

    public void setPendingCloudWatchLogsExports(AwsRdsPendingCloudWatchLogsExports pendingCloudWatchLogsExports) {
        this.pendingCloudWatchLogsExports = pendingCloudWatchLogsExports;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public AwsRdsPendingCloudWatchLogsExports getPendingCloudWatchLogsExports() {
        return this.pendingCloudWatchLogsExports;
    }

    /**
     * <p/>
     * 
     * @param pendingCloudWatchLogsExports
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbPendingModifiedValues withPendingCloudWatchLogsExports(AwsRdsPendingCloudWatchLogsExports pendingCloudWatchLogsExports) {
        setPendingCloudWatchLogsExports(pendingCloudWatchLogsExports);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<AwsRdsDbProcessorFeature> getProcessorFeatures() {
        return processorFeatures;
    }

    /**
     * <p/>
     * 
     * @param processorFeatures
     */

    public void setProcessorFeatures(java.util.Collection<AwsRdsDbProcessorFeature> processorFeatures) {
        if (processorFeatures == null) {
            this.processorFeatures = null;
            return;
        }

        this.processorFeatures = new java.util.ArrayList<AwsRdsDbProcessorFeature>(processorFeatures);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessorFeatures(java.util.Collection)} or {@link #withProcessorFeatures(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param processorFeatures
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
     * <p/>
     * 
     * @param processorFeatures
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
