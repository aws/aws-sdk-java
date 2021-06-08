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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudioMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStudioMembersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of members.
     * </p>
     */
    private java.util.List<StudioMembership> members;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of members.
     * </p>
     * 
     * @return A list of members.
     */

    public java.util.List<StudioMembership> getMembers() {
        return members;
    }

    /**
     * <p>
     * A list of members.
     * </p>
     * 
     * @param members
     *        A list of members.
     */

    public void setMembers(java.util.Collection<StudioMembership> members) {
        if (members == null) {
            this.members = null;
            return;
        }

        this.members = new java.util.ArrayList<StudioMembership>(members);
    }

    /**
     * <p>
     * A list of members.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMembers(java.util.Collection)} or {@link #withMembers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param members
     *        A list of members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioMembersResult withMembers(StudioMembership... members) {
        if (this.members == null) {
            setMembers(new java.util.ArrayList<StudioMembership>(members.length));
        }
        for (StudioMembership ele : members) {
            this.members.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of members.
     * </p>
     * 
     * @param members
     *        A list of members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioMembersResult withMembers(java.util.Collection<StudioMembership> members) {
        setMembers(members);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioMembersResult withNextToken(String nextToken) {
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
        if (getMembers() != null)
            sb.append("Members: ").append(getMembers()).append(",");
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

        if (obj instanceof ListStudioMembersResult == false)
            return false;
        ListStudioMembersResult other = (ListStudioMembersResult) obj;
        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
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

        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStudioMembersResult clone() {
        try {
            return (ListStudioMembersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
