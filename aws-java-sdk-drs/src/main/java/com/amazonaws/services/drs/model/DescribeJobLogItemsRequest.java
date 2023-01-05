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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeJobLogItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobLogItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Job for which Job log items will be retrieved.
     * </p>
     */
    private String jobID;
    /**
     * <p>
     * Maximum number of Job log items to retrieve.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token of the next Job log items to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the Job for which Job log items will be retrieved.
     * </p>
     * 
     * @param jobID
     *        The ID of the Job for which Job log items will be retrieved.
     */

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    /**
     * <p>
     * The ID of the Job for which Job log items will be retrieved.
     * </p>
     * 
     * @return The ID of the Job for which Job log items will be retrieved.
     */

    public String getJobID() {
        return this.jobID;
    }

    /**
     * <p>
     * The ID of the Job for which Job log items will be retrieved.
     * </p>
     * 
     * @param jobID
     *        The ID of the Job for which Job log items will be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobLogItemsRequest withJobID(String jobID) {
        setJobID(jobID);
        return this;
    }

    /**
     * <p>
     * Maximum number of Job log items to retrieve.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of Job log items to retrieve.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of Job log items to retrieve.
     * </p>
     * 
     * @return Maximum number of Job log items to retrieve.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of Job log items to retrieve.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of Job log items to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobLogItemsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token of the next Job log items to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The token of the next Job log items to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token of the next Job log items to retrieve.
     * </p>
     * 
     * @return The token of the next Job log items to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token of the next Job log items to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The token of the next Job log items to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobLogItemsRequest withNextToken(String nextToken) {
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
        if (getJobID() != null)
            sb.append("JobID: ").append(getJobID()).append(",");
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

        if (obj instanceof DescribeJobLogItemsRequest == false)
            return false;
        DescribeJobLogItemsRequest other = (DescribeJobLogItemsRequest) obj;
        if (other.getJobID() == null ^ this.getJobID() == null)
            return false;
        if (other.getJobID() != null && other.getJobID().equals(this.getJobID()) == false)
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

        hashCode = prime * hashCode + ((getJobID() == null) ? 0 : getJobID().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobLogItemsRequest clone() {
        return (DescribeJobLogItemsRequest) super.clone();
    }

}
