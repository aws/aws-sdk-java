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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEndpointAuthorization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointAuthorizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The authorizations to an endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EndpointAuthorization> endpointAuthorizationList;
    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by the
     * <code>MaxRecords</code> parameter.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The authorizations to an endpoint.
     * </p>
     * 
     * @return The authorizations to an endpoint.
     */

    public java.util.List<EndpointAuthorization> getEndpointAuthorizationList() {
        if (endpointAuthorizationList == null) {
            endpointAuthorizationList = new com.amazonaws.internal.SdkInternalList<EndpointAuthorization>();
        }
        return endpointAuthorizationList;
    }

    /**
     * <p>
     * The authorizations to an endpoint.
     * </p>
     * 
     * @param endpointAuthorizationList
     *        The authorizations to an endpoint.
     */

    public void setEndpointAuthorizationList(java.util.Collection<EndpointAuthorization> endpointAuthorizationList) {
        if (endpointAuthorizationList == null) {
            this.endpointAuthorizationList = null;
            return;
        }

        this.endpointAuthorizationList = new com.amazonaws.internal.SdkInternalList<EndpointAuthorization>(endpointAuthorizationList);
    }

    /**
     * <p>
     * The authorizations to an endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointAuthorizationList(java.util.Collection)} or
     * {@link #withEndpointAuthorizationList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param endpointAuthorizationList
     *        The authorizations to an endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointAuthorizationResult withEndpointAuthorizationList(EndpointAuthorization... endpointAuthorizationList) {
        if (this.endpointAuthorizationList == null) {
            setEndpointAuthorizationList(new com.amazonaws.internal.SdkInternalList<EndpointAuthorization>(endpointAuthorizationList.length));
        }
        for (EndpointAuthorization ele : endpointAuthorizationList) {
            this.endpointAuthorizationList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The authorizations to an endpoint.
     * </p>
     * 
     * @param endpointAuthorizationList
     *        The authorizations to an endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointAuthorizationResult withEndpointAuthorizationList(java.util.Collection<EndpointAuthorization> endpointAuthorizationList) {
        setEndpointAuthorizationList(endpointAuthorizationList);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by the
     * <code>MaxRecords</code> parameter.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by the <code>MaxRecords</code> parameter.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by the
     * <code>MaxRecords</code> parameter.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request.
     *         If this parameter is specified, the response includes only records beyond the marker, up to the value
     *         specified by the <code>MaxRecords</code> parameter.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by the
     * <code>MaxRecords</code> parameter.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by the <code>MaxRecords</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointAuthorizationResult withMarker(String marker) {
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
        if (getEndpointAuthorizationList() != null)
            sb.append("EndpointAuthorizationList: ").append(getEndpointAuthorizationList()).append(",");
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

        if (obj instanceof DescribeEndpointAuthorizationResult == false)
            return false;
        DescribeEndpointAuthorizationResult other = (DescribeEndpointAuthorizationResult) obj;
        if (other.getEndpointAuthorizationList() == null ^ this.getEndpointAuthorizationList() == null)
            return false;
        if (other.getEndpointAuthorizationList() != null && other.getEndpointAuthorizationList().equals(this.getEndpointAuthorizationList()) == false)
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

        hashCode = prime * hashCode + ((getEndpointAuthorizationList() == null) ? 0 : getEndpointAuthorizationList().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEndpointAuthorizationResult clone() {
        try {
            return (DescribeEndpointAuthorizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
