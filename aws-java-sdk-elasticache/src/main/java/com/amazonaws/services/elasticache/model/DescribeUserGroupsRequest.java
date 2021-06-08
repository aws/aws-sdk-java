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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeUserGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the user group.
     * </p>
     */
    private String userGroupId;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxRecords
     * value, a marker is included in the response so that the remaining results can be retrieved.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords. &gt;
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The ID of the user group.
     * </p>
     * 
     * @param userGroupId
     *        The ID of the user group.
     */

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * <p>
     * The ID of the user group.
     * </p>
     * 
     * @return The ID of the user group.
     */

    public String getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * <p>
     * The ID of the user group.
     * </p>
     * 
     * @param userGroupId
     *        The ID of the user group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserGroupsRequest withUserGroupId(String userGroupId) {
        setUserGroupId(userGroupId);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxRecords
     * value, a marker is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxRecords value, a marker is included in the response so that the remaining results can be retrieved.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxRecords
     * value, a marker is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         MaxRecords value, a marker is included in the response so that the remaining results can be retrieved.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxRecords
     * value, a marker is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxRecords value, a marker is included in the response so that the remaining results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserGroupsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords. &gt;
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by MaxRecords. &gt;
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords. &gt;
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker for pagination of results from this
     *         operation. If this parameter is specified, the response includes only records beyond the marker, up to
     *         the value specified by MaxRecords. &gt;
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords. &gt;
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by MaxRecords. &gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserGroupsRequest withMarker(String marker) {
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
        if (getUserGroupId() != null)
            sb.append("UserGroupId: ").append(getUserGroupId()).append(",");
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

        if (obj instanceof DescribeUserGroupsRequest == false)
            return false;
        DescribeUserGroupsRequest other = (DescribeUserGroupsRequest) obj;
        if (other.getUserGroupId() == null ^ this.getUserGroupId() == null)
            return false;
        if (other.getUserGroupId() != null && other.getUserGroupId().equals(this.getUserGroupId()) == false)
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

        hashCode = prime * hashCode + ((getUserGroupId() == null) ? 0 : getUserGroupId().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUserGroupsRequest clone() {
        return (DescribeUserGroupsRequest) super.clone();
    }

}
