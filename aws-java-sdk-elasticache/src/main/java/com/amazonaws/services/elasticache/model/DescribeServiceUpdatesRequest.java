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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeServiceUpdates" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServiceUpdatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;
    /**
     * <p>
     * The status of the service update
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> serviceUpdateStatus;
    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     */
    private Integer maxRecords;
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
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     */

    public void setServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @return The unique ID of the service update
     */

    public String getServiceUpdateName() {
        return this.serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceUpdatesRequest withServiceUpdateName(String serviceUpdateName) {
        setServiceUpdateName(serviceUpdateName);
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @return The status of the service update
     * @see ServiceUpdateStatus
     */

    public java.util.List<String> getServiceUpdateStatus() {
        if (serviceUpdateStatus == null) {
            serviceUpdateStatus = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return serviceUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @see ServiceUpdateStatus
     */

    public void setServiceUpdateStatus(java.util.Collection<String> serviceUpdateStatus) {
        if (serviceUpdateStatus == null) {
            this.serviceUpdateStatus = null;
            return;
        }

        this.serviceUpdateStatus = new com.amazonaws.internal.SdkInternalList<String>(serviceUpdateStatus);
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceUpdateStatus(java.util.Collection)} or {@link #withServiceUpdateStatus(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public DescribeServiceUpdatesRequest withServiceUpdateStatus(String... serviceUpdateStatus) {
        if (this.serviceUpdateStatus == null) {
            setServiceUpdateStatus(new com.amazonaws.internal.SdkInternalList<String>(serviceUpdateStatus.length));
        }
        for (String ele : serviceUpdateStatus) {
            this.serviceUpdateStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public DescribeServiceUpdatesRequest withServiceUpdateStatus(java.util.Collection<String> serviceUpdateStatus) {
        setServiceUpdateStatus(serviceUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public DescribeServiceUpdatesRequest withServiceUpdateStatus(ServiceUpdateStatus... serviceUpdateStatus) {
        com.amazonaws.internal.SdkInternalList<String> serviceUpdateStatusCopy = new com.amazonaws.internal.SdkInternalList<String>(serviceUpdateStatus.length);
        for (ServiceUpdateStatus value : serviceUpdateStatus) {
            serviceUpdateStatusCopy.add(value.toString());
        }
        if (getServiceUpdateStatus() == null) {
            setServiceUpdateStatus(serviceUpdateStatusCopy);
        } else {
            getServiceUpdateStatus().addAll(serviceUpdateStatusCopy);
        }
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     * 
     * @return The maximum number of records to include in the response
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceUpdatesRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
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

    public DescribeServiceUpdatesRequest withMarker(String marker) {
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
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: ").append(getServiceUpdateName()).append(",");
        if (getServiceUpdateStatus() != null)
            sb.append("ServiceUpdateStatus: ").append(getServiceUpdateStatus()).append(",");
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

        if (obj instanceof DescribeServiceUpdatesRequest == false)
            return false;
        DescribeServiceUpdatesRequest other = (DescribeServiceUpdatesRequest) obj;
        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        if (other.getServiceUpdateStatus() == null ^ this.getServiceUpdateStatus() == null)
            return false;
        if (other.getServiceUpdateStatus() != null && other.getServiceUpdateStatus().equals(this.getServiceUpdateStatus()) == false)
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

        hashCode = prime * hashCode + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateStatus() == null) ? 0 : getServiceUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServiceUpdatesRequest clone() {
        return (DescribeServiceUpdatesRequest) super.clone();
    }

}
