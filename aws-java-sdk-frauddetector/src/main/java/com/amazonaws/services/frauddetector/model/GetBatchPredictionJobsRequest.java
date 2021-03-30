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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetBatchPredictionJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBatchPredictionJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The batch prediction job for which to get the details.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The next token from the previous request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The batch prediction job for which to get the details.
     * </p>
     * 
     * @param jobId
     *        The batch prediction job for which to get the details.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The batch prediction job for which to get the details.
     * </p>
     * 
     * @return The batch prediction job for which to get the details.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The batch prediction job for which to get the details.
     * </p>
     * 
     * @param jobId
     *        The batch prediction job for which to get the details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBatchPredictionJobsRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects to return for the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     * 
     * @return The maximum number of objects to return for the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects to return for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBatchPredictionJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The next token from the previous request.
     * </p>
     * 
     * @param nextToken
     *        The next token from the previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token from the previous request.
     * </p>
     * 
     * @return The next token from the previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token from the previous request.
     * </p>
     * 
     * @param nextToken
     *        The next token from the previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBatchPredictionJobsRequest withNextToken(String nextToken) {
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
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

        if (obj instanceof GetBatchPredictionJobsRequest == false)
            return false;
        GetBatchPredictionJobsRequest other = (GetBatchPredictionJobsRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetBatchPredictionJobsRequest clone() {
        return (GetBatchPredictionJobsRequest) super.clone();
    }

}
