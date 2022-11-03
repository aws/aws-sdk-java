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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the service discovery information for a service mesh.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/MeshServiceDiscovery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeshServiceDiscovery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP version to use to control traffic within the mesh.
     * </p>
     */
    private String ipPreference;

    /**
     * <p>
     * The IP version to use to control traffic within the mesh.
     * </p>
     * 
     * @param ipPreference
     *        The IP version to use to control traffic within the mesh.
     * @see IpPreference
     */

    public void setIpPreference(String ipPreference) {
        this.ipPreference = ipPreference;
    }

    /**
     * <p>
     * The IP version to use to control traffic within the mesh.
     * </p>
     * 
     * @return The IP version to use to control traffic within the mesh.
     * @see IpPreference
     */

    public String getIpPreference() {
        return this.ipPreference;
    }

    /**
     * <p>
     * The IP version to use to control traffic within the mesh.
     * </p>
     * 
     * @param ipPreference
     *        The IP version to use to control traffic within the mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpPreference
     */

    public MeshServiceDiscovery withIpPreference(String ipPreference) {
        setIpPreference(ipPreference);
        return this;
    }

    /**
     * <p>
     * The IP version to use to control traffic within the mesh.
     * </p>
     * 
     * @param ipPreference
     *        The IP version to use to control traffic within the mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpPreference
     */

    public MeshServiceDiscovery withIpPreference(IpPreference ipPreference) {
        this.ipPreference = ipPreference.toString();
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
        if (getIpPreference() != null)
            sb.append("IpPreference: ").append(getIpPreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeshServiceDiscovery == false)
            return false;
        MeshServiceDiscovery other = (MeshServiceDiscovery) obj;
        if (other.getIpPreference() == null ^ this.getIpPreference() == null)
            return false;
        if (other.getIpPreference() != null && other.getIpPreference().equals(this.getIpPreference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpPreference() == null) ? 0 : getIpPreference().hashCode());
        return hashCode;
    }

    @Override
    public MeshServiceDiscovery clone() {
        try {
            return (MeshServiceDiscovery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.MeshServiceDiscoveryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
