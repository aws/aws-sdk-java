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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListJobRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobRunsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the virtual cluster for which to list the job run.
     * </p>
     */
    private String virtualClusterId;
    /**
     * <p>
     * The date and time before which the job runs were submitted.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * The date and time after which the job runs were submitted.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * The name of the job run.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The states of the job run.
     * </p>
     */
    private java.util.List<String> states;
    /**
     * <p>
     * The maximum number of job runs that can be listed.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of job runs to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the virtual cluster for which to list the job run.
     * </p>
     * 
     * @param virtualClusterId
     *        The ID of the virtual cluster for which to list the job run.
     */

    public void setVirtualClusterId(String virtualClusterId) {
        this.virtualClusterId = virtualClusterId;
    }

    /**
     * <p>
     * The ID of the virtual cluster for which to list the job run.
     * </p>
     * 
     * @return The ID of the virtual cluster for which to list the job run.
     */

    public String getVirtualClusterId() {
        return this.virtualClusterId;
    }

    /**
     * <p>
     * The ID of the virtual cluster for which to list the job run.
     * </p>
     * 
     * @param virtualClusterId
     *        The ID of the virtual cluster for which to list the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunsRequest withVirtualClusterId(String virtualClusterId) {
        setVirtualClusterId(virtualClusterId);
        return this;
    }

    /**
     * <p>
     * The date and time before which the job runs were submitted.
     * </p>
     * 
     * @param createdBefore
     *        The date and time before which the job runs were submitted.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * The date and time before which the job runs were submitted.
     * </p>
     * 
     * @return The date and time before which the job runs were submitted.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * The date and time before which the job runs were submitted.
     * </p>
     * 
     * @param createdBefore
     *        The date and time before which the job runs were submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunsRequest withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * The date and time after which the job runs were submitted.
     * </p>
     * 
     * @param createdAfter
     *        The date and time after which the job runs were submitted.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * The date and time after which the job runs were submitted.
     * </p>
     * 
     * @return The date and time after which the job runs were submitted.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * The date and time after which the job runs were submitted.
     * </p>
     * 
     * @param createdAfter
     *        The date and time after which the job runs were submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunsRequest withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * The name of the job run.
     * </p>
     * 
     * @param name
     *        The name of the job run.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the job run.
     * </p>
     * 
     * @return The name of the job run.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the job run.
     * </p>
     * 
     * @param name
     *        The name of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The states of the job run.
     * </p>
     * 
     * @return The states of the job run.
     * @see JobRunState
     */

    public java.util.List<String> getStates() {
        return states;
    }

    /**
     * <p>
     * The states of the job run.
     * </p>
     * 
     * @param states
     *        The states of the job run.
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
     * The states of the job run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStates(java.util.Collection)} or {@link #withStates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param states
     *        The states of the job run.
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
     * The states of the job run.
     * </p>
     * 
     * @param states
     *        The states of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public ListJobRunsRequest withStates(java.util.Collection<String> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * The states of the job run.
     * </p>
     * 
     * @param states
     *        The states of the job run.
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
     * The token for the next set of job runs to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of job runs to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of job runs to return.
     * </p>
     * 
     * @return The token for the next set of job runs to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of job runs to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of job runs to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunsRequest withNextToken(String nextToken) {
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
        if (getVirtualClusterId() != null)
            sb.append("VirtualClusterId: ").append(getVirtualClusterId()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStates() != null)
            sb.append("States: ").append(getStates()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListJobRunsRequest == false)
            return false;
        ListJobRunsRequest other = (ListJobRunsRequest) obj;
        if (other.getVirtualClusterId() == null ^ this.getVirtualClusterId() == null)
            return false;
        if (other.getVirtualClusterId() != null && other.getVirtualClusterId().equals(this.getVirtualClusterId()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getVirtualClusterId() == null) ? 0 : getVirtualClusterId().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStates() == null) ? 0 : getStates().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListJobRunsRequest clone() {
        return (ListJobRunsRequest) super.clone();
    }

}
