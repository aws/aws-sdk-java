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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetExpenseAnalysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExpenseAnalysisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in every
     * page of paginated responses from an Amazon Textract operation.
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
     * request to retrieve the next set of text-detection results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     */
    private java.util.List<ExpenseDocument> expenseDocuments;
    /**
     * <p>
     * A list of warnings that occurred during the text-detection operation for the document.
     * </p>
     */
    private java.util.List<Warning> warnings;
    /**
     * <p>
     * Returns if the detection job could not be completed. Contains explanation for what error occured.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The current model version of AnalyzeExpense.
     * </p>
     */
    private String analyzeExpenseModelVersion;

    /**
     * <p>
     * Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in every
     * page of paginated responses from an Amazon Textract operation.
     * </p>
     * 
     * @param documentMetadata
     *        Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in
     *        every page of paginated responses from an Amazon Textract operation.
     */

    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * <p>
     * Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in every
     * page of paginated responses from an Amazon Textract operation.
     * </p>
     * 
     * @return Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in
     *         every page of paginated responses from an Amazon Textract operation.
     */

    public DocumentMetadata getDocumentMetadata() {
        return this.documentMetadata;
    }

    /**
     * <p>
     * Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in every
     * page of paginated responses from an Amazon Textract operation.
     * </p>
     * 
     * @param documentMetadata
     *        Information about a document that Amazon Textract processed. <code>DocumentMetadata</code> is returned in
     *        every page of paginated responses from an Amazon Textract operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExpenseAnalysisResult withDocumentMetadata(DocumentMetadata documentMetadata) {
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

    public GetExpenseAnalysisResult withJobStatus(String jobStatus) {
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

    public GetExpenseAnalysisResult withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     * request to retrieve the next set of text-detection results.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     *        request to retrieve the next set of text-detection results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     * request to retrieve the next set of text-detection results.
     * </p>
     * 
     * @return If the response is truncated, Amazon Textract returns this token. You can use this token in the
     *         subsequent request to retrieve the next set of text-detection results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     * request to retrieve the next set of text-detection results.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     *        request to retrieve the next set of text-detection results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExpenseAnalysisResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     * 
     * @return The expenses detected by Amazon Textract.
     */

    public java.util.List<ExpenseDocument> getExpenseDocuments() {
        return expenseDocuments;
    }

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     * 
     * @param expenseDocuments
     *        The expenses detected by Amazon Textract.
     */

    public void setExpenseDocuments(java.util.Collection<ExpenseDocument> expenseDocuments) {
        if (expenseDocuments == null) {
            this.expenseDocuments = null;
            return;
        }

        this.expenseDocuments = new java.util.ArrayList<ExpenseDocument>(expenseDocuments);
    }

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExpenseDocuments(java.util.Collection)} or {@link #withExpenseDocuments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param expenseDocuments
     *        The expenses detected by Amazon Textract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExpenseAnalysisResult withExpenseDocuments(ExpenseDocument... expenseDocuments) {
        if (this.expenseDocuments == null) {
            setExpenseDocuments(new java.util.ArrayList<ExpenseDocument>(expenseDocuments.length));
        }
        for (ExpenseDocument ele : expenseDocuments) {
            this.expenseDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     * 
     * @param expenseDocuments
     *        The expenses detected by Amazon Textract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExpenseAnalysisResult withExpenseDocuments(java.util.Collection<ExpenseDocument> expenseDocuments) {
        setExpenseDocuments(expenseDocuments);
        return this;
    }

    /**
     * <p>
     * A list of warnings that occurred during the text-detection operation for the document.
     * </p>
     * 
     * @return A list of warnings that occurred during the text-detection operation for the document.
     */

    public java.util.List<Warning> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * A list of warnings that occurred during the text-detection operation for the document.
     * </p>
     * 
     * @param warnings
     *        A list of warnings that occurred during the text-detection operation for the document.
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
     * A list of warnings that occurred during the text-detection operation for the document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        A list of warnings that occurred during the text-detection operation for the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExpenseAnalysisResult withWarnings(Warning... warnings) {
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
     * A list of warnings that occurred during the text-detection operation for the document.
     * </p>
     * 
     * @param warnings
     *        A list of warnings that occurred during the text-detection operation for the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExpenseAnalysisResult withWarnings(java.util.Collection<Warning> warnings) {
        setWarnings(warnings);
        return this;
    }

    /**
     * <p>
     * Returns if the detection job could not be completed. Contains explanation for what error occured.
     * </p>
     * 
     * @param statusMessage
     *        Returns if the detection job could not be completed. Contains explanation for what error occured.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Returns if the detection job could not be completed. Contains explanation for what error occured.
     * </p>
     * 
     * @return Returns if the detection job could not be completed. Contains explanation for what error occured.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Returns if the detection job could not be completed. Contains explanation for what error occured.
     * </p>
     * 
     * @param statusMessage
     *        Returns if the detection job could not be completed. Contains explanation for what error occured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExpenseAnalysisResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The current model version of AnalyzeExpense.
     * </p>
     * 
     * @param analyzeExpenseModelVersion
     *        The current model version of AnalyzeExpense.
     */

    public void setAnalyzeExpenseModelVersion(String analyzeExpenseModelVersion) {
        this.analyzeExpenseModelVersion = analyzeExpenseModelVersion;
    }

    /**
     * <p>
     * The current model version of AnalyzeExpense.
     * </p>
     * 
     * @return The current model version of AnalyzeExpense.
     */

    public String getAnalyzeExpenseModelVersion() {
        return this.analyzeExpenseModelVersion;
    }

    /**
     * <p>
     * The current model version of AnalyzeExpense.
     * </p>
     * 
     * @param analyzeExpenseModelVersion
     *        The current model version of AnalyzeExpense.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExpenseAnalysisResult withAnalyzeExpenseModelVersion(String analyzeExpenseModelVersion) {
        setAnalyzeExpenseModelVersion(analyzeExpenseModelVersion);
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
        if (getExpenseDocuments() != null)
            sb.append("ExpenseDocuments: ").append(getExpenseDocuments()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getAnalyzeExpenseModelVersion() != null)
            sb.append("AnalyzeExpenseModelVersion: ").append(getAnalyzeExpenseModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExpenseAnalysisResult == false)
            return false;
        GetExpenseAnalysisResult other = (GetExpenseAnalysisResult) obj;
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
        if (other.getExpenseDocuments() == null ^ this.getExpenseDocuments() == null)
            return false;
        if (other.getExpenseDocuments() != null && other.getExpenseDocuments().equals(this.getExpenseDocuments()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getAnalyzeExpenseModelVersion() == null ^ this.getAnalyzeExpenseModelVersion() == null)
            return false;
        if (other.getAnalyzeExpenseModelVersion() != null && other.getAnalyzeExpenseModelVersion().equals(this.getAnalyzeExpenseModelVersion()) == false)
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
        hashCode = prime * hashCode + ((getExpenseDocuments() == null) ? 0 : getExpenseDocuments().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getAnalyzeExpenseModelVersion() == null) ? 0 : getAnalyzeExpenseModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetExpenseAnalysisResult clone() {
        try {
            return (GetExpenseAnalysisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
