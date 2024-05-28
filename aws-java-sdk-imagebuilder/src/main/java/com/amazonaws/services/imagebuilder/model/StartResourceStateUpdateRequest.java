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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/StartResourceStateUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartResourceStateUpdateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the Image Builder resource that is updated. The state update might also impact associated resources.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Indicates the lifecycle action to take for this request.
     * </p>
     */
    private ResourceState state;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role that’s used to update image state.
     * </p>
     */
    private String executionRole;
    /**
     * <p>
     * A list of image resources to update state for.
     * </p>
     */
    private ResourceStateUpdateIncludeResources includeResources;
    /**
     * <p>
     * Skip action on the image resource and associated resources if specified exclusion rules are met.
     * </p>
     */
    private ResourceStateUpdateExclusionRules exclusionRules;
    /**
     * <p>
     * The timestamp that indicates when resources are updated by a lifecycle action.
     * </p>
     */
    private java.util.Date updateAt;
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
     * The ARN of the Image Builder resource that is updated. The state update might also impact associated resources.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the Image Builder resource that is updated. The state update might also impact associated
     *        resources.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the Image Builder resource that is updated. The state update might also impact associated resources.
     * </p>
     * 
     * @return The ARN of the Image Builder resource that is updated. The state update might also impact associated
     *         resources.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the Image Builder resource that is updated. The state update might also impact associated resources.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the Image Builder resource that is updated. The state update might also impact associated
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartResourceStateUpdateRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Indicates the lifecycle action to take for this request.
     * </p>
     * 
     * @param state
     *        Indicates the lifecycle action to take for this request.
     */

    public void setState(ResourceState state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates the lifecycle action to take for this request.
     * </p>
     * 
     * @return Indicates the lifecycle action to take for this request.
     */

    public ResourceState getState() {
        return this.state;
    }

    /**
     * <p>
     * Indicates the lifecycle action to take for this request.
     * </p>
     * 
     * @param state
     *        Indicates the lifecycle action to take for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartResourceStateUpdateRequest withState(ResourceState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role that’s used to update image state.
     * </p>
     * 
     * @param executionRole
     *        The name or Amazon Resource Name (ARN) of the IAM role that’s used to update image state.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role that’s used to update image state.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the IAM role that’s used to update image state.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role that’s used to update image state.
     * </p>
     * 
     * @param executionRole
     *        The name or Amazon Resource Name (ARN) of the IAM role that’s used to update image state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartResourceStateUpdateRequest withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
        return this;
    }

    /**
     * <p>
     * A list of image resources to update state for.
     * </p>
     * 
     * @param includeResources
     *        A list of image resources to update state for.
     */

    public void setIncludeResources(ResourceStateUpdateIncludeResources includeResources) {
        this.includeResources = includeResources;
    }

    /**
     * <p>
     * A list of image resources to update state for.
     * </p>
     * 
     * @return A list of image resources to update state for.
     */

    public ResourceStateUpdateIncludeResources getIncludeResources() {
        return this.includeResources;
    }

    /**
     * <p>
     * A list of image resources to update state for.
     * </p>
     * 
     * @param includeResources
     *        A list of image resources to update state for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartResourceStateUpdateRequest withIncludeResources(ResourceStateUpdateIncludeResources includeResources) {
        setIncludeResources(includeResources);
        return this;
    }

    /**
     * <p>
     * Skip action on the image resource and associated resources if specified exclusion rules are met.
     * </p>
     * 
     * @param exclusionRules
     *        Skip action on the image resource and associated resources if specified exclusion rules are met.
     */

    public void setExclusionRules(ResourceStateUpdateExclusionRules exclusionRules) {
        this.exclusionRules = exclusionRules;
    }

    /**
     * <p>
     * Skip action on the image resource and associated resources if specified exclusion rules are met.
     * </p>
     * 
     * @return Skip action on the image resource and associated resources if specified exclusion rules are met.
     */

    public ResourceStateUpdateExclusionRules getExclusionRules() {
        return this.exclusionRules;
    }

    /**
     * <p>
     * Skip action on the image resource and associated resources if specified exclusion rules are met.
     * </p>
     * 
     * @param exclusionRules
     *        Skip action on the image resource and associated resources if specified exclusion rules are met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartResourceStateUpdateRequest withExclusionRules(ResourceStateUpdateExclusionRules exclusionRules) {
        setExclusionRules(exclusionRules);
        return this;
    }

    /**
     * <p>
     * The timestamp that indicates when resources are updated by a lifecycle action.
     * </p>
     * 
     * @param updateAt
     *        The timestamp that indicates when resources are updated by a lifecycle action.
     */

    public void setUpdateAt(java.util.Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * <p>
     * The timestamp that indicates when resources are updated by a lifecycle action.
     * </p>
     * 
     * @return The timestamp that indicates when resources are updated by a lifecycle action.
     */

    public java.util.Date getUpdateAt() {
        return this.updateAt;
    }

    /**
     * <p>
     * The timestamp that indicates when resources are updated by a lifecycle action.
     * </p>
     * 
     * @param updateAt
     *        The timestamp that indicates when resources are updated by a lifecycle action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartResourceStateUpdateRequest withUpdateAt(java.util.Date updateAt) {
        setUpdateAt(updateAt);
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

    public StartResourceStateUpdateRequest withClientToken(String clientToken) {
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: ").append(getExecutionRole()).append(",");
        if (getIncludeResources() != null)
            sb.append("IncludeResources: ").append(getIncludeResources()).append(",");
        if (getExclusionRules() != null)
            sb.append("ExclusionRules: ").append(getExclusionRules()).append(",");
        if (getUpdateAt() != null)
            sb.append("UpdateAt: ").append(getUpdateAt()).append(",");
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

        if (obj instanceof StartResourceStateUpdateRequest == false)
            return false;
        StartResourceStateUpdateRequest other = (StartResourceStateUpdateRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        if (other.getIncludeResources() == null ^ this.getIncludeResources() == null)
            return false;
        if (other.getIncludeResources() != null && other.getIncludeResources().equals(this.getIncludeResources()) == false)
            return false;
        if (other.getExclusionRules() == null ^ this.getExclusionRules() == null)
            return false;
        if (other.getExclusionRules() != null && other.getExclusionRules().equals(this.getExclusionRules()) == false)
            return false;
        if (other.getUpdateAt() == null ^ this.getUpdateAt() == null)
            return false;
        if (other.getUpdateAt() != null && other.getUpdateAt().equals(this.getUpdateAt()) == false)
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

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getIncludeResources() == null) ? 0 : getIncludeResources().hashCode());
        hashCode = prime * hashCode + ((getExclusionRules() == null) ? 0 : getExclusionRules().hashCode());
        hashCode = prime * hashCode + ((getUpdateAt() == null) ? 0 : getUpdateAt().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public StartResourceStateUpdateRequest clone() {
        return (StartResourceStateUpdateRequest) super.clone();
    }

}
