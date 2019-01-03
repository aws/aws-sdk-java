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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpdateFacet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFacetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Facet</a>. For more information, see <a>arns</a>.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The name of the facet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * List of attributes that need to be updated in a given schema <a>Facet</a>. Each attribute is followed by
     * <code>AttributeAction</code>, which specifies the type of update operation to perform.
     * </p>
     */
    private java.util.List<FacetAttributeUpdate> attributeUpdates;
    /**
     * <p>
     * The object type that is associated with the facet. See <a>CreateFacetRequest$ObjectType</a> for more details.
     * </p>
     */
    private String objectType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Facet</a>. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Facet</a>. For more information, see
     *        <a>arns</a>.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Facet</a>. For more information, see <a>arns</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the <a>Facet</a>. For more information, see
     *         <a>arns</a>.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Facet</a>. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Facet</a>. For more information, see
     *        <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFacetRequest withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The name of the facet.
     * </p>
     * 
     * @param name
     *        The name of the facet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the facet.
     * </p>
     * 
     * @return The name of the facet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the facet.
     * </p>
     * 
     * @param name
     *        The name of the facet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFacetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * List of attributes that need to be updated in a given schema <a>Facet</a>. Each attribute is followed by
     * <code>AttributeAction</code>, which specifies the type of update operation to perform.
     * </p>
     * 
     * @return List of attributes that need to be updated in a given schema <a>Facet</a>. Each attribute is followed by
     *         <code>AttributeAction</code>, which specifies the type of update operation to perform.
     */

    public java.util.List<FacetAttributeUpdate> getAttributeUpdates() {
        return attributeUpdates;
    }

    /**
     * <p>
     * List of attributes that need to be updated in a given schema <a>Facet</a>. Each attribute is followed by
     * <code>AttributeAction</code>, which specifies the type of update operation to perform.
     * </p>
     * 
     * @param attributeUpdates
     *        List of attributes that need to be updated in a given schema <a>Facet</a>. Each attribute is followed by
     *        <code>AttributeAction</code>, which specifies the type of update operation to perform.
     */

    public void setAttributeUpdates(java.util.Collection<FacetAttributeUpdate> attributeUpdates) {
        if (attributeUpdates == null) {
            this.attributeUpdates = null;
            return;
        }

        this.attributeUpdates = new java.util.ArrayList<FacetAttributeUpdate>(attributeUpdates);
    }

    /**
     * <p>
     * List of attributes that need to be updated in a given schema <a>Facet</a>. Each attribute is followed by
     * <code>AttributeAction</code>, which specifies the type of update operation to perform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeUpdates(java.util.Collection)} or {@link #withAttributeUpdates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributeUpdates
     *        List of attributes that need to be updated in a given schema <a>Facet</a>. Each attribute is followed by
     *        <code>AttributeAction</code>, which specifies the type of update operation to perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFacetRequest withAttributeUpdates(FacetAttributeUpdate... attributeUpdates) {
        if (this.attributeUpdates == null) {
            setAttributeUpdates(new java.util.ArrayList<FacetAttributeUpdate>(attributeUpdates.length));
        }
        for (FacetAttributeUpdate ele : attributeUpdates) {
            this.attributeUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of attributes that need to be updated in a given schema <a>Facet</a>. Each attribute is followed by
     * <code>AttributeAction</code>, which specifies the type of update operation to perform.
     * </p>
     * 
     * @param attributeUpdates
     *        List of attributes that need to be updated in a given schema <a>Facet</a>. Each attribute is followed by
     *        <code>AttributeAction</code>, which specifies the type of update operation to perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFacetRequest withAttributeUpdates(java.util.Collection<FacetAttributeUpdate> attributeUpdates) {
        setAttributeUpdates(attributeUpdates);
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

    public UpdateFacetRequest withObjectType(String objectType) {
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

    public UpdateFacetRequest withObjectType(ObjectType objectType) {
        this.objectType = objectType.toString();
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
        if (getObjectType() != null)
            sb.append("ObjectType: ").append(getObjectType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFacetRequest == false)
            return false;
        UpdateFacetRequest other = (UpdateFacetRequest) obj;
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
        if (other.getObjectType() == null ^ this.getObjectType() == null)
            return false;
        if (other.getObjectType() != null && other.getObjectType().equals(this.getObjectType()) == false)
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
        hashCode = prime * hashCode + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFacetRequest clone() {
        return (UpdateFacetRequest) super.clone();
    }

}
