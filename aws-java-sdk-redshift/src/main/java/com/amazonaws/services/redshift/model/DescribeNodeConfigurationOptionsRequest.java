/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeNodeConfigurationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNodeConfigurationOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The action type to evaluate for possible node configurations. Specify "restore-cluster" to get configuration
     * combinations based on an existing snapshot. Specify "recommend-node-config" to get configuration recommendations
     * based on an existing cluster or snapshot. Specify "resize-cluster" to get configuration combinations for elastic
     * resize based on an existing cluster.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * The identifier of the cluster to evaluate for possible node configurations.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The identifier of the snapshot to evaluate for possible node configurations.
     * </p>
     */
    private String snapshotIdentifier;
    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not
     * own, optional if you own the snapshot.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * A set of name, operator, and value items to filter the results.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NodeConfigurationOptionsFilter> filters;
    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeNodeConfigurationOptions</a> request exceed the value specified in <code>MaxRecords</code>, AWS
     * returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of response
     * records by providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>500</code>
     * </p>
     * <p>
     * Constraints: minimum 100, maximum 500.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The action type to evaluate for possible node configurations. Specify "restore-cluster" to get configuration
     * combinations based on an existing snapshot. Specify "recommend-node-config" to get configuration recommendations
     * based on an existing cluster or snapshot. Specify "resize-cluster" to get configuration combinations for elastic
     * resize based on an existing cluster.
     * </p>
     * 
     * @param actionType
     *        The action type to evaluate for possible node configurations. Specify "restore-cluster" to get
     *        configuration combinations based on an existing snapshot. Specify "recommend-node-config" to get
     *        configuration recommendations based on an existing cluster or snapshot. Specify "resize-cluster" to get
     *        configuration combinations for elastic resize based on an existing cluster.
     * @see ActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The action type to evaluate for possible node configurations. Specify "restore-cluster" to get configuration
     * combinations based on an existing snapshot. Specify "recommend-node-config" to get configuration recommendations
     * based on an existing cluster or snapshot. Specify "resize-cluster" to get configuration combinations for elastic
     * resize based on an existing cluster.
     * </p>
     * 
     * @return The action type to evaluate for possible node configurations. Specify "restore-cluster" to get
     *         configuration combinations based on an existing snapshot. Specify "recommend-node-config" to get
     *         configuration recommendations based on an existing cluster or snapshot. Specify "resize-cluster" to get
     *         configuration combinations for elastic resize based on an existing cluster.
     * @see ActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The action type to evaluate for possible node configurations. Specify "restore-cluster" to get configuration
     * combinations based on an existing snapshot. Specify "recommend-node-config" to get configuration recommendations
     * based on an existing cluster or snapshot. Specify "resize-cluster" to get configuration combinations for elastic
     * resize based on an existing cluster.
     * </p>
     * 
     * @param actionType
     *        The action type to evaluate for possible node configurations. Specify "restore-cluster" to get
     *        configuration combinations based on an existing snapshot. Specify "recommend-node-config" to get
     *        configuration recommendations based on an existing cluster or snapshot. Specify "resize-cluster" to get
     *        configuration combinations for elastic resize based on an existing cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public DescribeNodeConfigurationOptionsRequest withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The action type to evaluate for possible node configurations. Specify "restore-cluster" to get configuration
     * combinations based on an existing snapshot. Specify "recommend-node-config" to get configuration recommendations
     * based on an existing cluster or snapshot. Specify "resize-cluster" to get configuration combinations for elastic
     * resize based on an existing cluster.
     * </p>
     * 
     * @param actionType
     *        The action type to evaluate for possible node configurations. Specify "restore-cluster" to get
     *        configuration combinations based on an existing snapshot. Specify "recommend-node-config" to get
     *        configuration recommendations based on an existing cluster or snapshot. Specify "resize-cluster" to get
     *        configuration combinations for elastic resize based on an existing cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public DescribeNodeConfigurationOptionsRequest withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the cluster to evaluate for possible node configurations.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster to evaluate for possible node configurations.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster to evaluate for possible node configurations.
     * </p>
     * 
     * @return The identifier of the cluster to evaluate for possible node configurations.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster to evaluate for possible node configurations.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster to evaluate for possible node configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeConfigurationOptionsRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the snapshot to evaluate for possible node configurations.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier of the snapshot to evaluate for possible node configurations.
     */

    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot to evaluate for possible node configurations.
     * </p>
     * 
     * @return The identifier of the snapshot to evaluate for possible node configurations.
     */

    public String getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot to evaluate for possible node configurations.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier of the snapshot to evaluate for possible node configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeConfigurationOptionsRequest withSnapshotIdentifier(String snapshotIdentifier) {
        setSnapshotIdentifier(snapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not
     * own, optional if you own the snapshot.
     * </p>
     * 
     * @param ownerAccount
     *        The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you
     *        do not own, optional if you own the snapshot.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not
     * own, optional if you own the snapshot.
     * </p>
     * 
     * @return The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot
     *         you do not own, optional if you own the snapshot.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not
     * own, optional if you own the snapshot.
     * </p>
     * 
     * @param ownerAccount
     *        The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you
     *        do not own, optional if you own the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeConfigurationOptionsRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * A set of name, operator, and value items to filter the results.
     * </p>
     * 
     * @return A set of name, operator, and value items to filter the results.
     */

    public java.util.List<NodeConfigurationOptionsFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<NodeConfigurationOptionsFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * A set of name, operator, and value items to filter the results.
     * </p>
     * 
     * @param filters
     *        A set of name, operator, and value items to filter the results.
     */

    public void setFilters(java.util.Collection<NodeConfigurationOptionsFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<NodeConfigurationOptionsFilter>(filters);
    }

    /**
     * <p>
     * A set of name, operator, and value items to filter the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A set of name, operator, and value items to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeConfigurationOptionsRequest withFilters(NodeConfigurationOptionsFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<NodeConfigurationOptionsFilter>(filters.length));
        }
        for (NodeConfigurationOptionsFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of name, operator, and value items to filter the results.
     * </p>
     * 
     * @param filters
     *        A set of name, operator, and value items to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeConfigurationOptionsRequest withFilters(java.util.Collection<NodeConfigurationOptionsFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeNodeConfigurationOptions</a> request exceed the value specified in <code>MaxRecords</code>, AWS
     * returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of response
     * records by providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeNodeConfigurationOptions</a> request exceed the value specified in
     *        <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code> field of the response. You can
     *        retrieve the next set of response records by providing the returned marker value in the
     *        <code>Marker</code> parameter and retrying the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeNodeConfigurationOptions</a> request exceed the value specified in <code>MaxRecords</code>, AWS
     * returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of response
     * records by providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @return An optional parameter that specifies the starting point to return a set of response records. When the
     *         results of a <a>DescribeNodeConfigurationOptions</a> request exceed the value specified in
     *         <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code> field of the response. You can
     *         retrieve the next set of response records by providing the returned marker value in the
     *         <code>Marker</code> parameter and retrying the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeNodeConfigurationOptions</a> request exceed the value specified in <code>MaxRecords</code>, AWS
     * returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of response
     * records by providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeNodeConfigurationOptions</a> request exceed the value specified in
     *        <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code> field of the response. You can
     *        retrieve the next set of response records by providing the returned marker value in the
     *        <code>Marker</code> parameter and retrying the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeConfigurationOptionsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>500</code>
     * </p>
     * <p>
     * Constraints: minimum 100, maximum 500.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value. </p>
     *        <p>
     *        Default: <code>500</code>
     *        </p>
     *        <p>
     *        Constraints: minimum 100, maximum 500.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>500</code>
     * </p>
     * <p>
     * Constraints: minimum 100, maximum 500.
     * </p>
     * 
     * @return The maximum number of response records to return in each call. If the number of remaining response
     *         records exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code>
     *         field of the response. You can retrieve the next set of records by retrying the command with the returned
     *         marker value. </p>
     *         <p>
     *         Default: <code>500</code>
     *         </p>
     *         <p>
     *         Constraints: minimum 100, maximum 500.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>500</code>
     * </p>
     * <p>
     * Constraints: minimum 100, maximum 500.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value. </p>
     *        <p>
     *        Default: <code>500</code>
     *        </p>
     *        <p>
     *        Constraints: minimum 100, maximum 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeConfigurationOptionsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
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
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNodeConfigurationOptionsRequest == false)
            return false;
        DescribeNodeConfigurationOptionsRequest other = (DescribeNodeConfigurationOptionsRequest) obj;
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
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
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
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNodeConfigurationOptionsRequest clone() {
        return (DescribeNodeConfigurationOptionsRequest) super.clone();
    }

}
