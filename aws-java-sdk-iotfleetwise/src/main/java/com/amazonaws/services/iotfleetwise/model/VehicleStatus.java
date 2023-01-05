/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the state of a vehicle and how it relates to the status of a campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/VehicleStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VehicleStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a campaign.
     * </p>
     */
    private String campaignName;
    /**
     * <p>
     * The unique ID of the vehicle.
     * </p>
     */
    private String vehicleName;
    /**
     * <p>
     * The state of a vehicle, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - Amazon Web Services IoT FleetWise sucessfully created the vehicle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The vehicle is ready to receive a campaign deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - A campaign deployment was delivered to the vehicle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code> - A campaign associated with the vehicle was suspended and data collection was paused.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon Web Services IoT FleetWise is removing a campaign from the vehicle.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The name of a campaign.
     * </p>
     * 
     * @param campaignName
     *        The name of a campaign.
     */

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * <p>
     * The name of a campaign.
     * </p>
     * 
     * @return The name of a campaign.
     */

    public String getCampaignName() {
        return this.campaignName;
    }

    /**
     * <p>
     * The name of a campaign.
     * </p>
     * 
     * @param campaignName
     *        The name of a campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VehicleStatus withCampaignName(String campaignName) {
        setCampaignName(campaignName);
        return this;
    }

    /**
     * <p>
     * The unique ID of the vehicle.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the vehicle.
     */

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     * <p>
     * The unique ID of the vehicle.
     * </p>
     * 
     * @return The unique ID of the vehicle.
     */

    public String getVehicleName() {
        return this.vehicleName;
    }

    /**
     * <p>
     * The unique ID of the vehicle.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the vehicle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VehicleStatus withVehicleName(String vehicleName) {
        setVehicleName(vehicleName);
        return this;
    }

    /**
     * <p>
     * The state of a vehicle, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - Amazon Web Services IoT FleetWise sucessfully created the vehicle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The vehicle is ready to receive a campaign deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - A campaign deployment was delivered to the vehicle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code> - A campaign associated with the vehicle was suspended and data collection was paused.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon Web Services IoT FleetWise is removing a campaign from the vehicle.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The state of a vehicle, which can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - Amazon Web Services IoT FleetWise sucessfully created the vehicle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> - The vehicle is ready to receive a campaign deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> - A campaign deployment was delivered to the vehicle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPENDED</code> - A campaign associated with the vehicle was suspended and data collection was
     *        paused.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon Web Services IoT FleetWise is removing a campaign from the vehicle.
     *        </p>
     *        </li>
     * @see VehicleState
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of a vehicle, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - Amazon Web Services IoT FleetWise sucessfully created the vehicle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The vehicle is ready to receive a campaign deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - A campaign deployment was delivered to the vehicle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code> - A campaign associated with the vehicle was suspended and data collection was paused.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon Web Services IoT FleetWise is removing a campaign from the vehicle.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of a vehicle, which can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATED</code> - Amazon Web Services IoT FleetWise sucessfully created the vehicle.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>READY</code> - The vehicle is ready to receive a campaign deployment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HEALTHY</code> - A campaign deployment was delivered to the vehicle.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUSPENDED</code> - A campaign associated with the vehicle was suspended and data collection was
     *         paused.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - Amazon Web Services IoT FleetWise is removing a campaign from the vehicle.
     *         </p>
     *         </li>
     * @see VehicleState
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of a vehicle, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - Amazon Web Services IoT FleetWise sucessfully created the vehicle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The vehicle is ready to receive a campaign deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - A campaign deployment was delivered to the vehicle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code> - A campaign associated with the vehicle was suspended and data collection was paused.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon Web Services IoT FleetWise is removing a campaign from the vehicle.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The state of a vehicle, which can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - Amazon Web Services IoT FleetWise sucessfully created the vehicle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> - The vehicle is ready to receive a campaign deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> - A campaign deployment was delivered to the vehicle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPENDED</code> - A campaign associated with the vehicle was suspended and data collection was
     *        paused.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon Web Services IoT FleetWise is removing a campaign from the vehicle.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VehicleState
     */

    public VehicleStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of a vehicle, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - Amazon Web Services IoT FleetWise sucessfully created the vehicle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The vehicle is ready to receive a campaign deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - A campaign deployment was delivered to the vehicle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code> - A campaign associated with the vehicle was suspended and data collection was paused.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon Web Services IoT FleetWise is removing a campaign from the vehicle.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The state of a vehicle, which can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - Amazon Web Services IoT FleetWise sucessfully created the vehicle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> - The vehicle is ready to receive a campaign deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> - A campaign deployment was delivered to the vehicle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPENDED</code> - A campaign associated with the vehicle was suspended and data collection was
     *        paused.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon Web Services IoT FleetWise is removing a campaign from the vehicle.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VehicleState
     */

    public VehicleStatus withStatus(VehicleState status) {
        this.status = status.toString();
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
        if (getCampaignName() != null)
            sb.append("CampaignName: ").append(getCampaignName()).append(",");
        if (getVehicleName() != null)
            sb.append("VehicleName: ").append(getVehicleName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VehicleStatus == false)
            return false;
        VehicleStatus other = (VehicleStatus) obj;
        if (other.getCampaignName() == null ^ this.getCampaignName() == null)
            return false;
        if (other.getCampaignName() != null && other.getCampaignName().equals(this.getCampaignName()) == false)
            return false;
        if (other.getVehicleName() == null ^ this.getVehicleName() == null)
            return false;
        if (other.getVehicleName() != null && other.getVehicleName().equals(this.getVehicleName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignName() == null) ? 0 : getCampaignName().hashCode());
        hashCode = prime * hashCode + ((getVehicleName() == null) ? 0 : getVehicleName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public VehicleStatus clone() {
        try {
            return (VehicleStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.VehicleStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
