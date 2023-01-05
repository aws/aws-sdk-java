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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListNamespaces" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNamespacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of returned namespaces.
     * </p>
     */
    private java.util.List<Namespace> namespaces;
    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of returned namespaces.
     * </p>
     * 
     * @return The list of returned namespaces.
     */

    public java.util.List<Namespace> getNamespaces() {
        return namespaces;
    }

    /**
     * <p>
     * The list of returned namespaces.
     * </p>
     * 
     * @param namespaces
     *        The list of returned namespaces.
     */

    public void setNamespaces(java.util.Collection<Namespace> namespaces) {
        if (namespaces == null) {
            this.namespaces = null;
            return;
        }

        this.namespaces = new java.util.ArrayList<Namespace>(namespaces);
    }

    /**
     * <p>
     * The list of returned namespaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNamespaces(java.util.Collection)} or {@link #withNamespaces(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param namespaces
     *        The list of returned namespaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamespacesResult withNamespaces(Namespace... namespaces) {
        if (this.namespaces == null) {
            setNamespaces(new java.util.ArrayList<Namespace>(namespaces.length));
        }
        for (Namespace ele : namespaces) {
            this.namespaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of returned namespaces.
     * </p>
     * 
     * @param namespaces
     *        The list of returned namespaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamespacesResult withNamespaces(java.util.Collection<Namespace> namespaces) {
        setNamespaces(namespaces);
        return this;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return When <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamespacesResult withNextToken(String nextToken) {
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
        if (getNamespaces() != null)
            sb.append("Namespaces: ").append(getNamespaces()).append(",");
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

        if (obj instanceof ListNamespacesResult == false)
            return false;
        ListNamespacesResult other = (ListNamespacesResult) obj;
        if (other.getNamespaces() == null ^ this.getNamespaces() == null)
            return false;
        if (other.getNamespaces() != null && other.getNamespaces().equals(this.getNamespaces()) == false)
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

        hashCode = prime * hashCode + ((getNamespaces() == null) ? 0 : getNamespaces().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListNamespacesResult clone() {
        try {
            return (ListNamespacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
