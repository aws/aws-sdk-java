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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a custom source AMI and block device mapping configurations of an instance used for building and testing
 * container images.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/InstanceConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AMI ID to use as the base image for a container build and test instance. If not specified, Image Builder will
     * use the appropriate ECS-optimized AMI as a base image.
     * </p>
     */
    private String image;
    /**
     * <p>
     * Defines the block devices to attach for building an instance from this Image Builder AMI.
     * </p>
     */
    private java.util.List<InstanceBlockDeviceMapping> blockDeviceMappings;

    /**
     * <p>
     * The AMI ID to use as the base image for a container build and test instance. If not specified, Image Builder will
     * use the appropriate ECS-optimized AMI as a base image.
     * </p>
     * 
     * @param image
     *        The AMI ID to use as the base image for a container build and test instance. If not specified, Image
     *        Builder will use the appropriate ECS-optimized AMI as a base image.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The AMI ID to use as the base image for a container build and test instance. If not specified, Image Builder will
     * use the appropriate ECS-optimized AMI as a base image.
     * </p>
     * 
     * @return The AMI ID to use as the base image for a container build and test instance. If not specified, Image
     *         Builder will use the appropriate ECS-optimized AMI as a base image.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The AMI ID to use as the base image for a container build and test instance. If not specified, Image Builder will
     * use the appropriate ECS-optimized AMI as a base image.
     * </p>
     * 
     * @param image
     *        The AMI ID to use as the base image for a container build and test instance. If not specified, Image
     *        Builder will use the appropriate ECS-optimized AMI as a base image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceConfiguration withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Defines the block devices to attach for building an instance from this Image Builder AMI.
     * </p>
     * 
     * @return Defines the block devices to attach for building an instance from this Image Builder AMI.
     */

    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * Defines the block devices to attach for building an instance from this Image Builder AMI.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Defines the block devices to attach for building an instance from this Image Builder AMI.
     */

    public void setBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new java.util.ArrayList<InstanceBlockDeviceMapping>(blockDeviceMappings);
    }

    /**
     * <p>
     * Defines the block devices to attach for building an instance from this Image Builder AMI.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Defines the block devices to attach for building an instance from this Image Builder AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceConfiguration withBlockDeviceMappings(InstanceBlockDeviceMapping... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new java.util.ArrayList<InstanceBlockDeviceMapping>(blockDeviceMappings.length));
        }
        for (InstanceBlockDeviceMapping ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines the block devices to attach for building an instance from this Image Builder AMI.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Defines the block devices to attach for building an instance from this Image Builder AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceConfiguration withBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceConfiguration == false)
            return false;
        InstanceConfiguration other = (InstanceConfiguration) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        return hashCode;
    }

    @Override
    public InstanceConfiguration clone() {
        try {
            return (InstanceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.InstanceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
