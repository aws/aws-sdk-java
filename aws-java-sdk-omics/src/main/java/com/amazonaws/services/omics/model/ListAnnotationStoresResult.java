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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListAnnotationStores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnnotationStoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of stores.
     * </p>
     */
    private java.util.List<AnnotationStoreItem> annotationStores;
    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of stores.
     * </p>
     * 
     * @return A list of stores.
     */

    public java.util.List<AnnotationStoreItem> getAnnotationStores() {
        return annotationStores;
    }

    /**
     * <p>
     * A list of stores.
     * </p>
     * 
     * @param annotationStores
     *        A list of stores.
     */

    public void setAnnotationStores(java.util.Collection<AnnotationStoreItem> annotationStores) {
        if (annotationStores == null) {
            this.annotationStores = null;
            return;
        }

        this.annotationStores = new java.util.ArrayList<AnnotationStoreItem>(annotationStores);
    }

    /**
     * <p>
     * A list of stores.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnnotationStores(java.util.Collection)} or {@link #withAnnotationStores(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param annotationStores
     *        A list of stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnnotationStoresResult withAnnotationStores(AnnotationStoreItem... annotationStores) {
        if (this.annotationStores == null) {
            setAnnotationStores(new java.util.ArrayList<AnnotationStoreItem>(annotationStores.length));
        }
        for (AnnotationStoreItem ele : annotationStores) {
            this.annotationStores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of stores.
     * </p>
     * 
     * @param annotationStores
     *        A list of stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnnotationStoresResult withAnnotationStores(java.util.Collection<AnnotationStoreItem> annotationStores) {
        setAnnotationStores(annotationStores);
        return this;
    }

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

    public ListAnnotationStoresResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAnnotationStores() != null)
            sb.append("AnnotationStores: ").append(getAnnotationStores()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAnnotationStoresResult == false)
            return false;
        ListAnnotationStoresResult other = (ListAnnotationStoresResult) obj;
        if (other.getAnnotationStores() == null ^ this.getAnnotationStores() == null)
            return false;
        if (other.getAnnotationStores() != null && other.getAnnotationStores().equals(this.getAnnotationStores()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnnotationStores() == null) ? 0 : getAnnotationStores().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAnnotationStoresResult clone() {
        try {
            return (ListAnnotationStoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
