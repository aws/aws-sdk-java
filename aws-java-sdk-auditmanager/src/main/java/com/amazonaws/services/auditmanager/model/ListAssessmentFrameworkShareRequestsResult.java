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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentFrameworkShareRequests"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssessmentFrameworkShareRequestsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of share requests that the <code>ListAssessmentFrameworkShareRequests</code> API returned.
     * </p>
     */
    private java.util.List<AssessmentFrameworkShareRequest> assessmentFrameworkShareRequests;
    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of share requests that the <code>ListAssessmentFrameworkShareRequests</code> API returned.
     * </p>
     * 
     * @return The list of share requests that the <code>ListAssessmentFrameworkShareRequests</code> API returned.
     */

    public java.util.List<AssessmentFrameworkShareRequest> getAssessmentFrameworkShareRequests() {
        return assessmentFrameworkShareRequests;
    }

    /**
     * <p>
     * The list of share requests that the <code>ListAssessmentFrameworkShareRequests</code> API returned.
     * </p>
     * 
     * @param assessmentFrameworkShareRequests
     *        The list of share requests that the <code>ListAssessmentFrameworkShareRequests</code> API returned.
     */

    public void setAssessmentFrameworkShareRequests(java.util.Collection<AssessmentFrameworkShareRequest> assessmentFrameworkShareRequests) {
        if (assessmentFrameworkShareRequests == null) {
            this.assessmentFrameworkShareRequests = null;
            return;
        }

        this.assessmentFrameworkShareRequests = new java.util.ArrayList<AssessmentFrameworkShareRequest>(assessmentFrameworkShareRequests);
    }

    /**
     * <p>
     * The list of share requests that the <code>ListAssessmentFrameworkShareRequests</code> API returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessmentFrameworkShareRequests(java.util.Collection)} or
     * {@link #withAssessmentFrameworkShareRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assessmentFrameworkShareRequests
     *        The list of share requests that the <code>ListAssessmentFrameworkShareRequests</code> API returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentFrameworkShareRequestsResult withAssessmentFrameworkShareRequests(AssessmentFrameworkShareRequest... assessmentFrameworkShareRequests) {
        if (this.assessmentFrameworkShareRequests == null) {
            setAssessmentFrameworkShareRequests(new java.util.ArrayList<AssessmentFrameworkShareRequest>(assessmentFrameworkShareRequests.length));
        }
        for (AssessmentFrameworkShareRequest ele : assessmentFrameworkShareRequests) {
            this.assessmentFrameworkShareRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of share requests that the <code>ListAssessmentFrameworkShareRequests</code> API returned.
     * </p>
     * 
     * @param assessmentFrameworkShareRequests
     *        The list of share requests that the <code>ListAssessmentFrameworkShareRequests</code> API returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentFrameworkShareRequestsResult withAssessmentFrameworkShareRequests(
            java.util.Collection<AssessmentFrameworkShareRequest> assessmentFrameworkShareRequests) {
        setAssessmentFrameworkShareRequests(assessmentFrameworkShareRequests);
        return this;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @return The pagination token that's used to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentFrameworkShareRequestsResult withNextToken(String nextToken) {
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
        if (getAssessmentFrameworkShareRequests() != null)
            sb.append("AssessmentFrameworkShareRequests: ").append(getAssessmentFrameworkShareRequests()).append(",");
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

        if (obj instanceof ListAssessmentFrameworkShareRequestsResult == false)
            return false;
        ListAssessmentFrameworkShareRequestsResult other = (ListAssessmentFrameworkShareRequestsResult) obj;
        if (other.getAssessmentFrameworkShareRequests() == null ^ this.getAssessmentFrameworkShareRequests() == null)
            return false;
        if (other.getAssessmentFrameworkShareRequests() != null
                && other.getAssessmentFrameworkShareRequests().equals(this.getAssessmentFrameworkShareRequests()) == false)
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

        hashCode = prime * hashCode + ((getAssessmentFrameworkShareRequests() == null) ? 0 : getAssessmentFrameworkShareRequests().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssessmentFrameworkShareRequestsResult clone() {
        try {
            return (ListAssessmentFrameworkShareRequestsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
