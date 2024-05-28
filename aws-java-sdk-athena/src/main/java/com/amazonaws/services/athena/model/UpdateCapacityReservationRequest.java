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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateCapacityReservation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCapacityReservationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The new number of requested data processing units.
     * </p>
     */
    private Integer targetDpus;
    /**
     * <p>
     * The name of the capacity reservation.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The new number of requested data processing units.
     * </p>
     * 
     * @param targetDpus
     *        The new number of requested data processing units.
     */

    public void setTargetDpus(Integer targetDpus) {
        this.targetDpus = targetDpus;
    }

    /**
     * <p>
     * The new number of requested data processing units.
     * </p>
     * 
     * @return The new number of requested data processing units.
     */

    public Integer getTargetDpus() {
        return this.targetDpus;
    }

    /**
     * <p>
     * The new number of requested data processing units.
     * </p>
     * 
     * @param targetDpus
     *        The new number of requested data processing units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCapacityReservationRequest withTargetDpus(Integer targetDpus) {
        setTargetDpus(targetDpus);
        return this;
    }

    /**
     * <p>
     * The name of the capacity reservation.
     * </p>
     * 
     * @param name
     *        The name of the capacity reservation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the capacity reservation.
     * </p>
     * 
     * @return The name of the capacity reservation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the capacity reservation.
     * </p>
     * 
     * @param name
     *        The name of the capacity reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCapacityReservationRequest withName(String name) {
        setName(name);
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
        if (getTargetDpus() != null)
            sb.append("TargetDpus: ").append(getTargetDpus()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCapacityReservationRequest == false)
            return false;
        UpdateCapacityReservationRequest other = (UpdateCapacityReservationRequest) obj;
        if (other.getTargetDpus() == null ^ this.getTargetDpus() == null)
            return false;
        if (other.getTargetDpus() != null && other.getTargetDpus().equals(this.getTargetDpus()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetDpus() == null) ? 0 : getTargetDpus().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCapacityReservationRequest clone() {
        return (UpdateCapacityReservationRequest) super.clone();
    }

}
