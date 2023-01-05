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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetLendingAnalysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLendingAnalysisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private DocumentMetadata documentMetadata;
    /**
     * <p>
     * The current status of the lending analysis job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     * request to retrieve the next set of lending results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Holds the information returned by one of AmazonTextract's document analysis operations for the pinstripe.
     * </p>
     */
    private java.util.List<LendingResult> results;
    /**
     * <p>
     * A list of warnings that occurred during the lending analysis operation.
     * </p>
     */
    private java.util.List<Warning> warnings;
    /**
     * <p>
     * Returns if the lending analysis job could not be completed. Contains explanation for what error occurred.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The current model version of the Analyze Lending API.
     * </p>
     */
    private String analyzeLendingModelVersion;

    /**
     * @param documentMetadata
     */

    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * @return
     */

    public DocumentMetadata getDocumentMetadata() {
        return this.documentMetadata;
    }

    /**
     * @param documentMetadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLendingAnalysisResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        setDocumentMetadata(documentMetadata);
        return this;
    }

    /**
     * <p>
     * The current status of the lending analysis job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the lending analysis job.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the lending analysis job.
     * </p>
     * 
     * @return The current status of the lending analysis job.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the lending analysis job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the lending analysis job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public GetLendingAnalysisResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the lending analysis job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the lending analysis job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public GetLendingAnalysisResult withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     * request to retrieve the next set of lending results.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     *        request to retrieve the next set of lending results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     * request to retrieve the next set of lending results.
     * </p>
     * 
     * @return If the response is truncated, Amazon Textract returns this token. You can use this token in the
     *         subsequent request to retrieve the next set of lending results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     * request to retrieve the next set of lending results.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent
     *        request to retrieve the next set of lending results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLendingAnalysisResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Holds the information returned by one of AmazonTextract's document analysis operations for the pinstripe.
     * </p>
     * 
     * @return Holds the information returned by one of AmazonTextract's document analysis operations for the pinstripe.
     */

    public java.util.List<LendingResult> getResults() {
        return results;
    }

    /**
     * <p>
     * Holds the information returned by one of AmazonTextract's document analysis operations for the pinstripe.
     * </p>
     * 
     * @param results
     *        Holds the information returned by one of AmazonTextract's document analysis operations for the pinstripe.
     */

    public void setResults(java.util.Collection<LendingResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<LendingResult>(results);
    }

    /**
     * <p>
     * Holds the information returned by one of AmazonTextract's document analysis operations for the pinstripe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        Holds the information returned by one of AmazonTextract's document analysis operations for the pinstripe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLendingAnalysisResult withResults(LendingResult... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<LendingResult>(results.length));
        }
        for (LendingResult ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Holds the information returned by one of AmazonTextract's document analysis operations for the pinstripe.
     * </p>
     * 
     * @param results
     *        Holds the information returned by one of AmazonTextract's document analysis operations for the pinstripe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLendingAnalysisResult withResults(java.util.Collection<LendingResult> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * A list of warnings that occurred during the lending analysis operation.
     * </p>
     * 
     * @return A list of warnings that occurred during the lending analysis operation.
     */

    public java.util.List<Warning> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * A list of warnings that occurred during the lending analysis operation.
     * </p>
     * 
     * @param warnings
     *        A list of warnings that occurred during the lending analysis operation.
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
     * A list of warnings that occurred during the lending analysis operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        A list of warnings that occurred during the lending analysis operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLendingAnalysisResult withWarnings(Warning... warnings) {
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
     * A list of warnings that occurred during the lending analysis operation.
     * </p>
     * 
     * @param warnings
     *        A list of warnings that occurred during the lending analysis operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLendingAnalysisResult withWarnings(java.util.Collection<Warning> warnings) {
        setWarnings(warnings);
        return this;
    }

    /**
     * <p>
     * Returns if the lending analysis job could not be completed. Contains explanation for what error occurred.
     * </p>
     * 
     * @param statusMessage
     *        Returns if the lending analysis job could not be completed. Contains explanation for what error occurred.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Returns if the lending analysis job could not be completed. Contains explanation for what error occurred.
     * </p>
     * 
     * @return Returns if the lending analysis job could not be completed. Contains explanation for what error occurred.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Returns if the lending analysis job could not be completed. Contains explanation for what error occurred.
     * </p>
     * 
     * @param statusMessage
     *        Returns if the lending analysis job could not be completed. Contains explanation for what error occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLendingAnalysisResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The current model version of the Analyze Lending API.
     * </p>
     * 
     * @param analyzeLendingModelVersion
     *        The current model version of the Analyze Lending API.
     */

    public void setAnalyzeLendingModelVersion(String analyzeLendingModelVersion) {
        this.analyzeLendingModelVersion = analyzeLendingModelVersion;
    }

    /**
     * <p>
     * The current model version of the Analyze Lending API.
     * </p>
     * 
     * @return The current model version of the Analyze Lending API.
     */

    public String getAnalyzeLendingModelVersion() {
        return this.analyzeLendingModelVersion;
    }

    /**
     * <p>
     * The current model version of the Analyze Lending API.
     * </p>
     * 
     * @param analyzeLendingModelVersion
     *        The current model version of the Analyze Lending API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLendingAnalysisResult withAnalyzeLendingModelVersion(String analyzeLendingModelVersion) {
        setAnalyzeLendingModelVersion(analyzeLendingModelVersion);
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getAnalyzeLendingModelVersion() != null)
            sb.append("AnalyzeLendingModelVersion: ").append(getAnalyzeLendingModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLendingAnalysisResult == false)
            return false;
        GetLendingAnalysisResult other = (GetLendingAnalysisResult) obj;
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
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getAnalyzeLendingModelVersion() == null ^ this.getAnalyzeLendingModelVersion() == null)
            return false;
        if (other.getAnalyzeLendingModelVersion() != null && other.getAnalyzeLendingModelVersion().equals(this.getAnalyzeLendingModelVersion()) == false)
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
        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getAnalyzeLendingModelVersion() == null) ? 0 : getAnalyzeLendingModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetLendingAnalysisResult clone() {
        try {
            return (GetLendingAnalysisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
