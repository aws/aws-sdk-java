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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetRepositorySyncStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRepositorySyncStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The repository branch.
     * </p>
     */
    private String branch;
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
     * The repository sync type.
     * </p>
     */
    private String syncType;

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

    public GetRepositorySyncStatusRequest withBranch(String branch) {
        setBranch(branch);
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

    public GetRepositorySyncStatusRequest withRepositoryName(String repositoryName) {
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

    public GetRepositorySyncStatusRequest withRepositoryProvider(String repositoryProvider) {
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

    public GetRepositorySyncStatusRequest withRepositoryProvider(RepositoryProvider repositoryProvider) {
        this.repositoryProvider = repositoryProvider.toString();
        return this;
    }

    /**
     * <p>
     * The repository sync type.
     * </p>
     * 
     * @param syncType
     *        The repository sync type.
     * @see SyncType
     */

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>
     * The repository sync type.
     * </p>
     * 
     * @return The repository sync type.
     * @see SyncType
     */

    public String getSyncType() {
        return this.syncType;
    }

    /**
     * <p>
     * The repository sync type.
     * </p>
     * 
     * @param syncType
     *        The repository sync type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncType
     */

    public GetRepositorySyncStatusRequest withSyncType(String syncType) {
        setSyncType(syncType);
        return this;
    }

    /**
     * <p>
     * The repository sync type.
     * </p>
     * 
     * @param syncType
     *        The repository sync type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncType
     */

    public GetRepositorySyncStatusRequest withSyncType(SyncType syncType) {
        this.syncType = syncType.toString();
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getRepositoryProvider() != null)
            sb.append("RepositoryProvider: ").append(getRepositoryProvider()).append(",");
        if (getSyncType() != null)
            sb.append("SyncType: ").append(getSyncType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRepositorySyncStatusRequest == false)
            return false;
        GetRepositorySyncStatusRequest other = (GetRepositorySyncStatusRequest) obj;
        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getRepositoryProvider() == null ^ this.getRepositoryProvider() == null)
            return false;
        if (other.getRepositoryProvider() != null && other.getRepositoryProvider().equals(this.getRepositoryProvider()) == false)
            return false;
        if (other.getSyncType() == null ^ this.getSyncType() == null)
            return false;
        if (other.getSyncType() != null && other.getSyncType().equals(this.getSyncType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryProvider() == null) ? 0 : getRepositoryProvider().hashCode());
        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        return hashCode;
    }

    @Override
    public GetRepositorySyncStatusRequest clone() {
        return (GetRepositorySyncStatusRequest) super.clone();
    }

}
