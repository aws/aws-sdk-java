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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The collection of all active groups.
     * </p>
     */
    private java.util.List<GroupSummary> groups;
    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The collection of all active groups.
     * </p>
     * 
     * @return The collection of all active groups.
     */

    public java.util.List<GroupSummary> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The collection of all active groups.
     * </p>
     * 
     * @param groups
     *        The collection of all active groups.
     */

    public void setGroups(java.util.Collection<GroupSummary> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<GroupSummary>(groups);
    }

    /**
     * <p>
     * The collection of all active groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The collection of all active groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupsResult withGroups(GroupSummary... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<GroupSummary>(groups.length));
        }
        for (GroupSummary ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The collection of all active groups.
     * </p>
     * 
     * @param groups
     *        The collection of all active groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupsResult withGroups(java.util.Collection<GroupSummary> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Not used.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     * 
     * @return Pagination token. Not used.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupsResult withNextToken(String nextToken) {
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
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
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

        if (obj instanceof GetGroupsResult == false)
            return false;
        GetGroupsResult other = (GetGroupsResult) obj;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
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

        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupsResult clone() {
        try {
            return (GetGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
