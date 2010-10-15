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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#modifyDBInstance(ModifyDBInstanceRequest) ModifyDBInstance operation}.
 * <p>
 * This API is used to change RDS Instance settings. Users call the
 * ModifyDBInstance API to change one or more database configuration
 * parameters by specifying these parameters and the new values in the
 * request.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#modifyDBInstance(ModifyDBInstanceRequest)
 */
public class ModifyDBInstanceRequest extends AmazonWebServiceRequest {

    /**
     * The DB Instance identifier. This value is stored as a lowercase
     * string.
     */
    private String dBInstanceIdentifier;

    /**
     * The new storage capacity of the RDS instance. <p> This change does not
     * result in an outage and is applied during the next maintenance window
     * unless the <i>ApplyImmediately</i> parameter is specified as
     * <i>true</i> for this request.
     */
    private Integer allocatedStorage;

    /**
     * The new compute and memory capacity of the DB Instance. <p> Passing a
     * value for this parameter causes an outage during the change and is
     * applied during the next maintenance window, unless the
     * <i>ApplyImmediately</i> parameter is specified as <i>true</i> for this
     * request.
     */
    private String dBInstanceClass;

    /**
     * A list of DB Security Groups to authorize on this DB Instance. This
     * change is asynchronously applied as soon as possible.
     */
    private java.util.List<String> dBSecurityGroups;

    /**
     * Specifies whether or not the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <i>PreferredMaintenanceWindow</i> setting for the DB
     * Instance. <p> If this parameter is passed as <i>false</i>, changes to
     * the DB Instance are applied on the next call to
     * <a>RebootDBInstance</a>, the next maintenance reboot, or the next
     * failure reboot, whichever occurs first.
     */
    private Boolean applyImmediately;

    /**
     * The new password for the DB Instance master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <i>MasterUserPassword</i> element exists in the
     * <i>PendingModifiedValues</i> element of the operation response.
     */
    private String masterUserPassword;

    /**
     * The name of the DB Parameter Group to apply to this DB Instance. This
     * change is asynchronously applied as soon as possible for parameters
     * when the <i>ApplyImmediately</i> parameter is specified as <i>true</i>
     * for this request.
     */
    private String dBParameterGroupName;

    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups.
     */
    private Integer backupRetentionPeriod;

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, as determined by the
     * <i>BackupRetentionPeriod</i>.
     */
    private String preferredBackupWindow;

    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, which may result in an outage. This change is made immediately.
     * If moving this window to the current time, there must be at least 120
     * minutes between the current time and end of the window to ensure
     * pending changes are applied.
     */
    private String preferredMaintenanceWindow;

    /**
     * Specifies if the DB Instance is a Multi-AZ deployment.
     */
    private Boolean multiAZ;

    /**
     * The version number of the database engine to upgrade to. <p> For major
     * version upgrades, if a non-default DB Parameter Group is currently in
     * use, a new DB Parameter Group in the DB Parameter Group Family for the
     * new engine version must be specified. The new DB Parameter Group can
     * be the default for that DB Parameter Group Family.
     */
    private String engineVersion;

    /**
     * The indicates that major version upgrades are allowed.
     */
    private Boolean allowMajorVersionUpgrade;

    /**
     * The indicates that minor version upgrades will be applied
     * automatically to the DB Instance during the maintenance window.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * Default constructor for a new ModifyDBInstanceRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ModifyDBInstanceRequest() {}
    
    /**
     * Constructs a new ModifyDBInstanceRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBInstanceIdentifier The DB Instance identifier. This value is
     * stored as a lowercase string.
     */
    public ModifyDBInstanceRequest(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This value is stored as a lowercase
     * string.
     *
     * @return The DB Instance identifier. This value is stored as a lowercase
     *         string.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This value is stored as a lowercase
     * string.
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This value is stored as a lowercase
     *         string.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This value is stored as a lowercase
     * string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This value is stored as a lowercase
     *         string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * The new storage capacity of the RDS instance. <p> This change does not
     * result in an outage and is applied during the next maintenance window
     * unless the <i>ApplyImmediately</i> parameter is specified as
     * <i>true</i> for this request.
     *
     * @return The new storage capacity of the RDS instance. <p> This change does not
     *         result in an outage and is applied during the next maintenance window
     *         unless the <i>ApplyImmediately</i> parameter is specified as
     *         <i>true</i> for this request.
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }
    
    /**
     * The new storage capacity of the RDS instance. <p> This change does not
     * result in an outage and is applied during the next maintenance window
     * unless the <i>ApplyImmediately</i> parameter is specified as
     * <i>true</i> for this request.
     *
     * @param allocatedStorage The new storage capacity of the RDS instance. <p> This change does not
     *         result in an outage and is applied during the next maintenance window
     *         unless the <i>ApplyImmediately</i> parameter is specified as
     *         <i>true</i> for this request.
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }
    
    /**
     * The new storage capacity of the RDS instance. <p> This change does not
     * result in an outage and is applied during the next maintenance window
     * unless the <i>ApplyImmediately</i> parameter is specified as
     * <i>true</i> for this request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocatedStorage The new storage capacity of the RDS instance. <p> This change does not
     *         result in an outage and is applied during the next maintenance window
     *         unless the <i>ApplyImmediately</i> parameter is specified as
     *         <i>true</i> for this request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }
    
    
    /**
     * The new compute and memory capacity of the DB Instance. <p> Passing a
     * value for this parameter causes an outage during the change and is
     * applied during the next maintenance window, unless the
     * <i>ApplyImmediately</i> parameter is specified as <i>true</i> for this
     * request.
     *
     * @return The new compute and memory capacity of the DB Instance. <p> Passing a
     *         value for this parameter causes an outage during the change and is
     *         applied during the next maintenance window, unless the
     *         <i>ApplyImmediately</i> parameter is specified as <i>true</i> for this
     *         request.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The new compute and memory capacity of the DB Instance. <p> Passing a
     * value for this parameter causes an outage during the change and is
     * applied during the next maintenance window, unless the
     * <i>ApplyImmediately</i> parameter is specified as <i>true</i> for this
     * request.
     *
     * @param dBInstanceClass The new compute and memory capacity of the DB Instance. <p> Passing a
     *         value for this parameter causes an outage during the change and is
     *         applied during the next maintenance window, unless the
     *         <i>ApplyImmediately</i> parameter is specified as <i>true</i> for this
     *         request.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The new compute and memory capacity of the DB Instance. <p> Passing a
     * value for this parameter causes an outage during the change and is
     * applied during the next maintenance window, unless the
     * <i>ApplyImmediately</i> parameter is specified as <i>true</i> for this
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The new compute and memory capacity of the DB Instance. <p> Passing a
     *         value for this parameter causes an outage during the change and is
     *         applied during the next maintenance window, unless the
     *         <i>ApplyImmediately</i> parameter is specified as <i>true</i> for this
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }
    
    
    /**
     * A list of DB Security Groups to authorize on this DB Instance. This
     * change is asynchronously applied as soon as possible.
     *
     * @return A list of DB Security Groups to authorize on this DB Instance. This
     *         change is asynchronously applied as soon as possible.
     */
    public java.util.List<String> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
            dBSecurityGroups = new java.util.ArrayList<String>();
        }
        return dBSecurityGroups;
    }
    
    /**
     * A list of DB Security Groups to authorize on this DB Instance. This
     * change is asynchronously applied as soon as possible.
     *
     * @param dBSecurityGroups A list of DB Security Groups to authorize on this DB Instance. This
     *         change is asynchronously applied as soon as possible.
     */
    public void setDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        java.util.List<String> dBSecurityGroupsCopy = new java.util.ArrayList<String>();
        if (dBSecurityGroups != null) {
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        }
        this.dBSecurityGroups = dBSecurityGroupsCopy;
    }
    
    /**
     * A list of DB Security Groups to authorize on this DB Instance. This
     * change is asynchronously applied as soon as possible.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of DB Security Groups to authorize on this DB Instance. This
     *         change is asynchronously applied as soon as possible.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withDBSecurityGroups(String... dBSecurityGroups) {
        for (String value : dBSecurityGroups) {
            getDBSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of DB Security Groups to authorize on this DB Instance. This
     * change is asynchronously applied as soon as possible.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of DB Security Groups to authorize on this DB Instance. This
     *         change is asynchronously applied as soon as possible.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        java.util.List<String> dBSecurityGroupsCopy = new java.util.ArrayList<String>();
        if (dBSecurityGroups != null) {
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        }
        this.dBSecurityGroups = dBSecurityGroupsCopy;

        return this;
    }
    
    /**
     * Specifies whether or not the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <i>PreferredMaintenanceWindow</i> setting for the DB
     * Instance. <p> If this parameter is passed as <i>false</i>, changes to
     * the DB Instance are applied on the next call to
     * <a>RebootDBInstance</a>, the next maintenance reboot, or the next
     * failure reboot, whichever occurs first.
     *
     * @return Specifies whether or not the modifications in this request and any
     *         pending modifications are asynchronously applied as soon as possible,
     *         regardless of the <i>PreferredMaintenanceWindow</i> setting for the DB
     *         Instance. <p> If this parameter is passed as <i>false</i>, changes to
     *         the DB Instance are applied on the next call to
     *         <a>RebootDBInstance</a>, the next maintenance reboot, or the next
     *         failure reboot, whichever occurs first.
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }
    
    /**
     * Specifies whether or not the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <i>PreferredMaintenanceWindow</i> setting for the DB
     * Instance. <p> If this parameter is passed as <i>false</i>, changes to
     * the DB Instance are applied on the next call to
     * <a>RebootDBInstance</a>, the next maintenance reboot, or the next
     * failure reboot, whichever occurs first.
     *
     * @param applyImmediately Specifies whether or not the modifications in this request and any
     *         pending modifications are asynchronously applied as soon as possible,
     *         regardless of the <i>PreferredMaintenanceWindow</i> setting for the DB
     *         Instance. <p> If this parameter is passed as <i>false</i>, changes to
     *         the DB Instance are applied on the next call to
     *         <a>RebootDBInstance</a>, the next maintenance reboot, or the next
     *         failure reboot, whichever occurs first.
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }
    
    /**
     * Specifies whether or not the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <i>PreferredMaintenanceWindow</i> setting for the DB
     * Instance. <p> If this parameter is passed as <i>false</i>, changes to
     * the DB Instance are applied on the next call to
     * <a>RebootDBInstance</a>, the next maintenance reboot, or the next
     * failure reboot, whichever occurs first.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applyImmediately Specifies whether or not the modifications in this request and any
     *         pending modifications are asynchronously applied as soon as possible,
     *         regardless of the <i>PreferredMaintenanceWindow</i> setting for the DB
     *         Instance. <p> If this parameter is passed as <i>false</i>, changes to
     *         the DB Instance are applied on the next call to
     *         <a>RebootDBInstance</a>, the next maintenance reboot, or the next
     *         failure reboot, whichever occurs first.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
        return this;
    }
    
    
    /**
     * Specifies whether or not the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <i>PreferredMaintenanceWindow</i> setting for the DB
     * Instance. <p> If this parameter is passed as <i>false</i>, changes to
     * the DB Instance are applied on the next call to
     * <a>RebootDBInstance</a>, the next maintenance reboot, or the next
     * failure reboot, whichever occurs first.
     *
     * @return Specifies whether or not the modifications in this request and any
     *         pending modifications are asynchronously applied as soon as possible,
     *         regardless of the <i>PreferredMaintenanceWindow</i> setting for the DB
     *         Instance. <p> If this parameter is passed as <i>false</i>, changes to
     *         the DB Instance are applied on the next call to
     *         <a>RebootDBInstance</a>, the next maintenance reboot, or the next
     *         failure reboot, whichever occurs first.
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }
    
    /**
     * The new password for the DB Instance master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <i>MasterUserPassword</i> element exists in the
     * <i>PendingModifiedValues</i> element of the operation response.
     *
     * @return The new password for the DB Instance master user. This change is
     *         asynchronously applied as soon as possible. Between the time of the
     *         request and the completion of the request, the
     *         <i>MasterUserPassword</i> element exists in the
     *         <i>PendingModifiedValues</i> element of the operation response.
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }
    
    /**
     * The new password for the DB Instance master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <i>MasterUserPassword</i> element exists in the
     * <i>PendingModifiedValues</i> element of the operation response.
     *
     * @param masterUserPassword The new password for the DB Instance master user. This change is
     *         asynchronously applied as soon as possible. Between the time of the
     *         request and the completion of the request, the
     *         <i>MasterUserPassword</i> element exists in the
     *         <i>PendingModifiedValues</i> element of the operation response.
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * The new password for the DB Instance master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <i>MasterUserPassword</i> element exists in the
     * <i>PendingModifiedValues</i> element of the operation response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUserPassword The new password for the DB Instance master user. This change is
     *         asynchronously applied as soon as possible. Between the time of the
     *         request and the completion of the request, the
     *         <i>MasterUserPassword</i> element exists in the
     *         <i>PendingModifiedValues</i> element of the operation response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }
    
    
    /**
     * The name of the DB Parameter Group to apply to this DB Instance. This
     * change is asynchronously applied as soon as possible for parameters
     * when the <i>ApplyImmediately</i> parameter is specified as <i>true</i>
     * for this request.
     *
     * @return The name of the DB Parameter Group to apply to this DB Instance. This
     *         change is asynchronously applied as soon as possible for parameters
     *         when the <i>ApplyImmediately</i> parameter is specified as <i>true</i>
     *         for this request.
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group to apply to this DB Instance. This
     * change is asynchronously applied as soon as possible for parameters
     * when the <i>ApplyImmediately</i> parameter is specified as <i>true</i>
     * for this request.
     *
     * @param dBParameterGroupName The name of the DB Parameter Group to apply to this DB Instance. This
     *         change is asynchronously applied as soon as possible for parameters
     *         when the <i>ApplyImmediately</i> parameter is specified as <i>true</i>
     *         for this request.
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group to apply to this DB Instance. This
     * change is asynchronously applied as soon as possible for parameters
     * when the <i>ApplyImmediately</i> parameter is specified as <i>true</i>
     * for this request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the DB Parameter Group to apply to this DB Instance. This
     *         change is asynchronously applied as soon as possible for parameters
     *         when the <i>ApplyImmediately</i> parameter is specified as <i>true</i>
     *         for this request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }
    
    
    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups.
     *
     * @return The number of days to retain automated backups. Setting this parameter
     *         to a positive number enables backups. Setting this parameter to 0
     *         disables automated backups.
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }
    
    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups.
     *
     * @param backupRetentionPeriod The number of days to retain automated backups. Setting this parameter
     *         to a positive number enables backups. Setting this parameter to 0
     *         disables automated backups.
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }
    
    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backupRetentionPeriod The number of days to retain automated backups. Setting this parameter
     *         to a positive number enables backups. Setting this parameter to 0
     *         disables automated backups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, as determined by the
     * <i>BackupRetentionPeriod</i>.
     *
     * @return The daily time range during which automated backups are created if
     *         automated backups are enabled, as determined by the
     *         <i>BackupRetentionPeriod</i>.
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, as determined by the
     * <i>BackupRetentionPeriod</i>.
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, as determined by the
     *         <i>BackupRetentionPeriod</i>.
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, as determined by the
     * <i>BackupRetentionPeriod</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, as determined by the
     *         <i>BackupRetentionPeriod</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }
    
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, which may result in an outage. This change is made immediately.
     * If moving this window to the current time, there must be at least 120
     * minutes between the current time and end of the window to ensure
     * pending changes are applied.
     *
     * @return The weekly time range (in UTC) during which system maintenance can
     *         occur, which may result in an outage. This change is made immediately.
     *         If moving this window to the current time, there must be at least 120
     *         minutes between the current time and end of the window to ensure
     *         pending changes are applied.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, which may result in an outage. This change is made immediately.
     * If moving this window to the current time, there must be at least 120
     * minutes between the current time and end of the window to ensure
     * pending changes are applied.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur, which may result in an outage. This change is made immediately.
     *         If moving this window to the current time, there must be at least 120
     *         minutes between the current time and end of the window to ensure
     *         pending changes are applied.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, which may result in an outage. This change is made immediately.
     * If moving this window to the current time, there must be at least 120
     * minutes between the current time and end of the window to ensure
     * pending changes are applied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur, which may result in an outage. This change is made immediately.
     *         If moving this window to the current time, there must be at least 120
     *         minutes between the current time and end of the window to ensure
     *         pending changes are applied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }
    
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment.
     *
     * @return Specifies if the DB Instance is a Multi-AZ deployment.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment.
     *
     * @param multiAZ Specifies if the DB Instance is a Multi-AZ deployment.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ Specifies if the DB Instance is a Multi-AZ deployment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }
    
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment.
     *
     * @return Specifies if the DB Instance is a Multi-AZ deployment.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }
    
    /**
     * The version number of the database engine to upgrade to. <p> For major
     * version upgrades, if a non-default DB Parameter Group is currently in
     * use, a new DB Parameter Group in the DB Parameter Group Family for the
     * new engine version must be specified. The new DB Parameter Group can
     * be the default for that DB Parameter Group Family.
     *
     * @return The version number of the database engine to upgrade to. <p> For major
     *         version upgrades, if a non-default DB Parameter Group is currently in
     *         use, a new DB Parameter Group in the DB Parameter Group Family for the
     *         new engine version must be specified. The new DB Parameter Group can
     *         be the default for that DB Parameter Group Family.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version number of the database engine to upgrade to. <p> For major
     * version upgrades, if a non-default DB Parameter Group is currently in
     * use, a new DB Parameter Group in the DB Parameter Group Family for the
     * new engine version must be specified. The new DB Parameter Group can
     * be the default for that DB Parameter Group Family.
     *
     * @param engineVersion The version number of the database engine to upgrade to. <p> For major
     *         version upgrades, if a non-default DB Parameter Group is currently in
     *         use, a new DB Parameter Group in the DB Parameter Group Family for the
     *         new engine version must be specified. The new DB Parameter Group can
     *         be the default for that DB Parameter Group Family.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version number of the database engine to upgrade to. <p> For major
     * version upgrades, if a non-default DB Parameter Group is currently in
     * use, a new DB Parameter Group in the DB Parameter Group Family for the
     * new engine version must be specified. The new DB Parameter Group can
     * be the default for that DB Parameter Group Family.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version number of the database engine to upgrade to. <p> For major
     *         version upgrades, if a non-default DB Parameter Group is currently in
     *         use, a new DB Parameter Group in the DB Parameter Group Family for the
     *         new engine version must be specified. The new DB Parameter Group can
     *         be the default for that DB Parameter Group Family.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    
    
    /**
     * The indicates that major version upgrades are allowed.
     *
     * @return The indicates that major version upgrades are allowed.
     */
    public Boolean isAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }
    
    /**
     * The indicates that major version upgrades are allowed.
     *
     * @param allowMajorVersionUpgrade The indicates that major version upgrades are allowed.
     */
    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }
    
    /**
     * The indicates that major version upgrades are allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowMajorVersionUpgrade The indicates that major version upgrades are allowed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
        return this;
    }
    
    
    /**
     * The indicates that major version upgrades are allowed.
     *
     * @return The indicates that major version upgrades are allowed.
     */
    public Boolean getAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }
    
    /**
     * The indicates that minor version upgrades will be applied
     * automatically to the DB Instance during the maintenance window.
     *
     * @return The indicates that minor version upgrades will be applied
     *         automatically to the DB Instance during the maintenance window.
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * The indicates that minor version upgrades will be applied
     * automatically to the DB Instance during the maintenance window.
     *
     * @param autoMinorVersionUpgrade The indicates that minor version upgrades will be applied
     *         automatically to the DB Instance during the maintenance window.
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * The indicates that minor version upgrades will be applied
     * automatically to the DB Instance during the maintenance window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade The indicates that minor version upgrades will be applied
     *         automatically to the DB Instance during the maintenance window.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }
    
    
    /**
     * The indicates that minor version upgrades will be applied
     * automatically to the DB Instance during the maintenance window.
     *
     * @return The indicates that minor version upgrades will be applied
     *         automatically to the DB Instance during the maintenance window.
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
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
        sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        sb.append("AllocatedStorage: " + allocatedStorage + ", ");
        sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        sb.append("DBSecurityGroups: " + dBSecurityGroups + ", ");
        sb.append("ApplyImmediately: " + applyImmediately + ", ");
        sb.append("MasterUserPassword: " + masterUserPassword + ", ");
        sb.append("DBParameterGroupName: " + dBParameterGroupName + ", ");
        sb.append("BackupRetentionPeriod: " + backupRetentionPeriod + ", ");
        sb.append("PreferredBackupWindow: " + preferredBackupWindow + ", ");
        sb.append("PreferredMaintenanceWindow: " + preferredMaintenanceWindow + ", ");
        sb.append("MultiAZ: " + multiAZ + ", ");
        sb.append("EngineVersion: " + engineVersion + ", ");
        sb.append("AllowMajorVersionUpgrade: " + allowMajorVersionUpgrade + ", ");
        sb.append("AutoMinorVersionUpgrade: " + autoMinorVersionUpgrade + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    