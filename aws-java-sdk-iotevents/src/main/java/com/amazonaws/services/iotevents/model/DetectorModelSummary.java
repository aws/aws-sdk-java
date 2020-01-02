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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the detector model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DetectorModelSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectorModelSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the detector model.
     * </p>
     */
    private String detectorModelName;
    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     */
    private String detectorModelDescription;
    /**
     * <p>
     * The time the detector model was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model.
     */

    public void setDetectorModelName(String detectorModelName) {
        this.detectorModelName = detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * 
     * @return The name of the detector model.
     */

    public String getDetectorModelName() {
        return this.detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModelSummary withDetectorModelName(String detectorModelName) {
        setDetectorModelName(detectorModelName);
        return this;
    }

    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     * 
     * @param detectorModelDescription
     *        A brief description of the detector model.
     */

    public void setDetectorModelDescription(String detectorModelDescription) {
        this.detectorModelDescription = detectorModelDescription;
    }

    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     * 
     * @return A brief description of the detector model.
     */

    public String getDetectorModelDescription() {
        return this.detectorModelDescription;
    }

    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     * 
     * @param detectorModelDescription
     *        A brief description of the detector model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModelSummary withDetectorModelDescription(String detectorModelDescription) {
        setDetectorModelDescription(detectorModelDescription);
        return this;
    }

    /**
     * <p>
     * The time the detector model was created.
     * </p>
     * 
     * @param creationTime
     *        The time the detector model was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the detector model was created.
     * </p>
     * 
     * @return The time the detector model was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the detector model was created.
     * </p>
     * 
     * @param creationTime
     *        The time the detector model was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModelSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getDetectorModelDescription() != null)
            sb.append("DetectorModelDescription: ").append(getDetectorModelDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectorModelSummary == false)
            return false;
        DetectorModelSummary other = (DetectorModelSummary) obj;
        if (other.getDetectorModelName() == null ^ this.getDetectorModelName() == null)
            return false;
        if (other.getDetectorModelName() != null && other.getDetectorModelName().equals(this.getDetectorModelName()) == false)
            return false;
        if (other.getDetectorModelDescription() == null ^ this.getDetectorModelDescription() == null)
            return false;
        if (other.getDetectorModelDescription() != null && other.getDetectorModelDescription().equals(this.getDetectorModelDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorModelName() == null) ? 0 : getDetectorModelName().hashCode());
        hashCode = prime * hashCode + ((getDetectorModelDescription() == null) ? 0 : getDetectorModelDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public DetectorModelSummary clone() {
        try {
            return (DetectorModelSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.DetectorModelSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
