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
 * An object representing a virtual service backend for a virtual node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualServiceBackend" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualServiceBackend implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the virtual service that is acting as a virtual node backend.
     * </p>
     */
    private String virtualServiceName;

    /**
     * <p>
     * The name of the virtual service that is acting as a virtual node backend.
     * </p>
     * 
     * @param virtualServiceName
     *        The name of the virtual service that is acting as a virtual node backend.
     */

    public void setVirtualServiceName(String virtualServiceName) {
        this.virtualServiceName = virtualServiceName;
    }

    /**
     * <p>
     * The name of the virtual service that is acting as a virtual node backend.
     * </p>
     * 
     * @return The name of the virtual service that is acting as a virtual node backend.
     */

    public String getVirtualServiceName() {
        return this.virtualServiceName;
    }

    /**
     * <p>
     * The name of the virtual service that is acting as a virtual node backend.
     * </p>
     * 
     * @param virtualServiceName
     *        The name of the virtual service that is acting as a virtual node backend.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceBackend withVirtualServiceName(String virtualServiceName) {
        setVirtualServiceName(virtualServiceName);
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
        if (getVirtualServiceName() != null)
            sb.append("VirtualServiceName: ").append(getVirtualServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualServiceBackend == false)
            return false;
        VirtualServiceBackend other = (VirtualServiceBackend) obj;
        if (other.getVirtualServiceName() == null ^ this.getVirtualServiceName() == null)
            return false;
        if (other.getVirtualServiceName() != null && other.getVirtualServiceName().equals(this.getVirtualServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualServiceName() == null) ? 0 : getVirtualServiceName().hashCode());
        return hashCode;
    }

    @Override
    public VirtualServiceBackend clone() {
        try {
            return (VirtualServiceBackend) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualServiceBackendMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
