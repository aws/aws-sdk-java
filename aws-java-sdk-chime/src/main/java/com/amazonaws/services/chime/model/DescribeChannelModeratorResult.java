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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelModerator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChannelModeratorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the channel moderator.
     * </p>
     */
    private ChannelModerator channelModerator;

    /**
     * <p>
     * The details of the channel moderator.
     * </p>
     * 
     * @param channelModerator
     *        The details of the channel moderator.
     */

    public void setChannelModerator(ChannelModerator channelModerator) {
        this.channelModerator = channelModerator;
    }

    /**
     * <p>
     * The details of the channel moderator.
     * </p>
     * 
     * @return The details of the channel moderator.
     */

    public ChannelModerator getChannelModerator() {
        return this.channelModerator;
    }

    /**
     * <p>
     * The details of the channel moderator.
     * </p>
     * 
     * @param channelModerator
     *        The details of the channel moderator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelModeratorResult withChannelModerator(ChannelModerator channelModerator) {
        setChannelModerator(channelModerator);
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
        if (getChannelModerator() != null)
            sb.append("ChannelModerator: ").append(getChannelModerator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChannelModeratorResult == false)
            return false;
        DescribeChannelModeratorResult other = (DescribeChannelModeratorResult) obj;
        if (other.getChannelModerator() == null ^ this.getChannelModerator() == null)
            return false;
        if (other.getChannelModerator() != null && other.getChannelModerator().equals(this.getChannelModerator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelModerator() == null) ? 0 : getChannelModerator().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChannelModeratorResult clone() {
        try {
            return (DescribeChannelModeratorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
