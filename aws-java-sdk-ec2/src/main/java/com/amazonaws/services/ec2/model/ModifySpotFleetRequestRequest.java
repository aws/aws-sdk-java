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
import com.amazonaws.services.ec2.model.transform.ModifySpotFleetRequestRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ModifySpotFleetRequest.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySpotFleetRequestRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifySpotFleetRequestRequest> {

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is
     * decreased below the current size of the Spot Fleet.
     * </p>
     */
    private String excessCapacityTerminationPolicy;
    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     */
    private String spotFleetRequestId;
    /**
     * <p>
     * The size of the fleet.
     * </p>
     */
    private Integer targetCapacity;

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is
     * decreased below the current size of the Spot Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet
     *        request is decreased below the current size of the Spot Fleet.
     * @see ExcessCapacityTerminationPolicy
     */

    public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is
     * decreased below the current size of the Spot Fleet.
     * </p>
     * 
     * @return Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet
     *         request is decreased below the current size of the Spot Fleet.
     * @see ExcessCapacityTerminationPolicy
     */

    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is
     * decreased below the current size of the Spot Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet
     *        request is decreased below the current size of the Spot Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExcessCapacityTerminationPolicy
     */

    public ModifySpotFleetRequestRequest withExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        setExcessCapacityTerminationPolicy(excessCapacityTerminationPolicy);
        return this;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is
     * decreased below the current size of the Spot Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet
     *        request is decreased below the current size of the Spot Fleet.
     * @see ExcessCapacityTerminationPolicy
     */

    public void setExcessCapacityTerminationPolicy(ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        withExcessCapacityTerminationPolicy(excessCapacityTerminationPolicy);
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is
     * decreased below the current size of the Spot Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet
     *        request is decreased below the current size of the Spot Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExcessCapacityTerminationPolicy
     */

    public ModifySpotFleetRequestRequest withExcessCapacityTerminationPolicy(ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestId
     *        The ID of the Spot Fleet request.
     */

    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * 
     * @return The ID of the Spot Fleet request.
     */

    public String getSpotFleetRequestId() {
        return this.spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestId
     *        The ID of the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySpotFleetRequestRequest withSpotFleetRequestId(String spotFleetRequestId) {
        setSpotFleetRequestId(spotFleetRequestId);
        return this;
    }

    /**
     * <p>
     * The size of the fleet.
     * </p>
     * 
     * @param targetCapacity
     *        The size of the fleet.
     */

    public void setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
    }

    /**
     * <p>
     * The size of the fleet.
     * </p>
     * 
     * @return The size of the fleet.
     */

    public Integer getTargetCapacity() {
        return this.targetCapacity;
    }

    /**
     * <p>
     * The size of the fleet.
     * </p>
     * 
     * @param targetCapacity
     *        The size of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySpotFleetRequestRequest withTargetCapacity(Integer targetCapacity) {
        setTargetCapacity(targetCapacity);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifySpotFleetRequestRequest> getDryRunRequest() {
        Request<ModifySpotFleetRequestRequest> request = new ModifySpotFleetRequestRequestMarshaller().marshall(this);
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
        if (getExcessCapacityTerminationPolicy() != null)
            sb.append("ExcessCapacityTerminationPolicy: ").append(getExcessCapacityTerminationPolicy()).append(",");
        if (getSpotFleetRequestId() != null)
            sb.append("SpotFleetRequestId: ").append(getSpotFleetRequestId()).append(",");
        if (getTargetCapacity() != null)
            sb.append("TargetCapacity: ").append(getTargetCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySpotFleetRequestRequest == false)
            return false;
        ModifySpotFleetRequestRequest other = (ModifySpotFleetRequestRequest) obj;
        if (other.getExcessCapacityTerminationPolicy() == null ^ this.getExcessCapacityTerminationPolicy() == null)
            return false;
        if (other.getExcessCapacityTerminationPolicy() != null
                && other.getExcessCapacityTerminationPolicy().equals(this.getExcessCapacityTerminationPolicy()) == false)
            return false;
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null)
            return false;
        if (other.getSpotFleetRequestId() != null && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false)
            return false;
        if (other.getTargetCapacity() == null ^ this.getTargetCapacity() == null)
            return false;
        if (other.getTargetCapacity() != null && other.getTargetCapacity().equals(this.getTargetCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExcessCapacityTerminationPolicy() == null) ? 0 : getExcessCapacityTerminationPolicy().hashCode());
        hashCode = prime * hashCode + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode());
        hashCode = prime * hashCode + ((getTargetCapacity() == null) ? 0 : getTargetCapacity().hashCode());
        return hashCode;
    }

    @Override
    public ModifySpotFleetRequestRequest clone() {
        return (ModifySpotFleetRequestRequest) super.clone();
    }
}
