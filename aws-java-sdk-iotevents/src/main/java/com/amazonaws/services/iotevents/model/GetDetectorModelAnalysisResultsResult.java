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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/GetDetectorModelAnalysisResults"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDetectorModelAnalysisResultsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Contains information about one or more analysis results.
     * </p>
     */
    private java.util.List<AnalysisResult> analysisResults;
    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains information about one or more analysis results.
     * </p>
     * 
     * @return Contains information about one or more analysis results.
     */

    public java.util.List<AnalysisResult> getAnalysisResults() {
        return analysisResults;
    }

    /**
     * <p>
     * Contains information about one or more analysis results.
     * </p>
     * 
     * @param analysisResults
     *        Contains information about one or more analysis results.
     */

    public void setAnalysisResults(java.util.Collection<AnalysisResult> analysisResults) {
        if (analysisResults == null) {
            this.analysisResults = null;
            return;
        }

        this.analysisResults = new java.util.ArrayList<AnalysisResult>(analysisResults);
    }

    /**
     * <p>
     * Contains information about one or more analysis results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysisResults(java.util.Collection)} or {@link #withAnalysisResults(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param analysisResults
     *        Contains information about one or more analysis results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorModelAnalysisResultsResult withAnalysisResults(AnalysisResult... analysisResults) {
        if (this.analysisResults == null) {
            setAnalysisResults(new java.util.ArrayList<AnalysisResult>(analysisResults.length));
        }
        for (AnalysisResult ele : analysisResults) {
            this.analysisResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about one or more analysis results.
     * </p>
     * 
     * @param analysisResults
     *        Contains information about one or more analysis results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorModelAnalysisResultsResult withAnalysisResults(java.util.Collection<AnalysisResult> analysisResults) {
        setAnalysisResults(analysisResults);
        return this;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorModelAnalysisResultsResult withNextToken(String nextToken) {
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
        if (getAnalysisResults() != null)
            sb.append("AnalysisResults: ").append(getAnalysisResults()).append(",");
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

        if (obj instanceof GetDetectorModelAnalysisResultsResult == false)
            return false;
        GetDetectorModelAnalysisResultsResult other = (GetDetectorModelAnalysisResultsResult) obj;
        if (other.getAnalysisResults() == null ^ this.getAnalysisResults() == null)
            return false;
        if (other.getAnalysisResults() != null && other.getAnalysisResults().equals(this.getAnalysisResults()) == false)
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

        hashCode = prime * hashCode + ((getAnalysisResults() == null) ? 0 : getAnalysisResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDetectorModelAnalysisResultsResult clone() {
        try {
            return (GetDetectorModelAnalysisResultsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
