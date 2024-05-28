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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing a recommended scaling policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ScalingPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A target tracking scaling policy. Includes support for predefined or customized metrics.
     * </p>
     */
    private TargetTrackingScalingPolicyConfiguration targetTracking;

    /**
     * <p>
     * A target tracking scaling policy. Includes support for predefined or customized metrics.
     * </p>
     * 
     * @param targetTracking
     *        A target tracking scaling policy. Includes support for predefined or customized metrics.
     */

    public void setTargetTracking(TargetTrackingScalingPolicyConfiguration targetTracking) {
        this.targetTracking = targetTracking;
    }

    /**
     * <p>
     * A target tracking scaling policy. Includes support for predefined or customized metrics.
     * </p>
     * 
     * @return A target tracking scaling policy. Includes support for predefined or customized metrics.
     */

    public TargetTrackingScalingPolicyConfiguration getTargetTracking() {
        return this.targetTracking;
    }

    /**
     * <p>
     * A target tracking scaling policy. Includes support for predefined or customized metrics.
     * </p>
     * 
     * @param targetTracking
     *        A target tracking scaling policy. Includes support for predefined or customized metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withTargetTracking(TargetTrackingScalingPolicyConfiguration targetTracking) {
        setTargetTracking(targetTracking);
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
        if (getTargetTracking() != null)
            sb.append("TargetTracking: ").append(getTargetTracking());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingPolicy == false)
            return false;
        ScalingPolicy other = (ScalingPolicy) obj;
        if (other.getTargetTracking() == null ^ this.getTargetTracking() == null)
            return false;
        if (other.getTargetTracking() != null && other.getTargetTracking().equals(this.getTargetTracking()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetTracking() == null) ? 0 : getTargetTracking().hashCode());
        return hashCode;
    }

    @Override
    public ScalingPolicy clone() {
        try {
            return (ScalingPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ScalingPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
