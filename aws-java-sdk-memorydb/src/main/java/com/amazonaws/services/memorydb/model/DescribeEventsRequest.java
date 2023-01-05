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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the event source for which events are returned. If not specified, all sources are included in
     * the response.
     * </p>
     */
    private String sourceName;
    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in ISO 8601 format. Example:
     * 2017-03-30T07:03:49.555Z
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in ISO 8601 format. Example:
     * 2017-03-30T07:03:49.555Z
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The number of minutes worth of events to retrieve.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the event source for which events are returned. If not specified, all sources are included in
     * the response.
     * </p>
     * 
     * @param sourceName
     *        The identifier of the event source for which events are returned. If not specified, all sources are
     *        included in the response.
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * <p>
     * The identifier of the event source for which events are returned. If not specified, all sources are included in
     * the response.
     * </p>
     * 
     * @return The identifier of the event source for which events are returned. If not specified, all sources are
     *         included in the response.
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * <p>
     * The identifier of the event source for which events are returned. If not specified, all sources are included in
     * the response.
     * </p>
     * 
     * @param sourceName
     *        The identifier of the event source for which events are returned. If not specified, all sources are
     *        included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withSourceName(String sourceName) {
        setSourceName(sourceName);
        return this;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     * 
     * @param sourceType
     *        The event source to retrieve events for. If no value is specified, all events are returned.
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     * 
     * @return The event source to retrieve events for. If no value is specified, all events are returned.
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     * 
     * @param sourceType
     *        The event source to retrieve events for. If no value is specified, all events are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public DescribeEventsRequest withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The event source to retrieve events for. If no value is specified, all events are returned.
     * </p>
     * 
     * @param sourceType
     *        The event source to retrieve events for. If no value is specified, all events are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public DescribeEventsRequest withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in ISO 8601 format. Example:
     * 2017-03-30T07:03:49.555Z
     * </p>
     * 
     * @param startTime
     *        The beginning of the time interval to retrieve events for, specified in ISO 8601 format. Example:
     *        2017-03-30T07:03:49.555Z
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in ISO 8601 format. Example:
     * 2017-03-30T07:03:49.555Z
     * </p>
     * 
     * @return The beginning of the time interval to retrieve events for, specified in ISO 8601 format. Example:
     *         2017-03-30T07:03:49.555Z
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The beginning of the time interval to retrieve events for, specified in ISO 8601 format. Example:
     * 2017-03-30T07:03:49.555Z
     * </p>
     * 
     * @param startTime
     *        The beginning of the time interval to retrieve events for, specified in ISO 8601 format. Example:
     *        2017-03-30T07:03:49.555Z
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in ISO 8601 format. Example:
     * 2017-03-30T07:03:49.555Z
     * </p>
     * 
     * @param endTime
     *        The end of the time interval for which to retrieve events, specified in ISO 8601 format. Example:
     *        2017-03-30T07:03:49.555Z
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in ISO 8601 format. Example:
     * 2017-03-30T07:03:49.555Z
     * </p>
     * 
     * @return The end of the time interval for which to retrieve events, specified in ISO 8601 format. Example:
     *         2017-03-30T07:03:49.555Z
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time interval for which to retrieve events, specified in ISO 8601 format. Example:
     * 2017-03-30T07:03:49.555Z
     * </p>
     * 
     * @param endTime
     *        The end of the time interval for which to retrieve events, specified in ISO 8601 format. Example:
     *        2017-03-30T07:03:49.555Z
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The number of minutes worth of events to retrieve.
     * </p>
     * 
     * @param duration
     *        The number of minutes worth of events to retrieve.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The number of minutes worth of events to retrieve.
     * </p>
     * 
     * @return The number of minutes worth of events to retrieve.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The number of minutes worth of events to retrieve.
     * </p>
     * 
     * @param duration
     *        The number of minutes worth of events to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *        nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @return An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *         nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *         token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *         other arguments unchanged.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *        nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withNextToken(String nextToken) {
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
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
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

        if (obj instanceof DescribeEventsRequest == false)
            return false;
        DescribeEventsRequest other = (DescribeEventsRequest) obj;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
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

        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventsRequest clone() {
        return (DescribeEventsRequest) super.clone();
    }

}
