/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.ecr.model;

import java.io.Serializable;

/**
 * <p>
 * Object representing a repository.
 * </p>
 */
public class Repository implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the repository. The ARN
     * contains the <code>arn:aws:ecr</code> namespace, followed by the region
     * of the repository, the AWS account ID of the repository owner, the
     * repository namespace, and then the repository name. For example,
     * <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     * </p>
     */
    private String repositoryArn;
    /**
     * <p>
     * The AWS account ID associated with the registry that contains the
     * repository.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The name of the repository.
     * </p>
     */
    private String repositoryName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the repository. The ARN
     * contains the <code>arn:aws:ecr</code> namespace, followed by the region
     * of the repository, the AWS account ID of the repository owner, the
     * repository namespace, and then the repository name. For example,
     * <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     * </p>
     * 
     * @param repositoryArn
     *        The Amazon Resource Name (ARN) that identifies the repository. The
     *        ARN contains the <code>arn:aws:ecr</code> namespace, followed by
     *        the region of the repository, the AWS account ID of the repository
     *        owner, the repository namespace, and then the repository name. For
     *        example,
     *        <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     */
    public void setRepositoryArn(String repositoryArn) {
        this.repositoryArn = repositoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the repository. The ARN
     * contains the <code>arn:aws:ecr</code> namespace, followed by the region
     * of the repository, the AWS account ID of the repository owner, the
     * repository namespace, and then the repository name. For example,
     * <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the repository.
     *         The ARN contains the <code>arn:aws:ecr</code> namespace, followed
     *         by the region of the repository, the AWS account ID of the
     *         repository owner, the repository namespace, and then the
     *         repository name. For example,
     *         <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     */
    public String getRepositoryArn() {
        return this.repositoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the repository. The ARN
     * contains the <code>arn:aws:ecr</code> namespace, followed by the region
     * of the repository, the AWS account ID of the repository owner, the
     * repository namespace, and then the repository name. For example,
     * <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     * </p>
     * 
     * @param repositoryArn
     *        The Amazon Resource Name (ARN) that identifies the repository. The
     *        ARN contains the <code>arn:aws:ecr</code> namespace, followed by
     *        the region of the repository, the AWS account ID of the repository
     *        owner, the repository namespace, and then the repository name. For
     *        example,
     *        <code>arn:aws:ecr:region:012345678910:repository/test</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Repository withRepositoryArn(String repositoryArn) {
        setRepositoryArn(repositoryArn);
        return this;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the
     * repository.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the
     *        repository.
     */
    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the
     * repository.
     * </p>
     * 
     * @return The AWS account ID associated with the registry that contains the
     *         repository.
     */
    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the
     * repository.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the
     *        repository.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Repository withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @return The name of the repository.
     */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Repository withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
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
        if (getRepositoryArn() != null)
            sb.append("RepositoryArn: " + getRepositoryArn() + ",");
        if (getRegistryId() != null)
            sb.append("RegistryId: " + getRegistryId() + ",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: " + getRepositoryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Repository == false)
            return false;
        Repository other = (Repository) obj;
        if (other.getRepositoryArn() == null ^ this.getRepositoryArn() == null)
            return false;
        if (other.getRepositoryArn() != null
                && other.getRepositoryArn().equals(this.getRepositoryArn()) == false)
            return false;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null
                && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null
                ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRepositoryArn() == null) ? 0 : getRepositoryArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime
                * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public Repository clone() {
        try {
            return (Repository) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}