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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create an environment.
     * The service generates the clientToken when the API call is triggered. The token expires after one hour, so if you
     * retry the API within this timeframe with the same clientToken, you will get the same response. The service also
     * handles deleting the clientToken after it expires.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The description of the runtime environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The engine type for the runtime environment.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * The version of the engine type for the runtime environment.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The details of a high availability configuration for this runtime environment.
     * </p>
     */
    private HighAvailabilityConfig highAvailabilityConfig;
    /**
     * <p>
     * The type of instance for the runtime environment.
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
     * The name of the runtime environment. Must be unique within the account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Configures the maintenance window you want for the runtime environment. If you do not provide a value, a random
     * system-generated value will be assigned.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Specifies whether the runtime environment is publicly accessible.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The list of security groups for the VPC associated with this runtime environment.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * Optional. The storage configurations for this runtime environment.
     * </p>
     */
    private java.util.List<StorageConfiguration> storageConfigurations;
    /**
     * <p>
     * The list of subnets associated with the VPC for this runtime environment.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The tags for the runtime environment.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create an environment.
     * The service generates the clientToken when the API call is triggered. The token expires after one hour, so if you
     * retry the API within this timeframe with the same clientToken, you will get the same response. The service also
     * handles deleting the clientToken after it expires.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create an
     *        environment. The service generates the clientToken when the API call is triggered. The token expires after
     *        one hour, so if you retry the API within this timeframe with the same clientToken, you will get the same
     *        response. The service also handles deleting the clientToken after it expires.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create an environment.
     * The service generates the clientToken when the API call is triggered. The token expires after one hour, so if you
     * retry the API within this timeframe with the same clientToken, you will get the same response. The service also
     * handles deleting the clientToken after it expires.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create an
     *         environment. The service generates the clientToken when the API call is triggered. The token expires
     *         after one hour, so if you retry the API within this timeframe with the same clientToken, you will get the
     *         same response. The service also handles deleting the clientToken after it expires.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create an environment.
     * The service generates the clientToken when the API call is triggered. The token expires after one hour, so if you
     * retry the API within this timeframe with the same clientToken, you will get the same response. The service also
     * handles deleting the clientToken after it expires.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create an
     *        environment. The service generates the clientToken when the API call is triggered. The token expires after
     *        one hour, so if you retry the API within this timeframe with the same clientToken, you will get the same
     *        response. The service also handles deleting the clientToken after it expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The engine type for the runtime environment.
     * </p>
     * 
     * @param engineType
     *        The engine type for the runtime environment.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * The engine type for the runtime environment.
     * </p>
     * 
     * @return The engine type for the runtime environment.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * The engine type for the runtime environment.
     * </p>
     * 
     * @param engineType
     *        The engine type for the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public CreateEnvironmentRequest withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * The engine type for the runtime environment.
     * </p>
     * 
     * @param engineType
     *        The engine type for the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public CreateEnvironmentRequest withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * <p>
     * The version of the engine type for the runtime environment.
     * </p>
     * 
     * @param engineVersion
     *        The version of the engine type for the runtime environment.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the engine type for the runtime environment.
     * </p>
     * 
     * @return The version of the engine type for the runtime environment.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the engine type for the runtime environment.
     * </p>
     * 
     * @param engineVersion
     *        The version of the engine type for the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The details of a high availability configuration for this runtime environment.
     * </p>
     * 
     * @param highAvailabilityConfig
     *        The details of a high availability configuration for this runtime environment.
     */

    public void setHighAvailabilityConfig(HighAvailabilityConfig highAvailabilityConfig) {
        this.highAvailabilityConfig = highAvailabilityConfig;
    }

    /**
     * <p>
     * The details of a high availability configuration for this runtime environment.
     * </p>
     * 
     * @return The details of a high availability configuration for this runtime environment.
     */

    public HighAvailabilityConfig getHighAvailabilityConfig() {
        return this.highAvailabilityConfig;
    }

    /**
     * <p>
     * The details of a high availability configuration for this runtime environment.
     * </p>
     * 
     * @param highAvailabilityConfig
     *        The details of a high availability configuration for this runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withHighAvailabilityConfig(HighAvailabilityConfig highAvailabilityConfig) {
        setHighAvailabilityConfig(highAvailabilityConfig);
        return this;
    }

    /**
     * <p>
     * The type of instance for the runtime environment.
     * </p>
     * 
     * @param instanceType
     *        The type of instance for the runtime environment.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of instance for the runtime environment.
     * </p>
     * 
     * @return The type of instance for the runtime environment.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of instance for the runtime environment.
     * </p>
     * 
     * @param instanceType
     *        The type of instance for the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withInstanceType(String instanceType) {
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

    public CreateEnvironmentRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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

    public CreateEnvironmentRequest withName(String name) {
        setName(name);
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

    public CreateEnvironmentRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Specifies whether the runtime environment is publicly accessible.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies whether the runtime environment is publicly accessible.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies whether the runtime environment is publicly accessible.
     * </p>
     * 
     * @return Specifies whether the runtime environment is publicly accessible.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies whether the runtime environment is publicly accessible.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies whether the runtime environment is publicly accessible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies whether the runtime environment is publicly accessible.
     * </p>
     * 
     * @return Specifies whether the runtime environment is publicly accessible.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The list of security groups for the VPC associated with this runtime environment.
     * </p>
     * 
     * @return The list of security groups for the VPC associated with this runtime environment.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The list of security groups for the VPC associated with this runtime environment.
     * </p>
     * 
     * @param securityGroupIds
     *        The list of security groups for the VPC associated with this runtime environment.
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
     * The list of security groups for the VPC associated with this runtime environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The list of security groups for the VPC associated with this runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * The list of security groups for the VPC associated with this runtime environment.
     * </p>
     * 
     * @param securityGroupIds
     *        The list of security groups for the VPC associated with this runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * Optional. The storage configurations for this runtime environment.
     * </p>
     * 
     * @return Optional. The storage configurations for this runtime environment.
     */

    public java.util.List<StorageConfiguration> getStorageConfigurations() {
        return storageConfigurations;
    }

    /**
     * <p>
     * Optional. The storage configurations for this runtime environment.
     * </p>
     * 
     * @param storageConfigurations
     *        Optional. The storage configurations for this runtime environment.
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
     * Optional. The storage configurations for this runtime environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageConfigurations(java.util.Collection)} or
     * {@link #withStorageConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param storageConfigurations
     *        Optional. The storage configurations for this runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withStorageConfigurations(StorageConfiguration... storageConfigurations) {
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
     * Optional. The storage configurations for this runtime environment.
     * </p>
     * 
     * @param storageConfigurations
     *        Optional. The storage configurations for this runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withStorageConfigurations(java.util.Collection<StorageConfiguration> storageConfigurations) {
        setStorageConfigurations(storageConfigurations);
        return this;
    }

    /**
     * <p>
     * The list of subnets associated with the VPC for this runtime environment.
     * </p>
     * 
     * @return The list of subnets associated with the VPC for this runtime environment.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The list of subnets associated with the VPC for this runtime environment.
     * </p>
     * 
     * @param subnetIds
     *        The list of subnets associated with the VPC for this runtime environment.
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
     * The list of subnets associated with the VPC for this runtime environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The list of subnets associated with the VPC for this runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withSubnetIds(String... subnetIds) {
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
     * The list of subnets associated with the VPC for this runtime environment.
     * </p>
     * 
     * @param subnetIds
     *        The list of subnets associated with the VPC for this runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The tags for the runtime environment.
     * </p>
     * 
     * @return The tags for the runtime environment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the runtime environment.
     * </p>
     * 
     * @param tags
     *        The tags for the runtime environment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the runtime environment.
     * </p>
     * 
     * @param tags
     *        The tags for the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateEnvironmentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest addTagsEntry(String key, String value) {
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

    public CreateEnvironmentRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getHighAvailabilityConfig() != null)
            sb.append("HighAvailabilityConfig: ").append(getHighAvailabilityConfig()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getStorageConfigurations() != null)
            sb.append("StorageConfigurations: ").append(getStorageConfigurations()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEnvironmentRequest == false)
            return false;
        CreateEnvironmentRequest other = (CreateEnvironmentRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getHighAvailabilityConfig() == null) ? 0 : getHighAvailabilityConfig().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getStorageConfigurations() == null) ? 0 : getStorageConfigurations().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentRequest clone() {
        return (CreateEnvironmentRequest) super.clone();
    }

}
