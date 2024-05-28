/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the revision for a specific sync event, such as the branch, owner ID, and name of the repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/Revision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Revision implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The branch name for a specific revision.
     * </p>
     */
    private String branch;
    /**
     * <p>
     * The directory, if any, for a specific revision.
     * </p>
     */
    private String directory;
    /**
     * <p>
     * The owner ID for a specific revision, such as the GitHub owner ID for a GitHub repository.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The repository name for a specific revision.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The provider type for a revision, such as GitHub.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The SHA, such as the commit ID, for a specific revision.
     * </p>
     */
    private String sha;

    /**
     * <p>
     * The branch name for a specific revision.
     * </p>
     * 
     * @param branch
     *        The branch name for a specific revision.
     */

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The branch name for a specific revision.
     * </p>
     * 
     * @return The branch name for a specific revision.
     */

    public String getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * The branch name for a specific revision.
     * </p>
     * 
     * @param branch
     *        The branch name for a specific revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Revision withBranch(String branch) {
        setBranch(branch);
        return this;
    }

    /**
     * <p>
     * The directory, if any, for a specific revision.
     * </p>
     * 
     * @param directory
     *        The directory, if any, for a specific revision.
     */

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    /**
     * <p>
     * The directory, if any, for a specific revision.
     * </p>
     * 
     * @return The directory, if any, for a specific revision.
     */

    public String getDirectory() {
        return this.directory;
    }

    /**
     * <p>
     * The directory, if any, for a specific revision.
     * </p>
     * 
     * @param directory
     *        The directory, if any, for a specific revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Revision withDirectory(String directory) {
        setDirectory(directory);
        return this;
    }

    /**
     * <p>
     * The owner ID for a specific revision, such as the GitHub owner ID for a GitHub repository.
     * </p>
     * 
     * @param ownerId
     *        The owner ID for a specific revision, such as the GitHub owner ID for a GitHub repository.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The owner ID for a specific revision, such as the GitHub owner ID for a GitHub repository.
     * </p>
     * 
     * @return The owner ID for a specific revision, such as the GitHub owner ID for a GitHub repository.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The owner ID for a specific revision, such as the GitHub owner ID for a GitHub repository.
     * </p>
     * 
     * @param ownerId
     *        The owner ID for a specific revision, such as the GitHub owner ID for a GitHub repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Revision withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The repository name for a specific revision.
     * </p>
     * 
     * @param repositoryName
     *        The repository name for a specific revision.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The repository name for a specific revision.
     * </p>
     * 
     * @return The repository name for a specific revision.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The repository name for a specific revision.
     * </p>
     * 
     * @param repositoryName
     *        The repository name for a specific revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Revision withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The provider type for a revision, such as GitHub.
     * </p>
     * 
     * @param providerType
     *        The provider type for a revision, such as GitHub.
     * @see ProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The provider type for a revision, such as GitHub.
     * </p>
     * 
     * @return The provider type for a revision, such as GitHub.
     * @see ProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The provider type for a revision, such as GitHub.
     * </p>
     * 
     * @param providerType
     *        The provider type for a revision, such as GitHub.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public Revision withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The provider type for a revision, such as GitHub.
     * </p>
     * 
     * @param providerType
     *        The provider type for a revision, such as GitHub.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public Revision withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The SHA, such as the commit ID, for a specific revision.
     * </p>
     * 
     * @param sha
     *        The SHA, such as the commit ID, for a specific revision.
     */

    public void setSha(String sha) {
        this.sha = sha;
    }

    /**
     * <p>
     * The SHA, such as the commit ID, for a specific revision.
     * </p>
     * 
     * @return The SHA, such as the commit ID, for a specific revision.
     */

    public String getSha() {
        return this.sha;
    }

    /**
     * <p>
     * The SHA, such as the commit ID, for a specific revision.
     * </p>
     * 
     * @param sha
     *        The SHA, such as the commit ID, for a specific revision.
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
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
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
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
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
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
        com.amazonaws.services.codestarconnections.model.transform.RevisionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
