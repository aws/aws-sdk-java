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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelsModeratedByAppInstanceUser"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChannelsModeratedByAppInstanceUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The moderated channels in the request.
     * </p>
     */
    private java.util.List<ChannelModeratedByAppInstanceUserSummary> channels;
    /**
     * <p>
     * The token returned from previous API requests until the number of channels moderated by the user is reached.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The moderated channels in the request.
     * </p>
     * 
     * @return The moderated channels in the request.
     */

    public java.util.List<ChannelModeratedByAppInstanceUserSummary> getChannels() {
        return channels;
    }

    /**
     * <p>
     * The moderated channels in the request.
     * </p>
     * 
     * @param channels
     *        The moderated channels in the request.
     */

    public void setChannels(java.util.Collection<ChannelModeratedByAppInstanceUserSummary> channels) {
        if (channels == null) {
            this.channels = null;
            return;
        }

        this.channels = new java.util.ArrayList<ChannelModeratedByAppInstanceUserSummary>(channels);
    }

    /**
     * <p>
     * The moderated channels in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannels(java.util.Collection)} or {@link #withChannels(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param channels
     *        The moderated channels in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelsModeratedByAppInstanceUserResult withChannels(ChannelModeratedByAppInstanceUserSummary... channels) {
        if (this.channels == null) {
            setChannels(new java.util.ArrayList<ChannelModeratedByAppInstanceUserSummary>(channels.length));
        }
        for (ChannelModeratedByAppInstanceUserSummary ele : channels) {
            this.channels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The moderated channels in the request.
     * </p>
     * 
     * @param channels
     *        The moderated channels in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelsModeratedByAppInstanceUserResult withChannels(java.util.Collection<ChannelModeratedByAppInstanceUserSummary> channels) {
        setChannels(channels);
        return this;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of channels moderated by the user is reached.
     * </p>
     * 
     * @param nextToken
     *        The token returned from previous API requests until the number of channels moderated by the user is
     *        reached.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of channels moderated by the user is reached.
     * </p>
     * 
     * @return The token returned from previous API requests until the number of channels moderated by the user is
     *         reached.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of channels moderated by the user is reached.
     * </p>
     * 
     * @param nextToken
     *        The token returned from previous API requests until the number of channels moderated by the user is
     *        reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelsModeratedByAppInstanceUserResult withNextToken(String nextToken) {
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
        if (getChannels() != null)
            sb.append("Channels: ").append(getChannels()).append(",");
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

        if (obj instanceof ListChannelsModeratedByAppInstanceUserResult == false)
            return false;
        ListChannelsModeratedByAppInstanceUserResult other = (ListChannelsModeratedByAppInstanceUserResult) obj;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
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

        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListChannelsModeratedByAppInstanceUserResult clone() {
        try {
            return (ListChannelsModeratedByAppInstanceUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
