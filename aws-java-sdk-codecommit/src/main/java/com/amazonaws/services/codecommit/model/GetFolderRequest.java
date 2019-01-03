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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFolder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFolderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * A fully-qualified reference used to identify a commit that contains the version of the folder's content to
     * return. A fully-qualified reference can be a commit ID, branch name, tag, or reference such as HEAD. If no
     * specifier is provided, the folder content will be returned as it exists in the HEAD commit.
     * </p>
     */
    private String commitSpecifier;
    /**
     * <p>
     * The fully-qualified path to the folder whose contents will be returned, including the folder name. For example,
     * /examples is a fully-qualified path to a folder named examples that was created off of the root directory (/) of
     * a repository.
     * </p>
     */
    private String folderPath;

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @return The name of the repository.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * A fully-qualified reference used to identify a commit that contains the version of the folder's content to
     * return. A fully-qualified reference can be a commit ID, branch name, tag, or reference such as HEAD. If no
     * specifier is provided, the folder content will be returned as it exists in the HEAD commit.
     * </p>
     * 
     * @param commitSpecifier
     *        A fully-qualified reference used to identify a commit that contains the version of the folder's content to
     *        return. A fully-qualified reference can be a commit ID, branch name, tag, or reference such as HEAD. If no
     *        specifier is provided, the folder content will be returned as it exists in the HEAD commit.
     */

    public void setCommitSpecifier(String commitSpecifier) {
        this.commitSpecifier = commitSpecifier;
    }

    /**
     * <p>
     * A fully-qualified reference used to identify a commit that contains the version of the folder's content to
     * return. A fully-qualified reference can be a commit ID, branch name, tag, or reference such as HEAD. If no
     * specifier is provided, the folder content will be returned as it exists in the HEAD commit.
     * </p>
     * 
     * @return A fully-qualified reference used to identify a commit that contains the version of the folder's content
     *         to return. A fully-qualified reference can be a commit ID, branch name, tag, or reference such as HEAD.
     *         If no specifier is provided, the folder content will be returned as it exists in the HEAD commit.
     */

    public String getCommitSpecifier() {
        return this.commitSpecifier;
    }

    /**
     * <p>
     * A fully-qualified reference used to identify a commit that contains the version of the folder's content to
     * return. A fully-qualified reference can be a commit ID, branch name, tag, or reference such as HEAD. If no
     * specifier is provided, the folder content will be returned as it exists in the HEAD commit.
     * </p>
     * 
     * @param commitSpecifier
     *        A fully-qualified reference used to identify a commit that contains the version of the folder's content to
     *        return. A fully-qualified reference can be a commit ID, branch name, tag, or reference such as HEAD. If no
     *        specifier is provided, the folder content will be returned as it exists in the HEAD commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderRequest withCommitSpecifier(String commitSpecifier) {
        setCommitSpecifier(commitSpecifier);
        return this;
    }

    /**
     * <p>
     * The fully-qualified path to the folder whose contents will be returned, including the folder name. For example,
     * /examples is a fully-qualified path to a folder named examples that was created off of the root directory (/) of
     * a repository.
     * </p>
     * 
     * @param folderPath
     *        The fully-qualified path to the folder whose contents will be returned, including the folder name. For
     *        example, /examples is a fully-qualified path to a folder named examples that was created off of the root
     *        directory (/) of a repository.
     */

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    /**
     * <p>
     * The fully-qualified path to the folder whose contents will be returned, including the folder name. For example,
     * /examples is a fully-qualified path to a folder named examples that was created off of the root directory (/) of
     * a repository.
     * </p>
     * 
     * @return The fully-qualified path to the folder whose contents will be returned, including the folder name. For
     *         example, /examples is a fully-qualified path to a folder named examples that was created off of the root
     *         directory (/) of a repository.
     */

    public String getFolderPath() {
        return this.folderPath;
    }

    /**
     * <p>
     * The fully-qualified path to the folder whose contents will be returned, including the folder name. For example,
     * /examples is a fully-qualified path to a folder named examples that was created off of the root directory (/) of
     * a repository.
     * </p>
     * 
     * @param folderPath
     *        The fully-qualified path to the folder whose contents will be returned, including the folder name. For
     *        example, /examples is a fully-qualified path to a folder named examples that was created off of the root
     *        directory (/) of a repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderRequest withFolderPath(String folderPath) {
        setFolderPath(folderPath);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getCommitSpecifier() != null)
            sb.append("CommitSpecifier: ").append(getCommitSpecifier()).append(",");
        if (getFolderPath() != null)
            sb.append("FolderPath: ").append(getFolderPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFolderRequest == false)
            return false;
        GetFolderRequest other = (GetFolderRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getCommitSpecifier() == null ^ this.getCommitSpecifier() == null)
            return false;
        if (other.getCommitSpecifier() != null && other.getCommitSpecifier().equals(this.getCommitSpecifier()) == false)
            return false;
        if (other.getFolderPath() == null ^ this.getFolderPath() == null)
            return false;
        if (other.getFolderPath() != null && other.getFolderPath().equals(this.getFolderPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getCommitSpecifier() == null) ? 0 : getCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getFolderPath() == null) ? 0 : getFolderPath().hashCode());
        return hashCode;
    }

    @Override
    public GetFolderRequest clone() {
        return (GetFolderRequest) super.clone();
    }

}
