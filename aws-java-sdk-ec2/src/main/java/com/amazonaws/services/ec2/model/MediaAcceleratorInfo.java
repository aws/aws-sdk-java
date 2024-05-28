/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the media accelerators for the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/MediaAcceleratorInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaAcceleratorInfo implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the media accelerators for the instance type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MediaDeviceInfo> accelerators;
    /**
     * <p>
     * The total size of the memory for the media accelerators for the instance type, in MiB.
     * </p>
     */
    private Integer totalMediaMemoryInMiB;

    /**
     * <p>
     * Describes the media accelerators for the instance type.
     * </p>
     * 
     * @return Describes the media accelerators for the instance type.
     */

    public java.util.List<MediaDeviceInfo> getAccelerators() {
        if (accelerators == null) {
            accelerators = new com.amazonaws.internal.SdkInternalList<MediaDeviceInfo>();
        }
        return accelerators;
    }

    /**
     * <p>
     * Describes the media accelerators for the instance type.
     * </p>
     * 
     * @param accelerators
     *        Describes the media accelerators for the instance type.
     */

    public void setAccelerators(java.util.Collection<MediaDeviceInfo> accelerators) {
        if (accelerators == null) {
            this.accelerators = null;
            return;
        }

        this.accelerators = new com.amazonaws.internal.SdkInternalList<MediaDeviceInfo>(accelerators);
    }

    /**
     * <p>
     * Describes the media accelerators for the instance type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccelerators(java.util.Collection)} or {@link #withAccelerators(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accelerators
     *        Describes the media accelerators for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaAcceleratorInfo withAccelerators(MediaDeviceInfo... accelerators) {
        if (this.accelerators == null) {
            setAccelerators(new com.amazonaws.internal.SdkInternalList<MediaDeviceInfo>(accelerators.length));
        }
        for (MediaDeviceInfo ele : accelerators) {
            this.accelerators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the media accelerators for the instance type.
     * </p>
     * 
     * @param accelerators
     *        Describes the media accelerators for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaAcceleratorInfo withAccelerators(java.util.Collection<MediaDeviceInfo> accelerators) {
        setAccelerators(accelerators);
        return this;
    }

    /**
     * <p>
     * The total size of the memory for the media accelerators for the instance type, in MiB.
     * </p>
     * 
     * @param totalMediaMemoryInMiB
     *        The total size of the memory for the media accelerators for the instance type, in MiB.
     */

    public void setTotalMediaMemoryInMiB(Integer totalMediaMemoryInMiB) {
        this.totalMediaMemoryInMiB = totalMediaMemoryInMiB;
    }

    /**
     * <p>
     * The total size of the memory for the media accelerators for the instance type, in MiB.
     * </p>
     * 
     * @return The total size of the memory for the media accelerators for the instance type, in MiB.
     */

    public Integer getTotalMediaMemoryInMiB() {
        return this.totalMediaMemoryInMiB;
    }

    /**
     * <p>
     * The total size of the memory for the media accelerators for the instance type, in MiB.
     * </p>
     * 
     * @param totalMediaMemoryInMiB
     *        The total size of the memory for the media accelerators for the instance type, in MiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaAcceleratorInfo withTotalMediaMemoryInMiB(Integer totalMediaMemoryInMiB) {
        setTotalMediaMemoryInMiB(totalMediaMemoryInMiB);
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
        if (getAccelerators() != null)
            sb.append("Accelerators: ").append(getAccelerators()).append(",");
        if (getTotalMediaMemoryInMiB() != null)
            sb.append("TotalMediaMemoryInMiB: ").append(getTotalMediaMemoryInMiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaAcceleratorInfo == false)
            return false;
        MediaAcceleratorInfo other = (MediaAcceleratorInfo) obj;
        if (other.getAccelerators() == null ^ this.getAccelerators() == null)
            return false;
        if (other.getAccelerators() != null && other.getAccelerators().equals(this.getAccelerators()) == false)
            return false;
        if (other.getTotalMediaMemoryInMiB() == null ^ this.getTotalMediaMemoryInMiB() == null)
            return false;
        if (other.getTotalMediaMemoryInMiB() != null && other.getTotalMediaMemoryInMiB().equals(this.getTotalMediaMemoryInMiB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccelerators() == null) ? 0 : getAccelerators().hashCode());
        hashCode = prime * hashCode + ((getTotalMediaMemoryInMiB() == null) ? 0 : getTotalMediaMemoryInMiB().hashCode());
        return hashCode;
    }

    @Override
    public MediaAcceleratorInfo clone() {
        try {
            return (MediaAcceleratorInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
