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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListSyncJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSyncJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The listed SyncJob summaries.
     * </p>
     */
    private java.util.List<SyncJobSummary> syncJobSummaries;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The listed SyncJob summaries.
     * </p>
     * 
     * @return The listed SyncJob summaries.
     */

    public java.util.List<SyncJobSummary> getSyncJobSummaries() {
        return syncJobSummaries;
    }

    /**
     * <p>
     * The listed SyncJob summaries.
     * </p>
     * 
     * @param syncJobSummaries
     *        The listed SyncJob summaries.
     */

    public void setSyncJobSummaries(java.util.Collection<SyncJobSummary> syncJobSummaries) {
        if (syncJobSummaries == null) {
            this.syncJobSummaries = null;
            return;
        }

        this.syncJobSummaries = new java.util.ArrayList<SyncJobSummary>(syncJobSummaries);
    }

    /**
     * <p>
     * The listed SyncJob summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSyncJobSummaries(java.util.Collection)} or {@link #withSyncJobSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param syncJobSummaries
     *        The listed SyncJob summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncJobsResult withSyncJobSummaries(SyncJobSummary... syncJobSummaries) {
        if (this.syncJobSummaries == null) {
            setSyncJobSummaries(new java.util.ArrayList<SyncJobSummary>(syncJobSummaries.length));
        }
        for (SyncJobSummary ele : syncJobSummaries) {
            this.syncJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The listed SyncJob summaries.
     * </p>
     * 
     * @param syncJobSummaries
     *        The listed SyncJob summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncJobsResult withSyncJobSummaries(java.util.Collection<SyncJobSummary> syncJobSummaries) {
        setSyncJobSummaries(syncJobSummaries);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @return The string that specifies the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncJobsResult withNextToken(String nextToken) {
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
        if (getSyncJobSummaries() != null)
            sb.append("SyncJobSummaries: ").append(getSyncJobSummaries()).append(",");
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

        if (obj instanceof ListSyncJobsResult == false)
            return false;
        ListSyncJobsResult other = (ListSyncJobsResult) obj;
        if (other.getSyncJobSummaries() == null ^ this.getSyncJobSummaries() == null)
            return false;
        if (other.getSyncJobSummaries() != null && other.getSyncJobSummaries().equals(this.getSyncJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSyncJobSummaries() == null) ? 0 : getSyncJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSyncJobsResult clone() {
        try {
            return (ListSyncJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
