/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The ListOperations request includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ListOperations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOperationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional parameter that lets you get information about all the operations that you submitted after a specified
     * date and time. Specify the date and time in Unix time format and Coordinated Universal time (UTC).
     * </p>
     */
    private java.util.Date submittedSince;
    /**
     * <p>
     * For an initial request for a list of operations, omit this element. If the number of operations that are not yet
     * complete is greater than the value that you specified for <code>MaxItems</code>, you can use <code>Marker</code>
     * to return additional operations. Get the value of <code>NextPageMarker</code> from the previous response, and
     * submit another request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Number of domains to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * The status of the operations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> status;
    /**
     * <p>
     * An arrays of the domains operation types.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> type;
    /**
     * <p>
     * The sort type for returned values.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order ofr returned values, either ascending or descending.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * An optional parameter that lets you get information about all the operations that you submitted after a specified
     * date and time. Specify the date and time in Unix time format and Coordinated Universal time (UTC).
     * </p>
     * 
     * @param submittedSince
     *        An optional parameter that lets you get information about all the operations that you submitted after a
     *        specified date and time. Specify the date and time in Unix time format and Coordinated Universal time
     *        (UTC).
     */

    public void setSubmittedSince(java.util.Date submittedSince) {
        this.submittedSince = submittedSince;
    }

    /**
     * <p>
     * An optional parameter that lets you get information about all the operations that you submitted after a specified
     * date and time. Specify the date and time in Unix time format and Coordinated Universal time (UTC).
     * </p>
     * 
     * @return An optional parameter that lets you get information about all the operations that you submitted after a
     *         specified date and time. Specify the date and time in Unix time format and Coordinated Universal time
     *         (UTC).
     */

    public java.util.Date getSubmittedSince() {
        return this.submittedSince;
    }

    /**
     * <p>
     * An optional parameter that lets you get information about all the operations that you submitted after a specified
     * date and time. Specify the date and time in Unix time format and Coordinated Universal time (UTC).
     * </p>
     * 
     * @param submittedSince
     *        An optional parameter that lets you get information about all the operations that you submitted after a
     *        specified date and time. Specify the date and time in Unix time format and Coordinated Universal time
     *        (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsRequest withSubmittedSince(java.util.Date submittedSince) {
        setSubmittedSince(submittedSince);
        return this;
    }

    /**
     * <p>
     * For an initial request for a list of operations, omit this element. If the number of operations that are not yet
     * complete is greater than the value that you specified for <code>MaxItems</code>, you can use <code>Marker</code>
     * to return additional operations. Get the value of <code>NextPageMarker</code> from the previous response, and
     * submit another request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * 
     * @param marker
     *        For an initial request for a list of operations, omit this element. If the number of operations that are
     *        not yet complete is greater than the value that you specified for <code>MaxItems</code>, you can use
     *        <code>Marker</code> to return additional operations. Get the value of <code>NextPageMarker</code> from the
     *        previous response, and submit another request that includes the value of <code>NextPageMarker</code> in
     *        the <code>Marker</code> element.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * For an initial request for a list of operations, omit this element. If the number of operations that are not yet
     * complete is greater than the value that you specified for <code>MaxItems</code>, you can use <code>Marker</code>
     * to return additional operations. Get the value of <code>NextPageMarker</code> from the previous response, and
     * submit another request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * 
     * @return For an initial request for a list of operations, omit this element. If the number of operations that are
     *         not yet complete is greater than the value that you specified for <code>MaxItems</code>, you can use
     *         <code>Marker</code> to return additional operations. Get the value of <code>NextPageMarker</code> from
     *         the previous response, and submit another request that includes the value of <code>NextPageMarker</code>
     *         in the <code>Marker</code> element.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * For an initial request for a list of operations, omit this element. If the number of operations that are not yet
     * complete is greater than the value that you specified for <code>MaxItems</code>, you can use <code>Marker</code>
     * to return additional operations. Get the value of <code>NextPageMarker</code> from the previous response, and
     * submit another request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * 
     * @param marker
     *        For an initial request for a list of operations, omit this element. If the number of operations that are
     *        not yet complete is greater than the value that you specified for <code>MaxItems</code>, you can use
     *        <code>Marker</code> to return additional operations. Get the value of <code>NextPageMarker</code> from the
     *        previous response, and submit another request that includes the value of <code>NextPageMarker</code> in
     *        the <code>Marker</code> element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Number of domains to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * 
     * @param maxItems
     *        Number of domains to be returned.</p>
     *        <p>
     *        Default: 20
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Number of domains to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * 
     * @return Number of domains to be returned.</p>
     *         <p>
     *         Default: 20
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Number of domains to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * 
     * @param maxItems
     *        Number of domains to be returned.</p>
     *        <p>
     *        Default: 20
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The status of the operations.
     * </p>
     * 
     * @return The status of the operations.
     * @see OperationStatus
     */

    public java.util.List<String> getStatus() {
        if (status == null) {
            status = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return status;
    }

    /**
     * <p>
     * The status of the operations.
     * </p>
     * 
     * @param status
     *        The status of the operations.
     * @see OperationStatus
     */

    public void setStatus(java.util.Collection<String> status) {
        if (status == null) {
            this.status = null;
            return;
        }

        this.status = new com.amazonaws.internal.SdkInternalList<String>(status);
    }

    /**
     * <p>
     * The status of the operations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatus(java.util.Collection)} or {@link #withStatus(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param status
     *        The status of the operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public ListOperationsRequest withStatus(String... status) {
        if (this.status == null) {
            setStatus(new com.amazonaws.internal.SdkInternalList<String>(status.length));
        }
        for (String ele : status) {
            this.status.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of the operations.
     * </p>
     * 
     * @param status
     *        The status of the operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public ListOperationsRequest withStatus(java.util.Collection<String> status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the operations.
     * </p>
     * 
     * @param status
     *        The status of the operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public ListOperationsRequest withStatus(OperationStatus... status) {
        com.amazonaws.internal.SdkInternalList<String> statusCopy = new com.amazonaws.internal.SdkInternalList<String>(status.length);
        for (OperationStatus value : status) {
            statusCopy.add(value.toString());
        }
        if (getStatus() == null) {
            setStatus(statusCopy);
        } else {
            getStatus().addAll(statusCopy);
        }
        return this;
    }

    /**
     * <p>
     * An arrays of the domains operation types.
     * </p>
     * 
     * @return An arrays of the domains operation types.
     * @see OperationType
     */

    public java.util.List<String> getType() {
        if (type == null) {
            type = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return type;
    }

    /**
     * <p>
     * An arrays of the domains operation types.
     * </p>
     * 
     * @param type
     *        An arrays of the domains operation types.
     * @see OperationType
     */

    public void setType(java.util.Collection<String> type) {
        if (type == null) {
            this.type = null;
            return;
        }

        this.type = new com.amazonaws.internal.SdkInternalList<String>(type);
    }

    /**
     * <p>
     * An arrays of the domains operation types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setType(java.util.Collection)} or {@link #withType(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param type
     *        An arrays of the domains operation types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public ListOperationsRequest withType(String... type) {
        if (this.type == null) {
            setType(new com.amazonaws.internal.SdkInternalList<String>(type.length));
        }
        for (String ele : type) {
            this.type.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An arrays of the domains operation types.
     * </p>
     * 
     * @param type
     *        An arrays of the domains operation types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public ListOperationsRequest withType(java.util.Collection<String> type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * An arrays of the domains operation types.
     * </p>
     * 
     * @param type
     *        An arrays of the domains operation types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public ListOperationsRequest withType(OperationType... type) {
        com.amazonaws.internal.SdkInternalList<String> typeCopy = new com.amazonaws.internal.SdkInternalList<String>(type.length);
        for (OperationType value : type) {
            typeCopy.add(value.toString());
        }
        if (getType() == null) {
            setType(typeCopy);
        } else {
            getType().addAll(typeCopy);
        }
        return this;
    }

    /**
     * <p>
     * The sort type for returned values.
     * </p>
     * 
     * @param sortBy
     *        The sort type for returned values.
     * @see ListOperationsSortAttributeName
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The sort type for returned values.
     * </p>
     * 
     * @return The sort type for returned values.
     * @see ListOperationsSortAttributeName
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The sort type for returned values.
     * </p>
     * 
     * @param sortBy
     *        The sort type for returned values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListOperationsSortAttributeName
     */

    public ListOperationsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The sort type for returned values.
     * </p>
     * 
     * @param sortBy
     *        The sort type for returned values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListOperationsSortAttributeName
     */

    public ListOperationsRequest withSortBy(ListOperationsSortAttributeName sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order ofr returned values, either ascending or descending.
     * </p>
     * 
     * @param sortOrder
     *        The sort order ofr returned values, either ascending or descending.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order ofr returned values, either ascending or descending.
     * </p>
     * 
     * @return The sort order ofr returned values, either ascending or descending.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order ofr returned values, either ascending or descending.
     * </p>
     * 
     * @param sortOrder
     *        The sort order ofr returned values, either ascending or descending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListOperationsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order ofr returned values, either ascending or descending.
     * </p>
     * 
     * @param sortOrder
     *        The sort order ofr returned values, either ascending or descending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListOperationsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getSubmittedSince() != null)
            sb.append("SubmittedSince: ").append(getSubmittedSince()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOperationsRequest == false)
            return false;
        ListOperationsRequest other = (ListOperationsRequest) obj;
        if (other.getSubmittedSince() == null ^ this.getSubmittedSince() == null)
            return false;
        if (other.getSubmittedSince() != null && other.getSubmittedSince().equals(this.getSubmittedSince()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubmittedSince() == null) ? 0 : getSubmittedSince().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListOperationsRequest clone() {
        return (ListOperationsRequest) super.clone();
    }

}
