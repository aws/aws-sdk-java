/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that represents a named entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicNamedEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicNamedEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the named entity.
     * </p>
     */
    private String entityName;
    /**
     * <p>
     * The description of the named entity.
     * </p>
     */
    private String entityDescription;
    /**
     * <p>
     * The other names or aliases for the named entity.
     * </p>
     */
    private java.util.List<String> entitySynonyms;
    /**
     * <p>
     * The type of named entity that a topic represents.
     * </p>
     */
    private SemanticEntityType semanticEntityType;
    /**
     * <p>
     * The definition of a named entity.
     * </p>
     */
    private java.util.List<NamedEntityDefinition> definition;

    /**
     * <p>
     * The name of the named entity.
     * </p>
     * 
     * @param entityName
     *        The name of the named entity.
     */

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    /**
     * <p>
     * The name of the named entity.
     * </p>
     * 
     * @return The name of the named entity.
     */

    public String getEntityName() {
        return this.entityName;
    }

    /**
     * <p>
     * The name of the named entity.
     * </p>
     * 
     * @param entityName
     *        The name of the named entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicNamedEntity withEntityName(String entityName) {
        setEntityName(entityName);
        return this;
    }

    /**
     * <p>
     * The description of the named entity.
     * </p>
     * 
     * @param entityDescription
     *        The description of the named entity.
     */

    public void setEntityDescription(String entityDescription) {
        this.entityDescription = entityDescription;
    }

    /**
     * <p>
     * The description of the named entity.
     * </p>
     * 
     * @return The description of the named entity.
     */

    public String getEntityDescription() {
        return this.entityDescription;
    }

    /**
     * <p>
     * The description of the named entity.
     * </p>
     * 
     * @param entityDescription
     *        The description of the named entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicNamedEntity withEntityDescription(String entityDescription) {
        setEntityDescription(entityDescription);
        return this;
    }

    /**
     * <p>
     * The other names or aliases for the named entity.
     * </p>
     * 
     * @return The other names or aliases for the named entity.
     */

    public java.util.List<String> getEntitySynonyms() {
        return entitySynonyms;
    }

    /**
     * <p>
     * The other names or aliases for the named entity.
     * </p>
     * 
     * @param entitySynonyms
     *        The other names or aliases for the named entity.
     */

    public void setEntitySynonyms(java.util.Collection<String> entitySynonyms) {
        if (entitySynonyms == null) {
            this.entitySynonyms = null;
            return;
        }

        this.entitySynonyms = new java.util.ArrayList<String>(entitySynonyms);
    }

    /**
     * <p>
     * The other names or aliases for the named entity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitySynonyms(java.util.Collection)} or {@link #withEntitySynonyms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param entitySynonyms
     *        The other names or aliases for the named entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicNamedEntity withEntitySynonyms(String... entitySynonyms) {
        if (this.entitySynonyms == null) {
            setEntitySynonyms(new java.util.ArrayList<String>(entitySynonyms.length));
        }
        for (String ele : entitySynonyms) {
            this.entitySynonyms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The other names or aliases for the named entity.
     * </p>
     * 
     * @param entitySynonyms
     *        The other names or aliases for the named entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicNamedEntity withEntitySynonyms(java.util.Collection<String> entitySynonyms) {
        setEntitySynonyms(entitySynonyms);
        return this;
    }

    /**
     * <p>
     * The type of named entity that a topic represents.
     * </p>
     * 
     * @param semanticEntityType
     *        The type of named entity that a topic represents.
     */

    public void setSemanticEntityType(SemanticEntityType semanticEntityType) {
        this.semanticEntityType = semanticEntityType;
    }

    /**
     * <p>
     * The type of named entity that a topic represents.
     * </p>
     * 
     * @return The type of named entity that a topic represents.
     */

    public SemanticEntityType getSemanticEntityType() {
        return this.semanticEntityType;
    }

    /**
     * <p>
     * The type of named entity that a topic represents.
     * </p>
     * 
     * @param semanticEntityType
     *        The type of named entity that a topic represents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicNamedEntity withSemanticEntityType(SemanticEntityType semanticEntityType) {
        setSemanticEntityType(semanticEntityType);
        return this;
    }

    /**
     * <p>
     * The definition of a named entity.
     * </p>
     * 
     * @return The definition of a named entity.
     */

    public java.util.List<NamedEntityDefinition> getDefinition() {
        return definition;
    }

    /**
     * <p>
     * The definition of a named entity.
     * </p>
     * 
     * @param definition
     *        The definition of a named entity.
     */

    public void setDefinition(java.util.Collection<NamedEntityDefinition> definition) {
        if (definition == null) {
            this.definition = null;
            return;
        }

        this.definition = new java.util.ArrayList<NamedEntityDefinition>(definition);
    }

    /**
     * <p>
     * The definition of a named entity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefinition(java.util.Collection)} or {@link #withDefinition(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param definition
     *        The definition of a named entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicNamedEntity withDefinition(NamedEntityDefinition... definition) {
        if (this.definition == null) {
            setDefinition(new java.util.ArrayList<NamedEntityDefinition>(definition.length));
        }
        for (NamedEntityDefinition ele : definition) {
            this.definition.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The definition of a named entity.
     * </p>
     * 
     * @param definition
     *        The definition of a named entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicNamedEntity withDefinition(java.util.Collection<NamedEntityDefinition> definition) {
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
        if (getEntityName() != null)
            sb.append("EntityName: ").append(getEntityName()).append(",");
        if (getEntityDescription() != null)
            sb.append("EntityDescription: ").append(getEntityDescription()).append(",");
        if (getEntitySynonyms() != null)
            sb.append("EntitySynonyms: ").append(getEntitySynonyms()).append(",");
        if (getSemanticEntityType() != null)
            sb.append("SemanticEntityType: ").append(getSemanticEntityType()).append(",");
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

        if (obj instanceof TopicNamedEntity == false)
            return false;
        TopicNamedEntity other = (TopicNamedEntity) obj;
        if (other.getEntityName() == null ^ this.getEntityName() == null)
            return false;
        if (other.getEntityName() != null && other.getEntityName().equals(this.getEntityName()) == false)
            return false;
        if (other.getEntityDescription() == null ^ this.getEntityDescription() == null)
            return false;
        if (other.getEntityDescription() != null && other.getEntityDescription().equals(this.getEntityDescription()) == false)
            return false;
        if (other.getEntitySynonyms() == null ^ this.getEntitySynonyms() == null)
            return false;
        if (other.getEntitySynonyms() != null && other.getEntitySynonyms().equals(this.getEntitySynonyms()) == false)
            return false;
        if (other.getSemanticEntityType() == null ^ this.getSemanticEntityType() == null)
            return false;
        if (other.getSemanticEntityType() != null && other.getSemanticEntityType().equals(this.getSemanticEntityType()) == false)
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

        hashCode = prime * hashCode + ((getEntityName() == null) ? 0 : getEntityName().hashCode());
        hashCode = prime * hashCode + ((getEntityDescription() == null) ? 0 : getEntityDescription().hashCode());
        hashCode = prime * hashCode + ((getEntitySynonyms() == null) ? 0 : getEntitySynonyms().hashCode());
        hashCode = prime * hashCode + ((getSemanticEntityType() == null) ? 0 : getSemanticEntityType().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        return hashCode;
    }

    @Override
    public TopicNamedEntity clone() {
        try {
            return (TopicNamedEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicNamedEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
