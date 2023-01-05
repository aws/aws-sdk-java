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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CreateDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * IoT thing or thing group. When creating a subdeployment, the targetARN can only be a thing group.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The name of the deployment.
     * </p>
     */
    private String deploymentName;
    /**
     * <p>
     * The components to deploy. This is a dictionary, where each key is the name of a component, and each key's value
     * is the version and configuration to deploy for that component.
     * </p>
     */
    private java.util.Map<String, ComponentDeploymentSpecification> components;
    /**
     * <p>
     * The job configuration for the deployment configuration. The job configuration specifies the rollout, timeout, and
     * stop configurations for the deployment configuration.
     * </p>
     */
    private DeploymentIoTJobConfiguration iotJobConfiguration;
    /**
     * <p>
     * The deployment policies for the deployment. These policies define how the deployment updates components and
     * handles failure.
     * </p>
     */
    private DeploymentPolicies deploymentPolicies;
    /**
     * <p>
     * The parent deployment's target <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> within a subdeployment.
     * </p>
     */
    private String parentTargetArn;
    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a> in the
     * <i>IoT Greengrass V2 Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A unique, case-sensitive identifier that you can provide to ensure that the request is idempotent. Idempotency
     * means that the request is successfully processed only once, even if you send the request multiple times. When a
     * request succeeds, and you specify the same client token for subsequent successful requests, the IoT Greengrass V2
     * service returns the successful response that it caches from the previous request. IoT Greengrass V2 caches
     * successful responses for idempotent requests for up to 8 hours.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * IoT thing or thing group. When creating a subdeployment, the targetARN can only be a thing group.
     * </p>
     * 
     * @param targetArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        target IoT thing or thing group. When creating a subdeployment, the targetARN can only be a thing group.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * IoT thing or thing group. When creating a subdeployment, the targetARN can only be a thing group.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         target IoT thing or thing group. When creating a subdeployment, the targetARN can only be a thing group.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * IoT thing or thing group. When creating a subdeployment, the targetARN can only be a thing group.
     * </p>
     * 
     * @param targetArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        target IoT thing or thing group. When creating a subdeployment, the targetARN can only be a thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The name of the deployment.
     * </p>
     * 
     * @param deploymentName
     *        The name of the deployment.
     */

    public void setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
    }

    /**
     * <p>
     * The name of the deployment.
     * </p>
     * 
     * @return The name of the deployment.
     */

    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * <p>
     * The name of the deployment.
     * </p>
     * 
     * @param deploymentName
     *        The name of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withDeploymentName(String deploymentName) {
        setDeploymentName(deploymentName);
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

    public CreateDeploymentRequest withComponents(java.util.Map<String, ComponentDeploymentSpecification> components) {
        setComponents(components);
        return this;
    }

    /**
     * Add a single Components entry
     *
     * @see CreateDeploymentRequest#withComponents
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest addComponentsEntry(String key, ComponentDeploymentSpecification value) {
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

    public CreateDeploymentRequest clearComponentsEntries() {
        this.components = null;
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

    public CreateDeploymentRequest withIotJobConfiguration(DeploymentIoTJobConfiguration iotJobConfiguration) {
        setIotJobConfiguration(iotJobConfiguration);
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

    public CreateDeploymentRequest withDeploymentPolicies(DeploymentPolicies deploymentPolicies) {
        setDeploymentPolicies(deploymentPolicies);
        return this;
    }

    /**
     * <p>
     * The parent deployment's target <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> within a subdeployment.
     * </p>
     * 
     * @param parentTargetArn
     *        The parent deployment's target <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> within a
     *        subdeployment.
     */

    public void setParentTargetArn(String parentTargetArn) {
        this.parentTargetArn = parentTargetArn;
    }

    /**
     * <p>
     * The parent deployment's target <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> within a subdeployment.
     * </p>
     * 
     * @return The parent deployment's target <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> within a
     *         subdeployment.
     */

    public String getParentTargetArn() {
        return this.parentTargetArn;
    }

    /**
     * <p>
     * The parent deployment's target <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> within a subdeployment.
     * </p>
     * 
     * @param parentTargetArn
     *        The parent deployment's target <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> within a
     *        subdeployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withParentTargetArn(String parentTargetArn) {
        setParentTargetArn(parentTargetArn);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a> in the
     * <i>IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @return A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *         href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a>
     *         in the <i>IoT Greengrass V2 Developer Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a> in the
     * <i>IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a>
     *        in the <i>IoT Greengrass V2 Developer Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a> in the
     * <i>IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a>
     *        in the <i>IoT Greengrass V2 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDeploymentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest addTagsEntry(String key, String value) {
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

    public CreateDeploymentRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you can provide to ensure that the request is idempotent. Idempotency
     * means that the request is successfully processed only once, even if you send the request multiple times. When a
     * request succeeds, and you specify the same client token for subsequent successful requests, the IoT Greengrass V2
     * service returns the successful response that it caches from the previous request. IoT Greengrass V2 caches
     * successful responses for idempotent requests for up to 8 hours.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you can provide to ensure that the request is idempotent.
     *        Idempotency means that the request is successfully processed only once, even if you send the request
     *        multiple times. When a request succeeds, and you specify the same client token for subsequent successful
     *        requests, the IoT Greengrass V2 service returns the successful response that it caches from the previous
     *        request. IoT Greengrass V2 caches successful responses for idempotent requests for up to 8 hours.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you can provide to ensure that the request is idempotent. Idempotency
     * means that the request is successfully processed only once, even if you send the request multiple times. When a
     * request succeeds, and you specify the same client token for subsequent successful requests, the IoT Greengrass V2
     * service returns the successful response that it caches from the previous request. IoT Greengrass V2 caches
     * successful responses for idempotent requests for up to 8 hours.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you can provide to ensure that the request is idempotent.
     *         Idempotency means that the request is successfully processed only once, even if you send the request
     *         multiple times. When a request succeeds, and you specify the same client token for subsequent successful
     *         requests, the IoT Greengrass V2 service returns the successful response that it caches from the previous
     *         request. IoT Greengrass V2 caches successful responses for idempotent requests for up to 8 hours.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you can provide to ensure that the request is idempotent. Idempotency
     * means that the request is successfully processed only once, even if you send the request multiple times. When a
     * request succeeds, and you specify the same client token for subsequent successful requests, the IoT Greengrass V2
     * service returns the successful response that it caches from the previous request. IoT Greengrass V2 caches
     * successful responses for idempotent requests for up to 8 hours.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you can provide to ensure that the request is idempotent.
     *        Idempotency means that the request is successfully processed only once, even if you send the request
     *        multiple times. When a request succeeds, and you specify the same client token for subsequent successful
     *        requests, the IoT Greengrass V2 service returns the successful response that it caches from the previous
     *        request. IoT Greengrass V2 caches successful responses for idempotent requests for up to 8 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getDeploymentName() != null)
            sb.append("DeploymentName: ").append(getDeploymentName()).append(",");
        if (getComponents() != null)
            sb.append("Components: ").append(getComponents()).append(",");
        if (getIotJobConfiguration() != null)
            sb.append("IotJobConfiguration: ").append(getIotJobConfiguration()).append(",");
        if (getDeploymentPolicies() != null)
            sb.append("DeploymentPolicies: ").append(getDeploymentPolicies()).append(",");
        if (getParentTargetArn() != null)
            sb.append("ParentTargetArn: ").append(getParentTargetArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentRequest == false)
            return false;
        CreateDeploymentRequest other = (CreateDeploymentRequest) obj;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getDeploymentName() == null ^ this.getDeploymentName() == null)
            return false;
        if (other.getDeploymentName() != null && other.getDeploymentName().equals(this.getDeploymentName()) == false)
            return false;
        if (other.getComponents() == null ^ this.getComponents() == null)
            return false;
        if (other.getComponents() != null && other.getComponents().equals(this.getComponents()) == false)
            return false;
        if (other.getIotJobConfiguration() == null ^ this.getIotJobConfiguration() == null)
            return false;
        if (other.getIotJobConfiguration() != null && other.getIotJobConfiguration().equals(this.getIotJobConfiguration()) == false)
            return false;
        if (other.getDeploymentPolicies() == null ^ this.getDeploymentPolicies() == null)
            return false;
        if (other.getDeploymentPolicies() != null && other.getDeploymentPolicies().equals(this.getDeploymentPolicies()) == false)
            return false;
        if (other.getParentTargetArn() == null ^ this.getParentTargetArn() == null)
            return false;
        if (other.getParentTargetArn() != null && other.getParentTargetArn().equals(this.getParentTargetArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getDeploymentName() == null) ? 0 : getDeploymentName().hashCode());
        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        hashCode = prime * hashCode + ((getIotJobConfiguration() == null) ? 0 : getIotJobConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeploymentPolicies() == null) ? 0 : getDeploymentPolicies().hashCode());
        hashCode = prime * hashCode + ((getParentTargetArn() == null) ? 0 : getParentTargetArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentRequest clone() {
        return (CreateDeploymentRequest) super.clone();
    }

}
