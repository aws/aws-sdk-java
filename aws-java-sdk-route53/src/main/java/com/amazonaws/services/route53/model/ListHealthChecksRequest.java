/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * To retrieve a list of your health checks, send a <code>GET</code> request to the <code>/2013-04-01/healthcheck</code>
 * resource. The response to this request includes a <code>HealthChecks</code> element with zero or more
 * <code>HealthCheck</code> child elements. By default, the list of health checks is displayed on a single page. You can
 * control the length of the page that is displayed by using the <code>MaxItems</code> parameter. You can use the
 * <code>Marker</code> parameter to control the health check that the list begins with.
 * </p>
 * <note>
 * <p>
 * Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value greater than 100, Amazon
 * Route 53 returns only the first 100.
 * </p>
 * </note>
 */
public class ListHealthChecksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If the response to a <code>ListHealthChecks</code> is more than one page, marker is the health check ID for the
     * first health check on the next page of results. For more information, see
     * <a>ListHealthChecksResponse$MaxItems</a>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of <code>HealthCheck</code> elements you want <code>ListHealthChecks</code> to return on each
     * page of the response body. If the AWS account includes more <code>HealthCheck</code> elements than the value of
     * <code>maxitems</code>, the response is broken into pages. Each page contains the number of
     * <code>HealthCheck</code> elements specified by <code>maxitems</code>.
     * </p>
     * <p>
     * For example, suppose you specify <code>10</code> for <code>maxitems</code> and the current AWS account has
     * <code>51</code> health checks. In the response, <code>ListHealthChecks</code> sets
     * <a>ListHealthChecksResponse$IsTruncated</a> to true and includes the <a>ListHealthChecksResponse$NextMarker</a>
     * element. To access the second and subsequent pages, you resend the <code>GET</code> <code>ListHealthChecks</code>
     * request, add the <a>ListHealthChecksResponse$Marker</a> parameter to the request, and specify the value of the
     * <a>ListHealthChecksResponse$NextMarker</a> element from the previous response. On the last (sixth) page of the
     * response, which contains only one HealthCheck element:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <a>ListHealthChecksResponse$IsTruncated</a> is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListHealthChecksResponse$NextMarker</a> is omitted.
     * </p>
     * </li>
     * </ul>
     */
    private String maxItems;

    /**
     * <p>
     * If the response to a <code>ListHealthChecks</code> is more than one page, marker is the health check ID for the
     * first health check on the next page of results. For more information, see
     * <a>ListHealthChecksResponse$MaxItems</a>.
     * </p>
     * 
     * @param marker
     *        If the response to a <code>ListHealthChecks</code> is more than one page, marker is the health check ID
     *        for the first health check on the next page of results. For more information, see
     *        <a>ListHealthChecksResponse$MaxItems</a>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * If the response to a <code>ListHealthChecks</code> is more than one page, marker is the health check ID for the
     * first health check on the next page of results. For more information, see
     * <a>ListHealthChecksResponse$MaxItems</a>.
     * </p>
     * 
     * @return If the response to a <code>ListHealthChecks</code> is more than one page, marker is the health check ID
     *         for the first health check on the next page of results. For more information, see
     *         <a>ListHealthChecksResponse$MaxItems</a>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * If the response to a <code>ListHealthChecks</code> is more than one page, marker is the health check ID for the
     * first health check on the next page of results. For more information, see
     * <a>ListHealthChecksResponse$MaxItems</a>.
     * </p>
     * 
     * @param marker
     *        If the response to a <code>ListHealthChecks</code> is more than one page, marker is the health check ID
     *        for the first health check on the next page of results. For more information, see
     *        <a>ListHealthChecksResponse$MaxItems</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthChecksRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of <code>HealthCheck</code> elements you want <code>ListHealthChecks</code> to return on each
     * page of the response body. If the AWS account includes more <code>HealthCheck</code> elements than the value of
     * <code>maxitems</code>, the response is broken into pages. Each page contains the number of
     * <code>HealthCheck</code> elements specified by <code>maxitems</code>.
     * </p>
     * <p>
     * For example, suppose you specify <code>10</code> for <code>maxitems</code> and the current AWS account has
     * <code>51</code> health checks. In the response, <code>ListHealthChecks</code> sets
     * <a>ListHealthChecksResponse$IsTruncated</a> to true and includes the <a>ListHealthChecksResponse$NextMarker</a>
     * element. To access the second and subsequent pages, you resend the <code>GET</code> <code>ListHealthChecks</code>
     * request, add the <a>ListHealthChecksResponse$Marker</a> parameter to the request, and specify the value of the
     * <a>ListHealthChecksResponse$NextMarker</a> element from the previous response. On the last (sixth) page of the
     * response, which contains only one HealthCheck element:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <a>ListHealthChecksResponse$IsTruncated</a> is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListHealthChecksResponse$NextMarker</a> is omitted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param maxItems
     *        The maximum number of <code>HealthCheck</code> elements you want <code>ListHealthChecks</code> to return
     *        on each page of the response body. If the AWS account includes more <code>HealthCheck</code> elements than
     *        the value of <code>maxitems</code>, the response is broken into pages. Each page contains the number of
     *        <code>HealthCheck</code> elements specified by <code>maxitems</code>.</p>
     *        <p>
     *        For example, suppose you specify <code>10</code> for <code>maxitems</code> and the current AWS account has
     *        <code>51</code> health checks. In the response, <code>ListHealthChecks</code> sets
     *        <a>ListHealthChecksResponse$IsTruncated</a> to true and includes the
     *        <a>ListHealthChecksResponse$NextMarker</a> element. To access the second and subsequent pages, you resend
     *        the <code>GET</code> <code>ListHealthChecks</code> request, add the <a>ListHealthChecksResponse$Marker</a>
     *        parameter to the request, and specify the value of the <a>ListHealthChecksResponse$NextMarker</a> element
     *        from the previous response. On the last (sixth) page of the response, which contains only one HealthCheck
     *        element:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value of <a>ListHealthChecksResponse$IsTruncated</a> is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListHealthChecksResponse$NextMarker</a> is omitted.
     *        </p>
     *        </li>
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of <code>HealthCheck</code> elements you want <code>ListHealthChecks</code> to return on each
     * page of the response body. If the AWS account includes more <code>HealthCheck</code> elements than the value of
     * <code>maxitems</code>, the response is broken into pages. Each page contains the number of
     * <code>HealthCheck</code> elements specified by <code>maxitems</code>.
     * </p>
     * <p>
     * For example, suppose you specify <code>10</code> for <code>maxitems</code> and the current AWS account has
     * <code>51</code> health checks. In the response, <code>ListHealthChecks</code> sets
     * <a>ListHealthChecksResponse$IsTruncated</a> to true and includes the <a>ListHealthChecksResponse$NextMarker</a>
     * element. To access the second and subsequent pages, you resend the <code>GET</code> <code>ListHealthChecks</code>
     * request, add the <a>ListHealthChecksResponse$Marker</a> parameter to the request, and specify the value of the
     * <a>ListHealthChecksResponse$NextMarker</a> element from the previous response. On the last (sixth) page of the
     * response, which contains only one HealthCheck element:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <a>ListHealthChecksResponse$IsTruncated</a> is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListHealthChecksResponse$NextMarker</a> is omitted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The maximum number of <code>HealthCheck</code> elements you want <code>ListHealthChecks</code> to return
     *         on each page of the response body. If the AWS account includes more <code>HealthCheck</code> elements
     *         than the value of <code>maxitems</code>, the response is broken into pages. Each page contains the number
     *         of <code>HealthCheck</code> elements specified by <code>maxitems</code>.</p>
     *         <p>
     *         For example, suppose you specify <code>10</code> for <code>maxitems</code> and the current AWS account
     *         has <code>51</code> health checks. In the response, <code>ListHealthChecks</code> sets
     *         <a>ListHealthChecksResponse$IsTruncated</a> to true and includes the
     *         <a>ListHealthChecksResponse$NextMarker</a> element. To access the second and subsequent pages, you resend
     *         the <code>GET</code> <code>ListHealthChecks</code> request, add the
     *         <a>ListHealthChecksResponse$Marker</a> parameter to the request, and specify the value of the
     *         <a>ListHealthChecksResponse$NextMarker</a> element from the previous response. On the last (sixth) page
     *         of the response, which contains only one HealthCheck element:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The value of <a>ListHealthChecksResponse$IsTruncated</a> is <code>false</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>ListHealthChecksResponse$NextMarker</a> is omitted.
     *         </p>
     *         </li>
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of <code>HealthCheck</code> elements you want <code>ListHealthChecks</code> to return on each
     * page of the response body. If the AWS account includes more <code>HealthCheck</code> elements than the value of
     * <code>maxitems</code>, the response is broken into pages. Each page contains the number of
     * <code>HealthCheck</code> elements specified by <code>maxitems</code>.
     * </p>
     * <p>
     * For example, suppose you specify <code>10</code> for <code>maxitems</code> and the current AWS account has
     * <code>51</code> health checks. In the response, <code>ListHealthChecks</code> sets
     * <a>ListHealthChecksResponse$IsTruncated</a> to true and includes the <a>ListHealthChecksResponse$NextMarker</a>
     * element. To access the second and subsequent pages, you resend the <code>GET</code> <code>ListHealthChecks</code>
     * request, add the <a>ListHealthChecksResponse$Marker</a> parameter to the request, and specify the value of the
     * <a>ListHealthChecksResponse$NextMarker</a> element from the previous response. On the last (sixth) page of the
     * response, which contains only one HealthCheck element:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <a>ListHealthChecksResponse$IsTruncated</a> is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListHealthChecksResponse$NextMarker</a> is omitted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param maxItems
     *        The maximum number of <code>HealthCheck</code> elements you want <code>ListHealthChecks</code> to return
     *        on each page of the response body. If the AWS account includes more <code>HealthCheck</code> elements than
     *        the value of <code>maxitems</code>, the response is broken into pages. Each page contains the number of
     *        <code>HealthCheck</code> elements specified by <code>maxitems</code>.</p>
     *        <p>
     *        For example, suppose you specify <code>10</code> for <code>maxitems</code> and the current AWS account has
     *        <code>51</code> health checks. In the response, <code>ListHealthChecks</code> sets
     *        <a>ListHealthChecksResponse$IsTruncated</a> to true and includes the
     *        <a>ListHealthChecksResponse$NextMarker</a> element. To access the second and subsequent pages, you resend
     *        the <code>GET</code> <code>ListHealthChecks</code> request, add the <a>ListHealthChecksResponse$Marker</a>
     *        parameter to the request, and specify the value of the <a>ListHealthChecksResponse$NextMarker</a> element
     *        from the previous response. On the last (sixth) page of the response, which contains only one HealthCheck
     *        element:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value of <a>ListHealthChecksResponse$IsTruncated</a> is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>ListHealthChecksResponse$NextMarker</a> is omitted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthChecksRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHealthChecksRequest == false)
            return false;
        ListHealthChecksRequest other = (ListHealthChecksRequest) obj;
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

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListHealthChecksRequest clone() {
        return (ListHealthChecksRequest) super.clone();
    }
}
