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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupVaults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackupVaultsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of backup vault list members containing vault metadata, including Amazon Resource Name (ARN), display
     * name, creation date, number of saved recovery points, and encryption information if the resources saved in the
     * backup vault are encrypted.
     * </p>
     */
    private java.util.List<BackupVaultListMember> backupVaultList;
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
     * An array of backup vault list members containing vault metadata, including Amazon Resource Name (ARN), display
     * name, creation date, number of saved recovery points, and encryption information if the resources saved in the
     * backup vault are encrypted.
     * </p>
     * 
     * @return An array of backup vault list members containing vault metadata, including Amazon Resource Name (ARN),
     *         display name, creation date, number of saved recovery points, and encryption information if the resources
     *         saved in the backup vault are encrypted.
     */

    public java.util.List<BackupVaultListMember> getBackupVaultList() {
        return backupVaultList;
    }

    /**
     * <p>
     * An array of backup vault list members containing vault metadata, including Amazon Resource Name (ARN), display
     * name, creation date, number of saved recovery points, and encryption information if the resources saved in the
     * backup vault are encrypted.
     * </p>
     * 
     * @param backupVaultList
     *        An array of backup vault list members containing vault metadata, including Amazon Resource Name (ARN),
     *        display name, creation date, number of saved recovery points, and encryption information if the resources
     *        saved in the backup vault are encrypted.
     */

    public void setBackupVaultList(java.util.Collection<BackupVaultListMember> backupVaultList) {
        if (backupVaultList == null) {
            this.backupVaultList = null;
            return;
        }

        this.backupVaultList = new java.util.ArrayList<BackupVaultListMember>(backupVaultList);
    }

    /**
     * <p>
     * An array of backup vault list members containing vault metadata, including Amazon Resource Name (ARN), display
     * name, creation date, number of saved recovery points, and encryption information if the resources saved in the
     * backup vault are encrypted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackupVaultList(java.util.Collection)} or {@link #withBackupVaultList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param backupVaultList
     *        An array of backup vault list members containing vault metadata, including Amazon Resource Name (ARN),
     *        display name, creation date, number of saved recovery points, and encryption information if the resources
     *        saved in the backup vault are encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupVaultsResult withBackupVaultList(BackupVaultListMember... backupVaultList) {
        if (this.backupVaultList == null) {
            setBackupVaultList(new java.util.ArrayList<BackupVaultListMember>(backupVaultList.length));
        }
        for (BackupVaultListMember ele : backupVaultList) {
            this.backupVaultList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of backup vault list members containing vault metadata, including Amazon Resource Name (ARN), display
     * name, creation date, number of saved recovery points, and encryption information if the resources saved in the
     * backup vault are encrypted.
     * </p>
     * 
     * @param backupVaultList
     *        An array of backup vault list members containing vault metadata, including Amazon Resource Name (ARN),
     *        display name, creation date, number of saved recovery points, and encryption information if the resources
     *        saved in the backup vault are encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupVaultsResult withBackupVaultList(java.util.Collection<BackupVaultListMember> backupVaultList) {
        setBackupVaultList(backupVaultList);
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

    public ListBackupVaultsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getBackupVaultList() != null)
            sb.append("BackupVaultList: ").append(getBackupVaultList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackupVaultsResult == false)
            return false;
        ListBackupVaultsResult other = (ListBackupVaultsResult) obj;
        if (other.getBackupVaultList() == null ^ this.getBackupVaultList() == null)
            return false;
        if (other.getBackupVaultList() != null && other.getBackupVaultList().equals(this.getBackupVaultList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupVaultList() == null) ? 0 : getBackupVaultList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBackupVaultsResult clone() {
        try {
            return (ListBackupVaultsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
