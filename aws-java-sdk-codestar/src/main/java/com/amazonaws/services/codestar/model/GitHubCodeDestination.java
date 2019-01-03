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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files provided
 * with the project request will be uploaded after project creation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/GitHubCodeDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GitHubCodeDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the GitHub repository to be created in AWS CodeStar.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Description for the GitHub repository to be created in AWS CodeStar. This description displays in GitHub after
     * the repository is created.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of GitHub repository to be created in AWS CodeStar. Valid values are User or Organization.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The GitHub username for the owner of the GitHub repository to be created in AWS CodeStar. If this repository
     * should be owned by a GitHub organization, provide its name.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * Whether the GitHub repository is to be a private repository.
     * </p>
     */
    private Boolean privateRepository;
    /**
     * <p>
     * Whether to enable issues for the GitHub repository.
     * </p>
     */
    private Boolean issuesEnabled;
    /**
     * <p>
     * The GitHub user's personal access token for the GitHub repository.
     * </p>
     */
    private String token;

    /**
     * <p>
     * Name of the GitHub repository to be created in AWS CodeStar.
     * </p>
     * 
     * @param name
     *        Name of the GitHub repository to be created in AWS CodeStar.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the GitHub repository to be created in AWS CodeStar.
     * </p>
     * 
     * @return Name of the GitHub repository to be created in AWS CodeStar.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the GitHub repository to be created in AWS CodeStar.
     * </p>
     * 
     * @param name
     *        Name of the GitHub repository to be created in AWS CodeStar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubCodeDestination withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Description for the GitHub repository to be created in AWS CodeStar. This description displays in GitHub after
     * the repository is created.
     * </p>
     * 
     * @param description
     *        Description for the GitHub repository to be created in AWS CodeStar. This description displays in GitHub
     *        after the repository is created.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description for the GitHub repository to be created in AWS CodeStar. This description displays in GitHub after
     * the repository is created.
     * </p>
     * 
     * @return Description for the GitHub repository to be created in AWS CodeStar. This description displays in GitHub
     *         after the repository is created.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description for the GitHub repository to be created in AWS CodeStar. This description displays in GitHub after
     * the repository is created.
     * </p>
     * 
     * @param description
     *        Description for the GitHub repository to be created in AWS CodeStar. This description displays in GitHub
     *        after the repository is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubCodeDestination withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of GitHub repository to be created in AWS CodeStar. Valid values are User or Organization.
     * </p>
     * 
     * @param type
     *        The type of GitHub repository to be created in AWS CodeStar. Valid values are User or Organization.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of GitHub repository to be created in AWS CodeStar. Valid values are User or Organization.
     * </p>
     * 
     * @return The type of GitHub repository to be created in AWS CodeStar. Valid values are User or Organization.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of GitHub repository to be created in AWS CodeStar. Valid values are User or Organization.
     * </p>
     * 
     * @param type
     *        The type of GitHub repository to be created in AWS CodeStar. Valid values are User or Organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubCodeDestination withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The GitHub username for the owner of the GitHub repository to be created in AWS CodeStar. If this repository
     * should be owned by a GitHub organization, provide its name.
     * </p>
     * 
     * @param owner
     *        The GitHub username for the owner of the GitHub repository to be created in AWS CodeStar. If this
     *        repository should be owned by a GitHub organization, provide its name.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The GitHub username for the owner of the GitHub repository to be created in AWS CodeStar. If this repository
     * should be owned by a GitHub organization, provide its name.
     * </p>
     * 
     * @return The GitHub username for the owner of the GitHub repository to be created in AWS CodeStar. If this
     *         repository should be owned by a GitHub organization, provide its name.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The GitHub username for the owner of the GitHub repository to be created in AWS CodeStar. If this repository
     * should be owned by a GitHub organization, provide its name.
     * </p>
     * 
     * @param owner
     *        The GitHub username for the owner of the GitHub repository to be created in AWS CodeStar. If this
     *        repository should be owned by a GitHub organization, provide its name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubCodeDestination withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * Whether the GitHub repository is to be a private repository.
     * </p>
     * 
     * @param privateRepository
     *        Whether the GitHub repository is to be a private repository.
     */

    public void setPrivateRepository(Boolean privateRepository) {
        this.privateRepository = privateRepository;
    }

    /**
     * <p>
     * Whether the GitHub repository is to be a private repository.
     * </p>
     * 
     * @return Whether the GitHub repository is to be a private repository.
     */

    public Boolean getPrivateRepository() {
        return this.privateRepository;
    }

    /**
     * <p>
     * Whether the GitHub repository is to be a private repository.
     * </p>
     * 
     * @param privateRepository
     *        Whether the GitHub repository is to be a private repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubCodeDestination withPrivateRepository(Boolean privateRepository) {
        setPrivateRepository(privateRepository);
        return this;
    }

    /**
     * <p>
     * Whether the GitHub repository is to be a private repository.
     * </p>
     * 
     * @return Whether the GitHub repository is to be a private repository.
     */

    public Boolean isPrivateRepository() {
        return this.privateRepository;
    }

    /**
     * <p>
     * Whether to enable issues for the GitHub repository.
     * </p>
     * 
     * @param issuesEnabled
     *        Whether to enable issues for the GitHub repository.
     */

    public void setIssuesEnabled(Boolean issuesEnabled) {
        this.issuesEnabled = issuesEnabled;
    }

    /**
     * <p>
     * Whether to enable issues for the GitHub repository.
     * </p>
     * 
     * @return Whether to enable issues for the GitHub repository.
     */

    public Boolean getIssuesEnabled() {
        return this.issuesEnabled;
    }

    /**
     * <p>
     * Whether to enable issues for the GitHub repository.
     * </p>
     * 
     * @param issuesEnabled
     *        Whether to enable issues for the GitHub repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubCodeDestination withIssuesEnabled(Boolean issuesEnabled) {
        setIssuesEnabled(issuesEnabled);
        return this;
    }

    /**
     * <p>
     * Whether to enable issues for the GitHub repository.
     * </p>
     * 
     * @return Whether to enable issues for the GitHub repository.
     */

    public Boolean issuesEnabled() {
        return this.issuesEnabled;
    }

    /**
     * <p>
     * The GitHub user's personal access token for the GitHub repository.
     * </p>
     * 
     * @param token
     *        The GitHub user's personal access token for the GitHub repository.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The GitHub user's personal access token for the GitHub repository.
     * </p>
     * 
     * @return The GitHub user's personal access token for the GitHub repository.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * The GitHub user's personal access token for the GitHub repository.
     * </p>
     * 
     * @param token
     *        The GitHub user's personal access token for the GitHub repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubCodeDestination withToken(String token) {
        setToken(token);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getPrivateRepository() != null)
            sb.append("PrivateRepository: ").append(getPrivateRepository()).append(",");
        if (getIssuesEnabled() != null)
            sb.append("IssuesEnabled: ").append(getIssuesEnabled()).append(",");
        if (getToken() != null)
            sb.append("Token: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GitHubCodeDestination == false)
            return false;
        GitHubCodeDestination other = (GitHubCodeDestination) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getPrivateRepository() == null ^ this.getPrivateRepository() == null)
            return false;
        if (other.getPrivateRepository() != null && other.getPrivateRepository().equals(this.getPrivateRepository()) == false)
            return false;
        if (other.getIssuesEnabled() == null ^ this.getIssuesEnabled() == null)
            return false;
        if (other.getIssuesEnabled() != null && other.getIssuesEnabled().equals(this.getIssuesEnabled()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getPrivateRepository() == null) ? 0 : getPrivateRepository().hashCode());
        hashCode = prime * hashCode + ((getIssuesEnabled() == null) ? 0 : getIssuesEnabled().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public GitHubCodeDestination clone() {
        try {
            return (GitHubCodeDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestar.model.transform.GitHubCodeDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
