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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchPutDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutDocumentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index to add the documents to. You need to create the index first using the
     * <code>CreateIndex</code> API.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that is allowed to run the <code>BatchPutDocument</code> API. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon
     * Kendra</a>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * One or more documents to add to the index.
     * </p>
     * <p>
     * Documents have the following file size limits.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 5 MB total size for inline documents
     * </p>
     * </li>
     * <li>
     * <p>
     * 50 MB total size for files from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * 5 MB extracted text for any file
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about file size and transaction per second quotas, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * </p>
     */
    private java.util.List<Document> documents;
    /**
     * <p>
     * Configuration information for altering your document metadata and content during the document ingestion process
     * when you use the <code>BatchPutDocument</code> API.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     */
    private CustomDocumentEnrichmentConfiguration customDocumentEnrichmentConfiguration;

    /**
     * <p>
     * The identifier of the index to add the documents to. You need to create the index first using the
     * <code>CreateIndex</code> API.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index to add the documents to. You need to create the index first using the
     *        <code>CreateIndex</code> API.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index to add the documents to. You need to create the index first using the
     * <code>CreateIndex</code> API.
     * </p>
     * 
     * @return The identifier of the index to add the documents to. You need to create the index first using the
     *         <code>CreateIndex</code> API.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index to add the documents to. You need to create the index first using the
     * <code>CreateIndex</code> API.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index to add the documents to. You need to create the index first using the
     *        <code>CreateIndex</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutDocumentRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that is allowed to run the <code>BatchPutDocument</code> API. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon
     * Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role that is allowed to run the <code>BatchPutDocument</code> API. For
     *        more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for
     *        Amazon Kendra</a>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that is allowed to run the <code>BatchPutDocument</code> API. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon
     * Kendra</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role that is allowed to run the <code>BatchPutDocument</code> API.
     *         For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles
     *         for Amazon Kendra</a>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that is allowed to run the <code>BatchPutDocument</code> API. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon
     * Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role that is allowed to run the <code>BatchPutDocument</code> API. For
     *        more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for
     *        Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutDocumentRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * One or more documents to add to the index.
     * </p>
     * <p>
     * Documents have the following file size limits.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 5 MB total size for inline documents
     * </p>
     * </li>
     * <li>
     * <p>
     * 50 MB total size for files from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * 5 MB extracted text for any file
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about file size and transaction per second quotas, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * </p>
     * 
     * @return One or more documents to add to the index.</p>
     *         <p>
     *         Documents have the following file size limits.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         5 MB total size for inline documents
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         50 MB total size for files from an S3 bucket
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         5 MB extracted text for any file
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about file size and transaction per second quotas, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     */

    public java.util.List<Document> getDocuments() {
        return documents;
    }

    /**
     * <p>
     * One or more documents to add to the index.
     * </p>
     * <p>
     * Documents have the following file size limits.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 5 MB total size for inline documents
     * </p>
     * </li>
     * <li>
     * <p>
     * 50 MB total size for files from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * 5 MB extracted text for any file
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about file size and transaction per second quotas, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * </p>
     * 
     * @param documents
     *        One or more documents to add to the index.</p>
     *        <p>
     *        Documents have the following file size limits.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        5 MB total size for inline documents
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        50 MB total size for files from an S3 bucket
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        5 MB extracted text for any file
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about file size and transaction per second quotas, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     */

    public void setDocuments(java.util.Collection<Document> documents) {
        if (documents == null) {
            this.documents = null;
            return;
        }

        this.documents = new java.util.ArrayList<Document>(documents);
    }

    /**
     * <p>
     * One or more documents to add to the index.
     * </p>
     * <p>
     * Documents have the following file size limits.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 5 MB total size for inline documents
     * </p>
     * </li>
     * <li>
     * <p>
     * 50 MB total size for files from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * 5 MB extracted text for any file
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about file size and transaction per second quotas, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocuments(java.util.Collection)} or {@link #withDocuments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param documents
     *        One or more documents to add to the index.</p>
     *        <p>
     *        Documents have the following file size limits.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        5 MB total size for inline documents
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        50 MB total size for files from an S3 bucket
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        5 MB extracted text for any file
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about file size and transaction per second quotas, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutDocumentRequest withDocuments(Document... documents) {
        if (this.documents == null) {
            setDocuments(new java.util.ArrayList<Document>(documents.length));
        }
        for (Document ele : documents) {
            this.documents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more documents to add to the index.
     * </p>
     * <p>
     * Documents have the following file size limits.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 5 MB total size for inline documents
     * </p>
     * </li>
     * <li>
     * <p>
     * 50 MB total size for files from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * 5 MB extracted text for any file
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about file size and transaction per second quotas, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * </p>
     * 
     * @param documents
     *        One or more documents to add to the index.</p>
     *        <p>
     *        Documents have the following file size limits.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        5 MB total size for inline documents
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        50 MB total size for files from an S3 bucket
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        5 MB extracted text for any file
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about file size and transaction per second quotas, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutDocumentRequest withDocuments(java.util.Collection<Document> documents) {
        setDocuments(documents);
        return this;
    }

    /**
     * <p>
     * Configuration information for altering your document metadata and content during the document ingestion process
     * when you use the <code>BatchPutDocument</code> API.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     * 
     * @param customDocumentEnrichmentConfiguration
     *        Configuration information for altering your document metadata and content during the document ingestion
     *        process when you use the <code>BatchPutDocument</code> API.</p>
     *        <p>
     *        For more information on how to create, modify and delete document metadata, or make other content
     *        alterations when you ingest documents into Amazon Kendra, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document
     *        metadata during the ingestion process</a>.
     */

    public void setCustomDocumentEnrichmentConfiguration(CustomDocumentEnrichmentConfiguration customDocumentEnrichmentConfiguration) {
        this.customDocumentEnrichmentConfiguration = customDocumentEnrichmentConfiguration;
    }

    /**
     * <p>
     * Configuration information for altering your document metadata and content during the document ingestion process
     * when you use the <code>BatchPutDocument</code> API.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     * 
     * @return Configuration information for altering your document metadata and content during the document ingestion
     *         process when you use the <code>BatchPutDocument</code> API.</p>
     *         <p>
     *         For more information on how to create, modify and delete document metadata, or make other content
     *         alterations when you ingest documents into Amazon Kendra, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document
     *         metadata during the ingestion process</a>.
     */

    public CustomDocumentEnrichmentConfiguration getCustomDocumentEnrichmentConfiguration() {
        return this.customDocumentEnrichmentConfiguration;
    }

    /**
     * <p>
     * Configuration information for altering your document metadata and content during the document ingestion process
     * when you use the <code>BatchPutDocument</code> API.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     * 
     * @param customDocumentEnrichmentConfiguration
     *        Configuration information for altering your document metadata and content during the document ingestion
     *        process when you use the <code>BatchPutDocument</code> API.</p>
     *        <p>
     *        For more information on how to create, modify and delete document metadata, or make other content
     *        alterations when you ingest documents into Amazon Kendra, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document
     *        metadata during the ingestion process</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutDocumentRequest withCustomDocumentEnrichmentConfiguration(CustomDocumentEnrichmentConfiguration customDocumentEnrichmentConfiguration) {
        setCustomDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDocuments() != null)
            sb.append("Documents: ").append(getDocuments()).append(",");
        if (getCustomDocumentEnrichmentConfiguration() != null)
            sb.append("CustomDocumentEnrichmentConfiguration: ").append(getCustomDocumentEnrichmentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutDocumentRequest == false)
            return false;
        BatchPutDocumentRequest other = (BatchPutDocumentRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDocuments() == null ^ this.getDocuments() == null)
            return false;
        if (other.getDocuments() != null && other.getDocuments().equals(this.getDocuments()) == false)
            return false;
        if (other.getCustomDocumentEnrichmentConfiguration() == null ^ this.getCustomDocumentEnrichmentConfiguration() == null)
            return false;
        if (other.getCustomDocumentEnrichmentConfiguration() != null
                && other.getCustomDocumentEnrichmentConfiguration().equals(this.getCustomDocumentEnrichmentConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDocuments() == null) ? 0 : getDocuments().hashCode());
        hashCode = prime * hashCode + ((getCustomDocumentEnrichmentConfiguration() == null) ? 0 : getCustomDocumentEnrichmentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutDocumentRequest clone() {
        return (BatchPutDocumentRequest) super.clone();
    }

}
