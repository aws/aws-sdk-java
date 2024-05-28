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
 * An object where you specify the anticipated traffic pattern for an endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ScalingPolicyObjective" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingPolicyObjective implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of expected requests to your endpoint per minute.
     * </p>
     */
    private Integer minInvocationsPerMinute;
    /**
     * <p>
     * The maximum number of expected requests to your endpoint per minute.
     * </p>
     */
    private Integer maxInvocationsPerMinute;

    /**
     * <p>
     * The minimum number of expected requests to your endpoint per minute.
     * </p>
     * 
     * @param minInvocationsPerMinute
     *        The minimum number of expected requests to your endpoint per minute.
     */

    public void setMinInvocationsPerMinute(Integer minInvocationsPerMinute) {
        this.minInvocationsPerMinute = minInvocationsPerMinute;
    }

    /**
     * <p>
     * The minimum number of expected requests to your endpoint per minute.
     * </p>
     * 
     * @return The minimum number of expected requests to your endpoint per minute.
     */

    public Integer getMinInvocationsPerMinute() {
        return this.minInvocationsPerMinute;
    }

    /**
     * <p>
     * The minimum number of expected requests to your endpoint per minute.
     * </p>
     * 
     * @param minInvocationsPerMinute
     *        The minimum number of expected requests to your endpoint per minute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicyObjective withMinInvocationsPerMinute(Integer minInvocationsPerMinute) {
        setMinInvocationsPerMinute(minInvocationsPerMinute);
        return this;
    }

    /**
     * <p>
     * The maximum number of expected requests to your endpoint per minute.
     * </p>
     * 
     * @param maxInvocationsPerMinute
     *        The maximum number of expected requests to your endpoint per minute.
     */

    public void setMaxInvocationsPerMinute(Integer maxInvocationsPerMinute) {
        this.maxInvocationsPerMinute = maxInvocationsPerMinute;
    }

    /**
     * <p>
     * The maximum number of expected requests to your endpoint per minute.
     * </p>
     * 
     * @return The maximum number of expected requests to your endpoint per minute.
     */

    public Integer getMaxInvocationsPerMinute() {
        return this.maxInvocationsPerMinute;
    }

    /**
     * <p>
     * The maximum number of expected requests to your endpoint per minute.
     * </p>
     * 
     * @param maxInvocationsPerMinute
     *        The maximum number of expected requests to your endpoint per minute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicyObjective withMaxInvocationsPerMinute(Integer maxInvocationsPerMinute) {
        setMaxInvocationsPerMinute(maxInvocationsPerMinute);
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
        if (getMinInvocationsPerMinute() != null)
            sb.append("MinInvocationsPerMinute: ").append(getMinInvocationsPerMinute()).append(",");
        if (getMaxInvocationsPerMinute() != null)
            sb.append("MaxInvocationsPerMinute: ").append(getMaxInvocationsPerMinute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingPolicyObjective == false)
            return false;
        ScalingPolicyObjective other = (ScalingPolicyObjective) obj;
        if (other.getMinInvocationsPerMinute() == null ^ this.getMinInvocationsPerMinute() == null)
            return false;
        if (other.getMinInvocationsPerMinute() != null && other.getMinInvocationsPerMinute().equals(this.getMinInvocationsPerMinute()) == false)
            return false;
        if (other.getMaxInvocationsPerMinute() == null ^ this.getMaxInvocationsPerMinute() == null)
            return false;
        if (other.getMaxInvocationsPerMinute() != null && other.getMaxInvocationsPerMinute().equals(this.getMaxInvocationsPerMinute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinInvocationsPerMinute() == null) ? 0 : getMinInvocationsPerMinute().hashCode());
        hashCode = prime * hashCode + ((getMaxInvocationsPerMinute() == null) ? 0 : getMaxInvocationsPerMinute().hashCode());
        return hashCode;
    }

    @Override
    public ScalingPolicyObjective clone() {
        try {
            return (ScalingPolicyObjective) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ScalingPolicyObjectiveMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
