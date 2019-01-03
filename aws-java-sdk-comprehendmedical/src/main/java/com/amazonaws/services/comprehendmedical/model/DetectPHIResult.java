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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectPHI" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectPHIResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The collection of PHI entities extracted from the input text and their associated information. For each entity,
     * the response provides the entity text, the entity category, where the entity text begins and ends, and the level
     * of confidence that Comprehend Medical has in its detection.
     * </p>
     */
    private java.util.List<Entity> entities;
    /**
     * <p>
     * If the result of the previous request to DetectPHI was truncated, include the Paginationtoken to fetch the next
     * page of PHI entities.
     * </p>
     */
    private String paginationToken;

    /**
     * <p>
     * The collection of PHI entities extracted from the input text and their associated information. For each entity,
     * the response provides the entity text, the entity category, where the entity text begins and ends, and the level
     * of confidence that Comprehend Medical has in its detection.
     * </p>
     * 
     * @return The collection of PHI entities extracted from the input text and their associated information. For each
     *         entity, the response provides the entity text, the entity category, where the entity text begins and
     *         ends, and the level of confidence that Comprehend Medical has in its detection.
     */

    public java.util.List<Entity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * The collection of PHI entities extracted from the input text and their associated information. For each entity,
     * the response provides the entity text, the entity category, where the entity text begins and ends, and the level
     * of confidence that Comprehend Medical has in its detection.
     * </p>
     * 
     * @param entities
     *        The collection of PHI entities extracted from the input text and their associated information. For each
     *        entity, the response provides the entity text, the entity category, where the entity text begins and ends,
     *        and the level of confidence that Comprehend Medical has in its detection.
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
     * The collection of PHI entities extracted from the input text and their associated information. For each entity,
     * the response provides the entity text, the entity category, where the entity text begins and ends, and the level
     * of confidence that Comprehend Medical has in its detection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntities(java.util.Collection)} or {@link #withEntities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entities
     *        The collection of PHI entities extracted from the input text and their associated information. For each
     *        entity, the response provides the entity text, the entity category, where the entity text begins and ends,
     *        and the level of confidence that Comprehend Medical has in its detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectPHIResult withEntities(Entity... entities) {
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
     * The collection of PHI entities extracted from the input text and their associated information. For each entity,
     * the response provides the entity text, the entity category, where the entity text begins and ends, and the level
     * of confidence that Comprehend Medical has in its detection.
     * </p>
     * 
     * @param entities
     *        The collection of PHI entities extracted from the input text and their associated information. For each
     *        entity, the response provides the entity text, the entity category, where the entity text begins and ends,
     *        and the level of confidence that Comprehend Medical has in its detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectPHIResult withEntities(java.util.Collection<Entity> entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>
     * If the result of the previous request to DetectPHI was truncated, include the Paginationtoken to fetch the next
     * page of PHI entities.
     * </p>
     * 
     * @param paginationToken
     *        If the result of the previous request to DetectPHI was truncated, include the Paginationtoken to fetch the
     *        next page of PHI entities.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * If the result of the previous request to DetectPHI was truncated, include the Paginationtoken to fetch the next
     * page of PHI entities.
     * </p>
     * 
     * @return If the result of the previous request to DetectPHI was truncated, include the Paginationtoken to fetch
     *         the next page of PHI entities.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * If the result of the previous request to DetectPHI was truncated, include the Paginationtoken to fetch the next
     * page of PHI entities.
     * </p>
     * 
     * @param paginationToken
     *        If the result of the previous request to DetectPHI was truncated, include the Paginationtoken to fetch the
     *        next page of PHI entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectPHIResult withPaginationToken(String paginationToken) {
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

        if (obj instanceof DetectPHIResult == false)
            return false;
        DetectPHIResult other = (DetectPHIResult) obj;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
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
        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public DetectPHIResult clone() {
        try {
            return (DetectPHIResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
