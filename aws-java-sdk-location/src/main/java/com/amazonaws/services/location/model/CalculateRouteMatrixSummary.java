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
 * A summary of the calculated route matrix.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CalculateRouteMatrixSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculateRouteMatrixSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data provider of traffic and road network data used to calculate the routes. Indicates one of the available
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
     * The unit of measurement for route distances.
     * </p>
     */
    private String distanceUnit;
    /**
     * <p>
     * The count of error results in the route matrix. If this number is 0, all routes were calculated successfully.
     * </p>
     */
    private Integer errorCount;
    /**
     * <p>
     * The count of cells in the route matrix. Equal to the number of <code>DeparturePositions</code> multiplied by the
     * number of <code>DestinationPositions</code>.
     * </p>
     */
    private Integer routeCount;

    /**
     * <p>
     * The data provider of traffic and road network data used to calculate the routes. Indicates one of the available
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
     *        The data provider of traffic and road network data used to calculate the routes. Indicates one of the
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
     * The data provider of traffic and road network data used to calculate the routes. Indicates one of the available
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
     * @return The data provider of traffic and road network data used to calculate the routes. Indicates one of the
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
     * The data provider of traffic and road network data used to calculate the routes. Indicates one of the available
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
     *        The data provider of traffic and road network data used to calculate the routes. Indicates one of the
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

    public CalculateRouteMatrixSummary withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The unit of measurement for route distances.
     * </p>
     * 
     * @param distanceUnit
     *        The unit of measurement for route distances.
     * @see DistanceUnit
     */

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * The unit of measurement for route distances.
     * </p>
     * 
     * @return The unit of measurement for route distances.
     * @see DistanceUnit
     */

    public String getDistanceUnit() {
        return this.distanceUnit;
    }

    /**
     * <p>
     * The unit of measurement for route distances.
     * </p>
     * 
     * @param distanceUnit
     *        The unit of measurement for route distances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistanceUnit
     */

    public CalculateRouteMatrixSummary withDistanceUnit(String distanceUnit) {
        setDistanceUnit(distanceUnit);
        return this;
    }

    /**
     * <p>
     * The unit of measurement for route distances.
     * </p>
     * 
     * @param distanceUnit
     *        The unit of measurement for route distances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistanceUnit
     */

    public CalculateRouteMatrixSummary withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * The count of error results in the route matrix. If this number is 0, all routes were calculated successfully.
     * </p>
     * 
     * @param errorCount
     *        The count of error results in the route matrix. If this number is 0, all routes were calculated
     *        successfully.
     */

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    /**
     * <p>
     * The count of error results in the route matrix. If this number is 0, all routes were calculated successfully.
     * </p>
     * 
     * @return The count of error results in the route matrix. If this number is 0, all routes were calculated
     *         successfully.
     */

    public Integer getErrorCount() {
        return this.errorCount;
    }

    /**
     * <p>
     * The count of error results in the route matrix. If this number is 0, all routes were calculated successfully.
     * </p>
     * 
     * @param errorCount
     *        The count of error results in the route matrix. If this number is 0, all routes were calculated
     *        successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixSummary withErrorCount(Integer errorCount) {
        setErrorCount(errorCount);
        return this;
    }

    /**
     * <p>
     * The count of cells in the route matrix. Equal to the number of <code>DeparturePositions</code> multiplied by the
     * number of <code>DestinationPositions</code>.
     * </p>
     * 
     * @param routeCount
     *        The count of cells in the route matrix. Equal to the number of <code>DeparturePositions</code> multiplied
     *        by the number of <code>DestinationPositions</code>.
     */

    public void setRouteCount(Integer routeCount) {
        this.routeCount = routeCount;
    }

    /**
     * <p>
     * The count of cells in the route matrix. Equal to the number of <code>DeparturePositions</code> multiplied by the
     * number of <code>DestinationPositions</code>.
     * </p>
     * 
     * @return The count of cells in the route matrix. Equal to the number of <code>DeparturePositions</code> multiplied
     *         by the number of <code>DestinationPositions</code>.
     */

    public Integer getRouteCount() {
        return this.routeCount;
    }

    /**
     * <p>
     * The count of cells in the route matrix. Equal to the number of <code>DeparturePositions</code> multiplied by the
     * number of <code>DestinationPositions</code>.
     * </p>
     * 
     * @param routeCount
     *        The count of cells in the route matrix. Equal to the number of <code>DeparturePositions</code> multiplied
     *        by the number of <code>DestinationPositions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixSummary withRouteCount(Integer routeCount) {
        setRouteCount(routeCount);
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
        if (getDistanceUnit() != null)
            sb.append("DistanceUnit: ").append(getDistanceUnit()).append(",");
        if (getErrorCount() != null)
            sb.append("ErrorCount: ").append(getErrorCount()).append(",");
        if (getRouteCount() != null)
            sb.append("RouteCount: ").append(getRouteCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculateRouteMatrixSummary == false)
            return false;
        CalculateRouteMatrixSummary other = (CalculateRouteMatrixSummary) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDistanceUnit() == null ^ this.getDistanceUnit() == null)
            return false;
        if (other.getDistanceUnit() != null && other.getDistanceUnit().equals(this.getDistanceUnit()) == false)
            return false;
        if (other.getErrorCount() == null ^ this.getErrorCount() == null)
            return false;
        if (other.getErrorCount() != null && other.getErrorCount().equals(this.getErrorCount()) == false)
            return false;
        if (other.getRouteCount() == null ^ this.getRouteCount() == null)
            return false;
        if (other.getRouteCount() != null && other.getRouteCount().equals(this.getRouteCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode + ((getErrorCount() == null) ? 0 : getErrorCount().hashCode());
        hashCode = prime * hashCode + ((getRouteCount() == null) ? 0 : getRouteCount().hashCode());
        return hashCode;
    }

    @Override
    public CalculateRouteMatrixSummary clone() {
        try {
            return (CalculateRouteMatrixSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.CalculateRouteMatrixSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
