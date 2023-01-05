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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an instance reuse policy for a warm pool.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html">Warm pools for Amazon
 * EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/InstanceReusePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceReusePolicy implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
     * </p>
     */
    private Boolean reuseOnScaleIn;

    /**
     * <p>
     * Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
     * </p>
     * 
     * @param reuseOnScaleIn
     *        Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
     */

    public void setReuseOnScaleIn(Boolean reuseOnScaleIn) {
        this.reuseOnScaleIn = reuseOnScaleIn;
    }

    /**
     * <p>
     * Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
     * </p>
     * 
     * @return Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
     */

    public Boolean getReuseOnScaleIn() {
        return this.reuseOnScaleIn;
    }

    /**
     * <p>
     * Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
     * </p>
     * 
     * @param reuseOnScaleIn
     *        Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceReusePolicy withReuseOnScaleIn(Boolean reuseOnScaleIn) {
        setReuseOnScaleIn(reuseOnScaleIn);
        return this;
    }

    /**
     * <p>
     * Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
     * </p>
     * 
     * @return Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
     */

    public Boolean isReuseOnScaleIn() {
        return this.reuseOnScaleIn;
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
        if (getReuseOnScaleIn() != null)
            sb.append("ReuseOnScaleIn: ").append(getReuseOnScaleIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceReusePolicy == false)
            return false;
        InstanceReusePolicy other = (InstanceReusePolicy) obj;
        if (other.getReuseOnScaleIn() == null ^ this.getReuseOnScaleIn() == null)
            return false;
        if (other.getReuseOnScaleIn() != null && other.getReuseOnScaleIn().equals(this.getReuseOnScaleIn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReuseOnScaleIn() == null) ? 0 : getReuseOnScaleIn().hashCode());
        return hashCode;
    }

    @Override
    public InstanceReusePolicy clone() {
        try {
            return (InstanceReusePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
