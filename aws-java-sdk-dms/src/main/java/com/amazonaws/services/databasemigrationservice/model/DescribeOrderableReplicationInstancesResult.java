/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeOrderableReplicationInstances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrderableReplicationInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The order-able replication instances available.
     * </p>
     */
    private java.util.List<OrderableReplicationInstance> orderableReplicationInstances;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The order-able replication instances available.
     * </p>
     * 
     * @return The order-able replication instances available.
     */

    public java.util.List<OrderableReplicationInstance> getOrderableReplicationInstances() {
        return orderableReplicationInstances;
    }

    /**
     * <p>
     * The order-able replication instances available.
     * </p>
     * 
     * @param orderableReplicationInstances
     *        The order-able replication instances available.
     */

    public void setOrderableReplicationInstances(java.util.Collection<OrderableReplicationInstance> orderableReplicationInstances) {
        if (orderableReplicationInstances == null) {
            this.orderableReplicationInstances = null;
            return;
        }

        this.orderableReplicationInstances = new java.util.ArrayList<OrderableReplicationInstance>(orderableReplicationInstances);
    }

    /**
     * <p>
     * The order-able replication instances available.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrderableReplicationInstances(java.util.Collection)} or
     * {@link #withOrderableReplicationInstances(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param orderableReplicationInstances
     *        The order-able replication instances available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableReplicationInstancesResult withOrderableReplicationInstances(OrderableReplicationInstance... orderableReplicationInstances) {
        if (this.orderableReplicationInstances == null) {
            setOrderableReplicationInstances(new java.util.ArrayList<OrderableReplicationInstance>(orderableReplicationInstances.length));
        }
        for (OrderableReplicationInstance ele : orderableReplicationInstances) {
            this.orderableReplicationInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The order-able replication instances available.
     * </p>
     * 
     * @param orderableReplicationInstances
     *        The order-able replication instances available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableReplicationInstancesResult withOrderableReplicationInstances(
            java.util.Collection<OrderableReplicationInstance> orderableReplicationInstances) {
        setOrderableReplicationInstances(orderableReplicationInstances);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableReplicationInstancesResult withMarker(String marker) {
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
        if (getOrderableReplicationInstances() != null)
            sb.append("OrderableReplicationInstances: ").append(getOrderableReplicationInstances()).append(",");
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

        if (obj instanceof DescribeOrderableReplicationInstancesResult == false)
            return false;
        DescribeOrderableReplicationInstancesResult other = (DescribeOrderableReplicationInstancesResult) obj;
        if (other.getOrderableReplicationInstances() == null ^ this.getOrderableReplicationInstances() == null)
            return false;
        if (other.getOrderableReplicationInstances() != null
                && other.getOrderableReplicationInstances().equals(this.getOrderableReplicationInstances()) == false)
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

        hashCode = prime * hashCode + ((getOrderableReplicationInstances() == null) ? 0 : getOrderableReplicationInstances().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrderableReplicationInstancesResult clone() {
        try {
            return (DescribeOrderableReplicationInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
