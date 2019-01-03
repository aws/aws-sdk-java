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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutFileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository where you want to add or update the file.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The name of the branch where you want to add or update the file. If this is an empty repository, this branch will
     * be created.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * The content of the file, in binary object format.
     * </p>
     */
    private java.nio.ByteBuffer fileContent;
    /**
     * <p>
     * The name of the file you want to add or update, including the relative path to the file in the repository.
     * </p>
     * <note>
     * <p>
     * If the path does not currently exist in the repository, the path will be created as part of adding the file.
     * </p>
     * </note>
     */
    private String filePath;
    /**
     * <p>
     * The file mode permissions of the blob. Valid file mode permissions are listed below.
     * </p>
     */
    private String fileMode;
    /**
     * <p>
     * The full commit ID of the head commit in the branch where you want to add or update the file. If this is an empty
     * repository, no commit ID is required. If this is not an empty repository, a commit ID is required.
     * </p>
     * <p>
     * The commit ID must match the ID of the head commit at the time of the operation, or an error will occur, and the
     * file will not be added or updated.
     * </p>
     */
    private String parentCommitId;
    /**
     * <p>
     * A message about why this file was added or updated. While optional, adding a message is strongly encouraged in
     * order to provide a more useful commit history for your repository.
     * </p>
     */
    private String commitMessage;
    /**
     * <p>
     * The name of the person adding or updating the file. While optional, adding a name is strongly encouraged in order
     * to provide a more useful commit history for your repository.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An email address for the person adding or updating the file.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The name of the repository where you want to add or update the file.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to add or update the file.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to add or update the file.
     * </p>
     * 
     * @return The name of the repository where you want to add or update the file.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to add or update the file.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to add or update the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The name of the branch where you want to add or update the file. If this is an empty repository, this branch will
     * be created.
     * </p>
     * 
     * @param branchName
     *        The name of the branch where you want to add or update the file. If this is an empty repository, this
     *        branch will be created.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of the branch where you want to add or update the file. If this is an empty repository, this branch will
     * be created.
     * </p>
     * 
     * @return The name of the branch where you want to add or update the file. If this is an empty repository, this
     *         branch will be created.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The name of the branch where you want to add or update the file. If this is an empty repository, this branch will
     * be created.
     * </p>
     * 
     * @param branchName
     *        The name of the branch where you want to add or update the file. If this is an empty repository, this
     *        branch will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileRequest withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * The content of the file, in binary object format.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param fileContent
     *        The content of the file, in binary object format.
     */

    public void setFileContent(java.nio.ByteBuffer fileContent) {
        this.fileContent = fileContent;
    }

    /**
     * <p>
     * The content of the file, in binary object format.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The content of the file, in binary object format.
     */

    public java.nio.ByteBuffer getFileContent() {
        return this.fileContent;
    }

    /**
     * <p>
     * The content of the file, in binary object format.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param fileContent
     *        The content of the file, in binary object format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileRequest withFileContent(java.nio.ByteBuffer fileContent) {
        setFileContent(fileContent);
        return this;
    }

    /**
     * <p>
     * The name of the file you want to add or update, including the relative path to the file in the repository.
     * </p>
     * <note>
     * <p>
     * If the path does not currently exist in the repository, the path will be created as part of adding the file.
     * </p>
     * </note>
     * 
     * @param filePath
     *        The name of the file you want to add or update, including the relative path to the file in the
     *        repository.</p> <note>
     *        <p>
     *        If the path does not currently exist in the repository, the path will be created as part of adding the
     *        file.
     *        </p>
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The name of the file you want to add or update, including the relative path to the file in the repository.
     * </p>
     * <note>
     * <p>
     * If the path does not currently exist in the repository, the path will be created as part of adding the file.
     * </p>
     * </note>
     * 
     * @return The name of the file you want to add or update, including the relative path to the file in the
     *         repository.</p> <note>
     *         <p>
     *         If the path does not currently exist in the repository, the path will be created as part of adding the
     *         file.
     *         </p>
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The name of the file you want to add or update, including the relative path to the file in the repository.
     * </p>
     * <note>
     * <p>
     * If the path does not currently exist in the repository, the path will be created as part of adding the file.
     * </p>
     * </note>
     * 
     * @param filePath
     *        The name of the file you want to add or update, including the relative path to the file in the
     *        repository.</p> <note>
     *        <p>
     *        If the path does not currently exist in the repository, the path will be created as part of adding the
     *        file.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileRequest withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The file mode permissions of the blob. Valid file mode permissions are listed below.
     * </p>
     * 
     * @param fileMode
     *        The file mode permissions of the blob. Valid file mode permissions are listed below.
     * @see FileModeTypeEnum
     */

    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The file mode permissions of the blob. Valid file mode permissions are listed below.
     * </p>
     * 
     * @return The file mode permissions of the blob. Valid file mode permissions are listed below.
     * @see FileModeTypeEnum
     */

    public String getFileMode() {
        return this.fileMode;
    }

    /**
     * <p>
     * The file mode permissions of the blob. Valid file mode permissions are listed below.
     * </p>
     * 
     * @param fileMode
     *        The file mode permissions of the blob. Valid file mode permissions are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileModeTypeEnum
     */

    public PutFileRequest withFileMode(String fileMode) {
        setFileMode(fileMode);
        return this;
    }

    /**
     * <p>
     * The file mode permissions of the blob. Valid file mode permissions are listed below.
     * </p>
     * 
     * @param fileMode
     *        The file mode permissions of the blob. Valid file mode permissions are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileModeTypeEnum
     */

    public PutFileRequest withFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
        return this;
    }

    /**
     * <p>
     * The full commit ID of the head commit in the branch where you want to add or update the file. If this is an empty
     * repository, no commit ID is required. If this is not an empty repository, a commit ID is required.
     * </p>
     * <p>
     * The commit ID must match the ID of the head commit at the time of the operation, or an error will occur, and the
     * file will not be added or updated.
     * </p>
     * 
     * @param parentCommitId
     *        The full commit ID of the head commit in the branch where you want to add or update the file. If this is
     *        an empty repository, no commit ID is required. If this is not an empty repository, a commit ID is
     *        required. </p>
     *        <p>
     *        The commit ID must match the ID of the head commit at the time of the operation, or an error will occur,
     *        and the file will not be added or updated.
     */

    public void setParentCommitId(String parentCommitId) {
        this.parentCommitId = parentCommitId;
    }

    /**
     * <p>
     * The full commit ID of the head commit in the branch where you want to add or update the file. If this is an empty
     * repository, no commit ID is required. If this is not an empty repository, a commit ID is required.
     * </p>
     * <p>
     * The commit ID must match the ID of the head commit at the time of the operation, or an error will occur, and the
     * file will not be added or updated.
     * </p>
     * 
     * @return The full commit ID of the head commit in the branch where you want to add or update the file. If this is
     *         an empty repository, no commit ID is required. If this is not an empty repository, a commit ID is
     *         required. </p>
     *         <p>
     *         The commit ID must match the ID of the head commit at the time of the operation, or an error will occur,
     *         and the file will not be added or updated.
     */

    public String getParentCommitId() {
        return this.parentCommitId;
    }

    /**
     * <p>
     * The full commit ID of the head commit in the branch where you want to add or update the file. If this is an empty
     * repository, no commit ID is required. If this is not an empty repository, a commit ID is required.
     * </p>
     * <p>
     * The commit ID must match the ID of the head commit at the time of the operation, or an error will occur, and the
     * file will not be added or updated.
     * </p>
     * 
     * @param parentCommitId
     *        The full commit ID of the head commit in the branch where you want to add or update the file. If this is
     *        an empty repository, no commit ID is required. If this is not an empty repository, a commit ID is
     *        required. </p>
     *        <p>
     *        The commit ID must match the ID of the head commit at the time of the operation, or an error will occur,
     *        and the file will not be added or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileRequest withParentCommitId(String parentCommitId) {
        setParentCommitId(parentCommitId);
        return this;
    }

    /**
     * <p>
     * A message about why this file was added or updated. While optional, adding a message is strongly encouraged in
     * order to provide a more useful commit history for your repository.
     * </p>
     * 
     * @param commitMessage
     *        A message about why this file was added or updated. While optional, adding a message is strongly
     *        encouraged in order to provide a more useful commit history for your repository.
     */

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * A message about why this file was added or updated. While optional, adding a message is strongly encouraged in
     * order to provide a more useful commit history for your repository.
     * </p>
     * 
     * @return A message about why this file was added or updated. While optional, adding a message is strongly
     *         encouraged in order to provide a more useful commit history for your repository.
     */

    public String getCommitMessage() {
        return this.commitMessage;
    }

    /**
     * <p>
     * A message about why this file was added or updated. While optional, adding a message is strongly encouraged in
     * order to provide a more useful commit history for your repository.
     * </p>
     * 
     * @param commitMessage
     *        A message about why this file was added or updated. While optional, adding a message is strongly
     *        encouraged in order to provide a more useful commit history for your repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileRequest withCommitMessage(String commitMessage) {
        setCommitMessage(commitMessage);
        return this;
    }

    /**
     * <p>
     * The name of the person adding or updating the file. While optional, adding a name is strongly encouraged in order
     * to provide a more useful commit history for your repository.
     * </p>
     * 
     * @param name
     *        The name of the person adding or updating the file. While optional, adding a name is strongly encouraged
     *        in order to provide a more useful commit history for your repository.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the person adding or updating the file. While optional, adding a name is strongly encouraged in order
     * to provide a more useful commit history for your repository.
     * </p>
     * 
     * @return The name of the person adding or updating the file. While optional, adding a name is strongly encouraged
     *         in order to provide a more useful commit history for your repository.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the person adding or updating the file. While optional, adding a name is strongly encouraged in order
     * to provide a more useful commit history for your repository.
     * </p>
     * 
     * @param name
     *        The name of the person adding or updating the file. While optional, adding a name is strongly encouraged
     *        in order to provide a more useful commit history for your repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An email address for the person adding or updating the file.
     * </p>
     * 
     * @param email
     *        An email address for the person adding or updating the file.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * An email address for the person adding or updating the file.
     * </p>
     * 
     * @return An email address for the person adding or updating the file.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * An email address for the person adding or updating the file.
     * </p>
     * 
     * @param email
     *        An email address for the person adding or updating the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileRequest withEmail(String email) {
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
        if (getFileContent() != null)
            sb.append("FileContent: ").append(getFileContent()).append(",");
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getFileMode() != null)
            sb.append("FileMode: ").append(getFileMode()).append(",");
        if (getParentCommitId() != null)
            sb.append("ParentCommitId: ").append(getParentCommitId()).append(",");
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

        if (obj instanceof PutFileRequest == false)
            return false;
        PutFileRequest other = (PutFileRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getFileContent() == null ^ this.getFileContent() == null)
            return false;
        if (other.getFileContent() != null && other.getFileContent().equals(this.getFileContent()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        if (other.getParentCommitId() == null ^ this.getParentCommitId() == null)
            return false;
        if (other.getParentCommitId() != null && other.getParentCommitId().equals(this.getParentCommitId()) == false)
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
        hashCode = prime * hashCode + ((getFileContent() == null) ? 0 : getFileContent().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        hashCode = prime * hashCode + ((getParentCommitId() == null) ? 0 : getParentCommitId().hashCode());
        hashCode = prime * hashCode + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        return hashCode;
    }

    @Override
    public PutFileRequest clone() {
        return (PutFileRequest) super.clone();
    }

}
