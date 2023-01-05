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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentControlInsightsByControlDomain"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssessmentControlInsightsByControlDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The assessment control analytics data that the <code>ListAssessmentControlInsightsByControlDomain</code> API
     * returned.
     * </p>
     */
    private java.util.List<ControlInsightsMetadataByAssessmentItem> controlInsightsByAssessment;
    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The assessment control analytics data that the <code>ListAssessmentControlInsightsByControlDomain</code> API
     * returned.
     * </p>
     * 
     * @return The assessment control analytics data that the <code>ListAssessmentControlInsightsByControlDomain</code>
     *         API returned.
     */

    public java.util.List<ControlInsightsMetadataByAssessmentItem> getControlInsightsByAssessment() {
        return controlInsightsByAssessment;
    }

    /**
     * <p>
     * The assessment control analytics data that the <code>ListAssessmentControlInsightsByControlDomain</code> API
     * returned.
     * </p>
     * 
     * @param controlInsightsByAssessment
     *        The assessment control analytics data that the <code>ListAssessmentControlInsightsByControlDomain</code>
     *        API returned.
     */

    public void setControlInsightsByAssessment(java.util.Collection<ControlInsightsMetadataByAssessmentItem> controlInsightsByAssessment) {
        if (controlInsightsByAssessment == null) {
            this.controlInsightsByAssessment = null;
            return;
        }

        this.controlInsightsByAssessment = new java.util.ArrayList<ControlInsightsMetadataByAssessmentItem>(controlInsightsByAssessment);
    }

    /**
     * <p>
     * The assessment control analytics data that the <code>ListAssessmentControlInsightsByControlDomain</code> API
     * returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControlInsightsByAssessment(java.util.Collection)} or
     * {@link #withControlInsightsByAssessment(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param controlInsightsByAssessment
     *        The assessment control analytics data that the <code>ListAssessmentControlInsightsByControlDomain</code>
     *        API returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentControlInsightsByControlDomainResult withControlInsightsByAssessment(
            ControlInsightsMetadataByAssessmentItem... controlInsightsByAssessment) {
        if (this.controlInsightsByAssessment == null) {
            setControlInsightsByAssessment(new java.util.ArrayList<ControlInsightsMetadataByAssessmentItem>(controlInsightsByAssessment.length));
        }
        for (ControlInsightsMetadataByAssessmentItem ele : controlInsightsByAssessment) {
            this.controlInsightsByAssessment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The assessment control analytics data that the <code>ListAssessmentControlInsightsByControlDomain</code> API
     * returned.
     * </p>
     * 
     * @param controlInsightsByAssessment
     *        The assessment control analytics data that the <code>ListAssessmentControlInsightsByControlDomain</code>
     *        API returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentControlInsightsByControlDomainResult withControlInsightsByAssessment(
            java.util.Collection<ControlInsightsMetadataByAssessmentItem> controlInsightsByAssessment) {
        setControlInsightsByAssessment(controlInsightsByAssessment);
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

    public ListAssessmentControlInsightsByControlDomainResult withNextToken(String nextToken) {
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
        if (getControlInsightsByAssessment() != null)
            sb.append("ControlInsightsByAssessment: ").append(getControlInsightsByAssessment()).append(",");
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

        if (obj instanceof ListAssessmentControlInsightsByControlDomainResult == false)
            return false;
        ListAssessmentControlInsightsByControlDomainResult other = (ListAssessmentControlInsightsByControlDomainResult) obj;
        if (other.getControlInsightsByAssessment() == null ^ this.getControlInsightsByAssessment() == null)
            return false;
        if (other.getControlInsightsByAssessment() != null && other.getControlInsightsByAssessment().equals(this.getControlInsightsByAssessment()) == false)
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

        hashCode = prime * hashCode + ((getControlInsightsByAssessment() == null) ? 0 : getControlInsightsByAssessment().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssessmentControlInsightsByControlDomainResult clone() {
        try {
            return (ListAssessmentControlInsightsByControlDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
