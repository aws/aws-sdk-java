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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsightSummaries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightSummariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The summary of each insight within the group matching the provided filters. The summary contains the InsightID,
     * start and end time, the root cause service, the root cause and client impact statistics, the top anomalous
     * services, and the status of the insight.
     * </p>
     */
    private java.util.List<InsightSummary> insightSummaries;
    /**
     * <p>
     * Pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The summary of each insight within the group matching the provided filters. The summary contains the InsightID,
     * start and end time, the root cause service, the root cause and client impact statistics, the top anomalous
     * services, and the status of the insight.
     * </p>
     * 
     * @return The summary of each insight within the group matching the provided filters. The summary contains the
     *         InsightID, start and end time, the root cause service, the root cause and client impact statistics, the
     *         top anomalous services, and the status of the insight.
     */

    public java.util.List<InsightSummary> getInsightSummaries() {
        return insightSummaries;
    }

    /**
     * <p>
     * The summary of each insight within the group matching the provided filters. The summary contains the InsightID,
     * start and end time, the root cause service, the root cause and client impact statistics, the top anomalous
     * services, and the status of the insight.
     * </p>
     * 
     * @param insightSummaries
     *        The summary of each insight within the group matching the provided filters. The summary contains the
     *        InsightID, start and end time, the root cause service, the root cause and client impact statistics, the
     *        top anomalous services, and the status of the insight.
     */

    public void setInsightSummaries(java.util.Collection<InsightSummary> insightSummaries) {
        if (insightSummaries == null) {
            this.insightSummaries = null;
            return;
        }

        this.insightSummaries = new java.util.ArrayList<InsightSummary>(insightSummaries);
    }

    /**
     * <p>
     * The summary of each insight within the group matching the provided filters. The summary contains the InsightID,
     * start and end time, the root cause service, the root cause and client impact statistics, the top anomalous
     * services, and the status of the insight.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsightSummaries(java.util.Collection)} or {@link #withInsightSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param insightSummaries
     *        The summary of each insight within the group matching the provided filters. The summary contains the
     *        InsightID, start and end time, the root cause service, the root cause and client impact statistics, the
     *        top anomalous services, and the status of the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightSummariesResult withInsightSummaries(InsightSummary... insightSummaries) {
        if (this.insightSummaries == null) {
            setInsightSummaries(new java.util.ArrayList<InsightSummary>(insightSummaries.length));
        }
        for (InsightSummary ele : insightSummaries) {
            this.insightSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary of each insight within the group matching the provided filters. The summary contains the InsightID,
     * start and end time, the root cause service, the root cause and client impact statistics, the top anomalous
     * services, and the status of the insight.
     * </p>
     * 
     * @param insightSummaries
     *        The summary of each insight within the group matching the provided filters. The summary contains the
     *        InsightID, start and end time, the root cause service, the root cause and client impact statistics, the
     *        top anomalous services, and the status of the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightSummariesResult withInsightSummaries(java.util.Collection<InsightSummary> insightSummaries) {
        setInsightSummaries(insightSummaries);
        return this;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @return Pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightSummariesResult withNextToken(String nextToken) {
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
        if (getInsightSummaries() != null)
            sb.append("InsightSummaries: ").append(getInsightSummaries()).append(",");
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

        if (obj instanceof GetInsightSummariesResult == false)
            return false;
        GetInsightSummariesResult other = (GetInsightSummariesResult) obj;
        if (other.getInsightSummaries() == null ^ this.getInsightSummaries() == null)
            return false;
        if (other.getInsightSummaries() != null && other.getInsightSummaries().equals(this.getInsightSummaries()) == false)
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

        hashCode = prime * hashCode + ((getInsightSummaries() == null) ? 0 : getInsightSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInsightSummariesResult clone() {
        try {
            return (GetInsightSummariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
