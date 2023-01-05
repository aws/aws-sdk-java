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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssessmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the assessment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Represents the maximum number of results on a page or for an API request call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The current status of the assessment.
     * </p>
     * 
     * @param status
     *        The current status of the assessment.
     * @see AssessmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the assessment.
     * </p>
     * 
     * @return The current status of the assessment.
     * @see AssessmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the assessment.
     * </p>
     * 
     * @param status
     *        The current status of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public ListAssessmentsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the assessment.
     * </p>
     * 
     * @param status
     *        The current status of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public ListAssessmentsRequest withStatus(AssessmentStatus status) {
        this.status = status.toString();
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

    public ListAssessmentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Represents the maximum number of results on a page or for an API request call.
     * </p>
     * 
     * @param maxResults
     *        Represents the maximum number of results on a page or for an API request call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Represents the maximum number of results on a page or for an API request call.
     * </p>
     * 
     * @return Represents the maximum number of results on a page or for an API request call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Represents the maximum number of results on a page or for an API request call.
     * </p>
     * 
     * @param maxResults
     *        Represents the maximum number of results on a page or for an API request call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssessmentsRequest == false)
            return false;
        ListAssessmentsRequest other = (ListAssessmentsRequest) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAssessmentsRequest clone() {
        return (ListAssessmentsRequest) super.clone();
    }

}
