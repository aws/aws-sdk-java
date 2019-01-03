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
import com.amazonaws.services.ec2.model.transform.ModifyFleetRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyFleetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyFleetRequest> {

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     * decreased below the current size of the EC2 Fleet.
     * </p>
     */
    private String excessCapacityTerminationPolicy;
    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The size of the EC2 Fleet.
     * </p>
     */
    private TargetCapacitySpecificationRequest targetCapacitySpecification;

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     * decreased below the current size of the EC2 Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     *        decreased below the current size of the EC2 Fleet.
     * @see FleetExcessCapacityTerminationPolicy
     */

    public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     * decreased below the current size of the EC2 Fleet.
     * </p>
     * 
     * @return Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     *         decreased below the current size of the EC2 Fleet.
     * @see FleetExcessCapacityTerminationPolicy
     */

    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     * decreased below the current size of the EC2 Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     *        decreased below the current size of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetExcessCapacityTerminationPolicy
     */

    public ModifyFleetRequest withExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        setExcessCapacityTerminationPolicy(excessCapacityTerminationPolicy);
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     * decreased below the current size of the EC2 Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is
     *        decreased below the current size of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetExcessCapacityTerminationPolicy
     */

    public ModifyFleetRequest withExcessCapacityTerminationPolicy(FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * 
     * @param fleetId
     *        The ID of the EC2 Fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * 
     * @return The ID of the EC2 Fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * 
     * @param fleetId
     *        The ID of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyFleetRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The size of the EC2 Fleet.
     * </p>
     * 
     * @param targetCapacitySpecification
     *        The size of the EC2 Fleet.
     */

    public void setTargetCapacitySpecification(TargetCapacitySpecificationRequest targetCapacitySpecification) {
        this.targetCapacitySpecification = targetCapacitySpecification;
    }

    /**
     * <p>
     * The size of the EC2 Fleet.
     * </p>
     * 
     * @return The size of the EC2 Fleet.
     */

    public TargetCapacitySpecificationRequest getTargetCapacitySpecification() {
        return this.targetCapacitySpecification;
    }

    /**
     * <p>
     * The size of the EC2 Fleet.
     * </p>
     * 
     * @param targetCapacitySpecification
     *        The size of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyFleetRequest withTargetCapacitySpecification(TargetCapacitySpecificationRequest targetCapacitySpecification) {
        setTargetCapacitySpecification(targetCapacitySpecification);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyFleetRequest> getDryRunRequest() {
        Request<ModifyFleetRequest> request = new ModifyFleetRequestMarshaller().marshall(this);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getTargetCapacitySpecification() != null)
            sb.append("TargetCapacitySpecification: ").append(getTargetCapacitySpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyFleetRequest == false)
            return false;
        ModifyFleetRequest other = (ModifyFleetRequest) obj;
        if (other.getExcessCapacityTerminationPolicy() == null ^ this.getExcessCapacityTerminationPolicy() == null)
            return false;
        if (other.getExcessCapacityTerminationPolicy() != null
                && other.getExcessCapacityTerminationPolicy().equals(this.getExcessCapacityTerminationPolicy()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getTargetCapacitySpecification() == null ^ this.getTargetCapacitySpecification() == null)
            return false;
        if (other.getTargetCapacitySpecification() != null && other.getTargetCapacitySpecification().equals(this.getTargetCapacitySpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExcessCapacityTerminationPolicy() == null) ? 0 : getExcessCapacityTerminationPolicy().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getTargetCapacitySpecification() == null) ? 0 : getTargetCapacitySpecification().hashCode());
        return hashCode;
    }

    @Override
    public ModifyFleetRequest clone() {
        return (ModifyFleetRequest) super.clone();
    }
}
