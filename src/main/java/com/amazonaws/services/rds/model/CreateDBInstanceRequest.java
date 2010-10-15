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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBInstance(CreateDBInstanceRequest) CreateDBInstance operation}.
 * <p>
 * This API creates a new DB instance.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBInstance(CreateDBInstanceRequest)
 */
public class CreateDBInstanceRequest extends AmazonWebServiceRequest {

    /**
     * The name of the database to create when the DB Instance is created. If
     * this parameter is not specified, no database is created in the DB
     * Instance.
     */
    private String dBName;

    /**
     * The DB Instance identifier. This parameter is stored as a lowercase
     * string.
     */
    private String dBInstanceIdentifier;

    /**
     * The amount of storage (in gigabytes) to be initially allocated for the
     * database instance.
     */
    private Integer allocatedStorage;

    /**
     * The compute and memory capacity of the DB Instance.
     */
    private String dBInstanceClass;

    /**
     * The name of the database engine to be used for this instance.
     */
    private String engine;

    /**
     * The name of master user for the client DB Instance.
     */
    private String masterUsername;

    /**
     * The password for the master DB Instance user.
     */
    private String masterUserPassword;

    /**
     * A list of DB Security Groups to associate with this DB Instance.
     */
    private java.util.List<String> dBSecurityGroups;

    /**
     * The EC2 Availability Zone that the database instance will be created
     * in.
     */
    private String availabilityZone;

    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur.
     */
    private String preferredMaintenanceWindow;

    /**
     * The name of the database parameter group to associate with this DB
     * instance. If this argument is omitted, the default DBParameterGroup
     * for the specified engine will be used.
     */
    private String dBParameterGroupName;

    /**
     * The number of days for which automated backups are retained. Setting
     * this parameter to a positive number enables backups. Setting this
     * parameter to 0 disables automated backups.
     */
    private Integer backupRetentionPeriod;

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, as determined by the
     * <i>BackupRetentionPeriod</i>.
     */
    private String preferredBackupWindow;

    /**
     * The port number on which the database accepts connections.
     */
    private Integer port;

    /**
     * Specifies if the DB Instance is a Multi-AZ deployment.
     */
    private Boolean multiAZ;

    /**
     * The version number of the database engine to use.
     */
    private String engineVersion;

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * Default constructor for a new CreateDBInstanceRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDBInstanceRequest() {}
    
    /**
     * Constructs a new CreateDBInstanceRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBInstanceIdentifier The DB Instance identifier. This parameter
     * is stored as a lowercase string.
     * @param allocatedStorage The amount of storage (in gigabytes) to be
     * initially allocated for the database instance.
     * @param dBInstanceClass The compute and memory capacity of the DB
     * Instance.
     * @param engine The name of the database engine to be used for this
     * instance.
     * @param masterUsername The name of master user for the client DB
     * Instance.
     * @param masterUserPassword The password for the master DB Instance
     * user.
     */
    public CreateDBInstanceRequest(String dBInstanceIdentifier, Integer allocatedStorage, String dBInstanceClass, String engine, String masterUsername, String masterUserPassword) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        this.allocatedStorage = allocatedStorage;
        this.dBInstanceClass = dBInstanceClass;
        this.engine = engine;
        this.masterUsername = masterUsername;
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * The name of the database to create when the DB Instance is created. If
     * this parameter is not specified, no database is created in the DB
     * Instance.
     *
     * @return The name of the database to create when the DB Instance is created. If
     *         this parameter is not specified, no database is created in the DB
     *         Instance.
     */
    public String getDBName() {
        return dBName;
    }
    
    /**
     * The name of the database to create when the DB Instance is created. If
     * this parameter is not specified, no database is created in the DB
     * Instance.
     *
     * @param dBName The name of the database to create when the DB Instance is created. If
     *         this parameter is not specified, no database is created in the DB
     *         Instance.
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }
    
    /**
     * The name of the database to create when the DB Instance is created. If
     * this parameter is not specified, no database is created in the DB
     * Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBName The name of the database to create when the DB Instance is created. If
     *         this parameter is not specified, no database is created in the DB
     *         Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }
    
    
    /**
     * The DB Instance identifier. This parameter is stored as a lowercase
     * string.
     *
     * @return The DB Instance identifier. This parameter is stored as a lowercase
     *         string.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This parameter is stored as a lowercase
     * string.
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This parameter is stored as a lowercase
     *         string.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This parameter is stored as a lowercase
     * string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This parameter is stored as a lowercase
     *         string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * The amount of storage (in gigabytes) to be initially allocated for the
     * database instance.
     *
     * @return The amount of storage (in gigabytes) to be initially allocated for the
     *         database instance.
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }
    
    /**
     * The amount of storage (in gigabytes) to be initially allocated for the
     * database instance.
     *
     * @param allocatedStorage The amount of storage (in gigabytes) to be initially allocated for the
     *         database instance.
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }
    
    /**
     * The amount of storage (in gigabytes) to be initially allocated for the
     * database instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocatedStorage The amount of storage (in gigabytes) to be initially allocated for the
     *         database instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }
    
    
    /**
     * The compute and memory capacity of the DB Instance.
     *
     * @return The compute and memory capacity of the DB Instance.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the DB Instance.
     *
     * @param dBInstanceClass The compute and memory capacity of the DB Instance.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The compute and memory capacity of the DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }
    
    
    /**
     * The name of the database engine to be used for this instance.
     *
     * @return The name of the database engine to be used for this instance.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The name of the database engine to be used for this instance.
     *
     * @param engine The name of the database engine to be used for this instance.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The name of the database engine to be used for this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The name of the database engine to be used for this instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }
    
    
    /**
     * The name of master user for the client DB Instance.
     *
     * @return The name of master user for the client DB Instance.
     */
    public String getMasterUsername() {
        return masterUsername;
    }
    
    /**
     * The name of master user for the client DB Instance.
     *
     * @param masterUsername The name of master user for the client DB Instance.
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }
    
    /**
     * The name of master user for the client DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUsername The name of master user for the client DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }
    
    
    /**
     * The password for the master DB Instance user.
     *
     * @return The password for the master DB Instance user.
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }
    
    /**
     * The password for the master DB Instance user.
     *
     * @param masterUserPassword The password for the master DB Instance user.
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * The password for the master DB Instance user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUserPassword The password for the master DB Instance user.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }
    
    
    /**
     * A list of DB Security Groups to associate with this DB Instance.
     *
     * @return A list of DB Security Groups to associate with this DB Instance.
     */
    public java.util.List<String> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
            dBSecurityGroups = new java.util.ArrayList<String>();
        }
        return dBSecurityGroups;
    }
    
    /**
     * A list of DB Security Groups to associate with this DB Instance.
     *
     * @param dBSecurityGroups A list of DB Security Groups to associate with this DB Instance.
     */
    public void setDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        java.util.List<String> dBSecurityGroupsCopy = new java.util.ArrayList<String>();
        if (dBSecurityGroups != null) {
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        }
        this.dBSecurityGroups = dBSecurityGroupsCopy;
    }
    
    /**
     * A list of DB Security Groups to associate with this DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of DB Security Groups to associate with this DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withDBSecurityGroups(String... dBSecurityGroups) {
        for (String value : dBSecurityGroups) {
            getDBSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of DB Security Groups to associate with this DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of DB Security Groups to associate with this DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        java.util.List<String> dBSecurityGroupsCopy = new java.util.ArrayList<String>();
        if (dBSecurityGroups != null) {
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        }
        this.dBSecurityGroups = dBSecurityGroupsCopy;

        return this;
    }
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in.
     *
     * @return The EC2 Availability Zone that the database instance will be created
     *         in.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in.
     *
     * @param availabilityZone The EC2 Availability Zone that the database instance will be created
     *         in.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The EC2 Availability Zone that the database instance will be created
     *         in.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur.
     *
     * @return The weekly time range (in UTC) during which system maintenance can
     *         occur.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }
    
    
    /**
     * The name of the database parameter group to associate with this DB
     * instance. If this argument is omitted, the default DBParameterGroup
     * for the specified engine will be used.
     *
     * @return The name of the database parameter group to associate with this DB
     *         instance. If this argument is omitted, the default DBParameterGroup
     *         for the specified engine will be used.
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the database parameter group to associate with this DB
     * instance. If this argument is omitted, the default DBParameterGroup
     * for the specified engine will be used.
     *
     * @param dBParameterGroupName The name of the database parameter group to associate with this DB
     *         instance. If this argument is omitted, the default DBParameterGroup
     *         for the specified engine will be used.
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the database parameter group to associate with this DB
     * instance. If this argument is omitted, the default DBParameterGroup
     * for the specified engine will be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the database parameter group to associate with this DB
     *         instance. If this argument is omitted, the default DBParameterGroup
     *         for the specified engine will be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }
    
    
    /**
     * The number of days for which automated backups are retained. Setting
     * this parameter to a positive number enables backups. Setting this
     * parameter to 0 disables automated backups.
     *
     * @return The number of days for which automated backups are retained. Setting
     *         this parameter to a positive number enables backups. Setting this
     *         parameter to 0 disables automated backups.
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }
    
    /**
     * The number of days for which automated backups are retained. Setting
     * this parameter to a positive number enables backups. Setting this
     * parameter to 0 disables automated backups.
     *
     * @param backupRetentionPeriod The number of days for which automated backups are retained. Setting
     *         this parameter to a positive number enables backups. Setting this
     *         parameter to 0 disables automated backups.
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }
    
    /**
     * The number of days for which automated backups are retained. Setting
     * this parameter to a positive number enables backups. Setting this
     * parameter to 0 disables automated backups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backupRetentionPeriod The number of days for which automated backups are retained. Setting
     *         this parameter to a positive number enables backups. Setting this
     *         parameter to 0 disables automated backups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
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
    public CreateDBInstanceRequest withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }
    
    
    /**
     * The port number on which the database accepts connections.
     *
     * @return The port number on which the database accepts connections.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the database accepts connections.
     *
     * @param port The port number on which the database accepts connections.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the database accepts connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the database accepts connections.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withPort(Integer port) {
        this.port = port;
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
    public CreateDBInstanceRequest withMultiAZ(Boolean multiAZ) {
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
     * The version number of the database engine to use.
     *
     * @return The version number of the database engine to use.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version number of the database engine to use.
     *
     * @param engineVersion The version number of the database engine to use.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version number of the database engine to use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version number of the database engine to use.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the DB Instance during the maintenance window.
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the DB Instance during the maintenance window.
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the DB Instance during the maintenance window.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }
    
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
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
        sb.append("DBName: " + dBName + ", ");
        sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        sb.append("AllocatedStorage: " + allocatedStorage + ", ");
        sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        sb.append("Engine: " + engine + ", ");
        sb.append("MasterUsername: " + masterUsername + ", ");
        sb.append("MasterUserPassword: " + masterUserPassword + ", ");
        sb.append("DBSecurityGroups: " + dBSecurityGroups + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("PreferredMaintenanceWindow: " + preferredMaintenanceWindow + ", ");
        sb.append("DBParameterGroupName: " + dBParameterGroupName + ", ");
        sb.append("BackupRetentionPeriod: " + backupRetentionPeriod + ", ");
        sb.append("PreferredBackupWindow: " + preferredBackupWindow + ", ");
        sb.append("Port: " + port + ", ");
        sb.append("MultiAZ: " + multiAZ + ", ");
        sb.append("EngineVersion: " + engineVersion + ", ");
        sb.append("AutoMinorVersionUpgrade: " + autoMinorVersionUpgrade + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    