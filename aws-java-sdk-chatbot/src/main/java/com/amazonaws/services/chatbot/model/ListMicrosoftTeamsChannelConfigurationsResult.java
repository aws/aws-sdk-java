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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsChannelConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMicrosoftTeamsChannelConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     */
    private String nextToken;
    /** A list of AWS Chatbot channel configurations for Microsoft Teams. */
    private java.util.List<TeamsChannelConfiguration> teamChannelConfigurations;

    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response includes only results beyond the token, up to the
     *        value specified by MaxResults.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     * 
     * @return An optional token returned from a prior request. Use this token for pagination of results from this
     *         action. If this parameter is specified, the response includes only results beyond the token, up to the
     *         value specified by MaxResults.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response includes only results beyond the token, up to the
     *        value specified by MaxResults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMicrosoftTeamsChannelConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * A list of AWS Chatbot channel configurations for Microsoft Teams.
     * 
     * @return A list of AWS Chatbot channel configurations for Microsoft Teams.
     */

    public java.util.List<TeamsChannelConfiguration> getTeamChannelConfigurations() {
        return teamChannelConfigurations;
    }

    /**
     * A list of AWS Chatbot channel configurations for Microsoft Teams.
     * 
     * @param teamChannelConfigurations
     *        A list of AWS Chatbot channel configurations for Microsoft Teams.
     */

    public void setTeamChannelConfigurations(java.util.Collection<TeamsChannelConfiguration> teamChannelConfigurations) {
        if (teamChannelConfigurations == null) {
            this.teamChannelConfigurations = null;
            return;
        }

        this.teamChannelConfigurations = new java.util.ArrayList<TeamsChannelConfiguration>(teamChannelConfigurations);
    }

    /**
     * A list of AWS Chatbot channel configurations for Microsoft Teams.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTeamChannelConfigurations(java.util.Collection)} or
     * {@link #withTeamChannelConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param teamChannelConfigurations
     *        A list of AWS Chatbot channel configurations for Microsoft Teams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMicrosoftTeamsChannelConfigurationsResult withTeamChannelConfigurations(TeamsChannelConfiguration... teamChannelConfigurations) {
        if (this.teamChannelConfigurations == null) {
            setTeamChannelConfigurations(new java.util.ArrayList<TeamsChannelConfiguration>(teamChannelConfigurations.length));
        }
        for (TeamsChannelConfiguration ele : teamChannelConfigurations) {
            this.teamChannelConfigurations.add(ele);
        }
        return this;
    }

    /**
     * A list of AWS Chatbot channel configurations for Microsoft Teams.
     * 
     * @param teamChannelConfigurations
     *        A list of AWS Chatbot channel configurations for Microsoft Teams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMicrosoftTeamsChannelConfigurationsResult withTeamChannelConfigurations(java.util.Collection<TeamsChannelConfiguration> teamChannelConfigurations) {
        setTeamChannelConfigurations(teamChannelConfigurations);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTeamChannelConfigurations() != null)
            sb.append("TeamChannelConfigurations: ").append(getTeamChannelConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMicrosoftTeamsChannelConfigurationsResult == false)
            return false;
        ListMicrosoftTeamsChannelConfigurationsResult other = (ListMicrosoftTeamsChannelConfigurationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTeamChannelConfigurations() == null ^ this.getTeamChannelConfigurations() == null)
            return false;
        if (other.getTeamChannelConfigurations() != null && other.getTeamChannelConfigurations().equals(this.getTeamChannelConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTeamChannelConfigurations() == null) ? 0 : getTeamChannelConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ListMicrosoftTeamsChannelConfigurationsResult clone() {
        try {
            return (ListMicrosoftTeamsChannelConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
