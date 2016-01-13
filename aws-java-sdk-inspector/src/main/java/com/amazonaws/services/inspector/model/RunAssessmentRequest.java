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
public class RunAssessmentRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the assessment that you want to run.
     * </p>
     */
    private String assessmentArn;
    /**
     * <p>
     * A name specifying the run of the assessment.
     * </p>
     */
    private String runName;

    /**
     * <p>
     * The ARN of the assessment that you want to run.
     * </p>
     * 
     * @param assessmentArn
     *        The ARN of the assessment that you want to run.
     */
    public void setAssessmentArn(String assessmentArn) {
        this.assessmentArn = assessmentArn;
    }

    /**
     * <p>
     * The ARN of the assessment that you want to run.
     * </p>
     * 
     * @return The ARN of the assessment that you want to run.
     */
    public String getAssessmentArn() {
        return this.assessmentArn;
    }

    /**
     * <p>
     * The ARN of the assessment that you want to run.
     * </p>
     * 
     * @param assessmentArn
     *        The ARN of the assessment that you want to run.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RunAssessmentRequest withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
        return this;
    }

    /**
     * <p>
     * A name specifying the run of the assessment.
     * </p>
     * 
     * @param runName
     *        A name specifying the run of the assessment.
     */
    public void setRunName(String runName) {
        this.runName = runName;
    }

    /**
     * <p>
     * A name specifying the run of the assessment.
     * </p>
     * 
     * @return A name specifying the run of the assessment.
     */
    public String getRunName() {
        return this.runName;
    }

    /**
     * <p>
     * A name specifying the run of the assessment.
     * </p>
     * 
     * @param runName
     *        A name specifying the run of the assessment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RunAssessmentRequest withRunName(String runName) {
        setRunName(runName);
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
        if (getRunName() != null)
            sb.append("RunName: " + getRunName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunAssessmentRequest == false)
            return false;
        RunAssessmentRequest other = (RunAssessmentRequest) obj;
        if (other.getAssessmentArn() == null ^ this.getAssessmentArn() == null)
            return false;
        if (other.getAssessmentArn() != null
                && other.getAssessmentArn().equals(this.getAssessmentArn()) == false)
            return false;
        if (other.getRunName() == null ^ this.getRunName() == null)
            return false;
        if (other.getRunName() != null
                && other.getRunName().equals(this.getRunName()) == false)
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
        hashCode = prime * hashCode
                + ((getRunName() == null) ? 0 : getRunName().hashCode());
        return hashCode;
    }

    @Override
    public RunAssessmentRequest clone() {
        return (RunAssessmentRequest) super.clone();
    }
}