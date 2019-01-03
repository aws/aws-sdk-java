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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEndpointTypes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The type of endpoints that are supported.
     * </p>
     */
    private java.util.List<SupportedEndpointType> supportedEndpointTypes;

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

    public DescribeEndpointTypesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The type of endpoints that are supported.
     * </p>
     * 
     * @return The type of endpoints that are supported.
     */

    public java.util.List<SupportedEndpointType> getSupportedEndpointTypes() {
        return supportedEndpointTypes;
    }

    /**
     * <p>
     * The type of endpoints that are supported.
     * </p>
     * 
     * @param supportedEndpointTypes
     *        The type of endpoints that are supported.
     */

    public void setSupportedEndpointTypes(java.util.Collection<SupportedEndpointType> supportedEndpointTypes) {
        if (supportedEndpointTypes == null) {
            this.supportedEndpointTypes = null;
            return;
        }

        this.supportedEndpointTypes = new java.util.ArrayList<SupportedEndpointType>(supportedEndpointTypes);
    }

    /**
     * <p>
     * The type of endpoints that are supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedEndpointTypes(java.util.Collection)} or
     * {@link #withSupportedEndpointTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedEndpointTypes
     *        The type of endpoints that are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointTypesResult withSupportedEndpointTypes(SupportedEndpointType... supportedEndpointTypes) {
        if (this.supportedEndpointTypes == null) {
            setSupportedEndpointTypes(new java.util.ArrayList<SupportedEndpointType>(supportedEndpointTypes.length));
        }
        for (SupportedEndpointType ele : supportedEndpointTypes) {
            this.supportedEndpointTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of endpoints that are supported.
     * </p>
     * 
     * @param supportedEndpointTypes
     *        The type of endpoints that are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointTypesResult withSupportedEndpointTypes(java.util.Collection<SupportedEndpointType> supportedEndpointTypes) {
        setSupportedEndpointTypes(supportedEndpointTypes);
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
        if (getSupportedEndpointTypes() != null)
            sb.append("SupportedEndpointTypes: ").append(getSupportedEndpointTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointTypesResult == false)
            return false;
        DescribeEndpointTypesResult other = (DescribeEndpointTypesResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getSupportedEndpointTypes() == null ^ this.getSupportedEndpointTypes() == null)
            return false;
        if (other.getSupportedEndpointTypes() != null && other.getSupportedEndpointTypes().equals(this.getSupportedEndpointTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getSupportedEndpointTypes() == null) ? 0 : getSupportedEndpointTypes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEndpointTypesResult clone() {
        try {
            return (DescribeEndpointTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
