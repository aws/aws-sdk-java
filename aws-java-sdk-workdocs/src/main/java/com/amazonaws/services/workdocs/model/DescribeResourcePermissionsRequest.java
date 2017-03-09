/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeResourcePermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeResourcePermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call)
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourcePermissionsRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return with this call.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @return The maximum number of items to return with this call.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return with this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourcePermissionsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call)
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. (You received this marker from a previous call)
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call)
     * </p>
     * 
     * @return The marker for the next set of results. (You received this marker from a previous call)
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call)
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. (You received this marker from a previous call)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourcePermissionsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
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

        if (obj instanceof DescribeResourcePermissionsRequest == false)
            return false;
        DescribeResourcePermissionsRequest other = (DescribeResourcePermissionsRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeResourcePermissionsRequest clone() {
        return (DescribeResourcePermissionsRequest) super.clone();
    }

}
