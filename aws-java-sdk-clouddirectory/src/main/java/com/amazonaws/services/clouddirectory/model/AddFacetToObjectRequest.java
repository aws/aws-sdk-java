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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AddFacetToObject" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddFacetToObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For more
     * information, see <a>arns</a>.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * Identifiers for the facet that you are adding to the object. See <a>SchemaFacet</a> for details.
     * </p>
     */
    private SchemaFacet schemaFacet;
    /**
     * <p>
     * Attributes on the facet that you are adding to the object.
     * </p>
     */
    private java.util.List<AttributeKeyAndValue> objectAttributeList;
    /**
     * <p>
     * A reference to the object you are adding the specified facet to.
     * </p>
     */
    private ObjectReference objectReference;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For
     *        more information, see <a>arns</a>.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For
     *         more information, see <a>arns</a>.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For
     *        more information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFacetToObjectRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * Identifiers for the facet that you are adding to the object. See <a>SchemaFacet</a> for details.
     * </p>
     * 
     * @param schemaFacet
     *        Identifiers for the facet that you are adding to the object. See <a>SchemaFacet</a> for details.
     */

    public void setSchemaFacet(SchemaFacet schemaFacet) {
        this.schemaFacet = schemaFacet;
    }

    /**
     * <p>
     * Identifiers for the facet that you are adding to the object. See <a>SchemaFacet</a> for details.
     * </p>
     * 
     * @return Identifiers for the facet that you are adding to the object. See <a>SchemaFacet</a> for details.
     */

    public SchemaFacet getSchemaFacet() {
        return this.schemaFacet;
    }

    /**
     * <p>
     * Identifiers for the facet that you are adding to the object. See <a>SchemaFacet</a> for details.
     * </p>
     * 
     * @param schemaFacet
     *        Identifiers for the facet that you are adding to the object. See <a>SchemaFacet</a> for details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFacetToObjectRequest withSchemaFacet(SchemaFacet schemaFacet) {
        setSchemaFacet(schemaFacet);
        return this;
    }

    /**
     * <p>
     * Attributes on the facet that you are adding to the object.
     * </p>
     * 
     * @return Attributes on the facet that you are adding to the object.
     */

    public java.util.List<AttributeKeyAndValue> getObjectAttributeList() {
        return objectAttributeList;
    }

    /**
     * <p>
     * Attributes on the facet that you are adding to the object.
     * </p>
     * 
     * @param objectAttributeList
     *        Attributes on the facet that you are adding to the object.
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
     * Attributes on the facet that you are adding to the object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectAttributeList(java.util.Collection)} or {@link #withObjectAttributeList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param objectAttributeList
     *        Attributes on the facet that you are adding to the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFacetToObjectRequest withObjectAttributeList(AttributeKeyAndValue... objectAttributeList) {
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
     * Attributes on the facet that you are adding to the object.
     * </p>
     * 
     * @param objectAttributeList
     *        Attributes on the facet that you are adding to the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFacetToObjectRequest withObjectAttributeList(java.util.Collection<AttributeKeyAndValue> objectAttributeList) {
        setObjectAttributeList(objectAttributeList);
        return this;
    }

    /**
     * <p>
     * A reference to the object you are adding the specified facet to.
     * </p>
     * 
     * @param objectReference
     *        A reference to the object you are adding the specified facet to.
     */

    public void setObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    /**
     * <p>
     * A reference to the object you are adding the specified facet to.
     * </p>
     * 
     * @return A reference to the object you are adding the specified facet to.
     */

    public ObjectReference getObjectReference() {
        return this.objectReference;
    }

    /**
     * <p>
     * A reference to the object you are adding the specified facet to.
     * </p>
     * 
     * @param objectReference
     *        A reference to the object you are adding the specified facet to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFacetToObjectRequest withObjectReference(ObjectReference objectReference) {
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
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
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

        if (obj instanceof AddFacetToObjectRequest == false)
            return false;
        AddFacetToObjectRequest other = (AddFacetToObjectRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaFacet() == null) ? 0 : getSchemaFacet().hashCode());
        hashCode = prime * hashCode + ((getObjectAttributeList() == null) ? 0 : getObjectAttributeList().hashCode());
        hashCode = prime * hashCode + ((getObjectReference() == null) ? 0 : getObjectReference().hashCode());
        return hashCode;
    }

    @Override
    public AddFacetToObjectRequest clone() {
        return (AddFacetToObjectRequest) super.clone();
    }

}
