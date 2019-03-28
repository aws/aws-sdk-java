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
 * An object representing the specification of a service mesh.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/MeshSpec" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeshSpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The egress filter rules for the service mesh.
     * </p>
     */
    private EgressFilter egressFilter;

    /**
     * <p>
     * The egress filter rules for the service mesh.
     * </p>
     * 
     * @param egressFilter
     *        The egress filter rules for the service mesh.
     */

    public void setEgressFilter(EgressFilter egressFilter) {
        this.egressFilter = egressFilter;
    }

    /**
     * <p>
     * The egress filter rules for the service mesh.
     * </p>
     * 
     * @return The egress filter rules for the service mesh.
     */

    public EgressFilter getEgressFilter() {
        return this.egressFilter;
    }

    /**
     * <p>
     * The egress filter rules for the service mesh.
     * </p>
     * 
     * @param egressFilter
     *        The egress filter rules for the service mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeshSpec withEgressFilter(EgressFilter egressFilter) {
        setEgressFilter(egressFilter);
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
        if (getEgressFilter() != null)
            sb.append("EgressFilter: ").append(getEgressFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeshSpec == false)
            return false;
        MeshSpec other = (MeshSpec) obj;
        if (other.getEgressFilter() == null ^ this.getEgressFilter() == null)
            return false;
        if (other.getEgressFilter() != null && other.getEgressFilter().equals(this.getEgressFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEgressFilter() == null) ? 0 : getEgressFilter().hashCode());
        return hashCode;
    }

    @Override
    public MeshSpec clone() {
        try {
            return (MeshSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.MeshSpecMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
