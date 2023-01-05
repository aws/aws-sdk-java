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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetPortfolioSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPortfolioSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An assessment summary for the portfolio including the number of servers to rehost and the overall number of
     * anti-patterns.
     * </p>
     */
    private AssessmentSummary assessmentSummary;

    /**
     * <p>
     * An assessment summary for the portfolio including the number of servers to rehost and the overall number of
     * anti-patterns.
     * </p>
     * 
     * @param assessmentSummary
     *        An assessment summary for the portfolio including the number of servers to rehost and the overall number
     *        of anti-patterns.
     */

    public void setAssessmentSummary(AssessmentSummary assessmentSummary) {
        this.assessmentSummary = assessmentSummary;
    }

    /**
     * <p>
     * An assessment summary for the portfolio including the number of servers to rehost and the overall number of
     * anti-patterns.
     * </p>
     * 
     * @return An assessment summary for the portfolio including the number of servers to rehost and the overall number
     *         of anti-patterns.
     */

    public AssessmentSummary getAssessmentSummary() {
        return this.assessmentSummary;
    }

    /**
     * <p>
     * An assessment summary for the portfolio including the number of servers to rehost and the overall number of
     * anti-patterns.
     * </p>
     * 
     * @param assessmentSummary
     *        An assessment summary for the portfolio including the number of servers to rehost and the overall number
     *        of anti-patterns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPortfolioSummaryResult withAssessmentSummary(AssessmentSummary assessmentSummary) {
        setAssessmentSummary(assessmentSummary);
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
        if (getAssessmentSummary() != null)
            sb.append("AssessmentSummary: ").append(getAssessmentSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPortfolioSummaryResult == false)
            return false;
        GetPortfolioSummaryResult other = (GetPortfolioSummaryResult) obj;
        if (other.getAssessmentSummary() == null ^ this.getAssessmentSummary() == null)
            return false;
        if (other.getAssessmentSummary() != null && other.getAssessmentSummary().equals(this.getAssessmentSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentSummary() == null) ? 0 : getAssessmentSummary().hashCode());
        return hashCode;
    }

    @Override
    public GetPortfolioSummaryResult clone() {
        try {
            return (GetPortfolioSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
