/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalTranscriptionJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMedicalTranscriptionJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested status of the medical transcription jobs returned.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The <code>ListMedicalTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum size of the
     * page is set by the <code>MaxResults</code> parameter. If the number of jobs exceeds what can fit on a page,
     * Amazon Transcribe Medical returns the <code>NextPage</code> token. Include the token in the next request to the
     * <code>ListMedicalTranscriptionJobs</code> operation to return in the next page of jobs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of objects containing summary information for a transcription job.
     * </p>
     */
    private java.util.List<MedicalTranscriptionJobSummary> medicalTranscriptionJobSummaries;

    /**
     * <p>
     * The requested status of the medical transcription jobs returned.
     * </p>
     * 
     * @param status
     *        The requested status of the medical transcription jobs returned.
     * @see TranscriptionJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The requested status of the medical transcription jobs returned.
     * </p>
     * 
     * @return The requested status of the medical transcription jobs returned.
     * @see TranscriptionJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The requested status of the medical transcription jobs returned.
     * </p>
     * 
     * @param status
     *        The requested status of the medical transcription jobs returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public ListMedicalTranscriptionJobsResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The requested status of the medical transcription jobs returned.
     * </p>
     * 
     * @param status
     *        The requested status of the medical transcription jobs returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public ListMedicalTranscriptionJobsResult withStatus(TranscriptionJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The <code>ListMedicalTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum size of the
     * page is set by the <code>MaxResults</code> parameter. If the number of jobs exceeds what can fit on a page,
     * Amazon Transcribe Medical returns the <code>NextPage</code> token. Include the token in the next request to the
     * <code>ListMedicalTranscriptionJobs</code> operation to return in the next page of jobs.
     * </p>
     * 
     * @param nextToken
     *        The <code>ListMedicalTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum size
     *        of the page is set by the <code>MaxResults</code> parameter. If the number of jobs exceeds what can fit on
     *        a page, Amazon Transcribe Medical returns the <code>NextPage</code> token. Include the token in the next
     *        request to the <code>ListMedicalTranscriptionJobs</code> operation to return in the next page of jobs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>ListMedicalTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum size of the
     * page is set by the <code>MaxResults</code> parameter. If the number of jobs exceeds what can fit on a page,
     * Amazon Transcribe Medical returns the <code>NextPage</code> token. Include the token in the next request to the
     * <code>ListMedicalTranscriptionJobs</code> operation to return in the next page of jobs.
     * </p>
     * 
     * @return The <code>ListMedicalTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum
     *         size of the page is set by the <code>MaxResults</code> parameter. If the number of jobs exceeds what can
     *         fit on a page, Amazon Transcribe Medical returns the <code>NextPage</code> token. Include the token in
     *         the next request to the <code>ListMedicalTranscriptionJobs</code> operation to return in the next page of
     *         jobs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>ListMedicalTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum size of the
     * page is set by the <code>MaxResults</code> parameter. If the number of jobs exceeds what can fit on a page,
     * Amazon Transcribe Medical returns the <code>NextPage</code> token. Include the token in the next request to the
     * <code>ListMedicalTranscriptionJobs</code> operation to return in the next page of jobs.
     * </p>
     * 
     * @param nextToken
     *        The <code>ListMedicalTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum size
     *        of the page is set by the <code>MaxResults</code> parameter. If the number of jobs exceeds what can fit on
     *        a page, Amazon Transcribe Medical returns the <code>NextPage</code> token. Include the token in the next
     *        request to the <code>ListMedicalTranscriptionJobs</code> operation to return in the next page of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMedicalTranscriptionJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of objects containing summary information for a transcription job.
     * </p>
     * 
     * @return A list of objects containing summary information for a transcription job.
     */

    public java.util.List<MedicalTranscriptionJobSummary> getMedicalTranscriptionJobSummaries() {
        return medicalTranscriptionJobSummaries;
    }

    /**
     * <p>
     * A list of objects containing summary information for a transcription job.
     * </p>
     * 
     * @param medicalTranscriptionJobSummaries
     *        A list of objects containing summary information for a transcription job.
     */

    public void setMedicalTranscriptionJobSummaries(java.util.Collection<MedicalTranscriptionJobSummary> medicalTranscriptionJobSummaries) {
        if (medicalTranscriptionJobSummaries == null) {
            this.medicalTranscriptionJobSummaries = null;
            return;
        }

        this.medicalTranscriptionJobSummaries = new java.util.ArrayList<MedicalTranscriptionJobSummary>(medicalTranscriptionJobSummaries);
    }

    /**
     * <p>
     * A list of objects containing summary information for a transcription job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMedicalTranscriptionJobSummaries(java.util.Collection)} or
     * {@link #withMedicalTranscriptionJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param medicalTranscriptionJobSummaries
     *        A list of objects containing summary information for a transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMedicalTranscriptionJobsResult withMedicalTranscriptionJobSummaries(MedicalTranscriptionJobSummary... medicalTranscriptionJobSummaries) {
        if (this.medicalTranscriptionJobSummaries == null) {
            setMedicalTranscriptionJobSummaries(new java.util.ArrayList<MedicalTranscriptionJobSummary>(medicalTranscriptionJobSummaries.length));
        }
        for (MedicalTranscriptionJobSummary ele : medicalTranscriptionJobSummaries) {
            this.medicalTranscriptionJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects containing summary information for a transcription job.
     * </p>
     * 
     * @param medicalTranscriptionJobSummaries
     *        A list of objects containing summary information for a transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMedicalTranscriptionJobsResult withMedicalTranscriptionJobSummaries(
            java.util.Collection<MedicalTranscriptionJobSummary> medicalTranscriptionJobSummaries) {
        setMedicalTranscriptionJobSummaries(medicalTranscriptionJobSummaries);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMedicalTranscriptionJobSummaries() != null)
            sb.append("MedicalTranscriptionJobSummaries: ").append(getMedicalTranscriptionJobSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMedicalTranscriptionJobsResult == false)
            return false;
        ListMedicalTranscriptionJobsResult other = (ListMedicalTranscriptionJobsResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMedicalTranscriptionJobSummaries() == null ^ this.getMedicalTranscriptionJobSummaries() == null)
            return false;
        if (other.getMedicalTranscriptionJobSummaries() != null
                && other.getMedicalTranscriptionJobSummaries().equals(this.getMedicalTranscriptionJobSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMedicalTranscriptionJobSummaries() == null) ? 0 : getMedicalTranscriptionJobSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListMedicalTranscriptionJobsResult clone() {
        try {
            return (ListMedicalTranscriptionJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
