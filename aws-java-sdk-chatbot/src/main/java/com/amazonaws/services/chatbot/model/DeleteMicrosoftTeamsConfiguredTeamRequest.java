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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteMicrosoftTeamsConfiguredTeam"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMicrosoftTeamsConfiguredTeamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the initial
     * authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste the team ID from
     * the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the AWS Chatbot Administrator
     * Guide.
     */
    private String teamId;

    /**
     * The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the initial
     * authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste the team ID from
     * the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the AWS Chatbot Administrator
     * Guide.
     * 
     * @param teamId
     *        The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the initial
     *        authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste the team
     *        ID from the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the AWS
     *        Chatbot Administrator Guide.
     */

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the initial
     * authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste the team ID from
     * the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the AWS Chatbot Administrator
     * Guide.
     * 
     * @return The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the
     *         initial authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste
     *         the team ID from the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the
     *         AWS Chatbot Administrator Guide.
     */

    public String getTeamId() {
        return this.teamId;
    }

    /**
     * The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the initial
     * authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste the team ID from
     * the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the AWS Chatbot Administrator
     * Guide.
     * 
     * @param teamId
     *        The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the initial
     *        authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste the team
     *        ID from the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the AWS
     *        Chatbot Administrator Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMicrosoftTeamsConfiguredTeamRequest withTeamId(String teamId) {
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

        if (obj instanceof DeleteMicrosoftTeamsConfiguredTeamRequest == false)
            return false;
        DeleteMicrosoftTeamsConfiguredTeamRequest other = (DeleteMicrosoftTeamsConfiguredTeamRequest) obj;
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

        hashCode = prime * hashCode + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMicrosoftTeamsConfiguredTeamRequest clone() {
        return (DeleteMicrosoftTeamsConfiguredTeamRequest) super.clone();
    }

}
