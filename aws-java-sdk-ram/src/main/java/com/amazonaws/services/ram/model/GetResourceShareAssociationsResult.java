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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShareAssociations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceShareAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the association.
     * </p>
     */
    private java.util.List<ResourceShareAssociation> resourceShareAssociations;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the association.
     * </p>
     * 
     * @return Information about the association.
     */

    public java.util.List<ResourceShareAssociation> getResourceShareAssociations() {
        return resourceShareAssociations;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     * 
     * @param resourceShareAssociations
     *        Information about the association.
     */

    public void setResourceShareAssociations(java.util.Collection<ResourceShareAssociation> resourceShareAssociations) {
        if (resourceShareAssociations == null) {
            this.resourceShareAssociations = null;
            return;
        }

        this.resourceShareAssociations = new java.util.ArrayList<ResourceShareAssociation>(resourceShareAssociations);
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceShareAssociations(java.util.Collection)} or
     * {@link #withResourceShareAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceShareAssociations
     *        Information about the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceShareAssociationsResult withResourceShareAssociations(ResourceShareAssociation... resourceShareAssociations) {
        if (this.resourceShareAssociations == null) {
            setResourceShareAssociations(new java.util.ArrayList<ResourceShareAssociation>(resourceShareAssociations.length));
        }
        for (ResourceShareAssociation ele : resourceShareAssociations) {
            this.resourceShareAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     * 
     * @param resourceShareAssociations
     *        Information about the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceShareAssociationsResult withResourceShareAssociations(java.util.Collection<ResourceShareAssociation> resourceShareAssociations) {
        setResourceShareAssociations(resourceShareAssociations);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceShareAssociationsResult withNextToken(String nextToken) {
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
        if (getResourceShareAssociations() != null)
            sb.append("ResourceShareAssociations: ").append(getResourceShareAssociations()).append(",");
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

        if (obj instanceof GetResourceShareAssociationsResult == false)
            return false;
        GetResourceShareAssociationsResult other = (GetResourceShareAssociationsResult) obj;
        if (other.getResourceShareAssociations() == null ^ this.getResourceShareAssociations() == null)
            return false;
        if (other.getResourceShareAssociations() != null && other.getResourceShareAssociations().equals(this.getResourceShareAssociations()) == false)
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

        hashCode = prime * hashCode + ((getResourceShareAssociations() == null) ? 0 : getResourceShareAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceShareAssociationsResult clone() {
        try {
            return (GetResourceShareAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
