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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeScheduledActions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduledActionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the scheduled action to retrieve.
     * </p>
     */
    private String scheduledActionName;
    /**
     * <p>
     * The type of the scheduled actions to retrieve.
     * </p>
     */
    private String targetActionType;
    /**
     * <p>
     * The start time in UTC of the scheduled actions to retrieve. Only active scheduled actions that have invocations
     * after this time are retrieved.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time in UTC of the scheduled action to retrieve. Only active scheduled actions that have invocations
     * before this time are retrieved.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * If true, retrieve only active scheduled actions. If false, retrieve only disabled scheduled actions.
     * </p>
     */
    private Boolean active;
    /**
     * <p>
     * List of scheduled action filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScheduledActionFilter> filters;
    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeScheduledActions</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a
     * value in the <code>Marker</code> field of the response. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The name of the scheduled action to retrieve.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action to retrieve.
     */

    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action to retrieve.
     * </p>
     * 
     * @return The name of the scheduled action to retrieve.
     */

    public String getScheduledActionName() {
        return this.scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action to retrieve.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsRequest withScheduledActionName(String scheduledActionName) {
        setScheduledActionName(scheduledActionName);
        return this;
    }

    /**
     * <p>
     * The type of the scheduled actions to retrieve.
     * </p>
     * 
     * @param targetActionType
     *        The type of the scheduled actions to retrieve.
     * @see ScheduledActionTypeValues
     */

    public void setTargetActionType(String targetActionType) {
        this.targetActionType = targetActionType;
    }

    /**
     * <p>
     * The type of the scheduled actions to retrieve.
     * </p>
     * 
     * @return The type of the scheduled actions to retrieve.
     * @see ScheduledActionTypeValues
     */

    public String getTargetActionType() {
        return this.targetActionType;
    }

    /**
     * <p>
     * The type of the scheduled actions to retrieve.
     * </p>
     * 
     * @param targetActionType
     *        The type of the scheduled actions to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledActionTypeValues
     */

    public DescribeScheduledActionsRequest withTargetActionType(String targetActionType) {
        setTargetActionType(targetActionType);
        return this;
    }

    /**
     * <p>
     * The type of the scheduled actions to retrieve.
     * </p>
     * 
     * @param targetActionType
     *        The type of the scheduled actions to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledActionTypeValues
     */

    public DescribeScheduledActionsRequest withTargetActionType(ScheduledActionTypeValues targetActionType) {
        this.targetActionType = targetActionType.toString();
        return this;
    }

    /**
     * <p>
     * The start time in UTC of the scheduled actions to retrieve. Only active scheduled actions that have invocations
     * after this time are retrieved.
     * </p>
     * 
     * @param startTime
     *        The start time in UTC of the scheduled actions to retrieve. Only active scheduled actions that have
     *        invocations after this time are retrieved.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time in UTC of the scheduled actions to retrieve. Only active scheduled actions that have invocations
     * after this time are retrieved.
     * </p>
     * 
     * @return The start time in UTC of the scheduled actions to retrieve. Only active scheduled actions that have
     *         invocations after this time are retrieved.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time in UTC of the scheduled actions to retrieve. Only active scheduled actions that have invocations
     * after this time are retrieved.
     * </p>
     * 
     * @param startTime
     *        The start time in UTC of the scheduled actions to retrieve. Only active scheduled actions that have
     *        invocations after this time are retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time in UTC of the scheduled action to retrieve. Only active scheduled actions that have invocations
     * before this time are retrieved.
     * </p>
     * 
     * @param endTime
     *        The end time in UTC of the scheduled action to retrieve. Only active scheduled actions that have
     *        invocations before this time are retrieved.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time in UTC of the scheduled action to retrieve. Only active scheduled actions that have invocations
     * before this time are retrieved.
     * </p>
     * 
     * @return The end time in UTC of the scheduled action to retrieve. Only active scheduled actions that have
     *         invocations before this time are retrieved.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time in UTC of the scheduled action to retrieve. Only active scheduled actions that have invocations
     * before this time are retrieved.
     * </p>
     * 
     * @param endTime
     *        The end time in UTC of the scheduled action to retrieve. Only active scheduled actions that have
     *        invocations before this time are retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * If true, retrieve only active scheduled actions. If false, retrieve only disabled scheduled actions.
     * </p>
     * 
     * @param active
     *        If true, retrieve only active scheduled actions. If false, retrieve only disabled scheduled actions.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * If true, retrieve only active scheduled actions. If false, retrieve only disabled scheduled actions.
     * </p>
     * 
     * @return If true, retrieve only active scheduled actions. If false, retrieve only disabled scheduled actions.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * If true, retrieve only active scheduled actions. If false, retrieve only disabled scheduled actions.
     * </p>
     * 
     * @param active
     *        If true, retrieve only active scheduled actions. If false, retrieve only disabled scheduled actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsRequest withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * If true, retrieve only active scheduled actions. If false, retrieve only disabled scheduled actions.
     * </p>
     * 
     * @return If true, retrieve only active scheduled actions. If false, retrieve only disabled scheduled actions.
     */

    public Boolean isActive() {
        return this.active;
    }

    /**
     * <p>
     * List of scheduled action filters.
     * </p>
     * 
     * @return List of scheduled action filters.
     */

    public java.util.List<ScheduledActionFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<ScheduledActionFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * List of scheduled action filters.
     * </p>
     * 
     * @param filters
     *        List of scheduled action filters.
     */

    public void setFilters(java.util.Collection<ScheduledActionFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<ScheduledActionFilter>(filters);
    }

    /**
     * <p>
     * List of scheduled action filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        List of scheduled action filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsRequest withFilters(ScheduledActionFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<ScheduledActionFilter>(filters.length));
        }
        for (ScheduledActionFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of scheduled action filters.
     * </p>
     * 
     * @param filters
     *        List of scheduled action filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsRequest withFilters(java.util.Collection<ScheduledActionFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeScheduledActions</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a
     * value in the <code>Marker</code> field of the response. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeScheduledActions</a> request exceed the value specified in <code>MaxRecords</code>
     *        , AWS returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     *        response records by providing the returned marker value in the <code>Marker</code> parameter and retrying
     *        the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeScheduledActions</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a
     * value in the <code>Marker</code> field of the response. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @return An optional parameter that specifies the starting point to return a set of response records. When the
     *         results of a <a>DescribeScheduledActions</a> request exceed the value specified in
     *         <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code> field of the response. You can
     *         retrieve the next set of response records by providing the returned marker value in the
     *         <code>Marker</code> parameter and retrying the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeScheduledActions</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a
     * value in the <code>Marker</code> field of the response. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeScheduledActions</a> request exceed the value specified in <code>MaxRecords</code>
     *        , AWS returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     *        response records by providing the returned marker value in the <code>Marker</code> parameter and retrying
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value. </p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <p>
     *        Constraints: minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of response records to return in each call. If the number of remaining response
     *         records exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code>
     *         field of the response. You can retrieve the next set of records by retrying the command with the returned
     *         marker value. </p>
     *         <p>
     *         Default: <code>100</code>
     *         </p>
     *         <p>
     *         Constraints: minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value. </p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <p>
     *        Constraints: minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
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
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: ").append(getScheduledActionName()).append(",");
        if (getTargetActionType() != null)
            sb.append("TargetActionType: ").append(getTargetActionType()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getActive() != null)
            sb.append("Active: ").append(getActive()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduledActionsRequest == false)
            return false;
        DescribeScheduledActionsRequest other = (DescribeScheduledActionsRequest) obj;
        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null)
            return false;
        if (other.getScheduledActionName() != null && other.getScheduledActionName().equals(this.getScheduledActionName()) == false)
            return false;
        if (other.getTargetActionType() == null ^ this.getTargetActionType() == null)
            return false;
        if (other.getTargetActionType() != null && other.getTargetActionType().equals(this.getTargetActionType()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledActionName() == null) ? 0 : getScheduledActionName().hashCode());
        hashCode = prime * hashCode + ((getTargetActionType() == null) ? 0 : getTargetActionType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScheduledActionsRequest clone() {
        return (DescribeScheduledActionsRequest) super.clone();
    }

}
