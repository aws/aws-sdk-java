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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListCallAnalyticsJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCallAnalyticsJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists all Call Analytics jobs that have the status specified in your request. Jobs are ordered by creation date,
     * with the newest job first.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Provides a summary of information about each result.
     * </p>
     */
    private java.util.List<CallAnalyticsJobSummary> callAnalyticsJobSummaries;

    /**
     * <p>
     * Lists all Call Analytics jobs that have the status specified in your request. Jobs are ordered by creation date,
     * with the newest job first.
     * </p>
     * 
     * @param status
     *        Lists all Call Analytics jobs that have the status specified in your request. Jobs are ordered by creation
     *        date, with the newest job first.
     * @see CallAnalyticsJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Lists all Call Analytics jobs that have the status specified in your request. Jobs are ordered by creation date,
     * with the newest job first.
     * </p>
     * 
     * @return Lists all Call Analytics jobs that have the status specified in your request. Jobs are ordered by
     *         creation date, with the newest job first.
     * @see CallAnalyticsJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Lists all Call Analytics jobs that have the status specified in your request. Jobs are ordered by creation date,
     * with the newest job first.
     * </p>
     * 
     * @param status
     *        Lists all Call Analytics jobs that have the status specified in your request. Jobs are ordered by creation
     *        date, with the newest job first.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsJobStatus
     */

    public ListCallAnalyticsJobsResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Lists all Call Analytics jobs that have the status specified in your request. Jobs are ordered by creation date,
     * with the newest job first.
     * </p>
     * 
     * @param status
     *        Lists all Call Analytics jobs that have the status specified in your request. Jobs are ordered by creation
     *        date, with the newest job first.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsJobStatus
     */

    public ListCallAnalyticsJobsResult withStatus(CallAnalyticsJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To
     *        view the next set of results, copy the string associated with the <code>NextToken</code> parameter in your
     *        results output, then run your request again including <code>NextToken</code> with the value of the copied
     *        string. Repeat as needed to view all your results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     * 
     * @return If <code>NextToken</code> is present in your response, it indicates that not all results are displayed.
     *         To view the next set of results, copy the string associated with the <code>NextToken</code> parameter in
     *         your results output, then run your request again including <code>NextToken</code> with the value of the
     *         copied string. Repeat as needed to view all your results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To
     *        view the next set of results, copy the string associated with the <code>NextToken</code> parameter in your
     *        results output, then run your request again including <code>NextToken</code> with the value of the copied
     *        string. Repeat as needed to view all your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCallAnalyticsJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Provides a summary of information about each result.
     * </p>
     * 
     * @return Provides a summary of information about each result.
     */

    public java.util.List<CallAnalyticsJobSummary> getCallAnalyticsJobSummaries() {
        return callAnalyticsJobSummaries;
    }

    /**
     * <p>
     * Provides a summary of information about each result.
     * </p>
     * 
     * @param callAnalyticsJobSummaries
     *        Provides a summary of information about each result.
     */

    public void setCallAnalyticsJobSummaries(java.util.Collection<CallAnalyticsJobSummary> callAnalyticsJobSummaries) {
        if (callAnalyticsJobSummaries == null) {
            this.callAnalyticsJobSummaries = null;
            return;
        }

        this.callAnalyticsJobSummaries = new java.util.ArrayList<CallAnalyticsJobSummary>(callAnalyticsJobSummaries);
    }

    /**
     * <p>
     * Provides a summary of information about each result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCallAnalyticsJobSummaries(java.util.Collection)} or
     * {@link #withCallAnalyticsJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param callAnalyticsJobSummaries
     *        Provides a summary of information about each result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCallAnalyticsJobsResult withCallAnalyticsJobSummaries(CallAnalyticsJobSummary... callAnalyticsJobSummaries) {
        if (this.callAnalyticsJobSummaries == null) {
            setCallAnalyticsJobSummaries(new java.util.ArrayList<CallAnalyticsJobSummary>(callAnalyticsJobSummaries.length));
        }
        for (CallAnalyticsJobSummary ele : callAnalyticsJobSummaries) {
            this.callAnalyticsJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides a summary of information about each result.
     * </p>
     * 
     * @param callAnalyticsJobSummaries
     *        Provides a summary of information about each result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCallAnalyticsJobsResult withCallAnalyticsJobSummaries(java.util.Collection<CallAnalyticsJobSummary> callAnalyticsJobSummaries) {
        setCallAnalyticsJobSummaries(callAnalyticsJobSummaries);
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
        if (getCallAnalyticsJobSummaries() != null)
            sb.append("CallAnalyticsJobSummaries: ").append(getCallAnalyticsJobSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCallAnalyticsJobsResult == false)
            return false;
        ListCallAnalyticsJobsResult other = (ListCallAnalyticsJobsResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCallAnalyticsJobSummaries() == null ^ this.getCallAnalyticsJobSummaries() == null)
            return false;
        if (other.getCallAnalyticsJobSummaries() != null && other.getCallAnalyticsJobSummaries().equals(this.getCallAnalyticsJobSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCallAnalyticsJobSummaries() == null) ? 0 : getCallAnalyticsJobSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListCallAnalyticsJobsResult clone() {
        try {
            return (ListCallAnalyticsJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
