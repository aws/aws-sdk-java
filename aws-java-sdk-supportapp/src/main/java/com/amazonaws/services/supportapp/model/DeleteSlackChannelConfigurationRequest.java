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
package com.amazonaws.services.supportapp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/DeleteSlackChannelConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSlackChannelConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     * </p>
     */
    private String channelId;
    /**
     * <p>
     * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * </p>
     */
    private String teamId;

    /**
     * <p>
     * The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     * </p>
     * 
     * @param channelId
     *        The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * <p>
     * The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     * </p>
     * 
     * @return The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * <p>
     * The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     * </p>
     * 
     * @param channelId
     *        The channel ID in Slack. This ID identifies a channel within a Slack workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSlackChannelConfigurationRequest withChannelId(String channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * <p>
     * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * </p>
     * 
     * @param teamId
     *        The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     */

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * <p>
     * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * </p>
     * 
     * @return The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     */

    public String getTeamId() {
        return this.teamId;
    }

    /**
     * <p>
     * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * </p>
     * 
     * @param teamId
     *        The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSlackChannelConfigurationRequest withTeamId(String teamId) {
        setTeamId(teamId);
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
        if (getChannelId() != null)
            sb.append("ChannelId: ").append(getChannelId()).append(",");
        if (getTeamId() != null)
            sb.append("TeamId: ").append(getTeamId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSlackChannelConfigurationRequest == false)
            return false;
        DeleteSlackChannelConfigurationRequest other = (DeleteSlackChannelConfigurationRequest) obj;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getTeamId() == null ^ this.getTeamId() == null)
            return false;
        if (other.getTeamId() != null && other.getTeamId().equals(this.getTeamId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSlackChannelConfigurationRequest clone() {
        return (DeleteSlackChannelConfigurationRequest) super.clone();
    }

}
