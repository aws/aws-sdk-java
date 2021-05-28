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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CalculateRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculateRouteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the route calculator resource that you want to use to calculate a route.
     * </p>
     */
    private String calculatorName;
    /**
     * <p>
     * Specifies route preferences when traveling by <code>Car</code>, such as avoiding routes that use ferries or
     * tolls.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as <code>Car</code>.
     * </p>
     */
    private CalculateRouteCarModeOptions carModeOptions;
    /**
     * <p>
     * Sets the time of departure as the current time. Uses the current time to calculate a route. Otherwise, the best
     * time of day to travel with the best traffic conditions is used to calculate the route.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     */
    private Boolean departNow;
    /**
     * <p>
     * The start position for the route. Defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     * 84</a> format: <code>[longitude, latitude]</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[-123.115, 49.285]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a departure that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     */
    private java.util.List<Double> departurePosition;
    /**
     * <p>
     * Specifies the desired time of departure. Uses the given time to calculate a route. Otherwise, the best time of
     * day to travel with the best traffic conditions is used to calculate the route.
     * </p>
     * <note>
     * <p>
     * Setting a departure time in the past returns a <code>400 ValidationException</code> error.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date departureTime;
    /**
     * <p>
     * The finish position for the route. Defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     * 84</a> format: <code>[longitude, latitude]</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[-122.339, 47.615]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a destination that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     */
    private java.util.List<Double> destinationPosition;
    /**
     * <p>
     * Set the unit system to specify the distance.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     */
    private String distanceUnit;
    /**
     * <p>
     * Set to include the geometry details in the result for each path between a pair of positions.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     */
    private Boolean includeLegGeometry;
    /**
     * <p>
     * Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road
     * compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify determines how you specify route preferences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If traveling by <code>Car</code> use the <code>CarModeOptions</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If traveling by <code>Truck</code> use the <code>TruckModeOptions</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default Value: <code>Car</code>
     * </p>
     */
    private String travelMode;
    /**
     * <p>
     * Specifies route preferences when traveling by <code>Truck</code>, such as avoiding routes that use ferries or
     * tolls, and truck specifications to consider when choosing an optimal road.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as <code>Truck</code>.
     * </p>
     */
    private CalculateRouteTruckModeOptions truckModeOptions;
    /**
     * <p>
     * Specifies an ordered list of up to 23 intermediate positions to include along a route between the departure
     * position and destination position.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, from the <code>DeparturePosition</code> <code>[-123.115, 49.285]</code>, the route follows the order
     * that the waypoint positions are given <code>[[-122.757, 49.0021],[-122.349, 47.620]]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a waypoint position that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * <p>
     * Specifying more than 23 waypoints returns a <code>400 ValidationException</code> error.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     */
    private java.util.List<java.util.List<Double>> waypointPositions;

    /**
     * <p>
     * The name of the route calculator resource that you want to use to calculate a route.
     * </p>
     * 
     * @param calculatorName
     *        The name of the route calculator resource that you want to use to calculate a route.
     */

    public void setCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource that you want to use to calculate a route.
     * </p>
     * 
     * @return The name of the route calculator resource that you want to use to calculate a route.
     */

    public String getCalculatorName() {
        return this.calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource that you want to use to calculate a route.
     * </p>
     * 
     * @param calculatorName
     *        The name of the route calculator resource that you want to use to calculate a route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteRequest withCalculatorName(String calculatorName) {
        setCalculatorName(calculatorName);
        return this;
    }

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Car</code>, such as avoiding routes that use ferries or
     * tolls.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as <code>Car</code>.
     * </p>
     * 
     * @param carModeOptions
     *        Specifies route preferences when traveling by <code>Car</code>, such as avoiding routes that use ferries
     *        or tolls.</p>
     *        <p>
     *        Requirements: <code>TravelMode</code> must be specified as <code>Car</code>.
     */

    public void setCarModeOptions(CalculateRouteCarModeOptions carModeOptions) {
        this.carModeOptions = carModeOptions;
    }

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Car</code>, such as avoiding routes that use ferries or
     * tolls.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as <code>Car</code>.
     * </p>
     * 
     * @return Specifies route preferences when traveling by <code>Car</code>, such as avoiding routes that use ferries
     *         or tolls.</p>
     *         <p>
     *         Requirements: <code>TravelMode</code> must be specified as <code>Car</code>.
     */

    public CalculateRouteCarModeOptions getCarModeOptions() {
        return this.carModeOptions;
    }

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Car</code>, such as avoiding routes that use ferries or
     * tolls.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as <code>Car</code>.
     * </p>
     * 
     * @param carModeOptions
     *        Specifies route preferences when traveling by <code>Car</code>, such as avoiding routes that use ferries
     *        or tolls.</p>
     *        <p>
     *        Requirements: <code>TravelMode</code> must be specified as <code>Car</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteRequest withCarModeOptions(CalculateRouteCarModeOptions carModeOptions) {
        setCarModeOptions(carModeOptions);
        return this;
    }

    /**
     * <p>
     * Sets the time of departure as the current time. Uses the current time to calculate a route. Otherwise, the best
     * time of day to travel with the best traffic conditions is used to calculate the route.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @param departNow
     *        Sets the time of departure as the current time. Uses the current time to calculate a route. Otherwise, the
     *        best time of day to travel with the best traffic conditions is used to calculate the route.</p>
     *        <p>
     *        Default Value: <code>false</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>false</code> | <code>true</code>
     */

    public void setDepartNow(Boolean departNow) {
        this.departNow = departNow;
    }

    /**
     * <p>
     * Sets the time of departure as the current time. Uses the current time to calculate a route. Otherwise, the best
     * time of day to travel with the best traffic conditions is used to calculate the route.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @return Sets the time of departure as the current time. Uses the current time to calculate a route. Otherwise,
     *         the best time of day to travel with the best traffic conditions is used to calculate the route.</p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     */

    public Boolean getDepartNow() {
        return this.departNow;
    }

    /**
     * <p>
     * Sets the time of departure as the current time. Uses the current time to calculate a route. Otherwise, the best
     * time of day to travel with the best traffic conditions is used to calculate the route.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @param departNow
     *        Sets the time of departure as the current time. Uses the current time to calculate a route. Otherwise, the
     *        best time of day to travel with the best traffic conditions is used to calculate the route.</p>
     *        <p>
     *        Default Value: <code>false</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>false</code> | <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteRequest withDepartNow(Boolean departNow) {
        setDepartNow(departNow);
        return this;
    }

    /**
     * <p>
     * Sets the time of departure as the current time. Uses the current time to calculate a route. Otherwise, the best
     * time of day to travel with the best traffic conditions is used to calculate the route.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @return Sets the time of departure as the current time. Uses the current time to calculate a route. Otherwise,
     *         the best time of day to travel with the best traffic conditions is used to calculate the route.</p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     */

    public Boolean isDepartNow() {
        return this.departNow;
    }

    /**
     * <p>
     * The start position for the route. Defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     * 84</a> format: <code>[longitude, latitude]</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[-123.115, 49.285]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a departure that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @return The start position for the route. Defined in <a
     *         href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *         <code>[longitude, latitude]</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>[-123.115, 49.285]</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         If you specify a departure that's not located on a road, Amazon Location <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *         >moves the position to the nearest road</a>.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>[-180 to 180,-90 to 90]</code>
     */

    public java.util.List<Double> getDeparturePosition() {
        return departurePosition;
    }

    /**
     * <p>
     * The start position for the route. Defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     * 84</a> format: <code>[longitude, latitude]</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[-123.115, 49.285]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a departure that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @param departurePosition
     *        The start position for the route. Defined in <a
     *        href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *        <code>[longitude, latitude]</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>[-123.115, 49.285]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you specify a departure that's not located on a road, Amazon Location <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *        >moves the position to the nearest road</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     */

    public void setDeparturePosition(java.util.Collection<Double> departurePosition) {
        if (departurePosition == null) {
            this.departurePosition = null;
            return;
        }

        this.departurePosition = new java.util.ArrayList<Double>(departurePosition);
    }

    /**
     * <p>
     * The start position for the route. Defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     * 84</a> format: <code>[longitude, latitude]</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[-123.115, 49.285]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a departure that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeparturePosition(java.util.Collection)} or {@link #withDeparturePosition(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param departurePosition
     *        The start position for the route. Defined in <a
     *        href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *        <code>[longitude, latitude]</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>[-123.115, 49.285]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you specify a departure that's not located on a road, Amazon Location <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *        >moves the position to the nearest road</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteRequest withDeparturePosition(Double... departurePosition) {
        if (this.departurePosition == null) {
            setDeparturePosition(new java.util.ArrayList<Double>(departurePosition.length));
        }
        for (Double ele : departurePosition) {
            this.departurePosition.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The start position for the route. Defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     * 84</a> format: <code>[longitude, latitude]</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[-123.115, 49.285]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a departure that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @param departurePosition
     *        The start position for the route. Defined in <a
     *        href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *        <code>[longitude, latitude]</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>[-123.115, 49.285]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you specify a departure that's not located on a road, Amazon Location <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *        >moves the position to the nearest road</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteRequest withDeparturePosition(java.util.Collection<Double> departurePosition) {
        setDeparturePosition(departurePosition);
        return this;
    }

    /**
     * <p>
     * Specifies the desired time of departure. Uses the given time to calculate a route. Otherwise, the best time of
     * day to travel with the best traffic conditions is used to calculate the route.
     * </p>
     * <note>
     * <p>
     * Setting a departure time in the past returns a <code>400 ValidationException</code> error.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param departureTime
     *        Specifies the desired time of departure. Uses the given time to calculate a route. Otherwise, the best
     *        time of day to travel with the best traffic conditions is used to calculate the route.</p> <note>
     *        <p>
     *        Setting a departure time in the past returns a <code>400 ValidationException</code> error.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        In <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     *        </p>
     *        </li>
     */

    public void setDepartureTime(java.util.Date departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * <p>
     * Specifies the desired time of departure. Uses the given time to calculate a route. Otherwise, the best time of
     * day to travel with the best traffic conditions is used to calculate the route.
     * </p>
     * <note>
     * <p>
     * Setting a departure time in the past returns a <code>400 ValidationException</code> error.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the desired time of departure. Uses the given time to calculate a route. Otherwise, the best
     *         time of day to travel with the best traffic conditions is used to calculate the route.</p> <note>
     *         <p>
     *         Setting a departure time in the past returns a <code>400 ValidationException</code> error.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         In <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     *         </p>
     *         </li>
     */

    public java.util.Date getDepartureTime() {
        return this.departureTime;
    }

    /**
     * <p>
     * Specifies the desired time of departure. Uses the given time to calculate a route. Otherwise, the best time of
     * day to travel with the best traffic conditions is used to calculate the route.
     * </p>
     * <note>
     * <p>
     * Setting a departure time in the past returns a <code>400 ValidationException</code> error.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param departureTime
     *        Specifies the desired time of departure. Uses the given time to calculate a route. Otherwise, the best
     *        time of day to travel with the best traffic conditions is used to calculate the route.</p> <note>
     *        <p>
     *        Setting a departure time in the past returns a <code>400 ValidationException</code> error.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        In <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteRequest withDepartureTime(java.util.Date departureTime) {
        setDepartureTime(departureTime);
        return this;
    }

    /**
     * <p>
     * The finish position for the route. Defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     * 84</a> format: <code>[longitude, latitude]</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[-122.339, 47.615]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a destination that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @return The finish position for the route. Defined in <a
     *         href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *         <code>[longitude, latitude]</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>[-122.339, 47.615]</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         If you specify a destination that's not located on a road, Amazon Location <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *         >moves the position to the nearest road</a>.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>[-180 to 180,-90 to 90]</code>
     */

    public java.util.List<Double> getDestinationPosition() {
        return destinationPosition;
    }

    /**
     * <p>
     * The finish position for the route. Defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     * 84</a> format: <code>[longitude, latitude]</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[-122.339, 47.615]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a destination that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @param destinationPosition
     *        The finish position for the route. Defined in <a
     *        href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *        <code>[longitude, latitude]</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>[-122.339, 47.615]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you specify a destination that's not located on a road, Amazon Location <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *        >moves the position to the nearest road</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     */

    public void setDestinationPosition(java.util.Collection<Double> destinationPosition) {
        if (destinationPosition == null) {
            this.destinationPosition = null;
            return;
        }

        this.destinationPosition = new java.util.ArrayList<Double>(destinationPosition);
    }

    /**
     * <p>
     * The finish position for the route. Defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     * 84</a> format: <code>[longitude, latitude]</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[-122.339, 47.615]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a destination that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationPosition(java.util.Collection)} or {@link #withDestinationPosition(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param destinationPosition
     *        The finish position for the route. Defined in <a
     *        href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *        <code>[longitude, latitude]</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>[-122.339, 47.615]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you specify a destination that's not located on a road, Amazon Location <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *        >moves the position to the nearest road</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteRequest withDestinationPosition(Double... destinationPosition) {
        if (this.destinationPosition == null) {
            setDestinationPosition(new java.util.ArrayList<Double>(destinationPosition.length));
        }
        for (Double ele : destinationPosition) {
            this.destinationPosition.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The finish position for the route. Defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     * 84</a> format: <code>[longitude, latitude]</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[-122.339, 47.615]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a destination that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @param destinationPosition
     *        The finish position for the route. Defined in <a
     *        href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *        <code>[longitude, latitude]</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>[-122.339, 47.615]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you specify a destination that's not located on a road, Amazon Location <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *        >moves the position to the nearest road</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteRequest withDestinationPosition(java.util.Collection<Double> destinationPosition) {
        setDestinationPosition(destinationPosition);
        return this;
    }

    /**
     * <p>
     * Set the unit system to specify the distance.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * 
     * @param distanceUnit
     *        Set the unit system to specify the distance.</p>
     *        <p>
     *        Default Value: <code>Kilometers</code>
     * @see DistanceUnit
     */

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * Set the unit system to specify the distance.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * 
     * @return Set the unit system to specify the distance.</p>
     *         <p>
     *         Default Value: <code>Kilometers</code>
     * @see DistanceUnit
     */

    public String getDistanceUnit() {
        return this.distanceUnit;
    }

    /**
     * <p>
     * Set the unit system to specify the distance.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * 
     * @param distanceUnit
     *        Set the unit system to specify the distance.</p>
     *        <p>
     *        Default Value: <code>Kilometers</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistanceUnit
     */

    public CalculateRouteRequest withDistanceUnit(String distanceUnit) {
        setDistanceUnit(distanceUnit);
        return this;
    }

    /**
     * <p>
     * Set the unit system to specify the distance.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * 
     * @param distanceUnit
     *        Set the unit system to specify the distance.</p>
     *        <p>
     *        Default Value: <code>Kilometers</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistanceUnit
     */

    public CalculateRouteRequest withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * Set to include the geometry details in the result for each path between a pair of positions.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @param includeLegGeometry
     *        Set to include the geometry details in the result for each path between a pair of positions.</p>
     *        <p>
     *        Default Value: <code>false</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>false</code> | <code>true</code>
     */

    public void setIncludeLegGeometry(Boolean includeLegGeometry) {
        this.includeLegGeometry = includeLegGeometry;
    }

    /**
     * <p>
     * Set to include the geometry details in the result for each path between a pair of positions.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @return Set to include the geometry details in the result for each path between a pair of positions.</p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     */

    public Boolean getIncludeLegGeometry() {
        return this.includeLegGeometry;
    }

    /**
     * <p>
     * Set to include the geometry details in the result for each path between a pair of positions.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @param includeLegGeometry
     *        Set to include the geometry details in the result for each path between a pair of positions.</p>
     *        <p>
     *        Default Value: <code>false</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>false</code> | <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteRequest withIncludeLegGeometry(Boolean includeLegGeometry) {
        setIncludeLegGeometry(includeLegGeometry);
        return this;
    }

    /**
     * <p>
     * Set to include the geometry details in the result for each path between a pair of positions.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @return Set to include the geometry details in the result for each path between a pair of positions.</p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     */

    public Boolean isIncludeLegGeometry() {
        return this.includeLegGeometry;
    }

    /**
     * <p>
     * Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road
     * compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify determines how you specify route preferences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If traveling by <code>Car</code> use the <code>CarModeOptions</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If traveling by <code>Truck</code> use the <code>TruckModeOptions</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default Value: <code>Car</code>
     * </p>
     * 
     * @param travelMode
     *        Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road
     *        compatibility.</p>
     *        <p>
     *        The <code>TravelMode</code> you specify determines how you specify route preferences:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If traveling by <code>Car</code> use the <code>CarModeOptions</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If traveling by <code>Truck</code> use the <code>TruckModeOptions</code> parameter.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default Value: <code>Car</code>
     * @see TravelMode
     */

    public void setTravelMode(String travelMode) {
        this.travelMode = travelMode;
    }

    /**
     * <p>
     * Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road
     * compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify determines how you specify route preferences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If traveling by <code>Car</code> use the <code>CarModeOptions</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If traveling by <code>Truck</code> use the <code>TruckModeOptions</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default Value: <code>Car</code>
     * </p>
     * 
     * @return Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road
     *         compatibility.</p>
     *         <p>
     *         The <code>TravelMode</code> you specify determines how you specify route preferences:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If traveling by <code>Car</code> use the <code>CarModeOptions</code> parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If traveling by <code>Truck</code> use the <code>TruckModeOptions</code> parameter.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default Value: <code>Car</code>
     * @see TravelMode
     */

    public String getTravelMode() {
        return this.travelMode;
    }

    /**
     * <p>
     * Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road
     * compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify determines how you specify route preferences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If traveling by <code>Car</code> use the <code>CarModeOptions</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If traveling by <code>Truck</code> use the <code>TruckModeOptions</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default Value: <code>Car</code>
     * </p>
     * 
     * @param travelMode
     *        Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road
     *        compatibility.</p>
     *        <p>
     *        The <code>TravelMode</code> you specify determines how you specify route preferences:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If traveling by <code>Car</code> use the <code>CarModeOptions</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If traveling by <code>Truck</code> use the <code>TruckModeOptions</code> parameter.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default Value: <code>Car</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TravelMode
     */

    public CalculateRouteRequest withTravelMode(String travelMode) {
        setTravelMode(travelMode);
        return this;
    }

    /**
     * <p>
     * Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road
     * compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify determines how you specify route preferences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If traveling by <code>Car</code> use the <code>CarModeOptions</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If traveling by <code>Truck</code> use the <code>TruckModeOptions</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default Value: <code>Car</code>
     * </p>
     * 
     * @param travelMode
     *        Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road
     *        compatibility.</p>
     *        <p>
     *        The <code>TravelMode</code> you specify determines how you specify route preferences:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If traveling by <code>Car</code> use the <code>CarModeOptions</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If traveling by <code>Truck</code> use the <code>TruckModeOptions</code> parameter.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default Value: <code>Car</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TravelMode
     */

    public CalculateRouteRequest withTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Truck</code>, such as avoiding routes that use ferries or
     * tolls, and truck specifications to consider when choosing an optimal road.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as <code>Truck</code>.
     * </p>
     * 
     * @param truckModeOptions
     *        Specifies route preferences when traveling by <code>Truck</code>, such as avoiding routes that use ferries
     *        or tolls, and truck specifications to consider when choosing an optimal road.</p>
     *        <p>
     *        Requirements: <code>TravelMode</code> must be specified as <code>Truck</code>.
     */

    public void setTruckModeOptions(CalculateRouteTruckModeOptions truckModeOptions) {
        this.truckModeOptions = truckModeOptions;
    }

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Truck</code>, such as avoiding routes that use ferries or
     * tolls, and truck specifications to consider when choosing an optimal road.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as <code>Truck</code>.
     * </p>
     * 
     * @return Specifies route preferences when traveling by <code>Truck</code>, such as avoiding routes that use
     *         ferries or tolls, and truck specifications to consider when choosing an optimal road.</p>
     *         <p>
     *         Requirements: <code>TravelMode</code> must be specified as <code>Truck</code>.
     */

    public CalculateRouteTruckModeOptions getTruckModeOptions() {
        return this.truckModeOptions;
    }

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Truck</code>, such as avoiding routes that use ferries or
     * tolls, and truck specifications to consider when choosing an optimal road.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as <code>Truck</code>.
     * </p>
     * 
     * @param truckModeOptions
     *        Specifies route preferences when traveling by <code>Truck</code>, such as avoiding routes that use ferries
     *        or tolls, and truck specifications to consider when choosing an optimal road.</p>
     *        <p>
     *        Requirements: <code>TravelMode</code> must be specified as <code>Truck</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteRequest withTruckModeOptions(CalculateRouteTruckModeOptions truckModeOptions) {
        setTruckModeOptions(truckModeOptions);
        return this;
    }

    /**
     * <p>
     * Specifies an ordered list of up to 23 intermediate positions to include along a route between the departure
     * position and destination position.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, from the <code>DeparturePosition</code> <code>[-123.115, 49.285]</code>, the route follows the order
     * that the waypoint positions are given <code>[[-122.757, 49.0021],[-122.349, 47.620]]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a waypoint position that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * <p>
     * Specifying more than 23 waypoints returns a <code>400 ValidationException</code> error.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @return Specifies an ordered list of up to 23 intermediate positions to include along a route between the
     *         departure position and destination position. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, from the <code>DeparturePosition</code> <code>[-123.115, 49.285]</code>, the route follows
     *         the order that the waypoint positions are given <code>[[-122.757, 49.0021],[-122.349, 47.620]]</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         If you specify a waypoint position that's not located on a road, Amazon Location <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *         >moves the position to the nearest road</a>.
     *         </p>
     *         <p>
     *         Specifying more than 23 waypoints returns a <code>400 ValidationException</code> error.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>[-180 to 180,-90 to 90]</code>
     */

    public java.util.List<java.util.List<Double>> getWaypointPositions() {
        return waypointPositions;
    }

    /**
     * <p>
     * Specifies an ordered list of up to 23 intermediate positions to include along a route between the departure
     * position and destination position.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, from the <code>DeparturePosition</code> <code>[-123.115, 49.285]</code>, the route follows the order
     * that the waypoint positions are given <code>[[-122.757, 49.0021],[-122.349, 47.620]]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a waypoint position that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * <p>
     * Specifying more than 23 waypoints returns a <code>400 ValidationException</code> error.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @param waypointPositions
     *        Specifies an ordered list of up to 23 intermediate positions to include along a route between the
     *        departure position and destination position. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, from the <code>DeparturePosition</code> <code>[-123.115, 49.285]</code>, the route follows
     *        the order that the waypoint positions are given <code>[[-122.757, 49.0021],[-122.349, 47.620]]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you specify a waypoint position that's not located on a road, Amazon Location <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *        >moves the position to the nearest road</a>.
     *        </p>
     *        <p>
     *        Specifying more than 23 waypoints returns a <code>400 ValidationException</code> error.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     */

    public void setWaypointPositions(java.util.Collection<java.util.List<Double>> waypointPositions) {
        if (waypointPositions == null) {
            this.waypointPositions = null;
            return;
        }

        this.waypointPositions = new java.util.ArrayList<java.util.List<Double>>(waypointPositions);
    }

    /**
     * <p>
     * Specifies an ordered list of up to 23 intermediate positions to include along a route between the departure
     * position and destination position.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, from the <code>DeparturePosition</code> <code>[-123.115, 49.285]</code>, the route follows the order
     * that the waypoint positions are given <code>[[-122.757, 49.0021],[-122.349, 47.620]]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a waypoint position that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * <p>
     * Specifying more than 23 waypoints returns a <code>400 ValidationException</code> error.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWaypointPositions(java.util.Collection)} or {@link #withWaypointPositions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param waypointPositions
     *        Specifies an ordered list of up to 23 intermediate positions to include along a route between the
     *        departure position and destination position. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, from the <code>DeparturePosition</code> <code>[-123.115, 49.285]</code>, the route follows
     *        the order that the waypoint positions are given <code>[[-122.757, 49.0021],[-122.349, 47.620]]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you specify a waypoint position that's not located on a road, Amazon Location <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *        >moves the position to the nearest road</a>.
     *        </p>
     *        <p>
     *        Specifying more than 23 waypoints returns a <code>400 ValidationException</code> error.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteRequest withWaypointPositions(java.util.List<Double>... waypointPositions) {
        if (this.waypointPositions == null) {
            setWaypointPositions(new java.util.ArrayList<java.util.List<Double>>(waypointPositions.length));
        }
        for (java.util.List<Double> ele : waypointPositions) {
            this.waypointPositions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies an ordered list of up to 23 intermediate positions to include along a route between the departure
     * position and destination position.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, from the <code>DeparturePosition</code> <code>[-123.115, 49.285]</code>, the route follows the order
     * that the waypoint positions are given <code>[[-122.757, 49.0021],[-122.349, 47.620]]</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify a waypoint position that's not located on a road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road">moves
     * the position to the nearest road</a>.
     * </p>
     * <p>
     * Specifying more than 23 waypoints returns a <code>400 ValidationException</code> error.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @param waypointPositions
     *        Specifies an ordered list of up to 23 intermediate positions to include along a route between the
     *        departure position and destination position. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, from the <code>DeparturePosition</code> <code>[-123.115, 49.285]</code>, the route follows
     *        the order that the waypoint positions are given <code>[[-122.757, 49.0021],[-122.349, 47.620]]</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you specify a waypoint position that's not located on a road, Amazon Location <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *        >moves the position to the nearest road</a>.
     *        </p>
     *        <p>
     *        Specifying more than 23 waypoints returns a <code>400 ValidationException</code> error.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteRequest withWaypointPositions(java.util.Collection<java.util.List<Double>> waypointPositions) {
        setWaypointPositions(waypointPositions);
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
        if (getCalculatorName() != null)
            sb.append("CalculatorName: ").append(getCalculatorName()).append(",");
        if (getCarModeOptions() != null)
            sb.append("CarModeOptions: ").append(getCarModeOptions()).append(",");
        if (getDepartNow() != null)
            sb.append("DepartNow: ").append(getDepartNow()).append(",");
        if (getDeparturePosition() != null)
            sb.append("DeparturePosition: ").append("***Sensitive Data Redacted***").append(",");
        if (getDepartureTime() != null)
            sb.append("DepartureTime: ").append(getDepartureTime()).append(",");
        if (getDestinationPosition() != null)
            sb.append("DestinationPosition: ").append("***Sensitive Data Redacted***").append(",");
        if (getDistanceUnit() != null)
            sb.append("DistanceUnit: ").append(getDistanceUnit()).append(",");
        if (getIncludeLegGeometry() != null)
            sb.append("IncludeLegGeometry: ").append(getIncludeLegGeometry()).append(",");
        if (getTravelMode() != null)
            sb.append("TravelMode: ").append(getTravelMode()).append(",");
        if (getTruckModeOptions() != null)
            sb.append("TruckModeOptions: ").append(getTruckModeOptions()).append(",");
        if (getWaypointPositions() != null)
            sb.append("WaypointPositions: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculateRouteRequest == false)
            return false;
        CalculateRouteRequest other = (CalculateRouteRequest) obj;
        if (other.getCalculatorName() == null ^ this.getCalculatorName() == null)
            return false;
        if (other.getCalculatorName() != null && other.getCalculatorName().equals(this.getCalculatorName()) == false)
            return false;
        if (other.getCarModeOptions() == null ^ this.getCarModeOptions() == null)
            return false;
        if (other.getCarModeOptions() != null && other.getCarModeOptions().equals(this.getCarModeOptions()) == false)
            return false;
        if (other.getDepartNow() == null ^ this.getDepartNow() == null)
            return false;
        if (other.getDepartNow() != null && other.getDepartNow().equals(this.getDepartNow()) == false)
            return false;
        if (other.getDeparturePosition() == null ^ this.getDeparturePosition() == null)
            return false;
        if (other.getDeparturePosition() != null && other.getDeparturePosition().equals(this.getDeparturePosition()) == false)
            return false;
        if (other.getDepartureTime() == null ^ this.getDepartureTime() == null)
            return false;
        if (other.getDepartureTime() != null && other.getDepartureTime().equals(this.getDepartureTime()) == false)
            return false;
        if (other.getDestinationPosition() == null ^ this.getDestinationPosition() == null)
            return false;
        if (other.getDestinationPosition() != null && other.getDestinationPosition().equals(this.getDestinationPosition()) == false)
            return false;
        if (other.getDistanceUnit() == null ^ this.getDistanceUnit() == null)
            return false;
        if (other.getDistanceUnit() != null && other.getDistanceUnit().equals(this.getDistanceUnit()) == false)
            return false;
        if (other.getIncludeLegGeometry() == null ^ this.getIncludeLegGeometry() == null)
            return false;
        if (other.getIncludeLegGeometry() != null && other.getIncludeLegGeometry().equals(this.getIncludeLegGeometry()) == false)
            return false;
        if (other.getTravelMode() == null ^ this.getTravelMode() == null)
            return false;
        if (other.getTravelMode() != null && other.getTravelMode().equals(this.getTravelMode()) == false)
            return false;
        if (other.getTruckModeOptions() == null ^ this.getTruckModeOptions() == null)
            return false;
        if (other.getTruckModeOptions() != null && other.getTruckModeOptions().equals(this.getTruckModeOptions()) == false)
            return false;
        if (other.getWaypointPositions() == null ^ this.getWaypointPositions() == null)
            return false;
        if (other.getWaypointPositions() != null && other.getWaypointPositions().equals(this.getWaypointPositions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCalculatorName() == null) ? 0 : getCalculatorName().hashCode());
        hashCode = prime * hashCode + ((getCarModeOptions() == null) ? 0 : getCarModeOptions().hashCode());
        hashCode = prime * hashCode + ((getDepartNow() == null) ? 0 : getDepartNow().hashCode());
        hashCode = prime * hashCode + ((getDeparturePosition() == null) ? 0 : getDeparturePosition().hashCode());
        hashCode = prime * hashCode + ((getDepartureTime() == null) ? 0 : getDepartureTime().hashCode());
        hashCode = prime * hashCode + ((getDestinationPosition() == null) ? 0 : getDestinationPosition().hashCode());
        hashCode = prime * hashCode + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode + ((getIncludeLegGeometry() == null) ? 0 : getIncludeLegGeometry().hashCode());
        hashCode = prime * hashCode + ((getTravelMode() == null) ? 0 : getTravelMode().hashCode());
        hashCode = prime * hashCode + ((getTruckModeOptions() == null) ? 0 : getTruckModeOptions().hashCode());
        hashCode = prime * hashCode + ((getWaypointPositions() == null) ? 0 : getWaypointPositions().hashCode());
        return hashCode;
    }

    @Override
    public CalculateRouteRequest clone() {
        return (CalculateRouteRequest) super.clone();
    }

}
