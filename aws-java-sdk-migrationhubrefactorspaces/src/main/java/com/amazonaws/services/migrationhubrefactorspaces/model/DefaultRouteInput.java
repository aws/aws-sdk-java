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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for the default route type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DefaultRouteInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultRouteInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * </p>
     */
    private String activationState;

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * </p>
     * 
     * @param activationState
     *        If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * @see RouteActivationState
     */

    public void setActivationState(String activationState) {
        this.activationState = activationState;
    }

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * </p>
     * 
     * @return If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * @see RouteActivationState
     */

    public String getActivationState() {
        return this.activationState;
    }

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * </p>
     * 
     * @param activationState
     *        If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteActivationState
     */

    public DefaultRouteInput withActivationState(String activationState) {
        setActivationState(activationState);
        return this;
    }

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * </p>
     * 
     * @param activationState
     *        If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteActivationState
     */

    public DefaultRouteInput withActivationState(RouteActivationState activationState) {
        this.activationState = activationState.toString();
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
            sb.append("ActivationState: ").append(getActivationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultRouteInput == false)
            return false;
        DefaultRouteInput other = (DefaultRouteInput) obj;
        if (other.getActivationState() == null ^ this.getActivationState() == null)
            return false;
        if (other.getActivationState() != null && other.getActivationState().equals(this.getActivationState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivationState() == null) ? 0 : getActivationState().hashCode());
        return hashCode;
    }

    @Override
    public DefaultRouteInput clone() {
        try {
            return (DefaultRouteInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubrefactorspaces.model.transform.DefaultRouteInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
