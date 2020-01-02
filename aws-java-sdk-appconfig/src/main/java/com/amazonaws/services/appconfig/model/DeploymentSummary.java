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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeploymentSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The version of the configuration.
     * </p>
     */
    private String configurationVersion;
    /**
     * <p>
     * Total amount of time the deployment lasted.
     * </p>
     */
    private Integer deploymentDurationInMinutes;
    /**
     * <p>
     * The algorithm used to define how percentage grows over time.
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
     * The amount of time AppConfig monitors for alarms before considering the deployment to be complete and no longer
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
     * Time the deployment started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * Time the deployment completed.
     * </p>
     */
    private java.util.Date completedAt;

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

    public DeploymentSummary withDeploymentNumber(Integer deploymentNumber) {
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

    public DeploymentSummary withConfigurationName(String configurationName) {
        setConfigurationName(configurationName);
        return this;
    }

    /**
     * <p>
     * The version of the configuration.
     * </p>
     * 
     * @param configurationVersion
     *        The version of the configuration.
     */

    public void setConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
    }

    /**
     * <p>
     * The version of the configuration.
     * </p>
     * 
     * @return The version of the configuration.
     */

    public String getConfigurationVersion() {
        return this.configurationVersion;
    }

    /**
     * <p>
     * The version of the configuration.
     * </p>
     * 
     * @param configurationVersion
     *        The version of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withConfigurationVersion(String configurationVersion) {
        setConfigurationVersion(configurationVersion);
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

    public DeploymentSummary withDeploymentDurationInMinutes(Integer deploymentDurationInMinutes) {
        setDeploymentDurationInMinutes(deploymentDurationInMinutes);
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time.
     * </p>
     * 
     * @param growthType
     *        The algorithm used to define how percentage grows over time.
     * @see GrowthType
     */

    public void setGrowthType(String growthType) {
        this.growthType = growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time.
     * </p>
     * 
     * @return The algorithm used to define how percentage grows over time.
     * @see GrowthType
     */

    public String getGrowthType() {
        return this.growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time.
     * </p>
     * 
     * @param growthType
     *        The algorithm used to define how percentage grows over time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrowthType
     */

    public DeploymentSummary withGrowthType(String growthType) {
        setGrowthType(growthType);
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time.
     * </p>
     * 
     * @param growthType
     *        The algorithm used to define how percentage grows over time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrowthType
     */

    public DeploymentSummary withGrowthType(GrowthType growthType) {
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

    public DeploymentSummary withGrowthFactor(Float growthFactor) {
        setGrowthFactor(growthFactor);
        return this;
    }

    /**
     * <p>
     * The amount of time AppConfig monitors for alarms before considering the deployment to be complete and no longer
     * eligible for automatic roll back.
     * </p>
     * 
     * @param finalBakeTimeInMinutes
     *        The amount of time AppConfig monitors for alarms before considering the deployment to be complete and no
     *        longer eligible for automatic roll back.
     */

    public void setFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
        this.finalBakeTimeInMinutes = finalBakeTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time AppConfig monitors for alarms before considering the deployment to be complete and no longer
     * eligible for automatic roll back.
     * </p>
     * 
     * @return The amount of time AppConfig monitors for alarms before considering the deployment to be complete and no
     *         longer eligible for automatic roll back.
     */

    public Integer getFinalBakeTimeInMinutes() {
        return this.finalBakeTimeInMinutes;
    }

    /**
     * <p>
     * The amount of time AppConfig monitors for alarms before considering the deployment to be complete and no longer
     * eligible for automatic roll back.
     * </p>
     * 
     * @param finalBakeTimeInMinutes
     *        The amount of time AppConfig monitors for alarms before considering the deployment to be complete and no
     *        longer eligible for automatic roll back.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
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

    public DeploymentSummary withState(String state) {
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

    public DeploymentSummary withState(DeploymentState state) {
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

    public DeploymentSummary withPercentageComplete(Float percentageComplete) {
        setPercentageComplete(percentageComplete);
        return this;
    }

    /**
     * <p>
     * Time the deployment started.
     * </p>
     * 
     * @param startedAt
     *        Time the deployment started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * Time the deployment started.
     * </p>
     * 
     * @return Time the deployment started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * Time the deployment started.
     * </p>
     * 
     * @param startedAt
     *        Time the deployment started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * Time the deployment completed.
     * </p>
     * 
     * @param completedAt
     *        Time the deployment completed.
     */

    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * Time the deployment completed.
     * </p>
     * 
     * @return Time the deployment completed.
     */

    public java.util.Date getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * Time the deployment completed.
     * </p>
     * 
     * @param completedAt
     *        Time the deployment completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withCompletedAt(java.util.Date completedAt) {
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
        if (getDeploymentNumber() != null)
            sb.append("DeploymentNumber: ").append(getDeploymentNumber()).append(",");
        if (getConfigurationName() != null)
            sb.append("ConfigurationName: ").append(getConfigurationName()).append(",");
        if (getConfigurationVersion() != null)
            sb.append("ConfigurationVersion: ").append(getConfigurationVersion()).append(",");
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

        if (obj instanceof DeploymentSummary == false)
            return false;
        DeploymentSummary other = (DeploymentSummary) obj;
        if (other.getDeploymentNumber() == null ^ this.getDeploymentNumber() == null)
            return false;
        if (other.getDeploymentNumber() != null && other.getDeploymentNumber().equals(this.getDeploymentNumber()) == false)
            return false;
        if (other.getConfigurationName() == null ^ this.getConfigurationName() == null)
            return false;
        if (other.getConfigurationName() != null && other.getConfigurationName().equals(this.getConfigurationName()) == false)
            return false;
        if (other.getConfigurationVersion() == null ^ this.getConfigurationVersion() == null)
            return false;
        if (other.getConfigurationVersion() != null && other.getConfigurationVersion().equals(this.getConfigurationVersion()) == false)
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

        hashCode = prime * hashCode + ((getDeploymentNumber() == null) ? 0 : getDeploymentNumber().hashCode());
        hashCode = prime * hashCode + ((getConfigurationName() == null) ? 0 : getConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getConfigurationVersion() == null) ? 0 : getConfigurationVersion().hashCode());
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
    public DeploymentSummary clone() {
        try {
            return (DeploymentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appconfig.model.transform.DeploymentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
