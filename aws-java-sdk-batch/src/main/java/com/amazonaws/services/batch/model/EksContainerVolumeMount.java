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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The volume mounts for a container for an Amazon EKS job. For more information about volumes and volume mounts in
 * Kubernetes, see <a href="https://kubernetes.io/docs/concepts/storage/volumes/">Volumes</a> in the <i>Kubernetes
 * documentation</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksContainerVolumeMount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksContainerVolumeMount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name the volume mount. This must match the name of one of the volumes in the pod.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The path on the container where the volume is mounted.
     * </p>
     */
    private String mountPath;
    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. Otherwise, the container
     * can write to the volume. The default value is <code>false</code>.
     * </p>
     */
    private Boolean readOnly;

    /**
     * <p>
     * The name the volume mount. This must match the name of one of the volumes in the pod.
     * </p>
     * 
     * @param name
     *        The name the volume mount. This must match the name of one of the volumes in the pod.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name the volume mount. This must match the name of one of the volumes in the pod.
     * </p>
     * 
     * @return The name the volume mount. This must match the name of one of the volumes in the pod.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name the volume mount. This must match the name of one of the volumes in the pod.
     * </p>
     * 
     * @param name
     *        The name the volume mount. This must match the name of one of the volumes in the pod.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerVolumeMount withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The path on the container where the volume is mounted.
     * </p>
     * 
     * @param mountPath
     *        The path on the container where the volume is mounted.
     */

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    /**
     * <p>
     * The path on the container where the volume is mounted.
     * </p>
     * 
     * @return The path on the container where the volume is mounted.
     */

    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * <p>
     * The path on the container where the volume is mounted.
     * </p>
     * 
     * @param mountPath
     *        The path on the container where the volume is mounted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerVolumeMount withMountPath(String mountPath) {
        setMountPath(mountPath);
        return this;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. Otherwise, the container
     * can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @param readOnly
     *        If this value is <code>true</code>, the container has read-only access to the volume. Otherwise, the
     *        container can write to the volume. The default value is <code>false</code>.
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. Otherwise, the container
     * can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @return If this value is <code>true</code>, the container has read-only access to the volume. Otherwise, the
     *         container can write to the volume. The default value is <code>false</code>.
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. Otherwise, the container
     * can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @param readOnly
     *        If this value is <code>true</code>, the container has read-only access to the volume. Otherwise, the
     *        container can write to the volume. The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerVolumeMount withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. Otherwise, the container
     * can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @return If this value is <code>true</code>, the container has read-only access to the volume. Otherwise, the
     *         container can write to the volume. The default value is <code>false</code>.
     */

    public Boolean isReadOnly() {
        return this.readOnly;
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
            sb.append("MountPath: ").append(getMountPath()).append(",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksContainerVolumeMount == false)
            return false;
        EksContainerVolumeMount other = (EksContainerVolumeMount) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMountPath() == null ^ this.getMountPath() == null)
            return false;
        if (other.getMountPath() != null && other.getMountPath().equals(this.getMountPath()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMountPath() == null) ? 0 : getMountPath().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        return hashCode;
    }

    @Override
    public EksContainerVolumeMount clone() {
        try {
            return (EksContainerVolumeMount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksContainerVolumeMountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
