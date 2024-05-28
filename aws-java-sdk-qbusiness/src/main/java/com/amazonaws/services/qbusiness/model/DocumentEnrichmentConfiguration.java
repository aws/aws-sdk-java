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
 * Provides the configuration information for altering document metadata and content during the document ingestion
 * process.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html">Custom document
 * enrichment</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DocumentEnrichmentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentEnrichmentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration information to alter document attributes or metadata fields and content when ingesting documents
     * into Amazon Q Business.
     * </p>
     */
    private java.util.List<InlineDocumentEnrichmentConfiguration> inlineConfigurations;

    private HookConfiguration preExtractionHookConfiguration;

    private HookConfiguration postExtractionHookConfiguration;

    /**
     * <p>
     * Configuration information to alter document attributes or metadata fields and content when ingesting documents
     * into Amazon Q Business.
     * </p>
     * 
     * @return Configuration information to alter document attributes or metadata fields and content when ingesting
     *         documents into Amazon Q Business.
     */

    public java.util.List<InlineDocumentEnrichmentConfiguration> getInlineConfigurations() {
        return inlineConfigurations;
    }

    /**
     * <p>
     * Configuration information to alter document attributes or metadata fields and content when ingesting documents
     * into Amazon Q Business.
     * </p>
     * 
     * @param inlineConfigurations
     *        Configuration information to alter document attributes or metadata fields and content when ingesting
     *        documents into Amazon Q Business.
     */

    public void setInlineConfigurations(java.util.Collection<InlineDocumentEnrichmentConfiguration> inlineConfigurations) {
        if (inlineConfigurations == null) {
            this.inlineConfigurations = null;
            return;
        }

        this.inlineConfigurations = new java.util.ArrayList<InlineDocumentEnrichmentConfiguration>(inlineConfigurations);
    }

    /**
     * <p>
     * Configuration information to alter document attributes or metadata fields and content when ingesting documents
     * into Amazon Q Business.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInlineConfigurations(java.util.Collection)} or {@link #withInlineConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param inlineConfigurations
     *        Configuration information to alter document attributes or metadata fields and content when ingesting
     *        documents into Amazon Q Business.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentEnrichmentConfiguration withInlineConfigurations(InlineDocumentEnrichmentConfiguration... inlineConfigurations) {
        if (this.inlineConfigurations == null) {
            setInlineConfigurations(new java.util.ArrayList<InlineDocumentEnrichmentConfiguration>(inlineConfigurations.length));
        }
        for (InlineDocumentEnrichmentConfiguration ele : inlineConfigurations) {
            this.inlineConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration information to alter document attributes or metadata fields and content when ingesting documents
     * into Amazon Q Business.
     * </p>
     * 
     * @param inlineConfigurations
     *        Configuration information to alter document attributes or metadata fields and content when ingesting
     *        documents into Amazon Q Business.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentEnrichmentConfiguration withInlineConfigurations(java.util.Collection<InlineDocumentEnrichmentConfiguration> inlineConfigurations) {
        setInlineConfigurations(inlineConfigurations);
        return this;
    }

    /**
     * @param preExtractionHookConfiguration
     */

    public void setPreExtractionHookConfiguration(HookConfiguration preExtractionHookConfiguration) {
        this.preExtractionHookConfiguration = preExtractionHookConfiguration;
    }

    /**
     * @return
     */

    public HookConfiguration getPreExtractionHookConfiguration() {
        return this.preExtractionHookConfiguration;
    }

    /**
     * @param preExtractionHookConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentEnrichmentConfiguration withPreExtractionHookConfiguration(HookConfiguration preExtractionHookConfiguration) {
        setPreExtractionHookConfiguration(preExtractionHookConfiguration);
        return this;
    }

    /**
     * @param postExtractionHookConfiguration
     */

    public void setPostExtractionHookConfiguration(HookConfiguration postExtractionHookConfiguration) {
        this.postExtractionHookConfiguration = postExtractionHookConfiguration;
    }

    /**
     * @return
     */

    public HookConfiguration getPostExtractionHookConfiguration() {
        return this.postExtractionHookConfiguration;
    }

    /**
     * @param postExtractionHookConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentEnrichmentConfiguration withPostExtractionHookConfiguration(HookConfiguration postExtractionHookConfiguration) {
        setPostExtractionHookConfiguration(postExtractionHookConfiguration);
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
        if (getInlineConfigurations() != null)
            sb.append("InlineConfigurations: ").append(getInlineConfigurations()).append(",");
        if (getPreExtractionHookConfiguration() != null)
            sb.append("PreExtractionHookConfiguration: ").append(getPreExtractionHookConfiguration()).append(",");
        if (getPostExtractionHookConfiguration() != null)
            sb.append("PostExtractionHookConfiguration: ").append(getPostExtractionHookConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentEnrichmentConfiguration == false)
            return false;
        DocumentEnrichmentConfiguration other = (DocumentEnrichmentConfiguration) obj;
        if (other.getInlineConfigurations() == null ^ this.getInlineConfigurations() == null)
            return false;
        if (other.getInlineConfigurations() != null && other.getInlineConfigurations().equals(this.getInlineConfigurations()) == false)
            return false;
        if (other.getPreExtractionHookConfiguration() == null ^ this.getPreExtractionHookConfiguration() == null)
            return false;
        if (other.getPreExtractionHookConfiguration() != null
                && other.getPreExtractionHookConfiguration().equals(this.getPreExtractionHookConfiguration()) == false)
            return false;
        if (other.getPostExtractionHookConfiguration() == null ^ this.getPostExtractionHookConfiguration() == null)
            return false;
        if (other.getPostExtractionHookConfiguration() != null
                && other.getPostExtractionHookConfiguration().equals(this.getPostExtractionHookConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInlineConfigurations() == null) ? 0 : getInlineConfigurations().hashCode());
        hashCode = prime * hashCode + ((getPreExtractionHookConfiguration() == null) ? 0 : getPreExtractionHookConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPostExtractionHookConfiguration() == null) ? 0 : getPostExtractionHookConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DocumentEnrichmentConfiguration clone() {
        try {
            return (DocumentEnrichmentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.DocumentEnrichmentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
