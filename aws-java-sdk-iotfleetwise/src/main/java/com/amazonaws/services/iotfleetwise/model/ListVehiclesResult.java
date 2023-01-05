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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListVehicles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVehiclesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of vehicles and information about them.
     * </p>
     */
    private java.util.List<VehicleSummary> vehicleSummaries;
    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of vehicles and information about them.
     * </p>
     * 
     * @return A list of vehicles and information about them.
     */

    public java.util.List<VehicleSummary> getVehicleSummaries() {
        return vehicleSummaries;
    }

    /**
     * <p>
     * A list of vehicles and information about them.
     * </p>
     * 
     * @param vehicleSummaries
     *        A list of vehicles and information about them.
     */

    public void setVehicleSummaries(java.util.Collection<VehicleSummary> vehicleSummaries) {
        if (vehicleSummaries == null) {
            this.vehicleSummaries = null;
            return;
        }

        this.vehicleSummaries = new java.util.ArrayList<VehicleSummary>(vehicleSummaries);
    }

    /**
     * <p>
     * A list of vehicles and information about them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVehicleSummaries(java.util.Collection)} or {@link #withVehicleSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param vehicleSummaries
     *        A list of vehicles and information about them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVehiclesResult withVehicleSummaries(VehicleSummary... vehicleSummaries) {
        if (this.vehicleSummaries == null) {
            setVehicleSummaries(new java.util.ArrayList<VehicleSummary>(vehicleSummaries.length));
        }
        for (VehicleSummary ele : vehicleSummaries) {
            this.vehicleSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of vehicles and information about them.
     * </p>
     * 
     * @param vehicleSummaries
     *        A list of vehicles and information about them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVehiclesResult withVehicleSummaries(java.util.Collection<VehicleSummary> vehicleSummaries) {
        setVehicleSummaries(vehicleSummaries);
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

    public ListVehiclesResult withNextToken(String nextToken) {
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
        if (getVehicleSummaries() != null)
            sb.append("VehicleSummaries: ").append(getVehicleSummaries()).append(",");
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

        if (obj instanceof ListVehiclesResult == false)
            return false;
        ListVehiclesResult other = (ListVehiclesResult) obj;
        if (other.getVehicleSummaries() == null ^ this.getVehicleSummaries() == null)
            return false;
        if (other.getVehicleSummaries() != null && other.getVehicleSummaries().equals(this.getVehicleSummaries()) == false)
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

        hashCode = prime * hashCode + ((getVehicleSummaries() == null) ? 0 : getVehicleSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVehiclesResult clone() {
        try {
            return (ListVehiclesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
