/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateLifecyclePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLifecyclePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the lifecycle policy to create.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Optional description for the lifecycle policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether the lifecycle policy resource is enabled.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to run
     * lifecycle actions.
     * </p>
     */
    private String executionRole;
    /**
     * <p>
     * The type of Image Builder resource that the lifecycle policy applies to.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Configuration details for the lifecycle policy rules.
     * </p>
     */
    private java.util.List<LifecyclePolicyDetail> policyDetails;
    /**
     * <p>
     * Selection criteria for the resources that the lifecycle policy applies to.
     * </p>
     */
    private LifecyclePolicyResourceSelection resourceSelection;
    /**
     * <p>
     * Tags to apply to the lifecycle policy resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the lifecycle policy to create.
     * </p>
     * 
     * @param name
     *        The name of the lifecycle policy to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the lifecycle policy to create.
     * </p>
     * 
     * @return The name of the lifecycle policy to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the lifecycle policy to create.
     * </p>
     * 
     * @param name
     *        The name of the lifecycle policy to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Optional description for the lifecycle policy.
     * </p>
     * 
     * @param description
     *        Optional description for the lifecycle policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Optional description for the lifecycle policy.
     * </p>
     * 
     * @return Optional description for the lifecycle policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Optional description for the lifecycle policy.
     * </p>
     * 
     * @param description
     *        Optional description for the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates whether the lifecycle policy resource is enabled.
     * </p>
     * 
     * @param status
     *        Indicates whether the lifecycle policy resource is enabled.
     * @see LifecyclePolicyStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates whether the lifecycle policy resource is enabled.
     * </p>
     * 
     * @return Indicates whether the lifecycle policy resource is enabled.
     * @see LifecyclePolicyStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates whether the lifecycle policy resource is enabled.
     * </p>
     * 
     * @param status
     *        Indicates whether the lifecycle policy resource is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyStatus
     */

    public CreateLifecyclePolicyRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates whether the lifecycle policy resource is enabled.
     * </p>
     * 
     * @param status
     *        Indicates whether the lifecycle policy resource is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyStatus
     */

    public CreateLifecyclePolicyRequest withStatus(LifecyclePolicyStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to run
     * lifecycle actions.
     * </p>
     * 
     * @param executionRole
     *        The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to run
     *        lifecycle actions.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to run
     * lifecycle actions.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to
     *         run lifecycle actions.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to run
     * lifecycle actions.
     * </p>
     * 
     * @param executionRole
     *        The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder access to run
     *        lifecycle actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
        return this;
    }

    /**
     * <p>
     * The type of Image Builder resource that the lifecycle policy applies to.
     * </p>
     * 
     * @param resourceType
     *        The type of Image Builder resource that the lifecycle policy applies to.
     * @see LifecyclePolicyResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of Image Builder resource that the lifecycle policy applies to.
     * </p>
     * 
     * @return The type of Image Builder resource that the lifecycle policy applies to.
     * @see LifecyclePolicyResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of Image Builder resource that the lifecycle policy applies to.
     * </p>
     * 
     * @param resourceType
     *        The type of Image Builder resource that the lifecycle policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyResourceType
     */

    public CreateLifecyclePolicyRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of Image Builder resource that the lifecycle policy applies to.
     * </p>
     * 
     * @param resourceType
     *        The type of Image Builder resource that the lifecycle policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyResourceType
     */

    public CreateLifecyclePolicyRequest withResourceType(LifecyclePolicyResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Configuration details for the lifecycle policy rules.
     * </p>
     * 
     * @return Configuration details for the lifecycle policy rules.
     */

    public java.util.List<LifecyclePolicyDetail> getPolicyDetails() {
        return policyDetails;
    }

    /**
     * <p>
     * Configuration details for the lifecycle policy rules.
     * </p>
     * 
     * @param policyDetails
     *        Configuration details for the lifecycle policy rules.
     */

    public void setPolicyDetails(java.util.Collection<LifecyclePolicyDetail> policyDetails) {
        if (policyDetails == null) {
            this.policyDetails = null;
            return;
        }

        this.policyDetails = new java.util.ArrayList<LifecyclePolicyDetail>(policyDetails);
    }

    /**
     * <p>
     * Configuration details for the lifecycle policy rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyDetails(java.util.Collection)} or {@link #withPolicyDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param policyDetails
     *        Configuration details for the lifecycle policy rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withPolicyDetails(LifecyclePolicyDetail... policyDetails) {
        if (this.policyDetails == null) {
            setPolicyDetails(new java.util.ArrayList<LifecyclePolicyDetail>(policyDetails.length));
        }
        for (LifecyclePolicyDetail ele : policyDetails) {
            this.policyDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration details for the lifecycle policy rules.
     * </p>
     * 
     * @param policyDetails
     *        Configuration details for the lifecycle policy rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withPolicyDetails(java.util.Collection<LifecyclePolicyDetail> policyDetails) {
        setPolicyDetails(policyDetails);
        return this;
    }

    /**
     * <p>
     * Selection criteria for the resources that the lifecycle policy applies to.
     * </p>
     * 
     * @param resourceSelection
     *        Selection criteria for the resources that the lifecycle policy applies to.
     */

    public void setResourceSelection(LifecyclePolicyResourceSelection resourceSelection) {
        this.resourceSelection = resourceSelection;
    }

    /**
     * <p>
     * Selection criteria for the resources that the lifecycle policy applies to.
     * </p>
     * 
     * @return Selection criteria for the resources that the lifecycle policy applies to.
     */

    public LifecyclePolicyResourceSelection getResourceSelection() {
        return this.resourceSelection;
    }

    /**
     * <p>
     * Selection criteria for the resources that the lifecycle policy applies to.
     * </p>
     * 
     * @param resourceSelection
     *        Selection criteria for the resources that the lifecycle policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withResourceSelection(LifecyclePolicyResourceSelection resourceSelection) {
        setResourceSelection(resourceSelection);
        return this;
    }

    /**
     * <p>
     * Tags to apply to the lifecycle policy resource.
     * </p>
     * 
     * @return Tags to apply to the lifecycle policy resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to apply to the lifecycle policy resource.
     * </p>
     * 
     * @param tags
     *        Tags to apply to the lifecycle policy resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags to apply to the lifecycle policy resource.
     * </p>
     * 
     * @param tags
     *        Tags to apply to the lifecycle policy resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateLifecyclePolicyRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest addTagsEntry(String key, String value) {
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

    public CreateLifecyclePolicyRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *         see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withClientToken(String clientToken) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: ").append(getExecutionRole()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getPolicyDetails() != null)
            sb.append("PolicyDetails: ").append(getPolicyDetails()).append(",");
        if (getResourceSelection() != null)
            sb.append("ResourceSelection: ").append(getResourceSelection()).append(",");
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

        if (obj instanceof CreateLifecyclePolicyRequest == false)
            return false;
        CreateLifecyclePolicyRequest other = (CreateLifecyclePolicyRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getPolicyDetails() == null ^ this.getPolicyDetails() == null)
            return false;
        if (other.getPolicyDetails() != null && other.getPolicyDetails().equals(this.getPolicyDetails()) == false)
            return false;
        if (other.getResourceSelection() == null ^ this.getResourceSelection() == null)
            return false;
        if (other.getResourceSelection() != null && other.getResourceSelection().equals(this.getResourceSelection()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getPolicyDetails() == null) ? 0 : getPolicyDetails().hashCode());
        hashCode = prime * hashCode + ((getResourceSelection() == null) ? 0 : getResourceSelection().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateLifecyclePolicyRequest clone() {
        return (CreateLifecyclePolicyRequest) super.clone();
    }

}
