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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result for the calculated route of one <code>DeparturePosition</code> <code>DestinationPosition</code> pair.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/RouteMatrixEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteMatrixEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total distance of travel for the route.
     * </p>
     */
    private Double distance;
    /**
     * <p>
     * The expected duration of travel for the route.
     * </p>
     */
    private Double durationSeconds;
    /**
     * <p>
     * An error corresponding to the calculation of a route between the <code>DeparturePosition</code> and
     * <code>DestinationPosition</code>.
     * </p>
     */
    private RouteMatrixEntryError error;

    /**
     * <p>
     * The total distance of travel for the route.
     * </p>
     * 
     * @param distance
     *        The total distance of travel for the route.
     */

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * <p>
     * The total distance of travel for the route.
     * </p>
     * 
     * @return The total distance of travel for the route.
     */

    public Double getDistance() {
        return this.distance;
    }

    /**
     * <p>
     * The total distance of travel for the route.
     * </p>
     * 
     * @param distance
     *        The total distance of travel for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteMatrixEntry withDistance(Double distance) {
        setDistance(distance);
        return this;
    }

    /**
     * <p>
     * The expected duration of travel for the route.
     * </p>
     * 
     * @param durationSeconds
     *        The expected duration of travel for the route.
     */

    public void setDurationSeconds(Double durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The expected duration of travel for the route.
     * </p>
     * 
     * @return The expected duration of travel for the route.
     */

    public Double getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The expected duration of travel for the route.
     * </p>
     * 
     * @param durationSeconds
     *        The expected duration of travel for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteMatrixEntry withDurationSeconds(Double durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * An error corresponding to the calculation of a route between the <code>DeparturePosition</code> and
     * <code>DestinationPosition</code>.
     * </p>
     * 
     * @param error
     *        An error corresponding to the calculation of a route between the <code>DeparturePosition</code> and
     *        <code>DestinationPosition</code>.
     */

    public void setError(RouteMatrixEntryError error) {
        this.error = error;
    }

    /**
     * <p>
     * An error corresponding to the calculation of a route between the <code>DeparturePosition</code> and
     * <code>DestinationPosition</code>.
     * </p>
     * 
     * @return An error corresponding to the calculation of a route between the <code>DeparturePosition</code> and
     *         <code>DestinationPosition</code>.
     */

    public RouteMatrixEntryError getError() {
        return this.error;
    }

    /**
     * <p>
     * An error corresponding to the calculation of a route between the <code>DeparturePosition</code> and
     * <code>DestinationPosition</code>.
     * </p>
     * 
     * @param error
     *        An error corresponding to the calculation of a route between the <code>DeparturePosition</code> and
     *        <code>DestinationPosition</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteMatrixEntry withError(RouteMatrixEntryError error) {
        setError(error);
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
        if (getDistance() != null)
            sb.append("Distance: ").append(getDistance()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteMatrixEntry == false)
            return false;
        RouteMatrixEntry other = (RouteMatrixEntry) obj;
        if (other.getDistance() == null ^ this.getDistance() == null)
            return false;
        if (other.getDistance() != null && other.getDistance().equals(this.getDistance()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistance() == null) ? 0 : getDistance().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public RouteMatrixEntry clone() {
        try {
            return (RouteMatrixEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.RouteMatrixEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
