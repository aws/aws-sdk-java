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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeFleetAdvisorLsaAnalysis"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetAdvisorLsaAnalysisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of <code>FleetAdvisorLsaAnalysisResponse</code> objects.
     * </p>
     */
    private java.util.List<FleetAdvisorLsaAnalysisResponse> analysis;
    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>FleetAdvisorLsaAnalysisResponse</code> objects.
     * </p>
     * 
     * @return A list of <code>FleetAdvisorLsaAnalysisResponse</code> objects.
     */

    public java.util.List<FleetAdvisorLsaAnalysisResponse> getAnalysis() {
        return analysis;
    }

    /**
     * <p>
     * A list of <code>FleetAdvisorLsaAnalysisResponse</code> objects.
     * </p>
     * 
     * @param analysis
     *        A list of <code>FleetAdvisorLsaAnalysisResponse</code> objects.
     */

    public void setAnalysis(java.util.Collection<FleetAdvisorLsaAnalysisResponse> analysis) {
        if (analysis == null) {
            this.analysis = null;
            return;
        }

        this.analysis = new java.util.ArrayList<FleetAdvisorLsaAnalysisResponse>(analysis);
    }

    /**
     * <p>
     * A list of <code>FleetAdvisorLsaAnalysisResponse</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysis(java.util.Collection)} or {@link #withAnalysis(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param analysis
     *        A list of <code>FleetAdvisorLsaAnalysisResponse</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetAdvisorLsaAnalysisResult withAnalysis(FleetAdvisorLsaAnalysisResponse... analysis) {
        if (this.analysis == null) {
            setAnalysis(new java.util.ArrayList<FleetAdvisorLsaAnalysisResponse>(analysis.length));
        }
        for (FleetAdvisorLsaAnalysisResponse ele : analysis) {
            this.analysis.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>FleetAdvisorLsaAnalysisResponse</code> objects.
     * </p>
     * 
     * @param analysis
     *        A list of <code>FleetAdvisorLsaAnalysisResponse</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetAdvisorLsaAnalysisResult withAnalysis(java.util.Collection<FleetAdvisorLsaAnalysisResponse> analysis) {
        setAnalysis(analysis);
        return this;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged.
     * </p>
     * 
     * @return If <code>NextToken</code> is returned, there are more results available. The value of
     *         <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page. Keep all other arguments unchanged.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetAdvisorLsaAnalysisResult withNextToken(String nextToken) {
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
        if (getAnalysis() != null)
            sb.append("Analysis: ").append(getAnalysis()).append(",");
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

        if (obj instanceof DescribeFleetAdvisorLsaAnalysisResult == false)
            return false;
        DescribeFleetAdvisorLsaAnalysisResult other = (DescribeFleetAdvisorLsaAnalysisResult) obj;
        if (other.getAnalysis() == null ^ this.getAnalysis() == null)
            return false;
        if (other.getAnalysis() != null && other.getAnalysis().equals(this.getAnalysis()) == false)
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

        hashCode = prime * hashCode + ((getAnalysis() == null) ? 0 : getAnalysis().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetAdvisorLsaAnalysisResult clone() {
        try {
            return (DescribeFleetAdvisorLsaAnalysisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
