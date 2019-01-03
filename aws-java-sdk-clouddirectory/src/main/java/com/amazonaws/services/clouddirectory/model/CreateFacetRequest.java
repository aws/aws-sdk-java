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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateFacet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFacetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The schema ARN in which the new <a>Facet</a> will be created. For more information, see <a>arns</a>.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The name of the <a>Facet</a>, which is unique for a given schema.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The attributes that are associated with the <a>Facet</a>.
     * </p>
     */
    private java.util.List<FacetAttribute> attributes;
    /**
     * <p>
     * Specifies whether a given object created from this facet is of type node, leaf node, policy or index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Node: Can have multiple children but one parent.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Leaf node: Cannot have children but can have multiple parents.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Policy: Allows you to store a policy document and policy type. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Index: Can be created with the Index API.
     * </p>
     * </li>
     * </ul>
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
     * The schema ARN in which the new <a>Facet</a> will be created. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param schemaArn
     *        The schema ARN in which the new <a>Facet</a> will be created. For more information, see <a>arns</a>.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The schema ARN in which the new <a>Facet</a> will be created. For more information, see <a>arns</a>.
     * </p>
     * 
     * @return The schema ARN in which the new <a>Facet</a> will be created. For more information, see <a>arns</a>.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The schema ARN in which the new <a>Facet</a> will be created. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param schemaArn
     *        The schema ARN in which the new <a>Facet</a> will be created. For more information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFacetRequest withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The name of the <a>Facet</a>, which is unique for a given schema.
     * </p>
     * 
     * @param name
     *        The name of the <a>Facet</a>, which is unique for a given schema.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <a>Facet</a>, which is unique for a given schema.
     * </p>
     * 
     * @return The name of the <a>Facet</a>, which is unique for a given schema.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <a>Facet</a>, which is unique for a given schema.
     * </p>
     * 
     * @param name
     *        The name of the <a>Facet</a>, which is unique for a given schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFacetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The attributes that are associated with the <a>Facet</a>.
     * </p>
     * 
     * @return The attributes that are associated with the <a>Facet</a>.
     */

    public java.util.List<FacetAttribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes that are associated with the <a>Facet</a>.
     * </p>
     * 
     * @param attributes
     *        The attributes that are associated with the <a>Facet</a>.
     */

    public void setAttributes(java.util.Collection<FacetAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<FacetAttribute>(attributes);
    }

    /**
     * <p>
     * The attributes that are associated with the <a>Facet</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The attributes that are associated with the <a>Facet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFacetRequest withAttributes(FacetAttribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<FacetAttribute>(attributes.length));
        }
        for (FacetAttribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes that are associated with the <a>Facet</a>.
     * </p>
     * 
     * @param attributes
     *        The attributes that are associated with the <a>Facet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFacetRequest withAttributes(java.util.Collection<FacetAttribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * Specifies whether a given object created from this facet is of type node, leaf node, policy or index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Node: Can have multiple children but one parent.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Leaf node: Cannot have children but can have multiple parents.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Policy: Allows you to store a policy document and policy type. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Index: Can be created with the Index API.
     * </p>
     * </li>
     * </ul>
     * 
     * @param objectType
     *        Specifies whether a given object created from this facet is of type node, leaf node, policy or index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Node: Can have multiple children but one parent.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Leaf node: Cannot have children but can have multiple parents.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Policy: Allows you to store a policy document and policy type. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     *        >Policies</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Index: Can be created with the Index API.
     *        </p>
     *        </li>
     * @see ObjectType
     */

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /**
     * <p>
     * Specifies whether a given object created from this facet is of type node, leaf node, policy or index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Node: Can have multiple children but one parent.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Leaf node: Cannot have children but can have multiple parents.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Policy: Allows you to store a policy document and policy type. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Index: Can be created with the Index API.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether a given object created from this facet is of type node, leaf node, policy or index.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Node: Can have multiple children but one parent.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         Leaf node: Cannot have children but can have multiple parents.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         Policy: Allows you to store a policy document and policy type. For more information, see <a href=
     *         "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     *         >Policies</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         Index: Can be created with the Index API.
     *         </p>
     *         </li>
     * @see ObjectType
     */

    public String getObjectType() {
        return this.objectType;
    }

    /**
     * <p>
     * Specifies whether a given object created from this facet is of type node, leaf node, policy or index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Node: Can have multiple children but one parent.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Leaf node: Cannot have children but can have multiple parents.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Policy: Allows you to store a policy document and policy type. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Index: Can be created with the Index API.
     * </p>
     * </li>
     * </ul>
     * 
     * @param objectType
     *        Specifies whether a given object created from this facet is of type node, leaf node, policy or index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Node: Can have multiple children but one parent.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Leaf node: Cannot have children but can have multiple parents.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Policy: Allows you to store a policy document and policy type. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     *        >Policies</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Index: Can be created with the Index API.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectType
     */

    public CreateFacetRequest withObjectType(String objectType) {
        setObjectType(objectType);
        return this;
    }

    /**
     * <p>
     * Specifies whether a given object created from this facet is of type node, leaf node, policy or index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Node: Can have multiple children but one parent.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Leaf node: Cannot have children but can have multiple parents.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Policy: Allows you to store a policy document and policy type. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Index: Can be created with the Index API.
     * </p>
     * </li>
     * </ul>
     * 
     * @param objectType
     *        Specifies whether a given object created from this facet is of type node, leaf node, policy or index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Node: Can have multiple children but one parent.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Leaf node: Cannot have children but can have multiple parents.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Policy: Allows you to store a policy document and policy type. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     *        >Policies</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Index: Can be created with the Index API.
     *        </p>
     *        </li>
     * @see ObjectType
     */

    public void setObjectType(ObjectType objectType) {
        withObjectType(objectType);
    }

    /**
     * <p>
     * Specifies whether a given object created from this facet is of type node, leaf node, policy or index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Node: Can have multiple children but one parent.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Leaf node: Cannot have children but can have multiple parents.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Policy: Allows you to store a policy document and policy type. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Index: Can be created with the Index API.
     * </p>
     * </li>
     * </ul>
     * 
     * @param objectType
     *        Specifies whether a given object created from this facet is of type node, leaf node, policy or index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Node: Can have multiple children but one parent.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Leaf node: Cannot have children but can have multiple parents.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Policy: Allows you to store a policy document and policy type. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     *        >Policies</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Index: Can be created with the Index API.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectType
     */

    public CreateFacetRequest withObjectType(ObjectType objectType) {
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

    public CreateFacetRequest withFacetStyle(String facetStyle) {
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

    public CreateFacetRequest withFacetStyle(FacetStyle facetStyle) {
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
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
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

        if (obj instanceof CreateFacetRequest == false)
            return false;
        CreateFacetRequest other = (CreateFacetRequest) obj;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
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

        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        hashCode = prime * hashCode + ((getFacetStyle() == null) ? 0 : getFacetStyle().hashCode());
        return hashCode;
    }

    @Override
    public CreateFacetRequest clone() {
        return (CreateFacetRequest) super.clone();
    }

}
