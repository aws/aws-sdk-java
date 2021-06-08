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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListProjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProjectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that summarizes each project in the portal.
     * </p>
     */
    private java.util.List<ProjectSummary> projectSummaries;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each project in the portal.
     * </p>
     * 
     * @return A list that summarizes each project in the portal.
     */

    public java.util.List<ProjectSummary> getProjectSummaries() {
        return projectSummaries;
    }

    /**
     * <p>
     * A list that summarizes each project in the portal.
     * </p>
     * 
     * @param projectSummaries
     *        A list that summarizes each project in the portal.
     */

    public void setProjectSummaries(java.util.Collection<ProjectSummary> projectSummaries) {
        if (projectSummaries == null) {
            this.projectSummaries = null;
            return;
        }

        this.projectSummaries = new java.util.ArrayList<ProjectSummary>(projectSummaries);
    }

    /**
     * <p>
     * A list that summarizes each project in the portal.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectSummaries(java.util.Collection)} or {@link #withProjectSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param projectSummaries
     *        A list that summarizes each project in the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectsResult withProjectSummaries(ProjectSummary... projectSummaries) {
        if (this.projectSummaries == null) {
            setProjectSummaries(new java.util.ArrayList<ProjectSummary>(projectSummaries.length));
        }
        for (ProjectSummary ele : projectSummaries) {
            this.projectSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each project in the portal.
     * </p>
     * 
     * @param projectSummaries
     *        A list that summarizes each project in the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectsResult withProjectSummaries(java.util.Collection<ProjectSummary> projectSummaries) {
        setProjectSummaries(projectSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectsResult withNextToken(String nextToken) {
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
        if (getProjectSummaries() != null)
            sb.append("ProjectSummaries: ").append(getProjectSummaries()).append(",");
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

        if (obj instanceof ListProjectsResult == false)
            return false;
        ListProjectsResult other = (ListProjectsResult) obj;
        if (other.getProjectSummaries() == null ^ this.getProjectSummaries() == null)
            return false;
        if (other.getProjectSummaries() != null && other.getProjectSummaries().equals(this.getProjectSummaries()) == false)
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

        hashCode = prime * hashCode + ((getProjectSummaries() == null) ? 0 : getProjectSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
