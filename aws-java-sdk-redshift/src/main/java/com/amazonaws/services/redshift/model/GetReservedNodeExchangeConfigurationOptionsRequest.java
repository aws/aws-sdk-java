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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetReservedNodeExchangeConfigurationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReservedNodeExchangeConfigurationOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The action type of the reserved-node configuration. The action type can be an exchange initiated from either a
     * snapshot or a resize.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * The identifier for the cluster that is the source for a reserved-node exchange.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The identifier for the snapshot that is the source for the reserved-node exchange.
     * </p>
     */
    private String snapshotIdentifier;
    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous <code>GetReservedNodeExchangeConfigurationOptions</code>
     * request. If this parameter is specified, the response includes only records beyond the marker, up to the value
     * specified by the <code>MaxRecords</code> parameter. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The action type of the reserved-node configuration. The action type can be an exchange initiated from either a
     * snapshot or a resize.
     * </p>
     * 
     * @param actionType
     *        The action type of the reserved-node configuration. The action type can be an exchange initiated from
     *        either a snapshot or a resize.
     * @see ReservedNodeExchangeActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The action type of the reserved-node configuration. The action type can be an exchange initiated from either a
     * snapshot or a resize.
     * </p>
     * 
     * @return The action type of the reserved-node configuration. The action type can be an exchange initiated from
     *         either a snapshot or a resize.
     * @see ReservedNodeExchangeActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The action type of the reserved-node configuration. The action type can be an exchange initiated from either a
     * snapshot or a resize.
     * </p>
     * 
     * @param actionType
     *        The action type of the reserved-node configuration. The action type can be an exchange initiated from
     *        either a snapshot or a resize.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedNodeExchangeActionType
     */

    public GetReservedNodeExchangeConfigurationOptionsRequest withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The action type of the reserved-node configuration. The action type can be an exchange initiated from either a
     * snapshot or a resize.
     * </p>
     * 
     * @param actionType
     *        The action type of the reserved-node configuration. The action type can be an exchange initiated from
     *        either a snapshot or a resize.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedNodeExchangeActionType
     */

    public GetReservedNodeExchangeConfigurationOptionsRequest withActionType(ReservedNodeExchangeActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier for the cluster that is the source for a reserved-node exchange.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier for the cluster that is the source for a reserved-node exchange.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier for the cluster that is the source for a reserved-node exchange.
     * </p>
     * 
     * @return The identifier for the cluster that is the source for a reserved-node exchange.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier for the cluster that is the source for a reserved-node exchange.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier for the cluster that is the source for a reserved-node exchange.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedNodeExchangeConfigurationOptionsRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier for the snapshot that is the source for the reserved-node exchange.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier for the snapshot that is the source for the reserved-node exchange.
     */

    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the snapshot that is the source for the reserved-node exchange.
     * </p>
     * 
     * @return The identifier for the snapshot that is the source for the reserved-node exchange.
     */

    public String getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the snapshot that is the source for the reserved-node exchange.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier for the snapshot that is the source for the reserved-node exchange.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedNodeExchangeConfigurationOptionsRequest withSnapshotIdentifier(String snapshotIdentifier) {
        setSnapshotIdentifier(snapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * 
     * @return The maximum number of response records to return in each call. If the number of remaining response
     *         records exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code>
     *         field of the response. You can retrieve the next set of records by retrying the command with the returned
     *         marker value.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedNodeExchangeConfigurationOptionsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>GetReservedNodeExchangeConfigurationOptions</code>
     * request. If this parameter is specified, the response includes only records beyond the marker, up to the value
     * specified by the <code>MaxRecords</code> parameter. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous
     *        <code>GetReservedNodeExchangeConfigurationOptions</code> request. If this parameter is specified, the
     *        response includes only records beyond the marker, up to the value specified by the <code>MaxRecords</code>
     *        parameter. You can retrieve the next set of response records by providing the returned marker value in the
     *        <code>Marker</code> parameter and retrying the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>GetReservedNodeExchangeConfigurationOptions</code>
     * request. If this parameter is specified, the response includes only records beyond the marker, up to the value
     * specified by the <code>MaxRecords</code> parameter. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @return An optional pagination token provided by a previous
     *         <code>GetReservedNodeExchangeConfigurationOptions</code> request. If this parameter is specified, the
     *         response includes only records beyond the marker, up to the value specified by the
     *         <code>MaxRecords</code> parameter. You can retrieve the next set of response records by providing the
     *         returned marker value in the <code>Marker</code> parameter and retrying the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>GetReservedNodeExchangeConfigurationOptions</code>
     * request. If this parameter is specified, the response includes only records beyond the marker, up to the value
     * specified by the <code>MaxRecords</code> parameter. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous
     *        <code>GetReservedNodeExchangeConfigurationOptions</code> request. If this parameter is specified, the
     *        response includes only records beyond the marker, up to the value specified by the <code>MaxRecords</code>
     *        parameter. You can retrieve the next set of response records by providing the returned marker value in the
     *        <code>Marker</code> parameter and retrying the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedNodeExchangeConfigurationOptionsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: ").append(getSnapshotIdentifier()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservedNodeExchangeConfigurationOptionsRequest == false)
            return false;
        GetReservedNodeExchangeConfigurationOptionsRequest other = (GetReservedNodeExchangeConfigurationOptionsRequest) obj;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public GetReservedNodeExchangeConfigurationOptionsRequest clone() {
        return (GetReservedNodeExchangeConfigurationOptionsRequest) super.clone();
    }

}
