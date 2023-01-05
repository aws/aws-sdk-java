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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetInsightsByAssessment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightsByAssessmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The assessment analytics data that the <code>GetInsightsByAssessment</code> API returned.
     * </p>
     */
    private InsightsByAssessment insights;

    /**
     * <p>
     * The assessment analytics data that the <code>GetInsightsByAssessment</code> API returned.
     * </p>
     * 
     * @param insights
     *        The assessment analytics data that the <code>GetInsightsByAssessment</code> API returned.
     */

    public void setInsights(InsightsByAssessment insights) {
        this.insights = insights;
    }

    /**
     * <p>
     * The assessment analytics data that the <code>GetInsightsByAssessment</code> API returned.
     * </p>
     * 
     * @return The assessment analytics data that the <code>GetInsightsByAssessment</code> API returned.
     */

    public InsightsByAssessment getInsights() {
        return this.insights;
    }

    /**
     * <p>
     * The assessment analytics data that the <code>GetInsightsByAssessment</code> API returned.
     * </p>
     * 
     * @param insights
     *        The assessment analytics data that the <code>GetInsightsByAssessment</code> API returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightsByAssessmentResult withInsights(InsightsByAssessment insights) {
        setInsights(insights);
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
        if (getInsights() != null)
            sb.append("Insights: ").append(getInsights());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInsightsByAssessmentResult == false)
            return false;
        GetInsightsByAssessmentResult other = (GetInsightsByAssessmentResult) obj;
        if (other.getInsights() == null ^ this.getInsights() == null)
            return false;
        if (other.getInsights() != null && other.getInsights().equals(this.getInsights()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsights() == null) ? 0 : getInsights().hashCode());
        return hashCode;
    }

    @Override
    public GetInsightsByAssessmentResult clone() {
        try {
            return (GetInsightsByAssessmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
