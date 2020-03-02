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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/CreateLifecyclePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLifecyclePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The configuration details of the lifecycle policy.
     * </p>
     */
    private PolicyDetails policyDetails;
    /**
     * <p>
     * The tags to apply to the lifecycle policy during creation.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle
     *        policy.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle
     *         policy.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle
     *        policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     * </p>
     * 
     * @param description
     *        A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     * </p>
     * 
     * @return A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     * </p>
     * 
     * @param description
     *        A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * 
     * @param state
     *        The desired activation state of the lifecycle policy after creation.
     * @see SettablePolicyStateValues
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * 
     * @return The desired activation state of the lifecycle policy after creation.
     * @see SettablePolicyStateValues
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * 
     * @param state
     *        The desired activation state of the lifecycle policy after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettablePolicyStateValues
     */

    public CreateLifecyclePolicyRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * 
     * @param state
     *        The desired activation state of the lifecycle policy after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettablePolicyStateValues
     */

    public CreateLifecyclePolicyRequest withState(SettablePolicyStateValues state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The configuration details of the lifecycle policy.
     * </p>
     * 
     * @param policyDetails
     *        The configuration details of the lifecycle policy.
     */

    public void setPolicyDetails(PolicyDetails policyDetails) {
        this.policyDetails = policyDetails;
    }

    /**
     * <p>
     * The configuration details of the lifecycle policy.
     * </p>
     * 
     * @return The configuration details of the lifecycle policy.
     */

    public PolicyDetails getPolicyDetails() {
        return this.policyDetails;
    }

    /**
     * <p>
     * The configuration details of the lifecycle policy.
     * </p>
     * 
     * @param policyDetails
     *        The configuration details of the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyRequest withPolicyDetails(PolicyDetails policyDetails) {
        setPolicyDetails(policyDetails);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the lifecycle policy during creation.
     * </p>
     * 
     * @return The tags to apply to the lifecycle policy during creation.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the lifecycle policy during creation.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the lifecycle policy during creation.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to apply to the lifecycle policy during creation.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the lifecycle policy during creation.
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
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getPolicyDetails() != null)
            sb.append("PolicyDetails: ").append(getPolicyDetails()).append(",");
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

        if (obj instanceof CreateLifecyclePolicyRequest == false)
            return false;
        CreateLifecyclePolicyRequest other = (CreateLifecyclePolicyRequest) obj;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPolicyDetails() == null ^ this.getPolicyDetails() == null)
            return false;
        if (other.getPolicyDetails() != null && other.getPolicyDetails().equals(this.getPolicyDetails()) == false)
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

        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPolicyDetails() == null) ? 0 : getPolicyDetails().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLifecyclePolicyRequest clone() {
        return (CreateLifecyclePolicyRequest) super.clone();
    }

}
