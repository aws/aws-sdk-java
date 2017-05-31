/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Defines the typed links structure and its attributes. To create a typed link facet, use the
 * <a>CreateTypedLinkFacet</a> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/TypedLinkFacet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypedLinkFacet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique name of the typed link facet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An ordered set of attributes that are associate with the typed link. You can use typed link attributes when you
     * need to represent the relationship between two objects or allow for quick filtering of incoming or outgoing typed
     * links.
     * </p>
     */
    private java.util.List<TypedLinkAttributeDefinition> attributes;
    /**
     * <p>
     * A range filter that you provide for multiple attributes. The ability to filter typed links considers the order
     * that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any
     * inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to
     * match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the
     * order in which they are supplied to any API calls.
     * </p>
     */
    private java.util.List<String> identityAttributeOrder;

    /**
     * <p>
     * The unique name of the typed link facet.
     * </p>
     * 
     * @param name
     *        The unique name of the typed link facet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name of the typed link facet.
     * </p>
     * 
     * @return The unique name of the typed link facet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name of the typed link facet.
     * </p>
     * 
     * @param name
     *        The unique name of the typed link facet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedLinkFacet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An ordered set of attributes that are associate with the typed link. You can use typed link attributes when you
     * need to represent the relationship between two objects or allow for quick filtering of incoming or outgoing typed
     * links.
     * </p>
     * 
     * @return An ordered set of attributes that are associate with the typed link. You can use typed link attributes
     *         when you need to represent the relationship between two objects or allow for quick filtering of incoming
     *         or outgoing typed links.
     */

    public java.util.List<TypedLinkAttributeDefinition> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * An ordered set of attributes that are associate with the typed link. You can use typed link attributes when you
     * need to represent the relationship between two objects or allow for quick filtering of incoming or outgoing typed
     * links.
     * </p>
     * 
     * @param attributes
     *        An ordered set of attributes that are associate with the typed link. You can use typed link attributes
     *        when you need to represent the relationship between two objects or allow for quick filtering of incoming
     *        or outgoing typed links.
     */

    public void setAttributes(java.util.Collection<TypedLinkAttributeDefinition> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<TypedLinkAttributeDefinition>(attributes);
    }

    /**
     * <p>
     * An ordered set of attributes that are associate with the typed link. You can use typed link attributes when you
     * need to represent the relationship between two objects or allow for quick filtering of incoming or outgoing typed
     * links.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        An ordered set of attributes that are associate with the typed link. You can use typed link attributes
     *        when you need to represent the relationship between two objects or allow for quick filtering of incoming
     *        or outgoing typed links.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedLinkFacet withAttributes(TypedLinkAttributeDefinition... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<TypedLinkAttributeDefinition>(attributes.length));
        }
        for (TypedLinkAttributeDefinition ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An ordered set of attributes that are associate with the typed link. You can use typed link attributes when you
     * need to represent the relationship between two objects or allow for quick filtering of incoming or outgoing typed
     * links.
     * </p>
     * 
     * @param attributes
     *        An ordered set of attributes that are associate with the typed link. You can use typed link attributes
     *        when you need to represent the relationship between two objects or allow for quick filtering of incoming
     *        or outgoing typed links.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedLinkFacet withAttributes(java.util.Collection<TypedLinkAttributeDefinition> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * A range filter that you provide for multiple attributes. The ability to filter typed links considers the order
     * that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any
     * inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to
     * match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the
     * order in which they are supplied to any API calls.
     * </p>
     * 
     * @return A range filter that you provide for multiple attributes. The ability to filter typed links considers the
     *         order that the attributes are defined on the typed link facet. When providing ranges to typed link
     *         selection, any inexact ranges must be specified at the end. Any attributes that do not have a range
     *         specified are presumed to match the entire range. Filters are interpreted in the order of the attributes
     *         on the typed link facet, not the order in which they are supplied to any API calls.
     */

    public java.util.List<String> getIdentityAttributeOrder() {
        return identityAttributeOrder;
    }

    /**
     * <p>
     * A range filter that you provide for multiple attributes. The ability to filter typed links considers the order
     * that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any
     * inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to
     * match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the
     * order in which they are supplied to any API calls.
     * </p>
     * 
     * @param identityAttributeOrder
     *        A range filter that you provide for multiple attributes. The ability to filter typed links considers the
     *        order that the attributes are defined on the typed link facet. When providing ranges to typed link
     *        selection, any inexact ranges must be specified at the end. Any attributes that do not have a range
     *        specified are presumed to match the entire range. Filters are interpreted in the order of the attributes
     *        on the typed link facet, not the order in which they are supplied to any API calls.
     */

    public void setIdentityAttributeOrder(java.util.Collection<String> identityAttributeOrder) {
        if (identityAttributeOrder == null) {
            this.identityAttributeOrder = null;
            return;
        }

        this.identityAttributeOrder = new java.util.ArrayList<String>(identityAttributeOrder);
    }

    /**
     * <p>
     * A range filter that you provide for multiple attributes. The ability to filter typed links considers the order
     * that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any
     * inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to
     * match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the
     * order in which they are supplied to any API calls.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentityAttributeOrder(java.util.Collection)} or
     * {@link #withIdentityAttributeOrder(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param identityAttributeOrder
     *        A range filter that you provide for multiple attributes. The ability to filter typed links considers the
     *        order that the attributes are defined on the typed link facet. When providing ranges to typed link
     *        selection, any inexact ranges must be specified at the end. Any attributes that do not have a range
     *        specified are presumed to match the entire range. Filters are interpreted in the order of the attributes
     *        on the typed link facet, not the order in which they are supplied to any API calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedLinkFacet withIdentityAttributeOrder(String... identityAttributeOrder) {
        if (this.identityAttributeOrder == null) {
            setIdentityAttributeOrder(new java.util.ArrayList<String>(identityAttributeOrder.length));
        }
        for (String ele : identityAttributeOrder) {
            this.identityAttributeOrder.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A range filter that you provide for multiple attributes. The ability to filter typed links considers the order
     * that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any
     * inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to
     * match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the
     * order in which they are supplied to any API calls.
     * </p>
     * 
     * @param identityAttributeOrder
     *        A range filter that you provide for multiple attributes. The ability to filter typed links considers the
     *        order that the attributes are defined on the typed link facet. When providing ranges to typed link
     *        selection, any inexact ranges must be specified at the end. Any attributes that do not have a range
     *        specified are presumed to match the entire range. Filters are interpreted in the order of the attributes
     *        on the typed link facet, not the order in which they are supplied to any API calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedLinkFacet withIdentityAttributeOrder(java.util.Collection<String> identityAttributeOrder) {
        setIdentityAttributeOrder(identityAttributeOrder);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getIdentityAttributeOrder() != null)
            sb.append("IdentityAttributeOrder: ").append(getIdentityAttributeOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TypedLinkFacet == false)
            return false;
        TypedLinkFacet other = (TypedLinkFacet) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getIdentityAttributeOrder() == null ^ this.getIdentityAttributeOrder() == null)
            return false;
        if (other.getIdentityAttributeOrder() != null && other.getIdentityAttributeOrder().equals(this.getIdentityAttributeOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getIdentityAttributeOrder() == null) ? 0 : getIdentityAttributeOrder().hashCode());
        return hashCode;
    }

    @Override
    public TypedLinkFacet clone() {
        try {
            return (TypedLinkFacet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.TypedLinkFacetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
