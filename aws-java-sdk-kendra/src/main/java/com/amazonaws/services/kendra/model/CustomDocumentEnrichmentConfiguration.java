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
 * Provides the configuration information for altering document metadata and content during the document ingestion
 * process.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
 * during the ingestion process</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CustomDocumentEnrichmentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomDocumentEnrichmentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration information to alter document attributes or metadata fields and content when ingesting documents
     * into Amazon Kendra.
     * </p>
     */
    private java.util.List<InlineCustomDocumentEnrichmentConfiguration> inlineConfigurations;
    /**
     * <p>
     * Configuration information for invoking a Lambda function in Lambda on the original or raw documents before
     * extracting their metadata and text. You can use a Lambda function to apply advanced logic for creating,
     * modifying, or deleting document metadata and content. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     * >Advanced data manipulation</a>.
     * </p>
     */
    private HookConfiguration preExtractionHookConfiguration;
    /**
     * <p>
     * Configuration information for invoking a Lambda function in Lambda on the structured documents with their
     * metadata and text extracted. You can use a Lambda function to apply advanced logic for creating, modifying, or
     * deleting document metadata and content. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     * >Advanced data manipulation</a>.
     * </p>
     */
    private HookConfiguration postExtractionHookConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run <code>PreExtractionHookConfiguration</code> and
     * <code>PostExtractionHookConfiguration</code> for altering document metadata and content during the document
     * ingestion process. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Configuration information to alter document attributes or metadata fields and content when ingesting documents
     * into Amazon Kendra.
     * </p>
     * 
     * @return Configuration information to alter document attributes or metadata fields and content when ingesting
     *         documents into Amazon Kendra.
     */

    public java.util.List<InlineCustomDocumentEnrichmentConfiguration> getInlineConfigurations() {
        return inlineConfigurations;
    }

    /**
     * <p>
     * Configuration information to alter document attributes or metadata fields and content when ingesting documents
     * into Amazon Kendra.
     * </p>
     * 
     * @param inlineConfigurations
     *        Configuration information to alter document attributes or metadata fields and content when ingesting
     *        documents into Amazon Kendra.
     */

    public void setInlineConfigurations(java.util.Collection<InlineCustomDocumentEnrichmentConfiguration> inlineConfigurations) {
        if (inlineConfigurations == null) {
            this.inlineConfigurations = null;
            return;
        }

        this.inlineConfigurations = new java.util.ArrayList<InlineCustomDocumentEnrichmentConfiguration>(inlineConfigurations);
    }

    /**
     * <p>
     * Configuration information to alter document attributes or metadata fields and content when ingesting documents
     * into Amazon Kendra.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInlineConfigurations(java.util.Collection)} or {@link #withInlineConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param inlineConfigurations
     *        Configuration information to alter document attributes or metadata fields and content when ingesting
     *        documents into Amazon Kendra.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDocumentEnrichmentConfiguration withInlineConfigurations(InlineCustomDocumentEnrichmentConfiguration... inlineConfigurations) {
        if (this.inlineConfigurations == null) {
            setInlineConfigurations(new java.util.ArrayList<InlineCustomDocumentEnrichmentConfiguration>(inlineConfigurations.length));
        }
        for (InlineCustomDocumentEnrichmentConfiguration ele : inlineConfigurations) {
            this.inlineConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration information to alter document attributes or metadata fields and content when ingesting documents
     * into Amazon Kendra.
     * </p>
     * 
     * @param inlineConfigurations
     *        Configuration information to alter document attributes or metadata fields and content when ingesting
     *        documents into Amazon Kendra.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDocumentEnrichmentConfiguration withInlineConfigurations(java.util.Collection<InlineCustomDocumentEnrichmentConfiguration> inlineConfigurations) {
        setInlineConfigurations(inlineConfigurations);
        return this;
    }

    /**
     * <p>
     * Configuration information for invoking a Lambda function in Lambda on the original or raw documents before
     * extracting their metadata and text. You can use a Lambda function to apply advanced logic for creating,
     * modifying, or deleting document metadata and content. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     * >Advanced data manipulation</a>.
     * </p>
     * 
     * @param preExtractionHookConfiguration
     *        Configuration information for invoking a Lambda function in Lambda on the original or raw documents before
     *        extracting their metadata and text. You can use a Lambda function to apply advanced logic for creating,
     *        modifying, or deleting document metadata and content. For more information, see <a href=
     *        "https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     *        >Advanced data manipulation</a>.
     */

    public void setPreExtractionHookConfiguration(HookConfiguration preExtractionHookConfiguration) {
        this.preExtractionHookConfiguration = preExtractionHookConfiguration;
    }

    /**
     * <p>
     * Configuration information for invoking a Lambda function in Lambda on the original or raw documents before
     * extracting their metadata and text. You can use a Lambda function to apply advanced logic for creating,
     * modifying, or deleting document metadata and content. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     * >Advanced data manipulation</a>.
     * </p>
     * 
     * @return Configuration information for invoking a Lambda function in Lambda on the original or raw documents
     *         before extracting their metadata and text. You can use a Lambda function to apply advanced logic for
     *         creating, modifying, or deleting document metadata and content. For more information, see <a href=
     *         "https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     *         >Advanced data manipulation</a>.
     */

    public HookConfiguration getPreExtractionHookConfiguration() {
        return this.preExtractionHookConfiguration;
    }

    /**
     * <p>
     * Configuration information for invoking a Lambda function in Lambda on the original or raw documents before
     * extracting their metadata and text. You can use a Lambda function to apply advanced logic for creating,
     * modifying, or deleting document metadata and content. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     * >Advanced data manipulation</a>.
     * </p>
     * 
     * @param preExtractionHookConfiguration
     *        Configuration information for invoking a Lambda function in Lambda on the original or raw documents before
     *        extracting their metadata and text. You can use a Lambda function to apply advanced logic for creating,
     *        modifying, or deleting document metadata and content. For more information, see <a href=
     *        "https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     *        >Advanced data manipulation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDocumentEnrichmentConfiguration withPreExtractionHookConfiguration(HookConfiguration preExtractionHookConfiguration) {
        setPreExtractionHookConfiguration(preExtractionHookConfiguration);
        return this;
    }

    /**
     * <p>
     * Configuration information for invoking a Lambda function in Lambda on the structured documents with their
     * metadata and text extracted. You can use a Lambda function to apply advanced logic for creating, modifying, or
     * deleting document metadata and content. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     * >Advanced data manipulation</a>.
     * </p>
     * 
     * @param postExtractionHookConfiguration
     *        Configuration information for invoking a Lambda function in Lambda on the structured documents with their
     *        metadata and text extracted. You can use a Lambda function to apply advanced logic for creating,
     *        modifying, or deleting document metadata and content. For more information, see <a href=
     *        "https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     *        >Advanced data manipulation</a>.
     */

    public void setPostExtractionHookConfiguration(HookConfiguration postExtractionHookConfiguration) {
        this.postExtractionHookConfiguration = postExtractionHookConfiguration;
    }

    /**
     * <p>
     * Configuration information for invoking a Lambda function in Lambda on the structured documents with their
     * metadata and text extracted. You can use a Lambda function to apply advanced logic for creating, modifying, or
     * deleting document metadata and content. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     * >Advanced data manipulation</a>.
     * </p>
     * 
     * @return Configuration information for invoking a Lambda function in Lambda on the structured documents with their
     *         metadata and text extracted. You can use a Lambda function to apply advanced logic for creating,
     *         modifying, or deleting document metadata and content. For more information, see <a href=
     *         "https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     *         >Advanced data manipulation</a>.
     */

    public HookConfiguration getPostExtractionHookConfiguration() {
        return this.postExtractionHookConfiguration;
    }

    /**
     * <p>
     * Configuration information for invoking a Lambda function in Lambda on the structured documents with their
     * metadata and text extracted. You can use a Lambda function to apply advanced logic for creating, modifying, or
     * deleting document metadata and content. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     * >Advanced data manipulation</a>.
     * </p>
     * 
     * @param postExtractionHookConfiguration
     *        Configuration information for invoking a Lambda function in Lambda on the structured documents with their
     *        metadata and text extracted. You can use a Lambda function to apply advanced logic for creating,
     *        modifying, or deleting document metadata and content. For more information, see <a href=
     *        "https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation"
     *        >Advanced data manipulation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDocumentEnrichmentConfiguration withPostExtractionHookConfiguration(HookConfiguration postExtractionHookConfiguration) {
        setPostExtractionHookConfiguration(postExtractionHookConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run <code>PreExtractionHookConfiguration</code> and
     * <code>PostExtractionHookConfiguration</code> for altering document metadata and content during the document
     * ingestion process. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to run
     *        <code>PreExtractionHookConfiguration</code> and <code>PostExtractionHookConfiguration</code> for altering
     *        document metadata and content during the document ingestion process. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run <code>PreExtractionHookConfiguration</code> and
     * <code>PostExtractionHookConfiguration</code> for altering document metadata and content during the document
     * ingestion process. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to run
     *         <code>PreExtractionHookConfiguration</code> and <code>PostExtractionHookConfiguration</code> for altering
     *         document metadata and content during the document ingestion process. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run <code>PreExtractionHookConfiguration</code> and
     * <code>PostExtractionHookConfiguration</code> for altering document metadata and content during the document
     * ingestion process. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to run
     *        <code>PreExtractionHookConfiguration</code> and <code>PostExtractionHookConfiguration</code> for altering
     *        document metadata and content during the document ingestion process. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDocumentEnrichmentConfiguration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
            sb.append("PostExtractionHookConfiguration: ").append(getPostExtractionHookConfiguration()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomDocumentEnrichmentConfiguration == false)
            return false;
        CustomDocumentEnrichmentConfiguration other = (CustomDocumentEnrichmentConfiguration) obj;
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
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CustomDocumentEnrichmentConfiguration clone() {
        try {
            return (CustomDocumentEnrichmentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.CustomDocumentEnrichmentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
