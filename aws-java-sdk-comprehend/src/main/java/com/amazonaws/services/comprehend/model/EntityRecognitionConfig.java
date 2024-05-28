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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration required for an entity recognition model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EntityRecognitionConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRecognitionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Up to 25 entity types that the model is trained to recognize.
     * </p>
     */
    private java.util.List<EntityTypesListItem> entityTypes;

    /**
     * <p>
     * Up to 25 entity types that the model is trained to recognize.
     * </p>
     * 
     * @return Up to 25 entity types that the model is trained to recognize.
     */

    public java.util.List<EntityTypesListItem> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * Up to 25 entity types that the model is trained to recognize.
     * </p>
     * 
     * @param entityTypes
     *        Up to 25 entity types that the model is trained to recognize.
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
     * Up to 25 entity types that the model is trained to recognize.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityTypes(java.util.Collection)} or {@link #withEntityTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityTypes
     *        Up to 25 entity types that the model is trained to recognize.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognitionConfig withEntityTypes(EntityTypesListItem... entityTypes) {
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
     * Up to 25 entity types that the model is trained to recognize.
     * </p>
     * 
     * @param entityTypes
     *        Up to 25 entity types that the model is trained to recognize.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognitionConfig withEntityTypes(java.util.Collection<EntityTypesListItem> entityTypes) {
        setEntityTypes(entityTypes);
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
            sb.append("EntityTypes: ").append(getEntityTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognitionConfig == false)
            return false;
        EntityRecognitionConfig other = (EntityRecognitionConfig) obj;
        if (other.getEntityTypes() == null ^ this.getEntityTypes() == null)
            return false;
        if (other.getEntityTypes() != null && other.getEntityTypes().equals(this.getEntityTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        return hashCode;
    }

    @Override
    public EntityRecognitionConfig clone() {
        try {
            return (EntityRecognitionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityRecognitionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
