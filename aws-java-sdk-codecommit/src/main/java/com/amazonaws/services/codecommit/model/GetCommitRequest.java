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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a get commit operation.
 * </p>
 */
public class GetCommitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository to which the commit was made.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The commit ID.
     * </p>
     */
    private String commitId;

    /**
     * <p>
     * The name of the repository to which the commit was made.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to which the commit was made.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository to which the commit was made.
     * </p>
     * 
     * @return The name of the repository to which the commit was made.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository to which the commit was made.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to which the commit was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommitRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The commit ID.
     * </p>
     * 
     * @param commitId
     *        The commit ID.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The commit ID.
     * </p>
     * 
     * @return The commit ID.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * The commit ID.
     * </p>
     * 
     * @param commitId
     *        The commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommitRequest withCommitId(String commitId) {
        setCommitId(commitId);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: " + getRepositoryName() + ",");
        if (getCommitId() != null)
            sb.append("CommitId: " + getCommitId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCommitRequest == false)
            return false;
        GetCommitRequest other = (GetCommitRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        return hashCode;
    }

    @Override
    public GetCommitRequest clone() {
        return (GetCommitRequest) super.clone();
    }
}
