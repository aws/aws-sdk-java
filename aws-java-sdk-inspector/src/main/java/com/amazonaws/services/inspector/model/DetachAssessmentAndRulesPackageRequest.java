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
public class DetachAssessmentAndRulesPackageRequest extends
        AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN specifying the assessment from which you want to detach a rules
     * package.
     * </p>
     */
    private String assessmentArn;
    /**
     * <p>
     * The ARN specifying the rules package that you want to detach from the
     * assessment.
     * </p>
     */
    private String rulesPackageArn;

    /**
     * <p>
     * The ARN specifying the assessment from which you want to detach a rules
     * package.
     * </p>
     * 
     * @param assessmentArn
     *        The ARN specifying the assessment from which you want to detach a
     *        rules package.
     */
    public void setAssessmentArn(String assessmentArn) {
        this.assessmentArn = assessmentArn;
    }

    /**
     * <p>
     * The ARN specifying the assessment from which you want to detach a rules
     * package.
     * </p>
     * 
     * @return The ARN specifying the assessment from which you want to detach a
     *         rules package.
     */
    public String getAssessmentArn() {
        return this.assessmentArn;
    }

    /**
     * <p>
     * The ARN specifying the assessment from which you want to detach a rules
     * package.
     * </p>
     * 
     * @param assessmentArn
     *        The ARN specifying the assessment from which you want to detach a
     *        rules package.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DetachAssessmentAndRulesPackageRequest withAssessmentArn(
            String assessmentArn) {
        setAssessmentArn(assessmentArn);
        return this;
    }

    /**
     * <p>
     * The ARN specifying the rules package that you want to detach from the
     * assessment.
     * </p>
     * 
     * @param rulesPackageArn
     *        The ARN specifying the rules package that you want to detach from
     *        the assessment.
     */
    public void setRulesPackageArn(String rulesPackageArn) {
        this.rulesPackageArn = rulesPackageArn;
    }

    /**
     * <p>
     * The ARN specifying the rules package that you want to detach from the
     * assessment.
     * </p>
     * 
     * @return The ARN specifying the rules package that you want to detach from
     *         the assessment.
     */
    public String getRulesPackageArn() {
        return this.rulesPackageArn;
    }

    /**
     * <p>
     * The ARN specifying the rules package that you want to detach from the
     * assessment.
     * </p>
     * 
     * @param rulesPackageArn
     *        The ARN specifying the rules package that you want to detach from
     *        the assessment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DetachAssessmentAndRulesPackageRequest withRulesPackageArn(
            String rulesPackageArn) {
        setRulesPackageArn(rulesPackageArn);
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
        if (getRulesPackageArn() != null)
            sb.append("RulesPackageArn: " + getRulesPackageArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachAssessmentAndRulesPackageRequest == false)
            return false;
        DetachAssessmentAndRulesPackageRequest other = (DetachAssessmentAndRulesPackageRequest) obj;
        if (other.getAssessmentArn() == null ^ this.getAssessmentArn() == null)
            return false;
        if (other.getAssessmentArn() != null
                && other.getAssessmentArn().equals(this.getAssessmentArn()) == false)
            return false;
        if (other.getRulesPackageArn() == null
                ^ this.getRulesPackageArn() == null)
            return false;
        if (other.getRulesPackageArn() != null
                && other.getRulesPackageArn().equals(this.getRulesPackageArn()) == false)
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
                + ((getRulesPackageArn() == null) ? 0 : getRulesPackageArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DetachAssessmentAndRulesPackageRequest clone() {
        return (DetachAssessmentAndRulesPackageRequest) super.clone();
    }
}