/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListProcessingJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProcessingJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>ProcessingJobSummary</code> objects, each listing a processing job.
     * </p>
     */
    private java.util.List<ProcessingJobSummary> processingJobSummaries;
    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of processing jobs,
     * use it in the subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>ProcessingJobSummary</code> objects, each listing a processing job.
     * </p>
     * 
     * @return An array of <code>ProcessingJobSummary</code> objects, each listing a processing job.
     */

    public java.util.List<ProcessingJobSummary> getProcessingJobSummaries() {
        return processingJobSummaries;
    }

    /**
     * <p>
     * An array of <code>ProcessingJobSummary</code> objects, each listing a processing job.
     * </p>
     * 
     * @param processingJobSummaries
     *        An array of <code>ProcessingJobSummary</code> objects, each listing a processing job.
     */

    public void setProcessingJobSummaries(java.util.Collection<ProcessingJobSummary> processingJobSummaries) {
        if (processingJobSummaries == null) {
            this.processingJobSummaries = null;
            return;
        }

        this.processingJobSummaries = new java.util.ArrayList<ProcessingJobSummary>(processingJobSummaries);
    }

    /**
     * <p>
     * An array of <code>ProcessingJobSummary</code> objects, each listing a processing job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessingJobSummaries(java.util.Collection)} or
     * {@link #withProcessingJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param processingJobSummaries
     *        An array of <code>ProcessingJobSummary</code> objects, each listing a processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProcessingJobsResult withProcessingJobSummaries(ProcessingJobSummary... processingJobSummaries) {
        if (this.processingJobSummaries == null) {
            setProcessingJobSummaries(new java.util.ArrayList<ProcessingJobSummary>(processingJobSummaries.length));
        }
        for (ProcessingJobSummary ele : processingJobSummaries) {
            this.processingJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProcessingJobSummary</code> objects, each listing a processing job.
     * </p>
     * 
     * @param processingJobSummaries
     *        An array of <code>ProcessingJobSummary</code> objects, each listing a processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProcessingJobsResult withProcessingJobSummaries(java.util.Collection<ProcessingJobSummary> processingJobSummaries) {
        setProcessingJobSummaries(processingJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of processing jobs,
     * use it in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of processing
     *        jobs, use it in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of processing jobs,
     * use it in the subsequent request.
     * </p>
     * 
     * @return If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of processing
     *         jobs, use it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of processing jobs,
     * use it in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of processing
     *        jobs, use it in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProcessingJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getProcessingJobSummaries() != null)
            sb.append("ProcessingJobSummaries: ").append(getProcessingJobSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProcessingJobsResult == false)
            return false;
        ListProcessingJobsResult other = (ListProcessingJobsResult) obj;
        if (other.getProcessingJobSummaries() == null ^ this.getProcessingJobSummaries() == null)
            return false;
        if (other.getProcessingJobSummaries() != null && other.getProcessingJobSummaries().equals(this.getProcessingJobSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessingJobSummaries() == null) ? 0 : getProcessingJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProcessingJobsResult clone() {
        try {
            return (ListProcessingJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
