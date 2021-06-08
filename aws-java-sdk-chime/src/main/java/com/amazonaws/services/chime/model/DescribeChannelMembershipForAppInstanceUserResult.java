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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelMembershipForAppInstanceUser"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChannelMembershipForAppInstanceUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The channel to which a user belongs.
     * </p>
     */
    private ChannelMembershipForAppInstanceUserSummary channelMembership;

    /**
     * <p>
     * The channel to which a user belongs.
     * </p>
     * 
     * @param channelMembership
     *        The channel to which a user belongs.
     */

    public void setChannelMembership(ChannelMembershipForAppInstanceUserSummary channelMembership) {
        this.channelMembership = channelMembership;
    }

    /**
     * <p>
     * The channel to which a user belongs.
     * </p>
     * 
     * @return The channel to which a user belongs.
     */

    public ChannelMembershipForAppInstanceUserSummary getChannelMembership() {
        return this.channelMembership;
    }

    /**
     * <p>
     * The channel to which a user belongs.
     * </p>
     * 
     * @param channelMembership
     *        The channel to which a user belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelMembershipForAppInstanceUserResult withChannelMembership(ChannelMembershipForAppInstanceUserSummary channelMembership) {
        setChannelMembership(channelMembership);
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
        if (getChannelMembership() != null)
            sb.append("ChannelMembership: ").append(getChannelMembership());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChannelMembershipForAppInstanceUserResult == false)
            return false;
        DescribeChannelMembershipForAppInstanceUserResult other = (DescribeChannelMembershipForAppInstanceUserResult) obj;
        if (other.getChannelMembership() == null ^ this.getChannelMembership() == null)
            return false;
        if (other.getChannelMembership() != null && other.getChannelMembership().equals(this.getChannelMembership()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelMembership() == null) ? 0 : getChannelMembership().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChannelMembershipForAppInstanceUserResult clone() {
        try {
            return (DescribeChannelMembershipForAppInstanceUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
