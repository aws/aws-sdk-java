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
 * An HTTP error resulting from updating the description for a vehicle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateVehicleError" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVehicleError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the vehicle with the error.
     * </p>
     */
    private String vehicleName;
    /**
     * <p>
     * The relevant HTTP error code (400+).
     * </p>
     */
    private Integer code;
    /**
     * <p>
     * A message associated with the error.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The ID of the vehicle with the error.
     * </p>
     * 
     * @param vehicleName
     *        The ID of the vehicle with the error.
     */

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     * <p>
     * The ID of the vehicle with the error.
     * </p>
     * 
     * @return The ID of the vehicle with the error.
     */

    public String getVehicleName() {
        return this.vehicleName;
    }

    /**
     * <p>
     * The ID of the vehicle with the error.
     * </p>
     * 
     * @param vehicleName
     *        The ID of the vehicle with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVehicleError withVehicleName(String vehicleName) {
        setVehicleName(vehicleName);
        return this;
    }

    /**
     * <p>
     * The relevant HTTP error code (400+).
     * </p>
     * 
     * @param code
     *        The relevant HTTP error code (400+).
     */

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * <p>
     * The relevant HTTP error code (400+).
     * </p>
     * 
     * @return The relevant HTTP error code (400+).
     */

    public Integer getCode() {
        return this.code;
    }

    /**
     * <p>
     * The relevant HTTP error code (400+).
     * </p>
     * 
     * @param code
     *        The relevant HTTP error code (400+).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVehicleError withCode(Integer code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A message associated with the error.
     * </p>
     * 
     * @param message
     *        A message associated with the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message associated with the error.
     * </p>
     * 
     * @return A message associated with the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message associated with the error.
     * </p>
     * 
     * @param message
     *        A message associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVehicleError withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVehicleError == false)
            return false;
        UpdateVehicleError other = (UpdateVehicleError) obj;
        if (other.getVehicleName() == null ^ this.getVehicleName() == null)
            return false;
        if (other.getVehicleName() != null && other.getVehicleName().equals(this.getVehicleName()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVehicleName() == null) ? 0 : getVehicleName().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVehicleError clone() {
        try {
            return (UpdateVehicleError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.UpdateVehicleErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
