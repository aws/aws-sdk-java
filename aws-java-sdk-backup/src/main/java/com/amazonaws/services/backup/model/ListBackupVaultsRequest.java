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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupVaults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackupVaultsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This parameter will sort the list of vaults by vault type.
     * </p>
     */
    private String byVaultType;
    /**
     * <p>
     * This parameter will sort the list of vaults by shared vaults.
     * </p>
     */
    private Boolean byShared;
    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * This parameter will sort the list of vaults by vault type.
     * </p>
     * 
     * @param byVaultType
     *        This parameter will sort the list of vaults by vault type.
     * @see VaultType
     */

    public void setByVaultType(String byVaultType) {
        this.byVaultType = byVaultType;
    }

    /**
     * <p>
     * This parameter will sort the list of vaults by vault type.
     * </p>
     * 
     * @return This parameter will sort the list of vaults by vault type.
     * @see VaultType
     */

    public String getByVaultType() {
        return this.byVaultType;
    }

    /**
     * <p>
     * This parameter will sort the list of vaults by vault type.
     * </p>
     * 
     * @param byVaultType
     *        This parameter will sort the list of vaults by vault type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VaultType
     */

    public ListBackupVaultsRequest withByVaultType(String byVaultType) {
        setByVaultType(byVaultType);
        return this;
    }

    /**
     * <p>
     * This parameter will sort the list of vaults by vault type.
     * </p>
     * 
     * @param byVaultType
     *        This parameter will sort the list of vaults by vault type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VaultType
     */

    public ListBackupVaultsRequest withByVaultType(VaultType byVaultType) {
        this.byVaultType = byVaultType.toString();
        return this;
    }

    /**
     * <p>
     * This parameter will sort the list of vaults by shared vaults.
     * </p>
     * 
     * @param byShared
     *        This parameter will sort the list of vaults by shared vaults.
     */

    public void setByShared(Boolean byShared) {
        this.byShared = byShared;
    }

    /**
     * <p>
     * This parameter will sort the list of vaults by shared vaults.
     * </p>
     * 
     * @return This parameter will sort the list of vaults by shared vaults.
     */

    public Boolean getByShared() {
        return this.byShared;
    }

    /**
     * <p>
     * This parameter will sort the list of vaults by shared vaults.
     * </p>
     * 
     * @param byShared
     *        This parameter will sort the list of vaults by shared vaults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupVaultsRequest withByShared(Boolean byShared) {
        setByShared(byShared);
        return this;
    }

    /**
     * <p>
     * This parameter will sort the list of vaults by shared vaults.
     * </p>
     * 
     * @return This parameter will sort the list of vaults by shared vaults.
     */

    public Boolean isByShared() {
        return this.byShared;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned items. For example, if a request is made to return
     *         <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *         list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupVaultsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to be returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * 
     * @return The maximum number of items to be returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupVaultsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getByVaultType() != null)
            sb.append("ByVaultType: ").append(getByVaultType()).append(",");
        if (getByShared() != null)
            sb.append("ByShared: ").append(getByShared()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackupVaultsRequest == false)
            return false;
        ListBackupVaultsRequest other = (ListBackupVaultsRequest) obj;
        if (other.getByVaultType() == null ^ this.getByVaultType() == null)
            return false;
        if (other.getByVaultType() != null && other.getByVaultType().equals(this.getByVaultType()) == false)
            return false;
        if (other.getByShared() == null ^ this.getByShared() == null)
            return false;
        if (other.getByShared() != null && other.getByShared().equals(this.getByShared()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getByVaultType() == null) ? 0 : getByVaultType().hashCode());
        hashCode = prime * hashCode + ((getByShared() == null) ? 0 : getByShared().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListBackupVaultsRequest clone() {
        return (ListBackupVaultsRequest) super.clone();
    }

}
