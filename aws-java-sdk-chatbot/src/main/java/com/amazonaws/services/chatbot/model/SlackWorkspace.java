/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chatbot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A Slack Workspace.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/SlackWorkspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlackWorkspace implements Serializable, Cloneable, StructuredPojo {

    /** The ID of the Slack workspace authorized with AWS Chatbot. */
    private String slackTeamId;
    /** Name of the Slack Workspace. */
    private String slackTeamName;

    /**
     * The ID of the Slack workspace authorized with AWS Chatbot.
     * 
     * @param slackTeamId
     *        The ID of the Slack workspace authorized with AWS Chatbot.
     */

    public void setSlackTeamId(String slackTeamId) {
        this.slackTeamId = slackTeamId;
    }

    /**
     * The ID of the Slack workspace authorized with AWS Chatbot.
     * 
     * @return The ID of the Slack workspace authorized with AWS Chatbot.
     */

    public String getSlackTeamId() {
        return this.slackTeamId;
    }

    /**
     * The ID of the Slack workspace authorized with AWS Chatbot.
     * 
     * @param slackTeamId
     *        The ID of the Slack workspace authorized with AWS Chatbot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackWorkspace withSlackTeamId(String slackTeamId) {
        setSlackTeamId(slackTeamId);
        return this;
    }

    /**
     * Name of the Slack Workspace.
     * 
     * @param slackTeamName
     *        Name of the Slack Workspace.
     */

    public void setSlackTeamName(String slackTeamName) {
        this.slackTeamName = slackTeamName;
    }

    /**
     * Name of the Slack Workspace.
     * 
     * @return Name of the Slack Workspace.
     */

    public String getSlackTeamName() {
        return this.slackTeamName;
    }

    /**
     * Name of the Slack Workspace.
     * 
     * @param slackTeamName
     *        Name of the Slack Workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackWorkspace withSlackTeamName(String slackTeamName) {
        setSlackTeamName(slackTeamName);
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
        if (getSlackTeamId() != null)
            sb.append("SlackTeamId: ").append(getSlackTeamId()).append(",");
        if (getSlackTeamName() != null)
            sb.append("SlackTeamName: ").append(getSlackTeamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlackWorkspace == false)
            return false;
        SlackWorkspace other = (SlackWorkspace) obj;
        if (other.getSlackTeamId() == null ^ this.getSlackTeamId() == null)
            return false;
        if (other.getSlackTeamId() != null && other.getSlackTeamId().equals(this.getSlackTeamId()) == false)
            return false;
        if (other.getSlackTeamName() == null ^ this.getSlackTeamName() == null)
            return false;
        if (other.getSlackTeamName() != null && other.getSlackTeamName().equals(this.getSlackTeamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlackTeamId() == null) ? 0 : getSlackTeamId().hashCode());
        hashCode = prime * hashCode + ((getSlackTeamName() == null) ? 0 : getSlackTeamName().hashCode());
        return hashCode;
    }

    @Override
    public SlackWorkspace clone() {
        try {
            return (SlackWorkspace) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chatbot.model.transform.SlackWorkspaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
