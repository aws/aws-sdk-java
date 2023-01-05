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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListRepositorySyncDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRepositorySyncDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token that indicates the location of the next repository sync definition in the array of repository sync
     * definitions, after the list of repository sync definitions previously requested.
     * </p>
     */
    private String nextToken;
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
     * The sync type. The only supported value is <code>TEMPLATE_SYNC</code>.
     * </p>
     */
    private String syncType;

    /**
     * <p>
     * A token that indicates the location of the next repository sync definition in the array of repository sync
     * definitions, after the list of repository sync definitions previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next repository sync definition in the array of repository sync
     *        definitions, after the list of repository sync definitions previously requested.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next repository sync definition in the array of repository sync
     * definitions, after the list of repository sync definitions previously requested.
     * </p>
     * 
     * @return A token that indicates the location of the next repository sync definition in the array of repository
     *         sync definitions, after the list of repository sync definitions previously requested.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next repository sync definition in the array of repository sync
     * definitions, after the list of repository sync definitions previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next repository sync definition in the array of repository sync
     *        definitions, after the list of repository sync definitions previously requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositorySyncDefinitionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public ListRepositorySyncDefinitionsRequest withRepositoryName(String repositoryName) {
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

    public ListRepositorySyncDefinitionsRequest withRepositoryProvider(String repositoryProvider) {
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

    public ListRepositorySyncDefinitionsRequest withRepositoryProvider(RepositoryProvider repositoryProvider) {
        this.repositoryProvider = repositoryProvider.toString();
        return this;
    }

    /**
     * <p>
     * The sync type. The only supported value is <code>TEMPLATE_SYNC</code>.
     * </p>
     * 
     * @param syncType
     *        The sync type. The only supported value is <code>TEMPLATE_SYNC</code>.
     * @see SyncType
     */

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>
     * The sync type. The only supported value is <code>TEMPLATE_SYNC</code>.
     * </p>
     * 
     * @return The sync type. The only supported value is <code>TEMPLATE_SYNC</code>.
     * @see SyncType
     */

    public String getSyncType() {
        return this.syncType;
    }

    /**
     * <p>
     * The sync type. The only supported value is <code>TEMPLATE_SYNC</code>.
     * </p>
     * 
     * @param syncType
     *        The sync type. The only supported value is <code>TEMPLATE_SYNC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncType
     */

    public ListRepositorySyncDefinitionsRequest withSyncType(String syncType) {
        setSyncType(syncType);
        return this;
    }

    /**
     * <p>
     * The sync type. The only supported value is <code>TEMPLATE_SYNC</code>.
     * </p>
     * 
     * @param syncType
     *        The sync type. The only supported value is <code>TEMPLATE_SYNC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncType
     */

    public ListRepositorySyncDefinitionsRequest withSyncType(SyncType syncType) {
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof ListRepositorySyncDefinitionsRequest == false)
            return false;
        ListRepositorySyncDefinitionsRequest other = (ListRepositorySyncDefinitionsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryProvider() == null) ? 0 : getRepositoryProvider().hashCode());
        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        return hashCode;
    }

    @Override
    public ListRepositorySyncDefinitionsRequest clone() {
        return (ListRepositorySyncDefinitionsRequest) super.clone();
    }

}
