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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListFacetNames" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFacetNamesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names of facets that exist within the schema.
     * </p>
     */
    private java.util.List<String> facetNames;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of facets that exist within the schema.
     * </p>
     * 
     * @return The names of facets that exist within the schema.
     */

    public java.util.List<String> getFacetNames() {
        return facetNames;
    }

    /**
     * <p>
     * The names of facets that exist within the schema.
     * </p>
     * 
     * @param facetNames
     *        The names of facets that exist within the schema.
     */

    public void setFacetNames(java.util.Collection<String> facetNames) {
        if (facetNames == null) {
            this.facetNames = null;
            return;
        }

        this.facetNames = new java.util.ArrayList<String>(facetNames);
    }

    /**
     * <p>
     * The names of facets that exist within the schema.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFacetNames(java.util.Collection)} or {@link #withFacetNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param facetNames
     *        The names of facets that exist within the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFacetNamesResult withFacetNames(String... facetNames) {
        if (this.facetNames == null) {
            setFacetNames(new java.util.ArrayList<String>(facetNames.length));
        }
        for (String ele : facetNames) {
            this.facetNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of facets that exist within the schema.
     * </p>
     * 
     * @param facetNames
     *        The names of facets that exist within the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFacetNamesResult withFacetNames(java.util.Collection<String> facetNames) {
        setFacetNames(facetNames);
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

    public ListFacetNamesResult withNextToken(String nextToken) {
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
        if (getFacetNames() != null)
            sb.append("FacetNames: ").append(getFacetNames()).append(",");
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

        if (obj instanceof ListFacetNamesResult == false)
            return false;
        ListFacetNamesResult other = (ListFacetNamesResult) obj;
        if (other.getFacetNames() == null ^ this.getFacetNames() == null)
            return false;
        if (other.getFacetNames() != null && other.getFacetNames().equals(this.getFacetNames()) == false)
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

        hashCode = prime * hashCode + ((getFacetNames() == null) ? 0 : getFacetNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFacetNamesResult clone() {
        try {
            return (ListFacetNamesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
