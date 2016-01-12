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
 * Contains information about an Inspector assessment.
 * </p>
 * <p>
 * This data type is used as the response element in the
 * <a>DescribeAssessment</a> action.
 * </p>
 */
public class Assessment implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the assessment.
     * </p>
     */
    private String assessmentArn;
    /**
     * <p>
     * The name of the assessment.
     * </p>
     */
    private String assessmentName;
    /**
     * <p>
     * The ARN of the application that corresponds to this assessment.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The state of the assessment. Values can be set to <i>Created</i>,
     * <i>Collecting Data</i>, <i>Stopping</i>, and <i>Completed</i>.
     * </p>
     */
    private String assessmentState;
    /**
     * <p>
     * This data type property is not currently used.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * Boolean value (true or false) specifying whether the data collection
     * process is completed.
     * </p>
     */
    private Boolean dataCollected;
    /**
     * <p>
     * The assessment start time.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The assessment end time.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The assessment duration in seconds. The default value is 3600 seconds
     * (one hour). The maximum value is 86400 seconds (one day).
     * </p>
     */
    private Integer durationInSeconds;
    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding.
     * </p>
     */
    private java.util.List<Attribute> userAttributesForFindings;

    /**
     * <p>
     * The ARN of the assessment.
     * </p>
     * 
     * @param assessmentArn
     *        The ARN of the assessment.
     */
    public void setAssessmentArn(String assessmentArn) {
        this.assessmentArn = assessmentArn;
    }

    /**
     * <p>
     * The ARN of the assessment.
     * </p>
     * 
     * @return The ARN of the assessment.
     */
    public String getAssessmentArn() {
        return this.assessmentArn;
    }

    /**
     * <p>
     * The ARN of the assessment.
     * </p>
     * 
     * @param assessmentArn
     *        The ARN of the assessment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Assessment withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
        return this;
    }

    /**
     * <p>
     * The name of the assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name of the assessment.
     */
    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    /**
     * <p>
     * The name of the assessment.
     * </p>
     * 
     * @return The name of the assessment.
     */
    public String getAssessmentName() {
        return this.assessmentName;
    }

    /**
     * <p>
     * The name of the assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name of the assessment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Assessment withAssessmentName(String assessmentName) {
        setAssessmentName(assessmentName);
        return this;
    }

    /**
     * <p>
     * The ARN of the application that corresponds to this assessment.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the application that corresponds to this assessment.
     */
    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The ARN of the application that corresponds to this assessment.
     * </p>
     * 
     * @return The ARN of the application that corresponds to this assessment.
     */
    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The ARN of the application that corresponds to this assessment.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the application that corresponds to this assessment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Assessment withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The state of the assessment. Values can be set to <i>Created</i>,
     * <i>Collecting Data</i>, <i>Stopping</i>, and <i>Completed</i>.
     * </p>
     * 
     * @param assessmentState
     *        The state of the assessment. Values can be set to <i>Created</i>,
     *        <i>Collecting Data</i>, <i>Stopping</i>, and <i>Completed</i>.
     */
    public void setAssessmentState(String assessmentState) {
        this.assessmentState = assessmentState;
    }

    /**
     * <p>
     * The state of the assessment. Values can be set to <i>Created</i>,
     * <i>Collecting Data</i>, <i>Stopping</i>, and <i>Completed</i>.
     * </p>
     * 
     * @return The state of the assessment. Values can be set to <i>Created</i>,
     *         <i>Collecting Data</i>, <i>Stopping</i>, and <i>Completed</i>.
     */
    public String getAssessmentState() {
        return this.assessmentState;
    }

    /**
     * <p>
     * The state of the assessment. Values can be set to <i>Created</i>,
     * <i>Collecting Data</i>, <i>Stopping</i>, and <i>Completed</i>.
     * </p>
     * 
     * @param assessmentState
     *        The state of the assessment. Values can be set to <i>Created</i>,
     *        <i>Collecting Data</i>, <i>Stopping</i>, and <i>Completed</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Assessment withAssessmentState(String assessmentState) {
        setAssessmentState(assessmentState);
        return this;
    }

    /**
     * <p>
     * This data type property is not currently used.
     * </p>
     * 
     * @param failureMessage
     *        This data type property is not currently used.
     */
    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * This data type property is not currently used.
     * </p>
     * 
     * @return This data type property is not currently used.
     */
    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * This data type property is not currently used.
     * </p>
     * 
     * @param failureMessage
     *        This data type property is not currently used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Assessment withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * Boolean value (true or false) specifying whether the data collection
     * process is completed.
     * </p>
     * 
     * @param dataCollected
     *        Boolean value (true or false) specifying whether the data
     *        collection process is completed.
     */
    public void setDataCollected(Boolean dataCollected) {
        this.dataCollected = dataCollected;
    }

    /**
     * <p>
     * Boolean value (true or false) specifying whether the data collection
     * process is completed.
     * </p>
     * 
     * @return Boolean value (true or false) specifying whether the data
     *         collection process is completed.
     */
    public Boolean getDataCollected() {
        return this.dataCollected;
    }

    /**
     * <p>
     * Boolean value (true or false) specifying whether the data collection
     * process is completed.
     * </p>
     * 
     * @param dataCollected
     *        Boolean value (true or false) specifying whether the data
     *        collection process is completed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Assessment withDataCollected(Boolean dataCollected) {
        setDataCollected(dataCollected);
        return this;
    }

    /**
     * <p>
     * Boolean value (true or false) specifying whether the data collection
     * process is completed.
     * </p>
     * 
     * @return Boolean value (true or false) specifying whether the data
     *         collection process is completed.
     */
    public Boolean isDataCollected() {
        return this.dataCollected;
    }

    /**
     * <p>
     * The assessment start time.
     * </p>
     * 
     * @param startTime
     *        The assessment start time.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The assessment start time.
     * </p>
     * 
     * @return The assessment start time.
     */
    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The assessment start time.
     * </p>
     * 
     * @param startTime
     *        The assessment start time.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Assessment withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The assessment end time.
     * </p>
     * 
     * @param endTime
     *        The assessment end time.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The assessment end time.
     * </p>
     * 
     * @return The assessment end time.
     */
    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The assessment end time.
     * </p>
     * 
     * @param endTime
     *        The assessment end time.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Assessment withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The assessment duration in seconds. The default value is 3600 seconds
     * (one hour). The maximum value is 86400 seconds (one day).
     * </p>
     * 
     * @param durationInSeconds
     *        The assessment duration in seconds. The default value is 3600
     *        seconds (one hour). The maximum value is 86400 seconds (one day).
     */
    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The assessment duration in seconds. The default value is 3600 seconds
     * (one hour). The maximum value is 86400 seconds (one day).
     * </p>
     * 
     * @return The assessment duration in seconds. The default value is 3600
     *         seconds (one hour). The maximum value is 86400 seconds (one day).
     */
    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * The assessment duration in seconds. The default value is 3600 seconds
     * (one hour). The maximum value is 86400 seconds (one day).
     * </p>
     * 
     * @param durationInSeconds
     *        The assessment duration in seconds. The default value is 3600
     *        seconds (one hour). The maximum value is 86400 seconds (one day).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Assessment withDurationInSeconds(Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding.
     * </p>
     * 
     * @return The user-defined attributes that are assigned to every generated
     *         finding.
     */
    public java.util.List<Attribute> getUserAttributesForFindings() {
        return userAttributesForFindings;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every generated
     *        finding.
     */
    public void setUserAttributesForFindings(
            java.util.Collection<Attribute> userAttributesForFindings) {
        if (userAttributesForFindings == null) {
            this.userAttributesForFindings = null;
            return;
        }

        this.userAttributesForFindings = new java.util.ArrayList<Attribute>(
                userAttributesForFindings);
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUserAttributesForFindings(java.util.Collection)} or
     * {@link #withUserAttributesForFindings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every generated
     *        finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Assessment withUserAttributesForFindings(
            Attribute... userAttributesForFindings) {
        if (this.userAttributesForFindings == null) {
            setUserAttributesForFindings(new java.util.ArrayList<Attribute>(
                    userAttributesForFindings.length));
        }
        for (Attribute ele : userAttributesForFindings) {
            this.userAttributesForFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every generated
     *        finding.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Assessment withUserAttributesForFindings(
            java.util.Collection<Attribute> userAttributesForFindings) {
        setUserAttributesForFindings(userAttributesForFindings);
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: " + getApplicationArn() + ",");
        if (getAssessmentState() != null)
            sb.append("AssessmentState: " + getAssessmentState() + ",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: " + getFailureMessage() + ",");
        if (getDataCollected() != null)
            sb.append("DataCollected: " + getDataCollected() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: " + getDurationInSeconds() + ",");
        if (getUserAttributesForFindings() != null)
            sb.append("UserAttributesForFindings: "
                    + getUserAttributesForFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Assessment == false)
            return false;
        Assessment other = (Assessment) obj;
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
        if (other.getApplicationArn() == null
                ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null
                && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getAssessmentState() == null
                ^ this.getAssessmentState() == null)
            return false;
        if (other.getAssessmentState() != null
                && other.getAssessmentState().equals(this.getAssessmentState()) == false)
            return false;
        if (other.getFailureMessage() == null
                ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null
                && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getDataCollected() == null ^ this.getDataCollected() == null)
            return false;
        if (other.getDataCollected() != null
                && other.getDataCollected().equals(this.getDataCollected()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null
                && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getDurationInSeconds() == null
                ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null
                && other.getDurationInSeconds().equals(
                        this.getDurationInSeconds()) == false)
            return false;
        if (other.getUserAttributesForFindings() == null
                ^ this.getUserAttributesForFindings() == null)
            return false;
        if (other.getUserAttributesForFindings() != null
                && other.getUserAttributesForFindings().equals(
                        this.getUserAttributesForFindings()) == false)
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
                + ((getApplicationArn() == null) ? 0 : getApplicationArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAssessmentState() == null) ? 0 : getAssessmentState()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFailureMessage() == null) ? 0 : getFailureMessage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDataCollected() == null) ? 0 : getDataCollected()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getDurationInSeconds() == null) ? 0
                        : getDurationInSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getUserAttributesForFindings() == null) ? 0
                        : getUserAttributesForFindings().hashCode());
        return hashCode;
    }

    @Override
    public Assessment clone() {
        try {
            return (Assessment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}