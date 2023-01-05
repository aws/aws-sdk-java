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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CalculateRouteMatrix" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculateRouteMatrixRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the route calculator resource that you want to use to calculate the route matrix.
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
     * Sets the time of departure as the current time. Uses the current time to calculate the route matrix. You can't
     * set both <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of day to travel
     * with the best traffic conditions is used to calculate the route matrix.
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
     * The list of departure (origin) positions for the route matrix. An array of points, each of which is itself a
     * 2-value array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     * <code>[longitude, latitude]</code>. For example, <code>[-123.115, 49.285]</code>.
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource there may be additional restrictions on
     * the inputs you can choose. See <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify a departure that's not located on a
     * road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the position to
     * the nearest road</a>. The snapped value is available in the result in <code>SnappedDeparturePositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     */
    private java.util.List<java.util.List<Double>> departurePositions;
    /**
     * <p>
     * Specifies the desired time of departure. Uses the given time to calculate the route matrix. You can't set both
     * <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of day to travel with the
     * best traffic conditions is used to calculate the route matrix.
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
     * The list of destination positions for the route matrix. An array of points, each of which is itself a 2-value
     * array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     * <code>[longitude, latitude]</code>. For example, <code>[-122.339, 47.615]</code>
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource there may be additional restrictions on
     * the inputs you can choose. See <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify a destination that's not located on a
     * road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the position to
     * the nearest road</a>. The snapped value is available in the result in <code>SnappedDestinationPositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     */
    private java.util.List<java.util.List<Double>> destinationPositions;
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
     * Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road
     * compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify also determines how you specify route preferences:
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
     * The name of the route calculator resource that you want to use to calculate the route matrix.
     * </p>
     * 
     * @param calculatorName
     *        The name of the route calculator resource that you want to use to calculate the route matrix.
     */

    public void setCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource that you want to use to calculate the route matrix.
     * </p>
     * 
     * @return The name of the route calculator resource that you want to use to calculate the route matrix.
     */

    public String getCalculatorName() {
        return this.calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource that you want to use to calculate the route matrix.
     * </p>
     * 
     * @param calculatorName
     *        The name of the route calculator resource that you want to use to calculate the route matrix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixRequest withCalculatorName(String calculatorName) {
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

    public CalculateRouteMatrixRequest withCarModeOptions(CalculateRouteCarModeOptions carModeOptions) {
        setCarModeOptions(carModeOptions);
        return this;
    }

    /**
     * <p>
     * Sets the time of departure as the current time. Uses the current time to calculate the route matrix. You can't
     * set both <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of day to travel
     * with the best traffic conditions is used to calculate the route matrix.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @param departNow
     *        Sets the time of departure as the current time. Uses the current time to calculate the route matrix. You
     *        can't set both <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of
     *        day to travel with the best traffic conditions is used to calculate the route matrix.</p>
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
     * Sets the time of departure as the current time. Uses the current time to calculate the route matrix. You can't
     * set both <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of day to travel
     * with the best traffic conditions is used to calculate the route matrix.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @return Sets the time of departure as the current time. Uses the current time to calculate the route matrix. You
     *         can't set both <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of
     *         day to travel with the best traffic conditions is used to calculate the route matrix.</p>
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
     * Sets the time of departure as the current time. Uses the current time to calculate the route matrix. You can't
     * set both <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of day to travel
     * with the best traffic conditions is used to calculate the route matrix.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @param departNow
     *        Sets the time of departure as the current time. Uses the current time to calculate the route matrix. You
     *        can't set both <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of
     *        day to travel with the best traffic conditions is used to calculate the route matrix.</p>
     *        <p>
     *        Default Value: <code>false</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>false</code> | <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixRequest withDepartNow(Boolean departNow) {
        setDepartNow(departNow);
        return this;
    }

    /**
     * <p>
     * Sets the time of departure as the current time. Uses the current time to calculate the route matrix. You can't
     * set both <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of day to travel
     * with the best traffic conditions is used to calculate the route matrix.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @return Sets the time of departure as the current time. Uses the current time to calculate the route matrix. You
     *         can't set both <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of
     *         day to travel with the best traffic conditions is used to calculate the route matrix.</p>
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
     * The list of departure (origin) positions for the route matrix. An array of points, each of which is itself a
     * 2-value array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     * <code>[longitude, latitude]</code>. For example, <code>[-123.115, 49.285]</code>.
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource there may be additional restrictions on
     * the inputs you can choose. See <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify a departure that's not located on a
     * road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the position to
     * the nearest road</a>. The snapped value is available in the result in <code>SnappedDeparturePositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @return The list of departure (origin) positions for the route matrix. An array of points, each of which is
     *         itself a 2-value array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     *         format: <code>[longitude, latitude]</code>. For example, <code>[-123.115, 49.285]</code>.</p> <important>
     *         <p>
     *         Depending on the data provider selected in the route calculator resource there may be additional
     *         restrictions on the inputs you can choose. See <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *         > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     *         </p>
     *         </important> <note>
     *         <p>
     *         For route calculators that use Esri as the data provider, if you specify a departure that's not located
     *         on a road, Amazon Location <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the
     *         position to the nearest road</a>. The snapped value is available in the result in
     *         <code>SnappedDeparturePositions</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>[-180 to 180,-90 to 90]</code>
     */

    public java.util.List<java.util.List<Double>> getDeparturePositions() {
        return departurePositions;
    }

    /**
     * <p>
     * The list of departure (origin) positions for the route matrix. An array of points, each of which is itself a
     * 2-value array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     * <code>[longitude, latitude]</code>. For example, <code>[-123.115, 49.285]</code>.
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource there may be additional restrictions on
     * the inputs you can choose. See <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify a departure that's not located on a
     * road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the position to
     * the nearest road</a>. The snapped value is available in the result in <code>SnappedDeparturePositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @param departurePositions
     *        The list of departure (origin) positions for the route matrix. An array of points, each of which is itself
     *        a 2-value array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *        <code>[longitude, latitude]</code>. For example, <code>[-123.115, 49.285]</code>.</p> <important>
     *        <p>
     *        Depending on the data provider selected in the route calculator resource there may be additional
     *        restrictions on the inputs you can choose. See <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *        > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     *        </p>
     *        </important> <note>
     *        <p>
     *        For route calculators that use Esri as the data provider, if you specify a departure that's not located on
     *        a road, Amazon Location <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the
     *        position to the nearest road</a>. The snapped value is available in the result in
     *        <code>SnappedDeparturePositions</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     */

    public void setDeparturePositions(java.util.Collection<java.util.List<Double>> departurePositions) {
        if (departurePositions == null) {
            this.departurePositions = null;
            return;
        }

        this.departurePositions = new java.util.ArrayList<java.util.List<Double>>(departurePositions);
    }

    /**
     * <p>
     * The list of departure (origin) positions for the route matrix. An array of points, each of which is itself a
     * 2-value array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     * <code>[longitude, latitude]</code>. For example, <code>[-123.115, 49.285]</code>.
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource there may be additional restrictions on
     * the inputs you can choose. See <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify a departure that's not located on a
     * road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the position to
     * the nearest road</a>. The snapped value is available in the result in <code>SnappedDeparturePositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeparturePositions(java.util.Collection)} or {@link #withDeparturePositions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param departurePositions
     *        The list of departure (origin) positions for the route matrix. An array of points, each of which is itself
     *        a 2-value array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *        <code>[longitude, latitude]</code>. For example, <code>[-123.115, 49.285]</code>.</p> <important>
     *        <p>
     *        Depending on the data provider selected in the route calculator resource there may be additional
     *        restrictions on the inputs you can choose. See <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *        > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     *        </p>
     *        </important> <note>
     *        <p>
     *        For route calculators that use Esri as the data provider, if you specify a departure that's not located on
     *        a road, Amazon Location <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the
     *        position to the nearest road</a>. The snapped value is available in the result in
     *        <code>SnappedDeparturePositions</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixRequest withDeparturePositions(java.util.List<Double>... departurePositions) {
        if (this.departurePositions == null) {
            setDeparturePositions(new java.util.ArrayList<java.util.List<Double>>(departurePositions.length));
        }
        for (java.util.List<Double> ele : departurePositions) {
            this.departurePositions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of departure (origin) positions for the route matrix. An array of points, each of which is itself a
     * 2-value array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     * <code>[longitude, latitude]</code>. For example, <code>[-123.115, 49.285]</code>.
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource there may be additional restrictions on
     * the inputs you can choose. See <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify a departure that's not located on a
     * road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the position to
     * the nearest road</a>. The snapped value is available in the result in <code>SnappedDeparturePositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @param departurePositions
     *        The list of departure (origin) positions for the route matrix. An array of points, each of which is itself
     *        a 2-value array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *        <code>[longitude, latitude]</code>. For example, <code>[-123.115, 49.285]</code>.</p> <important>
     *        <p>
     *        Depending on the data provider selected in the route calculator resource there may be additional
     *        restrictions on the inputs you can choose. See <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *        > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     *        </p>
     *        </important> <note>
     *        <p>
     *        For route calculators that use Esri as the data provider, if you specify a departure that's not located on
     *        a road, Amazon Location <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the
     *        position to the nearest road</a>. The snapped value is available in the result in
     *        <code>SnappedDeparturePositions</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixRequest withDeparturePositions(java.util.Collection<java.util.List<Double>> departurePositions) {
        setDeparturePositions(departurePositions);
        return this;
    }

    /**
     * <p>
     * Specifies the desired time of departure. Uses the given time to calculate the route matrix. You can't set both
     * <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of day to travel with the
     * best traffic conditions is used to calculate the route matrix.
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
     *        Specifies the desired time of departure. Uses the given time to calculate the route matrix. You can't set
     *        both <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of day to
     *        travel with the best traffic conditions is used to calculate the route matrix.</p> <note>
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
     * Specifies the desired time of departure. Uses the given time to calculate the route matrix. You can't set both
     * <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of day to travel with the
     * best traffic conditions is used to calculate the route matrix.
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
     * @return Specifies the desired time of departure. Uses the given time to calculate the route matrix. You can't set
     *         both <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of day to
     *         travel with the best traffic conditions is used to calculate the route matrix.</p> <note>
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
     * Specifies the desired time of departure. Uses the given time to calculate the route matrix. You can't set both
     * <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of day to travel with the
     * best traffic conditions is used to calculate the route matrix.
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
     *        Specifies the desired time of departure. Uses the given time to calculate the route matrix. You can't set
     *        both <code>DepartureTime</code> and <code>DepartNow</code>. If neither is set, the best time of day to
     *        travel with the best traffic conditions is used to calculate the route matrix.</p> <note>
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

    public CalculateRouteMatrixRequest withDepartureTime(java.util.Date departureTime) {
        setDepartureTime(departureTime);
        return this;
    }

    /**
     * <p>
     * The list of destination positions for the route matrix. An array of points, each of which is itself a 2-value
     * array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     * <code>[longitude, latitude]</code>. For example, <code>[-122.339, 47.615]</code>
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource there may be additional restrictions on
     * the inputs you can choose. See <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify a destination that's not located on a
     * road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the position to
     * the nearest road</a>. The snapped value is available in the result in <code>SnappedDestinationPositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @return The list of destination positions for the route matrix. An array of points, each of which is itself a
     *         2-value array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *         <code>[longitude, latitude]</code>. For example, <code>[-122.339, 47.615]</code> </p> <important>
     *         <p>
     *         Depending on the data provider selected in the route calculator resource there may be additional
     *         restrictions on the inputs you can choose. See <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *         > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     *         </p>
     *         </important> <note>
     *         <p>
     *         For route calculators that use Esri as the data provider, if you specify a destination that's not located
     *         on a road, Amazon Location <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the
     *         position to the nearest road</a>. The snapped value is available in the result in
     *         <code>SnappedDestinationPositions</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>[-180 to 180,-90 to 90]</code>
     */

    public java.util.List<java.util.List<Double>> getDestinationPositions() {
        return destinationPositions;
    }

    /**
     * <p>
     * The list of destination positions for the route matrix. An array of points, each of which is itself a 2-value
     * array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     * <code>[longitude, latitude]</code>. For example, <code>[-122.339, 47.615]</code>
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource there may be additional restrictions on
     * the inputs you can choose. See <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify a destination that's not located on a
     * road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the position to
     * the nearest road</a>. The snapped value is available in the result in <code>SnappedDestinationPositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @param destinationPositions
     *        The list of destination positions for the route matrix. An array of points, each of which is itself a
     *        2-value array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *        <code>[longitude, latitude]</code>. For example, <code>[-122.339, 47.615]</code> </p> <important>
     *        <p>
     *        Depending on the data provider selected in the route calculator resource there may be additional
     *        restrictions on the inputs you can choose. See <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *        > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     *        </p>
     *        </important> <note>
     *        <p>
     *        For route calculators that use Esri as the data provider, if you specify a destination that's not located
     *        on a road, Amazon Location <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the
     *        position to the nearest road</a>. The snapped value is available in the result in
     *        <code>SnappedDestinationPositions</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     */

    public void setDestinationPositions(java.util.Collection<java.util.List<Double>> destinationPositions) {
        if (destinationPositions == null) {
            this.destinationPositions = null;
            return;
        }

        this.destinationPositions = new java.util.ArrayList<java.util.List<Double>>(destinationPositions);
    }

    /**
     * <p>
     * The list of destination positions for the route matrix. An array of points, each of which is itself a 2-value
     * array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     * <code>[longitude, latitude]</code>. For example, <code>[-122.339, 47.615]</code>
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource there may be additional restrictions on
     * the inputs you can choose. See <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify a destination that's not located on a
     * road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the position to
     * the nearest road</a>. The snapped value is available in the result in <code>SnappedDestinationPositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationPositions(java.util.Collection)} or {@link #withDestinationPositions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param destinationPositions
     *        The list of destination positions for the route matrix. An array of points, each of which is itself a
     *        2-value array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *        <code>[longitude, latitude]</code>. For example, <code>[-122.339, 47.615]</code> </p> <important>
     *        <p>
     *        Depending on the data provider selected in the route calculator resource there may be additional
     *        restrictions on the inputs you can choose. See <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *        > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     *        </p>
     *        </important> <note>
     *        <p>
     *        For route calculators that use Esri as the data provider, if you specify a destination that's not located
     *        on a road, Amazon Location <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the
     *        position to the nearest road</a>. The snapped value is available in the result in
     *        <code>SnappedDestinationPositions</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixRequest withDestinationPositions(java.util.List<Double>... destinationPositions) {
        if (this.destinationPositions == null) {
            setDestinationPositions(new java.util.ArrayList<java.util.List<Double>>(destinationPositions.length));
        }
        for (java.util.List<Double> ele : destinationPositions) {
            this.destinationPositions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of destination positions for the route matrix. An array of points, each of which is itself a 2-value
     * array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     * <code>[longitude, latitude]</code>. For example, <code>[-122.339, 47.615]</code>
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource there may be additional restrictions on
     * the inputs you can choose. See <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify a destination that's not located on a
     * road, Amazon Location <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the position to
     * the nearest road</a>. The snapped value is available in the result in <code>SnappedDestinationPositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * 
     * @param destinationPositions
     *        The list of destination positions for the route matrix. An array of points, each of which is itself a
     *        2-value array defined in <a href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a> format:
     *        <code>[longitude, latitude]</code>. For example, <code>[-122.339, 47.615]</code> </p> <important>
     *        <p>
     *        Depending on the data provider selected in the route calculator resource there may be additional
     *        restrictions on the inputs you can choose. See <a href=
     *        "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *        > Position restrictions</a> in the <i>Amazon Location Service Developer Guide</i>.
     *        </p>
     *        </important> <note>
     *        <p>
     *        For route calculators that use Esri as the data provider, if you specify a destination that's not located
     *        on a road, Amazon Location <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"> moves the
     *        position to the nearest road</a>. The snapped value is available in the result in
     *        <code>SnappedDestinationPositions</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixRequest withDestinationPositions(java.util.Collection<java.util.List<Double>> destinationPositions) {
        setDestinationPositions(destinationPositions);
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

    public CalculateRouteMatrixRequest withDistanceUnit(String distanceUnit) {
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

    public CalculateRouteMatrixRequest withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road
     * compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify also determines how you specify route preferences:
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
     *        The <code>TravelMode</code> you specify also determines how you specify route preferences:
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
     * The <code>TravelMode</code> you specify also determines how you specify route preferences:
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
     *         The <code>TravelMode</code> you specify also determines how you specify route preferences:
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
     * The <code>TravelMode</code> you specify also determines how you specify route preferences:
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
     *        The <code>TravelMode</code> you specify also determines how you specify route preferences:
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

    public CalculateRouteMatrixRequest withTravelMode(String travelMode) {
        setTravelMode(travelMode);
        return this;
    }

    /**
     * <p>
     * Specifies the mode of transport when calculating a route. Used in estimating the speed of travel and road
     * compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify also determines how you specify route preferences:
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
     *        The <code>TravelMode</code> you specify also determines how you specify route preferences:
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

    public CalculateRouteMatrixRequest withTravelMode(TravelMode travelMode) {
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

    public CalculateRouteMatrixRequest withTruckModeOptions(CalculateRouteTruckModeOptions truckModeOptions) {
        setTruckModeOptions(truckModeOptions);
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
        if (getDeparturePositions() != null)
            sb.append("DeparturePositions: ").append("***Sensitive Data Redacted***").append(",");
        if (getDepartureTime() != null)
            sb.append("DepartureTime: ").append(getDepartureTime()).append(",");
        if (getDestinationPositions() != null)
            sb.append("DestinationPositions: ").append("***Sensitive Data Redacted***").append(",");
        if (getDistanceUnit() != null)
            sb.append("DistanceUnit: ").append(getDistanceUnit()).append(",");
        if (getTravelMode() != null)
            sb.append("TravelMode: ").append(getTravelMode()).append(",");
        if (getTruckModeOptions() != null)
            sb.append("TruckModeOptions: ").append(getTruckModeOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculateRouteMatrixRequest == false)
            return false;
        CalculateRouteMatrixRequest other = (CalculateRouteMatrixRequest) obj;
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
        if (other.getDeparturePositions() == null ^ this.getDeparturePositions() == null)
            return false;
        if (other.getDeparturePositions() != null && other.getDeparturePositions().equals(this.getDeparturePositions()) == false)
            return false;
        if (other.getDepartureTime() == null ^ this.getDepartureTime() == null)
            return false;
        if (other.getDepartureTime() != null && other.getDepartureTime().equals(this.getDepartureTime()) == false)
            return false;
        if (other.getDestinationPositions() == null ^ this.getDestinationPositions() == null)
            return false;
        if (other.getDestinationPositions() != null && other.getDestinationPositions().equals(this.getDestinationPositions()) == false)
            return false;
        if (other.getDistanceUnit() == null ^ this.getDistanceUnit() == null)
            return false;
        if (other.getDistanceUnit() != null && other.getDistanceUnit().equals(this.getDistanceUnit()) == false)
            return false;
        if (other.getTravelMode() == null ^ this.getTravelMode() == null)
            return false;
        if (other.getTravelMode() != null && other.getTravelMode().equals(this.getTravelMode()) == false)
            return false;
        if (other.getTruckModeOptions() == null ^ this.getTruckModeOptions() == null)
            return false;
        if (other.getTruckModeOptions() != null && other.getTruckModeOptions().equals(this.getTruckModeOptions()) == false)
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
        hashCode = prime * hashCode + ((getDeparturePositions() == null) ? 0 : getDeparturePositions().hashCode());
        hashCode = prime * hashCode + ((getDepartureTime() == null) ? 0 : getDepartureTime().hashCode());
        hashCode = prime * hashCode + ((getDestinationPositions() == null) ? 0 : getDestinationPositions().hashCode());
        hashCode = prime * hashCode + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode + ((getTravelMode() == null) ? 0 : getTravelMode().hashCode());
        hashCode = prime * hashCode + ((getTruckModeOptions() == null) ? 0 : getTruckModeOptions().hashCode());
        return hashCode;
    }

    @Override
    public CalculateRouteMatrixRequest clone() {
        return (CalculateRouteMatrixRequest) super.clone();
    }

}
