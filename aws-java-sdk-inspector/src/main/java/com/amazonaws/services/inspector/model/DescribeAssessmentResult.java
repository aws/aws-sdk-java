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
 * 
 */
public class DescribeAssessmentResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the assessment.
     * </p>
     */
    private Assessment assessment;

    /**
     * <p>
     * Information about the assessment.
     * </p>
     * 
     * @param assessment
     *        Information about the assessment.
     */
    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }

    /**
     * <p>
     * Information about the assessment.
     * </p>
     * 
     * @return Information about the assessment.
     */
    public Assessment getAssessment() {
        return this.assessment;
    }

    /**
     * <p>
     * Information about the assessment.
     * </p>
     * 
     * @param assessment
     *        Information about the assessment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeAssessmentResult withAssessment(Assessment assessment) {
        setAssessment(assessment);
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
        if (getAssessment() != null)
            sb.append("Assessment: " + getAssessment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssessmentResult == false)
            return false;
        DescribeAssessmentResult other = (DescribeAssessmentResult) obj;
        if (other.getAssessment() == null ^ this.getAssessment() == null)
            return false;
        if (other.getAssessment() != null
                && other.getAssessment().equals(this.getAssessment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssessment() == null) ? 0 : getAssessment().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssessmentResult clone() {
        try {
            return (DescribeAssessmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}