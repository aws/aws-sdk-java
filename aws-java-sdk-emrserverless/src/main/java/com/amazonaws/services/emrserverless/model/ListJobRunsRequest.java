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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListJobRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobRunsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application for which to list the job run.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The token for the next set of job run results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of job runs that can be listed.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The lower bound of the option to filter by creation date and time.
     * </p>
     */
    private java.util.Date createdAtAfter;
    /**
     * <p>
     * The upper bound of the option to filter by creation date and time.
     * </p>
     */
    private java.util.Date createdAtBefore;
    /**
     * <p>
     * An optional filter for job run states. Note that if this filter contains multiple states, the resulting list will
     * be grouped by the state.
     * </p>
     */
    private java.util.List<String> states;

    /**
     * <p>
     * The ID of the application for which to list the job run.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application for which to list the job run.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application for which to list the job run.
     * </p>
     * 
     * @return The ID of the application for which to list the job run.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application for which to list the job run.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application for which to list the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The token for the next set of job run results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of job run results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of job run results.
     * </p>
     * 
     * @return The token for the next set of job run results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of job run results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of job run results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of job runs that can be listed.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of job runs that can be listed.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of job runs that can be listed.
     * </p>
     * 
     * @return The maximum number of job runs that can be listed.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of job runs that can be listed.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of job runs that can be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The lower bound of the option to filter by creation date and time.
     * </p>
     * 
     * @param createdAtAfter
     *        The lower bound of the option to filter by creation date and time.
     */

    public void setCreatedAtAfter(java.util.Date createdAtAfter) {
        this.createdAtAfter = createdAtAfter;
    }

    /**
     * <p>
     * The lower bound of the option to filter by creation date and time.
     * </p>
     * 
     * @return The lower bound of the option to filter by creation date and time.
     */

    public java.util.Date getCreatedAtAfter() {
        return this.createdAtAfter;
    }

    /**
     * <p>
     * The lower bound of the option to filter by creation date and time.
     * </p>
     * 
     * @param createdAtAfter
     *        The lower bound of the option to filter by creation date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunsRequest withCreatedAtAfter(java.util.Date createdAtAfter) {
        setCreatedAtAfter(createdAtAfter);
        return this;
    }

    /**
     * <p>
     * The upper bound of the option to filter by creation date and time.
     * </p>
     * 
     * @param createdAtBefore
     *        The upper bound of the option to filter by creation date and time.
     */

    public void setCreatedAtBefore(java.util.Date createdAtBefore) {
        this.createdAtBefore = createdAtBefore;
    }

    /**
     * <p>
     * The upper bound of the option to filter by creation date and time.
     * </p>
     * 
     * @return The upper bound of the option to filter by creation date and time.
     */

    public java.util.Date getCreatedAtBefore() {
        return this.createdAtBefore;
    }

    /**
     * <p>
     * The upper bound of the option to filter by creation date and time.
     * </p>
     * 
     * @param createdAtBefore
     *        The upper bound of the option to filter by creation date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunsRequest withCreatedAtBefore(java.util.Date createdAtBefore) {
        setCreatedAtBefore(createdAtBefore);
        return this;
    }

    /**
     * <p>
     * An optional filter for job run states. Note that if this filter contains multiple states, the resulting list will
     * be grouped by the state.
     * </p>
     * 
     * @return An optional filter for job run states. Note that if this filter contains multiple states, the resulting
     *         list will be grouped by the state.
     * @see JobRunState
     */

    public java.util.List<String> getStates() {
        return states;
    }

    /**
     * <p>
     * An optional filter for job run states. Note that if this filter contains multiple states, the resulting list will
     * be grouped by the state.
     * </p>
     * 
     * @param states
     *        An optional filter for job run states. Note that if this filter contains multiple states, the resulting
     *        list will be grouped by the state.
     * @see JobRunState
     */

    public void setStates(java.util.Collection<String> states) {
        if (states == null) {
            this.states = null;
            return;
        }

        this.states = new java.util.ArrayList<String>(states);
    }

    /**
     * <p>
     * An optional filter for job run states. Note that if this filter contains multiple states, the resulting list will
     * be grouped by the state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStates(java.util.Collection)} or {@link #withStates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param states
     *        An optional filter for job run states. Note that if this filter contains multiple states, the resulting
     *        list will be grouped by the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public ListJobRunsRequest withStates(String... states) {
        if (this.states == null) {
            setStates(new java.util.ArrayList<String>(states.length));
        }
        for (String ele : states) {
            this.states.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional filter for job run states. Note that if this filter contains multiple states, the resulting list will
     * be grouped by the state.
     * </p>
     * 
     * @param states
     *        An optional filter for job run states. Note that if this filter contains multiple states, the resulting
     *        list will be grouped by the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public ListJobRunsRequest withStates(java.util.Collection<String> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * An optional filter for job run states. Note that if this filter contains multiple states, the resulting list will
     * be grouped by the state.
     * </p>
     * 
     * @param states
     *        An optional filter for job run states. Note that if this filter contains multiple states, the resulting
     *        list will be grouped by the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public ListJobRunsRequest withStates(JobRunState... states) {
        java.util.ArrayList<String> statesCopy = new java.util.ArrayList<String>(states.length);
        for (JobRunState value : states) {
            statesCopy.add(value.toString());
        }
        if (getStates() == null) {
            setStates(statesCopy);
        } else {
            getStates().addAll(statesCopy);
        }
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getCreatedAtAfter() != null)
            sb.append("CreatedAtAfter: ").append(getCreatedAtAfter()).append(",");
        if (getCreatedAtBefore() != null)
            sb.append("CreatedAtBefore: ").append(getCreatedAtBefore()).append(",");
        if (getStates() != null)
            sb.append("States: ").append(getStates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobRunsRequest == false)
            return false;
        ListJobRunsRequest other = (ListJobRunsRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getCreatedAtAfter() == null ^ this.getCreatedAtAfter() == null)
            return false;
        if (other.getCreatedAtAfter() != null && other.getCreatedAtAfter().equals(this.getCreatedAtAfter()) == false)
            return false;
        if (other.getCreatedAtBefore() == null ^ this.getCreatedAtBefore() == null)
            return false;
        if (other.getCreatedAtBefore() != null && other.getCreatedAtBefore().equals(this.getCreatedAtBefore()) == false)
            return false;
        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getCreatedAtAfter() == null) ? 0 : getCreatedAtAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedAtBefore() == null) ? 0 : getCreatedAtBefore().hashCode());
        hashCode = prime * hashCode + ((getStates() == null) ? 0 : getStates().hashCode());
        return hashCode;
    }

    @Override
    public ListJobRunsRequest clone() {
        return (ListJobRunsRequest) super.clone();
    }

}
