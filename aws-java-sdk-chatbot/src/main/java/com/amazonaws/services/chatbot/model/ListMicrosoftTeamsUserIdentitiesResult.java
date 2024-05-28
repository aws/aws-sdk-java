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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/ListMicrosoftTeamsUserIdentities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMicrosoftTeamsUserIdentitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /** User level permissions associated to a channel configuration. */
    private java.util.List<TeamsUserIdentity> teamsUserIdentities;
    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     */
    private String nextToken;

    /**
     * User level permissions associated to a channel configuration.
     * 
     * @return User level permissions associated to a channel configuration.
     */

    public java.util.List<TeamsUserIdentity> getTeamsUserIdentities() {
        return teamsUserIdentities;
    }

    /**
     * User level permissions associated to a channel configuration.
     * 
     * @param teamsUserIdentities
     *        User level permissions associated to a channel configuration.
     */

    public void setTeamsUserIdentities(java.util.Collection<TeamsUserIdentity> teamsUserIdentities) {
        if (teamsUserIdentities == null) {
            this.teamsUserIdentities = null;
            return;
        }

        this.teamsUserIdentities = new java.util.ArrayList<TeamsUserIdentity>(teamsUserIdentities);
    }

    /**
     * User level permissions associated to a channel configuration.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTeamsUserIdentities(java.util.Collection)} or {@link #withTeamsUserIdentities(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param teamsUserIdentities
     *        User level permissions associated to a channel configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMicrosoftTeamsUserIdentitiesResult withTeamsUserIdentities(TeamsUserIdentity... teamsUserIdentities) {
        if (this.teamsUserIdentities == null) {
            setTeamsUserIdentities(new java.util.ArrayList<TeamsUserIdentity>(teamsUserIdentities.length));
        }
        for (TeamsUserIdentity ele : teamsUserIdentities) {
            this.teamsUserIdentities.add(ele);
        }
        return this;
    }

    /**
     * User level permissions associated to a channel configuration.
     * 
     * @param teamsUserIdentities
     *        User level permissions associated to a channel configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMicrosoftTeamsUserIdentitiesResult withTeamsUserIdentities(java.util.Collection<TeamsUserIdentity> teamsUserIdentities) {
        setTeamsUserIdentities(teamsUserIdentities);
        return this;
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

    public ListMicrosoftTeamsUserIdentitiesResult withNextToken(String nextToken) {
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
        if (getTeamsUserIdentities() != null)
            sb.append("TeamsUserIdentities: ").append(getTeamsUserIdentities()).append(",");
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

        if (obj instanceof ListMicrosoftTeamsUserIdentitiesResult == false)
            return false;
        ListMicrosoftTeamsUserIdentitiesResult other = (ListMicrosoftTeamsUserIdentitiesResult) obj;
        if (other.getTeamsUserIdentities() == null ^ this.getTeamsUserIdentities() == null)
            return false;
        if (other.getTeamsUserIdentities() != null && other.getTeamsUserIdentities().equals(this.getTeamsUserIdentities()) == false)
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

        hashCode = prime * hashCode + ((getTeamsUserIdentities() == null) ? 0 : getTeamsUserIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMicrosoftTeamsUserIdentitiesResult clone() {
        try {
            return (ListMicrosoftTeamsUserIdentitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
