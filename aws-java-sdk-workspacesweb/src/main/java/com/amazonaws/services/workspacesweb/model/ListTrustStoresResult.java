/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTrustStores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrustStoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The trust stores.
     * </p>
     */
    private java.util.List<TrustStoreSummary> trustStores;

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @return The pagination token used to retrieve the next page of results for this operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrustStoresResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The trust stores.
     * </p>
     * 
     * @return The trust stores.
     */

    public java.util.List<TrustStoreSummary> getTrustStores() {
        return trustStores;
    }

    /**
     * <p>
     * The trust stores.
     * </p>
     * 
     * @param trustStores
     *        The trust stores.
     */

    public void setTrustStores(java.util.Collection<TrustStoreSummary> trustStores) {
        if (trustStores == null) {
            this.trustStores = null;
            return;
        }

        this.trustStores = new java.util.ArrayList<TrustStoreSummary>(trustStores);
    }

    /**
     * <p>
     * The trust stores.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrustStores(java.util.Collection)} or {@link #withTrustStores(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param trustStores
     *        The trust stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrustStoresResult withTrustStores(TrustStoreSummary... trustStores) {
        if (this.trustStores == null) {
            setTrustStores(new java.util.ArrayList<TrustStoreSummary>(trustStores.length));
        }
        for (TrustStoreSummary ele : trustStores) {
            this.trustStores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The trust stores.
     * </p>
     * 
     * @param trustStores
     *        The trust stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrustStoresResult withTrustStores(java.util.Collection<TrustStoreSummary> trustStores) {
        setTrustStores(trustStores);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTrustStores() != null)
            sb.append("TrustStores: ").append(getTrustStores());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrustStoresResult == false)
            return false;
        ListTrustStoresResult other = (ListTrustStoresResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTrustStores() == null ^ this.getTrustStores() == null)
            return false;
        if (other.getTrustStores() != null && other.getTrustStores().equals(this.getTrustStores()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTrustStores() == null) ? 0 : getTrustStores().hashCode());
        return hashCode;
    }

    @Override
    public ListTrustStoresResult clone() {
        try {
            return (ListTrustStoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
