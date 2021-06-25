/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Each <code>LongTermPricingListEntry</code> object contains information about a long-term pricing type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/LongTermPricingListEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LongTermPricingListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the long-term pricing type for the device.
     * </p>
     */
    private String longTermPricingId;
    /**
     * <p>
     * The end date the long-term pricing contract.
     * </p>
     */
    private java.util.Date longTermPricingEndDate;
    /**
     * <p>
     * The start date of the long-term pricing contract.
     * </p>
     */
    private java.util.Date longTermPricingStartDate;
    /**
     * <p>
     * The type of long-term pricing that was selected for the device.
     * </p>
     */
    private String longTermPricingType;
    /**
     * <p>
     * The current active jobs on the device the long-term pricing type.
     * </p>
     */
    private String currentActiveJob;
    /**
     * <p>
     * A new device that replaces a device that is ordered with long-term pricing.
     * </p>
     */
    private String replacementJob;
    /**
     * <p>
     * If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     * automatically renewed before the long-term pricing contract expires.
     * </p>
     */
    private Boolean isLongTermPricingAutoRenew;
    /**
     * <p>
     * The status of the long-term pricing type.
     * </p>
     */
    private String longTermPricingStatus;
    /**
     * <p>
     * The type of AWS Snow Family device associated with this long-term pricing job.
     * </p>
     */
    private String snowballType;
    /**
     * <p>
     * The IDs of the jobs that are associated with a long-term pricing type.
     * </p>
     */
    private java.util.List<String> jobIds;

    /**
     * <p>
     * The ID of the long-term pricing type for the device.
     * </p>
     * 
     * @param longTermPricingId
     *        The ID of the long-term pricing type for the device.
     */

    public void setLongTermPricingId(String longTermPricingId) {
        this.longTermPricingId = longTermPricingId;
    }

    /**
     * <p>
     * The ID of the long-term pricing type for the device.
     * </p>
     * 
     * @return The ID of the long-term pricing type for the device.
     */

    public String getLongTermPricingId() {
        return this.longTermPricingId;
    }

    /**
     * <p>
     * The ID of the long-term pricing type for the device.
     * </p>
     * 
     * @param longTermPricingId
     *        The ID of the long-term pricing type for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongTermPricingListEntry withLongTermPricingId(String longTermPricingId) {
        setLongTermPricingId(longTermPricingId);
        return this;
    }

    /**
     * <p>
     * The end date the long-term pricing contract.
     * </p>
     * 
     * @param longTermPricingEndDate
     *        The end date the long-term pricing contract.
     */

    public void setLongTermPricingEndDate(java.util.Date longTermPricingEndDate) {
        this.longTermPricingEndDate = longTermPricingEndDate;
    }

    /**
     * <p>
     * The end date the long-term pricing contract.
     * </p>
     * 
     * @return The end date the long-term pricing contract.
     */

    public java.util.Date getLongTermPricingEndDate() {
        return this.longTermPricingEndDate;
    }

    /**
     * <p>
     * The end date the long-term pricing contract.
     * </p>
     * 
     * @param longTermPricingEndDate
     *        The end date the long-term pricing contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongTermPricingListEntry withLongTermPricingEndDate(java.util.Date longTermPricingEndDate) {
        setLongTermPricingEndDate(longTermPricingEndDate);
        return this;
    }

    /**
     * <p>
     * The start date of the long-term pricing contract.
     * </p>
     * 
     * @param longTermPricingStartDate
     *        The start date of the long-term pricing contract.
     */

    public void setLongTermPricingStartDate(java.util.Date longTermPricingStartDate) {
        this.longTermPricingStartDate = longTermPricingStartDate;
    }

    /**
     * <p>
     * The start date of the long-term pricing contract.
     * </p>
     * 
     * @return The start date of the long-term pricing contract.
     */

    public java.util.Date getLongTermPricingStartDate() {
        return this.longTermPricingStartDate;
    }

    /**
     * <p>
     * The start date of the long-term pricing contract.
     * </p>
     * 
     * @param longTermPricingStartDate
     *        The start date of the long-term pricing contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongTermPricingListEntry withLongTermPricingStartDate(java.util.Date longTermPricingStartDate) {
        setLongTermPricingStartDate(longTermPricingStartDate);
        return this;
    }

    /**
     * <p>
     * The type of long-term pricing that was selected for the device.
     * </p>
     * 
     * @param longTermPricingType
     *        The type of long-term pricing that was selected for the device.
     * @see LongTermPricingType
     */

    public void setLongTermPricingType(String longTermPricingType) {
        this.longTermPricingType = longTermPricingType;
    }

    /**
     * <p>
     * The type of long-term pricing that was selected for the device.
     * </p>
     * 
     * @return The type of long-term pricing that was selected for the device.
     * @see LongTermPricingType
     */

    public String getLongTermPricingType() {
        return this.longTermPricingType;
    }

    /**
     * <p>
     * The type of long-term pricing that was selected for the device.
     * </p>
     * 
     * @param longTermPricingType
     *        The type of long-term pricing that was selected for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LongTermPricingType
     */

    public LongTermPricingListEntry withLongTermPricingType(String longTermPricingType) {
        setLongTermPricingType(longTermPricingType);
        return this;
    }

    /**
     * <p>
     * The type of long-term pricing that was selected for the device.
     * </p>
     * 
     * @param longTermPricingType
     *        The type of long-term pricing that was selected for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LongTermPricingType
     */

    public LongTermPricingListEntry withLongTermPricingType(LongTermPricingType longTermPricingType) {
        this.longTermPricingType = longTermPricingType.toString();
        return this;
    }

    /**
     * <p>
     * The current active jobs on the device the long-term pricing type.
     * </p>
     * 
     * @param currentActiveJob
     *        The current active jobs on the device the long-term pricing type.
     */

    public void setCurrentActiveJob(String currentActiveJob) {
        this.currentActiveJob = currentActiveJob;
    }

    /**
     * <p>
     * The current active jobs on the device the long-term pricing type.
     * </p>
     * 
     * @return The current active jobs on the device the long-term pricing type.
     */

    public String getCurrentActiveJob() {
        return this.currentActiveJob;
    }

    /**
     * <p>
     * The current active jobs on the device the long-term pricing type.
     * </p>
     * 
     * @param currentActiveJob
     *        The current active jobs on the device the long-term pricing type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongTermPricingListEntry withCurrentActiveJob(String currentActiveJob) {
        setCurrentActiveJob(currentActiveJob);
        return this;
    }

    /**
     * <p>
     * A new device that replaces a device that is ordered with long-term pricing.
     * </p>
     * 
     * @param replacementJob
     *        A new device that replaces a device that is ordered with long-term pricing.
     */

    public void setReplacementJob(String replacementJob) {
        this.replacementJob = replacementJob;
    }

    /**
     * <p>
     * A new device that replaces a device that is ordered with long-term pricing.
     * </p>
     * 
     * @return A new device that replaces a device that is ordered with long-term pricing.
     */

    public String getReplacementJob() {
        return this.replacementJob;
    }

    /**
     * <p>
     * A new device that replaces a device that is ordered with long-term pricing.
     * </p>
     * 
     * @param replacementJob
     *        A new device that replaces a device that is ordered with long-term pricing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongTermPricingListEntry withReplacementJob(String replacementJob) {
        setReplacementJob(replacementJob);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     * automatically renewed before the long-term pricing contract expires.
     * </p>
     * 
     * @param isLongTermPricingAutoRenew
     *        If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     *        automatically renewed before the long-term pricing contract expires.
     */

    public void setIsLongTermPricingAutoRenew(Boolean isLongTermPricingAutoRenew) {
        this.isLongTermPricingAutoRenew = isLongTermPricingAutoRenew;
    }

    /**
     * <p>
     * If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     * automatically renewed before the long-term pricing contract expires.
     * </p>
     * 
     * @return If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     *         automatically renewed before the long-term pricing contract expires.
     */

    public Boolean getIsLongTermPricingAutoRenew() {
        return this.isLongTermPricingAutoRenew;
    }

    /**
     * <p>
     * If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     * automatically renewed before the long-term pricing contract expires.
     * </p>
     * 
     * @param isLongTermPricingAutoRenew
     *        If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     *        automatically renewed before the long-term pricing contract expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongTermPricingListEntry withIsLongTermPricingAutoRenew(Boolean isLongTermPricingAutoRenew) {
        setIsLongTermPricingAutoRenew(isLongTermPricingAutoRenew);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     * automatically renewed before the long-term pricing contract expires.
     * </p>
     * 
     * @return If set to <code>true</code>, specifies that the current long-term pricing type for the device should be
     *         automatically renewed before the long-term pricing contract expires.
     */

    public Boolean isLongTermPricingAutoRenew() {
        return this.isLongTermPricingAutoRenew;
    }

    /**
     * <p>
     * The status of the long-term pricing type.
     * </p>
     * 
     * @param longTermPricingStatus
     *        The status of the long-term pricing type.
     */

    public void setLongTermPricingStatus(String longTermPricingStatus) {
        this.longTermPricingStatus = longTermPricingStatus;
    }

    /**
     * <p>
     * The status of the long-term pricing type.
     * </p>
     * 
     * @return The status of the long-term pricing type.
     */

    public String getLongTermPricingStatus() {
        return this.longTermPricingStatus;
    }

    /**
     * <p>
     * The status of the long-term pricing type.
     * </p>
     * 
     * @param longTermPricingStatus
     *        The status of the long-term pricing type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongTermPricingListEntry withLongTermPricingStatus(String longTermPricingStatus) {
        setLongTermPricingStatus(longTermPricingStatus);
        return this;
    }

    /**
     * <p>
     * The type of AWS Snow Family device associated with this long-term pricing job.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snow Family device associated with this long-term pricing job.
     * @see SnowballType
     */

    public void setSnowballType(String snowballType) {
        this.snowballType = snowballType;
    }

    /**
     * <p>
     * The type of AWS Snow Family device associated with this long-term pricing job.
     * </p>
     * 
     * @return The type of AWS Snow Family device associated with this long-term pricing job.
     * @see SnowballType
     */

    public String getSnowballType() {
        return this.snowballType;
    }

    /**
     * <p>
     * The type of AWS Snow Family device associated with this long-term pricing job.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snow Family device associated with this long-term pricing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public LongTermPricingListEntry withSnowballType(String snowballType) {
        setSnowballType(snowballType);
        return this;
    }

    /**
     * <p>
     * The type of AWS Snow Family device associated with this long-term pricing job.
     * </p>
     * 
     * @param snowballType
     *        The type of AWS Snow Family device associated with this long-term pricing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public LongTermPricingListEntry withSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
        return this;
    }

    /**
     * <p>
     * The IDs of the jobs that are associated with a long-term pricing type.
     * </p>
     * 
     * @return The IDs of the jobs that are associated with a long-term pricing type.
     */

    public java.util.List<String> getJobIds() {
        return jobIds;
    }

    /**
     * <p>
     * The IDs of the jobs that are associated with a long-term pricing type.
     * </p>
     * 
     * @param jobIds
     *        The IDs of the jobs that are associated with a long-term pricing type.
     */

    public void setJobIds(java.util.Collection<String> jobIds) {
        if (jobIds == null) {
            this.jobIds = null;
            return;
        }

        this.jobIds = new java.util.ArrayList<String>(jobIds);
    }

    /**
     * <p>
     * The IDs of the jobs that are associated with a long-term pricing type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobIds(java.util.Collection)} or {@link #withJobIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobIds
     *        The IDs of the jobs that are associated with a long-term pricing type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongTermPricingListEntry withJobIds(String... jobIds) {
        if (this.jobIds == null) {
            setJobIds(new java.util.ArrayList<String>(jobIds.length));
        }
        for (String ele : jobIds) {
            this.jobIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the jobs that are associated with a long-term pricing type.
     * </p>
     * 
     * @param jobIds
     *        The IDs of the jobs that are associated with a long-term pricing type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongTermPricingListEntry withJobIds(java.util.Collection<String> jobIds) {
        setJobIds(jobIds);
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
        if (getLongTermPricingId() != null)
            sb.append("LongTermPricingId: ").append(getLongTermPricingId()).append(",");
        if (getLongTermPricingEndDate() != null)
            sb.append("LongTermPricingEndDate: ").append(getLongTermPricingEndDate()).append(",");
        if (getLongTermPricingStartDate() != null)
            sb.append("LongTermPricingStartDate: ").append(getLongTermPricingStartDate()).append(",");
        if (getLongTermPricingType() != null)
            sb.append("LongTermPricingType: ").append(getLongTermPricingType()).append(",");
        if (getCurrentActiveJob() != null)
            sb.append("CurrentActiveJob: ").append(getCurrentActiveJob()).append(",");
        if (getReplacementJob() != null)
            sb.append("ReplacementJob: ").append(getReplacementJob()).append(",");
        if (getIsLongTermPricingAutoRenew() != null)
            sb.append("IsLongTermPricingAutoRenew: ").append(getIsLongTermPricingAutoRenew()).append(",");
        if (getLongTermPricingStatus() != null)
            sb.append("LongTermPricingStatus: ").append(getLongTermPricingStatus()).append(",");
        if (getSnowballType() != null)
            sb.append("SnowballType: ").append(getSnowballType()).append(",");
        if (getJobIds() != null)
            sb.append("JobIds: ").append(getJobIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LongTermPricingListEntry == false)
            return false;
        LongTermPricingListEntry other = (LongTermPricingListEntry) obj;
        if (other.getLongTermPricingId() == null ^ this.getLongTermPricingId() == null)
            return false;
        if (other.getLongTermPricingId() != null && other.getLongTermPricingId().equals(this.getLongTermPricingId()) == false)
            return false;
        if (other.getLongTermPricingEndDate() == null ^ this.getLongTermPricingEndDate() == null)
            return false;
        if (other.getLongTermPricingEndDate() != null && other.getLongTermPricingEndDate().equals(this.getLongTermPricingEndDate()) == false)
            return false;
        if (other.getLongTermPricingStartDate() == null ^ this.getLongTermPricingStartDate() == null)
            return false;
        if (other.getLongTermPricingStartDate() != null && other.getLongTermPricingStartDate().equals(this.getLongTermPricingStartDate()) == false)
            return false;
        if (other.getLongTermPricingType() == null ^ this.getLongTermPricingType() == null)
            return false;
        if (other.getLongTermPricingType() != null && other.getLongTermPricingType().equals(this.getLongTermPricingType()) == false)
            return false;
        if (other.getCurrentActiveJob() == null ^ this.getCurrentActiveJob() == null)
            return false;
        if (other.getCurrentActiveJob() != null && other.getCurrentActiveJob().equals(this.getCurrentActiveJob()) == false)
            return false;
        if (other.getReplacementJob() == null ^ this.getReplacementJob() == null)
            return false;
        if (other.getReplacementJob() != null && other.getReplacementJob().equals(this.getReplacementJob()) == false)
            return false;
        if (other.getIsLongTermPricingAutoRenew() == null ^ this.getIsLongTermPricingAutoRenew() == null)
            return false;
        if (other.getIsLongTermPricingAutoRenew() != null && other.getIsLongTermPricingAutoRenew().equals(this.getIsLongTermPricingAutoRenew()) == false)
            return false;
        if (other.getLongTermPricingStatus() == null ^ this.getLongTermPricingStatus() == null)
            return false;
        if (other.getLongTermPricingStatus() != null && other.getLongTermPricingStatus().equals(this.getLongTermPricingStatus()) == false)
            return false;
        if (other.getSnowballType() == null ^ this.getSnowballType() == null)
            return false;
        if (other.getSnowballType() != null && other.getSnowballType().equals(this.getSnowballType()) == false)
            return false;
        if (other.getJobIds() == null ^ this.getJobIds() == null)
            return false;
        if (other.getJobIds() != null && other.getJobIds().equals(this.getJobIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLongTermPricingId() == null) ? 0 : getLongTermPricingId().hashCode());
        hashCode = prime * hashCode + ((getLongTermPricingEndDate() == null) ? 0 : getLongTermPricingEndDate().hashCode());
        hashCode = prime * hashCode + ((getLongTermPricingStartDate() == null) ? 0 : getLongTermPricingStartDate().hashCode());
        hashCode = prime * hashCode + ((getLongTermPricingType() == null) ? 0 : getLongTermPricingType().hashCode());
        hashCode = prime * hashCode + ((getCurrentActiveJob() == null) ? 0 : getCurrentActiveJob().hashCode());
        hashCode = prime * hashCode + ((getReplacementJob() == null) ? 0 : getReplacementJob().hashCode());
        hashCode = prime * hashCode + ((getIsLongTermPricingAutoRenew() == null) ? 0 : getIsLongTermPricingAutoRenew().hashCode());
        hashCode = prime * hashCode + ((getLongTermPricingStatus() == null) ? 0 : getLongTermPricingStatus().hashCode());
        hashCode = prime * hashCode + ((getSnowballType() == null) ? 0 : getSnowballType().hashCode());
        hashCode = prime * hashCode + ((getJobIds() == null) ? 0 : getJobIds().hashCode());
        return hashCode;
    }

    @Override
    public LongTermPricingListEntry clone() {
        try {
            return (LongTermPricingListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.LongTermPricingListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
