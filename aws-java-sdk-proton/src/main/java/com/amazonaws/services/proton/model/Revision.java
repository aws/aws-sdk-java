/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Revision detail data for a commit and push that activates a sync attempt
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/Revision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Revision implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The repository branch.
     * </p>
     */
    private String branch;
    /**
     * <p>
     * The repository directory changed by a commit and push that activated the sync attempt.
     * </p>
     */
    private String directory;
    /**
     * <p>
     * The repository name.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The repository provider.
     * </p>
     */
    private String repositoryProvider;
    /**
     * <p>
     * The secure hash algorithm (SHA) hash for the revision.
     * </p>
     */
    private String sha;

    /**
     * <p>
     * The repository branch.
     * </p>
     * 
     * @param branch
     *        The repository branch.
     */

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The repository branch.
     * </p>
     * 
     * @return The repository branch.
     */

    public String getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * The repository branch.
     * </p>
     * 
     * @param branch
     *        The repository branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Revision withBranch(String branch) {
        setBranch(branch);
        return this;
    }

    /**
     * <p>
     * The repository directory changed by a commit and push that activated the sync attempt.
     * </p>
     * 
     * @param directory
     *        The repository directory changed by a commit and push that activated the sync attempt.
     */

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    /**
     * <p>
     * The repository directory changed by a commit and push that activated the sync attempt.
     * </p>
     * 
     * @return The repository directory changed by a commit and push that activated the sync attempt.
     */

    public String getDirectory() {
        return this.directory;
    }

    /**
     * <p>
     * The repository directory changed by a commit and push that activated the sync attempt.
     * </p>
     * 
     * @param directory
     *        The repository directory changed by a commit and push that activated the sync attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Revision withDirectory(String directory) {
        setDirectory(directory);
        return this;
    }

    /**
     * <p>
     * The repository name.
     * </p>
     * 
     * @param repositoryName
     *        The repository name.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The repository name.
     * </p>
     * 
     * @return The repository name.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The repository name.
     * </p>
     * 
     * @param repositoryName
     *        The repository name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Revision withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @param repositoryProvider
     *        The repository provider.
     * @see RepositoryProvider
     */

    public void setRepositoryProvider(String repositoryProvider) {
        this.repositoryProvider = repositoryProvider;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @return The repository provider.
     * @see RepositoryProvider
     */

    public String getRepositoryProvider() {
        return this.repositoryProvider;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @param repositoryProvider
     *        The repository provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryProvider
     */

    public Revision withRepositoryProvider(String repositoryProvider) {
        setRepositoryProvider(repositoryProvider);
        return this;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @param repositoryProvider
     *        The repository provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryProvider
     */

    public Revision withRepositoryProvider(RepositoryProvider repositoryProvider) {
        this.repositoryProvider = repositoryProvider.toString();
        return this;
    }

    /**
     * <p>
     * The secure hash algorithm (SHA) hash for the revision.
     * </p>
     * 
     * @param sha
     *        The secure hash algorithm (SHA) hash for the revision.
     */

    public void setSha(String sha) {
        this.sha = sha;
    }

    /**
     * <p>
     * The secure hash algorithm (SHA) hash for the revision.
     * </p>
     * 
     * @return The secure hash algorithm (SHA) hash for the revision.
     */

    public String getSha() {
        return this.sha;
    }

    /**
     * <p>
     * The secure hash algorithm (SHA) hash for the revision.
     * </p>
     * 
     * @param sha
     *        The secure hash algorithm (SHA) hash for the revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Revision withSha(String sha) {
        setSha(sha);
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
        if (getBranch() != null)
            sb.append("Branch: ").append(getBranch()).append(",");
        if (getDirectory() != null)
            sb.append("Directory: ").append(getDirectory()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getRepositoryProvider() != null)
            sb.append("RepositoryProvider: ").append(getRepositoryProvider()).append(",");
        if (getSha() != null)
            sb.append("Sha: ").append(getSha());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Revision == false)
            return false;
        Revision other = (Revision) obj;
        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        if (other.getDirectory() == null ^ this.getDirectory() == null)
            return false;
        if (other.getDirectory() != null && other.getDirectory().equals(this.getDirectory()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getRepositoryProvider() == null ^ this.getRepositoryProvider() == null)
            return false;
        if (other.getRepositoryProvider() != null && other.getRepositoryProvider().equals(this.getRepositoryProvider()) == false)
            return false;
        if (other.getSha() == null ^ this.getSha() == null)
            return false;
        if (other.getSha() != null && other.getSha().equals(this.getSha()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        hashCode = prime * hashCode + ((getDirectory() == null) ? 0 : getDirectory().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryProvider() == null) ? 0 : getRepositoryProvider().hashCode());
        hashCode = prime * hashCode + ((getSha() == null) ? 0 : getSha().hashCode());
        return hashCode;
    }

    @Override
    public Revision clone() {
        try {
            return (Revision) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.RevisionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
