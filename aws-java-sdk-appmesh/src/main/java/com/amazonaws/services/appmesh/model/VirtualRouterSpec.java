/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object representing the specification of a virtual router.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualRouterSpec" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualRouterSpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The listeners that the virtual router is expected to receive inbound traffic from. Currently only one listener is
     * supported per virtual router.
     * </p>
     */
    private java.util.List<VirtualRouterListener> listeners;

    /**
     * <p>
     * The listeners that the virtual router is expected to receive inbound traffic from. Currently only one listener is
     * supported per virtual router.
     * </p>
     * 
     * @return The listeners that the virtual router is expected to receive inbound traffic from. Currently only one
     *         listener is supported per virtual router.
     */

    public java.util.List<VirtualRouterListener> getListeners() {
        return listeners;
    }

    /**
     * <p>
     * The listeners that the virtual router is expected to receive inbound traffic from. Currently only one listener is
     * supported per virtual router.
     * </p>
     * 
     * @param listeners
     *        The listeners that the virtual router is expected to receive inbound traffic from. Currently only one
     *        listener is supported per virtual router.
     */

    public void setListeners(java.util.Collection<VirtualRouterListener> listeners) {
        if (listeners == null) {
            this.listeners = null;
            return;
        }

        this.listeners = new java.util.ArrayList<VirtualRouterListener>(listeners);
    }

    /**
     * <p>
     * The listeners that the virtual router is expected to receive inbound traffic from. Currently only one listener is
     * supported per virtual router.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListeners(java.util.Collection)} or {@link #withListeners(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param listeners
     *        The listeners that the virtual router is expected to receive inbound traffic from. Currently only one
     *        listener is supported per virtual router.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualRouterSpec withListeners(VirtualRouterListener... listeners) {
        if (this.listeners == null) {
            setListeners(new java.util.ArrayList<VirtualRouterListener>(listeners.length));
        }
        for (VirtualRouterListener ele : listeners) {
            this.listeners.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The listeners that the virtual router is expected to receive inbound traffic from. Currently only one listener is
     * supported per virtual router.
     * </p>
     * 
     * @param listeners
     *        The listeners that the virtual router is expected to receive inbound traffic from. Currently only one
     *        listener is supported per virtual router.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualRouterSpec withListeners(java.util.Collection<VirtualRouterListener> listeners) {
        setListeners(listeners);
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
        if (getListeners() != null)
            sb.append("Listeners: ").append(getListeners());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualRouterSpec == false)
            return false;
        VirtualRouterSpec other = (VirtualRouterSpec) obj;
        if (other.getListeners() == null ^ this.getListeners() == null)
            return false;
        if (other.getListeners() != null && other.getListeners().equals(this.getListeners()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListeners() == null) ? 0 : getListeners().hashCode());
        return hashCode;
    }

    @Override
    public VirtualRouterSpec clone() {
        try {
            return (VirtualRouterSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualRouterSpecMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
