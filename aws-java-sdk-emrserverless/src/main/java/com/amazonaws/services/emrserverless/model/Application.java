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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an application. EMR Serverless uses applications to run jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/Application" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Application implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the application.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The EMR release version associated with the application.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * The type of application, such as Spark or Hive.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The state of the application.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The state details of the application.
     * </p>
     */
    private String stateDetails;
    /**
     * <p>
     * The initial capacity of the application.
     * </p>
     */
    private java.util.Map<String, InitialCapacityConfig> initialCapacity;
    /**
     * <p>
     * The maximum capacity of the application. This is cumulative across all workers at any given point in time during
     * the lifespan of the application is created. No new resources will be created once any one of the defined limits
     * is hit.
     * </p>
     */
    private MaximumAllowedResources maximumCapacity;
    /**
     * <p>
     * The date and time when the application run was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time when the application run was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The tags assigned to the application.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The configuration for an application to automatically start on job submission.
     * </p>
     */
    private AutoStartConfig autoStartConfiguration;
    /**
     * <p>
     * The configuration for an application to automatically stop after a certain amount of time being idle.
     * </p>
     */
    private AutoStopConfig autoStopConfiguration;
    /**
     * <p>
     * The network configuration for customer VPC connectivity for the application.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     */
    private String architecture;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param arn
     *        The ARN of the application.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @return The ARN of the application.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param arn
     *        The ARN of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The EMR release version associated with the application.
     * </p>
     * 
     * @param releaseLabel
     *        The EMR release version associated with the application.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The EMR release version associated with the application.
     * </p>
     * 
     * @return The EMR release version associated with the application.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The EMR release version associated with the application.
     * </p>
     * 
     * @param releaseLabel
     *        The EMR release version associated with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * The type of application, such as Spark or Hive.
     * </p>
     * 
     * @param type
     *        The type of application, such as Spark or Hive.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of application, such as Spark or Hive.
     * </p>
     * 
     * @return The type of application, such as Spark or Hive.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of application, such as Spark or Hive.
     * </p>
     * 
     * @param type
     *        The type of application, such as Spark or Hive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The state of the application.
     * </p>
     * 
     * @param state
     *        The state of the application.
     * @see ApplicationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the application.
     * </p>
     * 
     * @return The state of the application.
     * @see ApplicationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the application.
     * </p>
     * 
     * @param state
     *        The state of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationState
     */

    public Application withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the application.
     * </p>
     * 
     * @param state
     *        The state of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationState
     */

    public Application withState(ApplicationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The state details of the application.
     * </p>
     * 
     * @param stateDetails
     *        The state details of the application.
     */

    public void setStateDetails(String stateDetails) {
        this.stateDetails = stateDetails;
    }

    /**
     * <p>
     * The state details of the application.
     * </p>
     * 
     * @return The state details of the application.
     */

    public String getStateDetails() {
        return this.stateDetails;
    }

    /**
     * <p>
     * The state details of the application.
     * </p>
     * 
     * @param stateDetails
     *        The state details of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withStateDetails(String stateDetails) {
        setStateDetails(stateDetails);
        return this;
    }

    /**
     * <p>
     * The initial capacity of the application.
     * </p>
     * 
     * @return The initial capacity of the application.
     */

    public java.util.Map<String, InitialCapacityConfig> getInitialCapacity() {
        return initialCapacity;
    }

    /**
     * <p>
     * The initial capacity of the application.
     * </p>
     * 
     * @param initialCapacity
     *        The initial capacity of the application.
     */

    public void setInitialCapacity(java.util.Map<String, InitialCapacityConfig> initialCapacity) {
        this.initialCapacity = initialCapacity;
    }

    /**
     * <p>
     * The initial capacity of the application.
     * </p>
     * 
     * @param initialCapacity
     *        The initial capacity of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withInitialCapacity(java.util.Map<String, InitialCapacityConfig> initialCapacity) {
        setInitialCapacity(initialCapacity);
        return this;
    }

    /**
     * Add a single InitialCapacity entry
     *
     * @see Application#withInitialCapacity
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Application addInitialCapacityEntry(String key, InitialCapacityConfig value) {
        if (null == this.initialCapacity) {
            this.initialCapacity = new java.util.HashMap<String, InitialCapacityConfig>();
        }
        if (this.initialCapacity.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.initialCapacity.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into InitialCapacity.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application clearInitialCapacityEntries() {
        this.initialCapacity = null;
        return this;
    }

    /**
     * <p>
     * The maximum capacity of the application. This is cumulative across all workers at any given point in time during
     * the lifespan of the application is created. No new resources will be created once any one of the defined limits
     * is hit.
     * </p>
     * 
     * @param maximumCapacity
     *        The maximum capacity of the application. This is cumulative across all workers at any given point in time
     *        during the lifespan of the application is created. No new resources will be created once any one of the
     *        defined limits is hit.
     */

    public void setMaximumCapacity(MaximumAllowedResources maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    /**
     * <p>
     * The maximum capacity of the application. This is cumulative across all workers at any given point in time during
     * the lifespan of the application is created. No new resources will be created once any one of the defined limits
     * is hit.
     * </p>
     * 
     * @return The maximum capacity of the application. This is cumulative across all workers at any given point in time
     *         during the lifespan of the application is created. No new resources will be created once any one of the
     *         defined limits is hit.
     */

    public MaximumAllowedResources getMaximumCapacity() {
        return this.maximumCapacity;
    }

    /**
     * <p>
     * The maximum capacity of the application. This is cumulative across all workers at any given point in time during
     * the lifespan of the application is created. No new resources will be created once any one of the defined limits
     * is hit.
     * </p>
     * 
     * @param maximumCapacity
     *        The maximum capacity of the application. This is cumulative across all workers at any given point in time
     *        during the lifespan of the application is created. No new resources will be created once any one of the
     *        defined limits is hit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withMaximumCapacity(MaximumAllowedResources maximumCapacity) {
        setMaximumCapacity(maximumCapacity);
        return this;
    }

    /**
     * <p>
     * The date and time when the application run was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the application run was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the application run was created.
     * </p>
     * 
     * @return The date and time when the application run was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the application run was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the application run was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time when the application run was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the application run was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time when the application run was last updated.
     * </p>
     * 
     * @return The date and time when the application run was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time when the application run was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the application run was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the application.
     * </p>
     * 
     * @return The tags assigned to the application.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the application.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the application.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the application.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Application#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Application addTagsEntry(String key, String value) {
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

    public Application clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The configuration for an application to automatically start on job submission.
     * </p>
     * 
     * @param autoStartConfiguration
     *        The configuration for an application to automatically start on job submission.
     */

    public void setAutoStartConfiguration(AutoStartConfig autoStartConfiguration) {
        this.autoStartConfiguration = autoStartConfiguration;
    }

    /**
     * <p>
     * The configuration for an application to automatically start on job submission.
     * </p>
     * 
     * @return The configuration for an application to automatically start on job submission.
     */

    public AutoStartConfig getAutoStartConfiguration() {
        return this.autoStartConfiguration;
    }

    /**
     * <p>
     * The configuration for an application to automatically start on job submission.
     * </p>
     * 
     * @param autoStartConfiguration
     *        The configuration for an application to automatically start on job submission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withAutoStartConfiguration(AutoStartConfig autoStartConfiguration) {
        setAutoStartConfiguration(autoStartConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration for an application to automatically stop after a certain amount of time being idle.
     * </p>
     * 
     * @param autoStopConfiguration
     *        The configuration for an application to automatically stop after a certain amount of time being idle.
     */

    public void setAutoStopConfiguration(AutoStopConfig autoStopConfiguration) {
        this.autoStopConfiguration = autoStopConfiguration;
    }

    /**
     * <p>
     * The configuration for an application to automatically stop after a certain amount of time being idle.
     * </p>
     * 
     * @return The configuration for an application to automatically stop after a certain amount of time being idle.
     */

    public AutoStopConfig getAutoStopConfiguration() {
        return this.autoStopConfiguration;
    }

    /**
     * <p>
     * The configuration for an application to automatically stop after a certain amount of time being idle.
     * </p>
     * 
     * @param autoStopConfiguration
     *        The configuration for an application to automatically stop after a certain amount of time being idle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withAutoStopConfiguration(AutoStopConfig autoStopConfiguration) {
        setAutoStopConfiguration(autoStopConfiguration);
        return this;
    }

    /**
     * <p>
     * The network configuration for customer VPC connectivity for the application.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for customer VPC connectivity for the application.
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for customer VPC connectivity for the application.
     * </p>
     * 
     * @return The network configuration for customer VPC connectivity for the application.
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for customer VPC connectivity for the application.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for customer VPC connectivity for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     * 
     * @param architecture
     *        The CPU architecture of an application.
     * @see Architecture
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     * 
     * @return The CPU architecture of an application.
     * @see Architecture
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     * 
     * @param architecture
     *        The CPU architecture of an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public Application withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     * 
     * @param architecture
     *        The CPU architecture of an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public Application withArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateDetails() != null)
            sb.append("StateDetails: ").append(getStateDetails()).append(",");
        if (getInitialCapacity() != null)
            sb.append("InitialCapacity: ").append(getInitialCapacity()).append(",");
        if (getMaximumCapacity() != null)
            sb.append("MaximumCapacity: ").append(getMaximumCapacity()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAutoStartConfiguration() != null)
            sb.append("AutoStartConfiguration: ").append(getAutoStartConfiguration()).append(",");
        if (getAutoStopConfiguration() != null)
            sb.append("AutoStopConfiguration: ").append(getAutoStopConfiguration()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Application == false)
            return false;
        Application other = (Application) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateDetails() == null ^ this.getStateDetails() == null)
            return false;
        if (other.getStateDetails() != null && other.getStateDetails().equals(this.getStateDetails()) == false)
            return false;
        if (other.getInitialCapacity() == null ^ this.getInitialCapacity() == null)
            return false;
        if (other.getInitialCapacity() != null && other.getInitialCapacity().equals(this.getInitialCapacity()) == false)
            return false;
        if (other.getMaximumCapacity() == null ^ this.getMaximumCapacity() == null)
            return false;
        if (other.getMaximumCapacity() != null && other.getMaximumCapacity().equals(this.getMaximumCapacity()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAutoStartConfiguration() == null ^ this.getAutoStartConfiguration() == null)
            return false;
        if (other.getAutoStartConfiguration() != null && other.getAutoStartConfiguration().equals(this.getAutoStartConfiguration()) == false)
            return false;
        if (other.getAutoStopConfiguration() == null ^ this.getAutoStopConfiguration() == null)
            return false;
        if (other.getAutoStopConfiguration() != null && other.getAutoStopConfiguration().equals(this.getAutoStopConfiguration()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateDetails() == null) ? 0 : getStateDetails().hashCode());
        hashCode = prime * hashCode + ((getInitialCapacity() == null) ? 0 : getInitialCapacity().hashCode());
        hashCode = prime * hashCode + ((getMaximumCapacity() == null) ? 0 : getMaximumCapacity().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAutoStartConfiguration() == null) ? 0 : getAutoStartConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAutoStopConfiguration() == null) ? 0 : getAutoStopConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        return hashCode;
    }

    @Override
    public Application clone() {
        try {
            return (Application) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.ApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
