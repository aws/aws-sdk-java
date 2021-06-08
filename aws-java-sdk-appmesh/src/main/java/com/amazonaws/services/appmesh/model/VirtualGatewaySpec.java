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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the specification of a service mesh resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualGatewaySpec" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualGatewaySpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A reference to an object that represents the defaults for backends.
     * </p>
     */
    private VirtualGatewayBackendDefaults backendDefaults;
    /**
     * <p>
     * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
     * </p>
     */
    private java.util.List<VirtualGatewayListener> listeners;

    private VirtualGatewayLogging logging;

    /**
     * <p>
     * A reference to an object that represents the defaults for backends.
     * </p>
     * 
     * @param backendDefaults
     *        A reference to an object that represents the defaults for backends.
     */

    public void setBackendDefaults(VirtualGatewayBackendDefaults backendDefaults) {
        this.backendDefaults = backendDefaults;
    }

    /**
     * <p>
     * A reference to an object that represents the defaults for backends.
     * </p>
     * 
     * @return A reference to an object that represents the defaults for backends.
     */

    public VirtualGatewayBackendDefaults getBackendDefaults() {
        return this.backendDefaults;
    }

    /**
     * <p>
     * A reference to an object that represents the defaults for backends.
     * </p>
     * 
     * @param backendDefaults
     *        A reference to an object that represents the defaults for backends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewaySpec withBackendDefaults(VirtualGatewayBackendDefaults backendDefaults) {
        setBackendDefaults(backendDefaults);
        return this;
    }

    /**
     * <p>
     * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
     * </p>
     * 
     * @return The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one
     *         listener.
     */

    public java.util.List<VirtualGatewayListener> getListeners() {
        return listeners;
    }

    /**
     * <p>
     * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
     * </p>
     * 
     * @param listeners
     *        The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one
     *        listener.
     */

    public void setListeners(java.util.Collection<VirtualGatewayListener> listeners) {
        if (listeners == null) {
            this.listeners = null;
            return;
        }

        this.listeners = new java.util.ArrayList<VirtualGatewayListener>(listeners);
    }

    /**
     * <p>
     * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListeners(java.util.Collection)} or {@link #withListeners(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param listeners
     *        The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one
     *        listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewaySpec withListeners(VirtualGatewayListener... listeners) {
        if (this.listeners == null) {
            setListeners(new java.util.ArrayList<VirtualGatewayListener>(listeners.length));
        }
        for (VirtualGatewayListener ele : listeners) {
            this.listeners.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
     * </p>
     * 
     * @param listeners
     *        The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one
     *        listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewaySpec withListeners(java.util.Collection<VirtualGatewayListener> listeners) {
        setListeners(listeners);
        return this;
    }

    /**
     * @param logging
     */

    public void setLogging(VirtualGatewayLogging logging) {
        this.logging = logging;
    }

    /**
     * @return
     */

    public VirtualGatewayLogging getLogging() {
        return this.logging;
    }

    /**
     * @param logging
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewaySpec withLogging(VirtualGatewayLogging logging) {
        setLogging(logging);
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
        if (getBackendDefaults() != null)
            sb.append("BackendDefaults: ").append(getBackendDefaults()).append(",");
        if (getListeners() != null)
            sb.append("Listeners: ").append(getListeners()).append(",");
        if (getLogging() != null)
            sb.append("Logging: ").append(getLogging());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualGatewaySpec == false)
            return false;
        VirtualGatewaySpec other = (VirtualGatewaySpec) obj;
        if (other.getBackendDefaults() == null ^ this.getBackendDefaults() == null)
            return false;
        if (other.getBackendDefaults() != null && other.getBackendDefaults().equals(this.getBackendDefaults()) == false)
            return false;
        if (other.getListeners() == null ^ this.getListeners() == null)
            return false;
        if (other.getListeners() != null && other.getListeners().equals(this.getListeners()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackendDefaults() == null) ? 0 : getBackendDefaults().hashCode());
        hashCode = prime * hashCode + ((getListeners() == null) ? 0 : getListeners().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        return hashCode;
    }

    @Override
    public VirtualGatewaySpec clone() {
        try {
            return (VirtualGatewaySpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualGatewaySpecMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
