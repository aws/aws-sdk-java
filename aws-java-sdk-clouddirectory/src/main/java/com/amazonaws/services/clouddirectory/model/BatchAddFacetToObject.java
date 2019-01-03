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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a batch add facet to object operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchAddFacetToObject"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAddFacetToObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the facet being added to the object.
     * </p>
     */
    private SchemaFacet schemaFacet;
    /**
     * <p>
     * The attributes to set on the object.
     * </p>
     */
    private java.util.List<AttributeKeyAndValue> objectAttributeList;
    /**
     * <p>
     * A reference to the object being mutated.
     * </p>
     */
    private ObjectReference objectReference;

    /**
     * <p>
     * Represents the facet being added to the object.
     * </p>
     * 
     * @param schemaFacet
     *        Represents the facet being added to the object.
     */

    public void setSchemaFacet(SchemaFacet schemaFacet) {
        this.schemaFacet = schemaFacet;
    }

    /**
     * <p>
     * Represents the facet being added to the object.
     * </p>
     * 
     * @return Represents the facet being added to the object.
     */

    public SchemaFacet getSchemaFacet() {
        return this.schemaFacet;
    }

    /**
     * <p>
     * Represents the facet being added to the object.
     * </p>
     * 
     * @param schemaFacet
     *        Represents the facet being added to the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAddFacetToObject withSchemaFacet(SchemaFacet schemaFacet) {
        setSchemaFacet(schemaFacet);
        return this;
    }

    /**
     * <p>
     * The attributes to set on the object.
     * </p>
     * 
     * @return The attributes to set on the object.
     */

    public java.util.List<AttributeKeyAndValue> getObjectAttributeList() {
        return objectAttributeList;
    }

    /**
     * <p>
     * The attributes to set on the object.
     * </p>
     * 
     * @param objectAttributeList
     *        The attributes to set on the object.
     */

    public void setObjectAttributeList(java.util.Collection<AttributeKeyAndValue> objectAttributeList) {
        if (objectAttributeList == null) {
            this.objectAttributeList = null;
            return;
        }

        this.objectAttributeList = new java.util.ArrayList<AttributeKeyAndValue>(objectAttributeList);
    }

    /**
     * <p>
     * The attributes to set on the object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectAttributeList(java.util.Collection)} or {@link #withObjectAttributeList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param objectAttributeList
     *        The attributes to set on the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAddFacetToObject withObjectAttributeList(AttributeKeyAndValue... objectAttributeList) {
        if (this.objectAttributeList == null) {
            setObjectAttributeList(new java.util.ArrayList<AttributeKeyAndValue>(objectAttributeList.length));
        }
        for (AttributeKeyAndValue ele : objectAttributeList) {
            this.objectAttributeList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes to set on the object.
     * </p>
     * 
     * @param objectAttributeList
     *        The attributes to set on the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAddFacetToObject withObjectAttributeList(java.util.Collection<AttributeKeyAndValue> objectAttributeList) {
        setObjectAttributeList(objectAttributeList);
        return this;
    }

    /**
     * <p>
     * A reference to the object being mutated.
     * </p>
     * 
     * @param objectReference
     *        A reference to the object being mutated.
     */

    public void setObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    /**
     * <p>
     * A reference to the object being mutated.
     * </p>
     * 
     * @return A reference to the object being mutated.
     */

    public ObjectReference getObjectReference() {
        return this.objectReference;
    }

    /**
     * <p>
     * A reference to the object being mutated.
     * </p>
     * 
     * @param objectReference
     *        A reference to the object being mutated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAddFacetToObject withObjectReference(ObjectReference objectReference) {
        setObjectReference(objectReference);
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
        if (getSchemaFacet() != null)
            sb.append("SchemaFacet: ").append(getSchemaFacet()).append(",");
        if (getObjectAttributeList() != null)
            sb.append("ObjectAttributeList: ").append(getObjectAttributeList()).append(",");
        if (getObjectReference() != null)
            sb.append("ObjectReference: ").append(getObjectReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAddFacetToObject == false)
            return false;
        BatchAddFacetToObject other = (BatchAddFacetToObject) obj;
        if (other.getSchemaFacet() == null ^ this.getSchemaFacet() == null)
            return false;
        if (other.getSchemaFacet() != null && other.getSchemaFacet().equals(this.getSchemaFacet()) == false)
            return false;
        if (other.getObjectAttributeList() == null ^ this.getObjectAttributeList() == null)
            return false;
        if (other.getObjectAttributeList() != null && other.getObjectAttributeList().equals(this.getObjectAttributeList()) == false)
            return false;
        if (other.getObjectReference() == null ^ this.getObjectReference() == null)
            return false;
        if (other.getObjectReference() != null && other.getObjectReference().equals(this.getObjectReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaFacet() == null) ? 0 : getSchemaFacet().hashCode());
        hashCode = prime * hashCode + ((getObjectAttributeList() == null) ? 0 : getObjectAttributeList().hashCode());
        hashCode = prime * hashCode + ((getObjectReference() == null) ? 0 : getObjectReference().hashCode());
        return hashCode;
    }

    @Override
    public BatchAddFacetToObject clone() {
        try {
            return (BatchAddFacetToObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchAddFacetToObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
