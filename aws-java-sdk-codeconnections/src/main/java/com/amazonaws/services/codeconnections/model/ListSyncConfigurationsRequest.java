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
package com.amazonaws.services.codeconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/ListSyncConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSyncConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of the operation.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the repository link for the requested list of sync configurations.
     * </p>
     */
    private String repositoryLinkId;
    /**
     * <p>
     * The sync type for the requested list of sync configurations.
     * </p>
     */
    private String syncType;

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @param maxResults
     *        A non-zero, non-negative integer used to limit the number of returned results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @return A non-zero, non-negative integer used to limit the number of returned results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @param maxResults
     *        A non-zero, non-negative integer used to limit the number of returned results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncConfigurationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of the operation.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the results of the operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of the operation.
     * </p>
     * 
     * @return An enumeration token that allows the operation to batch the results of the operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results of the operation.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the results of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncConfigurationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the repository link for the requested list of sync configurations.
     * </p>
     * 
     * @param repositoryLinkId
     *        The ID of the repository link for the requested list of sync configurations.
     */

    public void setRepositoryLinkId(String repositoryLinkId) {
        this.repositoryLinkId = repositoryLinkId;
    }

    /**
     * <p>
     * The ID of the repository link for the requested list of sync configurations.
     * </p>
     * 
     * @return The ID of the repository link for the requested list of sync configurations.
     */

    public String getRepositoryLinkId() {
        return this.repositoryLinkId;
    }

    /**
     * <p>
     * The ID of the repository link for the requested list of sync configurations.
     * </p>
     * 
     * @param repositoryLinkId
     *        The ID of the repository link for the requested list of sync configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncConfigurationsRequest withRepositoryLinkId(String repositoryLinkId) {
        setRepositoryLinkId(repositoryLinkId);
        return this;
    }

    /**
     * <p>
     * The sync type for the requested list of sync configurations.
     * </p>
     * 
     * @param syncType
     *        The sync type for the requested list of sync configurations.
     * @see SyncConfigurationType
     */

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>
     * The sync type for the requested list of sync configurations.
     * </p>
     * 
     * @return The sync type for the requested list of sync configurations.
     * @see SyncConfigurationType
     */

    public String getSyncType() {
        return this.syncType;
    }

    /**
     * <p>
     * The sync type for the requested list of sync configurations.
     * </p>
     * 
     * @param syncType
     *        The sync type for the requested list of sync configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncConfigurationType
     */

    public ListSyncConfigurationsRequest withSyncType(String syncType) {
        setSyncType(syncType);
        return this;
    }

    /**
     * <p>
     * The sync type for the requested list of sync configurations.
     * </p>
     * 
     * @param syncType
     *        The sync type for the requested list of sync configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncConfigurationType
     */

    public ListSyncConfigurationsRequest withSyncType(SyncConfigurationType syncType) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof ListSyncConfigurationsRequest == false)
            return false;
        ListSyncConfigurationsRequest other = (ListSyncConfigurationsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRepositoryLinkId() == null) ? 0 : getRepositoryLinkId().hashCode());
        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        return hashCode;
    }

    @Override
    public ListSyncConfigurationsRequest clone() {
        return (ListSyncConfigurationsRequest) super.clone();
    }

}
