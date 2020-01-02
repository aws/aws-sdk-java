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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateDeploymentStrategy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentStrategyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the deployment strategy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the deployment strategy.
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
     * The percentage of targets that received a deployed configuration during each interval.
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
     * Save the deployment strategy to a Systems Manager (SSM) document.
     * </p>
     */
    private String replicateTo;

    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     * 
     * @param id
     *        The deployment strategy ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     * 
     * @return The deployment strategy ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     * 
     * @param id
     *        The deployment strategy ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentStrategyResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the deployment strategy.
     * </p>
     * 
     * @param name
     *        The name of the deployment strategy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the deployment strategy.
     * </p>
     * 
     * @return The name of the deployment strategy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the deployment strategy.
     * </p>
     * 
     * @param name
     *        The name of the deployment strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentStrategyResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the deployment strategy.
     * </p>
     * 
     * @param description
     *        The description of the deployment strategy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the deployment strategy.
     * </p>
     * 
     * @return The description of the deployment strategy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the deployment strategy.
     * </p>
     * 
     * @param description
     *        The description of the deployment strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentStrategyResult withDescription(String description) {
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

    public CreateDeploymentStrategyResult withDeploymentDurationInMinutes(Integer deploymentDurationInMinutes) {
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

    public CreateDeploymentStrategyResult withGrowthType(String growthType) {
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

    public CreateDeploymentStrategyResult withGrowthType(GrowthType growthType) {
        this.growthType = growthType.toString();
        return this;
    }

    /**
     * <p>
     * The percentage of targets that received a deployed configuration during each interval.
     * </p>
     * 
     * @param growthFactor
     *        The percentage of targets that received a deployed configuration during each interval.
     */

    public void setGrowthFactor(Float growthFactor) {
        this.growthFactor = growthFactor;
    }

    /**
     * <p>
     * The percentage of targets that received a deployed configuration during each interval.
     * </p>
     * 
     * @return The percentage of targets that received a deployed configuration during each interval.
     */

    public Float getGrowthFactor() {
        return this.growthFactor;
    }

    /**
     * <p>
     * The percentage of targets that received a deployed configuration during each interval.
     * </p>
     * 
     * @param growthFactor
     *        The percentage of targets that received a deployed configuration during each interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentStrategyResult withGrowthFactor(Float growthFactor) {
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

    public CreateDeploymentStrategyResult withFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
        setFinalBakeTimeInMinutes(finalBakeTimeInMinutes);
        return this;
    }

    /**
     * <p>
     * Save the deployment strategy to a Systems Manager (SSM) document.
     * </p>
     * 
     * @param replicateTo
     *        Save the deployment strategy to a Systems Manager (SSM) document.
     * @see ReplicateTo
     */

    public void setReplicateTo(String replicateTo) {
        this.replicateTo = replicateTo;
    }

    /**
     * <p>
     * Save the deployment strategy to a Systems Manager (SSM) document.
     * </p>
     * 
     * @return Save the deployment strategy to a Systems Manager (SSM) document.
     * @see ReplicateTo
     */

    public String getReplicateTo() {
        return this.replicateTo;
    }

    /**
     * <p>
     * Save the deployment strategy to a Systems Manager (SSM) document.
     * </p>
     * 
     * @param replicateTo
     *        Save the deployment strategy to a Systems Manager (SSM) document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicateTo
     */

    public CreateDeploymentStrategyResult withReplicateTo(String replicateTo) {
        setReplicateTo(replicateTo);
        return this;
    }

    /**
     * <p>
     * Save the deployment strategy to a Systems Manager (SSM) document.
     * </p>
     * 
     * @param replicateTo
     *        Save the deployment strategy to a Systems Manager (SSM) document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicateTo
     */

    public CreateDeploymentStrategyResult withReplicateTo(ReplicateTo replicateTo) {
        this.replicateTo = replicateTo.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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
        if (getReplicateTo() != null)
            sb.append("ReplicateTo: ").append(getReplicateTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentStrategyResult == false)
            return false;
        CreateDeploymentStrategyResult other = (CreateDeploymentStrategyResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getReplicateTo() == null ^ this.getReplicateTo() == null)
            return false;
        if (other.getReplicateTo() != null && other.getReplicateTo().equals(this.getReplicateTo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeploymentDurationInMinutes() == null) ? 0 : getDeploymentDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getGrowthType() == null) ? 0 : getGrowthType().hashCode());
        hashCode = prime * hashCode + ((getGrowthFactor() == null) ? 0 : getGrowthFactor().hashCode());
        hashCode = prime * hashCode + ((getFinalBakeTimeInMinutes() == null) ? 0 : getFinalBakeTimeInMinutes().hashCode());
        hashCode = prime * hashCode + ((getReplicateTo() == null) ? 0 : getReplicateTo().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentStrategyResult clone() {
        try {
            return (CreateDeploymentStrategyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
