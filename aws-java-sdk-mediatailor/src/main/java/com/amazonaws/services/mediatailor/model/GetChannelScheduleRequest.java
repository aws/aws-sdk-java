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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetChannelSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChannelScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The schedule duration in minutes. The maximum duration is 4320 minutes (three days).
     * </p>
     */
    private String durationMinutes;
    /**
     * <p>
     * Upper bound on number of records to return. The maximum number of results is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Pagination token from the GET list request. Use the token to fetch the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @param channelName
     *        The identifier for the channel you are working on.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @return The identifier for the channel you are working on.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @param channelName
     *        The identifier for the channel you are working on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChannelScheduleRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The schedule duration in minutes. The maximum duration is 4320 minutes (three days).
     * </p>
     * 
     * @param durationMinutes
     *        The schedule duration in minutes. The maximum duration is 4320 minutes (three days).
     */

    public void setDurationMinutes(String durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    /**
     * <p>
     * The schedule duration in minutes. The maximum duration is 4320 minutes (three days).
     * </p>
     * 
     * @return The schedule duration in minutes. The maximum duration is 4320 minutes (three days).
     */

    public String getDurationMinutes() {
        return this.durationMinutes;
    }

    /**
     * <p>
     * The schedule duration in minutes. The maximum duration is 4320 minutes (three days).
     * </p>
     * 
     * @param durationMinutes
     *        The schedule duration in minutes. The maximum duration is 4320 minutes (three days).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChannelScheduleRequest withDurationMinutes(String durationMinutes) {
        setDurationMinutes(durationMinutes);
        return this;
    }

    /**
     * <p>
     * Upper bound on number of records to return. The maximum number of results is 100.
     * </p>
     * 
     * @param maxResults
     *        Upper bound on number of records to return. The maximum number of results is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Upper bound on number of records to return. The maximum number of results is 100.
     * </p>
     * 
     * @return Upper bound on number of records to return. The maximum number of results is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Upper bound on number of records to return. The maximum number of results is 100.
     * </p>
     * 
     * @param maxResults
     *        Upper bound on number of records to return. The maximum number of results is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChannelScheduleRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Pagination token from the GET list request. Use the token to fetch the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Pagination token from the GET list request. Use the token to fetch the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token from the GET list request. Use the token to fetch the next page of results.
     * </p>
     * 
     * @return Pagination token from the GET list request. Use the token to fetch the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token from the GET list request. Use the token to fetch the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Pagination token from the GET list request. Use the token to fetch the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChannelScheduleRequest withNextToken(String nextToken) {
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
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getDurationMinutes() != null)
            sb.append("DurationMinutes: ").append(getDurationMinutes()).append(",");
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

        if (obj instanceof GetChannelScheduleRequest == false)
            return false;
        GetChannelScheduleRequest other = (GetChannelScheduleRequest) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getDurationMinutes() == null ^ this.getDurationMinutes() == null)
            return false;
        if (other.getDurationMinutes() != null && other.getDurationMinutes().equals(this.getDurationMinutes()) == false)
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

        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getDurationMinutes() == null) ? 0 : getDurationMinutes().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetChannelScheduleRequest clone() {
        return (GetChannelScheduleRequest) super.clone();
    }

}
