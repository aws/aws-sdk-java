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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for notifications stored for each profiling group. This includes up to to two channels and a list
 * of event publishers associated with each channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/NotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of up to two channels to be used for sending notifications for events detected from the application profile.
     * </p>
     */
    private java.util.List<Channel> channels;

    /**
     * <p>
     * List of up to two channels to be used for sending notifications for events detected from the application profile.
     * </p>
     * 
     * @return List of up to two channels to be used for sending notifications for events detected from the application
     *         profile.
     */

    public java.util.List<Channel> getChannels() {
        return channels;
    }

    /**
     * <p>
     * List of up to two channels to be used for sending notifications for events detected from the application profile.
     * </p>
     * 
     * @param channels
     *        List of up to two channels to be used for sending notifications for events detected from the application
     *        profile.
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
     * List of up to two channels to be used for sending notifications for events detected from the application profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannels(java.util.Collection)} or {@link #withChannels(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param channels
     *        List of up to two channels to be used for sending notifications for events detected from the application
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationConfiguration withChannels(Channel... channels) {
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
     * List of up to two channels to be used for sending notifications for events detected from the application profile.
     * </p>
     * 
     * @param channels
     *        List of up to two channels to be used for sending notifications for events detected from the application
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationConfiguration withChannels(java.util.Collection<Channel> channels) {
        setChannels(channels);
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
            sb.append("Channels: ").append(getChannels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationConfiguration == false)
            return false;
        NotificationConfiguration other = (NotificationConfiguration) obj;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        return hashCode;
    }

    @Override
    public NotificationConfiguration clone() {
        try {
            return (NotificationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.NotificationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
