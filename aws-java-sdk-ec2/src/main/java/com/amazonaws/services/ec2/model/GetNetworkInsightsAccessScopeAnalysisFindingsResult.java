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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNetworkInsightsAccessScopeAnalysisFindingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     */
    private String networkInsightsAccessScopeAnalysisId;
    /**
     * <p>
     * The status of Network Access Scope Analysis.
     * </p>
     */
    private String analysisStatus;
    /**
     * <p>
     * The findings associated with Network Access Scope Analysis.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccessScopeAnalysisFinding> analysisFindings;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalysisId
     *        The ID of the Network Access Scope analysis.
     */

    public void setNetworkInsightsAccessScopeAnalysisId(String networkInsightsAccessScopeAnalysisId) {
        this.networkInsightsAccessScopeAnalysisId = networkInsightsAccessScopeAnalysisId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     * 
     * @return The ID of the Network Access Scope analysis.
     */

    public String getNetworkInsightsAccessScopeAnalysisId() {
        return this.networkInsightsAccessScopeAnalysisId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalysisId
     *        The ID of the Network Access Scope analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkInsightsAccessScopeAnalysisFindingsResult withNetworkInsightsAccessScopeAnalysisId(String networkInsightsAccessScopeAnalysisId) {
        setNetworkInsightsAccessScopeAnalysisId(networkInsightsAccessScopeAnalysisId);
        return this;
    }

    /**
     * <p>
     * The status of Network Access Scope Analysis.
     * </p>
     * 
     * @param analysisStatus
     *        The status of Network Access Scope Analysis.
     * @see AnalysisStatus
     */

    public void setAnalysisStatus(String analysisStatus) {
        this.analysisStatus = analysisStatus;
    }

    /**
     * <p>
     * The status of Network Access Scope Analysis.
     * </p>
     * 
     * @return The status of Network Access Scope Analysis.
     * @see AnalysisStatus
     */

    public String getAnalysisStatus() {
        return this.analysisStatus;
    }

    /**
     * <p>
     * The status of Network Access Scope Analysis.
     * </p>
     * 
     * @param analysisStatus
     *        The status of Network Access Scope Analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisStatus
     */

    public GetNetworkInsightsAccessScopeAnalysisFindingsResult withAnalysisStatus(String analysisStatus) {
        setAnalysisStatus(analysisStatus);
        return this;
    }

    /**
     * <p>
     * The status of Network Access Scope Analysis.
     * </p>
     * 
     * @param analysisStatus
     *        The status of Network Access Scope Analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisStatus
     */

    public GetNetworkInsightsAccessScopeAnalysisFindingsResult withAnalysisStatus(AnalysisStatus analysisStatus) {
        this.analysisStatus = analysisStatus.toString();
        return this;
    }

    /**
     * <p>
     * The findings associated with Network Access Scope Analysis.
     * </p>
     * 
     * @return The findings associated with Network Access Scope Analysis.
     */

    public java.util.List<AccessScopeAnalysisFinding> getAnalysisFindings() {
        if (analysisFindings == null) {
            analysisFindings = new com.amazonaws.internal.SdkInternalList<AccessScopeAnalysisFinding>();
        }
        return analysisFindings;
    }

    /**
     * <p>
     * The findings associated with Network Access Scope Analysis.
     * </p>
     * 
     * @param analysisFindings
     *        The findings associated with Network Access Scope Analysis.
     */

    public void setAnalysisFindings(java.util.Collection<AccessScopeAnalysisFinding> analysisFindings) {
        if (analysisFindings == null) {
            this.analysisFindings = null;
            return;
        }

        this.analysisFindings = new com.amazonaws.internal.SdkInternalList<AccessScopeAnalysisFinding>(analysisFindings);
    }

    /**
     * <p>
     * The findings associated with Network Access Scope Analysis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysisFindings(java.util.Collection)} or {@link #withAnalysisFindings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param analysisFindings
     *        The findings associated with Network Access Scope Analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkInsightsAccessScopeAnalysisFindingsResult withAnalysisFindings(AccessScopeAnalysisFinding... analysisFindings) {
        if (this.analysisFindings == null) {
            setAnalysisFindings(new com.amazonaws.internal.SdkInternalList<AccessScopeAnalysisFinding>(analysisFindings.length));
        }
        for (AccessScopeAnalysisFinding ele : analysisFindings) {
            this.analysisFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The findings associated with Network Access Scope Analysis.
     * </p>
     * 
     * @param analysisFindings
     *        The findings associated with Network Access Scope Analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkInsightsAccessScopeAnalysisFindingsResult withAnalysisFindings(java.util.Collection<AccessScopeAnalysisFinding> analysisFindings) {
        setAnalysisFindings(analysisFindings);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkInsightsAccessScopeAnalysisFindingsResult withNextToken(String nextToken) {
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
        if (getNetworkInsightsAccessScopeAnalysisId() != null)
            sb.append("NetworkInsightsAccessScopeAnalysisId: ").append(getNetworkInsightsAccessScopeAnalysisId()).append(",");
        if (getAnalysisStatus() != null)
            sb.append("AnalysisStatus: ").append(getAnalysisStatus()).append(",");
        if (getAnalysisFindings() != null)
            sb.append("AnalysisFindings: ").append(getAnalysisFindings()).append(",");
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

        if (obj instanceof GetNetworkInsightsAccessScopeAnalysisFindingsResult == false)
            return false;
        GetNetworkInsightsAccessScopeAnalysisFindingsResult other = (GetNetworkInsightsAccessScopeAnalysisFindingsResult) obj;
        if (other.getNetworkInsightsAccessScopeAnalysisId() == null ^ this.getNetworkInsightsAccessScopeAnalysisId() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeAnalysisId() != null
                && other.getNetworkInsightsAccessScopeAnalysisId().equals(this.getNetworkInsightsAccessScopeAnalysisId()) == false)
            return false;
        if (other.getAnalysisStatus() == null ^ this.getAnalysisStatus() == null)
            return false;
        if (other.getAnalysisStatus() != null && other.getAnalysisStatus().equals(this.getAnalysisStatus()) == false)
            return false;
        if (other.getAnalysisFindings() == null ^ this.getAnalysisFindings() == null)
            return false;
        if (other.getAnalysisFindings() != null && other.getAnalysisFindings().equals(this.getAnalysisFindings()) == false)
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

        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeAnalysisId() == null) ? 0 : getNetworkInsightsAccessScopeAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getAnalysisStatus() == null) ? 0 : getAnalysisStatus().hashCode());
        hashCode = prime * hashCode + ((getAnalysisFindings() == null) ? 0 : getAnalysisFindings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetNetworkInsightsAccessScopeAnalysisFindingsResult clone() {
        try {
            return (GetNetworkInsightsAccessScopeAnalysisFindingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
