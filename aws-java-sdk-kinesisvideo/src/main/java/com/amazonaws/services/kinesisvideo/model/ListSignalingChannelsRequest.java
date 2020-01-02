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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListSignalingChannels" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSignalingChannelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of channels to return in the response. The default is 500.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If you specify this parameter, when the result of a <code>ListSignalingChannels</code> operation is truncated,
     * the call returns the <code>NextToken</code> in the response. To get another batch of channels, provide this token
     * in your next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Optional: Returns only the channels that satisfy a specific condition.
     * </p>
     */
    private ChannelNameCondition channelNameCondition;

    /**
     * <p>
     * The maximum number of channels to return in the response. The default is 500.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of channels to return in the response. The default is 500.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of channels to return in the response. The default is 500.
     * </p>
     * 
     * @return The maximum number of channels to return in the response. The default is 500.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of channels to return in the response. The default is 500.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of channels to return in the response. The default is 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSignalingChannelsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a <code>ListSignalingChannels</code> operation is truncated,
     * the call returns the <code>NextToken</code> in the response. To get another batch of channels, provide this token
     * in your next request.
     * </p>
     * 
     * @param nextToken
     *        If you specify this parameter, when the result of a <code>ListSignalingChannels</code> operation is
     *        truncated, the call returns the <code>NextToken</code> in the response. To get another batch of channels,
     *        provide this token in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a <code>ListSignalingChannels</code> operation is truncated,
     * the call returns the <code>NextToken</code> in the response. To get another batch of channels, provide this token
     * in your next request.
     * </p>
     * 
     * @return If you specify this parameter, when the result of a <code>ListSignalingChannels</code> operation is
     *         truncated, the call returns the <code>NextToken</code> in the response. To get another batch of channels,
     *         provide this token in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a <code>ListSignalingChannels</code> operation is truncated,
     * the call returns the <code>NextToken</code> in the response. To get another batch of channels, provide this token
     * in your next request.
     * </p>
     * 
     * @param nextToken
     *        If you specify this parameter, when the result of a <code>ListSignalingChannels</code> operation is
     *        truncated, the call returns the <code>NextToken</code> in the response. To get another batch of channels,
     *        provide this token in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSignalingChannelsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Optional: Returns only the channels that satisfy a specific condition.
     * </p>
     * 
     * @param channelNameCondition
     *        Optional: Returns only the channels that satisfy a specific condition.
     */

    public void setChannelNameCondition(ChannelNameCondition channelNameCondition) {
        this.channelNameCondition = channelNameCondition;
    }

    /**
     * <p>
     * Optional: Returns only the channels that satisfy a specific condition.
     * </p>
     * 
     * @return Optional: Returns only the channels that satisfy a specific condition.
     */

    public ChannelNameCondition getChannelNameCondition() {
        return this.channelNameCondition;
    }

    /**
     * <p>
     * Optional: Returns only the channels that satisfy a specific condition.
     * </p>
     * 
     * @param channelNameCondition
     *        Optional: Returns only the channels that satisfy a specific condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSignalingChannelsRequest withChannelNameCondition(ChannelNameCondition channelNameCondition) {
        setChannelNameCondition(channelNameCondition);
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
        if (getChannelNameCondition() != null)
            sb.append("ChannelNameCondition: ").append(getChannelNameCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSignalingChannelsRequest == false)
            return false;
        ListSignalingChannelsRequest other = (ListSignalingChannelsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getChannelNameCondition() == null ^ this.getChannelNameCondition() == null)
            return false;
        if (other.getChannelNameCondition() != null && other.getChannelNameCondition().equals(this.getChannelNameCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getChannelNameCondition() == null) ? 0 : getChannelNameCondition().hashCode());
        return hashCode;
    }

    @Override
    public ListSignalingChannelsRequest clone() {
        return (ListSignalingChannelsRequest) super.clone();
    }

}
