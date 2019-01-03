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
     * date and time. Specify the date and time in Coordinated Universal time (UTC).
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
     * An optional parameter that lets you get information about all the operations that you submitted after a specified
     * date and time. Specify the date and time in Coordinated Universal time (UTC).
     * </p>
     * 
     * @param submittedSince
     *        An optional parameter that lets you get information about all the operations that you submitted after a
     *        specified date and time. Specify the date and time in Coordinated Universal time (UTC).
     */

    public void setSubmittedSince(java.util.Date submittedSince) {
        this.submittedSince = submittedSince;
    }

    /**
     * <p>
     * An optional parameter that lets you get information about all the operations that you submitted after a specified
     * date and time. Specify the date and time in Coordinated Universal time (UTC).
     * </p>
     * 
     * @return An optional parameter that lets you get information about all the operations that you submitted after a
     *         specified date and time. Specify the date and time in Coordinated Universal time (UTC).
     */

    public java.util.Date getSubmittedSince() {
        return this.submittedSince;
    }

    /**
     * <p>
     * An optional parameter that lets you get information about all the operations that you submitted after a specified
     * date and time. Specify the date and time in Coordinated Universal time (UTC).
     * </p>
     * 
     * @param submittedSince
     *        An optional parameter that lets you get information about all the operations that you submitted after a
     *        specified date and time. Specify the date and time in Coordinated Universal time (UTC).
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
            sb.append("MaxItems: ").append(getMaxItems());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubmittedSince() == null) ? 0 : getSubmittedSince().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListOperationsRequest clone() {
        return (ListOperationsRequest) super.clone();
    }

}
