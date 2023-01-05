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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetChangeLogs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChangeLogsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The unique identifier for the control set.
     * </p>
     */
    private String controlSetId;
    /**
     * <p>
     * The unique identifier for the control.
     * </p>
     */
    private String controlId;
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
     * The unique identifier for the assessment.
     * </p>
     * 
     * @param assessmentId
     *        The unique identifier for the assessment.
     */

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    /**
     * <p>
     * The unique identifier for the assessment.
     * </p>
     * 
     * @return The unique identifier for the assessment.
     */

    public String getAssessmentId() {
        return this.assessmentId;
    }

    /**
     * <p>
     * The unique identifier for the assessment.
     * </p>
     * 
     * @param assessmentId
     *        The unique identifier for the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangeLogsRequest withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the control set.
     * </p>
     * 
     * @param controlSetId
     *        The unique identifier for the control set.
     */

    public void setControlSetId(String controlSetId) {
        this.controlSetId = controlSetId;
    }

    /**
     * <p>
     * The unique identifier for the control set.
     * </p>
     * 
     * @return The unique identifier for the control set.
     */

    public String getControlSetId() {
        return this.controlSetId;
    }

    /**
     * <p>
     * The unique identifier for the control set.
     * </p>
     * 
     * @param controlSetId
     *        The unique identifier for the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangeLogsRequest withControlSetId(String controlSetId) {
        setControlSetId(controlSetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the control.
     * </p>
     * 
     * @param controlId
     *        The unique identifier for the control.
     */

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    /**
     * <p>
     * The unique identifier for the control.
     * </p>
     * 
     * @return The unique identifier for the control.
     */

    public String getControlId() {
        return this.controlId;
    }

    /**
     * <p>
     * The unique identifier for the control.
     * </p>
     * 
     * @param controlId
     *        The unique identifier for the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangeLogsRequest withControlId(String controlId) {
        setControlId(controlId);
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

    public GetChangeLogsRequest withNextToken(String nextToken) {
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

    public GetChangeLogsRequest withMaxResults(Integer maxResults) {
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
        if (getControlSetId() != null)
            sb.append("ControlSetId: ").append(getControlSetId()).append(",");
        if (getControlId() != null)
            sb.append("ControlId: ").append(getControlId()).append(",");
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

        if (obj instanceof GetChangeLogsRequest == false)
            return false;
        GetChangeLogsRequest other = (GetChangeLogsRequest) obj;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
            return false;
        if (other.getControlSetId() == null ^ this.getControlSetId() == null)
            return false;
        if (other.getControlSetId() != null && other.getControlSetId().equals(this.getControlSetId()) == false)
            return false;
        if (other.getControlId() == null ^ this.getControlId() == null)
            return false;
        if (other.getControlId() != null && other.getControlId().equals(this.getControlId()) == false)
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
        hashCode = prime * hashCode + ((getControlSetId() == null) ? 0 : getControlSetId().hashCode());
        hashCode = prime * hashCode + ((getControlId() == null) ? 0 : getControlId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetChangeLogsRequest clone() {
        return (GetChangeLogsRequest) super.clone();
    }

}
