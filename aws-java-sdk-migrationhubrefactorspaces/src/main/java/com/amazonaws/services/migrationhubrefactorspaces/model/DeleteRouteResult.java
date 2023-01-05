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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteRoute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRouteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application that the route belongs to.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the route.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A timestamp that indicates when the route was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The ID of the route to delete.
     * </p>
     */
    private String routeId;
    /**
     * <p>
     * The ID of the service that the route belongs to.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The current state of the route.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ID of the application that the route belongs to.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application that the route belongs to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application that the route belongs to.
     * </p>
     * 
     * @return The ID of the application that the route belongs to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application that the route belongs to.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application that the route belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRouteResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the route.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the route.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the route.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the route.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the route.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRouteResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the route was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the route was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the route was last updated.
     * </p>
     * 
     * @return A timestamp that indicates when the route was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the route was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the route was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRouteResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The ID of the route to delete.
     * </p>
     * 
     * @param routeId
     *        The ID of the route to delete.
     */

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * <p>
     * The ID of the route to delete.
     * </p>
     * 
     * @return The ID of the route to delete.
     */

    public String getRouteId() {
        return this.routeId;
    }

    /**
     * <p>
     * The ID of the route to delete.
     * </p>
     * 
     * @param routeId
     *        The ID of the route to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRouteResult withRouteId(String routeId) {
        setRouteId(routeId);
        return this;
    }

    /**
     * <p>
     * The ID of the service that the route belongs to.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service that the route belongs to.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service that the route belongs to.
     * </p>
     * 
     * @return The ID of the service that the route belongs to.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the service that the route belongs to.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service that the route belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRouteResult withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     * 
     * @param state
     *        The current state of the route.
     * @see RouteState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     * 
     * @return The current state of the route.
     * @see RouteState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     * 
     * @param state
     *        The current state of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteState
     */

    public DeleteRouteResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     * 
     * @param state
     *        The current state of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteState
     */

    public DeleteRouteResult withState(RouteState state) {
        this.state = state.toString();
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getRouteId() != null)
            sb.append("RouteId: ").append(getRouteId()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRouteResult == false)
            return false;
        DeleteRouteResult other = (DeleteRouteResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getRouteId() == null ^ this.getRouteId() == null)
            return false;
        if (other.getRouteId() != null && other.getRouteId().equals(this.getRouteId()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getRouteId() == null) ? 0 : getRouteId().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRouteResult clone() {
        try {
            return (DeleteRouteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
