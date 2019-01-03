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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListBackups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of <code>BackupSummary</code> objects.
     * </p>
     */
    private java.util.List<BackupSummary> backupSummaries;
    /**
     * <p>
     * The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page
     * of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new
     * <code>ListBackups</code> operation in order to fetch the next page of results.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is empty, then the last page of results has been processed and there are
     * no more results to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not indicate there is more data to be
     * returned. All results are guaranteed to have been returned if and only if no value for
     * <code>LastEvaluatedBackupArn</code> is returned.
     * </p>
     */
    private String lastEvaluatedBackupArn;

    /**
     * <p>
     * List of <code>BackupSummary</code> objects.
     * </p>
     * 
     * @return List of <code>BackupSummary</code> objects.
     */

    public java.util.List<BackupSummary> getBackupSummaries() {
        return backupSummaries;
    }

    /**
     * <p>
     * List of <code>BackupSummary</code> objects.
     * </p>
     * 
     * @param backupSummaries
     *        List of <code>BackupSummary</code> objects.
     */

    public void setBackupSummaries(java.util.Collection<BackupSummary> backupSummaries) {
        if (backupSummaries == null) {
            this.backupSummaries = null;
            return;
        }

        this.backupSummaries = new java.util.ArrayList<BackupSummary>(backupSummaries);
    }

    /**
     * <p>
     * List of <code>BackupSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackupSummaries(java.util.Collection)} or {@link #withBackupSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param backupSummaries
     *        List of <code>BackupSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupsResult withBackupSummaries(BackupSummary... backupSummaries) {
        if (this.backupSummaries == null) {
            setBackupSummaries(new java.util.ArrayList<BackupSummary>(backupSummaries.length));
        }
        for (BackupSummary ele : backupSummaries) {
            this.backupSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>BackupSummary</code> objects.
     * </p>
     * 
     * @param backupSummaries
     *        List of <code>BackupSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupsResult withBackupSummaries(java.util.Collection<BackupSummary> backupSummaries) {
        setBackupSummaries(backupSummaries);
        return this;
    }

    /**
     * <p>
     * The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page
     * of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new
     * <code>ListBackups</code> operation in order to fetch the next page of results.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is empty, then the last page of results has been processed and there are
     * no more results to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not indicate there is more data to be
     * returned. All results are guaranteed to have been returned if and only if no value for
     * <code>LastEvaluatedBackupArn</code> is returned.
     * </p>
     * 
     * @param lastEvaluatedBackupArn
     *        The ARN of the backup last evaluated when the current page of results was returned, inclusive of the
     *        current page of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new
     *        <code>ListBackups</code> operation in order to fetch the next page of results. </p>
     *        <p>
     *        If <code>LastEvaluatedBackupArn</code> is empty, then the last page of results has been processed and
     *        there are no more results to be retrieved.
     *        </p>
     *        <p>
     *        If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not indicate there is more data to be
     *        returned. All results are guaranteed to have been returned if and only if no value for
     *        <code>LastEvaluatedBackupArn</code> is returned.
     */

    public void setLastEvaluatedBackupArn(String lastEvaluatedBackupArn) {
        this.lastEvaluatedBackupArn = lastEvaluatedBackupArn;
    }

    /**
     * <p>
     * The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page
     * of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new
     * <code>ListBackups</code> operation in order to fetch the next page of results.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is empty, then the last page of results has been processed and there are
     * no more results to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not indicate there is more data to be
     * returned. All results are guaranteed to have been returned if and only if no value for
     * <code>LastEvaluatedBackupArn</code> is returned.
     * </p>
     * 
     * @return The ARN of the backup last evaluated when the current page of results was returned, inclusive of the
     *         current page of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new
     *         <code>ListBackups</code> operation in order to fetch the next page of results. </p>
     *         <p>
     *         If <code>LastEvaluatedBackupArn</code> is empty, then the last page of results has been processed and
     *         there are no more results to be retrieved.
     *         </p>
     *         <p>
     *         If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not indicate there is more data to
     *         be returned. All results are guaranteed to have been returned if and only if no value for
     *         <code>LastEvaluatedBackupArn</code> is returned.
     */

    public String getLastEvaluatedBackupArn() {
        return this.lastEvaluatedBackupArn;
    }

    /**
     * <p>
     * The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page
     * of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new
     * <code>ListBackups</code> operation in order to fetch the next page of results.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is empty, then the last page of results has been processed and there are
     * no more results to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not indicate there is more data to be
     * returned. All results are guaranteed to have been returned if and only if no value for
     * <code>LastEvaluatedBackupArn</code> is returned.
     * </p>
     * 
     * @param lastEvaluatedBackupArn
     *        The ARN of the backup last evaluated when the current page of results was returned, inclusive of the
     *        current page of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new
     *        <code>ListBackups</code> operation in order to fetch the next page of results. </p>
     *        <p>
     *        If <code>LastEvaluatedBackupArn</code> is empty, then the last page of results has been processed and
     *        there are no more results to be retrieved.
     *        </p>
     *        <p>
     *        If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not indicate there is more data to be
     *        returned. All results are guaranteed to have been returned if and only if no value for
     *        <code>LastEvaluatedBackupArn</code> is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupsResult withLastEvaluatedBackupArn(String lastEvaluatedBackupArn) {
        setLastEvaluatedBackupArn(lastEvaluatedBackupArn);
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
        if (getBackupSummaries() != null)
            sb.append("BackupSummaries: ").append(getBackupSummaries()).append(",");
        if (getLastEvaluatedBackupArn() != null)
            sb.append("LastEvaluatedBackupArn: ").append(getLastEvaluatedBackupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackupsResult == false)
            return false;
        ListBackupsResult other = (ListBackupsResult) obj;
        if (other.getBackupSummaries() == null ^ this.getBackupSummaries() == null)
            return false;
        if (other.getBackupSummaries() != null && other.getBackupSummaries().equals(this.getBackupSummaries()) == false)
            return false;
        if (other.getLastEvaluatedBackupArn() == null ^ this.getLastEvaluatedBackupArn() == null)
            return false;
        if (other.getLastEvaluatedBackupArn() != null && other.getLastEvaluatedBackupArn().equals(this.getLastEvaluatedBackupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupSummaries() == null) ? 0 : getBackupSummaries().hashCode());
        hashCode = prime * hashCode + ((getLastEvaluatedBackupArn() == null) ? 0 : getLastEvaluatedBackupArn().hashCode());
        return hashCode;
    }

    @Override
    public ListBackupsResult clone() {
        try {
            return (ListBackupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
