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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListWorkGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of workgroups, including their names, descriptions, creation times, and states.
     * </p>
     */
    private java.util.List<WorkGroupSummary> workGroups;
    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of workgroups, including their names, descriptions, creation times, and states.
     * </p>
     * 
     * @return The list of workgroups, including their names, descriptions, creation times, and states.
     */

    public java.util.List<WorkGroupSummary> getWorkGroups() {
        return workGroups;
    }

    /**
     * <p>
     * The list of workgroups, including their names, descriptions, creation times, and states.
     * </p>
     * 
     * @param workGroups
     *        The list of workgroups, including their names, descriptions, creation times, and states.
     */

    public void setWorkGroups(java.util.Collection<WorkGroupSummary> workGroups) {
        if (workGroups == null) {
            this.workGroups = null;
            return;
        }

        this.workGroups = new java.util.ArrayList<WorkGroupSummary>(workGroups);
    }

    /**
     * <p>
     * The list of workgroups, including their names, descriptions, creation times, and states.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkGroups(java.util.Collection)} or {@link #withWorkGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workGroups
     *        The list of workgroups, including their names, descriptions, creation times, and states.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkGroupsResult withWorkGroups(WorkGroupSummary... workGroups) {
        if (this.workGroups == null) {
            setWorkGroups(new java.util.ArrayList<WorkGroupSummary>(workGroups.length));
        }
        for (WorkGroupSummary ele : workGroups) {
            this.workGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of workgroups, including their names, descriptions, creation times, and states.
     * </p>
     * 
     * @param workGroups
     *        The list of workgroups, including their names, descriptions, creation times, and states.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkGroupsResult withWorkGroups(java.util.Collection<WorkGroupSummary> workGroups) {
        setWorkGroups(workGroups);
        return this;
    }

    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     * 
     * @param nextToken
     *        A token to be used by the next request if this request is truncated.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     * 
     * @return A token to be used by the next request if this request is truncated.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     * 
     * @param nextToken
     *        A token to be used by the next request if this request is truncated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkGroupsResult withNextToken(String nextToken) {
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
        if (getWorkGroups() != null)
            sb.append("WorkGroups: ").append(getWorkGroups()).append(",");
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

        if (obj instanceof ListWorkGroupsResult == false)
            return false;
        ListWorkGroupsResult other = (ListWorkGroupsResult) obj;
        if (other.getWorkGroups() == null ^ this.getWorkGroups() == null)
            return false;
        if (other.getWorkGroups() != null && other.getWorkGroups().equals(this.getWorkGroups()) == false)
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

        hashCode = prime * hashCode + ((getWorkGroups() == null) ? 0 : getWorkGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkGroupsResult clone() {
        try {
            return (ListWorkGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
