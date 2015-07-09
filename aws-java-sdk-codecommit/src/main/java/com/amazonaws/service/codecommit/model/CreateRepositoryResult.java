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
 * Represents the output of a create repository operation.
 * </p>
 */
public class CreateRepositoryResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the newly created repository.
     * </p>
     */
    private RepositoryMetadata repositoryMetadata;

    /**
     * <p>
     * Information about the newly created repository.
     * </p>
     * 
     * @param repositoryMetadata
     *        Information about the newly created repository.
     */
    public void setRepositoryMetadata(RepositoryMetadata repositoryMetadata) {
        this.repositoryMetadata = repositoryMetadata;
    }

    /**
     * <p>
     * Information about the newly created repository.
     * </p>
     * 
     * @return Information about the newly created repository.
     */
    public RepositoryMetadata getRepositoryMetadata() {
        return this.repositoryMetadata;
    }

    /**
     * <p>
     * Information about the newly created repository.
     * </p>
     * 
     * @param repositoryMetadata
     *        Information about the newly created repository.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateRepositoryResult withRepositoryMetadata(
            RepositoryMetadata repositoryMetadata) {
        setRepositoryMetadata(repositoryMetadata);
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
        if (getRepositoryMetadata() != null)
            sb.append("RepositoryMetadata: " + getRepositoryMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRepositoryResult == false)
            return false;
        CreateRepositoryResult other = (CreateRepositoryResult) obj;
        if (other.getRepositoryMetadata() == null
                ^ this.getRepositoryMetadata() == null)
            return false;
        if (other.getRepositoryMetadata() != null
                && other.getRepositoryMetadata().equals(
                        this.getRepositoryMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRepositoryMetadata() == null) ? 0
                        : getRepositoryMetadata().hashCode());
        return hashCode;
    }

    @Override
    public CreateRepositoryResult clone() {
        try {
            return (CreateRepositoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}