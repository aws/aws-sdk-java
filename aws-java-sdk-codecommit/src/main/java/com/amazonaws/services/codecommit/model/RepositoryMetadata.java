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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/RepositoryMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the AWS account associated with the repository.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The ID of the repository.
     * </p>
     */
    private String repositoryId;
    /**
     * <p>
     * The repository's name.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * A comment or description about the repository.
     * </p>
     */
    private String repositoryDescription;
    /**
     * <p>
     * The repository's default branch name.
     * </p>
     */
    private String defaultBranch;
    /**
     * <p>
     * The date and time the repository was last modified, in timestamp format.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The date and time the repository was created, in timestamp format.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The URL to use for cloning the repository over HTTPS.
     * </p>
     */
    private String cloneUrlHttp;
    /**
     * <p>
     * The URL to use for cloning the repository over SSH.
     * </p>
     */
    private String cloneUrlSsh;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The ID of the AWS account associated with the repository.
     * </p>
     * 
     * @param accountId
     *        The ID of the AWS account associated with the repository.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the AWS account associated with the repository.
     * </p>
     * 
     * @return The ID of the AWS account associated with the repository.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the AWS account associated with the repository.
     * </p>
     * 
     * @param accountId
     *        The ID of the AWS account associated with the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryMetadata withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ID of the repository.
     * </p>
     * 
     * @param repositoryId
     *        The ID of the repository.
     */

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * <p>
     * The ID of the repository.
     * </p>
     * 
     * @return The ID of the repository.
     */

    public String getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * <p>
     * The ID of the repository.
     * </p>
     * 
     * @param repositoryId
     *        The ID of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryMetadata withRepositoryId(String repositoryId) {
        setRepositoryId(repositoryId);
        return this;
    }

    /**
     * <p>
     * The repository's name.
     * </p>
     * 
     * @param repositoryName
     *        The repository's name.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The repository's name.
     * </p>
     * 
     * @return The repository's name.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The repository's name.
     * </p>
     * 
     * @param repositoryName
     *        The repository's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryMetadata withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * A comment or description about the repository.
     * </p>
     * 
     * @param repositoryDescription
     *        A comment or description about the repository.
     */

    public void setRepositoryDescription(String repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
    }

    /**
     * <p>
     * A comment or description about the repository.
     * </p>
     * 
     * @return A comment or description about the repository.
     */

    public String getRepositoryDescription() {
        return this.repositoryDescription;
    }

    /**
     * <p>
     * A comment or description about the repository.
     * </p>
     * 
     * @param repositoryDescription
     *        A comment or description about the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryMetadata withRepositoryDescription(String repositoryDescription) {
        setRepositoryDescription(repositoryDescription);
        return this;
    }

    /**
     * <p>
     * The repository's default branch name.
     * </p>
     * 
     * @param defaultBranch
     *        The repository's default branch name.
     */

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    /**
     * <p>
     * The repository's default branch name.
     * </p>
     * 
     * @return The repository's default branch name.
     */

    public String getDefaultBranch() {
        return this.defaultBranch;
    }

    /**
     * <p>
     * The repository's default branch name.
     * </p>
     * 
     * @param defaultBranch
     *        The repository's default branch name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryMetadata withDefaultBranch(String defaultBranch) {
        setDefaultBranch(defaultBranch);
        return this;
    }

    /**
     * <p>
     * The date and time the repository was last modified, in timestamp format.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time the repository was last modified, in timestamp format.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time the repository was last modified, in timestamp format.
     * </p>
     * 
     * @return The date and time the repository was last modified, in timestamp format.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time the repository was last modified, in timestamp format.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time the repository was last modified, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryMetadata withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The date and time the repository was created, in timestamp format.
     * </p>
     * 
     * @param creationDate
     *        The date and time the repository was created, in timestamp format.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time the repository was created, in timestamp format.
     * </p>
     * 
     * @return The date and time the repository was created, in timestamp format.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time the repository was created, in timestamp format.
     * </p>
     * 
     * @param creationDate
     *        The date and time the repository was created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryMetadata withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The URL to use for cloning the repository over HTTPS.
     * </p>
     * 
     * @param cloneUrlHttp
     *        The URL to use for cloning the repository over HTTPS.
     */

    public void setCloneUrlHttp(String cloneUrlHttp) {
        this.cloneUrlHttp = cloneUrlHttp;
    }

    /**
     * <p>
     * The URL to use for cloning the repository over HTTPS.
     * </p>
     * 
     * @return The URL to use for cloning the repository over HTTPS.
     */

    public String getCloneUrlHttp() {
        return this.cloneUrlHttp;
    }

    /**
     * <p>
     * The URL to use for cloning the repository over HTTPS.
     * </p>
     * 
     * @param cloneUrlHttp
     *        The URL to use for cloning the repository over HTTPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryMetadata withCloneUrlHttp(String cloneUrlHttp) {
        setCloneUrlHttp(cloneUrlHttp);
        return this;
    }

    /**
     * <p>
     * The URL to use for cloning the repository over SSH.
     * </p>
     * 
     * @param cloneUrlSsh
     *        The URL to use for cloning the repository over SSH.
     */

    public void setCloneUrlSsh(String cloneUrlSsh) {
        this.cloneUrlSsh = cloneUrlSsh;
    }

    /**
     * <p>
     * The URL to use for cloning the repository over SSH.
     * </p>
     * 
     * @return The URL to use for cloning the repository over SSH.
     */

    public String getCloneUrlSsh() {
        return this.cloneUrlSsh;
    }

    /**
     * <p>
     * The URL to use for cloning the repository over SSH.
     * </p>
     * 
     * @param cloneUrlSsh
     *        The URL to use for cloning the repository over SSH.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryMetadata withCloneUrlSsh(String cloneUrlSsh) {
        setCloneUrlSsh(cloneUrlSsh);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the repository.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the repository.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryMetadata withArn(String arn) {
        setArn(arn);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getRepositoryId() != null)
            sb.append("RepositoryId: ").append(getRepositoryId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getRepositoryDescription() != null)
            sb.append("RepositoryDescription: ").append(getRepositoryDescription()).append(",");
        if (getDefaultBranch() != null)
            sb.append("DefaultBranch: ").append(getDefaultBranch()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getCloneUrlHttp() != null)
            sb.append("CloneUrlHttp: ").append(getCloneUrlHttp()).append(",");
        if (getCloneUrlSsh() != null)
            sb.append("CloneUrlSsh: ").append(getCloneUrlSsh()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryMetadata == false)
            return false;
        RepositoryMetadata other = (RepositoryMetadata) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getRepositoryId() == null ^ this.getRepositoryId() == null)
            return false;
        if (other.getRepositoryId() != null && other.getRepositoryId().equals(this.getRepositoryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getRepositoryDescription() == null ^ this.getRepositoryDescription() == null)
            return false;
        if (other.getRepositoryDescription() != null && other.getRepositoryDescription().equals(this.getRepositoryDescription()) == false)
            return false;
        if (other.getDefaultBranch() == null ^ this.getDefaultBranch() == null)
            return false;
        if (other.getDefaultBranch() != null && other.getDefaultBranch().equals(this.getDefaultBranch()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getCloneUrlHttp() == null ^ this.getCloneUrlHttp() == null)
            return false;
        if (other.getCloneUrlHttp() != null && other.getCloneUrlHttp().equals(this.getCloneUrlHttp()) == false)
            return false;
        if (other.getCloneUrlSsh() == null ^ this.getCloneUrlSsh() == null)
            return false;
        if (other.getCloneUrlSsh() != null && other.getCloneUrlSsh().equals(this.getCloneUrlSsh()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryId() == null) ? 0 : getRepositoryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryDescription() == null) ? 0 : getRepositoryDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultBranch() == null) ? 0 : getDefaultBranch().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getCloneUrlHttp() == null) ? 0 : getCloneUrlHttp().hashCode());
        hashCode = prime * hashCode + ((getCloneUrlSsh() == null) ? 0 : getCloneUrlSsh().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryMetadata clone() {
        try {
            return (RepositoryMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.RepositoryMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
