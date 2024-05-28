/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/UpdateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN or ID (the ARN suffix) of the channel that you want to update.
     * </p>
     */
    private String channel;
    /**
     * <p>
     * The ARNs of event data stores that you want to log events arriving through the channel.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Destination> destinations;
    /**
     * <p>
     * Changes the name of the channel.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ARN or ID (the ARN suffix) of the channel that you want to update.
     * </p>
     * 
     * @param channel
     *        The ARN or ID (the ARN suffix) of the channel that you want to update.
     */

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The ARN or ID (the ARN suffix) of the channel that you want to update.
     * </p>
     * 
     * @return The ARN or ID (the ARN suffix) of the channel that you want to update.
     */

    public String getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * The ARN or ID (the ARN suffix) of the channel that you want to update.
     * </p>
     * 
     * @param channel
     *        The ARN or ID (the ARN suffix) of the channel that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withChannel(String channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * The ARNs of event data stores that you want to log events arriving through the channel.
     * </p>
     * 
     * @return The ARNs of event data stores that you want to log events arriving through the channel.
     */

    public java.util.List<Destination> getDestinations() {
        if (destinations == null) {
            destinations = new com.amazonaws.internal.SdkInternalList<Destination>();
        }
        return destinations;
    }

    /**
     * <p>
     * The ARNs of event data stores that you want to log events arriving through the channel.
     * </p>
     * 
     * @param destinations
     *        The ARNs of event data stores that you want to log events arriving through the channel.
     */

    public void setDestinations(java.util.Collection<Destination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new com.amazonaws.internal.SdkInternalList<Destination>(destinations);
    }

    /**
     * <p>
     * The ARNs of event data stores that you want to log events arriving through the channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        The ARNs of event data stores that you want to log events arriving through the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withDestinations(Destination... destinations) {
        if (this.destinations == null) {
            setDestinations(new com.amazonaws.internal.SdkInternalList<Destination>(destinations.length));
        }
        for (Destination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of event data stores that you want to log events arriving through the channel.
     * </p>
     * 
     * @param destinations
     *        The ARNs of event data stores that you want to log events arriving through the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withDestinations(java.util.Collection<Destination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * Changes the name of the channel.
     * </p>
     * 
     * @param name
     *        Changes the name of the channel.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Changes the name of the channel.
     * </p>
     * 
     * @return Changes the name of the channel.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Changes the name of the channel.
     * </p>
     * 
     * @param name
     *        Changes the name of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withName(String name) {
        setName(name);
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
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelRequest == false)
            return false;
        UpdateChannelRequest other = (UpdateChannelRequest) obj;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChannelRequest clone() {
        return (UpdateChannelRequest) super.clone();
    }

}
