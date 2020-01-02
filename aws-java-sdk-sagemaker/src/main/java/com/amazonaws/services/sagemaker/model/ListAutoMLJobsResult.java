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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAutoMLJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAutoMLJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a summary list of jobs.
     * </p>
     */
    private java.util.List<AutoMLJobSummary> autoMLJobSummaries;
    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a summary list of jobs.
     * </p>
     * 
     * @return Returns a summary list of jobs.
     */

    public java.util.List<AutoMLJobSummary> getAutoMLJobSummaries() {
        return autoMLJobSummaries;
    }

    /**
     * <p>
     * Returns a summary list of jobs.
     * </p>
     * 
     * @param autoMLJobSummaries
     *        Returns a summary list of jobs.
     */

    public void setAutoMLJobSummaries(java.util.Collection<AutoMLJobSummary> autoMLJobSummaries) {
        if (autoMLJobSummaries == null) {
            this.autoMLJobSummaries = null;
            return;
        }

        this.autoMLJobSummaries = new java.util.ArrayList<AutoMLJobSummary>(autoMLJobSummaries);
    }

    /**
     * <p>
     * Returns a summary list of jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoMLJobSummaries(java.util.Collection)} or {@link #withAutoMLJobSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param autoMLJobSummaries
     *        Returns a summary list of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutoMLJobsResult withAutoMLJobSummaries(AutoMLJobSummary... autoMLJobSummaries) {
        if (this.autoMLJobSummaries == null) {
            setAutoMLJobSummaries(new java.util.ArrayList<AutoMLJobSummary>(autoMLJobSummaries.length));
        }
        for (AutoMLJobSummary ele : autoMLJobSummaries) {
            this.autoMLJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a summary list of jobs.
     * </p>
     * 
     * @param autoMLJobSummaries
     *        Returns a summary list of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutoMLJobsResult withAutoMLJobSummaries(java.util.Collection<AutoMLJobSummary> autoMLJobSummaries) {
        setAutoMLJobSummaries(autoMLJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you will receive this token. Use it in your next request to
     *        receive the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @return If the previous response was truncated, you will receive this token. Use it in your next request to
     *         receive the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you will receive this token. Use it in your next request to
     *        receive the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutoMLJobsResult withNextToken(String nextToken) {
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
        if (getAutoMLJobSummaries() != null)
            sb.append("AutoMLJobSummaries: ").append(getAutoMLJobSummaries()).append(",");
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

        if (obj instanceof ListAutoMLJobsResult == false)
            return false;
        ListAutoMLJobsResult other = (ListAutoMLJobsResult) obj;
        if (other.getAutoMLJobSummaries() == null ^ this.getAutoMLJobSummaries() == null)
            return false;
        if (other.getAutoMLJobSummaries() != null && other.getAutoMLJobSummaries().equals(this.getAutoMLJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAutoMLJobSummaries() == null) ? 0 : getAutoMLJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAutoMLJobsResult clone() {
        try {
            return (ListAutoMLJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
