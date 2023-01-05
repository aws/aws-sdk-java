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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListSequenceStores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSequenceStoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of sequence stores.
     * </p>
     */
    private java.util.List<SequenceStoreDetail> sequenceStores;

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

    public ListSequenceStoresResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of sequence stores.
     * </p>
     * 
     * @return A list of sequence stores.
     */

    public java.util.List<SequenceStoreDetail> getSequenceStores() {
        return sequenceStores;
    }

    /**
     * <p>
     * A list of sequence stores.
     * </p>
     * 
     * @param sequenceStores
     *        A list of sequence stores.
     */

    public void setSequenceStores(java.util.Collection<SequenceStoreDetail> sequenceStores) {
        if (sequenceStores == null) {
            this.sequenceStores = null;
            return;
        }

        this.sequenceStores = new java.util.ArrayList<SequenceStoreDetail>(sequenceStores);
    }

    /**
     * <p>
     * A list of sequence stores.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSequenceStores(java.util.Collection)} or {@link #withSequenceStores(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sequenceStores
     *        A list of sequence stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSequenceStoresResult withSequenceStores(SequenceStoreDetail... sequenceStores) {
        if (this.sequenceStores == null) {
            setSequenceStores(new java.util.ArrayList<SequenceStoreDetail>(sequenceStores.length));
        }
        for (SequenceStoreDetail ele : sequenceStores) {
            this.sequenceStores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of sequence stores.
     * </p>
     * 
     * @param sequenceStores
     *        A list of sequence stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSequenceStoresResult withSequenceStores(java.util.Collection<SequenceStoreDetail> sequenceStores) {
        setSequenceStores(sequenceStores);
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
        if (getSequenceStores() != null)
            sb.append("SequenceStores: ").append(getSequenceStores());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSequenceStoresResult == false)
            return false;
        ListSequenceStoresResult other = (ListSequenceStoresResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSequenceStores() == null ^ this.getSequenceStores() == null)
            return false;
        if (other.getSequenceStores() != null && other.getSequenceStores().equals(this.getSequenceStores()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSequenceStores() == null) ? 0 : getSequenceStores().hashCode());
        return hashCode;
    }

    @Override
    public ListSequenceStoresResult clone() {
        try {
            return (ListSequenceStoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
