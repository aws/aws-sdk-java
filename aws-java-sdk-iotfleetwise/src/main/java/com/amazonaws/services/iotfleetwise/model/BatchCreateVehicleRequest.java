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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/BatchCreateVehicle" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateVehicleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of information about each vehicle to create. For more information, see the API data type.
     * </p>
     */
    private java.util.List<CreateVehicleRequestItem> vehicles;

    /**
     * <p>
     * A list of information about each vehicle to create. For more information, see the API data type.
     * </p>
     * 
     * @return A list of information about each vehicle to create. For more information, see the API data type.
     */

    public java.util.List<CreateVehicleRequestItem> getVehicles() {
        return vehicles;
    }

    /**
     * <p>
     * A list of information about each vehicle to create. For more information, see the API data type.
     * </p>
     * 
     * @param vehicles
     *        A list of information about each vehicle to create. For more information, see the API data type.
     */

    public void setVehicles(java.util.Collection<CreateVehicleRequestItem> vehicles) {
        if (vehicles == null) {
            this.vehicles = null;
            return;
        }

        this.vehicles = new java.util.ArrayList<CreateVehicleRequestItem>(vehicles);
    }

    /**
     * <p>
     * A list of information about each vehicle to create. For more information, see the API data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVehicles(java.util.Collection)} or {@link #withVehicles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param vehicles
     *        A list of information about each vehicle to create. For more information, see the API data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateVehicleRequest withVehicles(CreateVehicleRequestItem... vehicles) {
        if (this.vehicles == null) {
            setVehicles(new java.util.ArrayList<CreateVehicleRequestItem>(vehicles.length));
        }
        for (CreateVehicleRequestItem ele : vehicles) {
            this.vehicles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information about each vehicle to create. For more information, see the API data type.
     * </p>
     * 
     * @param vehicles
     *        A list of information about each vehicle to create. For more information, see the API data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateVehicleRequest withVehicles(java.util.Collection<CreateVehicleRequestItem> vehicles) {
        setVehicles(vehicles);
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
        if (getVehicles() != null)
            sb.append("Vehicles: ").append(getVehicles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateVehicleRequest == false)
            return false;
        BatchCreateVehicleRequest other = (BatchCreateVehicleRequest) obj;
        if (other.getVehicles() == null ^ this.getVehicles() == null)
            return false;
        if (other.getVehicles() != null && other.getVehicles().equals(this.getVehicles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVehicles() == null) ? 0 : getVehicles().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateVehicleRequest clone() {
        return (BatchCreateVehicleRequest) super.clone();
    }

}
