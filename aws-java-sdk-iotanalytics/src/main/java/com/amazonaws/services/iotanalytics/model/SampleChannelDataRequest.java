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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/SampleChannelData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SampleChannelDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the channel whose message samples are retrieved.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The number of sample messages to be retrieved. The limit is 10, the default is also 10.
     * </p>
     */
    private Integer maxMessages;
    /**
     * <p>
     * The start of the time window from which sample messages are retrieved.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time window from which sample messages are retrieved.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The name of the channel whose message samples are retrieved.
     * </p>
     * 
     * @param channelName
     *        The name of the channel whose message samples are retrieved.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the channel whose message samples are retrieved.
     * </p>
     * 
     * @return The name of the channel whose message samples are retrieved.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the channel whose message samples are retrieved.
     * </p>
     * 
     * @param channelName
     *        The name of the channel whose message samples are retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleChannelDataRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The number of sample messages to be retrieved. The limit is 10, the default is also 10.
     * </p>
     * 
     * @param maxMessages
     *        The number of sample messages to be retrieved. The limit is 10, the default is also 10.
     */

    public void setMaxMessages(Integer maxMessages) {
        this.maxMessages = maxMessages;
    }

    /**
     * <p>
     * The number of sample messages to be retrieved. The limit is 10, the default is also 10.
     * </p>
     * 
     * @return The number of sample messages to be retrieved. The limit is 10, the default is also 10.
     */

    public Integer getMaxMessages() {
        return this.maxMessages;
    }

    /**
     * <p>
     * The number of sample messages to be retrieved. The limit is 10, the default is also 10.
     * </p>
     * 
     * @param maxMessages
     *        The number of sample messages to be retrieved. The limit is 10, the default is also 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleChannelDataRequest withMaxMessages(Integer maxMessages) {
        setMaxMessages(maxMessages);
        return this;
    }

    /**
     * <p>
     * The start of the time window from which sample messages are retrieved.
     * </p>
     * 
     * @param startTime
     *        The start of the time window from which sample messages are retrieved.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time window from which sample messages are retrieved.
     * </p>
     * 
     * @return The start of the time window from which sample messages are retrieved.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time window from which sample messages are retrieved.
     * </p>
     * 
     * @param startTime
     *        The start of the time window from which sample messages are retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleChannelDataRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time window from which sample messages are retrieved.
     * </p>
     * 
     * @param endTime
     *        The end of the time window from which sample messages are retrieved.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time window from which sample messages are retrieved.
     * </p>
     * 
     * @return The end of the time window from which sample messages are retrieved.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time window from which sample messages are retrieved.
     * </p>
     * 
     * @param endTime
     *        The end of the time window from which sample messages are retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleChannelDataRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getMaxMessages() != null)
            sb.append("MaxMessages: ").append(getMaxMessages()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SampleChannelDataRequest == false)
            return false;
        SampleChannelDataRequest other = (SampleChannelDataRequest) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getMaxMessages() == null ^ this.getMaxMessages() == null)
            return false;
        if (other.getMaxMessages() != null && other.getMaxMessages().equals(this.getMaxMessages()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getMaxMessages() == null) ? 0 : getMaxMessages().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public SampleChannelDataRequest clone() {
        return (SampleChannelDataRequest) super.clone();
    }

}
