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
 * Contains all the information that is used to uniquely identify a typed link. The parameters discussed in this topic
 * are used to uniquely specify the typed link being operated on. The <a>AttachTypedLink</a> API returns a typed link
 * specifier while the <a>DetachTypedLink</a> API accepts one as input. Similarly, the <a>ListIncomingTypedLinks</a> and
 * <a>ListOutgoingTypedLinks</a> API operations provide typed link specifiers as output. You can also construct a typed
 * link specifier from scratch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/TypedLinkSpecifier" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypedLinkSpecifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the typed link facet that is associated with the typed link.
     * </p>
     */
    private TypedLinkSchemaAndFacetName typedLinkFacet;
    /**
     * <p>
     * Identifies the source object that the typed link will attach to.
     * </p>
     */
    private ObjectReference sourceObjectReference;
    /**
     * <p>
     * Identifies the target object that the typed link will attach to.
     * </p>
     */
    private ObjectReference targetObjectReference;
    /**
     * <p>
     * Identifies the attribute value to update.
     * </p>
     */
    private java.util.List<AttributeNameAndValue> identityAttributeValues;

    /**
     * <p>
     * Identifies the typed link facet that is associated with the typed link.
     * </p>
     * 
     * @param typedLinkFacet
     *        Identifies the typed link facet that is associated with the typed link.
     */

    public void setTypedLinkFacet(TypedLinkSchemaAndFacetName typedLinkFacet) {
        this.typedLinkFacet = typedLinkFacet;
    }

    /**
     * <p>
     * Identifies the typed link facet that is associated with the typed link.
     * </p>
     * 
     * @return Identifies the typed link facet that is associated with the typed link.
     */

    public TypedLinkSchemaAndFacetName getTypedLinkFacet() {
        return this.typedLinkFacet;
    }

    /**
     * <p>
     * Identifies the typed link facet that is associated with the typed link.
     * </p>
     * 
     * @param typedLinkFacet
     *        Identifies the typed link facet that is associated with the typed link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedLinkSpecifier withTypedLinkFacet(TypedLinkSchemaAndFacetName typedLinkFacet) {
        setTypedLinkFacet(typedLinkFacet);
        return this;
    }

    /**
     * <p>
     * Identifies the source object that the typed link will attach to.
     * </p>
     * 
     * @param sourceObjectReference
     *        Identifies the source object that the typed link will attach to.
     */

    public void setSourceObjectReference(ObjectReference sourceObjectReference) {
        this.sourceObjectReference = sourceObjectReference;
    }

    /**
     * <p>
     * Identifies the source object that the typed link will attach to.
     * </p>
     * 
     * @return Identifies the source object that the typed link will attach to.
     */

    public ObjectReference getSourceObjectReference() {
        return this.sourceObjectReference;
    }

    /**
     * <p>
     * Identifies the source object that the typed link will attach to.
     * </p>
     * 
     * @param sourceObjectReference
     *        Identifies the source object that the typed link will attach to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedLinkSpecifier withSourceObjectReference(ObjectReference sourceObjectReference) {
        setSourceObjectReference(sourceObjectReference);
        return this;
    }

    /**
     * <p>
     * Identifies the target object that the typed link will attach to.
     * </p>
     * 
     * @param targetObjectReference
     *        Identifies the target object that the typed link will attach to.
     */

    public void setTargetObjectReference(ObjectReference targetObjectReference) {
        this.targetObjectReference = targetObjectReference;
    }

    /**
     * <p>
     * Identifies the target object that the typed link will attach to.
     * </p>
     * 
     * @return Identifies the target object that the typed link will attach to.
     */

    public ObjectReference getTargetObjectReference() {
        return this.targetObjectReference;
    }

    /**
     * <p>
     * Identifies the target object that the typed link will attach to.
     * </p>
     * 
     * @param targetObjectReference
     *        Identifies the target object that the typed link will attach to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedLinkSpecifier withTargetObjectReference(ObjectReference targetObjectReference) {
        setTargetObjectReference(targetObjectReference);
        return this;
    }

    /**
     * <p>
     * Identifies the attribute value to update.
     * </p>
     * 
     * @return Identifies the attribute value to update.
     */

    public java.util.List<AttributeNameAndValue> getIdentityAttributeValues() {
        return identityAttributeValues;
    }

    /**
     * <p>
     * Identifies the attribute value to update.
     * </p>
     * 
     * @param identityAttributeValues
     *        Identifies the attribute value to update.
     */

    public void setIdentityAttributeValues(java.util.Collection<AttributeNameAndValue> identityAttributeValues) {
        if (identityAttributeValues == null) {
            this.identityAttributeValues = null;
            return;
        }

        this.identityAttributeValues = new java.util.ArrayList<AttributeNameAndValue>(identityAttributeValues);
    }

    /**
     * <p>
     * Identifies the attribute value to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentityAttributeValues(java.util.Collection)} or
     * {@link #withIdentityAttributeValues(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param identityAttributeValues
     *        Identifies the attribute value to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedLinkSpecifier withIdentityAttributeValues(AttributeNameAndValue... identityAttributeValues) {
        if (this.identityAttributeValues == null) {
            setIdentityAttributeValues(new java.util.ArrayList<AttributeNameAndValue>(identityAttributeValues.length));
        }
        for (AttributeNameAndValue ele : identityAttributeValues) {
            this.identityAttributeValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifies the attribute value to update.
     * </p>
     * 
     * @param identityAttributeValues
     *        Identifies the attribute value to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedLinkSpecifier withIdentityAttributeValues(java.util.Collection<AttributeNameAndValue> identityAttributeValues) {
        setIdentityAttributeValues(identityAttributeValues);
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
        if (getTypedLinkFacet() != null)
            sb.append("TypedLinkFacet: ").append(getTypedLinkFacet()).append(",");
        if (getSourceObjectReference() != null)
            sb.append("SourceObjectReference: ").append(getSourceObjectReference()).append(",");
        if (getTargetObjectReference() != null)
            sb.append("TargetObjectReference: ").append(getTargetObjectReference()).append(",");
        if (getIdentityAttributeValues() != null)
            sb.append("IdentityAttributeValues: ").append(getIdentityAttributeValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TypedLinkSpecifier == false)
            return false;
        TypedLinkSpecifier other = (TypedLinkSpecifier) obj;
        if (other.getTypedLinkFacet() == null ^ this.getTypedLinkFacet() == null)
            return false;
        if (other.getTypedLinkFacet() != null && other.getTypedLinkFacet().equals(this.getTypedLinkFacet()) == false)
            return false;
        if (other.getSourceObjectReference() == null ^ this.getSourceObjectReference() == null)
            return false;
        if (other.getSourceObjectReference() != null && other.getSourceObjectReference().equals(this.getSourceObjectReference()) == false)
            return false;
        if (other.getTargetObjectReference() == null ^ this.getTargetObjectReference() == null)
            return false;
        if (other.getTargetObjectReference() != null && other.getTargetObjectReference().equals(this.getTargetObjectReference()) == false)
            return false;
        if (other.getIdentityAttributeValues() == null ^ this.getIdentityAttributeValues() == null)
            return false;
        if (other.getIdentityAttributeValues() != null && other.getIdentityAttributeValues().equals(this.getIdentityAttributeValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypedLinkFacet() == null) ? 0 : getTypedLinkFacet().hashCode());
        hashCode = prime * hashCode + ((getSourceObjectReference() == null) ? 0 : getSourceObjectReference().hashCode());
        hashCode = prime * hashCode + ((getTargetObjectReference() == null) ? 0 : getTargetObjectReference().hashCode());
        hashCode = prime * hashCode + ((getIdentityAttributeValues() == null) ? 0 : getIdentityAttributeValues().hashCode());
        return hashCode;
    }

    @Override
    public TypedLinkSpecifier clone() {
        try {
            return (TypedLinkSpecifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.TypedLinkSpecifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
