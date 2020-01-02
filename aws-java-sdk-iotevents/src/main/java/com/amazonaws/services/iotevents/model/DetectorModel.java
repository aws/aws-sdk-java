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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DetectorModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectorModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information that defines how a detector operates.
     * </p>
     */
    private DetectorModelDefinition detectorModelDefinition;
    /**
     * <p>
     * Information about how the detector is configured.
     * </p>
     */
    private DetectorModelConfiguration detectorModelConfiguration;

    /**
     * <p>
     * Information that defines how a detector operates.
     * </p>
     * 
     * @param detectorModelDefinition
     *        Information that defines how a detector operates.
     */

    public void setDetectorModelDefinition(DetectorModelDefinition detectorModelDefinition) {
        this.detectorModelDefinition = detectorModelDefinition;
    }

    /**
     * <p>
     * Information that defines how a detector operates.
     * </p>
     * 
     * @return Information that defines how a detector operates.
     */

    public DetectorModelDefinition getDetectorModelDefinition() {
        return this.detectorModelDefinition;
    }

    /**
     * <p>
     * Information that defines how a detector operates.
     * </p>
     * 
     * @param detectorModelDefinition
     *        Information that defines how a detector operates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModel withDetectorModelDefinition(DetectorModelDefinition detectorModelDefinition) {
        setDetectorModelDefinition(detectorModelDefinition);
        return this;
    }

    /**
     * <p>
     * Information about how the detector is configured.
     * </p>
     * 
     * @param detectorModelConfiguration
     *        Information about how the detector is configured.
     */

    public void setDetectorModelConfiguration(DetectorModelConfiguration detectorModelConfiguration) {
        this.detectorModelConfiguration = detectorModelConfiguration;
    }

    /**
     * <p>
     * Information about how the detector is configured.
     * </p>
     * 
     * @return Information about how the detector is configured.
     */

    public DetectorModelConfiguration getDetectorModelConfiguration() {
        return this.detectorModelConfiguration;
    }

    /**
     * <p>
     * Information about how the detector is configured.
     * </p>
     * 
     * @param detectorModelConfiguration
     *        Information about how the detector is configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModel withDetectorModelConfiguration(DetectorModelConfiguration detectorModelConfiguration) {
        setDetectorModelConfiguration(detectorModelConfiguration);
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
        if (getDetectorModelDefinition() != null)
            sb.append("DetectorModelDefinition: ").append(getDetectorModelDefinition()).append(",");
        if (getDetectorModelConfiguration() != null)
            sb.append("DetectorModelConfiguration: ").append(getDetectorModelConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectorModel == false)
            return false;
        DetectorModel other = (DetectorModel) obj;
        if (other.getDetectorModelDefinition() == null ^ this.getDetectorModelDefinition() == null)
            return false;
        if (other.getDetectorModelDefinition() != null && other.getDetectorModelDefinition().equals(this.getDetectorModelDefinition()) == false)
            return false;
        if (other.getDetectorModelConfiguration() == null ^ this.getDetectorModelConfiguration() == null)
            return false;
        if (other.getDetectorModelConfiguration() != null && other.getDetectorModelConfiguration().equals(this.getDetectorModelConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorModelDefinition() == null) ? 0 : getDetectorModelDefinition().hashCode());
        hashCode = prime * hashCode + ((getDetectorModelConfiguration() == null) ? 0 : getDetectorModelConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DetectorModel clone() {
        try {
            return (DetectorModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.DetectorModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
