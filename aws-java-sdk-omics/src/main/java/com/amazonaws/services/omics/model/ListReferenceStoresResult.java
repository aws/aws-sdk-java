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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferenceStores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReferenceStoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of reference stores.
     * </p>
     */
    private java.util.List<ReferenceStoreDetail> referenceStores;

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's included if more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @return A pagination token that's included if more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReferenceStoresResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of reference stores.
     * </p>
     * 
     * @return A list of reference stores.
     */

    public java.util.List<ReferenceStoreDetail> getReferenceStores() {
        return referenceStores;
    }

    /**
     * <p>
     * A list of reference stores.
     * </p>
     * 
     * @param referenceStores
     *        A list of reference stores.
     */

    public void setReferenceStores(java.util.Collection<ReferenceStoreDetail> referenceStores) {
        if (referenceStores == null) {
            this.referenceStores = null;
            return;
        }

        this.referenceStores = new java.util.ArrayList<ReferenceStoreDetail>(referenceStores);
    }

    /**
     * <p>
     * A list of reference stores.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceStores(java.util.Collection)} or {@link #withReferenceStores(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param referenceStores
     *        A list of reference stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReferenceStoresResult withReferenceStores(ReferenceStoreDetail... referenceStores) {
        if (this.referenceStores == null) {
            setReferenceStores(new java.util.ArrayList<ReferenceStoreDetail>(referenceStores.length));
        }
        for (ReferenceStoreDetail ele : referenceStores) {
            this.referenceStores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of reference stores.
     * </p>
     * 
     * @param referenceStores
     *        A list of reference stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReferenceStoresResult withReferenceStores(java.util.Collection<ReferenceStoreDetail> referenceStores) {
        setReferenceStores(referenceStores);
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
        if (getReferenceStores() != null)
            sb.append("ReferenceStores: ").append(getReferenceStores());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReferenceStoresResult == false)
            return false;
        ListReferenceStoresResult other = (ListReferenceStoresResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReferenceStores() == null ^ this.getReferenceStores() == null)
            return false;
        if (other.getReferenceStores() != null && other.getReferenceStores().equals(this.getReferenceStores()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReferenceStores() == null) ? 0 : getReferenceStores().hashCode());
        return hashCode;
    }

    @Override
    public ListReferenceStoresResult clone() {
        try {
            return (ListReferenceStoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
