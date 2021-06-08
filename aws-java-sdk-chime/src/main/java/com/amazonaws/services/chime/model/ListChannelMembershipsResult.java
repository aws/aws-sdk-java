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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelMemberships" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChannelMembershipsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The information for the requested channel memberships.
     * </p>
     */
    private java.util.List<ChannelMembershipSummary> channelMemberships;
    /**
     * <p>
     * The token passed by previous API calls until all requested channel memberships are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @return The ARN of the channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMembershipsResult withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The information for the requested channel memberships.
     * </p>
     * 
     * @return The information for the requested channel memberships.
     */

    public java.util.List<ChannelMembershipSummary> getChannelMemberships() {
        return channelMemberships;
    }

    /**
     * <p>
     * The information for the requested channel memberships.
     * </p>
     * 
     * @param channelMemberships
     *        The information for the requested channel memberships.
     */

    public void setChannelMemberships(java.util.Collection<ChannelMembershipSummary> channelMemberships) {
        if (channelMemberships == null) {
            this.channelMemberships = null;
            return;
        }

        this.channelMemberships = new java.util.ArrayList<ChannelMembershipSummary>(channelMemberships);
    }

    /**
     * <p>
     * The information for the requested channel memberships.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelMemberships(java.util.Collection)} or {@link #withChannelMemberships(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param channelMemberships
     *        The information for the requested channel memberships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMembershipsResult withChannelMemberships(ChannelMembershipSummary... channelMemberships) {
        if (this.channelMemberships == null) {
            setChannelMemberships(new java.util.ArrayList<ChannelMembershipSummary>(channelMemberships.length));
        }
        for (ChannelMembershipSummary ele : channelMemberships) {
            this.channelMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information for the requested channel memberships.
     * </p>
     * 
     * @param channelMemberships
     *        The information for the requested channel memberships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMembershipsResult withChannelMemberships(java.util.Collection<ChannelMembershipSummary> channelMemberships) {
        setChannelMemberships(channelMemberships);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channel memberships are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested channel memberships are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channel memberships are returned.
     * </p>
     * 
     * @return The token passed by previous API calls until all requested channel memberships are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channel memberships are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested channel memberships are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMembershipsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getChannelMemberships() != null)
            sb.append("ChannelMemberships: ").append(getChannelMemberships()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChannelMembershipsResult == false)
            return false;
        ListChannelMembershipsResult other = (ListChannelMembershipsResult) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getChannelMemberships() == null ^ this.getChannelMemberships() == null)
            return false;
        if (other.getChannelMemberships() != null && other.getChannelMemberships().equals(this.getChannelMemberships()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getChannelMemberships() == null) ? 0 : getChannelMemberships().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListChannelMembershipsResult clone() {
        try {
            return (ListChannelMembershipsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
