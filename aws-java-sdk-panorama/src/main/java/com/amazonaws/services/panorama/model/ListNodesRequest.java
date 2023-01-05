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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListNodes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNodesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Search for nodes by category.
     * </p>
     */
    private String category;
    /**
     * <p>
     * The maximum number of nodes to return in one page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Search for nodes by the account ID of the nodes' owner.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * Search for nodes by name.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * Search for nodes by version.
     * </p>
     */
    private String packageVersion;
    /**
     * <p>
     * Search for nodes by patch version.
     * </p>
     */
    private String patchVersion;

    /**
     * <p>
     * Search for nodes by category.
     * </p>
     * 
     * @param category
     *        Search for nodes by category.
     * @see NodeCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * Search for nodes by category.
     * </p>
     * 
     * @return Search for nodes by category.
     * @see NodeCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * Search for nodes by category.
     * </p>
     * 
     * @param category
     *        Search for nodes by category.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeCategory
     */

    public ListNodesRequest withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * Search for nodes by category.
     * </p>
     * 
     * @param category
     *        Search for nodes by category.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeCategory
     */

    public ListNodesRequest withCategory(NodeCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of nodes to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of nodes to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of nodes to return in one page of results.
     * </p>
     * 
     * @return The maximum number of nodes to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of nodes to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of nodes to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Search for nodes by the account ID of the nodes' owner.
     * </p>
     * 
     * @param ownerAccount
     *        Search for nodes by the account ID of the nodes' owner.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * Search for nodes by the account ID of the nodes' owner.
     * </p>
     * 
     * @return Search for nodes by the account ID of the nodes' owner.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * Search for nodes by the account ID of the nodes' owner.
     * </p>
     * 
     * @param ownerAccount
     *        Search for nodes by the account ID of the nodes' owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodesRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * Search for nodes by name.
     * </p>
     * 
     * @param packageName
     *        Search for nodes by name.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * Search for nodes by name.
     * </p>
     * 
     * @return Search for nodes by name.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * Search for nodes by name.
     * </p>
     * 
     * @param packageName
     *        Search for nodes by name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodesRequest withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * Search for nodes by version.
     * </p>
     * 
     * @param packageVersion
     *        Search for nodes by version.
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * Search for nodes by version.
     * </p>
     * 
     * @return Search for nodes by version.
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * Search for nodes by version.
     * </p>
     * 
     * @param packageVersion
     *        Search for nodes by version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodesRequest withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
        return this;
    }

    /**
     * <p>
     * Search for nodes by patch version.
     * </p>
     * 
     * @param patchVersion
     *        Search for nodes by patch version.
     */

    public void setPatchVersion(String patchVersion) {
        this.patchVersion = patchVersion;
    }

    /**
     * <p>
     * Search for nodes by patch version.
     * </p>
     * 
     * @return Search for nodes by patch version.
     */

    public String getPatchVersion() {
        return this.patchVersion;
    }

    /**
     * <p>
     * Search for nodes by patch version.
     * </p>
     * 
     * @param patchVersion
     *        Search for nodes by patch version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodesRequest withPatchVersion(String patchVersion) {
        setPatchVersion(patchVersion);
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion()).append(",");
        if (getPatchVersion() != null)
            sb.append("PatchVersion: ").append(getPatchVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNodesRequest == false)
            return false;
        ListNodesRequest other = (ListNodesRequest) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        if (other.getPatchVersion() == null ^ this.getPatchVersion() == null)
            return false;
        if (other.getPatchVersion() != null && other.getPatchVersion().equals(this.getPatchVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getPatchVersion() == null) ? 0 : getPatchVersion().hashCode());
        return hashCode;
    }

    @Override
    public ListNodesRequest clone() {
        return (ListNodesRequest) super.clone();
    }

}
