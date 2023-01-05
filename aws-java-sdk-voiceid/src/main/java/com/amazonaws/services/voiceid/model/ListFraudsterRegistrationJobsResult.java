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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListFraudsterRegistrationJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFraudsterRegistrationJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list containing details about each specified fraudster registration job.
     * </p>
     */
    private java.util.List<FraudsterRegistrationJobSummary> jobSummaries;
    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list containing details about each specified fraudster registration job.
     * </p>
     * 
     * @return A list containing details about each specified fraudster registration job.
     */

    public java.util.List<FraudsterRegistrationJobSummary> getJobSummaries() {
        return jobSummaries;
    }

    /**
     * <p>
     * A list containing details about each specified fraudster registration job.
     * </p>
     * 
     * @param jobSummaries
     *        A list containing details about each specified fraudster registration job.
     */

    public void setJobSummaries(java.util.Collection<FraudsterRegistrationJobSummary> jobSummaries) {
        if (jobSummaries == null) {
            this.jobSummaries = null;
            return;
        }

        this.jobSummaries = new java.util.ArrayList<FraudsterRegistrationJobSummary>(jobSummaries);
    }

    /**
     * <p>
     * A list containing details about each specified fraudster registration job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobSummaries(java.util.Collection)} or {@link #withJobSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobSummaries
     *        A list containing details about each specified fraudster registration job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFraudsterRegistrationJobsResult withJobSummaries(FraudsterRegistrationJobSummary... jobSummaries) {
        if (this.jobSummaries == null) {
            setJobSummaries(new java.util.ArrayList<FraudsterRegistrationJobSummary>(jobSummaries.length));
        }
        for (FraudsterRegistrationJobSummary ele : jobSummaries) {
            this.jobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing details about each specified fraudster registration job.
     * </p>
     * 
     * @param jobSummaries
     *        A list containing details about each specified fraudster registration job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFraudsterRegistrationJobsResult withJobSummaries(java.util.Collection<FraudsterRegistrationJobSummary> jobSummaries) {
        setJobSummaries(jobSummaries);
        return this;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @return If <code>NextToken</code> is returned, there are more results available. The value of
     *         <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *         24 hours.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFraudsterRegistrationJobsResult withNextToken(String nextToken) {
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
        if (getJobSummaries() != null)
            sb.append("JobSummaries: ").append(getJobSummaries()).append(",");
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

        if (obj instanceof ListFraudsterRegistrationJobsResult == false)
            return false;
        ListFraudsterRegistrationJobsResult other = (ListFraudsterRegistrationJobsResult) obj;
        if (other.getJobSummaries() == null ^ this.getJobSummaries() == null)
            return false;
        if (other.getJobSummaries() != null && other.getJobSummaries().equals(this.getJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getJobSummaries() == null) ? 0 : getJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFraudsterRegistrationJobsResult clone() {
        try {
            return (ListFraudsterRegistrationJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
