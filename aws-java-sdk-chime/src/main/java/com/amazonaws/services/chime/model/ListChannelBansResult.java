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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelBans" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChannelBansResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The token passed by previous API calls until all requested bans are returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The information for each requested ban.
     * </p>
     */
    private java.util.List<ChannelBanSummary> channelBans;

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

    public ListChannelBansResult withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested bans are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested bans are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested bans are returned.
     * </p>
     * 
     * @return The token passed by previous API calls until all requested bans are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested bans are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested bans are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelBansResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The information for each requested ban.
     * </p>
     * 
     * @return The information for each requested ban.
     */

    public java.util.List<ChannelBanSummary> getChannelBans() {
        return channelBans;
    }

    /**
     * <p>
     * The information for each requested ban.
     * </p>
     * 
     * @param channelBans
     *        The information for each requested ban.
     */

    public void setChannelBans(java.util.Collection<ChannelBanSummary> channelBans) {
        if (channelBans == null) {
            this.channelBans = null;
            return;
        }

        this.channelBans = new java.util.ArrayList<ChannelBanSummary>(channelBans);
    }

    /**
     * <p>
     * The information for each requested ban.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelBans(java.util.Collection)} or {@link #withChannelBans(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param channelBans
     *        The information for each requested ban.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelBansResult withChannelBans(ChannelBanSummary... channelBans) {
        if (this.channelBans == null) {
            setChannelBans(new java.util.ArrayList<ChannelBanSummary>(channelBans.length));
        }
        for (ChannelBanSummary ele : channelBans) {
            this.channelBans.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information for each requested ban.
     * </p>
     * 
     * @param channelBans
     *        The information for each requested ban.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelBansResult withChannelBans(java.util.Collection<ChannelBanSummary> channelBans) {
        setChannelBans(channelBans);
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
        if (getChannelBans() != null)
            sb.append("ChannelBans: ").append(getChannelBans());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChannelBansResult == false)
            return false;
        ListChannelBansResult other = (ListChannelBansResult) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getChannelBans() == null ^ this.getChannelBans() == null)
            return false;
        if (other.getChannelBans() != null && other.getChannelBans().equals(this.getChannelBans()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getChannelBans() == null) ? 0 : getChannelBans().hashCode());
        return hashCode;
    }

    @Override
    public ListChannelBansResult clone() {
        try {
            return (ListChannelBansResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
