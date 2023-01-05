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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details for a source control configuration for a job, allowing synchronization of job artifacts to or from a
 * remote repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SourceControlDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceControlDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The provider for the remote repository.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The name of the remote repository that contains the job artifacts.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * The owner of the remote repository that contains the job artifacts.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * An optional branch in the remote repository.
     * </p>
     */
    private String branch;
    /**
     * <p>
     * An optional folder in the remote repository.
     * </p>
     */
    private String folder;
    /**
     * <p>
     * The last commit ID for a commit in the remote repository.
     * </p>
     */
    private String lastCommitId;
    /**
     * <p>
     * The type of authentication, which can be an authentication token stored in Amazon Web Services Secrets Manager,
     * or a personal access token.
     * </p>
     */
    private String authStrategy;
    /**
     * <p>
     * The value of an authorization token.
     * </p>
     */
    private String authToken;

    /**
     * <p>
     * The provider for the remote repository.
     * </p>
     * 
     * @param provider
     *        The provider for the remote repository.
     * @see SourceControlProvider
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider for the remote repository.
     * </p>
     * 
     * @return The provider for the remote repository.
     * @see SourceControlProvider
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider for the remote repository.
     * </p>
     * 
     * @param provider
     *        The provider for the remote repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceControlProvider
     */

    public SourceControlDetails withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The provider for the remote repository.
     * </p>
     * 
     * @param provider
     *        The provider for the remote repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceControlProvider
     */

    public SourceControlDetails withProvider(SourceControlProvider provider) {
        this.provider = provider.toString();
        return this;
    }

    /**
     * <p>
     * The name of the remote repository that contains the job artifacts.
     * </p>
     * 
     * @param repository
     *        The name of the remote repository that contains the job artifacts.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The name of the remote repository that contains the job artifacts.
     * </p>
     * 
     * @return The name of the remote repository that contains the job artifacts.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The name of the remote repository that contains the job artifacts.
     * </p>
     * 
     * @param repository
     *        The name of the remote repository that contains the job artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceControlDetails withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * The owner of the remote repository that contains the job artifacts.
     * </p>
     * 
     * @param owner
     *        The owner of the remote repository that contains the job artifacts.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the remote repository that contains the job artifacts.
     * </p>
     * 
     * @return The owner of the remote repository that contains the job artifacts.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the remote repository that contains the job artifacts.
     * </p>
     * 
     * @param owner
     *        The owner of the remote repository that contains the job artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceControlDetails withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * An optional branch in the remote repository.
     * </p>
     * 
     * @param branch
     *        An optional branch in the remote repository.
     */

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * An optional branch in the remote repository.
     * </p>
     * 
     * @return An optional branch in the remote repository.
     */

    public String getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * An optional branch in the remote repository.
     * </p>
     * 
     * @param branch
     *        An optional branch in the remote repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceControlDetails withBranch(String branch) {
        setBranch(branch);
        return this;
    }

    /**
     * <p>
     * An optional folder in the remote repository.
     * </p>
     * 
     * @param folder
     *        An optional folder in the remote repository.
     */

    public void setFolder(String folder) {
        this.folder = folder;
    }

    /**
     * <p>
     * An optional folder in the remote repository.
     * </p>
     * 
     * @return An optional folder in the remote repository.
     */

    public String getFolder() {
        return this.folder;
    }

    /**
     * <p>
     * An optional folder in the remote repository.
     * </p>
     * 
     * @param folder
     *        An optional folder in the remote repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceControlDetails withFolder(String folder) {
        setFolder(folder);
        return this;
    }

    /**
     * <p>
     * The last commit ID for a commit in the remote repository.
     * </p>
     * 
     * @param lastCommitId
     *        The last commit ID for a commit in the remote repository.
     */

    public void setLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
    }

    /**
     * <p>
     * The last commit ID for a commit in the remote repository.
     * </p>
     * 
     * @return The last commit ID for a commit in the remote repository.
     */

    public String getLastCommitId() {
        return this.lastCommitId;
    }

    /**
     * <p>
     * The last commit ID for a commit in the remote repository.
     * </p>
     * 
     * @param lastCommitId
     *        The last commit ID for a commit in the remote repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceControlDetails withLastCommitId(String lastCommitId) {
        setLastCommitId(lastCommitId);
        return this;
    }

    /**
     * <p>
     * The type of authentication, which can be an authentication token stored in Amazon Web Services Secrets Manager,
     * or a personal access token.
     * </p>
     * 
     * @param authStrategy
     *        The type of authentication, which can be an authentication token stored in Amazon Web Services Secrets
     *        Manager, or a personal access token.
     * @see SourceControlAuthStrategy
     */

    public void setAuthStrategy(String authStrategy) {
        this.authStrategy = authStrategy;
    }

    /**
     * <p>
     * The type of authentication, which can be an authentication token stored in Amazon Web Services Secrets Manager,
     * or a personal access token.
     * </p>
     * 
     * @return The type of authentication, which can be an authentication token stored in Amazon Web Services Secrets
     *         Manager, or a personal access token.
     * @see SourceControlAuthStrategy
     */

    public String getAuthStrategy() {
        return this.authStrategy;
    }

    /**
     * <p>
     * The type of authentication, which can be an authentication token stored in Amazon Web Services Secrets Manager,
     * or a personal access token.
     * </p>
     * 
     * @param authStrategy
     *        The type of authentication, which can be an authentication token stored in Amazon Web Services Secrets
     *        Manager, or a personal access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceControlAuthStrategy
     */

    public SourceControlDetails withAuthStrategy(String authStrategy) {
        setAuthStrategy(authStrategy);
        return this;
    }

    /**
     * <p>
     * The type of authentication, which can be an authentication token stored in Amazon Web Services Secrets Manager,
     * or a personal access token.
     * </p>
     * 
     * @param authStrategy
     *        The type of authentication, which can be an authentication token stored in Amazon Web Services Secrets
     *        Manager, or a personal access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceControlAuthStrategy
     */

    public SourceControlDetails withAuthStrategy(SourceControlAuthStrategy authStrategy) {
        this.authStrategy = authStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The value of an authorization token.
     * </p>
     * 
     * @param authToken
     *        The value of an authorization token.
     */

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * <p>
     * The value of an authorization token.
     * </p>
     * 
     * @return The value of an authorization token.
     */

    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * <p>
     * The value of an authorization token.
     * </p>
     * 
     * @param authToken
     *        The value of an authorization token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceControlDetails withAuthToken(String authToken) {
        setAuthToken(authToken);
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
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getBranch() != null)
            sb.append("Branch: ").append(getBranch()).append(",");
        if (getFolder() != null)
            sb.append("Folder: ").append(getFolder()).append(",");
        if (getLastCommitId() != null)
            sb.append("LastCommitId: ").append(getLastCommitId()).append(",");
        if (getAuthStrategy() != null)
            sb.append("AuthStrategy: ").append(getAuthStrategy()).append(",");
        if (getAuthToken() != null)
            sb.append("AuthToken: ").append(getAuthToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceControlDetails == false)
            return false;
        SourceControlDetails other = (SourceControlDetails) obj;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        if (other.getFolder() == null ^ this.getFolder() == null)
            return false;
        if (other.getFolder() != null && other.getFolder().equals(this.getFolder()) == false)
            return false;
        if (other.getLastCommitId() == null ^ this.getLastCommitId() == null)
            return false;
        if (other.getLastCommitId() != null && other.getLastCommitId().equals(this.getLastCommitId()) == false)
            return false;
        if (other.getAuthStrategy() == null ^ this.getAuthStrategy() == null)
            return false;
        if (other.getAuthStrategy() != null && other.getAuthStrategy().equals(this.getAuthStrategy()) == false)
            return false;
        if (other.getAuthToken() == null ^ this.getAuthToken() == null)
            return false;
        if (other.getAuthToken() != null && other.getAuthToken().equals(this.getAuthToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        hashCode = prime * hashCode + ((getFolder() == null) ? 0 : getFolder().hashCode());
        hashCode = prime * hashCode + ((getLastCommitId() == null) ? 0 : getLastCommitId().hashCode());
        hashCode = prime * hashCode + ((getAuthStrategy() == null) ? 0 : getAuthStrategy().hashCode());
        hashCode = prime * hashCode + ((getAuthToken() == null) ? 0 : getAuthToken().hashCode());
        return hashCode;
    }

    @Override
    public SourceControlDetails clone() {
        try {
            return (SourceControlDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SourceControlDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
