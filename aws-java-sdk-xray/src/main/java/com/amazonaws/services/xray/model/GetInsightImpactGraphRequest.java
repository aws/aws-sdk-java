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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsightImpactGraph" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightImpactGraphRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     * </p>
     */
    private String insightId;
    /**
     * <p>
     * The estimated start time of the insight, in Unix time seconds. The StartTime is inclusive of the value provided
     * and can't be more than 30 days old.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The estimated end time of the insight, in Unix time seconds. The EndTime is exclusive of the value provided. The
     * time range between the start time and end time can't be more than six hours.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Specify the pagination token returned by a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     * </p>
     * 
     * @param insightId
     *        The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     */

    public void setInsightId(String insightId) {
        this.insightId = insightId;
    }

    /**
     * <p>
     * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     * </p>
     * 
     * @return The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     */

    public String getInsightId() {
        return this.insightId;
    }

    /**
     * <p>
     * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     * </p>
     * 
     * @param insightId
     *        The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightImpactGraphRequest withInsightId(String insightId) {
        setInsightId(insightId);
        return this;
    }

    /**
     * <p>
     * The estimated start time of the insight, in Unix time seconds. The StartTime is inclusive of the value provided
     * and can't be more than 30 days old.
     * </p>
     * 
     * @param startTime
     *        The estimated start time of the insight, in Unix time seconds. The StartTime is inclusive of the value
     *        provided and can't be more than 30 days old.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The estimated start time of the insight, in Unix time seconds. The StartTime is inclusive of the value provided
     * and can't be more than 30 days old.
     * </p>
     * 
     * @return The estimated start time of the insight, in Unix time seconds. The StartTime is inclusive of the value
     *         provided and can't be more than 30 days old.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The estimated start time of the insight, in Unix time seconds. The StartTime is inclusive of the value provided
     * and can't be more than 30 days old.
     * </p>
     * 
     * @param startTime
     *        The estimated start time of the insight, in Unix time seconds. The StartTime is inclusive of the value
     *        provided and can't be more than 30 days old.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightImpactGraphRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The estimated end time of the insight, in Unix time seconds. The EndTime is exclusive of the value provided. The
     * time range between the start time and end time can't be more than six hours.
     * </p>
     * 
     * @param endTime
     *        The estimated end time of the insight, in Unix time seconds. The EndTime is exclusive of the value
     *        provided. The time range between the start time and end time can't be more than six hours.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The estimated end time of the insight, in Unix time seconds. The EndTime is exclusive of the value provided. The
     * time range between the start time and end time can't be more than six hours.
     * </p>
     * 
     * @return The estimated end time of the insight, in Unix time seconds. The EndTime is exclusive of the value
     *         provided. The time range between the start time and end time can't be more than six hours.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The estimated end time of the insight, in Unix time seconds. The EndTime is exclusive of the value provided. The
     * time range between the start time and end time can't be more than six hours.
     * </p>
     * 
     * @param endTime
     *        The estimated end time of the insight, in Unix time seconds. The EndTime is exclusive of the value
     *        provided. The time range between the start time and end time can't be more than six hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightImpactGraphRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token returned by a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token returned by a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token returned by a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token returned by a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token returned by a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token returned by a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightImpactGraphRequest withNextToken(String nextToken) {
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
        if (getInsightId() != null)
            sb.append("InsightId: ").append(getInsightId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
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

        if (obj instanceof GetInsightImpactGraphRequest == false)
            return false;
        GetInsightImpactGraphRequest other = (GetInsightImpactGraphRequest) obj;
        if (other.getInsightId() == null ^ this.getInsightId() == null)
            return false;
        if (other.getInsightId() != null && other.getInsightId().equals(this.getInsightId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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

        hashCode = prime * hashCode + ((getInsightId() == null) ? 0 : getInsightId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInsightImpactGraphRequest clone() {
        return (GetInsightImpactGraphRequest) super.clone();
    }

}
