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
 * Individual item from the list of entity types in the metadata of an entity recognizer.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EntityRecognizerMetadataEntityTypesListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRecognizerMetadataEntityTypesListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Type of entity from the list of entity types in the metadata of an entity recognizer.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Type of entity from the list of entity types in the metadata of an entity recognizer.
     * </p>
     * 
     * @param type
     *        Type of entity from the list of entity types in the metadata of an entity recognizer.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of entity from the list of entity types in the metadata of an entity recognizer.
     * </p>
     * 
     * @return Type of entity from the list of entity types in the metadata of an entity recognizer.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of entity from the list of entity types in the metadata of an entity recognizer.
     * </p>
     * 
     * @param type
     *        Type of entity from the list of entity types in the metadata of an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerMetadataEntityTypesListItem withType(String type) {
        setType(type);
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerMetadataEntityTypesListItem == false)
            return false;
        EntityRecognizerMetadataEntityTypesListItem other = (EntityRecognizerMetadataEntityTypesListItem) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public EntityRecognizerMetadataEntityTypesListItem clone() {
        try {
            return (EntityRecognizerMetadataEntityTypesListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityRecognizerMetadataEntityTypesListItemMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
