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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetDocumentAnalysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDocumentAnalysisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in every
     * page of paginated responses from an Amazon Textract video operation.
     * </p>
     */
    private DocumentMetadata documentMetadata;
    /**
     * <p>
     * The current status of the text detection job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     * request to retrieve the next set of text detection results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The results of the text analysis operation.
     * </p>
     */
    private java.util.List<Block> blocks;
    /**
     * <p>
     * A list of warnings that occurred during the document analysis operation.
     * </p>
     */
    private java.util.List<Warning> warnings;
    /**
     * <p>
     * The current status of an asynchronous document analysis operation.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in every
     * page of paginated responses from an Amazon Textract video operation.
     * </p>
     * 
     * @param documentMetadata
     *        Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in
     *        every page of paginated responses from an Amazon Textract video operation.
     */

    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * <p>
     * Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in every
     * page of paginated responses from an Amazon Textract video operation.
     * </p>
     * 
     * @return Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in
     *         every page of paginated responses from an Amazon Textract video operation.
     */

    public DocumentMetadata getDocumentMetadata() {
        return this.documentMetadata;
    }

    /**
     * <p>
     * Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in every
     * page of paginated responses from an Amazon Textract video operation.
     * </p>
     * 
     * @param documentMetadata
     *        Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in
     *        every page of paginated responses from an Amazon Textract video operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentAnalysisResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        setDocumentMetadata(documentMetadata);
        return this;
    }

    /**
     * <p>
     * The current status of the text detection job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the text detection job.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the text detection job.
     * </p>
     * 
     * @return The current status of the text detection job.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the text detection job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the text detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public GetDocumentAnalysisResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the text detection job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the text detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public GetDocumentAnalysisResult withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     * request to retrieve the next set of text detection results.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     *        request to retrieve the next set of text detection results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     * request to retrieve the next set of text detection results.
     * </p>
     * 
     * @return If the response is truncated, Amazon Textract returns this token. You can use this token in the
     *         subsequent request to retrieve the next set of text detection results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     * request to retrieve the next set of text detection results.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     *        request to retrieve the next set of text detection results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentAnalysisResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The results of the text analysis operation.
     * </p>
     * 
     * @return The results of the text analysis operation.
     */

    public java.util.List<Block> getBlocks() {
        return blocks;
    }

    /**
     * <p>
     * The results of the text analysis operation.
     * </p>
     * 
     * @param blocks
     *        The results of the text analysis operation.
     */

    public void setBlocks(java.util.Collection<Block> blocks) {
        if (blocks == null) {
            this.blocks = null;
            return;
        }

        this.blocks = new java.util.ArrayList<Block>(blocks);
    }

    /**
     * <p>
     * The results of the text analysis operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlocks(java.util.Collection)} or {@link #withBlocks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param blocks
     *        The results of the text analysis operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentAnalysisResult withBlocks(Block... blocks) {
        if (this.blocks == null) {
            setBlocks(new java.util.ArrayList<Block>(blocks.length));
        }
        for (Block ele : blocks) {
            this.blocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results of the text analysis operation.
     * </p>
     * 
     * @param blocks
     *        The results of the text analysis operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentAnalysisResult withBlocks(java.util.Collection<Block> blocks) {
        setBlocks(blocks);
        return this;
    }

    /**
     * <p>
     * A list of warnings that occurred during the document analysis operation.
     * </p>
     * 
     * @return A list of warnings that occurred during the document analysis operation.
     */

    public java.util.List<Warning> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * A list of warnings that occurred during the document analysis operation.
     * </p>
     * 
     * @param warnings
     *        A list of warnings that occurred during the document analysis operation.
     */

    public void setWarnings(java.util.Collection<Warning> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<Warning>(warnings);
    }

    /**
     * <p>
     * A list of warnings that occurred during the document analysis operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        A list of warnings that occurred during the document analysis operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentAnalysisResult withWarnings(Warning... warnings) {
        if (this.warnings == null) {
            setWarnings(new java.util.ArrayList<Warning>(warnings.length));
        }
        for (Warning ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of warnings that occurred during the document analysis operation.
     * </p>
     * 
     * @param warnings
     *        A list of warnings that occurred during the document analysis operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentAnalysisResult withWarnings(java.util.Collection<Warning> warnings) {
        setWarnings(warnings);
        return this;
    }

    /**
     * <p>
     * The current status of an asynchronous document analysis operation.
     * </p>
     * 
     * @param statusMessage
     *        The current status of an asynchronous document analysis operation.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The current status of an asynchronous document analysis operation.
     * </p>
     * 
     * @return The current status of an asynchronous document analysis operation.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The current status of an asynchronous document analysis operation.
     * </p>
     * 
     * @param statusMessage
     *        The current status of an asynchronous document analysis operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentAnalysisResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getDocumentMetadata() != null)
            sb.append("DocumentMetadata: ").append(getDocumentMetadata()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getBlocks() != null)
            sb.append("Blocks: ").append(getBlocks()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDocumentAnalysisResult == false)
            return false;
        GetDocumentAnalysisResult other = (GetDocumentAnalysisResult) obj;
        if (other.getDocumentMetadata() == null ^ this.getDocumentMetadata() == null)
            return false;
        if (other.getDocumentMetadata() != null && other.getDocumentMetadata().equals(this.getDocumentMetadata()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getBlocks() == null ^ this.getBlocks() == null)
            return false;
        if (other.getBlocks() != null && other.getBlocks().equals(this.getBlocks()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentMetadata() == null) ? 0 : getDocumentMetadata().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getBlocks() == null) ? 0 : getBlocks().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public GetDocumentAnalysisResult clone() {
        try {
            return (GetDocumentAnalysisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
