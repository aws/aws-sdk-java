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
 * Describes the modification request/s.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReservedInstancesModificationResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstancesModificationResult implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the Reserved Instances that were created as part of the modification request. This field is only
     * available when the modification is fulfilled.
     * </p>
     */
    private String reservedInstancesId;
    /**
     * <p>
     * The target Reserved Instances configurations supplied as part of the modification request.
     * </p>
     */
    private ReservedInstancesConfiguration targetConfiguration;

    /**
     * <p>
     * The ID for the Reserved Instances that were created as part of the modification request. This field is only
     * available when the modification is fulfilled.
     * </p>
     * 
     * @param reservedInstancesId
     *        The ID for the Reserved Instances that were created as part of the modification request. This field is
     *        only available when the modification is fulfilled.
     */

    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }

    /**
     * <p>
     * The ID for the Reserved Instances that were created as part of the modification request. This field is only
     * available when the modification is fulfilled.
     * </p>
     * 
     * @return The ID for the Reserved Instances that were created as part of the modification request. This field is
     *         only available when the modification is fulfilled.
     */

    public String getReservedInstancesId() {
        return this.reservedInstancesId;
    }

    /**
     * <p>
     * The ID for the Reserved Instances that were created as part of the modification request. This field is only
     * available when the modification is fulfilled.
     * </p>
     * 
     * @param reservedInstancesId
     *        The ID for the Reserved Instances that were created as part of the modification request. This field is
     *        only available when the modification is fulfilled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesModificationResult withReservedInstancesId(String reservedInstancesId) {
        setReservedInstancesId(reservedInstancesId);
        return this;
    }

    /**
     * <p>
     * The target Reserved Instances configurations supplied as part of the modification request.
     * </p>
     * 
     * @param targetConfiguration
     *        The target Reserved Instances configurations supplied as part of the modification request.
     */

    public void setTargetConfiguration(ReservedInstancesConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
    }

    /**
     * <p>
     * The target Reserved Instances configurations supplied as part of the modification request.
     * </p>
     * 
     * @return The target Reserved Instances configurations supplied as part of the modification request.
     */

    public ReservedInstancesConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    /**
     * <p>
     * The target Reserved Instances configurations supplied as part of the modification request.
     * </p>
     * 
     * @param targetConfiguration
     *        The target Reserved Instances configurations supplied as part of the modification request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesModificationResult withTargetConfiguration(ReservedInstancesConfiguration targetConfiguration) {
        setTargetConfiguration(targetConfiguration);
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
        if (getReservedInstancesId() != null)
            sb.append("ReservedInstancesId: ").append(getReservedInstancesId()).append(",");
        if (getTargetConfiguration() != null)
            sb.append("TargetConfiguration: ").append(getTargetConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstancesModificationResult == false)
            return false;
        ReservedInstancesModificationResult other = (ReservedInstancesModificationResult) obj;
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null)
            return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false)
            return false;
        if (other.getTargetConfiguration() == null ^ this.getTargetConfiguration() == null)
            return false;
        if (other.getTargetConfiguration() != null && other.getTargetConfiguration().equals(this.getTargetConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode());
        hashCode = prime * hashCode + ((getTargetConfiguration() == null) ? 0 : getTargetConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ReservedInstancesModificationResult clone() {
        try {
            return (ReservedInstancesModificationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
