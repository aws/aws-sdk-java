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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListVehiclesInFleet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVehiclesInFleetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of vehicles associated with the fleet.
     * </p>
     */
    private java.util.List<String> vehicles;
    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of vehicles associated with the fleet.
     * </p>
     * 
     * @return A list of vehicles associated with the fleet.
     */

    public java.util.List<String> getVehicles() {
        return vehicles;
    }

    /**
     * <p>
     * A list of vehicles associated with the fleet.
     * </p>
     * 
     * @param vehicles
     *        A list of vehicles associated with the fleet.
     */

    public void setVehicles(java.util.Collection<String> vehicles) {
        if (vehicles == null) {
            this.vehicles = null;
            return;
        }

        this.vehicles = new java.util.ArrayList<String>(vehicles);
    }

    /**
     * <p>
     * A list of vehicles associated with the fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVehicles(java.util.Collection)} or {@link #withVehicles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param vehicles
     *        A list of vehicles associated with the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVehiclesInFleetResult withVehicles(String... vehicles) {
        if (this.vehicles == null) {
            setVehicles(new java.util.ArrayList<String>(vehicles.length));
        }
        for (String ele : vehicles) {
            this.vehicles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of vehicles associated with the fleet.
     * </p>
     * 
     * @param vehicles
     *        A list of vehicles associated with the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVehiclesInFleetResult withVehicles(java.util.Collection<String> vehicles) {
        setVehicles(vehicles);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVehiclesInFleetResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVehiclesInFleetResult == false)
            return false;
        ListVehiclesInFleetResult other = (ListVehiclesInFleetResult) obj;
        if (other.getVehicles() == null ^ this.getVehicles() == null)
            return false;
        if (other.getVehicles() != null && other.getVehicles().equals(this.getVehicles()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVehicles() == null) ? 0 : getVehicles().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVehiclesInFleetResult clone() {
        try {
            return (ListVehiclesInFleetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
