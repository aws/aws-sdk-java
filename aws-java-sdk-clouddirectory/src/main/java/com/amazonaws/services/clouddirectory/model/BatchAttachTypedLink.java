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
 * Attaches a typed link to a specified source and target object inside a <a>BatchRead</a> operation. For more
 * information, see <a>AttachTypedLink</a> and <a>BatchReadRequest$Operations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchAttachTypedLink"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAttachTypedLink implements Serializable, Cloneable, StructuredPojo {

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
     * Identifies the typed link facet that is associated with the typed link.
     * </p>
     */
    private TypedLinkSchemaAndFacetName typedLinkFacet;
    /**
     * <p>
     * A set of attributes that are associated with the typed link.
     * </p>
     */
    private java.util.List<AttributeNameAndValue> attributes;

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

    public BatchAttachTypedLink withSourceObjectReference(ObjectReference sourceObjectReference) {
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

    public BatchAttachTypedLink withTargetObjectReference(ObjectReference targetObjectReference) {
        setTargetObjectReference(targetObjectReference);
        return this;
    }

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

    public BatchAttachTypedLink withTypedLinkFacet(TypedLinkSchemaAndFacetName typedLinkFacet) {
        setTypedLinkFacet(typedLinkFacet);
        return this;
    }

    /**
     * <p>
     * A set of attributes that are associated with the typed link.
     * </p>
     * 
     * @return A set of attributes that are associated with the typed link.
     */

    public java.util.List<AttributeNameAndValue> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A set of attributes that are associated with the typed link.
     * </p>
     * 
     * @param attributes
     *        A set of attributes that are associated with the typed link.
     */

    public void setAttributes(java.util.Collection<AttributeNameAndValue> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<AttributeNameAndValue>(attributes);
    }

    /**
     * <p>
     * A set of attributes that are associated with the typed link.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        A set of attributes that are associated with the typed link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAttachTypedLink withAttributes(AttributeNameAndValue... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<AttributeNameAndValue>(attributes.length));
        }
        for (AttributeNameAndValue ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of attributes that are associated with the typed link.
     * </p>
     * 
     * @param attributes
     *        A set of attributes that are associated with the typed link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAttachTypedLink withAttributes(java.util.Collection<AttributeNameAndValue> attributes) {
        setAttributes(attributes);
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
        if (getSourceObjectReference() != null)
            sb.append("SourceObjectReference: ").append(getSourceObjectReference()).append(",");
        if (getTargetObjectReference() != null)
            sb.append("TargetObjectReference: ").append(getTargetObjectReference()).append(",");
        if (getTypedLinkFacet() != null)
            sb.append("TypedLinkFacet: ").append(getTypedLinkFacet()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAttachTypedLink == false)
            return false;
        BatchAttachTypedLink other = (BatchAttachTypedLink) obj;
        if (other.getSourceObjectReference() == null ^ this.getSourceObjectReference() == null)
            return false;
        if (other.getSourceObjectReference() != null && other.getSourceObjectReference().equals(this.getSourceObjectReference()) == false)
            return false;
        if (other.getTargetObjectReference() == null ^ this.getTargetObjectReference() == null)
            return false;
        if (other.getTargetObjectReference() != null && other.getTargetObjectReference().equals(this.getTargetObjectReference()) == false)
            return false;
        if (other.getTypedLinkFacet() == null ^ this.getTypedLinkFacet() == null)
            return false;
        if (other.getTypedLinkFacet() != null && other.getTypedLinkFacet().equals(this.getTypedLinkFacet()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceObjectReference() == null) ? 0 : getSourceObjectReference().hashCode());
        hashCode = prime * hashCode + ((getTargetObjectReference() == null) ? 0 : getTargetObjectReference().hashCode());
        hashCode = prime * hashCode + ((getTypedLinkFacet() == null) ? 0 : getTypedLinkFacet().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public BatchAttachTypedLink clone() {
        try {
            return (BatchAttachTypedLink) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchAttachTypedLinkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
