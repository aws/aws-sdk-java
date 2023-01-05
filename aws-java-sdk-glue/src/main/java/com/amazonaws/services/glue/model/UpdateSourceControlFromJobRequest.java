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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateSourceControlFromJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSourceControlFromJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Glue job to be synchronized to or from the remote repository.
     * </p>
     */
    private String jobName;
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
    private String repositoryName;
    /**
     * <p>
     * The owner of the remote repository that contains the job artifacts.
     * </p>
     */
    private String repositoryOwner;
    /**
     * <p>
     * An optional branch in the remote repository.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * An optional folder in the remote repository.
     * </p>
     */
    private String folder;
    /**
     * <p>
     * A commit ID for a commit in the remote repository.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * The type of authentication, which can be an authentication token stored in Amazon Web Services Secrets Manager,
     * or a personal access token.
     * </p>
     */
    private String authStrategy;
    /**
     * <p>
     * The value of the authorization token.
     * </p>
     */
    private String authToken;

    /**
     * <p>
     * The name of the Glue job to be synchronized to or from the remote repository.
     * </p>
     * 
     * @param jobName
     *        The name of the Glue job to be synchronized to or from the remote repository.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the Glue job to be synchronized to or from the remote repository.
     * </p>
     * 
     * @return The name of the Glue job to be synchronized to or from the remote repository.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the Glue job to be synchronized to or from the remote repository.
     * </p>
     * 
     * @param jobName
     *        The name of the Glue job to be synchronized to or from the remote repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceControlFromJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

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

    public UpdateSourceControlFromJobRequest withProvider(String provider) {
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

    public UpdateSourceControlFromJobRequest withProvider(SourceControlProvider provider) {
        this.provider = provider.toString();
        return this;
    }

    /**
     * <p>
     * The name of the remote repository that contains the job artifacts.
     * </p>
     * 
     * @param repositoryName
     *        The name of the remote repository that contains the job artifacts.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the remote repository that contains the job artifacts.
     * </p>
     * 
     * @return The name of the remote repository that contains the job artifacts.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the remote repository that contains the job artifacts.
     * </p>
     * 
     * @param repositoryName
     *        The name of the remote repository that contains the job artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceControlFromJobRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The owner of the remote repository that contains the job artifacts.
     * </p>
     * 
     * @param repositoryOwner
     *        The owner of the remote repository that contains the job artifacts.
     */

    public void setRepositoryOwner(String repositoryOwner) {
        this.repositoryOwner = repositoryOwner;
    }

    /**
     * <p>
     * The owner of the remote repository that contains the job artifacts.
     * </p>
     * 
     * @return The owner of the remote repository that contains the job artifacts.
     */

    public String getRepositoryOwner() {
        return this.repositoryOwner;
    }

    /**
     * <p>
     * The owner of the remote repository that contains the job artifacts.
     * </p>
     * 
     * @param repositoryOwner
     *        The owner of the remote repository that contains the job artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceControlFromJobRequest withRepositoryOwner(String repositoryOwner) {
        setRepositoryOwner(repositoryOwner);
        return this;
    }

    /**
     * <p>
     * An optional branch in the remote repository.
     * </p>
     * 
     * @param branchName
     *        An optional branch in the remote repository.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * An optional branch in the remote repository.
     * </p>
     * 
     * @return An optional branch in the remote repository.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * An optional branch in the remote repository.
     * </p>
     * 
     * @param branchName
     *        An optional branch in the remote repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceControlFromJobRequest withBranchName(String branchName) {
        setBranchName(branchName);
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

    public UpdateSourceControlFromJobRequest withFolder(String folder) {
        setFolder(folder);
        return this;
    }

    /**
     * <p>
     * A commit ID for a commit in the remote repository.
     * </p>
     * 
     * @param commitId
     *        A commit ID for a commit in the remote repository.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * A commit ID for a commit in the remote repository.
     * </p>
     * 
     * @return A commit ID for a commit in the remote repository.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * A commit ID for a commit in the remote repository.
     * </p>
     * 
     * @param commitId
     *        A commit ID for a commit in the remote repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceControlFromJobRequest withCommitId(String commitId) {
        setCommitId(commitId);
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

    public UpdateSourceControlFromJobRequest withAuthStrategy(String authStrategy) {
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

    public UpdateSourceControlFromJobRequest withAuthStrategy(SourceControlAuthStrategy authStrategy) {
        this.authStrategy = authStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The value of the authorization token.
     * </p>
     * 
     * @param authToken
     *        The value of the authorization token.
     */

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * <p>
     * The value of the authorization token.
     * </p>
     * 
     * @return The value of the authorization token.
     */

    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * <p>
     * The value of the authorization token.
     * </p>
     * 
     * @param authToken
     *        The value of the authorization token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceControlFromJobRequest withAuthToken(String authToken) {
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getRepositoryOwner() != null)
            sb.append("RepositoryOwner: ").append(getRepositoryOwner()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getFolder() != null)
            sb.append("Folder: ").append(getFolder()).append(",");
        if (getCommitId() != null)
            sb.append("CommitId: ").append(getCommitId()).append(",");
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

        if (obj instanceof UpdateSourceControlFromJobRequest == false)
            return false;
        UpdateSourceControlFromJobRequest other = (UpdateSourceControlFromJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getRepositoryOwner() == null ^ this.getRepositoryOwner() == null)
            return false;
        if (other.getRepositoryOwner() != null && other.getRepositoryOwner().equals(this.getRepositoryOwner()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getFolder() == null ^ this.getFolder() == null)
            return false;
        if (other.getFolder() != null && other.getFolder().equals(this.getFolder()) == false)
            return false;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
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

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryOwner() == null) ? 0 : getRepositoryOwner().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getFolder() == null) ? 0 : getFolder().hashCode());
        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getAuthStrategy() == null) ? 0 : getAuthStrategy().hashCode());
        hashCode = prime * hashCode + ((getAuthToken() == null) ? 0 : getAuthToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSourceControlFromJobRequest clone() {
        return (UpdateSourceControlFromJobRequest) super.clone();
    }

}
