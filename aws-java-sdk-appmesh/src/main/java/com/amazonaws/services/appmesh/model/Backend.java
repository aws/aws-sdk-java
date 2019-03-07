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
 * An object representing the backends that a virtual node is expected to send outbound traffic to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/Backend" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Backend implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies a virtual service to use as a backend for a virtual node.
     * </p>
     */
    private VirtualServiceBackend virtualService;

    /**
     * <p>
     * Specifies a virtual service to use as a backend for a virtual node.
     * </p>
     * 
     * @param virtualService
     *        Specifies a virtual service to use as a backend for a virtual node.
     */

    public void setVirtualService(VirtualServiceBackend virtualService) {
        this.virtualService = virtualService;
    }

    /**
     * <p>
     * Specifies a virtual service to use as a backend for a virtual node.
     * </p>
     * 
     * @return Specifies a virtual service to use as a backend for a virtual node.
     */

    public VirtualServiceBackend getVirtualService() {
        return this.virtualService;
    }

    /**
     * <p>
     * Specifies a virtual service to use as a backend for a virtual node.
     * </p>
     * 
     * @param virtualService
     *        Specifies a virtual service to use as a backend for a virtual node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backend withVirtualService(VirtualServiceBackend virtualService) {
        setVirtualService(virtualService);
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
        if (getVirtualService() != null)
            sb.append("VirtualService: ").append(getVirtualService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Backend == false)
            return false;
        Backend other = (Backend) obj;
        if (other.getVirtualService() == null ^ this.getVirtualService() == null)
            return false;
        if (other.getVirtualService() != null && other.getVirtualService().equals(this.getVirtualService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualService() == null) ? 0 : getVirtualService().hashCode());
        return hashCode;
    }

    @Override
    public Backend clone() {
        try {
            return (Backend) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.BackendMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
