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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListSpeakerEnrollmentJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSpeakerEnrollmentJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the domain containing the speaker enrollment jobs.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * Provides the status of your speaker enrollment Job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain further
     * pages of results. The default is 100; the maximum allowed page size is also 100.
     * </p>
     */
    private Integer maxResults;
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
     * The identifier of the domain containing the speaker enrollment jobs.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain containing the speaker enrollment jobs.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the domain containing the speaker enrollment jobs.
     * </p>
     * 
     * @return The identifier of the domain containing the speaker enrollment jobs.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the domain containing the speaker enrollment jobs.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain containing the speaker enrollment jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSpeakerEnrollmentJobsRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * Provides the status of your speaker enrollment Job.
     * </p>
     * 
     * @param jobStatus
     *        Provides the status of your speaker enrollment Job.
     * @see SpeakerEnrollmentJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Provides the status of your speaker enrollment Job.
     * </p>
     * 
     * @return Provides the status of your speaker enrollment Job.
     * @see SpeakerEnrollmentJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * Provides the status of your speaker enrollment Job.
     * </p>
     * 
     * @param jobStatus
     *        Provides the status of your speaker enrollment Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpeakerEnrollmentJobStatus
     */

    public ListSpeakerEnrollmentJobsRequest withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * Provides the status of your speaker enrollment Job.
     * </p>
     * 
     * @param jobStatus
     *        Provides the status of your speaker enrollment Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpeakerEnrollmentJobStatus
     */

    public ListSpeakerEnrollmentJobsRequest withJobStatus(SpeakerEnrollmentJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain further
     * pages of results. The default is 100; the maximum allowed page size is also 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain
     *        further pages of results. The default is 100; the maximum allowed page size is also 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain further
     * pages of results. The default is 100; the maximum allowed page size is also 100.
     * </p>
     * 
     * @return The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain
     *         further pages of results. The default is 100; the maximum allowed page size is also 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain further
     * pages of results. The default is 100; the maximum allowed page size is also 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain
     *        further pages of results. The default is 100; the maximum allowed page size is also 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSpeakerEnrollmentJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public ListSpeakerEnrollmentJobsRequest withNextToken(String nextToken) {
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
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

        if (obj instanceof ListSpeakerEnrollmentJobsRequest == false)
            return false;
        ListSpeakerEnrollmentJobsRequest other = (ListSpeakerEnrollmentJobsRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
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

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSpeakerEnrollmentJobsRequest clone() {
        return (ListSpeakerEnrollmentJobsRequest) super.clone();
    }

}
