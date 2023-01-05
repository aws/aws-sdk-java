/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the mounting of a volume in a container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/VolumeMount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeMount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the volume.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The path in the container at which the volume should be mounted.
     * </p>
     */
    private String mountPath;

    /**
     * <p>
     * The name of the volume.
     * </p>
     * 
     * @param name
     *        The name of the volume.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the volume.
     * </p>
     * 
     * @return The name of the volume.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the volume.
     * </p>
     * 
     * @param name
     *        The name of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeMount withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The path in the container at which the volume should be mounted.
     * </p>
     * 
     * @param mountPath
     *        The path in the container at which the volume should be mounted.
     */

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    /**
     * <p>
     * The path in the container at which the volume should be mounted.
     * </p>
     * 
     * @return The path in the container at which the volume should be mounted.
     */

    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * <p>
     * The path in the container at which the volume should be mounted.
     * </p>
     * 
     * @param mountPath
     *        The path in the container at which the volume should be mounted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeMount withMountPath(String mountPath) {
        setMountPath(mountPath);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMountPath() != null)
            sb.append("MountPath: ").append(getMountPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeMount == false)
            return false;
        VolumeMount other = (VolumeMount) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMountPath() == null ^ this.getMountPath() == null)
            return false;
        if (other.getMountPath() != null && other.getMountPath().equals(this.getMountPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMountPath() == null) ? 0 : getMountPath().hashCode());
        return hashCode;
    }

    @Override
    public VolumeMount clone() {
        try {
            return (VolumeMount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.VolumeMountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
