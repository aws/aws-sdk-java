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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/GetLifecyclePolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLifecyclePoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about the lifecycle policies.
     * </p>
     */
    private java.util.List<LifecyclePolicySummary> policies;

    /**
     * <p>
     * Summary information about the lifecycle policies.
     * </p>
     * 
     * @return Summary information about the lifecycle policies.
     */

    public java.util.List<LifecyclePolicySummary> getPolicies() {
        return policies;
    }

    /**
     * <p>
     * Summary information about the lifecycle policies.
     * </p>
     * 
     * @param policies
     *        Summary information about the lifecycle policies.
     */

    public void setPolicies(java.util.Collection<LifecyclePolicySummary> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new java.util.ArrayList<LifecyclePolicySummary>(policies);
    }

    /**
     * <p>
     * Summary information about the lifecycle policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicies(java.util.Collection)} or {@link #withPolicies(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param policies
     *        Summary information about the lifecycle policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePoliciesResult withPolicies(LifecyclePolicySummary... policies) {
        if (this.policies == null) {
            setPolicies(new java.util.ArrayList<LifecyclePolicySummary>(policies.length));
        }
        for (LifecyclePolicySummary ele : policies) {
            this.policies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the lifecycle policies.
     * </p>
     * 
     * @param policies
     *        Summary information about the lifecycle policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePoliciesResult withPolicies(java.util.Collection<LifecyclePolicySummary> policies) {
        setPolicies(policies);
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
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLifecyclePoliciesResult == false)
            return false;
        GetLifecyclePoliciesResult other = (GetLifecyclePoliciesResult) obj;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        return hashCode;
    }

    @Override
    public GetLifecyclePoliciesResult clone() {
        try {
            return (GetLifecyclePoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
