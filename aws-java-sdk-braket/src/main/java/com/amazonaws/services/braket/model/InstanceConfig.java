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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures the resource instances to use while running the Amazon Braket hybrid job on Amazon Braket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/InstanceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configures the number of resource instances to use while running an Amazon Braket job on Amazon Braket. The
     * default value is 1.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * Configures the type resource instances to use while running an Amazon Braket hybrid job.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The size of the storage volume, in GB, that user wants to provision.
     * </p>
     */
    private Integer volumeSizeInGb;

    /**
     * <p>
     * Configures the number of resource instances to use while running an Amazon Braket job on Amazon Braket. The
     * default value is 1.
     * </p>
     * 
     * @param instanceCount
     *        Configures the number of resource instances to use while running an Amazon Braket job on Amazon Braket.
     *        The default value is 1.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * Configures the number of resource instances to use while running an Amazon Braket job on Amazon Braket. The
     * default value is 1.
     * </p>
     * 
     * @return Configures the number of resource instances to use while running an Amazon Braket job on Amazon Braket.
     *         The default value is 1.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * Configures the number of resource instances to use while running an Amazon Braket job on Amazon Braket. The
     * default value is 1.
     * </p>
     * 
     * @param instanceCount
     *        Configures the number of resource instances to use while running an Amazon Braket job on Amazon Braket.
     *        The default value is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceConfig withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * Configures the type resource instances to use while running an Amazon Braket hybrid job.
     * </p>
     * 
     * @param instanceType
     *        Configures the type resource instances to use while running an Amazon Braket hybrid job.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Configures the type resource instances to use while running an Amazon Braket hybrid job.
     * </p>
     * 
     * @return Configures the type resource instances to use while running an Amazon Braket hybrid job.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * Configures the type resource instances to use while running an Amazon Braket hybrid job.
     * </p>
     * 
     * @param instanceType
     *        Configures the type resource instances to use while running an Amazon Braket hybrid job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public InstanceConfig withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * Configures the type resource instances to use while running an Amazon Braket hybrid job.
     * </p>
     * 
     * @param instanceType
     *        Configures the type resource instances to use while running an Amazon Braket hybrid job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public InstanceConfig withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The size of the storage volume, in GB, that user wants to provision.
     * </p>
     * 
     * @param volumeSizeInGb
     *        The size of the storage volume, in GB, that user wants to provision.
     */

    public void setVolumeSizeInGb(Integer volumeSizeInGb) {
        this.volumeSizeInGb = volumeSizeInGb;
    }

    /**
     * <p>
     * The size of the storage volume, in GB, that user wants to provision.
     * </p>
     * 
     * @return The size of the storage volume, in GB, that user wants to provision.
     */

    public Integer getVolumeSizeInGb() {
        return this.volumeSizeInGb;
    }

    /**
     * <p>
     * The size of the storage volume, in GB, that user wants to provision.
     * </p>
     * 
     * @param volumeSizeInGb
     *        The size of the storage volume, in GB, that user wants to provision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceConfig withVolumeSizeInGb(Integer volumeSizeInGb) {
        setVolumeSizeInGb(volumeSizeInGb);
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getVolumeSizeInGb() != null)
            sb.append("VolumeSizeInGb: ").append(getVolumeSizeInGb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceConfig == false)
            return false;
        InstanceConfig other = (InstanceConfig) obj;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getVolumeSizeInGb() == null ^ this.getVolumeSizeInGb() == null)
            return false;
        if (other.getVolumeSizeInGb() != null && other.getVolumeSizeInGb().equals(this.getVolumeSizeInGb()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInGb() == null) ? 0 : getVolumeSizeInGb().hashCode());
        return hashCode;
    }

    @Override
    public InstanceConfig clone() {
        try {
            return (InstanceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.InstanceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
