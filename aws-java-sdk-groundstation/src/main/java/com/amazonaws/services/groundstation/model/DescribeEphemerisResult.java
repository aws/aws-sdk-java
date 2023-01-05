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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DescribeEphemeris" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEphemerisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time the ephemeris was uploaded in UTC.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Whether or not the ephemeris is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The AWS Ground Station ephemeris ID.
     * </p>
     */
    private String ephemerisId;
    /**
     * <p>
     * Reason that an ephemeris failed validation. Only provided for ephemerides with <code>INVALID</code> status.
     * </p>
     */
    private String invalidReason;
    /**
     * <p>
     * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Customer-provided priority score to establish the order in which overlapping ephemerides should be used.
     * </p>
     * <p>
     * The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     * </p>
     * <p>
     * Priority must be 1 or greater
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The AWS Ground Station satellite ID associated with ephemeris.
     * </p>
     */
    private String satelliteId;
    /**
     * <p>
     * The status of the ephemeris.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Supplied ephemeris data.
     * </p>
     */
    private EphemerisTypeDescription suppliedData;
    /**
     * <p>
     * Tags assigned to an ephemeris.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The time the ephemeris was uploaded in UTC.
     * </p>
     * 
     * @param creationTime
     *        The time the ephemeris was uploaded in UTC.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the ephemeris was uploaded in UTC.
     * </p>
     * 
     * @return The time the ephemeris was uploaded in UTC.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the ephemeris was uploaded in UTC.
     * </p>
     * 
     * @param creationTime
     *        The time the ephemeris was uploaded in UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEphemerisResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Whether or not the ephemeris is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether or not the ephemeris is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether or not the ephemeris is enabled.
     * </p>
     * 
     * @return Whether or not the ephemeris is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether or not the ephemeris is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether or not the ephemeris is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEphemerisResult withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether or not the ephemeris is enabled.
     * </p>
     * 
     * @return Whether or not the ephemeris is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The AWS Ground Station ephemeris ID.
     * </p>
     * 
     * @param ephemerisId
     *        The AWS Ground Station ephemeris ID.
     */

    public void setEphemerisId(String ephemerisId) {
        this.ephemerisId = ephemerisId;
    }

    /**
     * <p>
     * The AWS Ground Station ephemeris ID.
     * </p>
     * 
     * @return The AWS Ground Station ephemeris ID.
     */

    public String getEphemerisId() {
        return this.ephemerisId;
    }

    /**
     * <p>
     * The AWS Ground Station ephemeris ID.
     * </p>
     * 
     * @param ephemerisId
     *        The AWS Ground Station ephemeris ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEphemerisResult withEphemerisId(String ephemerisId) {
        setEphemerisId(ephemerisId);
        return this;
    }

    /**
     * <p>
     * Reason that an ephemeris failed validation. Only provided for ephemerides with <code>INVALID</code> status.
     * </p>
     * 
     * @param invalidReason
     *        Reason that an ephemeris failed validation. Only provided for ephemerides with <code>INVALID</code>
     *        status.
     * @see EphemerisInvalidReason
     */

    public void setInvalidReason(String invalidReason) {
        this.invalidReason = invalidReason;
    }

    /**
     * <p>
     * Reason that an ephemeris failed validation. Only provided for ephemerides with <code>INVALID</code> status.
     * </p>
     * 
     * @return Reason that an ephemeris failed validation. Only provided for ephemerides with <code>INVALID</code>
     *         status.
     * @see EphemerisInvalidReason
     */

    public String getInvalidReason() {
        return this.invalidReason;
    }

    /**
     * <p>
     * Reason that an ephemeris failed validation. Only provided for ephemerides with <code>INVALID</code> status.
     * </p>
     * 
     * @param invalidReason
     *        Reason that an ephemeris failed validation. Only provided for ephemerides with <code>INVALID</code>
     *        status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EphemerisInvalidReason
     */

    public DescribeEphemerisResult withInvalidReason(String invalidReason) {
        setInvalidReason(invalidReason);
        return this;
    }

    /**
     * <p>
     * Reason that an ephemeris failed validation. Only provided for ephemerides with <code>INVALID</code> status.
     * </p>
     * 
     * @param invalidReason
     *        Reason that an ephemeris failed validation. Only provided for ephemerides with <code>INVALID</code>
     *        status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EphemerisInvalidReason
     */

    public DescribeEphemerisResult withInvalidReason(EphemerisInvalidReason invalidReason) {
        this.invalidReason = invalidReason.toString();
        return this;
    }

    /**
     * <p>
     * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * </p>
     * 
     * @param name
     *        A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * </p>
     * 
     * @return A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * </p>
     * 
     * @param name
     *        A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEphemerisResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Customer-provided priority score to establish the order in which overlapping ephemerides should be used.
     * </p>
     * <p>
     * The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     * </p>
     * <p>
     * Priority must be 1 or greater
     * </p>
     * 
     * @param priority
     *        Customer-provided priority score to establish the order in which overlapping ephemerides should be
     *        used.</p>
     *        <p>
     *        The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     *        </p>
     *        <p>
     *        Priority must be 1 or greater
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Customer-provided priority score to establish the order in which overlapping ephemerides should be used.
     * </p>
     * <p>
     * The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     * </p>
     * <p>
     * Priority must be 1 or greater
     * </p>
     * 
     * @return Customer-provided priority score to establish the order in which overlapping ephemerides should be
     *         used.</p>
     *         <p>
     *         The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     *         </p>
     *         <p>
     *         Priority must be 1 or greater
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * Customer-provided priority score to establish the order in which overlapping ephemerides should be used.
     * </p>
     * <p>
     * The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     * </p>
     * <p>
     * Priority must be 1 or greater
     * </p>
     * 
     * @param priority
     *        Customer-provided priority score to establish the order in which overlapping ephemerides should be
     *        used.</p>
     *        <p>
     *        The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     *        </p>
     *        <p>
     *        Priority must be 1 or greater
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEphemerisResult withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The AWS Ground Station satellite ID associated with ephemeris.
     * </p>
     * 
     * @param satelliteId
     *        The AWS Ground Station satellite ID associated with ephemeris.
     */

    public void setSatelliteId(String satelliteId) {
        this.satelliteId = satelliteId;
    }

    /**
     * <p>
     * The AWS Ground Station satellite ID associated with ephemeris.
     * </p>
     * 
     * @return The AWS Ground Station satellite ID associated with ephemeris.
     */

    public String getSatelliteId() {
        return this.satelliteId;
    }

    /**
     * <p>
     * The AWS Ground Station satellite ID associated with ephemeris.
     * </p>
     * 
     * @param satelliteId
     *        The AWS Ground Station satellite ID associated with ephemeris.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEphemerisResult withSatelliteId(String satelliteId) {
        setSatelliteId(satelliteId);
        return this;
    }

    /**
     * <p>
     * The status of the ephemeris.
     * </p>
     * 
     * @param status
     *        The status of the ephemeris.
     * @see EphemerisStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the ephemeris.
     * </p>
     * 
     * @return The status of the ephemeris.
     * @see EphemerisStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the ephemeris.
     * </p>
     * 
     * @param status
     *        The status of the ephemeris.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EphemerisStatus
     */

    public DescribeEphemerisResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the ephemeris.
     * </p>
     * 
     * @param status
     *        The status of the ephemeris.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EphemerisStatus
     */

    public DescribeEphemerisResult withStatus(EphemerisStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Supplied ephemeris data.
     * </p>
     * 
     * @param suppliedData
     *        Supplied ephemeris data.
     */

    public void setSuppliedData(EphemerisTypeDescription suppliedData) {
        this.suppliedData = suppliedData;
    }

    /**
     * <p>
     * Supplied ephemeris data.
     * </p>
     * 
     * @return Supplied ephemeris data.
     */

    public EphemerisTypeDescription getSuppliedData() {
        return this.suppliedData;
    }

    /**
     * <p>
     * Supplied ephemeris data.
     * </p>
     * 
     * @param suppliedData
     *        Supplied ephemeris data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEphemerisResult withSuppliedData(EphemerisTypeDescription suppliedData) {
        setSuppliedData(suppliedData);
        return this;
    }

    /**
     * <p>
     * Tags assigned to an ephemeris.
     * </p>
     * 
     * @return Tags assigned to an ephemeris.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags assigned to an ephemeris.
     * </p>
     * 
     * @param tags
     *        Tags assigned to an ephemeris.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags assigned to an ephemeris.
     * </p>
     * 
     * @param tags
     *        Tags assigned to an ephemeris.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEphemerisResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeEphemerisResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEphemerisResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEphemerisResult clearTagsEntries() {
        this.tags = null;
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getEphemerisId() != null)
            sb.append("EphemerisId: ").append(getEphemerisId()).append(",");
        if (getInvalidReason() != null)
            sb.append("InvalidReason: ").append(getInvalidReason()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getSatelliteId() != null)
            sb.append("SatelliteId: ").append(getSatelliteId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSuppliedData() != null)
            sb.append("SuppliedData: ").append(getSuppliedData()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEphemerisResult == false)
            return false;
        DescribeEphemerisResult other = (DescribeEphemerisResult) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getEphemerisId() == null ^ this.getEphemerisId() == null)
            return false;
        if (other.getEphemerisId() != null && other.getEphemerisId().equals(this.getEphemerisId()) == false)
            return false;
        if (other.getInvalidReason() == null ^ this.getInvalidReason() == null)
            return false;
        if (other.getInvalidReason() != null && other.getInvalidReason().equals(this.getInvalidReason()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getSatelliteId() == null ^ this.getSatelliteId() == null)
            return false;
        if (other.getSatelliteId() != null && other.getSatelliteId().equals(this.getSatelliteId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSuppliedData() == null ^ this.getSuppliedData() == null)
            return false;
        if (other.getSuppliedData() != null && other.getSuppliedData().equals(this.getSuppliedData()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getEphemerisId() == null) ? 0 : getEphemerisId().hashCode());
        hashCode = prime * hashCode + ((getInvalidReason() == null) ? 0 : getInvalidReason().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getSatelliteId() == null) ? 0 : getSatelliteId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSuppliedData() == null) ? 0 : getSuppliedData().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEphemerisResult clone() {
        try {
            return (DescribeEphemerisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
