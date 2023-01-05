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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPropertyValueHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPropertyValueHistoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The ID of the entity.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The ID of the component type.
     * </p>
     */
    private String componentTypeId;
    /**
     * <p>
     * A list of properties whose value histories the request retrieves.
     * </p>
     */
    private java.util.List<String> selectedProperties;
    /**
     * <p>
     * A list of objects that filter the property value history request.
     * </p>
     */
    private java.util.List<PropertyFilter> propertyFilters;
    /**
     * <p>
     * The date and time of the earliest property value to return.
     * </p>
     */
    @Deprecated
    private java.util.Date startDateTime;
    /**
     * <p>
     * The date and time of the latest property value to return.
     * </p>
     */
    @Deprecated
    private java.util.Date endDateTime;
    /**
     * <p>
     * An object that specifies the interpolation type and the interval over which to interpolate data.
     * </p>
     */
    private InterpolationParameters interpolation;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 250.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The time direction to use in the result order.
     * </p>
     */
    private String orderByTime;
    /**
     * <p>
     * The ISO8601 DateTime of the earliest property value to return.
     * </p>
     * <p>
     * For more information about the ISO8601 DateTime format, see the data type <a
     * href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html">PropertyValue</a>.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * The ISO8601 DateTime of the latest property value to return.
     * </p>
     * <p>
     * For more information about the ISO8601 DateTime format, see the data type <a
     * href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html">PropertyValue</a>.
     * </p>
     */
    private String endTime;

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @return The ID of the workspace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueHistoryRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the entity.
     * </p>
     * 
     * @param entityId
     *        The ID of the entity.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The ID of the entity.
     * </p>
     * 
     * @return The ID of the entity.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The ID of the entity.
     * </p>
     * 
     * @param entityId
     *        The ID of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueHistoryRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueHistoryRequest withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type.
     */

    public void setComponentTypeId(String componentTypeId) {
        this.componentTypeId = componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @return The ID of the component type.
     */

    public String getComponentTypeId() {
        return this.componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueHistoryRequest withComponentTypeId(String componentTypeId) {
        setComponentTypeId(componentTypeId);
        return this;
    }

    /**
     * <p>
     * A list of properties whose value histories the request retrieves.
     * </p>
     * 
     * @return A list of properties whose value histories the request retrieves.
     */

    public java.util.List<String> getSelectedProperties() {
        return selectedProperties;
    }

    /**
     * <p>
     * A list of properties whose value histories the request retrieves.
     * </p>
     * 
     * @param selectedProperties
     *        A list of properties whose value histories the request retrieves.
     */

    public void setSelectedProperties(java.util.Collection<String> selectedProperties) {
        if (selectedProperties == null) {
            this.selectedProperties = null;
            return;
        }

        this.selectedProperties = new java.util.ArrayList<String>(selectedProperties);
    }

    /**
     * <p>
     * A list of properties whose value histories the request retrieves.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedProperties(java.util.Collection)} or {@link #withSelectedProperties(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param selectedProperties
     *        A list of properties whose value histories the request retrieves.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueHistoryRequest withSelectedProperties(String... selectedProperties) {
        if (this.selectedProperties == null) {
            setSelectedProperties(new java.util.ArrayList<String>(selectedProperties.length));
        }
        for (String ele : selectedProperties) {
            this.selectedProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of properties whose value histories the request retrieves.
     * </p>
     * 
     * @param selectedProperties
     *        A list of properties whose value histories the request retrieves.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueHistoryRequest withSelectedProperties(java.util.Collection<String> selectedProperties) {
        setSelectedProperties(selectedProperties);
        return this;
    }

    /**
     * <p>
     * A list of objects that filter the property value history request.
     * </p>
     * 
     * @return A list of objects that filter the property value history request.
     */

    public java.util.List<PropertyFilter> getPropertyFilters() {
        return propertyFilters;
    }

    /**
     * <p>
     * A list of objects that filter the property value history request.
     * </p>
     * 
     * @param propertyFilters
     *        A list of objects that filter the property value history request.
     */

    public void setPropertyFilters(java.util.Collection<PropertyFilter> propertyFilters) {
        if (propertyFilters == null) {
            this.propertyFilters = null;
            return;
        }

        this.propertyFilters = new java.util.ArrayList<PropertyFilter>(propertyFilters);
    }

    /**
     * <p>
     * A list of objects that filter the property value history request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertyFilters(java.util.Collection)} or {@link #withPropertyFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param propertyFilters
     *        A list of objects that filter the property value history request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueHistoryRequest withPropertyFilters(PropertyFilter... propertyFilters) {
        if (this.propertyFilters == null) {
            setPropertyFilters(new java.util.ArrayList<PropertyFilter>(propertyFilters.length));
        }
        for (PropertyFilter ele : propertyFilters) {
            this.propertyFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that filter the property value history request.
     * </p>
     * 
     * @param propertyFilters
     *        A list of objects that filter the property value history request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueHistoryRequest withPropertyFilters(java.util.Collection<PropertyFilter> propertyFilters) {
        setPropertyFilters(propertyFilters);
        return this;
    }

    /**
     * <p>
     * The date and time of the earliest property value to return.
     * </p>
     * 
     * @param startDateTime
     *        The date and time of the earliest property value to return.
     */
    @Deprecated
    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The date and time of the earliest property value to return.
     * </p>
     * 
     * @return The date and time of the earliest property value to return.
     */
    @Deprecated
    public java.util.Date getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * The date and time of the earliest property value to return.
     * </p>
     * 
     * @param startDateTime
     *        The date and time of the earliest property value to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public GetPropertyValueHistoryRequest withStartDateTime(java.util.Date startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time of the latest property value to return.
     * </p>
     * 
     * @param endDateTime
     *        The date and time of the latest property value to return.
     */
    @Deprecated
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The date and time of the latest property value to return.
     * </p>
     * 
     * @return The date and time of the latest property value to return.
     */
    @Deprecated
    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * The date and time of the latest property value to return.
     * </p>
     * 
     * @param endDateTime
     *        The date and time of the latest property value to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public GetPropertyValueHistoryRequest withEndDateTime(java.util.Date endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * <p>
     * An object that specifies the interpolation type and the interval over which to interpolate data.
     * </p>
     * 
     * @param interpolation
     *        An object that specifies the interpolation type and the interval over which to interpolate data.
     */

    public void setInterpolation(InterpolationParameters interpolation) {
        this.interpolation = interpolation;
    }

    /**
     * <p>
     * An object that specifies the interpolation type and the interval over which to interpolate data.
     * </p>
     * 
     * @return An object that specifies the interpolation type and the interval over which to interpolate data.
     */

    public InterpolationParameters getInterpolation() {
        return this.interpolation;
    }

    /**
     * <p>
     * An object that specifies the interpolation type and the interval over which to interpolate data.
     * </p>
     * 
     * @param interpolation
     *        An object that specifies the interpolation type and the interval over which to interpolate data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueHistoryRequest withInterpolation(InterpolationParameters interpolation) {
        setInterpolation(interpolation);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @return The string that specifies the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueHistoryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 250.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time. The default is 25.</p>
     *        <p>
     *        Valid Range: Minimum value of 1. Maximum value of 250.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 250.
     * </p>
     * 
     * @return The maximum number of results to return at one time. The default is 25.</p>
     *         <p>
     *         Valid Range: Minimum value of 1. Maximum value of 250.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 250.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time. The default is 25.</p>
     *        <p>
     *        Valid Range: Minimum value of 1. Maximum value of 250.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueHistoryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The time direction to use in the result order.
     * </p>
     * 
     * @param orderByTime
     *        The time direction to use in the result order.
     * @see OrderByTime
     */

    public void setOrderByTime(String orderByTime) {
        this.orderByTime = orderByTime;
    }

    /**
     * <p>
     * The time direction to use in the result order.
     * </p>
     * 
     * @return The time direction to use in the result order.
     * @see OrderByTime
     */

    public String getOrderByTime() {
        return this.orderByTime;
    }

    /**
     * <p>
     * The time direction to use in the result order.
     * </p>
     * 
     * @param orderByTime
     *        The time direction to use in the result order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderByTime
     */

    public GetPropertyValueHistoryRequest withOrderByTime(String orderByTime) {
        setOrderByTime(orderByTime);
        return this;
    }

    /**
     * <p>
     * The time direction to use in the result order.
     * </p>
     * 
     * @param orderByTime
     *        The time direction to use in the result order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderByTime
     */

    public GetPropertyValueHistoryRequest withOrderByTime(OrderByTime orderByTime) {
        this.orderByTime = orderByTime.toString();
        return this;
    }

    /**
     * <p>
     * The ISO8601 DateTime of the earliest property value to return.
     * </p>
     * <p>
     * For more information about the ISO8601 DateTime format, see the data type <a
     * href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html">PropertyValue</a>.
     * </p>
     * 
     * @param startTime
     *        The ISO8601 DateTime of the earliest property value to return.</p>
     *        <p>
     *        For more information about the ISO8601 DateTime format, see the data type <a
     *        href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html"
     *        >PropertyValue</a>.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The ISO8601 DateTime of the earliest property value to return.
     * </p>
     * <p>
     * For more information about the ISO8601 DateTime format, see the data type <a
     * href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html">PropertyValue</a>.
     * </p>
     * 
     * @return The ISO8601 DateTime of the earliest property value to return.</p>
     *         <p>
     *         For more information about the ISO8601 DateTime format, see the data type <a
     *         href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html"
     *         >PropertyValue</a>.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The ISO8601 DateTime of the earliest property value to return.
     * </p>
     * <p>
     * For more information about the ISO8601 DateTime format, see the data type <a
     * href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html">PropertyValue</a>.
     * </p>
     * 
     * @param startTime
     *        The ISO8601 DateTime of the earliest property value to return.</p>
     *        <p>
     *        For more information about the ISO8601 DateTime format, see the data type <a
     *        href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html"
     *        >PropertyValue</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueHistoryRequest withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The ISO8601 DateTime of the latest property value to return.
     * </p>
     * <p>
     * For more information about the ISO8601 DateTime format, see the data type <a
     * href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html">PropertyValue</a>.
     * </p>
     * 
     * @param endTime
     *        The ISO8601 DateTime of the latest property value to return.</p>
     *        <p>
     *        For more information about the ISO8601 DateTime format, see the data type <a
     *        href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html"
     *        >PropertyValue</a>.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The ISO8601 DateTime of the latest property value to return.
     * </p>
     * <p>
     * For more information about the ISO8601 DateTime format, see the data type <a
     * href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html">PropertyValue</a>.
     * </p>
     * 
     * @return The ISO8601 DateTime of the latest property value to return.</p>
     *         <p>
     *         For more information about the ISO8601 DateTime format, see the data type <a
     *         href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html"
     *         >PropertyValue</a>.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The ISO8601 DateTime of the latest property value to return.
     * </p>
     * <p>
     * For more information about the ISO8601 DateTime format, see the data type <a
     * href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html">PropertyValue</a>.
     * </p>
     * 
     * @param endTime
     *        The ISO8601 DateTime of the latest property value to return.</p>
     *        <p>
     *        For more information about the ISO8601 DateTime format, see the data type <a
     *        href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_PropertyValue.html"
     *        >PropertyValue</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueHistoryRequest withEndTime(String endTime) {
        setEndTime(endTime);
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getComponentTypeId() != null)
            sb.append("ComponentTypeId: ").append(getComponentTypeId()).append(",");
        if (getSelectedProperties() != null)
            sb.append("SelectedProperties: ").append(getSelectedProperties()).append(",");
        if (getPropertyFilters() != null)
            sb.append("PropertyFilters: ").append(getPropertyFilters()).append(",");
        if (getStartDateTime() != null)
            sb.append("StartDateTime: ").append(getStartDateTime()).append(",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: ").append(getEndDateTime()).append(",");
        if (getInterpolation() != null)
            sb.append("Interpolation: ").append(getInterpolation()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getOrderByTime() != null)
            sb.append("OrderByTime: ").append(getOrderByTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPropertyValueHistoryRequest == false)
            return false;
        GetPropertyValueHistoryRequest other = (GetPropertyValueHistoryRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getComponentTypeId() == null ^ this.getComponentTypeId() == null)
            return false;
        if (other.getComponentTypeId() != null && other.getComponentTypeId().equals(this.getComponentTypeId()) == false)
            return false;
        if (other.getSelectedProperties() == null ^ this.getSelectedProperties() == null)
            return false;
        if (other.getSelectedProperties() != null && other.getSelectedProperties().equals(this.getSelectedProperties()) == false)
            return false;
        if (other.getPropertyFilters() == null ^ this.getPropertyFilters() == null)
            return false;
        if (other.getPropertyFilters() != null && other.getPropertyFilters().equals(this.getPropertyFilters()) == false)
            return false;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        if (other.getInterpolation() == null ^ this.getInterpolation() == null)
            return false;
        if (other.getInterpolation() != null && other.getInterpolation().equals(this.getInterpolation()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getOrderByTime() == null ^ this.getOrderByTime() == null)
            return false;
        if (other.getOrderByTime() != null && other.getOrderByTime().equals(this.getOrderByTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getComponentTypeId() == null) ? 0 : getComponentTypeId().hashCode());
        hashCode = prime * hashCode + ((getSelectedProperties() == null) ? 0 : getSelectedProperties().hashCode());
        hashCode = prime * hashCode + ((getPropertyFilters() == null) ? 0 : getPropertyFilters().hashCode());
        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        hashCode = prime * hashCode + ((getInterpolation() == null) ? 0 : getInterpolation().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getOrderByTime() == null) ? 0 : getOrderByTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public GetPropertyValueHistoryRequest clone() {
        return (GetPropertyValueHistoryRequest) super.clone();
    }

}
