/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessmentReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssessmentReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The new assessment report returned by the <code>CreateAssessmentReport</code> API.
     * </p>
     */
    private AssessmentReport assessmentReport;

    /**
     * <p>
     * The new assessment report returned by the <code>CreateAssessmentReport</code> API.
     * </p>
     * 
     * @param assessmentReport
     *        The new assessment report returned by the <code>CreateAssessmentReport</code> API.
     */

    public void setAssessmentReport(AssessmentReport assessmentReport) {
        this.assessmentReport = assessmentReport;
    }

    /**
     * <p>
     * The new assessment report returned by the <code>CreateAssessmentReport</code> API.
     * </p>
     * 
     * @return The new assessment report returned by the <code>CreateAssessmentReport</code> API.
     */

    public AssessmentReport getAssessmentReport() {
        return this.assessmentReport;
    }

    /**
     * <p>
     * The new assessment report returned by the <code>CreateAssessmentReport</code> API.
     * </p>
     * 
     * @param assessmentReport
     *        The new assessment report returned by the <code>CreateAssessmentReport</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentReportResult withAssessmentReport(AssessmentReport assessmentReport) {
        setAssessmentReport(assessmentReport);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssessmentReport() != null)
            sb.append("AssessmentReport: ").append(getAssessmentReport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssessmentReportResult == false)
            return false;
        CreateAssessmentReportResult other = (CreateAssessmentReportResult) obj;
        if (other.getAssessmentReport() == null ^ this.getAssessmentReport() == null)
            return false;
        if (other.getAssessmentReport() != null && other.getAssessmentReport().equals(this.getAssessmentReport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentReport() == null) ? 0 : getAssessmentReport().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssessmentReportResult clone() {
        try {
            return (CreateAssessmentReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
