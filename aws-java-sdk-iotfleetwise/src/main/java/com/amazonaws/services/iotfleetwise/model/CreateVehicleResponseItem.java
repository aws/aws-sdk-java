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
 * Information about a created vehicle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateVehicleResponseItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVehicleResponseItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the vehicle to create.
     * </p>
     */
    private String vehicleName;
    /**
     * <p>
     * The ARN of the created vehicle.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ARN of a created or validated Amazon Web Services IoT thing.
     * </p>
     */
    private String thingArn;

    /**
     * <p>
     * The unique ID of the vehicle to create.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the vehicle to create.
     */

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     * <p>
     * The unique ID of the vehicle to create.
     * </p>
     * 
     * @return The unique ID of the vehicle to create.
     */

    public String getVehicleName() {
        return this.vehicleName;
    }

    /**
     * <p>
     * The unique ID of the vehicle to create.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the vehicle to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVehicleResponseItem withVehicleName(String vehicleName) {
        setVehicleName(vehicleName);
        return this;
    }

    /**
     * <p>
     * The ARN of the created vehicle.
     * </p>
     * 
     * @param arn
     *        The ARN of the created vehicle.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the created vehicle.
     * </p>
     * 
     * @return The ARN of the created vehicle.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the created vehicle.
     * </p>
     * 
     * @param arn
     *        The ARN of the created vehicle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVehicleResponseItem withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ARN of a created or validated Amazon Web Services IoT thing.
     * </p>
     * 
     * @param thingArn
     *        The ARN of a created or validated Amazon Web Services IoT thing.
     */

    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The ARN of a created or validated Amazon Web Services IoT thing.
     * </p>
     * 
     * @return The ARN of a created or validated Amazon Web Services IoT thing.
     */

    public String getThingArn() {
        return this.thingArn;
    }

    /**
     * <p>
     * The ARN of a created or validated Amazon Web Services IoT thing.
     * </p>
     * 
     * @param thingArn
     *        The ARN of a created or validated Amazon Web Services IoT thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVehicleResponseItem withThingArn(String thingArn) {
        setThingArn(thingArn);
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
        if (getVehicleName() != null)
            sb.append("VehicleName: ").append(getVehicleName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getThingArn() != null)
            sb.append("ThingArn: ").append(getThingArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVehicleResponseItem == false)
            return false;
        CreateVehicleResponseItem other = (CreateVehicleResponseItem) obj;
        if (other.getVehicleName() == null ^ this.getVehicleName() == null)
            return false;
        if (other.getVehicleName() != null && other.getVehicleName().equals(this.getVehicleName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVehicleName() == null) ? 0 : getVehicleName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateVehicleResponseItem clone() {
        try {
            return (CreateVehicleResponseItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.CreateVehicleResponseItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
