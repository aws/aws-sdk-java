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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeCustomAvailabilityZones"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomAvailabilityZonesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeCustomAvailabilityZones</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The list of <a>CustomAvailabilityZone</a> objects for the AWS account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CustomAvailabilityZone> customAvailabilityZones;

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeCustomAvailabilityZones</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeCustomAvailabilityZones</code> request.
     *        If this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeCustomAvailabilityZones</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeCustomAvailabilityZones</code> request.
     *         If this parameter is specified, the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeCustomAvailabilityZones</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeCustomAvailabilityZones</code> request.
     *        If this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomAvailabilityZonesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The list of <a>CustomAvailabilityZone</a> objects for the AWS account.
     * </p>
     * 
     * @return The list of <a>CustomAvailabilityZone</a> objects for the AWS account.
     */

    public java.util.List<CustomAvailabilityZone> getCustomAvailabilityZones() {
        if (customAvailabilityZones == null) {
            customAvailabilityZones = new com.amazonaws.internal.SdkInternalList<CustomAvailabilityZone>();
        }
        return customAvailabilityZones;
    }

    /**
     * <p>
     * The list of <a>CustomAvailabilityZone</a> objects for the AWS account.
     * </p>
     * 
     * @param customAvailabilityZones
     *        The list of <a>CustomAvailabilityZone</a> objects for the AWS account.
     */

    public void setCustomAvailabilityZones(java.util.Collection<CustomAvailabilityZone> customAvailabilityZones) {
        if (customAvailabilityZones == null) {
            this.customAvailabilityZones = null;
            return;
        }

        this.customAvailabilityZones = new com.amazonaws.internal.SdkInternalList<CustomAvailabilityZone>(customAvailabilityZones);
    }

    /**
     * <p>
     * The list of <a>CustomAvailabilityZone</a> objects for the AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomAvailabilityZones(java.util.Collection)} or
     * {@link #withCustomAvailabilityZones(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customAvailabilityZones
     *        The list of <a>CustomAvailabilityZone</a> objects for the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomAvailabilityZonesResult withCustomAvailabilityZones(CustomAvailabilityZone... customAvailabilityZones) {
        if (this.customAvailabilityZones == null) {
            setCustomAvailabilityZones(new com.amazonaws.internal.SdkInternalList<CustomAvailabilityZone>(customAvailabilityZones.length));
        }
        for (CustomAvailabilityZone ele : customAvailabilityZones) {
            this.customAvailabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <a>CustomAvailabilityZone</a> objects for the AWS account.
     * </p>
     * 
     * @param customAvailabilityZones
     *        The list of <a>CustomAvailabilityZone</a> objects for the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomAvailabilityZonesResult withCustomAvailabilityZones(java.util.Collection<CustomAvailabilityZone> customAvailabilityZones) {
        setCustomAvailabilityZones(customAvailabilityZones);
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
        if (getCustomAvailabilityZones() != null)
            sb.append("CustomAvailabilityZones: ").append(getCustomAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCustomAvailabilityZonesResult == false)
            return false;
        DescribeCustomAvailabilityZonesResult other = (DescribeCustomAvailabilityZonesResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getCustomAvailabilityZones() == null ^ this.getCustomAvailabilityZones() == null)
            return false;
        if (other.getCustomAvailabilityZones() != null && other.getCustomAvailabilityZones().equals(this.getCustomAvailabilityZones()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getCustomAvailabilityZones() == null) ? 0 : getCustomAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCustomAvailabilityZonesResult clone() {
        try {
            return (DescribeCustomAvailabilityZonesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
