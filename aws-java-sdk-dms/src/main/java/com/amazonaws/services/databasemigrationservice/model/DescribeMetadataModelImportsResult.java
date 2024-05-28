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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeMetadataModelImports" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMetadataModelImportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the unique pagination token that makes it possible to display the next page of results. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     * <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call again
     * using the returned token and keeping all other arguments unchanged.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A paginated list of metadata model imports.
     * </p>
     */
    private java.util.List<SchemaConversionRequest> requests;

    /**
     * <p>
     * Specifies the unique pagination token that makes it possible to display the next page of results. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     * <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call again
     * using the returned token and keeping all other arguments unchanged.
     * </p>
     * 
     * @param marker
     *        Specifies the unique pagination token that makes it possible to display the next page of results. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.</p>
     *        <p>
     *        If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     *        <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call
     *        again using the returned token and keeping all other arguments unchanged.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Specifies the unique pagination token that makes it possible to display the next page of results. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     * <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call again
     * using the returned token and keeping all other arguments unchanged.
     * </p>
     * 
     * @return Specifies the unique pagination token that makes it possible to display the next page of results. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code>.</p>
     *         <p>
     *         If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     *         <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call
     *         again using the returned token and keeping all other arguments unchanged.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Specifies the unique pagination token that makes it possible to display the next page of results. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     * <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call again
     * using the returned token and keeping all other arguments unchanged.
     * </p>
     * 
     * @param marker
     *        Specifies the unique pagination token that makes it possible to display the next page of results. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.</p>
     *        <p>
     *        If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     *        <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call
     *        again using the returned token and keeping all other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetadataModelImportsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A paginated list of metadata model imports.
     * </p>
     * 
     * @return A paginated list of metadata model imports.
     */

    public java.util.List<SchemaConversionRequest> getRequests() {
        return requests;
    }

    /**
     * <p>
     * A paginated list of metadata model imports.
     * </p>
     * 
     * @param requests
     *        A paginated list of metadata model imports.
     */

    public void setRequests(java.util.Collection<SchemaConversionRequest> requests) {
        if (requests == null) {
            this.requests = null;
            return;
        }

        this.requests = new java.util.ArrayList<SchemaConversionRequest>(requests);
    }

    /**
     * <p>
     * A paginated list of metadata model imports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequests(java.util.Collection)} or {@link #withRequests(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param requests
     *        A paginated list of metadata model imports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetadataModelImportsResult withRequests(SchemaConversionRequest... requests) {
        if (this.requests == null) {
            setRequests(new java.util.ArrayList<SchemaConversionRequest>(requests.length));
        }
        for (SchemaConversionRequest ele : requests) {
            this.requests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A paginated list of metadata model imports.
     * </p>
     * 
     * @param requests
     *        A paginated list of metadata model imports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetadataModelImportsResult withRequests(java.util.Collection<SchemaConversionRequest> requests) {
        setRequests(requests);
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
        if (getRequests() != null)
            sb.append("Requests: ").append(getRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMetadataModelImportsResult == false)
            return false;
        DescribeMetadataModelImportsResult other = (DescribeMetadataModelImportsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getRequests() == null ^ this.getRequests() == null)
            return false;
        if (other.getRequests() != null && other.getRequests().equals(this.getRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getRequests() == null) ? 0 : getRequests().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMetadataModelImportsResult clone() {
        try {
            return (DescribeMetadataModelImportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
