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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the calculated route.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CalculateRouteSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculateRouteSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data provider of traffic and road network data used to calculate the route. Indicates one of the available
     * providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon Location
     * Service data providers</a>.
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * The total distance covered by the route. The sum of the distance travelled between every stop on the route.
     * </p>
     * <note>
     * <p>
     * The route <code>distance</code> can't be greater than 250 km. If the route exceeds 250 km, the response returns a
     * <code>400 RoutesValidationException</code> error.
     * </p>
     * </note>
     */
    private Double distance;
    /**
     * <p>
     * The unit of measurement for the distance.
     * </p>
     */
    private String distanceUnit;
    /**
     * <p>
     * The total travel time for the route measured in seconds. The sum of the travel time between every stop on the
     * route.
     * </p>
     */
    private Double durationSeconds;
    /**
     * <p>
     * Specifies a geographical box surrounding a route. Used to zoom into a route when displaying it in a map. For
     * example, <code>[min x, min y, max x, max y]</code>
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The next 2 <code>bbox</code> parameters describe the upper northeast corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Double> routeBBox;

    /**
     * <p>
     * The data provider of traffic and road network data used to calculate the route. Indicates one of the available
     * providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon Location
     * Service data providers</a>.
     * </p>
     * 
     * @param dataSource
     *        The data provider of traffic and road network data used to calculate the route. Indicates one of the
     *        available providers:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Esri</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Here</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about data providers, see <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon
     *        Location Service data providers</a>.
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data provider of traffic and road network data used to calculate the route. Indicates one of the available
     * providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon Location
     * Service data providers</a>.
     * </p>
     * 
     * @return The data provider of traffic and road network data used to calculate the route. Indicates one of the
     *         available providers:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Esri</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Here</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about data providers, see <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon
     *         Location Service data providers</a>.
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The data provider of traffic and road network data used to calculate the route. Indicates one of the available
     * providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon Location
     * Service data providers</a>.
     * </p>
     * 
     * @param dataSource
     *        The data provider of traffic and road network data used to calculate the route. Indicates one of the
     *        available providers:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Esri</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Here</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about data providers, see <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon
     *        Location Service data providers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteSummary withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The total distance covered by the route. The sum of the distance travelled between every stop on the route.
     * </p>
     * <note>
     * <p>
     * The route <code>distance</code> can't be greater than 250 km. If the route exceeds 250 km, the response returns a
     * <code>400 RoutesValidationException</code> error.
     * </p>
     * </note>
     * 
     * @param distance
     *        The total distance covered by the route. The sum of the distance travelled between every stop on the
     *        route.</p> <note>
     *        <p>
     *        The route <code>distance</code> can't be greater than 250 km. If the route exceeds 250 km, the response
     *        returns a <code>400 RoutesValidationException</code> error.
     *        </p>
     */

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * <p>
     * The total distance covered by the route. The sum of the distance travelled between every stop on the route.
     * </p>
     * <note>
     * <p>
     * The route <code>distance</code> can't be greater than 250 km. If the route exceeds 250 km, the response returns a
     * <code>400 RoutesValidationException</code> error.
     * </p>
     * </note>
     * 
     * @return The total distance covered by the route. The sum of the distance travelled between every stop on the
     *         route.</p> <note>
     *         <p>
     *         The route <code>distance</code> can't be greater than 250 km. If the route exceeds 250 km, the response
     *         returns a <code>400 RoutesValidationException</code> error.
     *         </p>
     */

    public Double getDistance() {
        return this.distance;
    }

    /**
     * <p>
     * The total distance covered by the route. The sum of the distance travelled between every stop on the route.
     * </p>
     * <note>
     * <p>
     * The route <code>distance</code> can't be greater than 250 km. If the route exceeds 250 km, the response returns a
     * <code>400 RoutesValidationException</code> error.
     * </p>
     * </note>
     * 
     * @param distance
     *        The total distance covered by the route. The sum of the distance travelled between every stop on the
     *        route.</p> <note>
     *        <p>
     *        The route <code>distance</code> can't be greater than 250 km. If the route exceeds 250 km, the response
     *        returns a <code>400 RoutesValidationException</code> error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteSummary withDistance(Double distance) {
        setDistance(distance);
        return this;
    }

    /**
     * <p>
     * The unit of measurement for the distance.
     * </p>
     * 
     * @param distanceUnit
     *        The unit of measurement for the distance.
     * @see DistanceUnit
     */

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * The unit of measurement for the distance.
     * </p>
     * 
     * @return The unit of measurement for the distance.
     * @see DistanceUnit
     */

    public String getDistanceUnit() {
        return this.distanceUnit;
    }

    /**
     * <p>
     * The unit of measurement for the distance.
     * </p>
     * 
     * @param distanceUnit
     *        The unit of measurement for the distance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistanceUnit
     */

    public CalculateRouteSummary withDistanceUnit(String distanceUnit) {
        setDistanceUnit(distanceUnit);
        return this;
    }

    /**
     * <p>
     * The unit of measurement for the distance.
     * </p>
     * 
     * @param distanceUnit
     *        The unit of measurement for the distance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistanceUnit
     */

    public CalculateRouteSummary withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * The total travel time for the route measured in seconds. The sum of the travel time between every stop on the
     * route.
     * </p>
     * 
     * @param durationSeconds
     *        The total travel time for the route measured in seconds. The sum of the travel time between every stop on
     *        the route.
     */

    public void setDurationSeconds(Double durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The total travel time for the route measured in seconds. The sum of the travel time between every stop on the
     * route.
     * </p>
     * 
     * @return The total travel time for the route measured in seconds. The sum of the travel time between every stop on
     *         the route.
     */

    public Double getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The total travel time for the route measured in seconds. The sum of the travel time between every stop on the
     * route.
     * </p>
     * 
     * @param durationSeconds
     *        The total travel time for the route measured in seconds. The sum of the travel time between every stop on
     *        the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteSummary withDurationSeconds(Double durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * Specifies a geographical box surrounding a route. Used to zoom into a route when displaying it in a map. For
     * example, <code>[min x, min y, max x, max y]</code>
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The next 2 <code>bbox</code> parameters describe the upper northeast corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies a geographical box surrounding a route. Used to zoom into a route when displaying it in a map.
     *         For example, <code>[min x, min y, max x, max y]</code> </p>
     *         <p>
     *         The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The next 2 <code>bbox</code> parameters describe the upper northeast corner:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     *         </p>
     *         </li>
     */

    public java.util.List<Double> getRouteBBox() {
        return routeBBox;
    }

    /**
     * <p>
     * Specifies a geographical box surrounding a route. Used to zoom into a route when displaying it in a map. For
     * example, <code>[min x, min y, max x, max y]</code>
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The next 2 <code>bbox</code> parameters describe the upper northeast corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * 
     * @param routeBBox
     *        Specifies a geographical box surrounding a route. Used to zoom into a route when displaying it in a map.
     *        For example, <code>[min x, min y, max x, max y]</code> </p>
     *        <p>
     *        The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The next 2 <code>bbox</code> parameters describe the upper northeast corner:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     *        </p>
     *        </li>
     */

    public void setRouteBBox(java.util.Collection<Double> routeBBox) {
        if (routeBBox == null) {
            this.routeBBox = null;
            return;
        }

        this.routeBBox = new java.util.ArrayList<Double>(routeBBox);
    }

    /**
     * <p>
     * Specifies a geographical box surrounding a route. Used to zoom into a route when displaying it in a map. For
     * example, <code>[min x, min y, max x, max y]</code>
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The next 2 <code>bbox</code> parameters describe the upper northeast corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteBBox(java.util.Collection)} or {@link #withRouteBBox(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param routeBBox
     *        Specifies a geographical box surrounding a route. Used to zoom into a route when displaying it in a map.
     *        For example, <code>[min x, min y, max x, max y]</code> </p>
     *        <p>
     *        The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The next 2 <code>bbox</code> parameters describe the upper northeast corner:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteSummary withRouteBBox(Double... routeBBox) {
        if (this.routeBBox == null) {
            setRouteBBox(new java.util.ArrayList<Double>(routeBBox.length));
        }
        for (Double ele : routeBBox) {
            this.routeBBox.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a geographical box surrounding a route. Used to zoom into a route when displaying it in a map. For
     * example, <code>[min x, min y, max x, max y]</code>
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The next 2 <code>bbox</code> parameters describe the upper northeast corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * 
     * @param routeBBox
     *        Specifies a geographical box surrounding a route. Used to zoom into a route when displaying it in a map.
     *        For example, <code>[min x, min y, max x, max y]</code> </p>
     *        <p>
     *        The first 2 <code>bbox</code> parameters describe the lower southwest corner:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first <code>bbox</code> position is the X coordinate or longitude of the lower southwest corner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second <code>bbox</code> position is the Y coordinate or latitude of the lower southwest corner.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The next 2 <code>bbox</code> parameters describe the upper northeast corner:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The third <code>bbox</code> position is the X coordinate, or longitude of the upper northeast corner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The fourth <code>bbox</code> position is the Y coordinate, or longitude of the upper northeast corner.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteSummary withRouteBBox(java.util.Collection<Double> routeBBox) {
        setRouteBBox(routeBBox);
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getDistance() != null)
            sb.append("Distance: ").append(getDistance()).append(",");
        if (getDistanceUnit() != null)
            sb.append("DistanceUnit: ").append(getDistanceUnit()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getRouteBBox() != null)
            sb.append("RouteBBox: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculateRouteSummary == false)
            return false;
        CalculateRouteSummary other = (CalculateRouteSummary) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDistance() == null ^ this.getDistance() == null)
            return false;
        if (other.getDistance() != null && other.getDistance().equals(this.getDistance()) == false)
            return false;
        if (other.getDistanceUnit() == null ^ this.getDistanceUnit() == null)
            return false;
        if (other.getDistanceUnit() != null && other.getDistanceUnit().equals(this.getDistanceUnit()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getRouteBBox() == null ^ this.getRouteBBox() == null)
            return false;
        if (other.getRouteBBox() != null && other.getRouteBBox().equals(this.getRouteBBox()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getDistance() == null) ? 0 : getDistance().hashCode());
        hashCode = prime * hashCode + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getRouteBBox() == null) ? 0 : getRouteBBox().hashCode());
        return hashCode;
    }

    @Override
    public CalculateRouteSummary clone() {
        try {
            return (CalculateRouteSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.CalculateRouteSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
