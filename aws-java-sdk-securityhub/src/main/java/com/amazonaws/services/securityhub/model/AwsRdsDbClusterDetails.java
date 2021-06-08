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
 * Information about an Amazon RDS DB cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbClusterDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbClusterDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For all database engines except Aurora, specifies the allocated storage size in gibibytes (GiB).
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * The number of days for which automated backups are retained.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The name of the database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The current status of this DB cluster.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The connection endpoint for the primary instance of the DB cluster.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The reader endpoint for the DB cluster.
     * </p>
     */
    private String readerEndpoint;
    /**
     * <p>
     * A list of custom endpoints for the DB cluster.
     * </p>
     */
    private java.util.List<String> customEndpoints;
    /**
     * <p>
     * Whether the DB cluster has instances in multiple Availability Zones.
     * </p>
     */
    private Boolean multiAz;
    /**
     * <p>
     * The name of the database engine to use for this DB cluster.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The port number on which the DB instances in the DB cluster accept connections.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The range of time each day when automated backups are created, if automated backups are enabled.
     * </p>
     * <p>
     * Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     * </p>
     * <p>
     * For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|<code>fri</code>|
     * <code>sat</code>|<code>sun</code>.
     * </p>
     * <p>
     * For example, <code>sun:09:32-sun:10:02</code>.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The identifiers of the read replicas that are associated with this DB cluster.
     * </p>
     */
    private java.util.List<String> readReplicaIdentifiers;
    /**
     * <p>
     * A list of VPC security groups that the DB cluster belongs to.
     * </p>
     */
    private java.util.List<AwsRdsDbInstanceVpcSecurityGroup> vpcSecurityGroups;
    /**
     * <p>
     * Specifies the identifier that Amazon Route 53 assigns when you create a hosted zone.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * Whether the DB cluster is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The identifier of the DB cluster. The identifier must be unique within each AWS Region and is immutable.
     * </p>
     */
    private String dbClusterResourceId;
    /**
     * <p>
     * A list of the IAM roles that are associated with the DB cluster.
     * </p>
     */
    private java.util.List<AwsRdsDbClusterAssociatedRole> associatedRoles;
    /**
     * <p>
     * Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String clusterCreateTime;
    /**
     * <p>
     * A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     * </p>
     */
    private java.util.List<String> enabledCloudWatchLogsExports;
    /**
     * <p>
     * The database engine mode of the DB cluster.
     * </p>
     */
    private String engineMode;
    /**
     * <p>
     * Whether the DB cluster has deletion protection enabled.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * Whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     * </p>
     */
    private Boolean httpEndpointEnabled;
    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     */
    private String activityStreamStatus;
    /**
     * <p>
     * Whether tags are copied from the DB cluster to snapshots of the DB cluster.
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * Whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     * </p>
     */
    private Boolean crossAccountClone;
    /**
     * <p>
     * The Active Directory domain membership records that are associated with the DB cluster.
     * </p>
     */
    private java.util.List<AwsRdsDbDomainMembership> domainMemberships;
    /**
     * <p>
     * The name of the DB cluster parameter group for the DB cluster.
     * </p>
     */
    private String dbClusterParameterGroup;
    /**
     * <p>
     * The subnet group that is associated with the DB cluster, including the name, description, and subnets in the
     * subnet group.
     * </p>
     */
    private String dbSubnetGroup;
    /**
     * <p>
     * The list of option group memberships for this DB cluster.
     * </p>
     */
    private java.util.List<AwsRdsDbClusterOptionGroupMembership> dbClusterOptionGroupMemberships;
    /**
     * <p>
     * The DB cluster identifier that the user assigned to the cluster. This identifier is the unique key that
     * identifies a DB cluster.
     * </p>
     */
    private String dbClusterIdentifier;
    /**
     * <p>
     * The list of instances that make up the DB cluster.
     * </p>
     */
    private java.util.List<AwsRdsDbClusterMember> dbClusterMembers;
    /**
     * <p>
     * Whether the mapping of IAM accounts to database accounts is enabled.
     * </p>
     */
    private Boolean iamDatabaseAuthenticationEnabled;

    /**
     * <p>
     * For all database engines except Aurora, specifies the allocated storage size in gibibytes (GiB).
     * </p>
     * 
     * @param allocatedStorage
     *        For all database engines except Aurora, specifies the allocated storage size in gibibytes (GiB).
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * For all database engines except Aurora, specifies the allocated storage size in gibibytes (GiB).
     * </p>
     * 
     * @return For all database engines except Aurora, specifies the allocated storage size in gibibytes (GiB).
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * For all database engines except Aurora, specifies the allocated storage size in gibibytes (GiB).
     * </p>
     * 
     * @param allocatedStorage
     *        For all database engines except Aurora, specifies the allocated storage size in gibibytes (GiB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * </p>
     * 
     * @return A list of Availability Zones (AZs) where instances in the DB cluster can be created.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones (AZs) where instances in the DB cluster can be created.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones (AZs) where instances in the DB cluster can be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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

    public AwsRdsDbClusterDetails withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param databaseName
     *        The name of the database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @return The name of the database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param databaseName
     *        The name of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The current status of this DB cluster.
     * </p>
     * 
     * @param status
     *        The current status of this DB cluster.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of this DB cluster.
     * </p>
     * 
     * @return The current status of this DB cluster.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of this DB cluster.
     * </p>
     * 
     * @param status
     *        The current status of this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The connection endpoint for the primary instance of the DB cluster.
     * </p>
     * 
     * @param endpoint
     *        The connection endpoint for the primary instance of the DB cluster.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The connection endpoint for the primary instance of the DB cluster.
     * </p>
     * 
     * @return The connection endpoint for the primary instance of the DB cluster.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The connection endpoint for the primary instance of the DB cluster.
     * </p>
     * 
     * @param endpoint
     *        The connection endpoint for the primary instance of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The reader endpoint for the DB cluster.
     * </p>
     * 
     * @param readerEndpoint
     *        The reader endpoint for the DB cluster.
     */

    public void setReaderEndpoint(String readerEndpoint) {
        this.readerEndpoint = readerEndpoint;
    }

    /**
     * <p>
     * The reader endpoint for the DB cluster.
     * </p>
     * 
     * @return The reader endpoint for the DB cluster.
     */

    public String getReaderEndpoint() {
        return this.readerEndpoint;
    }

    /**
     * <p>
     * The reader endpoint for the DB cluster.
     * </p>
     * 
     * @param readerEndpoint
     *        The reader endpoint for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withReaderEndpoint(String readerEndpoint) {
        setReaderEndpoint(readerEndpoint);
        return this;
    }

    /**
     * <p>
     * A list of custom endpoints for the DB cluster.
     * </p>
     * 
     * @return A list of custom endpoints for the DB cluster.
     */

    public java.util.List<String> getCustomEndpoints() {
        return customEndpoints;
    }

    /**
     * <p>
     * A list of custom endpoints for the DB cluster.
     * </p>
     * 
     * @param customEndpoints
     *        A list of custom endpoints for the DB cluster.
     */

    public void setCustomEndpoints(java.util.Collection<String> customEndpoints) {
        if (customEndpoints == null) {
            this.customEndpoints = null;
            return;
        }

        this.customEndpoints = new java.util.ArrayList<String>(customEndpoints);
    }

    /**
     * <p>
     * A list of custom endpoints for the DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomEndpoints(java.util.Collection)} or {@link #withCustomEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param customEndpoints
     *        A list of custom endpoints for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withCustomEndpoints(String... customEndpoints) {
        if (this.customEndpoints == null) {
            setCustomEndpoints(new java.util.ArrayList<String>(customEndpoints.length));
        }
        for (String ele : customEndpoints) {
            this.customEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of custom endpoints for the DB cluster.
     * </p>
     * 
     * @param customEndpoints
     *        A list of custom endpoints for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withCustomEndpoints(java.util.Collection<String> customEndpoints) {
        setCustomEndpoints(customEndpoints);
        return this;
    }

    /**
     * <p>
     * Whether the DB cluster has instances in multiple Availability Zones.
     * </p>
     * 
     * @param multiAz
     *        Whether the DB cluster has instances in multiple Availability Zones.
     */

    public void setMultiAz(Boolean multiAz) {
        this.multiAz = multiAz;
    }

    /**
     * <p>
     * Whether the DB cluster has instances in multiple Availability Zones.
     * </p>
     * 
     * @return Whether the DB cluster has instances in multiple Availability Zones.
     */

    public Boolean getMultiAz() {
        return this.multiAz;
    }

    /**
     * <p>
     * Whether the DB cluster has instances in multiple Availability Zones.
     * </p>
     * 
     * @param multiAz
     *        Whether the DB cluster has instances in multiple Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withMultiAz(Boolean multiAz) {
        setMultiAz(multiAz);
        return this;
    }

    /**
     * <p>
     * Whether the DB cluster has instances in multiple Availability Zones.
     * </p>
     * 
     * @return Whether the DB cluster has instances in multiple Availability Zones.
     */

    public Boolean isMultiAz() {
        return this.multiAz;
    }

    /**
     * <p>
     * The name of the database engine to use for this DB cluster.
     * </p>
     * 
     * @param engine
     *        The name of the database engine to use for this DB cluster.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to use for this DB cluster.
     * </p>
     * 
     * @return The name of the database engine to use for this DB cluster.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine to use for this DB cluster.
     * </p>
     * 
     * @param engine
     *        The name of the database engine to use for this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * 
     * @return The version number of the database engine to use.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The port number on which the DB instances in the DB cluster accept connections.
     * </p>
     * 
     * @param port
     *        The port number on which the DB instances in the DB cluster accept connections.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the DB instances in the DB cluster accept connections.
     * </p>
     * 
     * @return The port number on which the DB instances in the DB cluster accept connections.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the DB instances in the DB cluster accept connections.
     * </p>
     * 
     * @param port
     *        The port number on which the DB instances in the DB cluster accept connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * 
     * @param masterUsername
     *        The name of the master user for the DB cluster.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * 
     * @return The name of the master user for the DB cluster.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * 
     * @param masterUsername
     *        The name of the master user for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The range of time each day when automated backups are created, if automated backups are enabled.
     * </p>
     * <p>
     * Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        The range of time each day when automated backups are created, if automated backups are enabled.</p>
     *        <p>
     *        Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The range of time each day when automated backups are created, if automated backups are enabled.
     * </p>
     * <p>
     * Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     * </p>
     * 
     * @return The range of time each day when automated backups are created, if automated backups are enabled.</p>
     *         <p>
     *         Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The range of time each day when automated backups are created, if automated backups are enabled.
     * </p>
     * <p>
     * Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        The range of time each day when automated backups are created, if automated backups are enabled.</p>
     *        <p>
     *        Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     * </p>
     * <p>
     * For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|<code>fri</code>|
     * <code>sat</code>|<code>sun</code>.
     * </p>
     * <p>
     * For example, <code>sun:09:32-sun:10:02</code>.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     *        </p>
     *        <p>
     *        For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|
     *        <code>fri</code>|<code>sat</code>|<code>sun</code>.
     *        </p>
     *        <p>
     *        For example, <code>sun:09:32-sun:10:02</code>.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     * </p>
     * <p>
     * For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|<code>fri</code>|
     * <code>sat</code>|<code>sun</code>.
     * </p>
     * <p>
     * For example, <code>sun:09:32-sun:10:02</code>.
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *         <p>
     *         Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     *         </p>
     *         <p>
     *         For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|
     *         <code>fri</code>|<code>sat</code>|<code>sun</code>.
     *         </p>
     *         <p>
     *         For example, <code>sun:09:32-sun:10:02</code>.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     * </p>
     * <p>
     * For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|<code>fri</code>|
     * <code>sat</code>|<code>sun</code>.
     * </p>
     * <p>
     * For example, <code>sun:09:32-sun:10:02</code>.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     *        </p>
     *        <p>
     *        For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|
     *        <code>fri</code>|<code>sat</code>|<code>sun</code>.
     *        </p>
     *        <p>
     *        For example, <code>sun:09:32-sun:10:02</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The identifiers of the read replicas that are associated with this DB cluster.
     * </p>
     * 
     * @return The identifiers of the read replicas that are associated with this DB cluster.
     */

    public java.util.List<String> getReadReplicaIdentifiers() {
        return readReplicaIdentifiers;
    }

    /**
     * <p>
     * The identifiers of the read replicas that are associated with this DB cluster.
     * </p>
     * 
     * @param readReplicaIdentifiers
     *        The identifiers of the read replicas that are associated with this DB cluster.
     */

    public void setReadReplicaIdentifiers(java.util.Collection<String> readReplicaIdentifiers) {
        if (readReplicaIdentifiers == null) {
            this.readReplicaIdentifiers = null;
            return;
        }

        this.readReplicaIdentifiers = new java.util.ArrayList<String>(readReplicaIdentifiers);
    }

    /**
     * <p>
     * The identifiers of the read replicas that are associated with this DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadReplicaIdentifiers(java.util.Collection)} or
     * {@link #withReadReplicaIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param readReplicaIdentifiers
     *        The identifiers of the read replicas that are associated with this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withReadReplicaIdentifiers(String... readReplicaIdentifiers) {
        if (this.readReplicaIdentifiers == null) {
            setReadReplicaIdentifiers(new java.util.ArrayList<String>(readReplicaIdentifiers.length));
        }
        for (String ele : readReplicaIdentifiers) {
            this.readReplicaIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the read replicas that are associated with this DB cluster.
     * </p>
     * 
     * @param readReplicaIdentifiers
     *        The identifiers of the read replicas that are associated with this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withReadReplicaIdentifiers(java.util.Collection<String> readReplicaIdentifiers) {
        setReadReplicaIdentifiers(readReplicaIdentifiers);
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB cluster belongs to.
     * </p>
     * 
     * @return A list of VPC security groups that the DB cluster belongs to.
     */

    public java.util.List<AwsRdsDbInstanceVpcSecurityGroup> getVpcSecurityGroups() {
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB cluster belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        A list of VPC security groups that the DB cluster belongs to.
     */

    public void setVpcSecurityGroups(java.util.Collection<AwsRdsDbInstanceVpcSecurityGroup> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new java.util.ArrayList<AwsRdsDbInstanceVpcSecurityGroup>(vpcSecurityGroups);
    }

    /**
     * <p>
     * A list of VPC security groups that the DB cluster belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroups(java.util.Collection)} or {@link #withVpcSecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        A list of VPC security groups that the DB cluster belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withVpcSecurityGroups(AwsRdsDbInstanceVpcSecurityGroup... vpcSecurityGroups) {
        if (this.vpcSecurityGroups == null) {
            setVpcSecurityGroups(new java.util.ArrayList<AwsRdsDbInstanceVpcSecurityGroup>(vpcSecurityGroups.length));
        }
        for (AwsRdsDbInstanceVpcSecurityGroup ele : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB cluster belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        A list of VPC security groups that the DB cluster belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withVpcSecurityGroups(java.util.Collection<AwsRdsDbInstanceVpcSecurityGroup> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Specifies the identifier that Amazon Route 53 assigns when you create a hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        Specifies the identifier that Amazon Route 53 assigns when you create a hosted zone.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * Specifies the identifier that Amazon Route 53 assigns when you create a hosted zone.
     * </p>
     * 
     * @return Specifies the identifier that Amazon Route 53 assigns when you create a hosted zone.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * Specifies the identifier that Amazon Route 53 assigns when you create a hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        Specifies the identifier that Amazon Route 53 assigns when you create a hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * Whether the DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Whether the DB cluster is encrypted.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Whether the DB cluster is encrypted.
     * </p>
     * 
     * @return Whether the DB cluster is encrypted.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Whether the DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Whether the DB cluster is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Whether the DB cluster is encrypted.
     * </p>
     * 
     * @return Whether the DB cluster is encrypted.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     * </p>
     * 
     * @return The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The identifier of the DB cluster. The identifier must be unique within each AWS Region and is immutable.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The identifier of the DB cluster. The identifier must be unique within each AWS Region and is immutable.
     */

    public void setDbClusterResourceId(String dbClusterResourceId) {
        this.dbClusterResourceId = dbClusterResourceId;
    }

    /**
     * <p>
     * The identifier of the DB cluster. The identifier must be unique within each AWS Region and is immutable.
     * </p>
     * 
     * @return The identifier of the DB cluster. The identifier must be unique within each AWS Region and is immutable.
     */

    public String getDbClusterResourceId() {
        return this.dbClusterResourceId;
    }

    /**
     * <p>
     * The identifier of the DB cluster. The identifier must be unique within each AWS Region and is immutable.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The identifier of the DB cluster. The identifier must be unique within each AWS Region and is immutable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withDbClusterResourceId(String dbClusterResourceId) {
        setDbClusterResourceId(dbClusterResourceId);
        return this;
    }

    /**
     * <p>
     * A list of the IAM roles that are associated with the DB cluster.
     * </p>
     * 
     * @return A list of the IAM roles that are associated with the DB cluster.
     */

    public java.util.List<AwsRdsDbClusterAssociatedRole> getAssociatedRoles() {
        return associatedRoles;
    }

    /**
     * <p>
     * A list of the IAM roles that are associated with the DB cluster.
     * </p>
     * 
     * @param associatedRoles
     *        A list of the IAM roles that are associated with the DB cluster.
     */

    public void setAssociatedRoles(java.util.Collection<AwsRdsDbClusterAssociatedRole> associatedRoles) {
        if (associatedRoles == null) {
            this.associatedRoles = null;
            return;
        }

        this.associatedRoles = new java.util.ArrayList<AwsRdsDbClusterAssociatedRole>(associatedRoles);
    }

    /**
     * <p>
     * A list of the IAM roles that are associated with the DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedRoles(java.util.Collection)} or {@link #withAssociatedRoles(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param associatedRoles
     *        A list of the IAM roles that are associated with the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withAssociatedRoles(AwsRdsDbClusterAssociatedRole... associatedRoles) {
        if (this.associatedRoles == null) {
            setAssociatedRoles(new java.util.ArrayList<AwsRdsDbClusterAssociatedRole>(associatedRoles.length));
        }
        for (AwsRdsDbClusterAssociatedRole ele : associatedRoles) {
            this.associatedRoles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the IAM roles that are associated with the DB cluster.
     * </p>
     * 
     * @param associatedRoles
     *        A list of the IAM roles that are associated with the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withAssociatedRoles(java.util.Collection<AwsRdsDbClusterAssociatedRole> associatedRoles) {
        setAssociatedRoles(associatedRoles);
        return this;
    }

    /**
     * <p>
     * Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param clusterCreateTime
     *        Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setClusterCreateTime(String clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }

    /**
     * <p>
     * Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getClusterCreateTime() {
        return this.clusterCreateTime;
    }

    /**
     * <p>
     * Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param clusterCreateTime
     *        Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withClusterCreateTime(String clusterCreateTime) {
        setClusterCreateTime(clusterCreateTime);
        return this;
    }

    /**
     * <p>
     * A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     * </p>
     * 
     * @return A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     */

    public java.util.List<String> getEnabledCloudWatchLogsExports() {
        return enabledCloudWatchLogsExports;
    }

    /**
     * <p>
     * A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     * </p>
     * 
     * @param enabledCloudWatchLogsExports
     *        A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     */

    public void setEnabledCloudWatchLogsExports(java.util.Collection<String> enabledCloudWatchLogsExports) {
        if (enabledCloudWatchLogsExports == null) {
            this.enabledCloudWatchLogsExports = null;
            return;
        }

        this.enabledCloudWatchLogsExports = new java.util.ArrayList<String>(enabledCloudWatchLogsExports);
    }

    /**
     * <p>
     * A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledCloudWatchLogsExports(java.util.Collection)} or
     * {@link #withEnabledCloudWatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enabledCloudWatchLogsExports
     *        A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withEnabledCloudWatchLogsExports(String... enabledCloudWatchLogsExports) {
        if (this.enabledCloudWatchLogsExports == null) {
            setEnabledCloudWatchLogsExports(new java.util.ArrayList<String>(enabledCloudWatchLogsExports.length));
        }
        for (String ele : enabledCloudWatchLogsExports) {
            this.enabledCloudWatchLogsExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     * </p>
     * 
     * @param enabledCloudWatchLogsExports
     *        A list of log types that this DB cluster is configured to export to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withEnabledCloudWatchLogsExports(java.util.Collection<String> enabledCloudWatchLogsExports) {
        setEnabledCloudWatchLogsExports(enabledCloudWatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The database engine mode of the DB cluster.
     * </p>
     * 
     * @param engineMode
     *        The database engine mode of the DB cluster.
     */

    public void setEngineMode(String engineMode) {
        this.engineMode = engineMode;
    }

    /**
     * <p>
     * The database engine mode of the DB cluster.
     * </p>
     * 
     * @return The database engine mode of the DB cluster.
     */

    public String getEngineMode() {
        return this.engineMode;
    }

    /**
     * <p>
     * The database engine mode of the DB cluster.
     * </p>
     * 
     * @param engineMode
     *        The database engine mode of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withEngineMode(String engineMode) {
        setEngineMode(engineMode);
        return this;
    }

    /**
     * <p>
     * Whether the DB cluster has deletion protection enabled.
     * </p>
     * 
     * @param deletionProtection
     *        Whether the DB cluster has deletion protection enabled.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Whether the DB cluster has deletion protection enabled.
     * </p>
     * 
     * @return Whether the DB cluster has deletion protection enabled.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Whether the DB cluster has deletion protection enabled.
     * </p>
     * 
     * @param deletionProtection
     *        Whether the DB cluster has deletion protection enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * Whether the DB cluster has deletion protection enabled.
     * </p>
     * 
     * @return Whether the DB cluster has deletion protection enabled.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     * </p>
     * 
     * @param httpEndpointEnabled
     *        Whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     */

    public void setHttpEndpointEnabled(Boolean httpEndpointEnabled) {
        this.httpEndpointEnabled = httpEndpointEnabled;
    }

    /**
     * <p>
     * Whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     * </p>
     * 
     * @return Whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     */

    public Boolean getHttpEndpointEnabled() {
        return this.httpEndpointEnabled;
    }

    /**
     * <p>
     * Whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     * </p>
     * 
     * @param httpEndpointEnabled
     *        Whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withHttpEndpointEnabled(Boolean httpEndpointEnabled) {
        setHttpEndpointEnabled(httpEndpointEnabled);
        return this;
    }

    /**
     * <p>
     * Whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     * </p>
     * 
     * @return Whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
     */

    public Boolean isHttpEndpointEnabled() {
        return this.httpEndpointEnabled;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * 
     * @param activityStreamStatus
     *        The status of the database activity stream.
     */

    public void setActivityStreamStatus(String activityStreamStatus) {
        this.activityStreamStatus = activityStreamStatus;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * 
     * @return The status of the database activity stream.
     */

    public String getActivityStreamStatus() {
        return this.activityStreamStatus;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * 
     * @param activityStreamStatus
     *        The status of the database activity stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withActivityStreamStatus(String activityStreamStatus) {
        setActivityStreamStatus(activityStreamStatus);
        return this;
    }

    /**
     * <p>
     * Whether tags are copied from the DB cluster to snapshots of the DB cluster.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        Whether tags are copied from the DB cluster to snapshots of the DB cluster.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * Whether tags are copied from the DB cluster to snapshots of the DB cluster.
     * </p>
     * 
     * @return Whether tags are copied from the DB cluster to snapshots of the DB cluster.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * Whether tags are copied from the DB cluster to snapshots of the DB cluster.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        Whether tags are copied from the DB cluster to snapshots of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * Whether tags are copied from the DB cluster to snapshots of the DB cluster.
     * </p>
     * 
     * @return Whether tags are copied from the DB cluster to snapshots of the DB cluster.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * Whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     * </p>
     * 
     * @param crossAccountClone
     *        Whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     */

    public void setCrossAccountClone(Boolean crossAccountClone) {
        this.crossAccountClone = crossAccountClone;
    }

    /**
     * <p>
     * Whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     * </p>
     * 
     * @return Whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     */

    public Boolean getCrossAccountClone() {
        return this.crossAccountClone;
    }

    /**
     * <p>
     * Whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     * </p>
     * 
     * @param crossAccountClone
     *        Whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withCrossAccountClone(Boolean crossAccountClone) {
        setCrossAccountClone(crossAccountClone);
        return this;
    }

    /**
     * <p>
     * Whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     * </p>
     * 
     * @return Whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
     */

    public Boolean isCrossAccountClone() {
        return this.crossAccountClone;
    }

    /**
     * <p>
     * The Active Directory domain membership records that are associated with the DB cluster.
     * </p>
     * 
     * @return The Active Directory domain membership records that are associated with the DB cluster.
     */

    public java.util.List<AwsRdsDbDomainMembership> getDomainMemberships() {
        return domainMemberships;
    }

    /**
     * <p>
     * The Active Directory domain membership records that are associated with the DB cluster.
     * </p>
     * 
     * @param domainMemberships
     *        The Active Directory domain membership records that are associated with the DB cluster.
     */

    public void setDomainMemberships(java.util.Collection<AwsRdsDbDomainMembership> domainMemberships) {
        if (domainMemberships == null) {
            this.domainMemberships = null;
            return;
        }

        this.domainMemberships = new java.util.ArrayList<AwsRdsDbDomainMembership>(domainMemberships);
    }

    /**
     * <p>
     * The Active Directory domain membership records that are associated with the DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainMemberships(java.util.Collection)} or {@link #withDomainMemberships(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param domainMemberships
     *        The Active Directory domain membership records that are associated with the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withDomainMemberships(AwsRdsDbDomainMembership... domainMemberships) {
        if (this.domainMemberships == null) {
            setDomainMemberships(new java.util.ArrayList<AwsRdsDbDomainMembership>(domainMemberships.length));
        }
        for (AwsRdsDbDomainMembership ele : domainMemberships) {
            this.domainMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Active Directory domain membership records that are associated with the DB cluster.
     * </p>
     * 
     * @param domainMemberships
     *        The Active Directory domain membership records that are associated with the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withDomainMemberships(java.util.Collection<AwsRdsDbDomainMembership> domainMemberships) {
        setDomainMemberships(domainMemberships);
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group for the DB cluster.
     * </p>
     * 
     * @param dbClusterParameterGroup
     *        The name of the DB cluster parameter group for the DB cluster.
     */

    public void setDbClusterParameterGroup(String dbClusterParameterGroup) {
        this.dbClusterParameterGroup = dbClusterParameterGroup;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group for the DB cluster.
     * </p>
     * 
     * @return The name of the DB cluster parameter group for the DB cluster.
     */

    public String getDbClusterParameterGroup() {
        return this.dbClusterParameterGroup;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group for the DB cluster.
     * </p>
     * 
     * @param dbClusterParameterGroup
     *        The name of the DB cluster parameter group for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withDbClusterParameterGroup(String dbClusterParameterGroup) {
        setDbClusterParameterGroup(dbClusterParameterGroup);
        return this;
    }

    /**
     * <p>
     * The subnet group that is associated with the DB cluster, including the name, description, and subnets in the
     * subnet group.
     * </p>
     * 
     * @param dbSubnetGroup
     *        The subnet group that is associated with the DB cluster, including the name, description, and subnets in
     *        the subnet group.
     */

    public void setDbSubnetGroup(String dbSubnetGroup) {
        this.dbSubnetGroup = dbSubnetGroup;
    }

    /**
     * <p>
     * The subnet group that is associated with the DB cluster, including the name, description, and subnets in the
     * subnet group.
     * </p>
     * 
     * @return The subnet group that is associated with the DB cluster, including the name, description, and subnets in
     *         the subnet group.
     */

    public String getDbSubnetGroup() {
        return this.dbSubnetGroup;
    }

    /**
     * <p>
     * The subnet group that is associated with the DB cluster, including the name, description, and subnets in the
     * subnet group.
     * </p>
     * 
     * @param dbSubnetGroup
     *        The subnet group that is associated with the DB cluster, including the name, description, and subnets in
     *        the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withDbSubnetGroup(String dbSubnetGroup) {
        setDbSubnetGroup(dbSubnetGroup);
        return this;
    }

    /**
     * <p>
     * The list of option group memberships for this DB cluster.
     * </p>
     * 
     * @return The list of option group memberships for this DB cluster.
     */

    public java.util.List<AwsRdsDbClusterOptionGroupMembership> getDbClusterOptionGroupMemberships() {
        return dbClusterOptionGroupMemberships;
    }

    /**
     * <p>
     * The list of option group memberships for this DB cluster.
     * </p>
     * 
     * @param dbClusterOptionGroupMemberships
     *        The list of option group memberships for this DB cluster.
     */

    public void setDbClusterOptionGroupMemberships(java.util.Collection<AwsRdsDbClusterOptionGroupMembership> dbClusterOptionGroupMemberships) {
        if (dbClusterOptionGroupMemberships == null) {
            this.dbClusterOptionGroupMemberships = null;
            return;
        }

        this.dbClusterOptionGroupMemberships = new java.util.ArrayList<AwsRdsDbClusterOptionGroupMembership>(dbClusterOptionGroupMemberships);
    }

    /**
     * <p>
     * The list of option group memberships for this DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDbClusterOptionGroupMemberships(java.util.Collection)} or
     * {@link #withDbClusterOptionGroupMemberships(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dbClusterOptionGroupMemberships
     *        The list of option group memberships for this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withDbClusterOptionGroupMemberships(AwsRdsDbClusterOptionGroupMembership... dbClusterOptionGroupMemberships) {
        if (this.dbClusterOptionGroupMemberships == null) {
            setDbClusterOptionGroupMemberships(new java.util.ArrayList<AwsRdsDbClusterOptionGroupMembership>(dbClusterOptionGroupMemberships.length));
        }
        for (AwsRdsDbClusterOptionGroupMembership ele : dbClusterOptionGroupMemberships) {
            this.dbClusterOptionGroupMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of option group memberships for this DB cluster.
     * </p>
     * 
     * @param dbClusterOptionGroupMemberships
     *        The list of option group memberships for this DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withDbClusterOptionGroupMemberships(java.util.Collection<AwsRdsDbClusterOptionGroupMembership> dbClusterOptionGroupMemberships) {
        setDbClusterOptionGroupMemberships(dbClusterOptionGroupMemberships);
        return this;
    }

    /**
     * <p>
     * The DB cluster identifier that the user assigned to the cluster. This identifier is the unique key that
     * identifies a DB cluster.
     * </p>
     * 
     * @param dbClusterIdentifier
     *        The DB cluster identifier that the user assigned to the cluster. This identifier is the unique key that
     *        identifies a DB cluster.
     */

    public void setDbClusterIdentifier(String dbClusterIdentifier) {
        this.dbClusterIdentifier = dbClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier that the user assigned to the cluster. This identifier is the unique key that
     * identifies a DB cluster.
     * </p>
     * 
     * @return The DB cluster identifier that the user assigned to the cluster. This identifier is the unique key that
     *         identifies a DB cluster.
     */

    public String getDbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier that the user assigned to the cluster. This identifier is the unique key that
     * identifies a DB cluster.
     * </p>
     * 
     * @param dbClusterIdentifier
     *        The DB cluster identifier that the user assigned to the cluster. This identifier is the unique key that
     *        identifies a DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withDbClusterIdentifier(String dbClusterIdentifier) {
        setDbClusterIdentifier(dbClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The list of instances that make up the DB cluster.
     * </p>
     * 
     * @return The list of instances that make up the DB cluster.
     */

    public java.util.List<AwsRdsDbClusterMember> getDbClusterMembers() {
        return dbClusterMembers;
    }

    /**
     * <p>
     * The list of instances that make up the DB cluster.
     * </p>
     * 
     * @param dbClusterMembers
     *        The list of instances that make up the DB cluster.
     */

    public void setDbClusterMembers(java.util.Collection<AwsRdsDbClusterMember> dbClusterMembers) {
        if (dbClusterMembers == null) {
            this.dbClusterMembers = null;
            return;
        }

        this.dbClusterMembers = new java.util.ArrayList<AwsRdsDbClusterMember>(dbClusterMembers);
    }

    /**
     * <p>
     * The list of instances that make up the DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDbClusterMembers(java.util.Collection)} or {@link #withDbClusterMembers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dbClusterMembers
     *        The list of instances that make up the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withDbClusterMembers(AwsRdsDbClusterMember... dbClusterMembers) {
        if (this.dbClusterMembers == null) {
            setDbClusterMembers(new java.util.ArrayList<AwsRdsDbClusterMember>(dbClusterMembers.length));
        }
        for (AwsRdsDbClusterMember ele : dbClusterMembers) {
            this.dbClusterMembers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of instances that make up the DB cluster.
     * </p>
     * 
     * @param dbClusterMembers
     *        The list of instances that make up the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withDbClusterMembers(java.util.Collection<AwsRdsDbClusterMember> dbClusterMembers) {
        setDbClusterMembers(dbClusterMembers);
        return this;
    }

    /**
     * <p>
     * Whether the mapping of IAM accounts to database accounts is enabled.
     * </p>
     * 
     * @param iamDatabaseAuthenticationEnabled
     *        Whether the mapping of IAM accounts to database accounts is enabled.
     */

    public void setIamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
        this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * Whether the mapping of IAM accounts to database accounts is enabled.
     * </p>
     * 
     * @return Whether the mapping of IAM accounts to database accounts is enabled.
     */

    public Boolean getIamDatabaseAuthenticationEnabled() {
        return this.iamDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * Whether the mapping of IAM accounts to database accounts is enabled.
     * </p>
     * 
     * @param iamDatabaseAuthenticationEnabled
     *        Whether the mapping of IAM accounts to database accounts is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterDetails withIamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
        setIamDatabaseAuthenticationEnabled(iamDatabaseAuthenticationEnabled);
        return this;
    }

    /**
     * <p>
     * Whether the mapping of IAM accounts to database accounts is enabled.
     * </p>
     * 
     * @return Whether the mapping of IAM accounts to database accounts is enabled.
     */

    public Boolean isIamDatabaseAuthenticationEnabled() {
        return this.iamDatabaseAuthenticationEnabled;
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
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getReaderEndpoint() != null)
            sb.append("ReaderEndpoint: ").append(getReaderEndpoint()).append(",");
        if (getCustomEndpoints() != null)
            sb.append("CustomEndpoints: ").append(getCustomEndpoints()).append(",");
        if (getMultiAz() != null)
            sb.append("MultiAz: ").append(getMultiAz()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getReadReplicaIdentifiers() != null)
            sb.append("ReadReplicaIdentifiers: ").append(getReadReplicaIdentifiers()).append(",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: ").append(getVpcSecurityGroups()).append(",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDbClusterResourceId() != null)
            sb.append("DbClusterResourceId: ").append(getDbClusterResourceId()).append(",");
        if (getAssociatedRoles() != null)
            sb.append("AssociatedRoles: ").append(getAssociatedRoles()).append(",");
        if (getClusterCreateTime() != null)
            sb.append("ClusterCreateTime: ").append(getClusterCreateTime()).append(",");
        if (getEnabledCloudWatchLogsExports() != null)
            sb.append("EnabledCloudWatchLogsExports: ").append(getEnabledCloudWatchLogsExports()).append(",");
        if (getEngineMode() != null)
            sb.append("EngineMode: ").append(getEngineMode()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getHttpEndpointEnabled() != null)
            sb.append("HttpEndpointEnabled: ").append(getHttpEndpointEnabled()).append(",");
        if (getActivityStreamStatus() != null)
            sb.append("ActivityStreamStatus: ").append(getActivityStreamStatus()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getCrossAccountClone() != null)
            sb.append("CrossAccountClone: ").append(getCrossAccountClone()).append(",");
        if (getDomainMemberships() != null)
            sb.append("DomainMemberships: ").append(getDomainMemberships()).append(",");
        if (getDbClusterParameterGroup() != null)
            sb.append("DbClusterParameterGroup: ").append(getDbClusterParameterGroup()).append(",");
        if (getDbSubnetGroup() != null)
            sb.append("DbSubnetGroup: ").append(getDbSubnetGroup()).append(",");
        if (getDbClusterOptionGroupMemberships() != null)
            sb.append("DbClusterOptionGroupMemberships: ").append(getDbClusterOptionGroupMemberships()).append(",");
        if (getDbClusterIdentifier() != null)
            sb.append("DbClusterIdentifier: ").append(getDbClusterIdentifier()).append(",");
        if (getDbClusterMembers() != null)
            sb.append("DbClusterMembers: ").append(getDbClusterMembers()).append(",");
        if (getIamDatabaseAuthenticationEnabled() != null)
            sb.append("IamDatabaseAuthenticationEnabled: ").append(getIamDatabaseAuthenticationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbClusterDetails == false)
            return false;
        AwsRdsDbClusterDetails other = (AwsRdsDbClusterDetails) obj;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getReaderEndpoint() == null ^ this.getReaderEndpoint() == null)
            return false;
        if (other.getReaderEndpoint() != null && other.getReaderEndpoint().equals(this.getReaderEndpoint()) == false)
            return false;
        if (other.getCustomEndpoints() == null ^ this.getCustomEndpoints() == null)
            return false;
        if (other.getCustomEndpoints() != null && other.getCustomEndpoints().equals(this.getCustomEndpoints()) == false)
            return false;
        if (other.getMultiAz() == null ^ this.getMultiAz() == null)
            return false;
        if (other.getMultiAz() != null && other.getMultiAz().equals(this.getMultiAz()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getReadReplicaIdentifiers() == null ^ this.getReadReplicaIdentifiers() == null)
            return false;
        if (other.getReadReplicaIdentifiers() != null && other.getReadReplicaIdentifiers().equals(this.getReadReplicaIdentifiers()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDbClusterResourceId() == null ^ this.getDbClusterResourceId() == null)
            return false;
        if (other.getDbClusterResourceId() != null && other.getDbClusterResourceId().equals(this.getDbClusterResourceId()) == false)
            return false;
        if (other.getAssociatedRoles() == null ^ this.getAssociatedRoles() == null)
            return false;
        if (other.getAssociatedRoles() != null && other.getAssociatedRoles().equals(this.getAssociatedRoles()) == false)
            return false;
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null)
            return false;
        if (other.getClusterCreateTime() != null && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false)
            return false;
        if (other.getEnabledCloudWatchLogsExports() == null ^ this.getEnabledCloudWatchLogsExports() == null)
            return false;
        if (other.getEnabledCloudWatchLogsExports() != null && other.getEnabledCloudWatchLogsExports().equals(this.getEnabledCloudWatchLogsExports()) == false)
            return false;
        if (other.getEngineMode() == null ^ this.getEngineMode() == null)
            return false;
        if (other.getEngineMode() != null && other.getEngineMode().equals(this.getEngineMode()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getHttpEndpointEnabled() == null ^ this.getHttpEndpointEnabled() == null)
            return false;
        if (other.getHttpEndpointEnabled() != null && other.getHttpEndpointEnabled().equals(this.getHttpEndpointEnabled()) == false)
            return false;
        if (other.getActivityStreamStatus() == null ^ this.getActivityStreamStatus() == null)
            return false;
        if (other.getActivityStreamStatus() != null && other.getActivityStreamStatus().equals(this.getActivityStreamStatus()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getCrossAccountClone() == null ^ this.getCrossAccountClone() == null)
            return false;
        if (other.getCrossAccountClone() != null && other.getCrossAccountClone().equals(this.getCrossAccountClone()) == false)
            return false;
        if (other.getDomainMemberships() == null ^ this.getDomainMemberships() == null)
            return false;
        if (other.getDomainMemberships() != null && other.getDomainMemberships().equals(this.getDomainMemberships()) == false)
            return false;
        if (other.getDbClusterParameterGroup() == null ^ this.getDbClusterParameterGroup() == null)
            return false;
        if (other.getDbClusterParameterGroup() != null && other.getDbClusterParameterGroup().equals(this.getDbClusterParameterGroup()) == false)
            return false;
        if (other.getDbSubnetGroup() == null ^ this.getDbSubnetGroup() == null)
            return false;
        if (other.getDbSubnetGroup() != null && other.getDbSubnetGroup().equals(this.getDbSubnetGroup()) == false)
            return false;
        if (other.getDbClusterOptionGroupMemberships() == null ^ this.getDbClusterOptionGroupMemberships() == null)
            return false;
        if (other.getDbClusterOptionGroupMemberships() != null
                && other.getDbClusterOptionGroupMemberships().equals(this.getDbClusterOptionGroupMemberships()) == false)
            return false;
        if (other.getDbClusterIdentifier() == null ^ this.getDbClusterIdentifier() == null)
            return false;
        if (other.getDbClusterIdentifier() != null && other.getDbClusterIdentifier().equals(this.getDbClusterIdentifier()) == false)
            return false;
        if (other.getDbClusterMembers() == null ^ this.getDbClusterMembers() == null)
            return false;
        if (other.getDbClusterMembers() != null && other.getDbClusterMembers().equals(this.getDbClusterMembers()) == false)
            return false;
        if (other.getIamDatabaseAuthenticationEnabled() == null ^ this.getIamDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIamDatabaseAuthenticationEnabled() != null
                && other.getIamDatabaseAuthenticationEnabled().equals(this.getIamDatabaseAuthenticationEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getReaderEndpoint() == null) ? 0 : getReaderEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCustomEndpoints() == null) ? 0 : getCustomEndpoints().hashCode());
        hashCode = prime * hashCode + ((getMultiAz() == null) ? 0 : getMultiAz().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getReadReplicaIdentifiers() == null) ? 0 : getReadReplicaIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDbClusterResourceId() == null) ? 0 : getDbClusterResourceId().hashCode());
        hashCode = prime * hashCode + ((getAssociatedRoles() == null) ? 0 : getAssociatedRoles().hashCode());
        hashCode = prime * hashCode + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEnabledCloudWatchLogsExports() == null) ? 0 : getEnabledCloudWatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getEngineMode() == null) ? 0 : getEngineMode().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getHttpEndpointEnabled() == null) ? 0 : getHttpEndpointEnabled().hashCode());
        hashCode = prime * hashCode + ((getActivityStreamStatus() == null) ? 0 : getActivityStreamStatus().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getCrossAccountClone() == null) ? 0 : getCrossAccountClone().hashCode());
        hashCode = prime * hashCode + ((getDomainMemberships() == null) ? 0 : getDomainMemberships().hashCode());
        hashCode = prime * hashCode + ((getDbClusterParameterGroup() == null) ? 0 : getDbClusterParameterGroup().hashCode());
        hashCode = prime * hashCode + ((getDbSubnetGroup() == null) ? 0 : getDbSubnetGroup().hashCode());
        hashCode = prime * hashCode + ((getDbClusterOptionGroupMemberships() == null) ? 0 : getDbClusterOptionGroupMemberships().hashCode());
        hashCode = prime * hashCode + ((getDbClusterIdentifier() == null) ? 0 : getDbClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDbClusterMembers() == null) ? 0 : getDbClusterMembers().hashCode());
        hashCode = prime * hashCode + ((getIamDatabaseAuthenticationEnabled() == null) ? 0 : getIamDatabaseAuthenticationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbClusterDetails clone() {
        try {
            return (AwsRdsDbClusterDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbClusterDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
