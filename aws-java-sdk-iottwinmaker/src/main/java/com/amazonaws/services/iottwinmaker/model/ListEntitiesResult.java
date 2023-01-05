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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEntitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects that contain information about the entities.
     * </p>
     */
    private java.util.List<EntitySummary> entitySummaries;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects that contain information about the entities.
     * </p>
     * 
     * @return A list of objects that contain information about the entities.
     */

    public java.util.List<EntitySummary> getEntitySummaries() {
        return entitySummaries;
    }

    /**
     * <p>
     * A list of objects that contain information about the entities.
     * </p>
     * 
     * @param entitySummaries
     *        A list of objects that contain information about the entities.
     */

    public void setEntitySummaries(java.util.Collection<EntitySummary> entitySummaries) {
        if (entitySummaries == null) {
            this.entitySummaries = null;
            return;
        }

        this.entitySummaries = new java.util.ArrayList<EntitySummary>(entitySummaries);
    }

    /**
     * <p>
     * A list of objects that contain information about the entities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitySummaries(java.util.Collection)} or {@link #withEntitySummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param entitySummaries
     *        A list of objects that contain information about the entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesResult withEntitySummaries(EntitySummary... entitySummaries) {
        if (this.entitySummaries == null) {
            setEntitySummaries(new java.util.ArrayList<EntitySummary>(entitySummaries.length));
        }
        for (EntitySummary ele : entitySummaries) {
            this.entitySummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contain information about the entities.
     * </p>
     * 
     * @param entitySummaries
     *        A list of objects that contain information about the entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesResult withEntitySummaries(java.util.Collection<EntitySummary> entitySummaries) {
        setEntitySummaries(entitySummaries);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @return The string that specifies the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesResult withNextToken(String nextToken) {
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
        if (getEntitySummaries() != null)
            sb.append("EntitySummaries: ").append(getEntitySummaries()).append(",");
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

        if (obj instanceof ListEntitiesResult == false)
            return false;
        ListEntitiesResult other = (ListEntitiesResult) obj;
        if (other.getEntitySummaries() == null ^ this.getEntitySummaries() == null)
            return false;
        if (other.getEntitySummaries() != null && other.getEntitySummaries().equals(this.getEntitySummaries()) == false)
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

        hashCode = prime * hashCode + ((getEntitySummaries() == null) ? 0 : getEntitySummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEntitiesResult clone() {
        try {
            return (ListEntitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
