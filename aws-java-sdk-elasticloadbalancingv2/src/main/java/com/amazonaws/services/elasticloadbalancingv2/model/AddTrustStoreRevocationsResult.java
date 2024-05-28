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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/AddTrustStoreRevocations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddTrustStoreRevocationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the revocation file added to the trust store.
     * </p>
     */
    private java.util.List<TrustStoreRevocation> trustStoreRevocations;

    /**
     * <p>
     * Information about the revocation file added to the trust store.
     * </p>
     * 
     * @return Information about the revocation file added to the trust store.
     */

    public java.util.List<TrustStoreRevocation> getTrustStoreRevocations() {
        return trustStoreRevocations;
    }

    /**
     * <p>
     * Information about the revocation file added to the trust store.
     * </p>
     * 
     * @param trustStoreRevocations
     *        Information about the revocation file added to the trust store.
     */

    public void setTrustStoreRevocations(java.util.Collection<TrustStoreRevocation> trustStoreRevocations) {
        if (trustStoreRevocations == null) {
            this.trustStoreRevocations = null;
            return;
        }

        this.trustStoreRevocations = new java.util.ArrayList<TrustStoreRevocation>(trustStoreRevocations);
    }

    /**
     * <p>
     * Information about the revocation file added to the trust store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrustStoreRevocations(java.util.Collection)} or
     * {@link #withTrustStoreRevocations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param trustStoreRevocations
     *        Information about the revocation file added to the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTrustStoreRevocationsResult withTrustStoreRevocations(TrustStoreRevocation... trustStoreRevocations) {
        if (this.trustStoreRevocations == null) {
            setTrustStoreRevocations(new java.util.ArrayList<TrustStoreRevocation>(trustStoreRevocations.length));
        }
        for (TrustStoreRevocation ele : trustStoreRevocations) {
            this.trustStoreRevocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the revocation file added to the trust store.
     * </p>
     * 
     * @param trustStoreRevocations
     *        Information about the revocation file added to the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTrustStoreRevocationsResult withTrustStoreRevocations(java.util.Collection<TrustStoreRevocation> trustStoreRevocations) {
        setTrustStoreRevocations(trustStoreRevocations);
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
        if (getTrustStoreRevocations() != null)
            sb.append("TrustStoreRevocations: ").append(getTrustStoreRevocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddTrustStoreRevocationsResult == false)
            return false;
        AddTrustStoreRevocationsResult other = (AddTrustStoreRevocationsResult) obj;
        if (other.getTrustStoreRevocations() == null ^ this.getTrustStoreRevocations() == null)
            return false;
        if (other.getTrustStoreRevocations() != null && other.getTrustStoreRevocations().equals(this.getTrustStoreRevocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustStoreRevocations() == null) ? 0 : getTrustStoreRevocations().hashCode());
        return hashCode;
    }

    @Override
    public AddTrustStoreRevocationsResult clone() {
        try {
            return (AddTrustStoreRevocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
