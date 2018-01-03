/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The backups from the table specified by TableName are listed.
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
     * <code>LastEvaluatedBackupARN</code> returned by the previous ListBackups call.
     * </p>
     */
    private String exclusiveStartBackupArn;

    /**
     * <p>
     * The backups from the table specified by TableName are listed.
     * </p>
     * 
     * @param tableName
     *        The backups from the table specified by TableName are listed.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The backups from the table specified by TableName are listed.
     * </p>
     * 
     * @return The backups from the table specified by TableName are listed.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The backups from the table specified by TableName are listed.
     * </p>
     * 
     * @param tableName
     *        The backups from the table specified by TableName are listed.
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
     * <code>LastEvaluatedBackupARN</code> returned by the previous ListBackups call.
     * </p>
     * 
     * @param exclusiveStartBackupArn
     *        <code>LastEvaluatedBackupARN</code> returned by the previous ListBackups call.
     */

    public void setExclusiveStartBackupArn(String exclusiveStartBackupArn) {
        this.exclusiveStartBackupArn = exclusiveStartBackupArn;
    }

    /**
     * <p>
     * <code>LastEvaluatedBackupARN</code> returned by the previous ListBackups call.
     * </p>
     * 
     * @return <code>LastEvaluatedBackupARN</code> returned by the previous ListBackups call.
     */

    public String getExclusiveStartBackupArn() {
        return this.exclusiveStartBackupArn;
    }

    /**
     * <p>
     * <code>LastEvaluatedBackupARN</code> returned by the previous ListBackups call.
     * </p>
     * 
     * @param exclusiveStartBackupArn
     *        <code>LastEvaluatedBackupARN</code> returned by the previous ListBackups call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupsRequest withExclusiveStartBackupArn(String exclusiveStartBackupArn) {
        setExclusiveStartBackupArn(exclusiveStartBackupArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ExclusiveStartBackupArn: ").append(getExclusiveStartBackupArn());
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
        return hashCode;
    }

    @Override
    public ListBackupsRequest clone() {
        return (ListBackupsRequest) super.clone();
    }

}
