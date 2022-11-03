/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/UpdateRoute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRouteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is updated.
     * </p>
     */
    private String activationState;
    /**
     * <p>
     * The ID of the application within which the route is being updated.
     * </p>
     */
    private String applicationIdentifier;
    /**
     * <p>
     * The ID of the environment in which the route is being updated.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The unique identifier of the route to update.
     * </p>
     */
    private String routeIdentifier;

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is updated.
     * </p>
     * 
     * @param activationState
     *        If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is updated.
     * @see RouteActivationState
     */

    public void setActivationState(String activationState) {
        this.activationState = activationState;
    }

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is updated.
     * </p>
     * 
     * @return If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is updated.
     * @see RouteActivationState
     */

    public String getActivationState() {
        return this.activationState;
    }

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is updated.
     * </p>
     * 
     * @param activationState
     *        If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteActivationState
     */

    public UpdateRouteRequest withActivationState(String activationState) {
        setActivationState(activationState);
        return this;
    }

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is updated.
     * </p>
     * 
     * @param activationState
     *        If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteActivationState
     */

    public UpdateRouteRequest withActivationState(RouteActivationState activationState) {
        this.activationState = activationState.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the application within which the route is being updated.
     * </p>
     * 
     * @param applicationIdentifier
     *        The ID of the application within which the route is being updated.
     */

    public void setApplicationIdentifier(String applicationIdentifier) {
        this.applicationIdentifier = applicationIdentifier;
    }

    /**
     * <p>
     * The ID of the application within which the route is being updated.
     * </p>
     * 
     * @return The ID of the application within which the route is being updated.
     */

    public String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    /**
     * <p>
     * The ID of the application within which the route is being updated.
     * </p>
     * 
     * @param applicationIdentifier
     *        The ID of the application within which the route is being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRouteRequest withApplicationIdentifier(String applicationIdentifier) {
        setApplicationIdentifier(applicationIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the environment in which the route is being updated.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment in which the route is being updated.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment in which the route is being updated.
     * </p>
     * 
     * @return The ID of the environment in which the route is being updated.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment in which the route is being updated.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment in which the route is being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRouteRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the route to update.
     * </p>
     * 
     * @param routeIdentifier
     *        The unique identifier of the route to update.
     */

    public void setRouteIdentifier(String routeIdentifier) {
        this.routeIdentifier = routeIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the route to update.
     * </p>
     * 
     * @return The unique identifier of the route to update.
     */

    public String getRouteIdentifier() {
        return this.routeIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the route to update.
     * </p>
     * 
     * @param routeIdentifier
     *        The unique identifier of the route to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRouteRequest withRouteIdentifier(String routeIdentifier) {
        setRouteIdentifier(routeIdentifier);
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
        if (getActivationState() != null)
            sb.append("ActivationState: ").append(getActivationState()).append(",");
        if (getApplicationIdentifier() != null)
            sb.append("ApplicationIdentifier: ").append(getApplicationIdentifier()).append(",");
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getRouteIdentifier() != null)
            sb.append("RouteIdentifier: ").append(getRouteIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRouteRequest == false)
            return false;
        UpdateRouteRequest other = (UpdateRouteRequest) obj;
        if (other.getActivationState() == null ^ this.getActivationState() == null)
            return false;
        if (other.getActivationState() != null && other.getActivationState().equals(this.getActivationState()) == false)
            return false;
        if (other.getApplicationIdentifier() == null ^ this.getApplicationIdentifier() == null)
            return false;
        if (other.getApplicationIdentifier() != null && other.getApplicationIdentifier().equals(this.getApplicationIdentifier()) == false)
            return false;
        if (other.getEnvironmentIdentifier() == null ^ this.getEnvironmentIdentifier() == null)
            return false;
        if (other.getEnvironmentIdentifier() != null && other.getEnvironmentIdentifier().equals(this.getEnvironmentIdentifier()) == false)
            return false;
        if (other.getRouteIdentifier() == null ^ this.getRouteIdentifier() == null)
            return false;
        if (other.getRouteIdentifier() != null && other.getRouteIdentifier().equals(this.getRouteIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivationState() == null) ? 0 : getActivationState().hashCode());
        hashCode = prime * hashCode + ((getApplicationIdentifier() == null) ? 0 : getApplicationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRouteIdentifier() == null) ? 0 : getRouteIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRouteRequest clone() {
        return (UpdateRouteRequest) super.clone();
    }

}
