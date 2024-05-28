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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateLifecyclePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLifecyclePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy resource.
     * </p>
     */
    private String lifecyclePolicyArn;
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
     * The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to update the lifecycle policy.
     * </p>
     */
    private String executionRole;
    /**
     * <p>
     * The type of image resource that the lifecycle policy applies to.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The configuration details for a lifecycle policy resource.
     * </p>
     */
    private java.util.List<LifecyclePolicyDetail> policyDetails;
    /**
     * <p>
     * Selection criteria for resources that the lifecycle policy applies to.
     * </p>
     */
    private LifecyclePolicyResourceSelection resourceSelection;
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
     * The Amazon Resource Name (ARN) of the lifecycle policy resource.
     * </p>
     * 
     * @param lifecyclePolicyArn
     *        The Amazon Resource Name (ARN) of the lifecycle policy resource.
     */

    public void setLifecyclePolicyArn(String lifecyclePolicyArn) {
        this.lifecyclePolicyArn = lifecyclePolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the lifecycle policy resource.
     */

    public String getLifecyclePolicyArn() {
        return this.lifecyclePolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy resource.
     * </p>
     * 
     * @param lifecyclePolicyArn
     *        The Amazon Resource Name (ARN) of the lifecycle policy resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLifecyclePolicyRequest withLifecyclePolicyArn(String lifecyclePolicyArn) {
        setLifecyclePolicyArn(lifecyclePolicyArn);
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

    public UpdateLifecyclePolicyRequest withDescription(String description) {
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

    public UpdateLifecyclePolicyRequest withStatus(String status) {
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

    public UpdateLifecyclePolicyRequest withStatus(LifecyclePolicyStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to update the lifecycle policy.
     * </p>
     * 
     * @param executionRole
     *        The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to update the lifecycle
     *        policy.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to update the lifecycle policy.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to update the lifecycle
     *         policy.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to update the lifecycle policy.
     * </p>
     * 
     * @param executionRole
     *        The name or Amazon Resource Name (ARN) of the IAM role that Image Builder uses to update the lifecycle
     *        policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLifecyclePolicyRequest withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
        return this;
    }

    /**
     * <p>
     * The type of image resource that the lifecycle policy applies to.
     * </p>
     * 
     * @param resourceType
     *        The type of image resource that the lifecycle policy applies to.
     * @see LifecyclePolicyResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of image resource that the lifecycle policy applies to.
     * </p>
     * 
     * @return The type of image resource that the lifecycle policy applies to.
     * @see LifecyclePolicyResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of image resource that the lifecycle policy applies to.
     * </p>
     * 
     * @param resourceType
     *        The type of image resource that the lifecycle policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyResourceType
     */

    public UpdateLifecyclePolicyRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of image resource that the lifecycle policy applies to.
     * </p>
     * 
     * @param resourceType
     *        The type of image resource that the lifecycle policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyResourceType
     */

    public UpdateLifecyclePolicyRequest withResourceType(LifecyclePolicyResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration details for a lifecycle policy resource.
     * </p>
     * 
     * @return The configuration details for a lifecycle policy resource.
     */

    public java.util.List<LifecyclePolicyDetail> getPolicyDetails() {
        return policyDetails;
    }

    /**
     * <p>
     * The configuration details for a lifecycle policy resource.
     * </p>
     * 
     * @param policyDetails
     *        The configuration details for a lifecycle policy resource.
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
     * The configuration details for a lifecycle policy resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyDetails(java.util.Collection)} or {@link #withPolicyDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param policyDetails
     *        The configuration details for a lifecycle policy resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLifecyclePolicyRequest withPolicyDetails(LifecyclePolicyDetail... policyDetails) {
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
     * The configuration details for a lifecycle policy resource.
     * </p>
     * 
     * @param policyDetails
     *        The configuration details for a lifecycle policy resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLifecyclePolicyRequest withPolicyDetails(java.util.Collection<LifecyclePolicyDetail> policyDetails) {
        setPolicyDetails(policyDetails);
        return this;
    }

    /**
     * <p>
     * Selection criteria for resources that the lifecycle policy applies to.
     * </p>
     * 
     * @param resourceSelection
     *        Selection criteria for resources that the lifecycle policy applies to.
     */

    public void setResourceSelection(LifecyclePolicyResourceSelection resourceSelection) {
        this.resourceSelection = resourceSelection;
    }

    /**
     * <p>
     * Selection criteria for resources that the lifecycle policy applies to.
     * </p>
     * 
     * @return Selection criteria for resources that the lifecycle policy applies to.
     */

    public LifecyclePolicyResourceSelection getResourceSelection() {
        return this.resourceSelection;
    }

    /**
     * <p>
     * Selection criteria for resources that the lifecycle policy applies to.
     * </p>
     * 
     * @param resourceSelection
     *        Selection criteria for resources that the lifecycle policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLifecyclePolicyRequest withResourceSelection(LifecyclePolicyResourceSelection resourceSelection) {
        setResourceSelection(resourceSelection);
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

    public UpdateLifecyclePolicyRequest withClientToken(String clientToken) {
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
        if (getLifecyclePolicyArn() != null)
            sb.append("LifecyclePolicyArn: ").append(getLifecyclePolicyArn()).append(",");
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

        if (obj instanceof UpdateLifecyclePolicyRequest == false)
            return false;
        UpdateLifecyclePolicyRequest other = (UpdateLifecyclePolicyRequest) obj;
        if (other.getLifecyclePolicyArn() == null ^ this.getLifecyclePolicyArn() == null)
            return false;
        if (other.getLifecyclePolicyArn() != null && other.getLifecyclePolicyArn().equals(this.getLifecyclePolicyArn()) == false)
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

        hashCode = prime * hashCode + ((getLifecyclePolicyArn() == null) ? 0 : getLifecyclePolicyArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getPolicyDetails() == null) ? 0 : getPolicyDetails().hashCode());
        hashCode = prime * hashCode + ((getResourceSelection() == null) ? 0 : getResourceSelection().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLifecyclePolicyRequest clone() {
        return (UpdateLifecyclePolicyRequest) super.clone();
    }

}
