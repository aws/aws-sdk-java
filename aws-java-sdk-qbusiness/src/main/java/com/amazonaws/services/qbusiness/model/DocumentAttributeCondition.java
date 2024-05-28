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
 * The condition used for the target document attribute or metadata field when ingesting documents into Amazon Q
 * Business. You use this with <a
 * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeTarget.html">
 * <code>DocumentAttributeTarget</code> </a> to apply the condition.
 * </p>
 * <p>
 * For example, you can create the 'Department' target field and have it prefill department names associated with the
 * documents based on information in the 'Source_URI' field. Set the condition that if the 'Source_URI' field contains
 * 'financial' in its URI value, then prefill the target field 'Department' with the target value 'Finance' for the
 * document.
 * </p>
 * <p>
 * Amazon Q Business can't create a target field if it has not already been created as an index field. After you create
 * your index field, you can create a document metadata field using <code>DocumentAttributeTarget</code>. Amazon Q
 * Business then will map your newly created metadata field to your index field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DocumentAttributeCondition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentAttributeCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the document attribute used for the condition.
     * </p>
     * <p>
     * For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source URIs
     * associated with the documents.
     * </p>
     * <p>
     * Amazon Q Business currently doesn't support <code>_document_body</code> as an attribute key used for the
     * condition.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The identifier of the document attribute used for the condition.
     * </p>
     * <p>
     * For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source URIs
     * associated with the documents.
     * </p>
     * <p>
     * Amazon Q Business currently does not support <code>_document_body</code> as an attribute key used for the
     * condition.
     * </p>
     */
    private String operator;

    private DocumentAttributeValue value;

    /**
     * <p>
     * The identifier of the document attribute used for the condition.
     * </p>
     * <p>
     * For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source URIs
     * associated with the documents.
     * </p>
     * <p>
     * Amazon Q Business currently doesn't support <code>_document_body</code> as an attribute key used for the
     * condition.
     * </p>
     * 
     * @param key
     *        The identifier of the document attribute used for the condition.</p>
     *        <p>
     *        For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source
     *        URIs associated with the documents.
     *        </p>
     *        <p>
     *        Amazon Q Business currently doesn't support <code>_document_body</code> as an attribute key used for the
     *        condition.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The identifier of the document attribute used for the condition.
     * </p>
     * <p>
     * For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source URIs
     * associated with the documents.
     * </p>
     * <p>
     * Amazon Q Business currently doesn't support <code>_document_body</code> as an attribute key used for the
     * condition.
     * </p>
     * 
     * @return The identifier of the document attribute used for the condition.</p>
     *         <p>
     *         For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source
     *         URIs associated with the documents.
     *         </p>
     *         <p>
     *         Amazon Q Business currently doesn't support <code>_document_body</code> as an attribute key used for the
     *         condition.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The identifier of the document attribute used for the condition.
     * </p>
     * <p>
     * For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source URIs
     * associated with the documents.
     * </p>
     * <p>
     * Amazon Q Business currently doesn't support <code>_document_body</code> as an attribute key used for the
     * condition.
     * </p>
     * 
     * @param key
     *        The identifier of the document attribute used for the condition.</p>
     *        <p>
     *        For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source
     *        URIs associated with the documents.
     *        </p>
     *        <p>
     *        Amazon Q Business currently doesn't support <code>_document_body</code> as an attribute key used for the
     *        condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeCondition withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The identifier of the document attribute used for the condition.
     * </p>
     * <p>
     * For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source URIs
     * associated with the documents.
     * </p>
     * <p>
     * Amazon Q Business currently does not support <code>_document_body</code> as an attribute key used for the
     * condition.
     * </p>
     * 
     * @param operator
     *        The identifier of the document attribute used for the condition.</p>
     *        <p>
     *        For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source
     *        URIs associated with the documents.
     *        </p>
     *        <p>
     *        Amazon Q Business currently does not support <code>_document_body</code> as an attribute key used for the
     *        condition.
     * @see DocumentEnrichmentConditionOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The identifier of the document attribute used for the condition.
     * </p>
     * <p>
     * For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source URIs
     * associated with the documents.
     * </p>
     * <p>
     * Amazon Q Business currently does not support <code>_document_body</code> as an attribute key used for the
     * condition.
     * </p>
     * 
     * @return The identifier of the document attribute used for the condition.</p>
     *         <p>
     *         For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source
     *         URIs associated with the documents.
     *         </p>
     *         <p>
     *         Amazon Q Business currently does not support <code>_document_body</code> as an attribute key used for the
     *         condition.
     * @see DocumentEnrichmentConditionOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The identifier of the document attribute used for the condition.
     * </p>
     * <p>
     * For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source URIs
     * associated with the documents.
     * </p>
     * <p>
     * Amazon Q Business currently does not support <code>_document_body</code> as an attribute key used for the
     * condition.
     * </p>
     * 
     * @param operator
     *        The identifier of the document attribute used for the condition.</p>
     *        <p>
     *        For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source
     *        URIs associated with the documents.
     *        </p>
     *        <p>
     *        Amazon Q Business currently does not support <code>_document_body</code> as an attribute key used for the
     *        condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentEnrichmentConditionOperator
     */

    public DocumentAttributeCondition withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The identifier of the document attribute used for the condition.
     * </p>
     * <p>
     * For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source URIs
     * associated with the documents.
     * </p>
     * <p>
     * Amazon Q Business currently does not support <code>_document_body</code> as an attribute key used for the
     * condition.
     * </p>
     * 
     * @param operator
     *        The identifier of the document attribute used for the condition.</p>
     *        <p>
     *        For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source
     *        URIs associated with the documents.
     *        </p>
     *        <p>
     *        Amazon Q Business currently does not support <code>_document_body</code> as an attribute key used for the
     *        condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentEnrichmentConditionOperator
     */

    public DocumentAttributeCondition withOperator(DocumentEnrichmentConditionOperator operator) {
        this.operator = operator.toString();
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

    public DocumentAttributeCondition withValue(DocumentAttributeValue value) {
        setValue(value);
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
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentAttributeCondition == false)
            return false;
        DocumentAttributeCondition other = (DocumentAttributeCondition) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public DocumentAttributeCondition clone() {
        try {
            return (DocumentAttributeCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.DocumentAttributeConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
