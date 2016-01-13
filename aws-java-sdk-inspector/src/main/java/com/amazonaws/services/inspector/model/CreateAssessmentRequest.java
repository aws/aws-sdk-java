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
public class CreateAssessmentRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ARN specifying the application for which you want to create an
     * assessment.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The user-defined name identifying the assessment that you want to create.
     * You can create several assessments for an application. The names of the
     * assessments corresponding to a particular application must be unique.
     * </p>
     */
    private String assessmentName;
    /**
     * <p>
     * The duration of the assessment in seconds. The default value is 3600
     * seconds (one hour). The maximum value is 86400 seconds (one day).
     * </p>
     */
    private Integer durationInSeconds;
    /**
     * <p>
     * The user-defined attributes that are assigned to every finding generated
     * by running this assessment.
     * </p>
     */
    private java.util.List<Attribute> userAttributesForFindings;

    /**
     * <p>
     * The ARN specifying the application for which you want to create an
     * assessment.
     * </p>
     * 
     * @param applicationArn
     *        The ARN specifying the application for which you want to create an
     *        assessment.
     */
    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The ARN specifying the application for which you want to create an
     * assessment.
     * </p>
     * 
     * @return The ARN specifying the application for which you want to create
     *         an assessment.
     */
    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The ARN specifying the application for which you want to create an
     * assessment.
     * </p>
     * 
     * @param applicationArn
     *        The ARN specifying the application for which you want to create an
     *        assessment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateAssessmentRequest withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The user-defined name identifying the assessment that you want to create.
     * You can create several assessments for an application. The names of the
     * assessments corresponding to a particular application must be unique.
     * </p>
     * 
     * @param assessmentName
     *        The user-defined name identifying the assessment that you want to
     *        create. You can create several assessments for an application. The
     *        names of the assessments corresponding to a particular application
     *        must be unique.
     */
    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    /**
     * <p>
     * The user-defined name identifying the assessment that you want to create.
     * You can create several assessments for an application. The names of the
     * assessments corresponding to a particular application must be unique.
     * </p>
     * 
     * @return The user-defined name identifying the assessment that you want to
     *         create. You can create several assessments for an application.
     *         The names of the assessments corresponding to a particular
     *         application must be unique.
     */
    public String getAssessmentName() {
        return this.assessmentName;
    }

    /**
     * <p>
     * The user-defined name identifying the assessment that you want to create.
     * You can create several assessments for an application. The names of the
     * assessments corresponding to a particular application must be unique.
     * </p>
     * 
     * @param assessmentName
     *        The user-defined name identifying the assessment that you want to
     *        create. You can create several assessments for an application. The
     *        names of the assessments corresponding to a particular application
     *        must be unique.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateAssessmentRequest withAssessmentName(String assessmentName) {
        setAssessmentName(assessmentName);
        return this;
    }

    /**
     * <p>
     * The duration of the assessment in seconds. The default value is 3600
     * seconds (one hour). The maximum value is 86400 seconds (one day).
     * </p>
     * 
     * @param durationInSeconds
     *        The duration of the assessment in seconds. The default value is
     *        3600 seconds (one hour). The maximum value is 86400 seconds (one
     *        day).
     */
    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The duration of the assessment in seconds. The default value is 3600
     * seconds (one hour). The maximum value is 86400 seconds (one day).
     * </p>
     * 
     * @return The duration of the assessment in seconds. The default value is
     *         3600 seconds (one hour). The maximum value is 86400 seconds (one
     *         day).
     */
    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * The duration of the assessment in seconds. The default value is 3600
     * seconds (one hour). The maximum value is 86400 seconds (one day).
     * </p>
     * 
     * @param durationInSeconds
     *        The duration of the assessment in seconds. The default value is
     *        3600 seconds (one hour). The maximum value is 86400 seconds (one
     *        day).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateAssessmentRequest withDurationInSeconds(
            Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every finding generated
     * by running this assessment.
     * </p>
     * 
     * @return The user-defined attributes that are assigned to every finding
     *         generated by running this assessment.
     */
    public java.util.List<Attribute> getUserAttributesForFindings() {
        return userAttributesForFindings;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every finding generated
     * by running this assessment.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every finding
     *        generated by running this assessment.
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
     * The user-defined attributes that are assigned to every finding generated
     * by running this assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUserAttributesForFindings(java.util.Collection)} or
     * {@link #withUserAttributesForFindings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every finding
     *        generated by running this assessment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateAssessmentRequest withUserAttributesForFindings(
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
     * The user-defined attributes that are assigned to every finding generated
     * by running this assessment.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every finding
     *        generated by running this assessment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateAssessmentRequest withUserAttributesForFindings(
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: " + getApplicationArn() + ",");
        if (getAssessmentName() != null)
            sb.append("AssessmentName: " + getAssessmentName() + ",");
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

        if (obj instanceof CreateAssessmentRequest == false)
            return false;
        CreateAssessmentRequest other = (CreateAssessmentRequest) obj;
        if (other.getApplicationArn() == null
                ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null
                && other.getApplicationArn().equals(this.getApplicationArn()) == false)
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
                + ((getApplicationArn() == null) ? 0 : getApplicationArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAssessmentName() == null) ? 0 : getAssessmentName()
                        .hashCode());
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
    public CreateAssessmentRequest clone() {
        return (CreateAssessmentRequest) super.clone();
    }
}