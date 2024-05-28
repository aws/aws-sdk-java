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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetRepositorySyncStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRepositorySyncStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The branch of the repository link for the requested repository sync status.
     * </p>
     */
    private String branch;
    /**
     * <p>
     * The repository link ID for the requested repository sync status.
     * </p>
     */
    private String repositoryLinkId;
    /**
     * <p>
     * The sync type of the requested sync status.
     * </p>
     */
    private String syncType;

    /**
     * <p>
     * The branch of the repository link for the requested repository sync status.
     * </p>
     * 
     * @param branch
     *        The branch of the repository link for the requested repository sync status.
     */

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The branch of the repository link for the requested repository sync status.
     * </p>
     * 
     * @return The branch of the repository link for the requested repository sync status.
     */

    public String getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * The branch of the repository link for the requested repository sync status.
     * </p>
     * 
     * @param branch
     *        The branch of the repository link for the requested repository sync status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRepositorySyncStatusRequest withBranch(String branch) {
        setBranch(branch);
        return this;
    }

    /**
     * <p>
     * The repository link ID for the requested repository sync status.
     * </p>
     * 
     * @param repositoryLinkId
     *        The repository link ID for the requested repository sync status.
     */

    public void setRepositoryLinkId(String repositoryLinkId) {
        this.repositoryLinkId = repositoryLinkId;
    }

    /**
     * <p>
     * The repository link ID for the requested repository sync status.
     * </p>
     * 
     * @return The repository link ID for the requested repository sync status.
     */

    public String getRepositoryLinkId() {
        return this.repositoryLinkId;
    }

    /**
     * <p>
     * The repository link ID for the requested repository sync status.
     * </p>
     * 
     * @param repositoryLinkId
     *        The repository link ID for the requested repository sync status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRepositorySyncStatusRequest withRepositoryLinkId(String repositoryLinkId) {
        setRepositoryLinkId(repositoryLinkId);
        return this;
    }

    /**
     * <p>
     * The sync type of the requested sync status.
     * </p>
     * 
     * @param syncType
     *        The sync type of the requested sync status.
     * @see SyncConfigurationType
     */

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>
     * The sync type of the requested sync status.
     * </p>
     * 
     * @return The sync type of the requested sync status.
     * @see SyncConfigurationType
     */

    public String getSyncType() {
        return this.syncType;
    }

    /**
     * <p>
     * The sync type of the requested sync status.
     * </p>
     * 
     * @param syncType
     *        The sync type of the requested sync status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncConfigurationType
     */

    public GetRepositorySyncStatusRequest withSyncType(String syncType) {
        setSyncType(syncType);
        return this;
    }

    /**
     * <p>
     * The sync type of the requested sync status.
     * </p>
     * 
     * @param syncType
     *        The sync type of the requested sync status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncConfigurationType
     */

    public GetRepositorySyncStatusRequest withSyncType(SyncConfigurationType syncType) {
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
        if (getRepositoryLinkId() != null)
            sb.append("RepositoryLinkId: ").append(getRepositoryLinkId()).append(",");
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
        if (other.getRepositoryLinkId() == null ^ this.getRepositoryLinkId() == null)
            return false;
        if (other.getRepositoryLinkId() != null && other.getRepositoryLinkId().equals(this.getRepositoryLinkId()) == false)
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
        hashCode = prime * hashCode + ((getRepositoryLinkId() == null) ? 0 : getRepositoryLinkId().hashCode());
        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        return hashCode;
    }

    @Override
    public GetRepositorySyncStatusRequest clone() {
        return (GetRepositorySyncStatusRequest) super.clone();
    }

}
