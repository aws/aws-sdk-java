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
 * Represents the output of a <a>CreateObject</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchCreateObject" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>FacetArns</code> that will be associated with the object. For more information, see <a>arns</a>.
     * </p>
     */
    private java.util.List<SchemaFacet> schemaFacet;
    /**
     * <p>
     * An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
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
     * The name of the link.
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
     * A list of <code>FacetArns</code> that will be associated with the object. For more information, see <a>arns</a>.
     * </p>
     * 
     * @return A list of <code>FacetArns</code> that will be associated with the object. For more information, see
     *         <a>arns</a>.
     */

    public java.util.List<SchemaFacet> getSchemaFacet() {
        return schemaFacet;
    }

    /**
     * <p>
     * A list of <code>FacetArns</code> that will be associated with the object. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param schemaFacet
     *        A list of <code>FacetArns</code> that will be associated with the object. For more information, see
     *        <a>arns</a>.
     */

    public void setSchemaFacet(java.util.Collection<SchemaFacet> schemaFacet) {
        if (schemaFacet == null) {
            this.schemaFacet = null;
            return;
        }

        this.schemaFacet = new java.util.ArrayList<SchemaFacet>(schemaFacet);
    }

    /**
     * <p>
     * A list of <code>FacetArns</code> that will be associated with the object. For more information, see <a>arns</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemaFacet(java.util.Collection)} or {@link #withSchemaFacet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param schemaFacet
     *        A list of <code>FacetArns</code> that will be associated with the object. For more information, see
     *        <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateObject withSchemaFacet(SchemaFacet... schemaFacet) {
        if (this.schemaFacet == null) {
            setSchemaFacet(new java.util.ArrayList<SchemaFacet>(schemaFacet.length));
        }
        for (SchemaFacet ele : schemaFacet) {
            this.schemaFacet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>FacetArns</code> that will be associated with the object. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param schemaFacet
     *        A list of <code>FacetArns</code> that will be associated with the object. For more information, see
     *        <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateObject withSchemaFacet(java.util.Collection<SchemaFacet> schemaFacet) {
        setSchemaFacet(schemaFacet);
        return this;
    }

    /**
     * <p>
     * An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
     * </p>
     * 
     * @return An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
     */

    public java.util.List<AttributeKeyAndValue> getObjectAttributeList() {
        return objectAttributeList;
    }

    /**
     * <p>
     * An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
     * </p>
     * 
     * @param objectAttributeList
     *        An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
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
     * An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectAttributeList(java.util.Collection)} or {@link #withObjectAttributeList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param objectAttributeList
     *        An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateObject withObjectAttributeList(AttributeKeyAndValue... objectAttributeList) {
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
     * An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
     * </p>
     * 
     * @param objectAttributeList
     *        An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateObject withObjectAttributeList(java.util.Collection<AttributeKeyAndValue> objectAttributeList) {
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

    public BatchCreateObject withParentReference(ObjectReference parentReference) {
        setParentReference(parentReference);
        return this;
    }

    /**
     * <p>
     * The name of the link.
     * </p>
     * 
     * @param linkName
     *        The name of the link.
     */

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * <p>
     * The name of the link.
     * </p>
     * 
     * @return The name of the link.
     */

    public String getLinkName() {
        return this.linkName;
    }

    /**
     * <p>
     * The name of the link.
     * </p>
     * 
     * @param linkName
     *        The name of the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateObject withLinkName(String linkName) {
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

    public BatchCreateObject withBatchReferenceName(String batchReferenceName) {
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
        if (getSchemaFacet() != null)
            sb.append("SchemaFacet: ").append(getSchemaFacet()).append(",");
        if (getObjectAttributeList() != null)
            sb.append("ObjectAttributeList: ").append(getObjectAttributeList()).append(",");
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

        if (obj instanceof BatchCreateObject == false)
            return false;
        BatchCreateObject other = (BatchCreateObject) obj;
        if (other.getSchemaFacet() == null ^ this.getSchemaFacet() == null)
            return false;
        if (other.getSchemaFacet() != null && other.getSchemaFacet().equals(this.getSchemaFacet()) == false)
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

        hashCode = prime * hashCode + ((getSchemaFacet() == null) ? 0 : getSchemaFacet().hashCode());
        hashCode = prime * hashCode + ((getObjectAttributeList() == null) ? 0 : getObjectAttributeList().hashCode());
        hashCode = prime * hashCode + ((getParentReference() == null) ? 0 : getParentReference().hashCode());
        hashCode = prime * hashCode + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        hashCode = prime * hashCode + ((getBatchReferenceName() == null) ? 0 : getBatchReferenceName().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateObject clone() {
        try {
            return (BatchCreateObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchCreateObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
