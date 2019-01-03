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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListTeamMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTeamMembersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of team member objects for the project.
     * </p>
     */
    private java.util.List<TeamMember> teamMembers;
    /**
     * <p>
     * The continuation token to use when requesting the next set of results, if there are more results to be returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of team member objects for the project.
     * </p>
     * 
     * @return A list of team member objects for the project.
     */

    public java.util.List<TeamMember> getTeamMembers() {
        return teamMembers;
    }

    /**
     * <p>
     * A list of team member objects for the project.
     * </p>
     * 
     * @param teamMembers
     *        A list of team member objects for the project.
     */

    public void setTeamMembers(java.util.Collection<TeamMember> teamMembers) {
        if (teamMembers == null) {
            this.teamMembers = null;
            return;
        }

        this.teamMembers = new java.util.ArrayList<TeamMember>(teamMembers);
    }

    /**
     * <p>
     * A list of team member objects for the project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTeamMembers(java.util.Collection)} or {@link #withTeamMembers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param teamMembers
     *        A list of team member objects for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTeamMembersResult withTeamMembers(TeamMember... teamMembers) {
        if (this.teamMembers == null) {
            setTeamMembers(new java.util.ArrayList<TeamMember>(teamMembers.length));
        }
        for (TeamMember ele : teamMembers) {
            this.teamMembers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of team member objects for the project.
     * </p>
     * 
     * @param teamMembers
     *        A list of team member objects for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTeamMembersResult withTeamMembers(java.util.Collection<TeamMember> teamMembers) {
        setTeamMembers(teamMembers);
        return this;
    }

    /**
     * <p>
     * The continuation token to use when requesting the next set of results, if there are more results to be returned.
     * </p>
     * 
     * @param nextToken
     *        The continuation token to use when requesting the next set of results, if there are more results to be
     *        returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The continuation token to use when requesting the next set of results, if there are more results to be returned.
     * </p>
     * 
     * @return The continuation token to use when requesting the next set of results, if there are more results to be
     *         returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The continuation token to use when requesting the next set of results, if there are more results to be returned.
     * </p>
     * 
     * @param nextToken
     *        The continuation token to use when requesting the next set of results, if there are more results to be
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTeamMembersResult withNextToken(String nextToken) {
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
        if (getTeamMembers() != null)
            sb.append("TeamMembers: ").append(getTeamMembers()).append(",");
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

        if (obj instanceof ListTeamMembersResult == false)
            return false;
        ListTeamMembersResult other = (ListTeamMembersResult) obj;
        if (other.getTeamMembers() == null ^ this.getTeamMembers() == null)
            return false;
        if (other.getTeamMembers() != null && other.getTeamMembers().equals(this.getTeamMembers()) == false)
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

        hashCode = prime * hashCode + ((getTeamMembers() == null) ? 0 : getTeamMembers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTeamMembersResult clone() {
        try {
            return (ListTeamMembersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
