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
 * An object representing a virtual node service provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualNodeServiceProvider" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualNodeServiceProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the virtual node that is acting as a service provider.
     * </p>
     */
    private String virtualNodeName;

    /**
     * <p>
     * The name of the virtual node that is acting as a service provider.
     * </p>
     * 
     * @param virtualNodeName
     *        The name of the virtual node that is acting as a service provider.
     */

    public void setVirtualNodeName(String virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
    }

    /**
     * <p>
     * The name of the virtual node that is acting as a service provider.
     * </p>
     * 
     * @return The name of the virtual node that is acting as a service provider.
     */

    public String getVirtualNodeName() {
        return this.virtualNodeName;
    }

    /**
     * <p>
     * The name of the virtual node that is acting as a service provider.
     * </p>
     * 
     * @param virtualNodeName
     *        The name of the virtual node that is acting as a service provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualNodeServiceProvider withVirtualNodeName(String virtualNodeName) {
        setVirtualNodeName(virtualNodeName);
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
        if (getVirtualNodeName() != null)
            sb.append("VirtualNodeName: ").append(getVirtualNodeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualNodeServiceProvider == false)
            return false;
        VirtualNodeServiceProvider other = (VirtualNodeServiceProvider) obj;
        if (other.getVirtualNodeName() == null ^ this.getVirtualNodeName() == null)
            return false;
        if (other.getVirtualNodeName() != null && other.getVirtualNodeName().equals(this.getVirtualNodeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualNodeName() == null) ? 0 : getVirtualNodeName().hashCode());
        return hashCode;
    }

    @Override
    public VirtualNodeServiceProvider clone() {
        try {
            return (VirtualNodeServiceProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualNodeServiceProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
