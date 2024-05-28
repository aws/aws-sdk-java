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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueueFleetAssociation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueueFleetAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The farm ID of the farm that contains the queue-fleet association.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The fleet ID for the queue-fleet association.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The queue ID for the queue-fleet association.
     * </p>
     */
    private String queueId;

    /**
     * <p>
     * The farm ID of the farm that contains the queue-fleet association.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm that contains the queue-fleet association.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the farm that contains the queue-fleet association.
     * </p>
     * 
     * @return The farm ID of the farm that contains the queue-fleet association.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the farm that contains the queue-fleet association.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm that contains the queue-fleet association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueFleetAssociationRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The fleet ID for the queue-fleet association.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID for the queue-fleet association.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The fleet ID for the queue-fleet association.
     * </p>
     * 
     * @return The fleet ID for the queue-fleet association.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The fleet ID for the queue-fleet association.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID for the queue-fleet association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueFleetAssociationRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The queue ID for the queue-fleet association.
     * </p>
     * 
     * @param queueId
     *        The queue ID for the queue-fleet association.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID for the queue-fleet association.
     * </p>
     * 
     * @return The queue ID for the queue-fleet association.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID for the queue-fleet association.
     * </p>
     * 
     * @param queueId
     *        The queue ID for the queue-fleet association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueFleetAssociationRequest withQueueId(String queueId) {
        setQueueId(queueId);
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
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueueFleetAssociationRequest == false)
            return false;
        GetQueueFleetAssociationRequest other = (GetQueueFleetAssociationRequest) obj;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        return hashCode;
    }

    @Override
    public GetQueueFleetAssociationRequest clone() {
        return (GetQueueFleetAssociationRequest) super.clone();
    }

}
