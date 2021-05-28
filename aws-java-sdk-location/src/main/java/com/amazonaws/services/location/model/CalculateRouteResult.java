/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Returns the result of the route calculation. Metadata includes legs and route summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CalculateRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculateRouteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains details about each path between a pair of positions included along a route such as:
     * <code>StartPosition</code>, <code>EndPosition</code>, <code>Distance</code>, <code>DurationSeconds</code>,
     * <code>Geometry</code>, and <code>Steps</code>. The number of legs returned corresponds to one less than the total
     * number of positions in the request.
     * </p>
     * <p>
     * For example, a route with a departure position and destination position returns one leg with the positions <a
     * href
     * ="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">snapped to
     * a nearby road</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>StartPosition</code> is the departure position.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A route with a waypoint between the departure and destination position returns two legs with the positions
     * snapped to a nearby road.:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Leg 1: The <code>StartPosition</code> is the departure position . The <code>EndPosition</code> is the waypoint
     * positon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Leg 2: The <code>StartPosition</code> is the waypoint position. The <code>EndPosition</code> is the destination
     * position.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Leg> legs;
    /**
     * <p>
     * Contains information about the whole route, such as: <code>RouteBBox</code>, <code>DataSource</code>,
     * <code>Distance</code>, <code>DistanceUnit</code>, and <code>DurationSeconds</code>
     * </p>
     */
    private CalculateRouteSummary summary;

    /**
     * <p>
     * Contains details about each path between a pair of positions included along a route such as:
     * <code>StartPosition</code>, <code>EndPosition</code>, <code>Distance</code>, <code>DurationSeconds</code>,
     * <code>Geometry</code>, and <code>Steps</code>. The number of legs returned corresponds to one less than the total
     * number of positions in the request.
     * </p>
     * <p>
     * For example, a route with a departure position and destination position returns one leg with the positions <a
     * href
     * ="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">snapped to
     * a nearby road</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>StartPosition</code> is the departure position.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A route with a waypoint between the departure and destination position returns two legs with the positions
     * snapped to a nearby road.:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Leg 1: The <code>StartPosition</code> is the departure position . The <code>EndPosition</code> is the waypoint
     * positon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Leg 2: The <code>StartPosition</code> is the waypoint position. The <code>EndPosition</code> is the destination
     * position.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Contains details about each path between a pair of positions included along a route such as:
     *         <code>StartPosition</code>, <code>EndPosition</code>, <code>Distance</code>, <code>DurationSeconds</code>
     *         , <code>Geometry</code>, and <code>Steps</code>. The number of legs returned corresponds to one less than
     *         the total number of positions in the request. </p>
     *         <p>
     *         For example, a route with a departure position and destination position returns one leg with the
     *         positions <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *         >snapped to a nearby road</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>StartPosition</code> is the departure position.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>EndPosition</code> is the destination position.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         A route with a waypoint between the departure and destination position returns two legs with the
     *         positions snapped to a nearby road.:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Leg 1: The <code>StartPosition</code> is the departure position . The <code>EndPosition</code> is the
     *         waypoint positon.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Leg 2: The <code>StartPosition</code> is the waypoint position. The <code>EndPosition</code> is the
     *         destination position.
     *         </p>
     *         </li>
     */

    public java.util.List<Leg> getLegs() {
        return legs;
    }

    /**
     * <p>
     * Contains details about each path between a pair of positions included along a route such as:
     * <code>StartPosition</code>, <code>EndPosition</code>, <code>Distance</code>, <code>DurationSeconds</code>,
     * <code>Geometry</code>, and <code>Steps</code>. The number of legs returned corresponds to one less than the total
     * number of positions in the request.
     * </p>
     * <p>
     * For example, a route with a departure position and destination position returns one leg with the positions <a
     * href
     * ="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">snapped to
     * a nearby road</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>StartPosition</code> is the departure position.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A route with a waypoint between the departure and destination position returns two legs with the positions
     * snapped to a nearby road.:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Leg 1: The <code>StartPosition</code> is the departure position . The <code>EndPosition</code> is the waypoint
     * positon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Leg 2: The <code>StartPosition</code> is the waypoint position. The <code>EndPosition</code> is the destination
     * position.
     * </p>
     * </li>
     * </ul>
     * 
     * @param legs
     *        Contains details about each path between a pair of positions included along a route such as:
     *        <code>StartPosition</code>, <code>EndPosition</code>, <code>Distance</code>, <code>DurationSeconds</code>,
     *        <code>Geometry</code>, and <code>Steps</code>. The number of legs returned corresponds to one less than
     *        the total number of positions in the request. </p>
     *        <p>
     *        For example, a route with a departure position and destination position returns one leg with the positions
     *        <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *        >snapped to a nearby road</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>StartPosition</code> is the departure position.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>EndPosition</code> is the destination position.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        A route with a waypoint between the departure and destination position returns two legs with the positions
     *        snapped to a nearby road.:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Leg 1: The <code>StartPosition</code> is the departure position . The <code>EndPosition</code> is the
     *        waypoint positon.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Leg 2: The <code>StartPosition</code> is the waypoint position. The <code>EndPosition</code> is the
     *        destination position.
     *        </p>
     *        </li>
     */

    public void setLegs(java.util.Collection<Leg> legs) {
        if (legs == null) {
            this.legs = null;
            return;
        }

        this.legs = new java.util.ArrayList<Leg>(legs);
    }

    /**
     * <p>
     * Contains details about each path between a pair of positions included along a route such as:
     * <code>StartPosition</code>, <code>EndPosition</code>, <code>Distance</code>, <code>DurationSeconds</code>,
     * <code>Geometry</code>, and <code>Steps</code>. The number of legs returned corresponds to one less than the total
     * number of positions in the request.
     * </p>
     * <p>
     * For example, a route with a departure position and destination position returns one leg with the positions <a
     * href
     * ="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">snapped to
     * a nearby road</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>StartPosition</code> is the departure position.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A route with a waypoint between the departure and destination position returns two legs with the positions
     * snapped to a nearby road.:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Leg 1: The <code>StartPosition</code> is the departure position . The <code>EndPosition</code> is the waypoint
     * positon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Leg 2: The <code>StartPosition</code> is the waypoint position. The <code>EndPosition</code> is the destination
     * position.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLegs(java.util.Collection)} or {@link #withLegs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param legs
     *        Contains details about each path between a pair of positions included along a route such as:
     *        <code>StartPosition</code>, <code>EndPosition</code>, <code>Distance</code>, <code>DurationSeconds</code>,
     *        <code>Geometry</code>, and <code>Steps</code>. The number of legs returned corresponds to one less than
     *        the total number of positions in the request. </p>
     *        <p>
     *        For example, a route with a departure position and destination position returns one leg with the positions
     *        <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *        >snapped to a nearby road</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>StartPosition</code> is the departure position.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>EndPosition</code> is the destination position.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        A route with a waypoint between the departure and destination position returns two legs with the positions
     *        snapped to a nearby road.:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Leg 1: The <code>StartPosition</code> is the departure position . The <code>EndPosition</code> is the
     *        waypoint positon.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Leg 2: The <code>StartPosition</code> is the waypoint position. The <code>EndPosition</code> is the
     *        destination position.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteResult withLegs(Leg... legs) {
        if (this.legs == null) {
            setLegs(new java.util.ArrayList<Leg>(legs.length));
        }
        for (Leg ele : legs) {
            this.legs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains details about each path between a pair of positions included along a route such as:
     * <code>StartPosition</code>, <code>EndPosition</code>, <code>Distance</code>, <code>DurationSeconds</code>,
     * <code>Geometry</code>, and <code>Steps</code>. The number of legs returned corresponds to one less than the total
     * number of positions in the request.
     * </p>
     * <p>
     * For example, a route with a departure position and destination position returns one leg with the positions <a
     * href
     * ="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">snapped to
     * a nearby road</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>StartPosition</code> is the departure position.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A route with a waypoint between the departure and destination position returns two legs with the positions
     * snapped to a nearby road.:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Leg 1: The <code>StartPosition</code> is the departure position . The <code>EndPosition</code> is the waypoint
     * positon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Leg 2: The <code>StartPosition</code> is the waypoint position. The <code>EndPosition</code> is the destination
     * position.
     * </p>
     * </li>
     * </ul>
     * 
     * @param legs
     *        Contains details about each path between a pair of positions included along a route such as:
     *        <code>StartPosition</code>, <code>EndPosition</code>, <code>Distance</code>, <code>DurationSeconds</code>,
     *        <code>Geometry</code>, and <code>Steps</code>. The number of legs returned corresponds to one less than
     *        the total number of positions in the request. </p>
     *        <p>
     *        For example, a route with a departure position and destination position returns one leg with the positions
     *        <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *        >snapped to a nearby road</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>StartPosition</code> is the departure position.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>EndPosition</code> is the destination position.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        A route with a waypoint between the departure and destination position returns two legs with the positions
     *        snapped to a nearby road.:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Leg 1: The <code>StartPosition</code> is the departure position . The <code>EndPosition</code> is the
     *        waypoint positon.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Leg 2: The <code>StartPosition</code> is the waypoint position. The <code>EndPosition</code> is the
     *        destination position.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteResult withLegs(java.util.Collection<Leg> legs) {
        setLegs(legs);
        return this;
    }

    /**
     * <p>
     * Contains information about the whole route, such as: <code>RouteBBox</code>, <code>DataSource</code>,
     * <code>Distance</code>, <code>DistanceUnit</code>, and <code>DurationSeconds</code>
     * </p>
     * 
     * @param summary
     *        Contains information about the whole route, such as: <code>RouteBBox</code>, <code>DataSource</code>,
     *        <code>Distance</code>, <code>DistanceUnit</code>, and <code>DurationSeconds</code>
     */

    public void setSummary(CalculateRouteSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Contains information about the whole route, such as: <code>RouteBBox</code>, <code>DataSource</code>,
     * <code>Distance</code>, <code>DistanceUnit</code>, and <code>DurationSeconds</code>
     * </p>
     * 
     * @return Contains information about the whole route, such as: <code>RouteBBox</code>, <code>DataSource</code>,
     *         <code>Distance</code>, <code>DistanceUnit</code>, and <code>DurationSeconds</code>
     */

    public CalculateRouteSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * Contains information about the whole route, such as: <code>RouteBBox</code>, <code>DataSource</code>,
     * <code>Distance</code>, <code>DistanceUnit</code>, and <code>DurationSeconds</code>
     * </p>
     * 
     * @param summary
     *        Contains information about the whole route, such as: <code>RouteBBox</code>, <code>DataSource</code>,
     *        <code>Distance</code>, <code>DistanceUnit</code>, and <code>DurationSeconds</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteResult withSummary(CalculateRouteSummary summary) {
        setSummary(summary);
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
        if (getLegs() != null)
            sb.append("Legs: ").append(getLegs()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculateRouteResult == false)
            return false;
        CalculateRouteResult other = (CalculateRouteResult) obj;
        if (other.getLegs() == null ^ this.getLegs() == null)
            return false;
        if (other.getLegs() != null && other.getLegs().equals(this.getLegs()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLegs() == null) ? 0 : getLegs().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public CalculateRouteResult clone() {
        try {
            return (CalculateRouteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
