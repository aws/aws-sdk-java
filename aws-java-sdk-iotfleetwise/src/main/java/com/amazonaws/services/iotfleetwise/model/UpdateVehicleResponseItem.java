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
 * Information about the updated vehicle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateVehicleResponseItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVehicleResponseItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the updated vehicle.
     * </p>
     */
    private String vehicleName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated vehicle.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The unique ID of the updated vehicle.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the updated vehicle.
     */

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     * <p>
     * The unique ID of the updated vehicle.
     * </p>
     * 
     * @return The unique ID of the updated vehicle.
     */

    public String getVehicleName() {
        return this.vehicleName;
    }

    /**
     * <p>
     * The unique ID of the updated vehicle.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the updated vehicle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVehicleResponseItem withVehicleName(String vehicleName) {
        setVehicleName(vehicleName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated vehicle.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the updated vehicle.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated vehicle.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the updated vehicle.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated vehicle.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the updated vehicle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVehicleResponseItem withArn(String arn) {
        setArn(arn);
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
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVehicleResponseItem == false)
            return false;
        UpdateVehicleResponseItem other = (UpdateVehicleResponseItem) obj;
        if (other.getVehicleName() == null ^ this.getVehicleName() == null)
            return false;
        if (other.getVehicleName() != null && other.getVehicleName().equals(this.getVehicleName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVehicleName() == null) ? 0 : getVehicleName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVehicleResponseItem clone() {
        try {
            return (UpdateVehicleResponseItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.UpdateVehicleResponseItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
