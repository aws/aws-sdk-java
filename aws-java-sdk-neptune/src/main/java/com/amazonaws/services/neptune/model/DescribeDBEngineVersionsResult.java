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
 * Contains the result of a successful invocation of the <a>DescribeDBEngineVersions</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeDBEngineVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBEngineVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of <code>DBEngineVersion</code> elements.
     * </p>
     */
    private java.util.List<DBEngineVersion> dBEngineVersions;

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

    public DescribeDBEngineVersionsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of <code>DBEngineVersion</code> elements.
     * </p>
     * 
     * @return A list of <code>DBEngineVersion</code> elements.
     */

    public java.util.List<DBEngineVersion> getDBEngineVersions() {
        return dBEngineVersions;
    }

    /**
     * <p>
     * A list of <code>DBEngineVersion</code> elements.
     * </p>
     * 
     * @param dBEngineVersions
     *        A list of <code>DBEngineVersion</code> elements.
     */

    public void setDBEngineVersions(java.util.Collection<DBEngineVersion> dBEngineVersions) {
        if (dBEngineVersions == null) {
            this.dBEngineVersions = null;
            return;
        }

        this.dBEngineVersions = new java.util.ArrayList<DBEngineVersion>(dBEngineVersions);
    }

    /**
     * <p>
     * A list of <code>DBEngineVersion</code> elements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBEngineVersions(java.util.Collection)} or {@link #withDBEngineVersions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dBEngineVersions
     *        A list of <code>DBEngineVersion</code> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBEngineVersionsResult withDBEngineVersions(DBEngineVersion... dBEngineVersions) {
        if (this.dBEngineVersions == null) {
            setDBEngineVersions(new java.util.ArrayList<DBEngineVersion>(dBEngineVersions.length));
        }
        for (DBEngineVersion ele : dBEngineVersions) {
            this.dBEngineVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DBEngineVersion</code> elements.
     * </p>
     * 
     * @param dBEngineVersions
     *        A list of <code>DBEngineVersion</code> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBEngineVersionsResult withDBEngineVersions(java.util.Collection<DBEngineVersion> dBEngineVersions) {
        setDBEngineVersions(dBEngineVersions);
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
        if (getDBEngineVersions() != null)
            sb.append("DBEngineVersions: ").append(getDBEngineVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBEngineVersionsResult == false)
            return false;
        DescribeDBEngineVersionsResult other = (DescribeDBEngineVersionsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBEngineVersions() == null ^ this.getDBEngineVersions() == null)
            return false;
        if (other.getDBEngineVersions() != null && other.getDBEngineVersions().equals(this.getDBEngineVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDBEngineVersions() == null) ? 0 : getDBEngineVersions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBEngineVersionsResult clone() {
        try {
            return (DescribeDBEngineVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
