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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the specification of a virtual node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualNodeSpec" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualNodeSpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A reference to an object that represents the defaults for backends.
     * </p>
     */
    private BackendDefaults backendDefaults;
    /**
     * <p>
     * The backends that the virtual node is expected to send outbound traffic to.
     * </p>
     */
    private java.util.List<Backend> backends;
    /**
     * <p>
     * The listener that the virtual node is expected to receive inbound traffic from. You can specify one listener.
     * </p>
     */
    private java.util.List<Listener> listeners;
    /**
     * <p>
     * The inbound and outbound access logging information for the virtual node.
     * </p>
     */
    private Logging logging;
    /**
     * <p>
     * The service discovery information for the virtual node. If your virtual node does not expect ingress traffic, you
     * can omit this parameter. If you specify a <code>listener</code>, then you must specify service discovery
     * information.
     * </p>
     */
    private ServiceDiscovery serviceDiscovery;

    /**
     * <p>
     * A reference to an object that represents the defaults for backends.
     * </p>
     * 
     * @param backendDefaults
     *        A reference to an object that represents the defaults for backends.
     */

    public void setBackendDefaults(BackendDefaults backendDefaults) {
        this.backendDefaults = backendDefaults;
    }

    /**
     * <p>
     * A reference to an object that represents the defaults for backends.
     * </p>
     * 
     * @return A reference to an object that represents the defaults for backends.
     */

    public BackendDefaults getBackendDefaults() {
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

    public VirtualNodeSpec withBackendDefaults(BackendDefaults backendDefaults) {
        setBackendDefaults(backendDefaults);
        return this;
    }

    /**
     * <p>
     * The backends that the virtual node is expected to send outbound traffic to.
     * </p>
     * 
     * @return The backends that the virtual node is expected to send outbound traffic to.
     */

    public java.util.List<Backend> getBackends() {
        return backends;
    }

    /**
     * <p>
     * The backends that the virtual node is expected to send outbound traffic to.
     * </p>
     * 
     * @param backends
     *        The backends that the virtual node is expected to send outbound traffic to.
     */

    public void setBackends(java.util.Collection<Backend> backends) {
        if (backends == null) {
            this.backends = null;
            return;
        }

        this.backends = new java.util.ArrayList<Backend>(backends);
    }

    /**
     * <p>
     * The backends that the virtual node is expected to send outbound traffic to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackends(java.util.Collection)} or {@link #withBackends(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param backends
     *        The backends that the virtual node is expected to send outbound traffic to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualNodeSpec withBackends(Backend... backends) {
        if (this.backends == null) {
            setBackends(new java.util.ArrayList<Backend>(backends.length));
        }
        for (Backend ele : backends) {
            this.backends.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The backends that the virtual node is expected to send outbound traffic to.
     * </p>
     * 
     * @param backends
     *        The backends that the virtual node is expected to send outbound traffic to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualNodeSpec withBackends(java.util.Collection<Backend> backends) {
        setBackends(backends);
        return this;
    }

    /**
     * <p>
     * The listener that the virtual node is expected to receive inbound traffic from. You can specify one listener.
     * </p>
     * 
     * @return The listener that the virtual node is expected to receive inbound traffic from. You can specify one
     *         listener.
     */

    public java.util.List<Listener> getListeners() {
        return listeners;
    }

    /**
     * <p>
     * The listener that the virtual node is expected to receive inbound traffic from. You can specify one listener.
     * </p>
     * 
     * @param listeners
     *        The listener that the virtual node is expected to receive inbound traffic from. You can specify one
     *        listener.
     */

    public void setListeners(java.util.Collection<Listener> listeners) {
        if (listeners == null) {
            this.listeners = null;
            return;
        }

        this.listeners = new java.util.ArrayList<Listener>(listeners);
    }

    /**
     * <p>
     * The listener that the virtual node is expected to receive inbound traffic from. You can specify one listener.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListeners(java.util.Collection)} or {@link #withListeners(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param listeners
     *        The listener that the virtual node is expected to receive inbound traffic from. You can specify one
     *        listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualNodeSpec withListeners(Listener... listeners) {
        if (this.listeners == null) {
            setListeners(new java.util.ArrayList<Listener>(listeners.length));
        }
        for (Listener ele : listeners) {
            this.listeners.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The listener that the virtual node is expected to receive inbound traffic from. You can specify one listener.
     * </p>
     * 
     * @param listeners
     *        The listener that the virtual node is expected to receive inbound traffic from. You can specify one
     *        listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualNodeSpec withListeners(java.util.Collection<Listener> listeners) {
        setListeners(listeners);
        return this;
    }

    /**
     * <p>
     * The inbound and outbound access logging information for the virtual node.
     * </p>
     * 
     * @param logging
     *        The inbound and outbound access logging information for the virtual node.
     */

    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * The inbound and outbound access logging information for the virtual node.
     * </p>
     * 
     * @return The inbound and outbound access logging information for the virtual node.
     */

    public Logging getLogging() {
        return this.logging;
    }

    /**
     * <p>
     * The inbound and outbound access logging information for the virtual node.
     * </p>
     * 
     * @param logging
     *        The inbound and outbound access logging information for the virtual node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualNodeSpec withLogging(Logging logging) {
        setLogging(logging);
        return this;
    }

    /**
     * <p>
     * The service discovery information for the virtual node. If your virtual node does not expect ingress traffic, you
     * can omit this parameter. If you specify a <code>listener</code>, then you must specify service discovery
     * information.
     * </p>
     * 
     * @param serviceDiscovery
     *        The service discovery information for the virtual node. If your virtual node does not expect ingress
     *        traffic, you can omit this parameter. If you specify a <code>listener</code>, then you must specify
     *        service discovery information.
     */

    public void setServiceDiscovery(ServiceDiscovery serviceDiscovery) {
        this.serviceDiscovery = serviceDiscovery;
    }

    /**
     * <p>
     * The service discovery information for the virtual node. If your virtual node does not expect ingress traffic, you
     * can omit this parameter. If you specify a <code>listener</code>, then you must specify service discovery
     * information.
     * </p>
     * 
     * @return The service discovery information for the virtual node. If your virtual node does not expect ingress
     *         traffic, you can omit this parameter. If you specify a <code>listener</code>, then you must specify
     *         service discovery information.
     */

    public ServiceDiscovery getServiceDiscovery() {
        return this.serviceDiscovery;
    }

    /**
     * <p>
     * The service discovery information for the virtual node. If your virtual node does not expect ingress traffic, you
     * can omit this parameter. If you specify a <code>listener</code>, then you must specify service discovery
     * information.
     * </p>
     * 
     * @param serviceDiscovery
     *        The service discovery information for the virtual node. If your virtual node does not expect ingress
     *        traffic, you can omit this parameter. If you specify a <code>listener</code>, then you must specify
     *        service discovery information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualNodeSpec withServiceDiscovery(ServiceDiscovery serviceDiscovery) {
        setServiceDiscovery(serviceDiscovery);
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
        if (getBackends() != null)
            sb.append("Backends: ").append(getBackends()).append(",");
        if (getListeners() != null)
            sb.append("Listeners: ").append(getListeners()).append(",");
        if (getLogging() != null)
            sb.append("Logging: ").append(getLogging()).append(",");
        if (getServiceDiscovery() != null)
            sb.append("ServiceDiscovery: ").append(getServiceDiscovery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualNodeSpec == false)
            return false;
        VirtualNodeSpec other = (VirtualNodeSpec) obj;
        if (other.getBackendDefaults() == null ^ this.getBackendDefaults() == null)
            return false;
        if (other.getBackendDefaults() != null && other.getBackendDefaults().equals(this.getBackendDefaults()) == false)
            return false;
        if (other.getBackends() == null ^ this.getBackends() == null)
            return false;
        if (other.getBackends() != null && other.getBackends().equals(this.getBackends()) == false)
            return false;
        if (other.getListeners() == null ^ this.getListeners() == null)
            return false;
        if (other.getListeners() != null && other.getListeners().equals(this.getListeners()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
            return false;
        if (other.getServiceDiscovery() == null ^ this.getServiceDiscovery() == null)
            return false;
        if (other.getServiceDiscovery() != null && other.getServiceDiscovery().equals(this.getServiceDiscovery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackendDefaults() == null) ? 0 : getBackendDefaults().hashCode());
        hashCode = prime * hashCode + ((getBackends() == null) ? 0 : getBackends().hashCode());
        hashCode = prime * hashCode + ((getListeners() == null) ? 0 : getListeners().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode + ((getServiceDiscovery() == null) ? 0 : getServiceDiscovery().hashCode());
        return hashCode;
    }

    @Override
    public VirtualNodeSpec clone() {
        try {
            return (VirtualNodeSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualNodeSpecMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
