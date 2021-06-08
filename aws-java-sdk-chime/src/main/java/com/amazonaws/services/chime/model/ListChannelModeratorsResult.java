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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelModerators" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChannelModeratorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The token passed by previous API calls until all requested moderators are returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The information about and names of each moderator.
     * </p>
     */
    private java.util.List<ChannelModeratorSummary> channelModerators;

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

    public ListChannelModeratorsResult withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested moderators are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested moderators are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested moderators are returned.
     * </p>
     * 
     * @return The token passed by previous API calls until all requested moderators are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested moderators are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested moderators are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelModeratorsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The information about and names of each moderator.
     * </p>
     * 
     * @return The information about and names of each moderator.
     */

    public java.util.List<ChannelModeratorSummary> getChannelModerators() {
        return channelModerators;
    }

    /**
     * <p>
     * The information about and names of each moderator.
     * </p>
     * 
     * @param channelModerators
     *        The information about and names of each moderator.
     */

    public void setChannelModerators(java.util.Collection<ChannelModeratorSummary> channelModerators) {
        if (channelModerators == null) {
            this.channelModerators = null;
            return;
        }

        this.channelModerators = new java.util.ArrayList<ChannelModeratorSummary>(channelModerators);
    }

    /**
     * <p>
     * The information about and names of each moderator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelModerators(java.util.Collection)} or {@link #withChannelModerators(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param channelModerators
     *        The information about and names of each moderator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelModeratorsResult withChannelModerators(ChannelModeratorSummary... channelModerators) {
        if (this.channelModerators == null) {
            setChannelModerators(new java.util.ArrayList<ChannelModeratorSummary>(channelModerators.length));
        }
        for (ChannelModeratorSummary ele : channelModerators) {
            this.channelModerators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information about and names of each moderator.
     * </p>
     * 
     * @param channelModerators
     *        The information about and names of each moderator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelModeratorsResult withChannelModerators(java.util.Collection<ChannelModeratorSummary> channelModerators) {
        setChannelModerators(channelModerators);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getChannelModerators() != null)
            sb.append("ChannelModerators: ").append(getChannelModerators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChannelModeratorsResult == false)
            return false;
        ListChannelModeratorsResult other = (ListChannelModeratorsResult) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getChannelModerators() == null ^ this.getChannelModerators() == null)
            return false;
        if (other.getChannelModerators() != null && other.getChannelModerators().equals(this.getChannelModerators()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getChannelModerators() == null) ? 0 : getChannelModerators().hashCode());
        return hashCode;
    }

    @Override
    public ListChannelModeratorsResult clone() {
        try {
            return (ListChannelModeratorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
