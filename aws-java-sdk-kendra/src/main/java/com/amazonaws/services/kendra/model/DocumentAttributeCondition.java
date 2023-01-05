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
 * The condition used for the target document attribute or metadata field when ingesting documents into Amazon Kendra.
 * You use this with <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/API_DocumentAttributeTarget.html">DocumentAttributeTarget to apply
 * the condition</a>.
 * </p>
 * <p>
 * For example, you can create the 'Department' target field and have it prefill department names associated with the
 * documents based on information in the 'Source_URI' field. Set the condition that if the 'Source_URI' field contains
 * 'financial' in its URI value, then prefill the target field 'Department' with the target value 'Finance' for the
 * document.
 * </p>
 * <p>
 * Amazon Kendra cannot create a target field if it has not already been created as an index field. After you create
 * your index field, you can create a document metadata field using <code>DocumentAttributeTarget</code>. Amazon Kendra
 * then will map your newly created metadata field to your index field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DocumentAttributeCondition" target="_top">AWS
 *      API Documentation</a>
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
     * Amazon Kendra currently does not support <code>_document_body</code> as an attribute key used for the condition.
     * </p>
     */
    private String conditionDocumentAttributeKey;
    /**
     * <p>
     * The condition operator.
     * </p>
     * <p>
     * For example, you can use 'Contains' to partially match a string.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The value used by the operator.
     * </p>
     * <p>
     * For example, you can specify the value 'financial' for strings in the 'Source_URI' field that partially match or
     * contain this value.
     * </p>
     */
    private DocumentAttributeValue conditionOnValue;

    /**
     * <p>
     * The identifier of the document attribute used for the condition.
     * </p>
     * <p>
     * For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source URIs
     * associated with the documents.
     * </p>
     * <p>
     * Amazon Kendra currently does not support <code>_document_body</code> as an attribute key used for the condition.
     * </p>
     * 
     * @param conditionDocumentAttributeKey
     *        The identifier of the document attribute used for the condition.</p>
     *        <p>
     *        For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source
     *        URIs associated with the documents.
     *        </p>
     *        <p>
     *        Amazon Kendra currently does not support <code>_document_body</code> as an attribute key used for the
     *        condition.
     */

    public void setConditionDocumentAttributeKey(String conditionDocumentAttributeKey) {
        this.conditionDocumentAttributeKey = conditionDocumentAttributeKey;
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
     * Amazon Kendra currently does not support <code>_document_body</code> as an attribute key used for the condition.
     * </p>
     * 
     * @return The identifier of the document attribute used for the condition.</p>
     *         <p>
     *         For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source
     *         URIs associated with the documents.
     *         </p>
     *         <p>
     *         Amazon Kendra currently does not support <code>_document_body</code> as an attribute key used for the
     *         condition.
     */

    public String getConditionDocumentAttributeKey() {
        return this.conditionDocumentAttributeKey;
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
     * Amazon Kendra currently does not support <code>_document_body</code> as an attribute key used for the condition.
     * </p>
     * 
     * @param conditionDocumentAttributeKey
     *        The identifier of the document attribute used for the condition.</p>
     *        <p>
     *        For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source
     *        URIs associated with the documents.
     *        </p>
     *        <p>
     *        Amazon Kendra currently does not support <code>_document_body</code> as an attribute key used for the
     *        condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeCondition withConditionDocumentAttributeKey(String conditionDocumentAttributeKey) {
        setConditionDocumentAttributeKey(conditionDocumentAttributeKey);
        return this;
    }

    /**
     * <p>
     * The condition operator.
     * </p>
     * <p>
     * For example, you can use 'Contains' to partially match a string.
     * </p>
     * 
     * @param operator
     *        The condition operator.</p>
     *        <p>
     *        For example, you can use 'Contains' to partially match a string.
     * @see ConditionOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The condition operator.
     * </p>
     * <p>
     * For example, you can use 'Contains' to partially match a string.
     * </p>
     * 
     * @return The condition operator.</p>
     *         <p>
     *         For example, you can use 'Contains' to partially match a string.
     * @see ConditionOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The condition operator.
     * </p>
     * <p>
     * For example, you can use 'Contains' to partially match a string.
     * </p>
     * 
     * @param operator
     *        The condition operator.</p>
     *        <p>
     *        For example, you can use 'Contains' to partially match a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionOperator
     */

    public DocumentAttributeCondition withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The condition operator.
     * </p>
     * <p>
     * For example, you can use 'Contains' to partially match a string.
     * </p>
     * 
     * @param operator
     *        The condition operator.</p>
     *        <p>
     *        For example, you can use 'Contains' to partially match a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionOperator
     */

    public DocumentAttributeCondition withOperator(ConditionOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The value used by the operator.
     * </p>
     * <p>
     * For example, you can specify the value 'financial' for strings in the 'Source_URI' field that partially match or
     * contain this value.
     * </p>
     * 
     * @param conditionOnValue
     *        The value used by the operator.</p>
     *        <p>
     *        For example, you can specify the value 'financial' for strings in the 'Source_URI' field that partially
     *        match or contain this value.
     */

    public void setConditionOnValue(DocumentAttributeValue conditionOnValue) {
        this.conditionOnValue = conditionOnValue;
    }

    /**
     * <p>
     * The value used by the operator.
     * </p>
     * <p>
     * For example, you can specify the value 'financial' for strings in the 'Source_URI' field that partially match or
     * contain this value.
     * </p>
     * 
     * @return The value used by the operator.</p>
     *         <p>
     *         For example, you can specify the value 'financial' for strings in the 'Source_URI' field that partially
     *         match or contain this value.
     */

    public DocumentAttributeValue getConditionOnValue() {
        return this.conditionOnValue;
    }

    /**
     * <p>
     * The value used by the operator.
     * </p>
     * <p>
     * For example, you can specify the value 'financial' for strings in the 'Source_URI' field that partially match or
     * contain this value.
     * </p>
     * 
     * @param conditionOnValue
     *        The value used by the operator.</p>
     *        <p>
     *        For example, you can specify the value 'financial' for strings in the 'Source_URI' field that partially
     *        match or contain this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeCondition withConditionOnValue(DocumentAttributeValue conditionOnValue) {
        setConditionOnValue(conditionOnValue);
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
        if (getConditionDocumentAttributeKey() != null)
            sb.append("ConditionDocumentAttributeKey: ").append(getConditionDocumentAttributeKey()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
        if (getConditionOnValue() != null)
            sb.append("ConditionOnValue: ").append(getConditionOnValue());
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
        if (other.getConditionDocumentAttributeKey() == null ^ this.getConditionDocumentAttributeKey() == null)
            return false;
        if (other.getConditionDocumentAttributeKey() != null
                && other.getConditionDocumentAttributeKey().equals(this.getConditionDocumentAttributeKey()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getConditionOnValue() == null ^ this.getConditionOnValue() == null)
            return false;
        if (other.getConditionOnValue() != null && other.getConditionOnValue().equals(this.getConditionOnValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConditionDocumentAttributeKey() == null) ? 0 : getConditionDocumentAttributeKey().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getConditionOnValue() == null) ? 0 : getConditionOnValue().hashCode());
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
        com.amazonaws.services.kendra.model.transform.DocumentAttributeConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
