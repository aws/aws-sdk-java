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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetProjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetProjectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the requested build projects.
     * </p>
     */
    private java.util.List<Project> projects;
    /**
     * <p>
     * The names of build projects for which information could not be found.
     * </p>
     */
    private java.util.List<String> projectsNotFound;

    /**
     * <p>
     * Information about the requested build projects.
     * </p>
     * 
     * @return Information about the requested build projects.
     */

    public java.util.List<Project> getProjects() {
        return projects;
    }

    /**
     * <p>
     * Information about the requested build projects.
     * </p>
     * 
     * @param projects
     *        Information about the requested build projects.
     */

    public void setProjects(java.util.Collection<Project> projects) {
        if (projects == null) {
            this.projects = null;
            return;
        }

        this.projects = new java.util.ArrayList<Project>(projects);
    }

    /**
     * <p>
     * Information about the requested build projects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjects(java.util.Collection)} or {@link #withProjects(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param projects
     *        Information about the requested build projects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetProjectsResult withProjects(Project... projects) {
        if (this.projects == null) {
            setProjects(new java.util.ArrayList<Project>(projects.length));
        }
        for (Project ele : projects) {
            this.projects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the requested build projects.
     * </p>
     * 
     * @param projects
     *        Information about the requested build projects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetProjectsResult withProjects(java.util.Collection<Project> projects) {
        setProjects(projects);
        return this;
    }

    /**
     * <p>
     * The names of build projects for which information could not be found.
     * </p>
     * 
     * @return The names of build projects for which information could not be found.
     */

    public java.util.List<String> getProjectsNotFound() {
        return projectsNotFound;
    }

    /**
     * <p>
     * The names of build projects for which information could not be found.
     * </p>
     * 
     * @param projectsNotFound
     *        The names of build projects for which information could not be found.
     */

    public void setProjectsNotFound(java.util.Collection<String> projectsNotFound) {
        if (projectsNotFound == null) {
            this.projectsNotFound = null;
            return;
        }

        this.projectsNotFound = new java.util.ArrayList<String>(projectsNotFound);
    }

    /**
     * <p>
     * The names of build projects for which information could not be found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectsNotFound(java.util.Collection)} or {@link #withProjectsNotFound(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param projectsNotFound
     *        The names of build projects for which information could not be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetProjectsResult withProjectsNotFound(String... projectsNotFound) {
        if (this.projectsNotFound == null) {
            setProjectsNotFound(new java.util.ArrayList<String>(projectsNotFound.length));
        }
        for (String ele : projectsNotFound) {
            this.projectsNotFound.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of build projects for which information could not be found.
     * </p>
     * 
     * @param projectsNotFound
     *        The names of build projects for which information could not be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetProjectsResult withProjectsNotFound(java.util.Collection<String> projectsNotFound) {
        setProjectsNotFound(projectsNotFound);
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
        if (getProjects() != null)
            sb.append("Projects: ").append(getProjects()).append(",");
        if (getProjectsNotFound() != null)
            sb.append("ProjectsNotFound: ").append(getProjectsNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetProjectsResult == false)
            return false;
        BatchGetProjectsResult other = (BatchGetProjectsResult) obj;
        if (other.getProjects() == null ^ this.getProjects() == null)
            return false;
        if (other.getProjects() != null && other.getProjects().equals(this.getProjects()) == false)
            return false;
        if (other.getProjectsNotFound() == null ^ this.getProjectsNotFound() == null)
            return false;
        if (other.getProjectsNotFound() != null && other.getProjectsNotFound().equals(this.getProjectsNotFound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjects() == null) ? 0 : getProjects().hashCode());
        hashCode = prime * hashCode + ((getProjectsNotFound() == null) ? 0 : getProjectsNotFound().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetProjectsResult clone() {
        try {
            return (BatchGetProjectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
