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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsightSummaries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightSummariesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of insight states.
     * </p>
     */
    private java.util.List<String> states;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group. Required if the GroupName isn't provided.
     * </p>
     */
    private String groupARN;
    /**
     * <p>
     * The name of the group. Required if the GroupARN isn't provided.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The beginning of the time frame in which the insights started. The start time can't be more than 30 days old.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time frame in which the insights ended. The end time can't be more than 30 days old.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The maximum number of results to display.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of insight states.
     * </p>
     * 
     * @return The list of insight states.
     * @see InsightState
     */

    public java.util.List<String> getStates() {
        return states;
    }

    /**
     * <p>
     * The list of insight states.
     * </p>
     * 
     * @param states
     *        The list of insight states.
     * @see InsightState
     */

    public void setStates(java.util.Collection<String> states) {
        if (states == null) {
            this.states = null;
            return;
        }

        this.states = new java.util.ArrayList<String>(states);
    }

    /**
     * <p>
     * The list of insight states.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStates(java.util.Collection)} or {@link #withStates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param states
     *        The list of insight states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightState
     */

    public GetInsightSummariesRequest withStates(String... states) {
        if (this.states == null) {
            setStates(new java.util.ArrayList<String>(states.length));
        }
        for (String ele : states) {
            this.states.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of insight states.
     * </p>
     * 
     * @param states
     *        The list of insight states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightState
     */

    public GetInsightSummariesRequest withStates(java.util.Collection<String> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * The list of insight states.
     * </p>
     * 
     * @param states
     *        The list of insight states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightState
     */

    public GetInsightSummariesRequest withStates(InsightState... states) {
        java.util.ArrayList<String> statesCopy = new java.util.ArrayList<String>(states.length);
        for (InsightState value : states) {
            statesCopy.add(value.toString());
        }
        if (getStates() == null) {
            setStates(statesCopy);
        } else {
            getStates().addAll(statesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group. Required if the GroupName isn't provided.
     * </p>
     * 
     * @param groupARN
     *        The Amazon Resource Name (ARN) of the group. Required if the GroupName isn't provided.
     */

    public void setGroupARN(String groupARN) {
        this.groupARN = groupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group. Required if the GroupName isn't provided.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the group. Required if the GroupName isn't provided.
     */

    public String getGroupARN() {
        return this.groupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group. Required if the GroupName isn't provided.
     * </p>
     * 
     * @param groupARN
     *        The Amazon Resource Name (ARN) of the group. Required if the GroupName isn't provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightSummariesRequest withGroupARN(String groupARN) {
        setGroupARN(groupARN);
        return this;
    }

    /**
     * <p>
     * The name of the group. Required if the GroupARN isn't provided.
     * </p>
     * 
     * @param groupName
     *        The name of the group. Required if the GroupARN isn't provided.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group. Required if the GroupARN isn't provided.
     * </p>
     * 
     * @return The name of the group. Required if the GroupARN isn't provided.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group. Required if the GroupARN isn't provided.
     * </p>
     * 
     * @param groupName
     *        The name of the group. Required if the GroupARN isn't provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightSummariesRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The beginning of the time frame in which the insights started. The start time can't be more than 30 days old.
     * </p>
     * 
     * @param startTime
     *        The beginning of the time frame in which the insights started. The start time can't be more than 30 days
     *        old.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The beginning of the time frame in which the insights started. The start time can't be more than 30 days old.
     * </p>
     * 
     * @return The beginning of the time frame in which the insights started. The start time can't be more than 30 days
     *         old.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The beginning of the time frame in which the insights started. The start time can't be more than 30 days old.
     * </p>
     * 
     * @param startTime
     *        The beginning of the time frame in which the insights started. The start time can't be more than 30 days
     *        old.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightSummariesRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time frame in which the insights ended. The end time can't be more than 30 days old.
     * </p>
     * 
     * @param endTime
     *        The end of the time frame in which the insights ended. The end time can't be more than 30 days old.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time frame in which the insights ended. The end time can't be more than 30 days old.
     * </p>
     * 
     * @return The end of the time frame in which the insights ended. The end time can't be more than 30 days old.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time frame in which the insights ended. The end time can't be more than 30 days old.
     * </p>
     * 
     * @param endTime
     *        The end of the time frame in which the insights ended. The end time can't be more than 30 days old.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightSummariesRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to display.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to display.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to display.
     * </p>
     * 
     * @return The maximum number of results to display.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to display.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightSummariesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public GetInsightSummariesRequest withNextToken(String nextToken) {
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
        if (getStates() != null)
            sb.append("States: ").append(getStates()).append(",");
        if (getGroupARN() != null)
            sb.append("GroupARN: ").append(getGroupARN()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof GetInsightSummariesRequest == false)
            return false;
        GetInsightSummariesRequest other = (GetInsightSummariesRequest) obj;
        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        if (other.getGroupARN() == null ^ this.getGroupARN() == null)
            return false;
        if (other.getGroupARN() != null && other.getGroupARN().equals(this.getGroupARN()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getStates() == null) ? 0 : getStates().hashCode());
        hashCode = prime * hashCode + ((getGroupARN() == null) ? 0 : getGroupARN().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInsightSummariesRequest clone() {
        return (GetInsightSummariesRequest) super.clone();
    }

}
