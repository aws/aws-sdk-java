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
 * An object representing the provider for a virtual service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualServiceProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualServiceProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The virtual node associated with a virtual service.
     * </p>
     */
    private VirtualNodeServiceProvider virtualNode;
    /**
     * <p>
     * The virtual router associated with a virtual service.
     * </p>
     */
    private VirtualRouterServiceProvider virtualRouter;

    /**
     * <p>
     * The virtual node associated with a virtual service.
     * </p>
     * 
     * @param virtualNode
     *        The virtual node associated with a virtual service.
     */

    public void setVirtualNode(VirtualNodeServiceProvider virtualNode) {
        this.virtualNode = virtualNode;
    }

    /**
     * <p>
     * The virtual node associated with a virtual service.
     * </p>
     * 
     * @return The virtual node associated with a virtual service.
     */

    public VirtualNodeServiceProvider getVirtualNode() {
        return this.virtualNode;
    }

    /**
     * <p>
     * The virtual node associated with a virtual service.
     * </p>
     * 
     * @param virtualNode
     *        The virtual node associated with a virtual service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceProvider withVirtualNode(VirtualNodeServiceProvider virtualNode) {
        setVirtualNode(virtualNode);
        return this;
    }

    /**
     * <p>
     * The virtual router associated with a virtual service.
     * </p>
     * 
     * @param virtualRouter
     *        The virtual router associated with a virtual service.
     */

    public void setVirtualRouter(VirtualRouterServiceProvider virtualRouter) {
        this.virtualRouter = virtualRouter;
    }

    /**
     * <p>
     * The virtual router associated with a virtual service.
     * </p>
     * 
     * @return The virtual router associated with a virtual service.
     */

    public VirtualRouterServiceProvider getVirtualRouter() {
        return this.virtualRouter;
    }

    /**
     * <p>
     * The virtual router associated with a virtual service.
     * </p>
     * 
     * @param virtualRouter
     *        The virtual router associated with a virtual service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceProvider withVirtualRouter(VirtualRouterServiceProvider virtualRouter) {
        setVirtualRouter(virtualRouter);
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
        if (getVirtualNode() != null)
            sb.append("VirtualNode: ").append(getVirtualNode()).append(",");
        if (getVirtualRouter() != null)
            sb.append("VirtualRouter: ").append(getVirtualRouter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualServiceProvider == false)
            return false;
        VirtualServiceProvider other = (VirtualServiceProvider) obj;
        if (other.getVirtualNode() == null ^ this.getVirtualNode() == null)
            return false;
        if (other.getVirtualNode() != null && other.getVirtualNode().equals(this.getVirtualNode()) == false)
            return false;
        if (other.getVirtualRouter() == null ^ this.getVirtualRouter() == null)
            return false;
        if (other.getVirtualRouter() != null && other.getVirtualRouter().equals(this.getVirtualRouter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualNode() == null) ? 0 : getVirtualNode().hashCode());
        hashCode = prime * hashCode + ((getVirtualRouter() == null) ? 0 : getVirtualRouter().hashCode());
        return hashCode;
    }

    @Override
    public VirtualServiceProvider clone() {
        try {
            return (VirtualServiceProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualServiceProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
