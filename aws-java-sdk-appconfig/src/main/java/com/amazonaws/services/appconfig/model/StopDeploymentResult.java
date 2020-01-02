/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/StopDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopDeploymentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application that was deployed.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The ID of the environment that was deployed.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The ID of the deployment strategy that was deployed.
     * </p>
     */
    private String deploymentStrategyId;
    /**
     * <p>
     * The ID of the configuration profile that was deployed.
     * </p>
     */
    private String configurationProfileId;
    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     */
    private Integer deploymentNumber;
    /**
     * <p>
     * The name of the configuration.
     * </p>
     */
    private String configurationName;
    /**
     * <p>
     * Information about the source location of the configuration.
     * </p>
     */
    private String configurationLocationUri;
    /**
     * <p>
     * The configuration version that was deployed.
     * </p>
     */
    private String configurationVersion;
    /**
     * <p>
     * The description of the deployment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Total amount of time the deployment lasted.
     * </p>
     */
    private Integer deploymentDurationInMinutes;
    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     */
    private String growthType;
    /**
     * <p>
     * The percentage of targets to receive a deployed configuration during each interval.
     * </p>
     */
    private Float growthFactor;
    /**
     * <p>
     * The amount of time AppConfig monitored for alarms before considering the deployment to be complete and no longer
     * eligible for automatic roll back.
     * </p>
     */
    private Integer finalBakeTimeInMinutes;
    /**
     * <p>
     * The state of the deployment.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The percentage of targets for which the deployment is available.
     * </p>
     */
    private Float percentageComplete;
    /**
     * <p>
     * The time the deployment started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The time the deployment completed.
     * </p>
     */
    private java.util.Date completedAt;

    /**
     * <p>
     * The ID of the application that was deployed.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application that was deployed.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application that was deployed.
     * </p>
     * 
     * @return The ID of the application that was deployed.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application that was deployed.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application that was deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The ID of the environment that was deployed.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment that was deployed.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment that was deployed.
     * </p>
     * 
     * @return The ID of the environment that was deployed.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment that was deployed.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment that was deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The ID of the deployment strategy that was deployed.
     * </p>
     * 
     * @param deploymentStrategyId
     *        The ID of the deployment strategy that was deployed.
     */

    public void setDeploymentStrategyId(String deploymentStrategyId) {
        this.deploymentStrategyId = deploymentStrategyId;
    }

    /**
     * <p>
     * The ID of the deployment strategy that was deployed.
     * </p>
     * 
     * @return The ID of the deployment strategy that was deployed.
     */

    public String getDeploymentStrategyId() {
        return this.deploymentStrategyId;
    }

    /**
     * <p>
     * The ID of the deployment strategy that was deployed.
     * </p>
     * 
     * @param deploymentStrategyId
     *        The ID of the deployment strategy that was deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withDeploymentStrategyId(String deploymentStrategyId) {
        setDeploymentStrategyId(deploymentStrategyId);
        return this;
    }

    /**
     * <p>
     * The ID of the configuration profile that was deployed.
     * </p>
     * 
     * @param configurationProfileId
     *        The ID of the configuration profile that was deployed.
     */

    public void setConfigurationProfileId(String configurationProfileId) {
        this.configurationProfileId = configurationProfileId;
    }

    /**
     * <p>
     * The ID of the configuration profile that was deployed.
     * </p>
     * 
     * @return The ID of the configuration profile that was deployed.
     */

    public String getConfigurationProfileId() {
        return this.configurationProfileId;
    }

    /**
     * <p>
     * The ID of the configuration profile that was deployed.
     * </p>
     * 
     * @param configurationProfileId
     *        The ID of the configuration profile that was deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withConfigurationProfileId(String configurationProfileId) {
        setConfigurationProfileId(configurationProfileId);
        return this;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     * 
     * @param deploymentNumber
     *        The sequence number of the deployment.
     */

    public void setDeploymentNumber(Integer deploymentNumber) {
        this.deploymentNumber = deploymentNumber;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     * 
     * @return The sequence number of the deployment.
     */

    public Integer getDeploymentNumber() {
        return this.deploymentNumber;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     * 
     * @param deploymentNumber
     *        The sequence number of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withDeploymentNumber(Integer deploymentNumber) {
        setDeploymentNumber(deploymentNumber);
        return this;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @param configurationName
     *        The name of the configuration.
     */

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @return The name of the configuration.
     */

    public String getConfigurationName() {
        return this.configurationName;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @param configurationName
     *        The name of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withConfigurationName(String configurationName) {
        setConfigurationName(configurationName);
        return this;
    }

    /**
     * <p>
     * Information about the source location of the configuration.
     * </p>
     * 
     * @param configurationLocationUri
     *        Information about the source location of the configuration.
     */

    public void setConfigurationLocationUri(String configurationLocationUri) {
        this.configurationLocationUri = configurationLocationUri;
    }

    /**
     * <p>
     * Information about the source location of the configuration.
     * </p>
     * 
     * @return Information about the source location of the configuration.
     */

    public String getConfigurationLocationUri() {
        return this.configurationLocationUri;
    }

    /**
     * <p>
     * Information about the source location of the configuration.
     * </p>
     * 
     * @param configurationLocationUri
     *        Information about the source location of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withConfigurationLocationUri(String configurationLocationUri) {
        setConfigurationLocationUri(configurationLocationUri);
        return this;
    }

    /**
     * <p>
     * The configuration version that was deployed.
     * </p>
     * 
     * @param configurationVersion
     *        The configuration version that was deployed.
     */

    public void setConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
    }

    /**
     * <p>
     * The configuration version that was deployed.
     * </p>
     * 
     * @return The configuration version that was deployed.
     */

    public String getConfigurationVersion() {
        return this.configurationVersion;
    }

    /**
     * <p>
     * The configuration version that was deployed.
     * </p>
     * 
     * @param configurationVersion
     *        The configuration version that was deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withConfigurationVersion(String configurationVersion) {
        setConfigurationVersion(configurationVersion);
        return this;
    }

    /**
     * <p>
     * The description of the deployment.
     * </p>
     * 
     * @param description
     *        The description of the deployment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the deployment.
     * </p>
     * 
     * @return The description of the deployment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the deployment.
     * </p>
     * 
     * @param description
     *        The description of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Total amount of time the deployment lasted.
     * </p>
     * 
     * @param deploymentDurationInMinutes
     *        Total amount of time the deployment lasted.
     */

    public void setDeploymentDurationInMinutes(Integer deploymentDurationInMinutes) {
        this.deploymentDurationInMinutes = deploymentDurationInMinutes;
    }

    /**
     * <p>
     * Total amount of time the deployment lasted.
     * </p>
     * 
     * @return Total amount of time the deployment lasted.
     */

    public Integer getDeploymentDurationInMinutes() {
        return this.deploymentDurationInMinutes;
    }

    /**
     * <p>
     * Total amount of time the deployment lasted.
     * </p>
     * 
     * @param deploymentDurationInMinutes
     *        Total amount of time the deployment lasted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withDeploymentDurationInMinutes(Integer deploymentDurationInMinutes) {
        setDeploymentDurationInMinutes(deploymentDurationInMinutes);
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * 
     * @param growthType
     *        The algorithm used to define how percentage grew over time.
     * @see GrowthType
     */

    public void setGrowthType(String growthType) {
        this.growthType = growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * 
     * @return The algorithm used to define how percentage grew over time.
     * @see GrowthType
     */

    public String getGrowthType() {
        return this.growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * 
     * @param growthType
     *        The algorithm used to define how percentage grew over time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrowthType
     */

    public StopDeploymentResult withGrowthType(String growthType) {
        setGrowthType(growthType);
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grew over time.
     * </p>
     * 
     * @param growthType
     *        The algorithm used to define how percentage grew over time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrowthType
     */

    public StopDeploymentResult withGrowthType(GrowthType growthType) {
        this.growthType = growthType.toString();
        return this;
    }

    /**
     * <p>
     * The percentage of targets to receive a deployed configuration during each interval.
     * </p>
     * 
     * @param growthFactor
     *        The percentage of targets to receive a deployed configuration during each interval.
     */

    public void setGrowthFactor(Float growthFactor) {
        this.growthFactor = growthFactor;
    }

    /**
     * <p>
     * The percentage of targets to receive a deployed configuration during each interval.
     * </p>
     * 
     * @return The percentage of targets to receive a deployed configuration during each interval.
     */

    public Float getGrowthFactor() {
        return this.growthFactor;
    }

    /**
     * <p>
     * The percentage of targets to receive a deployed configuration during each interval.
     * </p>
     * 
     * @param growthFactor
     *        The percentage of targets to receive a deployed configuration during each interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withGrowthFactor(Float growthFactor) {
        setGrowthFactor(growthFactor);
        return this;
    }

    /**
     * <p>
     * The amount of time AppConfig monitored for alarms before considering the deployment to be complete and no longer
     * eligible for automatic roll back.
     * </p>
     * 
     * @param finalBakeTimeInMinutes
     *        The amount of time AppConfig monitored for alarms before considering the deployment to be complete and no
     *        longer eligible for automatic roll back.
     */

    public void setFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
        this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time AppConfig monitored for alarms before considering the deployment to be complete and no longer
     * eligible for automatic roll back.
     * </p>
     * 
     * @return The amount of time AppConfig monitored for alarms before considering the deployment to be complete and no
     *         longer eligible for automatic roll back.
     */

    public Integer getFinalBakeTimeInMinutes() {
        return this.finalBakeTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time AppConfig monitored for alarms before considering the deployment to be complete and no longer
     * eligible for automatic roll back.
     * </p>
     * 
     * @param finalBakeTimeInMinutes
     *        The amount of time AppConfig monitored for alarms before considering the deployment to be complete and no
     *        longer eligible for automatic roll back.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
        setFinalBakeTimeInMinutes(finalBakeTimeInMinutes);
        return this;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * 
     * @param state
     *        The state of the deployment.
     * @see DeploymentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * 
     * @return The state of the deployment.
     * @see DeploymentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * 
     * @param state
     *        The state of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentState
     */

    public StopDeploymentResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * 
     * @param state
     *        The state of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentState
     */

    public StopDeploymentResult withState(DeploymentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The percentage of targets for which the deployment is available.
     * </p>
     * 
     * @param percentageComplete
     *        The percentage of targets for which the deployment is available.
     */

    public void setPercentageComplete(Float percentageComplete) {
        this.percentageComplete = percentageComplete;
    }

    /**
     * <p>
     * The percentage of targets for which the deployment is available.
     * </p>
     * 
     * @return The percentage of targets for which the deployment is available.
     */

    public Float getPercentageComplete() {
        return this.percentageComplete;
    }

    /**
     * <p>
     * The percentage of targets for which the deployment is available.
     * </p>
     * 
     * @param percentageComplete
     *        The percentage of targets for which the deployment is available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withPercentageComplete(Float percentageComplete) {
        setPercentageComplete(percentageComplete);
        return this;
    }

    /**
     * <p>
     * The time the deployment started.
     * </p>
     * 
     * @param startedAt
     *        The time the deployment started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time the deployment started.
     * </p>
     * 
     * @return The time the deployment started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The time the deployment started.
     * </p>
     * 
     * @param startedAt
     *        The time the deployment started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The time the deployment completed.
     * </p>
     * 
     * @param completedAt
     *        The time the deployment completed.
     */

    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * The time the deployment completed.
     * </p>
     * 
     * @return The time the deployment completed.
     */

    public java.util.Date getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * The time the deployment completed.
     * </p>
     * 
     * @param completedAt
     *        The time the deployment completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withCompletedAt(java.util.Date completedAt) {
        setCompletedAt(completedAt);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getDeploymentStrategyId() != null)
            sb.append("DeploymentStrategyId: ").append(getDeploymentStrategyId()).append(",");
        if (getConfigurationProfileId() != null)
            sb.append("ConfigurationProfileId: ").append(getConfigurationProfileId()).append(",");
        if (getDeploymentNumber() != null)
            sb.append("DeploymentNumber: ").append(getDeploymentNumber()).append(",");
        if (getConfigurationName() != null)
            sb.append("ConfigurationName: ").append(getConfigurationName()).append(",");
        if (getConfigurationLocationUri() != null)
            sb.append("ConfigurationLocationUri: ").append(getConfigurationLocationUri()).append(",");
        if (getConfigurationVersion() != null)
            sb.append("ConfigurationVersion: ").append(getConfigurationVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDeploymentDurationInMinutes() != null)
            sb.append("DeploymentDurationInMinutes: ").append(getDeploymentDurationInMinutes()).append(",");
        if (getGrowthType() != null)
            sb.append("GrowthType: ").append(getGrowthType()).append(",");
        if (getGrowthFactor() != null)
            sb.append("GrowthFactor: ").append(getGrowthFactor()).append(",");
        if (getFinalBakeTimeInMinutes() != null)
            sb.append("FinalBakeTimeInMinutes: ").append(getFinalBakeTimeInMinutes()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getPercentageComplete() != null)
            sb.append("PercentageComplete: ").append(getPercentageComplete()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getCompletedAt() != null)
            sb.append("CompletedAt: ").append(getCompletedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDeploymentResult == false)
            return false;
        StopDeploymentResult other = (StopDeploymentResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getDeploymentStrategyId() == null ^ this.getDeploymentStrategyId() == null)
            return false;
        if (other.getDeploymentStrategyId() != null && other.getDeploymentStrategyId().equals(this.getDeploymentStrategyId()) == false)
            return false;
        if (other.getConfigurationProfileId() == null ^ this.getConfigurationProfileId() == null)
            return false;
        if (other.getConfigurationProfileId() != null && other.getConfigurationProfileId().equals(this.getConfigurationProfileId()) == false)
            return false;
        if (other.getDeploymentNumber() == null ^ this.getDeploymentNumber() == null)
            return false;
        if (other.getDeploymentNumber() != null && other.getDeploymentNumber().equals(this.getDeploymentNumber()) == false)
            return false;
        if (other.getConfigurationName() == null ^ this.getConfigurationName() == null)
            return false;
        if (other.getConfigurationName() != null && other.getConfigurationName().equals(this.getConfigurationName()) == false)
            return false;
        if (other.getConfigurationLocationUri() == null ^ this.getConfigurationLocationUri() == null)
            return false;
        if (other.getConfigurationLocationUri() != null && other.getConfigurationLocationUri().equals(this.getConfigurationLocationUri()) == false)
            return false;
        if (other.getConfigurationVersion() == null ^ this.getConfigurationVersion() == null)
            return false;
        if (other.getConfigurationVersion() != null && other.getConfigurationVersion().equals(this.getConfigurationVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeploymentDurationInMinutes() == null ^ this.getDeploymentDurationInMinutes() == null)
            return false;
        if (other.getDeploymentDurationInMinutes() != null && other.getDeploymentDurationInMinutes().equals(this.getDeploymentDurationInMinutes()) == false)
            return false;
        if (other.getGrowthType() == null ^ this.getGrowthType() == null)
            return false;
        if (other.getGrowthType() != null && other.getGrowthType().equals(this.getGrowthType()) == false)
            return false;
        if (other.getGrowthFactor() == null ^ this.getGrowthFactor() == null)
            return false;
        if (other.getGrowthFactor() != null && other.getGrowthFactor().equals(this.getGrowthFactor()) == false)
            return false;
        if (other.getFinalBakeTimeInMinutes() == null ^ this.getFinalBakeTimeInMinutes() == null)
            return false;
        if (other.getFinalBakeTimeInMinutes() != null && other.getFinalBakeTimeInMinutes().equals(this.getFinalBakeTimeInMinutes()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPercentageComplete() == null ^ this.getPercentageComplete() == null)
            return false;
        if (other.getPercentageComplete() != null && other.getPercentageComplete().equals(this.getPercentageComplete()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStrategyId() == null) ? 0 : getDeploymentStrategyId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationProfileId() == null) ? 0 : getConfigurationProfileId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentNumber() == null) ? 0 : getDeploymentNumber().hashCode());
        hashCode = prime * hashCode + ((getConfigurationName() == null) ? 0 : getConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getConfigurationLocationUri() == null) ? 0 : getConfigurationLocationUri().hashCode());
        hashCode = prime * hashCode + ((getConfigurationVersion() == null) ? 0 : getConfigurationVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeploymentDurationInMinutes() == null) ? 0 : getDeploymentDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getGrowthType() == null) ? 0 : getGrowthType().hashCode());
        hashCode = prime * hashCode + ((getGrowthFactor() == null) ? 0 : getGrowthFactor().hashCode());
        hashCode = prime * hashCode + ((getFinalBakeTimeInMinutes() == null) ? 0 : getFinalBakeTimeInMinutes().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPercentageComplete() == null) ? 0 : getPercentageComplete().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        return hashCode;
    }

    @Override
    public StopDeploymentResult clone() {
        try {
            return (StopDeploymentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
