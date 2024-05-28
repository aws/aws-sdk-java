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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The farm ID of the farm to remove from the fleet.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The fleet ID of the fleet to delete.
     * </p>
     */
    private String fleetId;

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @return The unique token which the server uses to recognize retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The farm ID of the farm to remove from the fleet.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to remove from the fleet.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to remove from the fleet.
     * </p>
     * 
     * @return The farm ID of the farm to remove from the fleet.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to remove from the fleet.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to remove from the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The fleet ID of the fleet to delete.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID of the fleet to delete.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The fleet ID of the fleet to delete.
     * </p>
     * 
     * @return The fleet ID of the fleet to delete.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The fleet ID of the fleet to delete.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID of the fleet to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFleetRequest == false)
            return false;
        DeleteFleetRequest other = (DeleteFleetRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFleetRequest clone() {
        return (DeleteFleetRequest) super.clone();
    }

}
