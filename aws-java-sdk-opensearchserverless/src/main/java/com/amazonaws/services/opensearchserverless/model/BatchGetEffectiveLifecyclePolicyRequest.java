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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetEffectiveLifecyclePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetEffectiveLifecyclePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifiers of policy types and resource names.
     * </p>
     */
    private java.util.List<LifecyclePolicyResourceIdentifier> resourceIdentifiers;

    /**
     * <p>
     * The unique identifiers of policy types and resource names.
     * </p>
     * 
     * @return The unique identifiers of policy types and resource names.
     */

    public java.util.List<LifecyclePolicyResourceIdentifier> getResourceIdentifiers() {
        return resourceIdentifiers;
    }

    /**
     * <p>
     * The unique identifiers of policy types and resource names.
     * </p>
     * 
     * @param resourceIdentifiers
     *        The unique identifiers of policy types and resource names.
     */

    public void setResourceIdentifiers(java.util.Collection<LifecyclePolicyResourceIdentifier> resourceIdentifiers) {
        if (resourceIdentifiers == null) {
            this.resourceIdentifiers = null;
            return;
        }

        this.resourceIdentifiers = new java.util.ArrayList<LifecyclePolicyResourceIdentifier>(resourceIdentifiers);
    }

    /**
     * <p>
     * The unique identifiers of policy types and resource names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIdentifiers(java.util.Collection)} or {@link #withResourceIdentifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceIdentifiers
     *        The unique identifiers of policy types and resource names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetEffectiveLifecyclePolicyRequest withResourceIdentifiers(LifecyclePolicyResourceIdentifier... resourceIdentifiers) {
        if (this.resourceIdentifiers == null) {
            setResourceIdentifiers(new java.util.ArrayList<LifecyclePolicyResourceIdentifier>(resourceIdentifiers.length));
        }
        for (LifecyclePolicyResourceIdentifier ele : resourceIdentifiers) {
            this.resourceIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of policy types and resource names.
     * </p>
     * 
     * @param resourceIdentifiers
     *        The unique identifiers of policy types and resource names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetEffectiveLifecyclePolicyRequest withResourceIdentifiers(java.util.Collection<LifecyclePolicyResourceIdentifier> resourceIdentifiers) {
        setResourceIdentifiers(resourceIdentifiers);
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
        if (getResourceIdentifiers() != null)
            sb.append("ResourceIdentifiers: ").append(getResourceIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetEffectiveLifecyclePolicyRequest == false)
            return false;
        BatchGetEffectiveLifecyclePolicyRequest other = (BatchGetEffectiveLifecyclePolicyRequest) obj;
        if (other.getResourceIdentifiers() == null ^ this.getResourceIdentifiers() == null)
            return false;
        if (other.getResourceIdentifiers() != null && other.getResourceIdentifiers().equals(this.getResourceIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceIdentifiers() == null) ? 0 : getResourceIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetEffectiveLifecyclePolicyRequest clone() {
        return (BatchGetEffectiveLifecyclePolicyRequest) super.clone();
    }

}
