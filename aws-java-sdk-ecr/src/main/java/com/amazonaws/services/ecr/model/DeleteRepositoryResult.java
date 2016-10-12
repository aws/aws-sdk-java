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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;

/**
 * 
 */
public class DeleteRepositoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The repository that was deleted.
     * </p>
     */
    private Repository repository;

    /**
     * <p>
     * The repository that was deleted.
     * </p>
     * 
     * @param repository
     *        The repository that was deleted.
     */

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The repository that was deleted.
     * </p>
     * 
     * @return The repository that was deleted.
     */

    public Repository getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The repository that was deleted.
     * </p>
     * 
     * @param repository
     *        The repository that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRepositoryResult withRepository(Repository repository) {
        setRepository(repository);
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
        if (getRepository() != null)
            sb.append("Repository: " + getRepository());
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
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRepositoryResult clone() {
        try {
            return (DeleteRepositoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
