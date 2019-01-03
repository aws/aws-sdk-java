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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a single backup.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/Backup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Backup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the backup.
     * </p>
     */
    private String backupArn;
    /**
     * <p>
     * The generated ID of the backup. Example: <code>myServerName-yyyyMMddHHmmssSSS</code>
     * </p>
     */
    private String backupId;
    /**
     * <p>
     * The backup type. Valid values are <code>automated</code> or <code>manual</code>.
     * </p>
     */
    private String backupType;
    /**
     * <p>
     * The time stamp when the backup was created in the database. Example: <code>2016-07-29T13:38:47.520Z</code>
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * A user-provided description for a manual backup. This field is empty for automated backups.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The engine type that is obtained from the server when the backup is created.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The engine model that is obtained from the server when the backup is created.
     * </p>
     */
    private String engineModel;
    /**
     * <p>
     * The engine version that is obtained from the server when the backup is created.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The EC2 instance profile ARN that is obtained from the server when the backup is created. Because this value is
     * stored, you are not required to provide the InstanceProfileArn again if you restore a backup.
     * </p>
     */
    private String instanceProfileArn;
    /**
     * <p>
     * The instance type that is obtained from the server when the backup is created.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The key pair that is obtained from the server when the backup is created.
     * </p>
     */
    private String keyPair;
    /**
     * <p>
     * The preferred backup period that is obtained from the server when the backup is created.
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The preferred maintenance period that is obtained from the server when the backup is created.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     */
    @Deprecated
    private Integer s3DataSize;
    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     */
    @Deprecated
    private String s3DataUrl;
    /**
     * <p>
     * The Amazon S3 URL of the backup's log file.
     * </p>
     */
    private String s3LogUrl;
    /**
     * <p>
     * The security group IDs that are obtained from the server when the backup is created.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The name of the server from which the backup was made.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The service role ARN that is obtained from the server when the backup is created.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The status of a backup while in progress.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An informational message about backup status.
     * </p>
     */
    private String statusDescription;
    /**
     * <p>
     * The subnet IDs that are obtained from the server when the backup is created.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The version of AWS OpsWorks CM-specific tools that is obtained from the server when the backup is created.
     * </p>
     */
    private String toolsVersion;
    /**
     * <p>
     * The IAM user ARN of the requester for manual backups. This field is empty for automated backups.
     * </p>
     */
    private String userArn;

    /**
     * <p>
     * The ARN of the backup.
     * </p>
     * 
     * @param backupArn
     *        The ARN of the backup.
     */

    public void setBackupArn(String backupArn) {
        this.backupArn = backupArn;
    }

    /**
     * <p>
     * The ARN of the backup.
     * </p>
     * 
     * @return The ARN of the backup.
     */

    public String getBackupArn() {
        return this.backupArn;
    }

    /**
     * <p>
     * The ARN of the backup.
     * </p>
     * 
     * @param backupArn
     *        The ARN of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withBackupArn(String backupArn) {
        setBackupArn(backupArn);
        return this;
    }

    /**
     * <p>
     * The generated ID of the backup. Example: <code>myServerName-yyyyMMddHHmmssSSS</code>
     * </p>
     * 
     * @param backupId
     *        The generated ID of the backup. Example: <code>myServerName-yyyyMMddHHmmssSSS</code>
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The generated ID of the backup. Example: <code>myServerName-yyyyMMddHHmmssSSS</code>
     * </p>
     * 
     * @return The generated ID of the backup. Example: <code>myServerName-yyyyMMddHHmmssSSS</code>
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * The generated ID of the backup. Example: <code>myServerName-yyyyMMddHHmmssSSS</code>
     * </p>
     * 
     * @param backupId
     *        The generated ID of the backup. Example: <code>myServerName-yyyyMMddHHmmssSSS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

    /**
     * <p>
     * The backup type. Valid values are <code>automated</code> or <code>manual</code>.
     * </p>
     * 
     * @param backupType
     *        The backup type. Valid values are <code>automated</code> or <code>manual</code>.
     * @see BackupType
     */

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    /**
     * <p>
     * The backup type. Valid values are <code>automated</code> or <code>manual</code>.
     * </p>
     * 
     * @return The backup type. Valid values are <code>automated</code> or <code>manual</code>.
     * @see BackupType
     */

    public String getBackupType() {
        return this.backupType;
    }

    /**
     * <p>
     * The backup type. Valid values are <code>automated</code> or <code>manual</code>.
     * </p>
     * 
     * @param backupType
     *        The backup type. Valid values are <code>automated</code> or <code>manual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupType
     */

    public Backup withBackupType(String backupType) {
        setBackupType(backupType);
        return this;
    }

    /**
     * <p>
     * The backup type. Valid values are <code>automated</code> or <code>manual</code>.
     * </p>
     * 
     * @param backupType
     *        The backup type. Valid values are <code>automated</code> or <code>manual</code>.
     * @see BackupType
     */

    public void setBackupType(BackupType backupType) {
        withBackupType(backupType);
    }

    /**
     * <p>
     * The backup type. Valid values are <code>automated</code> or <code>manual</code>.
     * </p>
     * 
     * @param backupType
     *        The backup type. Valid values are <code>automated</code> or <code>manual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupType
     */

    public Backup withBackupType(BackupType backupType) {
        this.backupType = backupType.toString();
        return this;
    }

    /**
     * <p>
     * The time stamp when the backup was created in the database. Example: <code>2016-07-29T13:38:47.520Z</code>
     * </p>
     * 
     * @param createdAt
     *        The time stamp when the backup was created in the database. Example: <code>2016-07-29T13:38:47.520Z</code>
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time stamp when the backup was created in the database. Example: <code>2016-07-29T13:38:47.520Z</code>
     * </p>
     * 
     * @return The time stamp when the backup was created in the database. Example:
     *         <code>2016-07-29T13:38:47.520Z</code>
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time stamp when the backup was created in the database. Example: <code>2016-07-29T13:38:47.520Z</code>
     * </p>
     * 
     * @param createdAt
     *        The time stamp when the backup was created in the database. Example: <code>2016-07-29T13:38:47.520Z</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A user-provided description for a manual backup. This field is empty for automated backups.
     * </p>
     * 
     * @param description
     *        A user-provided description for a manual backup. This field is empty for automated backups.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-provided description for a manual backup. This field is empty for automated backups.
     * </p>
     * 
     * @return A user-provided description for a manual backup. This field is empty for automated backups.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-provided description for a manual backup. This field is empty for automated backups.
     * </p>
     * 
     * @param description
     *        A user-provided description for a manual backup. This field is empty for automated backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The engine type that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param engine
     *        The engine type that is obtained from the server when the backup is created.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The engine type that is obtained from the server when the backup is created.
     * </p>
     * 
     * @return The engine type that is obtained from the server when the backup is created.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The engine type that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param engine
     *        The engine type that is obtained from the server when the backup is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The engine model that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param engineModel
     *        The engine model that is obtained from the server when the backup is created.
     */

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    /**
     * <p>
     * The engine model that is obtained from the server when the backup is created.
     * </p>
     * 
     * @return The engine model that is obtained from the server when the backup is created.
     */

    public String getEngineModel() {
        return this.engineModel;
    }

    /**
     * <p>
     * The engine model that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param engineModel
     *        The engine model that is obtained from the server when the backup is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withEngineModel(String engineModel) {
        setEngineModel(engineModel);
        return this;
    }

    /**
     * <p>
     * The engine version that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param engineVersion
     *        The engine version that is obtained from the server when the backup is created.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version that is obtained from the server when the backup is created.
     * </p>
     * 
     * @return The engine version that is obtained from the server when the backup is created.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param engineVersion
     *        The engine version that is obtained from the server when the backup is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The EC2 instance profile ARN that is obtained from the server when the backup is created. Because this value is
     * stored, you are not required to provide the InstanceProfileArn again if you restore a backup.
     * </p>
     * 
     * @param instanceProfileArn
     *        The EC2 instance profile ARN that is obtained from the server when the backup is created. Because this
     *        value is stored, you are not required to provide the InstanceProfileArn again if you restore a backup.
     */

    public void setInstanceProfileArn(String instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
    }

    /**
     * <p>
     * The EC2 instance profile ARN that is obtained from the server when the backup is created. Because this value is
     * stored, you are not required to provide the InstanceProfileArn again if you restore a backup.
     * </p>
     * 
     * @return The EC2 instance profile ARN that is obtained from the server when the backup is created. Because this
     *         value is stored, you are not required to provide the InstanceProfileArn again if you restore a backup.
     */

    public String getInstanceProfileArn() {
        return this.instanceProfileArn;
    }

    /**
     * <p>
     * The EC2 instance profile ARN that is obtained from the server when the backup is created. Because this value is
     * stored, you are not required to provide the InstanceProfileArn again if you restore a backup.
     * </p>
     * 
     * @param instanceProfileArn
     *        The EC2 instance profile ARN that is obtained from the server when the backup is created. Because this
     *        value is stored, you are not required to provide the InstanceProfileArn again if you restore a backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withInstanceProfileArn(String instanceProfileArn) {
        setInstanceProfileArn(instanceProfileArn);
        return this;
    }

    /**
     * <p>
     * The instance type that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param instanceType
     *        The instance type that is obtained from the server when the backup is created.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type that is obtained from the server when the backup is created.
     * </p>
     * 
     * @return The instance type that is obtained from the server when the backup is created.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param instanceType
     *        The instance type that is obtained from the server when the backup is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The key pair that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param keyPair
     *        The key pair that is obtained from the server when the backup is created.
     */

    public void setKeyPair(String keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p>
     * The key pair that is obtained from the server when the backup is created.
     * </p>
     * 
     * @return The key pair that is obtained from the server when the backup is created.
     */

    public String getKeyPair() {
        return this.keyPair;
    }

    /**
     * <p>
     * The key pair that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param keyPair
     *        The key pair that is obtained from the server when the backup is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withKeyPair(String keyPair) {
        setKeyPair(keyPair);
        return this;
    }

    /**
     * <p>
     * The preferred backup period that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param preferredBackupWindow
     *        The preferred backup period that is obtained from the server when the backup is created.
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The preferred backup period that is obtained from the server when the backup is created.
     * </p>
     * 
     * @return The preferred backup period that is obtained from the server when the backup is created.
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The preferred backup period that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param preferredBackupWindow
     *        The preferred backup period that is obtained from the server when the backup is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The preferred maintenance period that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The preferred maintenance period that is obtained from the server when the backup is created.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The preferred maintenance period that is obtained from the server when the backup is created.
     * </p>
     * 
     * @return The preferred maintenance period that is obtained from the server when the backup is created.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The preferred maintenance period that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The preferred maintenance period that is obtained from the server when the backup is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     * 
     * @param s3DataSize
     *        This field is deprecated and is no longer used.
     */
    @Deprecated
    public void setS3DataSize(Integer s3DataSize) {
        this.s3DataSize = s3DataSize;
    }

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     * 
     * @return This field is deprecated and is no longer used.
     */
    @Deprecated
    public Integer getS3DataSize() {
        return this.s3DataSize;
    }

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     * 
     * @param s3DataSize
     *        This field is deprecated and is no longer used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Backup withS3DataSize(Integer s3DataSize) {
        setS3DataSize(s3DataSize);
        return this;
    }

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     * 
     * @param s3DataUrl
     *        This field is deprecated and is no longer used.
     */
    @Deprecated
    public void setS3DataUrl(String s3DataUrl) {
        this.s3DataUrl = s3DataUrl;
    }

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     * 
     * @return This field is deprecated and is no longer used.
     */
    @Deprecated
    public String getS3DataUrl() {
        return this.s3DataUrl;
    }

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     * 
     * @param s3DataUrl
     *        This field is deprecated and is no longer used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Backup withS3DataUrl(String s3DataUrl) {
        setS3DataUrl(s3DataUrl);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URL of the backup's log file.
     * </p>
     * 
     * @param s3LogUrl
     *        The Amazon S3 URL of the backup's log file.
     */

    public void setS3LogUrl(String s3LogUrl) {
        this.s3LogUrl = s3LogUrl;
    }

    /**
     * <p>
     * The Amazon S3 URL of the backup's log file.
     * </p>
     * 
     * @return The Amazon S3 URL of the backup's log file.
     */

    public String getS3LogUrl() {
        return this.s3LogUrl;
    }

    /**
     * <p>
     * The Amazon S3 URL of the backup's log file.
     * </p>
     * 
     * @param s3LogUrl
     *        The Amazon S3 URL of the backup's log file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withS3LogUrl(String s3LogUrl) {
        setS3LogUrl(s3LogUrl);
        return this;
    }

    /**
     * <p>
     * The security group IDs that are obtained from the server when the backup is created.
     * </p>
     * 
     * @return The security group IDs that are obtained from the server when the backup is created.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The security group IDs that are obtained from the server when the backup is created.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs that are obtained from the server when the backup is created.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The security group IDs that are obtained from the server when the backup is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs that are obtained from the server when the backup is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security group IDs that are obtained from the server when the backup is created.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs that are obtained from the server when the backup is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The name of the server from which the backup was made.
     * </p>
     * 
     * @param serverName
     *        The name of the server from which the backup was made.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server from which the backup was made.
     * </p>
     * 
     * @return The name of the server from which the backup was made.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server from which the backup was made.
     * </p>
     * 
     * @param serverName
     *        The name of the server from which the backup was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The service role ARN that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param serviceRoleArn
     *        The service role ARN that is obtained from the server when the backup is created.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The service role ARN that is obtained from the server when the backup is created.
     * </p>
     * 
     * @return The service role ARN that is obtained from the server when the backup is created.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The service role ARN that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param serviceRoleArn
     *        The service role ARN that is obtained from the server when the backup is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The status of a backup while in progress.
     * </p>
     * 
     * @param status
     *        The status of a backup while in progress.
     * @see BackupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a backup while in progress.
     * </p>
     * 
     * @return The status of a backup while in progress.
     * @see BackupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a backup while in progress.
     * </p>
     * 
     * @param status
     *        The status of a backup while in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupStatus
     */

    public Backup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a backup while in progress.
     * </p>
     * 
     * @param status
     *        The status of a backup while in progress.
     * @see BackupStatus
     */

    public void setStatus(BackupStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of a backup while in progress.
     * </p>
     * 
     * @param status
     *        The status of a backup while in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupStatus
     */

    public Backup withStatus(BackupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An informational message about backup status.
     * </p>
     * 
     * @param statusDescription
     *        An informational message about backup status.
     */

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /**
     * <p>
     * An informational message about backup status.
     * </p>
     * 
     * @return An informational message about backup status.
     */

    public String getStatusDescription() {
        return this.statusDescription;
    }

    /**
     * <p>
     * An informational message about backup status.
     * </p>
     * 
     * @param statusDescription
     *        An informational message about backup status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withStatusDescription(String statusDescription) {
        setStatusDescription(statusDescription);
        return this;
    }

    /**
     * <p>
     * The subnet IDs that are obtained from the server when the backup is created.
     * </p>
     * 
     * @return The subnet IDs that are obtained from the server when the backup is created.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The subnet IDs that are obtained from the server when the backup is created.
     * </p>
     * 
     * @param subnetIds
     *        The subnet IDs that are obtained from the server when the backup is created.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The subnet IDs that are obtained from the server when the backup is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The subnet IDs that are obtained from the server when the backup is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnet IDs that are obtained from the server when the backup is created.
     * </p>
     * 
     * @param subnetIds
     *        The subnet IDs that are obtained from the server when the backup is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The version of AWS OpsWorks CM-specific tools that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param toolsVersion
     *        The version of AWS OpsWorks CM-specific tools that is obtained from the server when the backup is created.
     */

    public void setToolsVersion(String toolsVersion) {
        this.toolsVersion = toolsVersion;
    }

    /**
     * <p>
     * The version of AWS OpsWorks CM-specific tools that is obtained from the server when the backup is created.
     * </p>
     * 
     * @return The version of AWS OpsWorks CM-specific tools that is obtained from the server when the backup is
     *         created.
     */

    public String getToolsVersion() {
        return this.toolsVersion;
    }

    /**
     * <p>
     * The version of AWS OpsWorks CM-specific tools that is obtained from the server when the backup is created.
     * </p>
     * 
     * @param toolsVersion
     *        The version of AWS OpsWorks CM-specific tools that is obtained from the server when the backup is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withToolsVersion(String toolsVersion) {
        setToolsVersion(toolsVersion);
        return this;
    }

    /**
     * <p>
     * The IAM user ARN of the requester for manual backups. This field is empty for automated backups.
     * </p>
     * 
     * @param userArn
     *        The IAM user ARN of the requester for manual backups. This field is empty for automated backups.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The IAM user ARN of the requester for manual backups. This field is empty for automated backups.
     * </p>
     * 
     * @return The IAM user ARN of the requester for manual backups. This field is empty for automated backups.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The IAM user ARN of the requester for manual backups. This field is empty for automated backups.
     * </p>
     * 
     * @param userArn
     *        The IAM user ARN of the requester for manual backups. This field is empty for automated backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withUserArn(String userArn) {
        setUserArn(userArn);
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
        if (getBackupArn() != null)
            sb.append("BackupArn: ").append(getBackupArn()).append(",");
        if (getBackupId() != null)
            sb.append("BackupId: ").append(getBackupId()).append(",");
        if (getBackupType() != null)
            sb.append("BackupType: ").append(getBackupType()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineModel() != null)
            sb.append("EngineModel: ").append(getEngineModel()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getInstanceProfileArn() != null)
            sb.append("InstanceProfileArn: ").append(getInstanceProfileArn()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getKeyPair() != null)
            sb.append("KeyPair: ").append(getKeyPair()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getS3DataSize() != null)
            sb.append("S3DataSize: ").append(getS3DataSize()).append(",");
        if (getS3DataUrl() != null)
            sb.append("S3DataUrl: ").append(getS3DataUrl()).append(",");
        if (getS3LogUrl() != null)
            sb.append("S3LogUrl: ").append(getS3LogUrl()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: ").append(getServiceRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDescription() != null)
            sb.append("StatusDescription: ").append(getStatusDescription()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getToolsVersion() != null)
            sb.append("ToolsVersion: ").append(getToolsVersion()).append(",");
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Backup == false)
            return false;
        Backup other = (Backup) obj;
        if (other.getBackupArn() == null ^ this.getBackupArn() == null)
            return false;
        if (other.getBackupArn() != null && other.getBackupArn().equals(this.getBackupArn()) == false)
            return false;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getBackupType() == null ^ this.getBackupType() == null)
            return false;
        if (other.getBackupType() != null && other.getBackupType().equals(this.getBackupType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineModel() == null ^ this.getEngineModel() == null)
            return false;
        if (other.getEngineModel() != null && other.getEngineModel().equals(this.getEngineModel()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getInstanceProfileArn() == null ^ this.getInstanceProfileArn() == null)
            return false;
        if (other.getInstanceProfileArn() != null && other.getInstanceProfileArn().equals(this.getInstanceProfileArn()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKeyPair() == null ^ this.getKeyPair() == null)
            return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getS3DataSize() == null ^ this.getS3DataSize() == null)
            return false;
        if (other.getS3DataSize() != null && other.getS3DataSize().equals(this.getS3DataSize()) == false)
            return false;
        if (other.getS3DataUrl() == null ^ this.getS3DataUrl() == null)
            return false;
        if (other.getS3DataUrl() != null && other.getS3DataUrl().equals(this.getS3DataUrl()) == false)
            return false;
        if (other.getS3LogUrl() == null ^ this.getS3LogUrl() == null)
            return false;
        if (other.getS3LogUrl() != null && other.getS3LogUrl().equals(this.getS3LogUrl()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDescription() == null ^ this.getStatusDescription() == null)
            return false;
        if (other.getStatusDescription() != null && other.getStatusDescription().equals(this.getStatusDescription()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getToolsVersion() == null ^ this.getToolsVersion() == null)
            return false;
        if (other.getToolsVersion() != null && other.getToolsVersion().equals(this.getToolsVersion()) == false)
            return false;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupArn() == null) ? 0 : getBackupArn().hashCode());
        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getBackupType() == null) ? 0 : getBackupType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineModel() == null) ? 0 : getEngineModel().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileArn() == null) ? 0 : getInstanceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getS3DataSize() == null) ? 0 : getS3DataSize().hashCode());
        hashCode = prime * hashCode + ((getS3DataUrl() == null) ? 0 : getS3DataUrl().hashCode());
        hashCode = prime * hashCode + ((getS3LogUrl() == null) ? 0 : getS3LogUrl().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDescription() == null) ? 0 : getStatusDescription().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getToolsVersion() == null) ? 0 : getToolsVersion().hashCode());
        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        return hashCode;
    }

    @Override
    public Backup clone() {
        try {
            return (Backup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworkscm.model.transform.BackupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
