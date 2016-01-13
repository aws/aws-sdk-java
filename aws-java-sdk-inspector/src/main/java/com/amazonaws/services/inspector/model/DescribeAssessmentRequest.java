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
public class DescribeAssessmentRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN specifying the assessment that you want to describe.
     * </p>
     */
    private String assessmentArn;

    /**
     * <p>
     * The ARN specifying the assessment that you want to describe.
     * </p>
     * 
     * @param assessmentArn
     *        The ARN specifying the assessment that you want to describe.
     */
    public void setAssessmentArn(String assessmentArn) {
        this.assessmentArn = assessmentArn;
    }

    /**
     * <p>
     * The ARN specifying the assessment that you want to describe.
     * </p>
     * 
     * @return The ARN specifying the assessment that you want to describe.
     */
    public String getAssessmentArn() {
        return this.assessmentArn;
    }

    /**
     * <p>
     * The ARN specifying the assessment that you want to describe.
     * </p>
     * 
     * @param assessmentArn
     *        The ARN specifying the assessment that you want to describe.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeAssessmentRequest withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
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
            sb.append("AssessmentArn: " + getAssessmentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssessmentRequest == false)
            return false;
        DescribeAssessmentRequest other = (DescribeAssessmentRequest) obj;
        if (other.getAssessmentArn() == null ^ this.getAssessmentArn() == null)
            return false;
        if (other.getAssessmentArn() != null
                && other.getAssessmentArn().equals(this.getAssessmentArn()) == false)
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
        return hashCode;
    }

    @Override
    public DescribeAssessmentRequest clone() {
        return (DescribeAssessmentRequest) super.clone();
    }
}