/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListAnomaliesForInsight"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnomaliesForInsightRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String insightId;

    private Integer maxResults;

    private String nextToken;

    private StartTimeRange startTimeRange;

    /**
     * @param insightId
     */

    public void setInsightId(String insightId) {
        this.insightId = insightId;
    }

    /**
     * @return
     */

    public String getInsightId() {
        return this.insightId;
    }

    /**
     * @param insightId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomaliesForInsightRequest withInsightId(String insightId) {
        setInsightId(insightId);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomaliesForInsightRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomaliesForInsightRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param startTimeRange
     */

    public void setStartTimeRange(StartTimeRange startTimeRange) {
        this.startTimeRange = startTimeRange;
    }

    /**
     * @return
     */

    public StartTimeRange getStartTimeRange() {
        return this.startTimeRange;
    }

    /**
     * @param startTimeRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomaliesForInsightRequest withStartTimeRange(StartTimeRange startTimeRange) {
        setStartTimeRange(startTimeRange);
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
        if (getInsightId() != null)
            sb.append("InsightId: ").append(getInsightId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStartTimeRange() != null)
            sb.append("StartTimeRange: ").append(getStartTimeRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAnomaliesForInsightRequest == false)
            return false;
        ListAnomaliesForInsightRequest other = (ListAnomaliesForInsightRequest) obj;
        if (other.getInsightId() == null ^ this.getInsightId() == null)
            return false;
        if (other.getInsightId() != null && other.getInsightId().equals(this.getInsightId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStartTimeRange() == null ^ this.getStartTimeRange() == null)
            return false;
        if (other.getStartTimeRange() != null && other.getStartTimeRange().equals(this.getStartTimeRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightId() == null) ? 0 : getInsightId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStartTimeRange() == null) ? 0 : getStartTimeRange().hashCode());
        return hashCode;
    }

    @Override
    public ListAnomaliesForInsightRequest clone() {
        return (ListAnomaliesForInsightRequest) super.clone();
    }

}
