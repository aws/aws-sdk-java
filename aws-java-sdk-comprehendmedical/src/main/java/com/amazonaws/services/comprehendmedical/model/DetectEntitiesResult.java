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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectEntitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The collection of medical entities extracted from the input text and their associated information. For each
     * entity, the response provides the entity text, the entity category, where the entity text begins and ends, and
     * the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of the
     * entity are also returned.
     * </p>
     */
    private java.util.List<Entity> entities;
    /**
     * <p>
     * Attributes extracted from the input text that we were unable to relate to an entity.
     * </p>
     */
    private java.util.List<UnmappedAttribute> unmappedAttributes;
    /**
     * <p>
     * If the result of the previous request to DetectEntities was truncated, include the Paginationtoken to fetch the
     * next page of entities.
     * </p>
     */
    private String paginationToken;

    /**
     * <p>
     * The collection of medical entities extracted from the input text and their associated information. For each
     * entity, the response provides the entity text, the entity category, where the entity text begins and ends, and
     * the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of the
     * entity are also returned.
     * </p>
     * 
     * @return The collection of medical entities extracted from the input text and their associated information. For
     *         each entity, the response provides the entity text, the entity category, where the entity text begins and
     *         ends, and the level of confidence that Comprehend Medical has in the detection and analysis. Attributes
     *         and traits of the entity are also returned.
     */

    public java.util.List<Entity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * The collection of medical entities extracted from the input text and their associated information. For each
     * entity, the response provides the entity text, the entity category, where the entity text begins and ends, and
     * the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of the
     * entity are also returned.
     * </p>
     * 
     * @param entities
     *        The collection of medical entities extracted from the input text and their associated information. For
     *        each entity, the response provides the entity text, the entity category, where the entity text begins and
     *        ends, and the level of confidence that Comprehend Medical has in the detection and analysis. Attributes
     *        and traits of the entity are also returned.
     */

    public void setEntities(java.util.Collection<Entity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<Entity>(entities);
    }

    /**
     * <p>
     * The collection of medical entities extracted from the input text and their associated information. For each
     * entity, the response provides the entity text, the entity category, where the entity text begins and ends, and
     * the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of the
     * entity are also returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntities(java.util.Collection)} or {@link #withEntities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entities
     *        The collection of medical entities extracted from the input text and their associated information. For
     *        each entity, the response provides the entity text, the entity category, where the entity text begins and
     *        ends, and the level of confidence that Comprehend Medical has in the detection and analysis. Attributes
     *        and traits of the entity are also returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectEntitiesResult withEntities(Entity... entities) {
        if (this.entities == null) {
            setEntities(new java.util.ArrayList<Entity>(entities.length));
        }
        for (Entity ele : entities) {
            this.entities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The collection of medical entities extracted from the input text and their associated information. For each
     * entity, the response provides the entity text, the entity category, where the entity text begins and ends, and
     * the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of the
     * entity are also returned.
     * </p>
     * 
     * @param entities
     *        The collection of medical entities extracted from the input text and their associated information. For
     *        each entity, the response provides the entity text, the entity category, where the entity text begins and
     *        ends, and the level of confidence that Comprehend Medical has in the detection and analysis. Attributes
     *        and traits of the entity are also returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectEntitiesResult withEntities(java.util.Collection<Entity> entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>
     * Attributes extracted from the input text that we were unable to relate to an entity.
     * </p>
     * 
     * @return Attributes extracted from the input text that we were unable to relate to an entity.
     */

    public java.util.List<UnmappedAttribute> getUnmappedAttributes() {
        return unmappedAttributes;
    }

    /**
     * <p>
     * Attributes extracted from the input text that we were unable to relate to an entity.
     * </p>
     * 
     * @param unmappedAttributes
     *        Attributes extracted from the input text that we were unable to relate to an entity.
     */

    public void setUnmappedAttributes(java.util.Collection<UnmappedAttribute> unmappedAttributes) {
        if (unmappedAttributes == null) {
            this.unmappedAttributes = null;
            return;
        }

        this.unmappedAttributes = new java.util.ArrayList<UnmappedAttribute>(unmappedAttributes);
    }

    /**
     * <p>
     * Attributes extracted from the input text that we were unable to relate to an entity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnmappedAttributes(java.util.Collection)} or {@link #withUnmappedAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param unmappedAttributes
     *        Attributes extracted from the input text that we were unable to relate to an entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectEntitiesResult withUnmappedAttributes(UnmappedAttribute... unmappedAttributes) {
        if (this.unmappedAttributes == null) {
            setUnmappedAttributes(new java.util.ArrayList<UnmappedAttribute>(unmappedAttributes.length));
        }
        for (UnmappedAttribute ele : unmappedAttributes) {
            this.unmappedAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Attributes extracted from the input text that we were unable to relate to an entity.
     * </p>
     * 
     * @param unmappedAttributes
     *        Attributes extracted from the input text that we were unable to relate to an entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectEntitiesResult withUnmappedAttributes(java.util.Collection<UnmappedAttribute> unmappedAttributes) {
        setUnmappedAttributes(unmappedAttributes);
        return this;
    }

    /**
     * <p>
     * If the result of the previous request to DetectEntities was truncated, include the Paginationtoken to fetch the
     * next page of entities.
     * </p>
     * 
     * @param paginationToken
     *        If the result of the previous request to DetectEntities was truncated, include the Paginationtoken to
     *        fetch the next page of entities.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * If the result of the previous request to DetectEntities was truncated, include the Paginationtoken to fetch the
     * next page of entities.
     * </p>
     * 
     * @return If the result of the previous request to DetectEntities was truncated, include the Paginationtoken to
     *         fetch the next page of entities.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * If the result of the previous request to DetectEntities was truncated, include the Paginationtoken to fetch the
     * next page of entities.
     * </p>
     * 
     * @param paginationToken
     *        If the result of the previous request to DetectEntities was truncated, include the Paginationtoken to
     *        fetch the next page of entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectEntitiesResult withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
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
        if (getEntities() != null)
            sb.append("Entities: ").append(getEntities()).append(",");
        if (getUnmappedAttributes() != null)
            sb.append("UnmappedAttributes: ").append(getUnmappedAttributes()).append(",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: ").append(getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectEntitiesResult == false)
            return false;
        DetectEntitiesResult other = (DetectEntitiesResult) obj;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        if (other.getUnmappedAttributes() == null ^ this.getUnmappedAttributes() == null)
            return false;
        if (other.getUnmappedAttributes() != null && other.getUnmappedAttributes().equals(this.getUnmappedAttributes()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        hashCode = prime * hashCode + ((getUnmappedAttributes() == null) ? 0 : getUnmappedAttributes().hashCode());
        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public DetectEntitiesResult clone() {
        try {
            return (DetectEntitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
