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
 * The ViewBilling request includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ViewBilling" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewBillingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The beginning date and time for the time period for which you want a list of billing records. Specify the date
     * and time in Coordinated Universal time (UTC).
     * </p>
     */
    private java.util.Date start;
    /**
     * <p>
     * The end date and time for the time period for which you want a list of billing records. Specify the date and time
     * in Coordinated Universal time (UTC).
     * </p>
     */
    private java.util.Date end;
    /**
     * <p>
     * For an initial request for a list of billing records, omit this element. If the number of billing records that
     * are associated with the current AWS account during the specified period is greater than the value that you
     * specified for <code>MaxItems</code>, you can use <code>Marker</code> to return additional billing records. Get
     * the value of <code>NextPageMarker</code> from the previous response, and submit another request that includes the
     * value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * <p>
     * Constraints: The marker must match the value of <code>NextPageMarker</code> that was returned in the previous
     * response.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The number of billing records to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The beginning date and time for the time period for which you want a list of billing records. Specify the date
     * and time in Coordinated Universal time (UTC).
     * </p>
     * 
     * @param start
     *        The beginning date and time for the time period for which you want a list of billing records. Specify the
     *        date and time in Coordinated Universal time (UTC).
     */

    public void setStart(java.util.Date start) {
        this.start = start;
    }

    /**
     * <p>
     * The beginning date and time for the time period for which you want a list of billing records. Specify the date
     * and time in Coordinated Universal time (UTC).
     * </p>
     * 
     * @return The beginning date and time for the time period for which you want a list of billing records. Specify the
     *         date and time in Coordinated Universal time (UTC).
     */

    public java.util.Date getStart() {
        return this.start;
    }

    /**
     * <p>
     * The beginning date and time for the time period for which you want a list of billing records. Specify the date
     * and time in Coordinated Universal time (UTC).
     * </p>
     * 
     * @param start
     *        The beginning date and time for the time period for which you want a list of billing records. Specify the
     *        date and time in Coordinated Universal time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewBillingRequest withStart(java.util.Date start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * The end date and time for the time period for which you want a list of billing records. Specify the date and time
     * in Coordinated Universal time (UTC).
     * </p>
     * 
     * @param end
     *        The end date and time for the time period for which you want a list of billing records. Specify the date
     *        and time in Coordinated Universal time (UTC).
     */

    public void setEnd(java.util.Date end) {
        this.end = end;
    }

    /**
     * <p>
     * The end date and time for the time period for which you want a list of billing records. Specify the date and time
     * in Coordinated Universal time (UTC).
     * </p>
     * 
     * @return The end date and time for the time period for which you want a list of billing records. Specify the date
     *         and time in Coordinated Universal time (UTC).
     */

    public java.util.Date getEnd() {
        return this.end;
    }

    /**
     * <p>
     * The end date and time for the time period for which you want a list of billing records. Specify the date and time
     * in Coordinated Universal time (UTC).
     * </p>
     * 
     * @param end
     *        The end date and time for the time period for which you want a list of billing records. Specify the date
     *        and time in Coordinated Universal time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewBillingRequest withEnd(java.util.Date end) {
        setEnd(end);
        return this;
    }

    /**
     * <p>
     * For an initial request for a list of billing records, omit this element. If the number of billing records that
     * are associated with the current AWS account during the specified period is greater than the value that you
     * specified for <code>MaxItems</code>, you can use <code>Marker</code> to return additional billing records. Get
     * the value of <code>NextPageMarker</code> from the previous response, and submit another request that includes the
     * value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * <p>
     * Constraints: The marker must match the value of <code>NextPageMarker</code> that was returned in the previous
     * response.
     * </p>
     * 
     * @param marker
     *        For an initial request for a list of billing records, omit this element. If the number of billing records
     *        that are associated with the current AWS account during the specified period is greater than the value
     *        that you specified for <code>MaxItems</code>, you can use <code>Marker</code> to return additional billing
     *        records. Get the value of <code>NextPageMarker</code> from the previous response, and submit another
     *        request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element. </p>
     *        <p>
     *        Constraints: The marker must match the value of <code>NextPageMarker</code> that was returned in the
     *        previous response.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * For an initial request for a list of billing records, omit this element. If the number of billing records that
     * are associated with the current AWS account during the specified period is greater than the value that you
     * specified for <code>MaxItems</code>, you can use <code>Marker</code> to return additional billing records. Get
     * the value of <code>NextPageMarker</code> from the previous response, and submit another request that includes the
     * value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * <p>
     * Constraints: The marker must match the value of <code>NextPageMarker</code> that was returned in the previous
     * response.
     * </p>
     * 
     * @return For an initial request for a list of billing records, omit this element. If the number of billing records
     *         that are associated with the current AWS account during the specified period is greater than the value
     *         that you specified for <code>MaxItems</code>, you can use <code>Marker</code> to return additional
     *         billing records. Get the value of <code>NextPageMarker</code> from the previous response, and submit
     *         another request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code>
     *         element. </p>
     *         <p>
     *         Constraints: The marker must match the value of <code>NextPageMarker</code> that was returned in the
     *         previous response.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * For an initial request for a list of billing records, omit this element. If the number of billing records that
     * are associated with the current AWS account during the specified period is greater than the value that you
     * specified for <code>MaxItems</code>, you can use <code>Marker</code> to return additional billing records. Get
     * the value of <code>NextPageMarker</code> from the previous response, and submit another request that includes the
     * value of <code>NextPageMarker</code> in the <code>Marker</code> element.
     * </p>
     * <p>
     * Constraints: The marker must match the value of <code>NextPageMarker</code> that was returned in the previous
     * response.
     * </p>
     * 
     * @param marker
     *        For an initial request for a list of billing records, omit this element. If the number of billing records
     *        that are associated with the current AWS account during the specified period is greater than the value
     *        that you specified for <code>MaxItems</code>, you can use <code>Marker</code> to return additional billing
     *        records. Get the value of <code>NextPageMarker</code> from the previous response, and submit another
     *        request that includes the value of <code>NextPageMarker</code> in the <code>Marker</code> element. </p>
     *        <p>
     *        Constraints: The marker must match the value of <code>NextPageMarker</code> that was returned in the
     *        previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewBillingRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The number of billing records to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * 
     * @param maxItems
     *        The number of billing records to be returned.</p>
     *        <p>
     *        Default: 20
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The number of billing records to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * 
     * @return The number of billing records to be returned.</p>
     *         <p>
     *         Default: 20
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The number of billing records to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * 
     * @param maxItems
     *        The number of billing records to be returned.</p>
     *        <p>
     *        Default: 20
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewBillingRequest withMaxItems(Integer maxItems) {
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
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getEnd() != null)
            sb.append("End: ").append(getEnd()).append(",");
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

        if (obj instanceof ViewBillingRequest == false)
            return false;
        ViewBillingRequest other = (ViewBillingRequest) obj;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
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

        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ViewBillingRequest clone() {
        return (ViewBillingRequest) super.clone();
    }

}
