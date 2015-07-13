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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a batch get repositories operation.
 * </p>
 */
public class BatchGetRepositoriesRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the repositories to get information about.
     * </p>
     */
    private java.util.List<String> repositoryNames;

    /**
     * <p>
     * The names of the repositories to get information about.
     * </p>
     * 
     * @return The names of the repositories to get information about.
     */
    public java.util.List<String> getRepositoryNames() {
        return repositoryNames;
    }

    /**
     * <p>
     * The names of the repositories to get information about.
     * </p>
     * 
     * @param repositoryNames
     *        The names of the repositories to get information about.
     */
    public void setRepositoryNames(java.util.Collection<String> repositoryNames) {
        if (repositoryNames == null) {
            this.repositoryNames = null;
            return;
        }

        this.repositoryNames = new java.util.ArrayList<String>(repositoryNames);
    }

    /**
     * <p>
     * The names of the repositories to get information about.
     * </p>
     * 
     * @param repositoryNames
     *        The names of the repositories to get information about.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchGetRepositoriesRequest withRepositoryNames(
            String... repositoryNames) {
        if (this.repositoryNames == null) {
            setRepositoryNames(new java.util.ArrayList<String>(
                    repositoryNames.length));
        }
        for (String ele : repositoryNames) {
            this.repositoryNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the repositories to get information about.
     * </p>
     * 
     * @param repositoryNames
     *        The names of the repositories to get information about.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchGetRepositoriesRequest withRepositoryNames(
            java.util.Collection<String> repositoryNames) {
        setRepositoryNames(repositoryNames);
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
        if (getRepositoryNames() != null)
            sb.append("RepositoryNames: " + getRepositoryNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetRepositoriesRequest == false)
            return false;
        BatchGetRepositoriesRequest other = (BatchGetRepositoriesRequest) obj;
        if (other.getRepositoryNames() == null
                ^ this.getRepositoryNames() == null)
            return false;
        if (other.getRepositoryNames() != null
                && other.getRepositoryNames().equals(this.getRepositoryNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRepositoryNames() == null) ? 0 : getRepositoryNames()
                        .hashCode());
        return hashCode;
    }

    @Override
    public BatchGetRepositoriesRequest clone() {
        return (BatchGetRepositoriesRequest) super.clone();
    }
}