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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * AWS IoT thing or thing group.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The revision number of the deployment.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * The ID of the deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The name of the deployment.
     * </p>
     * <p>
     * You can create deployments without names. If you create a deployment without a name, the AWS IoT Greengrass V2
     * console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>, where
     * <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     * </p>
     */
    private String deploymentName;
    /**
     * <p>
     * The status of the deployment.
     * </p>
     */
    private String deploymentStatus;
    /**
     * <p>
     * The ID of the AWS IoT job that applies the deployment to target devices.
     * </p>
     */
    private String iotJobId;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * job that applies the deployment to target devices.
     * </p>
     */
    private String iotJobArn;
    /**
     * <p>
     * The components to deploy. This is a dictionary, where each key is the name of a component, and each key's value
     * is the version and configuration to deploy for that component.
     * </p>
     */
    private java.util.Map<String, ComponentDeploymentSpecification> components;
    /**
     * <p>
     * The deployment policies for the deployment. These policies define how the deployment updates components and
     * handles failure.
     * </p>
     */
    private DeploymentPolicies deploymentPolicies;
    /**
     * <p>
     * The job configuration for the deployment configuration. The job configuration specifies the rollout, timeout, and
     * stop configurations for the deployment configuration.
     * </p>
     */
    private DeploymentIoTJobConfiguration iotJobConfiguration;
    /**
     * <p>
     * The time at which the deployment was created, expressed in ISO 8601 format.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * Whether or not the deployment is the latest revision for its target.
     * </p>
     */
    private Boolean isLatestForTarget;
    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS IoT
     * Greengrass V2 Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * AWS IoT thing or thing group.
     * </p>
     * 
     * @param targetArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        target AWS IoT thing or thing group.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * AWS IoT thing or thing group.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         target AWS IoT thing or thing group.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * AWS IoT thing or thing group.
     * </p>
     * 
     * @param targetArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        target AWS IoT thing or thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The revision number of the deployment.
     * </p>
     * 
     * @param revisionId
     *        The revision number of the deployment.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The revision number of the deployment.
     * </p>
     * 
     * @return The revision number of the deployment.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The revision number of the deployment.
     * </p>
     * 
     * @param revisionId
     *        The revision number of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @return The ID of the deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The name of the deployment.
     * </p>
     * <p>
     * You can create deployments without names. If you create a deployment without a name, the AWS IoT Greengrass V2
     * console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>, where
     * <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     * </p>
     * 
     * @param deploymentName
     *        The name of the deployment.</p>
     *        <p>
     *        You can create deployments without names. If you create a deployment without a name, the AWS IoT
     *        Greengrass V2 console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>,
     *        where <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     */

    public void setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
    }

    /**
     * <p>
     * The name of the deployment.
     * </p>
     * <p>
     * You can create deployments without names. If you create a deployment without a name, the AWS IoT Greengrass V2
     * console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>, where
     * <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     * </p>
     * 
     * @return The name of the deployment.</p>
     *         <p>
     *         You can create deployments without names. If you create a deployment without a name, the AWS IoT
     *         Greengrass V2 console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>,
     *         where <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     */

    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * <p>
     * The name of the deployment.
     * </p>
     * <p>
     * You can create deployments without names. If you create a deployment without a name, the AWS IoT Greengrass V2
     * console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>, where
     * <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     * </p>
     * 
     * @param deploymentName
     *        The name of the deployment.</p>
     *        <p>
     *        You can create deployments without names. If you create a deployment without a name, the AWS IoT
     *        Greengrass V2 console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>,
     *        where <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult withDeploymentName(String deploymentName) {
        setDeploymentName(deploymentName);
        return this;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the deployment.
     * @see DeploymentStatus
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @return The status of the deployment.
     * @see DeploymentStatus
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public GetDeploymentResult withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public GetDeploymentResult withDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the AWS IoT job that applies the deployment to target devices.
     * </p>
     * 
     * @param iotJobId
     *        The ID of the AWS IoT job that applies the deployment to target devices.
     */

    public void setIotJobId(String iotJobId) {
        this.iotJobId = iotJobId;
    }

    /**
     * <p>
     * The ID of the AWS IoT job that applies the deployment to target devices.
     * </p>
     * 
     * @return The ID of the AWS IoT job that applies the deployment to target devices.
     */

    public String getIotJobId() {
        return this.iotJobId;
    }

    /**
     * <p>
     * The ID of the AWS IoT job that applies the deployment to target devices.
     * </p>
     * 
     * @param iotJobId
     *        The ID of the AWS IoT job that applies the deployment to target devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult withIotJobId(String iotJobId) {
        setIotJobId(iotJobId);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * job that applies the deployment to target devices.
     * </p>
     * 
     * @param iotJobArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        AWS IoT job that applies the deployment to target devices.
     */

    public void setIotJobArn(String iotJobArn) {
        this.iotJobArn = iotJobArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * job that applies the deployment to target devices.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         AWS IoT job that applies the deployment to target devices.
     */

    public String getIotJobArn() {
        return this.iotJobArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * job that applies the deployment to target devices.
     * </p>
     * 
     * @param iotJobArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        AWS IoT job that applies the deployment to target devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult withIotJobArn(String iotJobArn) {
        setIotJobArn(iotJobArn);
        return this;
    }

    /**
     * <p>
     * The components to deploy. This is a dictionary, where each key is the name of a component, and each key's value
     * is the version and configuration to deploy for that component.
     * </p>
     * 
     * @return The components to deploy. This is a dictionary, where each key is the name of a component, and each key's
     *         value is the version and configuration to deploy for that component.
     */

    public java.util.Map<String, ComponentDeploymentSpecification> getComponents() {
        return components;
    }

    /**
     * <p>
     * The components to deploy. This is a dictionary, where each key is the name of a component, and each key's value
     * is the version and configuration to deploy for that component.
     * </p>
     * 
     * @param components
     *        The components to deploy. This is a dictionary, where each key is the name of a component, and each key's
     *        value is the version and configuration to deploy for that component.
     */

    public void setComponents(java.util.Map<String, ComponentDeploymentSpecification> components) {
        this.components = components;
    }

    /**
     * <p>
     * The components to deploy. This is a dictionary, where each key is the name of a component, and each key's value
     * is the version and configuration to deploy for that component.
     * </p>
     * 
     * @param components
     *        The components to deploy. This is a dictionary, where each key is the name of a component, and each key's
     *        value is the version and configuration to deploy for that component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult withComponents(java.util.Map<String, ComponentDeploymentSpecification> components) {
        setComponents(components);
        return this;
    }

    /**
     * Add a single Components entry
     *
     * @see GetDeploymentResult#withComponents
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult addComponentsEntry(String key, ComponentDeploymentSpecification value) {
        if (null == this.components) {
            this.components = new java.util.HashMap<String, ComponentDeploymentSpecification>();
        }
        if (this.components.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.components.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Components.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult clearComponentsEntries() {
        this.components = null;
        return this;
    }

    /**
     * <p>
     * The deployment policies for the deployment. These policies define how the deployment updates components and
     * handles failure.
     * </p>
     * 
     * @param deploymentPolicies
     *        The deployment policies for the deployment. These policies define how the deployment updates components
     *        and handles failure.
     */

    public void setDeploymentPolicies(DeploymentPolicies deploymentPolicies) {
        this.deploymentPolicies = deploymentPolicies;
    }

    /**
     * <p>
     * The deployment policies for the deployment. These policies define how the deployment updates components and
     * handles failure.
     * </p>
     * 
     * @return The deployment policies for the deployment. These policies define how the deployment updates components
     *         and handles failure.
     */

    public DeploymentPolicies getDeploymentPolicies() {
        return this.deploymentPolicies;
    }

    /**
     * <p>
     * The deployment policies for the deployment. These policies define how the deployment updates components and
     * handles failure.
     * </p>
     * 
     * @param deploymentPolicies
     *        The deployment policies for the deployment. These policies define how the deployment updates components
     *        and handles failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult withDeploymentPolicies(DeploymentPolicies deploymentPolicies) {
        setDeploymentPolicies(deploymentPolicies);
        return this;
    }

    /**
     * <p>
     * The job configuration for the deployment configuration. The job configuration specifies the rollout, timeout, and
     * stop configurations for the deployment configuration.
     * </p>
     * 
     * @param iotJobConfiguration
     *        The job configuration for the deployment configuration. The job configuration specifies the rollout,
     *        timeout, and stop configurations for the deployment configuration.
     */

    public void setIotJobConfiguration(DeploymentIoTJobConfiguration iotJobConfiguration) {
        this.iotJobConfiguration = iotJobConfiguration;
    }

    /**
     * <p>
     * The job configuration for the deployment configuration. The job configuration specifies the rollout, timeout, and
     * stop configurations for the deployment configuration.
     * </p>
     * 
     * @return The job configuration for the deployment configuration. The job configuration specifies the rollout,
     *         timeout, and stop configurations for the deployment configuration.
     */

    public DeploymentIoTJobConfiguration getIotJobConfiguration() {
        return this.iotJobConfiguration;
    }

    /**
     * <p>
     * The job configuration for the deployment configuration. The job configuration specifies the rollout, timeout, and
     * stop configurations for the deployment configuration.
     * </p>
     * 
     * @param iotJobConfiguration
     *        The job configuration for the deployment configuration. The job configuration specifies the rollout,
     *        timeout, and stop configurations for the deployment configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult withIotJobConfiguration(DeploymentIoTJobConfiguration iotJobConfiguration) {
        setIotJobConfiguration(iotJobConfiguration);
        return this;
    }

    /**
     * <p>
     * The time at which the deployment was created, expressed in ISO 8601 format.
     * </p>
     * 
     * @param creationTimestamp
     *        The time at which the deployment was created, expressed in ISO 8601 format.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The time at which the deployment was created, expressed in ISO 8601 format.
     * </p>
     * 
     * @return The time at which the deployment was created, expressed in ISO 8601 format.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The time at which the deployment was created, expressed in ISO 8601 format.
     * </p>
     * 
     * @param creationTimestamp
     *        The time at which the deployment was created, expressed in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * Whether or not the deployment is the latest revision for its target.
     * </p>
     * 
     * @param isLatestForTarget
     *        Whether or not the deployment is the latest revision for its target.
     */

    public void setIsLatestForTarget(Boolean isLatestForTarget) {
        this.isLatestForTarget = isLatestForTarget;
    }

    /**
     * <p>
     * Whether or not the deployment is the latest revision for its target.
     * </p>
     * 
     * @return Whether or not the deployment is the latest revision for its target.
     */

    public Boolean getIsLatestForTarget() {
        return this.isLatestForTarget;
    }

    /**
     * <p>
     * Whether or not the deployment is the latest revision for its target.
     * </p>
     * 
     * @param isLatestForTarget
     *        Whether or not the deployment is the latest revision for its target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult withIsLatestForTarget(Boolean isLatestForTarget) {
        setIsLatestForTarget(isLatestForTarget);
        return this;
    }

    /**
     * <p>
     * Whether or not the deployment is the latest revision for its target.
     * </p>
     * 
     * @return Whether or not the deployment is the latest revision for its target.
     */

    public Boolean isLatestForTarget() {
        return this.isLatestForTarget;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS IoT
     * Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @return A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *         href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS
     *         IoT Greengrass V2 Developer Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS IoT
     * Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS
     *        IoT Greengrass V2 Developer Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS IoT
     * Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS
     *        IoT Greengrass V2 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetDeploymentResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult addTagsEntry(String key, String value) {
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

    public GetDeploymentResult clearTagsEntries() {
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
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getDeploymentName() != null)
            sb.append("DeploymentName: ").append(getDeploymentName()).append(",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getIotJobId() != null)
            sb.append("IotJobId: ").append(getIotJobId()).append(",");
        if (getIotJobArn() != null)
            sb.append("IotJobArn: ").append(getIotJobArn()).append(",");
        if (getComponents() != null)
            sb.append("Components: ").append(getComponents()).append(",");
        if (getDeploymentPolicies() != null)
            sb.append("DeploymentPolicies: ").append(getDeploymentPolicies()).append(",");
        if (getIotJobConfiguration() != null)
            sb.append("IotJobConfiguration: ").append(getIotJobConfiguration()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getIsLatestForTarget() != null)
            sb.append("IsLatestForTarget: ").append(getIsLatestForTarget()).append(",");
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

        if (obj instanceof GetDeploymentResult == false)
            return false;
        GetDeploymentResult other = (GetDeploymentResult) obj;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDeploymentName() == null ^ this.getDeploymentName() == null)
            return false;
        if (other.getDeploymentName() != null && other.getDeploymentName().equals(this.getDeploymentName()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getIotJobId() == null ^ this.getIotJobId() == null)
            return false;
        if (other.getIotJobId() != null && other.getIotJobId().equals(this.getIotJobId()) == false)
            return false;
        if (other.getIotJobArn() == null ^ this.getIotJobArn() == null)
            return false;
        if (other.getIotJobArn() != null && other.getIotJobArn().equals(this.getIotJobArn()) == false)
            return false;
        if (other.getComponents() == null ^ this.getComponents() == null)
            return false;
        if (other.getComponents() != null && other.getComponents().equals(this.getComponents()) == false)
            return false;
        if (other.getDeploymentPolicies() == null ^ this.getDeploymentPolicies() == null)
            return false;
        if (other.getDeploymentPolicies() != null && other.getDeploymentPolicies().equals(this.getDeploymentPolicies()) == false)
            return false;
        if (other.getIotJobConfiguration() == null ^ this.getIotJobConfiguration() == null)
            return false;
        if (other.getIotJobConfiguration() != null && other.getIotJobConfiguration().equals(this.getIotJobConfiguration()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getIsLatestForTarget() == null ^ this.getIsLatestForTarget() == null)
            return false;
        if (other.getIsLatestForTarget() != null && other.getIsLatestForTarget().equals(this.getIsLatestForTarget()) == false)
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

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentName() == null) ? 0 : getDeploymentName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getIotJobId() == null) ? 0 : getIotJobId().hashCode());
        hashCode = prime * hashCode + ((getIotJobArn() == null) ? 0 : getIotJobArn().hashCode());
        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        hashCode = prime * hashCode + ((getDeploymentPolicies() == null) ? 0 : getDeploymentPolicies().hashCode());
        hashCode = prime * hashCode + ((getIotJobConfiguration() == null) ? 0 : getIotJobConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getIsLatestForTarget() == null) ? 0 : getIsLatestForTarget().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentResult clone() {
        try {
            return (GetDeploymentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
