/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppAssessmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The summaries for the specified assessments, returned as an object. This object includes application versions,
     * associated Amazon Resource Numbers (ARNs), cost, messages, resiliency scores, and more.
     * </p>
     */
    private java.util.List<AppAssessmentSummary> assessmentSummaries;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The summaries for the specified assessments, returned as an object. This object includes application versions,
     * associated Amazon Resource Numbers (ARNs), cost, messages, resiliency scores, and more.
     * </p>
     * 
     * @return The summaries for the specified assessments, returned as an object. This object includes application
     *         versions, associated Amazon Resource Numbers (ARNs), cost, messages, resiliency scores, and more.
     */

    public java.util.List<AppAssessmentSummary> getAssessmentSummaries() {
        return assessmentSummaries;
    }

    /**
     * <p>
     * The summaries for the specified assessments, returned as an object. This object includes application versions,
     * associated Amazon Resource Numbers (ARNs), cost, messages, resiliency scores, and more.
     * </p>
     * 
     * @param assessmentSummaries
     *        The summaries for the specified assessments, returned as an object. This object includes application
     *        versions, associated Amazon Resource Numbers (ARNs), cost, messages, resiliency scores, and more.
     */

    public void setAssessmentSummaries(java.util.Collection<AppAssessmentSummary> assessmentSummaries) {
        if (assessmentSummaries == null) {
            this.assessmentSummaries = null;
            return;
        }

        this.assessmentSummaries = new java.util.ArrayList<AppAssessmentSummary>(assessmentSummaries);
    }

    /**
     * <p>
     * The summaries for the specified assessments, returned as an object. This object includes application versions,
     * associated Amazon Resource Numbers (ARNs), cost, messages, resiliency scores, and more.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessmentSummaries(java.util.Collection)} or {@link #withAssessmentSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param assessmentSummaries
     *        The summaries for the specified assessments, returned as an object. This object includes application
     *        versions, associated Amazon Resource Numbers (ARNs), cost, messages, resiliency scores, and more.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppAssessmentsResult withAssessmentSummaries(AppAssessmentSummary... assessmentSummaries) {
        if (this.assessmentSummaries == null) {
            setAssessmentSummaries(new java.util.ArrayList<AppAssessmentSummary>(assessmentSummaries.length));
        }
        for (AppAssessmentSummary ele : assessmentSummaries) {
            this.assessmentSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summaries for the specified assessments, returned as an object. This object includes application versions,
     * associated Amazon Resource Numbers (ARNs), cost, messages, resiliency scores, and more.
     * </p>
     * 
     * @param assessmentSummaries
     *        The summaries for the specified assessments, returned as an object. This object includes application
     *        versions, associated Amazon Resource Numbers (ARNs), cost, messages, resiliency scores, and more.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppAssessmentsResult withAssessmentSummaries(java.util.Collection<AppAssessmentSummary> assessmentSummaries) {
        setAssessmentSummaries(assessmentSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppAssessmentsResult withNextToken(String nextToken) {
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
        if (getAssessmentSummaries() != null)
            sb.append("AssessmentSummaries: ").append(getAssessmentSummaries()).append(",");
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

        if (obj instanceof ListAppAssessmentsResult == false)
            return false;
        ListAppAssessmentsResult other = (ListAppAssessmentsResult) obj;
        if (other.getAssessmentSummaries() == null ^ this.getAssessmentSummaries() == null)
            return false;
        if (other.getAssessmentSummaries() != null && other.getAssessmentSummaries().equals(this.getAssessmentSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAssessmentSummaries() == null) ? 0 : getAssessmentSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppAssessmentsResult clone() {
        try {
            return (ListAppAssessmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
