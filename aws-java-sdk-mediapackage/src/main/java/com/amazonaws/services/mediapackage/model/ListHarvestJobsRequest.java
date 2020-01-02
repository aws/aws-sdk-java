/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListHarvestJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHarvestJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** When specified, the request will return only HarvestJobs associated with the given Channel ID. */
    private String includeChannelId;
    /** When specified, the request will return only HarvestJobs in the given status. */
    private String includeStatus;
    /** The upper bound on the number of records to return. */
    private Integer maxResults;
    /** A token used to resume pagination from the end of a previous request. */
    private String nextToken;

    /**
     * When specified, the request will return only HarvestJobs associated with the given Channel ID.
     * 
     * @param includeChannelId
     *        When specified, the request will return only HarvestJobs associated with the given Channel ID.
     */

    public void setIncludeChannelId(String includeChannelId) {
        this.includeChannelId = includeChannelId;
    }

    /**
     * When specified, the request will return only HarvestJobs associated with the given Channel ID.
     * 
     * @return When specified, the request will return only HarvestJobs associated with the given Channel ID.
     */

    public String getIncludeChannelId() {
        return this.includeChannelId;
    }

    /**
     * When specified, the request will return only HarvestJobs associated with the given Channel ID.
     * 
     * @param includeChannelId
     *        When specified, the request will return only HarvestJobs associated with the given Channel ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHarvestJobsRequest withIncludeChannelId(String includeChannelId) {
        setIncludeChannelId(includeChannelId);
        return this;
    }

    /**
     * When specified, the request will return only HarvestJobs in the given status.
     * 
     * @param includeStatus
     *        When specified, the request will return only HarvestJobs in the given status.
     */

    public void setIncludeStatus(String includeStatus) {
        this.includeStatus = includeStatus;
    }

    /**
     * When specified, the request will return only HarvestJobs in the given status.
     * 
     * @return When specified, the request will return only HarvestJobs in the given status.
     */

    public String getIncludeStatus() {
        return this.includeStatus;
    }

    /**
     * When specified, the request will return only HarvestJobs in the given status.
     * 
     * @param includeStatus
     *        When specified, the request will return only HarvestJobs in the given status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHarvestJobsRequest withIncludeStatus(String includeStatus) {
        setIncludeStatus(includeStatus);
        return this;
    }

    /**
     * The upper bound on the number of records to return.
     * 
     * @param maxResults
     *        The upper bound on the number of records to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The upper bound on the number of records to return.
     * 
     * @return The upper bound on the number of records to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * The upper bound on the number of records to return.
     * 
     * @param maxResults
     *        The upper bound on the number of records to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHarvestJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     * 
     * @param nextToken
     *        A token used to resume pagination from the end of a previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     * 
     * @return A token used to resume pagination from the end of a previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     * 
     * @param nextToken
     *        A token used to resume pagination from the end of a previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHarvestJobsRequest withNextToken(String nextToken) {
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
        if (getIncludeChannelId() != null)
            sb.append("IncludeChannelId: ").append(getIncludeChannelId()).append(",");
        if (getIncludeStatus() != null)
            sb.append("IncludeStatus: ").append(getIncludeStatus()).append(",");
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

        if (obj instanceof ListHarvestJobsRequest == false)
            return false;
        ListHarvestJobsRequest other = (ListHarvestJobsRequest) obj;
        if (other.getIncludeChannelId() == null ^ this.getIncludeChannelId() == null)
            return false;
        if (other.getIncludeChannelId() != null && other.getIncludeChannelId().equals(this.getIncludeChannelId()) == false)
            return false;
        if (other.getIncludeStatus() == null ^ this.getIncludeStatus() == null)
            return false;
        if (other.getIncludeStatus() != null && other.getIncludeStatus().equals(this.getIncludeStatus()) == false)
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

        hashCode = prime * hashCode + ((getIncludeChannelId() == null) ? 0 : getIncludeChannelId().hashCode());
        hashCode = prime * hashCode + ((getIncludeStatus() == null) ? 0 : getIncludeStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHarvestJobsRequest clone() {
        return (ListHarvestJobsRequest) super.clone();
    }

}
