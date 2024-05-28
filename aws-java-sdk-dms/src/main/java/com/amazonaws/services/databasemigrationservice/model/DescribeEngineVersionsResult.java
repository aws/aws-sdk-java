/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEngineVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEngineVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returned <code>EngineVersion</code> objects that describe the replication instance engine versions used in the
     * project.
     * </p>
     */
    private java.util.List<EngineVersion> engineVersions;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Returned <code>EngineVersion</code> objects that describe the replication instance engine versions used in the
     * project.
     * </p>
     * 
     * @return Returned <code>EngineVersion</code> objects that describe the replication instance engine versions used
     *         in the project.
     */

    public java.util.List<EngineVersion> getEngineVersions() {
        return engineVersions;
    }

    /**
     * <p>
     * Returned <code>EngineVersion</code> objects that describe the replication instance engine versions used in the
     * project.
     * </p>
     * 
     * @param engineVersions
     *        Returned <code>EngineVersion</code> objects that describe the replication instance engine versions used in
     *        the project.
     */

    public void setEngineVersions(java.util.Collection<EngineVersion> engineVersions) {
        if (engineVersions == null) {
            this.engineVersions = null;
            return;
        }

        this.engineVersions = new java.util.ArrayList<EngineVersion>(engineVersions);
    }

    /**
     * <p>
     * Returned <code>EngineVersion</code> objects that describe the replication instance engine versions used in the
     * project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEngineVersions(java.util.Collection)} or {@link #withEngineVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param engineVersions
     *        Returned <code>EngineVersion</code> objects that describe the replication instance engine versions used in
     *        the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngineVersionsResult withEngineVersions(EngineVersion... engineVersions) {
        if (this.engineVersions == null) {
            setEngineVersions(new java.util.ArrayList<EngineVersion>(engineVersions.length));
        }
        for (EngineVersion ele : engineVersions) {
            this.engineVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returned <code>EngineVersion</code> objects that describe the replication instance engine versions used in the
     * project.
     * </p>
     * 
     * @param engineVersions
     *        Returned <code>EngineVersion</code> objects that describe the replication instance engine versions used in
     *        the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngineVersionsResult withEngineVersions(java.util.Collection<EngineVersion> engineVersions) {
        setEngineVersions(engineVersions);
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

    public DescribeEngineVersionsResult withMarker(String marker) {
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
        if (getEngineVersions() != null)
            sb.append("EngineVersions: ").append(getEngineVersions()).append(",");
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

        if (obj instanceof DescribeEngineVersionsResult == false)
            return false;
        DescribeEngineVersionsResult other = (DescribeEngineVersionsResult) obj;
        if (other.getEngineVersions() == null ^ this.getEngineVersions() == null)
            return false;
        if (other.getEngineVersions() != null && other.getEngineVersions().equals(this.getEngineVersions()) == false)
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

        hashCode = prime * hashCode + ((getEngineVersions() == null) ? 0 : getEngineVersions().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEngineVersionsResult clone() {
        try {
            return (DescribeEngineVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
