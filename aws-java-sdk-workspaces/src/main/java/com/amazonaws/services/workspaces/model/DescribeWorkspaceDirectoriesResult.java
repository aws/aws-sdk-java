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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceDirectories"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkspaceDirectoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the directories.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<WorkspaceDirectory> directories;
    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the directories.
     * </p>
     * 
     * @return Information about the directories.
     */

    public java.util.List<WorkspaceDirectory> getDirectories() {
        if (directories == null) {
            directories = new com.amazonaws.internal.SdkInternalList<WorkspaceDirectory>();
        }
        return directories;
    }

    /**
     * <p>
     * Information about the directories.
     * </p>
     * 
     * @param directories
     *        Information about the directories.
     */

    public void setDirectories(java.util.Collection<WorkspaceDirectory> directories) {
        if (directories == null) {
            this.directories = null;
            return;
        }

        this.directories = new com.amazonaws.internal.SdkInternalList<WorkspaceDirectory>(directories);
    }

    /**
     * <p>
     * Information about the directories.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDirectories(java.util.Collection)} or {@link #withDirectories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param directories
     *        Information about the directories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceDirectoriesResult withDirectories(WorkspaceDirectory... directories) {
        if (this.directories == null) {
            setDirectories(new com.amazonaws.internal.SdkInternalList<WorkspaceDirectory>(directories.length));
        }
        for (WorkspaceDirectory ele : directories) {
            this.directories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the directories.
     * </p>
     * 
     * @param directories
     *        Information about the directories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceDirectoriesResult withDirectories(java.util.Collection<WorkspaceDirectory> directories) {
        setDirectories(directories);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next set of results, or null if no more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @return The token to use to retrieve the next set of results, or null if no more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next set of results, or null if no more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceDirectoriesResult withNextToken(String nextToken) {
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
        if (getDirectories() != null)
            sb.append("Directories: ").append(getDirectories()).append(",");
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

        if (obj instanceof DescribeWorkspaceDirectoriesResult == false)
            return false;
        DescribeWorkspaceDirectoriesResult other = (DescribeWorkspaceDirectoriesResult) obj;
        if (other.getDirectories() == null ^ this.getDirectories() == null)
            return false;
        if (other.getDirectories() != null && other.getDirectories().equals(this.getDirectories()) == false)
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

        hashCode = prime * hashCode + ((getDirectories() == null) ? 0 : getDirectories().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspaceDirectoriesResult clone() {
        try {
            return (DescribeWorkspaceDirectoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
