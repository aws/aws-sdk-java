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
 * Creates an index object inside of a <a>BatchRead</a> operation. For more information, see <a>CreateIndex</a> and
 * <a>BatchReadRequest$Operations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchCreateIndex" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateIndex implements Serializable, Cloneable, StructuredPojo {

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
     * The batch reference name. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html">Transaction
     * Support</a> for more information.
     * </p>
     */
    private String batchReferenceName;

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

    public BatchCreateIndex withOrderedIndexedAttributeList(AttributeKey... orderedIndexedAttributeList) {
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

    public BatchCreateIndex withOrderedIndexedAttributeList(java.util.Collection<AttributeKey> orderedIndexedAttributeList) {
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

    public BatchCreateIndex withIsUnique(Boolean isUnique) {
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

    public BatchCreateIndex withParentReference(ObjectReference parentReference) {
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

    public BatchCreateIndex withLinkName(String linkName) {
        setLinkName(linkName);
        return this;
    }

    /**
     * <p>
     * The batch reference name. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html">Transaction
     * Support</a> for more information.
     * </p>
     * 
     * @param batchReferenceName
     *        The batch reference name. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html"
     *        >Transaction Support</a> for more information.
     */

    public void setBatchReferenceName(String batchReferenceName) {
        this.batchReferenceName = batchReferenceName;
    }

    /**
     * <p>
     * The batch reference name. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html">Transaction
     * Support</a> for more information.
     * </p>
     * 
     * @return The batch reference name. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html"
     *         >Transaction Support</a> for more information.
     */

    public String getBatchReferenceName() {
        return this.batchReferenceName;
    }

    /**
     * <p>
     * The batch reference name. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html">Transaction
     * Support</a> for more information.
     * </p>
     * 
     * @param batchReferenceName
     *        The batch reference name. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html"
     *        >Transaction Support</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateIndex withBatchReferenceName(String batchReferenceName) {
        setBatchReferenceName(batchReferenceName);
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
        if (getOrderedIndexedAttributeList() != null)
            sb.append("OrderedIndexedAttributeList: ").append(getOrderedIndexedAttributeList()).append(",");
        if (getIsUnique() != null)
            sb.append("IsUnique: ").append(getIsUnique()).append(",");
        if (getParentReference() != null)
            sb.append("ParentReference: ").append(getParentReference()).append(",");
        if (getLinkName() != null)
            sb.append("LinkName: ").append(getLinkName()).append(",");
        if (getBatchReferenceName() != null)
            sb.append("BatchReferenceName: ").append(getBatchReferenceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateIndex == false)
            return false;
        BatchCreateIndex other = (BatchCreateIndex) obj;
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
        if (other.getBatchReferenceName() == null ^ this.getBatchReferenceName() == null)
            return false;
        if (other.getBatchReferenceName() != null && other.getBatchReferenceName().equals(this.getBatchReferenceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrderedIndexedAttributeList() == null) ? 0 : getOrderedIndexedAttributeList().hashCode());
        hashCode = prime * hashCode + ((getIsUnique() == null) ? 0 : getIsUnique().hashCode());
        hashCode = prime * hashCode + ((getParentReference() == null) ? 0 : getParentReference().hashCode());
        hashCode = prime * hashCode + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        hashCode = prime * hashCode + ((getBatchReferenceName() == null) ? 0 : getBatchReferenceName().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateIndex clone() {
        try {
            return (BatchCreateIndex) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchCreateIndexMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
