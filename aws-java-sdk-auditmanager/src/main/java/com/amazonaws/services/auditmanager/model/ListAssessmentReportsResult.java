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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentReports" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssessmentReportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of assessment reports returned by the <code>ListAssessmentReports</code> API.
     * </p>
     */
    private java.util.List<AssessmentReportMetadata> assessmentReports;
    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of assessment reports returned by the <code>ListAssessmentReports</code> API.
     * </p>
     * 
     * @return The list of assessment reports returned by the <code>ListAssessmentReports</code> API.
     */

    public java.util.List<AssessmentReportMetadata> getAssessmentReports() {
        return assessmentReports;
    }

    /**
     * <p>
     * The list of assessment reports returned by the <code>ListAssessmentReports</code> API.
     * </p>
     * 
     * @param assessmentReports
     *        The list of assessment reports returned by the <code>ListAssessmentReports</code> API.
     */

    public void setAssessmentReports(java.util.Collection<AssessmentReportMetadata> assessmentReports) {
        if (assessmentReports == null) {
            this.assessmentReports = null;
            return;
        }

        this.assessmentReports = new java.util.ArrayList<AssessmentReportMetadata>(assessmentReports);
    }

    /**
     * <p>
     * The list of assessment reports returned by the <code>ListAssessmentReports</code> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessmentReports(java.util.Collection)} or {@link #withAssessmentReports(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param assessmentReports
     *        The list of assessment reports returned by the <code>ListAssessmentReports</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentReportsResult withAssessmentReports(AssessmentReportMetadata... assessmentReports) {
        if (this.assessmentReports == null) {
            setAssessmentReports(new java.util.ArrayList<AssessmentReportMetadata>(assessmentReports.length));
        }
        for (AssessmentReportMetadata ele : assessmentReports) {
            this.assessmentReports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of assessment reports returned by the <code>ListAssessmentReports</code> API.
     * </p>
     * 
     * @param assessmentReports
     *        The list of assessment reports returned by the <code>ListAssessmentReports</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentReportsResult withAssessmentReports(java.util.Collection<AssessmentReportMetadata> assessmentReports) {
        setAssessmentReports(assessmentReports);
        return this;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @return The pagination token used to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentReportsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAssessmentReports() != null)
            sb.append("AssessmentReports: ").append(getAssessmentReports()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssessmentReportsResult == false)
            return false;
        ListAssessmentReportsResult other = (ListAssessmentReportsResult) obj;
        if (other.getAssessmentReports() == null ^ this.getAssessmentReports() == null)
            return false;
        if (other.getAssessmentReports() != null && other.getAssessmentReports().equals(this.getAssessmentReports()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentReports() == null) ? 0 : getAssessmentReports().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssessmentReportsResult clone() {
        try {
            return (ListAssessmentReportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
