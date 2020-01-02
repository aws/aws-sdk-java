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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListEntities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEntitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Array of <code>EntitySummary</code> object.
     * </p>
     */
    private java.util.List<EntitySummary> entitySummaryList;
    /**
     * <p>
     * The value of the next token if it exists. Null if there is no more result.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Array of <code>EntitySummary</code> object.
     * </p>
     * 
     * @return Array of <code>EntitySummary</code> object.
     */

    public java.util.List<EntitySummary> getEntitySummaryList() {
        return entitySummaryList;
    }

    /**
     * <p>
     * Array of <code>EntitySummary</code> object.
     * </p>
     * 
     * @param entitySummaryList
     *        Array of <code>EntitySummary</code> object.
     */

    public void setEntitySummaryList(java.util.Collection<EntitySummary> entitySummaryList) {
        if (entitySummaryList == null) {
            this.entitySummaryList = null;
            return;
        }

        this.entitySummaryList = new java.util.ArrayList<EntitySummary>(entitySummaryList);
    }

    /**
     * <p>
     * Array of <code>EntitySummary</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitySummaryList(java.util.Collection)} or {@link #withEntitySummaryList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param entitySummaryList
     *        Array of <code>EntitySummary</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesResult withEntitySummaryList(EntitySummary... entitySummaryList) {
        if (this.entitySummaryList == null) {
            setEntitySummaryList(new java.util.ArrayList<EntitySummary>(entitySummaryList.length));
        }
        for (EntitySummary ele : entitySummaryList) {
            this.entitySummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of <code>EntitySummary</code> object.
     * </p>
     * 
     * @param entitySummaryList
     *        Array of <code>EntitySummary</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesResult withEntitySummaryList(java.util.Collection<EntitySummary> entitySummaryList) {
        setEntitySummaryList(entitySummaryList);
        return this;
    }

    /**
     * <p>
     * The value of the next token if it exists. Null if there is no more result.
     * </p>
     * 
     * @param nextToken
     *        The value of the next token if it exists. Null if there is no more result.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The value of the next token if it exists. Null if there is no more result.
     * </p>
     * 
     * @return The value of the next token if it exists. Null if there is no more result.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The value of the next token if it exists. Null if there is no more result.
     * </p>
     * 
     * @param nextToken
     *        The value of the next token if it exists. Null if there is no more result.
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
        if (getEntitySummaryList() != null)
            sb.append("EntitySummaryList: ").append(getEntitySummaryList()).append(",");
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
        if (other.getEntitySummaryList() == null ^ this.getEntitySummaryList() == null)
            return false;
        if (other.getEntitySummaryList() != null && other.getEntitySummaryList().equals(this.getEntitySummaryList()) == false)
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

        hashCode = prime * hashCode + ((getEntitySummaryList() == null) ? 0 : getEntitySummaryList().hashCode());
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
