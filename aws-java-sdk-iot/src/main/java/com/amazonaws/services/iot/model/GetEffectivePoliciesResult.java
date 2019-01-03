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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEffectivePoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The effective policies.
     * </p>
     */
    private java.util.List<EffectivePolicy> effectivePolicies;

    /**
     * <p>
     * The effective policies.
     * </p>
     * 
     * @return The effective policies.
     */

    public java.util.List<EffectivePolicy> getEffectivePolicies() {
        return effectivePolicies;
    }

    /**
     * <p>
     * The effective policies.
     * </p>
     * 
     * @param effectivePolicies
     *        The effective policies.
     */

    public void setEffectivePolicies(java.util.Collection<EffectivePolicy> effectivePolicies) {
        if (effectivePolicies == null) {
            this.effectivePolicies = null;
            return;
        }

        this.effectivePolicies = new java.util.ArrayList<EffectivePolicy>(effectivePolicies);
    }

    /**
     * <p>
     * The effective policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEffectivePolicies(java.util.Collection)} or {@link #withEffectivePolicies(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param effectivePolicies
     *        The effective policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEffectivePoliciesResult withEffectivePolicies(EffectivePolicy... effectivePolicies) {
        if (this.effectivePolicies == null) {
            setEffectivePolicies(new java.util.ArrayList<EffectivePolicy>(effectivePolicies.length));
        }
        for (EffectivePolicy ele : effectivePolicies) {
            this.effectivePolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The effective policies.
     * </p>
     * 
     * @param effectivePolicies
     *        The effective policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEffectivePoliciesResult withEffectivePolicies(java.util.Collection<EffectivePolicy> effectivePolicies) {
        setEffectivePolicies(effectivePolicies);
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
        if (getEffectivePolicies() != null)
            sb.append("EffectivePolicies: ").append(getEffectivePolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEffectivePoliciesResult == false)
            return false;
        GetEffectivePoliciesResult other = (GetEffectivePoliciesResult) obj;
        if (other.getEffectivePolicies() == null ^ this.getEffectivePolicies() == null)
            return false;
        if (other.getEffectivePolicies() != null && other.getEffectivePolicies().equals(this.getEffectivePolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEffectivePolicies() == null) ? 0 : getEffectivePolicies().hashCode());
        return hashCode;
    }

    @Override
    public GetEffectivePoliciesResult clone() {
        try {
            return (GetEffectivePoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
