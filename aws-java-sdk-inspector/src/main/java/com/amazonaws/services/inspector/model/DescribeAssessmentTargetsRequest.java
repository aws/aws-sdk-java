/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeAssessmentTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARNs that specifies the assessment targets that you want to describe.
     * </p>
     */
    private java.util.List<String> assessmentTargetArns;

    /**
     * <p>
     * The ARNs that specifies the assessment targets that you want to describe.
     * </p>
     * 
     * @return The ARNs that specifies the assessment targets that you want to describe.
     */

    public java.util.List<String> getAssessmentTargetArns() {
        return assessmentTargetArns;
    }

    /**
     * <p>
     * The ARNs that specifies the assessment targets that you want to describe.
     * </p>
     * 
     * @param assessmentTargetArns
     *        The ARNs that specifies the assessment targets that you want to describe.
     */

    public void setAssessmentTargetArns(java.util.Collection<String> assessmentTargetArns) {
        if (assessmentTargetArns == null) {
            this.assessmentTargetArns = null;
            return;
        }

        this.assessmentTargetArns = new java.util.ArrayList<String>(assessmentTargetArns);
    }

    /**
     * <p>
     * The ARNs that specifies the assessment targets that you want to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessmentTargetArns(java.util.Collection)} or {@link #withAssessmentTargetArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param assessmentTargetArns
     *        The ARNs that specifies the assessment targets that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssessmentTargetsRequest withAssessmentTargetArns(String... assessmentTargetArns) {
        if (this.assessmentTargetArns == null) {
            setAssessmentTargetArns(new java.util.ArrayList<String>(assessmentTargetArns.length));
        }
        for (String ele : assessmentTargetArns) {
            this.assessmentTargetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs that specifies the assessment targets that you want to describe.
     * </p>
     * 
     * @param assessmentTargetArns
     *        The ARNs that specifies the assessment targets that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssessmentTargetsRequest withAssessmentTargetArns(java.util.Collection<String> assessmentTargetArns) {
        setAssessmentTargetArns(assessmentTargetArns);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssessmentTargetArns() != null)
            sb.append("AssessmentTargetArns: " + getAssessmentTargetArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssessmentTargetsRequest == false)
            return false;
        DescribeAssessmentTargetsRequest other = (DescribeAssessmentTargetsRequest) obj;
        if (other.getAssessmentTargetArns() == null ^ this.getAssessmentTargetArns() == null)
            return false;
        if (other.getAssessmentTargetArns() != null && other.getAssessmentTargetArns().equals(this.getAssessmentTargetArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentTargetArns() == null) ? 0 : getAssessmentTargetArns().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssessmentTargetsRequest clone() {
        return (DescribeAssessmentTargetsRequest) super.clone();
    }
}
