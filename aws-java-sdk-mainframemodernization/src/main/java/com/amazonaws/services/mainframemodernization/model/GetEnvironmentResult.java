/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnvironmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of instances included in the runtime environment. A standalone runtime environment has a maxiumum of
     * one instance. Currently, a high availability runtime environment has a maximum of two instances.
     * </p>
     */
    private Integer actualCapacity;
    /**
     * <p>
     * The timestamp when the runtime environment was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The description of the runtime environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The target platform for the runtime environment.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * The version of the runtime engine.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the runtime environment.
     * </p>
     */
    private String environmentArn;
    /**
     * <p>
     * The unique identifier of the runtime environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The desired capacity of the high availability configuration for the runtime environment.
     * </p>
     */
    private HighAvailabilityConfig highAvailabilityConfig;
    /**
     * <p>
     * The type of instance underlying the runtime environment.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The identifier of a customer managed key.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the load balancer used with the runtime environment.
     * </p>
     */
    private String loadBalancerArn;
    /**
     * <p>
     * The name of the runtime environment. Must be unique within the account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates the pending maintenance scheduled on this environment.
     * </p>
     */
    private PendingMaintenance pendingMaintenance;
    /**
     * <p>
     * Configures the maintenance window you want for the runtime environment. If you do not provide a value, a random
     * system-generated value will be assigned.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Whether applications running in this runtime environment are publicly accessible.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The unique identifiers of the security groups assigned to this runtime environment.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The status of the runtime environment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the reported status.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The storage configurations defined for the runtime environment.
     * </p>
     */
    private java.util.List<StorageConfiguration> storageConfigurations;
    /**
     * <p>
     * The unique identifiers of the subnets assigned to this runtime environment.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The tags defined for this runtime environment.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The unique identifier for the VPC used with this runtime environment.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The number of instances included in the runtime environment. A standalone runtime environment has a maxiumum of
     * one instance. Currently, a high availability runtime environment has a maximum of two instances.
     * </p>
     * 
     * @param actualCapacity
     *        The number of instances included in the runtime environment. A standalone runtime environment has a
     *        maxiumum of one instance. Currently, a high availability runtime environment has a maximum of two
     *        instances.
     */

    public void setActualCapacity(Integer actualCapacity) {
        this.actualCapacity = actualCapacity;
    }

    /**
     * <p>
     * The number of instances included in the runtime environment. A standalone runtime environment has a maxiumum of
     * one instance. Currently, a high availability runtime environment has a maximum of two instances.
     * </p>
     * 
     * @return The number of instances included in the runtime environment. A standalone runtime environment has a
     *         maxiumum of one instance. Currently, a high availability runtime environment has a maximum of two
     *         instances.
     */

    public Integer getActualCapacity() {
        return this.actualCapacity;
    }

    /**
     * <p>
     * The number of instances included in the runtime environment. A standalone runtime environment has a maxiumum of
     * one instance. Currently, a high availability runtime environment has a maximum of two instances.
     * </p>
     * 
     * @param actualCapacity
     *        The number of instances included in the runtime environment. A standalone runtime environment has a
     *        maxiumum of one instance. Currently, a high availability runtime environment has a maximum of two
     *        instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withActualCapacity(Integer actualCapacity) {
        setActualCapacity(actualCapacity);
        return this;
    }

    /**
     * <p>
     * The timestamp when the runtime environment was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the runtime environment was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when the runtime environment was created.
     * </p>
     * 
     * @return The timestamp when the runtime environment was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp when the runtime environment was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the runtime environment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The description of the runtime environment.
     * </p>
     * 
     * @param description
     *        The description of the runtime environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the runtime environment.
     * </p>
     * 
     * @return The description of the runtime environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the runtime environment.
     * </p>
     * 
     * @param description
     *        The description of the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The target platform for the runtime environment.
     * </p>
     * 
     * @param engineType
     *        The target platform for the runtime environment.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * The target platform for the runtime environment.
     * </p>
     * 
     * @return The target platform for the runtime environment.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * The target platform for the runtime environment.
     * </p>
     * 
     * @param engineType
     *        The target platform for the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public GetEnvironmentResult withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * The target platform for the runtime environment.
     * </p>
     * 
     * @param engineType
     *        The target platform for the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public GetEnvironmentResult withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * <p>
     * The version of the runtime engine.
     * </p>
     * 
     * @param engineVersion
     *        The version of the runtime engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the runtime engine.
     * </p>
     * 
     * @return The version of the runtime engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the runtime engine.
     * </p>
     * 
     * @param engineVersion
     *        The version of the runtime engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the runtime environment.
     * </p>
     * 
     * @param environmentArn
     *        The Amazon Resource Name (ARN) of the runtime environment.
     */

    public void setEnvironmentArn(String environmentArn) {
        this.environmentArn = environmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the runtime environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the runtime environment.
     */

    public String getEnvironmentArn() {
        return this.environmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the runtime environment.
     * </p>
     * 
     * @param environmentArn
     *        The Amazon Resource Name (ARN) of the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withEnvironmentArn(String environmentArn) {
        setEnvironmentArn(environmentArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the runtime environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment.
     * </p>
     * 
     * @return The unique identifier of the runtime environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The desired capacity of the high availability configuration for the runtime environment.
     * </p>
     * 
     * @param highAvailabilityConfig
     *        The desired capacity of the high availability configuration for the runtime environment.
     */

    public void setHighAvailabilityConfig(HighAvailabilityConfig highAvailabilityConfig) {
        this.highAvailabilityConfig = highAvailabilityConfig;
    }

    /**
     * <p>
     * The desired capacity of the high availability configuration for the runtime environment.
     * </p>
     * 
     * @return The desired capacity of the high availability configuration for the runtime environment.
     */

    public HighAvailabilityConfig getHighAvailabilityConfig() {
        return this.highAvailabilityConfig;
    }

    /**
     * <p>
     * The desired capacity of the high availability configuration for the runtime environment.
     * </p>
     * 
     * @param highAvailabilityConfig
     *        The desired capacity of the high availability configuration for the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withHighAvailabilityConfig(HighAvailabilityConfig highAvailabilityConfig) {
        setHighAvailabilityConfig(highAvailabilityConfig);
        return this;
    }

    /**
     * <p>
     * The type of instance underlying the runtime environment.
     * </p>
     * 
     * @param instanceType
     *        The type of instance underlying the runtime environment.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of instance underlying the runtime environment.
     * </p>
     * 
     * @return The type of instance underlying the runtime environment.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of instance underlying the runtime environment.
     * </p>
     * 
     * @param instanceType
     *        The type of instance underlying the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The identifier of a customer managed key.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of a customer managed key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of a customer managed key.
     * </p>
     * 
     * @return The identifier of a customer managed key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of a customer managed key.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of a customer managed key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the load balancer used with the runtime environment.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) for the load balancer used with the runtime environment.
     */

    public void setLoadBalancerArn(String loadBalancerArn) {
        this.loadBalancerArn = loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the load balancer used with the runtime environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the load balancer used with the runtime environment.
     */

    public String getLoadBalancerArn() {
        return this.loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the load balancer used with the runtime environment.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) for the load balancer used with the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withLoadBalancerArn(String loadBalancerArn) {
        setLoadBalancerArn(loadBalancerArn);
        return this;
    }

    /**
     * <p>
     * The name of the runtime environment. Must be unique within the account.
     * </p>
     * 
     * @param name
     *        The name of the runtime environment. Must be unique within the account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the runtime environment. Must be unique within the account.
     * </p>
     * 
     * @return The name of the runtime environment. Must be unique within the account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the runtime environment. Must be unique within the account.
     * </p>
     * 
     * @param name
     *        The name of the runtime environment. Must be unique within the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Indicates the pending maintenance scheduled on this environment.
     * </p>
     * 
     * @param pendingMaintenance
     *        Indicates the pending maintenance scheduled on this environment.
     */

    public void setPendingMaintenance(PendingMaintenance pendingMaintenance) {
        this.pendingMaintenance = pendingMaintenance;
    }

    /**
     * <p>
     * Indicates the pending maintenance scheduled on this environment.
     * </p>
     * 
     * @return Indicates the pending maintenance scheduled on this environment.
     */

    public PendingMaintenance getPendingMaintenance() {
        return this.pendingMaintenance;
    }

    /**
     * <p>
     * Indicates the pending maintenance scheduled on this environment.
     * </p>
     * 
     * @param pendingMaintenance
     *        Indicates the pending maintenance scheduled on this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withPendingMaintenance(PendingMaintenance pendingMaintenance) {
        setPendingMaintenance(pendingMaintenance);
        return this;
    }

    /**
     * <p>
     * Configures the maintenance window you want for the runtime environment. If you do not provide a value, a random
     * system-generated value will be assigned.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Configures the maintenance window you want for the runtime environment. If you do not provide a value, a
     *        random system-generated value will be assigned.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Configures the maintenance window you want for the runtime environment. If you do not provide a value, a random
     * system-generated value will be assigned.
     * </p>
     * 
     * @return Configures the maintenance window you want for the runtime environment. If you do not provide a value, a
     *         random system-generated value will be assigned.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Configures the maintenance window you want for the runtime environment. If you do not provide a value, a random
     * system-generated value will be assigned.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Configures the maintenance window you want for the runtime environment. If you do not provide a value, a
     *        random system-generated value will be assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Whether applications running in this runtime environment are publicly accessible.
     * </p>
     * 
     * @param publiclyAccessible
     *        Whether applications running in this runtime environment are publicly accessible.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Whether applications running in this runtime environment are publicly accessible.
     * </p>
     * 
     * @return Whether applications running in this runtime environment are publicly accessible.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Whether applications running in this runtime environment are publicly accessible.
     * </p>
     * 
     * @param publiclyAccessible
     *        Whether applications running in this runtime environment are publicly accessible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Whether applications running in this runtime environment are publicly accessible.
     * </p>
     * 
     * @return Whether applications running in this runtime environment are publicly accessible.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The unique identifiers of the security groups assigned to this runtime environment.
     * </p>
     * 
     * @return The unique identifiers of the security groups assigned to this runtime environment.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The unique identifiers of the security groups assigned to this runtime environment.
     * </p>
     * 
     * @param securityGroupIds
     *        The unique identifiers of the security groups assigned to this runtime environment.
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
     * The unique identifiers of the security groups assigned to this runtime environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The unique identifiers of the security groups assigned to this runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withSecurityGroupIds(String... securityGroupIds) {
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
     * The unique identifiers of the security groups assigned to this runtime environment.
     * </p>
     * 
     * @param securityGroupIds
     *        The unique identifiers of the security groups assigned to this runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The status of the runtime environment.
     * </p>
     * 
     * @param status
     *        The status of the runtime environment.
     * @see EnvironmentLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the runtime environment.
     * </p>
     * 
     * @return The status of the runtime environment.
     * @see EnvironmentLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the runtime environment.
     * </p>
     * 
     * @param status
     *        The status of the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentLifecycle
     */

    public GetEnvironmentResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the runtime environment.
     * </p>
     * 
     * @param status
     *        The status of the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentLifecycle
     */

    public GetEnvironmentResult withStatus(EnvironmentLifecycle status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the reported status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the reported status.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the reported status.
     * </p>
     * 
     * @return The reason for the reported status.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the reported status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the reported status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The storage configurations defined for the runtime environment.
     * </p>
     * 
     * @return The storage configurations defined for the runtime environment.
     */

    public java.util.List<StorageConfiguration> getStorageConfigurations() {
        return storageConfigurations;
    }

    /**
     * <p>
     * The storage configurations defined for the runtime environment.
     * </p>
     * 
     * @param storageConfigurations
     *        The storage configurations defined for the runtime environment.
     */

    public void setStorageConfigurations(java.util.Collection<StorageConfiguration> storageConfigurations) {
        if (storageConfigurations == null) {
            this.storageConfigurations = null;
            return;
        }

        this.storageConfigurations = new java.util.ArrayList<StorageConfiguration>(storageConfigurations);
    }

    /**
     * <p>
     * The storage configurations defined for the runtime environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageConfigurations(java.util.Collection)} or
     * {@link #withStorageConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param storageConfigurations
     *        The storage configurations defined for the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withStorageConfigurations(StorageConfiguration... storageConfigurations) {
        if (this.storageConfigurations == null) {
            setStorageConfigurations(new java.util.ArrayList<StorageConfiguration>(storageConfigurations.length));
        }
        for (StorageConfiguration ele : storageConfigurations) {
            this.storageConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The storage configurations defined for the runtime environment.
     * </p>
     * 
     * @param storageConfigurations
     *        The storage configurations defined for the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withStorageConfigurations(java.util.Collection<StorageConfiguration> storageConfigurations) {
        setStorageConfigurations(storageConfigurations);
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the subnets assigned to this runtime environment.
     * </p>
     * 
     * @return The unique identifiers of the subnets assigned to this runtime environment.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The unique identifiers of the subnets assigned to this runtime environment.
     * </p>
     * 
     * @param subnetIds
     *        The unique identifiers of the subnets assigned to this runtime environment.
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
     * The unique identifiers of the subnets assigned to this runtime environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The unique identifiers of the subnets assigned to this runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withSubnetIds(String... subnetIds) {
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
     * The unique identifiers of the subnets assigned to this runtime environment.
     * </p>
     * 
     * @param subnetIds
     *        The unique identifiers of the subnets assigned to this runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The tags defined for this runtime environment.
     * </p>
     * 
     * @return The tags defined for this runtime environment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags defined for this runtime environment.
     * </p>
     * 
     * @param tags
     *        The tags defined for this runtime environment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags defined for this runtime environment.
     * </p>
     * 
     * @param tags
     *        The tags defined for this runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetEnvironmentResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the VPC used with this runtime environment.
     * </p>
     * 
     * @param vpcId
     *        The unique identifier for the VPC used with this runtime environment.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The unique identifier for the VPC used with this runtime environment.
     * </p>
     * 
     * @return The unique identifier for the VPC used with this runtime environment.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The unique identifier for the VPC used with this runtime environment.
     * </p>
     * 
     * @param vpcId
     *        The unique identifier for the VPC used with this runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getActualCapacity() != null)
            sb.append("ActualCapacity: ").append(getActualCapacity()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getEnvironmentArn() != null)
            sb.append("EnvironmentArn: ").append(getEnvironmentArn()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getHighAvailabilityConfig() != null)
            sb.append("HighAvailabilityConfig: ").append(getHighAvailabilityConfig()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getLoadBalancerArn() != null)
            sb.append("LoadBalancerArn: ").append(getLoadBalancerArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPendingMaintenance() != null)
            sb.append("PendingMaintenance: ").append(getPendingMaintenance()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getStorageConfigurations() != null)
            sb.append("StorageConfigurations: ").append(getStorageConfigurations()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnvironmentResult == false)
            return false;
        GetEnvironmentResult other = (GetEnvironmentResult) obj;
        if (other.getActualCapacity() == null ^ this.getActualCapacity() == null)
            return false;
        if (other.getActualCapacity() != null && other.getActualCapacity().equals(this.getActualCapacity()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEnvironmentArn() == null ^ this.getEnvironmentArn() == null)
            return false;
        if (other.getEnvironmentArn() != null && other.getEnvironmentArn().equals(this.getEnvironmentArn()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getHighAvailabilityConfig() == null ^ this.getHighAvailabilityConfig() == null)
            return false;
        if (other.getHighAvailabilityConfig() != null && other.getHighAvailabilityConfig().equals(this.getHighAvailabilityConfig()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getLoadBalancerArn() == null ^ this.getLoadBalancerArn() == null)
            return false;
        if (other.getLoadBalancerArn() != null && other.getLoadBalancerArn().equals(this.getLoadBalancerArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPendingMaintenance() == null ^ this.getPendingMaintenance() == null)
            return false;
        if (other.getPendingMaintenance() != null && other.getPendingMaintenance().equals(this.getPendingMaintenance()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getStorageConfigurations() == null ^ this.getStorageConfigurations() == null)
            return false;
        if (other.getStorageConfigurations() != null && other.getStorageConfigurations().equals(this.getStorageConfigurations()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActualCapacity() == null) ? 0 : getActualCapacity().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentArn() == null) ? 0 : getEnvironmentArn().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getHighAvailabilityConfig() == null) ? 0 : getHighAvailabilityConfig().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerArn() == null) ? 0 : getLoadBalancerArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPendingMaintenance() == null) ? 0 : getPendingMaintenance().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getStorageConfigurations() == null) ? 0 : getStorageConfigurations().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public GetEnvironmentResult clone() {
        try {
            return (GetEnvironmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
