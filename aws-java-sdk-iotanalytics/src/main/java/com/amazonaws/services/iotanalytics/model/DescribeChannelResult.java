/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains information about the channel.
     * </p>
     */
    private Channel channel;
    /**
     * <p>
     * Statistics about the channel. Included if the 'includeStatistics' parameter is set to true in the request.
     * </p>
     */
    private ChannelStatistics statistics;

    /**
     * <p>
     * An object that contains information about the channel.
     * </p>
     * 
     * @param channel
     *        An object that contains information about the channel.
     */

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * An object that contains information about the channel.
     * </p>
     * 
     * @return An object that contains information about the channel.
     */

    public Channel getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * An object that contains information about the channel.
     * </p>
     * 
     * @param channel
     *        An object that contains information about the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelResult withChannel(Channel channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * Statistics about the channel. Included if the 'includeStatistics' parameter is set to true in the request.
     * </p>
     * 
     * @param statistics
     *        Statistics about the channel. Included if the 'includeStatistics' parameter is set to true in the request.
     */

    public void setStatistics(ChannelStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * Statistics about the channel. Included if the 'includeStatistics' parameter is set to true in the request.
     * </p>
     * 
     * @return Statistics about the channel. Included if the 'includeStatistics' parameter is set to true in the
     *         request.
     */

    public ChannelStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * Statistics about the channel. Included if the 'includeStatistics' parameter is set to true in the request.
     * </p>
     * 
     * @param statistics
     *        Statistics about the channel. Included if the 'includeStatistics' parameter is set to true in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelResult withStatistics(ChannelStatistics statistics) {
        setStatistics(statistics);
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
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChannelResult == false)
            return false;
        DescribeChannelResult other = (DescribeChannelResult) obj;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChannelResult clone() {
        try {
            return (DescribeChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
