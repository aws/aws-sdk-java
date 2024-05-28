/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListParticipants" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListParticipantsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the response list to only show participants who published during the stage session. Only one of
     * <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided per
     * request.
     * </p>
     */
    private Boolean filterByPublished;
    /**
     * <p>
     * Filters the response list to only show participants in the specified state. Only one of
     * <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided per
     * request.
     * </p>
     */
    private String filterByState;
    /**
     * <p>
     * Filters the response list to match the specified user ID. Only one of <code>filterByUserId</code>,
     * <code>filterByPublished</code>, or <code>filterByState</code> can be provided per request. A <code>userId</code>
     * is a customer-assigned name to help identify the token; this can be used to link a participant to a user in the
     * customer’s own systems.
     * </p>
     */
    private String filterByUserId;
    /**
     * <p>
     * Maximum number of results to return. Default: 50.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The first participant to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * ID of the session within the stage.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * Stage ARN.
     * </p>
     */
    private String stageArn;

    /**
     * <p>
     * Filters the response list to only show participants who published during the stage session. Only one of
     * <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided per
     * request.
     * </p>
     * 
     * @param filterByPublished
     *        Filters the response list to only show participants who published during the stage session. Only one of
     *        <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided
     *        per request.
     */

    public void setFilterByPublished(Boolean filterByPublished) {
        this.filterByPublished = filterByPublished;
    }

    /**
     * <p>
     * Filters the response list to only show participants who published during the stage session. Only one of
     * <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided per
     * request.
     * </p>
     * 
     * @return Filters the response list to only show participants who published during the stage session. Only one of
     *         <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be
     *         provided per request.
     */

    public Boolean getFilterByPublished() {
        return this.filterByPublished;
    }

    /**
     * <p>
     * Filters the response list to only show participants who published during the stage session. Only one of
     * <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided per
     * request.
     * </p>
     * 
     * @param filterByPublished
     *        Filters the response list to only show participants who published during the stage session. Only one of
     *        <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided
     *        per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParticipantsRequest withFilterByPublished(Boolean filterByPublished) {
        setFilterByPublished(filterByPublished);
        return this;
    }

    /**
     * <p>
     * Filters the response list to only show participants who published during the stage session. Only one of
     * <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided per
     * request.
     * </p>
     * 
     * @return Filters the response list to only show participants who published during the stage session. Only one of
     *         <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be
     *         provided per request.
     */

    public Boolean isFilterByPublished() {
        return this.filterByPublished;
    }

    /**
     * <p>
     * Filters the response list to only show participants in the specified state. Only one of
     * <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided per
     * request.
     * </p>
     * 
     * @param filterByState
     *        Filters the response list to only show participants in the specified state. Only one of
     *        <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided
     *        per request.
     * @see ParticipantState
     */

    public void setFilterByState(String filterByState) {
        this.filterByState = filterByState;
    }

    /**
     * <p>
     * Filters the response list to only show participants in the specified state. Only one of
     * <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided per
     * request.
     * </p>
     * 
     * @return Filters the response list to only show participants in the specified state. Only one of
     *         <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be
     *         provided per request.
     * @see ParticipantState
     */

    public String getFilterByState() {
        return this.filterByState;
    }

    /**
     * <p>
     * Filters the response list to only show participants in the specified state. Only one of
     * <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided per
     * request.
     * </p>
     * 
     * @param filterByState
     *        Filters the response list to only show participants in the specified state. Only one of
     *        <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided
     *        per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantState
     */

    public ListParticipantsRequest withFilterByState(String filterByState) {
        setFilterByState(filterByState);
        return this;
    }

    /**
     * <p>
     * Filters the response list to only show participants in the specified state. Only one of
     * <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided per
     * request.
     * </p>
     * 
     * @param filterByState
     *        Filters the response list to only show participants in the specified state. Only one of
     *        <code>filterByUserId</code>, <code>filterByPublished</code>, or <code>filterByState</code> can be provided
     *        per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantState
     */

    public ListParticipantsRequest withFilterByState(ParticipantState filterByState) {
        this.filterByState = filterByState.toString();
        return this;
    }

    /**
     * <p>
     * Filters the response list to match the specified user ID. Only one of <code>filterByUserId</code>,
     * <code>filterByPublished</code>, or <code>filterByState</code> can be provided per request. A <code>userId</code>
     * is a customer-assigned name to help identify the token; this can be used to link a participant to a user in the
     * customer’s own systems.
     * </p>
     * 
     * @param filterByUserId
     *        Filters the response list to match the specified user ID. Only one of <code>filterByUserId</code>,
     *        <code>filterByPublished</code>, or <code>filterByState</code> can be provided per request. A
     *        <code>userId</code> is a customer-assigned name to help identify the token; this can be used to link a
     *        participant to a user in the customer’s own systems.
     */

    public void setFilterByUserId(String filterByUserId) {
        this.filterByUserId = filterByUserId;
    }

    /**
     * <p>
     * Filters the response list to match the specified user ID. Only one of <code>filterByUserId</code>,
     * <code>filterByPublished</code>, or <code>filterByState</code> can be provided per request. A <code>userId</code>
     * is a customer-assigned name to help identify the token; this can be used to link a participant to a user in the
     * customer’s own systems.
     * </p>
     * 
     * @return Filters the response list to match the specified user ID. Only one of <code>filterByUserId</code>,
     *         <code>filterByPublished</code>, or <code>filterByState</code> can be provided per request. A
     *         <code>userId</code> is a customer-assigned name to help identify the token; this can be used to link a
     *         participant to a user in the customer’s own systems.
     */

    public String getFilterByUserId() {
        return this.filterByUserId;
    }

    /**
     * <p>
     * Filters the response list to match the specified user ID. Only one of <code>filterByUserId</code>,
     * <code>filterByPublished</code>, or <code>filterByState</code> can be provided per request. A <code>userId</code>
     * is a customer-assigned name to help identify the token; this can be used to link a participant to a user in the
     * customer’s own systems.
     * </p>
     * 
     * @param filterByUserId
     *        Filters the response list to match the specified user ID. Only one of <code>filterByUserId</code>,
     *        <code>filterByPublished</code>, or <code>filterByState</code> can be provided per request. A
     *        <code>userId</code> is a customer-assigned name to help identify the token; this can be used to link a
     *        participant to a user in the customer’s own systems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParticipantsRequest withFilterByUserId(String filterByUserId) {
        setFilterByUserId(filterByUserId);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return. Default: 50.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return. Default: 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return. Default: 50.
     * </p>
     * 
     * @return Maximum number of results to return. Default: 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return. Default: 50.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return. Default: 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParticipantsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The first participant to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @param nextToken
     *        The first participant to retrieve. This is used for pagination; see the <code>nextToken</code> response
     *        field.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The first participant to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @return The first participant to retrieve. This is used for pagination; see the <code>nextToken</code> response
     *         field.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The first participant to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @param nextToken
     *        The first participant to retrieve. This is used for pagination; see the <code>nextToken</code> response
     *        field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParticipantsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * ID of the session within the stage.
     * </p>
     * 
     * @param sessionId
     *        ID of the session within the stage.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * ID of the session within the stage.
     * </p>
     * 
     * @return ID of the session within the stage.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * ID of the session within the stage.
     * </p>
     * 
     * @param sessionId
     *        ID of the session within the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParticipantsRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * Stage ARN.
     * </p>
     * 
     * @param stageArn
     *        Stage ARN.
     */

    public void setStageArn(String stageArn) {
        this.stageArn = stageArn;
    }

    /**
     * <p>
     * Stage ARN.
     * </p>
     * 
     * @return Stage ARN.
     */

    public String getStageArn() {
        return this.stageArn;
    }

    /**
     * <p>
     * Stage ARN.
     * </p>
     * 
     * @param stageArn
     *        Stage ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParticipantsRequest withStageArn(String stageArn) {
        setStageArn(stageArn);
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
        if (getFilterByPublished() != null)
            sb.append("FilterByPublished: ").append(getFilterByPublished()).append(",");
        if (getFilterByState() != null)
            sb.append("FilterByState: ").append(getFilterByState()).append(",");
        if (getFilterByUserId() != null)
            sb.append("FilterByUserId: ").append(getFilterByUserId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getStageArn() != null)
            sb.append("StageArn: ").append(getStageArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListParticipantsRequest == false)
            return false;
        ListParticipantsRequest other = (ListParticipantsRequest) obj;
        if (other.getFilterByPublished() == null ^ this.getFilterByPublished() == null)
            return false;
        if (other.getFilterByPublished() != null && other.getFilterByPublished().equals(this.getFilterByPublished()) == false)
            return false;
        if (other.getFilterByState() == null ^ this.getFilterByState() == null)
            return false;
        if (other.getFilterByState() != null && other.getFilterByState().equals(this.getFilterByState()) == false)
            return false;
        if (other.getFilterByUserId() == null ^ this.getFilterByUserId() == null)
            return false;
        if (other.getFilterByUserId() != null && other.getFilterByUserId().equals(this.getFilterByUserId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getStageArn() == null ^ this.getStageArn() == null)
            return false;
        if (other.getStageArn() != null && other.getStageArn().equals(this.getStageArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterByPublished() == null) ? 0 : getFilterByPublished().hashCode());
        hashCode = prime * hashCode + ((getFilterByState() == null) ? 0 : getFilterByState().hashCode());
        hashCode = prime * hashCode + ((getFilterByUserId() == null) ? 0 : getFilterByUserId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getStageArn() == null) ? 0 : getStageArn().hashCode());
        return hashCode;
    }

    @Override
    public ListParticipantsRequest clone() {
        return (ListParticipantsRequest) super.clone();
    }

}
