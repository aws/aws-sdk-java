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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListProjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProjectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use in a subsequent <code>ListProjects</code> operation to return the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of structures that contain the configuration details of the projects in the Region.
     * </p>
     */
    private java.util.List<ProjectSummary> projects;

    /**
     * <p>
     * The token to use in a subsequent <code>ListProjects</code> operation to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent <code>ListProjects</code> operation to return the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListProjects</code> operation to return the next set of results.
     * </p>
     * 
     * @return The token to use in a subsequent <code>ListProjects</code> operation to return the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListProjects</code> operation to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent <code>ListProjects</code> operation to return the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of structures that contain the configuration details of the projects in the Region.
     * </p>
     * 
     * @return An array of structures that contain the configuration details of the projects in the Region.
     */

    public java.util.List<ProjectSummary> getProjects() {
        return projects;
    }

    /**
     * <p>
     * An array of structures that contain the configuration details of the projects in the Region.
     * </p>
     * 
     * @param projects
     *        An array of structures that contain the configuration details of the projects in the Region.
     */

    public void setProjects(java.util.Collection<ProjectSummary> projects) {
        if (projects == null) {
            this.projects = null;
            return;
        }

        this.projects = new java.util.ArrayList<ProjectSummary>(projects);
    }

    /**
     * <p>
     * An array of structures that contain the configuration details of the projects in the Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjects(java.util.Collection)} or {@link #withProjects(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param projects
     *        An array of structures that contain the configuration details of the projects in the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectsResult withProjects(ProjectSummary... projects) {
        if (this.projects == null) {
            setProjects(new java.util.ArrayList<ProjectSummary>(projects.length));
        }
        for (ProjectSummary ele : projects) {
            this.projects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that contain the configuration details of the projects in the Region.
     * </p>
     * 
     * @param projects
     *        An array of structures that contain the configuration details of the projects in the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectsResult withProjects(java.util.Collection<ProjectSummary> projects) {
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

        if (obj instanceof ListProjectsResult == false)
            return false;
        ListProjectsResult other = (ListProjectsResult) obj;
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
    public ListProjectsResult clone() {
        try {
            return (ListProjectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
