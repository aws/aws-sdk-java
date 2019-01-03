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
 * Updates a given typed link’s attributes inside a <a>BatchRead</a> operation. Attributes to be updated must not
 * contribute to the typed link’s identity, as defined by its <code>IdentityAttributeOrder</code>. For more information,
 * see <a>UpdateLinkAttributes</a> and <a>BatchReadRequest$Operations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchUpdateLinkAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateLinkAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allows a typed link specifier to be accepted as input.
     * </p>
     */
    private TypedLinkSpecifier typedLinkSpecifier;
    /**
     * <p>
     * The attributes update structure.
     * </p>
     */
    private java.util.List<LinkAttributeUpdate> attributeUpdates;

    /**
     * <p>
     * Allows a typed link specifier to be accepted as input.
     * </p>
     * 
     * @param typedLinkSpecifier
     *        Allows a typed link specifier to be accepted as input.
     */

    public void setTypedLinkSpecifier(TypedLinkSpecifier typedLinkSpecifier) {
        this.typedLinkSpecifier = typedLinkSpecifier;
    }

    /**
     * <p>
     * Allows a typed link specifier to be accepted as input.
     * </p>
     * 
     * @return Allows a typed link specifier to be accepted as input.
     */

    public TypedLinkSpecifier getTypedLinkSpecifier() {
        return this.typedLinkSpecifier;
    }

    /**
     * <p>
     * Allows a typed link specifier to be accepted as input.
     * </p>
     * 
     * @param typedLinkSpecifier
     *        Allows a typed link specifier to be accepted as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateLinkAttributes withTypedLinkSpecifier(TypedLinkSpecifier typedLinkSpecifier) {
        setTypedLinkSpecifier(typedLinkSpecifier);
        return this;
    }

    /**
     * <p>
     * The attributes update structure.
     * </p>
     * 
     * @return The attributes update structure.
     */

    public java.util.List<LinkAttributeUpdate> getAttributeUpdates() {
        return attributeUpdates;
    }

    /**
     * <p>
     * The attributes update structure.
     * </p>
     * 
     * @param attributeUpdates
     *        The attributes update structure.
     */

    public void setAttributeUpdates(java.util.Collection<LinkAttributeUpdate> attributeUpdates) {
        if (attributeUpdates == null) {
            this.attributeUpdates = null;
            return;
        }

        this.attributeUpdates = new java.util.ArrayList<LinkAttributeUpdate>(attributeUpdates);
    }

    /**
     * <p>
     * The attributes update structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeUpdates(java.util.Collection)} or {@link #withAttributeUpdates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributeUpdates
     *        The attributes update structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateLinkAttributes withAttributeUpdates(LinkAttributeUpdate... attributeUpdates) {
        if (this.attributeUpdates == null) {
            setAttributeUpdates(new java.util.ArrayList<LinkAttributeUpdate>(attributeUpdates.length));
        }
        for (LinkAttributeUpdate ele : attributeUpdates) {
            this.attributeUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes update structure.
     * </p>
     * 
     * @param attributeUpdates
     *        The attributes update structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateLinkAttributes withAttributeUpdates(java.util.Collection<LinkAttributeUpdate> attributeUpdates) {
        setAttributeUpdates(attributeUpdates);
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
        if (getTypedLinkSpecifier() != null)
            sb.append("TypedLinkSpecifier: ").append(getTypedLinkSpecifier()).append(",");
        if (getAttributeUpdates() != null)
            sb.append("AttributeUpdates: ").append(getAttributeUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateLinkAttributes == false)
            return false;
        BatchUpdateLinkAttributes other = (BatchUpdateLinkAttributes) obj;
        if (other.getTypedLinkSpecifier() == null ^ this.getTypedLinkSpecifier() == null)
            return false;
        if (other.getTypedLinkSpecifier() != null && other.getTypedLinkSpecifier().equals(this.getTypedLinkSpecifier()) == false)
            return false;
        if (other.getAttributeUpdates() == null ^ this.getAttributeUpdates() == null)
            return false;
        if (other.getAttributeUpdates() != null && other.getAttributeUpdates().equals(this.getAttributeUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypedLinkSpecifier() == null) ? 0 : getTypedLinkSpecifier().hashCode());
        hashCode = prime * hashCode + ((getAttributeUpdates() == null) ? 0 : getAttributeUpdates().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateLinkAttributes clone() {
        try {
            return (BatchUpdateLinkAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchUpdateLinkAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
