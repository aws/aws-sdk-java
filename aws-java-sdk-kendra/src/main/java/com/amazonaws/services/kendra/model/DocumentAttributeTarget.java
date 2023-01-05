/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The target document attribute or metadata field you want to alter when ingesting documents into Amazon Kendra.
 * </p>
 * <p>
 * For example, you can delete customer identification numbers associated with the documents, stored in the document
 * metadata field called 'Customer_ID'. You set the target key as 'Customer_ID' and the deletion flag to
 * <code>TRUE</code>. This removes all customer ID values in the field 'Customer_ID'. This would scrub personally
 * identifiable information from each document's metadata.
 * </p>
 * <p>
 * Amazon Kendra cannot create a target field if it has not already been created as an index field. After you create
 * your index field, you can create a document metadata field using <code>DocumentAttributeTarget</code>. Amazon Kendra
 * then will map your newly created metadata field to your index field.
 * </p>
 * <p>
 * You can also use this with <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/API_DocumentAttributeCondition.html">
 * DocumentAttributeCondition</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DocumentAttributeTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentAttributeTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the target document attribute or metadata field.
     * </p>
     * <p>
     * For example, 'Department' could be an identifier for the target attribute or metadata field that includes the
     * department names associated with the documents.
     * </p>
     */
    private String targetDocumentAttributeKey;
    /**
     * <p>
     * <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot create
     * a target value and set this to <code>TRUE</code>. To create a target value (
     * <code>TargetDocumentAttributeValue</code>), set this to <code>FALSE</code>.
     * </p>
     */
    private Boolean targetDocumentAttributeValueDeletion;
    /**
     * <p>
     * The target value you want to create for the target attribute.
     * </p>
     * <p>
     * For example, 'Finance' could be the target value for the target attribute key 'Department'.
     * </p>
     */
    private DocumentAttributeValue targetDocumentAttributeValue;

    /**
     * <p>
     * The identifier of the target document attribute or metadata field.
     * </p>
     * <p>
     * For example, 'Department' could be an identifier for the target attribute or metadata field that includes the
     * department names associated with the documents.
     * </p>
     * 
     * @param targetDocumentAttributeKey
     *        The identifier of the target document attribute or metadata field.</p>
     *        <p>
     *        For example, 'Department' could be an identifier for the target attribute or metadata field that includes
     *        the department names associated with the documents.
     */

    public void setTargetDocumentAttributeKey(String targetDocumentAttributeKey) {
        this.targetDocumentAttributeKey = targetDocumentAttributeKey;
    }

    /**
     * <p>
     * The identifier of the target document attribute or metadata field.
     * </p>
     * <p>
     * For example, 'Department' could be an identifier for the target attribute or metadata field that includes the
     * department names associated with the documents.
     * </p>
     * 
     * @return The identifier of the target document attribute or metadata field.</p>
     *         <p>
     *         For example, 'Department' could be an identifier for the target attribute or metadata field that includes
     *         the department names associated with the documents.
     */

    public String getTargetDocumentAttributeKey() {
        return this.targetDocumentAttributeKey;
    }

    /**
     * <p>
     * The identifier of the target document attribute or metadata field.
     * </p>
     * <p>
     * For example, 'Department' could be an identifier for the target attribute or metadata field that includes the
     * department names associated with the documents.
     * </p>
     * 
     * @param targetDocumentAttributeKey
     *        The identifier of the target document attribute or metadata field.</p>
     *        <p>
     *        For example, 'Department' could be an identifier for the target attribute or metadata field that includes
     *        the department names associated with the documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeTarget withTargetDocumentAttributeKey(String targetDocumentAttributeKey) {
        setTargetDocumentAttributeKey(targetDocumentAttributeKey);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot create
     * a target value and set this to <code>TRUE</code>. To create a target value (
     * <code>TargetDocumentAttributeValue</code>), set this to <code>FALSE</code>.
     * </p>
     * 
     * @param targetDocumentAttributeValueDeletion
     *        <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot
     *        create a target value and set this to <code>TRUE</code>. To create a target value (
     *        <code>TargetDocumentAttributeValue</code>), set this to <code>FALSE</code>.
     */

    public void setTargetDocumentAttributeValueDeletion(Boolean targetDocumentAttributeValueDeletion) {
        this.targetDocumentAttributeValueDeletion = targetDocumentAttributeValueDeletion;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot create
     * a target value and set this to <code>TRUE</code>. To create a target value (
     * <code>TargetDocumentAttributeValue</code>), set this to <code>FALSE</code>.
     * </p>
     * 
     * @return <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot
     *         create a target value and set this to <code>TRUE</code>. To create a target value (
     *         <code>TargetDocumentAttributeValue</code>), set this to <code>FALSE</code>.
     */

    public Boolean getTargetDocumentAttributeValueDeletion() {
        return this.targetDocumentAttributeValueDeletion;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot create
     * a target value and set this to <code>TRUE</code>. To create a target value (
     * <code>TargetDocumentAttributeValue</code>), set this to <code>FALSE</code>.
     * </p>
     * 
     * @param targetDocumentAttributeValueDeletion
     *        <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot
     *        create a target value and set this to <code>TRUE</code>. To create a target value (
     *        <code>TargetDocumentAttributeValue</code>), set this to <code>FALSE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeTarget withTargetDocumentAttributeValueDeletion(Boolean targetDocumentAttributeValueDeletion) {
        setTargetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot create
     * a target value and set this to <code>TRUE</code>. To create a target value (
     * <code>TargetDocumentAttributeValue</code>), set this to <code>FALSE</code>.
     * </p>
     * 
     * @return <code>TRUE</code> to delete the existing target value for your specified target attribute key. You cannot
     *         create a target value and set this to <code>TRUE</code>. To create a target value (
     *         <code>TargetDocumentAttributeValue</code>), set this to <code>FALSE</code>.
     */

    public Boolean isTargetDocumentAttributeValueDeletion() {
        return this.targetDocumentAttributeValueDeletion;
    }

    /**
     * <p>
     * The target value you want to create for the target attribute.
     * </p>
     * <p>
     * For example, 'Finance' could be the target value for the target attribute key 'Department'.
     * </p>
     * 
     * @param targetDocumentAttributeValue
     *        The target value you want to create for the target attribute.</p>
     *        <p>
     *        For example, 'Finance' could be the target value for the target attribute key 'Department'.
     */

    public void setTargetDocumentAttributeValue(DocumentAttributeValue targetDocumentAttributeValue) {
        this.targetDocumentAttributeValue = targetDocumentAttributeValue;
    }

    /**
     * <p>
     * The target value you want to create for the target attribute.
     * </p>
     * <p>
     * For example, 'Finance' could be the target value for the target attribute key 'Department'.
     * </p>
     * 
     * @return The target value you want to create for the target attribute.</p>
     *         <p>
     *         For example, 'Finance' could be the target value for the target attribute key 'Department'.
     */

    public DocumentAttributeValue getTargetDocumentAttributeValue() {
        return this.targetDocumentAttributeValue;
    }

    /**
     * <p>
     * The target value you want to create for the target attribute.
     * </p>
     * <p>
     * For example, 'Finance' could be the target value for the target attribute key 'Department'.
     * </p>
     * 
     * @param targetDocumentAttributeValue
     *        The target value you want to create for the target attribute.</p>
     *        <p>
     *        For example, 'Finance' could be the target value for the target attribute key 'Department'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeTarget withTargetDocumentAttributeValue(DocumentAttributeValue targetDocumentAttributeValue) {
        setTargetDocumentAttributeValue(targetDocumentAttributeValue);
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
        if (getTargetDocumentAttributeKey() != null)
            sb.append("TargetDocumentAttributeKey: ").append(getTargetDocumentAttributeKey()).append(",");
        if (getTargetDocumentAttributeValueDeletion() != null)
            sb.append("TargetDocumentAttributeValueDeletion: ").append(getTargetDocumentAttributeValueDeletion()).append(",");
        if (getTargetDocumentAttributeValue() != null)
            sb.append("TargetDocumentAttributeValue: ").append(getTargetDocumentAttributeValue());
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
        if (other.getTargetDocumentAttributeKey() == null ^ this.getTargetDocumentAttributeKey() == null)
            return false;
        if (other.getTargetDocumentAttributeKey() != null && other.getTargetDocumentAttributeKey().equals(this.getTargetDocumentAttributeKey()) == false)
            return false;
        if (other.getTargetDocumentAttributeValueDeletion() == null ^ this.getTargetDocumentAttributeValueDeletion() == null)
            return false;
        if (other.getTargetDocumentAttributeValueDeletion() != null
                && other.getTargetDocumentAttributeValueDeletion().equals(this.getTargetDocumentAttributeValueDeletion()) == false)
            return false;
        if (other.getTargetDocumentAttributeValue() == null ^ this.getTargetDocumentAttributeValue() == null)
            return false;
        if (other.getTargetDocumentAttributeValue() != null && other.getTargetDocumentAttributeValue().equals(this.getTargetDocumentAttributeValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetDocumentAttributeKey() == null) ? 0 : getTargetDocumentAttributeKey().hashCode());
        hashCode = prime * hashCode + ((getTargetDocumentAttributeValueDeletion() == null) ? 0 : getTargetDocumentAttributeValueDeletion().hashCode());
        hashCode = prime * hashCode + ((getTargetDocumentAttributeValue() == null) ? 0 : getTargetDocumentAttributeValue().hashCode());
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
        com.amazonaws.services.kendra.model.transform.DocumentAttributeTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
