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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectEntitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of entities identified in the input text. For each entity, the response provides the entity text,
     * entity type, where the entity text begins and ends, and the level of confidence that Amazon Comprehend has in the
     * detection. For a list of entity types, see <a>how-entities</a>.
     * </p>
     */
    private java.util.List<Entity> entities;

    /**
     * <p>
     * A collection of entities identified in the input text. For each entity, the response provides the entity text,
     * entity type, where the entity text begins and ends, and the level of confidence that Amazon Comprehend has in the
     * detection. For a list of entity types, see <a>how-entities</a>.
     * </p>
     * 
     * @return A collection of entities identified in the input text. For each entity, the response provides the entity
     *         text, entity type, where the entity text begins and ends, and the level of confidence that Amazon
     *         Comprehend has in the detection. For a list of entity types, see <a>how-entities</a>.
     */

    public java.util.List<Entity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * A collection of entities identified in the input text. For each entity, the response provides the entity text,
     * entity type, where the entity text begins and ends, and the level of confidence that Amazon Comprehend has in the
     * detection. For a list of entity types, see <a>how-entities</a>.
     * </p>
     * 
     * @param entities
     *        A collection of entities identified in the input text. For each entity, the response provides the entity
     *        text, entity type, where the entity text begins and ends, and the level of confidence that Amazon
     *        Comprehend has in the detection. For a list of entity types, see <a>how-entities</a>.
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
     * A collection of entities identified in the input text. For each entity, the response provides the entity text,
     * entity type, where the entity text begins and ends, and the level of confidence that Amazon Comprehend has in the
     * detection. For a list of entity types, see <a>how-entities</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntities(java.util.Collection)} or {@link #withEntities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entities
     *        A collection of entities identified in the input text. For each entity, the response provides the entity
     *        text, entity type, where the entity text begins and ends, and the level of confidence that Amazon
     *        Comprehend has in the detection. For a list of entity types, see <a>how-entities</a>.
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
     * A collection of entities identified in the input text. For each entity, the response provides the entity text,
     * entity type, where the entity text begins and ends, and the level of confidence that Amazon Comprehend has in the
     * detection. For a list of entity types, see <a>how-entities</a>.
     * </p>
     * 
     * @param entities
     *        A collection of entities identified in the input text. For each entity, the response provides the entity
     *        text, entity type, where the entity text begins and ends, and the level of confidence that Amazon
     *        Comprehend has in the detection. For a list of entity types, see <a>how-entities</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectEntitiesResult withEntities(java.util.Collection<Entity> entities) {
        setEntities(entities);
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
            sb.append("Entities: ").append(getEntities());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
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
