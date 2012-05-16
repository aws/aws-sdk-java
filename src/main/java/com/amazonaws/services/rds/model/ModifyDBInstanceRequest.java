/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Modify settings for a DB Instance. You can change one or more database configuration parameters by specifying these parameters and the new values in
 * the request.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#modifyDBInstance(ModifyDBInstanceRequest)
 */
public class ModifyDBInstanceRequest extends AmazonWebServiceRequest {

    /**
     * The DB Instance identifier. This value is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must be the identifier for an
     * existing DB Instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul> <p>Example: <copy>mydbinstance</copy>
     */
    private String dBInstanceIdentifier;

    /**
     * The new storage capacity of the RDS instance. <p> This change does not
     * result in an outage and is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is specified as
     * <code>true</code> for this request. <p><b>MySQL</b> <p>Default: Uses
     * existing setting <p>Valid Values: 5-1024 <p>Constraints: Value
     * supplied must be at least 10% greater than the current value. Values
     * that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value. <p>Type:
     * Integer <p><b>MySQL</b> <p>Default: Uses existing setting <p>Valid
     * Values: 10-1024 <p>Constraints: Value supplied must be at least 10%
     * greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10%
     * greater than the current value.
     */
    private Integer allocatedStorage;

    /**
     * The new compute and memory capacity of the DB Instance. <p> Passing a
     * value for this parameter causes an outage during the change and is
     * applied during the next maintenance window, unless the
     * <code>ApplyImmediately</code> parameter is specified as
     * <code>true</code> for this request. <p>Default: Uses existing setting
     * <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     * db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge</code>
     */
    private String dBInstanceClass;

    /**
     * A list of DB Security Groups to authorize on this DB Instance. This
     * change is asynchronously applied as soon as possible. <p>Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     */
    private java.util.List<String> dBSecurityGroups;

    /**
     * Specifies whether or not the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for
     * the DB Instance. <p> If this parameter is passed as
     * <code>false</code>, changes to the DB Instance are applied on the next
     * call to <a>RebootDBInstance</a>, the next maintenance reboot, or the
     * next failure reboot, whichever occurs first. <p>Default:
     * <code>false</code>
     */
    private Boolean applyImmediately;

    /**
     * The new password for the DB Instance master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <code>MasterUserPassword</code> element exists in the
     * <code>PendingModifiedValues</code> element of the operation response.
     * <p>Default: Uses existing setting <p>Constraints: Must be 4 to 41
     * alphanumeric characters (engine specific) <note> Amazon RDS APIs never
     * return the password, so this API provides a way to regain access to a
     * master instance user if the password is lost. </note>
     */
    private String masterUserPassword;

    /**
     * The name of the DB Parameter Group to apply to this DB Instance. This
     * change is asynchronously applied as soon as possible for parameters
     * when the <i>ApplyImmediately</i> parameter is specified as
     * <code>true</code> for this request. <p>Default: Uses existing setting
     * <p>Constraints: The DB Parameter Group must be in the same DB
     * Parameter Group family as this DB Instance.
     */
    private String dBParameterGroupName;

    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups. <p>Default: Uses existing setting
     * <p>Constraints: <ul> <li>Must be a value from 0 to 8</li> <li>Cannot
     * be set to 0 if the DB Instance is a master instance with read replicas
     * or of the DB Instance is a read replica</li> </ul>
     */
    private Integer backupRetentionPeriod;

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>. <p>Constraints: <ul> <li>Must be
     * in the format hh24:mi-hh24:mi</li> <li>Times should be Universal Time
     * Coordinated (UTC)</li> <li>Must not conflict with the preferred
     * maintenance window</li> <li>Must be at least 30 minutes</li> </ul>
     */
    private String preferredBackupWindow;

    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, which may result in an outage. This change is made immediately.
     * If moving this window to the current time, there must be at least 120
     * minutes between the current time and end of the window to ensure
     * pending changes are applied. <p>Default: Uses existing setting
     * <p>Format: ddd:hh24:mi-ddd:hh24:mi <p>Valid Days: Mon | Tue | Wed |
     * Thu | Fri | Sat | Sun <p>Constraints: Must be at least 30 minutes
     */
    private String preferredMaintenanceWindow;

    /**
     * Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraints:
     * Cannot be specified if the DB Instance is a read replica.
     */
    private Boolean multiAZ;

    /**
     * The version number of the database engine to upgrade to. <p> For major
     * version upgrades, if a nondefault DB Parameter Group is currently in
     * use, a new DB Parameter Group in the DB Parameter Group Family for the
     * new engine version must be specified. The new DB Parameter Group can
     * be the default for that DB Parameter Group Family. <p>Example:
     * <code>5.1.42</code>
     */
    private String engineVersion;

    /**
     * Indicates that major version upgrades are allowed. <p>Constraints:
     * This parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB
     * Instance's current version.
     */
    private Boolean allowMajorVersionUpgrade;

    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
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
     * stored as a lowercase string. <p>Constraints: <ul> <li>Must be the
     * identifier for an existing DB Instance</li> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens</li> <li>First character must be
     * a letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <p>Example: <copy>mydbinstance</copy>
     */
    public ModifyDBInstanceRequest(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    
    
    /**
     * The DB Instance identifier. This value is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must be the identifier for an
     * existing DB Instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul> <p>Example: <copy>mydbinstance</copy>
     *
     * @return The DB Instance identifier. This value is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must be the identifier for an
     *         existing DB Instance</li> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul> <p>Example: <copy>mydbinstance</copy>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This value is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must be the identifier for an
     * existing DB Instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul> <p>Example: <copy>mydbinstance</copy>
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This value is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must be the identifier for an
     *         existing DB Instance</li> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul> <p>Example: <copy>mydbinstance</copy>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This value is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must be the identifier for an
     * existing DB Instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul> <p>Example: <copy>mydbinstance</copy>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This value is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must be the identifier for an
     *         existing DB Instance</li> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul> <p>Example: <copy>mydbinstance</copy>
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
     * unless the <code>ApplyImmediately</code> parameter is specified as
     * <code>true</code> for this request. <p><b>MySQL</b> <p>Default: Uses
     * existing setting <p>Valid Values: 5-1024 <p>Constraints: Value
     * supplied must be at least 10% greater than the current value. Values
     * that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value. <p>Type:
     * Integer <p><b>MySQL</b> <p>Default: Uses existing setting <p>Valid
     * Values: 10-1024 <p>Constraints: Value supplied must be at least 10%
     * greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10%
     * greater than the current value.
     *
     * @return The new storage capacity of the RDS instance. <p> This change does not
     *         result in an outage and is applied during the next maintenance window
     *         unless the <code>ApplyImmediately</code> parameter is specified as
     *         <code>true</code> for this request. <p><b>MySQL</b> <p>Default: Uses
     *         existing setting <p>Valid Values: 5-1024 <p>Constraints: Value
     *         supplied must be at least 10% greater than the current value. Values
     *         that are not at least 10% greater than the existing value are rounded
     *         up so that they are 10% greater than the current value. <p>Type:
     *         Integer <p><b>MySQL</b> <p>Default: Uses existing setting <p>Valid
     *         Values: 10-1024 <p>Constraints: Value supplied must be at least 10%
     *         greater than the current value. Values that are not at least 10%
     *         greater than the existing value are rounded up so that they are 10%
     *         greater than the current value.
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }
    
    /**
     * The new storage capacity of the RDS instance. <p> This change does not
     * result in an outage and is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is specified as
     * <code>true</code> for this request. <p><b>MySQL</b> <p>Default: Uses
     * existing setting <p>Valid Values: 5-1024 <p>Constraints: Value
     * supplied must be at least 10% greater than the current value. Values
     * that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value. <p>Type:
     * Integer <p><b>MySQL</b> <p>Default: Uses existing setting <p>Valid
     * Values: 10-1024 <p>Constraints: Value supplied must be at least 10%
     * greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10%
     * greater than the current value.
     *
     * @param allocatedStorage The new storage capacity of the RDS instance. <p> This change does not
     *         result in an outage and is applied during the next maintenance window
     *         unless the <code>ApplyImmediately</code> parameter is specified as
     *         <code>true</code> for this request. <p><b>MySQL</b> <p>Default: Uses
     *         existing setting <p>Valid Values: 5-1024 <p>Constraints: Value
     *         supplied must be at least 10% greater than the current value. Values
     *         that are not at least 10% greater than the existing value are rounded
     *         up so that they are 10% greater than the current value. <p>Type:
     *         Integer <p><b>MySQL</b> <p>Default: Uses existing setting <p>Valid
     *         Values: 10-1024 <p>Constraints: Value supplied must be at least 10%
     *         greater than the current value. Values that are not at least 10%
     *         greater than the existing value are rounded up so that they are 10%
     *         greater than the current value.
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }
    
    /**
     * The new storage capacity of the RDS instance. <p> This change does not
     * result in an outage and is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is specified as
     * <code>true</code> for this request. <p><b>MySQL</b> <p>Default: Uses
     * existing setting <p>Valid Values: 5-1024 <p>Constraints: Value
     * supplied must be at least 10% greater than the current value. Values
     * that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value. <p>Type:
     * Integer <p><b>MySQL</b> <p>Default: Uses existing setting <p>Valid
     * Values: 10-1024 <p>Constraints: Value supplied must be at least 10%
     * greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10%
     * greater than the current value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocatedStorage The new storage capacity of the RDS instance. <p> This change does not
     *         result in an outage and is applied during the next maintenance window
     *         unless the <code>ApplyImmediately</code> parameter is specified as
     *         <code>true</code> for this request. <p><b>MySQL</b> <p>Default: Uses
     *         existing setting <p>Valid Values: 5-1024 <p>Constraints: Value
     *         supplied must be at least 10% greater than the current value. Values
     *         that are not at least 10% greater than the existing value are rounded
     *         up so that they are 10% greater than the current value. <p>Type:
     *         Integer <p><b>MySQL</b> <p>Default: Uses existing setting <p>Valid
     *         Values: 10-1024 <p>Constraints: Value supplied must be at least 10%
     *         greater than the current value. Values that are not at least 10%
     *         greater than the existing value are rounded up so that they are 10%
     *         greater than the current value.
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
     * <code>ApplyImmediately</code> parameter is specified as
     * <code>true</code> for this request. <p>Default: Uses existing setting
     * <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     * db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge</code>
     *
     * @return The new compute and memory capacity of the DB Instance. <p> Passing a
     *         value for this parameter causes an outage during the change and is
     *         applied during the next maintenance window, unless the
     *         <code>ApplyImmediately</code> parameter is specified as
     *         <code>true</code> for this request. <p>Default: Uses existing setting
     *         <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     *         db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge</code>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The new compute and memory capacity of the DB Instance. <p> Passing a
     * value for this parameter causes an outage during the change and is
     * applied during the next maintenance window, unless the
     * <code>ApplyImmediately</code> parameter is specified as
     * <code>true</code> for this request. <p>Default: Uses existing setting
     * <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     * db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge</code>
     *
     * @param dBInstanceClass The new compute and memory capacity of the DB Instance. <p> Passing a
     *         value for this parameter causes an outage during the change and is
     *         applied during the next maintenance window, unless the
     *         <code>ApplyImmediately</code> parameter is specified as
     *         <code>true</code> for this request. <p>Default: Uses existing setting
     *         <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     *         db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge</code>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The new compute and memory capacity of the DB Instance. <p> Passing a
     * value for this parameter causes an outage during the change and is
     * applied during the next maintenance window, unless the
     * <code>ApplyImmediately</code> parameter is specified as
     * <code>true</code> for this request. <p>Default: Uses existing setting
     * <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     * db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The new compute and memory capacity of the DB Instance. <p> Passing a
     *         value for this parameter causes an outage during the change and is
     *         applied during the next maintenance window, unless the
     *         <code>ApplyImmediately</code> parameter is specified as
     *         <code>true</code> for this request. <p>Default: Uses existing setting
     *         <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     *         db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge</code>
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
     * change is asynchronously applied as soon as possible. <p>Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @return A list of DB Security Groups to authorize on this DB Instance. This
     *         change is asynchronously applied as soon as possible. <p>Constraints:
     *         <ul> <li>Must be 1 to 255 alphanumeric characters</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public java.util.List<String> getDBSecurityGroups() {
        
        if (dBSecurityGroups == null) {
            dBSecurityGroups = new java.util.ArrayList<String>();
        }
        return dBSecurityGroups;
    }
    
    /**
     * A list of DB Security Groups to authorize on this DB Instance. This
     * change is asynchronously applied as soon as possible. <p>Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @param dBSecurityGroups A list of DB Security Groups to authorize on this DB Instance. This
     *         change is asynchronously applied as soon as possible. <p>Constraints:
     *         <ul> <li>Must be 1 to 255 alphanumeric characters</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public void setDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }

        java.util.List<String> dBSecurityGroupsCopy = new java.util.ArrayList<String>(dBSecurityGroups.size());
        dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        this.dBSecurityGroups = dBSecurityGroupsCopy;
    }
    
    /**
     * A list of DB Security Groups to authorize on this DB Instance. This
     * change is asynchronously applied as soon as possible. <p>Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of DB Security Groups to authorize on this DB Instance. This
     *         change is asynchronously applied as soon as possible. <p>Constraints:
     *         <ul> <li>Must be 1 to 255 alphanumeric characters</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withDBSecurityGroups(String... dBSecurityGroups) {
        if (getDBSecurityGroups() == null) setDBSecurityGroups(new java.util.ArrayList<String>(dBSecurityGroups.length));
        for (String value : dBSecurityGroups) {
            getDBSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of DB Security Groups to authorize on this DB Instance. This
     * change is asynchronously applied as soon as possible. <p>Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of DB Security Groups to authorize on this DB Instance. This
     *         change is asynchronously applied as soon as possible. <p>Constraints:
     *         <ul> <li>Must be 1 to 255 alphanumeric characters</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
        } else {
            java.util.List<String> dBSecurityGroupsCopy = new java.util.ArrayList<String>(dBSecurityGroups.size());
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
            this.dBSecurityGroups = dBSecurityGroupsCopy;
        }

        return this;
    }
    
    /**
     * Specifies whether or not the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for
     * the DB Instance. <p> If this parameter is passed as
     * <code>false</code>, changes to the DB Instance are applied on the next
     * call to <a>RebootDBInstance</a>, the next maintenance reboot, or the
     * next failure reboot, whichever occurs first. <p>Default:
     * <code>false</code>
     *
     * @return Specifies whether or not the modifications in this request and any
     *         pending modifications are asynchronously applied as soon as possible,
     *         regardless of the <code>PreferredMaintenanceWindow</code> setting for
     *         the DB Instance. <p> If this parameter is passed as
     *         <code>false</code>, changes to the DB Instance are applied on the next
     *         call to <a>RebootDBInstance</a>, the next maintenance reboot, or the
     *         next failure reboot, whichever occurs first. <p>Default:
     *         <code>false</code>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }
    
    /**
     * Specifies whether or not the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for
     * the DB Instance. <p> If this parameter is passed as
     * <code>false</code>, changes to the DB Instance are applied on the next
     * call to <a>RebootDBInstance</a>, the next maintenance reboot, or the
     * next failure reboot, whichever occurs first. <p>Default:
     * <code>false</code>
     *
     * @param applyImmediately Specifies whether or not the modifications in this request and any
     *         pending modifications are asynchronously applied as soon as possible,
     *         regardless of the <code>PreferredMaintenanceWindow</code> setting for
     *         the DB Instance. <p> If this parameter is passed as
     *         <code>false</code>, changes to the DB Instance are applied on the next
     *         call to <a>RebootDBInstance</a>, the next maintenance reboot, or the
     *         next failure reboot, whichever occurs first. <p>Default:
     *         <code>false</code>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }
    
    /**
     * Specifies whether or not the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for
     * the DB Instance. <p> If this parameter is passed as
     * <code>false</code>, changes to the DB Instance are applied on the next
     * call to <a>RebootDBInstance</a>, the next maintenance reboot, or the
     * next failure reboot, whichever occurs first. <p>Default:
     * <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applyImmediately Specifies whether or not the modifications in this request and any
     *         pending modifications are asynchronously applied as soon as possible,
     *         regardless of the <code>PreferredMaintenanceWindow</code> setting for
     *         the DB Instance. <p> If this parameter is passed as
     *         <code>false</code>, changes to the DB Instance are applied on the next
     *         call to <a>RebootDBInstance</a>, the next maintenance reboot, or the
     *         next failure reboot, whichever occurs first. <p>Default:
     *         <code>false</code>
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
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for
     * the DB Instance. <p> If this parameter is passed as
     * <code>false</code>, changes to the DB Instance are applied on the next
     * call to <a>RebootDBInstance</a>, the next maintenance reboot, or the
     * next failure reboot, whichever occurs first. <p>Default:
     * <code>false</code>
     *
     * @return Specifies whether or not the modifications in this request and any
     *         pending modifications are asynchronously applied as soon as possible,
     *         regardless of the <code>PreferredMaintenanceWindow</code> setting for
     *         the DB Instance. <p> If this parameter is passed as
     *         <code>false</code>, changes to the DB Instance are applied on the next
     *         call to <a>RebootDBInstance</a>, the next maintenance reboot, or the
     *         next failure reboot, whichever occurs first. <p>Default:
     *         <code>false</code>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }
    
    /**
     * The new password for the DB Instance master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <code>MasterUserPassword</code> element exists in the
     * <code>PendingModifiedValues</code> element of the operation response.
     * <p>Default: Uses existing setting <p>Constraints: Must be 4 to 41
     * alphanumeric characters (engine specific) <note> Amazon RDS APIs never
     * return the password, so this API provides a way to regain access to a
     * master instance user if the password is lost. </note>
     *
     * @return The new password for the DB Instance master user. This change is
     *         asynchronously applied as soon as possible. Between the time of the
     *         request and the completion of the request, the
     *         <code>MasterUserPassword</code> element exists in the
     *         <code>PendingModifiedValues</code> element of the operation response.
     *         <p>Default: Uses existing setting <p>Constraints: Must be 4 to 41
     *         alphanumeric characters (engine specific) <note> Amazon RDS APIs never
     *         return the password, so this API provides a way to regain access to a
     *         master instance user if the password is lost. </note>
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }
    
    /**
     * The new password for the DB Instance master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <code>MasterUserPassword</code> element exists in the
     * <code>PendingModifiedValues</code> element of the operation response.
     * <p>Default: Uses existing setting <p>Constraints: Must be 4 to 41
     * alphanumeric characters (engine specific) <note> Amazon RDS APIs never
     * return the password, so this API provides a way to regain access to a
     * master instance user if the password is lost. </note>
     *
     * @param masterUserPassword The new password for the DB Instance master user. This change is
     *         asynchronously applied as soon as possible. Between the time of the
     *         request and the completion of the request, the
     *         <code>MasterUserPassword</code> element exists in the
     *         <code>PendingModifiedValues</code> element of the operation response.
     *         <p>Default: Uses existing setting <p>Constraints: Must be 4 to 41
     *         alphanumeric characters (engine specific) <note> Amazon RDS APIs never
     *         return the password, so this API provides a way to regain access to a
     *         master instance user if the password is lost. </note>
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * The new password for the DB Instance master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <code>MasterUserPassword</code> element exists in the
     * <code>PendingModifiedValues</code> element of the operation response.
     * <p>Default: Uses existing setting <p>Constraints: Must be 4 to 41
     * alphanumeric characters (engine specific) <note> Amazon RDS APIs never
     * return the password, so this API provides a way to regain access to a
     * master instance user if the password is lost. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUserPassword The new password for the DB Instance master user. This change is
     *         asynchronously applied as soon as possible. Between the time of the
     *         request and the completion of the request, the
     *         <code>MasterUserPassword</code> element exists in the
     *         <code>PendingModifiedValues</code> element of the operation response.
     *         <p>Default: Uses existing setting <p>Constraints: Must be 4 to 41
     *         alphanumeric characters (engine specific) <note> Amazon RDS APIs never
     *         return the password, so this API provides a way to regain access to a
     *         master instance user if the password is lost. </note>
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
     * when the <i>ApplyImmediately</i> parameter is specified as
     * <code>true</code> for this request. <p>Default: Uses existing setting
     * <p>Constraints: The DB Parameter Group must be in the same DB
     * Parameter Group family as this DB Instance.
     *
     * @return The name of the DB Parameter Group to apply to this DB Instance. This
     *         change is asynchronously applied as soon as possible for parameters
     *         when the <i>ApplyImmediately</i> parameter is specified as
     *         <code>true</code> for this request. <p>Default: Uses existing setting
     *         <p>Constraints: The DB Parameter Group must be in the same DB
     *         Parameter Group family as this DB Instance.
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group to apply to this DB Instance. This
     * change is asynchronously applied as soon as possible for parameters
     * when the <i>ApplyImmediately</i> parameter is specified as
     * <code>true</code> for this request. <p>Default: Uses existing setting
     * <p>Constraints: The DB Parameter Group must be in the same DB
     * Parameter Group family as this DB Instance.
     *
     * @param dBParameterGroupName The name of the DB Parameter Group to apply to this DB Instance. This
     *         change is asynchronously applied as soon as possible for parameters
     *         when the <i>ApplyImmediately</i> parameter is specified as
     *         <code>true</code> for this request. <p>Default: Uses existing setting
     *         <p>Constraints: The DB Parameter Group must be in the same DB
     *         Parameter Group family as this DB Instance.
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group to apply to this DB Instance. This
     * change is asynchronously applied as soon as possible for parameters
     * when the <i>ApplyImmediately</i> parameter is specified as
     * <code>true</code> for this request. <p>Default: Uses existing setting
     * <p>Constraints: The DB Parameter Group must be in the same DB
     * Parameter Group family as this DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the DB Parameter Group to apply to this DB Instance. This
     *         change is asynchronously applied as soon as possible for parameters
     *         when the <i>ApplyImmediately</i> parameter is specified as
     *         <code>true</code> for this request. <p>Default: Uses existing setting
     *         <p>Constraints: The DB Parameter Group must be in the same DB
     *         Parameter Group family as this DB Instance.
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
     * disables automated backups. <p>Default: Uses existing setting
     * <p>Constraints: <ul> <li>Must be a value from 0 to 8</li> <li>Cannot
     * be set to 0 if the DB Instance is a master instance with read replicas
     * or of the DB Instance is a read replica</li> </ul>
     *
     * @return The number of days to retain automated backups. Setting this parameter
     *         to a positive number enables backups. Setting this parameter to 0
     *         disables automated backups. <p>Default: Uses existing setting
     *         <p>Constraints: <ul> <li>Must be a value from 0 to 8</li> <li>Cannot
     *         be set to 0 if the DB Instance is a master instance with read replicas
     *         or of the DB Instance is a read replica</li> </ul>
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }
    
    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups. <p>Default: Uses existing setting
     * <p>Constraints: <ul> <li>Must be a value from 0 to 8</li> <li>Cannot
     * be set to 0 if the DB Instance is a master instance with read replicas
     * or of the DB Instance is a read replica</li> </ul>
     *
     * @param backupRetentionPeriod The number of days to retain automated backups. Setting this parameter
     *         to a positive number enables backups. Setting this parameter to 0
     *         disables automated backups. <p>Default: Uses existing setting
     *         <p>Constraints: <ul> <li>Must be a value from 0 to 8</li> <li>Cannot
     *         be set to 0 if the DB Instance is a master instance with read replicas
     *         or of the DB Instance is a read replica</li> </ul>
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }
    
    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups. <p>Default: Uses existing setting
     * <p>Constraints: <ul> <li>Must be a value from 0 to 8</li> <li>Cannot
     * be set to 0 if the DB Instance is a master instance with read replicas
     * or of the DB Instance is a read replica</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backupRetentionPeriod The number of days to retain automated backups. Setting this parameter
     *         to a positive number enables backups. Setting this parameter to 0
     *         disables automated backups. <p>Default: Uses existing setting
     *         <p>Constraints: <ul> <li>Must be a value from 0 to 8</li> <li>Cannot
     *         be set to 0 if the DB Instance is a master instance with read replicas
     *         or of the DB Instance is a read replica</li> </ul>
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
     * <code>BackupRetentionPeriod</code>. <p>Constraints: <ul> <li>Must be
     * in the format hh24:mi-hh24:mi</li> <li>Times should be Universal Time
     * Coordinated (UTC)</li> <li>Must not conflict with the preferred
     * maintenance window</li> <li>Must be at least 30 minutes</li> </ul>
     *
     * @return The daily time range during which automated backups are created if
     *         automated backups are enabled, as determined by the
     *         <code>BackupRetentionPeriod</code>. <p>Constraints: <ul> <li>Must be
     *         in the format hh24:mi-hh24:mi</li> <li>Times should be Universal Time
     *         Coordinated (UTC)</li> <li>Must not conflict with the preferred
     *         maintenance window</li> <li>Must be at least 30 minutes</li> </ul>
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>. <p>Constraints: <ul> <li>Must be
     * in the format hh24:mi-hh24:mi</li> <li>Times should be Universal Time
     * Coordinated (UTC)</li> <li>Must not conflict with the preferred
     * maintenance window</li> <li>Must be at least 30 minutes</li> </ul>
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, as determined by the
     *         <code>BackupRetentionPeriod</code>. <p>Constraints: <ul> <li>Must be
     *         in the format hh24:mi-hh24:mi</li> <li>Times should be Universal Time
     *         Coordinated (UTC)</li> <li>Must not conflict with the preferred
     *         maintenance window</li> <li>Must be at least 30 minutes</li> </ul>
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>. <p>Constraints: <ul> <li>Must be
     * in the format hh24:mi-hh24:mi</li> <li>Times should be Universal Time
     * Coordinated (UTC)</li> <li>Must not conflict with the preferred
     * maintenance window</li> <li>Must be at least 30 minutes</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, as determined by the
     *         <code>BackupRetentionPeriod</code>. <p>Constraints: <ul> <li>Must be
     *         in the format hh24:mi-hh24:mi</li> <li>Times should be Universal Time
     *         Coordinated (UTC)</li> <li>Must not conflict with the preferred
     *         maintenance window</li> <li>Must be at least 30 minutes</li> </ul>
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
     * pending changes are applied. <p>Default: Uses existing setting
     * <p>Format: ddd:hh24:mi-ddd:hh24:mi <p>Valid Days: Mon | Tue | Wed |
     * Thu | Fri | Sat | Sun <p>Constraints: Must be at least 30 minutes
     *
     * @return The weekly time range (in UTC) during which system maintenance can
     *         occur, which may result in an outage. This change is made immediately.
     *         If moving this window to the current time, there must be at least 120
     *         minutes between the current time and end of the window to ensure
     *         pending changes are applied. <p>Default: Uses existing setting
     *         <p>Format: ddd:hh24:mi-ddd:hh24:mi <p>Valid Days: Mon | Tue | Wed |
     *         Thu | Fri | Sat | Sun <p>Constraints: Must be at least 30 minutes
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, which may result in an outage. This change is made immediately.
     * If moving this window to the current time, there must be at least 120
     * minutes between the current time and end of the window to ensure
     * pending changes are applied. <p>Default: Uses existing setting
     * <p>Format: ddd:hh24:mi-ddd:hh24:mi <p>Valid Days: Mon | Tue | Wed |
     * Thu | Fri | Sat | Sun <p>Constraints: Must be at least 30 minutes
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur, which may result in an outage. This change is made immediately.
     *         If moving this window to the current time, there must be at least 120
     *         minutes between the current time and end of the window to ensure
     *         pending changes are applied. <p>Default: Uses existing setting
     *         <p>Format: ddd:hh24:mi-ddd:hh24:mi <p>Valid Days: Mon | Tue | Wed |
     *         Thu | Fri | Sat | Sun <p>Constraints: Must be at least 30 minutes
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, which may result in an outage. This change is made immediately.
     * If moving this window to the current time, there must be at least 120
     * minutes between the current time and end of the window to ensure
     * pending changes are applied. <p>Default: Uses existing setting
     * <p>Format: ddd:hh24:mi-ddd:hh24:mi <p>Valid Days: Mon | Tue | Wed |
     * Thu | Fri | Sat | Sun <p>Constraints: Must be at least 30 minutes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur, which may result in an outage. This change is made immediately.
     *         If moving this window to the current time, there must be at least 120
     *         minutes between the current time and end of the window to ensure
     *         pending changes are applied. <p>Default: Uses existing setting
     *         <p>Format: ddd:hh24:mi-ddd:hh24:mi <p>Valid Days: Mon | Tue | Wed |
     *         Thu | Fri | Sat | Sun <p>Constraints: Must be at least 30 minutes
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }
    
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraints:
     * Cannot be specified if the DB Instance is a read replica.
     *
     * @return Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraints:
     *         Cannot be specified if the DB Instance is a read replica.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraints:
     * Cannot be specified if the DB Instance is a read replica.
     *
     * @param multiAZ Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraints:
     *         Cannot be specified if the DB Instance is a read replica.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraints:
     * Cannot be specified if the DB Instance is a read replica.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraints:
     *         Cannot be specified if the DB Instance is a read replica.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }
    
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraints:
     * Cannot be specified if the DB Instance is a read replica.
     *
     * @return Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraints:
     *         Cannot be specified if the DB Instance is a read replica.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }
    
    /**
     * The version number of the database engine to upgrade to. <p> For major
     * version upgrades, if a nondefault DB Parameter Group is currently in
     * use, a new DB Parameter Group in the DB Parameter Group Family for the
     * new engine version must be specified. The new DB Parameter Group can
     * be the default for that DB Parameter Group Family. <p>Example:
     * <code>5.1.42</code>
     *
     * @return The version number of the database engine to upgrade to. <p> For major
     *         version upgrades, if a nondefault DB Parameter Group is currently in
     *         use, a new DB Parameter Group in the DB Parameter Group Family for the
     *         new engine version must be specified. The new DB Parameter Group can
     *         be the default for that DB Parameter Group Family. <p>Example:
     *         <code>5.1.42</code>
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version number of the database engine to upgrade to. <p> For major
     * version upgrades, if a nondefault DB Parameter Group is currently in
     * use, a new DB Parameter Group in the DB Parameter Group Family for the
     * new engine version must be specified. The new DB Parameter Group can
     * be the default for that DB Parameter Group Family. <p>Example:
     * <code>5.1.42</code>
     *
     * @param engineVersion The version number of the database engine to upgrade to. <p> For major
     *         version upgrades, if a nondefault DB Parameter Group is currently in
     *         use, a new DB Parameter Group in the DB Parameter Group Family for the
     *         new engine version must be specified. The new DB Parameter Group can
     *         be the default for that DB Parameter Group Family. <p>Example:
     *         <code>5.1.42</code>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version number of the database engine to upgrade to. <p> For major
     * version upgrades, if a nondefault DB Parameter Group is currently in
     * use, a new DB Parameter Group in the DB Parameter Group Family for the
     * new engine version must be specified. The new DB Parameter Group can
     * be the default for that DB Parameter Group Family. <p>Example:
     * <code>5.1.42</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version number of the database engine to upgrade to. <p> For major
     *         version upgrades, if a nondefault DB Parameter Group is currently in
     *         use, a new DB Parameter Group in the DB Parameter Group Family for the
     *         new engine version must be specified. The new DB Parameter Group can
     *         be the default for that DB Parameter Group Family. <p>Example:
     *         <code>5.1.42</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    
    
    /**
     * Indicates that major version upgrades are allowed. <p>Constraints:
     * This parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB
     * Instance's current version.
     *
     * @return Indicates that major version upgrades are allowed. <p>Constraints:
     *         This parameter must be set to true when specifying a value for the
     *         EngineVersion parameter that is a different major version than the DB
     *         Instance's current version.
     */
    public Boolean isAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }
    
    /**
     * Indicates that major version upgrades are allowed. <p>Constraints:
     * This parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB
     * Instance's current version.
     *
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed. <p>Constraints:
     *         This parameter must be set to true when specifying a value for the
     *         EngineVersion parameter that is a different major version than the DB
     *         Instance's current version.
     */
    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }
    
    /**
     * Indicates that major version upgrades are allowed. <p>Constraints:
     * This parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB
     * Instance's current version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed. <p>Constraints:
     *         This parameter must be set to true when specifying a value for the
     *         EngineVersion parameter that is a different major version than the DB
     *         Instance's current version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
        return this;
    }
    
    
    /**
     * Indicates that major version upgrades are allowed. <p>Constraints:
     * This parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB
     * Instance's current version.
     *
     * @return Indicates that major version upgrades are allowed. <p>Constraints:
     *         This parameter must be set to true when specifying a value for the
     *         EngineVersion parameter that is a different major version than the DB
     *         Instance's current version.
     */
    public Boolean getAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     *
     * @return Indicates that minor version upgrades will be applied automatically to
     *         the DB Instance during the maintenance window.
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version upgrades will be applied automatically to
     *         the DB Instance during the maintenance window.
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version upgrades will be applied automatically to
     *         the DB Instance during the maintenance window.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }
    
    
    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     *
     * @return Indicates that minor version upgrades will be applied automatically to
     *         the DB Instance during the maintenance window.
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
        if (dBInstanceIdentifier != null) sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        if (allocatedStorage != null) sb.append("AllocatedStorage: " + allocatedStorage + ", ");
        if (dBInstanceClass != null) sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        if (dBSecurityGroups != null) sb.append("DBSecurityGroups: " + dBSecurityGroups + ", ");
        if (applyImmediately != null) sb.append("ApplyImmediately: " + applyImmediately + ", ");
        if (masterUserPassword != null) sb.append("MasterUserPassword: " + masterUserPassword + ", ");
        if (dBParameterGroupName != null) sb.append("DBParameterGroupName: " + dBParameterGroupName + ", ");
        if (backupRetentionPeriod != null) sb.append("BackupRetentionPeriod: " + backupRetentionPeriod + ", ");
        if (preferredBackupWindow != null) sb.append("PreferredBackupWindow: " + preferredBackupWindow + ", ");
        if (preferredMaintenanceWindow != null) sb.append("PreferredMaintenanceWindow: " + preferredMaintenanceWindow + ", ");
        if (multiAZ != null) sb.append("MultiAZ: " + multiAZ + ", ");
        if (engineVersion != null) sb.append("EngineVersion: " + engineVersion + ", ");
        if (allowMajorVersionUpgrade != null) sb.append("AllowMajorVersionUpgrade: " + allowMajorVersionUpgrade + ", ");
        if (autoMinorVersionUpgrade != null) sb.append("AutoMinorVersionUpgrade: " + autoMinorVersionUpgrade + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroups() == null) ? 0 : getDBSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((isApplyImmediately() == null) ? 0 : isApplyImmediately().hashCode()); 
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode()); 
        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((isMultiAZ() == null) ? 0 : isMultiAZ().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((isAllowMajorVersionUpgrade() == null) ? 0 : isAllowMajorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ModifyDBInstanceRequest == false) return false;
        ModifyDBInstanceRequest other = (ModifyDBInstanceRequest)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null) return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null) return false;
        if (other.getDBSecurityGroups() != null && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false) return false; 
        if (other.isApplyImmediately() == null ^ this.isApplyImmediately() == null) return false;
        if (other.isApplyImmediately() != null && other.isApplyImmediately().equals(this.isApplyImmediately()) == false) return false; 
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null) return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false) return false; 
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null) return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false) return false; 
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null) return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false) return false; 
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null) return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.isMultiAZ() == null ^ this.isMultiAZ() == null) return false;
        if (other.isMultiAZ() != null && other.isMultiAZ().equals(this.isMultiAZ()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.isAllowMajorVersionUpgrade() == null ^ this.isAllowMajorVersionUpgrade() == null) return false;
        if (other.isAllowMajorVersionUpgrade() != null && other.isAllowMajorVersionUpgrade().equals(this.isAllowMajorVersionUpgrade()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        return true;
    }
    
}
    