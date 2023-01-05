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

/**
 * <p>
 * Returns the result of the route matrix calculation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CalculateRouteMatrix" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculateRouteMatrixResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The calculated route matrix containing the results for all pairs of <code>DeparturePositions</code> to
     * <code>DestinationPositions</code>. Each row corresponds to one entry in <code>DeparturePositions</code>. Each
     * entry in the row corresponds to the route from that entry in <code>DeparturePositions</code> to an entry in
     * <code>DestinationPositions</code>.
     * </p>
     */
    private java.util.List<java.util.List<RouteMatrixEntry>> routeMatrix;
    /**
     * <p>
     * For routes calculated using an Esri route calculator resource, departure positions are snapped to the closest
     * road. For Esri route calculator resources, this returns the list of departure/origin positions used for
     * calculation of the <code>RouteMatrix</code>.
     * </p>
     */
    private java.util.List<java.util.List<Double>> snappedDeparturePositions;
    /**
     * <p>
     * The list of destination positions for the route matrix used for calculation of the <code>RouteMatrix</code>.
     * </p>
     */
    private java.util.List<java.util.List<Double>> snappedDestinationPositions;
    /**
     * <p>
     * Contains information about the route matrix, <code>DataSource</code>, <code>DistanceUnit</code>,
     * <code>RouteCount</code> and <code>ErrorCount</code>.
     * </p>
     */
    private CalculateRouteMatrixSummary summary;

    /**
     * <p>
     * The calculated route matrix containing the results for all pairs of <code>DeparturePositions</code> to
     * <code>DestinationPositions</code>. Each row corresponds to one entry in <code>DeparturePositions</code>. Each
     * entry in the row corresponds to the route from that entry in <code>DeparturePositions</code> to an entry in
     * <code>DestinationPositions</code>.
     * </p>
     * 
     * @return The calculated route matrix containing the results for all pairs of <code>DeparturePositions</code> to
     *         <code>DestinationPositions</code>. Each row corresponds to one entry in <code>DeparturePositions</code>.
     *         Each entry in the row corresponds to the route from that entry in <code>DeparturePositions</code> to an
     *         entry in <code>DestinationPositions</code>.
     */

    public java.util.List<java.util.List<RouteMatrixEntry>> getRouteMatrix() {
        return routeMatrix;
    }

    /**
     * <p>
     * The calculated route matrix containing the results for all pairs of <code>DeparturePositions</code> to
     * <code>DestinationPositions</code>. Each row corresponds to one entry in <code>DeparturePositions</code>. Each
     * entry in the row corresponds to the route from that entry in <code>DeparturePositions</code> to an entry in
     * <code>DestinationPositions</code>.
     * </p>
     * 
     * @param routeMatrix
     *        The calculated route matrix containing the results for all pairs of <code>DeparturePositions</code> to
     *        <code>DestinationPositions</code>. Each row corresponds to one entry in <code>DeparturePositions</code>.
     *        Each entry in the row corresponds to the route from that entry in <code>DeparturePositions</code> to an
     *        entry in <code>DestinationPositions</code>.
     */

    public void setRouteMatrix(java.util.Collection<java.util.List<RouteMatrixEntry>> routeMatrix) {
        if (routeMatrix == null) {
            this.routeMatrix = null;
            return;
        }

        this.routeMatrix = new java.util.ArrayList<java.util.List<RouteMatrixEntry>>(routeMatrix);
    }

    /**
     * <p>
     * The calculated route matrix containing the results for all pairs of <code>DeparturePositions</code> to
     * <code>DestinationPositions</code>. Each row corresponds to one entry in <code>DeparturePositions</code>. Each
     * entry in the row corresponds to the route from that entry in <code>DeparturePositions</code> to an entry in
     * <code>DestinationPositions</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteMatrix(java.util.Collection)} or {@link #withRouteMatrix(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param routeMatrix
     *        The calculated route matrix containing the results for all pairs of <code>DeparturePositions</code> to
     *        <code>DestinationPositions</code>. Each row corresponds to one entry in <code>DeparturePositions</code>.
     *        Each entry in the row corresponds to the route from that entry in <code>DeparturePositions</code> to an
     *        entry in <code>DestinationPositions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixResult withRouteMatrix(java.util.List<RouteMatrixEntry>... routeMatrix) {
        if (this.routeMatrix == null) {
            setRouteMatrix(new java.util.ArrayList<java.util.List<RouteMatrixEntry>>(routeMatrix.length));
        }
        for (java.util.List<RouteMatrixEntry> ele : routeMatrix) {
            this.routeMatrix.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The calculated route matrix containing the results for all pairs of <code>DeparturePositions</code> to
     * <code>DestinationPositions</code>. Each row corresponds to one entry in <code>DeparturePositions</code>. Each
     * entry in the row corresponds to the route from that entry in <code>DeparturePositions</code> to an entry in
     * <code>DestinationPositions</code>.
     * </p>
     * 
     * @param routeMatrix
     *        The calculated route matrix containing the results for all pairs of <code>DeparturePositions</code> to
     *        <code>DestinationPositions</code>. Each row corresponds to one entry in <code>DeparturePositions</code>.
     *        Each entry in the row corresponds to the route from that entry in <code>DeparturePositions</code> to an
     *        entry in <code>DestinationPositions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixResult withRouteMatrix(java.util.Collection<java.util.List<RouteMatrixEntry>> routeMatrix) {
        setRouteMatrix(routeMatrix);
        return this;
    }

    /**
     * <p>
     * For routes calculated using an Esri route calculator resource, departure positions are snapped to the closest
     * road. For Esri route calculator resources, this returns the list of departure/origin positions used for
     * calculation of the <code>RouteMatrix</code>.
     * </p>
     * 
     * @return For routes calculated using an Esri route calculator resource, departure positions are snapped to the
     *         closest road. For Esri route calculator resources, this returns the list of departure/origin positions
     *         used for calculation of the <code>RouteMatrix</code>.
     */

    public java.util.List<java.util.List<Double>> getSnappedDeparturePositions() {
        return snappedDeparturePositions;
    }

    /**
     * <p>
     * For routes calculated using an Esri route calculator resource, departure positions are snapped to the closest
     * road. For Esri route calculator resources, this returns the list of departure/origin positions used for
     * calculation of the <code>RouteMatrix</code>.
     * </p>
     * 
     * @param snappedDeparturePositions
     *        For routes calculated using an Esri route calculator resource, departure positions are snapped to the
     *        closest road. For Esri route calculator resources, this returns the list of departure/origin positions
     *        used for calculation of the <code>RouteMatrix</code>.
     */

    public void setSnappedDeparturePositions(java.util.Collection<java.util.List<Double>> snappedDeparturePositions) {
        if (snappedDeparturePositions == null) {
            this.snappedDeparturePositions = null;
            return;
        }

        this.snappedDeparturePositions = new java.util.ArrayList<java.util.List<Double>>(snappedDeparturePositions);
    }

    /**
     * <p>
     * For routes calculated using an Esri route calculator resource, departure positions are snapped to the closest
     * road. For Esri route calculator resources, this returns the list of departure/origin positions used for
     * calculation of the <code>RouteMatrix</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnappedDeparturePositions(java.util.Collection)} or
     * {@link #withSnappedDeparturePositions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param snappedDeparturePositions
     *        For routes calculated using an Esri route calculator resource, departure positions are snapped to the
     *        closest road. For Esri route calculator resources, this returns the list of departure/origin positions
     *        used for calculation of the <code>RouteMatrix</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixResult withSnappedDeparturePositions(java.util.List<Double>... snappedDeparturePositions) {
        if (this.snappedDeparturePositions == null) {
            setSnappedDeparturePositions(new java.util.ArrayList<java.util.List<Double>>(snappedDeparturePositions.length));
        }
        for (java.util.List<Double> ele : snappedDeparturePositions) {
            this.snappedDeparturePositions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For routes calculated using an Esri route calculator resource, departure positions are snapped to the closest
     * road. For Esri route calculator resources, this returns the list of departure/origin positions used for
     * calculation of the <code>RouteMatrix</code>.
     * </p>
     * 
     * @param snappedDeparturePositions
     *        For routes calculated using an Esri route calculator resource, departure positions are snapped to the
     *        closest road. For Esri route calculator resources, this returns the list of departure/origin positions
     *        used for calculation of the <code>RouteMatrix</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixResult withSnappedDeparturePositions(java.util.Collection<java.util.List<Double>> snappedDeparturePositions) {
        setSnappedDeparturePositions(snappedDeparturePositions);
        return this;
    }

    /**
     * <p>
     * The list of destination positions for the route matrix used for calculation of the <code>RouteMatrix</code>.
     * </p>
     * 
     * @return The list of destination positions for the route matrix used for calculation of the
     *         <code>RouteMatrix</code>.
     */

    public java.util.List<java.util.List<Double>> getSnappedDestinationPositions() {
        return snappedDestinationPositions;
    }

    /**
     * <p>
     * The list of destination positions for the route matrix used for calculation of the <code>RouteMatrix</code>.
     * </p>
     * 
     * @param snappedDestinationPositions
     *        The list of destination positions for the route matrix used for calculation of the
     *        <code>RouteMatrix</code>.
     */

    public void setSnappedDestinationPositions(java.util.Collection<java.util.List<Double>> snappedDestinationPositions) {
        if (snappedDestinationPositions == null) {
            this.snappedDestinationPositions = null;
            return;
        }

        this.snappedDestinationPositions = new java.util.ArrayList<java.util.List<Double>>(snappedDestinationPositions);
    }

    /**
     * <p>
     * The list of destination positions for the route matrix used for calculation of the <code>RouteMatrix</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnappedDestinationPositions(java.util.Collection)} or
     * {@link #withSnappedDestinationPositions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param snappedDestinationPositions
     *        The list of destination positions for the route matrix used for calculation of the
     *        <code>RouteMatrix</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixResult withSnappedDestinationPositions(java.util.List<Double>... snappedDestinationPositions) {
        if (this.snappedDestinationPositions == null) {
            setSnappedDestinationPositions(new java.util.ArrayList<java.util.List<Double>>(snappedDestinationPositions.length));
        }
        for (java.util.List<Double> ele : snappedDestinationPositions) {
            this.snappedDestinationPositions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of destination positions for the route matrix used for calculation of the <code>RouteMatrix</code>.
     * </p>
     * 
     * @param snappedDestinationPositions
     *        The list of destination positions for the route matrix used for calculation of the
     *        <code>RouteMatrix</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixResult withSnappedDestinationPositions(java.util.Collection<java.util.List<Double>> snappedDestinationPositions) {
        setSnappedDestinationPositions(snappedDestinationPositions);
        return this;
    }

    /**
     * <p>
     * Contains information about the route matrix, <code>DataSource</code>, <code>DistanceUnit</code>,
     * <code>RouteCount</code> and <code>ErrorCount</code>.
     * </p>
     * 
     * @param summary
     *        Contains information about the route matrix, <code>DataSource</code>, <code>DistanceUnit</code>,
     *        <code>RouteCount</code> and <code>ErrorCount</code>.
     */

    public void setSummary(CalculateRouteMatrixSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Contains information about the route matrix, <code>DataSource</code>, <code>DistanceUnit</code>,
     * <code>RouteCount</code> and <code>ErrorCount</code>.
     * </p>
     * 
     * @return Contains information about the route matrix, <code>DataSource</code>, <code>DistanceUnit</code>,
     *         <code>RouteCount</code> and <code>ErrorCount</code>.
     */

    public CalculateRouteMatrixSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * Contains information about the route matrix, <code>DataSource</code>, <code>DistanceUnit</code>,
     * <code>RouteCount</code> and <code>ErrorCount</code>.
     * </p>
     * 
     * @param summary
     *        Contains information about the route matrix, <code>DataSource</code>, <code>DistanceUnit</code>,
     *        <code>RouteCount</code> and <code>ErrorCount</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteMatrixResult withSummary(CalculateRouteMatrixSummary summary) {
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
        if (getRouteMatrix() != null)
            sb.append("RouteMatrix: ").append(getRouteMatrix()).append(",");
        if (getSnappedDeparturePositions() != null)
            sb.append("SnappedDeparturePositions: ").append("***Sensitive Data Redacted***").append(",");
        if (getSnappedDestinationPositions() != null)
            sb.append("SnappedDestinationPositions: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CalculateRouteMatrixResult == false)
            return false;
        CalculateRouteMatrixResult other = (CalculateRouteMatrixResult) obj;
        if (other.getRouteMatrix() == null ^ this.getRouteMatrix() == null)
            return false;
        if (other.getRouteMatrix() != null && other.getRouteMatrix().equals(this.getRouteMatrix()) == false)
            return false;
        if (other.getSnappedDeparturePositions() == null ^ this.getSnappedDeparturePositions() == null)
            return false;
        if (other.getSnappedDeparturePositions() != null && other.getSnappedDeparturePositions().equals(this.getSnappedDeparturePositions()) == false)
            return false;
        if (other.getSnappedDestinationPositions() == null ^ this.getSnappedDestinationPositions() == null)
            return false;
        if (other.getSnappedDestinationPositions() != null && other.getSnappedDestinationPositions().equals(this.getSnappedDestinationPositions()) == false)
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

        hashCode = prime * hashCode + ((getRouteMatrix() == null) ? 0 : getRouteMatrix().hashCode());
        hashCode = prime * hashCode + ((getSnappedDeparturePositions() == null) ? 0 : getSnappedDeparturePositions().hashCode());
        hashCode = prime * hashCode + ((getSnappedDestinationPositions() == null) ? 0 : getSnappedDestinationPositions().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public CalculateRouteMatrixResult clone() {
        try {
            return (CalculateRouteMatrixResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
