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
 * The output from the ListPolicies operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The descriptions of the policies.
     * </p>
     */
    private java.util.List<Policy> policies;
    /**
     * <p>
     * The marker for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * The descriptions of the policies.
     * </p>
     * 
     * @return The descriptions of the policies.
     */

    public java.util.List<Policy> getPolicies() {
        return policies;
    }

    /**
     * <p>
     * The descriptions of the policies.
     * </p>
     * 
     * @param policies
     *        The descriptions of the policies.
     */

    public void setPolicies(java.util.Collection<Policy> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new java.util.ArrayList<Policy>(policies);
    }

    /**
     * <p>
     * The descriptions of the policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicies(java.util.Collection)} or {@link #withPolicies(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param policies
     *        The descriptions of the policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesResult withPolicies(Policy... policies) {
        if (this.policies == null) {
            setPolicies(new java.util.ArrayList<Policy>(policies.length));
        }
        for (Policy ele : policies) {
            this.policies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The descriptions of the policies.
     * </p>
     * 
     * @param policies
     *        The descriptions of the policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesResult withPolicies(java.util.Collection<Policy> policies) {
        setPolicies(policies);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextMarker
     *        The marker for the next set of results, or null if there are no additional results.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The marker for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The marker for the next set of results, or null if there are no additional results.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * The marker for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextMarker
     *        The marker for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
            sb.append("Policies: ").append(getPolicies()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPoliciesResult == false)
            return false;
        ListPoliciesResult other = (ListPoliciesResult) obj;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListPoliciesResult clone() {
        try {
            return (ListPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
