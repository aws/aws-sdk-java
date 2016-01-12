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

/**
 * <p>
 * This data type is used as the request parameter in the <a>ListAssessments</a>
 * and <a>ListAttachedAssessments</a> actions.
 * </p>
 */
public class AssessmentsFilter implements Serializable, Cloneable {

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>assessmentName</b> property of the <a>Assessment</a> data type.
     * </p>
     */
    private java.util.List<String> assessmentNamePatterns;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>assessmentState</b> property of the <a>Assessment</a> data type.
     * </p>
     */
    private java.util.List<String> assessmentStates;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>dataCollected</b>
     * property of the <a>Assessment</a> data type.
     * </p>
     */
    private Boolean dataCollected;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>startTime</b> property of the
     * <a>Assessment</a> data type.
     * </p>
     */
    private TimestampRange startTimeRange;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>endTime</b> property of the
     * <a>Assessment</a> data type.
     * </p>
     */
    private TimestampRange endTimeRange;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>durationInSeconds</b> property of the
     * <a>Assessment</a> data type.
     * </p>
     */
    private DurationRange durationRange;

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>assessmentName</b> property of the <a>Assessment</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, an explicit value or a string
     *         containing a wildcard specified for this data type property must
     *         match the value of the <b>assessmentName</b> property of the
     *         <a>Assessment</a> data type.
     */
    public java.util.List<String> getAssessmentNamePatterns() {
        return assessmentNamePatterns;
    }

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>assessmentName</b> property of the <a>Assessment</a> data type.
     * </p>
     * 
     * @param assessmentNamePatterns
     *        For a record to match a filter, an explicit value or a string
     *        containing a wildcard specified for this data type property must
     *        match the value of the <b>assessmentName</b> property of the
     *        <a>Assessment</a> data type.
     */
    public void setAssessmentNamePatterns(
            java.util.Collection<String> assessmentNamePatterns) {
        if (assessmentNamePatterns == null) {
            this.assessmentNamePatterns = null;
            return;
        }

        this.assessmentNamePatterns = new java.util.ArrayList<String>(
                assessmentNamePatterns);
    }

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>assessmentName</b> property of the <a>Assessment</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAssessmentNamePatterns(java.util.Collection)} or
     * {@link #withAssessmentNamePatterns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param assessmentNamePatterns
     *        For a record to match a filter, an explicit value or a string
     *        containing a wildcard specified for this data type property must
     *        match the value of the <b>assessmentName</b> property of the
     *        <a>Assessment</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssessmentsFilter withAssessmentNamePatterns(
            String... assessmentNamePatterns) {
        if (this.assessmentNamePatterns == null) {
            setAssessmentNamePatterns(new java.util.ArrayList<String>(
                    assessmentNamePatterns.length));
        }
        for (String ele : assessmentNamePatterns) {
            this.assessmentNamePatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>assessmentName</b> property of the <a>Assessment</a> data type.
     * </p>
     * 
     * @param assessmentNamePatterns
     *        For a record to match a filter, an explicit value or a string
     *        containing a wildcard specified for this data type property must
     *        match the value of the <b>assessmentName</b> property of the
     *        <a>Assessment</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssessmentsFilter withAssessmentNamePatterns(
            java.util.Collection<String> assessmentNamePatterns) {
        setAssessmentNamePatterns(assessmentNamePatterns);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>assessmentState</b> property of the <a>Assessment</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must be the exact match of the value of the
     *         <b>assessmentState</b> property of the <a>Assessment</a> data
     *         type.
     */
    public java.util.List<String> getAssessmentStates() {
        return assessmentStates;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>assessmentState</b> property of the <a>Assessment</a> data type.
     * </p>
     * 
     * @param assessmentStates
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>assessmentState</b> property of the <a>Assessment</a> data
     *        type.
     */
    public void setAssessmentStates(
            java.util.Collection<String> assessmentStates) {
        if (assessmentStates == null) {
            this.assessmentStates = null;
            return;
        }

        this.assessmentStates = new java.util.ArrayList<String>(
                assessmentStates);
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>assessmentState</b> property of the <a>Assessment</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAssessmentStates(java.util.Collection)} or
     * {@link #withAssessmentStates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param assessmentStates
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>assessmentState</b> property of the <a>Assessment</a> data
     *        type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssessmentsFilter withAssessmentStates(String... assessmentStates) {
        if (this.assessmentStates == null) {
            setAssessmentStates(new java.util.ArrayList<String>(
                    assessmentStates.length));
        }
        for (String ele : assessmentStates) {
            this.assessmentStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>assessmentState</b> property of the <a>Assessment</a> data type.
     * </p>
     * 
     * @param assessmentStates
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>assessmentState</b> property of the <a>Assessment</a> data
     *        type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssessmentsFilter withAssessmentStates(
            java.util.Collection<String> assessmentStates) {
        setAssessmentStates(assessmentStates);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>dataCollected</b>
     * property of the <a>Assessment</a> data type.
     * </p>
     * 
     * @param dataCollected
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>dataCollected</b> property of the <a>Assessment</a> data type.
     */
    public void setDataCollected(Boolean dataCollected) {
        this.dataCollected = dataCollected;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>dataCollected</b>
     * property of the <a>Assessment</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must be the exact match of the value of the
     *         <b>dataCollected</b> property of the <a>Assessment</a> data type.
     */
    public Boolean getDataCollected() {
        return this.dataCollected;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>dataCollected</b>
     * property of the <a>Assessment</a> data type.
     * </p>
     * 
     * @param dataCollected
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>dataCollected</b> property of the <a>Assessment</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssessmentsFilter withDataCollected(Boolean dataCollected) {
        setDataCollected(dataCollected);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>dataCollected</b>
     * property of the <a>Assessment</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must be the exact match of the value of the
     *         <b>dataCollected</b> property of the <a>Assessment</a> data type.
     */
    public Boolean isDataCollected() {
        return this.dataCollected;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>startTime</b> property of the
     * <a>Assessment</a> data type.
     * </p>
     * 
     * @param startTimeRange
     *        For a record to match a filter, the value specified for this data
     *        type property must inclusively match any value between the
     *        specified minimum and maximum values of the <b>startTime</b>
     *        property of the <a>Assessment</a> data type.
     */
    public void setStartTimeRange(TimestampRange startTimeRange) {
        this.startTimeRange = startTimeRange;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>startTime</b> property of the
     * <a>Assessment</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must inclusively match any value between the
     *         specified minimum and maximum values of the <b>startTime</b>
     *         property of the <a>Assessment</a> data type.
     */
    public TimestampRange getStartTimeRange() {
        return this.startTimeRange;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>startTime</b> property of the
     * <a>Assessment</a> data type.
     * </p>
     * 
     * @param startTimeRange
     *        For a record to match a filter, the value specified for this data
     *        type property must inclusively match any value between the
     *        specified minimum and maximum values of the <b>startTime</b>
     *        property of the <a>Assessment</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssessmentsFilter withStartTimeRange(TimestampRange startTimeRange) {
        setStartTimeRange(startTimeRange);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>endTime</b> property of the
     * <a>Assessment</a> data type.
     * </p>
     * 
     * @param endTimeRange
     *        For a record to match a filter, the value specified for this data
     *        type property must inclusively match any value between the
     *        specified minimum and maximum values of the <b>endTime</b>
     *        property of the <a>Assessment</a> data type.
     */
    public void setEndTimeRange(TimestampRange endTimeRange) {
        this.endTimeRange = endTimeRange;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>endTime</b> property of the
     * <a>Assessment</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must inclusively match any value between the
     *         specified minimum and maximum values of the <b>endTime</b>
     *         property of the <a>Assessment</a> data type.
     */
    public TimestampRange getEndTimeRange() {
        return this.endTimeRange;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>endTime</b> property of the
     * <a>Assessment</a> data type.
     * </p>
     * 
     * @param endTimeRange
     *        For a record to match a filter, the value specified for this data
     *        type property must inclusively match any value between the
     *        specified minimum and maximum values of the <b>endTime</b>
     *        property of the <a>Assessment</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssessmentsFilter withEndTimeRange(TimestampRange endTimeRange) {
        setEndTimeRange(endTimeRange);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>durationInSeconds</b> property of the
     * <a>Assessment</a> data type.
     * </p>
     * 
     * @param durationRange
     *        For a record to match a filter, the value specified for this data
     *        type property must inclusively match any value between the
     *        specified minimum and maximum values of the
     *        <b>durationInSeconds</b> property of the <a>Assessment</a> data
     *        type.
     */
    public void setDurationRange(DurationRange durationRange) {
        this.durationRange = durationRange;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>durationInSeconds</b> property of the
     * <a>Assessment</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must inclusively match any value between the
     *         specified minimum and maximum values of the
     *         <b>durationInSeconds</b> property of the <a>Assessment</a> data
     *         type.
     */
    public DurationRange getDurationRange() {
        return this.durationRange;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>durationInSeconds</b> property of the
     * <a>Assessment</a> data type.
     * </p>
     * 
     * @param durationRange
     *        For a record to match a filter, the value specified for this data
     *        type property must inclusively match any value between the
     *        specified minimum and maximum values of the
     *        <b>durationInSeconds</b> property of the <a>Assessment</a> data
     *        type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssessmentsFilter withDurationRange(DurationRange durationRange) {
        setDurationRange(durationRange);
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
        if (getAssessmentNamePatterns() != null)
            sb.append("AssessmentNamePatterns: " + getAssessmentNamePatterns()
                    + ",");
        if (getAssessmentStates() != null)
            sb.append("AssessmentStates: " + getAssessmentStates() + ",");
        if (getDataCollected() != null)
            sb.append("DataCollected: " + getDataCollected() + ",");
        if (getStartTimeRange() != null)
            sb.append("StartTimeRange: " + getStartTimeRange() + ",");
        if (getEndTimeRange() != null)
            sb.append("EndTimeRange: " + getEndTimeRange() + ",");
        if (getDurationRange() != null)
            sb.append("DurationRange: " + getDurationRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentsFilter == false)
            return false;
        AssessmentsFilter other = (AssessmentsFilter) obj;
        if (other.getAssessmentNamePatterns() == null
                ^ this.getAssessmentNamePatterns() == null)
            return false;
        if (other.getAssessmentNamePatterns() != null
                && other.getAssessmentNamePatterns().equals(
                        this.getAssessmentNamePatterns()) == false)
            return false;
        if (other.getAssessmentStates() == null
                ^ this.getAssessmentStates() == null)
            return false;
        if (other.getAssessmentStates() != null
                && other.getAssessmentStates().equals(
                        this.getAssessmentStates()) == false)
            return false;
        if (other.getDataCollected() == null ^ this.getDataCollected() == null)
            return false;
        if (other.getDataCollected() != null
                && other.getDataCollected().equals(this.getDataCollected()) == false)
            return false;
        if (other.getStartTimeRange() == null
                ^ this.getStartTimeRange() == null)
            return false;
        if (other.getStartTimeRange() != null
                && other.getStartTimeRange().equals(this.getStartTimeRange()) == false)
            return false;
        if (other.getEndTimeRange() == null ^ this.getEndTimeRange() == null)
            return false;
        if (other.getEndTimeRange() != null
                && other.getEndTimeRange().equals(this.getEndTimeRange()) == false)
            return false;
        if (other.getDurationRange() == null ^ this.getDurationRange() == null)
            return false;
        if (other.getDurationRange() != null
                && other.getDurationRange().equals(this.getDurationRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssessmentNamePatterns() == null) ? 0
                        : getAssessmentNamePatterns().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssessmentStates() == null) ? 0 : getAssessmentStates()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDataCollected() == null) ? 0 : getDataCollected()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getStartTimeRange() == null) ? 0 : getStartTimeRange()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEndTimeRange() == null) ? 0 : getEndTimeRange()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDurationRange() == null) ? 0 : getDurationRange()
                        .hashCode());
        return hashCode;
    }

    @Override
    public AssessmentsFilter clone() {
        try {
            return (AssessmentsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}