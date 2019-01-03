/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/GetLifecyclePolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLifecyclePoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifiers of the data lifecycle policies.
     * </p>
     */
    private java.util.List<String> policyIds;
    /**
     * <p>
     * The activation state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The resource type.
     * </p>
     */
    private java.util.List<String> resourceTypes;
    /**
     * <p>
     * The target tag for a policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     */
    private java.util.List<String> targetTags;
    /**
     * <p>
     * The tags to add to objects created by the policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * <p>
     * These user-defined tags are added in addition to the AWS-added lifecycle tags.
     * </p>
     */
    private java.util.List<String> tagsToAdd;

    /**
     * <p>
     * The identifiers of the data lifecycle policies.
     * </p>
     * 
     * @return The identifiers of the data lifecycle policies.
     */

    public java.util.List<String> getPolicyIds() {
        return policyIds;
    }

    /**
     * <p>
     * The identifiers of the data lifecycle policies.
     * </p>
     * 
     * @param policyIds
     *        The identifiers of the data lifecycle policies.
     */

    public void setPolicyIds(java.util.Collection<String> policyIds) {
        if (policyIds == null) {
            this.policyIds = null;
            return;
        }

        this.policyIds = new java.util.ArrayList<String>(policyIds);
    }

    /**
     * <p>
     * The identifiers of the data lifecycle policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyIds(java.util.Collection)} or {@link #withPolicyIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyIds
     *        The identifiers of the data lifecycle policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePoliciesRequest withPolicyIds(String... policyIds) {
        if (this.policyIds == null) {
            setPolicyIds(new java.util.ArrayList<String>(policyIds.length));
        }
        for (String ele : policyIds) {
            this.policyIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the data lifecycle policies.
     * </p>
     * 
     * @param policyIds
     *        The identifiers of the data lifecycle policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePoliciesRequest withPolicyIds(java.util.Collection<String> policyIds) {
        setPolicyIds(policyIds);
        return this;
    }

    /**
     * <p>
     * The activation state.
     * </p>
     * 
     * @param state
     *        The activation state.
     * @see GettablePolicyStateValues
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The activation state.
     * </p>
     * 
     * @return The activation state.
     * @see GettablePolicyStateValues
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The activation state.
     * </p>
     * 
     * @param state
     *        The activation state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GettablePolicyStateValues
     */

    public GetLifecyclePoliciesRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The activation state.
     * </p>
     * 
     * @param state
     *        The activation state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GettablePolicyStateValues
     */

    public GetLifecyclePoliciesRequest withState(GettablePolicyStateValues state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     * @see ResourceTypeValues
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type.
     * @see ResourceTypeValues
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeValues
     */

    public GetLifecyclePoliciesRequest withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeValues
     */

    public GetLifecyclePoliciesRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeValues
     */

    public GetLifecyclePoliciesRequest withResourceTypes(ResourceTypeValues... resourceTypes) {
        java.util.ArrayList<String> resourceTypesCopy = new java.util.ArrayList<String>(resourceTypes.length);
        for (ResourceTypeValues value : resourceTypes) {
            resourceTypesCopy.add(value.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The target tag for a policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * 
     * @return The target tag for a policy.</p>
     *         <p>
     *         Tags are strings in the format <code>key=value</code>.
     */

    public java.util.List<String> getTargetTags() {
        return targetTags;
    }

    /**
     * <p>
     * The target tag for a policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * 
     * @param targetTags
     *        The target tag for a policy.</p>
     *        <p>
     *        Tags are strings in the format <code>key=value</code>.
     */

    public void setTargetTags(java.util.Collection<String> targetTags) {
        if (targetTags == null) {
            this.targetTags = null;
            return;
        }

        this.targetTags = new java.util.ArrayList<String>(targetTags);
    }

    /**
     * <p>
     * The target tag for a policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetTags(java.util.Collection)} or {@link #withTargetTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetTags
     *        The target tag for a policy.</p>
     *        <p>
     *        Tags are strings in the format <code>key=value</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePoliciesRequest withTargetTags(String... targetTags) {
        if (this.targetTags == null) {
            setTargetTags(new java.util.ArrayList<String>(targetTags.length));
        }
        for (String ele : targetTags) {
            this.targetTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The target tag for a policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * 
     * @param targetTags
     *        The target tag for a policy.</p>
     *        <p>
     *        Tags are strings in the format <code>key=value</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePoliciesRequest withTargetTags(java.util.Collection<String> targetTags) {
        setTargetTags(targetTags);
        return this;
    }

    /**
     * <p>
     * The tags to add to objects created by the policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * <p>
     * These user-defined tags are added in addition to the AWS-added lifecycle tags.
     * </p>
     * 
     * @return The tags to add to objects created by the policy.</p>
     *         <p>
     *         Tags are strings in the format <code>key=value</code>.
     *         </p>
     *         <p>
     *         These user-defined tags are added in addition to the AWS-added lifecycle tags.
     */

    public java.util.List<String> getTagsToAdd() {
        return tagsToAdd;
    }

    /**
     * <p>
     * The tags to add to objects created by the policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * <p>
     * These user-defined tags are added in addition to the AWS-added lifecycle tags.
     * </p>
     * 
     * @param tagsToAdd
     *        The tags to add to objects created by the policy.</p>
     *        <p>
     *        Tags are strings in the format <code>key=value</code>.
     *        </p>
     *        <p>
     *        These user-defined tags are added in addition to the AWS-added lifecycle tags.
     */

    public void setTagsToAdd(java.util.Collection<String> tagsToAdd) {
        if (tagsToAdd == null) {
            this.tagsToAdd = null;
            return;
        }

        this.tagsToAdd = new java.util.ArrayList<String>(tagsToAdd);
    }

    /**
     * <p>
     * The tags to add to objects created by the policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * <p>
     * These user-defined tags are added in addition to the AWS-added lifecycle tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagsToAdd(java.util.Collection)} or {@link #withTagsToAdd(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagsToAdd
     *        The tags to add to objects created by the policy.</p>
     *        <p>
     *        Tags are strings in the format <code>key=value</code>.
     *        </p>
     *        <p>
     *        These user-defined tags are added in addition to the AWS-added lifecycle tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePoliciesRequest withTagsToAdd(String... tagsToAdd) {
        if (this.tagsToAdd == null) {
            setTagsToAdd(new java.util.ArrayList<String>(tagsToAdd.length));
        }
        for (String ele : tagsToAdd) {
            this.tagsToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to add to objects created by the policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * <p>
     * These user-defined tags are added in addition to the AWS-added lifecycle tags.
     * </p>
     * 
     * @param tagsToAdd
     *        The tags to add to objects created by the policy.</p>
     *        <p>
     *        Tags are strings in the format <code>key=value</code>.
     *        </p>
     *        <p>
     *        These user-defined tags are added in addition to the AWS-added lifecycle tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePoliciesRequest withTagsToAdd(java.util.Collection<String> tagsToAdd) {
        setTagsToAdd(tagsToAdd);
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
        if (getPolicyIds() != null)
            sb.append("PolicyIds: ").append(getPolicyIds()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getTargetTags() != null)
            sb.append("TargetTags: ").append(getTargetTags()).append(",");
        if (getTagsToAdd() != null)
            sb.append("TagsToAdd: ").append(getTagsToAdd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLifecyclePoliciesRequest == false)
            return false;
        GetLifecyclePoliciesRequest other = (GetLifecyclePoliciesRequest) obj;
        if (other.getPolicyIds() == null ^ this.getPolicyIds() == null)
            return false;
        if (other.getPolicyIds() != null && other.getPolicyIds().equals(this.getPolicyIds()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getTargetTags() == null ^ this.getTargetTags() == null)
            return false;
        if (other.getTargetTags() != null && other.getTargetTags().equals(this.getTargetTags()) == false)
            return false;
        if (other.getTagsToAdd() == null ^ this.getTagsToAdd() == null)
            return false;
        if (other.getTagsToAdd() != null && other.getTagsToAdd().equals(this.getTagsToAdd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyIds() == null) ? 0 : getPolicyIds().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getTargetTags() == null) ? 0 : getTargetTags().hashCode());
        hashCode = prime * hashCode + ((getTagsToAdd() == null) ? 0 : getTagsToAdd().hashCode());
        return hashCode;
    }

    @Override
    public GetLifecyclePoliciesRequest clone() {
        return (GetLifecyclePoliciesRequest) super.clone();
    }

}
