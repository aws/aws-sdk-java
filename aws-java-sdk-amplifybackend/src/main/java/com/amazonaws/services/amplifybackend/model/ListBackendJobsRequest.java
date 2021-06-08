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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request body for ListBackendJobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/ListBackendJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackendJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The app ID.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The name of the backend environment.
     * </p>
     */
    private String backendEnvironmentName;
    /**
     * <p>
     * The ID for the job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The maximum number of results that you want in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Filters the list of response objects to include only those with the specified operation name.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * Filters the list of response objects to include only those with the specified status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @return The app ID.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendJobsRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The name of the backend environment.
     * </p>
     * 
     * @param backendEnvironmentName
     *        The name of the backend environment.
     */

    public void setBackendEnvironmentName(String backendEnvironmentName) {
        this.backendEnvironmentName = backendEnvironmentName;
    }

    /**
     * <p>
     * The name of the backend environment.
     * </p>
     * 
     * @return The name of the backend environment.
     */

    public String getBackendEnvironmentName() {
        return this.backendEnvironmentName;
    }

    /**
     * <p>
     * The name of the backend environment.
     * </p>
     * 
     * @param backendEnvironmentName
     *        The name of the backend environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendJobsRequest withBackendEnvironmentName(String backendEnvironmentName) {
        setBackendEnvironmentName(backendEnvironmentName);
        return this;
    }

    /**
     * <p>
     * The ID for the job.
     * </p>
     * 
     * @param jobId
     *        The ID for the job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID for the job.
     * </p>
     * 
     * @return The ID for the job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID for the job.
     * </p>
     * 
     * @param jobId
     *        The ID for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendJobsRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that you want in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that you want in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want in the response.
     * </p>
     * 
     * @return The maximum number of results that you want in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that you want in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Filters the list of response objects to include only those with the specified operation name.
     * </p>
     * 
     * @param operation
     *        Filters the list of response objects to include only those with the specified operation name.
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * Filters the list of response objects to include only those with the specified operation name.
     * </p>
     * 
     * @return Filters the list of response objects to include only those with the specified operation name.
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * Filters the list of response objects to include only those with the specified operation name.
     * </p>
     * 
     * @param operation
     *        Filters the list of response objects to include only those with the specified operation name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendJobsRequest withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * Filters the list of response objects to include only those with the specified status.
     * </p>
     * 
     * @param status
     *        Filters the list of response objects to include only those with the specified status.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Filters the list of response objects to include only those with the specified status.
     * </p>
     * 
     * @return Filters the list of response objects to include only those with the specified status.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Filters the list of response objects to include only those with the specified status.
     * </p>
     * 
     * @param status
     *        Filters the list of response objects to include only those with the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackendJobsRequest withStatus(String status) {
        setStatus(status);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getBackendEnvironmentName() != null)
            sb.append("BackendEnvironmentName: ").append(getBackendEnvironmentName()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackendJobsRequest == false)
            return false;
        ListBackendJobsRequest other = (ListBackendJobsRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBackendEnvironmentName() == null ^ this.getBackendEnvironmentName() == null)
            return false;
        if (other.getBackendEnvironmentName() != null && other.getBackendEnvironmentName().equals(this.getBackendEnvironmentName()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBackendEnvironmentName() == null) ? 0 : getBackendEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListBackendJobsRequest clone() {
        return (ListBackendJobsRequest) super.clone();
    }

}
