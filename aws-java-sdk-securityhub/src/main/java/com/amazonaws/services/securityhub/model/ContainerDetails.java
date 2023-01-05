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
 * Container details related to a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ContainerDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The runtime of the container.
     * </p>
     */
    private String containerRuntime;
    /**
     * <p>
     * The name of the container related to a finding.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the container image related to a finding.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The name of the container image related to a finding.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * Indicates when the container started.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String launchedAt;
    /**
     * <p>
     * Provides information about the mounting of a volume in a container.
     * </p>
     */
    private java.util.List<VolumeMount> volumeMounts;
    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     * instance (similar to the root user).
     * </p>
     */
    private Boolean privileged;

    /**
     * <p>
     * The runtime of the container.
     * </p>
     * 
     * @param containerRuntime
     *        The runtime of the container.
     */

    public void setContainerRuntime(String containerRuntime) {
        this.containerRuntime = containerRuntime;
    }

    /**
     * <p>
     * The runtime of the container.
     * </p>
     * 
     * @return The runtime of the container.
     */

    public String getContainerRuntime() {
        return this.containerRuntime;
    }

    /**
     * <p>
     * The runtime of the container.
     * </p>
     * 
     * @param containerRuntime
     *        The runtime of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetails withContainerRuntime(String containerRuntime) {
        setContainerRuntime(containerRuntime);
        return this;
    }

    /**
     * <p>
     * The name of the container related to a finding.
     * </p>
     * 
     * @param name
     *        The name of the container related to a finding.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container related to a finding.
     * </p>
     * 
     * @return The name of the container related to a finding.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the container related to a finding.
     * </p>
     * 
     * @param name
     *        The name of the container related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the container image related to a finding.
     * </p>
     * 
     * @param imageId
     *        The identifier of the container image related to a finding.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The identifier of the container image related to a finding.
     * </p>
     * 
     * @return The identifier of the container image related to a finding.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The identifier of the container image related to a finding.
     * </p>
     * 
     * @param imageId
     *        The identifier of the container image related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetails withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The name of the container image related to a finding.
     * </p>
     * 
     * @param imageName
     *        The name of the container image related to a finding.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The name of the container image related to a finding.
     * </p>
     * 
     * @return The name of the container image related to a finding.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The name of the container image related to a finding.
     * </p>
     * 
     * @param imageName
     *        The name of the container image related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetails withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * Indicates when the container started.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param launchedAt
     *        Indicates when the container started.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setLaunchedAt(String launchedAt) {
        this.launchedAt = launchedAt;
    }

    /**
     * <p>
     * Indicates when the container started.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the container started.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getLaunchedAt() {
        return this.launchedAt;
    }

    /**
     * <p>
     * Indicates when the container started.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param launchedAt
     *        Indicates when the container started.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetails withLaunchedAt(String launchedAt) {
        setLaunchedAt(launchedAt);
        return this;
    }

    /**
     * <p>
     * Provides information about the mounting of a volume in a container.
     * </p>
     * 
     * @return Provides information about the mounting of a volume in a container.
     */

    public java.util.List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * <p>
     * Provides information about the mounting of a volume in a container.
     * </p>
     * 
     * @param volumeMounts
     *        Provides information about the mounting of a volume in a container.
     */

    public void setVolumeMounts(java.util.Collection<VolumeMount> volumeMounts) {
        if (volumeMounts == null) {
            this.volumeMounts = null;
            return;
        }

        this.volumeMounts = new java.util.ArrayList<VolumeMount>(volumeMounts);
    }

    /**
     * <p>
     * Provides information about the mounting of a volume in a container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeMounts(java.util.Collection)} or {@link #withVolumeMounts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumeMounts
     *        Provides information about the mounting of a volume in a container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetails withVolumeMounts(VolumeMount... volumeMounts) {
        if (this.volumeMounts == null) {
            setVolumeMounts(new java.util.ArrayList<VolumeMount>(volumeMounts.length));
        }
        for (VolumeMount ele : volumeMounts) {
            this.volumeMounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides information about the mounting of a volume in a container.
     * </p>
     * 
     * @param volumeMounts
     *        Provides information about the mounting of a volume in a container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetails withVolumeMounts(java.util.Collection<VolumeMount> volumeMounts) {
        setVolumeMounts(volumeMounts);
        return this;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     * instance (similar to the root user).
     * </p>
     * 
     * @param privileged
     *        When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     *        instance (similar to the root user).
     */

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     * instance (similar to the root user).
     * </p>
     * 
     * @return When this parameter is <code>true</code>, the container is given elevated privileges on the host
     *         container instance (similar to the root user).
     */

    public Boolean getPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     * instance (similar to the root user).
     * </p>
     * 
     * @param privileged
     *        When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     *        instance (similar to the root user).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetails withPrivileged(Boolean privileged) {
        setPrivileged(privileged);
        return this;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     * instance (similar to the root user).
     * </p>
     * 
     * @return When this parameter is <code>true</code>, the container is given elevated privileges on the host
     *         container instance (similar to the root user).
     */

    public Boolean isPrivileged() {
        return this.privileged;
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
        if (getContainerRuntime() != null)
            sb.append("ContainerRuntime: ").append(getContainerRuntime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getLaunchedAt() != null)
            sb.append("LaunchedAt: ").append(getLaunchedAt()).append(",");
        if (getVolumeMounts() != null)
            sb.append("VolumeMounts: ").append(getVolumeMounts()).append(",");
        if (getPrivileged() != null)
            sb.append("Privileged: ").append(getPrivileged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerDetails == false)
            return false;
        ContainerDetails other = (ContainerDetails) obj;
        if (other.getContainerRuntime() == null ^ this.getContainerRuntime() == null)
            return false;
        if (other.getContainerRuntime() != null && other.getContainerRuntime().equals(this.getContainerRuntime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getLaunchedAt() == null ^ this.getLaunchedAt() == null)
            return false;
        if (other.getLaunchedAt() != null && other.getLaunchedAt().equals(this.getLaunchedAt()) == false)
            return false;
        if (other.getVolumeMounts() == null ^ this.getVolumeMounts() == null)
            return false;
        if (other.getVolumeMounts() != null && other.getVolumeMounts().equals(this.getVolumeMounts()) == false)
            return false;
        if (other.getPrivileged() == null ^ this.getPrivileged() == null)
            return false;
        if (other.getPrivileged() != null && other.getPrivileged().equals(this.getPrivileged()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerRuntime() == null) ? 0 : getContainerRuntime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getLaunchedAt() == null) ? 0 : getLaunchedAt().hashCode());
        hashCode = prime * hashCode + ((getVolumeMounts() == null) ? 0 : getVolumeMounts().hashCode());
        hashCode = prime * hashCode + ((getPrivileged() == null) ? 0 : getPrivileged().hashCode());
        return hashCode;
    }

    @Override
    public ContainerDetails clone() {
        try {
            return (ContainerDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ContainerDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
