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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResourceRelationships"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNetworkResourceRelationshipsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The resource relationships.
     * </p>
     */
    private java.util.List<Relationship> relationships;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The resource relationships.
     * </p>
     * 
     * @return The resource relationships.
     */

    public java.util.List<Relationship> getRelationships() {
        return relationships;
    }

    /**
     * <p>
     * The resource relationships.
     * </p>
     * 
     * @param relationships
     *        The resource relationships.
     */

    public void setRelationships(java.util.Collection<Relationship> relationships) {
        if (relationships == null) {
            this.relationships = null;
            return;
        }

        this.relationships = new java.util.ArrayList<Relationship>(relationships);
    }

    /**
     * <p>
     * The resource relationships.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelationships(java.util.Collection)} or {@link #withRelationships(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param relationships
     *        The resource relationships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourceRelationshipsResult withRelationships(Relationship... relationships) {
        if (this.relationships == null) {
            setRelationships(new java.util.ArrayList<Relationship>(relationships.length));
        }
        for (Relationship ele : relationships) {
            this.relationships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource relationships.
     * </p>
     * 
     * @param relationships
     *        The resource relationships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourceRelationshipsResult withRelationships(java.util.Collection<Relationship> relationships) {
        setRelationships(relationships);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourceRelationshipsResult withNextToken(String nextToken) {
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
        if (getRelationships() != null)
            sb.append("Relationships: ").append(getRelationships()).append(",");
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

        if (obj instanceof GetNetworkResourceRelationshipsResult == false)
            return false;
        GetNetworkResourceRelationshipsResult other = (GetNetworkResourceRelationshipsResult) obj;
        if (other.getRelationships() == null ^ this.getRelationships() == null)
            return false;
        if (other.getRelationships() != null && other.getRelationships().equals(this.getRelationships()) == false)
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

        hashCode = prime * hashCode + ((getRelationships() == null) ? 0 : getRelationships().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetNetworkResourceRelationshipsResult clone() {
        try {
            return (GetNetworkResourceRelationshipsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
