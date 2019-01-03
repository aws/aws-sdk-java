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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the format and location of the input data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EntityRecognizerInputDataConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRecognizerInputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The entity types in the input data for an entity recognizer.
     * </p>
     */
    private java.util.List<EntityTypesListItem> entityTypes;
    /**
     * <p>
     * S3 location of the documents folder for an entity recognizer
     * </p>
     */
    private EntityRecognizerDocuments documents;
    /**
     * <p>
     * S3 location of the annotations file for an entity recognizer.
     * </p>
     */
    private EntityRecognizerAnnotations annotations;
    /**
     * <p>
     * S3 location of the entity list for an entity recognizer.
     * </p>
     */
    private EntityRecognizerEntityList entityList;

    /**
     * <p>
     * The entity types in the input data for an entity recognizer.
     * </p>
     * 
     * @return The entity types in the input data for an entity recognizer.
     */

    public java.util.List<EntityTypesListItem> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * The entity types in the input data for an entity recognizer.
     * </p>
     * 
     * @param entityTypes
     *        The entity types in the input data for an entity recognizer.
     */

    public void setEntityTypes(java.util.Collection<EntityTypesListItem> entityTypes) {
        if (entityTypes == null) {
            this.entityTypes = null;
            return;
        }

        this.entityTypes = new java.util.ArrayList<EntityTypesListItem>(entityTypes);
    }

    /**
     * <p>
     * The entity types in the input data for an entity recognizer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityTypes(java.util.Collection)} or {@link #withEntityTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityTypes
     *        The entity types in the input data for an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerInputDataConfig withEntityTypes(EntityTypesListItem... entityTypes) {
        if (this.entityTypes == null) {
            setEntityTypes(new java.util.ArrayList<EntityTypesListItem>(entityTypes.length));
        }
        for (EntityTypesListItem ele : entityTypes) {
            this.entityTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The entity types in the input data for an entity recognizer.
     * </p>
     * 
     * @param entityTypes
     *        The entity types in the input data for an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerInputDataConfig withEntityTypes(java.util.Collection<EntityTypesListItem> entityTypes) {
        setEntityTypes(entityTypes);
        return this;
    }

    /**
     * <p>
     * S3 location of the documents folder for an entity recognizer
     * </p>
     * 
     * @param documents
     *        S3 location of the documents folder for an entity recognizer
     */

    public void setDocuments(EntityRecognizerDocuments documents) {
        this.documents = documents;
    }

    /**
     * <p>
     * S3 location of the documents folder for an entity recognizer
     * </p>
     * 
     * @return S3 location of the documents folder for an entity recognizer
     */

    public EntityRecognizerDocuments getDocuments() {
        return this.documents;
    }

    /**
     * <p>
     * S3 location of the documents folder for an entity recognizer
     * </p>
     * 
     * @param documents
     *        S3 location of the documents folder for an entity recognizer
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerInputDataConfig withDocuments(EntityRecognizerDocuments documents) {
        setDocuments(documents);
        return this;
    }

    /**
     * <p>
     * S3 location of the annotations file for an entity recognizer.
     * </p>
     * 
     * @param annotations
     *        S3 location of the annotations file for an entity recognizer.
     */

    public void setAnnotations(EntityRecognizerAnnotations annotations) {
        this.annotations = annotations;
    }

    /**
     * <p>
     * S3 location of the annotations file for an entity recognizer.
     * </p>
     * 
     * @return S3 location of the annotations file for an entity recognizer.
     */

    public EntityRecognizerAnnotations getAnnotations() {
        return this.annotations;
    }

    /**
     * <p>
     * S3 location of the annotations file for an entity recognizer.
     * </p>
     * 
     * @param annotations
     *        S3 location of the annotations file for an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerInputDataConfig withAnnotations(EntityRecognizerAnnotations annotations) {
        setAnnotations(annotations);
        return this;
    }

    /**
     * <p>
     * S3 location of the entity list for an entity recognizer.
     * </p>
     * 
     * @param entityList
     *        S3 location of the entity list for an entity recognizer.
     */

    public void setEntityList(EntityRecognizerEntityList entityList) {
        this.entityList = entityList;
    }

    /**
     * <p>
     * S3 location of the entity list for an entity recognizer.
     * </p>
     * 
     * @return S3 location of the entity list for an entity recognizer.
     */

    public EntityRecognizerEntityList getEntityList() {
        return this.entityList;
    }

    /**
     * <p>
     * S3 location of the entity list for an entity recognizer.
     * </p>
     * 
     * @param entityList
     *        S3 location of the entity list for an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerInputDataConfig withEntityList(EntityRecognizerEntityList entityList) {
        setEntityList(entityList);
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
        if (getDocuments() != null)
            sb.append("Documents: ").append(getDocuments()).append(",");
        if (getAnnotations() != null)
            sb.append("Annotations: ").append(getAnnotations()).append(",");
        if (getEntityList() != null)
            sb.append("EntityList: ").append(getEntityList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerInputDataConfig == false)
            return false;
        EntityRecognizerInputDataConfig other = (EntityRecognizerInputDataConfig) obj;
        if (other.getEntityTypes() == null ^ this.getEntityTypes() == null)
            return false;
        if (other.getEntityTypes() != null && other.getEntityTypes().equals(this.getEntityTypes()) == false)
            return false;
        if (other.getDocuments() == null ^ this.getDocuments() == null)
            return false;
        if (other.getDocuments() != null && other.getDocuments().equals(this.getDocuments()) == false)
            return false;
        if (other.getAnnotations() == null ^ this.getAnnotations() == null)
            return false;
        if (other.getAnnotations() != null && other.getAnnotations().equals(this.getAnnotations()) == false)
            return false;
        if (other.getEntityList() == null ^ this.getEntityList() == null)
            return false;
        if (other.getEntityList() != null && other.getEntityList().equals(this.getEntityList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getDocuments() == null) ? 0 : getDocuments().hashCode());
        hashCode = prime * hashCode + ((getAnnotations() == null) ? 0 : getAnnotations().hashCode());
        hashCode = prime * hashCode + ((getEntityList() == null) ? 0 : getEntityList().hashCode());
        return hashCode;
    }

    @Override
    public EntityRecognizerInputDataConfig clone() {
        try {
            return (EntityRecognizerInputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityRecognizerInputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
