/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDataDeletionJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataDeletionJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of data deletion jobs.
     * </p>
     */
    private java.util.List<DataDeletionJobSummary> dataDeletionJobs;
    /**
     * <p>
     * A token for getting the next set of data deletion jobs (if they exist).
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of data deletion jobs.
     * </p>
     * 
     * @return The list of data deletion jobs.
     */

    public java.util.List<DataDeletionJobSummary> getDataDeletionJobs() {
        return dataDeletionJobs;
    }

    /**
     * <p>
     * The list of data deletion jobs.
     * </p>
     * 
     * @param dataDeletionJobs
     *        The list of data deletion jobs.
     */

    public void setDataDeletionJobs(java.util.Collection<DataDeletionJobSummary> dataDeletionJobs) {
        if (dataDeletionJobs == null) {
            this.dataDeletionJobs = null;
            return;
        }

        this.dataDeletionJobs = new java.util.ArrayList<DataDeletionJobSummary>(dataDeletionJobs);
    }

    /**
     * <p>
     * The list of data deletion jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataDeletionJobs(java.util.Collection)} or {@link #withDataDeletionJobs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dataDeletionJobs
     *        The list of data deletion jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataDeletionJobsResult withDataDeletionJobs(DataDeletionJobSummary... dataDeletionJobs) {
        if (this.dataDeletionJobs == null) {
            setDataDeletionJobs(new java.util.ArrayList<DataDeletionJobSummary>(dataDeletionJobs.length));
        }
        for (DataDeletionJobSummary ele : dataDeletionJobs) {
            this.dataDeletionJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of data deletion jobs.
     * </p>
     * 
     * @param dataDeletionJobs
     *        The list of data deletion jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataDeletionJobsResult withDataDeletionJobs(java.util.Collection<DataDeletionJobSummary> dataDeletionJobs) {
        setDataDeletionJobs(dataDeletionJobs);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of data deletion jobs (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of data deletion jobs (if they exist).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of data deletion jobs (if they exist).
     * </p>
     * 
     * @return A token for getting the next set of data deletion jobs (if they exist).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of data deletion jobs (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of data deletion jobs (if they exist).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataDeletionJobsResult withNextToken(String nextToken) {
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
        if (getDataDeletionJobs() != null)
            sb.append("DataDeletionJobs: ").append(getDataDeletionJobs()).append(",");
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

        if (obj instanceof ListDataDeletionJobsResult == false)
            return false;
        ListDataDeletionJobsResult other = (ListDataDeletionJobsResult) obj;
        if (other.getDataDeletionJobs() == null ^ this.getDataDeletionJobs() == null)
            return false;
        if (other.getDataDeletionJobs() != null && other.getDataDeletionJobs().equals(this.getDataDeletionJobs()) == false)
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

        hashCode = prime * hashCode + ((getDataDeletionJobs() == null) ? 0 : getDataDeletionJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDataDeletionJobsResult clone() {
        try {
            return (ListDataDeletionJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
