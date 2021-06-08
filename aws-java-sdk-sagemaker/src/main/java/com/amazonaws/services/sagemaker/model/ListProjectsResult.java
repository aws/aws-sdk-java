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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListProjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProjectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of summaries of projects.
     * </p>
     */
    private java.util.List<ProjectSummary> projectSummaryList;
    /**
     * <p>
     * If the result of the previous <code>ListCompilationJobs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model compilation jobs, use the token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of summaries of projects.
     * </p>
     * 
     * @return A list of summaries of projects.
     */

    public java.util.List<ProjectSummary> getProjectSummaryList() {
        return projectSummaryList;
    }

    /**
     * <p>
     * A list of summaries of projects.
     * </p>
     * 
     * @param projectSummaryList
     *        A list of summaries of projects.
     */

    public void setProjectSummaryList(java.util.Collection<ProjectSummary> projectSummaryList) {
        if (projectSummaryList == null) {
            this.projectSummaryList = null;
            return;
        }

        this.projectSummaryList = new java.util.ArrayList<ProjectSummary>(projectSummaryList);
    }

    /**
     * <p>
     * A list of summaries of projects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectSummaryList(java.util.Collection)} or {@link #withProjectSummaryList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param projectSummaryList
     *        A list of summaries of projects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectsResult withProjectSummaryList(ProjectSummary... projectSummaryList) {
        if (this.projectSummaryList == null) {
            setProjectSummaryList(new java.util.ArrayList<ProjectSummary>(projectSummaryList.length));
        }
        for (ProjectSummary ele : projectSummaryList) {
            this.projectSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of summaries of projects.
     * </p>
     * 
     * @param projectSummaryList
     *        A list of summaries of projects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectsResult withProjectSummaryList(java.util.Collection<ProjectSummary> projectSummaryList) {
        setProjectSummaryList(projectSummaryList);
        return this;
    }

    /**
     * <p>
     * If the result of the previous <code>ListCompilationJobs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model compilation jobs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListCompilationJobs</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of model compilation jobs, use the token in
     *        the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListCompilationJobs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model compilation jobs, use the token in the next request.
     * </p>
     * 
     * @return If the result of the previous <code>ListCompilationJobs</code> request was truncated, the response
     *         includes a <code>NextToken</code>. To retrieve the next set of model compilation jobs, use the token in
     *         the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListCompilationJobs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model compilation jobs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListCompilationJobs</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of model compilation jobs, use the token in
     *        the next request.
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
        if (getProjectSummaryList() != null)
            sb.append("ProjectSummaryList: ").append(getProjectSummaryList()).append(",");
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
        if (other.getProjectSummaryList() == null ^ this.getProjectSummaryList() == null)
            return false;
        if (other.getProjectSummaryList() != null && other.getProjectSummaryList().equals(this.getProjectSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getProjectSummaryList() == null) ? 0 : getProjectSummaryList().hashCode());
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
