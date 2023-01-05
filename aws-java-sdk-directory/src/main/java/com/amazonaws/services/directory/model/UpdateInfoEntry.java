/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An entry of update information related to a requested update type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateInfoEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInfoEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The status of the update performed on the directory.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the current status of the update type activity.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * This specifies if the update was initiated by the customer or by the service team.
     * </p>
     */
    private String initiatedBy;
    /**
     * <p>
     * The new value of the target setting.
     * </p>
     */
    private UpdateValue newValue;
    /**
     * <p>
     * The old value of the target setting.
     * </p>
     */
    private UpdateValue previousValue;
    /**
     * <p>
     * The start time of the <code>UpdateDirectorySetup</code> for the particular type.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The last updated date and time of a particular directory setting.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The name of the Region.
     * </p>
     * 
     * @param region
     *        The name of the Region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     * 
     * @return The name of the Region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     * 
     * @param region
     *        The name of the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInfoEntry withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The status of the update performed on the directory.
     * </p>
     * 
     * @param status
     *        The status of the update performed on the directory.
     * @see UpdateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the update performed on the directory.
     * </p>
     * 
     * @return The status of the update performed on the directory.
     * @see UpdateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the update performed on the directory.
     * </p>
     * 
     * @param status
     *        The status of the update performed on the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateStatus
     */

    public UpdateInfoEntry withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the update performed on the directory.
     * </p>
     * 
     * @param status
     *        The status of the update performed on the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateStatus
     */

    public UpdateInfoEntry withStatus(UpdateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the current status of the update type activity.
     * </p>
     * 
     * @param statusReason
     *        The reason for the current status of the update type activity.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the current status of the update type activity.
     * </p>
     * 
     * @return The reason for the current status of the update type activity.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the current status of the update type activity.
     * </p>
     * 
     * @param statusReason
     *        The reason for the current status of the update type activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInfoEntry withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * This specifies if the update was initiated by the customer or by the service team.
     * </p>
     * 
     * @param initiatedBy
     *        This specifies if the update was initiated by the customer or by the service team.
     */

    public void setInitiatedBy(String initiatedBy) {
        this.initiatedBy = initiatedBy;
    }

    /**
     * <p>
     * This specifies if the update was initiated by the customer or by the service team.
     * </p>
     * 
     * @return This specifies if the update was initiated by the customer or by the service team.
     */

    public String getInitiatedBy() {
        return this.initiatedBy;
    }

    /**
     * <p>
     * This specifies if the update was initiated by the customer or by the service team.
     * </p>
     * 
     * @param initiatedBy
     *        This specifies if the update was initiated by the customer or by the service team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInfoEntry withInitiatedBy(String initiatedBy) {
        setInitiatedBy(initiatedBy);
        return this;
    }

    /**
     * <p>
     * The new value of the target setting.
     * </p>
     * 
     * @param newValue
     *        The new value of the target setting.
     */

    public void setNewValue(UpdateValue newValue) {
        this.newValue = newValue;
    }

    /**
     * <p>
     * The new value of the target setting.
     * </p>
     * 
     * @return The new value of the target setting.
     */

    public UpdateValue getNewValue() {
        return this.newValue;
    }

    /**
     * <p>
     * The new value of the target setting.
     * </p>
     * 
     * @param newValue
     *        The new value of the target setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInfoEntry withNewValue(UpdateValue newValue) {
        setNewValue(newValue);
        return this;
    }

    /**
     * <p>
     * The old value of the target setting.
     * </p>
     * 
     * @param previousValue
     *        The old value of the target setting.
     */

    public void setPreviousValue(UpdateValue previousValue) {
        this.previousValue = previousValue;
    }

    /**
     * <p>
     * The old value of the target setting.
     * </p>
     * 
     * @return The old value of the target setting.
     */

    public UpdateValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     * <p>
     * The old value of the target setting.
     * </p>
     * 
     * @param previousValue
     *        The old value of the target setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInfoEntry withPreviousValue(UpdateValue previousValue) {
        setPreviousValue(previousValue);
        return this;
    }

    /**
     * <p>
     * The start time of the <code>UpdateDirectorySetup</code> for the particular type.
     * </p>
     * 
     * @param startTime
     *        The start time of the <code>UpdateDirectorySetup</code> for the particular type.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the <code>UpdateDirectorySetup</code> for the particular type.
     * </p>
     * 
     * @return The start time of the <code>UpdateDirectorySetup</code> for the particular type.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the <code>UpdateDirectorySetup</code> for the particular type.
     * </p>
     * 
     * @param startTime
     *        The start time of the <code>UpdateDirectorySetup</code> for the particular type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInfoEntry withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The last updated date and time of a particular directory setting.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The last updated date and time of a particular directory setting.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The last updated date and time of a particular directory setting.
     * </p>
     * 
     * @return The last updated date and time of a particular directory setting.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The last updated date and time of a particular directory setting.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The last updated date and time of a particular directory setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInfoEntry withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getInitiatedBy() != null)
            sb.append("InitiatedBy: ").append(getInitiatedBy()).append(",");
        if (getNewValue() != null)
            sb.append("NewValue: ").append(getNewValue()).append(",");
        if (getPreviousValue() != null)
            sb.append("PreviousValue: ").append(getPreviousValue()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInfoEntry == false)
            return false;
        UpdateInfoEntry other = (UpdateInfoEntry) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getInitiatedBy() == null ^ this.getInitiatedBy() == null)
            return false;
        if (other.getInitiatedBy() != null && other.getInitiatedBy().equals(this.getInitiatedBy()) == false)
            return false;
        if (other.getNewValue() == null ^ this.getNewValue() == null)
            return false;
        if (other.getNewValue() != null && other.getNewValue().equals(this.getNewValue()) == false)
            return false;
        if (other.getPreviousValue() == null ^ this.getPreviousValue() == null)
            return false;
        if (other.getPreviousValue() != null && other.getPreviousValue().equals(this.getPreviousValue()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getInitiatedBy() == null) ? 0 : getInitiatedBy().hashCode());
        hashCode = prime * hashCode + ((getNewValue() == null) ? 0 : getNewValue().hashCode());
        hashCode = prime * hashCode + ((getPreviousValue() == null) ? 0 : getPreviousValue().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInfoEntry clone() {
        try {
            return (UpdateInfoEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.UpdateInfoEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
