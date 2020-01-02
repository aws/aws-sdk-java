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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeInstallationMedia" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstallationMediaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The installation medium ID.
     * </p>
     */
    private String installationMediaId;
    /**
     * <p>
     * A filter that specifies one or more installation media to describe. Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>custom-availability-zone-id</code> - Accepts custom Availability Zone (AZ) identifiers. The results list
     * includes information about only the custom AZs identified by these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>engine</code> - Accepts database engines. The results list includes information about only the database
     * engines identified by these identifiers.
     * </p>
     * <p>
     * For more information about the valid engines for installation media, see <a>ImportInstallationMedia</a>.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * An optional pagination token provided by a previous DescribeInstallationMedia request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The installation medium ID.
     * </p>
     * 
     * @param installationMediaId
     *        The installation medium ID.
     */

    public void setInstallationMediaId(String installationMediaId) {
        this.installationMediaId = installationMediaId;
    }

    /**
     * <p>
     * The installation medium ID.
     * </p>
     * 
     * @return The installation medium ID.
     */

    public String getInstallationMediaId() {
        return this.installationMediaId;
    }

    /**
     * <p>
     * The installation medium ID.
     * </p>
     * 
     * @param installationMediaId
     *        The installation medium ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstallationMediaRequest withInstallationMediaId(String installationMediaId) {
        setInstallationMediaId(installationMediaId);
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more installation media to describe. Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>custom-availability-zone-id</code> - Accepts custom Availability Zone (AZ) identifiers. The results list
     * includes information about only the custom AZs identified by these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>engine</code> - Accepts database engines. The results list includes information about only the database
     * engines identified by these identifiers.
     * </p>
     * <p>
     * For more information about the valid engines for installation media, see <a>ImportInstallationMedia</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A filter that specifies one or more installation media to describe. Supported filters include the
     *         following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>custom-availability-zone-id</code> - Accepts custom Availability Zone (AZ) identifiers. The results
     *         list includes information about only the custom AZs identified by these identifiers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>engine</code> - Accepts database engines. The results list includes information about only the
     *         database engines identified by these identifiers.
     *         </p>
     *         <p>
     *         For more information about the valid engines for installation media, see <a>ImportInstallationMedia</a>.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * A filter that specifies one or more installation media to describe. Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>custom-availability-zone-id</code> - Accepts custom Availability Zone (AZ) identifiers. The results list
     * includes information about only the custom AZs identified by these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>engine</code> - Accepts database engines. The results list includes information about only the database
     * engines identified by these identifiers.
     * </p>
     * <p>
     * For more information about the valid engines for installation media, see <a>ImportInstallationMedia</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more installation media to describe. Supported filters include the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>custom-availability-zone-id</code> - Accepts custom Availability Zone (AZ) identifiers. The results
     *        list includes information about only the custom AZs identified by these identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>engine</code> - Accepts database engines. The results list includes information about only the
     *        database engines identified by these identifiers.
     *        </p>
     *        <p>
     *        For more information about the valid engines for installation media, see <a>ImportInstallationMedia</a>.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * A filter that specifies one or more installation media to describe. Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>custom-availability-zone-id</code> - Accepts custom Availability Zone (AZ) identifiers. The results list
     * includes information about only the custom AZs identified by these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>engine</code> - Accepts database engines. The results list includes information about only the database
     * engines identified by these identifiers.
     * </p>
     * <p>
     * For more information about the valid engines for installation media, see <a>ImportInstallationMedia</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A filter that specifies one or more installation media to describe. Supported filters include the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>custom-availability-zone-id</code> - Accepts custom Availability Zone (AZ) identifiers. The results
     *        list includes information about only the custom AZs identified by these identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>engine</code> - Accepts database engines. The results list includes information about only the
     *        database engines identified by these identifiers.
     *        </p>
     *        <p>
     *        For more information about the valid engines for installation media, see <a>ImportInstallationMedia</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstallationMediaRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more installation media to describe. Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>custom-availability-zone-id</code> - Accepts custom Availability Zone (AZ) identifiers. The results list
     * includes information about only the custom AZs identified by these identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>engine</code> - Accepts database engines. The results list includes information about only the database
     * engines identified by these identifiers.
     * </p>
     * <p>
     * For more information about the valid engines for installation media, see <a>ImportInstallationMedia</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more installation media to describe. Supported filters include the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>custom-availability-zone-id</code> - Accepts custom Availability Zone (AZ) identifiers. The results
     *        list includes information about only the custom AZs identified by these identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>engine</code> - Accepts database engines. The results list includes information about only the
     *        database engines identified by these identifiers.
     *        </p>
     *        <p>
     *        For more information about the valid engines for installation media, see <a>ImportInstallationMedia</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstallationMediaRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeInstallationMedia request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param maxRecords
     *        An optional pagination token provided by a previous DescribeInstallationMedia request. If this parameter
     *        is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeInstallationMedia request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous DescribeInstallationMedia request. If this parameter
     *         is specified, the response includes only records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeInstallationMedia request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param maxRecords
     *        An optional pagination token provided by a previous DescribeInstallationMedia request. If this parameter
     *        is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstallationMediaRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
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

    public DescribeInstallationMediaRequest withMarker(String marker) {
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
        if (getInstallationMediaId() != null)
            sb.append("InstallationMediaId: ").append(getInstallationMediaId()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeInstallationMediaRequest == false)
            return false;
        DescribeInstallationMediaRequest other = (DescribeInstallationMediaRequest) obj;
        if (other.getInstallationMediaId() == null ^ this.getInstallationMediaId() == null)
            return false;
        if (other.getInstallationMediaId() != null && other.getInstallationMediaId().equals(this.getInstallationMediaId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getInstallationMediaId() == null) ? 0 : getInstallationMediaId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstallationMediaRequest clone() {
        return (DescribeInstallationMediaRequest) super.clone();
    }

}
