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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the result of a successful invocation of the <a>DescribeDBInstances</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeDBInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of <a>DBInstance</a> instances.
     * </p>
     */
    private java.util.List<DBInstance> dBInstances;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBInstancesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of <a>DBInstance</a> instances.
     * </p>
     * 
     * @return A list of <a>DBInstance</a> instances.
     */

    public java.util.List<DBInstance> getDBInstances() {
        return dBInstances;
    }

    /**
     * <p>
     * A list of <a>DBInstance</a> instances.
     * </p>
     * 
     * @param dBInstances
     *        A list of <a>DBInstance</a> instances.
     */

    public void setDBInstances(java.util.Collection<DBInstance> dBInstances) {
        if (dBInstances == null) {
            this.dBInstances = null;
            return;
        }

        this.dBInstances = new java.util.ArrayList<DBInstance>(dBInstances);
    }

    /**
     * <p>
     * A list of <a>DBInstance</a> instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBInstances(java.util.Collection)} or {@link #withDBInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dBInstances
     *        A list of <a>DBInstance</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBInstancesResult withDBInstances(DBInstance... dBInstances) {
        if (this.dBInstances == null) {
            setDBInstances(new java.util.ArrayList<DBInstance>(dBInstances.length));
        }
        for (DBInstance ele : dBInstances) {
            this.dBInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>DBInstance</a> instances.
     * </p>
     * 
     * @param dBInstances
     *        A list of <a>DBInstance</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBInstancesResult withDBInstances(java.util.Collection<DBInstance> dBInstances) {
        setDBInstances(dBInstances);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getDBInstances() != null)
            sb.append("DBInstances: ").append(getDBInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBInstancesResult == false)
            return false;
        DescribeDBInstancesResult other = (DescribeDBInstancesResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBInstances() == null ^ this.getDBInstances() == null)
            return false;
        if (other.getDBInstances() != null && other.getDBInstances().equals(this.getDBInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDBInstances() == null) ? 0 : getDBInstances().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBInstancesResult clone() {
        try {
            return (DescribeDBInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
