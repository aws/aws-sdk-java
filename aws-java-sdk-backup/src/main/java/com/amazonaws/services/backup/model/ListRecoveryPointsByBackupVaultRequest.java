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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByBackupVault"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecoveryPointsByBackupVaultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     */
    private String backupVaultName;
    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
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
     * Returns only recovery points that match the specified resource Amazon Resource Name (ARN).
     * </p>
     */
    private String byResourceArn;
    /**
     * <p>
     * Returns only recovery points that match the specified resource type.
     * </p>
     */
    private String byResourceType;
    /**
     * <p>
     * Returns only recovery points that match the specified backup plan ID.
     * </p>
     */
    private String byBackupPlanId;
    /**
     * <p>
     * Returns only recovery points that were created before the specified timestamp.
     * </p>
     */
    private java.util.Date byCreatedBefore;
    /**
     * <p>
     * Returns only recovery points that were created after the specified timestamp.
     * </p>
     */
    private java.util.Date byCreatedAfter;

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the AWS Region where they are created. They consist of
     *        lowercase letters, numbers, and hyphens.
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @return The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *         unique to the account used to create them and the AWS Region where they are created. They consist of
     *         lowercase letters, numbers, and hyphens.
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the AWS Region where they are created. They consist of
     *        lowercase letters, numbers, and hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByBackupVaultRequest withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned items. For example, if a request is made to return
     *         <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *         list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByBackupVaultRequest withNextToken(String nextToken) {
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

    public ListRecoveryPointsByBackupVaultRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified resource Amazon Resource Name (ARN).
     * </p>
     * 
     * @param byResourceArn
     *        Returns only recovery points that match the specified resource Amazon Resource Name (ARN).
     */

    public void setByResourceArn(String byResourceArn) {
        this.byResourceArn = byResourceArn;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified resource Amazon Resource Name (ARN).
     * </p>
     * 
     * @return Returns only recovery points that match the specified resource Amazon Resource Name (ARN).
     */

    public String getByResourceArn() {
        return this.byResourceArn;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified resource Amazon Resource Name (ARN).
     * </p>
     * 
     * @param byResourceArn
     *        Returns only recovery points that match the specified resource Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByBackupVaultRequest withByResourceArn(String byResourceArn) {
        setByResourceArn(byResourceArn);
        return this;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified resource type.
     * </p>
     * 
     * @param byResourceType
     *        Returns only recovery points that match the specified resource type.
     */

    public void setByResourceType(String byResourceType) {
        this.byResourceType = byResourceType;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified resource type.
     * </p>
     * 
     * @return Returns only recovery points that match the specified resource type.
     */

    public String getByResourceType() {
        return this.byResourceType;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified resource type.
     * </p>
     * 
     * @param byResourceType
     *        Returns only recovery points that match the specified resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByBackupVaultRequest withByResourceType(String byResourceType) {
        setByResourceType(byResourceType);
        return this;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified backup plan ID.
     * </p>
     * 
     * @param byBackupPlanId
     *        Returns only recovery points that match the specified backup plan ID.
     */

    public void setByBackupPlanId(String byBackupPlanId) {
        this.byBackupPlanId = byBackupPlanId;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified backup plan ID.
     * </p>
     * 
     * @return Returns only recovery points that match the specified backup plan ID.
     */

    public String getByBackupPlanId() {
        return this.byBackupPlanId;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified backup plan ID.
     * </p>
     * 
     * @param byBackupPlanId
     *        Returns only recovery points that match the specified backup plan ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByBackupVaultRequest withByBackupPlanId(String byBackupPlanId) {
        setByBackupPlanId(byBackupPlanId);
        return this;
    }

    /**
     * <p>
     * Returns only recovery points that were created before the specified timestamp.
     * </p>
     * 
     * @param byCreatedBefore
     *        Returns only recovery points that were created before the specified timestamp.
     */

    public void setByCreatedBefore(java.util.Date byCreatedBefore) {
        this.byCreatedBefore = byCreatedBefore;
    }

    /**
     * <p>
     * Returns only recovery points that were created before the specified timestamp.
     * </p>
     * 
     * @return Returns only recovery points that were created before the specified timestamp.
     */

    public java.util.Date getByCreatedBefore() {
        return this.byCreatedBefore;
    }

    /**
     * <p>
     * Returns only recovery points that were created before the specified timestamp.
     * </p>
     * 
     * @param byCreatedBefore
     *        Returns only recovery points that were created before the specified timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByBackupVaultRequest withByCreatedBefore(java.util.Date byCreatedBefore) {
        setByCreatedBefore(byCreatedBefore);
        return this;
    }

    /**
     * <p>
     * Returns only recovery points that were created after the specified timestamp.
     * </p>
     * 
     * @param byCreatedAfter
     *        Returns only recovery points that were created after the specified timestamp.
     */

    public void setByCreatedAfter(java.util.Date byCreatedAfter) {
        this.byCreatedAfter = byCreatedAfter;
    }

    /**
     * <p>
     * Returns only recovery points that were created after the specified timestamp.
     * </p>
     * 
     * @return Returns only recovery points that were created after the specified timestamp.
     */

    public java.util.Date getByCreatedAfter() {
        return this.byCreatedAfter;
    }

    /**
     * <p>
     * Returns only recovery points that were created after the specified timestamp.
     * </p>
     * 
     * @param byCreatedAfter
     *        Returns only recovery points that were created after the specified timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByBackupVaultRequest withByCreatedAfter(java.util.Date byCreatedAfter) {
        setByCreatedAfter(byCreatedAfter);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getByResourceArn() != null)
            sb.append("ByResourceArn: ").append(getByResourceArn()).append(",");
        if (getByResourceType() != null)
            sb.append("ByResourceType: ").append(getByResourceType()).append(",");
        if (getByBackupPlanId() != null)
            sb.append("ByBackupPlanId: ").append(getByBackupPlanId()).append(",");
        if (getByCreatedBefore() != null)
            sb.append("ByCreatedBefore: ").append(getByCreatedBefore()).append(",");
        if (getByCreatedAfter() != null)
            sb.append("ByCreatedAfter: ").append(getByCreatedAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecoveryPointsByBackupVaultRequest == false)
            return false;
        ListRecoveryPointsByBackupVaultRequest other = (ListRecoveryPointsByBackupVaultRequest) obj;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getByResourceArn() == null ^ this.getByResourceArn() == null)
            return false;
        if (other.getByResourceArn() != null && other.getByResourceArn().equals(this.getByResourceArn()) == false)
            return false;
        if (other.getByResourceType() == null ^ this.getByResourceType() == null)
            return false;
        if (other.getByResourceType() != null && other.getByResourceType().equals(this.getByResourceType()) == false)
            return false;
        if (other.getByBackupPlanId() == null ^ this.getByBackupPlanId() == null)
            return false;
        if (other.getByBackupPlanId() != null && other.getByBackupPlanId().equals(this.getByBackupPlanId()) == false)
            return false;
        if (other.getByCreatedBefore() == null ^ this.getByCreatedBefore() == null)
            return false;
        if (other.getByCreatedBefore() != null && other.getByCreatedBefore().equals(this.getByCreatedBefore()) == false)
            return false;
        if (other.getByCreatedAfter() == null ^ this.getByCreatedAfter() == null)
            return false;
        if (other.getByCreatedAfter() != null && other.getByCreatedAfter().equals(this.getByCreatedAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getByResourceArn() == null) ? 0 : getByResourceArn().hashCode());
        hashCode = prime * hashCode + ((getByResourceType() == null) ? 0 : getByResourceType().hashCode());
        hashCode = prime * hashCode + ((getByBackupPlanId() == null) ? 0 : getByBackupPlanId().hashCode());
        hashCode = prime * hashCode + ((getByCreatedBefore() == null) ? 0 : getByCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getByCreatedAfter() == null) ? 0 : getByCreatedAfter().hashCode());
        return hashCode;
    }

    @Override
    public ListRecoveryPointsByBackupVaultRequest clone() {
        return (ListRecoveryPointsByBackupVaultRequest) super.clone();
    }

}
