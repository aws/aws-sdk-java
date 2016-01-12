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
public class PutRolePolicyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the role to associate the policy with.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The name of the policy document.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The policy document.
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * The name of the role to associate the policy with.
     * </p>
     * 
     * @param roleName
     *        The name of the role to associate the policy with.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role to associate the policy with.
     * </p>
     * 
     * @return The name of the role to associate the policy with.
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role to associate the policy with.
     * </p>
     * 
     * @param roleName
     *        The name of the role to associate the policy with.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutRolePolicyRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The name of the policy document.
     * </p>
     * 
     * @param policyName
     *        The name of the policy document.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy document.
     * </p>
     * 
     * @return The name of the policy document.
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy document.
     * </p>
     * 
     * @param policyName
     *        The name of the policy document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutRolePolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * 
     * @param policyDocument
     *        The policy document.
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * 
     * @return The policy document.
     */
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * 
     * @param policyDocument
     *        The policy document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutRolePolicyRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
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
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: " + getPolicyDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRolePolicyRequest == false)
            return false;
        PutRolePolicyRequest other = (PutRolePolicyRequest) obj;
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
        if (other.getPolicyDocument() == null
                ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null
                && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
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
        hashCode = prime
                * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument()
                        .hashCode());
        return hashCode;
    }

    @Override
    public PutRolePolicyRequest clone() {
        return (PutRolePolicyRequest) super.clone();
    }
}