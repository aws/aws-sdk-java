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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RelationalDatabase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabase implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique name of the database resource in Lightsail.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The support code for the database. Include this code in your email to support when you have questions about a
     * database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;
    /**
     * <p>
     * The timestamp when the database was created. Formatted in Unix time.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Region name and Availability Zone where the database is located.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The Lightsail resource type for the database (for example, <code>RelationalDatabase</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The blueprint ID for the database. A blueprint describes the major engine version of a database.
     * </p>
     */
    private String relationalDatabaseBlueprintId;
    /**
     * <p>
     * The bundle ID for the database. A bundle describes the performance specifications for your database.
     * </p>
     */
    private String relationalDatabaseBundleId;
    /**
     * <p>
     * The name of the master database created when the Lightsail database resource is created.
     * </p>
     */
    private String masterDatabaseName;
    /**
     * <p>
     * Describes the hardware of the database.
     * </p>
     */
    private RelationalDatabaseHardware hardware;
    /**
     * <p>
     * Describes the current state of the database.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Describes the secondary Availability Zone of a high availability database.
     * </p>
     * <p>
     * The secondary database is used for failover support of a high availability database.
     * </p>
     */
    private String secondaryAvailabilityZone;
    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled for the database.
     * </p>
     */
    private Boolean backupRetentionEnabled;
    /**
     * <p>
     * Describes pending database value modifications.
     * </p>
     */
    private PendingModifiedRelationalDatabaseValues pendingModifiedValues;
    /**
     * <p>
     * The database software (for example, <code>MySQL</code>).
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The database engine version (for example, <code>5.7.23</code>).
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The latest point in time to which the database can be restored. Formatted in Unix time.
     * </p>
     */
    private java.util.Date latestRestorableTime;
    /**
     * <p>
     * The master user name of the database.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The status of parameter updates for the database.
     * </p>
     */
    private String parameterApplyStatus;
    /**
     * <p>
     * The daily time range during which automated backups are created for the database (for example,
     * <code>16:00-16:30</code>).
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur on the database.
     * </p>
     * <p>
     * In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For example, <code>Tue:17:00-Tue:17:30</code>.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * A Boolean value indicating whether the database is publicly accessible.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The master endpoint for the database.
     * </p>
     */
    private RelationalDatabaseEndpoint masterEndpoint;
    /**
     * <p>
     * Describes the pending maintenance actions for the database.
     * </p>
     */
    private java.util.List<PendingMaintenanceAction> pendingMaintenanceActions;

    /**
     * <p>
     * The unique name of the database resource in Lightsail.
     * </p>
     * 
     * @param name
     *        The unique name of the database resource in Lightsail.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name of the database resource in Lightsail.
     * </p>
     * 
     * @return The unique name of the database resource in Lightsail.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name of the database resource in Lightsail.
     * </p>
     * 
     * @param name
     *        The unique name of the database resource in Lightsail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the database.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the database.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The support code for the database. Include this code in your email to support when you have questions about a
     * database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code for the database. Include this code in your email to support when you have questions
     *        about a database in Lightsail. This code enables our support team to look up your Lightsail information
     *        more easily.
     */

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code for the database. Include this code in your email to support when you have questions about a
     * database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @return The support code for the database. Include this code in your email to support when you have questions
     *         about a database in Lightsail. This code enables our support team to look up your Lightsail information
     *         more easily.
     */

    public String getSupportCode() {
        return this.supportCode;
    }

    /**
     * <p>
     * The support code for the database. Include this code in your email to support when you have questions about a
     * database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code for the database. Include this code in your email to support when you have questions
     *        about a database in Lightsail. This code enables our support team to look up your Lightsail information
     *        more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * The timestamp when the database was created. Formatted in Unix time.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the database was created. Formatted in Unix time.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the database was created. Formatted in Unix time.
     * </p>
     * 
     * @return The timestamp when the database was created. Formatted in Unix time.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the database was created. Formatted in Unix time.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the database was created. Formatted in Unix time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Region name and Availability Zone where the database is located.
     * </p>
     * 
     * @param location
     *        The Region name and Availability Zone where the database is located.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The Region name and Availability Zone where the database is located.
     * </p>
     * 
     * @return The Region name and Availability Zone where the database is located.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The Region name and Availability Zone where the database is located.
     * </p>
     * 
     * @param location
     *        The Region name and Availability Zone where the database is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type for the database (for example, <code>RelationalDatabase</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type for the database (for example, <code>RelationalDatabase</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type for the database (for example, <code>RelationalDatabase</code>).
     * </p>
     * 
     * @return The Lightsail resource type for the database (for example, <code>RelationalDatabase</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type for the database (for example, <code>RelationalDatabase</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type for the database (for example, <code>RelationalDatabase</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RelationalDatabase withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type for the database (for example, <code>RelationalDatabase</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type for the database (for example, <code>RelationalDatabase</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RelationalDatabase withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @return The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *         <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *         Guide</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The blueprint ID for the database. A blueprint describes the major engine version of a database.
     * </p>
     * 
     * @param relationalDatabaseBlueprintId
     *        The blueprint ID for the database. A blueprint describes the major engine version of a database.
     */

    public void setRelationalDatabaseBlueprintId(String relationalDatabaseBlueprintId) {
        this.relationalDatabaseBlueprintId = relationalDatabaseBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID for the database. A blueprint describes the major engine version of a database.
     * </p>
     * 
     * @return The blueprint ID for the database. A blueprint describes the major engine version of a database.
     */

    public String getRelationalDatabaseBlueprintId() {
        return this.relationalDatabaseBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID for the database. A blueprint describes the major engine version of a database.
     * </p>
     * 
     * @param relationalDatabaseBlueprintId
     *        The blueprint ID for the database. A blueprint describes the major engine version of a database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withRelationalDatabaseBlueprintId(String relationalDatabaseBlueprintId) {
        setRelationalDatabaseBlueprintId(relationalDatabaseBlueprintId);
        return this;
    }

    /**
     * <p>
     * The bundle ID for the database. A bundle describes the performance specifications for your database.
     * </p>
     * 
     * @param relationalDatabaseBundleId
     *        The bundle ID for the database. A bundle describes the performance specifications for your database.
     */

    public void setRelationalDatabaseBundleId(String relationalDatabaseBundleId) {
        this.relationalDatabaseBundleId = relationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID for the database. A bundle describes the performance specifications for your database.
     * </p>
     * 
     * @return The bundle ID for the database. A bundle describes the performance specifications for your database.
     */

    public String getRelationalDatabaseBundleId() {
        return this.relationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID for the database. A bundle describes the performance specifications for your database.
     * </p>
     * 
     * @param relationalDatabaseBundleId
     *        The bundle ID for the database. A bundle describes the performance specifications for your database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withRelationalDatabaseBundleId(String relationalDatabaseBundleId) {
        setRelationalDatabaseBundleId(relationalDatabaseBundleId);
        return this;
    }

    /**
     * <p>
     * The name of the master database created when the Lightsail database resource is created.
     * </p>
     * 
     * @param masterDatabaseName
     *        The name of the master database created when the Lightsail database resource is created.
     */

    public void setMasterDatabaseName(String masterDatabaseName) {
        this.masterDatabaseName = masterDatabaseName;
    }

    /**
     * <p>
     * The name of the master database created when the Lightsail database resource is created.
     * </p>
     * 
     * @return The name of the master database created when the Lightsail database resource is created.
     */

    public String getMasterDatabaseName() {
        return this.masterDatabaseName;
    }

    /**
     * <p>
     * The name of the master database created when the Lightsail database resource is created.
     * </p>
     * 
     * @param masterDatabaseName
     *        The name of the master database created when the Lightsail database resource is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withMasterDatabaseName(String masterDatabaseName) {
        setMasterDatabaseName(masterDatabaseName);
        return this;
    }

    /**
     * <p>
     * Describes the hardware of the database.
     * </p>
     * 
     * @param hardware
     *        Describes the hardware of the database.
     */

    public void setHardware(RelationalDatabaseHardware hardware) {
        this.hardware = hardware;
    }

    /**
     * <p>
     * Describes the hardware of the database.
     * </p>
     * 
     * @return Describes the hardware of the database.
     */

    public RelationalDatabaseHardware getHardware() {
        return this.hardware;
    }

    /**
     * <p>
     * Describes the hardware of the database.
     * </p>
     * 
     * @param hardware
     *        Describes the hardware of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withHardware(RelationalDatabaseHardware hardware) {
        setHardware(hardware);
        return this;
    }

    /**
     * <p>
     * Describes the current state of the database.
     * </p>
     * 
     * @param state
     *        Describes the current state of the database.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Describes the current state of the database.
     * </p>
     * 
     * @return Describes the current state of the database.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Describes the current state of the database.
     * </p>
     * 
     * @param state
     *        Describes the current state of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Describes the secondary Availability Zone of a high availability database.
     * </p>
     * <p>
     * The secondary database is used for failover support of a high availability database.
     * </p>
     * 
     * @param secondaryAvailabilityZone
     *        Describes the secondary Availability Zone of a high availability database.</p>
     *        <p>
     *        The secondary database is used for failover support of a high availability database.
     */

    public void setSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
    }

    /**
     * <p>
     * Describes the secondary Availability Zone of a high availability database.
     * </p>
     * <p>
     * The secondary database is used for failover support of a high availability database.
     * </p>
     * 
     * @return Describes the secondary Availability Zone of a high availability database.</p>
     *         <p>
     *         The secondary database is used for failover support of a high availability database.
     */

    public String getSecondaryAvailabilityZone() {
        return this.secondaryAvailabilityZone;
    }

    /**
     * <p>
     * Describes the secondary Availability Zone of a high availability database.
     * </p>
     * <p>
     * The secondary database is used for failover support of a high availability database.
     * </p>
     * 
     * @param secondaryAvailabilityZone
     *        Describes the secondary Availability Zone of a high availability database.</p>
     *        <p>
     *        The secondary database is used for failover support of a high availability database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        setSecondaryAvailabilityZone(secondaryAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled for the database.
     * </p>
     * 
     * @param backupRetentionEnabled
     *        A Boolean value indicating whether automated backup retention is enabled for the database.
     */

    public void setBackupRetentionEnabled(Boolean backupRetentionEnabled) {
        this.backupRetentionEnabled = backupRetentionEnabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled for the database.
     * </p>
     * 
     * @return A Boolean value indicating whether automated backup retention is enabled for the database.
     */

    public Boolean getBackupRetentionEnabled() {
        return this.backupRetentionEnabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled for the database.
     * </p>
     * 
     * @param backupRetentionEnabled
     *        A Boolean value indicating whether automated backup retention is enabled for the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withBackupRetentionEnabled(Boolean backupRetentionEnabled) {
        setBackupRetentionEnabled(backupRetentionEnabled);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled for the database.
     * </p>
     * 
     * @return A Boolean value indicating whether automated backup retention is enabled for the database.
     */

    public Boolean isBackupRetentionEnabled() {
        return this.backupRetentionEnabled;
    }

    /**
     * <p>
     * Describes pending database value modifications.
     * </p>
     * 
     * @param pendingModifiedValues
     *        Describes pending database value modifications.
     */

    public void setPendingModifiedValues(PendingModifiedRelationalDatabaseValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * Describes pending database value modifications.
     * </p>
     * 
     * @return Describes pending database value modifications.
     */

    public PendingModifiedRelationalDatabaseValues getPendingModifiedValues() {
        return this.pendingModifiedValues;
    }

    /**
     * <p>
     * Describes pending database value modifications.
     * </p>
     * 
     * @param pendingModifiedValues
     *        Describes pending database value modifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withPendingModifiedValues(PendingModifiedRelationalDatabaseValues pendingModifiedValues) {
        setPendingModifiedValues(pendingModifiedValues);
        return this;
    }

    /**
     * <p>
     * The database software (for example, <code>MySQL</code>).
     * </p>
     * 
     * @param engine
     *        The database software (for example, <code>MySQL</code>).
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database software (for example, <code>MySQL</code>).
     * </p>
     * 
     * @return The database software (for example, <code>MySQL</code>).
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The database software (for example, <code>MySQL</code>).
     * </p>
     * 
     * @param engine
     *        The database software (for example, <code>MySQL</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The database engine version (for example, <code>5.7.23</code>).
     * </p>
     * 
     * @param engineVersion
     *        The database engine version (for example, <code>5.7.23</code>).
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version (for example, <code>5.7.23</code>).
     * </p>
     * 
     * @return The database engine version (for example, <code>5.7.23</code>).
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The database engine version (for example, <code>5.7.23</code>).
     * </p>
     * 
     * @param engineVersion
     *        The database engine version (for example, <code>5.7.23</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The latest point in time to which the database can be restored. Formatted in Unix time.
     * </p>
     * 
     * @param latestRestorableTime
     *        The latest point in time to which the database can be restored. Formatted in Unix time.
     */

    public void setLatestRestorableTime(java.util.Date latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
    }

    /**
     * <p>
     * The latest point in time to which the database can be restored. Formatted in Unix time.
     * </p>
     * 
     * @return The latest point in time to which the database can be restored. Formatted in Unix time.
     */

    public java.util.Date getLatestRestorableTime() {
        return this.latestRestorableTime;
    }

    /**
     * <p>
     * The latest point in time to which the database can be restored. Formatted in Unix time.
     * </p>
     * 
     * @param latestRestorableTime
     *        The latest point in time to which the database can be restored. Formatted in Unix time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withLatestRestorableTime(java.util.Date latestRestorableTime) {
        setLatestRestorableTime(latestRestorableTime);
        return this;
    }

    /**
     * <p>
     * The master user name of the database.
     * </p>
     * 
     * @param masterUsername
     *        The master user name of the database.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The master user name of the database.
     * </p>
     * 
     * @return The master user name of the database.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The master user name of the database.
     * </p>
     * 
     * @param masterUsername
     *        The master user name of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The status of parameter updates for the database.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of parameter updates for the database.
     */

    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates for the database.
     * </p>
     * 
     * @return The status of parameter updates for the database.
     */

    public String getParameterApplyStatus() {
        return this.parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates for the database.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of parameter updates for the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withParameterApplyStatus(String parameterApplyStatus) {
        setParameterApplyStatus(parameterApplyStatus);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created for the database (for example,
     * <code>16:00-16:30</code>).
     * </p>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created for the database (for example,
     *        <code>16:00-16:30</code>).
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created for the database (for example,
     * <code>16:00-16:30</code>).
     * </p>
     * 
     * @return The daily time range during which automated backups are created for the database (for example,
     *         <code>16:00-16:30</code>).
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created for the database (for example,
     * <code>16:00-16:30</code>).
     * </p>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created for the database (for example,
     *        <code>16:00-16:30</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on the database.
     * </p>
     * <p>
     * In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For example, <code>Tue:17:00-Tue:17:30</code>.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur on the database.</p>
     *        <p>
     *        In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For example, <code>Tue:17:00-Tue:17:30</code>.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on the database.
     * </p>
     * <p>
     * In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For example, <code>Tue:17:00-Tue:17:30</code>.
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur on the database.</p>
     *         <p>
     *         In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For example, <code>Tue:17:00-Tue:17:30</code>.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on the database.
     * </p>
     * <p>
     * In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For example, <code>Tue:17:00-Tue:17:30</code>.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur on the database.</p>
     *        <p>
     *        In the format <code>ddd:hh24:mi-ddd:hh24:mi</code>. For example, <code>Tue:17:00-Tue:17:30</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database is publicly accessible.
     * </p>
     * 
     * @param publiclyAccessible
     *        A Boolean value indicating whether the database is publicly accessible.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database is publicly accessible.
     * </p>
     * 
     * @return A Boolean value indicating whether the database is publicly accessible.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database is publicly accessible.
     * </p>
     * 
     * @param publiclyAccessible
     *        A Boolean value indicating whether the database is publicly accessible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database is publicly accessible.
     * </p>
     * 
     * @return A Boolean value indicating whether the database is publicly accessible.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The master endpoint for the database.
     * </p>
     * 
     * @param masterEndpoint
     *        The master endpoint for the database.
     */

    public void setMasterEndpoint(RelationalDatabaseEndpoint masterEndpoint) {
        this.masterEndpoint = masterEndpoint;
    }

    /**
     * <p>
     * The master endpoint for the database.
     * </p>
     * 
     * @return The master endpoint for the database.
     */

    public RelationalDatabaseEndpoint getMasterEndpoint() {
        return this.masterEndpoint;
    }

    /**
     * <p>
     * The master endpoint for the database.
     * </p>
     * 
     * @param masterEndpoint
     *        The master endpoint for the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withMasterEndpoint(RelationalDatabaseEndpoint masterEndpoint) {
        setMasterEndpoint(masterEndpoint);
        return this;
    }

    /**
     * <p>
     * Describes the pending maintenance actions for the database.
     * </p>
     * 
     * @return Describes the pending maintenance actions for the database.
     */

    public java.util.List<PendingMaintenanceAction> getPendingMaintenanceActions() {
        return pendingMaintenanceActions;
    }

    /**
     * <p>
     * Describes the pending maintenance actions for the database.
     * </p>
     * 
     * @param pendingMaintenanceActions
     *        Describes the pending maintenance actions for the database.
     */

    public void setPendingMaintenanceActions(java.util.Collection<PendingMaintenanceAction> pendingMaintenanceActions) {
        if (pendingMaintenanceActions == null) {
            this.pendingMaintenanceActions = null;
            return;
        }

        this.pendingMaintenanceActions = new java.util.ArrayList<PendingMaintenanceAction>(pendingMaintenanceActions);
    }

    /**
     * <p>
     * Describes the pending maintenance actions for the database.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPendingMaintenanceActions(java.util.Collection)} or
     * {@link #withPendingMaintenanceActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param pendingMaintenanceActions
     *        Describes the pending maintenance actions for the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withPendingMaintenanceActions(PendingMaintenanceAction... pendingMaintenanceActions) {
        if (this.pendingMaintenanceActions == null) {
            setPendingMaintenanceActions(new java.util.ArrayList<PendingMaintenanceAction>(pendingMaintenanceActions.length));
        }
        for (PendingMaintenanceAction ele : pendingMaintenanceActions) {
            this.pendingMaintenanceActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the pending maintenance actions for the database.
     * </p>
     * 
     * @param pendingMaintenanceActions
     *        Describes the pending maintenance actions for the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabase withPendingMaintenanceActions(java.util.Collection<PendingMaintenanceAction> pendingMaintenanceActions) {
        setPendingMaintenanceActions(pendingMaintenanceActions);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getSupportCode() != null)
            sb.append("SupportCode: ").append(getSupportCode()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getRelationalDatabaseBlueprintId() != null)
            sb.append("RelationalDatabaseBlueprintId: ").append(getRelationalDatabaseBlueprintId()).append(",");
        if (getRelationalDatabaseBundleId() != null)
            sb.append("RelationalDatabaseBundleId: ").append(getRelationalDatabaseBundleId()).append(",");
        if (getMasterDatabaseName() != null)
            sb.append("MasterDatabaseName: ").append(getMasterDatabaseName()).append(",");
        if (getHardware() != null)
            sb.append("Hardware: ").append(getHardware()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getSecondaryAvailabilityZone() != null)
            sb.append("SecondaryAvailabilityZone: ").append(getSecondaryAvailabilityZone()).append(",");
        if (getBackupRetentionEnabled() != null)
            sb.append("BackupRetentionEnabled: ").append(getBackupRetentionEnabled()).append(",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: ").append(getPendingModifiedValues()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getLatestRestorableTime() != null)
            sb.append("LatestRestorableTime: ").append(getLatestRestorableTime()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getParameterApplyStatus() != null)
            sb.append("ParameterApplyStatus: ").append(getParameterApplyStatus()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getMasterEndpoint() != null)
            sb.append("MasterEndpoint: ").append(getMasterEndpoint()).append(",");
        if (getPendingMaintenanceActions() != null)
            sb.append("PendingMaintenanceActions: ").append(getPendingMaintenanceActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalDatabase == false)
            return false;
        RelationalDatabase other = (RelationalDatabase) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getRelationalDatabaseBlueprintId() == null ^ this.getRelationalDatabaseBlueprintId() == null)
            return false;
        if (other.getRelationalDatabaseBlueprintId() != null
                && other.getRelationalDatabaseBlueprintId().equals(this.getRelationalDatabaseBlueprintId()) == false)
            return false;
        if (other.getRelationalDatabaseBundleId() == null ^ this.getRelationalDatabaseBundleId() == null)
            return false;
        if (other.getRelationalDatabaseBundleId() != null && other.getRelationalDatabaseBundleId().equals(this.getRelationalDatabaseBundleId()) == false)
            return false;
        if (other.getMasterDatabaseName() == null ^ this.getMasterDatabaseName() == null)
            return false;
        if (other.getMasterDatabaseName() != null && other.getMasterDatabaseName().equals(this.getMasterDatabaseName()) == false)
            return false;
        if (other.getHardware() == null ^ this.getHardware() == null)
            return false;
        if (other.getHardware() != null && other.getHardware().equals(this.getHardware()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSecondaryAvailabilityZone() == null ^ this.getSecondaryAvailabilityZone() == null)
            return false;
        if (other.getSecondaryAvailabilityZone() != null && other.getSecondaryAvailabilityZone().equals(this.getSecondaryAvailabilityZone()) == false)
            return false;
        if (other.getBackupRetentionEnabled() == null ^ this.getBackupRetentionEnabled() == null)
            return false;
        if (other.getBackupRetentionEnabled() != null && other.getBackupRetentionEnabled().equals(this.getBackupRetentionEnabled()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getLatestRestorableTime() == null ^ this.getLatestRestorableTime() == null)
            return false;
        if (other.getLatestRestorableTime() != null && other.getLatestRestorableTime().equals(this.getLatestRestorableTime()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null)
            return false;
        if (other.getParameterApplyStatus() != null && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getMasterEndpoint() == null ^ this.getMasterEndpoint() == null)
            return false;
        if (other.getMasterEndpoint() != null && other.getMasterEndpoint().equals(this.getMasterEndpoint()) == false)
            return false;
        if (other.getPendingMaintenanceActions() == null ^ this.getPendingMaintenanceActions() == null)
            return false;
        if (other.getPendingMaintenanceActions() != null && other.getPendingMaintenanceActions().equals(this.getPendingMaintenanceActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getRelationalDatabaseBlueprintId() == null) ? 0 : getRelationalDatabaseBlueprintId().hashCode());
        hashCode = prime * hashCode + ((getRelationalDatabaseBundleId() == null) ? 0 : getRelationalDatabaseBundleId().hashCode());
        hashCode = prime * hashCode + ((getMasterDatabaseName() == null) ? 0 : getMasterDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getHardware() == null) ? 0 : getHardware().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getSecondaryAvailabilityZone() == null) ? 0 : getSecondaryAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionEnabled() == null) ? 0 : getBackupRetentionEnabled().hashCode());
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getLatestRestorableTime() == null) ? 0 : getLatestRestorableTime().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getMasterEndpoint() == null) ? 0 : getMasterEndpoint().hashCode());
        hashCode = prime * hashCode + ((getPendingMaintenanceActions() == null) ? 0 : getPendingMaintenanceActions().hashCode());
        return hashCode;
    }

    @Override
    public RelationalDatabase clone() {
        try {
            return (RelationalDatabase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.RelationalDatabaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
