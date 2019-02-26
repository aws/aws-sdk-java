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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> in which the object will be created.
     * For more information, see <a>arns</a>.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * A list of schema facets to be associated with the object. Do not provide minor version components. See
     * <a>SchemaFacet</a> for details.
     * </p>
     */
    private java.util.List<SchemaFacet> schemaFacets;
    /**
     * <p>
     * The attribute map whose attribute ARN contains the key and attribute value as the map value.
     * </p>
     */
    private java.util.List<AttributeKeyAndValue> objectAttributeList;
    /**
     * <p>
     * If specified, the parent reference to which this object will be attached.
     * </p>
     */
    private ObjectReference parentReference;
    /**
     * <p>
     * The name of link that is used to attach this object to a parent.
     * </p>
     */
    private String linkName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> in which the object will be created.
     * For more information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> in which the object will be
     *        created. For more information, see <a>arns</a>.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> in which the object will be created.
     * For more information, see <a>arns</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> in which the object will be
     *         created. For more information, see <a>arns</a>.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> in which the object will be created.
     * For more information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> in which the object will be
     *        created. For more information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateObjectRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * A list of schema facets to be associated with the object. Do not provide minor version components. See
     * <a>SchemaFacet</a> for details.
     * </p>
     * 
     * @return A list of schema facets to be associated with the object. Do not provide minor version components. See
     *         <a>SchemaFacet</a> for details.
     */

    public java.util.List<SchemaFacet> getSchemaFacets() {
        return schemaFacets;
    }

    /**
     * <p>
     * A list of schema facets to be associated with the object. Do not provide minor version components. See
     * <a>SchemaFacet</a> for details.
     * </p>
     * 
     * @param schemaFacets
     *        A list of schema facets to be associated with the object. Do not provide minor version components. See
     *        <a>SchemaFacet</a> for details.
     */

    public void setSchemaFacets(java.util.Collection<SchemaFacet> schemaFacets) {
        if (schemaFacets == null) {
            this.schemaFacets = null;
            return;
        }

        this.schemaFacets = new java.util.ArrayList<SchemaFacet>(schemaFacets);
    }

    /**
     * <p>
     * A list of schema facets to be associated with the object. Do not provide minor version components. See
     * <a>SchemaFacet</a> for details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemaFacets(java.util.Collection)} or {@link #withSchemaFacets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param schemaFacets
     *        A list of schema facets to be associated with the object. Do not provide minor version components. See
     *        <a>SchemaFacet</a> for details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateObjectRequest withSchemaFacets(SchemaFacet... schemaFacets) {
        if (this.schemaFacets == null) {
            setSchemaFacets(new java.util.ArrayList<SchemaFacet>(schemaFacets.length));
        }
        for (SchemaFacet ele : schemaFacets) {
            this.schemaFacets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of schema facets to be associated with the object. Do not provide minor version components. See
     * <a>SchemaFacet</a> for details.
     * </p>
     * 
     * @param schemaFacets
     *        A list of schema facets to be associated with the object. Do not provide minor version components. See
     *        <a>SchemaFacet</a> for details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateObjectRequest withSchemaFacets(java.util.Collection<SchemaFacet> schemaFacets) {
        setSchemaFacets(schemaFacets);
        return this;
    }

    /**
     * <p>
     * The attribute map whose attribute ARN contains the key and attribute value as the map value.
     * </p>
     * 
     * @return The attribute map whose attribute ARN contains the key and attribute value as the map value.
     */

    public java.util.List<AttributeKeyAndValue> getObjectAttributeList() {
        return objectAttributeList;
    }

    /**
     * <p>
     * The attribute map whose attribute ARN contains the key and attribute value as the map value.
     * </p>
     * 
     * @param objectAttributeList
     *        The attribute map whose attribute ARN contains the key and attribute value as the map value.
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
     * The attribute map whose attribute ARN contains the key and attribute value as the map value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectAttributeList(java.util.Collection)} or {@link #withObjectAttributeList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param objectAttributeList
     *        The attribute map whose attribute ARN contains the key and attribute value as the map value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateObjectRequest withObjectAttributeList(AttributeKeyAndValue... objectAttributeList) {
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
     * The attribute map whose attribute ARN contains the key and attribute value as the map value.
     * </p>
     * 
     * @param objectAttributeList
     *        The attribute map whose attribute ARN contains the key and attribute value as the map value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateObjectRequest withObjectAttributeList(java.util.Collection<AttributeKeyAndValue> objectAttributeList) {
        setObjectAttributeList(objectAttributeList);
        return this;
    }

    /**
     * <p>
     * If specified, the parent reference to which this object will be attached.
     * </p>
     * 
     * @param parentReference
     *        If specified, the parent reference to which this object will be attached.
     */

    public void setParentReference(ObjectReference parentReference) {
        this.parentReference = parentReference;
    }

    /**
     * <p>
     * If specified, the parent reference to which this object will be attached.
     * </p>
     * 
     * @return If specified, the parent reference to which this object will be attached.
     */

    public ObjectReference getParentReference() {
        return this.parentReference;
    }

    /**
     * <p>
     * If specified, the parent reference to which this object will be attached.
     * </p>
     * 
     * @param parentReference
     *        If specified, the parent reference to which this object will be attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateObjectRequest withParentReference(ObjectReference parentReference) {
        setParentReference(parentReference);
        return this;
    }

    /**
     * <p>
     * The name of link that is used to attach this object to a parent.
     * </p>
     * 
     * @param linkName
     *        The name of link that is used to attach this object to a parent.
     */

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * <p>
     * The name of link that is used to attach this object to a parent.
     * </p>
     * 
     * @return The name of link that is used to attach this object to a parent.
     */

    public String getLinkName() {
        return this.linkName;
    }

    /**
     * <p>
     * The name of link that is used to attach this object to a parent.
     * </p>
     * 
     * @param linkName
     *        The name of link that is used to attach this object to a parent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateObjectRequest withLinkName(String linkName) {
        setLinkName(linkName);
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
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
        if (getSchemaFacets() != null)
            sb.append("SchemaFacets: ").append(getSchemaFacets()).append(",");
        if (getObjectAttributeList() != null)
            sb.append("ObjectAttributeList: ").append(getObjectAttributeList()).append(",");
        if (getParentReference() != null)
            sb.append("ParentReference: ").append(getParentReference()).append(",");
        if (getLinkName() != null)
            sb.append("LinkName: ").append(getLinkName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateObjectRequest == false)
            return false;
        CreateObjectRequest other = (CreateObjectRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getSchemaFacets() == null ^ this.getSchemaFacets() == null)
            return false;
        if (other.getSchemaFacets() != null && other.getSchemaFacets().equals(this.getSchemaFacets()) == false)
            return false;
        if (other.getObjectAttributeList() == null ^ this.getObjectAttributeList() == null)
            return false;
        if (other.getObjectAttributeList() != null && other.getObjectAttributeList().equals(this.getObjectAttributeList()) == false)
            return false;
        if (other.getParentReference() == null ^ this.getParentReference() == null)
            return false;
        if (other.getParentReference() != null && other.getParentReference().equals(this.getParentReference()) == false)
            return false;
        if (other.getLinkName() == null ^ this.getLinkName() == null)
            return false;
        if (other.getLinkName() != null && other.getLinkName().equals(this.getLinkName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaFacets() == null) ? 0 : getSchemaFacets().hashCode());
        hashCode = prime * hashCode + ((getObjectAttributeList() == null) ? 0 : getObjectAttributeList().hashCode());
        hashCode = prime * hashCode + ((getParentReference() == null) ? 0 : getParentReference().hashCode());
        hashCode = prime * hashCode + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        return hashCode;
    }

    @Override
    public CreateObjectRequest clone() {
        return (CreateObjectRequest) super.clone();
    }

}
