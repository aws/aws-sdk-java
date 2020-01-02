/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the detector (instance).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DetectorSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectorSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the detector model that created this detector (instance).
     * </p>
     */
    private String detectorModelName;
    /**
     * <p>
     * The value of the key (identifying the device or system) that caused the creation of this detector (instance).
     * </p>
     */
    private String keyValue;
    /**
     * <p>
     * The version of the detector model that created this detector (instance).
     * </p>
     */
    private String detectorModelVersion;
    /**
     * <p>
     * The current state of the detector (instance).
     * </p>
     */
    private DetectorStateSummary state;
    /**
     * <p>
     * The time the detector (instance) was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time the detector (instance) was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The name of the detector model that created this detector (instance).
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model that created this detector (instance).
     */

    public void setDetectorModelName(String detectorModelName) {
        this.detectorModelName = detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model that created this detector (instance).
     * </p>
     * 
     * @return The name of the detector model that created this detector (instance).
     */

    public String getDetectorModelName() {
        return this.detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model that created this detector (instance).
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model that created this detector (instance).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorSummary withDetectorModelName(String detectorModelName) {
        setDetectorModelName(detectorModelName);
        return this;
    }

    /**
     * <p>
     * The value of the key (identifying the device or system) that caused the creation of this detector (instance).
     * </p>
     * 
     * @param keyValue
     *        The value of the key (identifying the device or system) that caused the creation of this detector
     *        (instance).
     */

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    /**
     * <p>
     * The value of the key (identifying the device or system) that caused the creation of this detector (instance).
     * </p>
     * 
     * @return The value of the key (identifying the device or system) that caused the creation of this detector
     *         (instance).
     */

    public String getKeyValue() {
        return this.keyValue;
    }

    /**
     * <p>
     * The value of the key (identifying the device or system) that caused the creation of this detector (instance).
     * </p>
     * 
     * @param keyValue
     *        The value of the key (identifying the device or system) that caused the creation of this detector
     *        (instance).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorSummary withKeyValue(String keyValue) {
        setKeyValue(keyValue);
        return this;
    }

    /**
     * <p>
     * The version of the detector model that created this detector (instance).
     * </p>
     * 
     * @param detectorModelVersion
     *        The version of the detector model that created this detector (instance).
     */

    public void setDetectorModelVersion(String detectorModelVersion) {
        this.detectorModelVersion = detectorModelVersion;
    }

    /**
     * <p>
     * The version of the detector model that created this detector (instance).
     * </p>
     * 
     * @return The version of the detector model that created this detector (instance).
     */

    public String getDetectorModelVersion() {
        return this.detectorModelVersion;
    }

    /**
     * <p>
     * The version of the detector model that created this detector (instance).
     * </p>
     * 
     * @param detectorModelVersion
     *        The version of the detector model that created this detector (instance).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorSummary withDetectorModelVersion(String detectorModelVersion) {
        setDetectorModelVersion(detectorModelVersion);
        return this;
    }

    /**
     * <p>
     * The current state of the detector (instance).
     * </p>
     * 
     * @param state
     *        The current state of the detector (instance).
     */

    public void setState(DetectorStateSummary state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the detector (instance).
     * </p>
     * 
     * @return The current state of the detector (instance).
     */

    public DetectorStateSummary getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the detector (instance).
     * </p>
     * 
     * @param state
     *        The current state of the detector (instance).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorSummary withState(DetectorStateSummary state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The time the detector (instance) was created.
     * </p>
     * 
     * @param creationTime
     *        The time the detector (instance) was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the detector (instance) was created.
     * </p>
     * 
     * @return The time the detector (instance) was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the detector (instance) was created.
     * </p>
     * 
     * @param creationTime
     *        The time the detector (instance) was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time the detector (instance) was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time the detector (instance) was last updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The time the detector (instance) was last updated.
     * </p>
     * 
     * @return The time the detector (instance) was last updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The time the detector (instance) was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time the detector (instance) was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
        if (getDetectorModelName() != null)
            sb.append("DetectorModelName: ").append(getDetectorModelName()).append(",");
        if (getKeyValue() != null)
            sb.append("KeyValue: ").append(getKeyValue()).append(",");
        if (getDetectorModelVersion() != null)
            sb.append("DetectorModelVersion: ").append(getDetectorModelVersion()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectorSummary == false)
            return false;
        DetectorSummary other = (DetectorSummary) obj;
        if (other.getDetectorModelName() == null ^ this.getDetectorModelName() == null)
            return false;
        if (other.getDetectorModelName() != null && other.getDetectorModelName().equals(this.getDetectorModelName()) == false)
            return false;
        if (other.getKeyValue() == null ^ this.getKeyValue() == null)
            return false;
        if (other.getKeyValue() != null && other.getKeyValue().equals(this.getKeyValue()) == false)
            return false;
        if (other.getDetectorModelVersion() == null ^ this.getDetectorModelVersion() == null)
            return false;
        if (other.getDetectorModelVersion() != null && other.getDetectorModelVersion().equals(this.getDetectorModelVersion()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorModelName() == null) ? 0 : getDetectorModelName().hashCode());
        hashCode = prime * hashCode + ((getKeyValue() == null) ? 0 : getKeyValue().hashCode());
        hashCode = prime * hashCode + ((getDetectorModelVersion() == null) ? 0 : getDetectorModelVersion().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public DetectorSummary clone() {
        try {
            return (DetectorSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.DetectorSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
