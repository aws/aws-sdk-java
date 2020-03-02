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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateDeploymentStrategy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentStrategyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the deployment strategy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the deployment strategy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Total amount of time for a deployment to last.
     * </p>
     */
    private Integer deploymentDurationInMinutes;
    /**
     * <p>
     * The amount of time AppConfig monitors for alarms before considering the deployment to be complete and no longer
     * eligible for automatic roll back.
     * </p>
     */
    private Integer finalBakeTimeInMinutes;
    /**
     * <p>
     * The percentage of targets to receive a deployed configuration during each interval.
     * </p>
     */
    private Float growthFactor;
    /**
     * <p>
     * The algorithm used to define how percentage grows over time. AWS AppConfig supports the following growth types:
     * </p>
     * <p>
     * <b>Linear</b>: For this type, AppConfig processes the deployment by dividing the total number of targets by the
     * value specified for <code>Step percentage</code>. For example, a linear deployment that uses a
     * <code>Step percentage</code> of 10 deploys the configuration to 10 percent of the hosts. After those deployments
     * are complete, the system deploys the configuration to the next 10 percent. This continues until 100% of the
     * targets have successfully received the configuration.
     * </p>
     * <p>
     * <b>Exponential</b>: For this type, AppConfig processes the deployment exponentially using the following formula:
     * <code>G*(2^N)</code>. In this formula, <code>G</code> is the growth factor specified by the user and
     * <code>N</code> is the number of steps until the configuration is deployed to all targets. For example, if you
     * specify a growth factor of 2, then the system rolls out the configuration as follows:
     * </p>
     * <p>
     * <code>2*(2^0)</code>
     * </p>
     * <p>
     * <code>2*(2^1)</code>
     * </p>
     * <p>
     * <code>2*(2^2)</code>
     * </p>
     * <p>
     * Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the targets, 8% of the
     * targets, and continues until the configuration has been deployed to all targets.
     * </p>
     */
    private String growthType;
    /**
     * <p>
     * Save the deployment strategy to a Systems Manager (SSM) document.
     * </p>
     */
    private String replicateTo;
    /**
     * <p>
     * Metadata to assign to the deployment strategy. Tags help organize and categorize your AppConfig resources. Each
     * tag consists of a key and an optional value, both of which you define.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A name for the deployment strategy.
     * </p>
     * 
     * @param name
     *        A name for the deployment strategy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the deployment strategy.
     * </p>
     * 
     * @return A name for the deployment strategy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the deployment strategy.
     * </p>
     * 
     * @param name
     *        A name for the deployment strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentStrategyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the deployment strategy.
     * </p>
     * 
     * @param description
     *        A description of the deployment strategy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the deployment strategy.
     * </p>
     * 
     * @return A description of the deployment strategy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the deployment strategy.
     * </p>
     * 
     * @param description
     *        A description of the deployment strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentStrategyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Total amount of time for a deployment to last.
     * </p>
     * 
     * @param deploymentDurationInMinutes
     *        Total amount of time for a deployment to last.
     */

    public void setDeploymentDurationInMinutes(Integer deploymentDurationInMinutes) {
        this.deploymentDurationInMinutes = deploymentDurationInMinutes;
    }

    /**
     * <p>
     * Total amount of time for a deployment to last.
     * </p>
     * 
     * @return Total amount of time for a deployment to last.
     */

    public Integer getDeploymentDurationInMinutes() {
        return this.deploymentDurationInMinutes;
    }

    /**
     * <p>
     * Total amount of time for a deployment to last.
     * </p>
     * 
     * @param deploymentDurationInMinutes
     *        Total amount of time for a deployment to last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentStrategyRequest withDeploymentDurationInMinutes(Integer deploymentDurationInMinutes) {
        setDeploymentDurationInMinutes(deploymentDurationInMinutes);
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

    public CreateDeploymentStrategyRequest withFinalBakeTimeInMinutes(Integer finalBakeTimeInMinutes) {
        setFinalBakeTimeInMinutes(finalBakeTimeInMinutes);
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

    public CreateDeploymentStrategyRequest withGrowthFactor(Float growthFactor) {
        setGrowthFactor(growthFactor);
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time. AWS AppConfig supports the following growth types:
     * </p>
     * <p>
     * <b>Linear</b>: For this type, AppConfig processes the deployment by dividing the total number of targets by the
     * value specified for <code>Step percentage</code>. For example, a linear deployment that uses a
     * <code>Step percentage</code> of 10 deploys the configuration to 10 percent of the hosts. After those deployments
     * are complete, the system deploys the configuration to the next 10 percent. This continues until 100% of the
     * targets have successfully received the configuration.
     * </p>
     * <p>
     * <b>Exponential</b>: For this type, AppConfig processes the deployment exponentially using the following formula:
     * <code>G*(2^N)</code>. In this formula, <code>G</code> is the growth factor specified by the user and
     * <code>N</code> is the number of steps until the configuration is deployed to all targets. For example, if you
     * specify a growth factor of 2, then the system rolls out the configuration as follows:
     * </p>
     * <p>
     * <code>2*(2^0)</code>
     * </p>
     * <p>
     * <code>2*(2^1)</code>
     * </p>
     * <p>
     * <code>2*(2^2)</code>
     * </p>
     * <p>
     * Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the targets, 8% of the
     * targets, and continues until the configuration has been deployed to all targets.
     * </p>
     * 
     * @param growthType
     *        The algorithm used to define how percentage grows over time. AWS AppConfig supports the following growth
     *        types:</p>
     *        <p>
     *        <b>Linear</b>: For this type, AppConfig processes the deployment by dividing the total number of targets
     *        by the value specified for <code>Step percentage</code>. For example, a linear deployment that uses a
     *        <code>Step percentage</code> of 10 deploys the configuration to 10 percent of the hosts. After those
     *        deployments are complete, the system deploys the configuration to the next 10 percent. This continues
     *        until 100% of the targets have successfully received the configuration.
     *        </p>
     *        <p>
     *        <b>Exponential</b>: For this type, AppConfig processes the deployment exponentially using the following
     *        formula: <code>G*(2^N)</code>. In this formula, <code>G</code> is the growth factor specified by the user
     *        and <code>N</code> is the number of steps until the configuration is deployed to all targets. For example,
     *        if you specify a growth factor of 2, then the system rolls out the configuration as follows:
     *        </p>
     *        <p>
     *        <code>2*(2^0)</code>
     *        </p>
     *        <p>
     *        <code>2*(2^1)</code>
     *        </p>
     *        <p>
     *        <code>2*(2^2)</code>
     *        </p>
     *        <p>
     *        Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the targets, 8% of
     *        the targets, and continues until the configuration has been deployed to all targets.
     * @see GrowthType
     */

    public void setGrowthType(String growthType) {
        this.growthType = growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time. AWS AppConfig supports the following growth types:
     * </p>
     * <p>
     * <b>Linear</b>: For this type, AppConfig processes the deployment by dividing the total number of targets by the
     * value specified for <code>Step percentage</code>. For example, a linear deployment that uses a
     * <code>Step percentage</code> of 10 deploys the configuration to 10 percent of the hosts. After those deployments
     * are complete, the system deploys the configuration to the next 10 percent. This continues until 100% of the
     * targets have successfully received the configuration.
     * </p>
     * <p>
     * <b>Exponential</b>: For this type, AppConfig processes the deployment exponentially using the following formula:
     * <code>G*(2^N)</code>. In this formula, <code>G</code> is the growth factor specified by the user and
     * <code>N</code> is the number of steps until the configuration is deployed to all targets. For example, if you
     * specify a growth factor of 2, then the system rolls out the configuration as follows:
     * </p>
     * <p>
     * <code>2*(2^0)</code>
     * </p>
     * <p>
     * <code>2*(2^1)</code>
     * </p>
     * <p>
     * <code>2*(2^2)</code>
     * </p>
     * <p>
     * Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the targets, 8% of the
     * targets, and continues until the configuration has been deployed to all targets.
     * </p>
     * 
     * @return The algorithm used to define how percentage grows over time. AWS AppConfig supports the following growth
     *         types:</p>
     *         <p>
     *         <b>Linear</b>: For this type, AppConfig processes the deployment by dividing the total number of targets
     *         by the value specified for <code>Step percentage</code>. For example, a linear deployment that uses a
     *         <code>Step percentage</code> of 10 deploys the configuration to 10 percent of the hosts. After those
     *         deployments are complete, the system deploys the configuration to the next 10 percent. This continues
     *         until 100% of the targets have successfully received the configuration.
     *         </p>
     *         <p>
     *         <b>Exponential</b>: For this type, AppConfig processes the deployment exponentially using the following
     *         formula: <code>G*(2^N)</code>. In this formula, <code>G</code> is the growth factor specified by the user
     *         and <code>N</code> is the number of steps until the configuration is deployed to all targets. For
     *         example, if you specify a growth factor of 2, then the system rolls out the configuration as follows:
     *         </p>
     *         <p>
     *         <code>2*(2^0)</code>
     *         </p>
     *         <p>
     *         <code>2*(2^1)</code>
     *         </p>
     *         <p>
     *         <code>2*(2^2)</code>
     *         </p>
     *         <p>
     *         Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the targets, 8% of
     *         the targets, and continues until the configuration has been deployed to all targets.
     * @see GrowthType
     */

    public String getGrowthType() {
        return this.growthType;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time. AWS AppConfig supports the following growth types:
     * </p>
     * <p>
     * <b>Linear</b>: For this type, AppConfig processes the deployment by dividing the total number of targets by the
     * value specified for <code>Step percentage</code>. For example, a linear deployment that uses a
     * <code>Step percentage</code> of 10 deploys the configuration to 10 percent of the hosts. After those deployments
     * are complete, the system deploys the configuration to the next 10 percent. This continues until 100% of the
     * targets have successfully received the configuration.
     * </p>
     * <p>
     * <b>Exponential</b>: For this type, AppConfig processes the deployment exponentially using the following formula:
     * <code>G*(2^N)</code>. In this formula, <code>G</code> is the growth factor specified by the user and
     * <code>N</code> is the number of steps until the configuration is deployed to all targets. For example, if you
     * specify a growth factor of 2, then the system rolls out the configuration as follows:
     * </p>
     * <p>
     * <code>2*(2^0)</code>
     * </p>
     * <p>
     * <code>2*(2^1)</code>
     * </p>
     * <p>
     * <code>2*(2^2)</code>
     * </p>
     * <p>
     * Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the targets, 8% of the
     * targets, and continues until the configuration has been deployed to all targets.
     * </p>
     * 
     * @param growthType
     *        The algorithm used to define how percentage grows over time. AWS AppConfig supports the following growth
     *        types:</p>
     *        <p>
     *        <b>Linear</b>: For this type, AppConfig processes the deployment by dividing the total number of targets
     *        by the value specified for <code>Step percentage</code>. For example, a linear deployment that uses a
     *        <code>Step percentage</code> of 10 deploys the configuration to 10 percent of the hosts. After those
     *        deployments are complete, the system deploys the configuration to the next 10 percent. This continues
     *        until 100% of the targets have successfully received the configuration.
     *        </p>
     *        <p>
     *        <b>Exponential</b>: For this type, AppConfig processes the deployment exponentially using the following
     *        formula: <code>G*(2^N)</code>. In this formula, <code>G</code> is the growth factor specified by the user
     *        and <code>N</code> is the number of steps until the configuration is deployed to all targets. For example,
     *        if you specify a growth factor of 2, then the system rolls out the configuration as follows:
     *        </p>
     *        <p>
     *        <code>2*(2^0)</code>
     *        </p>
     *        <p>
     *        <code>2*(2^1)</code>
     *        </p>
     *        <p>
     *        <code>2*(2^2)</code>
     *        </p>
     *        <p>
     *        Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the targets, 8% of
     *        the targets, and continues until the configuration has been deployed to all targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrowthType
     */

    public CreateDeploymentStrategyRequest withGrowthType(String growthType) {
        setGrowthType(growthType);
        return this;
    }

    /**
     * <p>
     * The algorithm used to define how percentage grows over time. AWS AppConfig supports the following growth types:
     * </p>
     * <p>
     * <b>Linear</b>: For this type, AppConfig processes the deployment by dividing the total number of targets by the
     * value specified for <code>Step percentage</code>. For example, a linear deployment that uses a
     * <code>Step percentage</code> of 10 deploys the configuration to 10 percent of the hosts. After those deployments
     * are complete, the system deploys the configuration to the next 10 percent. This continues until 100% of the
     * targets have successfully received the configuration.
     * </p>
     * <p>
     * <b>Exponential</b>: For this type, AppConfig processes the deployment exponentially using the following formula:
     * <code>G*(2^N)</code>. In this formula, <code>G</code> is the growth factor specified by the user and
     * <code>N</code> is the number of steps until the configuration is deployed to all targets. For example, if you
     * specify a growth factor of 2, then the system rolls out the configuration as follows:
     * </p>
     * <p>
     * <code>2*(2^0)</code>
     * </p>
     * <p>
     * <code>2*(2^1)</code>
     * </p>
     * <p>
     * <code>2*(2^2)</code>
     * </p>
     * <p>
     * Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the targets, 8% of the
     * targets, and continues until the configuration has been deployed to all targets.
     * </p>
     * 
     * @param growthType
     *        The algorithm used to define how percentage grows over time. AWS AppConfig supports the following growth
     *        types:</p>
     *        <p>
     *        <b>Linear</b>: For this type, AppConfig processes the deployment by dividing the total number of targets
     *        by the value specified for <code>Step percentage</code>. For example, a linear deployment that uses a
     *        <code>Step percentage</code> of 10 deploys the configuration to 10 percent of the hosts. After those
     *        deployments are complete, the system deploys the configuration to the next 10 percent. This continues
     *        until 100% of the targets have successfully received the configuration.
     *        </p>
     *        <p>
     *        <b>Exponential</b>: For this type, AppConfig processes the deployment exponentially using the following
     *        formula: <code>G*(2^N)</code>. In this formula, <code>G</code> is the growth factor specified by the user
     *        and <code>N</code> is the number of steps until the configuration is deployed to all targets. For example,
     *        if you specify a growth factor of 2, then the system rolls out the configuration as follows:
     *        </p>
     *        <p>
     *        <code>2*(2^0)</code>
     *        </p>
     *        <p>
     *        <code>2*(2^1)</code>
     *        </p>
     *        <p>
     *        <code>2*(2^2)</code>
     *        </p>
     *        <p>
     *        Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the targets, 8% of
     *        the targets, and continues until the configuration has been deployed to all targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrowthType
     */

    public CreateDeploymentStrategyRequest withGrowthType(GrowthType growthType) {
        this.growthType = growthType.toString();
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

    public CreateDeploymentStrategyRequest withReplicateTo(String replicateTo) {
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

    public CreateDeploymentStrategyRequest withReplicateTo(ReplicateTo replicateTo) {
        this.replicateTo = replicateTo.toString();
        return this;
    }

    /**
     * <p>
     * Metadata to assign to the deployment strategy. Tags help organize and categorize your AppConfig resources. Each
     * tag consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @return Metadata to assign to the deployment strategy. Tags help organize and categorize your AppConfig
     *         resources. Each tag consists of a key and an optional value, both of which you define.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata to assign to the deployment strategy. Tags help organize and categorize your AppConfig resources. Each
     * tag consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        Metadata to assign to the deployment strategy. Tags help organize and categorize your AppConfig resources.
     *        Each tag consists of a key and an optional value, both of which you define.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata to assign to the deployment strategy. Tags help organize and categorize your AppConfig resources. Each
     * tag consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        Metadata to assign to the deployment strategy. Tags help organize and categorize your AppConfig resources.
     *        Each tag consists of a key and an optional value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentStrategyRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDeploymentStrategyRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentStrategyRequest addTagsEntry(String key, String value) {
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

    public CreateDeploymentStrategyRequest clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDeploymentDurationInMinutes() != null)
            sb.append("DeploymentDurationInMinutes: ").append(getDeploymentDurationInMinutes()).append(",");
        if (getFinalBakeTimeInMinutes() != null)
            sb.append("FinalBakeTimeInMinutes: ").append(getFinalBakeTimeInMinutes()).append(",");
        if (getGrowthFactor() != null)
            sb.append("GrowthFactor: ").append(getGrowthFactor()).append(",");
        if (getGrowthType() != null)
            sb.append("GrowthType: ").append(getGrowthType()).append(",");
        if (getReplicateTo() != null)
            sb.append("ReplicateTo: ").append(getReplicateTo()).append(",");
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

        if (obj instanceof CreateDeploymentStrategyRequest == false)
            return false;
        CreateDeploymentStrategyRequest other = (CreateDeploymentStrategyRequest) obj;
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
        if (other.getFinalBakeTimeInMinutes() == null ^ this.getFinalBakeTimeInMinutes() == null)
            return false;
        if (other.getFinalBakeTimeInMinutes() != null && other.getFinalBakeTimeInMinutes().equals(this.getFinalBakeTimeInMinutes()) == false)
            return false;
        if (other.getGrowthFactor() == null ^ this.getGrowthFactor() == null)
            return false;
        if (other.getGrowthFactor() != null && other.getGrowthFactor().equals(this.getGrowthFactor()) == false)
            return false;
        if (other.getGrowthType() == null ^ this.getGrowthType() == null)
            return false;
        if (other.getGrowthType() != null && other.getGrowthType().equals(this.getGrowthType()) == false)
            return false;
        if (other.getReplicateTo() == null ^ this.getReplicateTo() == null)
            return false;
        if (other.getReplicateTo() != null && other.getReplicateTo().equals(this.getReplicateTo()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeploymentDurationInMinutes() == null) ? 0 : getDeploymentDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getFinalBakeTimeInMinutes() == null) ? 0 : getFinalBakeTimeInMinutes().hashCode());
        hashCode = prime * hashCode + ((getGrowthFactor() == null) ? 0 : getGrowthFactor().hashCode());
        hashCode = prime * hashCode + ((getGrowthType() == null) ? 0 : getGrowthType().hashCode());
        hashCode = prime * hashCode + ((getReplicateTo() == null) ? 0 : getReplicateTo().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentStrategyRequest clone() {
        return (CreateDeploymentStrategyRequest) super.clone();
    }

}
