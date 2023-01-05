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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetChannelSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChannelScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the channel associated with this Channel Schedule.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The duration in minutes of the channel schedule.
     * </p>
     */
    private String durationMinutes;
    /**
     * <p>
     * The maximum number of channel schedules that you want MediaTailor to return in response to the current request.
     * If there are more than <code>MaxResults</code> channel schedules, use the value of <code>NextToken</code> in the
     * response to get the next page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * (Optional) If the playback configuration has more than <code>MaxResults</code> channel schedules, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>GetChannelScheduleRequest</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element, there are no more channel schedules to
     * get.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the channel associated with this Channel Schedule.
     * </p>
     * 
     * @param channelName
     *        The name of the channel associated with this Channel Schedule.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the channel associated with this Channel Schedule.
     * </p>
     * 
     * @return The name of the channel associated with this Channel Schedule.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the channel associated with this Channel Schedule.
     * </p>
     * 
     * @param channelName
     *        The name of the channel associated with this Channel Schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChannelScheduleRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The duration in minutes of the channel schedule.
     * </p>
     * 
     * @param durationMinutes
     *        The duration in minutes of the channel schedule.
     */

    public void setDurationMinutes(String durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    /**
     * <p>
     * The duration in minutes of the channel schedule.
     * </p>
     * 
     * @return The duration in minutes of the channel schedule.
     */

    public String getDurationMinutes() {
        return this.durationMinutes;
    }

    /**
     * <p>
     * The duration in minutes of the channel schedule.
     * </p>
     * 
     * @param durationMinutes
     *        The duration in minutes of the channel schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChannelScheduleRequest withDurationMinutes(String durationMinutes) {
        setDurationMinutes(durationMinutes);
        return this;
    }

    /**
     * <p>
     * The maximum number of channel schedules that you want MediaTailor to return in response to the current request.
     * If there are more than <code>MaxResults</code> channel schedules, use the value of <code>NextToken</code> in the
     * response to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of channel schedules that you want MediaTailor to return in response to the current
     *        request. If there are more than <code>MaxResults</code> channel schedules, use the value of
     *        <code>NextToken</code> in the response to get the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of channel schedules that you want MediaTailor to return in response to the current request.
     * If there are more than <code>MaxResults</code> channel schedules, use the value of <code>NextToken</code> in the
     * response to get the next page of results.
     * </p>
     * 
     * @return The maximum number of channel schedules that you want MediaTailor to return in response to the current
     *         request. If there are more than <code>MaxResults</code> channel schedules, use the value of
     *         <code>NextToken</code> in the response to get the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of channel schedules that you want MediaTailor to return in response to the current request.
     * If there are more than <code>MaxResults</code> channel schedules, use the value of <code>NextToken</code> in the
     * response to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of channel schedules that you want MediaTailor to return in response to the current
     *        request. If there are more than <code>MaxResults</code> channel schedules, use the value of
     *        <code>NextToken</code> in the response to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChannelScheduleRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * (Optional) If the playback configuration has more than <code>MaxResults</code> channel schedules, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>GetChannelScheduleRequest</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element, there are no more channel schedules to
     * get.
     * </p>
     * 
     * @param nextToken
     *        (Optional) If the playback configuration has more than <code>MaxResults</code> channel schedules, use
     *        <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *        <p>
     *        For the first <code>GetChannelScheduleRequest</code> request, omit this value.
     *        </p>
     *        <p>
     *        For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response
     *        and specify that value for <code>NextToken</code> in the request.
     *        </p>
     *        <p>
     *        If the previous response didn't include a <code>NextToken</code> element, there are no more channel
     *        schedules to get.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) If the playback configuration has more than <code>MaxResults</code> channel schedules, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>GetChannelScheduleRequest</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element, there are no more channel schedules to
     * get.
     * </p>
     * 
     * @return (Optional) If the playback configuration has more than <code>MaxResults</code> channel schedules, use
     *         <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *         <p>
     *         For the first <code>GetChannelScheduleRequest</code> request, omit this value.
     *         </p>
     *         <p>
     *         For the second and subsequent requests, get the value of <code>NextToken</code> from the previous
     *         response and specify that value for <code>NextToken</code> in the request.
     *         </p>
     *         <p>
     *         If the previous response didn't include a <code>NextToken</code> element, there are no more channel
     *         schedules to get.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) If the playback configuration has more than <code>MaxResults</code> channel schedules, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>GetChannelScheduleRequest</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element, there are no more channel schedules to
     * get.
     * </p>
     * 
     * @param nextToken
     *        (Optional) If the playback configuration has more than <code>MaxResults</code> channel schedules, use
     *        <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *        <p>
     *        For the first <code>GetChannelScheduleRequest</code> request, omit this value.
     *        </p>
     *        <p>
     *        For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response
     *        and specify that value for <code>NextToken</code> in the request.
     *        </p>
     *        <p>
     *        If the previous response didn't include a <code>NextToken</code> element, there are no more channel
     *        schedules to get.
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
