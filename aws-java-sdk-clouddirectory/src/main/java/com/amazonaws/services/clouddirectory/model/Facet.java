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
 * A structure that contains <code>Name</code>, <code>ARN</code>, <code>Attributes</code>, <code> <a>Rule</a>s</code>,
 * and <code>ObjectTypes</code>. See <a
 * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_whatarefacets.html">Facets</a> for
 * more information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/Facet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Facet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the <a>Facet</a>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The object type that is associated with the facet. See <a>CreateFacetRequest$ObjectType</a> for more details.
     * </p>
     */
    private String objectType;
    /**
     * <p>
     * There are two different styles that you can define on any given facet, <code>Static</code> and
     * <code>Dynamic</code>. For static facets, all attributes must be defined in the schema. For dynamic facets,
     * attributes can be defined during data plane operations.
     * </p>
     */
    private String facetStyle;

    /**
     * <p>
     * The name of the <a>Facet</a>.
     * </p>
     * 
     * @param name
     *        The name of the <a>Facet</a>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <a>Facet</a>.
     * </p>
     * 
     * @return The name of the <a>Facet</a>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <a>Facet</a>.
     * </p>
     * 
     * @param name
     *        The name of the <a>Facet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Facet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The object type that is associated with the facet. See <a>CreateFacetRequest$ObjectType</a> for more details.
     * </p>
     * 
     * @param objectType
     *        The object type that is associated with the facet. See <a>CreateFacetRequest$ObjectType</a> for more
     *        details.
     * @see ObjectType
     */

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /**
     * <p>
     * The object type that is associated with the facet. See <a>CreateFacetRequest$ObjectType</a> for more details.
     * </p>
     * 
     * @return The object type that is associated with the facet. See <a>CreateFacetRequest$ObjectType</a> for more
     *         details.
     * @see ObjectType
     */

    public String getObjectType() {
        return this.objectType;
    }

    /**
     * <p>
     * The object type that is associated with the facet. See <a>CreateFacetRequest$ObjectType</a> for more details.
     * </p>
     * 
     * @param objectType
     *        The object type that is associated with the facet. See <a>CreateFacetRequest$ObjectType</a> for more
     *        details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectType
     */

    public Facet withObjectType(String objectType) {
        setObjectType(objectType);
        return this;
    }

    /**
     * <p>
     * The object type that is associated with the facet. See <a>CreateFacetRequest$ObjectType</a> for more details.
     * </p>
     * 
     * @param objectType
     *        The object type that is associated with the facet. See <a>CreateFacetRequest$ObjectType</a> for more
     *        details.
     * @see ObjectType
     */

    public void setObjectType(ObjectType objectType) {
        withObjectType(objectType);
    }

    /**
     * <p>
     * The object type that is associated with the facet. See <a>CreateFacetRequest$ObjectType</a> for more details.
     * </p>
     * 
     * @param objectType
     *        The object type that is associated with the facet. See <a>CreateFacetRequest$ObjectType</a> for more
     *        details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectType
     */

    public Facet withObjectType(ObjectType objectType) {
        this.objectType = objectType.toString();
        return this;
    }

    /**
     * <p>
     * There are two different styles that you can define on any given facet, <code>Static</code> and
     * <code>Dynamic</code>. For static facets, all attributes must be defined in the schema. For dynamic facets,
     * attributes can be defined during data plane operations.
     * </p>
     * 
     * @param facetStyle
     *        There are two different styles that you can define on any given facet, <code>Static</code> and
     *        <code>Dynamic</code>. For static facets, all attributes must be defined in the schema. For dynamic facets,
     *        attributes can be defined during data plane operations.
     * @see FacetStyle
     */

    public void setFacetStyle(String facetStyle) {
        this.facetStyle = facetStyle;
    }

    /**
     * <p>
     * There are two different styles that you can define on any given facet, <code>Static</code> and
     * <code>Dynamic</code>. For static facets, all attributes must be defined in the schema. For dynamic facets,
     * attributes can be defined during data plane operations.
     * </p>
     * 
     * @return There are two different styles that you can define on any given facet, <code>Static</code> and
     *         <code>Dynamic</code>. For static facets, all attributes must be defined in the schema. For dynamic
     *         facets, attributes can be defined during data plane operations.
     * @see FacetStyle
     */

    public String getFacetStyle() {
        return this.facetStyle;
    }

    /**
     * <p>
     * There are two different styles that you can define on any given facet, <code>Static</code> and
     * <code>Dynamic</code>. For static facets, all attributes must be defined in the schema. For dynamic facets,
     * attributes can be defined during data plane operations.
     * </p>
     * 
     * @param facetStyle
     *        There are two different styles that you can define on any given facet, <code>Static</code> and
     *        <code>Dynamic</code>. For static facets, all attributes must be defined in the schema. For dynamic facets,
     *        attributes can be defined during data plane operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FacetStyle
     */

    public Facet withFacetStyle(String facetStyle) {
        setFacetStyle(facetStyle);
        return this;
    }

    /**
     * <p>
     * There are two different styles that you can define on any given facet, <code>Static</code> and
     * <code>Dynamic</code>. For static facets, all attributes must be defined in the schema. For dynamic facets,
     * attributes can be defined during data plane operations.
     * </p>
     * 
     * @param facetStyle
     *        There are two different styles that you can define on any given facet, <code>Static</code> and
     *        <code>Dynamic</code>. For static facets, all attributes must be defined in the schema. For dynamic facets,
     *        attributes can be defined during data plane operations.
     * @see FacetStyle
     */

    public void setFacetStyle(FacetStyle facetStyle) {
        withFacetStyle(facetStyle);
    }

    /**
     * <p>
     * There are two different styles that you can define on any given facet, <code>Static</code> and
     * <code>Dynamic</code>. For static facets, all attributes must be defined in the schema. For dynamic facets,
     * attributes can be defined during data plane operations.
     * </p>
     * 
     * @param facetStyle
     *        There are two different styles that you can define on any given facet, <code>Static</code> and
     *        <code>Dynamic</code>. For static facets, all attributes must be defined in the schema. For dynamic facets,
     *        attributes can be defined during data plane operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FacetStyle
     */

    public Facet withFacetStyle(FacetStyle facetStyle) {
        this.facetStyle = facetStyle.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getObjectType() != null)
            sb.append("ObjectType: ").append(getObjectType()).append(",");
        if (getFacetStyle() != null)
            sb.append("FacetStyle: ").append(getFacetStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Facet == false)
            return false;
        Facet other = (Facet) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getObjectType() == null ^ this.getObjectType() == null)
            return false;
        if (other.getObjectType() != null && other.getObjectType().equals(this.getObjectType()) == false)
            return false;
        if (other.getFacetStyle() == null ^ this.getFacetStyle() == null)
            return false;
        if (other.getFacetStyle() != null && other.getFacetStyle().equals(this.getFacetStyle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        hashCode = prime * hashCode + ((getFacetStyle() == null) ? 0 : getFacetStyle().hashCode());
        return hashCode;
    }

    @Override
    public Facet clone() {
        try {
            return (Facet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.FacetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
