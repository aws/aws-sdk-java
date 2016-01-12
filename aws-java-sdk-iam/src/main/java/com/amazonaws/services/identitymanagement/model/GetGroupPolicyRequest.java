/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetGroupPolicyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the group the policy is associated with.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The name of the policy document to get.
     * </p>
     */
    private String policyName;

    /**
     * Default constructor for GetGroupPolicyRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize the object
     * after creating it.
     */
    public GetGroupPolicyRequest() {
    }

    /**
     * Constructs a new GetGroupPolicyRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param groupName
     *        The name of the group the policy is associated with.
     * @param policyName
     *        The name of the policy document to get.
     */
    public GetGroupPolicyRequest(String groupName, String policyName) {
        setGroupName(groupName);
        setPolicyName(policyName);
    }

    /**
     * <p>
     * The name of the group the policy is associated with.
     * </p>
     * 
     * @param groupName
     *        The name of the group the policy is associated with.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group the policy is associated with.
     * </p>
     * 
     * @return The name of the group the policy is associated with.
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group the policy is associated with.
     * </p>
     * 
     * @param groupName
     *        The name of the group the policy is associated with.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetGroupPolicyRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The name of the policy document to get.
     * </p>
     * 
     * @param policyName
     *        The name of the policy document to get.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy document to get.
     * </p>
     * 
     * @return The name of the policy document to get.
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy document to get.
     * </p>
     * 
     * @param policyName
     *        The name of the policy document to get.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetGroupPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupPolicyRequest == false)
            return false;
        GetGroupPolicyRequest other = (GetGroupPolicyRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupPolicyRequest clone() {
        return (GetGroupPolicyRequest) super.clone();
    }
}