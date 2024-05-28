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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCapacityAssignmentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCapacityAssignmentConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the capacity reservation to retrieve the capacity assignment configuration for.
     * </p>
     */
    private String capacityReservationName;

    /**
     * <p>
     * The name of the capacity reservation to retrieve the capacity assignment configuration for.
     * </p>
     * 
     * @param capacityReservationName
     *        The name of the capacity reservation to retrieve the capacity assignment configuration for.
     */

    public void setCapacityReservationName(String capacityReservationName) {
        this.capacityReservationName = capacityReservationName;
    }

    /**
     * <p>
     * The name of the capacity reservation to retrieve the capacity assignment configuration for.
     * </p>
     * 
     * @return The name of the capacity reservation to retrieve the capacity assignment configuration for.
     */

    public String getCapacityReservationName() {
        return this.capacityReservationName;
    }

    /**
     * <p>
     * The name of the capacity reservation to retrieve the capacity assignment configuration for.
     * </p>
     * 
     * @param capacityReservationName
     *        The name of the capacity reservation to retrieve the capacity assignment configuration for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityAssignmentConfigurationRequest withCapacityReservationName(String capacityReservationName) {
        setCapacityReservationName(capacityReservationName);
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
        if (getCapacityReservationName() != null)
            sb.append("CapacityReservationName: ").append(getCapacityReservationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCapacityAssignmentConfigurationRequest == false)
            return false;
        GetCapacityAssignmentConfigurationRequest other = (GetCapacityAssignmentConfigurationRequest) obj;
        if (other.getCapacityReservationName() == null ^ this.getCapacityReservationName() == null)
            return false;
        if (other.getCapacityReservationName() != null && other.getCapacityReservationName().equals(this.getCapacityReservationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationName() == null) ? 0 : getCapacityReservationName().hashCode());
        return hashCode;
    }

    @Override
    public GetCapacityAssignmentConfigurationRequest clone() {
        return (GetCapacityAssignmentConfigurationRequest) super.clone();
    }

}
