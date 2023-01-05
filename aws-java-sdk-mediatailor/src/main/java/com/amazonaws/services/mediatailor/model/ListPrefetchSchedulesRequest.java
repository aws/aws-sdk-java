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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListPrefetchSchedules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPrefetchSchedulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of prefetch schedules that you want MediaTailor to return in response to the current request.
     * If there are more than <code>MaxResults</code> prefetch schedules, use the value of <code>NextToken</code> in the
     * response to get the next page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * (Optional) If the playback configuration has more than <code>MaxResults</code> prefetch schedules, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListPrefetchSchedulesRequest</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element, there are no more prefetch schedules to
     * get.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Retrieves the prefetch schedule(s) for a specific playback configuration.
     * </p>
     */
    private String playbackConfigurationName;
    /**
     * <p>
     * An optional filtering parameter whereby MediaTailor filters the prefetch schedules to include only specific
     * streams.
     * </p>
     */
    private String streamId;

    /**
     * <p>
     * The maximum number of prefetch schedules that you want MediaTailor to return in response to the current request.
     * If there are more than <code>MaxResults</code> prefetch schedules, use the value of <code>NextToken</code> in the
     * response to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of prefetch schedules that you want MediaTailor to return in response to the current
     *        request. If there are more than <code>MaxResults</code> prefetch schedules, use the value of
     *        <code>NextToken</code> in the response to get the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of prefetch schedules that you want MediaTailor to return in response to the current request.
     * If there are more than <code>MaxResults</code> prefetch schedules, use the value of <code>NextToken</code> in the
     * response to get the next page of results.
     * </p>
     * 
     * @return The maximum number of prefetch schedules that you want MediaTailor to return in response to the current
     *         request. If there are more than <code>MaxResults</code> prefetch schedules, use the value of
     *         <code>NextToken</code> in the response to get the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of prefetch schedules that you want MediaTailor to return in response to the current request.
     * If there are more than <code>MaxResults</code> prefetch schedules, use the value of <code>NextToken</code> in the
     * response to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of prefetch schedules that you want MediaTailor to return in response to the current
     *        request. If there are more than <code>MaxResults</code> prefetch schedules, use the value of
     *        <code>NextToken</code> in the response to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrefetchSchedulesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * (Optional) If the playback configuration has more than <code>MaxResults</code> prefetch schedules, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListPrefetchSchedulesRequest</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element, there are no more prefetch schedules to
     * get.
     * </p>
     * 
     * @param nextToken
     *        (Optional) If the playback configuration has more than <code>MaxResults</code> prefetch schedules, use
     *        <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *        <p>
     *        For the first <code>ListPrefetchSchedulesRequest</code> request, omit this value.
     *        </p>
     *        <p>
     *        For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response
     *        and specify that value for <code>NextToken</code> in the request.
     *        </p>
     *        <p>
     *        If the previous response didn't include a <code>NextToken</code> element, there are no more prefetch
     *        schedules to get.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) If the playback configuration has more than <code>MaxResults</code> prefetch schedules, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListPrefetchSchedulesRequest</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element, there are no more prefetch schedules to
     * get.
     * </p>
     * 
     * @return (Optional) If the playback configuration has more than <code>MaxResults</code> prefetch schedules, use
     *         <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *         <p>
     *         For the first <code>ListPrefetchSchedulesRequest</code> request, omit this value.
     *         </p>
     *         <p>
     *         For the second and subsequent requests, get the value of <code>NextToken</code> from the previous
     *         response and specify that value for <code>NextToken</code> in the request.
     *         </p>
     *         <p>
     *         If the previous response didn't include a <code>NextToken</code> element, there are no more prefetch
     *         schedules to get.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) If the playback configuration has more than <code>MaxResults</code> prefetch schedules, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListPrefetchSchedulesRequest</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element, there are no more prefetch schedules to
     * get.
     * </p>
     * 
     * @param nextToken
     *        (Optional) If the playback configuration has more than <code>MaxResults</code> prefetch schedules, use
     *        <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *        <p>
     *        For the first <code>ListPrefetchSchedulesRequest</code> request, omit this value.
     *        </p>
     *        <p>
     *        For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response
     *        and specify that value for <code>NextToken</code> in the request.
     *        </p>
     *        <p>
     *        If the previous response didn't include a <code>NextToken</code> element, there are no more prefetch
     *        schedules to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrefetchSchedulesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Retrieves the prefetch schedule(s) for a specific playback configuration.
     * </p>
     * 
     * @param playbackConfigurationName
     *        Retrieves the prefetch schedule(s) for a specific playback configuration.
     */

    public void setPlaybackConfigurationName(String playbackConfigurationName) {
        this.playbackConfigurationName = playbackConfigurationName;
    }

    /**
     * <p>
     * Retrieves the prefetch schedule(s) for a specific playback configuration.
     * </p>
     * 
     * @return Retrieves the prefetch schedule(s) for a specific playback configuration.
     */

    public String getPlaybackConfigurationName() {
        return this.playbackConfigurationName;
    }

    /**
     * <p>
     * Retrieves the prefetch schedule(s) for a specific playback configuration.
     * </p>
     * 
     * @param playbackConfigurationName
     *        Retrieves the prefetch schedule(s) for a specific playback configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrefetchSchedulesRequest withPlaybackConfigurationName(String playbackConfigurationName) {
        setPlaybackConfigurationName(playbackConfigurationName);
        return this;
    }

    /**
     * <p>
     * An optional filtering parameter whereby MediaTailor filters the prefetch schedules to include only specific
     * streams.
     * </p>
     * 
     * @param streamId
     *        An optional filtering parameter whereby MediaTailor filters the prefetch schedules to include only
     *        specific streams.
     */

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * <p>
     * An optional filtering parameter whereby MediaTailor filters the prefetch schedules to include only specific
     * streams.
     * </p>
     * 
     * @return An optional filtering parameter whereby MediaTailor filters the prefetch schedules to include only
     *         specific streams.
     */

    public String getStreamId() {
        return this.streamId;
    }

    /**
     * <p>
     * An optional filtering parameter whereby MediaTailor filters the prefetch schedules to include only specific
     * streams.
     * </p>
     * 
     * @param streamId
     *        An optional filtering parameter whereby MediaTailor filters the prefetch schedules to include only
     *        specific streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrefetchSchedulesRequest withStreamId(String streamId) {
        setStreamId(streamId);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPlaybackConfigurationName() != null)
            sb.append("PlaybackConfigurationName: ").append(getPlaybackConfigurationName()).append(",");
        if (getStreamId() != null)
            sb.append("StreamId: ").append(getStreamId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPrefetchSchedulesRequest == false)
            return false;
        ListPrefetchSchedulesRequest other = (ListPrefetchSchedulesRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPlaybackConfigurationName() == null ^ this.getPlaybackConfigurationName() == null)
            return false;
        if (other.getPlaybackConfigurationName() != null && other.getPlaybackConfigurationName().equals(this.getPlaybackConfigurationName()) == false)
            return false;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPlaybackConfigurationName() == null) ? 0 : getPlaybackConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        return hashCode;
    }

    @Override
    public ListPrefetchSchedulesRequest clone() {
        return (ListPrefetchSchedulesRequest) super.clone();
    }

}
