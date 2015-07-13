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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a repository name and ID.
 * </p>
 */
public class RepositoryNameIdPair implements Serializable, Cloneable {

    private String repositoryName;
    /**
     * <p>
     * The ID associated with the repository name.
     * </p>
     */
    private String repositoryId;

    /**
     * Sets the value of the RepositoryName property for this object.
     * 
     * @param repositoryName
     *        The new value for the RepositoryName property for this object.
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * Returns the value of the RepositoryName property for this object.
     * 
     * @return The value of the RepositoryName property for this object.
     */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * Sets the value of the RepositoryName property for this object.
     * 
     * @param repositoryName
     *        The new value for the RepositoryName property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RepositoryNameIdPair withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The ID associated with the repository name.
     * </p>
     * 
     * @param repositoryId
     *        The ID associated with the repository name.
     */
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * <p>
     * The ID associated with the repository name.
     * </p>
     * 
     * @return The ID associated with the repository name.
     */
    public String getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * <p>
     * The ID associated with the repository name.
     * </p>
     * 
     * @param repositoryId
     *        The ID associated with the repository name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RepositoryNameIdPair withRepositoryId(String repositoryId) {
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: " + getRepositoryName() + ",");
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

        if (obj instanceof RepositoryNameIdPair == false)
            return false;
        RepositoryNameIdPair other = (RepositoryNameIdPair) obj;
        if (other.getRepositoryName() == null
                ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
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
                + ((getRepositoryName() == null) ? 0 : getRepositoryName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRepositoryId() == null) ? 0 : getRepositoryId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public RepositoryNameIdPair clone() {
        try {
            return (RepositoryNameIdPair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}