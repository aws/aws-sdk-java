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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository that contains the file.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The fully-quaified reference that identifies the commit that contains the file. For example, you could specify a
     * full commit ID, a tag, a branch name, or a reference such as refs/heads/master. If none is provided, then the
     * head commit will be used.
     * </p>
     */
    private String commitSpecifier;
    /**
     * <p>
     * The fully-qualified path to the file, including the full name and extension of the file. For example,
     * /examples/file.md is the fully-qualified path to a file named file.md in a folder named examples.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * The name of the repository that contains the file.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the file.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the file.
     * </p>
     * 
     * @return The name of the repository that contains the file.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the file.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFileRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The fully-quaified reference that identifies the commit that contains the file. For example, you could specify a
     * full commit ID, a tag, a branch name, or a reference such as refs/heads/master. If none is provided, then the
     * head commit will be used.
     * </p>
     * 
     * @param commitSpecifier
     *        The fully-quaified reference that identifies the commit that contains the file. For example, you could
     *        specify a full commit ID, a tag, a branch name, or a reference such as refs/heads/master. If none is
     *        provided, then the head commit will be used.
     */

    public void setCommitSpecifier(String commitSpecifier) {
        this.commitSpecifier = commitSpecifier;
    }

    /**
     * <p>
     * The fully-quaified reference that identifies the commit that contains the file. For example, you could specify a
     * full commit ID, a tag, a branch name, or a reference such as refs/heads/master. If none is provided, then the
     * head commit will be used.
     * </p>
     * 
     * @return The fully-quaified reference that identifies the commit that contains the file. For example, you could
     *         specify a full commit ID, a tag, a branch name, or a reference such as refs/heads/master. If none is
     *         provided, then the head commit will be used.
     */

    public String getCommitSpecifier() {
        return this.commitSpecifier;
    }

    /**
     * <p>
     * The fully-quaified reference that identifies the commit that contains the file. For example, you could specify a
     * full commit ID, a tag, a branch name, or a reference such as refs/heads/master. If none is provided, then the
     * head commit will be used.
     * </p>
     * 
     * @param commitSpecifier
     *        The fully-quaified reference that identifies the commit that contains the file. For example, you could
     *        specify a full commit ID, a tag, a branch name, or a reference such as refs/heads/master. If none is
     *        provided, then the head commit will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFileRequest withCommitSpecifier(String commitSpecifier) {
        setCommitSpecifier(commitSpecifier);
        return this;
    }

    /**
     * <p>
     * The fully-qualified path to the file, including the full name and extension of the file. For example,
     * /examples/file.md is the fully-qualified path to a file named file.md in a folder named examples.
     * </p>
     * 
     * @param filePath
     *        The fully-qualified path to the file, including the full name and extension of the file. For example,
     *        /examples/file.md is the fully-qualified path to a file named file.md in a folder named examples.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The fully-qualified path to the file, including the full name and extension of the file. For example,
     * /examples/file.md is the fully-qualified path to a file named file.md in a folder named examples.
     * </p>
     * 
     * @return The fully-qualified path to the file, including the full name and extension of the file. For example,
     *         /examples/file.md is the fully-qualified path to a file named file.md in a folder named examples.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The fully-qualified path to the file, including the full name and extension of the file. For example,
     * /examples/file.md is the fully-qualified path to a file named file.md in a folder named examples.
     * </p>
     * 
     * @param filePath
     *        The fully-qualified path to the file, including the full name and extension of the file. For example,
     *        /examples/file.md is the fully-qualified path to a file named file.md in a folder named examples.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFileRequest withFilePath(String filePath) {
        setFilePath(filePath);
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
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFileRequest == false)
            return false;
        GetFileRequest other = (GetFileRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getCommitSpecifier() == null ^ this.getCommitSpecifier() == null)
            return false;
        if (other.getCommitSpecifier() != null && other.getCommitSpecifier().equals(this.getCommitSpecifier()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getCommitSpecifier() == null) ? 0 : getCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        return hashCode;
    }

    @Override
    public GetFileRequest clone() {
        return (GetFileRequest) super.clone();
    }

}
