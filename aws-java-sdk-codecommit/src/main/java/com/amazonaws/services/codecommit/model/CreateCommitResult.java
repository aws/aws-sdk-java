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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateCommit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCommitResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full commit ID of the commit that contains your committed file changes.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the commited file changes.
     * </p>
     */
    private String treeId;
    /**
     * <p>
     * The files added as part of the committed file changes.
     * </p>
     */
    private java.util.List<FileMetadata> filesAdded;
    /**
     * <p>
     * The files updated as part of the commited file changes.
     * </p>
     */
    private java.util.List<FileMetadata> filesUpdated;
    /**
     * <p>
     * The files deleted as part of the committed file changes.
     * </p>
     */
    private java.util.List<FileMetadata> filesDeleted;

    /**
     * <p>
     * The full commit ID of the commit that contains your committed file changes.
     * </p>
     * 
     * @param commitId
     *        The full commit ID of the commit that contains your committed file changes.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains your committed file changes.
     * </p>
     * 
     * @return The full commit ID of the commit that contains your committed file changes.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains your committed file changes.
     * </p>
     * 
     * @param commitId
     *        The full commit ID of the commit that contains your committed file changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitResult withCommitId(String commitId) {
        setCommitId(commitId);
        return this;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the commited file changes.
     * </p>
     * 
     * @param treeId
     *        The full SHA-1 pointer of the tree information for the commit that contains the commited file changes.
     */

    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the commited file changes.
     * </p>
     * 
     * @return The full SHA-1 pointer of the tree information for the commit that contains the commited file changes.
     */

    public String getTreeId() {
        return this.treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains the commited file changes.
     * </p>
     * 
     * @param treeId
     *        The full SHA-1 pointer of the tree information for the commit that contains the commited file changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitResult withTreeId(String treeId) {
        setTreeId(treeId);
        return this;
    }

    /**
     * <p>
     * The files added as part of the committed file changes.
     * </p>
     * 
     * @return The files added as part of the committed file changes.
     */

    public java.util.List<FileMetadata> getFilesAdded() {
        return filesAdded;
    }

    /**
     * <p>
     * The files added as part of the committed file changes.
     * </p>
     * 
     * @param filesAdded
     *        The files added as part of the committed file changes.
     */

    public void setFilesAdded(java.util.Collection<FileMetadata> filesAdded) {
        if (filesAdded == null) {
            this.filesAdded = null;
            return;
        }

        this.filesAdded = new java.util.ArrayList<FileMetadata>(filesAdded);
    }

    /**
     * <p>
     * The files added as part of the committed file changes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilesAdded(java.util.Collection)} or {@link #withFilesAdded(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filesAdded
     *        The files added as part of the committed file changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitResult withFilesAdded(FileMetadata... filesAdded) {
        if (this.filesAdded == null) {
            setFilesAdded(new java.util.ArrayList<FileMetadata>(filesAdded.length));
        }
        for (FileMetadata ele : filesAdded) {
            this.filesAdded.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The files added as part of the committed file changes.
     * </p>
     * 
     * @param filesAdded
     *        The files added as part of the committed file changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitResult withFilesAdded(java.util.Collection<FileMetadata> filesAdded) {
        setFilesAdded(filesAdded);
        return this;
    }

    /**
     * <p>
     * The files updated as part of the commited file changes.
     * </p>
     * 
     * @return The files updated as part of the commited file changes.
     */

    public java.util.List<FileMetadata> getFilesUpdated() {
        return filesUpdated;
    }

    /**
     * <p>
     * The files updated as part of the commited file changes.
     * </p>
     * 
     * @param filesUpdated
     *        The files updated as part of the commited file changes.
     */

    public void setFilesUpdated(java.util.Collection<FileMetadata> filesUpdated) {
        if (filesUpdated == null) {
            this.filesUpdated = null;
            return;
        }

        this.filesUpdated = new java.util.ArrayList<FileMetadata>(filesUpdated);
    }

    /**
     * <p>
     * The files updated as part of the commited file changes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilesUpdated(java.util.Collection)} or {@link #withFilesUpdated(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filesUpdated
     *        The files updated as part of the commited file changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitResult withFilesUpdated(FileMetadata... filesUpdated) {
        if (this.filesUpdated == null) {
            setFilesUpdated(new java.util.ArrayList<FileMetadata>(filesUpdated.length));
        }
        for (FileMetadata ele : filesUpdated) {
            this.filesUpdated.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The files updated as part of the commited file changes.
     * </p>
     * 
     * @param filesUpdated
     *        The files updated as part of the commited file changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitResult withFilesUpdated(java.util.Collection<FileMetadata> filesUpdated) {
        setFilesUpdated(filesUpdated);
        return this;
    }

    /**
     * <p>
     * The files deleted as part of the committed file changes.
     * </p>
     * 
     * @return The files deleted as part of the committed file changes.
     */

    public java.util.List<FileMetadata> getFilesDeleted() {
        return filesDeleted;
    }

    /**
     * <p>
     * The files deleted as part of the committed file changes.
     * </p>
     * 
     * @param filesDeleted
     *        The files deleted as part of the committed file changes.
     */

    public void setFilesDeleted(java.util.Collection<FileMetadata> filesDeleted) {
        if (filesDeleted == null) {
            this.filesDeleted = null;
            return;
        }

        this.filesDeleted = new java.util.ArrayList<FileMetadata>(filesDeleted);
    }

    /**
     * <p>
     * The files deleted as part of the committed file changes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilesDeleted(java.util.Collection)} or {@link #withFilesDeleted(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filesDeleted
     *        The files deleted as part of the committed file changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitResult withFilesDeleted(FileMetadata... filesDeleted) {
        if (this.filesDeleted == null) {
            setFilesDeleted(new java.util.ArrayList<FileMetadata>(filesDeleted.length));
        }
        for (FileMetadata ele : filesDeleted) {
            this.filesDeleted.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The files deleted as part of the committed file changes.
     * </p>
     * 
     * @param filesDeleted
     *        The files deleted as part of the committed file changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommitResult withFilesDeleted(java.util.Collection<FileMetadata> filesDeleted) {
        setFilesDeleted(filesDeleted);
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
        if (getTreeId() != null)
            sb.append("TreeId: ").append(getTreeId()).append(",");
        if (getFilesAdded() != null)
            sb.append("FilesAdded: ").append(getFilesAdded()).append(",");
        if (getFilesUpdated() != null)
            sb.append("FilesUpdated: ").append(getFilesUpdated()).append(",");
        if (getFilesDeleted() != null)
            sb.append("FilesDeleted: ").append(getFilesDeleted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCommitResult == false)
            return false;
        CreateCommitResult other = (CreateCommitResult) obj;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getTreeId() == null ^ this.getTreeId() == null)
            return false;
        if (other.getTreeId() != null && other.getTreeId().equals(this.getTreeId()) == false)
            return false;
        if (other.getFilesAdded() == null ^ this.getFilesAdded() == null)
            return false;
        if (other.getFilesAdded() != null && other.getFilesAdded().equals(this.getFilesAdded()) == false)
            return false;
        if (other.getFilesUpdated() == null ^ this.getFilesUpdated() == null)
            return false;
        if (other.getFilesUpdated() != null && other.getFilesUpdated().equals(this.getFilesUpdated()) == false)
            return false;
        if (other.getFilesDeleted() == null ^ this.getFilesDeleted() == null)
            return false;
        if (other.getFilesDeleted() != null && other.getFilesDeleted().equals(this.getFilesDeleted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        hashCode = prime * hashCode + ((getFilesAdded() == null) ? 0 : getFilesAdded().hashCode());
        hashCode = prime * hashCode + ((getFilesUpdated() == null) ? 0 : getFilesUpdated().hashCode());
        hashCode = prime * hashCode + ((getFilesDeleted() == null) ? 0 : getFilesDeleted().hashCode());
        return hashCode;
    }

    @Override
    public CreateCommitResult clone() {
        try {
            return (CreateCommitResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
