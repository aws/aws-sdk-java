/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateAssessmentRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * Asessment ARN that you want to update.
     * </p>
     */
    private String assessmentArn;
    /**
     * <p>
     * Assessment name that you want to update.
     * </p>
     */
    private String assessmentName;
    /**
     * <p>
     * Assessment duration in seconds that you want to update. The default value
     * is 3600 seconds (one hour). The maximum value is 86400 seconds (one day).
     * </p>
     */
    private Integer durationInSeconds;

    /**
     * <p>
     * Asessment ARN that you want to update.
     * </p>
     * 
     * @param assessmentArn
     *        Asessment ARN that you want to update.
     */
    public void setAssessmentArn(String assessmentArn) {
        this.assessmentArn = assessmentArn;
    }

    /**
     * <p>
     * Asessment ARN that you want to update.
     * </p>
     * 
     * @return Asessment ARN that you want to update.
     */
    public String getAssessmentArn() {
        return this.assessmentArn;
    }

    /**
     * <p>
     * Asessment ARN that you want to update.
     * </p>
     * 
     * @param assessmentArn
     *        Asessment ARN that you want to update.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateAssessmentRequest withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
        return this;
    }

    /**
     * <p>
     * Assessment name that you want to update.
     * </p>
     * 
     * @param assessmentName
     *        Assessment name that you want to update.
     */
    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    /**
     * <p>
     * Assessment name that you want to update.
     * </p>
     * 
     * @return Assessment name that you want to update.
     */
    public String getAssessmentName() {
        return this.assessmentName;
    }

    /**
     * <p>
     * Assessment name that you want to update.
     * </p>
     * 
     * @param assessmentName
     *        Assessment name that you want to update.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateAssessmentRequest withAssessmentName(String assessmentName) {
        setAssessmentName(assessmentName);
        return this;
    }

    /**
     * <p>
     * Assessment duration in seconds that you want to update. The default value
     * is 3600 seconds (one hour). The maximum value is 86400 seconds (one day).
     * </p>
     * 
     * @param durationInSeconds
     *        Assessment duration in seconds that you want to update. The
     *        default value is 3600 seconds (one hour). The maximum value is
     *        86400 seconds (one day).
     */
    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * Assessment duration in seconds that you want to update. The default value
     * is 3600 seconds (one hour). The maximum value is 86400 seconds (one day).
     * </p>
     * 
     * @return Assessment duration in seconds that you want to update. The
     *         default value is 3600 seconds (one hour). The maximum value is
     *         86400 seconds (one day).
     */
    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * Assessment duration in seconds that you want to update. The default value
     * is 3600 seconds (one hour). The maximum value is 86400 seconds (one day).
     * </p>
     * 
     * @param durationInSeconds
     *        Assessment duration in seconds that you want to update. The
     *        default value is 3600 seconds (one hour). The maximum value is
     *        86400 seconds (one day).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateAssessmentRequest withDurationInSeconds(
            Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssessmentArn() != null)
            sb.append("AssessmentArn: " + getAssessmentArn() + ",");
        if (getAssessmentName() != null)
            sb.append("AssessmentName: " + getAssessmentName() + ",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: " + getDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssessmentRequest == false)
            return false;
        UpdateAssessmentRequest other = (UpdateAssessmentRequest) obj;
        if (other.getAssessmentArn() == null ^ this.getAssessmentArn() == null)
            return false;
        if (other.getAssessmentArn() != null
                && other.getAssessmentArn().equals(this.getAssessmentArn()) == false)
            return false;
        if (other.getAssessmentName() == null
                ^ this.getAssessmentName() == null)
            return false;
        if (other.getAssessmentName() != null
                && other.getAssessmentName().equals(this.getAssessmentName()) == false)
            return false;
        if (other.getDurationInSeconds() == null
                ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null
                && other.getDurationInSeconds().equals(
                        this.getDurationInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssessmentArn() == null) ? 0 : getAssessmentArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAssessmentName() == null) ? 0 : getAssessmentName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDurationInSeconds() == null) ? 0
                        : getDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssessmentRequest clone() {
        return (UpdateAssessmentRequest) super.clone();
    }
}