/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeActivities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeActivitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     */
    private String authenticationToken;
    /**
     * <p>
     * The timestamp that determines the starting time of the activities. The response includes the activities performed
     * after the specified timestamp.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The timestamp that determines the end time of the activities. The response includes the activities performed
     * before the specified timestamp.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The ID of the organization. This is a mandatory parameter when using administrative API (SigV4) requests.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The ID of the user who performed the action. The response includes activities pertaining to this user. This is an
     * optional parameter and is only applicable for administrative API (SigV4) requests.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     */

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @return Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *         accessing the API using AWS credentials.
     */

    public String getAuthenticationToken() {
        return this.authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivitiesRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * <p>
     * The timestamp that determines the starting time of the activities. The response includes the activities performed
     * after the specified timestamp.
     * </p>
     * 
     * @param startTime
     *        The timestamp that determines the starting time of the activities. The response includes the activities
     *        performed after the specified timestamp.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp that determines the starting time of the activities. The response includes the activities performed
     * after the specified timestamp.
     * </p>
     * 
     * @return The timestamp that determines the starting time of the activities. The response includes the activities
     *         performed after the specified timestamp.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp that determines the starting time of the activities. The response includes the activities performed
     * after the specified timestamp.
     * </p>
     * 
     * @param startTime
     *        The timestamp that determines the starting time of the activities. The response includes the activities
     *        performed after the specified timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivitiesRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The timestamp that determines the end time of the activities. The response includes the activities performed
     * before the specified timestamp.
     * </p>
     * 
     * @param endTime
     *        The timestamp that determines the end time of the activities. The response includes the activities
     *        performed before the specified timestamp.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp that determines the end time of the activities. The response includes the activities performed
     * before the specified timestamp.
     * </p>
     * 
     * @return The timestamp that determines the end time of the activities. The response includes the activities
     *         performed before the specified timestamp.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp that determines the end time of the activities. The response includes the activities performed
     * before the specified timestamp.
     * </p>
     * 
     * @param endTime
     *        The timestamp that determines the end time of the activities. The response includes the activities
     *        performed before the specified timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivitiesRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The ID of the organization. This is a mandatory parameter when using administrative API (SigV4) requests.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization. This is a mandatory parameter when using administrative API (SigV4) requests.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The ID of the organization. This is a mandatory parameter when using administrative API (SigV4) requests.
     * </p>
     * 
     * @return The ID of the organization. This is a mandatory parameter when using administrative API (SigV4) requests.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The ID of the organization. This is a mandatory parameter when using administrative API (SigV4) requests.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization. This is a mandatory parameter when using administrative API (SigV4) requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivitiesRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The ID of the user who performed the action. The response includes activities pertaining to this user. This is an
     * optional parameter and is only applicable for administrative API (SigV4) requests.
     * </p>
     * 
     * @param userId
     *        The ID of the user who performed the action. The response includes activities pertaining to this user.
     *        This is an optional parameter and is only applicable for administrative API (SigV4) requests.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the user who performed the action. The response includes activities pertaining to this user. This is an
     * optional parameter and is only applicable for administrative API (SigV4) requests.
     * </p>
     * 
     * @return The ID of the user who performed the action. The response includes activities pertaining to this user.
     *         This is an optional parameter and is only applicable for administrative API (SigV4) requests.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ID of the user who performed the action. The response includes activities pertaining to this user. This is an
     * optional parameter and is only applicable for administrative API (SigV4) requests.
     * </p>
     * 
     * @param userId
     *        The ID of the user who performed the action. The response includes activities pertaining to this user.
     *        This is an optional parameter and is only applicable for administrative API (SigV4) requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivitiesRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @return The maximum number of items to return.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivitiesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @return The marker for the next set of results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivitiesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAuthenticationToken() != null)
            sb.append("AuthenticationToken: ").append(getAuthenticationToken()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeActivitiesRequest == false)
            return false;
        DescribeActivitiesRequest other = (DescribeActivitiesRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeActivitiesRequest clone() {
        return (DescribeActivitiesRequest) super.clone();
    }

}
