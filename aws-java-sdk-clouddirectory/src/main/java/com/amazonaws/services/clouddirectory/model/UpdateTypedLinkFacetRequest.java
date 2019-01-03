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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpdateTypedLinkFacet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTypedLinkFacetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The unique name of the typed link facet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Attributes update structure.
     * </p>
     */
    private java.util.List<TypedLinkFacetAttributeUpdate> attributeUpdates;
    /**
     * <p>
     * The order of identity attributes for the facet, from most significant to least significant. The ability to filter
     * typed links considers the order that the attributes are defined on the typed link facet. When providing ranges to
     * a typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range
     * specified are presumed to match the entire range. Filters are interpreted in the order of the attributes on the
     * typed link facet, not the order in which they are supplied to any API calls. For more information about identity
     * attributes, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     */
    private java.util.List<String> identityAttributeOrder;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTypedLinkFacetRequest withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

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

    public UpdateTypedLinkFacetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Attributes update structure.
     * </p>
     * 
     * @return Attributes update structure.
     */

    public java.util.List<TypedLinkFacetAttributeUpdate> getAttributeUpdates() {
        return attributeUpdates;
    }

    /**
     * <p>
     * Attributes update structure.
     * </p>
     * 
     * @param attributeUpdates
     *        Attributes update structure.
     */

    public void setAttributeUpdates(java.util.Collection<TypedLinkFacetAttributeUpdate> attributeUpdates) {
        if (attributeUpdates == null) {
            this.attributeUpdates = null;
            return;
        }

        this.attributeUpdates = new java.util.ArrayList<TypedLinkFacetAttributeUpdate>(attributeUpdates);
    }

    /**
     * <p>
     * Attributes update structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeUpdates(java.util.Collection)} or {@link #withAttributeUpdates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributeUpdates
     *        Attributes update structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTypedLinkFacetRequest withAttributeUpdates(TypedLinkFacetAttributeUpdate... attributeUpdates) {
        if (this.attributeUpdates == null) {
            setAttributeUpdates(new java.util.ArrayList<TypedLinkFacetAttributeUpdate>(attributeUpdates.length));
        }
        for (TypedLinkFacetAttributeUpdate ele : attributeUpdates) {
            this.attributeUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Attributes update structure.
     * </p>
     * 
     * @param attributeUpdates
     *        Attributes update structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTypedLinkFacetRequest withAttributeUpdates(java.util.Collection<TypedLinkFacetAttributeUpdate> attributeUpdates) {
        setAttributeUpdates(attributeUpdates);
        return this;
    }

    /**
     * <p>
     * The order of identity attributes for the facet, from most significant to least significant. The ability to filter
     * typed links considers the order that the attributes are defined on the typed link facet. When providing ranges to
     * a typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range
     * specified are presumed to match the entire range. Filters are interpreted in the order of the attributes on the
     * typed link facet, not the order in which they are supplied to any API calls. For more information about identity
     * attributes, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @return The order of identity attributes for the facet, from most significant to least significant. The ability
     *         to filter typed links considers the order that the attributes are defined on the typed link facet. When
     *         providing ranges to a typed link selection, any inexact ranges must be specified at the end. Any
     *         attributes that do not have a range specified are presumed to match the entire range. Filters are
     *         interpreted in the order of the attributes on the typed link facet, not the order in which they are
     *         supplied to any API calls. For more information about identity attributes, see <a href=
     *         "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *         >Typed Links</a>.
     */

    public java.util.List<String> getIdentityAttributeOrder() {
        return identityAttributeOrder;
    }

    /**
     * <p>
     * The order of identity attributes for the facet, from most significant to least significant. The ability to filter
     * typed links considers the order that the attributes are defined on the typed link facet. When providing ranges to
     * a typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range
     * specified are presumed to match the entire range. Filters are interpreted in the order of the attributes on the
     * typed link facet, not the order in which they are supplied to any API calls. For more information about identity
     * attributes, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param identityAttributeOrder
     *        The order of identity attributes for the facet, from most significant to least significant. The ability to
     *        filter typed links considers the order that the attributes are defined on the typed link facet. When
     *        providing ranges to a typed link selection, any inexact ranges must be specified at the end. Any
     *        attributes that do not have a range specified are presumed to match the entire range. Filters are
     *        interpreted in the order of the attributes on the typed link facet, not the order in which they are
     *        supplied to any API calls. For more information about identity attributes, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
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
     * The order of identity attributes for the facet, from most significant to least significant. The ability to filter
     * typed links considers the order that the attributes are defined on the typed link facet. When providing ranges to
     * a typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range
     * specified are presumed to match the entire range. Filters are interpreted in the order of the attributes on the
     * typed link facet, not the order in which they are supplied to any API calls. For more information about identity
     * attributes, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentityAttributeOrder(java.util.Collection)} or
     * {@link #withIdentityAttributeOrder(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param identityAttributeOrder
     *        The order of identity attributes for the facet, from most significant to least significant. The ability to
     *        filter typed links considers the order that the attributes are defined on the typed link facet. When
     *        providing ranges to a typed link selection, any inexact ranges must be specified at the end. Any
     *        attributes that do not have a range specified are presumed to match the entire range. Filters are
     *        interpreted in the order of the attributes on the typed link facet, not the order in which they are
     *        supplied to any API calls. For more information about identity attributes, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTypedLinkFacetRequest withIdentityAttributeOrder(String... identityAttributeOrder) {
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
     * The order of identity attributes for the facet, from most significant to least significant. The ability to filter
     * typed links considers the order that the attributes are defined on the typed link facet. When providing ranges to
     * a typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range
     * specified are presumed to match the entire range. Filters are interpreted in the order of the attributes on the
     * typed link facet, not the order in which they are supplied to any API calls. For more information about identity
     * attributes, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param identityAttributeOrder
     *        The order of identity attributes for the facet, from most significant to least significant. The ability to
     *        filter typed links considers the order that the attributes are defined on the typed link facet. When
     *        providing ranges to a typed link selection, any inexact ranges must be specified at the end. Any
     *        attributes that do not have a range specified are presumed to match the entire range. Filters are
     *        interpreted in the order of the attributes on the typed link facet, not the order in which they are
     *        supplied to any API calls. For more information about identity attributes, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTypedLinkFacetRequest withIdentityAttributeOrder(java.util.Collection<String> identityAttributeOrder) {
        setIdentityAttributeOrder(identityAttributeOrder);
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
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAttributeUpdates() != null)
            sb.append("AttributeUpdates: ").append(getAttributeUpdates()).append(",");
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

        if (obj instanceof UpdateTypedLinkFacetRequest == false)
            return false;
        UpdateTypedLinkFacetRequest other = (UpdateTypedLinkFacetRequest) obj;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttributeUpdates() == null ^ this.getAttributeUpdates() == null)
            return false;
        if (other.getAttributeUpdates() != null && other.getAttributeUpdates().equals(this.getAttributeUpdates()) == false)
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

        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttributeUpdates() == null) ? 0 : getAttributeUpdates().hashCode());
        hashCode = prime * hashCode + ((getIdentityAttributeOrder() == null) ? 0 : getIdentityAttributeOrder().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTypedLinkFacetRequest clone() {
        return (UpdateTypedLinkFacetRequest) super.clone();
    }

}
