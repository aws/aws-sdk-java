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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHyperParameterTuningJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHyperParameterTuningJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <a>HyperParameterTuningJobSummary</a> objects that describe the tuning jobs that the
     * <code>ListHyperParameterTuningJobs</code> request returned.
     * </p>
     */
    private java.util.List<HyperParameterTuningJobSummary> hyperParameterTuningJobSummaries;
    /**
     * <p>
     * If the result of this <code>ListHyperParameterTuningJobs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <a>HyperParameterTuningJobSummary</a> objects that describe the tuning jobs that the
     * <code>ListHyperParameterTuningJobs</code> request returned.
     * </p>
     * 
     * @return A list of <a>HyperParameterTuningJobSummary</a> objects that describe the tuning jobs that the
     *         <code>ListHyperParameterTuningJobs</code> request returned.
     */

    public java.util.List<HyperParameterTuningJobSummary> getHyperParameterTuningJobSummaries() {
        return hyperParameterTuningJobSummaries;
    }

    /**
     * <p>
     * A list of <a>HyperParameterTuningJobSummary</a> objects that describe the tuning jobs that the
     * <code>ListHyperParameterTuningJobs</code> request returned.
     * </p>
     * 
     * @param hyperParameterTuningJobSummaries
     *        A list of <a>HyperParameterTuningJobSummary</a> objects that describe the tuning jobs that the
     *        <code>ListHyperParameterTuningJobs</code> request returned.
     */

    public void setHyperParameterTuningJobSummaries(java.util.Collection<HyperParameterTuningJobSummary> hyperParameterTuningJobSummaries) {
        if (hyperParameterTuningJobSummaries == null) {
            this.hyperParameterTuningJobSummaries = null;
            return;
        }

        this.hyperParameterTuningJobSummaries = new java.util.ArrayList<HyperParameterTuningJobSummary>(hyperParameterTuningJobSummaries);
    }

    /**
     * <p>
     * A list of <a>HyperParameterTuningJobSummary</a> objects that describe the tuning jobs that the
     * <code>ListHyperParameterTuningJobs</code> request returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHyperParameterTuningJobSummaries(java.util.Collection)} or
     * {@link #withHyperParameterTuningJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param hyperParameterTuningJobSummaries
     *        A list of <a>HyperParameterTuningJobSummary</a> objects that describe the tuning jobs that the
     *        <code>ListHyperParameterTuningJobs</code> request returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHyperParameterTuningJobsResult withHyperParameterTuningJobSummaries(HyperParameterTuningJobSummary... hyperParameterTuningJobSummaries) {
        if (this.hyperParameterTuningJobSummaries == null) {
            setHyperParameterTuningJobSummaries(new java.util.ArrayList<HyperParameterTuningJobSummary>(hyperParameterTuningJobSummaries.length));
        }
        for (HyperParameterTuningJobSummary ele : hyperParameterTuningJobSummaries) {
            this.hyperParameterTuningJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>HyperParameterTuningJobSummary</a> objects that describe the tuning jobs that the
     * <code>ListHyperParameterTuningJobs</code> request returned.
     * </p>
     * 
     * @param hyperParameterTuningJobSummaries
     *        A list of <a>HyperParameterTuningJobSummary</a> objects that describe the tuning jobs that the
     *        <code>ListHyperParameterTuningJobs</code> request returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHyperParameterTuningJobsResult withHyperParameterTuningJobSummaries(
            java.util.Collection<HyperParameterTuningJobSummary> hyperParameterTuningJobSummaries) {
        setHyperParameterTuningJobSummaries(hyperParameterTuningJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the result of this <code>ListHyperParameterTuningJobs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of this <code>ListHyperParameterTuningJobs</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the next
     *        request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of this <code>ListHyperParameterTuningJobs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the next request.
     * </p>
     * 
     * @return If the result of this <code>ListHyperParameterTuningJobs</code> request was truncated, the response
     *         includes a <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the next
     *         request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of this <code>ListHyperParameterTuningJobs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of this <code>ListHyperParameterTuningJobs</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the next
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHyperParameterTuningJobsResult withNextToken(String nextToken) {
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
        if (getHyperParameterTuningJobSummaries() != null)
            sb.append("HyperParameterTuningJobSummaries: ").append(getHyperParameterTuningJobSummaries()).append(",");
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

        if (obj instanceof ListHyperParameterTuningJobsResult == false)
            return false;
        ListHyperParameterTuningJobsResult other = (ListHyperParameterTuningJobsResult) obj;
        if (other.getHyperParameterTuningJobSummaries() == null ^ this.getHyperParameterTuningJobSummaries() == null)
            return false;
        if (other.getHyperParameterTuningJobSummaries() != null
                && other.getHyperParameterTuningJobSummaries().equals(this.getHyperParameterTuningJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getHyperParameterTuningJobSummaries() == null) ? 0 : getHyperParameterTuningJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHyperParameterTuningJobsResult clone() {
        try {
            return (ListHyperParameterTuningJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
