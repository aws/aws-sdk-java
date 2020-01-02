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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBProxiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A return value representing an arbitrary number of <code>DBProxy</code> data structures.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBProxy> dBProxies;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A return value representing an arbitrary number of <code>DBProxy</code> data structures.
     * </p>
     * 
     * @return A return value representing an arbitrary number of <code>DBProxy</code> data structures.
     */

    public java.util.List<DBProxy> getDBProxies() {
        if (dBProxies == null) {
            dBProxies = new com.amazonaws.internal.SdkInternalList<DBProxy>();
        }
        return dBProxies;
    }

    /**
     * <p>
     * A return value representing an arbitrary number of <code>DBProxy</code> data structures.
     * </p>
     * 
     * @param dBProxies
     *        A return value representing an arbitrary number of <code>DBProxy</code> data structures.
     */

    public void setDBProxies(java.util.Collection<DBProxy> dBProxies) {
        if (dBProxies == null) {
            this.dBProxies = null;
            return;
        }

        this.dBProxies = new com.amazonaws.internal.SdkInternalList<DBProxy>(dBProxies);
    }

    /**
     * <p>
     * A return value representing an arbitrary number of <code>DBProxy</code> data structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBProxies(java.util.Collection)} or {@link #withDBProxies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dBProxies
     *        A return value representing an arbitrary number of <code>DBProxy</code> data structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBProxiesResult withDBProxies(DBProxy... dBProxies) {
        if (this.dBProxies == null) {
            setDBProxies(new com.amazonaws.internal.SdkInternalList<DBProxy>(dBProxies.length));
        }
        for (DBProxy ele : dBProxies) {
            this.dBProxies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A return value representing an arbitrary number of <code>DBProxy</code> data structures.
     * </p>
     * 
     * @param dBProxies
     *        A return value representing an arbitrary number of <code>DBProxy</code> data structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBProxiesResult withDBProxies(java.util.Collection<DBProxy> dBProxies) {
        setDBProxies(dBProxies);
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

    public DescribeDBProxiesResult withMarker(String marker) {
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
        if (getDBProxies() != null)
            sb.append("DBProxies: ").append(getDBProxies()).append(",");
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

        if (obj instanceof DescribeDBProxiesResult == false)
            return false;
        DescribeDBProxiesResult other = (DescribeDBProxiesResult) obj;
        if (other.getDBProxies() == null ^ this.getDBProxies() == null)
            return false;
        if (other.getDBProxies() != null && other.getDBProxies().equals(this.getDBProxies()) == false)
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

        hashCode = prime * hashCode + ((getDBProxies() == null) ? 0 : getDBProxies().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBProxiesResult clone() {
        try {
            return (DescribeDBProxiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
