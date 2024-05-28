/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The CIS target resource aggregation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CisTargetResourceAggregation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisTargetResourceAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account ID for the CIS target resource.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The platform for the CIS target resource.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The scan ARN for the CIS target resource.
     * </p>
     */
    private String scanArn;
    /**
     * <p>
     * The target resource status counts.
     * </p>
     */
    private StatusCounts statusCounts;
    /**
     * <p>
     * The ID of the target resource.
     * </p>
     */
    private String targetResourceId;
    /**
     * <p>
     * The tag for the target resource.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> targetResourceTags;
    /**
     * <p>
     * The status of the target resource.
     * </p>
     */
    private String targetStatus;
    /**
     * <p>
     * The reason for the target resource.
     * </p>
     */
    private String targetStatusReason;

    /**
     * <p>
     * The account ID for the CIS target resource.
     * </p>
     * 
     * @param accountId
     *        The account ID for the CIS target resource.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID for the CIS target resource.
     * </p>
     * 
     * @return The account ID for the CIS target resource.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID for the CIS target resource.
     * </p>
     * 
     * @param accountId
     *        The account ID for the CIS target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisTargetResourceAggregation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The platform for the CIS target resource.
     * </p>
     * 
     * @param platform
     *        The platform for the CIS target resource.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform for the CIS target resource.
     * </p>
     * 
     * @return The platform for the CIS target resource.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform for the CIS target resource.
     * </p>
     * 
     * @param platform
     *        The platform for the CIS target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisTargetResourceAggregation withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The scan ARN for the CIS target resource.
     * </p>
     * 
     * @param scanArn
     *        The scan ARN for the CIS target resource.
     */

    public void setScanArn(String scanArn) {
        this.scanArn = scanArn;
    }

    /**
     * <p>
     * The scan ARN for the CIS target resource.
     * </p>
     * 
     * @return The scan ARN for the CIS target resource.
     */

    public String getScanArn() {
        return this.scanArn;
    }

    /**
     * <p>
     * The scan ARN for the CIS target resource.
     * </p>
     * 
     * @param scanArn
     *        The scan ARN for the CIS target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisTargetResourceAggregation withScanArn(String scanArn) {
        setScanArn(scanArn);
        return this;
    }

    /**
     * <p>
     * The target resource status counts.
     * </p>
     * 
     * @param statusCounts
     *        The target resource status counts.
     */

    public void setStatusCounts(StatusCounts statusCounts) {
        this.statusCounts = statusCounts;
    }

    /**
     * <p>
     * The target resource status counts.
     * </p>
     * 
     * @return The target resource status counts.
     */

    public StatusCounts getStatusCounts() {
        return this.statusCounts;
    }

    /**
     * <p>
     * The target resource status counts.
     * </p>
     * 
     * @param statusCounts
     *        The target resource status counts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisTargetResourceAggregation withStatusCounts(StatusCounts statusCounts) {
        setStatusCounts(statusCounts);
        return this;
    }

    /**
     * <p>
     * The ID of the target resource.
     * </p>
     * 
     * @param targetResourceId
     *        The ID of the target resource.
     */

    public void setTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
    }

    /**
     * <p>
     * The ID of the target resource.
     * </p>
     * 
     * @return The ID of the target resource.
     */

    public String getTargetResourceId() {
        return this.targetResourceId;
    }

    /**
     * <p>
     * The ID of the target resource.
     * </p>
     * 
     * @param targetResourceId
     *        The ID of the target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisTargetResourceAggregation withTargetResourceId(String targetResourceId) {
        setTargetResourceId(targetResourceId);
        return this;
    }

    /**
     * <p>
     * The tag for the target resource.
     * </p>
     * 
     * @return The tag for the target resource.
     */

    public java.util.Map<String, java.util.List<String>> getTargetResourceTags() {
        return targetResourceTags;
    }

    /**
     * <p>
     * The tag for the target resource.
     * </p>
     * 
     * @param targetResourceTags
     *        The tag for the target resource.
     */

    public void setTargetResourceTags(java.util.Map<String, java.util.List<String>> targetResourceTags) {
        this.targetResourceTags = targetResourceTags;
    }

    /**
     * <p>
     * The tag for the target resource.
     * </p>
     * 
     * @param targetResourceTags
     *        The tag for the target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisTargetResourceAggregation withTargetResourceTags(java.util.Map<String, java.util.List<String>> targetResourceTags) {
        setTargetResourceTags(targetResourceTags);
        return this;
    }

    /**
     * Add a single TargetResourceTags entry
     *
     * @see CisTargetResourceAggregation#withTargetResourceTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CisTargetResourceAggregation addTargetResourceTagsEntry(String key, java.util.List<String> value) {
        if (null == this.targetResourceTags) {
            this.targetResourceTags = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.targetResourceTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.targetResourceTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TargetResourceTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisTargetResourceAggregation clearTargetResourceTagsEntries() {
        this.targetResourceTags = null;
        return this;
    }

    /**
     * <p>
     * The status of the target resource.
     * </p>
     * 
     * @param targetStatus
     *        The status of the target resource.
     * @see CisTargetStatus
     */

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    /**
     * <p>
     * The status of the target resource.
     * </p>
     * 
     * @return The status of the target resource.
     * @see CisTargetStatus
     */

    public String getTargetStatus() {
        return this.targetStatus;
    }

    /**
     * <p>
     * The status of the target resource.
     * </p>
     * 
     * @param targetStatus
     *        The status of the target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisTargetStatus
     */

    public CisTargetResourceAggregation withTargetStatus(String targetStatus) {
        setTargetStatus(targetStatus);
        return this;
    }

    /**
     * <p>
     * The status of the target resource.
     * </p>
     * 
     * @param targetStatus
     *        The status of the target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisTargetStatus
     */

    public CisTargetResourceAggregation withTargetStatus(CisTargetStatus targetStatus) {
        this.targetStatus = targetStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the target resource.
     * </p>
     * 
     * @param targetStatusReason
     *        The reason for the target resource.
     * @see CisTargetStatusReason
     */

    public void setTargetStatusReason(String targetStatusReason) {
        this.targetStatusReason = targetStatusReason;
    }

    /**
     * <p>
     * The reason for the target resource.
     * </p>
     * 
     * @return The reason for the target resource.
     * @see CisTargetStatusReason
     */

    public String getTargetStatusReason() {
        return this.targetStatusReason;
    }

    /**
     * <p>
     * The reason for the target resource.
     * </p>
     * 
     * @param targetStatusReason
     *        The reason for the target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisTargetStatusReason
     */

    public CisTargetResourceAggregation withTargetStatusReason(String targetStatusReason) {
        setTargetStatusReason(targetStatusReason);
        return this;
    }

    /**
     * <p>
     * The reason for the target resource.
     * </p>
     * 
     * @param targetStatusReason
     *        The reason for the target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisTargetStatusReason
     */

    public CisTargetResourceAggregation withTargetStatusReason(CisTargetStatusReason targetStatusReason) {
        this.targetStatusReason = targetStatusReason.toString();
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getScanArn() != null)
            sb.append("ScanArn: ").append(getScanArn()).append(",");
        if (getStatusCounts() != null)
            sb.append("StatusCounts: ").append(getStatusCounts()).append(",");
        if (getTargetResourceId() != null)
            sb.append("TargetResourceId: ").append(getTargetResourceId()).append(",");
        if (getTargetResourceTags() != null)
            sb.append("TargetResourceTags: ").append(getTargetResourceTags()).append(",");
        if (getTargetStatus() != null)
            sb.append("TargetStatus: ").append(getTargetStatus()).append(",");
        if (getTargetStatusReason() != null)
            sb.append("TargetStatusReason: ").append(getTargetStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CisTargetResourceAggregation == false)
            return false;
        CisTargetResourceAggregation other = (CisTargetResourceAggregation) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getScanArn() == null ^ this.getScanArn() == null)
            return false;
        if (other.getScanArn() != null && other.getScanArn().equals(this.getScanArn()) == false)
            return false;
        if (other.getStatusCounts() == null ^ this.getStatusCounts() == null)
            return false;
        if (other.getStatusCounts() != null && other.getStatusCounts().equals(this.getStatusCounts()) == false)
            return false;
        if (other.getTargetResourceId() == null ^ this.getTargetResourceId() == null)
            return false;
        if (other.getTargetResourceId() != null && other.getTargetResourceId().equals(this.getTargetResourceId()) == false)
            return false;
        if (other.getTargetResourceTags() == null ^ this.getTargetResourceTags() == null)
            return false;
        if (other.getTargetResourceTags() != null && other.getTargetResourceTags().equals(this.getTargetResourceTags()) == false)
            return false;
        if (other.getTargetStatus() == null ^ this.getTargetStatus() == null)
            return false;
        if (other.getTargetStatus() != null && other.getTargetStatus().equals(this.getTargetStatus()) == false)
            return false;
        if (other.getTargetStatusReason() == null ^ this.getTargetStatusReason() == null)
            return false;
        if (other.getTargetStatusReason() != null && other.getTargetStatusReason().equals(this.getTargetStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getScanArn() == null) ? 0 : getScanArn().hashCode());
        hashCode = prime * hashCode + ((getStatusCounts() == null) ? 0 : getStatusCounts().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceId() == null) ? 0 : getTargetResourceId().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceTags() == null) ? 0 : getTargetResourceTags().hashCode());
        hashCode = prime * hashCode + ((getTargetStatus() == null) ? 0 : getTargetStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetStatusReason() == null) ? 0 : getTargetStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public CisTargetResourceAggregation clone() {
        try {
            return (CisTargetResourceAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CisTargetResourceAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
