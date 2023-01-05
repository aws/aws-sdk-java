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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Ephemeris item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/EphemerisItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EphemerisItem implements Serializable, Cloneable, StructuredPojo {

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
     * Source S3 object used for the ephemeris.
     * </p>
     */
    private S3Object sourceS3Object;
    /**
     * <p>
     * The status of the ephemeris.
     * </p>
     */
    private String status;

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

    public EphemerisItem withCreationTime(java.util.Date creationTime) {
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

    public EphemerisItem withEnabled(Boolean enabled) {
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

    public EphemerisItem withEphemerisId(String ephemerisId) {
        setEphemerisId(ephemerisId);
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

    public EphemerisItem withName(String name) {
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

    public EphemerisItem withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * Source S3 object used for the ephemeris.
     * </p>
     * 
     * @param sourceS3Object
     *        Source S3 object used for the ephemeris.
     */

    public void setSourceS3Object(S3Object sourceS3Object) {
        this.sourceS3Object = sourceS3Object;
    }

    /**
     * <p>
     * Source S3 object used for the ephemeris.
     * </p>
     * 
     * @return Source S3 object used for the ephemeris.
     */

    public S3Object getSourceS3Object() {
        return this.sourceS3Object;
    }

    /**
     * <p>
     * Source S3 object used for the ephemeris.
     * </p>
     * 
     * @param sourceS3Object
     *        Source S3 object used for the ephemeris.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EphemerisItem withSourceS3Object(S3Object sourceS3Object) {
        setSourceS3Object(sourceS3Object);
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

    public EphemerisItem withStatus(String status) {
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

    public EphemerisItem withStatus(EphemerisStatus status) {
        this.status = status.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getSourceS3Object() != null)
            sb.append("SourceS3Object: ").append(getSourceS3Object()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EphemerisItem == false)
            return false;
        EphemerisItem other = (EphemerisItem) obj;
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getSourceS3Object() == null ^ this.getSourceS3Object() == null)
            return false;
        if (other.getSourceS3Object() != null && other.getSourceS3Object().equals(this.getSourceS3Object()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getSourceS3Object() == null) ? 0 : getSourceS3Object().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public EphemerisItem clone() {
        try {
            return (EphemerisItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.EphemerisItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
