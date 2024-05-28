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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTrustStores"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrustStoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the trust stores.
     * </p>
     */
    private java.util.List<TrustStore> trustStores;
    /**
     * <p>
     * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * Information about the trust stores.
     * </p>
     * 
     * @return Information about the trust stores.
     */

    public java.util.List<TrustStore> getTrustStores() {
        return trustStores;
    }

    /**
     * <p>
     * Information about the trust stores.
     * </p>
     * 
     * @param trustStores
     *        Information about the trust stores.
     */

    public void setTrustStores(java.util.Collection<TrustStore> trustStores) {
        if (trustStores == null) {
            this.trustStores = null;
            return;
        }

        this.trustStores = new java.util.ArrayList<TrustStore>(trustStores);
    }

    /**
     * <p>
     * Information about the trust stores.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrustStores(java.util.Collection)} or {@link #withTrustStores(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param trustStores
     *        Information about the trust stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustStoresResult withTrustStores(TrustStore... trustStores) {
        if (this.trustStores == null) {
            setTrustStores(new java.util.ArrayList<TrustStore>(trustStores.length));
        }
        for (TrustStore ele : trustStores) {
            this.trustStores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the trust stores.
     * </p>
     * 
     * @param trustStores
     *        Information about the trust stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustStoresResult withTrustStores(java.util.Collection<TrustStore> trustStores) {
        setTrustStores(trustStores);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     * </p>
     * 
     * @param nextMarker
     *        If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     * </p>
     * 
     * @return If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     * </p>
     * 
     * @param nextMarker
     *        If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustStoresResult withNextMarker(String nextMarker) {
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
        if (getTrustStores() != null)
            sb.append("TrustStores: ").append(getTrustStores()).append(",");
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

        if (obj instanceof DescribeTrustStoresResult == false)
            return false;
        DescribeTrustStoresResult other = (DescribeTrustStoresResult) obj;
        if (other.getTrustStores() == null ^ this.getTrustStores() == null)
            return false;
        if (other.getTrustStores() != null && other.getTrustStores().equals(this.getTrustStores()) == false)
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

        hashCode = prime * hashCode + ((getTrustStores() == null) ? 0 : getTrustStores().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrustStoresResult clone() {
        try {
            return (DescribeTrustStoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
