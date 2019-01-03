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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTranscriptionJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTranscriptionJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested status of the jobs returned.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The <code>ListTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum size of the page
     * is set by the <code>MaxResults</code> parameter. If there are more jobs in the list than the page size, Amazon
     * Transcribe returns the <code>NextPage</code> token. Include the token in the next request to the
     * <code>ListTranscriptionJobs</code> operation to return in the next page of jobs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of objects containing summary information for a transcription job.
     * </p>
     */
    private java.util.List<TranscriptionJobSummary> transcriptionJobSummaries;

    /**
     * <p>
     * The requested status of the jobs returned.
     * </p>
     * 
     * @param status
     *        The requested status of the jobs returned.
     * @see TranscriptionJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The requested status of the jobs returned.
     * </p>
     * 
     * @return The requested status of the jobs returned.
     * @see TranscriptionJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The requested status of the jobs returned.
     * </p>
     * 
     * @param status
     *        The requested status of the jobs returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public ListTranscriptionJobsResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The requested status of the jobs returned.
     * </p>
     * 
     * @param status
     *        The requested status of the jobs returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public ListTranscriptionJobsResult withStatus(TranscriptionJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The <code>ListTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum size of the page
     * is set by the <code>MaxResults</code> parameter. If there are more jobs in the list than the page size, Amazon
     * Transcribe returns the <code>NextPage</code> token. Include the token in the next request to the
     * <code>ListTranscriptionJobs</code> operation to return in the next page of jobs.
     * </p>
     * 
     * @param nextToken
     *        The <code>ListTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum size of the
     *        page is set by the <code>MaxResults</code> parameter. If there are more jobs in the list than the page
     *        size, Amazon Transcribe returns the <code>NextPage</code> token. Include the token in the next request to
     *        the <code>ListTranscriptionJobs</code> operation to return in the next page of jobs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>ListTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum size of the page
     * is set by the <code>MaxResults</code> parameter. If there are more jobs in the list than the page size, Amazon
     * Transcribe returns the <code>NextPage</code> token. Include the token in the next request to the
     * <code>ListTranscriptionJobs</code> operation to return in the next page of jobs.
     * </p>
     * 
     * @return The <code>ListTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum size of
     *         the page is set by the <code>MaxResults</code> parameter. If there are more jobs in the list than the
     *         page size, Amazon Transcribe returns the <code>NextPage</code> token. Include the token in the next
     *         request to the <code>ListTranscriptionJobs</code> operation to return in the next page of jobs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>ListTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum size of the page
     * is set by the <code>MaxResults</code> parameter. If there are more jobs in the list than the page size, Amazon
     * Transcribe returns the <code>NextPage</code> token. Include the token in the next request to the
     * <code>ListTranscriptionJobs</code> operation to return in the next page of jobs.
     * </p>
     * 
     * @param nextToken
     *        The <code>ListTranscriptionJobs</code> operation returns a page of jobs at a time. The maximum size of the
     *        page is set by the <code>MaxResults</code> parameter. If there are more jobs in the list than the page
     *        size, Amazon Transcribe returns the <code>NextPage</code> token. Include the token in the next request to
     *        the <code>ListTranscriptionJobs</code> operation to return in the next page of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTranscriptionJobsResult withNextToken(String nextToken) {
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

    public java.util.List<TranscriptionJobSummary> getTranscriptionJobSummaries() {
        return transcriptionJobSummaries;
    }

    /**
     * <p>
     * A list of objects containing summary information for a transcription job.
     * </p>
     * 
     * @param transcriptionJobSummaries
     *        A list of objects containing summary information for a transcription job.
     */

    public void setTranscriptionJobSummaries(java.util.Collection<TranscriptionJobSummary> transcriptionJobSummaries) {
        if (transcriptionJobSummaries == null) {
            this.transcriptionJobSummaries = null;
            return;
        }

        this.transcriptionJobSummaries = new java.util.ArrayList<TranscriptionJobSummary>(transcriptionJobSummaries);
    }

    /**
     * <p>
     * A list of objects containing summary information for a transcription job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTranscriptionJobSummaries(java.util.Collection)} or
     * {@link #withTranscriptionJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transcriptionJobSummaries
     *        A list of objects containing summary information for a transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTranscriptionJobsResult withTranscriptionJobSummaries(TranscriptionJobSummary... transcriptionJobSummaries) {
        if (this.transcriptionJobSummaries == null) {
            setTranscriptionJobSummaries(new java.util.ArrayList<TranscriptionJobSummary>(transcriptionJobSummaries.length));
        }
        for (TranscriptionJobSummary ele : transcriptionJobSummaries) {
            this.transcriptionJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects containing summary information for a transcription job.
     * </p>
     * 
     * @param transcriptionJobSummaries
     *        A list of objects containing summary information for a transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTranscriptionJobsResult withTranscriptionJobSummaries(java.util.Collection<TranscriptionJobSummary> transcriptionJobSummaries) {
        setTranscriptionJobSummaries(transcriptionJobSummaries);
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
        if (getTranscriptionJobSummaries() != null)
            sb.append("TranscriptionJobSummaries: ").append(getTranscriptionJobSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTranscriptionJobsResult == false)
            return false;
        ListTranscriptionJobsResult other = (ListTranscriptionJobsResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTranscriptionJobSummaries() == null ^ this.getTranscriptionJobSummaries() == null)
            return false;
        if (other.getTranscriptionJobSummaries() != null && other.getTranscriptionJobSummaries().equals(this.getTranscriptionJobSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTranscriptionJobSummaries() == null) ? 0 : getTranscriptionJobSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListTranscriptionJobsResult clone() {
        try {
            return (ListTranscriptionJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
