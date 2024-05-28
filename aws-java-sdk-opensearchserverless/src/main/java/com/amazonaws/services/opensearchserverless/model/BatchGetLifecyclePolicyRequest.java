/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetLifecyclePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetLifecyclePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifiers of policy types and policy names.
     * </p>
     */
    private java.util.List<LifecyclePolicyIdentifier> identifiers;

    /**
     * <p>
     * The unique identifiers of policy types and policy names.
     * </p>
     * 
     * @return The unique identifiers of policy types and policy names.
     */

    public java.util.List<LifecyclePolicyIdentifier> getIdentifiers() {
        return identifiers;
    }

    /**
     * <p>
     * The unique identifiers of policy types and policy names.
     * </p>
     * 
     * @param identifiers
     *        The unique identifiers of policy types and policy names.
     */

    public void setIdentifiers(java.util.Collection<LifecyclePolicyIdentifier> identifiers) {
        if (identifiers == null) {
            this.identifiers = null;
            return;
        }

        this.identifiers = new java.util.ArrayList<LifecyclePolicyIdentifier>(identifiers);
    }

    /**
     * <p>
     * The unique identifiers of policy types and policy names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentifiers(java.util.Collection)} or {@link #withIdentifiers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param identifiers
     *        The unique identifiers of policy types and policy names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetLifecyclePolicyRequest withIdentifiers(LifecyclePolicyIdentifier... identifiers) {
        if (this.identifiers == null) {
            setIdentifiers(new java.util.ArrayList<LifecyclePolicyIdentifier>(identifiers.length));
        }
        for (LifecyclePolicyIdentifier ele : identifiers) {
            this.identifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of policy types and policy names.
     * </p>
     * 
     * @param identifiers
     *        The unique identifiers of policy types and policy names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetLifecyclePolicyRequest withIdentifiers(java.util.Collection<LifecyclePolicyIdentifier> identifiers) {
        setIdentifiers(identifiers);
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
        if (getIdentifiers() != null)
            sb.append("Identifiers: ").append(getIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetLifecyclePolicyRequest == false)
            return false;
        BatchGetLifecyclePolicyRequest other = (BatchGetLifecyclePolicyRequest) obj;
        if (other.getIdentifiers() == null ^ this.getIdentifiers() == null)
            return false;
        if (other.getIdentifiers() != null && other.getIdentifiers().equals(this.getIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifiers() == null) ? 0 : getIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetLifecyclePolicyRequest clone() {
        return (BatchGetLifecyclePolicyRequest) super.clone();
    }

}
