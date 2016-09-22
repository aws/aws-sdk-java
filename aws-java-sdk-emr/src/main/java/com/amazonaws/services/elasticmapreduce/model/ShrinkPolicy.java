/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Policy for customizing shrink operations. Allows configuration of decommissioning timeout and targeted instance
 * shrinking.
 * </p>
 */
public class ShrinkPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * The desired timeout for decommissioning an instance. Overrides the default YARN decommissioning timeout.
     * </p>
     */
    private Integer decommissionTimeout;
    /**
     * <p>
     * Custom policy for requesting termination protection or termination of specific instances when shrinking an
     * instance group.
     * </p>
     */
    private InstanceResizePolicy instanceResizePolicy;

    /**
     * <p>
     * The desired timeout for decommissioning an instance. Overrides the default YARN decommissioning timeout.
     * </p>
     * 
     * @param decommissionTimeout
     *        The desired timeout for decommissioning an instance. Overrides the default YARN decommissioning timeout.
     */

    public void setDecommissionTimeout(Integer decommissionTimeout) {
        this.decommissionTimeout = decommissionTimeout;
    }

    /**
     * <p>
     * The desired timeout for decommissioning an instance. Overrides the default YARN decommissioning timeout.
     * </p>
     * 
     * @return The desired timeout for decommissioning an instance. Overrides the default YARN decommissioning timeout.
     */

    public Integer getDecommissionTimeout() {
        return this.decommissionTimeout;
    }

    /**
     * <p>
     * The desired timeout for decommissioning an instance. Overrides the default YARN decommissioning timeout.
     * </p>
     * 
     * @param decommissionTimeout
     *        The desired timeout for decommissioning an instance. Overrides the default YARN decommissioning timeout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShrinkPolicy withDecommissionTimeout(Integer decommissionTimeout) {
        setDecommissionTimeout(decommissionTimeout);
        return this;
    }

    /**
     * <p>
     * Custom policy for requesting termination protection or termination of specific instances when shrinking an
     * instance group.
     * </p>
     * 
     * @param instanceResizePolicy
     *        Custom policy for requesting termination protection or termination of specific instances when shrinking an
     *        instance group.
     */

    public void setInstanceResizePolicy(InstanceResizePolicy instanceResizePolicy) {
        this.instanceResizePolicy = instanceResizePolicy;
    }

    /**
     * <p>
     * Custom policy for requesting termination protection or termination of specific instances when shrinking an
     * instance group.
     * </p>
     * 
     * @return Custom policy for requesting termination protection or termination of specific instances when shrinking
     *         an instance group.
     */

    public InstanceResizePolicy getInstanceResizePolicy() {
        return this.instanceResizePolicy;
    }

    /**
     * <p>
     * Custom policy for requesting termination protection or termination of specific instances when shrinking an
     * instance group.
     * </p>
     * 
     * @param instanceResizePolicy
     *        Custom policy for requesting termination protection or termination of specific instances when shrinking an
     *        instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShrinkPolicy withInstanceResizePolicy(InstanceResizePolicy instanceResizePolicy) {
        setInstanceResizePolicy(instanceResizePolicy);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDecommissionTimeout() != null)
            sb.append("DecommissionTimeout: " + getDecommissionTimeout() + ",");
        if (getInstanceResizePolicy() != null)
            sb.append("InstanceResizePolicy: " + getInstanceResizePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShrinkPolicy == false)
            return false;
        ShrinkPolicy other = (ShrinkPolicy) obj;
        if (other.getDecommissionTimeout() == null ^ this.getDecommissionTimeout() == null)
            return false;
        if (other.getDecommissionTimeout() != null && other.getDecommissionTimeout().equals(this.getDecommissionTimeout()) == false)
            return false;
        if (other.getInstanceResizePolicy() == null ^ this.getInstanceResizePolicy() == null)
            return false;
        if (other.getInstanceResizePolicy() != null && other.getInstanceResizePolicy().equals(this.getInstanceResizePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecommissionTimeout() == null) ? 0 : getDecommissionTimeout().hashCode());
        hashCode = prime * hashCode + ((getInstanceResizePolicy() == null) ? 0 : getInstanceResizePolicy().hashCode());
        return hashCode;
    }

    @Override
    public ShrinkPolicy clone() {
        try {
            return (ShrinkPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
