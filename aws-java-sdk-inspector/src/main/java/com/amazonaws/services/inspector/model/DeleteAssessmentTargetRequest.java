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
public class DeleteAssessmentTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN that specifies the assessment target that you want to delete.
     * </p>
     */
    private String assessmentTargetArn;

    /**
     * <p>
     * The ARN that specifies the assessment target that you want to delete.
     * </p>
     * 
     * @param assessmentTargetArn
     *        The ARN that specifies the assessment target that you want to delete.
     */

    public void setAssessmentTargetArn(String assessmentTargetArn) {
        this.assessmentTargetArn = assessmentTargetArn;
    }

    /**
     * <p>
     * The ARN that specifies the assessment target that you want to delete.
     * </p>
     * 
     * @return The ARN that specifies the assessment target that you want to delete.
     */

    public String getAssessmentTargetArn() {
        return this.assessmentTargetArn;
    }

    /**
     * <p>
     * The ARN that specifies the assessment target that you want to delete.
     * </p>
     * 
     * @param assessmentTargetArn
     *        The ARN that specifies the assessment target that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAssessmentTargetRequest withAssessmentTargetArn(String assessmentTargetArn) {
        setAssessmentTargetArn(assessmentTargetArn);
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
        if (getAssessmentTargetArn() != null)
            sb.append("AssessmentTargetArn: " + getAssessmentTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAssessmentTargetRequest == false)
            return false;
        DeleteAssessmentTargetRequest other = (DeleteAssessmentTargetRequest) obj;
        if (other.getAssessmentTargetArn() == null ^ this.getAssessmentTargetArn() == null)
            return false;
        if (other.getAssessmentTargetArn() != null && other.getAssessmentTargetArn().equals(this.getAssessmentTargetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentTargetArn() == null) ? 0 : getAssessmentTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAssessmentTargetRequest clone() {
        return (DeleteAssessmentTargetRequest) super.clone();
    }
}
