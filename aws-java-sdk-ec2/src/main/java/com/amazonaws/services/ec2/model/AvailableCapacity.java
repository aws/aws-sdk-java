/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The capacity information for instances launched onto the Dedicated Host.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AvailableCapacity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailableCapacity implements Serializable, Cloneable {

    /**
     * <p>
     * The total number of instances supported by the Dedicated Host.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceCapacity> availableInstanceCapacity;
    /**
     * <p>
     * The number of vCPUs available on the Dedicated Host.
     * </p>
     */
    private Integer availableVCpus;

    /**
     * <p>
     * The total number of instances supported by the Dedicated Host.
     * </p>
     * 
     * @return The total number of instances supported by the Dedicated Host.
     */

    public java.util.List<InstanceCapacity> getAvailableInstanceCapacity() {
        if (availableInstanceCapacity == null) {
            availableInstanceCapacity = new com.amazonaws.internal.SdkInternalList<InstanceCapacity>();
        }
        return availableInstanceCapacity;
    }

    /**
     * <p>
     * The total number of instances supported by the Dedicated Host.
     * </p>
     * 
     * @param availableInstanceCapacity
     *        The total number of instances supported by the Dedicated Host.
     */

    public void setAvailableInstanceCapacity(java.util.Collection<InstanceCapacity> availableInstanceCapacity) {
        if (availableInstanceCapacity == null) {
            this.availableInstanceCapacity = null;
            return;
        }

        this.availableInstanceCapacity = new com.amazonaws.internal.SdkInternalList<InstanceCapacity>(availableInstanceCapacity);
    }

    /**
     * <p>
     * The total number of instances supported by the Dedicated Host.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailableInstanceCapacity(java.util.Collection)} or
     * {@link #withAvailableInstanceCapacity(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param availableInstanceCapacity
     *        The total number of instances supported by the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailableCapacity withAvailableInstanceCapacity(InstanceCapacity... availableInstanceCapacity) {
        if (this.availableInstanceCapacity == null) {
            setAvailableInstanceCapacity(new com.amazonaws.internal.SdkInternalList<InstanceCapacity>(availableInstanceCapacity.length));
        }
        for (InstanceCapacity ele : availableInstanceCapacity) {
            this.availableInstanceCapacity.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The total number of instances supported by the Dedicated Host.
     * </p>
     * 
     * @param availableInstanceCapacity
     *        The total number of instances supported by the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailableCapacity withAvailableInstanceCapacity(java.util.Collection<InstanceCapacity> availableInstanceCapacity) {
        setAvailableInstanceCapacity(availableInstanceCapacity);
        return this;
    }

    /**
     * <p>
     * The number of vCPUs available on the Dedicated Host.
     * </p>
     * 
     * @param availableVCpus
     *        The number of vCPUs available on the Dedicated Host.
     */

    public void setAvailableVCpus(Integer availableVCpus) {
        this.availableVCpus = availableVCpus;
    }

    /**
     * <p>
     * The number of vCPUs available on the Dedicated Host.
     * </p>
     * 
     * @return The number of vCPUs available on the Dedicated Host.
     */

    public Integer getAvailableVCpus() {
        return this.availableVCpus;
    }

    /**
     * <p>
     * The number of vCPUs available on the Dedicated Host.
     * </p>
     * 
     * @param availableVCpus
     *        The number of vCPUs available on the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailableCapacity withAvailableVCpus(Integer availableVCpus) {
        setAvailableVCpus(availableVCpus);
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
        if (getAvailableInstanceCapacity() != null)
            sb.append("AvailableInstanceCapacity: ").append(getAvailableInstanceCapacity()).append(",");
        if (getAvailableVCpus() != null)
            sb.append("AvailableVCpus: ").append(getAvailableVCpus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailableCapacity == false)
            return false;
        AvailableCapacity other = (AvailableCapacity) obj;
        if (other.getAvailableInstanceCapacity() == null ^ this.getAvailableInstanceCapacity() == null)
            return false;
        if (other.getAvailableInstanceCapacity() != null && other.getAvailableInstanceCapacity().equals(this.getAvailableInstanceCapacity()) == false)
            return false;
        if (other.getAvailableVCpus() == null ^ this.getAvailableVCpus() == null)
            return false;
        if (other.getAvailableVCpus() != null && other.getAvailableVCpus().equals(this.getAvailableVCpus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailableInstanceCapacity() == null) ? 0 : getAvailableInstanceCapacity().hashCode());
        hashCode = prime * hashCode + ((getAvailableVCpus() == null) ? 0 : getAvailableVCpus().hashCode());
        return hashCode;
    }

    @Override
    public AvailableCapacity clone() {
        try {
            return (AvailableCapacity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
