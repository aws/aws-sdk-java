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
 * An object representing the specification of a virtual service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualServiceSpec" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualServiceSpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual node
     * or virtual router.
     * </p>
     */
    private VirtualServiceProvider provider;

    /**
     * <p>
     * The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual node
     * or virtual router.
     * </p>
     * 
     * @param provider
     *        The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual
     *        node or virtual router.
     */

    public void setProvider(VirtualServiceProvider provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual node
     * or virtual router.
     * </p>
     * 
     * @return The App Mesh object that is acting as the provider for a virtual service. You can specify a single
     *         virtual node or virtual router.
     */

    public VirtualServiceProvider getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual node
     * or virtual router.
     * </p>
     * 
     * @param provider
     *        The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual
     *        node or virtual router.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceSpec withProvider(VirtualServiceProvider provider) {
        setProvider(provider);
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
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualServiceSpec == false)
            return false;
        VirtualServiceSpec other = (VirtualServiceSpec) obj;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        return hashCode;
    }

    @Override
    public VirtualServiceSpec clone() {
        try {
            return (VirtualServiceSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualServiceSpecMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
