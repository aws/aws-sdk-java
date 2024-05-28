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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an entity that can be referenced in a Cedar policy.
 * </p>
 * <p>
 * This data type is used as one of the fields in the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_EntitiesDefinition.html"
 * >EntitiesDefinition</a> structure.
 * </p>
 * <p>
 * <code>{ "identifier": { "entityType": "Photo", "entityId": "VacationPhoto94.jpg" }, "attributes": {}, "parents": [ { "entityType": "Album", "entityId": "alice_folder" } ] }</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/EntityItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the entity.
     * </p>
     */
    private EntityIdentifier identifier;
    /**
     * <p>
     * A list of attributes for the entity.
     * </p>
     */
    private java.util.Map<String, AttributeValue> attributes;
    /**
     * <p>
     * The parents in the hierarchy that contains the entity.
     * </p>
     */
    private java.util.List<EntityIdentifier> parents;

    /**
     * <p>
     * The identifier of the entity.
     * </p>
     * 
     * @param identifier
     *        The identifier of the entity.
     */

    public void setIdentifier(EntityIdentifier identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the entity.
     * </p>
     * 
     * @return The identifier of the entity.
     */

    public EntityIdentifier getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the entity.
     * </p>
     * 
     * @param identifier
     *        The identifier of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityItem withIdentifier(EntityIdentifier identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * A list of attributes for the entity.
     * </p>
     * 
     * @return A list of attributes for the entity.
     */

    public java.util.Map<String, AttributeValue> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A list of attributes for the entity.
     * </p>
     * 
     * @param attributes
     *        A list of attributes for the entity.
     */

    public void setAttributes(java.util.Map<String, AttributeValue> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A list of attributes for the entity.
     * </p>
     * 
     * @param attributes
     *        A list of attributes for the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityItem withAttributes(java.util.Map<String, AttributeValue> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see EntityItem#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EntityItem addAttributesEntry(String key, AttributeValue value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityItem clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The parents in the hierarchy that contains the entity.
     * </p>
     * 
     * @return The parents in the hierarchy that contains the entity.
     */

    public java.util.List<EntityIdentifier> getParents() {
        return parents;
    }

    /**
     * <p>
     * The parents in the hierarchy that contains the entity.
     * </p>
     * 
     * @param parents
     *        The parents in the hierarchy that contains the entity.
     */

    public void setParents(java.util.Collection<EntityIdentifier> parents) {
        if (parents == null) {
            this.parents = null;
            return;
        }

        this.parents = new java.util.ArrayList<EntityIdentifier>(parents);
    }

    /**
     * <p>
     * The parents in the hierarchy that contains the entity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParents(java.util.Collection)} or {@link #withParents(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param parents
     *        The parents in the hierarchy that contains the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityItem withParents(EntityIdentifier... parents) {
        if (this.parents == null) {
            setParents(new java.util.ArrayList<EntityIdentifier>(parents.length));
        }
        for (EntityIdentifier ele : parents) {
            this.parents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parents in the hierarchy that contains the entity.
     * </p>
     * 
     * @param parents
     *        The parents in the hierarchy that contains the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityItem withParents(java.util.Collection<EntityIdentifier> parents) {
        setParents(parents);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getParents() != null)
            sb.append("Parents: ").append(getParents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityItem == false)
            return false;
        EntityItem other = (EntityItem) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getParents() == null ^ this.getParents() == null)
            return false;
        if (other.getParents() != null && other.getParents().equals(this.getParents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getParents() == null) ? 0 : getParents().hashCode());
        return hashCode;
    }

    @Override
    public EntityItem clone() {
        try {
            return (EntityItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.EntityItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
