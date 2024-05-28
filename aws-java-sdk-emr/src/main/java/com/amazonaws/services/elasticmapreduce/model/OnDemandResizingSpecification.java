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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resize specification for On-Demand Instances in the instance fleet, which contains the resize timeout period.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/OnDemandResizingSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnDemandResizingSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * On-Demand resize timeout in minutes. If On-Demand Instances are not provisioned within this time, the resize
     * workflow stops. The minimum value is 5 minutes, and the maximum value is 10,080 minutes (7 days). The timeout
     * applies to all resize workflows on the Instance Fleet. The resize could be triggered by Amazon EMR Managed
     * Scaling or by the customer (via Amazon EMR Console, Amazon EMR CLI modify-instance-fleet or Amazon EMR SDK
     * ModifyInstanceFleet API) or by Amazon EMR due to Amazon EC2 Spot Reclamation.
     * </p>
     */
    private Integer timeoutDurationMinutes;

    /**
     * <p>
     * On-Demand resize timeout in minutes. If On-Demand Instances are not provisioned within this time, the resize
     * workflow stops. The minimum value is 5 minutes, and the maximum value is 10,080 minutes (7 days). The timeout
     * applies to all resize workflows on the Instance Fleet. The resize could be triggered by Amazon EMR Managed
     * Scaling or by the customer (via Amazon EMR Console, Amazon EMR CLI modify-instance-fleet or Amazon EMR SDK
     * ModifyInstanceFleet API) or by Amazon EMR due to Amazon EC2 Spot Reclamation.
     * </p>
     * 
     * @param timeoutDurationMinutes
     *        On-Demand resize timeout in minutes. If On-Demand Instances are not provisioned within this time, the
     *        resize workflow stops. The minimum value is 5 minutes, and the maximum value is 10,080 minutes (7 days).
     *        The timeout applies to all resize workflows on the Instance Fleet. The resize could be triggered by Amazon
     *        EMR Managed Scaling or by the customer (via Amazon EMR Console, Amazon EMR CLI modify-instance-fleet or
     *        Amazon EMR SDK ModifyInstanceFleet API) or by Amazon EMR due to Amazon EC2 Spot Reclamation.
     */

    public void setTimeoutDurationMinutes(Integer timeoutDurationMinutes) {
        this.timeoutDurationMinutes = timeoutDurationMinutes;
    }

    /**
     * <p>
     * On-Demand resize timeout in minutes. If On-Demand Instances are not provisioned within this time, the resize
     * workflow stops. The minimum value is 5 minutes, and the maximum value is 10,080 minutes (7 days). The timeout
     * applies to all resize workflows on the Instance Fleet. The resize could be triggered by Amazon EMR Managed
     * Scaling or by the customer (via Amazon EMR Console, Amazon EMR CLI modify-instance-fleet or Amazon EMR SDK
     * ModifyInstanceFleet API) or by Amazon EMR due to Amazon EC2 Spot Reclamation.
     * </p>
     * 
     * @return On-Demand resize timeout in minutes. If On-Demand Instances are not provisioned within this time, the
     *         resize workflow stops. The minimum value is 5 minutes, and the maximum value is 10,080 minutes (7 days).
     *         The timeout applies to all resize workflows on the Instance Fleet. The resize could be triggered by
     *         Amazon EMR Managed Scaling or by the customer (via Amazon EMR Console, Amazon EMR CLI
     *         modify-instance-fleet or Amazon EMR SDK ModifyInstanceFleet API) or by Amazon EMR due to Amazon EC2 Spot
     *         Reclamation.
     */

    public Integer getTimeoutDurationMinutes() {
        return this.timeoutDurationMinutes;
    }

    /**
     * <p>
     * On-Demand resize timeout in minutes. If On-Demand Instances are not provisioned within this time, the resize
     * workflow stops. The minimum value is 5 minutes, and the maximum value is 10,080 minutes (7 days). The timeout
     * applies to all resize workflows on the Instance Fleet. The resize could be triggered by Amazon EMR Managed
     * Scaling or by the customer (via Amazon EMR Console, Amazon EMR CLI modify-instance-fleet or Amazon EMR SDK
     * ModifyInstanceFleet API) or by Amazon EMR due to Amazon EC2 Spot Reclamation.
     * </p>
     * 
     * @param timeoutDurationMinutes
     *        On-Demand resize timeout in minutes. If On-Demand Instances are not provisioned within this time, the
     *        resize workflow stops. The minimum value is 5 minutes, and the maximum value is 10,080 minutes (7 days).
     *        The timeout applies to all resize workflows on the Instance Fleet. The resize could be triggered by Amazon
     *        EMR Managed Scaling or by the customer (via Amazon EMR Console, Amazon EMR CLI modify-instance-fleet or
     *        Amazon EMR SDK ModifyInstanceFleet API) or by Amazon EMR due to Amazon EC2 Spot Reclamation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnDemandResizingSpecification withTimeoutDurationMinutes(Integer timeoutDurationMinutes) {
        setTimeoutDurationMinutes(timeoutDurationMinutes);
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
        if (getTimeoutDurationMinutes() != null)
            sb.append("TimeoutDurationMinutes: ").append(getTimeoutDurationMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnDemandResizingSpecification == false)
            return false;
        OnDemandResizingSpecification other = (OnDemandResizingSpecification) obj;
        if (other.getTimeoutDurationMinutes() == null ^ this.getTimeoutDurationMinutes() == null)
            return false;
        if (other.getTimeoutDurationMinutes() != null && other.getTimeoutDurationMinutes().equals(this.getTimeoutDurationMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeoutDurationMinutes() == null) ? 0 : getTimeoutDurationMinutes().hashCode());
        return hashCode;
    }

    @Override
    public OnDemandResizingSpecification clone() {
        try {
            return (OnDemandResizingSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.OnDemandResizingSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
