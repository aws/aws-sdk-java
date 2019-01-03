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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAuthorizersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The authorizers.
     * </p>
     */
    private java.util.List<AuthorizerSummary> authorizers;
    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * The authorizers.
     * </p>
     * 
     * @return The authorizers.
     */

    public java.util.List<AuthorizerSummary> getAuthorizers() {
        return authorizers;
    }

    /**
     * <p>
     * The authorizers.
     * </p>
     * 
     * @param authorizers
     *        The authorizers.
     */

    public void setAuthorizers(java.util.Collection<AuthorizerSummary> authorizers) {
        if (authorizers == null) {
            this.authorizers = null;
            return;
        }

        this.authorizers = new java.util.ArrayList<AuthorizerSummary>(authorizers);
    }

    /**
     * <p>
     * The authorizers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizers(java.util.Collection)} or {@link #withAuthorizers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param authorizers
     *        The authorizers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuthorizersResult withAuthorizers(AuthorizerSummary... authorizers) {
        if (this.authorizers == null) {
            setAuthorizers(new java.util.ArrayList<AuthorizerSummary>(authorizers.length));
        }
        for (AuthorizerSummary ele : authorizers) {
            this.authorizers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The authorizers.
     * </p>
     * 
     * @param authorizers
     *        The authorizers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuthorizersResult withAuthorizers(java.util.Collection<AuthorizerSummary> authorizers) {
        setAuthorizers(authorizers);
        return this;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * 
     * @param nextMarker
     *        A marker used to get the next set of results.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * 
     * @return A marker used to get the next set of results.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * 
     * @param nextMarker
     *        A marker used to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuthorizersResult withNextMarker(String nextMarker) {
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
        if (getAuthorizers() != null)
            sb.append("Authorizers: ").append(getAuthorizers()).append(",");
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

        if (obj instanceof ListAuthorizersResult == false)
            return false;
        ListAuthorizersResult other = (ListAuthorizersResult) obj;
        if (other.getAuthorizers() == null ^ this.getAuthorizers() == null)
            return false;
        if (other.getAuthorizers() != null && other.getAuthorizers().equals(this.getAuthorizers()) == false)
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

        hashCode = prime * hashCode + ((getAuthorizers() == null) ? 0 : getAuthorizers().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListAuthorizersResult clone() {
        try {
            return (ListAuthorizersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
