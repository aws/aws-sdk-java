/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListObjectParents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListObjectParentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The parent structure, which is a map with key as the <code>ObjectIdentifier</code> and LinkName as the value.
     * </p>
     */
    private java.util.Map<String, String> parents;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The parent structure, which is a map with key as the <code>ObjectIdentifier</code> and LinkName as the value.
     * </p>
     * 
     * @return The parent structure, which is a map with key as the <code>ObjectIdentifier</code> and LinkName as the
     *         value.
     */

    public java.util.Map<String, String> getParents() {
        return parents;
    }

    /**
     * <p>
     * The parent structure, which is a map with key as the <code>ObjectIdentifier</code> and LinkName as the value.
     * </p>
     * 
     * @param parents
     *        The parent structure, which is a map with key as the <code>ObjectIdentifier</code> and LinkName as the
     *        value.
     */

    public void setParents(java.util.Map<String, String> parents) {
        this.parents = parents;
    }

    /**
     * <p>
     * The parent structure, which is a map with key as the <code>ObjectIdentifier</code> and LinkName as the value.
     * </p>
     * 
     * @param parents
     *        The parent structure, which is a map with key as the <code>ObjectIdentifier</code> and LinkName as the
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectParentsResult withParents(java.util.Map<String, String> parents) {
        setParents(parents);
        return this;
    }

    public ListObjectParentsResult addParentsEntry(String key, String value) {
        if (null == this.parents) {
            this.parents = new java.util.HashMap<String, String>();
        }
        if (this.parents.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parents.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parents.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectParentsResult clearParentsEntries() {
        this.parents = null;
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectParentsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getParents() != null)
            sb.append("Parents: ").append(getParents()).append(",");
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

        if (obj instanceof ListObjectParentsResult == false)
            return false;
        ListObjectParentsResult other = (ListObjectParentsResult) obj;
        if (other.getParents() == null ^ this.getParents() == null)
            return false;
        if (other.getParents() != null && other.getParents().equals(this.getParents()) == false)
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

        hashCode = prime * hashCode + ((getParents() == null) ? 0 : getParents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListObjectParentsResult clone() {
        try {
            return (ListObjectParentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
