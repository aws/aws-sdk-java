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
 * Provides information about an Amazon ECS container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsContainerDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsContainerDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the container.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The image used for the container.
     * </p>
     */
    private String image;
    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     */
    private java.util.List<AwsMountPoint> mountPoints;
    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the root user).
     * </p>
     */
    private Boolean privileged;

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param name
     *        The name of the container.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @return The name of the container.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param name
     *        The name of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsContainerDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The image used for the container.
     * </p>
     * 
     * @param image
     *        The image used for the container.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The image used for the container.
     * </p>
     * 
     * @return The image used for the container.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The image used for the container.
     * </p>
     * 
     * @param image
     *        The image used for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsContainerDetails withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * 
     * @return The mount points for data volumes in your container.
     */

    public java.util.List<AwsMountPoint> getMountPoints() {
        return mountPoints;
    }

    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container.
     */

    public void setMountPoints(java.util.Collection<AwsMountPoint> mountPoints) {
        if (mountPoints == null) {
            this.mountPoints = null;
            return;
        }

        this.mountPoints = new java.util.ArrayList<AwsMountPoint>(mountPoints);
    }

    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMountPoints(java.util.Collection)} or {@link #withMountPoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsContainerDetails withMountPoints(AwsMountPoint... mountPoints) {
        if (this.mountPoints == null) {
            setMountPoints(new java.util.ArrayList<AwsMountPoint>(mountPoints.length));
        }
        for (AwsMountPoint ele : mountPoints) {
            this.mountPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsContainerDetails withMountPoints(java.util.Collection<AwsMountPoint> mountPoints) {
        setMountPoints(mountPoints);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the root user).
     * </p>
     * 
     * @param privileged
     *        When this parameter is true, the container is given elevated privileges on the host container instance
     *        (similar to the root user).
     */

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the root user).
     * </p>
     * 
     * @return When this parameter is true, the container is given elevated privileges on the host container instance
     *         (similar to the root user).
     */

    public Boolean getPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the root user).
     * </p>
     * 
     * @param privileged
     *        When this parameter is true, the container is given elevated privileges on the host container instance
     *        (similar to the root user).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsContainerDetails withPrivileged(Boolean privileged) {
        setPrivileged(privileged);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the root user).
     * </p>
     * 
     * @return When this parameter is true, the container is given elevated privileges on the host container instance
     *         (similar to the root user).
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getMountPoints() != null)
            sb.append("MountPoints: ").append(getMountPoints()).append(",");
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

        if (obj instanceof AwsEcsContainerDetails == false)
            return false;
        AwsEcsContainerDetails other = (AwsEcsContainerDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getMountPoints() == null ^ this.getMountPoints() == null)
            return false;
        if (other.getMountPoints() != null && other.getMountPoints().equals(this.getMountPoints()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getMountPoints() == null) ? 0 : getMountPoints().hashCode());
        hashCode = prime * hashCode + ((getPrivileged() == null) ? 0 : getPrivileged().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsContainerDetails clone() {
        try {
            return (AwsEcsContainerDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsContainerDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
