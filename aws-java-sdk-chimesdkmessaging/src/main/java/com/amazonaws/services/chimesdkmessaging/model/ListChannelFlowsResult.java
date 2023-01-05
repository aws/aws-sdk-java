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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelFlows"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChannelFlowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The information about each channel flow.
     * </p>
     */
    private java.util.List<ChannelFlowSummary> channelFlows;
    /**
     * <p>
     * The token passed by previous API calls until all requested channels are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The information about each channel flow.
     * </p>
     * 
     * @return The information about each channel flow.
     */

    public java.util.List<ChannelFlowSummary> getChannelFlows() {
        return channelFlows;
    }

    /**
     * <p>
     * The information about each channel flow.
     * </p>
     * 
     * @param channelFlows
     *        The information about each channel flow.
     */

    public void setChannelFlows(java.util.Collection<ChannelFlowSummary> channelFlows) {
        if (channelFlows == null) {
            this.channelFlows = null;
            return;
        }

        this.channelFlows = new java.util.ArrayList<ChannelFlowSummary>(channelFlows);
    }

    /**
     * <p>
     * The information about each channel flow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelFlows(java.util.Collection)} or {@link #withChannelFlows(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param channelFlows
     *        The information about each channel flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelFlowsResult withChannelFlows(ChannelFlowSummary... channelFlows) {
        if (this.channelFlows == null) {
            setChannelFlows(new java.util.ArrayList<ChannelFlowSummary>(channelFlows.length));
        }
        for (ChannelFlowSummary ele : channelFlows) {
            this.channelFlows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information about each channel flow.
     * </p>
     * 
     * @param channelFlows
     *        The information about each channel flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelFlowsResult withChannelFlows(java.util.Collection<ChannelFlowSummary> channelFlows) {
        setChannelFlows(channelFlows);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channels are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested channels are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channels are returned.
     * </p>
     * 
     * @return The token passed by previous API calls until all requested channels are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channels are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested channels are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelFlowsResult withNextToken(String nextToken) {
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
        if (getChannelFlows() != null)
            sb.append("ChannelFlows: ").append(getChannelFlows()).append(",");
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

        if (obj instanceof ListChannelFlowsResult == false)
            return false;
        ListChannelFlowsResult other = (ListChannelFlowsResult) obj;
        if (other.getChannelFlows() == null ^ this.getChannelFlows() == null)
            return false;
        if (other.getChannelFlows() != null && other.getChannelFlows().equals(this.getChannelFlows()) == false)
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

        hashCode = prime * hashCode + ((getChannelFlows() == null) ? 0 : getChannelFlows().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListChannelFlowsResult clone() {
        try {
            return (ListChannelFlowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
