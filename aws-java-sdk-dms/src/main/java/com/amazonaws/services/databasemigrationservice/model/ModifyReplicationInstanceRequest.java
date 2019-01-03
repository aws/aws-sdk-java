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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyReplicationInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;
    /**
     * <p>
     * The amount of storage (in gigabytes) to be allocated for the replication instance.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Indicates whether the changes should be applied immediately or during the next maintenance window.
     * </p>
     */
    private Boolean applyImmediately;
    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     */
    private String replicationInstanceClass;
    /**
     * <p>
     * Specifies the VPC security group to be used with the replication instance. The VPC security group must work with
     * the VPC containing the replication instance.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter does not result in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If moving this window to the current time, there must be at least 30
     * minutes between the current time and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Specifies if the replication instance is a Multi-AZ deployment. You cannot set the <code>AvailabilityZone</code>
     * parameter if the Multi-AZ parameter is set to <code>true</code>.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the replication instance's current version.
     * </p>
     */
    private Boolean allowMajorVersionUpgrade;
    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the replication instance during the
     * maintenance window. Changing this parameter does not result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage will result if this parameter is set to
     * <code>true</code> during the maintenance window, and a newer minor version is available, and AWS DMS has enabled
     * auto patching for that engine version.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * </p>
     */
    private String replicationInstanceIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the replication instance.
     */

    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replication instance.
     */

    public String getReplicationInstanceArn() {
        return this.replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationInstanceRequest withReplicationInstanceArn(String replicationInstanceArn) {
        setReplicationInstanceArn(replicationInstanceArn);
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be allocated for the replication instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) to be allocated for the replication instance.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be allocated for the replication instance.
     * </p>
     * 
     * @return The amount of storage (in gigabytes) to be allocated for the replication instance.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be allocated for the replication instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) to be allocated for the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Indicates whether the changes should be applied immediately or during the next maintenance window.
     * </p>
     * 
     * @param applyImmediately
     *        Indicates whether the changes should be applied immediately or during the next maintenance window.
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Indicates whether the changes should be applied immediately or during the next maintenance window.
     * </p>
     * 
     * @return Indicates whether the changes should be applied immediately or during the next maintenance window.
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * Indicates whether the changes should be applied immediately or during the next maintenance window.
     * </p>
     * 
     * @param applyImmediately
     *        Indicates whether the changes should be applied immediately or during the next maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationInstanceRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * Indicates whether the changes should be applied immediately or during the next maintenance window.
     * </p>
     * 
     * @return Indicates whether the changes should be applied immediately or during the next maintenance window.
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance.</p>
     *        <p>
     *        Valid Values:
     *        <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     */

    public void setReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @return The compute and memory capacity of the replication instance.</p>
     *         <p>
     *         Valid Values:
     *         <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     */

    public String getReplicationInstanceClass() {
        return this.replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance.</p>
     *        <p>
     *        Valid Values:
     *        <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationInstanceRequest withReplicationInstanceClass(String replicationInstanceClass) {
        setReplicationInstanceClass(replicationInstanceClass);
        return this;
    }

    /**
     * <p>
     * Specifies the VPC security group to be used with the replication instance. The VPC security group must work with
     * the VPC containing the replication instance.
     * </p>
     * 
     * @return Specifies the VPC security group to be used with the replication instance. The VPC security group must
     *         work with the VPC containing the replication instance.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * Specifies the VPC security group to be used with the replication instance. The VPC security group must work with
     * the VPC containing the replication instance.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Specifies the VPC security group to be used with the replication instance. The VPC security group must
     *        work with the VPC containing the replication instance.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * Specifies the VPC security group to be used with the replication instance. The VPC security group must work with
     * the VPC containing the replication instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Specifies the VPC security group to be used with the replication instance. The VPC security group must
     *        work with the VPC containing the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the VPC security group to be used with the replication instance. The VPC security group must work with
     * the VPC containing the replication instance.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Specifies the VPC security group to be used with the replication instance. The VPC security group must
     *        work with the VPC containing the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationInstanceRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter does not result in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If moving this window to the current time, there must be at least 30
     * minutes between the current time and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     *        Changing this parameter does not result in an outage, except in the following situation, and the change is
     *        asynchronously applied as soon as possible. If moving this window to the current time, there must be at
     *        least 30 minutes between the current time and end of the window to ensure pending changes are applied.</p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Format: ddd:hh24:mi-ddd:hh24:mi
     *        </p>
     *        <p>
     *        Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *        </p>
     *        <p>
     *        Constraints: Must be at least 30 minutes
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter does not result in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If moving this window to the current time, there must be at least 30
     * minutes between the current time and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     * 
     * @return The weekly time range (in UTC) during which system maintenance can occur, which might result in an
     *         outage. Changing this parameter does not result in an outage, except in the following situation, and the
     *         change is asynchronously applied as soon as possible. If moving this window to the current time, there
     *         must be at least 30 minutes between the current time and end of the window to ensure pending changes are
     *         applied.</p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Format: ddd:hh24:mi-ddd:hh24:mi
     *         </p>
     *         <p>
     *         Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *         </p>
     *         <p>
     *         Constraints: Must be at least 30 minutes
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter does not result in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If moving this window to the current time, there must be at least 30
     * minutes between the current time and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     *        Changing this parameter does not result in an outage, except in the following situation, and the change is
     *        asynchronously applied as soon as possible. If moving this window to the current time, there must be at
     *        least 30 minutes between the current time and end of the window to ensure pending changes are applied.</p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Format: ddd:hh24:mi-ddd:hh24:mi
     *        </p>
     *        <p>
     *        Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *        </p>
     *        <p>
     *        Constraints: Must be at least 30 minutes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Specifies if the replication instance is a Multi-AZ deployment. You cannot set the <code>AvailabilityZone</code>
     * parameter if the Multi-AZ parameter is set to <code>true</code>.
     * </p>
     * 
     * @param multiAZ
     *        Specifies if the replication instance is a Multi-AZ deployment. You cannot set the
     *        <code>AvailabilityZone</code> parameter if the Multi-AZ parameter is set to <code>true</code>.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies if the replication instance is a Multi-AZ deployment. You cannot set the <code>AvailabilityZone</code>
     * parameter if the Multi-AZ parameter is set to <code>true</code>.
     * </p>
     * 
     * @return Specifies if the replication instance is a Multi-AZ deployment. You cannot set the
     *         <code>AvailabilityZone</code> parameter if the Multi-AZ parameter is set to <code>true</code>.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies if the replication instance is a Multi-AZ deployment. You cannot set the <code>AvailabilityZone</code>
     * parameter if the Multi-AZ parameter is set to <code>true</code>.
     * </p>
     * 
     * @param multiAZ
     *        Specifies if the replication instance is a Multi-AZ deployment. You cannot set the
     *        <code>AvailabilityZone</code> parameter if the Multi-AZ parameter is set to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationInstanceRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Specifies if the replication instance is a Multi-AZ deployment. You cannot set the <code>AvailabilityZone</code>
     * parameter if the Multi-AZ parameter is set to <code>true</code>.
     * </p>
     * 
     * @return Specifies if the replication instance is a Multi-AZ deployment. You cannot set the
     *         <code>AvailabilityZone</code> parameter if the Multi-AZ parameter is set to <code>true</code>.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * 
     * @param engineVersion
     *        The engine version number of the replication instance.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * 
     * @return The engine version number of the replication instance.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * 
     * @param engineVersion
     *        The engine version number of the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationInstanceRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the replication instance's current version.
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage
     *        and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints: This parameter must be set to true when specifying a value for the <code>EngineVersion</code>
     *        parameter that is a different major version than the replication instance's current version.
     */

    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the replication instance's current version.
     * </p>
     * 
     * @return Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage
     *         and the change is asynchronously applied as soon as possible.</p>
     *         <p>
     *         Constraints: This parameter must be set to true when specifying a value for the
     *         <code>EngineVersion</code> parameter that is a different major version than the replication instance's
     *         current version.
     */

    public Boolean getAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the replication instance's current version.
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage
     *        and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints: This parameter must be set to true when specifying a value for the <code>EngineVersion</code>
     *        parameter that is a different major version than the replication instance's current version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationInstanceRequest withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        setAllowMajorVersionUpgrade(allowMajorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the replication instance's current version.
     * </p>
     * 
     * @return Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage
     *         and the change is asynchronously applied as soon as possible.</p>
     *         <p>
     *         Constraints: This parameter must be set to true when specifying a value for the
     *         <code>EngineVersion</code> parameter that is a different major version than the replication instance's
     *         current version.
     */

    public Boolean isAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the replication instance during the
     * maintenance window. Changing this parameter does not result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage will result if this parameter is set to
     * <code>true</code> during the maintenance window, and a newer minor version is available, and AWS DMS has enabled
     * auto patching for that engine version.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor version upgrades will be applied automatically to the replication instance during the
     *        maintenance window. Changing this parameter does not result in an outage except in the following case and
     *        the change is asynchronously applied as soon as possible. An outage will result if this parameter is set
     *        to <code>true</code> during the maintenance window, and a newer minor version is available, and AWS DMS
     *        has enabled auto patching for that engine version.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the replication instance during the
     * maintenance window. Changing this parameter does not result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage will result if this parameter is set to
     * <code>true</code> during the maintenance window, and a newer minor version is available, and AWS DMS has enabled
     * auto patching for that engine version.
     * </p>
     * 
     * @return Indicates that minor version upgrades will be applied automatically to the replication instance during
     *         the maintenance window. Changing this parameter does not result in an outage except in the following case
     *         and the change is asynchronously applied as soon as possible. An outage will result if this parameter is
     *         set to <code>true</code> during the maintenance window, and a newer minor version is available, and AWS
     *         DMS has enabled auto patching for that engine version.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the replication instance during the
     * maintenance window. Changing this parameter does not result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage will result if this parameter is set to
     * <code>true</code> during the maintenance window, and a newer minor version is available, and AWS DMS has enabled
     * auto patching for that engine version.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor version upgrades will be applied automatically to the replication instance during the
     *        maintenance window. Changing this parameter does not result in an outage except in the following case and
     *        the change is asynchronously applied as soon as possible. An outage will result if this parameter is set
     *        to <code>true</code> during the maintenance window, and a newer minor version is available, and AWS DMS
     *        has enabled auto patching for that engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the replication instance during the
     * maintenance window. Changing this parameter does not result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage will result if this parameter is set to
     * <code>true</code> during the maintenance window, and a newer minor version is available, and AWS DMS has enabled
     * auto patching for that engine version.
     * </p>
     * 
     * @return Indicates that minor version upgrades will be applied automatically to the replication instance during
     *         the maintenance window. Changing this parameter does not result in an outage except in the following case
     *         and the change is asynchronously applied as soon as possible. An outage will result if this parameter is
     *         set to <code>true</code> during the maintenance window, and a newer minor version is available, and AWS
     *         DMS has enabled auto patching for that engine version.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param replicationInstanceIdentifier
     *        The replication instance identifier. This parameter is stored as a lowercase string.
     */

    public void setReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @return The replication instance identifier. This parameter is stored as a lowercase string.
     */

    public String getReplicationInstanceIdentifier() {
        return this.replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param replicationInstanceIdentifier
     *        The replication instance identifier. This parameter is stored as a lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationInstanceRequest withReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
        setReplicationInstanceIdentifier(replicationInstanceIdentifier);
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
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: ").append(getReplicationInstanceArn()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately()).append(",");
        if (getReplicationInstanceClass() != null)
            sb.append("ReplicationInstanceClass: ").append(getReplicationInstanceClass()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAllowMajorVersionUpgrade() != null)
            sb.append("AllowMajorVersionUpgrade: ").append(getAllowMajorVersionUpgrade()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getReplicationInstanceIdentifier() != null)
            sb.append("ReplicationInstanceIdentifier: ").append(getReplicationInstanceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReplicationInstanceRequest == false)
            return false;
        ModifyReplicationInstanceRequest other = (ModifyReplicationInstanceRequest) obj;
        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getReplicationInstanceClass() == null ^ this.getReplicationInstanceClass() == null)
            return false;
        if (other.getReplicationInstanceClass() != null && other.getReplicationInstanceClass().equals(this.getReplicationInstanceClass()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAllowMajorVersionUpgrade() == null ^ this.getAllowMajorVersionUpgrade() == null)
            return false;
        if (other.getAllowMajorVersionUpgrade() != null && other.getAllowMajorVersionUpgrade().equals(this.getAllowMajorVersionUpgrade()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getReplicationInstanceIdentifier() == null ^ this.getReplicationInstanceIdentifier() == null)
            return false;
        if (other.getReplicationInstanceIdentifier() != null
                && other.getReplicationInstanceIdentifier().equals(this.getReplicationInstanceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceClass() == null) ? 0 : getReplicationInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAllowMajorVersionUpgrade() == null) ? 0 : getAllowMajorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceIdentifier() == null) ? 0 : getReplicationInstanceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ModifyReplicationInstanceRequest clone() {
        return (ModifyReplicationInstanceRequest) super.clone();
    }

}
