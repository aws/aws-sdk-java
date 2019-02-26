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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackupJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures containing metadata about your backup jobs returned in JSON format.
     * </p>
     */
    private java.util.List<BackupJob> backupJobs;
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
     * An array of structures containing metadata about your backup jobs returned in JSON format.
     * </p>
     * 
     * @return An array of structures containing metadata about your backup jobs returned in JSON format.
     */

    public java.util.List<BackupJob> getBackupJobs() {
        return backupJobs;
    }

    /**
     * <p>
     * An array of structures containing metadata about your backup jobs returned in JSON format.
     * </p>
     * 
     * @param backupJobs
     *        An array of structures containing metadata about your backup jobs returned in JSON format.
     */

    public void setBackupJobs(java.util.Collection<BackupJob> backupJobs) {
        if (backupJobs == null) {
            this.backupJobs = null;
            return;
        }

        this.backupJobs = new java.util.ArrayList<BackupJob>(backupJobs);
    }

    /**
     * <p>
     * An array of structures containing metadata about your backup jobs returned in JSON format.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackupJobs(java.util.Collection)} or {@link #withBackupJobs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param backupJobs
     *        An array of structures containing metadata about your backup jobs returned in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupJobsResult withBackupJobs(BackupJob... backupJobs) {
        if (this.backupJobs == null) {
            setBackupJobs(new java.util.ArrayList<BackupJob>(backupJobs.length));
        }
        for (BackupJob ele : backupJobs) {
            this.backupJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures containing metadata about your backup jobs returned in JSON format.
     * </p>
     * 
     * @param backupJobs
     *        An array of structures containing metadata about your backup jobs returned in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupJobsResult withBackupJobs(java.util.Collection<BackupJob> backupJobs) {
        setBackupJobs(backupJobs);
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

    public ListBackupJobsResult withNextToken(String nextToken) {
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
        if (getBackupJobs() != null)
            sb.append("BackupJobs: ").append(getBackupJobs()).append(",");
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

        if (obj instanceof ListBackupJobsResult == false)
            return false;
        ListBackupJobsResult other = (ListBackupJobsResult) obj;
        if (other.getBackupJobs() == null ^ this.getBackupJobs() == null)
            return false;
        if (other.getBackupJobs() != null && other.getBackupJobs().equals(this.getBackupJobs()) == false)
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

        hashCode = prime * hashCode + ((getBackupJobs() == null) ? 0 : getBackupJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBackupJobsResult clone() {
        try {
            return (ListBackupJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
