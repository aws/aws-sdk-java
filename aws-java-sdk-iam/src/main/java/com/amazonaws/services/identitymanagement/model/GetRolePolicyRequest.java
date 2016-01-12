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
public class GetRolePolicyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the role associated with the policy.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The name of the policy document to get.
     * </p>
     */
    private String policyName;

    /**
     * <p>
     * The name of the role associated with the policy.
     * </p>
     * 
     * @param roleName
     *        The name of the role associated with the policy.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role associated with the policy.
     * </p>
     * 
     * @return The name of the role associated with the policy.
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role associated with the policy.
     * </p>
     * 
     * @param roleName
     *        The name of the role associated with the policy.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetRolePolicyRequest withRoleName(String roleName) {
        setRoleName(roleName);
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
    public GetRolePolicyRequest withPolicyName(String policyName) {
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
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
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

        if (obj instanceof GetRolePolicyRequest == false)
            return false;
        GetRolePolicyRequest other = (GetRolePolicyRequest) obj;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null
                && other.getRoleName().equals(this.getRoleName()) == false)
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
                + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public GetRolePolicyRequest clone() {
        return (GetRolePolicyRequest) super.clone();
    }
}