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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListProtectedResourcesByBackupVault"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProtectedResourcesByBackupVaultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is the list of protected resources by backup vault within the vault(s) you specify by name.
     * </p>
     */
    private String backupVaultName;
    /**
     * <p>
     * This is the list of protected resources by backup vault within the vault(s) you specify by account ID.
     * </p>
     */
    private String backupVaultAccountId;
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
     * This is the list of protected resources by backup vault within the vault(s) you specify by name.
     * </p>
     * 
     * @param backupVaultName
     *        This is the list of protected resources by backup vault within the vault(s) you specify by name.
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * This is the list of protected resources by backup vault within the vault(s) you specify by name.
     * </p>
     * 
     * @return This is the list of protected resources by backup vault within the vault(s) you specify by name.
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * This is the list of protected resources by backup vault within the vault(s) you specify by name.
     * </p>
     * 
     * @param backupVaultName
     *        This is the list of protected resources by backup vault within the vault(s) you specify by name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectedResourcesByBackupVaultRequest withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * This is the list of protected resources by backup vault within the vault(s) you specify by account ID.
     * </p>
     * 
     * @param backupVaultAccountId
     *        This is the list of protected resources by backup vault within the vault(s) you specify by account ID.
     */

    public void setBackupVaultAccountId(String backupVaultAccountId) {
        this.backupVaultAccountId = backupVaultAccountId;
    }

    /**
     * <p>
     * This is the list of protected resources by backup vault within the vault(s) you specify by account ID.
     * </p>
     * 
     * @return This is the list of protected resources by backup vault within the vault(s) you specify by account ID.
     */

    public String getBackupVaultAccountId() {
        return this.backupVaultAccountId;
    }

    /**
     * <p>
     * This is the list of protected resources by backup vault within the vault(s) you specify by account ID.
     * </p>
     * 
     * @param backupVaultAccountId
     *        This is the list of protected resources by backup vault within the vault(s) you specify by account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectedResourcesByBackupVaultRequest withBackupVaultAccountId(String backupVaultAccountId) {
        setBackupVaultAccountId(backupVaultAccountId);
        return this;
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

    public ListProtectedResourcesByBackupVaultRequest withNextToken(String nextToken) {
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

    public ListProtectedResourcesByBackupVaultRequest withMaxResults(Integer maxResults) {
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
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: ").append(getBackupVaultName()).append(",");
        if (getBackupVaultAccountId() != null)
            sb.append("BackupVaultAccountId: ").append(getBackupVaultAccountId()).append(",");
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

        if (obj instanceof ListProtectedResourcesByBackupVaultRequest == false)
            return false;
        ListProtectedResourcesByBackupVaultRequest other = (ListProtectedResourcesByBackupVaultRequest) obj;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getBackupVaultAccountId() == null ^ this.getBackupVaultAccountId() == null)
            return false;
        if (other.getBackupVaultAccountId() != null && other.getBackupVaultAccountId().equals(this.getBackupVaultAccountId()) == false)
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

        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getBackupVaultAccountId() == null) ? 0 : getBackupVaultAccountId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListProtectedResourcesByBackupVaultRequest clone() {
        return (ListProtectedResourcesByBackupVaultRequest) super.clone();
    }

}
