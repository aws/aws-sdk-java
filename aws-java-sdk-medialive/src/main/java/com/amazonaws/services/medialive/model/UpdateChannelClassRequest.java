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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Channel class that the channel should be updated to.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateChannelClass" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChannelClassRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The channel class that you wish to update this channel to use. */
    private String channelClass;
    /** Channel Id of the channel whose class should be updated. */
    private String channelId;
    /** A list of output destinations for this channel. */
    private java.util.List<OutputDestination> destinations;

    /**
     * The channel class that you wish to update this channel to use.
     * 
     * @param channelClass
     *        The channel class that you wish to update this channel to use.
     * @see ChannelClass
     */

    public void setChannelClass(String channelClass) {
        this.channelClass = channelClass;
    }

    /**
     * The channel class that you wish to update this channel to use.
     * 
     * @return The channel class that you wish to update this channel to use.
     * @see ChannelClass
     */

    public String getChannelClass() {
        return this.channelClass;
    }

    /**
     * The channel class that you wish to update this channel to use.
     * 
     * @param channelClass
     *        The channel class that you wish to update this channel to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelClass
     */

    public UpdateChannelClassRequest withChannelClass(String channelClass) {
        setChannelClass(channelClass);
        return this;
    }

    /**
     * The channel class that you wish to update this channel to use.
     * 
     * @param channelClass
     *        The channel class that you wish to update this channel to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelClass
     */

    public UpdateChannelClassRequest withChannelClass(ChannelClass channelClass) {
        this.channelClass = channelClass.toString();
        return this;
    }

    /**
     * Channel Id of the channel whose class should be updated.
     * 
     * @param channelId
     *        Channel Id of the channel whose class should be updated.
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * Channel Id of the channel whose class should be updated.
     * 
     * @return Channel Id of the channel whose class should be updated.
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * Channel Id of the channel whose class should be updated.
     * 
     * @param channelId
     *        Channel Id of the channel whose class should be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelClassRequest withChannelId(String channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * A list of output destinations for this channel.
     * 
     * @return A list of output destinations for this channel.
     */

    public java.util.List<OutputDestination> getDestinations() {
        return destinations;
    }

    /**
     * A list of output destinations for this channel.
     * 
     * @param destinations
     *        A list of output destinations for this channel.
     */

    public void setDestinations(java.util.Collection<OutputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<OutputDestination>(destinations);
    }

    /**
     * A list of output destinations for this channel.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        A list of output destinations for this channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelClassRequest withDestinations(OutputDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<OutputDestination>(destinations.length));
        }
        for (OutputDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * A list of output destinations for this channel.
     * 
     * @param destinations
     *        A list of output destinations for this channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelClassRequest withDestinations(java.util.Collection<OutputDestination> destinations) {
        setDestinations(destinations);
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
        if (getChannelClass() != null)
            sb.append("ChannelClass: ").append(getChannelClass()).append(",");
        if (getChannelId() != null)
            sb.append("ChannelId: ").append(getChannelId()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelClassRequest == false)
            return false;
        UpdateChannelClassRequest other = (UpdateChannelClassRequest) obj;
        if (other.getChannelClass() == null ^ this.getChannelClass() == null)
            return false;
        if (other.getChannelClass() != null && other.getChannelClass().equals(this.getChannelClass()) == false)
            return false;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelClass() == null) ? 0 : getChannelClass().hashCode());
        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChannelClassRequest clone() {
        return (UpdateChannelClassRequest) super.clone();
    }

}
