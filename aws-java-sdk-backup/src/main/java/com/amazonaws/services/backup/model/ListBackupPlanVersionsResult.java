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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlanVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackupPlanVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * An array of version list items containing metadata about your backup plans.
     * </p>
     */
    private java.util.List<BackupPlansListMember> backupPlanVersionsList;

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

    public ListBackupPlanVersionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of version list items containing metadata about your backup plans.
     * </p>
     * 
     * @return An array of version list items containing metadata about your backup plans.
     */

    public java.util.List<BackupPlansListMember> getBackupPlanVersionsList() {
        return backupPlanVersionsList;
    }

    /**
     * <p>
     * An array of version list items containing metadata about your backup plans.
     * </p>
     * 
     * @param backupPlanVersionsList
     *        An array of version list items containing metadata about your backup plans.
     */

    public void setBackupPlanVersionsList(java.util.Collection<BackupPlansListMember> backupPlanVersionsList) {
        if (backupPlanVersionsList == null) {
            this.backupPlanVersionsList = null;
            return;
        }

        this.backupPlanVersionsList = new java.util.ArrayList<BackupPlansListMember>(backupPlanVersionsList);
    }

    /**
     * <p>
     * An array of version list items containing metadata about your backup plans.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackupPlanVersionsList(java.util.Collection)} or
     * {@link #withBackupPlanVersionsList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param backupPlanVersionsList
     *        An array of version list items containing metadata about your backup plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupPlanVersionsResult withBackupPlanVersionsList(BackupPlansListMember... backupPlanVersionsList) {
        if (this.backupPlanVersionsList == null) {
            setBackupPlanVersionsList(new java.util.ArrayList<BackupPlansListMember>(backupPlanVersionsList.length));
        }
        for (BackupPlansListMember ele : backupPlanVersionsList) {
            this.backupPlanVersionsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of version list items containing metadata about your backup plans.
     * </p>
     * 
     * @param backupPlanVersionsList
     *        An array of version list items containing metadata about your backup plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupPlanVersionsResult withBackupPlanVersionsList(java.util.Collection<BackupPlansListMember> backupPlanVersionsList) {
        setBackupPlanVersionsList(backupPlanVersionsList);
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
        if (getBackupPlanVersionsList() != null)
            sb.append("BackupPlanVersionsList: ").append(getBackupPlanVersionsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackupPlanVersionsResult == false)
            return false;
        ListBackupPlanVersionsResult other = (ListBackupPlanVersionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getBackupPlanVersionsList() == null ^ this.getBackupPlanVersionsList() == null)
            return false;
        if (other.getBackupPlanVersionsList() != null && other.getBackupPlanVersionsList().equals(this.getBackupPlanVersionsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getBackupPlanVersionsList() == null) ? 0 : getBackupPlanVersionsList().hashCode());
        return hashCode;
    }

    @Override
    public ListBackupPlanVersionsResult clone() {
        try {
            return (ListBackupPlanVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
