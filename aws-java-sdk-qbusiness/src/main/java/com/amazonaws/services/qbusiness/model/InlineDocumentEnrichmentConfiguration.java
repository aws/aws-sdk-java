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
 * Provides the configuration information for applying basic logic to alter document metadata and content when ingesting
 * documents into Amazon Q Business.
 * </p>
 * <p>
 * To apply advanced logic, to go beyond what you can do with basic logic, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_HookConfiguration.html">
 * <code>HookConfiguration</code> </a>.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html">Custom document
 * enrichment</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/InlineDocumentEnrichmentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InlineDocumentEnrichmentConfiguration implements Serializable, Cloneable, StructuredPojo {

    private DocumentAttributeCondition condition;

    private DocumentAttributeTarget target;
    /**
     * <p>
     * <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * </p>
     */
    private String documentContentOperator;

    /**
     * @param condition
     */

    public void setCondition(DocumentAttributeCondition condition) {
        this.condition = condition;
    }

    /**
     * @return
     */

    public DocumentAttributeCondition getCondition() {
        return this.condition;
    }

    /**
     * @param condition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InlineDocumentEnrichmentConfiguration withCondition(DocumentAttributeCondition condition) {
        setCondition(condition);
        return this;
    }

    /**
     * @param target
     */

    public void setTarget(DocumentAttributeTarget target) {
        this.target = target;
    }

    /**
     * @return
     */

    public DocumentAttributeTarget getTarget() {
        return this.target;
    }

    /**
     * @param target
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InlineDocumentEnrichmentConfiguration withTarget(DocumentAttributeTarget target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * </p>
     * 
     * @param documentContentOperator
     *        <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * @see DocumentContentOperator
     */

    public void setDocumentContentOperator(String documentContentOperator) {
        this.documentContentOperator = documentContentOperator;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * </p>
     * 
     * @return <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * @see DocumentContentOperator
     */

    public String getDocumentContentOperator() {
        return this.documentContentOperator;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * </p>
     * 
     * @param documentContentOperator
     *        <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentContentOperator
     */

    public InlineDocumentEnrichmentConfiguration withDocumentContentOperator(String documentContentOperator) {
        setDocumentContentOperator(documentContentOperator);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * </p>
     * 
     * @param documentContentOperator
     *        <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentContentOperator
     */

    public InlineDocumentEnrichmentConfiguration withDocumentContentOperator(DocumentContentOperator documentContentOperator) {
        this.documentContentOperator = documentContentOperator.toString();
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
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getDocumentContentOperator() != null)
            sb.append("DocumentContentOperator: ").append(getDocumentContentOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InlineDocumentEnrichmentConfiguration == false)
            return false;
        InlineDocumentEnrichmentConfiguration other = (InlineDocumentEnrichmentConfiguration) obj;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getDocumentContentOperator() == null ^ this.getDocumentContentOperator() == null)
            return false;
        if (other.getDocumentContentOperator() != null && other.getDocumentContentOperator().equals(this.getDocumentContentOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getDocumentContentOperator() == null) ? 0 : getDocumentContentOperator().hashCode());
        return hashCode;
    }

    @Override
    public InlineDocumentEnrichmentConfiguration clone() {
        try {
            return (InlineDocumentEnrichmentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.InlineDocumentEnrichmentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
