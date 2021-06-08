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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The structure representing the RemoveNotificationChannelRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/RemoveNotificationChannel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveNotificationChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The id of the channel that we want to stop receiving notifications.
     * </p>
     */
    private String channelId;
    /**
     * <p>
     * The name of the profiling group we want to change notification configuration for.
     * </p>
     */
    private String profilingGroupName;

    /**
     * <p>
     * The id of the channel that we want to stop receiving notifications.
     * </p>
     * 
     * @param channelId
     *        The id of the channel that we want to stop receiving notifications.
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * <p>
     * The id of the channel that we want to stop receiving notifications.
     * </p>
     * 
     * @return The id of the channel that we want to stop receiving notifications.
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * <p>
     * The id of the channel that we want to stop receiving notifications.
     * </p>
     * 
     * @param channelId
     *        The id of the channel that we want to stop receiving notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveNotificationChannelRequest withChannelId(String channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * <p>
     * The name of the profiling group we want to change notification configuration for.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group we want to change notification configuration for.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group we want to change notification configuration for.
     * </p>
     * 
     * @return The name of the profiling group we want to change notification configuration for.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group we want to change notification configuration for.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group we want to change notification configuration for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveNotificationChannelRequest withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
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
        if (getChannelId() != null)
            sb.append("ChannelId: ").append(getChannelId()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveNotificationChannelRequest == false)
            return false;
        RemoveNotificationChannelRequest other = (RemoveNotificationChannelRequest) obj;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getProfilingGroupName() == null ^ this.getProfilingGroupName() == null)
            return false;
        if (other.getProfilingGroupName() != null && other.getProfilingGroupName().equals(this.getProfilingGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        return hashCode;
    }

    @Override
    public RemoveNotificationChannelRequest clone() {
        return (RemoveNotificationChannelRequest) super.clone();
    }

}
