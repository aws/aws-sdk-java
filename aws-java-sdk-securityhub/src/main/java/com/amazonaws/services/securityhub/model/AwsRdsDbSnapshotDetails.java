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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbSnapshotDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbSnapshotDetails implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String dbSnapshotIdentifier;
    /** <p/> */
    private String dbInstanceIdentifier;
    /** <p/> */
    private String snapshotCreateTime;
    /** <p/> */
    private String engine;
    /** <p/> */
    private Integer allocatedStorage;
    /** <p/> */
    private String status;
    /** <p/> */
    private Integer port;
    /** <p/> */
    private String availabilityZone;
    /** <p/> */
    private String vpcId;
    /** <p/> */
    private String instanceCreateTime;
    /** <p/> */
    private String masterUsername;
    /** <p/> */
    private String engineVersion;
    /** <p/> */
    private String licenseModel;
    /** <p/> */
    private String snapshotType;
    /** <p/> */
    private Integer iops;
    /** <p/> */
    private String optionGroupName;
    /** <p/> */
    private Integer percentProgress;
    /** <p/> */
    private String sourceRegion;
    /** <p/> */
    private String sourceDbSnapshotIdentifier;
    /** <p/> */
    private String storageType;
    /** <p/> */
    private String tdeCredentialArn;
    /** <p/> */
    private Boolean encrypted;
    /** <p/> */
    private String kmsKeyId;
    /** <p/> */
    private String timezone;
    /** <p/> */
    private Boolean iamDatabaseAuthenticationEnabled;
    /** <p/> */
    private java.util.List<AwsRdsDbProcessorFeature> processorFeatures;
    /** <p/> */
    private String dbiResourceId;

    /**
     * <p/>
     * 
     * @param dbSnapshotIdentifier
     */

    public void setDbSnapshotIdentifier(String dbSnapshotIdentifier) {
        this.dbSnapshotIdentifier = dbSnapshotIdentifier;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getDbSnapshotIdentifier() {
        return this.dbSnapshotIdentifier;
    }

    /**
     * <p/>
     * 
     * @param dbSnapshotIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withDbSnapshotIdentifier(String dbSnapshotIdentifier) {
        setDbSnapshotIdentifier(dbSnapshotIdentifier);
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

    public AwsRdsDbSnapshotDetails withDbInstanceIdentifier(String dbInstanceIdentifier) {
        setDbInstanceIdentifier(dbInstanceIdentifier);
        return this;
    }

    /**
     * <p/>
     * 
     * @param snapshotCreateTime
     */

    public void setSnapshotCreateTime(String snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getSnapshotCreateTime() {
        return this.snapshotCreateTime;
    }

    /**
     * <p/>
     * 
     * @param snapshotCreateTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withSnapshotCreateTime(String snapshotCreateTime) {
        setSnapshotCreateTime(snapshotCreateTime);
        return this;
    }

    /**
     * <p/>
     * 
     * @param engine
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p/>
     * 
     * @param engine
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withEngine(String engine) {
        setEngine(engine);
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

    public AwsRdsDbSnapshotDetails withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p/>
     * 
     * @param status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p/>
     * 
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withStatus(String status) {
        setStatus(status);
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

    public AwsRdsDbSnapshotDetails withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p/>
     * 
     * @param availabilityZone
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p/>
     * 
     * @param availabilityZone
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p/>
     * 
     * @param vpcId
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p/>
     * 
     * @param vpcId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param instanceCreateTime
     */

    public void setInstanceCreateTime(String instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getInstanceCreateTime() {
        return this.instanceCreateTime;
    }

    /**
     * <p/>
     * 
     * @param instanceCreateTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withInstanceCreateTime(String instanceCreateTime) {
        setInstanceCreateTime(instanceCreateTime);
        return this;
    }

    /**
     * <p/>
     * 
     * @param masterUsername
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p/>
     * 
     * @param masterUsername
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
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

    public AwsRdsDbSnapshotDetails withEngineVersion(String engineVersion) {
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

    public AwsRdsDbSnapshotDetails withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p/>
     * 
     * @param snapshotType
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p/>
     * 
     * @param snapshotType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
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

    public AwsRdsDbSnapshotDetails withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p/>
     * 
     * @param optionGroupName
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p/>
     * 
     * @param optionGroupName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p/>
     * 
     * @param percentProgress
     */

    public void setPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getPercentProgress() {
        return this.percentProgress;
    }

    /**
     * <p/>
     * 
     * @param percentProgress
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withPercentProgress(Integer percentProgress) {
        setPercentProgress(percentProgress);
        return this;
    }

    /**
     * <p/>
     * 
     * @param sourceRegion
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p/>
     * 
     * @param sourceRegion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p/>
     * 
     * @param sourceDbSnapshotIdentifier
     */

    public void setSourceDbSnapshotIdentifier(String sourceDbSnapshotIdentifier) {
        this.sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getSourceDbSnapshotIdentifier() {
        return this.sourceDbSnapshotIdentifier;
    }

    /**
     * <p/>
     * 
     * @param sourceDbSnapshotIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withSourceDbSnapshotIdentifier(String sourceDbSnapshotIdentifier) {
        setSourceDbSnapshotIdentifier(sourceDbSnapshotIdentifier);
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

    public AwsRdsDbSnapshotDetails withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param tdeCredentialArn
     */

    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getTdeCredentialArn() {
        return this.tdeCredentialArn;
    }

    /**
     * <p/>
     * 
     * @param tdeCredentialArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withTdeCredentialArn(String tdeCredentialArn) {
        setTdeCredentialArn(tdeCredentialArn);
        return this;
    }

    /**
     * <p/>
     * 
     * @param encrypted
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p/>
     * 
     * @param encrypted
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p/>
     * 
     * @param kmsKeyId
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p/>
     * 
     * @param kmsKeyId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param timezone
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p/>
     * 
     * @param timezone
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p/>
     * 
     * @param iamDatabaseAuthenticationEnabled
     */

    public void setIamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
        this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean getIamDatabaseAuthenticationEnabled() {
        return this.iamDatabaseAuthenticationEnabled;
    }

    /**
     * <p/>
     * 
     * @param iamDatabaseAuthenticationEnabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withIamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
        setIamDatabaseAuthenticationEnabled(iamDatabaseAuthenticationEnabled);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean isIamDatabaseAuthenticationEnabled() {
        return this.iamDatabaseAuthenticationEnabled;
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

    public AwsRdsDbSnapshotDetails withProcessorFeatures(AwsRdsDbProcessorFeature... processorFeatures) {
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

    public AwsRdsDbSnapshotDetails withProcessorFeatures(java.util.Collection<AwsRdsDbProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p/>
     * 
     * @param dbiResourceId
     */

    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getDbiResourceId() {
        return this.dbiResourceId;
    }

    /**
     * <p/>
     * 
     * @param dbiResourceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withDbiResourceId(String dbiResourceId) {
        setDbiResourceId(dbiResourceId);
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
        if (getDbSnapshotIdentifier() != null)
            sb.append("DbSnapshotIdentifier: ").append(getDbSnapshotIdentifier()).append(",");
        if (getDbInstanceIdentifier() != null)
            sb.append("DbInstanceIdentifier: ").append(getDbInstanceIdentifier()).append(",");
        if (getSnapshotCreateTime() != null)
            sb.append("SnapshotCreateTime: ").append(getSnapshotCreateTime()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getInstanceCreateTime() != null)
            sb.append("InstanceCreateTime: ").append(getInstanceCreateTime()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: ").append(getSnapshotType()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getPercentProgress() != null)
            sb.append("PercentProgress: ").append(getPercentProgress()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
        if (getSourceDbSnapshotIdentifier() != null)
            sb.append("SourceDbSnapshotIdentifier: ").append(getSourceDbSnapshotIdentifier()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: ").append(getTdeCredentialArn()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getIamDatabaseAuthenticationEnabled() != null)
            sb.append("IamDatabaseAuthenticationEnabled: ").append(getIamDatabaseAuthenticationEnabled()).append(",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: ").append(getProcessorFeatures()).append(",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: ").append(getDbiResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbSnapshotDetails == false)
            return false;
        AwsRdsDbSnapshotDetails other = (AwsRdsDbSnapshotDetails) obj;
        if (other.getDbSnapshotIdentifier() == null ^ this.getDbSnapshotIdentifier() == null)
            return false;
        if (other.getDbSnapshotIdentifier() != null && other.getDbSnapshotIdentifier().equals(this.getDbSnapshotIdentifier()) == false)
            return false;
        if (other.getDbInstanceIdentifier() == null ^ this.getDbInstanceIdentifier() == null)
            return false;
        if (other.getDbInstanceIdentifier() != null && other.getDbInstanceIdentifier().equals(this.getDbInstanceIdentifier()) == false)
            return false;
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null)
            return false;
        if (other.getSnapshotCreateTime() != null && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getInstanceCreateTime() == null ^ this.getInstanceCreateTime() == null)
            return false;
        if (other.getInstanceCreateTime() != null && other.getInstanceCreateTime().equals(this.getInstanceCreateTime()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null)
            return false;
        if (other.getPercentProgress() != null && other.getPercentProgress().equals(this.getPercentProgress()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getSourceDbSnapshotIdentifier() == null ^ this.getSourceDbSnapshotIdentifier() == null)
            return false;
        if (other.getSourceDbSnapshotIdentifier() != null && other.getSourceDbSnapshotIdentifier().equals(this.getSourceDbSnapshotIdentifier()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null)
            return false;
        if (other.getTdeCredentialArn() != null && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getIamDatabaseAuthenticationEnabled() == null ^ this.getIamDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIamDatabaseAuthenticationEnabled() != null
                && other.getIamDatabaseAuthenticationEnabled().equals(this.getIamDatabaseAuthenticationEnabled()) == false)
            return false;
        if (other.getProcessorFeatures() == null ^ this.getProcessorFeatures() == null)
            return false;
        if (other.getProcessorFeatures() != null && other.getProcessorFeatures().equals(this.getProcessorFeatures()) == false)
            return false;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbSnapshotIdentifier() == null) ? 0 : getDbSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDbInstanceIdentifier() == null) ? 0 : getDbInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCreateTime() == null) ? 0 : getSnapshotCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getInstanceCreateTime() == null) ? 0 : getInstanceCreateTime().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getPercentProgress() == null) ? 0 : getPercentProgress().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getSourceDbSnapshotIdentifier() == null) ? 0 : getSourceDbSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getIamDatabaseAuthenticationEnabled() == null) ? 0 : getIamDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime * hashCode + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbSnapshotDetails clone() {
        try {
            return (AwsRdsDbSnapshotDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbSnapshotDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
