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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/RestoreTableToPointInTime" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTableToPointInTimeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the source table that is being restored.
     * </p>
     */
    private String sourceTableName;
    /**
     * <p>
     * The name of the new table to which it must be restored to.
     * </p>
     */
    private String targetTableName;
    /**
     * <p>
     * Restore the table to the latest possible time. <code>LatestRestorableDateTime</code> is typically 5 minutes
     * before the current time.
     * </p>
     */
    private Boolean useLatestRestorableTime;
    /**
     * <p>
     * Time in the past to restore the table to.
     * </p>
     */
    private java.util.Date restoreDateTime;

    /**
     * <p>
     * Name of the source table that is being restored.
     * </p>
     * 
     * @param sourceTableName
     *        Name of the source table that is being restored.
     */

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    /**
     * <p>
     * Name of the source table that is being restored.
     * </p>
     * 
     * @return Name of the source table that is being restored.
     */

    public String getSourceTableName() {
        return this.sourceTableName;
    }

    /**
     * <p>
     * Name of the source table that is being restored.
     * </p>
     * 
     * @param sourceTableName
     *        Name of the source table that is being restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableToPointInTimeRequest withSourceTableName(String sourceTableName) {
        setSourceTableName(sourceTableName);
        return this;
    }

    /**
     * <p>
     * The name of the new table to which it must be restored to.
     * </p>
     * 
     * @param targetTableName
     *        The name of the new table to which it must be restored to.
     */

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which it must be restored to.
     * </p>
     * 
     * @return The name of the new table to which it must be restored to.
     */

    public String getTargetTableName() {
        return this.targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which it must be restored to.
     * </p>
     * 
     * @param targetTableName
     *        The name of the new table to which it must be restored to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableToPointInTimeRequest withTargetTableName(String targetTableName) {
        setTargetTableName(targetTableName);
        return this;
    }

    /**
     * <p>
     * Restore the table to the latest possible time. <code>LatestRestorableDateTime</code> is typically 5 minutes
     * before the current time.
     * </p>
     * 
     * @param useLatestRestorableTime
     *        Restore the table to the latest possible time. <code>LatestRestorableDateTime</code> is typically 5
     *        minutes before the current time.
     */

    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    /**
     * <p>
     * Restore the table to the latest possible time. <code>LatestRestorableDateTime</code> is typically 5 minutes
     * before the current time.
     * </p>
     * 
     * @return Restore the table to the latest possible time. <code>LatestRestorableDateTime</code> is typically 5
     *         minutes before the current time.
     */

    public Boolean getUseLatestRestorableTime() {
        return this.useLatestRestorableTime;
    }

    /**
     * <p>
     * Restore the table to the latest possible time. <code>LatestRestorableDateTime</code> is typically 5 minutes
     * before the current time.
     * </p>
     * 
     * @param useLatestRestorableTime
     *        Restore the table to the latest possible time. <code>LatestRestorableDateTime</code> is typically 5
     *        minutes before the current time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableToPointInTimeRequest withUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        setUseLatestRestorableTime(useLatestRestorableTime);
        return this;
    }

    /**
     * <p>
     * Restore the table to the latest possible time. <code>LatestRestorableDateTime</code> is typically 5 minutes
     * before the current time.
     * </p>
     * 
     * @return Restore the table to the latest possible time. <code>LatestRestorableDateTime</code> is typically 5
     *         minutes before the current time.
     */

    public Boolean isUseLatestRestorableTime() {
        return this.useLatestRestorableTime;
    }

    /**
     * <p>
     * Time in the past to restore the table to.
     * </p>
     * 
     * @param restoreDateTime
     *        Time in the past to restore the table to.
     */

    public void setRestoreDateTime(java.util.Date restoreDateTime) {
        this.restoreDateTime = restoreDateTime;
    }

    /**
     * <p>
     * Time in the past to restore the table to.
     * </p>
     * 
     * @return Time in the past to restore the table to.
     */

    public java.util.Date getRestoreDateTime() {
        return this.restoreDateTime;
    }

    /**
     * <p>
     * Time in the past to restore the table to.
     * </p>
     * 
     * @param restoreDateTime
     *        Time in the past to restore the table to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableToPointInTimeRequest withRestoreDateTime(java.util.Date restoreDateTime) {
        setRestoreDateTime(restoreDateTime);
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
        if (getSourceTableName() != null)
            sb.append("SourceTableName: ").append(getSourceTableName()).append(",");
        if (getTargetTableName() != null)
            sb.append("TargetTableName: ").append(getTargetTableName()).append(",");
        if (getUseLatestRestorableTime() != null)
            sb.append("UseLatestRestorableTime: ").append(getUseLatestRestorableTime()).append(",");
        if (getRestoreDateTime() != null)
            sb.append("RestoreDateTime: ").append(getRestoreDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTableToPointInTimeRequest == false)
            return false;
        RestoreTableToPointInTimeRequest other = (RestoreTableToPointInTimeRequest) obj;
        if (other.getSourceTableName() == null ^ this.getSourceTableName() == null)
            return false;
        if (other.getSourceTableName() != null && other.getSourceTableName().equals(this.getSourceTableName()) == false)
            return false;
        if (other.getTargetTableName() == null ^ this.getTargetTableName() == null)
            return false;
        if (other.getTargetTableName() != null && other.getTargetTableName().equals(this.getTargetTableName()) == false)
            return false;
        if (other.getUseLatestRestorableTime() == null ^ this.getUseLatestRestorableTime() == null)
            return false;
        if (other.getUseLatestRestorableTime() != null && other.getUseLatestRestorableTime().equals(this.getUseLatestRestorableTime()) == false)
            return false;
        if (other.getRestoreDateTime() == null ^ this.getRestoreDateTime() == null)
            return false;
        if (other.getRestoreDateTime() != null && other.getRestoreDateTime().equals(this.getRestoreDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceTableName() == null) ? 0 : getSourceTableName().hashCode());
        hashCode = prime * hashCode + ((getTargetTableName() == null) ? 0 : getTargetTableName().hashCode());
        hashCode = prime * hashCode + ((getUseLatestRestorableTime() == null) ? 0 : getUseLatestRestorableTime().hashCode());
        hashCode = prime * hashCode + ((getRestoreDateTime() == null) ? 0 : getRestoreDateTime().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTableToPointInTimeRequest clone() {
        return (RestoreTableToPointInTimeRequest) super.clone();
    }

}
