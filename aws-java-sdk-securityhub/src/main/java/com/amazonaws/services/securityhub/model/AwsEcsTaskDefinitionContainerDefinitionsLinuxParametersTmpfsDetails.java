/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The container path, mount options, and size (in MiB) of a tmpfs mount.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The absolute file path where the tmpfs volume is to be mounted.
     * </p>
     */
    private String containerPath;
    /**
     * <p>
     * The list of tmpfs volume mount options.
     * </p>
     */
    private java.util.List<String> mountOptions;
    /**
     * <p>
     * The maximum size (in MiB) of the tmpfs volume.
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * The absolute file path where the tmpfs volume is to be mounted.
     * </p>
     * 
     * @param containerPath
     *        The absolute file path where the tmpfs volume is to be mounted.
     */

    public void setContainerPath(String containerPath) {
        this.containerPath = containerPath;
    }

    /**
     * <p>
     * The absolute file path where the tmpfs volume is to be mounted.
     * </p>
     * 
     * @return The absolute file path where the tmpfs volume is to be mounted.
     */

    public String getContainerPath() {
        return this.containerPath;
    }

    /**
     * <p>
     * The absolute file path where the tmpfs volume is to be mounted.
     * </p>
     * 
     * @param containerPath
     *        The absolute file path where the tmpfs volume is to be mounted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails withContainerPath(String containerPath) {
        setContainerPath(containerPath);
        return this;
    }

    /**
     * <p>
     * The list of tmpfs volume mount options.
     * </p>
     * 
     * @return The list of tmpfs volume mount options.
     */

    public java.util.List<String> getMountOptions() {
        return mountOptions;
    }

    /**
     * <p>
     * The list of tmpfs volume mount options.
     * </p>
     * 
     * @param mountOptions
     *        The list of tmpfs volume mount options.
     */

    public void setMountOptions(java.util.Collection<String> mountOptions) {
        if (mountOptions == null) {
            this.mountOptions = null;
            return;
        }

        this.mountOptions = new java.util.ArrayList<String>(mountOptions);
    }

    /**
     * <p>
     * The list of tmpfs volume mount options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMountOptions(java.util.Collection)} or {@link #withMountOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mountOptions
     *        The list of tmpfs volume mount options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails withMountOptions(String... mountOptions) {
        if (this.mountOptions == null) {
            setMountOptions(new java.util.ArrayList<String>(mountOptions.length));
        }
        for (String ele : mountOptions) {
            this.mountOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tmpfs volume mount options.
     * </p>
     * 
     * @param mountOptions
     *        The list of tmpfs volume mount options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails withMountOptions(java.util.Collection<String> mountOptions) {
        setMountOptions(mountOptions);
        return this;
    }

    /**
     * <p>
     * The maximum size (in MiB) of the tmpfs volume.
     * </p>
     * 
     * @param size
     *        The maximum size (in MiB) of the tmpfs volume.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The maximum size (in MiB) of the tmpfs volume.
     * </p>
     * 
     * @return The maximum size (in MiB) of the tmpfs volume.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The maximum size (in MiB) of the tmpfs volume.
     * </p>
     * 
     * @param size
     *        The maximum size (in MiB) of the tmpfs volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails withSize(Integer size) {
        setSize(size);
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
        if (getContainerPath() != null)
            sb.append("ContainerPath: ").append(getContainerPath()).append(",");
        if (getMountOptions() != null)
            sb.append("MountOptions: ").append(getMountOptions()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails == false)
            return false;
        AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails other = (AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails) obj;
        if (other.getContainerPath() == null ^ this.getContainerPath() == null)
            return false;
        if (other.getContainerPath() != null && other.getContainerPath().equals(this.getContainerPath()) == false)
            return false;
        if (other.getMountOptions() == null ^ this.getMountOptions() == null)
            return false;
        if (other.getMountOptions() != null && other.getMountOptions().equals(this.getMountOptions()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerPath() == null) ? 0 : getContainerPath().hashCode());
        hashCode = prime * hashCode + ((getMountOptions() == null) ? 0 : getMountOptions().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails clone() {
        try {
            return (AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
