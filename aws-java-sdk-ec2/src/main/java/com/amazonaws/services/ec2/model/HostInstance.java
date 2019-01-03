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
 * Describes an instance running on a Dedicated Host.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/HostInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HostInstance implements Serializable, Cloneable {

    /**
     * <p>
     * the IDs of instances that are running on the Dedicated Host.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The instance type size (for example, <code>m3.medium</code>) of the running instance.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * the IDs of instances that are running on the Dedicated Host.
     * </p>
     * 
     * @param instanceId
     *        the IDs of instances that are running on the Dedicated Host.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * the IDs of instances that are running on the Dedicated Host.
     * </p>
     * 
     * @return the IDs of instances that are running on the Dedicated Host.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * the IDs of instances that are running on the Dedicated Host.
     * </p>
     * 
     * @param instanceId
     *        the IDs of instances that are running on the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostInstance withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The instance type size (for example, <code>m3.medium</code>) of the running instance.
     * </p>
     * 
     * @param instanceType
     *        The instance type size (for example, <code>m3.medium</code>) of the running instance.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type size (for example, <code>m3.medium</code>) of the running instance.
     * </p>
     * 
     * @return The instance type size (for example, <code>m3.medium</code>) of the running instance.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type size (for example, <code>m3.medium</code>) of the running instance.
     * </p>
     * 
     * @param instanceType
     *        The instance type size (for example, <code>m3.medium</code>) of the running instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostInstance withInstanceType(String instanceType) {
        setInstanceType(instanceType);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostInstance == false)
            return false;
        HostInstance other = (HostInstance) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        return hashCode;
    }

    @Override
    public HostInstance clone() {
        try {
            return (HostInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
