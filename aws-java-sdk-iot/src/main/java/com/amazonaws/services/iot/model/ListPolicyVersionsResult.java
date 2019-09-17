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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output from the ListPolicyVersions operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPolicyVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The policy versions.
     * </p>
     */
    private java.util.List<PolicyVersion> policyVersions;

    /**
     * <p>
     * The policy versions.
     * </p>
     * 
     * @return The policy versions.
     */

    public java.util.List<PolicyVersion> getPolicyVersions() {
        return policyVersions;
    }

    /**
     * <p>
     * The policy versions.
     * </p>
     * 
     * @param policyVersions
     *        The policy versions.
     */

    public void setPolicyVersions(java.util.Collection<PolicyVersion> policyVersions) {
        if (policyVersions == null) {
            this.policyVersions = null;
            return;
        }

        this.policyVersions = new java.util.ArrayList<PolicyVersion>(policyVersions);
    }

    /**
     * <p>
     * The policy versions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyVersions(java.util.Collection)} or {@link #withPolicyVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param policyVersions
     *        The policy versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPolicyVersionsResult withPolicyVersions(PolicyVersion... policyVersions) {
        if (this.policyVersions == null) {
            setPolicyVersions(new java.util.ArrayList<PolicyVersion>(policyVersions.length));
        }
        for (PolicyVersion ele : policyVersions) {
            this.policyVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The policy versions.
     * </p>
     * 
     * @param policyVersions
     *        The policy versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPolicyVersionsResult withPolicyVersions(java.util.Collection<PolicyVersion> policyVersions) {
        setPolicyVersions(policyVersions);
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
        if (getPolicyVersions() != null)
            sb.append("PolicyVersions: ").append(getPolicyVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPolicyVersionsResult == false)
            return false;
        ListPolicyVersionsResult other = (ListPolicyVersionsResult) obj;
        if (other.getPolicyVersions() == null ^ this.getPolicyVersions() == null)
            return false;
        if (other.getPolicyVersions() != null && other.getPolicyVersions().equals(this.getPolicyVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyVersions() == null) ? 0 : getPolicyVersions().hashCode());
        return hashCode;
    }

    @Override
    public ListPolicyVersionsResult clone() {
        try {
            return (ListPolicyVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
