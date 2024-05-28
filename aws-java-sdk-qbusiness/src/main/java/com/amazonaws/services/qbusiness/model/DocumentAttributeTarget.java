/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The target document attribute or metadata field you want to alter when ingesting documents into Amazon Q Business.
 * </p>
 * <p>
 * For example, you can delete all customer identification numbers associated with the documents, stored in the document
 * metadata field called 'Customer_ID' by setting the target key as 'Customer_ID' and the deletion flag to
 * <code>TRUE</code>. This removes all customer ID values in the field 'Customer_ID'. This would scrub personally
 * identifiable information from each document's metadata.
 * </p>
 * <p>
 * Amazon Q Business can't create a target field if it has not already been created as an index field. After you create
 * your index field, you can create a document metadata field using <a
 * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeTarget.html">
 * <code>DocumentAttributeTarget</code> </a>. Amazon Q Business will then map your newly created document attribute to
 * your index field.
 * </p>
 * <p>
 * You can also use this with <a
 * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeCondition.html">
 * <code>DocumentAttributeCondition</code> </a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DocumentAttributeTarget" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentAttributeTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the target document attribute or metadata field. For example, 'Department' could be an
     * identifier for the target attribute or metadata field that includes the department names associated with the
     * documents.
     * </p>
     */
    private String key;

    private DocumentAttributeValue value;
    /**
     * <p>
     * <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot create
     * a target value and set this to <code>TRUE</code>.
     * </p>
     */
    private String attributeValueOperator;

    /**
     * <p>
     * The identifier of the target document attribute or metadata field. For example, 'Department' could be an
     * identifier for the target attribute or metadata field that includes the department names associated with the
     * documents.
     * </p>
     * 
     * @param key
     *        The identifier of the target document attribute or metadata field. For example, 'Department' could be an
     *        identifier for the target attribute or metadata field that includes the department names associated with
     *        the documents.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The identifier of the target document attribute or metadata field. For example, 'Department' could be an
     * identifier for the target attribute or metadata field that includes the department names associated with the
     * documents.
     * </p>
     * 
     * @return The identifier of the target document attribute or metadata field. For example, 'Department' could be an
     *         identifier for the target attribute or metadata field that includes the department names associated with
     *         the documents.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The identifier of the target document attribute or metadata field. For example, 'Department' could be an
     * identifier for the target attribute or metadata field that includes the department names associated with the
     * documents.
     * </p>
     * 
     * @param key
     *        The identifier of the target document attribute or metadata field. For example, 'Department' could be an
     *        identifier for the target attribute or metadata field that includes the department names associated with
     *        the documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeTarget withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * @param value
     */

    public void setValue(DocumentAttributeValue value) {
        this.value = value;
    }

    /**
     * @return
     */

    public DocumentAttributeValue getValue() {
        return this.value;
    }

    /**
     * @param value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeTarget withValue(DocumentAttributeValue value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot create
     * a target value and set this to <code>TRUE</code>.
     * </p>
     * 
     * @param attributeValueOperator
     *        <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot
     *        create a target value and set this to <code>TRUE</code>.
     * @see AttributeValueOperator
     */

    public void setAttributeValueOperator(String attributeValueOperator) {
        this.attributeValueOperator = attributeValueOperator;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot create
     * a target value and set this to <code>TRUE</code>.
     * </p>
     * 
     * @return <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot
     *         create a target value and set this to <code>TRUE</code>.
     * @see AttributeValueOperator
     */

    public String getAttributeValueOperator() {
        return this.attributeValueOperator;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot create
     * a target value and set this to <code>TRUE</code>.
     * </p>
     * 
     * @param attributeValueOperator
     *        <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot
     *        create a target value and set this to <code>TRUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeValueOperator
     */

    public DocumentAttributeTarget withAttributeValueOperator(String attributeValueOperator) {
        setAttributeValueOperator(attributeValueOperator);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot create
     * a target value and set this to <code>TRUE</code>.
     * </p>
     * 
     * @param attributeValueOperator
     *        <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot
     *        create a target value and set this to <code>TRUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeValueOperator
     */

    public DocumentAttributeTarget withAttributeValueOperator(AttributeValueOperator attributeValueOperator) {
        this.attributeValueOperator = attributeValueOperator.toString();
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getAttributeValueOperator() != null)
            sb.append("AttributeValueOperator: ").append(getAttributeValueOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentAttributeTarget == false)
            return false;
        DocumentAttributeTarget other = (DocumentAttributeTarget) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getAttributeValueOperator() == null ^ this.getAttributeValueOperator() == null)
            return false;
        if (other.getAttributeValueOperator() != null && other.getAttributeValueOperator().equals(this.getAttributeValueOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getAttributeValueOperator() == null) ? 0 : getAttributeValueOperator().hashCode());
        return hashCode;
    }

    @Override
    public DocumentAttributeTarget clone() {
        try {
            return (DocumentAttributeTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.DocumentAttributeTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
