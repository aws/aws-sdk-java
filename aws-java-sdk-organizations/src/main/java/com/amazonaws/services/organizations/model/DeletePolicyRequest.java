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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeletePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to delete. You can get the ID from the <a>ListPolicies</a>
     * or <a>ListPoliciesForTarget</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     */
    private String policyId;

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to delete. You can get the ID from the <a>ListPolicies</a>
     * or <a>ListPoliciesForTarget</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     * 
     * @param policyId
     *        The unique identifier (ID) of the policy that you want to delete. You can get the ID from the
     *        <a>ListPolicies</a> or <a>ListPoliciesForTarget</a> operations.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-"
     *        followed by from 8 to 128 lower-case letters or digits.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to delete. You can get the ID from the <a>ListPolicies</a>
     * or <a>ListPoliciesForTarget</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     * 
     * @return The unique identifier (ID) of the policy that you want to delete. You can get the ID from the
     *         <a>ListPolicies</a> or <a>ListPoliciesForTarget</a> operations.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-"
     *         followed by from 8 to 128 lower-case letters or digits.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to delete. You can get the ID from the <a>ListPolicies</a>
     * or <a>ListPoliciesForTarget</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     * 
     * @param policyId
     *        The unique identifier (ID) of the policy that you want to delete. You can get the ID from the
     *        <a>ListPolicies</a> or <a>ListPoliciesForTarget</a> operations.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-"
     *        followed by from 8 to 128 lower-case letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePolicyRequest withPolicyId(String policyId) {
        setPolicyId(policyId);
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePolicyRequest == false)
            return false;
        DeletePolicyRequest other = (DeletePolicyRequest) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        return hashCode;
    }

    @Override
    public DeletePolicyRequest clone() {
        return (DeletePolicyRequest) super.clone();
    }

}
