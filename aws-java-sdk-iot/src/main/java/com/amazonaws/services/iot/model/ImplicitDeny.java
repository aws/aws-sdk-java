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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information that implicitly denies authorization. When policy doesn't explicitly deny or allow an action on a
 * resource it is considered an implicit deny.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImplicitDeny implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Policies that don't contain a matching allow or deny statement for the specified action on the specified
     * resource.
     * </p>
     */
    private java.util.List<Policy> policies;

    /**
     * <p>
     * Policies that don't contain a matching allow or deny statement for the specified action on the specified
     * resource.
     * </p>
     * 
     * @return Policies that don't contain a matching allow or deny statement for the specified action on the specified
     *         resource.
     */

    public java.util.List<Policy> getPolicies() {
        return policies;
    }

    /**
     * <p>
     * Policies that don't contain a matching allow or deny statement for the specified action on the specified
     * resource.
     * </p>
     * 
     * @param policies
     *        Policies that don't contain a matching allow or deny statement for the specified action on the specified
     *        resource.
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
     * Policies that don't contain a matching allow or deny statement for the specified action on the specified
     * resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicies(java.util.Collection)} or {@link #withPolicies(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param policies
     *        Policies that don't contain a matching allow or deny statement for the specified action on the specified
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImplicitDeny withPolicies(Policy... policies) {
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
     * Policies that don't contain a matching allow or deny statement for the specified action on the specified
     * resource.
     * </p>
     * 
     * @param policies
     *        Policies that don't contain a matching allow or deny statement for the specified action on the specified
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImplicitDeny withPolicies(java.util.Collection<Policy> policies) {
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

        if (obj instanceof ImplicitDeny == false)
            return false;
        ImplicitDeny other = (ImplicitDeny) obj;
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
    public ImplicitDeny clone() {
        try {
            return (ImplicitDeny) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ImplicitDenyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
