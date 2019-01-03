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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListObjectChildren" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListObjectChildrenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Children structure, which is a map with key as the <code>LinkName</code> and <code>ObjectIdentifier</code> as the
     * value.
     * </p>
     */
    private java.util.Map<String, String> children;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Children structure, which is a map with key as the <code>LinkName</code> and <code>ObjectIdentifier</code> as the
     * value.
     * </p>
     * 
     * @return Children structure, which is a map with key as the <code>LinkName</code> and
     *         <code>ObjectIdentifier</code> as the value.
     */

    public java.util.Map<String, String> getChildren() {
        return children;
    }

    /**
     * <p>
     * Children structure, which is a map with key as the <code>LinkName</code> and <code>ObjectIdentifier</code> as the
     * value.
     * </p>
     * 
     * @param children
     *        Children structure, which is a map with key as the <code>LinkName</code> and <code>ObjectIdentifier</code>
     *        as the value.
     */

    public void setChildren(java.util.Map<String, String> children) {
        this.children = children;
    }

    /**
     * <p>
     * Children structure, which is a map with key as the <code>LinkName</code> and <code>ObjectIdentifier</code> as the
     * value.
     * </p>
     * 
     * @param children
     *        Children structure, which is a map with key as the <code>LinkName</code> and <code>ObjectIdentifier</code>
     *        as the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectChildrenResult withChildren(java.util.Map<String, String> children) {
        setChildren(children);
        return this;
    }

    public ListObjectChildrenResult addChildrenEntry(String key, String value) {
        if (null == this.children) {
            this.children = new java.util.HashMap<String, String>();
        }
        if (this.children.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.children.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Children.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectChildrenResult clearChildrenEntries() {
        this.children = null;
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

    public ListObjectChildrenResult withNextToken(String nextToken) {
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
        if (getChildren() != null)
            sb.append("Children: ").append(getChildren()).append(",");
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

        if (obj instanceof ListObjectChildrenResult == false)
            return false;
        ListObjectChildrenResult other = (ListObjectChildrenResult) obj;
        if (other.getChildren() == null ^ this.getChildren() == null)
            return false;
        if (other.getChildren() != null && other.getChildren().equals(this.getChildren()) == false)
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

        hashCode = prime * hashCode + ((getChildren() == null) ? 0 : getChildren().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListObjectChildrenResult clone() {
        try {
            return (ListObjectChildrenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
