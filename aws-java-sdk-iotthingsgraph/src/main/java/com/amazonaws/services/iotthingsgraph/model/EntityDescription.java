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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the properties of an entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/EntityDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The entity ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The entity ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The entity type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The time at which the entity was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The definition document of the entity.
     * </p>
     */
    private DefinitionDocument definition;

    /**
     * <p>
     * The entity ID.
     * </p>
     * 
     * @param id
     *        The entity ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The entity ID.
     * </p>
     * 
     * @return The entity ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The entity ID.
     * </p>
     * 
     * @param id
     *        The entity ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDescription withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The entity ARN.
     * </p>
     * 
     * @param arn
     *        The entity ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The entity ARN.
     * </p>
     * 
     * @return The entity ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The entity ARN.
     * </p>
     * 
     * @param arn
     *        The entity ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDescription withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The entity type.
     * </p>
     * 
     * @param type
     *        The entity type.
     * @see EntityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The entity type.
     * </p>
     * 
     * @return The entity type.
     * @see EntityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The entity type.
     * </p>
     * 
     * @param type
     *        The entity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public EntityDescription withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The entity type.
     * </p>
     * 
     * @param type
     *        The entity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public EntityDescription withType(EntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the entity was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the entity was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the entity was created.
     * </p>
     * 
     * @return The time at which the entity was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the entity was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the entity was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDescription withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The definition document of the entity.
     * </p>
     * 
     * @param definition
     *        The definition document of the entity.
     */

    public void setDefinition(DefinitionDocument definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The definition document of the entity.
     * </p>
     * 
     * @return The definition document of the entity.
     */

    public DefinitionDocument getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The definition document of the entity.
     * </p>
     * 
     * @param definition
     *        The definition document of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDescription withDefinition(DefinitionDocument definition) {
        setDefinition(definition);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityDescription == false)
            return false;
        EntityDescription other = (EntityDescription) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        return hashCode;
    }

    @Override
    public EntityDescription clone() {
        try {
            return (EntityDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotthingsgraph.model.transform.EntityDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
