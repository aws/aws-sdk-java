/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Returns information about a specific commit.
 * </p>
 */
public class Commit implements Serializable, Cloneable {

    /**
     * <p>
     * Tree information for the specified commit.
     * </p>
     */
    private String treeId;
    /**
     * <p>
     * The parent list for the specified commit.
     * </p>
     */
    private java.util.List<String> parents;
    /**
     * <p>
     * The message associated with the specified commit.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Information about the author of the specified commit.
     * </p>
     */
    private UserInfo author;
    /**
     * <p>
     * Information about the person who committed the specified commit, also known as the committer. For more
     * information about the difference between an author and a committer in Git, see <a
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
     * The parent list for the specified commit.
     * </p>
     * 
     * @return The parent list for the specified commit.
     */

    public java.util.List<String> getParents() {
        return parents;
    }

    /**
     * <p>
     * The parent list for the specified commit.
     * </p>
     * 
     * @param parents
     *        The parent list for the specified commit.
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
     * The parent list for the specified commit.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParents(java.util.Collection)} or {@link #withParents(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param parents
     *        The parent list for the specified commit.
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
     * The parent list for the specified commit.
     * </p>
     * 
     * @param parents
     *        The parent list for the specified commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Commit withParents(java.util.Collection<String> parents) {
        setParents(parents);
        return this;
    }

    /**
     * <p>
     * The message associated with the specified commit.
     * </p>
     * 
     * @param message
     *        The message associated with the specified commit.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message associated with the specified commit.
     * </p>
     * 
     * @return The message associated with the specified commit.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message associated with the specified commit.
     * </p>
     * 
     * @param message
     *        The message associated with the specified commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Commit withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Information about the author of the specified commit.
     * </p>
     * 
     * @param author
     *        Information about the author of the specified commit.
     */

    public void setAuthor(UserInfo author) {
        this.author = author;
    }

    /**
     * <p>
     * Information about the author of the specified commit.
     * </p>
     * 
     * @return Information about the author of the specified commit.
     */

    public UserInfo getAuthor() {
        return this.author;
    }

    /**
     * <p>
     * Information about the author of the specified commit.
     * </p>
     * 
     * @param author
     *        Information about the author of the specified commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Commit withAuthor(UserInfo author) {
        setAuthor(author);
        return this;
    }

    /**
     * <p>
     * Information about the person who committed the specified commit, also known as the committer. For more
     * information about the difference between an author and a committer in Git, see <a
     * href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben
     * Straub.
     * </p>
     * 
     * @param committer
     *        Information about the person who committed the specified commit, also known as the committer. For more
     *        information about the difference between an author and a committer in Git, see <a
     *        href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and
     *        Ben Straub.
     */

    public void setCommitter(UserInfo committer) {
        this.committer = committer;
    }

    /**
     * <p>
     * Information about the person who committed the specified commit, also known as the committer. For more
     * information about the difference between an author and a committer in Git, see <a
     * href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben
     * Straub.
     * </p>
     * 
     * @return Information about the person who committed the specified commit, also known as the committer. For more
     *         information about the difference between an author and a committer in Git, see <a
     *         href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and
     *         Ben Straub.
     */

    public UserInfo getCommitter() {
        return this.committer;
    }

    /**
     * <p>
     * Information about the person who committed the specified commit, also known as the committer. For more
     * information about the difference between an author and a committer in Git, see <a
     * href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a> in Pro Git by Scott Chacon and Ben
     * Straub.
     * </p>
     * 
     * @param committer
     *        Information about the person who committed the specified commit, also known as the committer. For more
     *        information about the difference between an author and a committer in Git, see <a
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
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTreeId() != null)
            sb.append("TreeId: " + getTreeId() + ",");
        if (getParents() != null)
            sb.append("Parents: " + getParents() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getAuthor() != null)
            sb.append("Author: " + getAuthor() + ",");
        if (getCommitter() != null)
            sb.append("Committer: " + getCommitter() + ",");
        if (getAdditionalData() != null)
            sb.append("AdditionalData: " + getAdditionalData());
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
}
