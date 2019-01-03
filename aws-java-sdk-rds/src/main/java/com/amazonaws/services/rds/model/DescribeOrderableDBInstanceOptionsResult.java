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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the result of a successful invocation of the <a>DescribeOrderableDBInstanceOptions</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOrderableDBInstanceOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrderableDBInstanceOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An <a>OrderableDBInstanceOption</a> structure containing information about orderable options for the DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OrderableDBInstanceOption> orderableDBInstanceOptions;
    /**
     * <p>
     * An optional pagination token provided by a previous OrderableDBInstanceOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code> .
     * </p>
     */
    private String marker;

    /**
     * <p>
     * An <a>OrderableDBInstanceOption</a> structure containing information about orderable options for the DB instance.
     * </p>
     * 
     * @return An <a>OrderableDBInstanceOption</a> structure containing information about orderable options for the DB
     *         instance.
     */

    public java.util.List<OrderableDBInstanceOption> getOrderableDBInstanceOptions() {
        if (orderableDBInstanceOptions == null) {
            orderableDBInstanceOptions = new com.amazonaws.internal.SdkInternalList<OrderableDBInstanceOption>();
        }
        return orderableDBInstanceOptions;
    }

    /**
     * <p>
     * An <a>OrderableDBInstanceOption</a> structure containing information about orderable options for the DB instance.
     * </p>
     * 
     * @param orderableDBInstanceOptions
     *        An <a>OrderableDBInstanceOption</a> structure containing information about orderable options for the DB
     *        instance.
     */

    public void setOrderableDBInstanceOptions(java.util.Collection<OrderableDBInstanceOption> orderableDBInstanceOptions) {
        if (orderableDBInstanceOptions == null) {
            this.orderableDBInstanceOptions = null;
            return;
        }

        this.orderableDBInstanceOptions = new com.amazonaws.internal.SdkInternalList<OrderableDBInstanceOption>(orderableDBInstanceOptions);
    }

    /**
     * <p>
     * An <a>OrderableDBInstanceOption</a> structure containing information about orderable options for the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrderableDBInstanceOptions(java.util.Collection)} or
     * {@link #withOrderableDBInstanceOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param orderableDBInstanceOptions
     *        An <a>OrderableDBInstanceOption</a> structure containing information about orderable options for the DB
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableDBInstanceOptionsResult withOrderableDBInstanceOptions(OrderableDBInstanceOption... orderableDBInstanceOptions) {
        if (this.orderableDBInstanceOptions == null) {
            setOrderableDBInstanceOptions(new com.amazonaws.internal.SdkInternalList<OrderableDBInstanceOption>(orderableDBInstanceOptions.length));
        }
        for (OrderableDBInstanceOption ele : orderableDBInstanceOptions) {
            this.orderableDBInstanceOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An <a>OrderableDBInstanceOption</a> structure containing information about orderable options for the DB instance.
     * </p>
     * 
     * @param orderableDBInstanceOptions
     *        An <a>OrderableDBInstanceOption</a> structure containing information about orderable options for the DB
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableDBInstanceOptionsResult withOrderableDBInstanceOptions(java.util.Collection<OrderableDBInstanceOption> orderableDBInstanceOptions) {
        setOrderableDBInstanceOptions(orderableDBInstanceOptions);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous OrderableDBInstanceOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code> .
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous OrderableDBInstanceOptions request. If this parameter
     *        is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code> .
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous OrderableDBInstanceOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code> .
     * </p>
     * 
     * @return An optional pagination token provided by a previous OrderableDBInstanceOptions request. If this parameter
     *         is specified, the response includes only records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code> .
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous OrderableDBInstanceOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code> .
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous OrderableDBInstanceOptions request. If this parameter
     *        is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableDBInstanceOptionsResult withMarker(String marker) {
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
        if (getOrderableDBInstanceOptions() != null)
            sb.append("OrderableDBInstanceOptions: ").append(getOrderableDBInstanceOptions()).append(",");
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

        if (obj instanceof DescribeOrderableDBInstanceOptionsResult == false)
            return false;
        DescribeOrderableDBInstanceOptionsResult other = (DescribeOrderableDBInstanceOptionsResult) obj;
        if (other.getOrderableDBInstanceOptions() == null ^ this.getOrderableDBInstanceOptions() == null)
            return false;
        if (other.getOrderableDBInstanceOptions() != null && other.getOrderableDBInstanceOptions().equals(this.getOrderableDBInstanceOptions()) == false)
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

        hashCode = prime * hashCode + ((getOrderableDBInstanceOptions() == null) ? 0 : getOrderableDBInstanceOptions().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrderableDBInstanceOptionsResult clone() {
        try {
            return (DescribeOrderableDBInstanceOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
