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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The event criteria for the pull request trigger configuration, such as the lists of branches or file paths to include
 * and exclude.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GitPullRequestFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GitPullRequestFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field that specifies which pull request events to filter on (opened, updated, closed) for the trigger
     * configuration.
     * </p>
     */
    private java.util.List<String> events;
    /**
     * <p>
     * The field that specifies to filter on branches for the pull request trigger configuration.
     * </p>
     */
    private GitBranchFilterCriteria branches;
    /**
     * <p>
     * The field that specifies to filter on file paths for the pull request trigger configuration.
     * </p>
     */
    private GitFilePathFilterCriteria filePaths;

    /**
     * <p>
     * The field that specifies which pull request events to filter on (opened, updated, closed) for the trigger
     * configuration.
     * </p>
     * 
     * @return The field that specifies which pull request events to filter on (opened, updated, closed) for the trigger
     *         configuration.
     * @see GitPullRequestEventType
     */

    public java.util.List<String> getEvents() {
        return events;
    }

    /**
     * <p>
     * The field that specifies which pull request events to filter on (opened, updated, closed) for the trigger
     * configuration.
     * </p>
     * 
     * @param events
     *        The field that specifies which pull request events to filter on (opened, updated, closed) for the trigger
     *        configuration.
     * @see GitPullRequestEventType
     */

    public void setEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<String>(events);
    }

    /**
     * <p>
     * The field that specifies which pull request events to filter on (opened, updated, closed) for the trigger
     * configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        The field that specifies which pull request events to filter on (opened, updated, closed) for the trigger
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GitPullRequestEventType
     */

    public GitPullRequestFilter withEvents(String... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<String>(events.length));
        }
        for (String ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The field that specifies which pull request events to filter on (opened, updated, closed) for the trigger
     * configuration.
     * </p>
     * 
     * @param events
     *        The field that specifies which pull request events to filter on (opened, updated, closed) for the trigger
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GitPullRequestEventType
     */

    public GitPullRequestFilter withEvents(java.util.Collection<String> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The field that specifies which pull request events to filter on (opened, updated, closed) for the trigger
     * configuration.
     * </p>
     * 
     * @param events
     *        The field that specifies which pull request events to filter on (opened, updated, closed) for the trigger
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GitPullRequestEventType
     */

    public GitPullRequestFilter withEvents(GitPullRequestEventType... events) {
        java.util.ArrayList<String> eventsCopy = new java.util.ArrayList<String>(events.length);
        for (GitPullRequestEventType value : events) {
            eventsCopy.add(value.toString());
        }
        if (getEvents() == null) {
            setEvents(eventsCopy);
        } else {
            getEvents().addAll(eventsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The field that specifies to filter on branches for the pull request trigger configuration.
     * </p>
     * 
     * @param branches
     *        The field that specifies to filter on branches for the pull request trigger configuration.
     */

    public void setBranches(GitBranchFilterCriteria branches) {
        this.branches = branches;
    }

    /**
     * <p>
     * The field that specifies to filter on branches for the pull request trigger configuration.
     * </p>
     * 
     * @return The field that specifies to filter on branches for the pull request trigger configuration.
     */

    public GitBranchFilterCriteria getBranches() {
        return this.branches;
    }

    /**
     * <p>
     * The field that specifies to filter on branches for the pull request trigger configuration.
     * </p>
     * 
     * @param branches
     *        The field that specifies to filter on branches for the pull request trigger configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitPullRequestFilter withBranches(GitBranchFilterCriteria branches) {
        setBranches(branches);
        return this;
    }

    /**
     * <p>
     * The field that specifies to filter on file paths for the pull request trigger configuration.
     * </p>
     * 
     * @param filePaths
     *        The field that specifies to filter on file paths for the pull request trigger configuration.
     */

    public void setFilePaths(GitFilePathFilterCriteria filePaths) {
        this.filePaths = filePaths;
    }

    /**
     * <p>
     * The field that specifies to filter on file paths for the pull request trigger configuration.
     * </p>
     * 
     * @return The field that specifies to filter on file paths for the pull request trigger configuration.
     */

    public GitFilePathFilterCriteria getFilePaths() {
        return this.filePaths;
    }

    /**
     * <p>
     * The field that specifies to filter on file paths for the pull request trigger configuration.
     * </p>
     * 
     * @param filePaths
     *        The field that specifies to filter on file paths for the pull request trigger configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitPullRequestFilter withFilePaths(GitFilePathFilterCriteria filePaths) {
        setFilePaths(filePaths);
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
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
        if (getBranches() != null)
            sb.append("Branches: ").append(getBranches()).append(",");
        if (getFilePaths() != null)
            sb.append("FilePaths: ").append(getFilePaths());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GitPullRequestFilter == false)
            return false;
        GitPullRequestFilter other = (GitPullRequestFilter) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getBranches() == null ^ this.getBranches() == null)
            return false;
        if (other.getBranches() != null && other.getBranches().equals(this.getBranches()) == false)
            return false;
        if (other.getFilePaths() == null ^ this.getFilePaths() == null)
            return false;
        if (other.getFilePaths() != null && other.getFilePaths().equals(this.getFilePaths()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getBranches() == null) ? 0 : getBranches().hashCode());
        hashCode = prime * hashCode + ((getFilePaths() == null) ? 0 : getFilePaths().hashCode());
        return hashCode;
    }

    @Override
    public GitPullRequestFilter clone() {
        try {
            return (GitPullRequestFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.GitPullRequestFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
