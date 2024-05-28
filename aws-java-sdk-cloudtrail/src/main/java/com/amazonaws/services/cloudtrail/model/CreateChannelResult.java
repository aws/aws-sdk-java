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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The name of the new channel.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The partner or external event source name.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The event data stores that log the events arriving through the channel.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Destination> destinations;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new channel.
     * </p>
     * 
     * @param channelArn
     *        The Amazon Resource Name (ARN) of the new channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new channel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the new channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new channel.
     * </p>
     * 
     * @param channelArn
     *        The Amazon Resource Name (ARN) of the new channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The name of the new channel.
     * </p>
     * 
     * @param name
     *        The name of the new channel.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new channel.
     * </p>
     * 
     * @return The name of the new channel.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new channel.
     * </p>
     * 
     * @param name
     *        The name of the new channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The partner or external event source name.
     * </p>
     * 
     * @param source
     *        The partner or external event source name.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The partner or external event source name.
     * </p>
     * 
     * @return The partner or external event source name.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The partner or external event source name.
     * </p>
     * 
     * @param source
     *        The partner or external event source name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The event data stores that log the events arriving through the channel.
     * </p>
     * 
     * @return The event data stores that log the events arriving through the channel.
     */

    public java.util.List<Destination> getDestinations() {
        if (destinations == null) {
            destinations = new com.amazonaws.internal.SdkInternalList<Destination>();
        }
        return destinations;
    }

    /**
     * <p>
     * The event data stores that log the events arriving through the channel.
     * </p>
     * 
     * @param destinations
     *        The event data stores that log the events arriving through the channel.
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
     * The event data stores that log the events arriving through the channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        The event data stores that log the events arriving through the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withDestinations(Destination... destinations) {
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
     * The event data stores that log the events arriving through the channel.
     * </p>
     * 
     * @param destinations
     *        The event data stores that log the events arriving through the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withDestinations(java.util.Collection<Destination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChannelResult == false)
            return false;
        CreateChannelResult other = (CreateChannelResult) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelResult clone() {
        try {
            return (CreateChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
