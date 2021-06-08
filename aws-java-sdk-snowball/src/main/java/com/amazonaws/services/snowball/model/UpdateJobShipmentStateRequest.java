/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/UpdateJobShipmentState" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobShipmentStateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The job ID of the job whose shipment date you want to update, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The state of a device when it is being shipped.
     * </p>
     * <p>
     * Set to <code>RECEIVED</code> when the device arrives at your location.
     * </p>
     * <p>
     * Set to <code>RETURNED</code> when you have returned the device to AWS.
     * </p>
     */
    private String shipmentState;

    /**
     * <p>
     * The job ID of the job whose shipment date you want to update, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param jobId
     *        The job ID of the job whose shipment date you want to update, for example
     *        <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID of the job whose shipment date you want to update, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @return The job ID of the job whose shipment date you want to update, for example
     *         <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID of the job whose shipment date you want to update, for example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param jobId
     *        The job ID of the job whose shipment date you want to update, for example
     *        <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobShipmentStateRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The state of a device when it is being shipped.
     * </p>
     * <p>
     * Set to <code>RECEIVED</code> when the device arrives at your location.
     * </p>
     * <p>
     * Set to <code>RETURNED</code> when you have returned the device to AWS.
     * </p>
     * 
     * @param shipmentState
     *        The state of a device when it is being shipped. </p>
     *        <p>
     *        Set to <code>RECEIVED</code> when the device arrives at your location.
     *        </p>
     *        <p>
     *        Set to <code>RETURNED</code> when you have returned the device to AWS.
     * @see ShipmentState
     */

    public void setShipmentState(String shipmentState) {
        this.shipmentState = shipmentState;
    }

    /**
     * <p>
     * The state of a device when it is being shipped.
     * </p>
     * <p>
     * Set to <code>RECEIVED</code> when the device arrives at your location.
     * </p>
     * <p>
     * Set to <code>RETURNED</code> when you have returned the device to AWS.
     * </p>
     * 
     * @return The state of a device when it is being shipped. </p>
     *         <p>
     *         Set to <code>RECEIVED</code> when the device arrives at your location.
     *         </p>
     *         <p>
     *         Set to <code>RETURNED</code> when you have returned the device to AWS.
     * @see ShipmentState
     */

    public String getShipmentState() {
        return this.shipmentState;
    }

    /**
     * <p>
     * The state of a device when it is being shipped.
     * </p>
     * <p>
     * Set to <code>RECEIVED</code> when the device arrives at your location.
     * </p>
     * <p>
     * Set to <code>RETURNED</code> when you have returned the device to AWS.
     * </p>
     * 
     * @param shipmentState
     *        The state of a device when it is being shipped. </p>
     *        <p>
     *        Set to <code>RECEIVED</code> when the device arrives at your location.
     *        </p>
     *        <p>
     *        Set to <code>RETURNED</code> when you have returned the device to AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShipmentState
     */

    public UpdateJobShipmentStateRequest withShipmentState(String shipmentState) {
        setShipmentState(shipmentState);
        return this;
    }

    /**
     * <p>
     * The state of a device when it is being shipped.
     * </p>
     * <p>
     * Set to <code>RECEIVED</code> when the device arrives at your location.
     * </p>
     * <p>
     * Set to <code>RETURNED</code> when you have returned the device to AWS.
     * </p>
     * 
     * @param shipmentState
     *        The state of a device when it is being shipped. </p>
     *        <p>
     *        Set to <code>RECEIVED</code> when the device arrives at your location.
     *        </p>
     *        <p>
     *        Set to <code>RETURNED</code> when you have returned the device to AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShipmentState
     */

    public UpdateJobShipmentStateRequest withShipmentState(ShipmentState shipmentState) {
        this.shipmentState = shipmentState.toString();
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getShipmentState() != null)
            sb.append("ShipmentState: ").append(getShipmentState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobShipmentStateRequest == false)
            return false;
        UpdateJobShipmentStateRequest other = (UpdateJobShipmentStateRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getShipmentState() == null ^ this.getShipmentState() == null)
            return false;
        if (other.getShipmentState() != null && other.getShipmentState().equals(this.getShipmentState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getShipmentState() == null) ? 0 : getShipmentState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobShipmentStateRequest clone() {
        return (UpdateJobShipmentStateRequest) super.clone();
    }

}
