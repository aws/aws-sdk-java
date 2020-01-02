/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListSharedProjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSharedProjectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of ARNs for the build projects shared with the current AWS account or user.
     * </p>
     */
    private java.util.List<String> projects;

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, the maximum number of items that can be returned is the value specified in
     *        <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i>
     *        is returned. To get the next batch of items in the list, call this operation again, adding the next token
     *        to the call. To get all of the items in the list, keep calling this operation with each subsequent next
     *        token that is returned, until no more next tokens are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * 
     * @return During a previous call, the maximum number of items that can be returned is the value specified in
     *         <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i>
     *         is returned. To get the next batch of items in the list, call this operation again, adding the next token
     *         to the call. To get all of the items in the list, keep calling this operation with each subsequent next
     *         token that is returned, until no more next tokens are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, the maximum number of items that can be returned is the value specified in
     *        <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i>
     *        is returned. To get the next batch of items in the list, call this operation again, adding the next token
     *        to the call. To get all of the items in the list, keep calling this operation with each subsequent next
     *        token that is returned, until no more next tokens are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSharedProjectsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of ARNs for the build projects shared with the current AWS account or user.
     * </p>
     * 
     * @return The list of ARNs for the build projects shared with the current AWS account or user.
     */

    public java.util.List<String> getProjects() {
        return projects;
    }

    /**
     * <p>
     * The list of ARNs for the build projects shared with the current AWS account or user.
     * </p>
     * 
     * @param projects
     *        The list of ARNs for the build projects shared with the current AWS account or user.
     */

    public void setProjects(java.util.Collection<String> projects) {
        if (projects == null) {
            this.projects = null;
            return;
        }

        this.projects = new java.util.ArrayList<String>(projects);
    }

    /**
     * <p>
     * The list of ARNs for the build projects shared with the current AWS account or user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjects(java.util.Collection)} or {@link #withProjects(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param projects
     *        The list of ARNs for the build projects shared with the current AWS account or user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSharedProjectsResult withProjects(String... projects) {
        if (this.projects == null) {
            setProjects(new java.util.ArrayList<String>(projects.length));
        }
        for (String ele : projects) {
            this.projects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of ARNs for the build projects shared with the current AWS account or user.
     * </p>
     * 
     * @param projects
     *        The list of ARNs for the build projects shared with the current AWS account or user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSharedProjectsResult withProjects(java.util.Collection<String> projects) {
        setProjects(projects);
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
        if (getProjects() != null)
            sb.append("Projects: ").append(getProjects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSharedProjectsResult == false)
            return false;
        ListSharedProjectsResult other = (ListSharedProjectsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProjects() == null ^ this.getProjects() == null)
            return false;
        if (other.getProjects() != null && other.getProjects().equals(this.getProjects()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProjects() == null) ? 0 : getProjects().hashCode());
        return hashCode;
    }

    @Override
    public ListSharedProjectsResult clone() {
        try {
            return (ListSharedProjectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
