/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListChannels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChannelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of channels in the account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Channel> channels;
    /**
     * <p>
     * The token to use to get the next page of results after a previous API call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of channels in the account.
     * </p>
     * 
     * @return The list of channels in the account.
     */

    public java.util.List<Channel> getChannels() {
        if (channels == null) {
            channels = new com.amazonaws.internal.SdkInternalList<Channel>();
        }
        return channels;
    }

    /**
     * <p>
     * The list of channels in the account.
     * </p>
     * 
     * @param channels
     *        The list of channels in the account.
     */

    public void setChannels(java.util.Collection<Channel> channels) {
        if (channels == null) {
            this.channels = null;
            return;
        }

        this.channels = new com.amazonaws.internal.SdkInternalList<Channel>(channels);
    }

    /**
     * <p>
     * The list of channels in the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannels(java.util.Collection)} or {@link #withChannels(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param channels
     *        The list of channels in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelsResult withChannels(Channel... channels) {
        if (this.channels == null) {
            setChannels(new com.amazonaws.internal.SdkInternalList<Channel>(channels.length));
        }
        for (Channel ele : channels) {
            this.channels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of channels in the account.
     * </p>
     * 
     * @param channels
     *        The list of channels in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelsResult withChannels(java.util.Collection<Channel> channels) {
        setChannels(channels);
        return this;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call.
     * </p>
     * 
     * @return The token to use to get the next page of results after a previous API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelsResult withNextToken(String nextToken) {
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
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChannelsResult == false)
            return false;
        ListChannelsResult other = (ListChannelsResult) obj;
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
    public ListChannelsResult clone() {
        try {
            return (ListChannelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
