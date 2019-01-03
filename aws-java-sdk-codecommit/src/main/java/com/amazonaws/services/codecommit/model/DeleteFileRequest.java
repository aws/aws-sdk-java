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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository that contains the file to delete.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The name of the branch where the commit will be made deleting the file.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * The fully-qualified path to the file that will be deleted, including the full name and extension of that file.
     * For example, /examples/file.md is a fully qualified path to a file named file.md in a folder named examples.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The ID of the commit that is the tip of the branch where you want to create the commit that will delete the file.
     * This must be the HEAD commit for the branch. The commit that deletes the file will be created from this commit
     * ID.
     * </p>
     */
    private String parentCommitId;
    /**
     * <p>
     * Specifies whether to delete the folder or directory that contains the file you want to delete if that file is the
     * only object in the folder or directory. By default, empty folders will be deleted. This includes empty folders
     * that are part of the directory structure. For example, if the path to a file is dir1/dir2/dir3/dir4, and dir2 and
     * dir3 are empty, deleting the last file in dir4 will also delete the empty folders dir4, dir3, and dir2.
     * </p>
     */
    private Boolean keepEmptyFolders;
    /**
     * <p>
     * The commit message you want to include as part of deleting the file. Commit messages are limited to 256 KB. If no
     * message is specified, a default message will be used.
     * </p>
     */
    private String commitMessage;
    /**
     * <p>
     * The name of the author of the commit that deletes the file. If no name is specified, the user's ARN will be used
     * as the author name and committer name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The email address for the commit that deletes the file. If no email address is specified, the email address will
     * be left blank.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The name of the repository that contains the file to delete.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the file to delete.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the file to delete.
     * </p>
     * 
     * @return The name of the repository that contains the file to delete.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the file to delete.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the file to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The name of the branch where the commit will be made deleting the file.
     * </p>
     * 
     * @param branchName
     *        The name of the branch where the commit will be made deleting the file.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of the branch where the commit will be made deleting the file.
     * </p>
     * 
     * @return The name of the branch where the commit will be made deleting the file.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The name of the branch where the commit will be made deleting the file.
     * </p>
     * 
     * @param branchName
     *        The name of the branch where the commit will be made deleting the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileRequest withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * The fully-qualified path to the file that will be deleted, including the full name and extension of that file.
     * For example, /examples/file.md is a fully qualified path to a file named file.md in a folder named examples.
     * </p>
     * 
     * @param filePath
     *        The fully-qualified path to the file that will be deleted, including the full name and extension of that
     *        file. For example, /examples/file.md is a fully qualified path to a file named file.md in a folder named
     *        examples.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The fully-qualified path to the file that will be deleted, including the full name and extension of that file.
     * For example, /examples/file.md is a fully qualified path to a file named file.md in a folder named examples.
     * </p>
     * 
     * @return The fully-qualified path to the file that will be deleted, including the full name and extension of that
     *         file. For example, /examples/file.md is a fully qualified path to a file named file.md in a folder named
     *         examples.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The fully-qualified path to the file that will be deleted, including the full name and extension of that file.
     * For example, /examples/file.md is a fully qualified path to a file named file.md in a folder named examples.
     * </p>
     * 
     * @param filePath
     *        The fully-qualified path to the file that will be deleted, including the full name and extension of that
     *        file. For example, /examples/file.md is a fully qualified path to a file named file.md in a folder named
     *        examples.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileRequest withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The ID of the commit that is the tip of the branch where you want to create the commit that will delete the file.
     * This must be the HEAD commit for the branch. The commit that deletes the file will be created from this commit
     * ID.
     * </p>
     * 
     * @param parentCommitId
     *        The ID of the commit that is the tip of the branch where you want to create the commit that will delete
     *        the file. This must be the HEAD commit for the branch. The commit that deletes the file will be created
     *        from this commit ID.
     */

    public void setParentCommitId(String parentCommitId) {
        this.parentCommitId = parentCommitId;
    }

    /**
     * <p>
     * The ID of the commit that is the tip of the branch where you want to create the commit that will delete the file.
     * This must be the HEAD commit for the branch. The commit that deletes the file will be created from this commit
     * ID.
     * </p>
     * 
     * @return The ID of the commit that is the tip of the branch where you want to create the commit that will delete
     *         the file. This must be the HEAD commit for the branch. The commit that deletes the file will be created
     *         from this commit ID.
     */

    public String getParentCommitId() {
        return this.parentCommitId;
    }

    /**
     * <p>
     * The ID of the commit that is the tip of the branch where you want to create the commit that will delete the file.
     * This must be the HEAD commit for the branch. The commit that deletes the file will be created from this commit
     * ID.
     * </p>
     * 
     * @param parentCommitId
     *        The ID of the commit that is the tip of the branch where you want to create the commit that will delete
     *        the file. This must be the HEAD commit for the branch. The commit that deletes the file will be created
     *        from this commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileRequest withParentCommitId(String parentCommitId) {
        setParentCommitId(parentCommitId);
        return this;
    }

    /**
     * <p>
     * Specifies whether to delete the folder or directory that contains the file you want to delete if that file is the
     * only object in the folder or directory. By default, empty folders will be deleted. This includes empty folders
     * that are part of the directory structure. For example, if the path to a file is dir1/dir2/dir3/dir4, and dir2 and
     * dir3 are empty, deleting the last file in dir4 will also delete the empty folders dir4, dir3, and dir2.
     * </p>
     * 
     * @param keepEmptyFolders
     *        Specifies whether to delete the folder or directory that contains the file you want to delete if that file
     *        is the only object in the folder or directory. By default, empty folders will be deleted. This includes
     *        empty folders that are part of the directory structure. For example, if the path to a file is
     *        dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file in dir4 will also delete the
     *        empty folders dir4, dir3, and dir2.
     */

    public void setKeepEmptyFolders(Boolean keepEmptyFolders) {
        this.keepEmptyFolders = keepEmptyFolders;
    }

    /**
     * <p>
     * Specifies whether to delete the folder or directory that contains the file you want to delete if that file is the
     * only object in the folder or directory. By default, empty folders will be deleted. This includes empty folders
     * that are part of the directory structure. For example, if the path to a file is dir1/dir2/dir3/dir4, and dir2 and
     * dir3 are empty, deleting the last file in dir4 will also delete the empty folders dir4, dir3, and dir2.
     * </p>
     * 
     * @return Specifies whether to delete the folder or directory that contains the file you want to delete if that
     *         file is the only object in the folder or directory. By default, empty folders will be deleted. This
     *         includes empty folders that are part of the directory structure. For example, if the path to a file is
     *         dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file in dir4 will also delete the
     *         empty folders dir4, dir3, and dir2.
     */

    public Boolean getKeepEmptyFolders() {
        return this.keepEmptyFolders;
    }

    /**
     * <p>
     * Specifies whether to delete the folder or directory that contains the file you want to delete if that file is the
     * only object in the folder or directory. By default, empty folders will be deleted. This includes empty folders
     * that are part of the directory structure. For example, if the path to a file is dir1/dir2/dir3/dir4, and dir2 and
     * dir3 are empty, deleting the last file in dir4 will also delete the empty folders dir4, dir3, and dir2.
     * </p>
     * 
     * @param keepEmptyFolders
     *        Specifies whether to delete the folder or directory that contains the file you want to delete if that file
     *        is the only object in the folder or directory. By default, empty folders will be deleted. This includes
     *        empty folders that are part of the directory structure. For example, if the path to a file is
     *        dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file in dir4 will also delete the
     *        empty folders dir4, dir3, and dir2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileRequest withKeepEmptyFolders(Boolean keepEmptyFolders) {
        setKeepEmptyFolders(keepEmptyFolders);
        return this;
    }

    /**
     * <p>
     * Specifies whether to delete the folder or directory that contains the file you want to delete if that file is the
     * only object in the folder or directory. By default, empty folders will be deleted. This includes empty folders
     * that are part of the directory structure. For example, if the path to a file is dir1/dir2/dir3/dir4, and dir2 and
     * dir3 are empty, deleting the last file in dir4 will also delete the empty folders dir4, dir3, and dir2.
     * </p>
     * 
     * @return Specifies whether to delete the folder or directory that contains the file you want to delete if that
     *         file is the only object in the folder or directory. By default, empty folders will be deleted. This
     *         includes empty folders that are part of the directory structure. For example, if the path to a file is
     *         dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file in dir4 will also delete the
     *         empty folders dir4, dir3, and dir2.
     */

    public Boolean isKeepEmptyFolders() {
        return this.keepEmptyFolders;
    }

    /**
     * <p>
     * The commit message you want to include as part of deleting the file. Commit messages are limited to 256 KB. If no
     * message is specified, a default message will be used.
     * </p>
     * 
     * @param commitMessage
     *        The commit message you want to include as part of deleting the file. Commit messages are limited to 256
     *        KB. If no message is specified, a default message will be used.
     */

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * The commit message you want to include as part of deleting the file. Commit messages are limited to 256 KB. If no
     * message is specified, a default message will be used.
     * </p>
     * 
     * @return The commit message you want to include as part of deleting the file. Commit messages are limited to 256
     *         KB. If no message is specified, a default message will be used.
     */

    public String getCommitMessage() {
        return this.commitMessage;
    }

    /**
     * <p>
     * The commit message you want to include as part of deleting the file. Commit messages are limited to 256 KB. If no
     * message is specified, a default message will be used.
     * </p>
     * 
     * @param commitMessage
     *        The commit message you want to include as part of deleting the file. Commit messages are limited to 256
     *        KB. If no message is specified, a default message will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileRequest withCommitMessage(String commitMessage) {
        setCommitMessage(commitMessage);
        return this;
    }

    /**
     * <p>
     * The name of the author of the commit that deletes the file. If no name is specified, the user's ARN will be used
     * as the author name and committer name.
     * </p>
     * 
     * @param name
     *        The name of the author of the commit that deletes the file. If no name is specified, the user's ARN will
     *        be used as the author name and committer name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the author of the commit that deletes the file. If no name is specified, the user's ARN will be used
     * as the author name and committer name.
     * </p>
     * 
     * @return The name of the author of the commit that deletes the file. If no name is specified, the user's ARN will
     *         be used as the author name and committer name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the author of the commit that deletes the file. If no name is specified, the user's ARN will be used
     * as the author name and committer name.
     * </p>
     * 
     * @param name
     *        The name of the author of the commit that deletes the file. If no name is specified, the user's ARN will
     *        be used as the author name and committer name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The email address for the commit that deletes the file. If no email address is specified, the email address will
     * be left blank.
     * </p>
     * 
     * @param email
     *        The email address for the commit that deletes the file. If no email address is specified, the email
     *        address will be left blank.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address for the commit that deletes the file. If no email address is specified, the email address will
     * be left blank.
     * </p>
     * 
     * @return The email address for the commit that deletes the file. If no email address is specified, the email
     *         address will be left blank.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address for the commit that deletes the file. If no email address is specified, the email address will
     * be left blank.
     * </p>
     * 
     * @param email
     *        The email address for the commit that deletes the file. If no email address is specified, the email
     *        address will be left blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileRequest withEmail(String email) {
        setEmail(email);
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
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getParentCommitId() != null)
            sb.append("ParentCommitId: ").append(getParentCommitId()).append(",");
        if (getKeepEmptyFolders() != null)
            sb.append("KeepEmptyFolders: ").append(getKeepEmptyFolders()).append(",");
        if (getCommitMessage() != null)
            sb.append("CommitMessage: ").append(getCommitMessage()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFileRequest == false)
            return false;
        DeleteFileRequest other = (DeleteFileRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getParentCommitId() == null ^ this.getParentCommitId() == null)
            return false;
        if (other.getParentCommitId() != null && other.getParentCommitId().equals(this.getParentCommitId()) == false)
            return false;
        if (other.getKeepEmptyFolders() == null ^ this.getKeepEmptyFolders() == null)
            return false;
        if (other.getKeepEmptyFolders() != null && other.getKeepEmptyFolders().equals(this.getKeepEmptyFolders()) == false)
            return false;
        if (other.getCommitMessage() == null ^ this.getCommitMessage() == null)
            return false;
        if (other.getCommitMessage() != null && other.getCommitMessage().equals(this.getCommitMessage()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getParentCommitId() == null) ? 0 : getParentCommitId().hashCode());
        hashCode = prime * hashCode + ((getKeepEmptyFolders() == null) ? 0 : getKeepEmptyFolders().hashCode());
        hashCode = prime * hashCode + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFileRequest clone() {
        return (DeleteFileRequest) super.clone();
    }

}
