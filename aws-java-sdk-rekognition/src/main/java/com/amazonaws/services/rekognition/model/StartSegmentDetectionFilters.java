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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filters applied to the technical cue or shot detection segments. For more information, see
 * <a>StartSegmentDetection</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSegmentDetectionFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters that are specific to technical cues.
     * </p>
     */
    private StartTechnicalCueDetectionFilter technicalCueFilter;
    /**
     * <p>
     * Filters that are specific to shot detections.
     * </p>
     */
    private StartShotDetectionFilter shotFilter;

    /**
     * <p>
     * Filters that are specific to technical cues.
     * </p>
     * 
     * @param technicalCueFilter
     *        Filters that are specific to technical cues.
     */

    public void setTechnicalCueFilter(StartTechnicalCueDetectionFilter technicalCueFilter) {
        this.technicalCueFilter = technicalCueFilter;
    }

    /**
     * <p>
     * Filters that are specific to technical cues.
     * </p>
     * 
     * @return Filters that are specific to technical cues.
     */

    public StartTechnicalCueDetectionFilter getTechnicalCueFilter() {
        return this.technicalCueFilter;
    }

    /**
     * <p>
     * Filters that are specific to technical cues.
     * </p>
     * 
     * @param technicalCueFilter
     *        Filters that are specific to technical cues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSegmentDetectionFilters withTechnicalCueFilter(StartTechnicalCueDetectionFilter technicalCueFilter) {
        setTechnicalCueFilter(technicalCueFilter);
        return this;
    }

    /**
     * <p>
     * Filters that are specific to shot detections.
     * </p>
     * 
     * @param shotFilter
     *        Filters that are specific to shot detections.
     */

    public void setShotFilter(StartShotDetectionFilter shotFilter) {
        this.shotFilter = shotFilter;
    }

    /**
     * <p>
     * Filters that are specific to shot detections.
     * </p>
     * 
     * @return Filters that are specific to shot detections.
     */

    public StartShotDetectionFilter getShotFilter() {
        return this.shotFilter;
    }

    /**
     * <p>
     * Filters that are specific to shot detections.
     * </p>
     * 
     * @param shotFilter
     *        Filters that are specific to shot detections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSegmentDetectionFilters withShotFilter(StartShotDetectionFilter shotFilter) {
        setShotFilter(shotFilter);
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
        if (getTechnicalCueFilter() != null)
            sb.append("TechnicalCueFilter: ").append(getTechnicalCueFilter()).append(",");
        if (getShotFilter() != null)
            sb.append("ShotFilter: ").append(getShotFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSegmentDetectionFilters == false)
            return false;
        StartSegmentDetectionFilters other = (StartSegmentDetectionFilters) obj;
        if (other.getTechnicalCueFilter() == null ^ this.getTechnicalCueFilter() == null)
            return false;
        if (other.getTechnicalCueFilter() != null && other.getTechnicalCueFilter().equals(this.getTechnicalCueFilter()) == false)
            return false;
        if (other.getShotFilter() == null ^ this.getShotFilter() == null)
            return false;
        if (other.getShotFilter() != null && other.getShotFilter().equals(this.getShotFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTechnicalCueFilter() == null) ? 0 : getTechnicalCueFilter().hashCode());
        hashCode = prime * hashCode + ((getShotFilter() == null) ? 0 : getShotFilter().hashCode());
        return hashCode;
    }

    @Override
    public StartSegmentDetectionFilters clone() {
        try {
            return (StartSegmentDetectionFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.StartSegmentDetectionFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
