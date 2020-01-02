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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeServiceUpdates" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServiceUpdatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of service updates
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceUpdate> serviceUpdates;

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker for pagination of results from this
     *         operation. If this parameter is specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceUpdatesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of service updates
     * </p>
     * 
     * @return A list of service updates
     */

    public java.util.List<ServiceUpdate> getServiceUpdates() {
        if (serviceUpdates == null) {
            serviceUpdates = new com.amazonaws.internal.SdkInternalList<ServiceUpdate>();
        }
        return serviceUpdates;
    }

    /**
     * <p>
     * A list of service updates
     * </p>
     * 
     * @param serviceUpdates
     *        A list of service updates
     */

    public void setServiceUpdates(java.util.Collection<ServiceUpdate> serviceUpdates) {
        if (serviceUpdates == null) {
            this.serviceUpdates = null;
            return;
        }

        this.serviceUpdates = new com.amazonaws.internal.SdkInternalList<ServiceUpdate>(serviceUpdates);
    }

    /**
     * <p>
     * A list of service updates
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceUpdates(java.util.Collection)} or {@link #withServiceUpdates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param serviceUpdates
     *        A list of service updates
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceUpdatesResult withServiceUpdates(ServiceUpdate... serviceUpdates) {
        if (this.serviceUpdates == null) {
            setServiceUpdates(new com.amazonaws.internal.SdkInternalList<ServiceUpdate>(serviceUpdates.length));
        }
        for (ServiceUpdate ele : serviceUpdates) {
            this.serviceUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of service updates
     * </p>
     * 
     * @param serviceUpdates
     *        A list of service updates
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceUpdatesResult withServiceUpdates(java.util.Collection<ServiceUpdate> serviceUpdates) {
        setServiceUpdates(serviceUpdates);
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
        if (getServiceUpdates() != null)
            sb.append("ServiceUpdates: ").append(getServiceUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServiceUpdatesResult == false)
            return false;
        DescribeServiceUpdatesResult other = (DescribeServiceUpdatesResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getServiceUpdates() == null ^ this.getServiceUpdates() == null)
            return false;
        if (other.getServiceUpdates() != null && other.getServiceUpdates().equals(this.getServiceUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdates() == null) ? 0 : getServiceUpdates().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServiceUpdatesResult clone() {
        try {
            return (DescribeServiceUpdatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
