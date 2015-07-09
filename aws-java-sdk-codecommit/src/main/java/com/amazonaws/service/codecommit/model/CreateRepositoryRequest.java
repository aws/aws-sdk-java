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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a create repository operation.
 * </p>
 */
public class CreateRepositoryRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the new repository to be created.
     * </p>
     * <note>The repository name must be unique across the calling AWS account.
     * In addition, repository names are restricted to alphanumeric characters.
     * The suffix ".git" is prohibited.</note>
     */
    private String repositoryName;
    /**
     * <p>
     * A comment or description about the new repository.
     * </p>
     */
    private String repositoryDescription;

    /**
     * <p>
     * The name of the new repository to be created.
     * </p>
     * <note>The repository name must be unique across the calling AWS account.
     * In addition, repository names are restricted to alphanumeric characters.
     * The suffix ".git" is prohibited.</note>
     * 
     * @param repositoryName
     *        The name of the new repository to be created.</p> <note>The
     *        repository name must be unique across the calling AWS account. In
     *        addition, repository names are restricted to alphanumeric
     *        characters. The suffix ".git" is prohibited.
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the new repository to be created.
     * </p>
     * <note>The repository name must be unique across the calling AWS account.
     * In addition, repository names are restricted to alphanumeric characters.
     * The suffix ".git" is prohibited.</note>
     * 
     * @return The name of the new repository to be created.</p> <note>The
     *         repository name must be unique across the calling AWS account. In
     *         addition, repository names are restricted to alphanumeric
     *         characters. The suffix ".git" is prohibited.
     */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the new repository to be created.
     * </p>
     * <note>The repository name must be unique across the calling AWS account.
     * In addition, repository names are restricted to alphanumeric characters.
     * The suffix ".git" is prohibited.</note>
     * 
     * @param repositoryName
     *        The name of the new repository to be created.</p> <note>The
     *        repository name must be unique across the calling AWS account. In
     *        addition, repository names are restricted to alphanumeric
     *        characters. The suffix ".git" is prohibited.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateRepositoryRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * A comment or description about the new repository.
     * </p>
     * 
     * @param repositoryDescription
     *        A comment or description about the new repository.
     */
    public void setRepositoryDescription(String repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
    }

    /**
     * <p>
     * A comment or description about the new repository.
     * </p>
     * 
     * @return A comment or description about the new repository.
     */
    public String getRepositoryDescription() {
        return this.repositoryDescription;
    }

    /**
     * <p>
     * A comment or description about the new repository.
     * </p>
     * 
     * @param repositoryDescription
     *        A comment or description about the new repository.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateRepositoryRequest withRepositoryDescription(
            String repositoryDescription) {
        setRepositoryDescription(repositoryDescription);
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
        if (getRepositoryDescription() != null)
            sb.append("RepositoryDescription: " + getRepositoryDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRepositoryRequest == false)
            return false;
        CreateRepositoryRequest other = (CreateRepositoryRequest) obj;
        if (other.getRepositoryName() == null
                ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getRepositoryDescription() == null
                ^ this.getRepositoryDescription() == null)
            return false;
        if (other.getRepositoryDescription() != null
                && other.getRepositoryDescription().equals(
                        this.getRepositoryDescription()) == false)
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
                + ((getRepositoryDescription() == null) ? 0
                        : getRepositoryDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateRepositoryRequest clone() {
        return (CreateRepositoryRequest) super.clone();
    }
}