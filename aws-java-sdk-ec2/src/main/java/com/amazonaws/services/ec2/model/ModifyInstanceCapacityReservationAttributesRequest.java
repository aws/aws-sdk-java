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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyInstanceCapacityReservationAttributesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceCapacityReservationAttributesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyInstanceCapacityReservationAttributesRequest> {

    /**
     * <p>
     * The ID of the instance to be modified.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Information about the Capacity Reservation targeting option.
     * </p>
     */
    private CapacityReservationSpecification capacityReservationSpecification;

    /**
     * <p>
     * The ID of the instance to be modified.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance to be modified.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance to be modified.
     * </p>
     * 
     * @return The ID of the instance to be modified.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance to be modified.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance to be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceCapacityReservationAttributesRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option.
     * </p>
     * 
     * @param capacityReservationSpecification
     *        Information about the Capacity Reservation targeting option.
     */

    public void setCapacityReservationSpecification(CapacityReservationSpecification capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option.
     * </p>
     * 
     * @return Information about the Capacity Reservation targeting option.
     */

    public CapacityReservationSpecification getCapacityReservationSpecification() {
        return this.capacityReservationSpecification;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option.
     * </p>
     * 
     * @param capacityReservationSpecification
     *        Information about the Capacity Reservation targeting option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceCapacityReservationAttributesRequest withCapacityReservationSpecification(
            CapacityReservationSpecification capacityReservationSpecification) {
        setCapacityReservationSpecification(capacityReservationSpecification);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyInstanceCapacityReservationAttributesRequest> getDryRunRequest() {
        Request<ModifyInstanceCapacityReservationAttributesRequest> request = new ModifyInstanceCapacityReservationAttributesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getCapacityReservationSpecification() != null)
            sb.append("CapacityReservationSpecification: ").append(getCapacityReservationSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceCapacityReservationAttributesRequest == false)
            return false;
        ModifyInstanceCapacityReservationAttributesRequest other = (ModifyInstanceCapacityReservationAttributesRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getCapacityReservationSpecification() == null ^ this.getCapacityReservationSpecification() == null)
            return false;
        if (other.getCapacityReservationSpecification() != null
                && other.getCapacityReservationSpecification().equals(this.getCapacityReservationSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getCapacityReservationSpecification() == null) ? 0 : getCapacityReservationSpecification().hashCode());
        return hashCode;
    }

    @Override
    public ModifyInstanceCapacityReservationAttributesRequest clone() {
        return (ModifyInstanceCapacityReservationAttributesRequest) super.clone();
    }
}
