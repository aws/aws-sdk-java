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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/BatchUpdateVehicle" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateVehicleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of information about the batch of updated vehicles.
     * </p>
     * <note>
     * <p>
     * This list contains only unique IDs for the vehicles that were updated.
     * </p>
     * </note>
     */
    private java.util.List<UpdateVehicleResponseItem> vehicles;
    /**
     * <p>
     * A list of information about errors returned while updating a batch of vehicles, or, if there aren't any errors,
     * an empty list.
     * </p>
     */
    private java.util.List<UpdateVehicleError> errors;

    /**
     * <p>
     * A list of information about the batch of updated vehicles.
     * </p>
     * <note>
     * <p>
     * This list contains only unique IDs for the vehicles that were updated.
     * </p>
     * </note>
     * 
     * @return A list of information about the batch of updated vehicles. </p> <note>
     *         <p>
     *         This list contains only unique IDs for the vehicles that were updated.
     *         </p>
     */

    public java.util.List<UpdateVehicleResponseItem> getVehicles() {
        return vehicles;
    }

    /**
     * <p>
     * A list of information about the batch of updated vehicles.
     * </p>
     * <note>
     * <p>
     * This list contains only unique IDs for the vehicles that were updated.
     * </p>
     * </note>
     * 
     * @param vehicles
     *        A list of information about the batch of updated vehicles. </p> <note>
     *        <p>
     *        This list contains only unique IDs for the vehicles that were updated.
     *        </p>
     */

    public void setVehicles(java.util.Collection<UpdateVehicleResponseItem> vehicles) {
        if (vehicles == null) {
            this.vehicles = null;
            return;
        }

        this.vehicles = new java.util.ArrayList<UpdateVehicleResponseItem>(vehicles);
    }

    /**
     * <p>
     * A list of information about the batch of updated vehicles.
     * </p>
     * <note>
     * <p>
     * This list contains only unique IDs for the vehicles that were updated.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVehicles(java.util.Collection)} or {@link #withVehicles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param vehicles
     *        A list of information about the batch of updated vehicles. </p> <note>
     *        <p>
     *        This list contains only unique IDs for the vehicles that were updated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateVehicleResult withVehicles(UpdateVehicleResponseItem... vehicles) {
        if (this.vehicles == null) {
            setVehicles(new java.util.ArrayList<UpdateVehicleResponseItem>(vehicles.length));
        }
        for (UpdateVehicleResponseItem ele : vehicles) {
            this.vehicles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information about the batch of updated vehicles.
     * </p>
     * <note>
     * <p>
     * This list contains only unique IDs for the vehicles that were updated.
     * </p>
     * </note>
     * 
     * @param vehicles
     *        A list of information about the batch of updated vehicles. </p> <note>
     *        <p>
     *        This list contains only unique IDs for the vehicles that were updated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateVehicleResult withVehicles(java.util.Collection<UpdateVehicleResponseItem> vehicles) {
        setVehicles(vehicles);
        return this;
    }

    /**
     * <p>
     * A list of information about errors returned while updating a batch of vehicles, or, if there aren't any errors,
     * an empty list.
     * </p>
     * 
     * @return A list of information about errors returned while updating a batch of vehicles, or, if there aren't any
     *         errors, an empty list.
     */

    public java.util.List<UpdateVehicleError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of information about errors returned while updating a batch of vehicles, or, if there aren't any errors,
     * an empty list.
     * </p>
     * 
     * @param errors
     *        A list of information about errors returned while updating a batch of vehicles, or, if there aren't any
     *        errors, an empty list.
     */

    public void setErrors(java.util.Collection<UpdateVehicleError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<UpdateVehicleError>(errors);
    }

    /**
     * <p>
     * A list of information about errors returned while updating a batch of vehicles, or, if there aren't any errors,
     * an empty list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of information about errors returned while updating a batch of vehicles, or, if there aren't any
     *        errors, an empty list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateVehicleResult withErrors(UpdateVehicleError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<UpdateVehicleError>(errors.length));
        }
        for (UpdateVehicleError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information about errors returned while updating a batch of vehicles, or, if there aren't any errors,
     * an empty list.
     * </p>
     * 
     * @param errors
     *        A list of information about errors returned while updating a batch of vehicles, or, if there aren't any
     *        errors, an empty list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateVehicleResult withErrors(java.util.Collection<UpdateVehicleError> errors) {
        setErrors(errors);
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
            sb.append("Vehicles: ").append(getVehicles()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateVehicleResult == false)
            return false;
        BatchUpdateVehicleResult other = (BatchUpdateVehicleResult) obj;
        if (other.getVehicles() == null ^ this.getVehicles() == null)
            return false;
        if (other.getVehicles() != null && other.getVehicles().equals(this.getVehicles()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVehicles() == null) ? 0 : getVehicles().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateVehicleResult clone() {
        try {
            return (BatchUpdateVehicleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
