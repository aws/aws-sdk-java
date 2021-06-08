/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEntityTypes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEntityTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of entity types.
     * </p>
     */
    private java.util.List<EntityType> entityTypes;
    /**
     * <p>
     * The next page token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of entity types.
     * </p>
     * 
     * @return An array of entity types.
     */

    public java.util.List<EntityType> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * An array of entity types.
     * </p>
     * 
     * @param entityTypes
     *        An array of entity types.
     */

    public void setEntityTypes(java.util.Collection<EntityType> entityTypes) {
        if (entityTypes == null) {
            this.entityTypes = null;
            return;
        }

        this.entityTypes = new java.util.ArrayList<EntityType>(entityTypes);
    }

    /**
     * <p>
     * An array of entity types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityTypes(java.util.Collection)} or {@link #withEntityTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityTypes
     *        An array of entity types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityTypesResult withEntityTypes(EntityType... entityTypes) {
        if (this.entityTypes == null) {
            setEntityTypes(new java.util.ArrayList<EntityType>(entityTypes.length));
        }
        for (EntityType ele : entityTypes) {
            this.entityTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of entity types.
     * </p>
     * 
     * @param entityTypes
     *        An array of entity types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityTypesResult withEntityTypes(java.util.Collection<EntityType> entityTypes) {
        setEntityTypes(entityTypes);
        return this;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @param nextToken
     *        The next page token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @return The next page token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @param nextToken
     *        The next page token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityTypesResult withNextToken(String nextToken) {
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
        if (getEntityTypes() != null)
            sb.append("EntityTypes: ").append(getEntityTypes()).append(",");
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

        if (obj instanceof GetEntityTypesResult == false)
            return false;
        GetEntityTypesResult other = (GetEntityTypesResult) obj;
        if (other.getEntityTypes() == null ^ this.getEntityTypes() == null)
            return false;
        if (other.getEntityTypes() != null && other.getEntityTypes().equals(this.getEntityTypes()) == false)
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

        hashCode = prime * hashCode + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetEntityTypesResult clone() {
        try {
            return (GetEntityTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
