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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAuthorizersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Return the list of authorizers in ascending alphabetical order.
     * </p>
     */
    private Boolean ascendingOrder;
    /**
     * <p>
     * The status of the list authorizers request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of results to return at one time.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @return The maximum number of results to return at one time.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of results to return at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuthorizersRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * 
     * @param marker
     *        A marker used to get the next set of results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * 
     * @return A marker used to get the next set of results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * 
     * @param marker
     *        A marker used to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuthorizersRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Return the list of authorizers in ascending alphabetical order.
     * </p>
     * 
     * @param ascendingOrder
     *        Return the list of authorizers in ascending alphabetical order.
     */

    public void setAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }

    /**
     * <p>
     * Return the list of authorizers in ascending alphabetical order.
     * </p>
     * 
     * @return Return the list of authorizers in ascending alphabetical order.
     */

    public Boolean getAscendingOrder() {
        return this.ascendingOrder;
    }

    /**
     * <p>
     * Return the list of authorizers in ascending alphabetical order.
     * </p>
     * 
     * @param ascendingOrder
     *        Return the list of authorizers in ascending alphabetical order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuthorizersRequest withAscendingOrder(Boolean ascendingOrder) {
        setAscendingOrder(ascendingOrder);
        return this;
    }

    /**
     * <p>
     * Return the list of authorizers in ascending alphabetical order.
     * </p>
     * 
     * @return Return the list of authorizers in ascending alphabetical order.
     */

    public Boolean isAscendingOrder() {
        return this.ascendingOrder;
    }

    /**
     * <p>
     * The status of the list authorizers request.
     * </p>
     * 
     * @param status
     *        The status of the list authorizers request.
     * @see AuthorizerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the list authorizers request.
     * </p>
     * 
     * @return The status of the list authorizers request.
     * @see AuthorizerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the list authorizers request.
     * </p>
     * 
     * @param status
     *        The status of the list authorizers request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerStatus
     */

    public ListAuthorizersRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the list authorizers request.
     * </p>
     * 
     * @param status
     *        The status of the list authorizers request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerStatus
     */

    public ListAuthorizersRequest withStatus(AuthorizerStatus status) {
        this.status = status.toString();
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
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getAscendingOrder() != null)
            sb.append("AscendingOrder: ").append(getAscendingOrder()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAuthorizersRequest == false)
            return false;
        ListAuthorizersRequest other = (ListAuthorizersRequest) obj;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getAscendingOrder() == null ^ this.getAscendingOrder() == null)
            return false;
        if (other.getAscendingOrder() != null && other.getAscendingOrder().equals(this.getAscendingOrder()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getAscendingOrder() == null) ? 0 : getAscendingOrder().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListAuthorizersRequest clone() {
        return (ListAuthorizersRequest) super.clone();
    }

}
