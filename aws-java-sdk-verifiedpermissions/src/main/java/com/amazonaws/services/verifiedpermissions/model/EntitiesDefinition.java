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
 * Contains the list of entities to be considered during an authorization request. This includes all principals,
 * resources, and actions required to successfully evaluate the request.
 * </p>
 * <p>
 * This data type is used as a field in the response parameter for the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorized.html">IsAuthorized</a> and
 * <a href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorizedWithToken.html">
 * IsAuthorizedWithToken</a> operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/EntitiesDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntitiesDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of entities that are needed to successfully evaluate an authorization request. Each entity in this array
     * must include an identifier for the entity, the attributes of the entity, and a list of any parent entities.
     * </p>
     */
    private java.util.List<EntityItem> entityList;

    /**
     * <p>
     * An array of entities that are needed to successfully evaluate an authorization request. Each entity in this array
     * must include an identifier for the entity, the attributes of the entity, and a list of any parent entities.
     * </p>
     * 
     * @return An array of entities that are needed to successfully evaluate an authorization request. Each entity in
     *         this array must include an identifier for the entity, the attributes of the entity, and a list of any
     *         parent entities.
     */

    public java.util.List<EntityItem> getEntityList() {
        return entityList;
    }

    /**
     * <p>
     * An array of entities that are needed to successfully evaluate an authorization request. Each entity in this array
     * must include an identifier for the entity, the attributes of the entity, and a list of any parent entities.
     * </p>
     * 
     * @param entityList
     *        An array of entities that are needed to successfully evaluate an authorization request. Each entity in
     *        this array must include an identifier for the entity, the attributes of the entity, and a list of any
     *        parent entities.
     */

    public void setEntityList(java.util.Collection<EntityItem> entityList) {
        if (entityList == null) {
            this.entityList = null;
            return;
        }

        this.entityList = new java.util.ArrayList<EntityItem>(entityList);
    }

    /**
     * <p>
     * An array of entities that are needed to successfully evaluate an authorization request. Each entity in this array
     * must include an identifier for the entity, the attributes of the entity, and a list of any parent entities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityList(java.util.Collection)} or {@link #withEntityList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityList
     *        An array of entities that are needed to successfully evaluate an authorization request. Each entity in
     *        this array must include an identifier for the entity, the attributes of the entity, and a list of any
     *        parent entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitiesDefinition withEntityList(EntityItem... entityList) {
        if (this.entityList == null) {
            setEntityList(new java.util.ArrayList<EntityItem>(entityList.length));
        }
        for (EntityItem ele : entityList) {
            this.entityList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of entities that are needed to successfully evaluate an authorization request. Each entity in this array
     * must include an identifier for the entity, the attributes of the entity, and a list of any parent entities.
     * </p>
     * 
     * @param entityList
     *        An array of entities that are needed to successfully evaluate an authorization request. Each entity in
     *        this array must include an identifier for the entity, the attributes of the entity, and a list of any
     *        parent entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitiesDefinition withEntityList(java.util.Collection<EntityItem> entityList) {
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

        if (obj instanceof EntitiesDefinition == false)
            return false;
        EntitiesDefinition other = (EntitiesDefinition) obj;
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

        hashCode = prime * hashCode + ((getEntityList() == null) ? 0 : getEntityList().hashCode());
        return hashCode;
    }

    @Override
    public EntitiesDefinition clone() {
        try {
            return (EntitiesDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.EntitiesDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
