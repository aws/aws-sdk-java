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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFoldersByAssessment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEvidenceFoldersByAssessmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Represents the maximum number of results per page, or per API request call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the specified assessment.
     */

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @return The identifier for the specified assessment.
     */

    public String getAssessmentId() {
        return this.assessmentId;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceFoldersByAssessmentRequest withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
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

    public GetEvidenceFoldersByAssessmentRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Represents the maximum number of results per page, or per API request call.
     * </p>
     * 
     * @param maxResults
     *        Represents the maximum number of results per page, or per API request call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Represents the maximum number of results per page, or per API request call.
     * </p>
     * 
     * @return Represents the maximum number of results per page, or per API request call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Represents the maximum number of results per page, or per API request call.
     * </p>
     * 
     * @param maxResults
     *        Represents the maximum number of results per page, or per API request call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceFoldersByAssessmentRequest withMaxResults(Integer maxResults) {
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
        if (getAssessmentId() != null)
            sb.append("AssessmentId: ").append(getAssessmentId()).append(",");
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

        if (obj instanceof GetEvidenceFoldersByAssessmentRequest == false)
            return false;
        GetEvidenceFoldersByAssessmentRequest other = (GetEvidenceFoldersByAssessmentRequest) obj;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
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

        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetEvidenceFoldersByAssessmentRequest clone() {
        return (GetEvidenceFoldersByAssessmentRequest) super.clone();
    }

}
