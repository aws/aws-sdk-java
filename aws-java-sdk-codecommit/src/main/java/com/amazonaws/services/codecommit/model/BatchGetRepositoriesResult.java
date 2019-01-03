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
 * <p>
 * Represents the output of a batch get repositories operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetRepositories" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetRepositoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of repositories returned by the batch get repositories operation.
     * </p>
     */
    private java.util.List<RepositoryMetadata> repositories;
    /**
     * <p>
     * Returns a list of repository names for which information could not be found.
     * </p>
     */
    private java.util.List<String> repositoriesNotFound;

    /**
     * <p>
     * A list of repositories returned by the batch get repositories operation.
     * </p>
     * 
     * @return A list of repositories returned by the batch get repositories operation.
     */

    public java.util.List<RepositoryMetadata> getRepositories() {
        return repositories;
    }

    /**
     * <p>
     * A list of repositories returned by the batch get repositories operation.
     * </p>
     * 
     * @param repositories
     *        A list of repositories returned by the batch get repositories operation.
     */

    public void setRepositories(java.util.Collection<RepositoryMetadata> repositories) {
        if (repositories == null) {
            this.repositories = null;
            return;
        }

        this.repositories = new java.util.ArrayList<RepositoryMetadata>(repositories);
    }

    /**
     * <p>
     * A list of repositories returned by the batch get repositories operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositories(java.util.Collection)} or {@link #withRepositories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param repositories
     *        A list of repositories returned by the batch get repositories operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRepositoriesResult withRepositories(RepositoryMetadata... repositories) {
        if (this.repositories == null) {
            setRepositories(new java.util.ArrayList<RepositoryMetadata>(repositories.length));
        }
        for (RepositoryMetadata ele : repositories) {
            this.repositories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of repositories returned by the batch get repositories operation.
     * </p>
     * 
     * @param repositories
     *        A list of repositories returned by the batch get repositories operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRepositoriesResult withRepositories(java.util.Collection<RepositoryMetadata> repositories) {
        setRepositories(repositories);
        return this;
    }

    /**
     * <p>
     * Returns a list of repository names for which information could not be found.
     * </p>
     * 
     * @return Returns a list of repository names for which information could not be found.
     */

    public java.util.List<String> getRepositoriesNotFound() {
        return repositoriesNotFound;
    }

    /**
     * <p>
     * Returns a list of repository names for which information could not be found.
     * </p>
     * 
     * @param repositoriesNotFound
     *        Returns a list of repository names for which information could not be found.
     */

    public void setRepositoriesNotFound(java.util.Collection<String> repositoriesNotFound) {
        if (repositoriesNotFound == null) {
            this.repositoriesNotFound = null;
            return;
        }

        this.repositoriesNotFound = new java.util.ArrayList<String>(repositoriesNotFound);
    }

    /**
     * <p>
     * Returns a list of repository names for which information could not be found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositoriesNotFound(java.util.Collection)} or {@link #withRepositoriesNotFound(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param repositoriesNotFound
     *        Returns a list of repository names for which information could not be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRepositoriesResult withRepositoriesNotFound(String... repositoriesNotFound) {
        if (this.repositoriesNotFound == null) {
            setRepositoriesNotFound(new java.util.ArrayList<String>(repositoriesNotFound.length));
        }
        for (String ele : repositoriesNotFound) {
            this.repositoriesNotFound.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of repository names for which information could not be found.
     * </p>
     * 
     * @param repositoriesNotFound
     *        Returns a list of repository names for which information could not be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRepositoriesResult withRepositoriesNotFound(java.util.Collection<String> repositoriesNotFound) {
        setRepositoriesNotFound(repositoriesNotFound);
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
        if (getRepositories() != null)
            sb.append("Repositories: ").append(getRepositories()).append(",");
        if (getRepositoriesNotFound() != null)
            sb.append("RepositoriesNotFound: ").append(getRepositoriesNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetRepositoriesResult == false)
            return false;
        BatchGetRepositoriesResult other = (BatchGetRepositoriesResult) obj;
        if (other.getRepositories() == null ^ this.getRepositories() == null)
            return false;
        if (other.getRepositories() != null && other.getRepositories().equals(this.getRepositories()) == false)
            return false;
        if (other.getRepositoriesNotFound() == null ^ this.getRepositoriesNotFound() == null)
            return false;
        if (other.getRepositoriesNotFound() != null && other.getRepositoriesNotFound().equals(this.getRepositoriesNotFound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositories() == null) ? 0 : getRepositories().hashCode());
        hashCode = prime * hashCode + ((getRepositoriesNotFound() == null) ? 0 : getRepositoriesNotFound().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetRepositoriesResult clone() {
        try {
            return (BatchGetRepositoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
