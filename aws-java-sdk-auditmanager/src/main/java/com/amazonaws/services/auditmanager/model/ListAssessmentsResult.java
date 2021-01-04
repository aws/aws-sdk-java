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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssessmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata associated with the assessment.
     * </p>
     */
    private java.util.List<AssessmentMetadataItem> assessmentMetadata;
    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The metadata associated with the assessment.
     * </p>
     * 
     * @return The metadata associated with the assessment.
     */

    public java.util.List<AssessmentMetadataItem> getAssessmentMetadata() {
        return assessmentMetadata;
    }

    /**
     * <p>
     * The metadata associated with the assessment.
     * </p>
     * 
     * @param assessmentMetadata
     *        The metadata associated with the assessment.
     */

    public void setAssessmentMetadata(java.util.Collection<AssessmentMetadataItem> assessmentMetadata) {
        if (assessmentMetadata == null) {
            this.assessmentMetadata = null;
            return;
        }

        this.assessmentMetadata = new java.util.ArrayList<AssessmentMetadataItem>(assessmentMetadata);
    }

    /**
     * <p>
     * The metadata associated with the assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessmentMetadata(java.util.Collection)} or {@link #withAssessmentMetadata(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param assessmentMetadata
     *        The metadata associated with the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentsResult withAssessmentMetadata(AssessmentMetadataItem... assessmentMetadata) {
        if (this.assessmentMetadata == null) {
            setAssessmentMetadata(new java.util.ArrayList<AssessmentMetadataItem>(assessmentMetadata.length));
        }
        for (AssessmentMetadataItem ele : assessmentMetadata) {
            this.assessmentMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata associated with the assessment.
     * </p>
     * 
     * @param assessmentMetadata
     *        The metadata associated with the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentsResult withAssessmentMetadata(java.util.Collection<AssessmentMetadataItem> assessmentMetadata) {
        setAssessmentMetadata(assessmentMetadata);
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

    public ListAssessmentsResult withNextToken(String nextToken) {
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
        if (getAssessmentMetadata() != null)
            sb.append("AssessmentMetadata: ").append(getAssessmentMetadata()).append(",");
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

        if (obj instanceof ListAssessmentsResult == false)
            return false;
        ListAssessmentsResult other = (ListAssessmentsResult) obj;
        if (other.getAssessmentMetadata() == null ^ this.getAssessmentMetadata() == null)
            return false;
        if (other.getAssessmentMetadata() != null && other.getAssessmentMetadata().equals(this.getAssessmentMetadata()) == false)
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

        hashCode = prime * hashCode + ((getAssessmentMetadata() == null) ? 0 : getAssessmentMetadata().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssessmentsResult clone() {
        try {
            return (ListAssessmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
