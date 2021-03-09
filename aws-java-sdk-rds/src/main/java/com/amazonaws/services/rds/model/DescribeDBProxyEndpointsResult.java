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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxyEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBProxyEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of <code>ProxyEndpoint</code> objects returned by the API operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBProxyEndpoint> dBProxyEndpoints;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of <code>ProxyEndpoint</code> objects returned by the API operation.
     * </p>
     * 
     * @return The list of <code>ProxyEndpoint</code> objects returned by the API operation.
     */

    public java.util.List<DBProxyEndpoint> getDBProxyEndpoints() {
        if (dBProxyEndpoints == null) {
            dBProxyEndpoints = new com.amazonaws.internal.SdkInternalList<DBProxyEndpoint>();
        }
        return dBProxyEndpoints;
    }

    /**
     * <p>
     * The list of <code>ProxyEndpoint</code> objects returned by the API operation.
     * </p>
     * 
     * @param dBProxyEndpoints
     *        The list of <code>ProxyEndpoint</code> objects returned by the API operation.
     */

    public void setDBProxyEndpoints(java.util.Collection<DBProxyEndpoint> dBProxyEndpoints) {
        if (dBProxyEndpoints == null) {
            this.dBProxyEndpoints = null;
            return;
        }

        this.dBProxyEndpoints = new com.amazonaws.internal.SdkInternalList<DBProxyEndpoint>(dBProxyEndpoints);
    }

    /**
     * <p>
     * The list of <code>ProxyEndpoint</code> objects returned by the API operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBProxyEndpoints(java.util.Collection)} or {@link #withDBProxyEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dBProxyEndpoints
     *        The list of <code>ProxyEndpoint</code> objects returned by the API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBProxyEndpointsResult withDBProxyEndpoints(DBProxyEndpoint... dBProxyEndpoints) {
        if (this.dBProxyEndpoints == null) {
            setDBProxyEndpoints(new com.amazonaws.internal.SdkInternalList<DBProxyEndpoint>(dBProxyEndpoints.length));
        }
        for (DBProxyEndpoint ele : dBProxyEndpoints) {
            this.dBProxyEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>ProxyEndpoint</code> objects returned by the API operation.
     * </p>
     * 
     * @param dBProxyEndpoints
     *        The list of <code>ProxyEndpoint</code> objects returned by the API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBProxyEndpointsResult withDBProxyEndpoints(java.util.Collection<DBProxyEndpoint> dBProxyEndpoints) {
        setDBProxyEndpoints(dBProxyEndpoints);
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

    public DescribeDBProxyEndpointsResult withMarker(String marker) {
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
        if (getDBProxyEndpoints() != null)
            sb.append("DBProxyEndpoints: ").append(getDBProxyEndpoints()).append(",");
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

        if (obj instanceof DescribeDBProxyEndpointsResult == false)
            return false;
        DescribeDBProxyEndpointsResult other = (DescribeDBProxyEndpointsResult) obj;
        if (other.getDBProxyEndpoints() == null ^ this.getDBProxyEndpoints() == null)
            return false;
        if (other.getDBProxyEndpoints() != null && other.getDBProxyEndpoints().equals(this.getDBProxyEndpoints()) == false)
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

        hashCode = prime * hashCode + ((getDBProxyEndpoints() == null) ? 0 : getDBProxyEndpoints().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBProxyEndpointsResult clone() {
        try {
            return (DescribeDBProxyEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
