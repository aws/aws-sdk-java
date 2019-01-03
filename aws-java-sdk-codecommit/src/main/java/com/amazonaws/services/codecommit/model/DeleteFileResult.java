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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full commit ID of the commit that contains the change that deletes the file.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * The blob ID removed from the tree as part of deleting the file.
     * </p>
     */
    private String blobId;
    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the delete file change.
     * </p>
     */
    private String treeId;
    /**
     * <p>
     * The fully-qualified path to the file that will be deleted, including the full name and extension of that file.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * The full commit ID of the commit that contains the change that deletes the file.
     * </p>
     * 
     * @param commitId
     *        The full commit ID of the commit that contains the change that deletes the file.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains the change that deletes the file.
     * </p>
     * 
     * @return The full commit ID of the commit that contains the change that deletes the file.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains the change that deletes the file.
     * </p>
     * 
     * @param commitId
     *        The full commit ID of the commit that contains the change that deletes the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileResult withCommitId(String commitId) {
        setCommitId(commitId);
        return this;
    }

    /**
     * <p>
     * The blob ID removed from the tree as part of deleting the file.
     * </p>
     * 
     * @param blobId
     *        The blob ID removed from the tree as part of deleting the file.
     */

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    /**
     * <p>
     * The blob ID removed from the tree as part of deleting the file.
     * </p>
     * 
     * @return The blob ID removed from the tree as part of deleting the file.
     */

    public String getBlobId() {
        return this.blobId;
    }

    /**
     * <p>
     * The blob ID removed from the tree as part of deleting the file.
     * </p>
     * 
     * @param blobId
     *        The blob ID removed from the tree as part of deleting the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileResult withBlobId(String blobId) {
        setBlobId(blobId);
        return this;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the delete file change.
     * </p>
     * 
     * @param treeId
     *        The full SHA-1 pointer of the tree information for the commit that contains the delete file change.
     */

    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the delete file change.
     * </p>
     * 
     * @return The full SHA-1 pointer of the tree information for the commit that contains the delete file change.
     */

    public String getTreeId() {
        return this.treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the delete file change.
     * </p>
     * 
     * @param treeId
     *        The full SHA-1 pointer of the tree information for the commit that contains the delete file change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileResult withTreeId(String treeId) {
        setTreeId(treeId);
        return this;
    }

    /**
     * <p>
     * The fully-qualified path to the file that will be deleted, including the full name and extension of that file.
     * </p>
     * 
     * @param filePath
     *        The fully-qualified path to the file that will be deleted, including the full name and extension of that
     *        file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The fully-qualified path to the file that will be deleted, including the full name and extension of that file.
     * </p>
     * 
     * @return The fully-qualified path to the file that will be deleted, including the full name and extension of that
     *         file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The fully-qualified path to the file that will be deleted, including the full name and extension of that file.
     * </p>
     * 
     * @param filePath
     *        The fully-qualified path to the file that will be deleted, including the full name and extension of that
     *        file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileResult withFilePath(String filePath) {
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
        if (getCommitId() != null)
            sb.append("CommitId: ").append(getCommitId()).append(",");
        if (getBlobId() != null)
            sb.append("BlobId: ").append(getBlobId()).append(",");
        if (getTreeId() != null)
            sb.append("TreeId: ").append(getTreeId()).append(",");
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

        if (obj instanceof DeleteFileResult == false)
            return false;
        DeleteFileResult other = (DeleteFileResult) obj;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getBlobId() == null ^ this.getBlobId() == null)
            return false;
        if (other.getBlobId() != null && other.getBlobId().equals(this.getBlobId()) == false)
            return false;
        if (other.getTreeId() == null ^ this.getTreeId() == null)
            return false;
        if (other.getTreeId() != null && other.getTreeId().equals(this.getTreeId()) == false)
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

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getBlobId() == null) ? 0 : getBlobId().hashCode());
        hashCode = prime * hashCode + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFileResult clone() {
        try {
            return (DeleteFileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
