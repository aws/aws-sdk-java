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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a specific commit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/Commit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Commit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full SHA of the specified commit.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * Tree information for the specified commit.
     * </p>
     */
    private String treeId;
    /**
     * <p>
     * A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.
     * </p>
     */
    private java.util.List<String> parents;
    /**
     * <p>
     * The commit message associated with the specified commit.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Information about the author of the specified commit. Information includes the date in timestamp format with GMT
     * offset, the name of the author, and the email address for the author, as configured in Git.
     * </p>
     */
    private UserInfo author;
    /**
     * <p>
     * Information about the person who committed the specified commit, also known as the committer. Information
     * includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the
     * committer, as configured in Git.
     * </p>
     * <p>
     * For more information about the difference between an author and a committer in Git, see <a
     * href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben
     * Straub.
     * </p>
     */
    private UserInfo committer;
    /**
     * <p>
     * Any additional data associated with the specified commit.
     * </p>
     */
    private String additionalData;

    /**
     * <p>
     * The full SHA of the specified commit.
     * </p>
     * 
     * @param commitId
     *        The full SHA of the specified commit.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The full SHA of the specified commit.
     * </p>
     * 
     * @return The full SHA of the specified commit.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * The full SHA of the specified commit.
     * </p>
     * 
     * @param commitId
     *        The full SHA of the specified commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Commit withCommitId(String commitId) {
        setCommitId(commitId);
        return this;
    }

    /**
     * <p>
     * Tree information for the specified commit.
     * </p>
     * 
     * @param treeId
     *        Tree information for the specified commit.
     */

    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    /**
     * <p>
     * Tree information for the specified commit.
     * </p>
     * 
     * @return Tree information for the specified commit.
     */

    public String getTreeId() {
        return this.treeId;
    }

    /**
     * <p>
     * Tree information for the specified commit.
     * </p>
     * 
     * @param treeId
     *        Tree information for the specified commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Commit withTreeId(String treeId) {
        setTreeId(treeId);
        return this;
    }

    /**
     * <p>
     * A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.
     * </p>
     * 
     * @return A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.
     */

    public java.util.List<String> getParents() {
        return parents;
    }

    /**
     * <p>
     * A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.
     * </p>
     * 
     * @param parents
     *        A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.
     */

    public void setParents(java.util.Collection<String> parents) {
        if (parents == null) {
            this.parents = null;
            return;
        }

        this.parents = new java.util.ArrayList<String>(parents);
    }

    /**
     * <p>
     * A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParents(java.util.Collection)} or {@link #withParents(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param parents
     *        A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Commit withParents(String... parents) {
        if (this.parents == null) {
            setParents(new java.util.ArrayList<String>(parents.length));
        }
        for (String ele : parents) {
            this.parents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.
     * </p>
     * 
     * @param parents
     *        A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Commit withParents(java.util.Collection<String> parents) {
        setParents(parents);
        return this;
    }

    /**
     * <p>
     * The commit message associated with the specified commit.
     * </p>
     * 
     * @param message
     *        The commit message associated with the specified commit.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The commit message associated with the specified commit.
     * </p>
     * 
     * @return The commit message associated with the specified commit.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The commit message associated with the specified commit.
     * </p>
     * 
     * @param message
     *        The commit message associated with the specified commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Commit withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Information about the author of the specified commit. Information includes the date in timestamp format with GMT
     * offset, the name of the author, and the email address for the author, as configured in Git.
     * </p>
     * 
     * @param author
     *        Information about the author of the specified commit. Information includes the date in timestamp format
     *        with GMT offset, the name of the author, and the email address for the author, as configured in Git.
     */

    public void setAuthor(UserInfo author) {
        this.author = author;
    }

    /**
     * <p>
     * Information about the author of the specified commit. Information includes the date in timestamp format with GMT
     * offset, the name of the author, and the email address for the author, as configured in Git.
     * </p>
     * 
     * @return Information about the author of the specified commit. Information includes the date in timestamp format
     *         with GMT offset, the name of the author, and the email address for the author, as configured in Git.
     */

    public UserInfo getAuthor() {
        return this.author;
    }

    /**
     * <p>
     * Information about the author of the specified commit. Information includes the date in timestamp format with GMT
     * offset, the name of the author, and the email address for the author, as configured in Git.
     * </p>
     * 
     * @param author
     *        Information about the author of the specified commit. Information includes the date in timestamp format
     *        with GMT offset, the name of the author, and the email address for the author, as configured in Git.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Commit withAuthor(UserInfo author) {
        setAuthor(author);
        return this;
    }

    /**
     * <p>
     * Information about the person who committed the specified commit, also known as the committer. Information
     * includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the
     * committer, as configured in Git.
     * </p>
     * <p>
     * For more information about the difference between an author and a committer in Git, see <a
     * href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben
     * Straub.
     * </p>
     * 
     * @param committer
     *        Information about the person who committed the specified commit, also known as the committer. Information
     *        includes the date in timestamp format with GMT offset, the name of the committer, and the email address
     *        for the committer, as configured in Git.</p>
     *        <p>
     *        For more information about the difference between an author and a committer in Git, see <a
     *        href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and
     *        Ben Straub.
     */

    public void setCommitter(UserInfo committer) {
        this.committer = committer;
    }

    /**
     * <p>
     * Information about the person who committed the specified commit, also known as the committer. Information
     * includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the
     * committer, as configured in Git.
     * </p>
     * <p>
     * For more information about the difference between an author and a committer in Git, see <a
     * href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben
     * Straub.
     * </p>
     * 
     * @return Information about the person who committed the specified commit, also known as the committer. Information
     *         includes the date in timestamp format with GMT offset, the name of the committer, and the email address
     *         for the committer, as configured in Git.</p>
     *         <p>
     *         For more information about the difference between an author and a committer in Git, see <a
     *         href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and
     *         Ben Straub.
     */

    public UserInfo getCommitter() {
        return this.committer;
    }

    /**
     * <p>
     * Information about the person who committed the specified commit, also known as the committer. Information
     * includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the
     * committer, as configured in Git.
     * </p>
     * <p>
     * For more information about the difference between an author and a committer in Git, see <a
     * href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben
     * Straub.
     * </p>
     * 
     * @param committer
     *        Information about the person who committed the specified commit, also known as the committer. Information
     *        includes the date in timestamp format with GMT offset, the name of the committer, and the email address
     *        for the committer, as configured in Git.</p>
     *        <p>
     *        For more information about the difference between an author and a committer in Git, see <a
     *        href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and
     *        Ben Straub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Commit withCommitter(UserInfo committer) {
        setCommitter(committer);
        return this;
    }

    /**
     * <p>
     * Any additional data associated with the specified commit.
     * </p>
     * 
     * @param additionalData
     *        Any additional data associated with the specified commit.
     */

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    /**
     * <p>
     * Any additional data associated with the specified commit.
     * </p>
     * 
     * @return Any additional data associated with the specified commit.
     */

    public String getAdditionalData() {
        return this.additionalData;
    }

    /**
     * <p>
     * Any additional data associated with the specified commit.
     * </p>
     * 
     * @param additionalData
     *        Any additional data associated with the specified commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Commit withAdditionalData(String additionalData) {
        setAdditionalData(additionalData);
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
        if (getParents() != null)
            sb.append("Parents: ").append(getParents()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getAuthor() != null)
            sb.append("Author: ").append(getAuthor()).append(",");
        if (getCommitter() != null)
            sb.append("Committer: ").append(getCommitter()).append(",");
        if (getAdditionalData() != null)
            sb.append("AdditionalData: ").append(getAdditionalData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Commit == false)
            return false;
        Commit other = (Commit) obj;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getTreeId() == null ^ this.getTreeId() == null)
            return false;
        if (other.getTreeId() != null && other.getTreeId().equals(this.getTreeId()) == false)
            return false;
        if (other.getParents() == null ^ this.getParents() == null)
            return false;
        if (other.getParents() != null && other.getParents().equals(this.getParents()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getAuthor() == null ^ this.getAuthor() == null)
            return false;
        if (other.getAuthor() != null && other.getAuthor().equals(this.getAuthor()) == false)
            return false;
        if (other.getCommitter() == null ^ this.getCommitter() == null)
            return false;
        if (other.getCommitter() != null && other.getCommitter().equals(this.getCommitter()) == false)
            return false;
        if (other.getAdditionalData() == null ^ this.getAdditionalData() == null)
            return false;
        if (other.getAdditionalData() != null && other.getAdditionalData().equals(this.getAdditionalData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        hashCode = prime * hashCode + ((getParents() == null) ? 0 : getParents().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        hashCode = prime * hashCode + ((getCommitter() == null) ? 0 : getCommitter().hashCode());
        hashCode = prime * hashCode + ((getAdditionalData() == null) ? 0 : getAdditionalData().hashCode());
        return hashCode;
    }

    @Override
    public Commit clone() {
        try {
            return (Commit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.CommitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
