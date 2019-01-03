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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListBackups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The backups from the table specified by <code>TableName</code> are listed.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Maximum number of backups to return at once.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Only backups created after this time are listed. <code>TimeRangeLowerBound</code> is inclusive.
     * </p>
     */
    private java.util.Date timeRangeLowerBound;
    /**
     * <p>
     * Only backups created before this time are listed. <code>TimeRangeUpperBound</code> is exclusive.
     * </p>
     */
    private java.util.Date timeRangeUpperBound;
    /**
     * <p>
     * <code>LastEvaluatedBackupArn</code> is the ARN of the backup last evaluated when the current page of results was
     * returned, inclusive of the current page of results. This value may be specified as the
     * <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the next page
     * of results.
     * </p>
     */
    private String exclusiveStartBackupArn;
    /**
     * <p>
     * The backups from the table specified by <code>BackupType</code> are listed.
     * </p>
     * <p>
     * Where <code>BackupType</code> can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - On-demand backup created by you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     * </p>
     * </li>
     * </ul>
     */
    private String backupType;

    /**
     * <p>
     * The backups from the table specified by <code>TableName</code> are listed.
     * </p>
     * 
     * @param tableName
     *        The backups from the table specified by <code>TableName</code> are listed.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The backups from the table specified by <code>TableName</code> are listed.
     * </p>
     * 
     * @return The backups from the table specified by <code>TableName</code> are listed.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The backups from the table specified by <code>TableName</code> are listed.
     * </p>
     * 
     * @param tableName
     *        The backups from the table specified by <code>TableName</code> are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupsRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * Maximum number of backups to return at once.
     * </p>
     * 
     * @param limit
     *        Maximum number of backups to return at once.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of backups to return at once.
     * </p>
     * 
     * @return Maximum number of backups to return at once.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of backups to return at once.
     * </p>
     * 
     * @param limit
     *        Maximum number of backups to return at once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Only backups created after this time are listed. <code>TimeRangeLowerBound</code> is inclusive.
     * </p>
     * 
     * @param timeRangeLowerBound
     *        Only backups created after this time are listed. <code>TimeRangeLowerBound</code> is inclusive.
     */

    public void setTimeRangeLowerBound(java.util.Date timeRangeLowerBound) {
        this.timeRangeLowerBound = timeRangeLowerBound;
    }

    /**
     * <p>
     * Only backups created after this time are listed. <code>TimeRangeLowerBound</code> is inclusive.
     * </p>
     * 
     * @return Only backups created after this time are listed. <code>TimeRangeLowerBound</code> is inclusive.
     */

    public java.util.Date getTimeRangeLowerBound() {
        return this.timeRangeLowerBound;
    }

    /**
     * <p>
     * Only backups created after this time are listed. <code>TimeRangeLowerBound</code> is inclusive.
     * </p>
     * 
     * @param timeRangeLowerBound
     *        Only backups created after this time are listed. <code>TimeRangeLowerBound</code> is inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupsRequest withTimeRangeLowerBound(java.util.Date timeRangeLowerBound) {
        setTimeRangeLowerBound(timeRangeLowerBound);
        return this;
    }

    /**
     * <p>
     * Only backups created before this time are listed. <code>TimeRangeUpperBound</code> is exclusive.
     * </p>
     * 
     * @param timeRangeUpperBound
     *        Only backups created before this time are listed. <code>TimeRangeUpperBound</code> is exclusive.
     */

    public void setTimeRangeUpperBound(java.util.Date timeRangeUpperBound) {
        this.timeRangeUpperBound = timeRangeUpperBound;
    }

    /**
     * <p>
     * Only backups created before this time are listed. <code>TimeRangeUpperBound</code> is exclusive.
     * </p>
     * 
     * @return Only backups created before this time are listed. <code>TimeRangeUpperBound</code> is exclusive.
     */

    public java.util.Date getTimeRangeUpperBound() {
        return this.timeRangeUpperBound;
    }

    /**
     * <p>
     * Only backups created before this time are listed. <code>TimeRangeUpperBound</code> is exclusive.
     * </p>
     * 
     * @param timeRangeUpperBound
     *        Only backups created before this time are listed. <code>TimeRangeUpperBound</code> is exclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupsRequest withTimeRangeUpperBound(java.util.Date timeRangeUpperBound) {
        setTimeRangeUpperBound(timeRangeUpperBound);
        return this;
    }

    /**
     * <p>
     * <code>LastEvaluatedBackupArn</code> is the ARN of the backup last evaluated when the current page of results was
     * returned, inclusive of the current page of results. This value may be specified as the
     * <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the next page
     * of results.
     * </p>
     * 
     * @param exclusiveStartBackupArn
     *        <code>LastEvaluatedBackupArn</code> is the ARN of the backup last evaluated when the current page of
     *        results was returned, inclusive of the current page of results. This value may be specified as the
     *        <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the
     *        next page of results.
     */

    public void setExclusiveStartBackupArn(String exclusiveStartBackupArn) {
        this.exclusiveStartBackupArn = exclusiveStartBackupArn;
    }

    /**
     * <p>
     * <code>LastEvaluatedBackupArn</code> is the ARN of the backup last evaluated when the current page of results was
     * returned, inclusive of the current page of results. This value may be specified as the
     * <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the next page
     * of results.
     * </p>
     * 
     * @return <code>LastEvaluatedBackupArn</code> is the ARN of the backup last evaluated when the current page of
     *         results was returned, inclusive of the current page of results. This value may be specified as the
     *         <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the
     *         next page of results.
     */

    public String getExclusiveStartBackupArn() {
        return this.exclusiveStartBackupArn;
    }

    /**
     * <p>
     * <code>LastEvaluatedBackupArn</code> is the ARN of the backup last evaluated when the current page of results was
     * returned, inclusive of the current page of results. This value may be specified as the
     * <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the next page
     * of results.
     * </p>
     * 
     * @param exclusiveStartBackupArn
     *        <code>LastEvaluatedBackupArn</code> is the ARN of the backup last evaluated when the current page of
     *        results was returned, inclusive of the current page of results. This value may be specified as the
     *        <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the
     *        next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupsRequest withExclusiveStartBackupArn(String exclusiveStartBackupArn) {
        setExclusiveStartBackupArn(exclusiveStartBackupArn);
        return this;
    }

    /**
     * <p>
     * The backups from the table specified by <code>BackupType</code> are listed.
     * </p>
     * <p>
     * Where <code>BackupType</code> can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - On-demand backup created by you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupType
     *        The backups from the table specified by <code>BackupType</code> are listed.</p>
     *        <p>
     *        Where <code>BackupType</code> can be:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>USER</code> - On-demand backup created by you.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     *        </p>
     *        </li>
     * @see BackupTypeFilter
     */

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    /**
     * <p>
     * The backups from the table specified by <code>BackupType</code> are listed.
     * </p>
     * <p>
     * Where <code>BackupType</code> can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - On-demand backup created by you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The backups from the table specified by <code>BackupType</code> are listed.</p>
     *         <p>
     *         Where <code>BackupType</code> can be:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>USER</code> - On-demand backup created by you.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     *         </p>
     *         </li>
     * @see BackupTypeFilter
     */

    public String getBackupType() {
        return this.backupType;
    }

    /**
     * <p>
     * The backups from the table specified by <code>BackupType</code> are listed.
     * </p>
     * <p>
     * Where <code>BackupType</code> can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - On-demand backup created by you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupType
     *        The backups from the table specified by <code>BackupType</code> are listed.</p>
     *        <p>
     *        Where <code>BackupType</code> can be:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>USER</code> - On-demand backup created by you.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupTypeFilter
     */

    public ListBackupsRequest withBackupType(String backupType) {
        setBackupType(backupType);
        return this;
    }

    /**
     * <p>
     * The backups from the table specified by <code>BackupType</code> are listed.
     * </p>
     * <p>
     * Where <code>BackupType</code> can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - On-demand backup created by you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupType
     *        The backups from the table specified by <code>BackupType</code> are listed.</p>
     *        <p>
     *        Where <code>BackupType</code> can be:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>USER</code> - On-demand backup created by you.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupTypeFilter
     */

    public ListBackupsRequest withBackupType(BackupTypeFilter backupType) {
        this.backupType = backupType.toString();
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getTimeRangeLowerBound() != null)
            sb.append("TimeRangeLowerBound: ").append(getTimeRangeLowerBound()).append(",");
        if (getTimeRangeUpperBound() != null)
            sb.append("TimeRangeUpperBound: ").append(getTimeRangeUpperBound()).append(",");
        if (getExclusiveStartBackupArn() != null)
            sb.append("ExclusiveStartBackupArn: ").append(getExclusiveStartBackupArn()).append(",");
        if (getBackupType() != null)
            sb.append("BackupType: ").append(getBackupType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackupsRequest == false)
            return false;
        ListBackupsRequest other = (ListBackupsRequest) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getTimeRangeLowerBound() == null ^ this.getTimeRangeLowerBound() == null)
            return false;
        if (other.getTimeRangeLowerBound() != null && other.getTimeRangeLowerBound().equals(this.getTimeRangeLowerBound()) == false)
            return false;
        if (other.getTimeRangeUpperBound() == null ^ this.getTimeRangeUpperBound() == null)
            return false;
        if (other.getTimeRangeUpperBound() != null && other.getTimeRangeUpperBound().equals(this.getTimeRangeUpperBound()) == false)
            return false;
        if (other.getExclusiveStartBackupArn() == null ^ this.getExclusiveStartBackupArn() == null)
            return false;
        if (other.getExclusiveStartBackupArn() != null && other.getExclusiveStartBackupArn().equals(this.getExclusiveStartBackupArn()) == false)
            return false;
        if (other.getBackupType() == null ^ this.getBackupType() == null)
            return false;
        if (other.getBackupType() != null && other.getBackupType().equals(this.getBackupType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getTimeRangeLowerBound() == null) ? 0 : getTimeRangeLowerBound().hashCode());
        hashCode = prime * hashCode + ((getTimeRangeUpperBound() == null) ? 0 : getTimeRangeUpperBound().hashCode());
        hashCode = prime * hashCode + ((getExclusiveStartBackupArn() == null) ? 0 : getExclusiveStartBackupArn().hashCode());
        hashCode = prime * hashCode + ((getBackupType() == null) ? 0 : getBackupType().hashCode());
        return hashCode;
    }

    @Override
    public ListBackupsRequest clone() {
        return (ListBackupsRequest) super.clone();
    }

}
