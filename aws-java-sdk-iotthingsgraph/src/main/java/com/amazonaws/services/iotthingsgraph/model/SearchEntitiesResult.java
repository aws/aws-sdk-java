/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchEntitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of descriptions for each entity returned in the search result.
     * </p>
     */
    private java.util.List<EntityDescription> descriptions;
    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of descriptions for each entity returned in the search result.
     * </p>
     * 
     * @return An array of descriptions for each entity returned in the search result.
     */

    public java.util.List<EntityDescription> getDescriptions() {
        return descriptions;
    }

    /**
     * <p>
     * An array of descriptions for each entity returned in the search result.
     * </p>
     * 
     * @param descriptions
     *        An array of descriptions for each entity returned in the search result.
     */

    public void setDescriptions(java.util.Collection<EntityDescription> descriptions) {
        if (descriptions == null) {
            this.descriptions = null;
            return;
        }

        this.descriptions = new java.util.ArrayList<EntityDescription>(descriptions);
    }

    /**
     * <p>
     * An array of descriptions for each entity returned in the search result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDescriptions(java.util.Collection)} or {@link #withDescriptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param descriptions
     *        An array of descriptions for each entity returned in the search result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchEntitiesResult withDescriptions(EntityDescription... descriptions) {
        if (this.descriptions == null) {
            setDescriptions(new java.util.ArrayList<EntityDescription>(descriptions.length));
        }
        for (EntityDescription ele : descriptions) {
            this.descriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of descriptions for each entity returned in the search result.
     * </p>
     * 
     * @param descriptions
     *        An array of descriptions for each entity returned in the search result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchEntitiesResult withDescriptions(java.util.Collection<EntityDescription> descriptions) {
        setDescriptions(descriptions);
        return this;
    }

    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string to specify as <code>nextToken</code> when you request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     * 
     * @return The string to specify as <code>nextToken</code> when you request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string to specify as <code>nextToken</code> when you request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchEntitiesResult withNextToken(String nextToken) {
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
        if (getDescriptions() != null)
            sb.append("Descriptions: ").append(getDescriptions()).append(",");
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

        if (obj instanceof SearchEntitiesResult == false)
            return false;
        SearchEntitiesResult other = (SearchEntitiesResult) obj;
        if (other.getDescriptions() == null ^ this.getDescriptions() == null)
            return false;
        if (other.getDescriptions() != null && other.getDescriptions().equals(this.getDescriptions()) == false)
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

        hashCode = prime * hashCode + ((getDescriptions() == null) ? 0 : getDescriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchEntitiesResult clone() {
        try {
            return (SearchEntitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
