/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.service.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a delete repository operation.
 * </p>
 */
public class DeleteRepositoryResult implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the repository that was deleted.
     * </p>
     */
    private String repositoryId;

    /**
     * <p>
     * The ID of the repository that was deleted.
     * </p>
     * 
     * @param repositoryId
     *        The ID of the repository that was deleted.
     */
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * <p>
     * The ID of the repository that was deleted.
     * </p>
     * 
     * @return The ID of the repository that was deleted.
     */
    public String getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * <p>
     * The ID of the repository that was deleted.
     * </p>
     * 
     * @param repositoryId
     *        The ID of the repository that was deleted.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DeleteRepositoryResult withRepositoryId(String repositoryId) {
        setRepositoryId(repositoryId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRepositoryId() != null)
            sb.append("RepositoryId: " + getRepositoryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRepositoryResult == false)
            return false;
        DeleteRepositoryResult other = (DeleteRepositoryResult) obj;
        if (other.getRepositoryId() == null ^ this.getRepositoryId() == null)
            return false;
        if (other.getRepositoryId() != null
                && other.getRepositoryId().equals(this.getRepositoryId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRepositoryId() == null) ? 0 : getRepositoryId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DeleteRepositoryResult clone() {
        try {
            return (DeleteRepositoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}