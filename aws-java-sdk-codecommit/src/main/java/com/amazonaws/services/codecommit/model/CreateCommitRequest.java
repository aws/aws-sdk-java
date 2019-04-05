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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateCommit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCommitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository where you will create the commit.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The name of the branch where you will create the commit.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * The ID of the commit that is the parent of the commit you will create. If this is an empty repository, this is
     * not required.
     * </p>
     */
    private String parentCommitId;
    /**
     * <p>
     * The name of the author who created the commit. This information will be used as both the author and committer for
     * the commit.
     * </p>
     */
    private String authorName;
    /**
     * <p>
     * The email address of the person who created the commit.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The commit message you want to include as part of creating the commit. Commit messages are limited to 256 KB. If
     * no message is specified, a default message will be used.
     * </p>
     */
    private String commitMessage;
    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If this is specified as true, a .gitkeep file will be created for empty folders.
     * </p>
     */
    private Boolean keepEmptyFolders;
    /**
     * <p>
     * The files to add or update in this commit.
     * </p>
     */
    private java.util.List<PutFileEntry> putFiles;
    /**
     * <p>
     * The files to delete in this commit. These files will still exist in prior commits.
     * </p>
     */
    private java.util.List<DeleteFileEntry> deleteFiles;
    /**
     * <p>
     * The file modes to update for files in this commit.
     * </p>
     */
    private java.util.List<SetFileModeEntry> setFileModes;

    /**
     * <p>
     * The name of the repository where you will create the commit.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you will create the commit.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you will create the commit.
     * </p>
     * 
     * @return The name of the repository where you will create the commit.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you will create the commit.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you will create the commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The name of the branch where you will create the commit.
     * </p>
     * 
     * @param branchName
     *        The name of the branch where you will create the commit.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of the branch where you will create the commit.
     * </p>
     * 
     * @return The name of the branch where you will create the commit.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The name of the branch where you will create the commit.
     * </p>
     * 
     * @param branchName
     *        The name of the branch where you will create the commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitRequest withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * The ID of the commit that is the parent of the commit you will create. If this is an empty repository, this is
     * not required.
     * </p>
     * 
     * @param parentCommitId
     *        The ID of the commit that is the parent of the commit you will create. If this is an empty repository,
     *        this is not required.
     */

    public void setParentCommitId(String parentCommitId) {
        this.parentCommitId = parentCommitId;
    }

    /**
     * <p>
     * The ID of the commit that is the parent of the commit you will create. If this is an empty repository, this is
     * not required.
     * </p>
     * 
     * @return The ID of the commit that is the parent of the commit you will create. If this is an empty repository,
     *         this is not required.
     */

    public String getParentCommitId() {
        return this.parentCommitId;
    }

    /**
     * <p>
     * The ID of the commit that is the parent of the commit you will create. If this is an empty repository, this is
     * not required.
     * </p>
     * 
     * @param parentCommitId
     *        The ID of the commit that is the parent of the commit you will create. If this is an empty repository,
     *        this is not required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitRequest withParentCommitId(String parentCommitId) {
        setParentCommitId(parentCommitId);
        return this;
    }

    /**
     * <p>
     * The name of the author who created the commit. This information will be used as both the author and committer for
     * the commit.
     * </p>
     * 
     * @param authorName
     *        The name of the author who created the commit. This information will be used as both the author and
     *        committer for the commit.
     */

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * <p>
     * The name of the author who created the commit. This information will be used as both the author and committer for
     * the commit.
     * </p>
     * 
     * @return The name of the author who created the commit. This information will be used as both the author and
     *         committer for the commit.
     */

    public String getAuthorName() {
        return this.authorName;
    }

    /**
     * <p>
     * The name of the author who created the commit. This information will be used as both the author and committer for
     * the commit.
     * </p>
     * 
     * @param authorName
     *        The name of the author who created the commit. This information will be used as both the author and
     *        committer for the commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitRequest withAuthorName(String authorName) {
        setAuthorName(authorName);
        return this;
    }

    /**
     * <p>
     * The email address of the person who created the commit.
     * </p>
     * 
     * @param email
     *        The email address of the person who created the commit.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the person who created the commit.
     * </p>
     * 
     * @return The email address of the person who created the commit.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address of the person who created the commit.
     * </p>
     * 
     * @param email
     *        The email address of the person who created the commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitRequest withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The commit message you want to include as part of creating the commit. Commit messages are limited to 256 KB. If
     * no message is specified, a default message will be used.
     * </p>
     * 
     * @param commitMessage
     *        The commit message you want to include as part of creating the commit. Commit messages are limited to 256
     *        KB. If no message is specified, a default message will be used.
     */

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * The commit message you want to include as part of creating the commit. Commit messages are limited to 256 KB. If
     * no message is specified, a default message will be used.
     * </p>
     * 
     * @return The commit message you want to include as part of creating the commit. Commit messages are limited to 256
     *         KB. If no message is specified, a default message will be used.
     */

    public String getCommitMessage() {
        return this.commitMessage;
    }

    /**
     * <p>
     * The commit message you want to include as part of creating the commit. Commit messages are limited to 256 KB. If
     * no message is specified, a default message will be used.
     * </p>
     * 
     * @param commitMessage
     *        The commit message you want to include as part of creating the commit. Commit messages are limited to 256
     *        KB. If no message is specified, a default message will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitRequest withCommitMessage(String commitMessage) {
        setCommitMessage(commitMessage);
        return this;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If this is specified as true, a .gitkeep file will be created for empty folders.
     * </p>
     * 
     * @param keepEmptyFolders
     *        If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the
     *        folders empty. If this is specified as true, a .gitkeep file will be created for empty folders.
     */

    public void setKeepEmptyFolders(Boolean keepEmptyFolders) {
        this.keepEmptyFolders = keepEmptyFolders;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If this is specified as true, a .gitkeep file will be created for empty folders.
     * </p>
     * 
     * @return If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the
     *         folders empty. If this is specified as true, a .gitkeep file will be created for empty folders.
     */

    public Boolean getKeepEmptyFolders() {
        return this.keepEmptyFolders;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If this is specified as true, a .gitkeep file will be created for empty folders.
     * </p>
     * 
     * @param keepEmptyFolders
     *        If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the
     *        folders empty. If this is specified as true, a .gitkeep file will be created for empty folders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitRequest withKeepEmptyFolders(Boolean keepEmptyFolders) {
        setKeepEmptyFolders(keepEmptyFolders);
        return this;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders
     * empty. If this is specified as true, a .gitkeep file will be created for empty folders.
     * </p>
     * 
     * @return If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the
     *         folders empty. If this is specified as true, a .gitkeep file will be created for empty folders.
     */

    public Boolean isKeepEmptyFolders() {
        return this.keepEmptyFolders;
    }

    /**
     * <p>
     * The files to add or update in this commit.
     * </p>
     * 
     * @return The files to add or update in this commit.
     */

    public java.util.List<PutFileEntry> getPutFiles() {
        return putFiles;
    }

    /**
     * <p>
     * The files to add or update in this commit.
     * </p>
     * 
     * @param putFiles
     *        The files to add or update in this commit.
     */

    public void setPutFiles(java.util.Collection<PutFileEntry> putFiles) {
        if (putFiles == null) {
            this.putFiles = null;
            return;
        }

        this.putFiles = new java.util.ArrayList<PutFileEntry>(putFiles);
    }

    /**
     * <p>
     * The files to add or update in this commit.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPutFiles(java.util.Collection)} or {@link #withPutFiles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param putFiles
     *        The files to add or update in this commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitRequest withPutFiles(PutFileEntry... putFiles) {
        if (this.putFiles == null) {
            setPutFiles(new java.util.ArrayList<PutFileEntry>(putFiles.length));
        }
        for (PutFileEntry ele : putFiles) {
            this.putFiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The files to add or update in this commit.
     * </p>
     * 
     * @param putFiles
     *        The files to add or update in this commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitRequest withPutFiles(java.util.Collection<PutFileEntry> putFiles) {
        setPutFiles(putFiles);
        return this;
    }

    /**
     * <p>
     * The files to delete in this commit. These files will still exist in prior commits.
     * </p>
     * 
     * @return The files to delete in this commit. These files will still exist in prior commits.
     */

    public java.util.List<DeleteFileEntry> getDeleteFiles() {
        return deleteFiles;
    }

    /**
     * <p>
     * The files to delete in this commit. These files will still exist in prior commits.
     * </p>
     * 
     * @param deleteFiles
     *        The files to delete in this commit. These files will still exist in prior commits.
     */

    public void setDeleteFiles(java.util.Collection<DeleteFileEntry> deleteFiles) {
        if (deleteFiles == null) {
            this.deleteFiles = null;
            return;
        }

        this.deleteFiles = new java.util.ArrayList<DeleteFileEntry>(deleteFiles);
    }

    /**
     * <p>
     * The files to delete in this commit. These files will still exist in prior commits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeleteFiles(java.util.Collection)} or {@link #withDeleteFiles(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deleteFiles
     *        The files to delete in this commit. These files will still exist in prior commits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitRequest withDeleteFiles(DeleteFileEntry... deleteFiles) {
        if (this.deleteFiles == null) {
            setDeleteFiles(new java.util.ArrayList<DeleteFileEntry>(deleteFiles.length));
        }
        for (DeleteFileEntry ele : deleteFiles) {
            this.deleteFiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The files to delete in this commit. These files will still exist in prior commits.
     * </p>
     * 
     * @param deleteFiles
     *        The files to delete in this commit. These files will still exist in prior commits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitRequest withDeleteFiles(java.util.Collection<DeleteFileEntry> deleteFiles) {
        setDeleteFiles(deleteFiles);
        return this;
    }

    /**
     * <p>
     * The file modes to update for files in this commit.
     * </p>
     * 
     * @return The file modes to update for files in this commit.
     */

    public java.util.List<SetFileModeEntry> getSetFileModes() {
        return setFileModes;
    }

    /**
     * <p>
     * The file modes to update for files in this commit.
     * </p>
     * 
     * @param setFileModes
     *        The file modes to update for files in this commit.
     */

    public void setSetFileModes(java.util.Collection<SetFileModeEntry> setFileModes) {
        if (setFileModes == null) {
            this.setFileModes = null;
            return;
        }

        this.setFileModes = new java.util.ArrayList<SetFileModeEntry>(setFileModes);
    }

    /**
     * <p>
     * The file modes to update for files in this commit.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSetFileModes(java.util.Collection)} or {@link #withSetFileModes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param setFileModes
     *        The file modes to update for files in this commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitRequest withSetFileModes(SetFileModeEntry... setFileModes) {
        if (this.setFileModes == null) {
            setSetFileModes(new java.util.ArrayList<SetFileModeEntry>(setFileModes.length));
        }
        for (SetFileModeEntry ele : setFileModes) {
            this.setFileModes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The file modes to update for files in this commit.
     * </p>
     * 
     * @param setFileModes
     *        The file modes to update for files in this commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitRequest withSetFileModes(java.util.Collection<SetFileModeEntry> setFileModes) {
        setSetFileModes(setFileModes);
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
        if (getParentCommitId() != null)
            sb.append("ParentCommitId: ").append(getParentCommitId()).append(",");
        if (getAuthorName() != null)
            sb.append("AuthorName: ").append(getAuthorName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getCommitMessage() != null)
            sb.append("CommitMessage: ").append(getCommitMessage()).append(",");
        if (getKeepEmptyFolders() != null)
            sb.append("KeepEmptyFolders: ").append(getKeepEmptyFolders()).append(",");
        if (getPutFiles() != null)
            sb.append("PutFiles: ").append(getPutFiles()).append(",");
        if (getDeleteFiles() != null)
            sb.append("DeleteFiles: ").append(getDeleteFiles()).append(",");
        if (getSetFileModes() != null)
            sb.append("SetFileModes: ").append(getSetFileModes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCommitRequest == false)
            return false;
        CreateCommitRequest other = (CreateCommitRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getParentCommitId() == null ^ this.getParentCommitId() == null)
            return false;
        if (other.getParentCommitId() != null && other.getParentCommitId().equals(this.getParentCommitId()) == false)
            return false;
        if (other.getAuthorName() == null ^ this.getAuthorName() == null)
            return false;
        if (other.getAuthorName() != null && other.getAuthorName().equals(this.getAuthorName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getCommitMessage() == null ^ this.getCommitMessage() == null)
            return false;
        if (other.getCommitMessage() != null && other.getCommitMessage().equals(this.getCommitMessage()) == false)
            return false;
        if (other.getKeepEmptyFolders() == null ^ this.getKeepEmptyFolders() == null)
            return false;
        if (other.getKeepEmptyFolders() != null && other.getKeepEmptyFolders().equals(this.getKeepEmptyFolders()) == false)
            return false;
        if (other.getPutFiles() == null ^ this.getPutFiles() == null)
            return false;
        if (other.getPutFiles() != null && other.getPutFiles().equals(this.getPutFiles()) == false)
            return false;
        if (other.getDeleteFiles() == null ^ this.getDeleteFiles() == null)
            return false;
        if (other.getDeleteFiles() != null && other.getDeleteFiles().equals(this.getDeleteFiles()) == false)
            return false;
        if (other.getSetFileModes() == null ^ this.getSetFileModes() == null)
            return false;
        if (other.getSetFileModes() != null && other.getSetFileModes().equals(this.getSetFileModes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getParentCommitId() == null) ? 0 : getParentCommitId().hashCode());
        hashCode = prime * hashCode + ((getAuthorName() == null) ? 0 : getAuthorName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        hashCode = prime * hashCode + ((getKeepEmptyFolders() == null) ? 0 : getKeepEmptyFolders().hashCode());
        hashCode = prime * hashCode + ((getPutFiles() == null) ? 0 : getPutFiles().hashCode());
        hashCode = prime * hashCode + ((getDeleteFiles() == null) ? 0 : getDeleteFiles().hashCode());
        hashCode = prime * hashCode + ((getSetFileModes() == null) ? 0 : getSetFileModes().hashCode());
        return hashCode;
    }

    @Override
    public CreateCommitRequest clone() {
        return (CreateCommitRequest) super.clone();
    }

}
