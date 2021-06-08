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
 * The structure representing the AddNotificationChannelsRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/AddNotificationChannels"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddNotificationChannelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or 2 channels to report to when anomalies are detected.
     * </p>
     */
    private java.util.List<Channel> channels;
    /**
     * <p>
     * The name of the profiling group that we are setting up notifications for.
     * </p>
     */
    private String profilingGroupName;

    /**
     * <p>
     * One or 2 channels to report to when anomalies are detected.
     * </p>
     * 
     * @return One or 2 channels to report to when anomalies are detected.
     */

    public java.util.List<Channel> getChannels() {
        return channels;
    }

    /**
     * <p>
     * One or 2 channels to report to when anomalies are detected.
     * </p>
     * 
     * @param channels
     *        One or 2 channels to report to when anomalies are detected.
     */

    public void setChannels(java.util.Collection<Channel> channels) {
        if (channels == null) {
            this.channels = null;
            return;
        }

        this.channels = new java.util.ArrayList<Channel>(channels);
    }

    /**
     * <p>
     * One or 2 channels to report to when anomalies are detected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannels(java.util.Collection)} or {@link #withChannels(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param channels
     *        One or 2 channels to report to when anomalies are detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddNotificationChannelsRequest withChannels(Channel... channels) {
        if (this.channels == null) {
            setChannels(new java.util.ArrayList<Channel>(channels.length));
        }
        for (Channel ele : channels) {
            this.channels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or 2 channels to report to when anomalies are detected.
     * </p>
     * 
     * @param channels
     *        One or 2 channels to report to when anomalies are detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddNotificationChannelsRequest withChannels(java.util.Collection<Channel> channels) {
        setChannels(channels);
        return this;
    }

    /**
     * <p>
     * The name of the profiling group that we are setting up notifications for.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group that we are setting up notifications for.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group that we are setting up notifications for.
     * </p>
     * 
     * @return The name of the profiling group that we are setting up notifications for.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group that we are setting up notifications for.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group that we are setting up notifications for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddNotificationChannelsRequest withProfilingGroupName(String profilingGroupName) {
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
        if (getChannels() != null)
            sb.append("Channels: ").append(getChannels()).append(",");
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

        if (obj instanceof AddNotificationChannelsRequest == false)
            return false;
        AddNotificationChannelsRequest other = (AddNotificationChannelsRequest) obj;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
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

        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        return hashCode;
    }

    @Override
    public AddNotificationChannelsRequest clone() {
        return (AddNotificationChannelsRequest) super.clone();
    }

}
