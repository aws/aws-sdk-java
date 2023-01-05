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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateEphemeris" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEphemerisRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Whether to set the ephemeris status to <code>ENABLED</code> after validation.
     * </p>
     * <p>
     * Setting this to false will set the ephemeris status to <code>DISABLED</code> after validation.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Ephemeris data.
     * </p>
     */
    private EphemerisData ephemeris;
    /**
     * <p>
     * An overall expiration time for the ephemeris in UTC, after which it will become <code>EXPIRED</code>.
     * </p>
     */
    private java.util.Date expirationTime;
    /**
     * <p>
     * The ARN of a KMS key used to encrypt the ephemeris in Ground Station.
     * </p>
     */
    private String kmsKeyArn;
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
     * AWS Ground Station satellite ID for this ephemeris.
     * </p>
     */
    private String satelliteId;
    /**
     * <p>
     * Tags assigned to an ephemeris.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Whether to set the ephemeris status to <code>ENABLED</code> after validation.
     * </p>
     * <p>
     * Setting this to false will set the ephemeris status to <code>DISABLED</code> after validation.
     * </p>
     * 
     * @param enabled
     *        Whether to set the ephemeris status to <code>ENABLED</code> after validation.</p>
     *        <p>
     *        Setting this to false will set the ephemeris status to <code>DISABLED</code> after validation.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether to set the ephemeris status to <code>ENABLED</code> after validation.
     * </p>
     * <p>
     * Setting this to false will set the ephemeris status to <code>DISABLED</code> after validation.
     * </p>
     * 
     * @return Whether to set the ephemeris status to <code>ENABLED</code> after validation.</p>
     *         <p>
     *         Setting this to false will set the ephemeris status to <code>DISABLED</code> after validation.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether to set the ephemeris status to <code>ENABLED</code> after validation.
     * </p>
     * <p>
     * Setting this to false will set the ephemeris status to <code>DISABLED</code> after validation.
     * </p>
     * 
     * @param enabled
     *        Whether to set the ephemeris status to <code>ENABLED</code> after validation.</p>
     *        <p>
     *        Setting this to false will set the ephemeris status to <code>DISABLED</code> after validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEphemerisRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether to set the ephemeris status to <code>ENABLED</code> after validation.
     * </p>
     * <p>
     * Setting this to false will set the ephemeris status to <code>DISABLED</code> after validation.
     * </p>
     * 
     * @return Whether to set the ephemeris status to <code>ENABLED</code> after validation.</p>
     *         <p>
     *         Setting this to false will set the ephemeris status to <code>DISABLED</code> after validation.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Ephemeris data.
     * </p>
     * 
     * @param ephemeris
     *        Ephemeris data.
     */

    public void setEphemeris(EphemerisData ephemeris) {
        this.ephemeris = ephemeris;
    }

    /**
     * <p>
     * Ephemeris data.
     * </p>
     * 
     * @return Ephemeris data.
     */

    public EphemerisData getEphemeris() {
        return this.ephemeris;
    }

    /**
     * <p>
     * Ephemeris data.
     * </p>
     * 
     * @param ephemeris
     *        Ephemeris data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEphemerisRequest withEphemeris(EphemerisData ephemeris) {
        setEphemeris(ephemeris);
        return this;
    }

    /**
     * <p>
     * An overall expiration time for the ephemeris in UTC, after which it will become <code>EXPIRED</code>.
     * </p>
     * 
     * @param expirationTime
     *        An overall expiration time for the ephemeris in UTC, after which it will become <code>EXPIRED</code>.
     */

    public void setExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * An overall expiration time for the ephemeris in UTC, after which it will become <code>EXPIRED</code>.
     * </p>
     * 
     * @return An overall expiration time for the ephemeris in UTC, after which it will become <code>EXPIRED</code>.
     */

    public java.util.Date getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * <p>
     * An overall expiration time for the ephemeris in UTC, after which it will become <code>EXPIRED</code>.
     * </p>
     * 
     * @param expirationTime
     *        An overall expiration time for the ephemeris in UTC, after which it will become <code>EXPIRED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEphemerisRequest withExpirationTime(java.util.Date expirationTime) {
        setExpirationTime(expirationTime);
        return this;
    }

    /**
     * <p>
     * The ARN of a KMS key used to encrypt the ephemeris in Ground Station.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of a KMS key used to encrypt the ephemeris in Ground Station.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of a KMS key used to encrypt the ephemeris in Ground Station.
     * </p>
     * 
     * @return The ARN of a KMS key used to encrypt the ephemeris in Ground Station.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of a KMS key used to encrypt the ephemeris in Ground Station.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of a KMS key used to encrypt the ephemeris in Ground Station.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEphemerisRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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

    public CreateEphemerisRequest withName(String name) {
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

    public CreateEphemerisRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * AWS Ground Station satellite ID for this ephemeris.
     * </p>
     * 
     * @param satelliteId
     *        AWS Ground Station satellite ID for this ephemeris.
     */

    public void setSatelliteId(String satelliteId) {
        this.satelliteId = satelliteId;
    }

    /**
     * <p>
     * AWS Ground Station satellite ID for this ephemeris.
     * </p>
     * 
     * @return AWS Ground Station satellite ID for this ephemeris.
     */

    public String getSatelliteId() {
        return this.satelliteId;
    }

    /**
     * <p>
     * AWS Ground Station satellite ID for this ephemeris.
     * </p>
     * 
     * @param satelliteId
     *        AWS Ground Station satellite ID for this ephemeris.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEphemerisRequest withSatelliteId(String satelliteId) {
        setSatelliteId(satelliteId);
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

    public CreateEphemerisRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateEphemerisRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateEphemerisRequest addTagsEntry(String key, String value) {
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

    public CreateEphemerisRequest clearTagsEntries() {
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getEphemeris() != null)
            sb.append("Ephemeris: ").append(getEphemeris()).append(",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: ").append(getExpirationTime()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getSatelliteId() != null)
            sb.append("SatelliteId: ").append(getSatelliteId()).append(",");
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

        if (obj instanceof CreateEphemerisRequest == false)
            return false;
        CreateEphemerisRequest other = (CreateEphemerisRequest) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getEphemeris() == null ^ this.getEphemeris() == null)
            return false;
        if (other.getEphemeris() != null && other.getEphemeris().equals(this.getEphemeris()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
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

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getEphemeris() == null) ? 0 : getEphemeris().hashCode());
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getSatelliteId() == null) ? 0 : getSatelliteId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEphemerisRequest clone() {
        return (CreateEphemerisRequest) super.clone();
    }

}
