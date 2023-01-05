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
 * Details for a volume mount point that's used in a container definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsMountPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsMountPoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of task
     * definition <code>volume</code>.
     * </p>
     */
    private String sourceVolume;
    /**
     * <p>
     * The path on the container to mount the host volume at.
     * </p>
     */
    private String containerPath;

    /**
     * <p>
     * The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of task
     * definition <code>volume</code>.
     * </p>
     * 
     * @param sourceVolume
     *        The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of
     *        task definition <code>volume</code>.
     */

    public void setSourceVolume(String sourceVolume) {
        this.sourceVolume = sourceVolume;
    }

    /**
     * <p>
     * The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of task
     * definition <code>volume</code>.
     * </p>
     * 
     * @return The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of
     *         task definition <code>volume</code>.
     */

    public String getSourceVolume() {
        return this.sourceVolume;
    }

    /**
     * <p>
     * The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of task
     * definition <code>volume</code>.
     * </p>
     * 
     * @param sourceVolume
     *        The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of
     *        task definition <code>volume</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMountPoint withSourceVolume(String sourceVolume) {
        setSourceVolume(sourceVolume);
        return this;
    }

    /**
     * <p>
     * The path on the container to mount the host volume at.
     * </p>
     * 
     * @param containerPath
     *        The path on the container to mount the host volume at.
     */

    public void setContainerPath(String containerPath) {
        this.containerPath = containerPath;
    }

    /**
     * <p>
     * The path on the container to mount the host volume at.
     * </p>
     * 
     * @return The path on the container to mount the host volume at.
     */

    public String getContainerPath() {
        return this.containerPath;
    }

    /**
     * <p>
     * The path on the container to mount the host volume at.
     * </p>
     * 
     * @param containerPath
     *        The path on the container to mount the host volume at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMountPoint withContainerPath(String containerPath) {
        setContainerPath(containerPath);
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
        if (getSourceVolume() != null)
            sb.append("SourceVolume: ").append(getSourceVolume()).append(",");
        if (getContainerPath() != null)
            sb.append("ContainerPath: ").append(getContainerPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsMountPoint == false)
            return false;
        AwsMountPoint other = (AwsMountPoint) obj;
        if (other.getSourceVolume() == null ^ this.getSourceVolume() == null)
            return false;
        if (other.getSourceVolume() != null && other.getSourceVolume().equals(this.getSourceVolume()) == false)
            return false;
        if (other.getContainerPath() == null ^ this.getContainerPath() == null)
            return false;
        if (other.getContainerPath() != null && other.getContainerPath().equals(this.getContainerPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceVolume() == null) ? 0 : getSourceVolume().hashCode());
        hashCode = prime * hashCode + ((getContainerPath() == null) ? 0 : getContainerPath().hashCode());
        return hashCode;
    }

    @Override
    public AwsMountPoint clone() {
        try {
            return (AwsMountPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsMountPointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
