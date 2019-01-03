/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListChannels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChannelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of "ChannelSummary" objects.
     * </p>
     */
    private java.util.List<ChannelSummary> channelSummaries;
    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of "ChannelSummary" objects.
     * </p>
     * 
     * @return A list of "ChannelSummary" objects.
     */

    public java.util.List<ChannelSummary> getChannelSummaries() {
        return channelSummaries;
    }

    /**
     * <p>
     * A list of "ChannelSummary" objects.
     * </p>
     * 
     * @param channelSummaries
     *        A list of "ChannelSummary" objects.
     */

    public void setChannelSummaries(java.util.Collection<ChannelSummary> channelSummaries) {
        if (channelSummaries == null) {
            this.channelSummaries = null;
            return;
        }

        this.channelSummaries = new java.util.ArrayList<ChannelSummary>(channelSummaries);
    }

    /**
     * <p>
     * A list of "ChannelSummary" objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelSummaries(java.util.Collection)} or {@link #withChannelSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param channelSummaries
     *        A list of "ChannelSummary" objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelsResult withChannelSummaries(ChannelSummary... channelSummaries) {
        if (this.channelSummaries == null) {
            setChannelSummaries(new java.util.ArrayList<ChannelSummary>(channelSummaries.length));
        }
        for (ChannelSummary ele : channelSummaries) {
            this.channelSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of "ChannelSummary" objects.
     * </p>
     * 
     * @param channelSummaries
     *        A list of "ChannelSummary" objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelsResult withChannelSummaries(java.util.Collection<ChannelSummary> channelSummaries) {
        setChannelSummaries(channelSummaries);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
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
        if (getChannelSummaries() != null)
            sb.append("ChannelSummaries: ").append(getChannelSummaries()).append(",");
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
        if (other.getChannelSummaries() == null ^ this.getChannelSummaries() == null)
            return false;
        if (other.getChannelSummaries() != null && other.getChannelSummaries().equals(this.getChannelSummaries()) == false)
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

        hashCode = prime * hashCode + ((getChannelSummaries() == null) ? 0 : getChannelSummaries().hashCode());
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
