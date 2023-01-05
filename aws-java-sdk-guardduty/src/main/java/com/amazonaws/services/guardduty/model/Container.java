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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of a container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Container" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Container implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container runtime (such as, Docker or containerd) used to run the container.
     * </p>
     */
    private String containerRuntime;
    /**
     * <p>
     * Container ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Container name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Container image.
     * </p>
     */
    private String image;
    /**
     * <p>
     * Part of the image name before the last slash. For example, imagePrefix for
     * public.ecr.aws/amazonlinux/amazonlinux:latest would be public.ecr.aws/amazonlinux. If the image name is relative
     * and does not have a slash, this field is empty.
     * </p>
     */
    private String imagePrefix;
    /**
     * <p>
     * Container volume mounts.
     * </p>
     */
    private java.util.List<VolumeMount> volumeMounts;
    /**
     * <p>
     * Container security context.
     * </p>
     */
    private SecurityContext securityContext;

    /**
     * <p>
     * The container runtime (such as, Docker or containerd) used to run the container.
     * </p>
     * 
     * @param containerRuntime
     *        The container runtime (such as, Docker or containerd) used to run the container.
     */

    public void setContainerRuntime(String containerRuntime) {
        this.containerRuntime = containerRuntime;
    }

    /**
     * <p>
     * The container runtime (such as, Docker or containerd) used to run the container.
     * </p>
     * 
     * @return The container runtime (such as, Docker or containerd) used to run the container.
     */

    public String getContainerRuntime() {
        return this.containerRuntime;
    }

    /**
     * <p>
     * The container runtime (such as, Docker or containerd) used to run the container.
     * </p>
     * 
     * @param containerRuntime
     *        The container runtime (such as, Docker or containerd) used to run the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withContainerRuntime(String containerRuntime) {
        setContainerRuntime(containerRuntime);
        return this;
    }

    /**
     * <p>
     * Container ID.
     * </p>
     * 
     * @param id
     *        Container ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Container ID.
     * </p>
     * 
     * @return Container ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Container ID.
     * </p>
     * 
     * @param id
     *        Container ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Container name.
     * </p>
     * 
     * @param name
     *        Container name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Container name.
     * </p>
     * 
     * @return Container name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Container name.
     * </p>
     * 
     * @param name
     *        Container name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Container image.
     * </p>
     * 
     * @param image
     *        Container image.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * Container image.
     * </p>
     * 
     * @return Container image.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * Container image.
     * </p>
     * 
     * @param image
     *        Container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Part of the image name before the last slash. For example, imagePrefix for
     * public.ecr.aws/amazonlinux/amazonlinux:latest would be public.ecr.aws/amazonlinux. If the image name is relative
     * and does not have a slash, this field is empty.
     * </p>
     * 
     * @param imagePrefix
     *        Part of the image name before the last slash. For example, imagePrefix for
     *        public.ecr.aws/amazonlinux/amazonlinux:latest would be public.ecr.aws/amazonlinux. If the image name is
     *        relative and does not have a slash, this field is empty.
     */

    public void setImagePrefix(String imagePrefix) {
        this.imagePrefix = imagePrefix;
    }

    /**
     * <p>
     * Part of the image name before the last slash. For example, imagePrefix for
     * public.ecr.aws/amazonlinux/amazonlinux:latest would be public.ecr.aws/amazonlinux. If the image name is relative
     * and does not have a slash, this field is empty.
     * </p>
     * 
     * @return Part of the image name before the last slash. For example, imagePrefix for
     *         public.ecr.aws/amazonlinux/amazonlinux:latest would be public.ecr.aws/amazonlinux. If the image name is
     *         relative and does not have a slash, this field is empty.
     */

    public String getImagePrefix() {
        return this.imagePrefix;
    }

    /**
     * <p>
     * Part of the image name before the last slash. For example, imagePrefix for
     * public.ecr.aws/amazonlinux/amazonlinux:latest would be public.ecr.aws/amazonlinux. If the image name is relative
     * and does not have a slash, this field is empty.
     * </p>
     * 
     * @param imagePrefix
     *        Part of the image name before the last slash. For example, imagePrefix for
     *        public.ecr.aws/amazonlinux/amazonlinux:latest would be public.ecr.aws/amazonlinux. If the image name is
     *        relative and does not have a slash, this field is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withImagePrefix(String imagePrefix) {
        setImagePrefix(imagePrefix);
        return this;
    }

    /**
     * <p>
     * Container volume mounts.
     * </p>
     * 
     * @return Container volume mounts.
     */

    public java.util.List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * <p>
     * Container volume mounts.
     * </p>
     * 
     * @param volumeMounts
     *        Container volume mounts.
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
     * Container volume mounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeMounts(java.util.Collection)} or {@link #withVolumeMounts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumeMounts
     *        Container volume mounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withVolumeMounts(VolumeMount... volumeMounts) {
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
     * Container volume mounts.
     * </p>
     * 
     * @param volumeMounts
     *        Container volume mounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withVolumeMounts(java.util.Collection<VolumeMount> volumeMounts) {
        setVolumeMounts(volumeMounts);
        return this;
    }

    /**
     * <p>
     * Container security context.
     * </p>
     * 
     * @param securityContext
     *        Container security context.
     */

    public void setSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    /**
     * <p>
     * Container security context.
     * </p>
     * 
     * @return Container security context.
     */

    public SecurityContext getSecurityContext() {
        return this.securityContext;
    }

    /**
     * <p>
     * Container security context.
     * </p>
     * 
     * @param securityContext
     *        Container security context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withSecurityContext(SecurityContext securityContext) {
        setSecurityContext(securityContext);
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
        if (getContainerRuntime() != null)
            sb.append("ContainerRuntime: ").append(getContainerRuntime()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getImagePrefix() != null)
            sb.append("ImagePrefix: ").append(getImagePrefix()).append(",");
        if (getVolumeMounts() != null)
            sb.append("VolumeMounts: ").append(getVolumeMounts()).append(",");
        if (getSecurityContext() != null)
            sb.append("SecurityContext: ").append(getSecurityContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Container == false)
            return false;
        Container other = (Container) obj;
        if (other.getContainerRuntime() == null ^ this.getContainerRuntime() == null)
            return false;
        if (other.getContainerRuntime() != null && other.getContainerRuntime().equals(this.getContainerRuntime()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getImagePrefix() == null ^ this.getImagePrefix() == null)
            return false;
        if (other.getImagePrefix() != null && other.getImagePrefix().equals(this.getImagePrefix()) == false)
            return false;
        if (other.getVolumeMounts() == null ^ this.getVolumeMounts() == null)
            return false;
        if (other.getVolumeMounts() != null && other.getVolumeMounts().equals(this.getVolumeMounts()) == false)
            return false;
        if (other.getSecurityContext() == null ^ this.getSecurityContext() == null)
            return false;
        if (other.getSecurityContext() != null && other.getSecurityContext().equals(this.getSecurityContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerRuntime() == null) ? 0 : getContainerRuntime().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getImagePrefix() == null) ? 0 : getImagePrefix().hashCode());
        hashCode = prime * hashCode + ((getVolumeMounts() == null) ? 0 : getVolumeMounts().hashCode());
        hashCode = prime * hashCode + ((getSecurityContext() == null) ? 0 : getSecurityContext().hashCode());
        return hashCode;
    }

    @Override
    public Container clone() {
        try {
            return (Container) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ContainerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
