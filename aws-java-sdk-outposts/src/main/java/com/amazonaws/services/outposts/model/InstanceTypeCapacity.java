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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The instance type that you specify determines the combination of CPU, memory, storage, and networking capacity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/InstanceTypeCapacity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceTypeCapacity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance type of the hosts.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of instances for the specified instance type.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The instance type of the hosts.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the hosts.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the hosts.
     * </p>
     * 
     * @return The instance type of the hosts.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the hosts.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the hosts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeCapacity withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The number of instances for the specified instance type.
     * </p>
     * 
     * @param count
     *        The number of instances for the specified instance type.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of instances for the specified instance type.
     * </p>
     * 
     * @return The number of instances for the specified instance type.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of instances for the specified instance type.
     * </p>
     * 
     * @param count
     *        The number of instances for the specified instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeCapacity withCount(Integer count) {
        setCount(count);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceTypeCapacity == false)
            return false;
        InstanceTypeCapacity other = (InstanceTypeCapacity) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public InstanceTypeCapacity clone() {
        try {
            return (InstanceTypeCapacity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.InstanceTypeCapacityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
