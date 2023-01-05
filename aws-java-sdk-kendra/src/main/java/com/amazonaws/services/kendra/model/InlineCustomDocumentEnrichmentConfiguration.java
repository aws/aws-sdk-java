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
 * Provides the configuration information for applying basic logic to alter document metadata and content when ingesting
 * documents into Amazon Kendra. To apply advanced logic, to go beyond what you can do with basic logic, see <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/API_HookConfiguration.html">HookConfiguration</a>.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
 * during the ingestion process</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/InlineCustomDocumentEnrichmentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InlineCustomDocumentEnrichmentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration of the condition used for the target document attribute or metadata field when ingesting documents
     * into Amazon Kendra.
     * </p>
     */
    private DocumentAttributeCondition condition;
    /**
     * <p>
     * Configuration of the target document attribute or metadata field when ingesting documents into Amazon Kendra. You
     * can also include a value.
     * </p>
     */
    private DocumentAttributeTarget target;
    /**
     * <p>
     * <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * </p>
     */
    private Boolean documentContentDeletion;

    /**
     * <p>
     * Configuration of the condition used for the target document attribute or metadata field when ingesting documents
     * into Amazon Kendra.
     * </p>
     * 
     * @param condition
     *        Configuration of the condition used for the target document attribute or metadata field when ingesting
     *        documents into Amazon Kendra.
     */

    public void setCondition(DocumentAttributeCondition condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * Configuration of the condition used for the target document attribute or metadata field when ingesting documents
     * into Amazon Kendra.
     * </p>
     * 
     * @return Configuration of the condition used for the target document attribute or metadata field when ingesting
     *         documents into Amazon Kendra.
     */

    public DocumentAttributeCondition getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * Configuration of the condition used for the target document attribute or metadata field when ingesting documents
     * into Amazon Kendra.
     * </p>
     * 
     * @param condition
     *        Configuration of the condition used for the target document attribute or metadata field when ingesting
     *        documents into Amazon Kendra.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InlineCustomDocumentEnrichmentConfiguration withCondition(DocumentAttributeCondition condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * Configuration of the target document attribute or metadata field when ingesting documents into Amazon Kendra. You
     * can also include a value.
     * </p>
     * 
     * @param target
     *        Configuration of the target document attribute or metadata field when ingesting documents into Amazon
     *        Kendra. You can also include a value.
     */

    public void setTarget(DocumentAttributeTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * Configuration of the target document attribute or metadata field when ingesting documents into Amazon Kendra. You
     * can also include a value.
     * </p>
     * 
     * @return Configuration of the target document attribute or metadata field when ingesting documents into Amazon
     *         Kendra. You can also include a value.
     */

    public DocumentAttributeTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * Configuration of the target document attribute or metadata field when ingesting documents into Amazon Kendra. You
     * can also include a value.
     * </p>
     * 
     * @param target
     *        Configuration of the target document attribute or metadata field when ingesting documents into Amazon
     *        Kendra. You can also include a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InlineCustomDocumentEnrichmentConfiguration withTarget(DocumentAttributeTarget target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * </p>
     * 
     * @param documentContentDeletion
     *        <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     */

    public void setDocumentContentDeletion(Boolean documentContentDeletion) {
        this.documentContentDeletion = documentContentDeletion;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * </p>
     * 
     * @return <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     */

    public Boolean getDocumentContentDeletion() {
        return this.documentContentDeletion;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * </p>
     * 
     * @param documentContentDeletion
     *        <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InlineCustomDocumentEnrichmentConfiguration withDocumentContentDeletion(Boolean documentContentDeletion) {
        setDocumentContentDeletion(documentContentDeletion);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     * </p>
     * 
     * @return <code>TRUE</code> to delete content if the condition used for the target attribute is met.
     */

    public Boolean isDocumentContentDeletion() {
        return this.documentContentDeletion;
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
        if (getDocumentContentDeletion() != null)
            sb.append("DocumentContentDeletion: ").append(getDocumentContentDeletion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InlineCustomDocumentEnrichmentConfiguration == false)
            return false;
        InlineCustomDocumentEnrichmentConfiguration other = (InlineCustomDocumentEnrichmentConfiguration) obj;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getDocumentContentDeletion() == null ^ this.getDocumentContentDeletion() == null)
            return false;
        if (other.getDocumentContentDeletion() != null && other.getDocumentContentDeletion().equals(this.getDocumentContentDeletion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getDocumentContentDeletion() == null) ? 0 : getDocumentContentDeletion().hashCode());
        return hashCode;
    }

    @Override
    public InlineCustomDocumentEnrichmentConfiguration clone() {
        try {
            return (InlineCustomDocumentEnrichmentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.InlineCustomDocumentEnrichmentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
