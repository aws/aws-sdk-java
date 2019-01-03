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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeHostReservationOfferingsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHostReservationOfferingsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeHostReservationOfferingsRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-family</code> - The instance family of the offering (for example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     * <code>AllUpfront</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filter;
    /**
     * <p>
     * This is the maximum duration of the reservation to purchase, specified in seconds. Reservations are available in
     * one-year and three-year terms. The number of seconds specified must be the number of seconds in a year
     * (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 94608000 for three years.
     * </p>
     */
    private Integer maxDuration;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * This is the minimum duration of the reservation you'd like to purchase, specified in seconds. Reservations are
     * available in one-year and three-year terms. The number of seconds specified must be the number of seconds in a
     * year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 31536000 for one year.
     * </p>
     */
    private Integer minDuration;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the reservation offering.
     * </p>
     */
    private String offeringId;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-family</code> - The instance family of the offering (for example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     * <code>AllUpfront</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>instance-family</code> - The instance family of the offering (for example, <code>m4</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     *         <code>AllUpfront</code>).
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilter() {
        if (filter == null) {
            filter = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filter;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-family</code> - The instance family of the offering (for example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     * <code>AllUpfront</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-family</code> - The instance family of the offering (for example, <code>m4</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     *        <code>AllUpfront</code>).
     *        </p>
     *        </li>
     */

    public void setFilter(java.util.Collection<Filter> filter) {
        if (filter == null) {
            this.filter = null;
            return;
        }

        this.filter = new com.amazonaws.internal.SdkInternalList<Filter>(filter);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-family</code> - The instance family of the offering (for example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     * <code>AllUpfront</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilter(java.util.Collection)} or {@link #withFilter(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param filter
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-family</code> - The instance family of the offering (for example, <code>m4</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     *        <code>AllUpfront</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationOfferingsRequest withFilter(Filter... filter) {
        if (this.filter == null) {
            setFilter(new com.amazonaws.internal.SdkInternalList<Filter>(filter.length));
        }
        for (Filter ele : filter) {
            this.filter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-family</code> - The instance family of the offering (for example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     * <code>AllUpfront</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-family</code> - The instance family of the offering (for example, <code>m4</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     *        <code>AllUpfront</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationOfferingsRequest withFilter(java.util.Collection<Filter> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * This is the maximum duration of the reservation to purchase, specified in seconds. Reservations are available in
     * one-year and three-year terms. The number of seconds specified must be the number of seconds in a year
     * (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 94608000 for three years.
     * </p>
     * 
     * @param maxDuration
     *        This is the maximum duration of the reservation to purchase, specified in seconds. Reservations are
     *        available in one-year and three-year terms. The number of seconds specified must be the number of seconds
     *        in a year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 94608000 for
     *        three years.
     */

    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * <p>
     * This is the maximum duration of the reservation to purchase, specified in seconds. Reservations are available in
     * one-year and three-year terms. The number of seconds specified must be the number of seconds in a year
     * (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 94608000 for three years.
     * </p>
     * 
     * @return This is the maximum duration of the reservation to purchase, specified in seconds. Reservations are
     *         available in one-year and three-year terms. The number of seconds specified must be the number of seconds
     *         in a year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 94608000 for
     *         three years.
     */

    public Integer getMaxDuration() {
        return this.maxDuration;
    }

    /**
     * <p>
     * This is the maximum duration of the reservation to purchase, specified in seconds. Reservations are available in
     * one-year and three-year terms. The number of seconds specified must be the number of seconds in a year
     * (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 94608000 for three years.
     * </p>
     * 
     * @param maxDuration
     *        This is the maximum duration of the reservation to purchase, specified in seconds. Reservations are
     *        available in one-year and three-year terms. The number of seconds specified must be the number of seconds
     *        in a year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 94608000 for
     *        three years.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationOfferingsRequest withMaxDuration(Integer maxDuration) {
        setMaxDuration(maxDuration);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *        5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     * 
     * @return The maximum number of results to return for the request in a single page. The remaining results can be
     *         seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *         5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *        5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationOfferingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * This is the minimum duration of the reservation you'd like to purchase, specified in seconds. Reservations are
     * available in one-year and three-year terms. The number of seconds specified must be the number of seconds in a
     * year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 31536000 for one year.
     * </p>
     * 
     * @param minDuration
     *        This is the minimum duration of the reservation you'd like to purchase, specified in seconds. Reservations
     *        are available in one-year and three-year terms. The number of seconds specified must be the number of
     *        seconds in a year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify
     *        31536000 for one year.
     */

    public void setMinDuration(Integer minDuration) {
        this.minDuration = minDuration;
    }

    /**
     * <p>
     * This is the minimum duration of the reservation you'd like to purchase, specified in seconds. Reservations are
     * available in one-year and three-year terms. The number of seconds specified must be the number of seconds in a
     * year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 31536000 for one year.
     * </p>
     * 
     * @return This is the minimum duration of the reservation you'd like to purchase, specified in seconds.
     *         Reservations are available in one-year and three-year terms. The number of seconds specified must be the
     *         number of seconds in a year (365x24x60x60) times one of the supported durations (1 or 3). For example,
     *         specify 31536000 for one year.
     */

    public Integer getMinDuration() {
        return this.minDuration;
    }

    /**
     * <p>
     * This is the minimum duration of the reservation you'd like to purchase, specified in seconds. Reservations are
     * available in one-year and three-year terms. The number of seconds specified must be the number of seconds in a
     * year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 31536000 for one year.
     * </p>
     * 
     * @param minDuration
     *        This is the minimum duration of the reservation you'd like to purchase, specified in seconds. Reservations
     *        are available in one-year and three-year terms. The number of seconds specified must be the number of
     *        seconds in a year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify
     *        31536000 for one year.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationOfferingsRequest withMinDuration(Integer minDuration) {
        setMinDuration(minDuration);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationOfferingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the reservation offering.
     * </p>
     * 
     * @param offeringId
     *        The ID of the reservation offering.
     */

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The ID of the reservation offering.
     * </p>
     * 
     * @return The ID of the reservation offering.
     */

    public String getOfferingId() {
        return this.offeringId;
    }

    /**
     * <p>
     * The ID of the reservation offering.
     * </p>
     * 
     * @param offeringId
     *        The ID of the reservation offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationOfferingsRequest withOfferingId(String offeringId) {
        setOfferingId(offeringId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeHostReservationOfferingsRequest> getDryRunRequest() {
        Request<DescribeHostReservationOfferingsRequest> request = new DescribeHostReservationOfferingsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getMaxDuration() != null)
            sb.append("MaxDuration: ").append(getMaxDuration()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getMinDuration() != null)
            sb.append("MinDuration: ").append(getMinDuration()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOfferingId() != null)
            sb.append("OfferingId: ").append(getOfferingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHostReservationOfferingsRequest == false)
            return false;
        DescribeHostReservationOfferingsRequest other = (DescribeHostReservationOfferingsRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getMaxDuration() == null ^ this.getMaxDuration() == null)
            return false;
        if (other.getMaxDuration() != null && other.getMaxDuration().equals(this.getMaxDuration()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getMinDuration() == null ^ this.getMinDuration() == null)
            return false;
        if (other.getMinDuration() != null && other.getMinDuration().equals(this.getMinDuration()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxDuration() == null) ? 0 : getMaxDuration().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getMinDuration() == null) ? 0 : getMinDuration().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHostReservationOfferingsRequest clone() {
        return (DescribeHostReservationOfferingsRequest) super.clone();
    }
}
