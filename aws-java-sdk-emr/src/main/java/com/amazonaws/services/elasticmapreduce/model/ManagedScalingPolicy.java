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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Managed scaling policy for an Amazon EMR cluster. The policy specifies the limits for resources that can be added or
 * terminated from a cluster. The policy only applies to the core and task nodes. The master node cannot be scaled after
 * initial configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ManagedScalingPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedScalingPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The EC2 unit limits for a managed scaling policy. The managed scaling activity of a cluster is not allowed to go
     * above or below these limits. The limit only applies to the core and task nodes. The master node cannot be scaled
     * after initial configuration.
     * </p>
     */
    private ComputeLimits computeLimits;

    /**
     * <p>
     * The EC2 unit limits for a managed scaling policy. The managed scaling activity of a cluster is not allowed to go
     * above or below these limits. The limit only applies to the core and task nodes. The master node cannot be scaled
     * after initial configuration.
     * </p>
     * 
     * @param computeLimits
     *        The EC2 unit limits for a managed scaling policy. The managed scaling activity of a cluster is not allowed
     *        to go above or below these limits. The limit only applies to the core and task nodes. The master node
     *        cannot be scaled after initial configuration.
     */

    public void setComputeLimits(ComputeLimits computeLimits) {
        this.computeLimits = computeLimits;
    }

    /**
     * <p>
     * The EC2 unit limits for a managed scaling policy. The managed scaling activity of a cluster is not allowed to go
     * above or below these limits. The limit only applies to the core and task nodes. The master node cannot be scaled
     * after initial configuration.
     * </p>
     * 
     * @return The EC2 unit limits for a managed scaling policy. The managed scaling activity of a cluster is not
     *         allowed to go above or below these limits. The limit only applies to the core and task nodes. The master
     *         node cannot be scaled after initial configuration.
     */

    public ComputeLimits getComputeLimits() {
        return this.computeLimits;
    }

    /**
     * <p>
     * The EC2 unit limits for a managed scaling policy. The managed scaling activity of a cluster is not allowed to go
     * above or below these limits. The limit only applies to the core and task nodes. The master node cannot be scaled
     * after initial configuration.
     * </p>
     * 
     * @param computeLimits
     *        The EC2 unit limits for a managed scaling policy. The managed scaling activity of a cluster is not allowed
     *        to go above or below these limits. The limit only applies to the core and task nodes. The master node
     *        cannot be scaled after initial configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedScalingPolicy withComputeLimits(ComputeLimits computeLimits) {
        setComputeLimits(computeLimits);
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
        if (getComputeLimits() != null)
            sb.append("ComputeLimits: ").append(getComputeLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedScalingPolicy == false)
            return false;
        ManagedScalingPolicy other = (ManagedScalingPolicy) obj;
        if (other.getComputeLimits() == null ^ this.getComputeLimits() == null)
            return false;
        if (other.getComputeLimits() != null && other.getComputeLimits().equals(this.getComputeLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputeLimits() == null) ? 0 : getComputeLimits().hashCode());
        return hashCode;
    }

    @Override
    public ManagedScalingPolicy clone() {
        try {
            return (ManagedScalingPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.ManagedScalingPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
