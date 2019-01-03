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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the directory where the index should be created.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
     * </p>
     */
    private java.util.List<AttributeKey> orderedIndexedAttributeList;
    /**
     * <p>
     * Indicates whether the attribute that is being indexed has unique values or not.
     * </p>
     */
    private Boolean isUnique;
    /**
     * <p>
     * A reference to the parent object that contains the index object.
     * </p>
     */
    private ObjectReference parentReference;
    /**
     * <p>
     * The name of the link between the parent object and the index object.
     * </p>
     */
    private String linkName;

    /**
     * <p>
     * The ARN of the directory where the index should be created.
     * </p>
     * 
     * @param directoryArn
     *        The ARN of the directory where the index should be created.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The ARN of the directory where the index should be created.
     * </p>
     * 
     * @return The ARN of the directory where the index should be created.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The ARN of the directory where the index should be created.
     * </p>
     * 
     * @param directoryArn
     *        The ARN of the directory where the index should be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
     * </p>
     * 
     * @return Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
     */

    public java.util.List<AttributeKey> getOrderedIndexedAttributeList() {
        return orderedIndexedAttributeList;
    }

    /**
     * <p>
     * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
     * </p>
     * 
     * @param orderedIndexedAttributeList
     *        Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
     */

    public void setOrderedIndexedAttributeList(java.util.Collection<AttributeKey> orderedIndexedAttributeList) {
        if (orderedIndexedAttributeList == null) {
            this.orderedIndexedAttributeList = null;
            return;
        }

        this.orderedIndexedAttributeList = new java.util.ArrayList<AttributeKey>(orderedIndexedAttributeList);
    }

    /**
     * <p>
     * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrderedIndexedAttributeList(java.util.Collection)} or
     * {@link #withOrderedIndexedAttributeList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param orderedIndexedAttributeList
     *        Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withOrderedIndexedAttributeList(AttributeKey... orderedIndexedAttributeList) {
        if (this.orderedIndexedAttributeList == null) {
            setOrderedIndexedAttributeList(new java.util.ArrayList<AttributeKey>(orderedIndexedAttributeList.length));
        }
        for (AttributeKey ele : orderedIndexedAttributeList) {
            this.orderedIndexedAttributeList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
     * </p>
     * 
     * @param orderedIndexedAttributeList
     *        Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withOrderedIndexedAttributeList(java.util.Collection<AttributeKey> orderedIndexedAttributeList) {
        setOrderedIndexedAttributeList(orderedIndexedAttributeList);
        return this;
    }

    /**
     * <p>
     * Indicates whether the attribute that is being indexed has unique values or not.
     * </p>
     * 
     * @param isUnique
     *        Indicates whether the attribute that is being indexed has unique values or not.
     */

    public void setIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
    }

    /**
     * <p>
     * Indicates whether the attribute that is being indexed has unique values or not.
     * </p>
     * 
     * @return Indicates whether the attribute that is being indexed has unique values or not.
     */

    public Boolean getIsUnique() {
        return this.isUnique;
    }

    /**
     * <p>
     * Indicates whether the attribute that is being indexed has unique values or not.
     * </p>
     * 
     * @param isUnique
     *        Indicates whether the attribute that is being indexed has unique values or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withIsUnique(Boolean isUnique) {
        setIsUnique(isUnique);
        return this;
    }

    /**
     * <p>
     * Indicates whether the attribute that is being indexed has unique values or not.
     * </p>
     * 
     * @return Indicates whether the attribute that is being indexed has unique values or not.
     */

    public Boolean isUnique() {
        return this.isUnique;
    }

    /**
     * <p>
     * A reference to the parent object that contains the index object.
     * </p>
     * 
     * @param parentReference
     *        A reference to the parent object that contains the index object.
     */

    public void setParentReference(ObjectReference parentReference) {
        this.parentReference = parentReference;
    }

    /**
     * <p>
     * A reference to the parent object that contains the index object.
     * </p>
     * 
     * @return A reference to the parent object that contains the index object.
     */

    public ObjectReference getParentReference() {
        return this.parentReference;
    }

    /**
     * <p>
     * A reference to the parent object that contains the index object.
     * </p>
     * 
     * @param parentReference
     *        A reference to the parent object that contains the index object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withParentReference(ObjectReference parentReference) {
        setParentReference(parentReference);
        return this;
    }

    /**
     * <p>
     * The name of the link between the parent object and the index object.
     * </p>
     * 
     * @param linkName
     *        The name of the link between the parent object and the index object.
     */

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * <p>
     * The name of the link between the parent object and the index object.
     * </p>
     * 
     * @return The name of the link between the parent object and the index object.
     */

    public String getLinkName() {
        return this.linkName;
    }

    /**
     * <p>
     * The name of the link between the parent object and the index object.
     * </p>
     * 
     * @param linkName
     *        The name of the link between the parent object and the index object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withLinkName(String linkName) {
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
        if (getOrderedIndexedAttributeList() != null)
            sb.append("OrderedIndexedAttributeList: ").append(getOrderedIndexedAttributeList()).append(",");
        if (getIsUnique() != null)
            sb.append("IsUnique: ").append(getIsUnique()).append(",");
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

        if (obj instanceof CreateIndexRequest == false)
            return false;
        CreateIndexRequest other = (CreateIndexRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getOrderedIndexedAttributeList() == null ^ this.getOrderedIndexedAttributeList() == null)
            return false;
        if (other.getOrderedIndexedAttributeList() != null && other.getOrderedIndexedAttributeList().equals(this.getOrderedIndexedAttributeList()) == false)
            return false;
        if (other.getIsUnique() == null ^ this.getIsUnique() == null)
            return false;
        if (other.getIsUnique() != null && other.getIsUnique().equals(this.getIsUnique()) == false)
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
        hashCode = prime * hashCode + ((getOrderedIndexedAttributeList() == null) ? 0 : getOrderedIndexedAttributeList().hashCode());
        hashCode = prime * hashCode + ((getIsUnique() == null) ? 0 : getIsUnique().hashCode());
        hashCode = prime * hashCode + ((getParentReference() == null) ? 0 : getParentReference().hashCode());
        hashCode = prime * hashCode + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        return hashCode;
    }

    @Override
    public CreateIndexRequest clone() {
        return (CreateIndexRequest) super.clone();
    }

}
