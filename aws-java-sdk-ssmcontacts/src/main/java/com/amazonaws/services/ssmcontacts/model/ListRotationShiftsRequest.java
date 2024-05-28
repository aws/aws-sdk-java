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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListRotationShifts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRotationShiftsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rotation to retrieve shift information about.
     * </p>
     */
    private String rotationId;
    /**
     * <p>
     * The date and time for the beginning of the time range to list shifts for.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time for the end of the time range to list shifts for.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rotation to retrieve shift information about.
     * </p>
     * 
     * @param rotationId
     *        The Amazon Resource Name (ARN) of the rotation to retrieve shift information about.
     */

    public void setRotationId(String rotationId) {
        this.rotationId = rotationId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rotation to retrieve shift information about.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rotation to retrieve shift information about.
     */

    public String getRotationId() {
        return this.rotationId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rotation to retrieve shift information about.
     * </p>
     * 
     * @param rotationId
     *        The Amazon Resource Name (ARN) of the rotation to retrieve shift information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationShiftsRequest withRotationId(String rotationId) {
        setRotationId(rotationId);
        return this;
    }

    /**
     * <p>
     * The date and time for the beginning of the time range to list shifts for.
     * </p>
     * 
     * @param startTime
     *        The date and time for the beginning of the time range to list shifts for.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time for the beginning of the time range to list shifts for.
     * </p>
     * 
     * @return The date and time for the beginning of the time range to list shifts for.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time for the beginning of the time range to list shifts for.
     * </p>
     * 
     * @param startTime
     *        The date and time for the beginning of the time range to list shifts for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationShiftsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time for the end of the time range to list shifts for.
     * </p>
     * 
     * @param endTime
     *        The date and time for the end of the time range to list shifts for.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time for the end of the time range to list shifts for.
     * </p>
     * 
     * @return The date and time for the end of the time range to list shifts for.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time for the end of the time range to list shifts for.
     * </p>
     * 
     * @param endTime
     *        The date and time for the end of the time range to list shifts for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationShiftsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @return A token to start the list. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationShiftsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRotationShiftsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getRotationId() != null)
            sb.append("RotationId: ").append(getRotationId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRotationShiftsRequest == false)
            return false;
        ListRotationShiftsRequest other = (ListRotationShiftsRequest) obj;
        if (other.getRotationId() == null ^ this.getRotationId() == null)
            return false;
        if (other.getRotationId() != null && other.getRotationId().equals(this.getRotationId()) == false)
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
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRotationId() == null) ? 0 : getRotationId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListRotationShiftsRequest clone() {
        return (ListRotationShiftsRequest) super.clone();
    }

}
